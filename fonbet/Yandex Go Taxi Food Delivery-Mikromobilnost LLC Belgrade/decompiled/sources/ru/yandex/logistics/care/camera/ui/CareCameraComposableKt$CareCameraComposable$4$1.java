package ru.yandex.logistics.care.camera.ui;

import defpackage.lz40;
import defpackage.mvg;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.pb;
import defpackage.rs8;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.ye;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.care.camera.ui.CareCameraComposableKt$CareCameraComposable$4$1", f = "CareCameraComposable.kt", l = {MSException.ERROR_BUSY}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class CareCameraComposableKt$CareCameraComposable$4$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $backPressFlow;
    final /* synthetic */ lz40 $backPressFlowInternal;
    final /* synthetic */ oz40 $isCloseConfirmModal$delegate;
    final /* synthetic */ tls $onAction;
    final /* synthetic */ n4u0 $selfTimerState;
    final /* synthetic */ rs8 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CareCameraComposableKt$CareCameraComposable$4$1(n4u0 n4u0Var, tpr tprVar, lz40 lz40Var, rs8 rs8Var, tls tlsVar, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$selfTimerState = n4u0Var;
        this.$backPressFlow = tprVar;
        this.$backPressFlowInternal = lz40Var;
        this.$state = rs8Var;
        this.$onAction = tlsVar;
        this.$isCloseConfirmModal$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CareCameraComposableKt$CareCameraComposable$4$1(this.$selfTimerState, this.$backPressFlow, this.$backPressFlowInternal, this.$state, this.$onAction, this.$isCloseConfirmModal$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CareCameraComposableKt$CareCameraComposable$4$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g X = e.X(e.t(new pb(this.$selfTimerState, 21)), new CareCameraComposableKt$CareCameraComposable$4$1$invokeSuspend$$inlined$flatMapLatest$1(this.$backPressFlow, this.$backPressFlowInternal, null));
            ye yeVar = new ye(2, this.$state, this.$onAction, this.$isCloseConfirmModal$delegate);
            this.label = 1;
            if (X.collect(yeVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
