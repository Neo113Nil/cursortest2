package g8;

/* loaded from: classes2.dex */
public final class e extends L3.h {

    /* renamed from: v, reason: collision with root package name */
    public final boolean f37713v;

    public e(G1.a aVar, boolean z3) {
        super(aVar);
        this.f37713v = z3;
    }

    @Override // L3.h
    public final void g(byte b9) {
        if (this.f37713v) {
            o(String.valueOf(b9 & 255));
        } else {
            l(String.valueOf(b9 & 255));
        }
    }

    @Override // L3.h
    public final void i(int i) {
        if (this.f37713v) {
            o(Long.toString(4294967295L & i, 10));
        } else {
            l(Long.toString(4294967295L & i, 10));
        }
    }

    @Override // L3.h
    public final void k(long j6) {
        int i = 63;
        String str = "0";
        if (this.f37713v) {
            if (j6 != 0) {
                if (j6 > 0) {
                    str = Long.toString(j6, 10);
                } else {
                    char[] cArr = new char[64];
                    long j9 = (j6 >>> 1) / 5;
                    long j10 = 10;
                    cArr[63] = Character.forDigit((int) (j6 - (j9 * j10)), 10);
                    while (j9 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j9 % j10), 10);
                        j9 /= j10;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            o(str);
            return;
        }
        if (j6 != 0) {
            if (j6 > 0) {
                str = Long.toString(j6, 10);
            } else {
                char[] cArr2 = new char[64];
                long j11 = (j6 >>> 1) / 5;
                long j12 = 10;
                cArr2[63] = Character.forDigit((int) (j6 - (j11 * j12)), 10);
                while (j11 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j11 % j12), 10);
                    j11 /= j12;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        l(str);
    }

    @Override // L3.h
    public final void m(short s9) {
        if (this.f37713v) {
            o(String.valueOf(s9 & 65535));
        } else {
            l(String.valueOf(s9 & 65535));
        }
    }
}
