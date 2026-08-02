package ru.yandex.taxi.linked_order.provider;

import defpackage.avj0;
import defpackage.cmt;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.nly;
import defpackage.ny61;
import defpackage.oly;
import defpackage.ply;
import defpackage.pz40;
import defpackage.qly;
import defpackage.r1e0;
import defpackage.rly;
import defpackage.rny;
import defpackage.s8o;
import defpackage.sly;
import defpackage.sny;
import defpackage.tly;
import defpackage.tse;
import defpackage.umy;
import defpackage.w511;
import defpackage.wls;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.linked_order.api.LinkedOrderApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lsly;", "<anonymous>", "(Ltse;)Lsly;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.linked_order.provider.LinkedOrderRemoteProvider$loadOrderInfo$2", f = "LinkedOrderRemoteProvider.kt", l = {48}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class LinkedOrderRemoteProvider$loadOrderInfo$2 extends SuspendLambda implements wls {
    final /* synthetic */ sny $orderKey;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkedOrderRemoteProvider$loadOrderInfo$2(i iVar, sny snyVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$orderKey = snyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LinkedOrderRemoteProvider$loadOrderInfo$2(this.this$0, this.$orderKey, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LinkedOrderRemoteProvider$loadOrderInfo$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        i iVar;
        sny snyVar;
        sny snyVar2;
        i iVar2;
        boolean C;
        sly slyVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        tly tlyVar = null;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                iVar = this.this$0;
                sny snyVar3 = this.$orderKey;
                try {
                    cmt<umy> a = ((LinkedOrderApi) iVar.e.getValue()).a(new rny(snyVar3.a));
                    this.L$0 = iVar;
                    this.L$1 = snyVar3;
                    this.L$2 = iVar;
                    this.L$3 = snyVar3;
                    this.label = 1;
                    Object c = ru.yandex.taxi.network.api.a.c(a, null, this);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    snyVar = snyVar3;
                    snyVar2 = snyVar;
                    obj = c;
                    iVar2 = iVar;
                } catch (Throwable th) {
                    th = th;
                    snyVar = snyVar3;
                    C = s8o.C(th);
                    qly qlyVar = qly.a;
                    if (!C) {
                        return qlyVar;
                    }
                    if (!s8o.u(th)) {
                        throw th;
                    }
                    String str = snyVar.a;
                    zuj0 zuj0Var = iVar.d;
                    pz40 pz40Var = (pz40) iVar.c.a.get(str);
                    rly rlyVar = rly.a;
                    if (pz40Var == null || (slyVar = (sly) ((r0) pz40Var).getValue()) == null) {
                        slyVar = rlyVar;
                    }
                    if (!slyVar.equals(rlyVar) && !slyVar.equals(qlyVar)) {
                        if (slyVar instanceof oly) {
                            tlyVar = ((oly) slyVar).b();
                        } else if (slyVar instanceof nly) {
                            tlyVar = ((nly) slyVar).b();
                        } else {
                            if (!(slyVar instanceof ply)) {
                                w511.b();
                                return null;
                            }
                            tlyVar = ((ply) slyVar).b();
                        }
                    }
                    avj0 avj0Var = (avj0) zuj0Var;
                    return new oly(tlyVar, avj0Var.h(kyh0.common_unknown_error), avj0Var.h(kyh0.common_ok));
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                snyVar = (sny) this.L$3;
                iVar = (i) this.L$2;
                snyVar2 = (sny) this.L$1;
                iVar2 = (i) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    C = s8o.C(th);
                    qly qlyVar2 = qly.a;
                    if (!C) {
                    }
                }
            }
            return iVar2.b.b(snyVar2, (r1e0) obj);
        } catch (CancellationException e) {
            throw e;
        }
    }
}
