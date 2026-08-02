package defpackage;

import androidx.compose.foundation.layout.FlowLayoutOverflow$OverflowType;
import androidx.compose.ui.layout.o;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class uqr {
    public final int a;
    public final zqr b;
    public final long c;
    public final int d;
    public final int e;

    public uqr(int i, zqr zqrVar, long j, int i2, int i3) {
        this.a = i;
        this.b = zqrVar;
        this.c = j;
        this.d = i2;
        this.e = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final sqr a(tqr tqrVar, boolean z, int i, int i2, int i3, int i4) {
        sqr sqrVar;
        x910 x910Var;
        s5w s5wVar;
        o oVar;
        if (tqrVar.b) {
            zqr zqrVar = this.b;
            int i5 = yqr.a[zqrVar.a.ordinal()];
            boolean z2 = true;
            if (i5 != 1 && i5 != 2) {
                if (i5 != 3 && i5 != 4) {
                    w511.b();
                    return null;
                }
                if (z) {
                    x910Var = zqrVar.b;
                    s5wVar = zqrVar.f;
                    oVar = zqrVar.c;
                } else {
                    x910Var = (i < -1 || i2 < 0) ? null : zqrVar.d;
                    s5wVar = zqrVar.g;
                    oVar = zqrVar.e;
                }
                if (x910Var != null) {
                    sqrVar = new sqr(x910Var, oVar, s5wVar.a);
                    if (sqrVar != null) {
                        if (i < 0 || (i4 != 0 && (i3 - ((int) (sqrVar.c >> 32)) < 0 || i4 >= this.a))) {
                            z2 = false;
                        }
                        sqrVar.d = z2;
                        return sqrVar;
                    }
                }
            }
            sqrVar = null;
            if (sqrVar != null) {
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x005a, code lost:
    
        if ((((int) (r22 >> 32)) - ((int) (r5 >> 32))) < 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tqr b(boolean z, int i, long j, s5w s5wVar, int i2, int i3, int i4, boolean z2, boolean z3) {
        long j2;
        int i5 = i3 + i4;
        if (s5wVar == null) {
            return new tqr(true, true);
        }
        long j3 = s5wVar.a;
        zqr zqrVar = this.b;
        if (zqrVar.a != FlowLayoutOverflow$OverflowType.Visible && (i2 >= Integer.MAX_VALUE || ((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - ((int) (j3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) < 0)) {
            return new tqr(true, true);
        }
        int i6 = this.d;
        int i7 = this.e;
        long j4 = this.c;
        int i8 = this.a;
        if (i != 0) {
            if (i >= i8) {
                j2 = 4294967295L;
            } else {
                j2 = 4294967295L;
            }
            return z2 ? new tqr(true, true) : new tqr(true, b(z, 0, s5w.a(n8e.i(j4), (((int) (j & j2)) - i7) - i4), new s5w(s5w.a(((int) (j3 >> 32)) - i6, (int) (j3 & j2))), i2 + 1, i5, 0, true, false).b);
        }
        j2 = 4294967295L;
        int i9 = (int) (j3 & j2);
        int max = Math.max(i4, i9) + i3;
        s5w a = z3 ? null : zqrVar.a(i2, max, z);
        if (a == null || (i + 1 < i8 && ((((int) (j >> 32)) - ((int) (j3 >> 32))) - i6) - ((int) (a.a >> 32)) >= 0)) {
            return new tqr(false, false);
        }
        if (z3) {
            return new tqr(true, true);
        }
        boolean z4 = b(false, 0, s5w.a(n8e.i(j4), (((int) (j & j2)) - i7) - Math.max(i4, i9)), a, i2 + 1, max, 0, true, true).b;
        return new tqr(z4, z4);
    }
}
