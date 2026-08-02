package defpackage;

import android.net.Uri;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Hashtable;

/* loaded from: classes3.dex */
public class gt1 extends cjq {
    public final String a;
    public final int b;
    public final nsh d;
    public final int c = 300000;
    public final Hashtable e = new Hashtable();
    public final int f = Integer.MAX_VALUE;

    public gt1(nsh nshVar, String str, int i) {
        this.d = nshVar;
        this.a = str;
        this.b = i;
    }

    public static String e(Uri uri, int i, String str, int i2) {
        String str2;
        if (str != null) {
            str2 = str + StringUtils.PROCESS_POSTFIX_DELIMITER + i2;
        } else {
            str2 = "";
        }
        if (str != null) {
            str2 = str + StringUtils.PROCESS_POSTFIX_DELIMITER + i2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri.getScheme());
        sb.append("//");
        sb.append(uri.getHost());
        sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        sb.append(i);
        return su4.o(sb, "?proxy=", str2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:55:0x00ff
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // defpackage.cjq
    public defpackage.piq b(defpackage.pr1 r15) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt1.b(pr1):piq");
    }

    @Override // defpackage.cjq
    public final void d(qr1 qr1Var) {
        if (((Hashtable) qr1Var.a.b).get("socket-owner") != this) {
            return;
        }
        try {
            dt1 dt1Var = qr1Var.e;
            dt1Var.s(new ix6(8, dt1Var));
            dt1Var.h(null);
            boolean z = true;
            dt1Var.c(new tr1(dt1Var, 1));
            if (qr1Var.j == null && qr1Var.e.isOpen()) {
                nr1 nr1Var = qr1Var.f;
                String str = nr1Var.l;
                String p = nr1Var.i.p("Connection");
                if (p == null ? kzm.a(str) == kzm.b : "keep-alive".equalsIgnoreCase(p)) {
                    kzm kzmVar = kzm.b;
                    String p2 = qr1Var.b.c.p("Connection");
                    if (p2 != null) {
                        z = "keep-alive".equalsIgnoreCase(p2);
                    }
                    if (z) {
                        qr1Var.b.getClass();
                        j(qr1Var.e, qr1Var.b);
                    }
                }
                qr1Var.b.getClass();
                qr1Var.e.d(null);
                qr1Var.e.close();
            }
            qr1Var.b.getClass();
            qr1Var.e.d(null);
            qr1Var.e.close();
        } finally {
            i(qr1Var.b);
        }
    }

    public final et1 f(String str) {
        Hashtable hashtable = this.e;
        et1 et1Var = (et1) hashtable.get(str);
        if (et1Var != null) {
            return et1Var;
        }
        et1 et1Var2 = new et1();
        et1Var2.b = new ay0();
        et1Var2.c = new ay0();
        hashtable.put(str, et1Var2);
        return et1Var2;
    }

    public final int g(Uri uri) {
        if (uri.getScheme() == null || !uri.getScheme().equals(this.a)) {
            return -1;
        }
        return uri.getPort() == -1 ? this.b : uri.getPort();
    }

    public final void h(String str) {
        Hashtable hashtable = this.e;
        et1 et1Var = (et1) hashtable.get(str);
        if (et1Var == null) {
            return;
        }
        ay0 ay0Var = et1Var.c;
        while (!ay0Var.isEmpty()) {
            ft1 ft1Var = (ft1) ay0Var.a[(ay0Var.c - 1) & (r3.length - 1)];
            dt1 dt1Var = ft1Var.a;
            if (ft1Var.b + this.c > System.currentTimeMillis()) {
                break;
            }
            ay0Var.removeFirst();
            dt1Var.d(null);
            dt1Var.close();
        }
        if (et1Var.a == 0 && et1Var.b.isEmpty() && ay0Var.isEmpty()) {
            hashtable.remove(str);
        }
    }

    public final void i(sr1 sr1Var) {
        Uri uri = sr1Var.b;
        String e = e(uri, g(uri), sr1Var.f, sr1Var.g);
        synchronized (this) {
            try {
                et1 et1Var = (et1) this.e.get(e);
                if (et1Var == null) {
                    return;
                }
                et1Var.a--;
                while (et1Var.a < this.f && et1Var.b.size() > 0) {
                    pr1 pr1Var = (pr1) et1Var.b.removeFirst();
                    piq piqVar = pr1Var.d;
                    if (!piqVar.isCancelled()) {
                        piqVar.f(b(pr1Var));
                    }
                }
                h(e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(dt1 dt1Var, sr1 sr1Var) {
        ay0 ay0Var;
        if (dt1Var == null) {
            return;
        }
        Uri uri = sr1Var.b;
        String e = e(uri, g(uri), sr1Var.f, sr1Var.g);
        ft1 ft1Var = new ft1();
        ft1Var.b = System.currentTimeMillis();
        ft1Var.a = dt1Var;
        synchronized (this) {
            ay0Var = f(e).c;
            ay0Var.addFirst(ft1Var);
        }
        dt1Var.d(new kkp(this, ay0Var, ft1Var, e));
    }

    public m56 k(pr1 pr1Var, Uri uri, int i, boolean z, mr1 mr1Var) {
        return mr1Var;
    }
}
