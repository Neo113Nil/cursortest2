package defpackage;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes5.dex */
public final class kq5 extends bz2 {
    public final boolean d;

    public kq5(que queVar, boolean z) {
        super((Object) queVar, 7, false);
        this.d = z;
    }

    @Override // defpackage.bz2
    public final void A(byte b) {
        if (this.d) {
            zdt zdtVar = aet.b;
            G(String.valueOf(b & 255));
        } else {
            zdt zdtVar2 = aet.b;
            E(String.valueOf(b & 255));
        }
    }

    @Override // defpackage.bz2
    public final void C(int i) {
        if (this.d) {
            get getVar = het.b;
            G(Long.toString(i & 4294967295L, 10));
        } else {
            get getVar2 = het.b;
            E(Long.toString(i & 4294967295L, 10));
        }
    }

    @Override // defpackage.bz2
    public final void D(long j) {
        boolean z = this.d;
        int i = 63;
        String str = CommonUrlParts.Values.FALSE_INTEGER;
        if (z) {
            met metVar = net.b;
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / 5;
                    long j3 = 10;
                    cArr[63] = Character.forDigit((int) (j - (j2 * j3)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % j3), 10);
                        j2 /= j3;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            G(str);
            return;
        }
        met metVar2 = net.b;
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j4 = (j >>> 1) / 5;
                long j5 = 10;
                cArr2[63] = Character.forDigit((int) (j - (j4 * j5)), 10);
                while (j4 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j4 % j5), 10);
                    j4 /= j5;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        E(str);
    }

    @Override // defpackage.bz2
    public final void F(short s) {
        if (this.d) {
            tet tetVar = uet.b;
            G(String.valueOf(s & 65535));
        } else {
            tet tetVar2 = uet.b;
            E(String.valueOf(s & 65535));
        }
    }
}
