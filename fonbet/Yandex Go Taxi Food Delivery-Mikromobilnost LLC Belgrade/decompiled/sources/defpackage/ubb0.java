package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ubb0 {
    public final String a;
    public final ColorModel b;
    public final rr51 c;
    public final float d;
    public final float e;
    public final float f;

    public ubb0(String str, ColorModel colorModel, rr51 rr51Var, float f, float f2, float f3) {
        this.a = str;
        this.b = colorModel;
        this.c = rr51Var;
        this.d = f;
        this.e = f2;
        this.f = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubb0)) {
            return false;
        }
        ubb0 ubb0Var = (ubb0) obj;
        return jl40.l(this.a, ubb0Var.a) && jl40.l(this.b, ubb0Var.b) && jl40.l(this.c, ubb0Var.c) && Float.compare(this.d, ubb0Var.d) == 0 && Float.compare(this.e, ubb0Var.e) == 0 && Float.compare(this.f, ubb0Var.f) == 0;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ColorModel colorModel = this.b;
        int hashCode2 = (hashCode + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        rr51 rr51Var = this.c;
        return Float.hashCode(this.f) + g8e.c(this.e, g8e.c(this.d, (hashCode2 + (rr51Var != null ? rr51Var.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(logId=");
        sb.append(this.a);
        sb.append(", backgroundBlurColor=");
        sb.append(this.b);
        sb.append(", content=");
        sb.append(this.c);
        sb.append(", centerXMultiplier=");
        sb.append(this.d);
        sb.append(", centerYMultiplier=");
        return ly3.q(sb, this.e, ", radiusMultiplier=", this.f, Extension.C_BRAKE);
    }
}
