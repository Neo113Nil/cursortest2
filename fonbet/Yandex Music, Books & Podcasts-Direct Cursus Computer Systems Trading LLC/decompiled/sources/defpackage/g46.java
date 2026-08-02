package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class g46 {
    public final c5p a;
    public volatile int c;
    public volatile boolean e;
    public volatile boolean f;
    public volatile eom b = new eom(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7);
    public volatile int d = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public g46(c5p c5pVar) {
        this.a = c5pVar;
    }

    public final synchronized f46 a(eom eomVar) {
        try {
            if (!eomVar.equals(this.b)) {
                this.b = eomVar;
                this.d = ((AtomicInteger) this.a.b).getAndIncrement();
            }
            this.c++;
        } catch (Throwable th) {
            throw th;
        }
        return new f46(this.c, this.d);
    }

    public final boolean b() {
        return this.d == -1 || this.e || this.f;
    }

    public final boolean c(int i) {
        return !(this.c == i);
    }

    public final boolean d() {
        return this.f;
    }
}
