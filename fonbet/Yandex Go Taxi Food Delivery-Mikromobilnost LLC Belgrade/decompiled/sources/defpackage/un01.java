package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class un01 {
    public final Text.Constant a;
    public final rbv b;
    public final List c;

    public un01(Text.Constant constant, rbv rbvVar, List list) {
        this.a = constant;
        this.b = rbvVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un01)) {
            return false;
        }
        un01 un01Var = (un01) obj;
        return this.a.equals(un01Var.a) && this.b.equals(un01Var.b) && jl40.l(this.c, un01Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ly3.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransferQuickActionViewItem(title=");
        sb.append(this.a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", actions=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }
}
