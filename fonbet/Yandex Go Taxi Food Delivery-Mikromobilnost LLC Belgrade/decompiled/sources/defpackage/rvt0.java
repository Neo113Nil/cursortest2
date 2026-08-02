package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class rvt0 {
    public final ColorModel a;
    public final Integer b;
    public final Integer c;

    public rvt0(ColorModel colorModel, Integer num, Integer num2) {
        this.a = colorModel;
        this.b = num;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvt0)) {
            return false;
        }
        rvt0 rvt0Var = (rvt0) obj;
        return this.a.equals(rvt0Var.a) && jl40.l(this.b, rvt0Var.b) && jl40.l(this.c, rvt0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpoilerEntity(particleColor=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return oo31.j(sb, this.c, Extension.C_BRAKE);
    }
}
