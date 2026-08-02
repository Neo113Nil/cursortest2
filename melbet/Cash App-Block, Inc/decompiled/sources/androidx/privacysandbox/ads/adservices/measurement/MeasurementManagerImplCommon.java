package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import androidx.arch.core.executor.ArchTaskExecutor$$ExternalSyntheticLambda0;
import androidx.core.os.ContinuationOutcomeReceiver;
import app.cash.badging.backend.RealBadger2$clear$2;
import com.squareup.cash.ui.widget.amount.AmountChangedSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public abstract class MeasurementManagerImplCommon extends AmountChangedSource {
    public final MeasurementManager mMeasurementManager;

    public MeasurementManagerImplCommon(MeasurementManager measurementManager) {
        measurementManager.getClass();
        this.mMeasurementManager = measurementManager;
    }

    public static Object deleteRegistrations$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, DeletionRequest deletionRequest, Continuation<? super Unit> continuation) {
        new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation)).initCancellability();
        MeasurementManager measurementManager = measurementManagerImplCommon.mMeasurementManager;
        throw null;
    }

    public static Object getMeasurementApiStatus$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, Continuation<? super Integer> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        cancellableContinuationImpl.initCancellability();
        measurementManagerImplCommon.mMeasurementManager.getMeasurementApiStatus(new ArchTaskExecutor$$ExternalSyntheticLambda0(1), new ContinuationOutcomeReceiver(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    public static Object registerSource$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, InputEvent inputEvent, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        cancellableContinuationImpl.initCancellability();
        measurementManagerImplCommon.mMeasurementManager.registerSource(uri, inputEvent, new ArchTaskExecutor$$ExternalSyntheticLambda0(1), new ContinuationOutcomeReceiver(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        return result == CoroutineSingletons.COROUTINE_SUSPENDED ? result : Unit.INSTANCE;
    }

    public static Object registerTrigger$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        cancellableContinuationImpl.initCancellability();
        measurementManagerImplCommon.mMeasurementManager.registerTrigger(uri, new ArchTaskExecutor$$ExternalSyntheticLambda0(1), new ContinuationOutcomeReceiver(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        return result == CoroutineSingletons.COROUTINE_SUSPENDED ? result : Unit.INSTANCE;
    }

    public static Object registerWebSource$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, WebSourceRegistrationRequest webSourceRegistrationRequest, Continuation<? super Unit> continuation) {
        new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation)).initCancellability();
        MeasurementManager measurementManager = measurementManagerImplCommon.mMeasurementManager;
        throw null;
    }

    public static Object registerWebTrigger$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, WebTriggerRegistrationRequest webTriggerRegistrationRequest, Continuation<? super Unit> continuation) {
        new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation)).initCancellability();
        MeasurementManager measurementManager = measurementManagerImplCommon.mMeasurementManager;
        throw null;
    }

    public Object deleteRegistrations(DeletionRequest deletionRequest, Continuation<? super Unit> continuation) {
        return deleteRegistrations$suspendImpl(this, deletionRequest, continuation);
    }

    @Override // com.squareup.cash.ui.widget.amount.AmountChangedSource
    public Object getMeasurementApiStatus(Continuation<? super Integer> continuation) {
        return getMeasurementApiStatus$suspendImpl(this, continuation);
    }

    @Override // com.squareup.cash.ui.widget.amount.AmountChangedSource
    public Object registerSource(Uri uri, InputEvent inputEvent, Continuation<? super Unit> continuation) {
        return registerSource$suspendImpl(this, uri, inputEvent, continuation);
    }

    @Override // com.squareup.cash.ui.widget.amount.AmountChangedSource
    public Object registerTrigger(Uri uri, Continuation<? super Unit> continuation) {
        return registerTrigger$suspendImpl(this, uri, continuation);
    }

    public Object registerWebSource(WebSourceRegistrationRequest webSourceRegistrationRequest, Continuation<? super Unit> continuation) {
        return registerWebSource$suspendImpl(this, webSourceRegistrationRequest, continuation);
    }

    public Object registerWebTrigger(WebTriggerRegistrationRequest webTriggerRegistrationRequest, Continuation<? super Unit> continuation) {
        return registerWebTrigger$suspendImpl(this, webTriggerRegistrationRequest, continuation);
    }

    public Object registerSource(SourceRegistrationRequest sourceRegistrationRequest, Continuation<? super Unit> continuation) {
        return registerSource$suspendImpl(this, sourceRegistrationRequest, continuation);
    }

    public static Object registerSource$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, SourceRegistrationRequest sourceRegistrationRequest, Continuation<? super Unit> continuation) {
        Object coroutineScope = JobKt.coroutineScope(new RealBadger2$clear$2(measurementManagerImplCommon, null, 19), continuation);
        return coroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? coroutineScope : Unit.INSTANCE;
    }
}
