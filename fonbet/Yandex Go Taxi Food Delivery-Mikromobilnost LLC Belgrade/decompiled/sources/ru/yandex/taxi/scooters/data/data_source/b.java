package ru.yandex.taxi.scooters.data.data_source;

import defpackage.cmt;
import defpackage.eci0;
import defpackage.h3y;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wsr0;
import defpackage.xsr0;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.scooters.data.ScootersSessionsCurrentApi;

/* loaded from: classes9.dex */
public final class b {
    public final ru.yandex.taxi.launch.c a;
    public final ru.yandex.taxi.scooters.data.a b;
    public final h3y c;
    public final eci0 d;

    public b(tt2 tt2Var, tse tseVar, ru.yandex.taxi.launch.c cVar, ru.yandex.taxi.scooters.data.a aVar, h3y h3yVar) {
        this.a = cVar;
        this.b = aVar;
        this.c = h3yVar;
        rol0 rol0Var = new rol0(new ScootersSessionsCurrentDataSource$currentSessionResponseFlow$1(this, null));
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.d = e.O(new o(e.F(rol0Var, mdh.b), new ScootersSessionsCurrentDataSource$currentSessionResponseFlow$2(3, null)), tseVar, wsr0.a(xsr0.a, 3), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, ContinuationImpl continuationImpl) {
        ScootersSessionsCurrentDataSource$requestCurrentSessionResponse$1 scootersSessionsCurrentDataSource$requestCurrentSessionResponse$1;
        int i;
        ScootersSessionsCurrentApi scootersSessionsCurrentApi;
        cmt b;
        bVar.getClass();
        if (continuationImpl instanceof ScootersSessionsCurrentDataSource$requestCurrentSessionResponse$1) {
            scootersSessionsCurrentDataSource$requestCurrentSessionResponse$1 = (ScootersSessionsCurrentDataSource$requestCurrentSessionResponse$1) continuationImpl;
            int i2 = scootersSessionsCurrentDataSource$requestCurrentSessionResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSessionsCurrentDataSource$requestCurrentSessionResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSessionsCurrentDataSource$requestCurrentSessionResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSessionsCurrentDataSource$requestCurrentSessionResponse$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ScootersSessionsCurrentApi scootersSessionsCurrentApi2 = (ScootersSessionsCurrentApi) bVar.c.get();
                    ru.yandex.taxi.scooters.data.a aVar = bVar.b;
                    scootersSessionsCurrentDataSource$requestCurrentSessionResponse$1.L$0 = scootersSessionsCurrentApi2;
                    scootersSessionsCurrentDataSource$requestCurrentSessionResponse$1.label = 1;
                    Object a = aVar.a(true, scootersSessionsCurrentDataSource$requestCurrentSessionResponse$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        scootersSessionsCurrentApi = scootersSessionsCurrentApi2;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return obj;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                scootersSessionsCurrentApi = (ScootersSessionsCurrentApi) scootersSessionsCurrentDataSource$requestCurrentSessionResponse$1.L$0;
                kotlin.b.b(obj);
                b = scootersSessionsCurrentApi.b((Map) obj, true, 1);
                scootersSessionsCurrentDataSource$requestCurrentSessionResponse$1.L$0 = null;
                scootersSessionsCurrentDataSource$requestCurrentSessionResponse$1.label = 2;
                Object a2 = ru.yandex.taxi.network.api.a.a(b, null, scootersSessionsCurrentDataSource$requestCurrentSessionResponse$1);
                return a2 != coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        scootersSessionsCurrentDataSource$requestCurrentSessionResponse$1 = new ScootersSessionsCurrentDataSource$requestCurrentSessionResponse$1(bVar, continuationImpl);
        Object obj2 = scootersSessionsCurrentDataSource$requestCurrentSessionResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSessionsCurrentDataSource$requestCurrentSessionResponse$1.label;
        if (i != 0) {
        }
        b = scootersSessionsCurrentApi.b((Map) obj2, true, 1);
        scootersSessionsCurrentDataSource$requestCurrentSessionResponse$1.L$0 = null;
        scootersSessionsCurrentDataSource$requestCurrentSessionResponse$1.label = 2;
        Object a22 = ru.yandex.taxi.network.api.a.a(b, null, scootersSessionsCurrentDataSource$requestCurrentSessionResponse$1);
        if (a22 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ScootersSessionsCurrentDataSource$obtainSessionsCurrent$1 scootersSessionsCurrentDataSource$obtainSessionsCurrent$1;
        int i;
        if (continuationImpl instanceof ScootersSessionsCurrentDataSource$obtainSessionsCurrent$1) {
            scootersSessionsCurrentDataSource$obtainSessionsCurrent$1 = (ScootersSessionsCurrentDataSource$obtainSessionsCurrent$1) continuationImpl;
            int i2 = scootersSessionsCurrentDataSource$obtainSessionsCurrent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSessionsCurrentDataSource$obtainSessionsCurrent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSessionsCurrentDataSource$obtainSessionsCurrent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSessionsCurrentDataSource$obtainSessionsCurrent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersSessionsCurrentDataSource$obtainSessionsCurrent$1.label = 1;
                    obj = e.y(this.d, scootersSessionsCurrentDataSource$obtainSessionsCurrent$1);
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
                Object value = ((Result) obj).getValue();
                kotlin.b.b(value);
                return value;
            }
        }
        scootersSessionsCurrentDataSource$obtainSessionsCurrent$1 = new ScootersSessionsCurrentDataSource$obtainSessionsCurrent$1(this, continuationImpl);
        Object obj2 = scootersSessionsCurrentDataSource$obtainSessionsCurrent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSessionsCurrentDataSource$obtainSessionsCurrent$1.label;
        if (i != 0) {
        }
        Object value2 = ((Result) obj2).getValue();
        kotlin.b.b(value2);
        return value2;
    }
}
