package defpackage;

import com.ybsdk.core.utils.ColorModel;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class rw51 {
    public final List a;
    public final ColorModel b;
    public final ColorModel c;

    public rw51(AbstractList abstractList, ColorModel colorModel, ColorModel colorModel2) {
        this.a = abstractList;
        this.b = colorModel;
        this.c = colorModel2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw51)) {
            return false;
        }
        rw51 rw51Var = (rw51) obj;
        return jl40.l(this.a, rw51Var.a) && jl40.l(this.b, rw51Var.b) && jl40.l(this.c, rw51Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ColorModel colorModel = this.b;
        int hashCode2 = (hashCode + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        ColorModel colorModel2 = this.c;
        return hashCode2 + (colorModel2 != null ? colorModel2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(progressIndicatorStateList=");
        sb.append(this.a);
        sb.append(", trackColor=");
        sb.append(this.b);
        sb.append(", indicatorColor=");
        return n.o(sb, this.c, Extension.C_BRAKE);
    }

    public /* synthetic */ rw51(ArrayList arrayList) {
        this(arrayList, null, null);
    }
}
