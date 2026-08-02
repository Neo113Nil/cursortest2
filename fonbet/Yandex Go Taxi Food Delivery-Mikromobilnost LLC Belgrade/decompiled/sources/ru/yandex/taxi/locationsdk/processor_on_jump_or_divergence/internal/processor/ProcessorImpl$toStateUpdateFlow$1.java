package ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor;

import defpackage.az60;
import defpackage.ix1;
import defpackage.kzv;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qzv;
import defpackage.r1s;
import defpackage.rzv;
import defpackage.szv;
import defpackage.tzv;
import defpackage.v2u;
import defpackage.vzv;
import defpackage.w511;
import defpackage.wzv;
import defpackage.y2u;
import defpackage.z5u0;
import defpackage.zic;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz5u0;", "previousStateUpdate", "Lzic;", ClidProvider.STATE, "<anonymous>", "(Lz5u0;Lzic;)Lz5u0;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor.ProcessorImpl$toStateUpdateFlow$1", f = "ProcessorImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class ProcessorImpl$toStateUpdateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessorImpl$toStateUpdateFlow$1(d dVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ProcessorImpl$toStateUpdateFlow$1 processorImpl$toStateUpdateFlow$1 = new ProcessorImpl$toStateUpdateFlow$1(this.this$0, (Continuation) obj3);
        processorImpl$toStateUpdateFlow$1.L$0 = (z5u0) obj;
        processorImpl$toStateUpdateFlow$1.L$1 = (zic) obj2;
        return processorImpl$toStateUpdateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        wzv szvVar;
        vzv vzvVar;
        z5u0 z5u0Var = (z5u0) this.L$0;
        zic zicVar = (zic) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        wzv wzvVar = z5u0Var != null ? z5u0Var.b : null;
        r1s r1sVar = this.this$0.e;
        r1s r1sVar2 = (r1s) r1sVar.c;
        LinkedHashMap linkedHashMap = zicVar.b;
        if (!linkedHashMap.isEmpty() || zicVar.c) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                y2u y2uVar = (y2u) entry.getValue();
                if (!y2uVar.d && !y2uVar.c && !y2uVar.e) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            Pair pair = (Pair) r1sVar2.b;
            v2u v2uVar = (v2u) pair.getFirst();
            rzv b = r1sVar.b(v2uVar, (az60) pair.getSecond(), zicVar, wzvVar, linkedHashMap2);
            if (b instanceof kzv) {
                kzv kzvVar = (kzv) b;
                vzvVar = new vzv(kzvVar.a, kzvVar.b, kzvVar.c, kotlin.collections.b.f());
            } else {
                if (!(b instanceof qzv)) {
                    w511.b();
                    return null;
                }
                LinkedHashMap l = kotlin.collections.b.l(new Pair(v2uVar, b));
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) r1sVar2.c).iterator();
                while (it.hasNext()) {
                    Pair pair2 = (Pair) it.next();
                    v2u v2uVar2 = (v2u) pair2.getFirst();
                    rzv b2 = r1sVar.b(v2uVar2, (az60) pair2.getSecond(), zicVar, wzvVar, linkedHashMap2);
                    if (b2 instanceof kzv) {
                        arrayList.add(b2);
                    } else {
                        if (!(b2 instanceof qzv)) {
                            w511.b();
                            return null;
                        }
                        Pair pair3 = new Pair(v2uVar2, b2);
                        l.put(pair3.c(), pair3.f());
                    }
                }
                if (arrayList.isEmpty()) {
                    szvVar = new szv(l);
                } else {
                    kzv a = ((ix1) r1sVar.b).a(arrayList);
                    vzvVar = new vzv(a.a, a.b, a.c, l);
                }
            }
            szvVar = vzvVar;
        } else {
            szvVar = tzv.a;
        }
        return new z5u0(wzvVar, szvVar, zicVar);
    }
}
