package defpackage;

import com.ybsdk.core.utils.ColorModel;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class smu0 {
    public final String a;
    public final List b;
    public final vjf0 c;
    public final ColorModel d;

    public smu0(String str, List list, vjf0 vjf0Var, ColorModel colorModel) {
        this.a = str;
        this.b = list;
        this.c = vjf0Var;
        this.d = colorModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smu0)) {
            return false;
        }
        smu0 smu0Var = (smu0) obj;
        return jl40.l(this.a, smu0Var.a) && jl40.l(this.b, smu0Var.b) && jl40.l(this.c, smu0Var.c) && jl40.l(this.d, smu0Var.d);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        vjf0 vjf0Var = this.c;
        int hashCode = (c + (vjf0Var == null ? 0 : vjf0Var.hashCode())) * 31;
        ColorModel colorModel = this.d;
        return hashCode + (colorModel != null ? colorModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = xvz.r("StoriesPageEntity(id=", this.a, ", storyItemsList=", this.b, ", progressStyle=");
        r.append(this.c);
        r.append(", closeIconColor=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
