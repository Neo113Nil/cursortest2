package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public abstract class wyd {
    public final m78 a;

    public wyd(long j, m78 m78Var) {
        this.a = m78Var;
        long j2 = m78Var.a;
        if (j2 != 0) {
            int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        }
        if (j2 == 0) {
            m78Var.a = j;
        }
    }

    public final void a(wyd wydVar) {
        wydVar.getClass();
        m78 m78Var = wydVar.a;
        d(((AtomicInteger) m78Var.d).get(), ((AtomicLong) m78Var.b).get(), ((AtomicLong) m78Var.c).get());
        b(wydVar.e(), 0);
    }

    public abstract boolean b(uno unoVar, int i);

    public abstract int c();

    public final void d(int i, long j, long j2) {
        m78 m78Var = this.a;
        ((AtomicLong) m78Var.b).getAndAdd(j);
        ((AtomicLong) m78Var.c).getAndAdd(j2);
        ((AtomicInteger) m78Var.d).getAndAdd(i);
    }

    public abstract uno e();
}
