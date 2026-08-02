package defpackage;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.layout.e;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import java.io.ByteArrayInputStream;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class rmb1 {
    public static final void a(String str, String str2, fid fidVar, int i) {
        String str3;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-34535668);
        int i2 = i | (btsVar2.k(str) ? 4 : 2) | (btsVar2.k(str2) ? 32 : 16);
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            f530 o = an91.o(ljs0.c(ljs0.b(c530.a, 0.0f, 56.0f, 1), 1.0f), 16.0f, 0.0f, 16.0f, 30.0f, 2);
            sic a = qic.a(new i43(4.0f, true, new quz(11)), x4c.H, btsVar2, 54);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d = b.d(btsVar2, o);
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
            qje.W(btsVar2, d.e, o2);
            wls wlsVar = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, d.d, d);
            long j = ldc.f;
            ymb1.c(str, null, j, null, lzr.E, 0L, 0L, 0L, new sjy0(3), 0, false, 0, null, null, btsVar2, (i2 & 14) | 24960, 0, 64490);
            if (str2 == null) {
                btsVar2.e0(-1877025568);
                btsVar2.t(false);
                btsVar = btsVar2;
                str3 = str2;
            } else {
                btsVar2.e0(-1877025567);
                str3 = str2;
                ymb1.f(str3, null, j, null, null, null, 0L, 0L, 0L, new sjy0(3), 0, false, Integer.MAX_VALUE, null, null, btsVar2, 384, HProv.ALG_TYPE_SECURECHANNEL, 56314);
                btsVar = btsVar2;
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            str3 = str2;
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kq5(str, str3, i, 7);
        }
    }

    public static final void b(CharSequence charSequence, long j, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(686383896);
        int i2 = i | (btsVar.e(charSequence) ? 4 : 2) | (btsVar.d(j) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 k = an91.k(m4m0.b(ymb1.l(c530.a, ((YandexShapes) btsVar.m(qm51.a)).d()), j, qke.q), 8.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, k);
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
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            zgb1.a(charSequence, null, 0, false, null, null, false, null, btsVar, i2 & 14, 254);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xrf0(charSequence, j, i, 1);
        }
    }

    public static final void c(f530 f530Var, long j, boolean z, fid fidVar, int i, int i2) {
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-518793374);
        int i3 = (btsVar.d(j) ? 32 : 16) | i;
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.a(z) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            boolean z3 = i4 != 0 ? false : z;
            f530 n = ljs0.n(f530Var, 8.0f, 24.0f);
            boolean z4 = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object Q = btsVar.Q();
            if (z4 || Q == did.a) {
                Q = new leb(z3, 1, j);
                btsVar.o0(Q);
            }
            qeb1.a(0, btsVar, (tls) Q, n);
            z2 = z3;
        } else {
            btsVar.Y();
            z2 = z;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new uoy0(f530Var, j, z2, i, i2, 0);
        }
    }

    public static final void d(f530 f530Var, long j, boolean z, fid fidVar, int i, int i2) {
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1466365872);
        int i3 = (btsVar.d(j) ? 32 : 16) | i;
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.a(z) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            boolean z3 = i4 != 0 ? false : z;
            f530 n = ljs0.n(f530Var, 24.0f, 8.0f);
            boolean z4 = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object Q = btsVar.Q();
            if (z4 || Q == did.a) {
                Q = new leb(z3, 2, j);
                btsVar.o0(Q);
            }
            qeb1.a(0, btsVar, (tls) Q, n);
            z2 = z3;
        } else {
            btsVar.Y();
            z2 = z;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new uoy0(f530Var, j, z2, i, i2, 1);
        }
    }

    public static final void e(final l9e0 l9e0Var, zii0 zii0Var, zii0 zii0Var2, fid fidVar, int i) {
        final long j;
        bts btsVar = (bts) fidVar;
        btsVar.g0(899874812);
        int i2 = i | (btsVar.k(l9e0Var) ? 4 : 2) | (btsVar.k(zii0Var) ? 32 : 16) | (btsVar.k(zii0Var2) ? 256 : 128);
        final int i3 = 0;
        final int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            ldc ldcVar = l9e0Var.b;
            if (ldcVar == null) {
                btsVar.e0(1491273124);
                j = ((el51) btsVar.m(gl51.a)).b();
                btsVar.t(false);
            } else {
                btsVar.e0(1491271760);
                btsVar.t(false);
                j = ldcVar.a;
            }
            fwi fwiVar = (fwi) btsVar.m(j.h);
            List g = scc.g(wwg.S(-1239162984, true, new wls() { // from class: toy0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    l9e0 l9e0Var2 = l9e0Var;
                    fid fidVar2 = (fid) obj;
                    int intValue = ((Integer) obj2).intValue();
                    switch (i5) {
                        case 0:
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                rmb1.b(l9e0Var2.a, j, btsVar2, 0);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        default:
                            bts btsVar3 = (bts) fidVar2;
                            if (btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                int i6 = yoy0.a[l9e0Var2.c.ordinal()];
                                c530 c530Var = c530.a;
                                long j2 = j;
                                if (i6 == 1) {
                                    btsVar3.e0(-1979841241);
                                    rmb1.d(sm91.f(c530Var, 0.0f, 1.0f, 1), j2, true, btsVar3, 390, 0);
                                    btsVar3.t(false);
                                } else if (i6 == 2) {
                                    btsVar3.e0(-1979834904);
                                    rmb1.d(sm91.f(c530Var, 0.0f, -1.0f, 1), j2, false, btsVar3, 6, 4);
                                    btsVar3.t(false);
                                } else if (i6 == 3) {
                                    btsVar3.e0(-1979829559);
                                    rmb1.c(sm91.f(c530Var, 1.0f, 0.0f, 2), j2, true, btsVar3, 390, 0);
                                    btsVar3.t(false);
                                } else {
                                    if (i6 != 4) {
                                        throw unr0.y(-1979842679, btsVar3, false);
                                    }
                                    btsVar3.e0(-1979823190);
                                    rmb1.c(sm91.f(c530Var, -1.0f, 0.0f, 2), j2, false, btsVar3, 6, 4);
                                    btsVar3.t(false);
                                }
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar), wwg.S(900732102, true, new wls() { // from class: toy0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    l9e0 l9e0Var2 = l9e0Var;
                    fid fidVar2 = (fid) obj;
                    int intValue = ((Integer) obj2).intValue();
                    switch (i5) {
                        case 0:
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                rmb1.b(l9e0Var2.a, j, btsVar2, 0);
                            } else {
                                btsVar2.Y();
                            }
                            return zy11Var;
                        default:
                            bts btsVar3 = (bts) fidVar2;
                            if (btsVar3.V(intValue & 1, (intValue & 3) != 2)) {
                                int i6 = yoy0.a[l9e0Var2.c.ordinal()];
                                c530 c530Var = c530.a;
                                long j2 = j;
                                if (i6 == 1) {
                                    btsVar3.e0(-1979841241);
                                    rmb1.d(sm91.f(c530Var, 0.0f, 1.0f, 1), j2, true, btsVar3, 390, 0);
                                    btsVar3.t(false);
                                } else if (i6 == 2) {
                                    btsVar3.e0(-1979834904);
                                    rmb1.d(sm91.f(c530Var, 0.0f, -1.0f, 1), j2, false, btsVar3, 6, 4);
                                    btsVar3.t(false);
                                } else if (i6 == 3) {
                                    btsVar3.e0(-1979829559);
                                    rmb1.c(sm91.f(c530Var, 1.0f, 0.0f, 2), j2, true, btsVar3, 390, 0);
                                    btsVar3.t(false);
                                } else {
                                    if (i6 != 4) {
                                        throw unr0.y(-1979842679, btsVar3, false);
                                    }
                                    btsVar3.e0(-1979823190);
                                    rmb1.c(sm91.f(c530Var, -1.0f, 0.0f, 2), j2, false, btsVar3, 6, 4);
                                    btsVar3.t(false);
                                }
                            } else {
                                btsVar3.Y();
                            }
                            return zy11Var;
                    }
                }
            }, btsVar));
            boolean k = ((i2 & 112) == 32) | ((i2 & 14) == 4) | ((i2 & 896) == 256) | btsVar.k(fwiVar);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = new xoy0(l9e0Var, zii0Var2, zii0Var, fwiVar);
                btsVar.o0(Q);
            }
            gl40 gl40Var = (gl40) Q;
            a c = e.c(g);
            boolean k2 = btsVar.k(gl40Var);
            Object Q2 = btsVar.Q();
            if (k2 || Q2 == o430Var) {
                Q2 = new hl40(gl40Var);
                btsVar.o0(Q2);
            }
            z910 z910Var = (z910) Q2;
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c530.a);
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
            qje.W(btsVar, d.f, z910Var);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            nnm.p(0, c, btsVar, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nvs0(l9e0Var, zii0Var, zii0Var2, i, 11);
        }
    }

    public static jb7 f(cot cotVar) {
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) cotVar.b;
        try {
            ilx E = ilx.E(byteArrayInputStream, oyo.b());
            byteArrayInputStream.close();
            return jb7.g(E);
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public static void g(jb7 jb7Var, tig0 tig0Var) {
        if (((SharedPreferences.Editor) tig0Var.a).putString((String) tig0Var.b, s8o.j(((ilx) jb7Var.b).e())).commit()) {
            return;
        }
        ny61.v("Failed to write to SharedPreferences");
    }
}
