package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class z8m0 {
    public final Text.Constant a;
    public final Text.Constant b;
    public final Text.Constant c;
    public final Text.Constant d;
    public final Text.Constant e;
    public final Text f;
    public final Text g;
    public final ArrayList h;
    public final int i;
    public final boolean j;
    public final boolean k;

    public z8m0(Text.Constant constant, Text.Constant constant2, Text.Constant constant3, Text.Constant constant4, Text.Constant constant5, Text text, Text text2, ArrayList arrayList, int i, boolean z, boolean z2) {
        this.a = constant;
        this.b = constant2;
        this.c = constant3;
        this.d = constant4;
        this.e = constant5;
        this.f = text;
        this.g = text2;
        this.h = arrayList;
        this.i = i;
        this.j = z;
        this.k = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8m0)) {
            return false;
        }
        z8m0 z8m0Var = (z8m0) obj;
        return this.a.equals(z8m0Var.a) && this.b.equals(z8m0Var.b) && this.c.equals(z8m0Var.c) && this.d.equals(z8m0Var.d) && this.e.equals(z8m0Var.e) && jl40.l(this.f, z8m0Var.f) && jl40.l(this.g, z8m0Var.g) && this.h.equals(z8m0Var.h) && this.i == z8m0Var.i && this.j == z8m0Var.j && this.k == z8m0Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + unr0.e(oyr.b(this.i, ly3.b(n.c(this.g, n.c(this.f, xvz.d(this.e, xvz.d(this.d, xvz.d(this.c, xvz.d(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31, this.h), 31), 31, this.j);
    }

    public final String toString() {
        StringBuilder u = ly3.u("Period(subtitle=", this.a, ", progressEnd=", this.b, ", progressStart=");
        u.append(this.c);
        u.append(", startDate=");
        u.append(this.d);
        u.append(", startYear=");
        u.append(this.e);
        u.append(", endDate=");
        u.append(this.f);
        u.append(", endYear=");
        u.append(this.g);
        u.append(", dates=");
        u.append(this.h);
        u.append(", dateCurrent=");
        tse0.z(u, this.i, ", showLock=", this.j, ", progressBarInteractionEnabled=");
        return x4e.i(u, this.k, Extension.C_BRAKE);
    }
}
