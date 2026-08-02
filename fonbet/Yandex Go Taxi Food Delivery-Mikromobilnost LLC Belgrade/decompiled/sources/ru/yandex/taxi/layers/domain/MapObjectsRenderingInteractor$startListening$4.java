package ru.yandex.taxi.layers.domain;

import defpackage.ifu0;
import defpackage.jfu0;
import defpackage.jl40;
import defpackage.kfu0;
import defpackage.lfu0;
import defpackage.lxi0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pxi0;
import defpackage.rp60;
import defpackage.w511;
import defpackage.wls;
import defpackage.zp00;
import defpackage.zy11;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llfu0;", "stopBubble", "Lzy11;", "<anonymous>", "(Llfu0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.domain.MapObjectsRenderingInteractor$startListening$4", f = "MapObjectsRenderingInteractor.kt", l = {91}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MapObjectsRenderingInteractor$startListening$4 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsRenderingInteractor$startListening$4(o oVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MapObjectsRenderingInteractor$startListening$4 mapObjectsRenderingInteractor$startListening$4 = new MapObjectsRenderingInteractor$startListening$4(this.this$0, continuation);
        mapObjectsRenderingInteractor$startListening$4.L$0 = obj;
        return mapObjectsRenderingInteractor$startListening$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapObjectsRenderingInteractor$startListening$4) create((lfu0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        lfu0 lfu0Var = (lfu0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o oVar = this.this$0;
            this.L$0 = null;
            this.label = 1;
            rp60 rp60Var = oVar.c;
            zp00 zp00Var = oVar.i;
            if (jl40.l(lfu0Var, ifu0.a)) {
                zp00Var.g = null;
                Map a = zp00Var.a();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : a.entrySet()) {
                    if (!oVar.f(entry)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                c = o.c(oVar, linkedHashMap, null, null, this, 6);
            } else if (lfu0Var instanceof jfu0) {
                zp00Var.g = null;
                Map a2 = zp00Var.a();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : a2.entrySet()) {
                    if (!oVar.f(entry2)) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                jfu0 jfu0Var = (jfu0) lfu0Var;
                rp60Var.b(jfu0Var.a());
                c = o.c(oVar, linkedHashMap2, null, Collections.singletonList(new pxi0(jfu0Var.a())), this, 2);
            } else {
                if (!(lfu0Var instanceof kfu0)) {
                    w511.b();
                    return null;
                }
                kfu0 kfu0Var = (kfu0) lfu0Var;
                zp00Var.g = kfu0Var.a();
                Map a3 = zp00Var.a();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry3 : a3.entrySet()) {
                    if (!oVar.f(entry3)) {
                        linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                    }
                }
                if (jl40.l(rp60Var.a(), kfu0Var.a())) {
                    rp60Var.b(null);
                }
                c = o.c(oVar, linkedHashMap3, Collections.singletonList(new lxi0(kfu0Var.a())), null, this, 4);
            }
            if (c == coroutineSingletons) {
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
