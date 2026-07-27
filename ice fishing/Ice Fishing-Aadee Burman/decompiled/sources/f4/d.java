package f4;

import a4.e;
import d4.k;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final long f37507d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f37508e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final k f37509a;

    /* renamed from: b, reason: collision with root package name */
    public long f37510b;

    /* renamed from: c, reason: collision with root package name */
    public int f37511c;

    public d() {
        if (e.f4348u == null) {
            Pattern pattern = k.f37070c;
            e.f4348u = new e();
        }
        e eVar = e.f4348u;
        if (k.f37071d == null) {
            k.f37071d = new k(eVar);
        }
        this.f37509a = k.f37071d;
    }

    public final synchronized boolean a() {
        boolean z3;
        if (this.f37511c != 0) {
            this.f37509a.f37072a.getClass();
            z3 = System.currentTimeMillis() > this.f37510b;
        }
        return z3;
    }

    public final synchronized void b(int i) {
        long min;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.f37511c = 0;
            }
            return;
        }
        this.f37511c++;
        synchronized (this) {
            if (i == 429 || (i >= 500 && i < 600)) {
                double pow = Math.pow(2.0d, this.f37511c);
                this.f37509a.getClass();
                min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f37508e);
            } else {
                min = f37507d;
            }
            this.f37509a.f37072a.getClass();
            this.f37510b = System.currentTimeMillis() + min;
        }
        return;
    }
}
