package androidx.camera.camera2.adapter;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.ZslDisablerQuirk;
import androidx.camera.camera2.impl.CameraPipeCameraProperties;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.compat.Camera2CameraMetadata;
import androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.imagecapture.CaptureNode$$ExternalSyntheticLambda3;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.utils.ZslRingBuffer;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.TraceParser;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt___ArraysKt;
import net.oneformapp.ProfileStore_;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class ZslControlImpl implements ZslControl {
    public final CameraMetadata cameraMetadata;
    public boolean isZslDisabledByFlashMode;
    public final boolean isZslDisabledByQuirks;
    public boolean isZslDisabledByUseCaseConfig;
    public SurfaceRequest.AnonymousClass2 reprocessingImageDeferrableSurface;
    public ProfileStore_ reprocessingImageReader;
    public final Lazy streamConfigurationMap$delegate = LazyKt.lazy(new Threads$$ExternalSyntheticLambda1(this, 2));
    public final ZslRingBuffer zslRingBuffer = new ZslRingBuffer(3, new ZslControlImpl$$ExternalSyntheticLambda1(0));

    public ZslControlImpl(CameraPipeCameraProperties cameraPipeCameraProperties) {
        this.cameraMetadata = cameraPipeCameraProperties.metadata;
        this.isZslDisabledByQuirks = DeviceQuirks.getAll().get(ZslDisablerQuirk.class) != null;
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public final void addZslConfig(SessionConfig.Builder builder) {
        TraceParser traceParser = builder.mCaptureConfigBuilder;
        reset();
        if (this.isZslDisabledByUseCaseConfig) {
            traceParser.state = 1;
            return;
        }
        if (this.isZslDisabledByQuirks) {
            traceParser.state = 1;
            return;
        }
        CameraMetadata.Companion.getClass();
        CameraMetadata cameraMetadata = this.cameraMetadata;
        cameraMetadata.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key.getClass();
        int[] iArr = (int[]) ((Camera2CameraMetadata) cameraMetadata).get(key);
        if (iArr == null) {
            iArr = CameraMetadata.Companion.EMPTY_INT_ARRAY;
        }
        if (!ArraysKt___ArraysKt.contains(iArr, 4)) {
            if (StringUtilsKt.isLogLevelEnabled(4, "CXCP")) {
                Log.i("CXCP", "ZslControlImpl: Private reprocessing isn't supported");
            }
            traceParser.state = 1;
            return;
        }
        Lazy lazy = this.streamConfigurationMap$delegate;
        Size[] inputSizes = ((StreamConfigurationMap) lazy.getValue()).getInputSizes(34);
        inputSizes.getClass();
        Iterator it = ArraysKt___ArraysKt.toList(inputSizes).iterator();
        if (!it.hasNext()) {
            a$$ExternalSyntheticBUOutline0.m();
            return;
        }
        Object next = it.next();
        if (it.hasNext()) {
            Size size = (Size) next;
            size.getClass();
            int height = size.getHeight() * size.getWidth();
            do {
                Object next2 = it.next();
                Size size2 = (Size) next2;
                size2.getClass();
                int height2 = size2.getHeight() * size2.getWidth();
                if (height < height2) {
                    next = next2;
                    height = height2;
                }
            } while (it.hasNext());
        }
        Size size3 = (Size) next;
        if (size3 == null) {
            if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                Log.w("CXCP", "ZslControlImpl: Unable to find a supported size for ZSL");
                return;
            }
            return;
        }
        if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
            Log.d("CXCP", "ZslControlImpl: Selected ZSL size: " + size3);
        }
        int[] validOutputFormatsForInput = ((StreamConfigurationMap) lazy.getValue()).getValidOutputFormatsForInput(34);
        validOutputFormatsForInput.getClass();
        if (!ArraysKt___ArraysKt.contains(validOutputFormatsForInput, 256)) {
            if (StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                Log.w("CXCP", "ZslControlImpl: JPEG isn't valid output for ZSL format");
                return;
            }
            return;
        }
        MetadataImageReader metadataImageReader = new MetadataImageReader(size3.getWidth(), size3.getHeight(), 34, 9);
        MetadataImageReader.AnonymousClass1 anonymousClass1 = metadataImageReader.mCameraCaptureCallback;
        anonymousClass1.getClass();
        ProfileStore_ profileStore_ = new ProfileStore_(metadataImageReader);
        metadataImageReader.setOnImageAvailableListener(new StreamSharing$$ExternalSyntheticLambda1(this, 2), zzabp.ioExecutor());
        Surface surface = profileStore_.getSurface();
        if (surface == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
            return;
        }
        SurfaceRequest.AnonymousClass2 anonymousClass2 = new SurfaceRequest.AnonymousClass2(surface, new Size(profileStore_.getWidth(), profileStore_.getHeight()), 34);
        Futures.nonCancellationPropagating(anonymousClass2.mTerminationFuture).addListener(new CaptureNode$$ExternalSyntheticLambda3(profileStore_, 1), zzabp.mainThreadExecutor());
        builder.addSurface(anonymousClass2, DynamicRange.SDR, -1);
        traceParser.addCameraCaptureCallback(anonymousClass1);
        ArrayList arrayList = builder.mSingleCameraCaptureCallbacks;
        if (!arrayList.contains(anonymousClass1)) {
            arrayList.add(anonymousClass1);
        }
        builder.mInputConfiguration = new InputConfiguration(profileStore_.getWidth(), profileStore_.getHeight(), profileStore_.getImageFormat());
        this.reprocessingImageReader = profileStore_;
        this.reprocessingImageDeferrableSurface = anonymousClass2;
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public final void clearZslConfig() {
        reset();
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public final ImageProxy dequeueImageFromBuffer() {
        try {
            return (ImageProxy) this.zslRingBuffer.dequeue();
        } catch (NoSuchElementException unused) {
            if (!StringUtilsKt.isLogLevelEnabled(5, "CXCP")) {
                return null;
            }
            Log.w("CXCP", "ZslControlImpl#dequeueImageFromBuffer: No such element");
            return null;
        }
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public final boolean isZslDisabledByFlashMode() {
        return this.isZslDisabledByFlashMode;
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public final boolean isZslDisabledByUserCaseConfig() {
        return this.isZslDisabledByUseCaseConfig;
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public final boolean isZslSurface(DeferrableSurface deferrableSurface, SessionConfig sessionConfig) {
        Size size = deferrableSurface.mPrescribedSize;
        sessionConfig.getClass();
        InputConfiguration inputConfiguration = sessionConfig.mInputConfiguration;
        return inputConfiguration != null && deferrableSurface.mPrescribedStreamFormat == inputConfiguration.getFormat() && size.getWidth() == inputConfiguration.getWidth() && size.getHeight() == inputConfiguration.getHeight();
    }

    public final void reset() {
        SurfaceRequest.AnonymousClass2 anonymousClass2 = this.reprocessingImageDeferrableSurface;
        if (anonymousClass2 != null) {
            ProfileStore_ profileStore_ = this.reprocessingImageReader;
            if (profileStore_ != null) {
                Futures.nonCancellationPropagating(anonymousClass2.mTerminationFuture).addListener(new CaptureNode$$ExternalSyntheticLambda3(profileStore_, 2), zzabp.mainThreadExecutor());
                profileStore_.clearOnImageAvailableListener();
                this.reprocessingImageReader = null;
            }
            anonymousClass2.close();
            this.reprocessingImageDeferrableSurface = null;
        }
        while (true) {
            ZslRingBuffer zslRingBuffer = this.zslRingBuffer;
            if (zslRingBuffer.isEmpty()) {
                return;
            } else {
                ((ImageProxy) zslRingBuffer.dequeue()).close();
            }
        }
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public final void setZslDisabledByFlashMode(boolean z) {
        this.isZslDisabledByFlashMode = z;
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public final void setZslDisabledByUserCaseConfig(boolean z) {
        if (this.isZslDisabledByUseCaseConfig != z && z) {
            while (true) {
                ZslRingBuffer zslRingBuffer = this.zslRingBuffer;
                if (zslRingBuffer.isEmpty()) {
                    break;
                } else {
                    ((ImageProxy) zslRingBuffer.dequeue()).close();
                }
            }
        }
        this.isZslDisabledByUseCaseConfig = z;
    }
}
