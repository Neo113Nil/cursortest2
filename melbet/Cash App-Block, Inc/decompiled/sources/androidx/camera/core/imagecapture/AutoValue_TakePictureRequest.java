package androidx.camera.core.imagecapture;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.api.ContextKt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.FormBody;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class AutoValue_TakePictureRequest {
    public final Executor appExecutor;
    public final int captureMode;
    public final Rect cropRect;
    public final ContextKt inMemoryCallback;
    public final int jpegQuality;
    public final HashMap mFormatCaptureStatus;
    public int mRemainingRetires;
    public final FormBody.Builder onDiskCallback;
    public final UseCaseGroup outputFileOptions;
    public final int rotationDegrees;
    public final Matrix sensorToBufferTransform;
    public final List sessionConfigCameraCaptureCallbacks;
    public final boolean simultaneousCapture;

    public AutoValue_TakePictureRequest(Executor executor, ContextKt contextKt, FormBody.Builder builder, UseCaseGroup useCaseGroup, Rect rect, Matrix matrix, int i, int i2, int i3, boolean z, List list) {
        this.mRemainingRetires = ((CaptureFailedRetryQuirk) DeviceQuirks.sQuirks.get(CaptureFailedRetryQuirk.class)) == null ? 0 : 1;
        this.mFormatCaptureStatus = new HashMap();
        if (executor == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null appExecutor");
            throw null;
        }
        this.appExecutor = executor;
        this.inMemoryCallback = contextKt;
        this.onDiskCallback = builder;
        this.outputFileOptions = useCaseGroup;
        this.cropRect = rect;
        if (matrix == null) {
            a$$ExternalSyntheticBUOutline0.m$2("Null sensorToBufferTransform");
            throw null;
        }
        this.sensorToBufferTransform = matrix;
        this.rotationDegrees = i;
        this.jpegQuality = i2;
        this.captureMode = i3;
        this.simultaneousCapture = z;
        if (list != null) {
            this.sessionConfigCameraCaptureCallbacks = list;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null sessionConfigCameraCaptureCallbacks");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r0 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_TakePictureRequest) {
            AutoValue_TakePictureRequest autoValue_TakePictureRequest = (AutoValue_TakePictureRequest) obj;
            if (this.appExecutor.equals(autoValue_TakePictureRequest.appExecutor)) {
                ContextKt contextKt = autoValue_TakePictureRequest.inMemoryCallback;
                ContextKt contextKt2 = this.inMemoryCallback;
                if (contextKt2 != null ? contextKt2.equals(contextKt) : contextKt == null) {
                    FormBody.Builder builder = autoValue_TakePictureRequest.onDiskCallback;
                    FormBody.Builder builder2 = this.onDiskCallback;
                    if (builder2 != null) {
                        if (builder2 != builder) {
                            return false;
                        }
                    }
                    UseCaseGroup useCaseGroup = autoValue_TakePictureRequest.outputFileOptions;
                    UseCaseGroup useCaseGroup2 = this.outputFileOptions;
                    if (useCaseGroup2 != null) {
                        if (useCaseGroup2 != useCaseGroup) {
                            return false;
                        }
                    }
                    if (this.cropRect.equals(autoValue_TakePictureRequest.cropRect) && this.sensorToBufferTransform.equals(autoValue_TakePictureRequest.sensorToBufferTransform) && this.rotationDegrees == autoValue_TakePictureRequest.rotationDegrees && this.jpegQuality == autoValue_TakePictureRequest.jpegQuality && this.captureMode == autoValue_TakePictureRequest.captureMode && this.simultaneousCapture == autoValue_TakePictureRequest.simultaneousCapture && this.sessionConfigCameraCaptureCallbacks.equals(autoValue_TakePictureRequest.sessionConfigCameraCaptureCallbacks)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.appExecutor.hashCode() ^ 1000003) * 1000003;
        ContextKt contextKt = this.inMemoryCallback;
        int hashCode2 = (hashCode ^ (contextKt == null ? 0 : contextKt.hashCode())) * 1000003;
        FormBody.Builder builder = this.onDiskCallback;
        int hashCode3 = (hashCode2 ^ (builder == null ? 0 : builder.hashCode())) * 1000003;
        UseCaseGroup useCaseGroup = this.outputFileOptions;
        return this.sessionConfigCameraCaptureCallbacks.hashCode() ^ ((((((((((((((hashCode3 ^ (useCaseGroup != null ? useCaseGroup.hashCode() : 0)) * (-721379959)) ^ this.cropRect.hashCode()) * 1000003) ^ this.sensorToBufferTransform.hashCode()) * 1000003) ^ this.rotationDegrees) * 1000003) ^ this.jpegQuality) * 1000003) ^ this.captureMode) * 1000003) ^ (this.simultaneousCapture ? 1231 : 1237)) * 1000003);
    }

    public final boolean isFormatProcessedInSimultaneousCapture() {
        Iterator it = this.mFormatCaptureStatus.entrySet().iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final void markFormatProcessStatusInSimultaneousCapture(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.mFormatCaptureStatus;
        if (hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(i), Boolean.TRUE);
        } else {
            StringUtilsKt.e("TakePictureRequest", "The format is not supported in simultaneous capture");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TakePictureRequest{appExecutor=");
        sb.append(this.appExecutor);
        sb.append(", inMemoryCallback=");
        sb.append(this.inMemoryCallback);
        sb.append(", onDiskCallback=");
        sb.append(this.onDiskCallback);
        sb.append(", outputFileOptions=");
        sb.append(this.outputFileOptions);
        sb.append(", secondaryOutputFileOptions=null, cropRect=");
        sb.append(this.cropRect);
        sb.append(", sensorToBufferTransform=");
        sb.append(this.sensorToBufferTransform);
        sb.append(", rotationDegrees=");
        sb.append(this.rotationDegrees);
        sb.append(", jpegQuality=");
        sb.append(this.jpegQuality);
        sb.append(", captureMode=");
        sb.append(this.captureMode);
        sb.append(", simultaneousCapture=");
        sb.append(this.simultaneousCapture);
        sb.append(", sessionConfigCameraCaptureCallbacks=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.sessionConfigCameraCaptureCallbacks, "}");
    }
}
