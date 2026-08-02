package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.impl.CameraPipeCameraProperties;
import androidx.camera.camera2.impl.CapturePipeline;
import androidx.camera.camera2.impl.CapturePipelineImpl;
import androidx.camera.camera2.impl.CapturePipelineImpl$$ExternalSyntheticLambda1;
import androidx.camera.camera2.impl.CapturePipelineImpl$getCameraCapturePipeline$2;
import androidx.camera.camera2.impl.TorchControl;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1;
import androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class CapturePipelineTorchCorrection implements CapturePipeline {
    public static final boolean isEnabled;
    public final Lazy capturePipelineImpl$delegate;
    public final Provider capturePipelineImplProvider;
    public final Lazy isLegacyDevice$delegate;
    public final UseCaseThreads threads;
    public final TorchControl torchControl;

    static {
        isEnabled = DeviceQuirks.getAll().get(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    public CapturePipelineTorchCorrection(CameraPipeCameraProperties cameraPipeCameraProperties, Provider provider, UseCaseThreads useCaseThreads, TorchControl torchControl) {
        cameraPipeCameraProperties.getClass();
        provider.getClass();
        useCaseThreads.getClass();
        torchControl.getClass();
        this.capturePipelineImplProvider = provider;
        this.threads = useCaseThreads;
        this.torchControl = torchControl;
        this.isLegacyDevice$delegate = LazyKt.lazy(new CapturePipelineImpl$$ExternalSyntheticLambda1(cameraPipeCameraProperties, 1));
        this.capturePipelineImpl$delegate = LazyKt.lazy(new Threads$$ExternalSyntheticLambda1(this, 6));
    }

    @Override // androidx.camera.camera2.impl.CapturePipeline
    public final CapturePipelineImpl$getCameraCapturePipeline$2 getCameraCapturePipeline(int i, int i2) {
        CapturePipelineImpl capturePipelineImpl = (CapturePipelineImpl) this.capturePipelineImpl$delegate.getValue();
        capturePipelineImpl.getClass();
        return new CapturePipelineImpl$getCameraCapturePipeline$2(capturePipelineImpl, i, i2);
    }

    @Override // androidx.camera.camera2.impl.CapturePipeline
    public final void setTemplate(int i) {
        ((CapturePipelineImpl) this.capturePipelineImpl$delegate.getValue()).template = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // androidx.camera.camera2.impl.CapturePipeline
    /* renamed from: submitStillCaptures-BvXKQx0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo23submitStillCapturesBvXKQx0(List list, int i, Config config, int i2, int i3, int i4, ContinuationImpl continuationImpl) {
        CapturePipelineTorchCorrection$submitStillCaptures$1 capturePipelineTorchCorrection$submitStillCaptures$1;
        int i5;
        int i6;
        boolean z;
        Object mo23submitStillCapturesBvXKQx0;
        boolean z2;
        if (continuationImpl instanceof CapturePipelineTorchCorrection$submitStillCaptures$1) {
            capturePipelineTorchCorrection$submitStillCaptures$1 = (CapturePipelineTorchCorrection$submitStillCaptures$1) continuationImpl;
            int i7 = capturePipelineTorchCorrection$submitStillCaptures$1.label;
            if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                capturePipelineTorchCorrection$submitStillCaptures$1.label = i7 - PKIFailureInfo.systemUnavail;
                CapturePipelineTorchCorrection$submitStillCaptures$1 capturePipelineTorchCorrection$submitStillCaptures$12 = capturePipelineTorchCorrection$submitStillCaptures$1;
                Object obj = capturePipelineTorchCorrection$submitStillCaptures$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = capturePipelineTorchCorrection$submitStillCaptures$12.label;
                int i8 = 2;
                Continuation continuation = null;
                if (i5 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (list == null || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            CaptureConfig captureConfig = (CaptureConfig) it.next();
                            boolean booleanValue = ((Boolean) this.isLegacyDevice$delegate.getValue()).booleanValue();
                            captureConfig.getClass();
                            int i9 = captureConfig.mTemplateType;
                            i6 = i;
                            int i10 = (i6 != 3 || booleanValue) ? (i9 == -1 || i9 == 5) ? 2 : -1 : 4;
                            if (i10 != -1) {
                                i9 = i10;
                            }
                            if (i9 == 2) {
                                Integer num = (Integer) this.torchControl._torchState.getValue();
                                if (num != null && num.intValue() == 1) {
                                    z = true;
                                    CapturePipelineImpl capturePipelineImpl = (CapturePipelineImpl) this.capturePipelineImpl$delegate.getValue();
                                    capturePipelineTorchCorrection$submitStillCaptures$12.Z$0 = z;
                                    capturePipelineTorchCorrection$submitStillCaptures$12.label = 1;
                                    mo23submitStillCapturesBvXKQx0 = capturePipelineImpl.mo23submitStillCapturesBvXKQx0(list, i6, config, i2, i3, i4, capturePipelineTorchCorrection$submitStillCaptures$12);
                                    if (mo23submitStillCapturesBvXKQx0 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    boolean z3 = z;
                                    obj = mo23submitStillCapturesBvXKQx0;
                                    z2 = z3;
                                }
                                z = false;
                                CapturePipelineImpl capturePipelineImpl2 = (CapturePipelineImpl) this.capturePipelineImpl$delegate.getValue();
                                capturePipelineTorchCorrection$submitStillCaptures$12.Z$0 = z;
                                capturePipelineTorchCorrection$submitStillCaptures$12.label = 1;
                                mo23submitStillCapturesBvXKQx0 = capturePipelineImpl2.mo23submitStillCapturesBvXKQx0(list, i6, config, i2, i3, i4, capturePipelineTorchCorrection$submitStillCaptures$12);
                                if (mo23submitStillCapturesBvXKQx0 == coroutineSingletons) {
                                }
                            }
                        }
                    }
                    i6 = i;
                    z = false;
                    CapturePipelineImpl capturePipelineImpl22 = (CapturePipelineImpl) this.capturePipelineImpl$delegate.getValue();
                    capturePipelineTorchCorrection$submitStillCaptures$12.Z$0 = z;
                    capturePipelineTorchCorrection$submitStillCaptures$12.label = 1;
                    mo23submitStillCapturesBvXKQx0 = capturePipelineImpl22.mo23submitStillCapturesBvXKQx0(list, i6, config, i2, i3, i4, capturePipelineTorchCorrection$submitStillCaptures$12);
                    if (mo23submitStillCapturesBvXKQx0 == coroutineSingletons) {
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = capturePipelineTorchCorrection$submitStillCaptures$12.Z$0;
                    SafeTrace.throwOnFailure(obj);
                }
                List list2 = (List) obj;
                if (z2) {
                    JobKt.launch$default(this.threads.sequentialScope, null, null, new VirtualCameraState$connect$2$1(list2, this, continuation, i8), 3);
                }
                return list2;
            }
        }
        capturePipelineTorchCorrection$submitStillCaptures$1 = new CapturePipelineTorchCorrection$submitStillCaptures$1(this, continuationImpl);
        CapturePipelineTorchCorrection$submitStillCaptures$1 capturePipelineTorchCorrection$submitStillCaptures$122 = capturePipelineTorchCorrection$submitStillCaptures$1;
        Object obj2 = capturePipelineTorchCorrection$submitStillCaptures$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i5 = capturePipelineTorchCorrection$submitStillCaptures$122.label;
        int i82 = 2;
        Continuation continuation2 = null;
        if (i5 != 0) {
        }
        List list22 = (List) obj2;
        if (z2) {
        }
        return list22;
    }
}
