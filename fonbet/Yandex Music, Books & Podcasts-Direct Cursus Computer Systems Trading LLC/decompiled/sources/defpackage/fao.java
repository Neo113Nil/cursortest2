package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class fao extends qo4 {
    public final lao b;
    public long c;
    public final /* synthetic */ x7h d;

    public fao(x7h x7hVar, lao laoVar) {
        this.d = x7hVar;
        this.b = laoVar;
    }

    @Override // defpackage.qo4
    public final void l(long j) {
        if (this.d.o.f != null) {
            return;
        }
        synchronized (this.d.i) {
            try {
                if (this.d.o.f == null) {
                    lao laoVar = this.b;
                    if (!laoVar.b) {
                        long j2 = this.c + j;
                        this.c = j2;
                        x7h x7hVar = this.d;
                        long j3 = x7hVar.t;
                        if (j2 <= j3) {
                            return;
                        }
                        if (j2 > x7hVar.k) {
                            laoVar.c = true;
                        } else {
                            long addAndGet = ((AtomicLong) x7hVar.j.a).addAndGet(j2 - j3);
                            x7h x7hVar2 = this.d;
                            x7hVar2.t = this.c;
                            if (addAndGet > x7hVar2.l) {
                                this.b.c = true;
                            }
                        }
                        lao laoVar2 = this.b;
                        lr1 c = laoVar2.c ? this.d.c(laoVar2) : null;
                        if (c != null) {
                            c.run();
                        }
                    }
                }
            } finally {
            }
        }
    }
}
