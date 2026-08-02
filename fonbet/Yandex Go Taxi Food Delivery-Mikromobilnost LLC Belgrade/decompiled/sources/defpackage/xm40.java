package defpackage;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.a;

/* loaded from: classes10.dex */
public final class xm40 extends o2t0 {
    public final hz40 b = cmm0.b();
    public final ArrayList c = new ArrayList();
    public final iz40 d = dmm0.a();
    public final hz40 e = cmm0.b();
    public final h2t0 f;

    public xm40() {
        sc20 sc20Var = new sc20(16, this);
        q2t0.e(q2t0.a);
        synchronized (q2t0.c) {
            q2t0.h = a.o0(q2t0.h, sc20Var);
        }
        this.f = new h2t0(sc20Var);
    }

    @Override // defpackage.o2t0
    public final void a(ioq0 ioq0Var) {
        this.c.add(new vm40(ioq0Var));
    }

    @Override // defpackage.o2t0
    public final void b() {
        synchronized (this.a) {
            try {
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    wm40 wm40Var = (wm40) arrayList.get(i);
                    if (wm40Var instanceof um40) {
                        ooc.a(this.b, ((um40) wm40Var).a, ((um40) wm40Var).b);
                    } else {
                        if (!(wm40Var instanceof vm40)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ooc.A(this.b, ((vm40) wm40Var).a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c.clear();
    }

    @Override // defpackage.o2t0
    public final void c() {
        this.f.a();
        this.c.clear();
        this.e.h();
        synchronized (this.a) {
            this.b.h();
        }
    }

    @Override // defpackage.o2t0
    public final tls d(ioq0 ioq0Var) {
        hz40 hz40Var = this.e;
        tls tlsVar = (tls) hz40Var.d(ioq0Var);
        if (tlsVar != null) {
            return tlsVar;
        }
        t130 t130Var = new t130(20, this, ioq0Var);
        hz40Var.l(ioq0Var, t130Var);
        return t130Var;
    }

    public final void e(ioq0 ioq0Var, Object obj) {
        this.c.add(new um40(ioq0Var, obj));
    }
}
