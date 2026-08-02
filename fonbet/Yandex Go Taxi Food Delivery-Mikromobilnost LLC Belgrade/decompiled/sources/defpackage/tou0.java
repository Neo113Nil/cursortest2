package defpackage;

import com.ybsdk.core.utils.ColorModel;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class tou0 extends wou0 {
    public final String c;
    public final rr51 d;
    public final ColorModel e;
    public final List f;
    public final int g;

    public tou0(String str, rr51 rr51Var, ColorModel colorModel, ArrayList arrayList, int i) {
        super(str, arrayList == null ? scc.h(colorModel) : arrayList);
        this.c = str;
        this.d = rr51Var;
        this.e = colorModel;
        this.f = arrayList;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tou0)) {
            return false;
        }
        tou0 tou0Var = (tou0) obj;
        return jl40.l(this.c, tou0Var.c) && jl40.l(this.d, tou0Var.d) && jl40.l(this.e, tou0Var.e) && jl40.l(this.f, tou0Var.f) && this.g == tou0Var.g;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
        ColorModel colorModel = this.e;
        int hashCode2 = (hashCode + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        List list = this.f;
        return Integer.hashCode(this.g) + ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DivKitItemEntity(id=");
        sb.append(this.c);
        sb.append(", divData=");
        sb.append(this.d);
        sb.append(", backgroundColor=");
        sb.append(this.e);
        sb.append(", gradientBackground=");
        sb.append(this.f);
        sb.append(", maxProgressValueMs=");
        return oyr.m(this.g, Extension.C_BRAKE, sb);
    }
}
