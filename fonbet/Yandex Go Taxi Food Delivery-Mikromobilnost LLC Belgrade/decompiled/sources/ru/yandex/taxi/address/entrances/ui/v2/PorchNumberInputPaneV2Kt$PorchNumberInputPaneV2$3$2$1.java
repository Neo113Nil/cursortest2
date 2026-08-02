package ru.yandex.taxi.address.entrances.ui.v2;

import defpackage.fbe0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.address.entrances.ui.v2.PorchNumberInputPaneV2Kt$PorchNumberInputPaneV2$3$2$1", f = "PorchNumberInputPaneV2.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PorchNumberInputPaneV2Kt$PorchNumberInputPaneV2$3$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $handleAction;
    final /* synthetic */ boolean $isImeVisible;
    final /* synthetic */ oz40 $keyboardWasShown$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PorchNumberInputPaneV2Kt$PorchNumberInputPaneV2$3$2$1(boolean z, tls tlsVar, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$isImeVisible = z;
        this.$handleAction = tlsVar;
        this.$keyboardWasShown$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PorchNumberInputPaneV2Kt$PorchNumberInputPaneV2$3$2$1(this.$isImeVisible, this.$handleAction, this.$keyboardWasShown$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PorchNumberInputPaneV2Kt$PorchNumberInputPaneV2$3$2$1 porchNumberInputPaneV2Kt$PorchNumberInputPaneV2$3$2$1 = (PorchNumberInputPaneV2Kt$PorchNumberInputPaneV2$3$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        porchNumberInputPaneV2Kt$PorchNumberInputPaneV2$3$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (this.$isImeVisible && !((Boolean) this.$keyboardWasShown$delegate.getValue()).booleanValue()) {
            this.$keyboardWasShown$delegate.setValue(Boolean.TRUE);
            this.$handleAction.invoke(fbe0.a);
        }
        return zy11.a;
    }
}
