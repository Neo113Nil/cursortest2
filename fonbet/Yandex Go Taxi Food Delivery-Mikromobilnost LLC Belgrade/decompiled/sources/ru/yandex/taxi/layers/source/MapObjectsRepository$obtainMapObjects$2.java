package ru.yandex.taxi.layers.source;

import defpackage.cne0;
import defpackage.cq60;
import defpackage.fkp;
import defpackage.jmp;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rl6;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.y9s0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "", "", "Llm00;", "<anonymous>", "(Ltse;)Ljava/util/Map;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.source.MapObjectsRepository$obtainMapObjects$2", f = "MapObjectsRepository.kt", l = {49}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MapObjectsRepository$obtainMapObjects$2 extends SuspendLambda implements wls {
    final /* synthetic */ cq60 $response;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsRepository$obtainMapObjects$2(e eVar, cq60 cq60Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$response = cq60Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapObjectsRepository$obtainMapObjects$2(this.this$0, this.$response, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapObjectsRepository$obtainMapObjects$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c3, code lost:
    
        if (r2 == null) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0145 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        e eVar;
        Iterator it;
        String e;
        int i;
        y9s0 y9s0Var;
        int i2;
        rl6 e2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        String str = null;
        int i4 = 1;
        if (i3 != 0) {
            if (i3 == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar2 = this.this$0;
        ru.yandex.taxi.layers.source.factory.c cVar = eVar2.c;
        List list = this.$response.g;
        Map map = eVar2.f;
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            fkp fkpVar = (fkp) it2.next();
            jmp b = fkpVar.getB();
            if (((b == null || (e2 = b.getE()) == null) ? str : e2.getH()) != null) {
                Boolean bool = (Boolean) map.get(fkpVar.getB().getE().getE());
                if (bool != null) {
                    eVar = eVar2;
                    i2 = bool.booleanValue();
                } else {
                    rl6 e3 = fkpVar.getB().getE();
                    wnt wntVar = eVar2.a;
                    cne0 cne0Var = eVar2.e;
                    String Hg = ((ru.yandex.taxi.startup.launch.h) eVar2.d).Hg();
                    if (Hg == null || (e = e3.getE()) == null) {
                        eVar = eVar2;
                        i2 = i4;
                    } else {
                        Integer h = e3.getH();
                        if (h != null) {
                            int intValue = h.intValue();
                            String l = cne0Var.l("bubbles_per_user_key", str);
                            if (l != null) {
                                try {
                                    try {
                                        eVar = eVar2;
                                    } catch (Throwable unused) {
                                        eVar = eVar2;
                                    }
                                    try {
                                        y9s0Var = (y9s0) ((xnt) wntVar).c(l, y9s0.Companion.serializer());
                                    } catch (Throwable unused2) {
                                        y9s0Var = new y9s0(new LinkedHashMap());
                                    }
                                } catch (CancellationException e4) {
                                    throw e4;
                                }
                            } else {
                                eVar = eVar2;
                            }
                            y9s0Var = new y9s0(new LinkedHashMap());
                            Map map2 = (Map) y9s0Var.getA().get(Hg);
                            if (map2 == null) {
                                map2 = new LinkedHashMap();
                            }
                            Integer num = (Integer) map2.get(e);
                            int intValue2 = num != null ? num.intValue() : 1;
                            it = it2;
                            map.put(e, Boolean.valueOf(intValue2 < intValue));
                            if (intValue2 >= intValue) {
                                i = 0;
                                if (i == 0) {
                                    fkpVar = fkp.a(fkpVar, jmp.a(fkpVar.getB()));
                                }
                            } else {
                                map2.put(e, Integer.valueOf(intValue2 + 1));
                                y9s0Var.getA().put(Hg, map2);
                                cne0Var.r("bubbles_per_user_key", ((xnt) wntVar).e(y9s0Var, y9s0.Companion.serializer()));
                            }
                        } else {
                            eVar = eVar2;
                            it = it2;
                        }
                        i = 1;
                        if (i == 0) {
                        }
                    }
                }
                it = it2;
                i = i2;
                if (i == 0) {
                }
            } else {
                eVar = eVar2;
                it = it2;
            }
            arrayList.add(fkpVar);
            it2 = it;
            eVar2 = eVar;
            str = null;
            i4 = 1;
        }
        this.label = i4;
        Object c = cVar.c(arrayList, this);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
