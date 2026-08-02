package ru.yandex.taxi.persuggest.clarifypoints;

import defpackage.bvf0;
import defpackage.dzb;
import defpackage.gyb;
import defpackage.gzb;
import defpackage.ipv0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.sta0;
import defpackage.u1l;
import defpackage.v03;
import defpackage.vyb;
import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class a {
    public final ru.yandex.taxi.persuggest.api.a a;
    public final sta0 b;
    public final ru.yandex.taxi.persuggest.source.a c;
    public volatile dzb e;
    public final r0 d = bvf0.c(vyb.b);
    public final ipv0 f = new ipv0();

    public a(ru.yandex.taxi.persuggest.api.a aVar, sta0 sta0Var, ru.yandex.taxi.persuggest.source.a aVar2) {
        this.a = aVar;
        this.b = sta0Var;
        this.c = aVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0054, code lost:
    
        if (r15 == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ClarifyPointsRepositoryImpl$requestClarifyPointsIfNeed$1 clarifyPointsRepositoryImpl$requestClarifyPointsIfNeed$1;
        int i;
        dzb dzbVar;
        dzb dzbVar2;
        if (continuationImpl instanceof ClarifyPointsRepositoryImpl$requestClarifyPointsIfNeed$1) {
            clarifyPointsRepositoryImpl$requestClarifyPointsIfNeed$1 = (ClarifyPointsRepositoryImpl$requestClarifyPointsIfNeed$1) continuationImpl;
            int i2 = clarifyPointsRepositoryImpl$requestClarifyPointsIfNeed$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                clarifyPointsRepositoryImpl$requestClarifyPointsIfNeed$1.label = i2 - Integer.MIN_VALUE;
                ClarifyPointsRepositoryImpl$requestClarifyPointsIfNeed$1 clarifyPointsRepositoryImpl$requestClarifyPointsIfNeed$12 = clarifyPointsRepositoryImpl$requestClarifyPointsIfNeed$1;
                Object obj = clarifyPointsRepositoryImpl$requestClarifyPointsIfNeed$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = clarifyPointsRepositoryImpl$requestClarifyPointsIfNeed$12.label;
                if (i != 0) {
                    b.b(obj);
                    ru.yandex.taxi.persuggest.source.a aVar = this.c;
                    clarifyPointsRepositoryImpl$requestClarifyPointsIfNeed$12.label = 1;
                    obj = ru.yandex.taxi.persuggest.source.a.b(aVar, null, null, null, null, null, null, null, false, clarifyPointsRepositoryImpl$requestClarifyPointsIfNeed$12, 255);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dzbVar2 = (dzb) clarifyPointsRepositoryImpl$requestClarifyPointsIfNeed$12.L$1;
                        b.b(obj);
                        r0 r0Var = this.d;
                        List list = ((gzb) obj).a;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (((gyb) obj2).e.length() > 0) {
                                arrayList.add(obj2);
                            }
                        }
                        vyb vybVar = new vyb(new u1l(2, arrayList));
                        r0Var.getClass();
                        r0Var.m(null, vybVar);
                        this.e = dzbVar2;
                        return this.d.getValue();
                    }
                    b.b(obj);
                }
                dzbVar = new dzb((v03) obj, this.f);
                if (!jl40.l(this.e, dzbVar)) {
                    return this.d.getValue();
                }
                ru.yandex.taxi.persuggest.api.a aVar2 = this.a;
                String a = this.b.a();
                clarifyPointsRepositoryImpl$requestClarifyPointsIfNeed$12.L$0 = null;
                clarifyPointsRepositoryImpl$requestClarifyPointsIfNeed$12.L$1 = dzbVar;
                clarifyPointsRepositoryImpl$requestClarifyPointsIfNeed$12.label = 2;
                obj = aVar2.a(a, dzbVar, clarifyPointsRepositoryImpl$requestClarifyPointsIfNeed$12);
                if (obj != coroutineSingletons) {
                    dzbVar2 = dzbVar;
                    r0 r0Var2 = this.d;
                    List list2 = ((gzb) obj).a;
                    ArrayList arrayList2 = new ArrayList();
                    while (r15.hasNext()) {
                    }
                    vyb vybVar2 = new vyb(new u1l(2, arrayList2));
                    r0Var2.getClass();
                    r0Var2.m(null, vybVar2);
                    this.e = dzbVar2;
                    return this.d.getValue();
                }
                return coroutineSingletons;
            }
        }
        clarifyPointsRepositoryImpl$requestClarifyPointsIfNeed$1 = new ClarifyPointsRepositoryImpl$requestClarifyPointsIfNeed$1(this, continuationImpl);
        ClarifyPointsRepositoryImpl$requestClarifyPointsIfNeed$1 clarifyPointsRepositoryImpl$requestClarifyPointsIfNeed$122 = clarifyPointsRepositoryImpl$requestClarifyPointsIfNeed$1;
        Object obj3 = clarifyPointsRepositoryImpl$requestClarifyPointsIfNeed$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = clarifyPointsRepositoryImpl$requestClarifyPointsIfNeed$122.label;
        if (i != 0) {
        }
        dzbVar = new dzb((v03) obj3, this.f);
        if (!jl40.l(this.e, dzbVar)) {
        }
    }
}
