package com.yandex.plus.domain.auth.impl;

import android.net.Uri;
import android.webkit.CookieManager;
import com.yandex.passport.common.network.n;
import com.yandex.passport.data.network.l;
import defpackage.aev;
import defpackage.cg6;
import defpackage.lg3;
import defpackage.nm6;
import defpackage.oqi;
import defpackage.ouj;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rqi;
import defpackage.t7o;
import defpackage.tf6;
import defpackage.wis;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xdv;
import defpackage.xq0;
import defpackage.ydr;
import defpackage.ywf;
import defpackage.z7o;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes4.dex */
public final class i {
    public static final WeakHashMap k = new WeakHashMap();
    public final com.yandex.plus.adapter.auth.passport750.i a;
    public final com.yandex.plus.adapter.auth.api.c b;
    public final String c;
    public final String d;
    public final com.yandex.plus.core.analytics.logging.d e;
    public final kotlinx.coroutines.a f;
    public final kotlinx.coroutines.a g;
    public final xdr h;
    public final String i;
    public final l j;

    public i(com.yandex.plus.adapter.auth.passport750.i iVar, com.yandex.plus.adapter.auth.api.c cVar, String str, String str2, com.yandex.plus.core.analytics.logging.d dVar, tf6 tf6Var, kotlinx.coroutines.a aVar, kotlinx.coroutines.a aVar2, String str3) {
        iVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.a = iVar;
        this.b = cVar;
        this.c = str;
        this.d = str2;
        this.e = dVar;
        this.f = aVar;
        this.g = aVar2;
        this.h = ydr.a(com.yandex.plus.domain.auth.api.d.a);
        String k2 = ouj.k(')', "AuthSessionImpl(", str3);
        this.i = k2;
        this.j = new l(dVar);
        com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.b;
        Continuation continuation = null;
        if (dVar.b(aVar3)) {
            dVar.a(aVar3, k2, "init(environment=" + cVar + ')', null);
        }
        x97.y(tf6Var, null, null, new com.yandex.passport.internal.ui.social.i(this, continuation, 11), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(i iVar, Long l, Continuation continuation) {
        g gVar;
        int i;
        Object c;
        com.yandex.plus.log.api.a aVar;
        xdr xdrVar = iVar.h;
        String str = iVar.i;
        com.yandex.plus.core.analytics.logging.d dVar = iVar.e;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i2 = gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.l = i2 - Integer.MIN_VALUE;
                Object obj = gVar.j;
                Object obj2 = nm6.a;
                i = gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
                    if (dVar.b(aVar2)) {
                        dVar.c(aVar2, str, "onUserIdStateChanged userId=" + l);
                    }
                    if (l != null) {
                        com.yandex.plus.domain.auth.api.c cVar = new com.yandex.plus.domain.auth.api.c(l.longValue());
                        xdrVar.getClass();
                        xdrVar.m(null, cVar);
                    }
                    gVar.l = 1;
                    c = iVar.c(l, false, gVar);
                    if (c == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    c = ((z7o) obj).a;
                }
                aVar = com.yandex.plus.log.api.a.b;
                if (dVar.b(aVar)) {
                    dVar.c(aVar, str, "onUserIdStateChanged result=" + ((Object) z7o.b(c)));
                }
                r7o r7oVar = z7o.b;
                if (c instanceof t7o) {
                    c = com.yandex.plus.domain.auth.api.d.a;
                }
                xdrVar.l(c);
                return Unit.a;
            }
        }
        gVar = new g(iVar, continuation);
        Object obj3 = gVar.j;
        Object obj22 = nm6.a;
        i = gVar.l;
        if (i != 0) {
        }
        aVar = com.yandex.plus.log.api.a.b;
        if (dVar.b(aVar)) {
        }
        r7o r7oVar2 = z7o.b;
        if (c instanceof t7o) {
        }
        xdrVar.l(c);
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        a aVar;
        int i;
        com.yandex.plus.core.analytics.logging.d dVar;
        Object c;
        com.yandex.plus.log.api.a aVar2;
        if (cg6Var instanceof a) {
            aVar = (a) cg6Var;
            int i2 = aVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.l = i2 - Integer.MIN_VALUE;
                Object obj = aVar.j;
                Object obj2 = nm6.a;
                i = aVar.l;
                String str = this.i;
                dVar = this.e;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.b;
                    if (dVar.b(aVar3)) {
                        dVar.c(aVar3, str, "dropAndGetToken()");
                    }
                    Long l = (Long) this.a.b.getValue();
                    aVar.l = 1;
                    c = c(l, true, aVar);
                    if (c == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    c = ((z7o) obj).a;
                }
                aVar2 = com.yandex.plus.log.api.a.b;
                if (dVar.b(aVar2)) {
                    dVar.c(aVar2, str, "dropAndGetToken() result=" + ((Object) z7o.b(c)));
                }
                r7o r7oVar = z7o.b;
                boolean z = c instanceof t7o;
                this.h.l(!z ? com.yandex.plus.domain.auth.api.d.a : c);
                return z ? ((com.yandex.plus.domain.auth.api.b) c).b : c;
            }
        }
        aVar = new a(this, cg6Var);
        Object obj3 = aVar.j;
        Object obj22 = nm6.a;
        i = aVar.l;
        String str2 = this.i;
        dVar = this.e;
        if (i != 0) {
        }
        aVar2 = com.yandex.plus.log.api.a.b;
        if (dVar.b(aVar2)) {
        }
        r7o r7oVar2 = z7o.b;
        boolean z2 = c instanceof t7o;
        this.h.l(!z2 ? com.yandex.plus.domain.auth.api.d.a : c);
        if (z2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x020e A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #2 {all -> 0x0074, blocks: (B:18:0x0281, B:32:0x005e, B:41:0x0095, B:43:0x0207, B:45:0x020e), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018d A[Catch: all -> 0x00cd, CancellationException -> 0x00d0, wis -> 0x00d3, TRY_LEAVE, TryCatch #7 {wis -> 0x00d3, CancellationException -> 0x00d0, all -> 0x00cd, blocks: (B:20:0x028f, B:26:0x0299, B:27:0x029c, B:51:0x00c1, B:63:0x00e4, B:65:0x017c, B:67:0x018d, B:73:0x01a0, B:78:0x01a2, B:79:0x01a3, B:80:0x01a4, B:84:0x00ff, B:86:0x0148, B:88:0x0153, B:92:0x029d, B:93:0x02a4, B:95:0x011e, B:97:0x0122, B:100:0x02a5, B:101:0x02ac, B:69:0x018e, B:71:0x0194, B:72:0x019e), top: B:7:0x0026, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0153 A[Catch: all -> 0x00cd, CancellationException -> 0x00d0, wis -> 0x00d3, TryCatch #7 {wis -> 0x00d3, CancellationException -> 0x00d0, all -> 0x00cd, blocks: (B:20:0x028f, B:26:0x0299, B:27:0x029c, B:51:0x00c1, B:63:0x00e4, B:65:0x017c, B:67:0x018d, B:73:0x01a0, B:78:0x01a2, B:79:0x01a3, B:80:0x01a4, B:84:0x00ff, B:86:0x0148, B:88:0x0153, B:92:0x029d, B:93:0x02a4, B:95:0x011e, B:97:0x0122, B:100:0x02a5, B:101:0x02ac, B:69:0x018e, B:71:0x0194, B:72:0x019e), top: B:7:0x0026, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x029d A[Catch: all -> 0x00cd, CancellationException -> 0x00d0, wis -> 0x00d3, TryCatch #7 {wis -> 0x00d3, CancellationException -> 0x00d0, all -> 0x00cd, blocks: (B:20:0x028f, B:26:0x0299, B:27:0x029c, B:51:0x00c1, B:63:0x00e4, B:65:0x017c, B:67:0x018d, B:73:0x01a0, B:78:0x01a2, B:79:0x01a3, B:80:0x01a4, B:84:0x00ff, B:86:0x0148, B:88:0x0153, B:92:0x029d, B:93:0x02a4, B:95:0x011e, B:97:0x0122, B:100:0x02a5, B:101:0x02ac, B:69:0x018e, B:71:0x0194, B:72:0x019e), top: B:7:0x0026, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Long l, boolean z, cg6 cg6Var) {
        b bVar;
        oqi oqiVar;
        Object obj;
        boolean z2;
        Object obj2;
        int i;
        int i2;
        com.yandex.plus.adapter.auth.api.e eVar;
        i iVar;
        boolean booleanValue;
        Long l2;
        int i3;
        int i4;
        Object obj3;
        com.yandex.plus.adapter.auth.api.e eVar2;
        boolean z3;
        boolean z4;
        com.yandex.plus.adapter.auth.passport750.i iVar2;
        oqi oqiVar2;
        int i5;
        Long l3;
        boolean z5;
        com.yandex.plus.adapter.auth.api.a aVar;
        int i6;
        int i7;
        Object c;
        oqi oqiVar3;
        com.yandex.plus.adapter.auth.api.e eVar3;
        com.yandex.plus.adapter.auth.api.a aVar2;
        com.yandex.plus.adapter.auth.passport750.i iVar3;
        int i8;
        boolean z6;
        int i9;
        Object obj4;
        boolean z7;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        int i14;
        nm6 nm6Var;
        Long l4;
        com.yandex.plus.adapter.auth.api.a aVar3;
        Object c2;
        Long l5;
        Long l6 = l;
        try {
            try {
                if (cg6Var instanceof b) {
                    bVar = (b) cg6Var;
                    int i15 = bVar.A;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        bVar.A = i15 - Integer.MIN_VALUE;
                        Object obj5 = bVar.y;
                        nm6 nm6Var2 = nm6.a;
                        switch (bVar.A) {
                            case 0:
                                qgg.h0(obj5);
                                com.yandex.plus.adapter.auth.api.c cVar = this.b;
                                com.yandex.plus.adapter.auth.api.e eVar4 = new com.yandex.plus.adapter.auth.api.e(cVar, this.c, this.d, 0);
                                r7o r7oVar = z7o.b;
                                if (l6 == null) {
                                    throw new IllegalArgumentException("userId is null, can't refresh token!");
                                }
                                com.yandex.plus.adapter.auth.api.d dVar = new com.yandex.plus.adapter.auth.api.d(cVar);
                                com.yandex.plus.adapter.auth.passport750.i iVar4 = this.a;
                                bVar.j = l6;
                                bVar.k = eVar4;
                                bVar.l = this;
                                z2 = z;
                                bVar.q = z2;
                                bVar.s = 0;
                                bVar.t = 0;
                                bVar.A = 1;
                                Object e = iVar4.e(dVar, bVar);
                                if (e != nm6Var2) {
                                    obj2 = e;
                                    i = 0;
                                    i2 = 0;
                                    eVar = eVar4;
                                    iVar = this;
                                    qgg.h0(obj2);
                                    booleanValue = ((Boolean) obj2).booleanValue();
                                    if (booleanValue) {
                                        throw new IllegalArgumentException("xToken is invalid, must login again!");
                                    }
                                    com.yandex.plus.adapter.auth.api.d dVar2 = new com.yandex.plus.adapter.auth.api.d(iVar.b);
                                    com.yandex.plus.adapter.auth.passport750.i iVar5 = iVar.a;
                                    bVar.j = l6;
                                    bVar.k = eVar;
                                    bVar.l = iVar;
                                    bVar.q = z2;
                                    bVar.s = i2;
                                    bVar.t = i;
                                    bVar.r = booleanValue;
                                    bVar.A = 2;
                                    Object b = iVar5.b(dVar2, bVar);
                                    if (b != nm6Var2) {
                                        l2 = l6;
                                        i3 = i2;
                                        i4 = i;
                                        obj3 = b;
                                        eVar2 = eVar;
                                        z3 = z2;
                                        z4 = booleanValue;
                                        qgg.h0(obj3);
                                        com.yandex.plus.adapter.auth.api.a aVar4 = (com.yandex.plus.adapter.auth.api.a) obj3;
                                        iVar2 = iVar.a;
                                        WeakHashMap weakHashMap = k;
                                        oqiVar2 = (oqi) weakHashMap.get(iVar2);
                                        if (oqiVar2 == null) {
                                            synchronized (weakHashMap) {
                                                try {
                                                    Object obj6 = weakHashMap.get(iVar2);
                                                    if (obj6 == null) {
                                                        obj6 = rqi.a();
                                                        weakHashMap.put(iVar2, obj6);
                                                    }
                                                    oqiVar2 = (oqi) obj6;
                                                } finally {
                                                }
                                            }
                                        }
                                        bVar.j = l2;
                                        bVar.k = eVar2;
                                        bVar.l = null;
                                        bVar.m = aVar4;
                                        bVar.n = iVar2;
                                        bVar.o = oqiVar2;
                                        bVar.q = z3;
                                        bVar.s = i3;
                                        bVar.t = i4;
                                        bVar.r = z4;
                                        bVar.u = 0;
                                        bVar.v = 0;
                                        bVar.A = 3;
                                        if (oqiVar2.a(bVar) != nm6Var2) {
                                            boolean z8 = z3;
                                            i5 = i3;
                                            l3 = l2;
                                            z5 = z8;
                                            aVar = aVar4;
                                            i6 = 0;
                                            i7 = 0;
                                            try {
                                                bVar.j = l3;
                                                bVar.k = eVar2;
                                                bVar.l = null;
                                                bVar.m = aVar;
                                                bVar.n = null;
                                                bVar.o = oqiVar2;
                                                bVar.p = iVar2;
                                                bVar.q = z5;
                                                bVar.s = i5;
                                                bVar.t = i4;
                                                bVar.r = z4;
                                                bVar.u = i7;
                                                bVar.v = i6;
                                                bVar.w = 0;
                                                bVar.x = 0;
                                                bVar.A = 4;
                                                c = iVar2.c(eVar2, bVar);
                                                if (c != nm6Var2) {
                                                    com.yandex.plus.adapter.auth.api.e eVar5 = eVar2;
                                                    oqiVar3 = oqiVar2;
                                                    eVar3 = eVar5;
                                                    aVar2 = aVar;
                                                    iVar3 = iVar2;
                                                    i8 = i5;
                                                    z6 = z4;
                                                    i9 = i6;
                                                    obj4 = c;
                                                    z7 = z5;
                                                    i10 = i4;
                                                    i11 = 0;
                                                    i12 = i7;
                                                    i13 = 0;
                                                    qgg.h0(obj4);
                                                    str = (String) obj4;
                                                    if (z7) {
                                                        com.yandex.passport.internal.flags.experiments.d dVar3 = new com.yandex.passport.internal.flags.experiments.d(str, 3);
                                                        bVar.j = l3;
                                                        bVar.k = eVar3;
                                                        bVar.l = null;
                                                        bVar.m = aVar2;
                                                        bVar.n = null;
                                                        bVar.o = oqiVar3;
                                                        bVar.p = iVar3;
                                                        bVar.q = z7;
                                                        bVar.s = i8;
                                                        bVar.t = i10;
                                                        bVar.r = z6;
                                                        bVar.u = i12;
                                                        bVar.v = i9;
                                                        bVar.w = i13;
                                                        i14 = i11;
                                                        bVar.x = i14;
                                                        bVar.A = 5;
                                                        nm6Var = nm6Var2;
                                                        if (iVar3.a(dVar3, bVar) == nm6Var) {
                                                            return nm6Var;
                                                        }
                                                        com.yandex.plus.adapter.auth.api.a aVar5 = aVar2;
                                                        l4 = l3;
                                                        aVar3 = aVar5;
                                                        oqiVar = oqiVar3;
                                                        try {
                                                            bVar.j = l4;
                                                            bVar.k = null;
                                                            bVar.l = null;
                                                            bVar.m = aVar3;
                                                            bVar.n = null;
                                                            bVar.o = oqiVar;
                                                            bVar.p = null;
                                                            bVar.q = z7;
                                                            bVar.s = i8;
                                                            bVar.t = i10;
                                                            bVar.r = z6;
                                                            bVar.u = i12;
                                                            bVar.v = i9;
                                                            bVar.w = i13;
                                                            bVar.x = i14;
                                                            bVar.A = 6;
                                                            c2 = iVar3.c(eVar3, bVar);
                                                            if (c2 != nm6Var) {
                                                                return nm6Var;
                                                            }
                                                            l5 = l4;
                                                            qgg.h0(c2);
                                                            str = (String) c2;
                                                            aVar2 = aVar3;
                                                            l3 = l5;
                                                            oqiVar3 = oqiVar;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            obj = null;
                                                            oqiVar.b(obj);
                                                            throw th;
                                                        }
                                                    }
                                                    com.yandex.plus.domain.auth.api.b bVar2 = new com.yandex.plus.domain.auth.api.b(l3.longValue(), str, aVar2.a, aVar2.b);
                                                    oqiVar3.b(null);
                                                    r7o r7oVar2 = z7o.b;
                                                    return bVar2;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                oqiVar = oqiVar2;
                                                obj = null;
                                                oqiVar.b(obj);
                                                throw th;
                                            }
                                        }
                                    }
                                }
                                return nm6Var2;
                            case 1:
                                int i16 = bVar.t;
                                int i17 = bVar.s;
                                z2 = bVar.q;
                                i iVar6 = bVar.l;
                                com.yandex.plus.adapter.auth.api.e eVar6 = bVar.k;
                                Long l7 = bVar.j;
                                qgg.h0(obj5);
                                Object obj7 = ((z7o) obj5).a;
                                i = i16;
                                l6 = l7;
                                eVar = eVar6;
                                iVar = iVar6;
                                i2 = i17;
                                obj2 = obj7;
                                qgg.h0(obj2);
                                booleanValue = ((Boolean) obj2).booleanValue();
                                if (booleanValue) {
                                }
                                break;
                            case 2:
                                boolean z9 = bVar.r;
                                int i18 = bVar.t;
                                int i19 = bVar.s;
                                boolean z10 = bVar.q;
                                iVar = bVar.l;
                                com.yandex.plus.adapter.auth.api.e eVar7 = bVar.k;
                                l2 = bVar.j;
                                qgg.h0(obj5);
                                obj3 = ((z7o) obj5).a;
                                z4 = z9;
                                i3 = i19;
                                eVar2 = eVar7;
                                z3 = z10;
                                i4 = i18;
                                qgg.h0(obj3);
                                com.yandex.plus.adapter.auth.api.a aVar42 = (com.yandex.plus.adapter.auth.api.a) obj3;
                                iVar2 = iVar.a;
                                WeakHashMap weakHashMap2 = k;
                                oqiVar2 = (oqi) weakHashMap2.get(iVar2);
                                if (oqiVar2 == null) {
                                }
                                bVar.j = l2;
                                bVar.k = eVar2;
                                bVar.l = null;
                                bVar.m = aVar42;
                                bVar.n = iVar2;
                                bVar.o = oqiVar2;
                                bVar.q = z3;
                                bVar.s = i3;
                                bVar.t = i4;
                                bVar.r = z4;
                                bVar.u = 0;
                                bVar.v = 0;
                                bVar.A = 3;
                                if (oqiVar2.a(bVar) != nm6Var2) {
                                }
                                return nm6Var2;
                            case 3:
                                int i20 = bVar.v;
                                i7 = bVar.u;
                                z4 = bVar.r;
                                i4 = bVar.t;
                                int i21 = bVar.s;
                                boolean z11 = bVar.q;
                                oqi oqiVar4 = bVar.o;
                                iVar2 = bVar.n;
                                com.yandex.plus.adapter.auth.api.a aVar6 = bVar.m;
                                eVar2 = bVar.k;
                                Long l8 = bVar.j;
                                qgg.h0(obj5);
                                i5 = i21;
                                oqiVar2 = oqiVar4;
                                z5 = z11;
                                i6 = i20;
                                l3 = l8;
                                aVar = aVar6;
                                bVar.j = l3;
                                bVar.k = eVar2;
                                bVar.l = null;
                                bVar.m = aVar;
                                bVar.n = null;
                                bVar.o = oqiVar2;
                                bVar.p = iVar2;
                                bVar.q = z5;
                                bVar.s = i5;
                                bVar.t = i4;
                                bVar.r = z4;
                                bVar.u = i7;
                                bVar.v = i6;
                                bVar.w = 0;
                                bVar.x = 0;
                                bVar.A = 4;
                                c = iVar2.c(eVar2, bVar);
                                if (c != nm6Var2) {
                                }
                                return nm6Var2;
                            case 4:
                                int i22 = bVar.x;
                                int i23 = bVar.w;
                                int i24 = bVar.v;
                                int i25 = bVar.u;
                                boolean z12 = bVar.r;
                                int i26 = bVar.t;
                                int i27 = bVar.s;
                                boolean z13 = bVar.q;
                                com.yandex.plus.adapter.auth.passport750.i iVar7 = bVar.p;
                                oqiVar3 = bVar.o;
                                com.yandex.plus.adapter.auth.api.a aVar7 = bVar.m;
                                com.yandex.plus.adapter.auth.api.e eVar8 = bVar.k;
                                l3 = bVar.j;
                                qgg.h0(obj5);
                                obj4 = ((z7o) obj5).a;
                                i11 = i22;
                                i12 = i25;
                                aVar2 = aVar7;
                                iVar3 = iVar7;
                                z7 = z13;
                                i8 = i27;
                                i10 = i26;
                                z6 = z12;
                                eVar3 = eVar8;
                                i9 = i24;
                                i13 = i23;
                                qgg.h0(obj4);
                                str = (String) obj4;
                                if (z7) {
                                }
                                com.yandex.plus.domain.auth.api.b bVar22 = new com.yandex.plus.domain.auth.api.b(l3.longValue(), str, aVar2.a, aVar2.b);
                                oqiVar3.b(null);
                                r7o r7oVar22 = z7o.b;
                                return bVar22;
                            case 5:
                                int i28 = bVar.x;
                                i13 = bVar.w;
                                i9 = bVar.v;
                                i12 = bVar.u;
                                boolean z14 = bVar.r;
                                int i29 = bVar.t;
                                int i30 = bVar.s;
                                boolean z15 = bVar.q;
                                com.yandex.plus.adapter.auth.passport750.i iVar8 = bVar.p;
                                oqiVar3 = bVar.o;
                                com.yandex.plus.adapter.auth.api.a aVar8 = bVar.m;
                                com.yandex.plus.adapter.auth.api.e eVar9 = bVar.k;
                                Long l9 = bVar.j;
                                qgg.h0(obj5);
                                ((z7o) obj5).getClass();
                                i14 = i28;
                                l4 = l9;
                                aVar3 = aVar8;
                                iVar3 = iVar8;
                                z7 = z15;
                                i8 = i30;
                                i10 = i29;
                                z6 = z14;
                                eVar3 = eVar9;
                                nm6Var = nm6Var2;
                                oqiVar = oqiVar3;
                                bVar.j = l4;
                                bVar.k = null;
                                bVar.l = null;
                                bVar.m = aVar3;
                                bVar.n = null;
                                bVar.o = oqiVar;
                                bVar.p = null;
                                bVar.q = z7;
                                bVar.s = i8;
                                bVar.t = i10;
                                bVar.r = z6;
                                bVar.u = i12;
                                bVar.v = i9;
                                bVar.w = i13;
                                bVar.x = i14;
                                bVar.A = 6;
                                c2 = iVar3.c(eVar3, bVar);
                                if (c2 != nm6Var) {
                                }
                                break;
                            case 6:
                                oqiVar = bVar.o;
                                aVar3 = bVar.m;
                                l5 = bVar.j;
                                try {
                                    qgg.h0(obj5);
                                    c2 = ((z7o) obj5).a;
                                    qgg.h0(c2);
                                    str = (String) c2;
                                    aVar2 = aVar3;
                                    l3 = l5;
                                    oqiVar3 = oqiVar;
                                    com.yandex.plus.domain.auth.api.b bVar222 = new com.yandex.plus.domain.auth.api.b(l3.longValue(), str, aVar2.a, aVar2.b);
                                    oqiVar3.b(null);
                                    r7o r7oVar222 = z7o.b;
                                    return bVar222;
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj = null;
                                    oqiVar.b(obj);
                                    throw th;
                                }
                            default:
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                        }
                    }
                }
                switch (bVar.A) {
                }
            } catch (Throwable th4) {
                th = th4;
                oqiVar = oqiVar3;
            }
        } catch (wis e2) {
            r7o r7oVar3 = z7o.b;
            return new t7o(e2);
        } catch (CancellationException e3) {
            throw e3;
        } catch (Throwable th5) {
            r7o r7oVar4 = z7o.b;
            return new t7o(th5);
        }
        bVar = new b(this, cg6Var);
        Object obj52 = bVar.y;
        nm6 nm6Var22 = nm6.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, cg6 cg6Var) {
        c cVar;
        int i;
        com.yandex.plus.core.analytics.logging.d dVar;
        com.yandex.plus.log.api.a aVar;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.l = i2 - Integer.MIN_VALUE;
                Object obj = cVar.j;
                nm6 nm6Var = nm6.a;
                i = cVar.l;
                String str3 = this.i;
                dVar = this.e;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
                    if (dVar.b(aVar2)) {
                        dVar.c(aVar2, str3, "getAuthorizationUrl(url=" + str + ", tld=" + str2 + ')');
                    }
                    com.yandex.plus.bdui.ui.b bVar = new com.yandex.plus.bdui.ui.b(this, new com.yandex.plus.adapter.auth.api.e(this.b, str, str2, 1), null, 2);
                    cVar.l = 1;
                    obj = x97.V(this.g, bVar, cVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Object obj2 = ((z7o) obj).a;
                aVar = com.yandex.plus.log.api.a.b;
                if (dVar.b(aVar)) {
                    dVar.c(aVar, str3, "getAuthorizationUrl() result=" + ((Object) z7o.b(obj2)));
                }
                return obj2;
            }
        }
        cVar = new c(this, cg6Var);
        Object obj3 = cVar.j;
        nm6 nm6Var2 = nm6.a;
        i = cVar.l;
        String str32 = this.i;
        dVar = this.e;
        if (i != 0) {
        }
        Object obj22 = ((z7o) obj3).a;
        aVar = com.yandex.plus.log.api.a.b;
        if (dVar.b(aVar)) {
        }
        return obj22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (r6 != null) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(cg6 cg6Var) {
        d dVar;
        int i;
        Object obj;
        Object c;
        long j;
        Throwable a;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i2 = dVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = dVar.k;
                Object obj3 = nm6.a;
                i = dVar.m;
                xdr xdrVar = this.h;
                if (i != 0) {
                    qgg.h0(obj2);
                    Long l = (Long) this.a.b.getValue();
                    Object value = xdrVar.getValue();
                    obj = null;
                    com.yandex.plus.domain.auth.api.b bVar = value instanceof com.yandex.plus.domain.auth.api.b ? (com.yandex.plus.domain.auth.api.b) value : null;
                    if (bVar != null) {
                        long j2 = bVar.a;
                        if (l != null && l.longValue() == j2) {
                            obj = bVar;
                        }
                    }
                    if (l == null) {
                        obj = com.yandex.plus.domain.auth.api.d.a;
                        xdrVar.l(obj);
                        return obj;
                    }
                    long longValue = l.longValue();
                    Long l2 = new Long(longValue);
                    dVar.j = longValue;
                    dVar.m = 1;
                    c = c(l2, false, dVar);
                    if (c == obj3) {
                        return obj3;
                    }
                    j = longValue;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = dVar.j;
                    qgg.h0(obj2);
                    c = ((z7o) obj2).a;
                }
                a = z7o.a(c);
                if (a != null) {
                    c = new com.yandex.plus.domain.auth.api.a(j, a);
                }
                obj = (com.yandex.plus.domain.auth.api.e) c;
                xdrVar.l(obj);
                return obj;
            }
        }
        dVar = new d(this, cg6Var);
        Object obj22 = dVar.k;
        Object obj32 = nm6.a;
        i = dVar.m;
        xdr xdrVar2 = this.h;
        if (i != 0) {
        }
        a = z7o.a(c);
        if (a != null) {
        }
        obj = (com.yandex.plus.domain.auth.api.e) c;
        xdrVar2.l(obj);
        return obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(1:(7:13|14|15|16|17|(1:19)|20)(2:22|23))(6:24|25|26|27|(5:30|16|17|(0)|20)|29))(5:32|33|34|35|(2:37|29)(5:38|26|27|(0)|29)))(1:39))(3:60|(1:62)|63)|40|(5:42|(2:e0|51)|57|(3:59|35|(0)(0))|29)|17|(0)|20))|72|6|7|(0)(0)|40|(0)|17|(0)|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b5, code lost:
    
        if (r14 == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x003f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0169, code lost:
    
        r14 = defpackage.z7o.b;
        r13 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0129 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1 A[Catch: all -> 0x003f, TRY_ENTER, TryCatch #2 {all -> 0x003f, blocks: (B:14:0x0034, B:16:0x0153, B:27:0x0131, B:67:0x0165, B:68:0x0168, B:33:0x0070, B:42:0x00c1, B:44:0x00e0, B:50:0x00f4, B:55:0x00f6, B:56:0x00f7, B:57:0x00f8, B:25:0x0053, B:26:0x012c, B:35:0x0113, B:46:0x00e1, B:48:0x00e7, B:49:0x00f2), top: B:7:0x0024, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [oqi] */
    /* JADX WARN: Type inference failed for: r2v13, types: [oqi] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(com.yandex.plus.adapter.auth.api.g gVar, cg6 cg6Var) {
        e eVar;
        ?? r2;
        Object t7oVar;
        com.yandex.plus.core.analytics.logging.d dVar;
        com.yandex.plus.log.api.a aVar;
        com.yandex.plus.adapter.auth.api.e eVar2;
        com.yandex.plus.adapter.auth.passport750.i iVar;
        oqi oqiVar;
        long j;
        int i;
        int i2;
        Object c;
        long j2;
        int i3;
        Object b;
        String str;
        long j3;
        Object obj;
        try {
            if (cg6Var instanceof e) {
                eVar = (e) cg6Var;
                int i4 = eVar.s;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    eVar.s = i4 - Integer.MIN_VALUE;
                    Object obj2 = eVar.q;
                    nm6 nm6Var = nm6.a;
                    r2 = eVar.s;
                    int i5 = 3;
                    int i6 = 0;
                    Continuation continuation = null;
                    if (r2 != 0) {
                        qgg.h0(obj2);
                        com.yandex.plus.core.analytics.logging.d dVar2 = this.e;
                        String str2 = this.i;
                        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
                        if (dVar2.b(aVar2)) {
                            dVar2.c(aVar2, str2, "login(theme=" + gVar + ')');
                        }
                        com.yandex.plus.adapter.auth.api.f fVar = new com.yandex.plus.adapter.auth.api.f(this.b, gVar, 0);
                        kotlinx.coroutines.a aVar3 = this.f;
                        com.yandex.plus.bdui.ui.b bVar = new com.yandex.plus.bdui.ui.b(this, fVar, continuation, i5);
                        eVar.s = 1;
                        obj2 = x97.V(aVar3, bVar, eVar);
                    } else {
                        if (r2 != 1) {
                            if (r2 == 2) {
                                int i7 = eVar.p;
                                i = eVar.o;
                                int i8 = eVar.n;
                                j = eVar.m;
                                oqi oqiVar2 = eVar.l;
                                iVar = (com.yandex.plus.adapter.auth.passport750.i) eVar.k;
                                eVar2 = eVar.j;
                                qgg.h0(obj2);
                                i2 = i7;
                                i6 = i8;
                                oqiVar = oqiVar2;
                                eVar.j = null;
                                eVar.k = null;
                                eVar.l = oqiVar;
                                eVar.m = j;
                                eVar.n = i6;
                                eVar.o = i;
                                eVar.p = i2;
                                eVar.s = 3;
                                c = iVar.c(eVar2, eVar);
                                if (c != nm6Var) {
                                    return nm6Var;
                                }
                                j2 = j;
                                i3 = i6;
                                r2 = oqiVar;
                                qgg.h0(c);
                                String str3 = (String) c;
                                r2.b(null);
                                com.yandex.plus.adapter.auth.api.d dVar3 = new com.yandex.plus.adapter.auth.api.d(this.b);
                                com.yandex.plus.adapter.auth.passport750.i iVar2 = this.a;
                                eVar.j = null;
                                eVar.k = str3;
                                eVar.l = null;
                                eVar.m = j2;
                                eVar.n = i3;
                                eVar.s = 4;
                                b = iVar2.b(dVar3, eVar);
                                if (b != nm6Var) {
                                }
                                return nm6Var;
                            }
                            if (r2 != 3) {
                                if (r2 != 4) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                long j4 = eVar.m;
                                String str4 = (String) eVar.k;
                                qgg.h0(obj2);
                                obj = ((z7o) obj2).a;
                                str = str4;
                                j3 = j4;
                                qgg.h0(obj);
                                com.yandex.plus.adapter.auth.api.a aVar4 = (com.yandex.plus.adapter.auth.api.a) obj;
                                com.yandex.plus.domain.auth.api.b bVar2 = new com.yandex.plus.domain.auth.api.b(j3, str, aVar4.a, aVar4.b);
                                r7o r7oVar = z7o.b;
                                t7oVar = bVar2;
                                dVar = this.e;
                                String str5 = this.i;
                                aVar = com.yandex.plus.log.api.a.b;
                                if (dVar.b(aVar)) {
                                    dVar.c(aVar, str5, "login() result=" + ((Object) z7o.b(t7oVar)));
                                }
                                return t7oVar;
                            }
                            i3 = eVar.n;
                            j2 = eVar.m;
                            oqi oqiVar3 = eVar.l;
                            qgg.h0(obj2);
                            c = ((z7o) obj2).a;
                            r2 = oqiVar3;
                            qgg.h0(c);
                            String str32 = (String) c;
                            r2.b(null);
                            com.yandex.plus.adapter.auth.api.d dVar32 = new com.yandex.plus.adapter.auth.api.d(this.b);
                            com.yandex.plus.adapter.auth.passport750.i iVar22 = this.a;
                            eVar.j = null;
                            eVar.k = str32;
                            eVar.l = null;
                            eVar.m = j2;
                            eVar.n = i3;
                            eVar.s = 4;
                            b = iVar22.b(dVar32, eVar);
                            if (b != nm6Var) {
                                str = str32;
                                j3 = j2;
                                obj = b;
                                qgg.h0(obj);
                                com.yandex.plus.adapter.auth.api.a aVar42 = (com.yandex.plus.adapter.auth.api.a) obj;
                                com.yandex.plus.domain.auth.api.b bVar22 = new com.yandex.plus.domain.auth.api.b(j3, str, aVar42.a, aVar42.b);
                                r7o r7oVar2 = z7o.b;
                                t7oVar = bVar22;
                                dVar = this.e;
                                String str52 = this.i;
                                aVar = com.yandex.plus.log.api.a.b;
                                if (dVar.b(aVar)) {
                                }
                                return t7oVar;
                            }
                            return nm6Var;
                        }
                        qgg.h0(obj2);
                    }
                    t7oVar = ((z7o) obj2).a;
                    if (!(t7oVar instanceof t7o)) {
                        r7o r7oVar3 = z7o.b;
                        long longValue = ((Number) t7oVar).longValue();
                        eVar2 = new com.yandex.plus.adapter.auth.api.e(this.b, this.c, this.d, 0);
                        iVar = this.a;
                        WeakHashMap weakHashMap = k;
                        oqi oqiVar4 = (oqi) weakHashMap.get(iVar);
                        if (oqiVar4 == null) {
                            synchronized (weakHashMap) {
                                try {
                                    Object obj3 = weakHashMap.get(iVar);
                                    if (obj3 == null) {
                                        obj3 = rqi.a();
                                        weakHashMap.put(iVar, obj3);
                                    }
                                    oqiVar4 = (oqi) obj3;
                                } finally {
                                }
                            }
                        }
                        eVar.j = eVar2;
                        eVar.k = iVar;
                        eVar.l = oqiVar4;
                        eVar.m = longValue;
                        eVar.n = 0;
                        eVar.o = 0;
                        eVar.p = 0;
                        eVar.s = 2;
                        if (oqiVar4.a(eVar) != nm6Var) {
                            oqiVar = oqiVar4;
                            j = longValue;
                            i = 0;
                            i2 = 0;
                            eVar.j = null;
                            eVar.k = null;
                            eVar.l = oqiVar;
                            eVar.m = j;
                            eVar.n = i6;
                            eVar.o = i;
                            eVar.p = i2;
                            eVar.s = 3;
                            c = iVar.c(eVar2, eVar);
                            if (c != nm6Var) {
                            }
                        }
                        return nm6Var;
                    }
                    dVar = this.e;
                    String str522 = this.i;
                    aVar = com.yandex.plus.log.api.a.b;
                    if (dVar.b(aVar)) {
                    }
                    return t7oVar;
                }
            }
            if (r2 != 0) {
            }
            t7oVar = ((z7o) obj2).a;
            if (!(t7oVar instanceof t7o)) {
            }
            dVar = this.e;
            String str5222 = this.i;
            aVar = com.yandex.plus.log.api.a.b;
            if (dVar.b(aVar)) {
            }
            return t7oVar;
        } catch (Throwable th) {
            r2.b(null);
            throw th;
        }
        eVar = new e(this, cg6Var);
        Object obj22 = eVar.q;
        nm6 nm6Var2 = nm6.a;
        r2 = eVar.s;
        int i52 = 3;
        int i62 = 0;
        Continuation continuation2 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(com.yandex.plus.adapter.auth.api.g gVar, cg6 cg6Var) {
        f fVar;
        int i;
        com.yandex.plus.core.analytics.logging.d dVar;
        Object obj;
        com.yandex.plus.log.api.a aVar;
        if (cg6Var instanceof f) {
            fVar = (f) cg6Var;
            int i2 = fVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = fVar.j;
                nm6 nm6Var = nm6.a;
                i = fVar.l;
                String str = this.i;
                dVar = this.e;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj2);
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
                    if (dVar.b(aVar2)) {
                        dVar.c(aVar2, str, "logout(theme=" + gVar + ')');
                    }
                    com.yandex.plus.bdui.ui.b bVar = new com.yandex.plus.bdui.ui.b(this, new com.yandex.plus.adapter.auth.api.f(this.b, gVar, 1), continuation, 4);
                    fVar.l = 1;
                    obj2 = x97.V(this.f, bVar, fVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    r7o r7oVar = z7o.b;
                    obj = com.yandex.plus.domain.auth.api.d.a;
                }
                aVar = com.yandex.plus.log.api.a.b;
                if (dVar.b(aVar)) {
                    dVar.c(aVar, str, "logout() result=" + ((Object) z7o.b(obj)));
                }
                return obj;
            }
        }
        fVar = new f(this, cg6Var);
        Object obj22 = fVar.j;
        nm6 nm6Var2 = nm6.a;
        i = fVar.l;
        String str2 = this.i;
        dVar = this.e;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        aVar = com.yandex.plus.log.api.a.b;
        if (dVar.b(aVar)) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, cg6 cg6Var) {
        h hVar;
        int i;
        com.yandex.plus.core.analytics.logging.d dVar;
        Object t7oVar;
        Object j;
        com.yandex.plus.log.api.a aVar;
        if (cg6Var instanceof h) {
            hVar = (h) cg6Var;
            int i2 = hVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.l = i2 - Integer.MIN_VALUE;
                Object obj = hVar.j;
                nm6 nm6Var = nm6.a;
                i = hVar.l;
                String str2 = this.i;
                dVar = this.e;
                if (i != 0) {
                    qgg.h0(obj);
                    String uri = Uri.parse(str).buildUpon().clearQuery().path(null).fragment(null).build().toString();
                    uri.getClass();
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
                    if (dVar.b(aVar2)) {
                        dVar.c(aVar2, str2, ouj.k(')', "updateAndInjectAuthCookie(domain=", uri));
                    }
                    com.yandex.plus.core.analytics.logging.d dVar2 = (com.yandex.plus.core.analytics.logging.d) this.j.a;
                    try {
                        r7o r7oVar = z7o.b;
                        CookieManager cookieManager = CookieManager.getInstance();
                        cookieManager.getClass();
                        if (ywf.z("GET_COOKIE_INFO")) {
                            com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
                            if (dVar2.b(aVar3)) {
                                dVar2.a(aVar3, "CookieCleaner", "Clear cookie for domain", null);
                            }
                            if (!xdv.b.b()) {
                                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                            }
                            List<String> cookieInfo = ((WebViewCookieManagerBoundaryInterface) lg3.J(WebViewCookieManagerBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) aev.a.a).convertCookieManager(cookieManager))).getCookieInfo(uri);
                            cookieInfo.getClass();
                            for (String str3 : cookieInfo) {
                                str3.getClass();
                                cookieManager.setCookie(uri, l.w(str3));
                            }
                        } else {
                            com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
                            if (dVar2.b(aVar4)) {
                                dVar2.a(aVar4, "CookieCleaner", "Clear all cookies", null);
                            }
                            cookieManager.removeAllCookies(null);
                        }
                        cookieManager.flush();
                        t7oVar = Unit.a;
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    r7o r7oVar3 = z7o.b;
                    if (!(t7oVar instanceof t7o)) {
                        com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.c;
                        if (dVar2.b(aVar5)) {
                            dVar2.a(aVar5, "CookieCleaner", "Cookies cleared successfully", null);
                        }
                    }
                    Throwable a = z7o.a(t7oVar);
                    if (a != null) {
                        com.yandex.plus.log.api.a aVar6 = com.yandex.plus.log.api.a.e;
                        if (dVar2.b(aVar6)) {
                            dVar2.a(aVar6, "CookieCleaner", "Cookies are not cleared", a);
                        }
                    }
                    n nVar = new n(26, this.b, uri);
                    hVar.l = 1;
                    j = this.a.j(nVar, hVar);
                    if (j == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    j = ((z7o) obj).a;
                }
                aVar = com.yandex.plus.log.api.a.b;
                if (dVar.b(aVar)) {
                    dVar.c(aVar, str2, "updateAndInjectAuthCookie() result=" + ((Object) z7o.b(j)));
                }
                return j;
            }
        }
        hVar = new h(this, cg6Var);
        Object obj2 = hVar.j;
        nm6 nm6Var2 = nm6.a;
        i = hVar.l;
        String str22 = this.i;
        dVar = this.e;
        if (i != 0) {
        }
        aVar = com.yandex.plus.log.api.a.b;
        if (dVar.b(aVar)) {
        }
        return j;
    }
}
