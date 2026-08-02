package ru.yandex.taxi.polling;

import androidx.lifecycle.Lifecycle;
import defpackage.c9z;
import defpackage.g9z;
import defpackage.jl40;
import defpackage.jy60;
import defpackage.k0b0;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.q0t;
import defpackage.q6r;
import defpackage.sta0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.u6r;
import defpackage.v03;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;

/* loaded from: classes9.dex */
public final class d implements jy60 {
    public final ru.yandex.taxi.persuggest.api.a a;
    public final ru.yandex.taxi.persuggest.source.a b;
    public final sta0 c;
    public final c d;
    public final e e;
    public final k0b0 f;
    public final g9z g;
    public final Lifecycle h;
    public final tse i;
    public pzt0 j;

    public d(ru.yandex.taxi.persuggest.api.a aVar, ru.yandex.taxi.persuggest.source.a aVar2, sta0 sta0Var, c cVar, e eVar, k0b0 k0b0Var, g9z g9zVar, Lifecycle lifecycle, tse tseVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = sta0Var;
        this.d = cVar;
        this.e = eVar;
        this.f = k0b0Var;
        this.g = g9zVar;
        this.h = lifecycle;
        this.i = tseVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(8:11|12|13|14|(1:16)|17|(1:19)|20)(2:23|24))(1:25))(1:34)|26|(2:28|29)(2:30|31)))|40|6|7|(0)(0)|26|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
    
        if (r1 == r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0098, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0050, code lost:
    
        if (r1 == r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x003b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
    
        r1 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(d dVar, ContinuationImpl continuationImpl) {
        LocationInfoPollingRequestStarter$sendRequest$1 locationInfoPollingRequestStarter$sendRequest$1;
        int i;
        v03 v03Var;
        g9z g9zVar = dVar.g;
        if (continuationImpl instanceof LocationInfoPollingRequestStarter$sendRequest$1) {
            locationInfoPollingRequestStarter$sendRequest$1 = (LocationInfoPollingRequestStarter$sendRequest$1) continuationImpl;
            int i2 = locationInfoPollingRequestStarter$sendRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationInfoPollingRequestStarter$sendRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationInfoPollingRequestStarter$sendRequest$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationInfoPollingRequestStarter$sendRequest$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    locationInfoPollingRequestStarter$sendRequest$1.label = 1;
                    obj = dVar.j(locationInfoPollingRequestStarter$sendRequest$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        Object failure = (u6r) obj;
                        Throwable a = Result.a(failure);
                        if (a != null) {
                            g9zVar.getClass();
                            g9z.a(a, "error when do request");
                        }
                        if (!(failure instanceof Result.Failure)) {
                            g9zVar.getClass();
                        }
                        return zy11Var;
                    }
                    kotlin.b.b(obj);
                }
                v03Var = (v03) obj;
                if (!jl40.l(v03Var.t, Boolean.FALSE)) {
                    g9zVar.getClass();
                    return zy11Var;
                }
                q6r q6rVar = new q6r(Action.COORD_PROVIDERS_POLL, zzs.f, null, null, null, v03Var, null, null, false, "", null, false, null);
                ru.yandex.taxi.persuggest.api.a aVar = dVar.a;
                String a2 = dVar.c.a();
                q0t q0tVar = new q0t(0);
                locationInfoPollingRequestStarter$sendRequest$1.L$0 = null;
                locationInfoPollingRequestStarter$sendRequest$1.L$1 = null;
                locationInfoPollingRequestStarter$sendRequest$1.label = 2;
                obj = aVar.c(a2, q6rVar, q0tVar, locationInfoPollingRequestStarter$sendRequest$1);
            }
        }
        locationInfoPollingRequestStarter$sendRequest$1 = new LocationInfoPollingRequestStarter$sendRequest$1(dVar, continuationImpl);
        Object obj3 = locationInfoPollingRequestStarter$sendRequest$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationInfoPollingRequestStarter$sendRequest$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        v03Var = (v03) obj3;
        if (!jl40.l(v03Var.t, Boolean.FALSE)) {
        }
    }

    public static final void i(d dVar, tse tseVar, c9z c9zVar) {
        dVar.getClass();
        boolean b = c9zVar.b();
        g9z g9zVar = dVar.g;
        if (!b) {
            g9zVar.getClass();
        } else {
            g9zVar.getClass();
            tje.N(tseVar, null, null, new LocationInfoPollingRequestStarter$startSendingFinalSuggest$1(c9zVar, null, dVar), 3);
        }
    }

    @Override // defpackage.s150
    public final String getName() {
        return "LocationInfoPollingRequestStarter";
    }

    @Override // defpackage.jy60
    public final void h() {
        LocationInfoPollingRequestStarter$onFirstContentfulPaint$1 locationInfoPollingRequestStarter$onFirstContentfulPaint$1 = new LocationInfoPollingRequestStarter$onFirstContentfulPaint$1(this, null);
        tse tseVar = this.i;
        tje.N(tseVar, null, null, locationInfoPollingRequestStarter$onFirstContentfulPaint$1, 3);
        tje.N(tseVar, null, null, new LocationInfoPollingRequestStarter$onFirstContentfulPaint$2(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r15 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(ContinuationImpl continuationImpl) {
        LocationInfoPollingRequestStarter$createApplicationState$1 locationInfoPollingRequestStarter$createApplicationState$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object b;
        List list;
        if (continuationImpl instanceof LocationInfoPollingRequestStarter$createApplicationState$1) {
            locationInfoPollingRequestStarter$createApplicationState$1 = (LocationInfoPollingRequestStarter$createApplicationState$1) continuationImpl;
            int i2 = locationInfoPollingRequestStarter$createApplicationState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationInfoPollingRequestStarter$createApplicationState$1.label = i2 - Integer.MIN_VALUE;
                LocationInfoPollingRequestStarter$createApplicationState$1 locationInfoPollingRequestStarter$createApplicationState$12 = locationInfoPollingRequestStarter$createApplicationState$1;
                Object obj = locationInfoPollingRequestStarter$createApplicationState$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationInfoPollingRequestStarter$createApplicationState$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.g.getClass();
                    locationInfoPollingRequestStarter$createApplicationState$12.label = 1;
                    obj = this.e.e(locationInfoPollingRequestStarter$createApplicationState$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list = (List) locationInfoPollingRequestStarter$createApplicationState$12.L$0;
                        kotlin.b.b(obj);
                        return v03.a((v03) obj, list, null, 134217723);
                    }
                    kotlin.b.b(obj);
                }
                List J0 = kotlin.collections.a.J0(tcc.o(((Map) obj).values()));
                Action action = Action.COORD_PROVIDERS_POLL;
                locationInfoPollingRequestStarter$createApplicationState$12.L$0 = J0;
                locationInfoPollingRequestStarter$createApplicationState$12.label = 2;
                b = ru.yandex.taxi.persuggest.source.a.b(this.b, null, null, action, null, null, null, null, false, locationInfoPollingRequestStarter$createApplicationState$12, 251);
                if (b != coroutineSingletons) {
                    obj = b;
                    list = J0;
                    return v03.a((v03) obj, list, null, 134217723);
                }
                return coroutineSingletons;
            }
        }
        locationInfoPollingRequestStarter$createApplicationState$1 = new LocationInfoPollingRequestStarter$createApplicationState$1(this, continuationImpl);
        LocationInfoPollingRequestStarter$createApplicationState$1 locationInfoPollingRequestStarter$createApplicationState$122 = locationInfoPollingRequestStarter$createApplicationState$1;
        Object obj2 = locationInfoPollingRequestStarter$createApplicationState$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationInfoPollingRequestStarter$createApplicationState$122.label;
        if (i != 0) {
        }
        List J02 = kotlin.collections.a.J0(tcc.o(((Map) obj2).values()));
        Action action2 = Action.COORD_PROVIDERS_POLL;
        locationInfoPollingRequestStarter$createApplicationState$122.L$0 = J02;
        locationInfoPollingRequestStarter$createApplicationState$122.label = 2;
        b = ru.yandex.taxi.persuggest.source.a.b(this.b, null, null, action2, null, null, null, null, false, locationInfoPollingRequestStarter$createApplicationState$122, 251);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
