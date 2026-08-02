package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.o;

/* loaded from: classes4.dex */
public final class t451 {
    public final ColorModel a;
    public final ColorModel b;
    public final Text.Constant c;
    public final String d;
    public final rbv e;
    public final o f;
    public final boolean g;

    public t451(ColorModel colorModel, ColorModel colorModel2, Text.Constant constant, String str, rbv rbvVar, o oVar, boolean z) {
        this.a = colorModel;
        this.b = colorModel2;
        this.c = constant;
        this.d = str;
        this.e = rbvVar;
        this.f = oVar;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t451)) {
            return false;
        }
        t451 t451Var = (t451) obj;
        return this.a.equals(t451Var.a) && this.b.equals(t451Var.b) && this.c.equals(t451Var.c) && jl40.l(this.d, t451Var.d) && jl40.l(this.e, t451Var.e) && this.f.equals(t451Var.f) && this.g == t451Var.g;
    }

    public final int hashCode() {
        int b = unr0.b(xvz.d(this.c, vfc.d(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
        rbv rbvVar = this.e;
        return Boolean.hashCode(true) + unr0.e((this.f.hashCode() + ((b + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WidgetViewState(backgroundColor=");
        sb.append(this.a);
        sb.append(", textColor=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", spanOnClickAction=");
        sb.append(this.d);
        sb.append(", spanImageModel=");
        sb.append(this.e);
        sb.append(", toggleViewState=");
        sb.append(this.f);
        sb.append(", isClickable=");
        return x4e.i(sb, this.g, ", isEnabled=true)");
    }
}
