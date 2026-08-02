package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class huk implements yie {
    public final boolean a;
    public final float b;
    public final aqi c;

    public huk(boolean z, float f, aqi aqiVar) {
        this.a = z;
        this.b = f;
        this.c = aqiVar;
    }

    @Override // defpackage.yie
    public final zie a(uoi uoiVar, oq5 oq5Var) {
        long mo26defaultColorWaAFU9c;
        oq5Var.Z(988743187);
        jeo jeoVar = (jeo) oq5Var.j(keo.a);
        aqi aqiVar = this.c;
        if (((d85) aqiVar.getValue()).a != 16) {
            oq5Var.Z(-303557454);
            oq5Var.p(false);
            mo26defaultColorWaAFU9c = ((d85) aqiVar.getValue()).a;
        } else {
            oq5Var.Z(-303499670);
            mo26defaultColorWaAFU9c = jeoVar.mo26defaultColorWaAFU9c(oq5Var, 0);
            oq5Var.p(false);
        }
        aqi o0 = szf.o0(new d85(mo26defaultColorWaAFU9c), oq5Var);
        aqi o02 = szf.o0(jeoVar.rippleAlpha(oq5Var, 0), oq5Var);
        oq5Var.Z(331259447);
        ViewGroup i = wxf.i((View) oq5Var.j(AndroidCompositionLocals_androidKt.f));
        boolean f = oq5Var.f(uoiVar) | oq5Var.f(this) | oq5Var.f(i);
        Object K = oq5Var.K();
        Object obj = gq5.a;
        if (f || K == obj) {
            Object ii0Var = new ii0(this.a, this.b, o0, o02, i);
            oq5Var.k0(ii0Var);
            K = ii0Var;
        }
        ii0 ii0Var2 = (ii0) K;
        oq5Var.p(false);
        boolean f2 = oq5Var.f(uoiVar) | oq5Var.h(ii0Var2);
        Object K2 = oq5Var.K();
        if (f2 || K2 == obj) {
            K2 = new kun(uoiVar, ii0Var2, null, 7);
            oq5Var.k0(K2);
        }
        gld.y(ii0Var2, uoiVar, (Function2) K2, oq5Var);
        oq5Var.p(false);
        return ii0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof huk)) {
            return false;
        }
        huk hukVar = (huk) obj;
        return this.a == hukVar.a && cma.a(this.b, hukVar.b) && this.c.equals(hukVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + eta.a(Boolean.hashCode(this.a) * 31, this.b, 31);
    }
}
