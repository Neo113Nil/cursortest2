package defpackage;

import android.content.res.Configuration;
import android.graphics.BlurMaskFilter;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class sg6 implements pyc {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sg6(float f, zg6 zg6Var) {
        this.b = f;
        this.c = zg6Var;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                zg6 zg6Var = (zg6) obj4;
                lh6 lh6Var = (lh6) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                lh6Var.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(lh6Var) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                boolean z = lh6Var instanceof ih6;
                vci vciVar = vci.a;
                if (z) {
                    oq5 oq5Var2 = (oq5) hq5Var;
                    oq5Var2.Z(-1418735510);
                    n7w.m(d.e(vciVar, ug6.c), oq5Var2, 0);
                    oq5Var2.p(false);
                } else {
                    boolean z2 = lh6Var instanceof jh6;
                    int i2 = intValue;
                    float f = this.b;
                    if (z2) {
                        oq5 oq5Var3 = (oq5) hq5Var;
                        oq5Var3.Z(-1418429912);
                        qs5 qs5Var = irv.a;
                        if (((Configuration) oq5Var3.j(AndroidCompositionLocals_androidKt.a)).screenWidthDp >= 900) {
                            oq5Var3.Z(-1418371756);
                            gh6.c(f, vciVar, oq5Var3, 0);
                            oq5Var3.p(false);
                        } else {
                            oq5Var3.Z(-1418105125);
                            gh6.a(f, oq5Var3, 0);
                            oq5Var3.p(false);
                        }
                        oq5Var3.p(false);
                    } else {
                        if (!(lh6Var instanceof kh6)) {
                            throw vz1.i((oq5) hq5Var, 1755348530, false);
                        }
                        oq5 oq5Var4 = (oq5) hq5Var;
                        oq5Var4.Z(-1417791467);
                        qs5 qs5Var2 = irv.a;
                        if (((Configuration) oq5Var4.j(AndroidCompositionLocals_androidKt.a)).screenWidthDp >= 900) {
                            oq5Var4.Z(-1417734117);
                            gh6.d((kh6) lh6Var, zg6Var, f, vciVar, oq5Var4, i2 & 14);
                            oq5Var4.p(false);
                        } else {
                            oq5Var4.Z(-1417442655);
                            gh6.b((kh6) lh6Var, zg6Var, f, oq5Var4, i2 & 14);
                            oq5Var4.p(false);
                        }
                        oq5Var4.p(false);
                    }
                }
                return Unit.a;
            default:
                elu eluVar = (elu) obj4;
                zkn zknVar = (zkn) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                zknVar.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((oq5) hq5Var2).f(zknVar) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    oq5 oq5Var5 = (oq5) hq5Var2;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        return Unit.a;
                    }
                }
                bs1 k = zknVar.b.k();
                if (k instanceof as1) {
                    oq5 oq5Var6 = (oq5) hq5Var2;
                    oq5Var6.Z(-1545241791);
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(ff7.Q(10, oq5Var6), BlurMaskFilter.Blur.NORMAL);
                    w4k w4kVar = ((as1) k).a;
                    jd6 jd6Var = zknVar.e;
                    g40 g40Var = zknVar.d;
                    bs2 n0 = swf.n0(eluVar, this.b, oq5Var6);
                    yci yciVar = vci.a;
                    if (n0 != null) {
                        dup dupVar = (dup) n0.b;
                        yciVar = kdi.b(kdi.a(xp3.u(yciVar, dupVar), dupVar), blurMaskFilter, n0.a);
                    }
                    irf.r(w4kVar, null, yciVar, g40Var, jd6Var, 0.0f, null, oq5Var6, 48, 96);
                    oq5Var6.p(false);
                } else if (Intrinsics.d(k, xr1.a) || (k instanceof zr1)) {
                    oq5 oq5Var7 = (oq5) hq5Var2;
                    oq5Var7.Z(-1544323788);
                    swf.e(0, 1, oq5Var7, null);
                    oq5Var7.p(false);
                } else {
                    if (!(k instanceof yr1)) {
                        throw vz1.i((oq5) hq5Var2, -1712417128, false);
                    }
                    oq5 oq5Var8 = (oq5) hq5Var2;
                    oq5Var8.Z(-1544206205);
                    swf.d(u1g.Q(eluVar), gce.d, null, null, 0L, 0L, false, oq5Var8, 48, 124);
                    oq5Var8.p(false);
                }
                return Unit.a;
        }
    }

    public /* synthetic */ sg6(elu eluVar, float f) {
        this.c = eluVar;
        this.b = f;
    }
}
