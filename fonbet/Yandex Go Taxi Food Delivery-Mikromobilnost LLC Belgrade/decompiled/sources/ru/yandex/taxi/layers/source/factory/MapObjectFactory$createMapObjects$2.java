package ru.yandex.taxi.layers.source.factory;

import defpackage.f0k;
import defpackage.fkp;
import defpackage.gw00;
import defpackage.hxu0;
import defpackage.jmp;
import defpackage.lm00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "", "", "Llm00;", "<anonymous>", "(Ltse;)Ljava/util/Map;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.source.factory.MapObjectFactory$createMapObjects$2", f = "MapObjectFactory.kt", l = {38}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MapObjectFactory$createMapObjects$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<fkp> $features;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectFactory$createMapObjects$2(List list, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$features = list;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MapObjectFactory$createMapObjects$2 mapObjectFactory$createMapObjects$2 = new MapObjectFactory$createMapObjects$2(this.$features, this.this$0, continuation);
        mapObjectFactory$createMapObjects$2.L$0 = obj;
        return mapObjectFactory$createMapObjects$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapObjectFactory$createMapObjects$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        f0k j;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List<fkp> list = this.$features;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                fkp fkpVar = (fkp) obj2;
                if (fkpVar.getA() != null && fkpVar.getC() != null) {
                    jmp b = fkpVar.getB();
                    if (((b == null || (j = b.getJ()) == null) ? null : j.getC()) != null && fkpVar.getB().getJ().getA() != null && fkpVar.getB().getJ().getC().length == 2) {
                        if (fkpVar.getB().getB() != null) {
                            hxu0 b2 = fkpVar.getB().getB().getB();
                            if ((b2 != null ? b2.getA() : null) == null) {
                                hxu0 b3 = fkpVar.getB().getB().getB();
                                if ((b3 != null ? b3.getC() : null) == null) {
                                    hxu0 b4 = fkpVar.getB().getB().getB();
                                    if ((b4 != null ? b4.getD() : null) != null) {
                                    }
                                }
                            }
                            arrayList.add(obj2);
                        }
                        if (fkpVar.getB().getD() == null && fkpVar.getB().getE() == null) {
                        }
                        arrayList.add(obj2);
                    }
                }
            }
            c cVar = this.this$0;
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    scc.m();
                    throw null;
                }
                arrayList2.add(tje.h(tseVar, null, null, new MapObjectFactory$createMapObjects$2$1$1(cVar, (fkp) next, i2, arrayList, null), 3));
                i2 = i3;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = kotlinx.coroutines.a.b(arrayList2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        List M = kotlin.collections.a.M((Iterable) obj);
        int d = gw00.d(tcc.n(M, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (Object obj3 : M) {
            linkedHashMap.put(((lm00) obj3).a, obj3);
        }
        return linkedHashMap;
    }
}
