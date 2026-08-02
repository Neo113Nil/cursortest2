package defpackage;

import com.ybsdk.core.utils.ColorModel;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class xg31 implements ah31 {
    public final ArrayList a;
    public final ColorModel b;

    public xg31(ArrayList arrayList, ColorModel colorModel) {
        this.a = arrayList;
        this.b = colorModel;
    }

    public final ColorModel a() {
        return this.b;
    }

    public final List b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg31)) {
            return false;
        }
        xg31 xg31Var = (xg31) obj;
        return this.a.equals(xg31Var.a) && jl40.l(this.b, xg31Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ColorModel colorModel = this.b;
        return hashCode + (colorModel == null ? 0 : colorModel.hashCode());
    }

    public final String toString() {
        return "Content(storiesPageStates=" + this.a + ", closeIconColor=" + this.b + Extension.C_BRAKE;
    }
}
