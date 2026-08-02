package defpackage;

import android.util.Size;
import androidx.camera.core.impl.StreamUseCase;
import androidx.camera.core.impl.SurfaceConfig$ConfigSize;
import androidx.camera.core.impl.SurfaceConfig$ConfigSource;
import androidx.camera.core.impl.SurfaceConfig$ConfigType;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.icon.IconSpotSize;
import com.yandex.go.design.compose.modal.bottomsheet.b;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import com.yandex.go.design.compose.slot.SlotSize;
import defpackage.aha;
import defpackage.an91;
import defpackage.bha;
import defpackage.bts;
import defpackage.c530;
import defpackage.cha;
import defpackage.cma1;
import defpackage.dha;
import defpackage.did;
import defpackage.djb1;
import defpackage.f530;
import defpackage.fid;
import defpackage.j690;
import defpackage.jl40;
import defpackage.ljs0;
import defpackage.ohd;
import defpackage.pi6;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sib1;
import defpackage.sls;
import defpackage.tls;
import defpackage.unr0;
import defpackage.wls;
import defpackage.x4c;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zy11;
import java.util.HashMap;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class xib1 {
    public static final void a(final dha dhaVar, z0a0 z0a0Var, String str, final tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1854390128);
        int i2 = i | (btsVar2.k(dhaVar) ? 4 : 2) | (btsVar2.k(z0a0Var) ? 32 : 16) | (btsVar2.k(str) ? 256 : 128) | (btsVar2.e(tlsVar) ? 2048 : 1024);
        if (btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
            c.a(null, b.a(false, 0.0f, null, false, null, null, null, null, btsVar2, 48, 0, 8189), null, false, false, null, null, wwg.S(-1511894142, true, new wg0(10, tlsVar), btsVar2), null, null, wwg.S(-476063228, true, new vg0((Object) dhaVar, (Object) z0a0Var, (Object) str, tlsVar, (Object) pw91.o(btsVar2), 3), btsVar2), wwg.S(1583408432, true, new bms() { // from class: com.yandex.go.chargers.passes.offer_screen.b
                @Override // defpackage.bms
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    j690 j690Var = (j690) obj2;
                    fid fidVar2 = (fid) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 48) == 0) {
                        intValue |= ((bts) fidVar2).k(j690Var) ? 32 : 16;
                    }
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.V(intValue & 1, (intValue & 145) != 144)) {
                        f530 c = ljs0.c(an91.j(c530.a, j690Var), 1.0f);
                        z910 d = pi6.d(x4c.b, false);
                        int hashCode = Long.hashCode(btsVar3.T);
                        r1b0 o = btsVar3.o();
                        f530 d2 = androidx.compose.ui.b.d(btsVar3, c);
                        ohd.G1.getClass();
                        sls slsVar = d.b;
                        if (btsVar3.a == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar3.i0();
                        if (btsVar3.S) {
                            btsVar3.n(slsVar);
                        } else {
                            btsVar3.r0();
                        }
                        qje.W(btsVar3, d.f, d);
                        qje.W(btsVar3, d.e, o);
                        qje.W(btsVar3, d.g, Integer.valueOf(hashCode));
                        qje.M(btsVar3, d.h);
                        qje.W(btsVar3, d.d, d2);
                        cha chaVar = cha.a;
                        dha dhaVar2 = dha.this;
                        if (jl40.l(dhaVar2, chaVar)) {
                            btsVar3.e0(-342722585);
                            djb1.e(btsVar3, 0);
                            btsVar3.t(false);
                        } else {
                            boolean z = dhaVar2 instanceof aha;
                            tls tlsVar2 = tlsVar;
                            if (z) {
                                btsVar3.e0(-342719917);
                                sib1.a(((aha) dhaVar2).a, tlsVar2, null, btsVar3, 0);
                                btsVar3.t(false);
                            } else {
                                if (!(dhaVar2 instanceof bha)) {
                                    throw unr0.y(-342724236, btsVar3, false);
                                }
                                btsVar3.e0(-2034227771);
                                boolean k = btsVar3.k(tlsVar2) | btsVar3.e(dhaVar2);
                                Object Q = btsVar3.Q();
                                if (k || Q == did.a) {
                                    Q = new ChargersPassesOfferScreenKt$ChargersPassesOfferScreen$3$1$1$1(tlsVar2, dhaVar2, null);
                                    btsVar3.o0(Q);
                                }
                                zpn.e(btsVar3, (wls) Q, dhaVar2);
                                btsVar3.t(false);
                            }
                        }
                        btsVar3.t(true);
                    } else {
                        btsVar3.Y();
                    }
                    return zy11.a;
                }
            }, btsVar2), btsVar2, 12582912, 54, 893);
            btsVar = btsVar2;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rb0((Object) dhaVar, (Object) z0a0Var, (Object) str, tlsVar, i, 16);
        }
    }

    public static final void b(ibp0 ibp0Var, s510 s510Var, boolean z, tls tlsVar, fid fidVar, int i) {
        int i2;
        boolean z2;
        tls tlsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1384472665);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ibp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(s510Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= btsVar.a(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            tlsVar2 = tlsVar;
            i2 |= btsVar.e(tlsVar2) ? 2048 : 1024;
        } else {
            tlsVar2 = tlsVar;
        }
        if (!btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            btsVar.Y();
        } else if (s510Var instanceof p510) {
            btsVar.e0(961638231);
            c(ibp0Var, (p510) s510Var, z2, tlsVar2, btsVar, i2 & 8190);
            btsVar.t(false);
        } else {
            boolean z3 = s510Var instanceof q510;
            c530 c530Var = c530.a;
            if (z3) {
                btsVar.e0(961641702);
                nvi0 nvi0Var = ((q510) s510Var).a;
                Object Q = btsVar.Q();
                if (Q == did.a) {
                    Q = new teb(20);
                    btsVar.o0(Q);
                }
                f530 o = an91.o(fnq0.a(c530Var, (tls) Q), 8.0f, 0.0f, 16.0f, 0.0f, 10);
                IconSpotSize iconSpotSize = ibp0Var.c() == SlotSize.XS ? IconSpotSize.S : IconSpotSize.M;
                j8d.a.getClass();
                r0b1.a(nvi0Var, o, iconSpotSize, null, j8d.b, j8d.c, btsVar, 221184);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                if (!jl40.l(s510Var, r510.a)) {
                    throw unr0.y(961636619, btsVar, false);
                }
                btsVar.e0(961652115);
                nnm.s(c530Var, Float.isNaN(Float.NaN) ? deb1.a(ibp0Var.c()) : Float.NaN, btsVar, false);
            }
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0((Object) ibp0Var, (Object) s510Var, z, tlsVar, i, 14);
        }
    }

    public static final void c(ibp0 ibp0Var, p510 p510Var, boolean z, tls tlsVar, fid fidVar, int i) {
        int i2;
        ButtonStyle buttonStyle;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1669497459);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(ibp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(p510Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            o510 o510Var = p510Var.b;
            if (jl40.l(o510Var, m510.a)) {
                buttonStyle = ButtonStyle.Minor;
            } else if (jl40.l(o510Var, n510.a)) {
                buttonStyle = ButtonStyle.Outline;
            } else {
                if (!jl40.l(o510Var, l510.a)) {
                    w511.b();
                    return;
                }
                buttonStyle = ButtonStyle.Main;
            }
            ButtonStyle buttonStyle2 = buttonStyle;
            boolean z2 = z && !(p510Var.c instanceof m410);
            boolean z3 = ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z3 || Q == did.a) {
                Q = new g700(14, tlsVar, p510Var);
                btsVar.o0(Q);
            }
            d17.c(fj91.d(an91.o(c530.a, 8.0f, 0.0f, ibp0Var.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), IntrinsicSize.Min), z2, ButtonSize.XS, buttonStyle2, ButtonForm.Circle, (sls) Q, wwg.S(-764539452, true, new ctq(25, p510Var), btsVar), btsVar, 1573248, 0);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0((Object) ibp0Var, (Object) p510Var, z, tlsVar, i, 15);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
    
        if (r4 <= (r6.getHeight() * r6.getWidth())) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static anw0 d(int i, Size size, x84 x84Var, int i2, SurfaceConfig$ConfigSource surfaceConfig$ConfigSource, StreamUseCase streamUseCase) {
        HashMap hashMap = x84Var.f;
        SurfaceConfig$ConfigType surfaceConfig$ConfigType = (SurfaceConfig$ConfigType) anw0.h.get(Integer.valueOf(i));
        if (surfaceConfig$ConfigType == null) {
            surfaceConfig$ConfigType = SurfaceConfig$ConfigType.PRIV;
        }
        SurfaceConfig$ConfigSize surfaceConfig$ConfigSize = SurfaceConfig$ConfigSize.NOT_SUPPORT;
        Size size2 = vjs0.a;
        int height = size.getHeight() * size.getWidth();
        if (i2 == 1) {
            if (height <= vjs0.a((Size) x84Var.b.get(Integer.valueOf(i)))) {
                surfaceConfig$ConfigSize = SurfaceConfig$ConfigSize.S720P_16_9;
            } else if (height <= vjs0.a((Size) x84Var.d.get(Integer.valueOf(i)))) {
                surfaceConfig$ConfigSize = SurfaceConfig$ConfigSize.S1440P_4_3;
            }
        } else if (surfaceConfig$ConfigSource == SurfaceConfig$ConfigSource.FEATURE_COMBINATION_TABLE) {
            Size size3 = (Size) hashMap.get(Integer.valueOf(i));
            SurfaceConfig$ConfigSize[] surfaceConfig$ConfigSizeArr = anw0.f;
            int length = surfaceConfig$ConfigSizeArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                SurfaceConfig$ConfigSize surfaceConfig$ConfigSize2 = surfaceConfig$ConfigSizeArr[i3];
                if (size.equals(surfaceConfig$ConfigSize2.getRelatedFixedSize())) {
                    surfaceConfig$ConfigSize = surfaceConfig$ConfigSize2;
                    break;
                }
                i3++;
            }
            if (surfaceConfig$ConfigSize == SurfaceConfig$ConfigSize.NOT_SUPPORT && size.equals(size3)) {
                surfaceConfig$ConfigSize = SurfaceConfig$ConfigSize.MAXIMUM;
            }
        } else if (height <= vjs0.a(x84Var.a)) {
            surfaceConfig$ConfigSize = SurfaceConfig$ConfigSize.VGA;
        } else if (height <= vjs0.a(x84Var.c)) {
            surfaceConfig$ConfigSize = SurfaceConfig$ConfigSize.PREVIEW;
        } else if (height <= vjs0.a(x84Var.e)) {
            surfaceConfig$ConfigSize = SurfaceConfig$ConfigSize.RECORD;
        } else {
            Size size4 = (Size) hashMap.get(Integer.valueOf(i));
            Size size5 = (Size) x84Var.i.get(Integer.valueOf(i));
            if (size4 != null) {
            }
            if (i2 != 2) {
                surfaceConfig$ConfigSize = SurfaceConfig$ConfigSize.MAXIMUM;
            }
            if (size5 != null) {
                if (height <= size5.getHeight() * size5.getWidth()) {
                    surfaceConfig$ConfigSize = SurfaceConfig$ConfigSize.ULTRA_MAXIMUM;
                }
            }
        }
        return new anw0(surfaceConfig$ConfigType, surfaceConfig$ConfigSize, streamUseCase);
    }
}
