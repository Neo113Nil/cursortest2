package defpackage;

import com.yandex.go.scooters.qr.api.ScootersQrNumberResultSource;

/* loaded from: classes5.dex */
public abstract class w3b1 {
    public static final void a(y4v y4vVar, f530 f530Var, f530 f530Var2, fid fidVar, int i, int i2) {
        f530 f530Var3;
        long a;
        ldc ldcVar;
        long j;
        bts btsVar = (bts) fidVar;
        btsVar.g0(895830876);
        int i3 = (btsVar.k(y4vVar) ? 4 : 2) | i;
        int i4 = i3 | 48;
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 = i3 | 432;
        } else if ((i & 384) == 0) {
            i4 |= btsVar.k(f530Var2) ? 256 : 128;
        }
        if (btsVar.V(i4 & 1, (i4 & 147) != 146)) {
            c530 c530Var = c530.a;
            if (i5 != 0) {
                f530Var2 = c530Var;
            }
            b5v b5vVar = y4vVar.b;
            if (b5vVar == null) {
                btsVar.e0(-1228951469);
                btsVar.t(false);
                ldcVar = null;
            } else {
                btsVar.e0(-1228951468);
                if (b5vVar instanceof z4v) {
                    btsVar.e0(1165616399);
                    btsVar.t(false);
                    a = ((z4v) b5vVar).a;
                } else {
                    if (!(b5vVar instanceof a5v)) {
                        throw unr0.y(1165614048, btsVar, false);
                    }
                    btsVar.e0(1165618777);
                    a = rx21.a(qj51.b, btsVar);
                    btsVar.t(false);
                }
                btsVar.t(false);
                ldcVar = new ldc(a);
            }
            if (ldcVar == null) {
                btsVar.e0(1900026690);
                j = ((el51) btsVar.m(gl51.a)).c();
                btsVar.t(false);
            } else {
                btsVar.e0(1900018537);
                btsVar.t(false);
                j = ldcVar.a;
            }
            y7m y7mVar = y4vVar.c;
            u3b1.g(c530Var, 0.0f, j, y7mVar != null ? y7mVar.a : 12.0f, wwg.S(1451064386, true, new nfj(16, y4vVar, f530Var2), btsVar), btsVar, 24582, 2);
            f530Var3 = c530Var;
        } else {
            btsVar.Y();
            f530Var3 = f530Var;
        }
        f530 f530Var4 = f530Var2;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new v4(y4vVar, f530Var3, f530Var4, i, i2, 15);
        }
    }

    public static final String c(ScootersQrNumberResultSource scootersQrNumberResultSource) {
        int i = uko0.a[scootersQrNumberResultSource.ordinal()];
        if (i == 1) {
            return "qr";
        }
        if (i == 2) {
            return "entered_number";
        }
        if (i == 3) {
            return "qr_unavailable_scooter";
        }
        w511.b();
        return null;
    }

    public abstract ldc b();
}
