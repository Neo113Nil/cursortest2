package defpackage;

import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.platform.n;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class zl10 {
    public static final float a;
    public static final float b;
    public static final float c;

    static {
        an91.b(4.0f, 0.0f, 2);
        a = 8.0f;
        b = 112.0f;
        c = 280.0f;
    }

    public static final void a(f530 f530Var, sz40 sz40Var, oz40 oz40Var, oip0 oip0Var, ehr0 ehr0Var, long j, float f, a aVar, fid fidVar, int i) {
        boolean z;
        float f2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(848986741);
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.k(sz40Var) ? 32 : 16) | (btsVar.k(oip0Var) ? 2048 : 1024) | (btsVar.k(ehr0Var) ? 16384 : 8192) | (btsVar.d(j) ? 131072 : 65536) | (btsVar.b(0.0f) ? 1048576 : 524288) | (btsVar.b(f) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC) | (btsVar.k(null) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB) | (btsVar.e(aVar) ? 536870912 : SelfTester_JCP.IMITA);
        if (btsVar.V(i2 & 1, (i2 & 306783379) != 306783378)) {
            zx01 O = bvf0.O(sz40Var, "DropDownMenu", btsVar, (((i2 >> 3) & 14) | 48) & HProv.PP_DELETE_SAVED_PASSWD, 0);
            twt0 e = hob1.e(MotionSchemeKeyTokens.FastSpatial, btsVar);
            twt0 e2 = hob1.e(MotionSchemeKeyTokens.FastEffects, btsVar);
            gl11 gl11Var = gtq0.f;
            Object c2 = O.c();
            oz40 oz40Var2 = O.d;
            boolean booleanValue = ((Boolean) c2).booleanValue();
            btsVar.e0(143964305);
            float f3 = booleanValue ? 1.0f : 0.8f;
            btsVar.t(false);
            Float valueOf = Float.valueOf(f3);
            boolean booleanValue2 = ((Boolean) oz40Var2.getValue()).booleanValue();
            btsVar.e0(143964305);
            float f4 = booleanValue2 ? 1.0f : 0.8f;
            btsVar.t(false);
            Float valueOf2 = Float.valueOf(f4);
            O.f();
            btsVar.e0(-745957716);
            btsVar.t(false);
            tx01 s = bvf0.s(O, valueOf, valueOf2, e, gl11Var, btsVar, 0);
            boolean booleanValue3 = ((Boolean) O.c()).booleanValue();
            btsVar.e0(892761509);
            float f5 = booleanValue3 ? 1.0f : 0.0f;
            btsVar.t(false);
            Float valueOf3 = Float.valueOf(f5);
            boolean booleanValue4 = ((Boolean) oz40Var2.getValue()).booleanValue();
            btsVar.e0(892761509);
            float f6 = booleanValue4 ? 1.0f : 0.0f;
            btsVar.t(false);
            Float valueOf4 = Float.valueOf(f6);
            O.f();
            btsVar.e0(2839488);
            btsVar.t(false);
            tx01 s2 = bvf0.s(O, valueOf3, valueOf4, e2, gl11Var, btsVar, 0);
            boolean booleanValue5 = ((Boolean) btsVar.m(n.a)).booleanValue();
            boolean a2 = btsVar.a(booleanValue5) | btsVar.k(s) | ((i2 & 112) == 32) | btsVar.k(s2);
            Object Q = btsVar.Q();
            if (a2 || Q == did.a) {
                z = true;
                f2 = 0.0f;
                zw0 zw0Var = new zw0(booleanValue5, sz40Var, oz40Var, s, s2);
                btsVar.o0(zw0Var);
                Q = zw0Var;
            } else {
                z = true;
                f2 = 0.0f;
            }
            int i3 = i2 >> 9;
            int i4 = i2 >> 6;
            mnw0.a(d.a(c530.a, (tls) Q), ehr0Var, j, 0L, f2, f, wwg.S(-1463404422, z, new gxm(26, f530Var, oip0Var, aVar), btsVar), btsVar, (i3 & 896) | (i3 & 112) | 12582912 | (57344 & i4) | (458752 & i4) | (i4 & 3670016), 8);
            btsVar = btsVar;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wa2(f530Var, sz40Var, oz40Var, oip0Var, ehr0Var, j, f, aVar, i);
        }
    }

    public static final void b(wls wlsVar, sls slsVar, f530 f530Var, boolean z, jl10 jl10Var, j690 j690Var, fid fidVar, int i) {
        int i2;
        boolean z2 = z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1325192924);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(wlsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(slsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(f530Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(null) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.a(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar.k(jl10Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= btsVar.k(j690Var) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((100663296 & i) == 0) {
            i2 |= btsVar.k(null) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if (btsVar.V(i2 & 1, (38347923 & i2) != 38347922)) {
            f530 b2 = q791.b(f530Var, null, esk0.a(6, 0.0f, true), z2, null, null, slsVar, 24);
            z2 = z2;
            f530 j = an91.j(ljs0.p(ljs0.c(b2, 1.0f), b, 48.0f, c, 0.0f, 8), j690Var);
            lhl0 a2 = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int S = cma1.S(btsVar);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, j);
            ohd.G1.getClass();
            sls slsVar2 = androidx.compose.ui.node.d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, androidx.compose.ui.node.d.f, a2);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            wls wlsVar2 = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar2);
            }
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            vqy0.a(((bq11) btsVar.m(eq11.a)).m, wwg.S(865999929, true, new mr1(jl10Var, z2, wlsVar, 12), btsVar), btsVar, 48);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ye5(wlsVar, slsVar, f530Var, z2, jl10Var, j690Var, i, 5);
        }
    }
}
