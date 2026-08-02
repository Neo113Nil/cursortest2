package defpackage;

import java.util.Collections;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class ssm {
    public final Object a = new Object();
    public final PriorityQueue b = new PriorityQueue(10, Collections.reverseOrder());
    public int c = Integer.MIN_VALUE;

    public final void a(int i) {
        synchronized (this.a) {
            this.b.add(Integer.valueOf(i));
            this.c = Math.max(this.c, i);
        }
    }

    public final void b() {
        synchronized (this.a) {
            while (this.c != -4000) {
                try {
                    this.a.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(int i) {
        synchronized (this.a) {
            try {
                int i2 = this.c;
                if (i2 != i) {
                    throw new rsm("Priority too low [priority=" + i + ", highest=" + i2 + "]");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(int i) {
        int intValue;
        synchronized (this.a) {
            this.b.remove(Integer.valueOf(i));
            if (this.b.isEmpty()) {
                intValue = Integer.MIN_VALUE;
            } else {
                Integer num = (Integer) this.b.peek();
                int i2 = dvt.a;
                intValue = num.intValue();
            }
            this.c = intValue;
            this.a.notifyAll();
        }
    }
}
