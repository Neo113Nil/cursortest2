package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.ybsdk.core.transfer.utils.domain.entities.AgreementImageEntity;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes11.dex */
public abstract class zsb1 {
    public static final void a(f360 f360Var, CharSequence charSequence, CharSequence charSequence2, fid fidVar, int i) {
        bts btsVar;
        a S;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(878862684);
        int i2 = i | (btsVar2.k(f360Var) ? 4 : 2) | (btsVar2.e(charSequence) ? 32 : 16) | (btsVar2.e(charSequence2) ? 256 : 128);
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            byk0 c = cyk0.c(6.0f);
            f530 b = m4m0.b(ymb1.l(c530.a, cyk0.c(16.0f)), ((el51) btsVar2.m(gl51.a)).g(), qke.q);
            if (f360Var == null) {
                btsVar2.e0(77950196);
                btsVar2.t(false);
                S = null;
            } else {
                btsVar2.e0(77950197);
                S = wwg.S(-1708604900, true, new iu30(20, c, f360Var), btsVar2);
                btsVar2.t(false);
            }
            btsVar = btsVar2;
            web1.c(b, 0.0f, false, 0.0f, null, S, wwg.S(-1133408704, true, new zga(charSequence, charSequence2, 8), btsVar2), null, null, null, null, null, false, btsVar, 1572864, 0, 8094);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t240(f360Var, charSequence, charSequence2, i, 17);
        }
    }

    public static final void b(t0f t0fVar, tls tlsVar, f530 f530Var, boolean z, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1612891835);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(t0fVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.a(z) ? 2048 : 1024;
        }
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            c530 c530Var = c530.a;
            ydb1.a(c530Var, null, wwg.S(-1752651766, true, new ota(13, t0fVar), btsVar), null, wwg.S(1373097616, true, new sp5(t0fVar, tlsVar), btsVar), null, null, false, btsVar, ((i3 >> 6) & 14) | 24960, MSException.ERROR_MORE_DATA);
            if (z) {
                btsVar.e0(1863557609);
                yrl.c(null, null, btsVar, 0, 7);
                btsVar.t(false);
            } else {
                btsVar.e0(1863586439);
                btsVar.t(false);
            }
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0(t0fVar, tlsVar, f530Var2, z, i, 7);
        }
    }

    public static final void c(f360 f360Var, CharSequence charSequence, CharSequence charSequence2, i360 i360Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-122517415);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f360Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(charSequence) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(charSequence2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(i360Var) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            xab1.a(null, null, wwg.S(2027930031, true, new r5y(charSequence, charSequence2, f360Var, i360Var, 10), btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 7);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ(f360Var, charSequence, charSequence2, i360Var, i, 24);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(i360 i360Var, d360 d360Var, boolean z, boolean z2, wls wlsVar, fid fidVar, int i, int i2) {
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        bts btsVar;
        boolean z5;
        boolean z6;
        aii0 v;
        c530 c530Var;
        float f;
        boolean z7;
        boolean z8;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(230931558);
        dmw0 dmw0Var = btsVar2.a;
        if ((i & 6) == 0) {
            i3 = (btsVar2.k(i360Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.k(d360Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z3 = z;
            i3 |= btsVar2.a(z3) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                z4 = z2;
                i3 |= btsVar2.a(z4) ? 2048 : 1024;
                if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    i3 |= btsVar2.e(wlsVar) ? 16384 : 8192;
                }
                if (btsVar2.V(i3 & 1, (i3 & 9363) != 9362)) {
                    boolean z9 = i5 != 0 ? true : z3;
                    boolean z10 = i4 != 0 ? false : z4;
                    c530 c530Var2 = c530.a;
                    f530 k = an91.k(c530Var2, 16.0f);
                    sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    f530 d = b.d(btsVar2, k);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar);
                    } else {
                        btsVar2.r0();
                    }
                    wls wlsVar2 = d.f;
                    qje.W(btsVar2, wlsVar2, a);
                    wls wlsVar3 = d.e;
                    qje.W(btsVar2, wlsVar3, o);
                    wls wlsVar4 = d.g;
                    if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar2, hashCode, wlsVar4);
                    }
                    wls wlsVar5 = d.d;
                    qje.W(btsVar2, wlsVar5, d);
                    boolean z11 = (d360Var.e == null || z10) ? false : true;
                    int i6 = i3 & 112;
                    boolean a2 = (i6 == 32) | btsVar2.a(z11);
                    Object Q = btsVar2.Q();
                    o430 o430Var = did.a;
                    if (a2 || Q == o430Var) {
                        Q = new xz3(z11, d360Var, 11);
                        btsVar2.o0(Q);
                    }
                    f530 a3 = fnq0.a(c530Var2, (tls) Q);
                    boolean z12 = i6 == 32;
                    int i7 = i3 & HProv.ALG_CLASS_ALL;
                    boolean z13 = z12 | (i7 == 16384);
                    Object Q2 = btsVar2.Q();
                    if (z13 || Q2 == o430Var) {
                        Q2 = new g360(d360Var, wlsVar, 1);
                        btsVar2.o0(Q2);
                    }
                    f530 d2 = q791.d(a3, z11, null, null, (sls) Q2, 14);
                    z910 d3 = pi6.d(x4c.b, false);
                    boolean z14 = z9;
                    int hashCode2 = Long.hashCode(btsVar2.T);
                    r1b0 o2 = btsVar2.o();
                    f530 d4 = b.d(btsVar2, d2);
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, wlsVar2, d3);
                    qje.W(btsVar2, wlsVar3, o2);
                    if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode2))) {
                        b64.z(hashCode2, btsVar2, hashCode2, wlsVar4);
                    }
                    qje.W(btsVar2, wlsVar5, d4);
                    if (z14) {
                        btsVar2.e0(-542211754);
                        c530Var = c530Var2;
                        btsVar = btsVar2;
                        f = 16.0f;
                        c(d360Var.a, d360Var.b, d360Var.c, i360Var, btsVar, (i3 << 9) & 7168);
                        z7 = false;
                        btsVar.t(false);
                    } else {
                        c530Var = c530Var2;
                        btsVar = btsVar2;
                        f = 16.0f;
                        z7 = false;
                        btsVar.e0(-541943046);
                        a(d360Var.a, d360Var.b, d360Var.c, btsVar, 0);
                        btsVar.t(false);
                    }
                    btsVar.t(true);
                    if (d360Var.d.isEmpty()) {
                        z8 = z10;
                        btsVar.e0(-786669370);
                        btsVar.t(z7);
                    } else {
                        tse0.s(btsVar, -786979773, c530Var, f, btsVar);
                        bts btsVar3 = btsVar;
                        z8 = z10;
                        psb1.b(ljs0.c(c530Var, 1.0f), 8.0f, d360Var.d, z8, wlsVar, btsVar3, (i3 & 7168) | 54 | i7, 0);
                        btsVar = btsVar3;
                        btsVar.t(z7);
                    }
                    btsVar.t(true);
                    z6 = z8;
                    z5 = z14;
                } else {
                    btsVar = btsVar2;
                    btsVar.Y();
                    z5 = z3;
                    z6 = z4;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new o360(i360Var, d360Var, z5, z6, wlsVar, i, i2);
                    return;
                }
                return;
            }
            z4 = z2;
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            }
            if (btsVar2.V(i3 & 1, (i3 & 9363) != 9362)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        z3 = z;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z4 = z2;
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        if (btsVar2.V(i3 & 1, (i3 & 9363) != 9362)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final sl e(gl1 gl1Var) {
        String str = gl1Var.a;
        String str2 = gl1Var.b;
        String str3 = gl1Var.c;
        AgreementImageEntity agreementImageEntity = gl1Var.d;
        return new sl(str, str2, str3, com.ybsdk.feature.transfer.version2.api.mappers.a.j(agreementImageEntity != null ? agreementImageEntity.getBottomSheetImage() : null), null, null, null);
    }
}
