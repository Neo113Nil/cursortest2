package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.InitializationException;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.icon.IconSpotSize;
import com.yandex.go.design.compose.loading.b;
import com.yandex.go.design.compose.slot.SlotSize;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class wdb1 {
    public static final void a(u92 u92Var, f530 f530Var, IconSpotSize iconSpotSize, fid fidVar, int i) {
        int i2;
        IconSpotSize iconSpotSize2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(556883399);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(u92Var) : btsVar.e(u92Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            IconSpotSize iconSpotSize3 = IconSpotSize.M;
            e5v.a(f530Var, e5v.a, null, iconSpotSize3, wwg.S(724777491, true, new y740(29, iconSpotSize3, u92Var), btsVar), btsVar, ((i3 >> 3) & 14) | HProv.ALG_CLASS_DATA_ENCRYPT | ((i3 << 3) & 7168), 4);
            iconSpotSize2 = iconSpotSize3;
        } else {
            btsVar.Y();
            iconSpotSize2 = iconSpotSize;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0((Object) u92Var, f530Var, (Object) iconSpotSize2, i, 15);
        }
    }

    public static final void b(ibp0 ibp0Var, tss0 tss0Var, boolean z, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1696275999);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ibp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(tss0Var) : btsVar.e(tss0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = tss0Var instanceof qss0;
            c530 c530Var = c530.a;
            if (z2) {
                btsVar.e0(1966343148);
                sya1.a(llb1.b(), an91.o(c530Var, 0.0f, 0.0f, ibp0Var.c() == SlotSize.XS ? 4.0f : 8.0f, 0.0f, 11), null, new up2(rzo.d(s8o.m(((qss0) tss0Var).a, (Context) btsVar.m(AndroidCompositionLocals_androidKt.b)))), btsVar, 0, 4);
                btsVar.t(false);
            } else if (tss0Var instanceof mss0) {
                btsVar.e0(1966346794);
                c(ibp0Var, (mss0) tss0Var, z, tlsVar, btsVar, i2 & 8190);
                btsVar.t(false);
            } else if (tss0Var instanceof sss0) {
                btsVar.e0(1966349378);
                f(ibp0Var, (sss0) tss0Var, z, btsVar, i2 & 1022);
                btsVar.t(false);
            } else if (tss0Var instanceof nss0) {
                btsVar.e0(1966351656);
                d(ibp0Var, (nss0) tss0Var, z, tlsVar, btsVar, i2 & 8190);
                btsVar.t(false);
            } else if (tss0Var instanceof oss0) {
                btsVar.e0(1966354233);
                e((oss0) tss0Var, btsVar, (i2 >> 3) & 14);
                btsVar.t(false);
            } else if (tss0Var instanceof pss0) {
                btsVar.e0(1966356303);
                b.a(ljs0.m(urs0.a[ibp0Var.c().ordinal()] == 1 ? an91.o(c530Var, 16.0f, 0.0f, 4.0f, 0.0f, 10) : an91.m(c530Var, 16.0f, 0.0f, 2), 24.0f), null, false, null, null, null, false, btsVar, 0, 254);
                btsVar.t(false);
            } else {
                btsVar.e0(1966357165);
                nnm.s(c530Var, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar, false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0((Object) ibp0Var, (Object) tss0Var, z, tlsVar, i, 24);
        }
    }

    public static final void c(ibp0 ibp0Var, mss0 mss0Var, boolean z, tls tlsVar, fid fidVar, int i) {
        int i2;
        ButtonStyle buttonStyle;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-711601230);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ibp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= btsVar.e(mss0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            lss0 lss0Var = mss0Var.b;
            if (jl40.l(lss0Var, jss0.a)) {
                buttonStyle = ButtonStyle.Minor;
            } else if (jl40.l(lss0Var, kss0.a)) {
                buttonStyle = ButtonStyle.Outline;
            } else {
                if (!jl40.l(lss0Var, iss0.a)) {
                    w511.b();
                    return;
                }
                buttonStyle = ButtonStyle.Main;
            }
            ButtonStyle buttonStyle2 = buttonStyle;
            boolean z2 = z && !(mss0Var.c instanceof mqs0);
            boolean e = btsVar.e(mss0Var) | ((i2 & 7168) == 2048);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new ppr0(15, tlsVar, mss0Var);
                btsVar.o0(Q);
            }
            d17.c(fj91.d(an91.o(c530.a, 8.0f, 0.0f, ibp0Var.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), IntrinsicSize.Min), z2, ButtonSize.XS, buttonStyle2, ButtonForm.Circle, (sls) Q, wwg.S(546361987, true, new w7o0(i3, mss0Var), btsVar), btsVar, 1573248, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0((Object) ibp0Var, (Object) mss0Var, z, tlsVar, i, 26);
        }
    }

    public static final void d(ibp0 ibp0Var, nss0 nss0Var, boolean z, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-92073326);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ibp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(nss0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            u92 u92Var = new u92(ffx.d0(nss0Var.a, 0, 0, 7));
            boolean z2 = true;
            String str = nss0Var.b;
            boolean z3 = z && !(nss0Var.c instanceof mqs0);
            if ((i2 & 7168) != 2048) {
                z2 = false;
            }
            boolean e = z2 | btsVar.e(nss0Var);
            Object Q = btsVar.Q();
            int i3 = 14;
            if (e || Q == did.a) {
                Q = new ppr0(i3, tlsVar, nss0Var);
                btsVar.o0(Q);
            }
            g(ibp0Var, u92Var, str, z3, (sls) Q, btsVar, i2 & 14);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0((Object) ibp0Var, (Object) nss0Var, z, tlsVar, i, 25);
        }
    }

    public static final void e(oss0 oss0Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1677367067);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(oss0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            h(new u92(ffx.d0(oss0Var.a, 0, 0, 7)), null, btsVar, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gaf0(oss0Var, i, 8);
        }
    }

    public static final void f(ibp0 ibp0Var, sss0 sss0Var, boolean z, fid fidVar, int i) {
        int i2;
        tls tlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1231608219);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ibp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(sss0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = sss0Var.a;
            boolean z3 = sss0Var.b;
            boolean z4 = z && z3;
            if (z3) {
                btsVar.e0(1065383088);
                Object Q = btsVar.Q();
                if (Q == did.a) {
                    Q = new jiu(13);
                    btsVar.o0(Q);
                }
                tlsVar = (tls) Q;
                btsVar.t(false);
            } else {
                btsVar.e0(1065401656);
                btsVar.t(false);
                tlsVar = null;
            }
            ijb1.b(z2, an91.o(c530.a, 8.0f, 0.0f, ibp0Var.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), null, null, null, tlsVar, z4, btsVar, 0, 28);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kj5(ibp0Var, sss0Var, z, i, 15);
        }
    }

    public static final void g(ibp0 ibp0Var, u92 u92Var, String str, boolean z, sls slsVar, fid fidVar, int i) {
        int i2;
        boolean z2;
        f530 f530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-379216659);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ibp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(u92Var) : btsVar.e(u92Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(str) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            z2 = z;
            i2 |= btsVar.a(z2) ? 2048 : 1024;
        } else {
            z2 = z;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(slsVar) ? 16384 : 8192;
        }
        int i3 = i2;
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            c530 c530Var = c530.a;
            if (slsVar == null || (f530Var = q791.d(c530Var, z2, null, null, slsVar, 14)) == null) {
                f530Var = c530Var;
            }
            f530 a = ljs0.a(f530Var, ibp0Var.c().getSize(), ibp0Var.c().getSize());
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, a);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
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
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            f530 n = ljs0.n(c530Var, 24.0f, 24.0f);
            int i4 = i3 >> 3;
            o4b1.c(u92Var, str, n, null, mhe.e, 0.0f, null, 0, btsVar, (i4 & 14) | 24960 | (i4 & 112), 232);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ym1(ibp0Var, u92Var, str, z, slsVar, i);
        }
    }

    public static final void h(u92 u92Var, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(797895589);
        int i2 = (btsVar.k(u92Var) ? 4 : 2) | i | 48;
        int i3 = 14;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            a(u92Var, an91.o(c530Var, 8.0f, 0.0f, 16.0f, 0.0f, 10), null, btsVar, i2 & 14);
            f530Var = c530Var;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c1p0(u92Var, f530Var, i, i3);
        }
    }

    public static final boolean i(zii0 zii0Var, float f, float f2) {
        float f3 = zii0Var.a;
        if (f > zii0Var.c || f3 > f) {
            return false;
        }
        return f2 <= zii0Var.d && zii0Var.b <= f2;
    }

    public static boolean j(kr7 kr7Var, String str) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) kr7Var.a(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (CameraAccessExceptionCompat e) {
            throw new InitializationException(ceb1.b(e));
        }
    }
}
