package ru.yandex.taxi.cashback.model;

import defpackage.g92;
import defpackage.h3b0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.x5d0;
import defpackage.yj4;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.cashback.model.PlusMenuItemInteractorImpl$plusMenuItemBadgeContentStateFlow$lambda$0$$inlined$flatMapLatest$1", f = "PlusMenuItemInteractorImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
public final class PlusMenuItemInteractorImpl$plusMenuItemBadgeContentStateFlow$lambda$0$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ h3b0 $viewModel$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ x5d0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusMenuItemInteractorImpl$plusMenuItemBadgeContentStateFlow$lambda$0$$inlined$flatMapLatest$1(h3b0 h3b0Var, x5d0 x5d0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = x5d0Var;
        this.$viewModel$inlined = h3b0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        x5d0 x5d0Var = this.this$0;
        PlusMenuItemInteractorImpl$plusMenuItemBadgeContentStateFlow$lambda$0$$inlined$flatMapLatest$1 plusMenuItemInteractorImpl$plusMenuItemBadgeContentStateFlow$lambda$0$$inlined$flatMapLatest$1 = new PlusMenuItemInteractorImpl$plusMenuItemBadgeContentStateFlow$lambda$0$$inlined$flatMapLatest$1(this.$viewModel$inlined, x5d0Var, (Continuation) obj3);
        plusMenuItemInteractorImpl$plusMenuItemBadgeContentStateFlow$lambda$0$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        plusMenuItemInteractorImpl$plusMenuItemBadgeContentStateFlow$lambda$0$$inlined$flatMapLatest$1.L$1 = obj2;
        return plusMenuItemInteractorImpl$plusMenuItemBadgeContentStateFlow$lambda$0$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr g92Var;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (((Boolean) obj2).booleanValue()) {
                x5d0 x5d0Var = this.this$0;
                g92Var = new m0(x5d0Var.e, x5d0Var.d.a.b(), new PlusMenuItemInteractorImpl$plusEnabledBadgeFlow$1(this.$viewModel$inlined, x5d0Var, null));
            } else {
                g92Var = new g92(2, yj4.a);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(g92Var, vprVar, this) == coroutineSingletons) {
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
