package c8;

/* loaded from: classes2.dex */
public final class f extends M.h {

    /* renamed from: v, reason: collision with root package name */
    public final boolean f5770v;

    public f(G1.a aVar, boolean z8) {
        super(aVar);
        this.f5770v = z8;
    }

    @Override // M.h
    public final void f(byte b9) {
        if (this.f5770v) {
            n(String.valueOf(b9 & 255));
        } else {
            k(String.valueOf(b9 & 255));
        }
    }

    @Override // M.h
    public final void i(int i) {
        if (this.f5770v) {
            n(Long.toString(4294967295L & i, 10));
        } else {
            k(Long.toString(4294967295L & i, 10));
        }
    }

    @Override // M.h
    public final void j(long j9) {
        int i = 63;
        String str = "0";
        if (this.f5770v) {
            if (j9 != 0) {
                if (j9 > 0) {
                    str = Long.toString(j9, 10);
                } else {
                    char[] cArr = new char[64];
                    long j10 = (j9 >>> 1) / 5;
                    long j11 = 10;
                    cArr[63] = Character.forDigit((int) (j9 - (j10 * j11)), 10);
                    while (j10 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j10 % j11), 10);
                        j10 /= j11;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            n(str);
            return;
        }
        if (j9 != 0) {
            if (j9 > 0) {
                str = Long.toString(j9, 10);
            } else {
                char[] cArr2 = new char[64];
                long j12 = (j9 >>> 1) / 5;
                long j13 = 10;
                cArr2[63] = Character.forDigit((int) (j9 - (j12 * j13)), 10);
                while (j12 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j12 % j13), 10);
                    j12 /= j13;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        k(str);
    }

    @Override // M.h
    public final void m(short s3) {
        if (this.f5770v) {
            n(String.valueOf(s3 & 65535));
        } else {
            k(String.valueOf(s3 & 65535));
        }
    }
}
