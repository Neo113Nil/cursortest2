package ru.yandex.taxi.analytics;

import defpackage.adz;
import defpackage.g8y;
import defpackage.h941;
import defpackage.k0b0;
import defpackage.m0t;
import defpackage.ny61;
import defpackage.pcz;
import defpackage.rqo;
import defpackage.tje;
import defpackage.tse;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.persuggest.domain.model.CoordinateProvider$Source;

/* loaded from: classes9.dex */
public final class n {
    public final k0b0 a;
    public final h941 b;
    public final adz c;
    public final rqo d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f;
    public final AtomicBoolean g;
    public final AtomicBoolean h;
    public final AtomicBoolean i;
    public final AtomicBoolean j;
    public final ConcurrentHashMap.KeySetView k;
    public final AtomicBoolean l;
    public final AtomicBoolean m;
    public final AtomicBoolean n;
    public final AtomicBoolean o;

    public n(tse tseVar, k0b0 k0b0Var, h941 h941Var, adz adzVar, rqo rqoVar) {
        this.a = k0b0Var;
        this.b = h941Var;
        this.c = adzVar;
        this.d = rqoVar;
        tje.N(tseVar, null, null, new GeoProvidersAnalyticStateRepositoryImpl$1(this, null), 3);
        this.f = new AtomicBoolean(false);
        this.g = new AtomicBoolean(false);
        this.h = new AtomicBoolean(false);
        this.i = new AtomicBoolean(false);
        this.j = new AtomicBoolean(false);
        this.k = ConcurrentHashMap.newKeySet();
        this.l = new AtomicBoolean(false);
        this.m = new AtomicBoolean(false);
        this.n = new AtomicBoolean(false);
        this.o = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        GeoProvidersAnalyticStateRepositoryImpl$getGeoProvidersState$1 geoProvidersAnalyticStateRepositoryImpl$getGeoProvidersState$1;
        int i;
        g8y g8yVar;
        if (continuationImpl instanceof GeoProvidersAnalyticStateRepositoryImpl$getGeoProvidersState$1) {
            geoProvidersAnalyticStateRepositoryImpl$getGeoProvidersState$1 = (GeoProvidersAnalyticStateRepositoryImpl$getGeoProvidersState$1) continuationImpl;
            int i2 = geoProvidersAnalyticStateRepositoryImpl$getGeoProvidersState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoProvidersAnalyticStateRepositoryImpl$getGeoProvidersState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = geoProvidersAnalyticStateRepositoryImpl$getGeoProvidersState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoProvidersAnalyticStateRepositoryImpl$getGeoProvidersState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ConcurrentHashMap.KeySetView keySetView = this.k;
                    ConcurrentHashMap.KeySetView keySetView2 = keySetView.isEmpty() ? null : keySetView;
                    g8y g8yVar2 = new g8y(this.g.get(), this.h.get(), this.i.get(), this.j.get(), String.valueOf(keySetView2 != null ? a.X(keySetView2, null, null, null, null, 63) : null), this.l.get(), this.b.a.get(CoordinateProvider$Source.LBS) != null);
                    geoProvidersAnalyticStateRepositoryImpl$getGeoProvidersState$1.L$0 = g8yVar2;
                    geoProvidersAnalyticStateRepositoryImpl$getGeoProvidersState$1.label = 1;
                    obj = b(geoProvidersAnalyticStateRepositoryImpl$getGeoProvidersState$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                    g8yVar = g8yVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g8y g8yVar3 = (g8y) geoProvidersAnalyticStateRepositoryImpl$getGeoProvidersState$1.L$0;
                    kotlin.b.b(obj);
                    g8yVar = g8yVar3;
                }
                pcz pczVar = (pcz) obj;
                k0b0 k0b0Var = this.a;
                return new m0t(g8yVar, pczVar, k0b0Var.a(), k0b0Var.g(), this.f.get(), this.e.get());
            }
        }
        geoProvidersAnalyticStateRepositoryImpl$getGeoProvidersState$1 = new GeoProvidersAnalyticStateRepositoryImpl$getGeoProvidersState$1(this, continuationImpl);
        Object obj3 = geoProvidersAnalyticStateRepositoryImpl$getGeoProvidersState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoProvidersAnalyticStateRepositoryImpl$getGeoProvidersState$1.label;
        if (i != 0) {
        }
        pcz pczVar2 = (pcz) obj3;
        k0b0 k0b0Var2 = this.a;
        return new m0t(g8yVar, pczVar2, k0b0Var2.a(), k0b0Var2.g(), this.f.get(), this.e.get());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        GeoProvidersAnalyticStateRepositoryImpl$getLocationSdkState$1 geoProvidersAnalyticStateRepositoryImpl$getLocationSdkState$1;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        if (continuationImpl instanceof GeoProvidersAnalyticStateRepositoryImpl$getLocationSdkState$1) {
            geoProvidersAnalyticStateRepositoryImpl$getLocationSdkState$1 = (GeoProvidersAnalyticStateRepositoryImpl$getLocationSdkState$1) continuationImpl;
            int i2 = geoProvidersAnalyticStateRepositoryImpl$getLocationSdkState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoProvidersAnalyticStateRepositoryImpl$getLocationSdkState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = geoProvidersAnalyticStateRepositoryImpl$getLocationSdkState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoProvidersAnalyticStateRepositoryImpl$getLocationSdkState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean z4 = this.m.get();
                    boolean z5 = this.n.get();
                    boolean z6 = this.o.get();
                    geoProvidersAnalyticStateRepositoryImpl$getLocationSdkState$1.Z$0 = z4;
                    geoProvidersAnalyticStateRepositoryImpl$getLocationSdkState$1.Z$1 = z5;
                    geoProvidersAnalyticStateRepositoryImpl$getLocationSdkState$1.Z$2 = z6;
                    geoProvidersAnalyticStateRepositoryImpl$getLocationSdkState$1.label = 1;
                    Object d = ((com.yandex.go.g) this.c).d(geoProvidersAnalyticStateRepositoryImpl$getLocationSdkState$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z = z4;
                    z2 = z5;
                    obj = d;
                    z3 = z6;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z3 = geoProvidersAnalyticStateRepositoryImpl$getLocationSdkState$1.Z$2;
                    z2 = geoProvidersAnalyticStateRepositoryImpl$getLocationSdkState$1.Z$1;
                    z = geoProvidersAnalyticStateRepositoryImpl$getLocationSdkState$1.Z$0;
                    kotlin.b.b(obj);
                }
                return new pcz(z, z2, z3, obj != null);
            }
        }
        geoProvidersAnalyticStateRepositoryImpl$getLocationSdkState$1 = new GeoProvidersAnalyticStateRepositoryImpl$getLocationSdkState$1(this, continuationImpl);
        Object obj2 = geoProvidersAnalyticStateRepositoryImpl$getLocationSdkState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoProvidersAnalyticStateRepositoryImpl$getLocationSdkState$1.label;
        if (i != 0) {
        }
        return new pcz(z, z2, z3, obj2 != null);
    }
}
