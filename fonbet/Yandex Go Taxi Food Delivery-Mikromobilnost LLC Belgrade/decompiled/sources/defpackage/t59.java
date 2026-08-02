package defpackage;

import java.net.URL;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class t59 {
    public long a;
    public int b;
    public final Object c;

    public t59() {
        if (ums.b == null) {
            Pattern pattern = bx21.b;
            ums.b = new ums(10);
        }
        ums umsVar = ums.b;
        if (bx21.c == null) {
            bx21.c = new bx21(umsVar);
        }
        this.c = bx21.c;
    }

    public synchronized boolean a() {
        boolean z;
        if (this.b != 0) {
            ((bx21) this.c).a.getClass();
            z = System.currentTimeMillis() > this.a;
        }
        return z;
    }

    public synchronized void b(int i) {
        long min;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.b = 0;
            }
            return;
        }
        this.b++;
        synchronized (this) {
            if (i != 429 && (i < 500 || i >= 600)) {
                min = 86400000;
                ((bx21) this.c).a.getClass();
                this.a = System.currentTimeMillis() + min;
            }
            double pow = Math.pow(2.0d, this.b);
            ((bx21) this.c).getClass();
            min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), 1800000.0d);
            ((bx21) this.c).a.getClass();
            this.a = System.currentTimeMillis() + min;
        }
        return;
    }

    public t59(int i, URL url, long j) {
        this.b = i;
        this.c = url;
        this.a = j;
    }
}
