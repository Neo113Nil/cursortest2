package ru.yandex.taxi.layers.domain;

import defpackage.a3e0;
import defpackage.g4e0;
import defpackage.gw00;
import defpackage.mvg;
import defpackage.nm40;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.u7s0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lu7s0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.domain.PolygonsInteractor$onResponse$1", f = "PolygonsInteractor.kt", l = {109, 110}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PolygonsInteractor$onResponse$1 extends SuspendLambda implements wls {
    final /* synthetic */ g4e0 $response;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ r this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PolygonsInteractor$onResponse$1(r rVar, g4e0 g4e0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rVar;
        this.$response = g4e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PolygonsInteractor$onResponse$1 polygonsInteractor$onResponse$1 = new PolygonsInteractor$onResponse$1(this.this$0, this.$response, continuation);
        polygonsInteractor$onResponse$1.L$0 = obj;
        return polygonsInteractor$onResponse$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PolygonsInteractor$onResponse$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0035, code lost:
    
        if (r9 == r1) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map k;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.layers.source.factory.d dVar = this.this$0.k;
            g4e0 g4e0Var = this.$response;
            this.L$0 = vprVar;
            this.label = 1;
            obj = dVar.c(g4e0Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        List list = (List) obj;
        if (list == null) {
            return zy11.a;
        }
        a3e0 a3e0Var = this.this$0.m;
        List list2 = list;
        int d = gw00.d(tcc.n(list2, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj2 : list2) {
            linkedHashMap.put(((nm40) obj2).b(), obj2);
        }
        synchronized (a3e0Var) {
            LinkedHashMap n = kotlin.collections.b.n(a3e0Var.a, linkedHashMap);
            k = kotlin.collections.b.k(n, a3e0Var.a.keySet());
            a3e0Var.a = n;
        }
        u7s0 u7s0Var = new u7s0();
        u7s0Var.a = k;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
