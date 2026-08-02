package h4;

import c4.e;
import f4.j;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: h4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4577d {

    /* renamed from: d, reason: collision with root package name */
    public static final long f38131d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f38132e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final j f38133a;

    /* renamed from: b, reason: collision with root package name */
    public long f38134b;

    /* renamed from: c, reason: collision with root package name */
    public int f38135c;

    public C4577d() {
        if (e.f5740n == null) {
            Pattern pattern = j.f37471c;
            e.f5740n = new e();
        }
        e eVar = e.f5740n;
        if (j.f37472d == null) {
            j.f37472d = new j(eVar);
        }
        this.f38133a = j.f37472d;
    }

    public final synchronized boolean a() {
        boolean z6;
        if (this.f38135c != 0) {
            this.f38133a.f37473a.getClass();
            z6 = System.currentTimeMillis() > this.f38134b;
        }
        return z6;
    }

    public final synchronized void b(int i) {
        long min;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.f38135c = 0;
            }
            return;
        }
        this.f38135c++;
        synchronized (this) {
            if (i == 429 || (i >= 500 && i < 600)) {
                double pow = Math.pow(2.0d, this.f38135c);
                this.f38133a.getClass();
                min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f38132e);
            } else {
                min = f38131d;
            }
            this.f38133a.f37473a.getClass();
            this.f38134b = System.currentTimeMillis() + min;
        }
        return;
    }
}
