package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xas {
    public final eu01 a;
    public final Text.Constant b;
    public final Text.Constant c;
    public final rbv d;
    public final YbButtonView.a e;
    public final String f;
    public final oas g;

    public xas(eu01 eu01Var, Text.Constant constant, Text.Constant constant2, rbv rbvVar, YbButtonView.a aVar, String str, oas oasVar) {
        this.a = eu01Var;
        this.b = constant;
        this.c = constant2;
        this.d = rbvVar;
        this.e = aVar;
        this.f = str;
        this.g = oasVar;
    }

    public final oas a() {
        return this.g;
    }

    public final String b() {
        return this.f;
    }

    public final YbButtonView.a c() {
        return this.e;
    }

    public final Text d() {
        return this.c;
    }

    public final rbv e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xas)) {
            return false;
        }
        xas xasVar = (xas) obj;
        return this.a.equals(xasVar.a) && this.b.equals(xasVar.b) && this.c.equals(xasVar.c) && jl40.l(this.d, xasVar.d) && this.e.equals(xasVar.e) && jl40.l(this.f, xasVar.f) && jl40.l(this.g, xasVar.g);
    }

    public final Text f() {
        return this.b;
    }

    public final gu01 g() {
        return this.a;
    }

    public final int hashCode() {
        int d = xvz.d(this.c, xvz.d(this.b, this.a.hashCode() * 31, 31), 31);
        rbv rbvVar = this.d;
        int hashCode = (this.e.hashCode() + ((d + (rbvVar == null ? 0 : rbvVar.hashCode())) * 31)) * 31;
        String str = this.f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        oas oasVar = this.g;
        return hashCode2 + (oasVar != null ? oasVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "FpsPayEnrollSuccessViewState(toolbar=" + this.a + ", title=" + this.b + ", description=" + this.c + ", image=" + this.d + ", buttonState=" + this.e + ", buttonDescription=" + this.f + ", bottomSheetViewState=" + this.g + Extension.C_BRAKE;
    }
}
