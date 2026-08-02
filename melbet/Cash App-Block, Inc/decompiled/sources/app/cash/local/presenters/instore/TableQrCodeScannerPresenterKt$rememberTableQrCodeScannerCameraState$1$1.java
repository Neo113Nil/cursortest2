package app.cash.local.presenters.instore;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.Lifecycle;
import app.cash.local.viewmodels.instore.CameraState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$toHeroModule$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class TableQrCodeScannerPresenterKt$rememberTableQrCodeScannerCameraState$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ StateFlow $activityLifecycleState;
    public final /* synthetic */ Flow $permissionDenials;
    public final /* synthetic */ Flow $permissionGrants;
    public final /* synthetic */ MutableState $state$delegate;
    public /* synthetic */ Object L$0;

    /* renamed from: app.cash.local.presenters.instore.TableQrCodeScannerPresenterKt$rememberTableQrCodeScannerCameraState$1$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends SuspendLambda implements Function2 {
        public final /* synthetic */ StateFlow $activityLifecycleState;
        public final /* synthetic */ MutableState $state$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(StateFlow stateFlow, MutableState mutableState, Continuation continuation) {
            super(2, continuation);
            this.$activityLifecycleState = stateFlow;
            this.$state$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass3(this.$activityLifecycleState, this.$state$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            return CoroutineSingletons.COROUTINE_SUSPENDED;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                final MutableState mutableState = this.$state$delegate;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.cash.local.presenters.instore.TableQrCodeScannerPresenterKt.rememberTableQrCodeScannerCameraState.1.1.3.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        Lifecycle.State state = (Lifecycle.State) obj2;
                        MutableState mutableState2 = MutableState.this;
                        mutableState2.setValue(TableQrCodeScannerCameraState.copy$default((TableQrCodeScannerCameraState) mutableState2.getValue(), false, state == Lifecycle.State.RESUMED ? CameraState.RESUMED : CameraState.PAUSED, 1));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (this.$activityLifecycleState.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
            }
            OptionalProvider$$ExternalSyntheticLambda0.m$1();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TableQrCodeScannerPresenterKt$rememberTableQrCodeScannerCameraState$1$1(Flow flow, MutableState mutableState, Flow flow2, StateFlow stateFlow, Continuation continuation) {
        super(2, continuation);
        this.$permissionGrants = flow;
        this.$state$delegate = mutableState;
        this.$permissionDenials = flow2;
        this.$activityLifecycleState = stateFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TableQrCodeScannerPresenterKt$rememberTableQrCodeScannerCameraState$1$1 tableQrCodeScannerPresenterKt$rememberTableQrCodeScannerCameraState$1$1 = new TableQrCodeScannerPresenterKt$rememberTableQrCodeScannerCameraState$1$1(this.$permissionGrants, this.$state$delegate, this.$permissionDenials, this.$activityLifecycleState, continuation);
        tableQrCodeScannerPresenterKt$rememberTableQrCodeScannerCameraState$1$1.L$0 = obj;
        return tableQrCodeScannerPresenterKt$rememberTableQrCodeScannerCameraState$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TableQrCodeScannerPresenterKt$rememberTableQrCodeScannerCameraState$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        MutableState mutableState = this.$state$delegate;
        Continuation continuation = null;
        JobKt.launch$default(coroutineScope, null, null, new CardSchemePresenter$toHeroModule$1$1(1, mutableState, continuation, this.$permissionGrants), 3);
        JobKt.launch$default(coroutineScope, null, null, new CardSchemePresenter$toHeroModule$1$1(2, mutableState, continuation, this.$permissionDenials), 3);
        JobKt.launch$default(coroutineScope, null, null, new AnonymousClass3(this.$activityLifecycleState, mutableState, null), 3);
        return Unit.INSTANCE;
    }
}
