package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lx1q0;", "", "Companion", "v1q0", "w1q0", "flex-section-extension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class x1q0 {
    public static final w1q0 Companion = new w1q0();
    public final float a;
    public final float b;
    public final h1q0 c;
    public final int d;
    public final Integer e;
    public final Integer f;
    public final Integer g;

    public /* synthetic */ x1q0(int i, float f, float f2, h1q0 h1q0Var, int i2, Integer num, Integer num2, Integer num3) {
        if ((i & 1) == 0) {
            this.a = 0.0f;
        } else {
            this.a = f;
        }
        if ((i & 2) == 0) {
            this.b = 0.0f;
        } else {
            this.b = f2;
        }
        if ((i & 4) == 0) {
            this.c = s8o.c;
        } else {
            this.c = h1q0Var;
        }
        if ((i & 8) == 0) {
            this.d = 60;
        } else {
            this.d = i2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!x1q0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        x1q0 x1q0Var = (x1q0) obj;
        return this.a == x1q0Var.a && this.b == x1q0Var.b && jl40.l(this.c, x1q0Var.c) && this.d == x1q0Var.d && jl40.l(this.e, x1q0Var.e) && jl40.l(this.f, x1q0Var.f) && jl40.l(this.g, x1q0Var.g);
    }

    public final int hashCode() {
        int hashCode = (((this.c.hashCode() + g8e.c(this.b, Float.hashCode(this.a) * 31, 31)) * 31) + this.d) * 31;
        Integer num = this.e;
        int intValue = (hashCode + (num != null ? num.intValue() : 0)) * 31;
        Integer num2 = this.f;
        int intValue2 = (intValue + (num2 != null ? num2.intValue() : 0)) * 31;
        Integer num3 = this.g;
        return intValue2 + (num3 != null ? num3.intValue() : 0);
    }

    public final String toString() {
        StringBuilder k = oo31.k("SectionLayout(itemVerticalSpacing=", this.a, ", itemHorizontalSpacing=", this.b, ", sectionInsets=");
        k.append(this.c);
        k.append(", columnCount=");
        k.append(this.d);
        k.append(", maxContentWidth=");
        k.append(this.e);
        k.append(", columnSpan=");
        k.append(this.f);
        k.append(", rowSpan=");
        return oo31.j(k, this.g, Extension.C_BRAKE);
    }

    public x1q0() {
        this(0);
    }

    public x1q0(int i) {
        h1q0 h1q0Var = s8o.c;
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = h1q0Var;
        this.d = 60;
        this.e = null;
        this.f = null;
        this.g = null;
    }
}
