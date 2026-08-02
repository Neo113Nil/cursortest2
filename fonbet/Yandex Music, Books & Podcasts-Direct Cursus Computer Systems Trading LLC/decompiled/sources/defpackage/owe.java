package defpackage;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public final class owe implements pue {
    public final sue a;
    public final String b;
    public final wvo c;
    public final aqd d;
    public final to4 e;
    public final ScheduledExecutorService f;
    public final lte g;
    public final kkp h;
    public final zc4 i;
    public final vq6 j;
    public final lwe k;
    public volatile List l;
    public lzb m;
    public final hhr n;
    public rjp o;
    public rjp p;
    public s8h q;
    public kwe t;
    public volatile kwe u;
    public sgr w;
    public final ArrayList r = new ArrayList();
    public final fwe s = new fwe(this, 0);
    public volatile s76 v = s76.a(r76.d);

    public owe(List list, String str, wvo wvoVar, is3 is3Var, ScheduledExecutorService scheduledExecutorService, yqr yqrVar, vq6 vq6Var, aqd aqdVar, lte lteVar, kkp kkpVar, jd4 jd4Var, sue sueVar, zc4 zc4Var) {
        o2g.O(list, "addressGroups");
        o2g.J("addressGroups is empty", !list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o2g.O(it.next(), "addressGroups contains null entry");
        }
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.l = unmodifiableList;
        lwe lweVar = new lwe();
        lweVar.a = unmodifiableList;
        this.k = lweVar;
        this.b = str;
        this.c = wvoVar;
        this.e = is3Var;
        this.f = scheduledExecutorService;
        this.n = (hhr) yqrVar.get();
        this.j = vq6Var;
        this.d = aqdVar;
        this.g = lteVar;
        this.h = kkpVar;
        o2g.O(jd4Var, "channelTracer");
        o2g.O(sueVar, "logId");
        this.a = sueVar;
        o2g.O(zc4Var, "channelLogger");
        this.i = zc4Var;
    }

    public static void e(owe oweVar, r76 r76Var) {
        oweVar.j.e();
        oweVar.h(s76.a(r76Var));
    }

    public static void g(owe oweVar) {
        SocketAddress socketAddress;
        d6e d6eVar;
        lwe lweVar = oweVar.k;
        vq6 vq6Var = oweVar.j;
        vq6Var.e();
        o2g.U("Should have no reconnectTask scheduled", oweVar.o == null);
        if (lweVar.b == 0 && lweVar.c == 0) {
            hhr hhrVar = oweVar.n;
            hhrVar.a = false;
            hhrVar.b();
        }
        SocketAddress socketAddress2 = (SocketAddress) ((reb) lweVar.a.get(lweVar.b)).a.get(lweVar.c);
        if (socketAddress2 instanceof d6e) {
            d6eVar = (d6e) socketAddress2;
            socketAddress = d6eVar.b;
        } else {
            socketAddress = socketAddress2;
            d6eVar = null;
        }
        xu1 xu1Var = ((reb) lweVar.a.get(lweVar.b)).b;
        String str = (String) xu1Var.a.get(reb.d);
        so4 so4Var = new so4();
        so4Var.a = "unknown-authority";
        so4Var.b = xu1.b;
        if (str == null) {
            str = oweVar.b;
        }
        o2g.O(str, "authority");
        so4Var.a = str;
        so4Var.b = xu1Var;
        so4Var.c = d6eVar;
        nwe nweVar = new nwe();
        nweVar.n = oweVar.a;
        kwe kweVar = new kwe(oweVar.e.b0(socketAddress, so4Var, nweVar), oweVar.h);
        nweVar.n = kweVar.a();
        lte.a(oweVar.g.d, kweVar);
        oweVar.t = kweVar;
        oweVar.r.add(kweVar);
        Runnable d = kweVar.d(new r0o(oweVar, kweVar));
        if (d != null) {
            vq6Var.b(d);
        }
        oweVar.i.J(2, "Started transport {0}", nweVar.n);
    }

    public static String i(sgr sgrVar) {
        StringBuilder sb = new StringBuilder();
        rgr rgrVar = sgrVar.a;
        Throwable th = sgrVar.c;
        sb.append(rgrVar);
        String str = sgrVar.b;
        if (str != null) {
            sb.append("(");
            sb.append(str);
            sb.append(")");
        }
        if (th != null) {
            sb.append("[");
            sb.append(th);
            sb.append("]");
        }
        return sb.toString();
    }

    @Override // defpackage.pue
    public final sue a() {
        return this.a;
    }

    public final void h(s76 s76Var) {
        this.j.e();
        if (this.v.a != s76Var.a) {
            o2g.U("Cannot transition out of SHUTDOWN to " + s76Var, this.v.a != r76.e);
            this.v = s76Var;
            ((beg) this.d.b).a(s76Var);
        }
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.n(this.a.c, "logId");
        Y.q(this.l, "addressGroups");
        return Y.toString();
    }
}
