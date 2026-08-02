package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class z8r0 implements e9r0 {
    public final String a;
    public final Text b;
    public final Text c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final rbv h;
    public final ColorModel i;
    public final String j;

    public z8r0(String str, Text text, Text text2, boolean z, boolean z2, boolean z3, String str2, rbv rbvVar, ColorModel colorModel, String str3) {
        this.a = str;
        this.b = text;
        this.c = text2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str2;
        this.h = rbvVar;
        this.i = colorModel;
        this.j = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8r0)) {
            return false;
        }
        z8r0 z8r0Var = (z8r0) obj;
        return jl40.l(this.a, z8r0Var.a) && jl40.l(this.b, z8r0Var.b) && jl40.l(this.c, z8r0Var.c) && this.d == z8r0Var.d && this.e == z8r0Var.e && this.f == z8r0Var.f && jl40.l(this.g, z8r0Var.g) && jl40.l(this.h, z8r0Var.h) && jl40.l(this.i, z8r0Var.i) && jl40.l(this.j, z8r0Var.j);
    }

    @Override // defpackage.e9r0
    public final String getKey() {
        return this.a;
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(unr0.e(n.c(this.c, n.c(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        rbv rbvVar = this.h;
        int hashCode2 = (hashCode + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31;
        ColorModel colorModel = this.i;
        int hashCode3 = (hashCode2 + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
        String str2 = this.j;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsListButtonItem(key=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", enabled=");
        sb.append(this.d);
        sb.append(", clickable=");
        nnm.v(", isLoading=", ", action=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", image=");
        sb.append(this.h);
        sb.append(", descriptionColors=");
        sb.append(this.i);
        sb.append(", analyticAction=");
        sb.append(this.j);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
