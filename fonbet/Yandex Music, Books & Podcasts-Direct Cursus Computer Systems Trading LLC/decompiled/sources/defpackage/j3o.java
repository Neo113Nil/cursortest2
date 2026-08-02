package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class j3o extends e77 {
    public static final Logger f = Logger.getLogger(j3o.class.getName());
    public final l67 b;
    public final InetAddress c;
    public final int d;
    public final boolean e;

    public j3o(p2f p2fVar, l67 l67Var, InetAddress inetAddress, int i) {
        super(p2fVar);
        this.b = l67Var;
        this.c = inetAddress;
        this.d = i;
        this.e = i != i67.a;
    }

    @Override // defpackage.e77
    public final String e() {
        StringBuilder sb = new StringBuilder("Responder(");
        p2f p2fVar = this.a;
        return su4.o(sb, p2fVar != null ? p2fVar.q : "", ")");
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean z = this.e;
        Logger logger = f;
        p2f p2fVar = this.a;
        l67 l67Var = this.b;
        p2fVar.n.lock();
        try {
            if (p2fVar.o == l67Var) {
                p2fVar.o = null;
            }
            p2fVar.n.unlock();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            if (p2fVar.i.d.c.b()) {
                try {
                    for (q67 q67Var : l67Var.d) {
                        if (logger.isLoggable(Level.FINER)) {
                            logger.finer(e() + "run() JmDNS responding to: " + q67Var);
                        }
                        if (z) {
                            hashSet.add(q67Var);
                        }
                        q67Var.p(p2fVar, hashSet2);
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    for (w67 w67Var : l67Var.e) {
                        if ((((long) (50 * w67Var.h)) * 10) + w67Var.i <= currentTimeMillis) {
                            hashSet2.remove(w67Var);
                            if (logger.isLoggable(Level.FINER)) {
                                logger.finer(e() + "JmDNS Responder Known Answer Removed");
                            }
                        }
                    }
                    if (hashSet2.isEmpty()) {
                        return;
                    }
                    if (logger.isLoggable(Level.FINER)) {
                        logger.finer(e() + "run() JmDNS responding");
                    }
                    o67 o67Var = new o67(33792, l67Var.k, !z);
                    if (z) {
                        o67Var.n = new InetSocketAddress(this.c, this.d);
                    }
                    o67Var.a = l67Var.b();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        q67 q67Var2 = (q67) it.next();
                        if (q67Var2 != null) {
                            o67Var = d(o67Var, q67Var2);
                        }
                    }
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        w67 w67Var2 = (w67) it2.next();
                        if (w67Var2 != null) {
                            o67Var = a(o67Var, l67Var, w67Var2);
                        }
                    }
                    if (o67Var.c()) {
                        return;
                    }
                    p2fVar.S0(o67Var);
                } catch (Throwable th) {
                    logger.log(Level.WARNING, e().concat("run() exception "), th);
                    p2fVar.close();
                }
            }
        } catch (Throwable th2) {
            p2fVar.n.unlock();
            throw th2;
        }
    }

    @Override // defpackage.e77
    public final String toString() {
        return e() + " incomming: " + this.b;
    }
}
