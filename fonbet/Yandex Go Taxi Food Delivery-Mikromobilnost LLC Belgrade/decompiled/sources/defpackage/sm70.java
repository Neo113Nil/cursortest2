package defpackage;

import androidx.core.view.AccessibilityDelegateCompat;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class sm70 implements fn70 {
    public final bvc0 a;
    public final Integer b;
    public final String c;
    public final Integer d;
    public final AccessibilityDelegateCompat e;
    public final ay4 f;

    public sm70(bvc0 bvc0Var, Integer num, String str, Integer num2, bi biVar, ay4 ay4Var, int i) {
        num = (i & 2) != 0 ? null : num;
        str = (i & 4) != 0 ? null : str;
        num2 = (i & 8) != 0 ? null : num2;
        biVar = (i & 16) != 0 ? null : biVar;
        ay4Var = (i & 64) != 0 ? rm70.c : ay4Var;
        this.a = bvc0Var;
        this.b = num;
        this.c = str;
        this.d = num2;
        this.e = biVar;
        this.f = ay4Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sm70)) {
            return this == obj;
        }
        sm70 sm70Var = (sm70) obj;
        return jl40.l(this.b, sm70Var.b) && jl40.l(this.c, sm70Var.c) && jl40.l(this.d, sm70Var.d) && jl40.l(this.f, sm70Var.f);
    }

    public final int hashCode() {
        Integer num = this.b;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num2 = this.d;
        return this.f.hashCode() + oyr.b(0, (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CarIndex(platesData=");
        sb.append(this.a);
        sb.append(", color=");
        sb.append(this.b);
        sb.append(", imageUrl=");
        vfc.w(this.d, this.c, ", imageRes=", ", accessibilityDelegate=", sb);
        sb.append(this.e);
        sb.append(", marginEnd=0, layout=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
