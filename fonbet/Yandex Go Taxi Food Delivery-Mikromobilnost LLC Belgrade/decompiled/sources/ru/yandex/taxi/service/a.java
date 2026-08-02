package ru.yandex.taxi.service;

import com.yandex.go.shortcuts.dto.response.PromoMode;
import defpackage.gof0;
import defpackage.h1p;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.sdn;
import defpackage.szv0;
import defpackage.t1p;
import defpackage.tdn;
import defpackage.u1p;
import defpackage.ul51;
import defpackage.w6w0;
import defpackage.x6w0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.experiments.superapp.j;

/* loaded from: classes10.dex */
public final class a {
    public final w6w0 a;
    public final j b;
    public final u1p c;
    public final gof0 d;
    public final tdn e;

    public a(w6w0 w6w0Var, j jVar, u1p u1pVar, gof0 gof0Var, tdn tdnVar) {
        this.a = w6w0Var;
        this.b = jVar;
        this.c = u1pVar;
        this.d = gof0Var;
        this.e = tdnVar;
    }

    public static x6w0 a(LinkedHashMap linkedHashMap, h1p h1pVar) {
        Map.Entry entry;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                entry = null;
                break;
            }
            entry = (Map.Entry) it.next();
            if (!jl40.l(entry.getKey(), h1pVar) && !jl40.l(((h1p) entry.getKey()).getValue(), h1pVar.getValue())) {
                entry = null;
            }
            if (entry != null) {
                break;
            }
        }
        if (entry != null) {
            return (x6w0) entry.getValue();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(h1p h1pVar, ContinuationImpl continuationImpl) {
        SuperAppServiceModelRepositoryImpl$getServiceModel$1 superAppServiceModelRepositoryImpl$getServiceModel$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        h1p h1pVar2;
        w6w0 w6w0Var;
        Object b;
        w6w0 w6w0Var2;
        szv0 szv0Var;
        Object a;
        szv0 szv0Var2;
        t1p t1pVar;
        h1p h1pVar3;
        w6w0 w6w0Var3;
        PromoMode promoMode;
        if (continuationImpl instanceof SuperAppServiceModelRepositoryImpl$getServiceModel$1) {
            superAppServiceModelRepositoryImpl$getServiceModel$1 = (SuperAppServiceModelRepositoryImpl$getServiceModel$1) continuationImpl;
            int i2 = superAppServiceModelRepositoryImpl$getServiceModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppServiceModelRepositoryImpl$getServiceModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppServiceModelRepositoryImpl$getServiceModel$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppServiceModelRepositoryImpl$getServiceModel$1.label;
                if (i != 0) {
                    b.b(obj);
                    superAppServiceModelRepositoryImpl$getServiceModel$1.L$0 = h1pVar;
                    w6w0 w6w0Var4 = this.a;
                    superAppServiceModelRepositoryImpl$getServiceModel$1.L$1 = w6w0Var4;
                    superAppServiceModelRepositoryImpl$getServiceModel$1.label = 1;
                    j jVar = this.b;
                    ((ul51) jVar.a).getClass();
                    Object b2 = jVar.b.b(superAppServiceModelRepositoryImpl$getServiceModel$1);
                    if (b2 != coroutineSingletons) {
                        h1pVar2 = h1pVar;
                        w6w0Var = w6w0Var4;
                        obj = b2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        promoMode = (PromoMode) superAppServiceModelRepositoryImpl$getServiceModel$1.L$4;
                        t1pVar = (t1p) superAppServiceModelRepositoryImpl$getServiceModel$1.L$3;
                        szv0Var2 = (szv0) superAppServiceModelRepositoryImpl$getServiceModel$1.L$2;
                        w6w0Var3 = (w6w0) superAppServiceModelRepositoryImpl$getServiceModel$1.L$1;
                        h1pVar3 = (h1p) superAppServiceModelRepositoryImpl$getServiceModel$1.L$0;
                        b.b(obj);
                        return a(w6w0Var3.a(szv0Var2, t1pVar, promoMode, (sdn) obj), h1pVar3);
                    }
                    szv0Var = (szv0) superAppServiceModelRepositoryImpl$getServiceModel$1.L$2;
                    w6w0 w6w0Var5 = (w6w0) superAppServiceModelRepositoryImpl$getServiceModel$1.L$1;
                    h1p h1pVar4 = (h1p) superAppServiceModelRepositoryImpl$getServiceModel$1.L$0;
                    b.b(obj);
                    w6w0Var2 = w6w0Var5;
                    h1pVar2 = h1pVar4;
                    t1p t1pVar2 = (t1p) obj;
                    PromoMode a2 = this.d.a();
                    superAppServiceModelRepositoryImpl$getServiceModel$1.L$0 = h1pVar2;
                    superAppServiceModelRepositoryImpl$getServiceModel$1.L$1 = w6w0Var2;
                    superAppServiceModelRepositoryImpl$getServiceModel$1.L$2 = szv0Var;
                    superAppServiceModelRepositoryImpl$getServiceModel$1.L$3 = t1pVar2;
                    superAppServiceModelRepositoryImpl$getServiceModel$1.L$4 = a2;
                    superAppServiceModelRepositoryImpl$getServiceModel$1.label = 3;
                    a = this.e.a(superAppServiceModelRepositoryImpl$getServiceModel$1);
                    if (a != coroutineSingletons) {
                        szv0Var2 = szv0Var;
                        t1pVar = t1pVar2;
                        h1pVar3 = h1pVar2;
                        w6w0Var3 = w6w0Var2;
                        obj = a;
                        promoMode = a2;
                        return a(w6w0Var3.a(szv0Var2, t1pVar, promoMode, (sdn) obj), h1pVar3);
                    }
                    return coroutineSingletons;
                }
                w6w0Var = (w6w0) superAppServiceModelRepositoryImpl$getServiceModel$1.L$1;
                h1pVar2 = (h1p) superAppServiceModelRepositoryImpl$getServiceModel$1.L$0;
                b.b(obj);
                szv0 szv0Var3 = (szv0) obj;
                superAppServiceModelRepositoryImpl$getServiceModel$1.L$0 = h1pVar2;
                superAppServiceModelRepositoryImpl$getServiceModel$1.L$1 = w6w0Var;
                superAppServiceModelRepositoryImpl$getServiceModel$1.L$2 = szv0Var3;
                superAppServiceModelRepositoryImpl$getServiceModel$1.label = 2;
                b = this.c.a.b(superAppServiceModelRepositoryImpl$getServiceModel$1);
                if (b != coroutineSingletons) {
                    w6w0Var2 = w6w0Var;
                    szv0Var = szv0Var3;
                    obj = b;
                    t1p t1pVar22 = (t1p) obj;
                    PromoMode a22 = this.d.a();
                    superAppServiceModelRepositoryImpl$getServiceModel$1.L$0 = h1pVar2;
                    superAppServiceModelRepositoryImpl$getServiceModel$1.L$1 = w6w0Var2;
                    superAppServiceModelRepositoryImpl$getServiceModel$1.L$2 = szv0Var;
                    superAppServiceModelRepositoryImpl$getServiceModel$1.L$3 = t1pVar22;
                    superAppServiceModelRepositoryImpl$getServiceModel$1.L$4 = a22;
                    superAppServiceModelRepositoryImpl$getServiceModel$1.label = 3;
                    a = this.e.a(superAppServiceModelRepositoryImpl$getServiceModel$1);
                    if (a != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        superAppServiceModelRepositoryImpl$getServiceModel$1 = new SuperAppServiceModelRepositoryImpl$getServiceModel$1(this, continuationImpl);
        Object obj2 = superAppServiceModelRepositoryImpl$getServiceModel$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppServiceModelRepositoryImpl$getServiceModel$1.label;
        if (i != 0) {
        }
        szv0 szv0Var32 = (szv0) obj2;
        superAppServiceModelRepositoryImpl$getServiceModel$1.L$0 = h1pVar2;
        superAppServiceModelRepositoryImpl$getServiceModel$1.L$1 = w6w0Var;
        superAppServiceModelRepositoryImpl$getServiceModel$1.L$2 = szv0Var32;
        superAppServiceModelRepositoryImpl$getServiceModel$1.label = 2;
        b = this.c.a.b(superAppServiceModelRepositoryImpl$getServiceModel$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
