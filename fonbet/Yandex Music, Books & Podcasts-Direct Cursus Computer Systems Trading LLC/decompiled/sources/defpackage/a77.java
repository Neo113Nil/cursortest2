package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.impl.a;

/* loaded from: classes5.dex */
public abstract class a77 extends e77 {
    public static final Logger d = Logger.getLogger(a77.class.getName());
    public static final int e = 3600;
    public final int b;
    public z67 c;

    public a77(p2f p2fVar, int i) {
        super(p2fVar);
        this.c = null;
        this.b = i;
    }

    public final void f(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d77 d77Var = (d77) it.next();
            synchronized (d77Var) {
                d77Var.S(this);
            }
        }
    }

    public abstract void g();

    public final void h(z67 z67Var) {
        synchronized (this.a) {
            this.a.i.d.a(this, z67Var);
        }
        Iterator it = this.a.g.values().iterator();
        while (it.hasNext()) {
            ((a) ((fkp) it.next())).q.a(this, z67Var);
        }
    }

    public abstract o67 i(o67 o67Var);

    public abstract o67 j(a aVar, o67 o67Var);

    public abstract boolean k();

    public abstract o67 l();

    public abstract String m();

    public abstract void n();

    public final void o() {
        synchronized (this.a) {
            this.a.i.d.c(this);
        }
        Iterator it = this.a.g.values().iterator();
        while (it.hasNext()) {
            ((a) ((fkp) it.next())).q.c(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[Catch: all -> 0x0070, TryCatch #2 {all -> 0x0070, blocks: (B:11:0x0019, B:18:0x0034, B:20:0x0039, B:21:0x0073, B:61:0x0128, B:62:0x012b, B:13:0x0024, B:15:0x002a), top: B:10:0x0019, outer: #4, inners: #1 }] */
    @Override // java.util.TimerTask, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        o67 l = l();
        try {
        } catch (Throwable th) {
            d.log(Level.WARNING, e().concat(".run() exception "), th);
            n();
        }
        if (!k()) {
            cancel();
            return;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.a) {
            try {
                p2f p2fVar = this.a;
                z67 z67Var = this.c;
                z3e z3eVar = p2fVar.i.d;
                z3eVar.lock();
                try {
                    if (z3eVar.b == this) {
                        if (z3eVar.c == z67Var) {
                            z = true;
                            if (z) {
                                d.finer(e() + ".run() JmDNS " + m() + StringUtil.SPACE + this.a.q);
                                arrayList.add(this.a);
                                l = i(l);
                            }
                        }
                    }
                    z = false;
                    if (z) {
                    }
                } finally {
                    z3eVar.unlock();
                }
            } finally {
            }
        }
        Iterator it = this.a.g.values().iterator();
        while (it.hasNext()) {
            a aVar = (a) ((fkp) it.next());
            synchronized (aVar) {
                try {
                    z67 z67Var2 = this.c;
                    gkp gkpVar = aVar.q;
                    gkpVar.lock();
                    try {
                        if (gkpVar.b == this && gkpVar.c == z67Var2) {
                            d.fine(e() + ".run() JmDNS " + m() + StringUtil.SPACE + aVar.f());
                            arrayList.add(aVar);
                            l = j(aVar, l);
                        }
                    } finally {
                    }
                } finally {
                }
            }
        }
        if (l.c()) {
            f(arrayList);
            cancel();
            return;
        }
        d.finer(e() + ".run() JmDNS " + m() + " #" + this.c);
        this.a.S0(l);
        f(arrayList);
        g();
    }
}
