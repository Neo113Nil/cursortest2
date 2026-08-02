package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class zfh implements zls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ xfh c;
    public final /* synthetic */ wp2 w;

    public /* synthetic */ zfh(xfh xfhVar, CharSequence charSequence, wp2 wp2Var) {
        this.c = xfhVar;
        this.b = charSequence;
        this.w = wp2Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        xfh xfhVar = this.c;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    c530 c530Var = c530.a;
                    f530 d = b.d(btsVar, c530Var);
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
                    f530 d2 = i891.d(an91.o(c530Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), xfhVar.h);
                    AppColor$Palette appColor$Palette = AppColor$Palette.Text;
                    CharSequence charSequence = this.b;
                    wp2 wp2Var = this.w;
                    n8p.a(charSequence, wp2Var, d2, appColor$Palette, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 16);
                    CharSequence charSequence2 = xfhVar.c;
                    if (charSequence2 == null || charSequence2.length() == 0) {
                        btsVar.e0(-461019122);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-461300044);
                        n8p.a(xfhVar.c, wp2Var, i891.d(an91.o(c530Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), xfhVar.i), AppColor$Palette.TextMinor, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 16);
                        btsVar.t(false);
                    }
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(1 & intValue2, (intValue2 & 17) != 16)) {
                    CharSequence charSequence3 = this.b;
                    if (charSequence3 == null || charSequence3.length() == 0) {
                        btsVar2.e0(-1522214422);
                        btsVar2.t(false);
                    } else {
                        btsVar2.e0(-1522647120);
                        f530 f530Var = c530.a;
                        f530 o2 = an91.o(f530Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                        int i2 = xfhVar.g;
                        if (i2 > 0) {
                            f530Var = ljs0.q(f530Var, i2);
                        }
                        n8p.a(charSequence3, this.w, i891.d(o2.k(f530Var), xfhVar.k), AppColor$Palette.Text, new sjy0(6), btsVar2, HProv.ALG_TYPE_SECURECHANNEL, 0);
                        btsVar2.t(false);
                    }
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ zfh(CharSequence charSequence, xfh xfhVar, wp2 wp2Var) {
        this.b = charSequence;
        this.c = xfhVar;
        this.w = wp2Var;
    }
}
