package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class v8m0 {
    public final String a;
    public final Text.Constant b;
    public final Text.Constant c;
    public final Text.Constant d;
    public final Text.Constant e;
    public final Text.Constant f;
    public final ArrayList g;

    public v8m0(String str, Text.Constant constant, Text.Constant constant2, Text.Constant constant3, Text.Constant constant4, Text.Constant constant5, ArrayList arrayList) {
        this.a = str;
        this.b = constant;
        this.c = constant2;
        this.d = constant3;
        this.e = constant4;
        this.f = constant5;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8m0)) {
            return false;
        }
        v8m0 v8m0Var = (v8m0) obj;
        return jl40.l(this.a, v8m0Var.a) && this.b.equals(v8m0Var.b) && this.c.equals(v8m0Var.c) && this.d.equals(v8m0Var.d) && this.e.equals(v8m0Var.e) && this.f.equals(v8m0Var.f) && this.g.equals(v8m0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + xvz.d(this.f, xvz.d(this.e, xvz.d(this.d, xvz.d(this.c, xvz.d(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Period(id=");
        sb.append(this.a);
        sb.append(", chipTitle=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", income=");
        sb.append(this.d);
        sb.append(", startDate=");
        sb.append(this.e);
        sb.append(", endDate=");
        sb.append(this.f);
        sb.append(", points=");
        return b64.n(Extension.C_BRAKE, sb, this.g);
    }
}
