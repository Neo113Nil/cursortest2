package ru.yandex.taxi.utils;

import defpackage.a1t;
import defpackage.b03;
import defpackage.b64;
import defpackage.bvf0;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.ppr;
import defpackage.qmp;
import defpackage.qv10;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.ul51;
import defpackage.uyj;
import defpackage.wnt;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes10.dex */
public final class b {
    public final wnt a;
    public final tt2 b;
    public final qmp c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final cne0 m;
    public final i3y n = kotlin.a.a(new ppr(4, this));
    public final r0 o = bvf0.c(null);
    public final r0 p = bvf0.c(null);
    public boolean q = e();

    public b(dne0 dne0Var, wnt wntVar, tt2 tt2Var, qmp qmpVar, b03 b03Var) {
        this.a = wntVar;
        this.b = tt2Var;
        this.c = qmpVar;
        this.m = dne0Var.a("ru.yandex.taxi.utils.GeoSharingConfigStore");
        String applicationId = b03Var.getApplicationId();
        this.d = b64.j(applicationId, ".GeoSharingConfigStore.GPS_TRACKING_CONFIG");
        this.e = b64.j(applicationId, ".GeoSharingConfigStore.SHOWN_COUNT");
        this.f = b64.j(applicationId, ".GeoSharingConfigStore.SHARING_PREFS_CLEAR_TAG");
        this.g = b64.j(applicationId, ".GeoSharingConfigStore.SHARING_ACTIVATED_BY_USER");
        this.h = b64.j(applicationId, ".GeoSharingConfigStore.SHARING_ACTIVATED_BY_USER_IN_ORDER");
        this.i = b64.j(applicationId, ".GeoSharingConfigStore.GEO_SHARING_SWITCH_STATUS_KEY");
        this.j = b64.j(applicationId, ".GeoSharingConfigStore.LAST_ORDER_ID");
        this.k = b64.j(applicationId, ".GeoSharingConfigStore.LAST_ORDER_ENABLE_FORCED_LIVE_ID");
        this.l = b64.j(applicationId, ".GeoSharingConfigStore.ENABLE_FORCED_LIVE_ID");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        GeoSharingConfigStore$disableDuringSharing$1 geoSharingConfigStore$disableDuringSharing$1;
        int i;
        if (continuationImpl instanceof GeoSharingConfigStore$disableDuringSharing$1) {
            geoSharingConfigStore$disableDuringSharing$1 = (GeoSharingConfigStore$disableDuringSharing$1) continuationImpl;
            int i2 = geoSharingConfigStore$disableDuringSharing$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoSharingConfigStore$disableDuringSharing$1.label = i2 - Integer.MIN_VALUE;
                Object obj = geoSharingConfigStore$disableDuringSharing$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoSharingConfigStore$disableDuringSharing$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    geoSharingConfigStore$disableDuringSharing$1.label = 1;
                    obj = b(geoSharingConfigStore$disableDuringSharing$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                a1t a1tVar = (a1t) obj;
                a1t.Companion.getClass();
                a1t a1tVar2 = a1t.f;
                a1tVar.getClass();
                a1tVar.a = a1tVar2.a;
                a1tVar.b = a1tVar2.b;
                a1tVar.c = a1tVar2.c;
                a1tVar.d = a1tVar2.d;
                a1tVar.e = a1tVar2.e;
                Boolean bool = Boolean.TRUE;
                r0 r0Var = this.p;
                r0Var.getClass();
                r0Var.m(null, bool);
                return zy11.a;
            }
        }
        geoSharingConfigStore$disableDuringSharing$1 = new GeoSharingConfigStore$disableDuringSharing$1(this, continuationImpl);
        Object obj3 = geoSharingConfigStore$disableDuringSharing$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoSharingConfigStore$disableDuringSharing$1.label;
        if (i != 0) {
        }
        a1t a1tVar3 = (a1t) obj3;
        a1t.Companion.getClass();
        a1t a1tVar22 = a1t.f;
        a1tVar3.getClass();
        a1tVar3.a = a1tVar22.a;
        a1tVar3.b = a1tVar22.b;
        a1tVar3.c = a1tVar22.c;
        a1tVar3.d = a1tVar22.d;
        a1tVar3.e = a1tVar22.e;
        Boolean bool2 = Boolean.TRUE;
        r0 r0Var2 = this.p;
        r0Var2.getClass();
        r0Var2.m(null, bool2);
        return zy11.a;
    }

    public final Object b(ContinuationImpl continuationImpl) {
        ((ul51) this.c).getClass();
        i3y i3yVar = this.n;
        if (i3yVar.isInitialized()) {
            return (a1t) i3yVar.getValue();
        }
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new GeoSharingConfigStore$geoSharingConfig$2(this, null), continuationImpl);
    }

    public final a1t c() {
        ((ul51) this.c).getClass();
        return (a1t) this.n.getValue();
    }

    public final String d() {
        String l = this.m.l(this.k, null);
        return l == null ? "" : l;
    }

    public final boolean e() {
        return this.m.f(this.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        if (r10 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(a1t a1tVar, ContinuationImpl continuationImpl) {
        GeoSharingConfigStore$updateConfig$1 geoSharingConfigStore$updateConfig$1;
        Object obj;
        int i;
        a1t a1tVar2;
        Object k0;
        if (continuationImpl instanceof GeoSharingConfigStore$updateConfig$1) {
            geoSharingConfigStore$updateConfig$1 = (GeoSharingConfigStore$updateConfig$1) continuationImpl;
            int i2 = geoSharingConfigStore$updateConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoSharingConfigStore$updateConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = geoSharingConfigStore$updateConfig$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoSharingConfigStore$updateConfig$1.label;
                Object obj3 = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ((ul51) this.c).getClass();
                    geoSharingConfigStore$updateConfig$1.L$0 = a1tVar;
                    geoSharingConfigStore$updateConfig$1.label = 1;
                    obj2 = b(geoSharingConfigStore$updateConfig$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        a1tVar = (a1t) geoSharingConfigStore$updateConfig$1.L$0;
                        kotlin.b.b(obj2);
                        qv10.B(a1tVar.a, this.o, null);
                        return obj3;
                    }
                    a1tVar = (a1t) geoSharingConfigStore$updateConfig$1.L$0;
                    kotlin.b.b(obj2);
                }
                a1tVar2 = (a1t) obj2;
                if (!jl40.l(a1tVar2.e.c, a1tVar.e.c)) {
                    String str = a1tVar.e.c;
                    cne0 cne0Var = this.m;
                    cne0Var.r(this.f, str);
                    cne0Var.p(0, this.e);
                }
                a1tVar2.a = a1tVar.a;
                a1tVar2.b = a1tVar.b;
                a1tVar2.c = a1tVar.c;
                a1tVar2.d = a1tVar.d;
                a1tVar2.e = a1tVar.e;
                geoSharingConfigStore$updateConfig$1.L$0 = a1tVar;
                geoSharingConfigStore$updateConfig$1.L$1 = null;
                geoSharingConfigStore$updateConfig$1.label = 2;
                this.b.getClass();
                sjh sjhVar = uyj.a;
                k0 = tje.k0(mdh.b, new GeoSharingConfigStore$saveSharingConfig$2(this, a1tVar2, null), geoSharingConfigStore$updateConfig$1);
                if (k0 != obj) {
                    k0 = obj3;
                }
            }
        }
        geoSharingConfigStore$updateConfig$1 = new GeoSharingConfigStore$updateConfig$1(this, continuationImpl);
        Object obj22 = geoSharingConfigStore$updateConfig$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoSharingConfigStore$updateConfig$1.label;
        Object obj32 = zy11.a;
        if (i != 0) {
        }
        a1tVar2 = (a1t) obj22;
        if (!jl40.l(a1tVar2.e.c, a1tVar.e.c)) {
        }
        a1tVar2.a = a1tVar.a;
        a1tVar2.b = a1tVar.b;
        a1tVar2.c = a1tVar.c;
        a1tVar2.d = a1tVar.d;
        a1tVar2.e = a1tVar.e;
        geoSharingConfigStore$updateConfig$1.L$0 = a1tVar;
        geoSharingConfigStore$updateConfig$1.L$1 = null;
        geoSharingConfigStore$updateConfig$1.label = 2;
        this.b.getClass();
        sjh sjhVar2 = uyj.a;
        k0 = tje.k0(mdh.b, new GeoSharingConfigStore$saveSharingConfig$2(this, a1tVar2, null), geoSharingConfigStore$updateConfig$1);
        if (k0 != obj) {
        }
    }
}
