package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class ym7 implements hgg {
    public static final rj7 o = new rj7(3);
    public final sld a;
    public final l0e b;
    public final xeg c;
    public x0 f;
    public osh g;
    public Handler h;
    public yzd i;
    public h0e j;
    public Uri k;
    public xzd l;
    public boolean m;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public final HashMap d = new HashMap();
    public long n = -9223372036854775807L;

    public ym7(sld sldVar, xeg xegVar, l0e l0eVar) {
        this.a = sldVar;
        this.b = l0eVar;
        this.c = xegVar;
    }

    public final xzd a(boolean z, Uri uri) {
        HashMap hashMap = this.d;
        xzd xzdVar = ((xm7) hashMap.get(uri)).d;
        if (xzdVar != null && z) {
            if (!uri.equals(this.k)) {
                List list = this.j.e;
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    }
                    if (uri.equals(((g0e) list.get(i)).a)) {
                        xzd xzdVar2 = this.l;
                        if (xzdVar2 == null || !xzdVar2.o) {
                            this.k = uri;
                            xm7 xm7Var = (xm7) hashMap.get(uri);
                            xzd xzdVar3 = xm7Var.d;
                            if (xzdVar3 == null || !xzdVar3.o) {
                                xm7Var.f(b(uri));
                            } else {
                                this.l = xzdVar3;
                                this.i.B(xzdVar3);
                            }
                        }
                    } else {
                        i++;
                    }
                }
            }
            xm7 xm7Var2 = (xm7) hashMap.get(uri);
            xzd xzdVar4 = xm7Var2.d;
            if (!xm7Var2.k) {
                xm7Var2.k = true;
                if (xzdVar4 != null && !xzdVar4.o) {
                    xm7Var2.c(true);
                }
            }
        }
        return xzdVar;
    }

    public final Uri b(Uri uri) {
        tzd tzdVar;
        xzd xzdVar = this.l;
        if (xzdVar == null || !xzdVar.v.e || (tzdVar = (tzd) xzdVar.t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(tzdVar.b));
        int i = tzdVar.c;
        if (i != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return buildUpon.build();
    }

    public final boolean c(Uri uri) {
        int i;
        xm7 xm7Var = (xm7) this.d.get(uri);
        if (xm7Var.d == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000L, dvt.m0(xm7Var.d.u));
        xzd xzdVar = xm7Var.d;
        return xzdVar.o || (i = xzdVar.d) == 2 || i == 1 || xm7Var.e + max > elapsedRealtime;
    }

    @Override // defpackage.hgg
    public final void d(jgg jggVar, long j, long j2, boolean z) {
        d8k d8kVar = (d8k) jggVar;
        long j3 = d8kVar.a;
        nb7 nb7Var = d8kVar.b;
        ngr ngrVar = d8kVar.d;
        cfg cfgVar = new cfg(nb7Var, ngrVar.c, ngrVar.d, j2, ngrVar.b);
        this.c.getClass();
        this.f.L(cfgVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.hgg
    public final void g(jgg jggVar, long j, long j2) {
        h0e h0eVar;
        d8k d8kVar = (d8k) jggVar;
        i0e i0eVar = (i0e) d8kVar.f;
        boolean z = i0eVar instanceof xzd;
        if (z) {
            String str = i0eVar.a;
            h0e h0eVar2 = h0e.l;
            Uri parse = Uri.parse(str);
            bsc bscVar = new bsc();
            bscVar.a = CommonUrlParts.Values.FALSE_INTEGER;
            bscVar.l = l5i.p("application/x-mpegURL");
            List singletonList = Collections.singletonList(new g0e(parse, new dsc(bscVar), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            h0eVar = new h0e("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            h0eVar = (h0e) i0eVar;
        }
        this.j = h0eVar;
        this.k = ((g0e) h0eVar.e.get(0)).a;
        this.e.add(new wm7(this));
        List list2 = h0eVar.d;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Uri uri = (Uri) list2.get(i);
            this.d.put(uri, new xm7(this, uri));
        }
        nb7 nb7Var = d8kVar.b;
        ngr ngrVar = d8kVar.d;
        cfg cfgVar = new cfg(nb7Var, ngrVar.c, ngrVar.d, j2, ngrVar.b);
        xm7 xm7Var = (xm7) this.d.get(this.k);
        if (z) {
            xm7Var.h((xzd) i0eVar, cfgVar);
        } else {
            xm7Var.c(false);
        }
        this.c.getClass();
        this.f.M(cfgVar, 4);
    }

    @Override // defpackage.hgg
    public final void o(jgg jggVar, long j, long j2, int i) {
        cfg cfgVar;
        d8k d8kVar = (d8k) jggVar;
        if (i == 0) {
            long j3 = d8kVar.a;
            cfgVar = new cfg(d8kVar.b);
        } else {
            long j4 = d8kVar.a;
            nb7 nb7Var = d8kVar.b;
            ngr ngrVar = d8kVar.d;
            cfgVar = new cfg(nb7Var, ngrVar.c, ngrVar.d, j2, ngrVar.b);
        }
        this.f.R(cfgVar, d8kVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // defpackage.hgg
    public final mdr v(jgg jggVar, long j, long j2, IOException iOException, int i) {
        d8k d8kVar = (d8k) jggVar;
        long j3 = d8kVar.a;
        nb7 nb7Var = d8kVar.b;
        ngr ngrVar = d8kVar.d;
        cfg cfgVar = new cfg(nb7Var, ngrVar.c, ngrVar.d, j2, ngrVar.b);
        int i2 = d8kVar.c;
        long C = this.c.C(new j4x(iOException, i, 9));
        boolean z = C == -9223372036854775807L;
        this.f.P(cfgVar, i2, iOException, z);
        return z ? osh.m : new mdr(0, C, false);
    }
}
