package z7;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import x7.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final long f9172d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f9173e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final k f9174a;

    /* renamed from: b, reason: collision with root package name */
    public long f9175b;

    /* renamed from: c, reason: collision with root package name */
    public int f9176c;

    public d() {
        if (u7.d.f6723g == null) {
            Pattern pattern = k.f8396c;
            u7.d.f6723g = new u7.d();
        }
        u7.d dVar = u7.d.f6723g;
        if (k.f8397d == null) {
            k.f8397d = new k(dVar);
        }
        this.f9174a = k.f8397d;
    }

    public final synchronized boolean a() {
        boolean z10;
        if (this.f9176c != 0) {
            this.f9174a.f8398a.getClass();
            z10 = System.currentTimeMillis() > this.f9175b;
        }
        return z10;
    }

    public final synchronized void b(int i10) {
        long min;
        if ((i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404) {
            synchronized (this) {
                this.f9176c = 0;
            }
            return;
        }
        this.f9176c++;
        synchronized (this) {
            if (i10 == 429 || (i10 >= 500 && i10 < 600)) {
                double pow = Math.pow(2.0d, this.f9176c);
                this.f9174a.getClass();
                min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f9173e);
            } else {
                min = f9172d;
            }
            this.f9174a.f8398a.getClass();
            this.f9175b = System.currentTimeMillis() + min;
        }
        return;
    }
}
