package b4;

import C3.e;
import Z3.j;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final long f5551d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f5552e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final j f5553a;

    /* renamed from: b, reason: collision with root package name */
    public long f5554b;

    /* renamed from: c, reason: collision with root package name */
    public int f5555c;

    public d() {
        if (e.f382u == null) {
            Pattern pattern = j.f4273c;
            e.f382u = new e();
        }
        e eVar = e.f382u;
        if (j.f4274d == null) {
            j.f4274d = new j(eVar);
        }
        this.f5553a = j.f4274d;
    }

    public final synchronized boolean a() {
        boolean z8;
        if (this.f5555c != 0) {
            this.f5553a.f4275a.getClass();
            z8 = System.currentTimeMillis() > this.f5554b;
        }
        return z8;
    }

    public final synchronized void b(int i) {
        long min;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.f5555c = 0;
            }
            return;
        }
        this.f5555c++;
        synchronized (this) {
            if (i == 429 || (i >= 500 && i < 600)) {
                double pow = Math.pow(2.0d, this.f5555c);
                this.f5553a.getClass();
                min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f5552e);
            } else {
                min = f5551d;
            }
            this.f5553a.f4275a.getClass();
            this.f5554b = System.currentTimeMillis() + min;
        }
        return;
    }
}
