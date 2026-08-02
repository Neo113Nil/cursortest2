package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class xe9 {
    public final Text a;
    public final Text b;
    public final YbButtonView.a c;
    public final stz0 d;
    public final qc70 e;
    public final YbButtonView.a f;
    public final kao g;

    public xe9(Text text, Text text2, YbButtonView.a aVar, stz0 stz0Var, qc70 qc70Var, YbButtonView.a aVar2, kao kaoVar) {
        this.a = text;
        this.b = text2;
        this.c = aVar;
        this.d = stz0Var;
        this.e = qc70Var;
        this.f = aVar2;
        this.g = kaoVar;
    }

    public final YbButtonView.a a() {
        return this.c;
    }

    public final Text b() {
        return this.b;
    }

    public final kao c() {
        return this.g;
    }

    public final YbButtonView.a d() {
        return this.f;
    }

    public final qc70 e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe9)) {
            return false;
        }
        xe9 xe9Var = (xe9) obj;
        return jl40.l(this.a, xe9Var.a) && jl40.l(this.b, xe9Var.b) && jl40.l(this.c, xe9Var.c) && this.d.equals(xe9Var.d) && this.e.equals(xe9Var.e) && jl40.l(this.f, xe9Var.f) && jl40.l(this.g, xe9Var.g);
    }

    public final Text f() {
        return this.a;
    }

    public final stz0 g() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Text text = this.b;
        int hashCode2 = (hashCode + (text == null ? 0 : text.hashCode())) * 31;
        YbButtonView.a aVar = this.c;
        int hashCode3 = (this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31)) * 31;
        YbButtonView.a aVar2 = this.f;
        int hashCode4 = (hashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        kao kaoVar = this.g;
        return hashCode4 + (kaoVar != null ? kaoVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder p = n.p("ChangePhoneStatusViewState(title=", this.a, ", description=", this.b, ", buttonViewState=");
        p.append(this.c);
        p.append(", toolbarViewState=");
        p.append(this.d);
        p.append(", statusViewState=");
        p.append(this.e);
        p.append(", secondaryButtonViewState=");
        p.append(this.f);
        p.append(", errorViewState=");
        p.append(this.g);
        p.append(Extension.C_BRAKE);
        return p.toString();
    }
}
