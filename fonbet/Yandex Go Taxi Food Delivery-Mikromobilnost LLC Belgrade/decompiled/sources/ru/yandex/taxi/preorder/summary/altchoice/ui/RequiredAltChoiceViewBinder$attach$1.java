package ru.yandex.taxi.preorder.summary.altchoice.ui;

import defpackage.caj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v41;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.altchoice.ui.RequiredAltChoiceViewBinder$attach$1", f = "RequiredAltChoiceViewBinder.kt", l = {38}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RequiredAltChoiceViewBinder$attach$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.go.taxi.summary.shared.expanded.repository.c $infoHolder;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequiredAltChoiceViewBinder$attach$1(c cVar, com.yandex.go.taxi.summary.shared.expanded.repository.c cVar2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$infoHolder = cVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RequiredAltChoiceViewBinder$attach$1(this.this$0, this.$infoHolder, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RequiredAltChoiceViewBinder$attach$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            caj0 caj0Var = this.this$0.c;
            com.yandex.go.taxi.summary.shared.expanded.repository.c cVar = this.$infoHolder;
            caj0Var.getClass();
            b bVar = new b(caj0Var.a(cVar.a()));
            v41 v41Var = new v41(19, this.this$0);
            this.label = 1;
            if (bVar.collect(v41Var, this) == coroutineSingletons) {
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
