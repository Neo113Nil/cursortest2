package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class qxj {
    public txj a;
    public Long d;
    public int e;
    public volatile aqd b = new aqd(12);
    public aqd c = new aqd(12);
    public final HashSet f = new HashSet();

    public qxj(txj txjVar) {
        this.a = txjVar;
    }

    public final void a(xxj xxjVar) {
        if (d() && !xxjVar.d) {
            xxjVar.T();
        } else if (!d() && xxjVar.d) {
            xxjVar.d = false;
            s76 s76Var = xxjVar.e;
            if (s76Var != null) {
                xxjVar.f.a(s76Var);
                xxjVar.g.J(2, "Subchannel unejected: {0}", xxjVar);
            }
        }
        xxjVar.c = this;
        this.f.add(xxjVar);
    }

    public final void b(long j) {
        this.d = Long.valueOf(j);
        this.e++;
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((xxj) it.next()).T();
        }
    }

    public final long c() {
        return ((AtomicLong) this.c.c).get() + ((AtomicLong) this.c.b).get();
    }

    public final boolean d() {
        return this.d != null;
    }

    public final void e() {
        o2g.U("not currently ejected", this.d != null);
        this.d = null;
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            xxj xxjVar = (xxj) it.next();
            xxjVar.d = false;
            s76 s76Var = xxjVar.e;
            if (s76Var != null) {
                xxjVar.f.a(s76Var);
                xxjVar.g.J(2, "Subchannel unejected: {0}", xxjVar);
            }
        }
    }

    public final String toString() {
        return "AddressTracker{subchannels=" + this.f + '}';
    }
}
