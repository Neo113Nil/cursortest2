package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.b64;
import defpackage.evu0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public final class Wp {
    public final Xp a;
    public final Object b = new Object();
    public volatile NetworkTask c;

    public Wp(Xp xp) {
        this.a = xp;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r5 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bp a(C0922zp c0922zp, C0864xp c0864xp, long j) {
        String str;
        String a = AbstractC0230bq.a(c0864xp.h);
        Map map = c0864xp.i.a;
        String str2 = c0922zp.j;
        String str3 = e().l;
        if (!AbstractC0230bq.a(AbstractC0230bq.a(str2))) {
            str2 = AbstractC0230bq.a(AbstractC0230bq.a(str3)) ? str3 : null;
        }
        String str4 = e().a;
        if (str4 != null) {
            str = evu0.J(str4) ? null : str4;
        }
        str = c0922zp.h;
        Ep ep = new Ep(c0922zp.b);
        String str5 = c0922zp.i;
        ep.o = this.a.i.currentTimeSeconds();
        ep.a = e().d;
        ep.c = c0922zp.d;
        ep.f = c0922zp.c;
        ep.g = c0864xp.e;
        ep.b = c0922zp.e;
        ep.d = c0922zp.f;
        ep.e = c0922zp.g;
        ep.h = c0922zp.n;
        ep.i = c0922zp.o;
        ep.j = str2;
        ep.k = a;
        this.a.k.getClass();
        HashMap a2 = AbstractC0230bq.a(str2);
        ep.q = Or.a(map) ? Or.a((Map) a2) : a2.equals(map);
        ep.l = AbstractC0230bq.a(map);
        ep.r = c0922zp.m;
        ep.n = c0922zp.k;
        ep.s = c0922zp.p;
        ep.p = true;
        ep.t = j;
        C0864xp d = d();
        if (d.n == 0) {
            d.n = j;
        }
        ep.u = d.n;
        ep.v = false;
        ep.w = c0922zp.q;
        ep.x = c0922zp.r;
        ep.y = c0922zp.s;
        ep.z = c0922zp.t;
        ep.A = c0922zp.u;
        ep.B = c0922zp.v;
        return new Bp(str, str5, new Fp(ep));
    }

    public final void b(Bp bp) {
        this.a.l.a(bp);
        Ap ap = this.a.g;
        ap.b.a(bp.a);
        ap.b.b(bp.b);
        bs bsVar = ap.b.a;
        bs.a(bsVar.a);
        bs.a(bsVar.b);
        ap.a.save(bp.c);
        this.a.e.a(bp);
    }

    public final NetworkTask c() {
        NetworkTask networkTask;
        synchronized (this.b) {
            try {
                if (g()) {
                    networkTask = this.c;
                    if (networkTask != null) {
                        if (networkTask.isRemoved()) {
                        }
                    }
                    networkTask = Gg.a(this, d());
                    this.c = networkTask;
                } else {
                    networkTask = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return networkTask;
    }

    public final C0864xp d() {
        return (C0864xp) this.a.l.a();
    }

    public final Bp e() {
        Bp bp;
        C0286dp c0286dp = this.a.l;
        synchronized (c0286dp) {
            bp = c0286dp.c.a;
        }
        return bp;
    }

    public final void f() {
        Bp bp;
        C0286dp c0286dp = this.a.l;
        synchronized (c0286dp) {
            bp = c0286dp.c.a;
        }
        Fp fp = bp.c;
        Ep a = fp.a(fp.m);
        String str = bp.a;
        String str2 = bp.b;
        String str3 = this.a.m.a().id;
        if (str3 == null || (StringUtils.isNotNullOrEmpty(bp.d) && !str3.equals(bp.d))) {
            Cm.a.reportError((str3 == null ? "null_uuid" : "wrong_uuid").concat("_on_service"), b64.l("The only true uuid: ", str3, "; backup uuid: ", bp.d));
        }
        if (str3 == null) {
            str3 = bp.d;
        }
        a.a = str3;
        String str4 = bp.a;
        if (str4 == null || str4.length() == 0) {
            str = this.a.h.a();
            str2 = "";
        }
        List<String> list = this.a.c.e;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        a.g = list;
        Bp bp2 = new Bp(str, str2, new Fp(a));
        b(bp2);
        a(bp2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g() {
        boolean z;
        boolean z2 = false;
        if (Jb.I.h().isRestrictedForSdk()) {
            return false;
        }
        Bp e = e();
        Set set = AbstractC0893yp.a;
        if (!e.x) {
            if (AbstractC0893yp.b.currentTimeSeconds() <= e.p + e.A.a) {
                z = false;
                if (!z) {
                    if (AbstractC0893yp.a(e.d) && AbstractC0893yp.a(e.a) && AbstractC0893yp.a(e.b)) {
                        z2 = true;
                    }
                    z = !z2;
                    C0785v4 c0785v4 = this.a.k;
                    Map map = d().h;
                    C0698s4 c0698s4 = this.a.j;
                    c0785v4.getClass();
                    boolean a = C0785v4.a(map, e, c0698s4);
                    if (z2 && !a) {
                        return true;
                    }
                }
                return z;
            }
        }
        z = true;
        if (!z) {
        }
        return z;
    }

    public final Context b() {
        return this.a.a;
    }

    public final K5 a() {
        return this.a.f;
    }

    public final boolean a(List<String> list, Map<String, String> map) {
        return !AbstractC0893yp.a(e(), list, map, new Vp(this));
    }

    public final void a(Bp bp) {
        ArrayList arrayList;
        Xp xp = this.a;
        C0200ap c0200ap = xp.d;
        String str = xp.b;
        synchronized (c0200ap.a.b) {
            try {
                C0258cp c0258cp = c0200ap.a;
                c0258cp.c = bp;
                Collection collection = (Collection) c0258cp.a.a.get(str);
                if (collection == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(collection);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC0517lp) it.next()).a(bp);
        }
    }

    public final void a(EnumC0315ep enumC0315ep) {
        ArrayList arrayList;
        this.c = null;
        Xp xp = this.a;
        C0200ap c0200ap = xp.d;
        String str = xp.f.a;
        Bp e = e();
        synchronized (c0200ap.a.b) {
            try {
                Collection collection = (Collection) c0200ap.a.a.a.get(str);
                if (collection == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(collection);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC0517lp) it.next()).a(enumC0315ep, e);
        }
    }

    public final void a(C0806vp c0806vp) {
        this.a.l.a(c0806vp);
        C0864xp d = d();
        if (d.k) {
            List list = d.j;
            if (list != null && !list.isEmpty()) {
                if (Or.a(list, d.e)) {
                    return;
                }
                Bp e = e();
                Fp fp = e.c;
                Ep a = fp.a(fp.m);
                String str = e.a;
                String str2 = e.b;
                a.g = list;
                Bp bp = new Bp(str, str2, new Fp(a));
                b(bp);
                a(bp);
                return;
            }
            if (d.e == null || !(!r5.isEmpty())) {
                return;
            }
            Bp e2 = e();
            Fp fp2 = e2.c;
            Ep a2 = fp2.a(fp2.m);
            String str3 = e2.a;
            String str4 = e2.b;
            a2.g = null;
            Bp bp2 = new Bp(str3, str4, new Fp(a2));
            b(bp2);
            a(bp2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0922zp c0922zp, C0864xp c0864xp, Map<String, ? extends List<String>> map) {
        Long l;
        if (!Or.a((Map) map)) {
            List list = (List) CollectionUtils.getFromMapIgnoreCase(map, "Date");
            if (!Or.a((Collection) list)) {
                try {
                    l = Long.valueOf(new SimpleDateFormat("E, d MMM yyyy HH:mm:ss z", Locale.US).parse((String) list.get(0)).getTime());
                } catch (Throwable unused) {
                }
                long longValue = l == null ? l.longValue() : 0L;
                AbstractC0544mn.a.a(longValue, c0922zp.l);
                Bp a = a(c0922zp, c0864xp, longValue);
                this.c = null;
                b(a);
                a(a);
            }
        }
        l = null;
        if (l == null) {
        }
        AbstractC0544mn.a.a(longValue, c0922zp.l);
        Bp a2 = a(c0922zp, c0864xp, longValue);
        this.c = null;
        b(a2);
        a(a2);
    }
}
