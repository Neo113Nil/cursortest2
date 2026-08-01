package h;

/* renamed from: h.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4540H {

    /* renamed from: e, reason: collision with root package name */
    public static C4540H f37826e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37827a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f37828b;

    /* renamed from: c, reason: collision with root package name */
    public long f37829c;

    /* renamed from: d, reason: collision with root package name */
    public long f37830d;

    public /* synthetic */ C4540H() {
    }

    public static void c(C4540H c4540h, long j6, long j9, int i) {
        if ((i & 1) != 0) {
            j6 = 0;
        }
        if ((i & 2) != 0) {
            j9 = 0;
        }
        synchronized (c4540h) {
            try {
                if (j6 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j9 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j10 = c4540h.f37829c + j6;
                c4540h.f37829c = j10;
                long j11 = c4540h.f37830d + j9;
                c4540h.f37830d = j11;
                if (j11 > j10) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(long j6, double d2, double d9) {
        double d10 = (0.01720197f * ((j6 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d10) * 0.03341960161924362d) + d10 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d10) * 0.0053d) + Math.round((r2 - 9.0E-4f) - r6) + 9.0E-4f + ((-d9) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d11 = 0.01745329238474369d * d2;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d11))) / (Math.cos(asin) * Math.cos(d11));
        if (sin3 >= 1.0d) {
            this.f37828b = 1;
            this.f37829c = -1L;
            this.f37830d = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.f37828b = 0;
                this.f37829c = -1L;
                this.f37830d = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f37829c = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f37830d = round;
            if (round >= j6 || this.f37829c <= j6) {
                this.f37828b = 1;
            } else {
                this.f37828b = 0;
            }
        }
    }

    public synchronized long b() {
        return this.f37829c - this.f37830d;
    }

    public String toString() {
        switch (this.f37827a) {
            case 1:
                return "WindowCounter(streamId=" + this.f37828b + ", total=" + this.f37829c + ", acknowledged=" + this.f37830d + ", unacknowledged=" + b() + ')';
            default:
                return super.toString();
        }
    }

    public C4540H(int i) {
        this.f37828b = i;
    }
}
