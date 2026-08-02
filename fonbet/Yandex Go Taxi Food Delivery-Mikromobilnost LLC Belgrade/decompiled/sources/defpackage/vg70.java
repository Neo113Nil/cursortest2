package defpackage;

import com.yandex.go.requirements.api.domain.model.OptionType;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class vg70 {
    public final String a;
    public final OptionType b;
    public final ArrayList c;

    public vg70(String str, OptionType optionType, ArrayList arrayList) {
        this.a = str;
        this.b = optionType;
        this.c = arrayList;
    }

    public static vg70 a(vg70 vg70Var, ArrayList arrayList) {
        String str = vg70Var.a;
        OptionType optionType = vg70Var.b;
        vg70Var.getClass();
        return new vg70(str, optionType, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg70)) {
            return false;
        }
        vg70 vg70Var = (vg70) obj;
        return jl40.l(this.a, vg70Var.a) && this.b == vg70Var.b && this.c.equals(vg70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OptionsInfo(optionCategoryCaption=");
        sb.append(this.a);
        sb.append(", optionType=");
        sb.append(this.b);
        sb.append(", options=");
        return b64.n(Extension.C_BRAKE, sb, this.c);
    }
}
