package ru.yandex.taxi.shortcuts.ui.shortcutview;

import com.yandex.go.dto.response.q1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.u8w0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsViewPresenter$handleAction$1", f = "ShortcutsViewPresenter.kt", l = {169}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ShortcutsViewPresenter$handleAction$1 extends SuspendLambda implements wls {
    final /* synthetic */ q1 $action;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutsViewPresenter$handleAction$1(f fVar, q1 q1Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$action = q1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShortcutsViewPresenter$handleAction$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShortcutsViewPresenter$handleAction$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            u8w0 u8w0Var = this.this$0.L;
            q1 q1Var = this.$action;
            this.label = 1;
            if (u8w0Var.a(q1Var, this) == coroutineSingletons) {
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
