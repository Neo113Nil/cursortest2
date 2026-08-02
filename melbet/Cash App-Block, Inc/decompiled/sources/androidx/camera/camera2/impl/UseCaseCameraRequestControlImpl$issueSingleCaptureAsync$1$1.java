package androidx.camera.camera2.impl;

import android.util.Log;
import androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.DeferrableSurface;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletableDeferredImpl;
import papa.SafeTrace;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class UseCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ int $captureMode;
    public final /* synthetic */ ArrayList $captureSequence;
    public final /* synthetic */ int $flashMode;
    public final /* synthetic */ int $flashType;
    public int label;
    public final /* synthetic */ UseCaseCameraRequestControlImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UseCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1(UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, ArrayList arrayList, int i, int i2, int i3, Continuation continuation) {
        super(1, continuation);
        this.this$0 = useCaseCameraRequestControlImpl;
        this.$captureSequence = arrayList;
        this.$captureMode = i;
        this.$flashType = i2;
        this.$flashMode = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new UseCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1(this.this$0, this.$captureSequence, this.$captureMode, this.$flashType, this.$flashMode, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((UseCaseCameraRequestControlImpl$issueSingleCaptureAsync$1$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                Log.d("CXCP", "UseCaseCameraRequestControlImpl#issueSingleCaptureAsync");
            }
            CompletableDeferredImpl completableDeferredImpl = UseCaseCameraRequestControlImpl.submitFailedResult;
            ArrayList arrayList = this.$captureSequence;
            Iterator it = arrayList.iterator();
            loop0: while (true) {
                boolean hasNext = it.hasNext();
                useCaseCameraRequestControlImpl = this.this$0;
                if (!hasNext) {
                    break;
                }
                CaptureConfig captureConfig = (CaptureConfig) it.next();
                if (Collections.unmodifiableList(captureConfig.mSurfaces).isEmpty()) {
                    break;
                }
                List unmodifiableList = Collections.unmodifiableList(captureConfig.mSurfaces);
                unmodifiableList.getClass();
                Iterator it2 = unmodifiableList.iterator();
                while (it2.hasNext()) {
                    if (((Map) useCaseCameraRequestControlImpl.useCaseGraphContext.surfaceToStreamMap$delegate.getValue()).get((DeferrableSurface) it2.next()) == null) {
                        break loop0;
                    }
                }
            }
            UseCaseCameraRequestControlImpl.failedResults(arrayList.size(), "Capture request failed due to invalid surface");
            UseCaseCameraRequestControlImpl.InfoBundle merge = UseCaseCameraRequestControlImpl.merge(useCaseCameraRequestControlImpl.infoBundleMap);
            if (StringUtilsKt.isLogLevelEnabled(3, "CXCP")) {
                Log.d("CXCP", "UseCaseCameraRequestControl: Submitting still captures to capture pipeline");
            }
            CapturePipeline capturePipeline = (CapturePipeline) useCaseCameraRequestControlImpl.capturePipeline$delegate.getValue();
            RequestTemplate requestTemplate = merge.template;
            requestTemplate.getClass();
            int i2 = requestTemplate.value;
            Camera2ImplConfig build = merge.options.build();
            this.label = 1;
            obj = capturePipeline.mo23submitStillCapturesBvXKQx0(arrayList, i2, build, this.$captureMode, this.$flashType, this.$flashMode, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return (List) obj;
    }
}
