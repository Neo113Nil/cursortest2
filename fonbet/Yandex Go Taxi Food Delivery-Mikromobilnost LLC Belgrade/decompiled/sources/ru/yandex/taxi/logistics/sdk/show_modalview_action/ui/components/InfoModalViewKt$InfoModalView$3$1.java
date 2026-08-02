package ru.yandex.taxi.logistics.sdk.show_modalview_action.ui.components;

import defpackage.i330;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.show_modalview_action.ui.components.InfoModalViewKt$InfoModalView$3$1", f = "InfoModalView.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class InfoModalViewKt$InfoModalView$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ wls $onShown;
    final /* synthetic */ i330 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoModalViewKt$InfoModalView$3$1(wls wlsVar, i330 i330Var, Continuation continuation) {
        super(2, continuation);
        this.$onShown = wlsVar;
        this.$state = i330Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InfoModalViewKt$InfoModalView$3$1(this.$onShown, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        InfoModalViewKt$InfoModalView$3$1 infoModalViewKt$InfoModalView$3$1 = (InfoModalViewKt$InfoModalView$3$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        infoModalViewKt$InfoModalView$3$1.invokeSuspend(zy11Var);
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
        wls wlsVar = this.$onShown;
        i330 i330Var = this.$state;
        wlsVar.invoke(i330Var.e, i330Var.d);
        return zy11.a;
    }
}
