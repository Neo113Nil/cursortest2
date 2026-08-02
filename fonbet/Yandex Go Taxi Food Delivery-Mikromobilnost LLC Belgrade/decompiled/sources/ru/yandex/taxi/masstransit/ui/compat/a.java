package ru.yandex.taxi.masstransit.ui.compat;

import androidx.compose.ui.viewinterop.b;
import defpackage.aii0;
import defpackage.aj31;
import defpackage.bts;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.fo1;
import defpackage.m1a0;
import defpackage.o430;
import defpackage.rx3;
import defpackage.tls;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, m1a0 m1a0Var, boolean z, aj31 aj31Var, fid fidVar, int i, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1534747083);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.e(m1a0Var) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z2 = z;
            i3 |= btsVar.a(z2) ? 256 : 128;
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i3 |= (i & 4096) == 0 ? btsVar.k(aj31Var) : btsVar.e(aj31Var) ? 2048 : 1024;
            }
            boolean z4 = true;
            if (btsVar.V(i3 & 1, (i3 & 1171) == 1170)) {
                btsVar.Y();
                z3 = z2;
            } else {
                boolean z5 = i4 != 0 ? false : z2;
                int i5 = i3 & 8190;
                aj31Var.getClass();
                btsVar.e0(881367124);
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                if (Q == o430Var) {
                    Q = ViewCompositePaymentIconsCompat$invoke$1$1.a;
                    btsVar.o0(Q);
                }
                tls tlsVar = (tls) Q;
                boolean e = ((((i3 & 896) ^ 384) > 256 && btsVar.a(z5)) || (i3 & 384) == 256) | btsVar.e(m1a0Var);
                if ((((i3 & 7168) ^ HProv.ALG_TYPE_SECURECHANNEL) <= 2048 || !btsVar.k(aj31Var)) && (i3 & HProv.ALG_TYPE_SECURECHANNEL) != 2048) {
                    z4 = false;
                }
                boolean z6 = e | z4;
                Object Q2 = btsVar.Q();
                if (z6 || Q2 == o430Var) {
                    Q2 = new rx3(z5, m1a0Var, aj31Var, 20);
                    btsVar.o0(Q2);
                }
                b.a(tlsVar, f530Var, (tls) Q2, btsVar, ((i5 << 3) & 112) | 6, 0);
                btsVar.t(false);
                z3 = z5;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new fo1(f530Var, m1a0Var, z3, aj31Var, i, i2, 1);
                return;
            }
            return;
        }
        z2 = z;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
        }
        boolean z42 = true;
        if (btsVar.V(i3 & 1, (i3 & 1171) == 1170)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }
}
