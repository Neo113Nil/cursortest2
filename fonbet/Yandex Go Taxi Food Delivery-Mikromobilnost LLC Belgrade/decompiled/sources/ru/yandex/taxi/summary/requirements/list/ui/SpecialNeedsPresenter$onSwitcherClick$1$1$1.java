package ru.yandex.taxi.summary.requirements.list.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.soj0;
import defpackage.tej0;
import defpackage.tse;
import defpackage.vot0;
import defpackage.wls;
import defpackage.zot0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.ui.SpecialNeedsPresenter$onSwitcherClick$1$1$1", f = "SpecialNeedsPresenter.kt", l = {166}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SpecialNeedsPresenter$onSwitcherClick$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ soj0 $action;
    final /* synthetic */ zot0 $model;
    int label;
    final /* synthetic */ vot0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpecialNeedsPresenter$onSwitcherClick$1$1$1(vot0 vot0Var, soj0 soj0Var, zot0 zot0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vot0Var;
        this.$action = soj0Var;
        this.$model = zot0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SpecialNeedsPresenter$onSwitcherClick$1$1$1(this.this$0, this.$action, this.$model, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SpecialNeedsPresenter$onSwitcherClick$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.summary.requirements.list.router.a aVar = this.this$0.D;
            tej0 tej0Var = this.$action.e;
            String str = this.$model.g;
            this.label = 1;
            if (aVar.a(tej0Var, str, this) == coroutineSingletons) {
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
