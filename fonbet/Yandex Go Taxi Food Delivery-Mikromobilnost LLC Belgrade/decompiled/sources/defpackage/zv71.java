package defpackage;

import java.io.IOException;
import yads.lj0;
import yads.rj0;

/* loaded from: classes7.dex */
public final class zv71 extends Thread {
    public Exception A;
    public long B = -1;
    public final rj0 a;
    public final ic81 b;
    public final m281 c;
    public final boolean w;
    public final int x;
    public volatile lj0 y;
    public volatile boolean z;

    public zv71(rj0 rj0Var, ic81 ic81Var, m281 m281Var, boolean z, int i, lj0 lj0Var) {
        this.a = rj0Var;
        this.b = ic81Var;
        this.c = m281Var;
        this.w = z;
        this.x = i;
        this.y = lj0Var;
    }

    public final void a(long j, float f, long j2) {
        this.c.a = j2;
        this.c.b = f;
        if (j != this.B) {
            this.B = j;
            lj0 lj0Var = this.y;
            if (lj0Var != null) {
                lj0Var.obtainMessage(10, (int) (j >> 32), (int) j, this).sendToTarget();
            }
        }
    }

    public final void b(boolean z) {
        if (z) {
            this.y = null;
        }
        if (this.z) {
            return;
        }
        this.z = true;
        this.b.cancel();
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.w) {
                this.b.remove();
            } else {
                long j = -1;
                int i = 0;
                while (!this.z) {
                    try {
                        this.b.a(this);
                        break;
                    } catch (IOException e) {
                        if (!this.z) {
                            long j2 = this.c.a;
                            if (j2 != j) {
                                i = 0;
                                j = j2;
                            }
                            int i2 = i + 1;
                            if (i2 > this.x) {
                                throw e;
                            }
                            Thread.sleep(Math.min(i * 1000, 5000));
                            i = i2;
                        }
                    }
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e2) {
            this.A = e2;
        }
        lj0 lj0Var = this.y;
        if (lj0Var != null) {
            lj0Var.obtainMessage(9, this).sendToTarget();
        }
    }
}
