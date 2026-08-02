package defpackage;

import java.util.TreeSet;

/* loaded from: classes7.dex */
public final class r371 {
    public final long a;
    public final TreeSet b = new TreeSet(new uw21(5));
    public long c;

    public r371(long j) {
        this.a = j;
    }

    public final void a(l291 l291Var, long j) {
        while (this.c + j > this.a && !this.b.isEmpty()) {
            c871 c871Var = (c871) this.b.first();
            z171 z171Var = (z171) l291Var;
            synchronized (z171Var) {
                z171Var.h(c871Var);
            }
        }
    }
}
