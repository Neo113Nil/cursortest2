package defpackage;

import com.yandex.go.design.compose.check.CheckSize;
import com.yandex.go.design.compose.check.CheckState;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class xkb1 {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(CheckState checkState, f530 f530Var, CheckSize checkSize, sls slsVar, boolean z, fid fidVar, int i, int i2) {
        int i3;
        sls slsVar2;
        int i4;
        boolean z2;
        sls slsVar3;
        CheckSize checkSize2;
        aii0 v;
        boolean z3;
        CheckSize checkSize3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1399177801);
        if ((i & 6) == 0) {
            i3 = (btsVar.c(checkState.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.k(f530Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.c(checkSize == null ? -1 : checkSize.ordinal()) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            slsVar2 = slsVar;
            i3 |= btsVar.e(slsVar2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                z2 = z;
                i3 |= btsVar.a(z2) ? 16384 : 8192;
                if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
                    if (i5 != 0) {
                        checkSize3 = CheckSize.M;
                        z3 = true;
                    } else {
                        z3 = true;
                        checkSize3 = checkSize;
                    }
                    sls slsVar4 = i6 != 0 ? null : slsVar2;
                    boolean z4 = i4 != 0 ? z3 : z2;
                    boolean k = btsVar.k(sy2.a(btsVar));
                    Object Q = btsVar.Q();
                    if (k || Q == did.a) {
                        Q = q8h.a;
                        btsVar.o0(Q);
                    }
                    ((q8h) Q).a(checkState, f530Var, checkSize3, slsVar4, z4, btsVar, i3 & 65534);
                    checkSize2 = checkSize3;
                    slsVar3 = slsVar4;
                    z2 = z4;
                } else {
                    btsVar.Y();
                    slsVar3 = slsVar2;
                    checkSize2 = checkSize;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new egb(checkState, f530Var, checkSize2, slsVar3, z2, i, i2, 0);
                    return;
                }
                return;
            }
            z2 = z;
            if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        slsVar2 = slsVar;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void b(boolean z, f530 f530Var, CheckSize checkSize, boolean z2, fid fidVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z3;
        CheckSize checkSize2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2131052724);
        int i6 = (btsVar.a(z) ? 4 : 2) | i;
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 = i6 | 48;
        } else {
            i3 = i6 | (btsVar.k(f530Var) ? 32 : 16);
        }
        int i8 = i3 | 384;
        if ((i2 & 8) != 0) {
            i4 = i3 | 3456;
        } else {
            i4 = (btsVar.e(null) ? 2048 : 1024) | i8;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i5 = i4 | HProv.ALG_CLASS_DATA_ENCRYPT;
        } else {
            i5 = i4 | (btsVar.a(z2) ? 16384 : 8192);
        }
        if (btsVar.V(i5 & 1, (i5 & 9363) != 9362)) {
            if (i7 != 0) {
                f530Var = c530.a;
            }
            CheckSize checkSize3 = CheckSize.M;
            boolean z4 = i9 == 0 ? z2 : true;
            f530 f530Var3 = f530Var;
            a(z ? CheckState.Checked : CheckState.Unchecked, f530Var3, checkSize3, null, z4, btsVar, i5 & 65520, 0);
            f530Var2 = f530Var3;
            checkSize2 = checkSize3;
            z3 = z4;
        } else {
            btsVar.Y();
            z3 = z2;
            checkSize2 = checkSize;
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fgb(z, f530Var2, checkSize2, z3, i, i2);
        }
    }

    public static final void c(uyx0 uyx0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-101469298);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(uyx0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            ded.a.getClass();
            cx20.a(null, null, null, null, null, false, false, ded.b, wwg.S(-1442988260, true, new ays0(11, uyx0Var, tlsVar), btsVar), btsVar, 113246208, HProv.PP_VERSION_TIMESTAMP);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new scx0(uyx0Var, tlsVar, i, 3);
        }
    }
}
