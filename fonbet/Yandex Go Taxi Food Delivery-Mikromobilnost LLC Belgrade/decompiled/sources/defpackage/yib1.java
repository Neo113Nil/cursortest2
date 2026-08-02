package defpackage;

import android.text.TextUtils;
import android.view.View;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.d;
import com.google.android.material.button.MaterialButton;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class yib1 {
    public static final void a(ola olaVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        ldc ldcVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1374602065);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(olaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            wp2 wp2Var = olaVar.e;
            if (wp2Var == null) {
                btsVar.e0(1743212843);
                btsVar.t(false);
                ldcVar = null;
            } else {
                btsVar.e0(1857347990);
                long n = tje.n(wp2Var, btsVar);
                btsVar.t(false);
                ldcVar = new ldc(n);
            }
            long n2 = tje.n(AppColor$Palette.Background, btsVar);
            c530 c530Var = c530.a;
            f530 k = ljs0.c(c530Var, 1.0f).k(ldcVar != null ? bb1.g(m4m0.b(c530Var, ldcVar.a, qke.q), new cs0(n2, 13)) : c530Var);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            oeb1.c(btsVar, ljs0.e(c530Var, 24.0f));
            b(olaVar.c, olaVar.d, btsVar, 0);
            oeb1.c(btsVar, ljs0.e(c530Var, 28.0f));
            w691.b(olaVar.f, btsVar, 0);
            oeb1.c(btsVar, ljs0.e(c530Var, 24.0f));
            nla nlaVar = olaVar.g;
            tib1.e(nlaVar.a, nlaVar.b, null, btsVar, 0);
            ly3.B(c530Var, 24.0f, btsVar, true);
            f530Var = c530Var;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(olaVar, f530Var, i, 24);
        }
    }

    public static final void b(CharSequence charSequence, CharSequence charSequence2, fid fidVar, int i) {
        CharSequence charSequence3;
        bts btsVar;
        int i2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1403654311);
        int i3 = i | (btsVar2.k(charSequence) ? 4 : 2) | (btsVar2.k(charSequence2) ? 32 : 16);
        if (btsVar2.V(i3 & 1, (i3 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 m = an91.m(ljs0.c(c530Var, 1.0f), 16.0f, 0.0f, 2);
            sic a = qic.a(lr20.c, x4c.H, btsVar2, 48);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, m);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, a);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d);
            ety0 ety0Var = xya1.b(btsVar2).e;
            AppColor$Palette appColor$Palette = AppColor$Palette.Text;
            qgy.b(charSequence, null, null, appColor$Palette, 0L, 0L, new sjy0(3), 0L, 2, 2, 0, ety0Var, null, btsVar2, (i3 & 14) | 805309440, 6, 10614);
            if (charSequence2 != null) {
                tse0.s(btsVar2, -44580449, c530Var, 32.0f, btsVar2);
                charSequence3 = charSequence2;
                qgy.b(charSequence3, null, null, appColor$Palette, 0L, 0L, new sjy0(3), 0L, 2, 1, 0, xya1.b(btsVar2).a, null, btsVar2, ((i3 >> 3) & 14) | 805309440, 6, 10614);
                btsVar = btsVar2;
                i2 = 0;
                btsVar.t(false);
            } else {
                btsVar = btsVar2;
                i2 = 0;
                charSequence3 = charSequence2;
                btsVar.e0(-44317135);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            charSequence3 = charSequence2;
            btsVar = btsVar2;
            i2 = 0;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zga(i, i2, charSequence, charSequence3);
        }
    }

    public static final void c(final f530 f530Var, final ehr0 ehr0Var, final long j, long j2, final a aVar, fid fidVar, int i) {
        int i2;
        long j3;
        long a;
        bts btsVar = (bts) fidVar;
        btsVar.g0(174096871);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(f530Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (btsVar.k(ehr0Var) ? 32 : 16) | (btsVar.d(j) ? 256 : 128) | 222208;
        if (btsVar.V(i3 & 1, (599187 & i3) != 599186)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                a = mic.a(j, btsVar);
            } else {
                btsVar.Y();
                a = j2;
            }
            btsVar.u();
            qwd qwdVar = xqn.b;
            final float f = ((y7m) btsVar.m(qwdVar)).a + 0.0f;
            sb2.c(new vvf0[]{cfe.a.a(new ldc(a)), qwdVar.a(new y7m(f))}, wwg.S(-2004281689, true, new wls() { // from class: inw0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    fid fidVar2 = (fid) obj;
                    int intValue = ((Integer) obj2).intValue();
                    bts btsVar2 = (bts) fidVar2;
                    boolean V = btsVar2.V(intValue & 1, (intValue & 3) != 2);
                    zy11 zy11Var = zy11.a;
                    if (!V) {
                        btsVar2.Y();
                        return zy11Var;
                    }
                    f530 f2 = yib1.f(0.0f, yib1.g(j, (vah) btsVar2.m(xqn.a), f, btsVar2), f530.this, ehr0Var);
                    Object Q = btsVar2.Q();
                    o430 o430Var = did.a;
                    if (Q == o430Var) {
                        Q = new oxv0(10);
                        btsVar2.o0(Q);
                    }
                    f530 b = fnq0.b(f2, false, (tls) Q);
                    Object Q2 = btsVar2.Q();
                    if (Q2 == o430Var) {
                        Q2 = a12.l;
                        btsVar2.o0(Q2);
                    }
                    f530 a2 = exw0.a(b, zy11Var, (PointerInputEventHandler) Q2);
                    z910 d = pi6.d(x4c.b, true);
                    int S = cma1.S(btsVar2);
                    r1b0 o = btsVar2.o();
                    f530 d2 = b.d(btsVar2, a2);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar2.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, d.f, d);
                    qje.W(btsVar2, d.e, o);
                    wls wlsVar = d.g;
                    if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S))) {
                        b64.z(S, btsVar2, S, wlsVar);
                    }
                    qje.W(btsVar2, d.d, d2);
                    nnm.p(0, aVar, btsVar2, true);
                    return zy11Var;
                }
            }, btsVar), btsVar, 56);
            j3 = a;
        } else {
            btsVar.Y();
            j3 = j2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new l57(f530Var, ehr0Var, j, j3, aVar, i);
        }
    }

    public static final void d(final sls slsVar, final f530 f530Var, final boolean z, final ehr0 ehr0Var, final long j, final long j2, final float f, final zx40 zx40Var, final a aVar, fid fidVar, final int i) {
        sls slsVar2;
        int i2;
        boolean z2;
        long j3;
        zx40 zx40Var2;
        a aVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2141308794);
        if ((i & 6) == 0) {
            slsVar2 = slsVar;
            i2 = (btsVar.e(slsVar2) ? 4 : 2) | i;
        } else {
            slsVar2 = slsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= btsVar.a(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(ehr0Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            j3 = j;
            i2 |= btsVar.d(j3) ? 16384 : 8192;
        } else {
            j3 = j;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.d(j2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar.k(null) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= btsVar.b(f) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((100663296 & i) == 0) {
            zx40Var2 = zx40Var;
            i2 |= btsVar.k(zx40Var2) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        } else {
            zx40Var2 = zx40Var;
        }
        if ((805306368 & i) == 0) {
            aVar2 = aVar;
            i2 |= btsVar.e(aVar2) ? 536870912 : SelfTester_JCP.IMITA;
        } else {
            aVar2 = aVar;
        }
        if (btsVar.V(i2 & 1, (306783379 & i2) != 306783378)) {
            btsVar.a0();
            if ((i & 1) != 0 && !btsVar.C()) {
                btsVar.Y();
            }
            btsVar.u();
            qwd qwdVar = xqn.b;
            final float f2 = ((y7m) btsVar.m(qwdVar)).a + f;
            final sls slsVar3 = slsVar2;
            final boolean z3 = z2;
            final zx40 zx40Var3 = zx40Var2;
            final a aVar3 = aVar2;
            final long j4 = j3;
            sb2.c(new vvf0[]{cfe.a.a(new ldc(j2)), qwdVar.a(new y7m(f2))}, wwg.S(-1766606150, true, new wls() { // from class: knw0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    fid fidVar2 = (fid) obj;
                    int intValue = ((Integer) obj2).intValue();
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                        a7u0 a7u0Var = j8w.a;
                        f530 b = q791.b(yib1.f(f, yib1.g(j4, (vah) btsVar2.m(xqn.a), f2, btsVar2), f530.this.k(ni20.a), ehr0Var), zx40Var3, gsk0.a(0.0f, 7), z3, null, null, slsVar3, 24);
                        z910 d = pi6.d(x4c.b, true);
                        int S = cma1.S(btsVar2);
                        r1b0 o = btsVar2.o();
                        f530 d2 = b.d(btsVar2, b);
                        ohd.G1.getClass();
                        sls slsVar4 = d.b;
                        if (btsVar2.a == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar2.i0();
                        if (btsVar2.S) {
                            btsVar2.n(slsVar4);
                        } else {
                            btsVar2.r0();
                        }
                        qje.W(btsVar2, d.f, d);
                        qje.W(btsVar2, d.e, o);
                        wls wlsVar = d.g;
                        if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S))) {
                            b64.z(S, btsVar2, S, wlsVar);
                        }
                        qje.W(btsVar2, d.d, d2);
                        nnm.p(0, aVar3, btsVar2, true);
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, 56);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: lnw0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yib1.d(sls.this, f530Var, z, ehr0Var, j, j2, f, zx40Var, aVar, (fid) obj, vng.O(i | 1));
                    return zy11.a;
                }
            };
        }
    }

    public static CharSequence e(View view, CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            if (!TextUtils.isEmpty(materialButton.getText())) {
                return materialButton.getText();
            }
        }
        return view.getContentDescription();
    }

    public static final f530 f(float f, long j, f530 f530Var, ehr0 ehr0Var) {
        return ymb1.l(m4m0.b(ibb1.c(f530Var, f, ehr0Var, 0L, 0L, 24).k(c530.a), j, ehr0Var), ehr0Var);
    }

    public static final long g(long j, vah vahVar, float f, bts btsVar) {
        if (!ldc.c(j, ((lic) btsVar.m(mic.a)).d()) || vahVar == null) {
            btsVar.e0(-1124546347);
            btsVar.t(false);
            return j;
        }
        btsVar.e0(-1124614454);
        long a = vah.a(f, 0, j, btsVar);
        btsVar.t(false);
        return a;
    }
}
