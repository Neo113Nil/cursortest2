package ru.yandex.taxi.requirements.repository;

import defpackage.fnx0;
import defpackage.g92;
import defpackage.jjj0;
import defpackage.maj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.x9j0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.requirements.repository.RequiredAltChoiceBubbleRepository$special$$inlined$flatMapLatest$1", f = "RequiredAltChoiceBubbleRepository.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class RequiredAltChoiceBubbleRepository$special$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ x9j0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequiredAltChoiceBubbleRepository$special$$inlined$flatMapLatest$1(Continuation continuation, x9j0 x9j0Var) {
        super(3, continuation);
        this.this$0 = x9j0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RequiredAltChoiceBubbleRepository$special$$inlined$flatMapLatest$1 requiredAltChoiceBubbleRepository$special$$inlined$flatMapLatest$1 = new RequiredAltChoiceBubbleRepository$special$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        requiredAltChoiceBubbleRepository$special$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        requiredAltChoiceBubbleRepository$special$$inlined$flatMapLatest$1.L$1 = obj2;
        return requiredAltChoiceBubbleRepository$special$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
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
            pex0 pex0Var = ((fnx0) obj2).c;
            if (pex0Var.O instanceof jjj0) {
                maj0 maj0Var = this.this$0.a;
                g92Var = new d(kotlinx.coroutines.flow.e.t(new com.yandex.go.taxi.tariffs.data.b(maj0Var.a, pex0Var.b)), pex0Var);
            } else {
                g92Var = new g92(2, null);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(g92Var, vprVar, this) == coroutineSingletons) {
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
