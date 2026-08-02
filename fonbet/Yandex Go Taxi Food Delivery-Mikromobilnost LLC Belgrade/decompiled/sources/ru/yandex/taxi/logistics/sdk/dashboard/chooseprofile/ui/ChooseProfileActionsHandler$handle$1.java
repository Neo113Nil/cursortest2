package ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui;

import defpackage.ehg;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.ChooseProfileActionsHandler$handle$1", f = "ChooseProfileActionsHandler.kt", l = {70}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ChooseProfileActionsHandler$handle$1 extends SuspendLambda implements wls {
    final /* synthetic */ ehg $action;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseProfileActionsHandler$handle$1(c cVar, ehg ehgVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$action = ehgVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChooseProfileActionsHandler$handle$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChooseProfileActionsHandler$handle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.dependencies.a aVar = this.this$0.c;
            String str = this.$action.a;
            this.label = 1;
            if (aVar.a(str, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        n0 n0Var = this.this$0.b.a;
        zy11 zy11Var = zy11.a;
        n0Var.g(zy11Var);
        this.this$0.a.a.dismiss();
        return zy11Var;
    }
}
