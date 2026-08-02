package defpackage;

import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.impl.a;

/* loaded from: classes5.dex */
public final class hkp extends e77 {
    public static final Logger e = Logger.getLogger(hkp.class.getName());
    public int b;
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hkp(p2f p2fVar, a aVar) {
        this(p2fVar);
        this.c = 0;
        this.d = aVar;
        aVar.q.a = this.a;
        p2f p2fVar2 = this.a;
        q67 s = q67.s(aVar.f(), y67.TYPE_ANY, x67.CLASS_IN, false);
        h67 h67Var = p2fVar2.f;
        long currentTimeMillis = System.currentTimeMillis();
        p2fVar2.c.add(aVar);
        for (j67 j67Var : h67Var.e(s.c().toLowerCase())) {
            if (j67Var != null && j67Var.d() == s.d() && s.j(j67Var) && s.c().equals(j67Var.c()) && !j67Var.h(currentTimeMillis)) {
                aVar.x(h67Var, currentTimeMillis, j67Var);
            }
        }
    }

    @Override // java.util.TimerTask
    public boolean cancel() {
        switch (this.c) {
            case 0:
                boolean cancel = super.cancel();
                a aVar = (a) this.d;
                if (!aVar.p) {
                    this.a.c.remove(aVar);
                }
                return cancel;
            default:
                return super.cancel();
        }
    }

    @Override // defpackage.e77
    public final String e() {
        switch (this.c) {
            case 0:
                StringBuilder sb = new StringBuilder("ServiceInfoResolver(");
                p2f p2fVar = this.a;
                return su4.o(sb, p2fVar != null ? p2fVar.q : "", ")");
            default:
                StringBuilder sb2 = new StringBuilder("ServiceResolver(");
                p2f p2fVar2 = this.a;
                return su4.o(sb2, p2fVar2 != null ? p2fVar2.q : "", ")");
        }
    }

    public final o67 f(o67 o67Var) {
        switch (this.c) {
            case 0:
                a aVar = (a) this.d;
                if (!aVar.j()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    p2f p2fVar = this.a;
                    h67 h67Var = p2fVar.f;
                    h67 h67Var2 = p2fVar.f;
                    String f = aVar.f();
                    y67 y67Var = y67.TYPE_SRV;
                    x67 x67Var = x67.CLASS_IN;
                    o67Var = b(b(o67Var, (w67) h67Var.d(f, y67Var, x67Var), currentTimeMillis), (w67) h67Var2.d(aVar.f(), y67.TYPE_TXT, x67Var), currentTimeMillis);
                    if (aVar.t().length() > 0) {
                        Iterator it = h67Var2.f(aVar.t(), y67.TYPE_A, x67Var).iterator();
                        while (it.hasNext()) {
                            o67Var = b(o67Var, (w67) ((j67) it.next()), currentTimeMillis);
                        }
                        Iterator it2 = h67Var2.f(aVar.t(), y67.TYPE_AAAA, x67.CLASS_IN).iterator();
                        while (it2.hasNext()) {
                            o67Var = b(o67Var, (w67) ((j67) it2.next()), currentTimeMillis);
                        }
                        break;
                    }
                }
                break;
            default:
                long currentTimeMillis2 = System.currentTimeMillis();
                for (fkp fkpVar : this.a.g.values()) {
                    o67Var = b(o67Var, new t67(fkpVar.i(), x67.CLASS_IN, false, 3600, fkpVar.f()), currentTimeMillis2);
                }
                break;
        }
        return o67Var;
    }

    public final o67 g(o67 o67Var) {
        switch (this.c) {
            case 0:
                a aVar = (a) this.d;
                if (aVar.j()) {
                    return o67Var;
                }
                String f = aVar.f();
                y67 y67Var = y67.TYPE_SRV;
                x67 x67Var = x67.CLASS_IN;
                o67 d = d(d(o67Var, q67.s(f, y67Var, x67Var, false)), q67.s(aVar.f(), y67.TYPE_TXT, x67Var, false));
                return aVar.t().length() > 0 ? d(d(d, q67.s(aVar.t(), y67.TYPE_A, x67Var, false)), q67.s(aVar.t(), y67.TYPE_AAAA, x67Var, false)) : d;
            default:
                return d(o67Var, q67.s((String) this.d, y67.TYPE_PTR, x67.CLASS_IN, false));
        }
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        String concat;
        Logger logger = e;
        p2f p2fVar = this.a;
        try {
            if (!p2fVar.L0() && !p2fVar.K0()) {
                int i = this.b;
                this.b = i + 1;
                if (i >= 3) {
                    cancel();
                    return;
                }
                if (logger.isLoggable(Level.FINER)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(e());
                    sb.append(".run() JmDNS ");
                    switch (this.c) {
                        case 0:
                            a aVar = (a) this.d;
                            concat = "querying service info: ".concat(aVar != null ? aVar.f() : "null");
                            break;
                        default:
                            concat = "querying service";
                            break;
                    }
                    sb.append(concat);
                    logger.finer(sb.toString());
                }
                o67 g = g(new o67(0));
                if (p2fVar.i.d.c.b()) {
                    g = f(g);
                }
                if (g.c()) {
                    return;
                }
                p2fVar.S0(g);
                return;
            }
            cancel();
        } catch (Throwable th) {
            logger.log(Level.WARNING, e().concat(".run() exception "), th);
            p2fVar.O0();
        }
    }

    @Override // defpackage.e77
    public final String toString() {
        return e() + " count: " + this.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hkp(p2f p2fVar, String str) {
        this(p2fVar);
        this.c = 1;
        this.d = str;
    }

    public hkp(p2f p2fVar) {
        super(p2fVar);
        this.b = 0;
    }
}
