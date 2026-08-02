package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.window.e;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public abstract class za2 {
    public static final eae0 a = new eae0(true, false, 14);

    public static final void a(final boolean z, final sls slsVar, f530 f530Var, long j, oip0 oip0Var, eae0 eae0Var, ehr0 ehr0Var, long j2, float f, final a aVar, fid fidVar, final int i) {
        sls slsVar2;
        final f530 f530Var2;
        final long j3;
        final oip0 oip0Var2;
        final eae0 eae0Var2;
        final ehr0 ehr0Var2;
        final long j4;
        final float f2;
        long floatToRawIntBits;
        int i2;
        eae0 eae0Var3;
        float f3;
        oip0 oip0Var3;
        ehr0 ehr0Var3;
        long j5;
        f530 f530Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1725609375);
        int i3 = i | (btsVar.a(z) ? 4 : 2);
        if ((i & 48) == 0) {
            slsVar2 = slsVar;
            i3 |= btsVar.e(slsVar2) ? 32 : 16;
        } else {
            slsVar2 = slsVar;
        }
        int i4 = i3 | 910896512;
        if (btsVar.V(i4 & 1, (306783379 & i4) != 306783378)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & Float.floatToRawIntBits(0.0f));
                oip0 o = pw91.o(btsVar);
                float f4 = ek10.a;
                ehr0 b = zir0.b(hn10.c, btsVar);
                long d = dgc.d(hn10.a, btsVar);
                i2 = i4 & (-33087489);
                float f5 = ek10.a;
                c530 c530Var = c530.a;
                eae0Var3 = a;
                f3 = f5;
                oip0Var3 = o;
                ehr0Var3 = b;
                j5 = d;
                f530Var3 = c530Var;
            } else {
                btsVar.Y();
                i2 = i4 & (-33087489);
                f530Var3 = f530Var;
                floatToRawIntBits = j;
                oip0Var3 = oip0Var;
                eae0Var3 = eae0Var;
                ehr0Var3 = ehr0Var;
                j5 = j2;
                f3 = f;
            }
            btsVar.u();
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new sz40(Boolean.FALSE);
                btsVar.o0(Q);
            }
            sz40 sz40Var = (sz40) Q;
            sz40Var.b(Boolean.valueOf(z));
            if (((Boolean) sz40Var.b.getValue()).booleanValue() || ((Boolean) sz40Var.c.getValue()).booleanValue()) {
                btsVar.e0(1165888662);
                Object Q2 = btsVar.Q();
                if (Q2 == o430Var) {
                    Q2 = f.j(new jw01(jw01.b));
                    btsVar.o0(Q2);
                }
                oz40 oz40Var = (oz40) Q2;
                fwi fwiVar = (fwi) btsVar.m(j.h);
                boolean k = btsVar.k(fwiVar);
                Object Q3 = btsVar.Q();
                if (k || Q3 == o430Var) {
                    Q3 = new gnm(floatToRawIntBits, fwiVar, new va2(0, oz40Var));
                    btsVar.o0(Q3);
                }
                e.a((gnm) Q3, slsVar2, eae0Var3, wwg.S(-917492520, true, new wa2(f530Var3, sz40Var, oz40Var, oip0Var3, ehr0Var3, j5, f3, aVar), btsVar), btsVar, (i2 & 112) | 3456, 0);
            } else {
                btsVar.e0(1163094787);
            }
            btsVar.t(false);
            j3 = floatToRawIntBits;
            eae0Var2 = eae0Var3;
            f530Var2 = f530Var3;
            oip0Var2 = oip0Var3;
            ehr0Var2 = ehr0Var3;
            j4 = j5;
            f2 = f3;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            j3 = j;
            oip0Var2 = oip0Var;
            eae0Var2 = eae0Var;
            ehr0Var2 = ehr0Var;
            j4 = j2;
            f2 = f;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: xa2
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(i | 1);
                    za2.a(z, slsVar, f530Var2, j3, oip0Var2, eae0Var2, ehr0Var2, j4, f2, aVar, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(wls wlsVar, sls slsVar, f530 f530Var, boolean z, jl10 jl10Var, j690 j690Var, fid fidVar, int i) {
        f530 f530Var2;
        boolean z2;
        jl10 jl10Var2;
        j690 j690Var2;
        jl10 jl10Var3;
        int i2;
        f530 f530Var3;
        j690 j690Var3;
        jl10 jl10Var4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-532959117);
        int i3 = i | (btsVar.e(slsVar) ? 32 : 16) | 113995136;
        boolean z3 = true;
        if (btsVar.V(i3 & 1, (38347923 & i3) != 38347922)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                float f = ek10.a;
                agc agcVar = (agc) btsVar.m(dgc.a);
                jl10 jl10Var5 = agcVar.a0;
                if (jl10Var5 == null) {
                    jl10Var3 = new jl10(dgc.c(agcVar, pty.g), dgc.c(agcVar, pty.h), dgc.c(agcVar, pty.i), ldc.b(dgc.c(agcVar, pty.a), pty.b, 0.0f, 0.0f, 0.0f, 14), ldc.b(dgc.c(agcVar, pty.c), pty.d, 0.0f, 0.0f, 0.0f, 14), ldc.b(dgc.c(agcVar, pty.e), pty.f, 0.0f, 0.0f, 0.0f, 14));
                    agcVar.a0 = jl10Var3;
                } else {
                    jl10Var3 = jl10Var5;
                }
                i2 = i3 & (-3670017);
                l690 l690Var = ek10.b;
                f530Var3 = c530.a;
                j690Var3 = l690Var;
                jl10Var4 = jl10Var3;
            } else {
                btsVar.Y();
                i2 = i3 & (-3670017);
                f530Var3 = f530Var;
                z3 = z;
                jl10Var4 = jl10Var;
                j690Var3 = j690Var;
            }
            btsVar.u();
            zl10.b(wlsVar, slsVar, f530Var3, z3, jl10Var4, j690Var3, btsVar, i2 & 268435454);
            f530Var2 = f530Var3;
            z2 = z3;
            jl10Var2 = jl10Var4;
            j690Var2 = j690Var3;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            z2 = z;
            jl10Var2 = jl10Var;
            j690Var2 = j690Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ya2(wlsVar, slsVar, f530Var2, z2, jl10Var2, j690Var2, i);
        }
    }
}
