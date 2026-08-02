package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.ArrayMap;
import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.core.impl.TagBundle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public final class Camera2RequestMetadata implements RequestMetadata {
    public final CameraCaptureSessionWrapper cameraCaptureSessionWrapper;
    public final CaptureRequest captureRequest;
    public final Map defaultParameters;
    public final Map graphParameters;
    public final boolean repeating;
    public final Request request;
    public final long requestNumber;
    public final Map requiredParameters;
    public final ArrayMap streams;

    public Camera2RequestMetadata(CameraCaptureSessionWrapper cameraCaptureSessionWrapper, CaptureRequest captureRequest, Map map, Map map2, Map map3, ArrayMap arrayMap, boolean z, Request request, long j) {
        cameraCaptureSessionWrapper.getClass();
        captureRequest.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        this.cameraCaptureSessionWrapper = cameraCaptureSessionWrapper;
        this.captureRequest = captureRequest;
        this.defaultParameters = map;
        this.graphParameters = map2;
        this.requiredParameters = map3;
        this.streams = arrayMap;
        this.repeating = z;
        this.request = request;
        this.requestNumber = j;
    }

    @Override // androidx.camera.camera2.pipe.Metadata
    public final Object get(Metadata.Key key) {
        Map map = this.request.extras;
        key.getClass();
        Map map2 = this.requiredParameters;
        if (map2.containsKey(key)) {
            return map2.get(key);
        }
        if (map.containsKey(key)) {
            return map.get(key);
        }
        Map map3 = this.graphParameters;
        return map3.containsKey(key) ? map3.get(key) : this.defaultParameters.get(key);
    }

    @Override // androidx.camera.camera2.pipe.Metadata
    public final Object getOrDefault(Metadata.Key key, TagBundle tagBundle) {
        key.getClass();
        Object obj = get(key);
        return obj == null ? tagBundle : obj;
    }

    @Override // androidx.camera.camera2.pipe.RequestMetadata
    public final boolean getRepeating() {
        return this.repeating;
    }

    @Override // androidx.camera.camera2.pipe.RequestMetadata
    public final Request getRequest() {
        return this.request;
    }

    @Override // androidx.camera.camera2.pipe.RequestMetadata
    /* renamed from: getRequestNumber-my6kx4g */
    public final long mo32getRequestNumbermy6kx4g() {
        return this.requestNumber;
    }

    @Override // androidx.camera.camera2.pipe.RequestMetadata
    public final Map getStreams() {
        return this.streams;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final Object unwrapAs(KClass kClass) {
        kClass.getClass();
        ReflectionFactory reflectionFactory = Reflection.factory;
        if (kClass.equals(reflectionFactory.getOrCreateKotlinClass(CaptureRequest.class))) {
            CaptureRequest captureRequest = this.captureRequest;
            captureRequest.getClass();
            return captureRequest;
        }
        boolean equals = kClass.equals(reflectionFactory.getOrCreateKotlinClass(CameraCaptureSession.class));
        CameraCaptureSessionWrapper cameraCaptureSessionWrapper = this.cameraCaptureSessionWrapper;
        if (equals) {
            Object unwrapAs = cameraCaptureSessionWrapper.unwrapAs(reflectionFactory.getOrCreateKotlinClass(CameraCaptureSession.class));
            if (unwrapAs != null) {
                return unwrapAs;
            }
        } else if (kClass.equals(reflectionFactory.getOrCreateKotlinClass(ZslControlImpl$$ExternalSyntheticLambda1.m21m()))) {
            if (Build.VERSION.SDK_INT >= 31) {
                Object unwrapAs2 = cameraCaptureSessionWrapper.unwrapAs(reflectionFactory.getOrCreateKotlinClass(ZslControlImpl$$ExternalSyntheticLambda1.m21m()));
                if (unwrapAs2 != null) {
                    return unwrapAs2;
                }
            } else {
                a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
            }
        }
        return null;
    }
}
