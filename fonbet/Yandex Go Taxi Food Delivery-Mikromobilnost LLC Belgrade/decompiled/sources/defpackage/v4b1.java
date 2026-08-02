package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import coil.view.Precision;
import coil.view.Scale;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.ybsdk.core.utils.ext.a;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class v4b1 {
    public static final void a(f530 f530Var, String str, hoy0 hoy0Var, tls tlsVar, ety0 ety0Var, wp2 wp2Var, int i, ety0 ety0Var2, wp2 wp2Var2, lkx lkxVar, fid fidVar, int i2) {
        bts btsVar;
        int i3;
        wp2 wp2Var3;
        int i4;
        wp2 wp2Var4;
        int i5;
        wp2 wp2Var5;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-275264717);
        int i6 = i2 | (btsVar2.k(f530Var) ? 4 : 2) | (btsVar2.k(str) ? 32 : 16) | (btsVar2.k(hoy0Var) ? 256 : 128) | (btsVar2.e(tlsVar) ? 2048 : 1024) | (btsVar2.k(ety0Var) ? 16384 : 8192) | (btsVar2.k(wp2Var) ? 131072 : 65536) | 524288 | (btsVar2.k(ety0Var2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC) | 100663296 | (btsVar2.k(lkxVar) ? 536870912 : SelfTester_JCP.IMITA);
        if (btsVar2.V(i6 & 1, (306783379 & i6) != 306783378)) {
            btsVar2.a0();
            if ((i2 & 1) == 0 || btsVar2.C()) {
                i4 = i6 & (-3670017);
                wp2Var4 = AppColor$Palette.TextMinor;
                i5 = 3;
            } else {
                btsVar2.Y();
                i4 = i6 & (-3670017);
                i5 = i;
                wp2Var4 = wp2Var2;
            }
            int i7 = i4;
            btsVar2.u();
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d2 = b.d(btsVar2, f530Var);
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
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d2);
            int i8 = i5;
            int i9 = i7 >> 9;
            ne5.a(hoy0Var, tlsVar, f530Var, true, false, ety0.a(ety0Var, tje.n(wp2Var, btsVar2), 0L, null, null, null, 0L, null, null, null, i5, 0L, null, null, 16744446), lkxVar, null, false, 0, 0, null, null, null, new a6t0(tje.n(new up2(aq2.a), btsVar2)), null, btsVar2, ((i7 >> 6) & HProv.PP_DELETE_SAVED_PASSWD) | (i9 & 3670016), 0, 49040);
            btsVar = btsVar2;
            if (hoy0Var.a.b.length() == 0) {
                btsVar.e0(273395740);
                wp2Var5 = wp2Var4;
                jeb1.f(str, f530Var, wp2Var5, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var2, btsVar, ((i7 >> 3) & 14) | ((i7 << 3) & 112) | 384, i9 & HProv.ALG_CLASS_ALL, 16376);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                wp2Var5 = wp2Var4;
                btsVar.e0(273531241);
                btsVar.t(false);
            }
            btsVar.t(true);
            wp2Var3 = wp2Var5;
            i3 = i8;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            i3 = i;
            wp2Var3 = wp2Var2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z25(f530Var, str, hoy0Var, tlsVar, ety0Var, wp2Var, i3, ety0Var2, wp2Var3, lkxVar, i2);
        }
    }

    public static final void b(String str, sls slsVar, fid fidVar, int i) {
        sls slsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1033218595);
        int i2 = (btsVar.k(str) ? 4 : 2) | i | (btsVar.e(slsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            slsVar2 = slsVar;
            d17.c(an91.n(c530.a, 8.0f, 16.0f, 8.0f, 8.0f), false, null, ButtonStyle.Main, null, slsVar2, wwg.S(2070567871, true, new jk30(str, 23), btsVar), btsVar, ((i2 << 12) & ImageMetadata.JPEG_GPS_COORDINATES) | 1575936, 22);
        } else {
            slsVar2 = slsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fj5(i, 9, slsVar2, str);
        }
    }

    public static final void c(g7p0 g7p0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1201967536);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(g7p0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            rzo.b(null, "default", wwg.S(-294913678, true, new bpn0(12, g7p0Var, tlsVar), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(g7p0Var, tlsVar, i, 11);
        }
    }

    public static final void d(String str, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1961480963);
        int i2 = 2;
        int i3 = (btsVar.k(str) ? 4 : 2) | i;
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            ydb1.a(an91.o(c530.a, 0.0f, 8.0f, 0.0f, 0.0f, 13), null, wwg.S(112503758, true, new jk30(str, 24), btsVar), null, null, null, null, false, btsVar, 390, 250);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qpm0(str, i, i2);
        }
    }

    public static final void e(pvi0 pvi0Var, fid fidVar, int i) {
        pvi0 pvi0Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(619970841);
        int i2 = (btsVar.k(pvi0Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            pvi0Var2 = pvi0Var;
            v0b1.a(pvi0Var2, ymb1.l(an91.m(ljs0.g(ljs0.c(c530.a, 1.0f), 0.0f, 400.0f, 1), 16.0f, 0.0f, 2), cyk0.c(16.0f)), null, null, null, null, null, mhe.a, 0.0f, 0, btsVar, (i2 & 14) | 12582912, 892);
        } else {
            pvi0Var2 = pvi0Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new e3o0(pvi0Var2, i, 9);
        }
    }

    public static final void f(int i) {
        if (i != 0) {
            return;
        }
        Exception exc = new Exception("Attempt to create image model with resId == 0");
        trp0 trp0Var = trp0.a;
        trp0.e(new kqp0(null, null, exc.getMessage(), exc, 17));
    }

    public static final void g(rbv rbvVar, Context context) {
        wis0 wis0Var;
        bev b = a.b(context, 6, false);
        if (rbvVar instanceof ibv) {
            b.c = ((ibv) rbvVar).a;
            b.n(wis0.c);
        } else {
            if (rbvVar instanceof jbv) {
                g(((jbv) rbvVar).a.a(context), context);
                return;
            }
            if (rbvVar instanceof lbv) {
                b.c = Integer.valueOf(((lbv) rbvVar).a);
                b.n(wis0.c);
            } else if (rbvVar instanceof mbv) {
                mbv mbvVar = (mbv) rbvVar;
                b.c = Integer.valueOf(rje.h(context) ? mbvVar.a : mbvVar.b);
                b.n(wis0.c);
            } else if (rbvVar instanceof nbv) {
                nbv nbvVar = (nbv) rbvVar;
                tev tevVar = nbvVar.b;
                if (tevVar != null) {
                    int i = tevVar.a;
                    jh91 jh91Var = nkj.a;
                    jh91 lkjVar = i > 0 ? new lkj(i) : jh91Var;
                    int i2 = tevVar.b;
                    if (i2 > 0) {
                        jh91Var = new lkj(i2);
                    }
                    wis0Var = new wis0(lkjVar, jh91Var);
                } else {
                    wis0Var = null;
                }
                b.c = Integer.valueOf(nbvVar.a);
                if (wis0Var == null) {
                    wis0Var = wis0.c;
                }
                b.n(wis0Var);
            } else if (!(rbvVar instanceof pbv)) {
                if (rbvVar == null) {
                    return;
                }
                w511.b();
                return;
            } else {
                pbv pbvVar = (pbv) rbvVar;
                a.e(b, pbvVar.a, pbvVar.c, context);
                b.y = Scale.FILL;
            }
        }
        a.f().b(b.d());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final hbv h(rbv rbvVar, TextView textView, int i, int i2) {
        wmt0 wmt0Var = new wmt0(i, i2, textView);
        bev b = a.b(textView.getContext(), 4, true);
        b.d = wmt0Var;
        b.l();
        boolean z = rbvVar instanceof jbv;
        if (z) {
            return h(((jbv) rbvVar).a.a(textView.getContext()), textView, i, i2);
        }
        boolean z2 = rbvVar instanceof pbv;
        int i3 = 0;
        if (z2 || (rbvVar instanceof nbv)) {
            Context context = textView.getContext();
            if (z2) {
                pbv pbvVar = (pbv) rbvVar;
                a.e(b, pbvVar.a, pbvVar.c, context);
                b.y = Scale.FIT;
            } else if (rbvVar instanceof nbv) {
                nbv nbvVar = (nbv) rbvVar;
                int i4 = nbvVar.a;
                tev tevVar = nbvVar.b;
                i5z0.a.a("Load image from resource", new Object[0]);
                a.d(b, Integer.valueOf(i4), tevVar, context);
                b.y = Scale.FIT;
            } else {
                if (!(rbvVar instanceof ibv) && !z && !(rbvVar instanceof lbv) && !(rbvVar instanceof mbv)) {
                    w511.b();
                    return null;
                }
                b = null;
            }
            if (b != null) {
                b.d = wmt0Var;
                b.l();
                if (b != null) {
                    return null;
                }
                pva1.d(b, rbvVar, new Exception("Just for stacktrace capturing"));
                return new ybv(a.f().b(b.d()), i3);
            }
        } else if (!(rbvVar instanceof ibv) && !(rbvVar instanceof lbv) && !(rbvVar instanceof mbv)) {
            w511.b();
            return null;
        }
        b = null;
        if (b != null) {
        }
    }

    public static final hbv j(rbv rbvVar, final ImageView imageView, boolean z, tls tlsVar, tls tlsVar2) {
        bev bevVar = new bev(imageView.getContext());
        bevVar.a();
        bevVar.c(z);
        bevVar.h(new pac(tlsVar, tlsVar));
        bevVar.d = new ugv(imageView, tlsVar2);
        bevVar.l();
        wis0 wis0Var = null;
        if (rbvVar instanceof jbv) {
            return k(((jbv) rbvVar).a.a(imageView.getContext()), imageView, tlsVar, null, 4);
        }
        final int i = 1;
        if (rbvVar instanceof ibv) {
            bevVar.c = ((ibv) rbvVar).a;
            sjh sjhVar = uyj.a;
            bevVar.q = o400.a.x;
            bevVar.n(wis0.c);
        } else if (rbvVar instanceof nbv) {
            nbv nbvVar = (nbv) rbvVar;
            tev tevVar = nbvVar.b;
            if (tevVar != null) {
                int i2 = tevVar.a;
                jh91 jh91Var = nkj.a;
                jh91 lkjVar = i2 > 0 ? new lkj(i2) : jh91Var;
                int i3 = tevVar.b;
                if (i3 > 0) {
                    jh91Var = new lkj(i3);
                }
                wis0Var = new wis0(lkjVar, jh91Var);
            }
            bevVar.c = Integer.valueOf(nbvVar.a);
            sjh sjhVar2 = uyj.a;
            bevVar.q = o400.a.x;
            if (wis0Var == null) {
                wis0Var = wis0.c;
            }
            bevVar.n(wis0Var);
        } else {
            final int i4 = 0;
            if (rbvVar instanceof pbv) {
                pbv pbvVar = (pbv) rbvVar;
                String str = pbvVar.a;
                vfv vfvVar = pbvVar.e;
                tev tevVar2 = pbvVar.c;
                a.e(bevVar, str, tevVar2, imageView.getContext());
                bevVar.y = Scale.FILL;
                dcv dcvVar = pbvVar.d;
                if (dcvVar instanceof ccv) {
                    bevVar.u = Integer.valueOf(((ccv) dcvVar).a);
                    bevVar.v = null;
                } else if (dcvVar instanceof bcv) {
                    bevVar.v = ((bcv) dcvVar).a;
                    bevVar.u = 0;
                } else if (dcvVar != null) {
                    w511.b();
                    return null;
                }
                if (jl40.l(vfvVar, h2b1.G)) {
                    bevVar.p(new iub());
                } else if (vfvVar instanceof ufv) {
                    ufv ufvVar = (ufv) vfvVar;
                    if (ufvVar.x) {
                        bevVar.x = new com.ybsdk.core.utils.a(imageView, tevVar2);
                        bevVar.l();
                    } else {
                        bevVar.x = new qdi0(imageView);
                        bevVar.l();
                    }
                    bevVar.i = Precision.EXACT;
                    bevVar.p(new jyk0(kp50.s(ufvVar.a), kp50.s(ufvVar.b), kp50.s(ufvVar.c), kp50.s(ufvVar.w)));
                } else if (vfvVar != null) {
                    w511.b();
                    return null;
                }
                if (pbvVar.f) {
                    bevVar.e();
                }
                a.a(bevVar, pbvVar.b);
            } else if (rbvVar instanceof lbv) {
                final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                ref$BooleanRef.element = false;
                bevVar.c = Integer.valueOf(((lbv) rbvVar).a);
                kxa1.d(bevVar, 0);
                bev.m(bevVar, "coil#animation_start_callback", new sls() { // from class: wbv
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i5 = i4;
                        zy11 zy11Var = zy11.a;
                        ImageView imageView2 = imageView;
                        Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                        switch (i5) {
                            case 0:
                                if (!ref$BooleanRef2.element) {
                                    Drawable drawable = imageView2.getDrawable();
                                    if (drawable != null) {
                                        a.i(drawable);
                                    }
                                    ref$BooleanRef2.element = true;
                                    break;
                                }
                                break;
                            default:
                                if (!ref$BooleanRef2.element) {
                                    Drawable drawable2 = imageView2.getDrawable();
                                    if (drawable2 != null) {
                                        a.i(drawable2);
                                    }
                                    ref$BooleanRef2.element = true;
                                    break;
                                }
                                break;
                        }
                        return zy11Var;
                    }
                });
            } else {
                if (!(rbvVar instanceof mbv)) {
                    if (rbvVar == null) {
                        imageView.setImageDrawable(null);
                        return new xbv();
                    }
                    w511.b();
                    return null;
                }
                final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                mbv mbvVar = (mbv) rbvVar;
                ref$BooleanRef2.element = mbvVar.d;
                bevVar.c = Integer.valueOf(rje.h(imageView.getContext()) ? mbvVar.a : mbvVar.b);
                kxa1.d(bevVar, mbvVar.c);
                bev.m(bevVar, "coil#animation_start_callback", new sls() { // from class: wbv
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i5 = i;
                        zy11 zy11Var = zy11.a;
                        ImageView imageView2 = imageView;
                        Ref$BooleanRef ref$BooleanRef22 = ref$BooleanRef2;
                        switch (i5) {
                            case 0:
                                if (!ref$BooleanRef22.element) {
                                    Drawable drawable = imageView2.getDrawable();
                                    if (drawable != null) {
                                        a.i(drawable);
                                    }
                                    ref$BooleanRef22.element = true;
                                    break;
                                }
                                break;
                            default:
                                if (!ref$BooleanRef22.element) {
                                    Drawable drawable2 = imageView2.getDrawable();
                                    if (drawable2 != null) {
                                        a.i(drawable2);
                                    }
                                    ref$BooleanRef22.element = true;
                                    break;
                                }
                                break;
                        }
                        return zy11Var;
                    }
                });
            }
        }
        pva1.d(bevVar, rbvVar, new Exception("Just for stacktrace capturing"));
        return new ybv(a.f().b(bevVar.d()), i);
    }

    public static hbv k(rbv rbvVar, ImageView imageView, tls tlsVar, tls tlsVar2, int i) {
        if ((i & 2) != 0) {
            tlsVar = new jiu(13);
        }
        if ((i & 4) != 0) {
            tlsVar2 = new qu(14);
        }
        return j(rbvVar, imageView, true, tlsVar, tlsVar2);
    }
}
