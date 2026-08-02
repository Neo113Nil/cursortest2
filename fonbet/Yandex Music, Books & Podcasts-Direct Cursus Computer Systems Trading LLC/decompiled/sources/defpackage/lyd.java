package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class lyd {
    public final String a;

    public lyd(String str) {
        str.getClass();
        this.a = str;
    }

    public abstract void a(int i, int i2);

    public abstract void b(int i);

    public final void c(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        long millis = timeUnit.toMillis(j);
        b(millis > 2147483647L ? Integer.MAX_VALUE : millis < -2147483648L ? Integer.MIN_VALUE : (int) millis);
    }

    public int d(wyd wydVar) {
        wydVar.getClass();
        return 0;
    }

    public abstract boolean e(int i, int i2, int i3);

    public abstract long f();

    public abstract wyd g();
}
