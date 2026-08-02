package ru.yandex.taxi.surge.modal;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.mvw0;
import defpackage.nvw0;
import defpackage.ny61;
import defpackage.ovw0;
import defpackage.oxv0;
import defpackage.qu;
import defpackage.rqw0;
import defpackage.sts;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.wvw0;
import defpackage.zow0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.surge.interactor.s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.modal.SurgeShortcutModalPresenter$onButtonClick$1", f = "SurgeShortcutModalPresenter.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgeShortcutModalPresenter$onButtonClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ ovw0 $action;
    int label;
    final /* synthetic */ wvw0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeShortcutModalPresenter$onButtonClick$1(ovw0 ovw0Var, wvw0 wvw0Var, Continuation continuation) {
        super(2, continuation);
        this.$action = ovw0Var;
        this.this$0 = wvw0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SurgeShortcutModalPresenter$onButtonClick$1(this.$action, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgeShortcutModalPresenter$onButtonClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ovw0 ovw0Var = this.$action;
            if (jl40.l(ovw0Var, mvw0.a)) {
                wvw0 wvw0Var = this.this$0;
                wvw0Var.A.a("close_button");
                ((sts) wvw0Var.y.a).r(new qu(9));
            } else if (!jl40.l(ovw0Var, mvw0.b)) {
                if (!(ovw0Var instanceof nvw0)) {
                    w511.b();
                    return null;
                }
                wvw0 wvw0Var2 = this.this$0;
                String str = ((nvw0) this.$action).a;
                this.label = 1;
                zow0 zow0Var = wvw0Var2.A.c;
                zow0Var.getClass();
                zow0Var.a.a("SurgeCard.Shortcut.Modal.ActionButton.Tap", new HashMap(), 1, new HashMap());
                sts stsVar = (sts) wvw0Var2.y.a;
                stsVar.r(new oxv0(12));
                ((rqw0) stsVar.K).handle(str);
                s sVar = wvw0Var2.z;
                if (sVar.a.b(wvw0Var2.x.a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
