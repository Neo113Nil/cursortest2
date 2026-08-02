package com.yandex.passport.data.network;

import defpackage.cg6;
import defpackage.d0o;
import defpackage.l3o;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.u75;
import defpackage.wis;
import defpackage.xq0;
import defpackage.xqn;
import defpackage.xz0;
import defpackage.y2x;
import defpackage.z7o;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class y0 extends androidx.core.app.n0 {
    public final com.yandex.passport.common.network.l b;
    public final com.yandex.passport.data.network.core.t c;
    public final com.yandex.passport.data.network.core.l d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.l lVar, com.yandex.passport.data.network.core.t tVar, com.yandex.passport.data.network.core.l lVar2) {
        super((kotlinx.coroutines.a) ((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        lVar.getClass();
        tVar.getClass();
        lVar2.getClass();
        this.b = lVar;
        this.c = tVar;
        this.d = lVar2;
    }

    public static String w(t0 t0Var) {
        return "lat=" + t0Var.a + ";lon=" + t0Var.b;
    }

    public static s0 x(l3o l3oVar) {
        l3oVar.getClass();
        List r = l3oVar.f.r("Set-Cookie");
        if (l3oVar.d >= 500) {
            return new q0(r);
        }
        String obj = StringsKt.t0(com.yandex.plus.pay.ui.core.b.q(l3oVar)).toString();
        return StringsKt.U(obj) ? new q0(r) : new r0(obj, r);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(u0 u0Var, cg6 cg6Var) {
        v0 v0Var;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof v0) {
            v0Var = (v0) cg6Var;
            int i2 = v0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v0Var.m = i2 - Integer.MIN_VALUE;
                Object obj = v0Var.k;
                nm6 nm6Var = nm6.a;
                i = v0Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.data.models.g gVar = u0Var.a;
                    Pair pair = u0Var.i;
                    String str = u0Var.f;
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(0L, this.c, gVar).b, "/tmgrdfrend/checkvpn");
                    k.F("placemark", u0Var.b);
                    t0 t0Var = u0Var.c;
                    k.F("gps", t0Var != null ? w(t0Var) : null);
                    List list = u0Var.d;
                    if (list.isEmpty()) {
                        list = null;
                    }
                    k.F("product_location", list != null ? CollectionsKt.X(list, ", ", null, null, new com.yandex.passport.common.network.r(this, 4), 30) : null);
                    List list2 = u0Var.e;
                    if (list2.isEmpty()) {
                        list2 = null;
                    }
                    k.F("device_geo_location", list2 != null ? CollectionsKt.X(list2, ", ", null, null, new com.yandex.passport.common.network.r(this, 5), 30) : null);
                    if (str != null) {
                        k.F("auth_token", "OAuth ".concat(str));
                    }
                    k.F(CommonUrlParts.APP_ID, u0Var.g);
                    k.F("app_version", u0Var.h);
                    StringBuilder sb = new StringBuilder();
                    sb.append(pair.a);
                    sb.append(',');
                    sb.append(pair.b);
                    k.F("sim_region", sb.toString());
                    k.F("device_region", u0Var.j);
                    k.F("Cookie", u0Var.k);
                    for (Map.Entry entry : u0Var.l.entrySet()) {
                        k.F((String) entry.getKey(), xz0.J((String[]) entry.getValue(), ", ", null, 62));
                    }
                    v0Var.j = k;
                    v0Var.m = 1;
                    if (this.d.a(k, v0Var) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = v0Var.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        v0Var = new v0(this, cg6Var);
        Object obj2 = v0Var.k;
        nm6 nm6Var2 = nm6.a;
        i = v0Var.m;
        if (i != 0) {
        }
        return pVar.z();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00e9 -> B:12:0x0126). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0117 -> B:11:0x0119). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(d0o d0oVar, cg6 cg6Var) {
        w0 w0Var;
        int i;
        List list;
        xqn xqnVar;
        int i2;
        int size;
        Throwable th;
        int i3;
        d0o d0oVar2;
        int i4;
        Object t7oVar;
        wis e;
        int i5;
        xqn xqnVar2;
        d0o d0oVar3;
        if (cg6Var instanceof w0) {
            w0Var = (w0) cg6Var;
            int i6 = w0Var.s;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                w0Var.s = i6 - Integer.MIN_VALUE;
                Object obj = w0Var.q;
                nm6 nm6Var = nm6.a;
                i = w0Var.s;
                if (i != 0) {
                    qgg.h0(obj);
                    List h = u75.h(new Long(1000L), new Long(1000L), new Long(5000L));
                    list = h;
                    xqnVar = new xqn();
                    i2 = 0;
                    size = h.size() + 1;
                    if (i2 < size) {
                    }
                } else if (i == 1) {
                    i3 = w0Var.p;
                    i2 = w0Var.o;
                    i4 = w0Var.n;
                    size = w0Var.m;
                    xqnVar = w0Var.l;
                    list = w0Var.k;
                    d0oVar2 = w0Var.j;
                    try {
                        try {
                            qgg.h0(obj);
                        } catch (CancellationException e2) {
                            throw e2;
                        }
                    } catch (wis e3) {
                        e = e3;
                        r7o r7oVar = z7o.b;
                        t7oVar = new t7o(e);
                        int i7 = i3;
                        i5 = i4;
                        xqnVar2 = xqnVar;
                        d0oVar3 = d0oVar2;
                        if (t7oVar instanceof t7o) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                        int i72 = i3;
                        i5 = i4;
                        xqnVar2 = xqnVar;
                        d0oVar3 = d0oVar2;
                        if (t7oVar instanceof t7o) {
                        }
                    }
                    Object obj2 = ((z7o) obj).a;
                    qgg.h0(obj2);
                    l3o l3oVar = (l3o) obj2;
                    r7o r7oVar3 = z7o.b;
                    t7oVar = l3oVar;
                    int i722 = i3;
                    i5 = i4;
                    xqnVar2 = xqnVar;
                    d0oVar3 = d0oVar2;
                    if (t7oVar instanceof t7o) {
                    }
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = w0Var.n;
                    int i8 = w0Var.m;
                    xqnVar2 = w0Var.l;
                    List list2 = w0Var.k;
                    d0oVar3 = w0Var.j;
                    qgg.h0(obj);
                    list = list2;
                    size = i8;
                    i2 = i5 + 1;
                    d0oVar = d0oVar3;
                    xqnVar = xqnVar2;
                    if (i2 < size) {
                        try {
                        } catch (wis e4) {
                            e = e4;
                            d0oVar2 = d0oVar;
                            i4 = i2;
                            i3 = 0;
                            r7o r7oVar4 = z7o.b;
                            t7oVar = new t7o(e);
                            int i7222 = i3;
                            i5 = i4;
                            xqnVar2 = xqnVar;
                            d0oVar3 = d0oVar2;
                            if (t7oVar instanceof t7o) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            d0oVar2 = d0oVar;
                            i4 = i2;
                            i3 = 0;
                            r7o r7oVar22 = z7o.b;
                            t7oVar = new t7o(th);
                            int i72222 = i3;
                            i5 = i4;
                            xqnVar2 = xqnVar;
                            d0oVar3 = d0oVar2;
                            if (t7oVar instanceof t7o) {
                            }
                        }
                        r7o r7oVar5 = z7o.b;
                        com.yandex.passport.common.network.l lVar = this.b;
                        w0Var.j = d0oVar;
                        w0Var.k = list;
                        w0Var.l = xqnVar;
                        w0Var.m = size;
                        w0Var.n = i2;
                        w0Var.o = i2;
                        w0Var.p = 0;
                        w0Var.s = 1;
                        obj = lVar.g(d0oVar, w0Var);
                        if (obj != nm6Var) {
                            d0oVar2 = d0oVar;
                            i4 = i2;
                            i3 = 0;
                            Object obj22 = ((z7o) obj).a;
                            qgg.h0(obj22);
                            l3o l3oVar2 = (l3o) obj22;
                            r7o r7oVar32 = z7o.b;
                            t7oVar = l3oVar2;
                            int i722222 = i3;
                            i5 = i4;
                            xqnVar2 = xqnVar;
                            d0oVar3 = d0oVar2;
                            if (t7oVar instanceof t7o) {
                                return (l3o) t7oVar;
                            }
                            xqnVar2.a = z7o.a(t7oVar);
                            if (i2 < list.size()) {
                                Throwable th4 = (Throwable) xqnVar2.a;
                                if (!(th4 instanceof IOException)) {
                                    if (th4 == null) {
                                        throw new IOException("Unknown error during checkVpn request");
                                    }
                                    throw th4;
                                }
                                long longValue = ((Number) list.get(i2)).longValue();
                                w0Var.j = d0oVar3;
                                w0Var.k = list;
                                w0Var.l = xqnVar2;
                                w0Var.m = size;
                                w0Var.n = i5;
                                w0Var.o = i2;
                                w0Var.p = i722222;
                                w0Var.s = 2;
                                if (y2x.o(longValue, w0Var) != nm6Var) {
                                    i8 = size;
                                    list2 = list;
                                    list = list2;
                                    size = i8;
                                }
                            }
                            i2 = i5 + 1;
                            d0oVar = d0oVar3;
                            xqnVar = xqnVar2;
                            if (i2 < size) {
                                Throwable th5 = (Throwable) xqnVar.a;
                                if (th5 == null) {
                                    throw new IOException("checkVpn request failed");
                                }
                                throw th5;
                            }
                        }
                        return nm6Var;
                    }
                }
            }
        }
        w0Var = new w0(this, cg6Var);
        Object obj3 = w0Var.q;
        nm6 nm6Var2 = nm6.a;
        i = w0Var.s;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|(1:(1:(6:11|12|13|(3:18|19|20)|15|16)(2:25|26))(2:27|28))(3:32|33|(2:35|31)(1:36))|29))|43|6|7|(0)(0)|29|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        if (r7 != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x002e, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0072, code lost:
    
        r7 = defpackage.z7o.b;
        r7 = new defpackage.t7o(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x002c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0071, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x002a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0069, code lost:
    
        r7 = defpackage.z7o.b;
        r7 = new defpackage.t7o(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // androidx.core.app.n0
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(u0 u0Var, cg6 cg6Var) {
        x0 x0Var;
        int i;
        int i2;
        int i3;
        if (cg6Var instanceof x0) {
            x0Var = (x0) cg6Var;
            int i4 = x0Var.n;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                x0Var.n = i4 - Integer.MIN_VALUE;
                Object obj = x0Var.l;
                nm6 nm6Var = nm6.a;
                i = x0Var.n;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    x0Var.j = 0;
                    x0Var.k = 0;
                    x0Var.n = 1;
                    Object u = u(u0Var, x0Var);
                    if (u == nm6Var) {
                        return nm6Var;
                    }
                    i2 = 0;
                    obj = u;
                    i3 = 0;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        Object t7oVar = (l3o) obj;
                        r7o r7oVar2 = z7o.b;
                        if (!(t7oVar instanceof t7o)) {
                            try {
                                t7oVar = x((l3o) t7oVar);
                            } catch (Throwable th) {
                                r7o r7oVar3 = z7o.b;
                                t7oVar = new t7o(th);
                            }
                        }
                        return new z7o(t7oVar);
                    }
                    i3 = x0Var.k;
                    i2 = x0Var.j;
                    qgg.h0(obj);
                }
                x0Var.j = i2;
                x0Var.k = i3;
                x0Var.n = 2;
                obj = v((d0o) obj, x0Var);
            }
        }
        x0Var = new x0(this, cg6Var);
        Object obj2 = x0Var.l;
        nm6 nm6Var2 = nm6.a;
        i = x0Var.n;
        if (i != 0) {
        }
        x0Var.j = i2;
        x0Var.k = i3;
        x0Var.n = 2;
        obj2 = v((d0o) obj2, x0Var);
    }
}
