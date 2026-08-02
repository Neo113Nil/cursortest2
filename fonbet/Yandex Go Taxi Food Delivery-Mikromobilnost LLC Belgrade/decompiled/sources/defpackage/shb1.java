package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public abstract class shb1 {
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final dw9 dw9Var, final oip0 oip0Var, final sls slsVar, fid fidVar, final int i) {
        sls slsVar2;
        aii0 v;
        wls wlsVar;
        CharSequence e;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1386450304);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(dw9Var) ? 4 : 2) | (btsVar.k(oip0Var) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128);
        if (!btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            slsVar2 = slsVar;
            btsVar.Y();
        } else {
            if (dw9Var instanceof zv9) {
                v = btsVar.v();
                if (v != null) {
                    final int i3 = 0;
                    wlsVar = new wls(dw9Var, oip0Var, slsVar, i, i3) { // from class: hv9
                        public final /* synthetic */ int a;
                        public final /* synthetic */ dw9 b;
                        public final /* synthetic */ oip0 c;
                        public final /* synthetic */ sls w;

                        {
                            this.a = i3;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.a;
                            zy11 zy11Var = zy11.a;
                            sls slsVar3 = this.w;
                            oip0 oip0Var2 = this.c;
                            dw9 dw9Var2 = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    shb1.a(dw9Var2, oip0Var2, slsVar3, fidVar2, vng.O(1));
                                    break;
                                default:
                                    shb1.a(dw9Var2, oip0Var2, slsVar3, fidVar2, vng.O(1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            if (dw9Var instanceof aw9) {
                btsVar.e0(959794874);
                btsVar.t(false);
                uo9 uo9Var = ((aw9) dw9Var).d;
                if (uo9Var != null) {
                    e = uo9Var.a;
                    z = true;
                    if (e == null) {
                        btsVar.e0(960211110);
                        btsVar.t(false);
                        slsVar2 = slsVar;
                    } else {
                        btsVar.e0(960211111);
                        igr0 c = dbb1.c(btsVar);
                        m3u0 c2 = hhb1.c(oip0Var, btsVar);
                        c530 c530Var = c530.a;
                        f530 c3 = ljs0.c(hbb1.c(c530Var, c, false, 0.0f, c2, 6), 1.0f);
                        AppColor$Palette appColor$Palette = AppColor$Palette.Background;
                        gji0 gji0Var = qke.q;
                        f530 c4 = bzk0.c(c3, appColor$Palette, gji0Var);
                        z910 d = pi6.d(x4c.b, false);
                        int hashCode = Long.hashCode(btsVar.T);
                        r1b0 o = btsVar.o();
                        f530 d2 = b.d(btsVar, c4);
                        ohd.G1.getClass();
                        sls slsVar3 = d.b;
                        if (dmw0Var == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar.i0();
                        if (btsVar.S) {
                            btsVar.n(slsVar3);
                        } else {
                            btsVar.r0();
                        }
                        wls wlsVar2 = d.f;
                        qje.W(btsVar, wlsVar2, d);
                        wls wlsVar3 = d.e;
                        qje.W(btsVar, wlsVar3, o);
                        Integer valueOf = Integer.valueOf(hashCode);
                        wls wlsVar4 = d.g;
                        qje.W(btsVar, wlsVar4, valueOf);
                        tls tlsVar = d.h;
                        qje.M(btsVar, tlsVar);
                        wls wlsVar5 = d.d;
                        qje.W(btsVar, wlsVar5, d2);
                        boolean z2 = z;
                        f530 k = an91.k(i9a1.d(bzk0.c(ymb1.l(ljs0.c(c530Var, 1.0f), cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)), AppColor$Palette.BgFloating, gji0Var)), 8.0f);
                        boolean b = btsVar.b(4.0f) | btsVar.c(2) | btsVar.a(false);
                        Object Q = btsVar.Q();
                        o430 o430Var = did.a;
                        if (b || Q == o430Var) {
                            Q = new jg0(8);
                            btsVar.o0(Q);
                        }
                        z910 z910Var = (z910) Q;
                        int hashCode2 = Long.hashCode(btsVar.T);
                        r1b0 o2 = btsVar.o();
                        f530 d3 = b.d(btsVar, k);
                        btsVar.i0();
                        if (btsVar.S) {
                            btsVar.n(slsVar3);
                        } else {
                            btsVar.r0();
                        }
                        qje.W(btsVar, wlsVar2, z910Var);
                        qje.W(btsVar, wlsVar3, o2);
                        vfc.v(hashCode2, btsVar, wlsVar4, btsVar, tlsVar);
                        qje.W(btsVar, wlsVar5, d3);
                        ButtonStyle buttonStyle = z2 ? ButtonStyle.Main : ButtonStyle.Minor;
                        f530 c5 = ljs0.c(c530Var, 1.0f);
                        boolean z3 = (i2 & 896) == 256;
                        Object Q2 = btsVar.Q();
                        if (z3 || Q2 == o430Var) {
                            slsVar2 = slsVar;
                            Q2 = new jc0(14, slsVar2);
                            btsVar.o0(Q2);
                        } else {
                            slsVar2 = slsVar;
                        }
                        d17.c(c5, z2, null, buttonStyle, null, (sls) Q2, wwg.S(1525081692, true, new or9(1, e), btsVar), btsVar, 1572870, 20);
                        tse0.t(btsVar, true, true, false);
                    }
                }
                e = null;
                z = true;
                if (e == null) {
                }
            } else if (dw9Var instanceof yv9) {
                btsVar.e0(959914906);
                btsVar.t(false);
                uo9 uo9Var2 = ((yv9) dw9Var).d;
                if (uo9Var2 != null) {
                    e = uo9Var2.a;
                    z = true;
                    if (e == null) {
                    }
                }
                e = null;
                z = true;
                if (e == null) {
                }
            } else {
                if (!(dw9Var instanceof cw9) && !(dw9Var instanceof bw9)) {
                    throw unr0.y(-938871753, btsVar, false);
                }
                btsVar.e0(960078152);
                e = ohb1.e(btsVar, kyh0.common_loading);
                btsVar.t(false);
                z = false;
                if (e == null) {
                }
            }
        }
        v = btsVar.v();
        if (v != null) {
            final int i4 = 1;
            final sls slsVar4 = slsVar2;
            wlsVar = new wls(dw9Var, oip0Var, slsVar4, i, i4) { // from class: hv9
                public final /* synthetic */ int a;
                public final /* synthetic */ dw9 b;
                public final /* synthetic */ oip0 c;
                public final /* synthetic */ sls w;

                {
                    this.a = i4;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.a;
                    zy11 zy11Var = zy11.a;
                    sls slsVar32 = this.w;
                    oip0 oip0Var2 = this.c;
                    dw9 dw9Var2 = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            shb1.a(dw9Var2, oip0Var2, slsVar32, fidVar2, vng.O(1));
                            break;
                        default:
                            shb1.a(dw9Var2, oip0Var2, slsVar32, fidVar2, vng.O(1));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final void b(dw9 dw9Var, tls tlsVar, fid fidVar, int i) {
        sls slsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-388658280);
        int i2 = (btsVar.k(dw9Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            oip0 o = pw91.o(btsVar);
            wg6 a = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, false, null, null, null, null, btsVar, 48, 0, 8189);
            boolean z = dw9Var instanceof zv9;
            boolean z2 = z && (((zv9) dw9Var).a instanceof pna);
            o430 o430Var = did.a;
            if (z) {
                btsVar.e0(713456690);
                boolean z3 = (i2 & 112) == 32;
                Object Q = btsVar.Q();
                if (z3 || Q == o430Var) {
                    Q = new zp5(29, tlsVar);
                    btsVar.o0(Q);
                }
                slsVar = (sls) Q;
                btsVar.t(false);
            } else {
                btsVar.e0(713580039);
                boolean z4 = (i2 & 112) == 32;
                Object Q2 = btsVar.Q();
                if (z4 || Q2 == o430Var) {
                    Q2 = new fv9(i3, tlsVar);
                    btsVar.o0(Q2);
                }
                slsVar = (sls) Q2;
                btsVar.t(false);
            }
            sls slsVar2 = slsVar;
            c.a(null, a, qab1.c(a, null, slsVar2, btsVar, 0, 2), false, false, null, null, wwg.S(-481999514, true, new wu40(1, slsVar2), btsVar), null, wwg.S(-9659868, true, new my8(z2, a, 5), btsVar), wwg.S(-1751223900, true, new qk30(14, dw9Var, tlsVar, o), btsVar), wwg.S(60506872, true, new gv9(z2, dw9Var, o, tlsVar, 0), btsVar), btsVar, 817916928, 54, 353);
            btsVar = btsVar;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ky7(dw9Var, tlsVar, i, 23);
        }
    }

    public static String c(String str, Object... objArr) {
        int indexOf;
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i2)) != -1) {
            sb.append((CharSequence) str, i2, indexOf);
            sb.append(d(objArr[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < objArr.length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(d(objArr[i]));
                i++;
                str2 = Extension.FIX_SPACE;
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String d(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str), (Throwable) e);
            StringBuilder x = unr0.x("<", str, " threw ");
            x.append(e.getClass().getName());
            x.append(">");
            return x.toString();
        }
    }

    public static final void e(sls slsVar) {
        new Handler(Looper.getMainLooper()).post(new ijs(10, slsVar));
    }
}
