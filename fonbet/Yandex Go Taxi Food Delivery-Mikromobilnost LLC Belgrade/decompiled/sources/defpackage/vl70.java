package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class vl70 {
    public final tl70 a;
    public final String b;
    public final String c;
    public final List d;
    public final ql70 e;

    static {
        ut11 ut11Var = UiStateDrawableWrapper.Companion;
    }

    public vl70(tl70 tl70Var, String str, String str2, List list, ql70 ql70Var) {
        this.a = tl70Var;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = ql70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl70)) {
            return false;
        }
        vl70 vl70Var = (vl70) obj;
        return this.a.equals(vl70Var.a) && jl40.l(this.b, vl70Var.b) && jl40.l(this.c, vl70Var.c) && jl40.l(this.d, vl70Var.d) && this.e.equals(vl70Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.c(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderCancelUiState(headerImage=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", text=");
        tse0.x(this.c, ", actionItems=", ", buttons=", sb, this.d);
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
