package ru.yandex.taxi.masstransit.ui.route.modal.expanded;

import defpackage.jl40;
import defpackage.lj30;
import defpackage.mvg;
import defpackage.n1j;
import defpackage.ny61;
import defpackage.rsn;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.ui.route.modal.expanded.MtExpandedRoutesPresenter$updateLocalState$$inlined$flatMapLatest$1", f = "MtExpandedRoutesPresenter.kt", l = {HProv.PP_AUTH_INFO, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class MtExpandedRoutesPresenter$updateLocalState$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ lj30 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtExpandedRoutesPresenter$updateLocalState$$inlined$flatMapLatest$1(lj30 lj30Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = lj30Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MtExpandedRoutesPresenter$updateLocalState$$inlined$flatMapLatest$1 mtExpandedRoutesPresenter$updateLocalState$$inlined$flatMapLatest$1 = new MtExpandedRoutesPresenter$updateLocalState$$inlined$flatMapLatest$1(this.this$0, (Continuation) obj3);
        mtExpandedRoutesPresenter$updateLocalState$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        mtExpandedRoutesPresenter$updateLocalState$$inlined$flatMapLatest$1.L$1 = obj2;
        return mtExpandedRoutesPresenter$updateLocalState$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r4 == r2) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        n1j n1jVar;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            rsn rsnVar = (rsn) obj2;
            n1j n1jVar2 = (n1j) rsnVar.a;
            n1jVar = (n1j) rsnVar.b;
            if (n1jVar2 != null && !jl40.l(n1jVar2.b.a.e, n1jVar.b.a.e)) {
                r0 r0Var = this.this$0.J;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = vprVar;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = n1jVar;
                this.label = 1;
                r0Var.emit(EmptySet.a, this);
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            n1j n1jVar3 = (n1j) this.L$6;
            vpr vprVar2 = (vpr) this.L$2;
            kotlin.b.b(obj);
            n1jVar = n1jVar3;
            vprVar = vprVar2;
        }
        d dVar = new d(this.this$0.J, n1jVar);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.L$6 = null;
        this.label = 2;
        return e.u(dVar, vprVar, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
