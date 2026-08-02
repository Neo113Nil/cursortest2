package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class szk0 implements vzk0 {
    public final Text a;
    public final YbButtonViewGroup.b b;
    public final rzk0 c;
    public final rzk0 d;
    public final Text e;
    public final stz0 f;
    public final ArrayList g;
    public final ahq0 h;
    public final l24 i;

    public szk0(Text text, YbButtonViewGroup.b bVar, rzk0 rzk0Var, rzk0 rzk0Var2, Text.Constant constant, stz0 stz0Var, ArrayList arrayList, ahq0 ahq0Var, l24 l24Var) {
        this.a = text;
        this.b = bVar;
        this.c = rzk0Var;
        this.d = rzk0Var2;
        this.e = constant;
        this.f = stz0Var;
        this.g = arrayList;
        this.h = ahq0Var;
        this.i = l24Var;
    }

    public final YbButtonViewGroup.b a() {
        return this.b;
    }

    public final rzk0 b() {
        return this.d;
    }

    public final List c() {
        return this.g;
    }

    public final ahq0 d() {
        return this.h;
    }

    public final l24 e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szk0)) {
            return false;
        }
        szk0 szk0Var = (szk0) obj;
        return jl40.l(this.a, szk0Var.a) && this.b.equals(szk0Var.b) && jl40.l(this.c, szk0Var.c) && jl40.l(this.d, szk0Var.d) && jl40.l(this.e, szk0Var.e) && this.f.equals(szk0Var.f) && this.g.equals(szk0Var.g) && this.h.equals(szk0Var.h) && jl40.l(this.i, szk0Var.i);
    }

    public final Text f() {
        return this.a;
    }

    public final stz0 g() {
        return this.f;
    }

    public final rzk0 h() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        rzk0 rzk0Var = this.c;
        int hashCode2 = (hashCode + (rzk0Var == null ? 0 : rzk0Var.hashCode())) * 31;
        rzk0 rzk0Var2 = this.d;
        int hashCode3 = (hashCode2 + (rzk0Var2 == null ? 0 : rzk0Var2.hashCode())) * 31;
        Text text = this.e;
        int hashCode4 = (this.h.hashCode() + ly3.b((this.f.hashCode() + ((hashCode3 + (text == null ? 0 : text.hashCode())) * 31)) * 31, 31, this.g)) * 31;
        l24 l24Var = this.i;
        return hashCode4 + (l24Var != null ? l24Var.hashCode() : 0);
    }

    public final Text i() {
        return this.e;
    }

    public final String toString() {
        return "Content(title=" + this.a + ", buttons=" + this.b + ", topWidgetDivData=" + this.c + ", divData=" + this.d + ", triviaText=" + this.e + ", toolbarState=" + this.f + ", options=" + this.g + ", sourceButtonState=" + this.h + ", summaryWidgetState=" + this.i + Extension.C_BRAKE;
    }
}
