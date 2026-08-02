package h;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: e, reason: collision with root package name */
    public static I f37852e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37853a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f37854b;

    /* renamed from: c, reason: collision with root package name */
    public long f37855c;

    /* renamed from: d, reason: collision with root package name */
    public long f37856d;

    public /* synthetic */ I() {
    }

    public static void c(I i, long j6, long j9, int i4) {
        if ((i4 & 1) != 0) {
            j6 = 0;
        }
        if ((i4 & 2) != 0) {
            j9 = 0;
        }
        synchronized (i) {
            try {
                if (j6 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j9 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j10 = i.f37855c + j6;
                i.f37855c = j10;
                long j11 = i.f37856d + j9;
                i.f37856d = j11;
                if (j11 > j10) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(long j6, double d9, double d10) {
        double d11 = (0.01720197f * ((j6 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d11) * 0.03341960161924362d) + d11 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d11) * 0.0053d) + Math.round((r2 - 9.0E-4f) - r6) + 9.0E-4f + ((-d10) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d12 = 0.01745329238474369d * d9;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d12))) / (Math.cos(asin) * Math.cos(d12));
        if (sin3 >= 1.0d) {
            this.f37854b = 1;
            this.f37855c = -1L;
            this.f37856d = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.f37854b = 0;
                this.f37855c = -1L;
                this.f37856d = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f37855c = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f37856d = round;
            if (round >= j6 || this.f37855c <= j6) {
                this.f37854b = 1;
            } else {
                this.f37854b = 0;
            }
        }
    }

    public synchronized long b() {
        return this.f37855c - this.f37856d;
    }

    public String toString() {
        switch (this.f37853a) {
            case 1:
                return "WindowCounter(streamId=" + this.f37854b + ", total=" + this.f37855c + ", acknowledged=" + this.f37856d + ", unacknowledged=" + b() + ')';
            default:
                return super.toString();
        }
    }

    public I(int i) {
        this.f37854b = i;
    }
}
