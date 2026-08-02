package defpackage;

import com.yandex.go.tariffcard.api.experiment.HeaderCollapseButtonType;
import com.yandex.go.tariffcard.ui.HeaderType;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class uix0 {
    public final List a;
    public final wi70 b;
    public final m1a0 c;
    public final boolean d;
    public final HeaderCollapseButtonType e;
    public final String f;
    public final HeaderType g;
    public final ldx0 h;
    public final boolean i;

    public uix0(List list, wi70 wi70Var, m1a0 m1a0Var, boolean z, HeaderCollapseButtonType headerCollapseButtonType, String str, HeaderType headerType, ldx0 ldx0Var, boolean z2) {
        this.a = list;
        this.b = wi70Var;
        this.c = m1a0Var;
        this.d = z;
        this.e = headerCollapseButtonType;
        this.f = str;
        this.g = headerType;
        this.h = ldx0Var;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uix0)) {
            return false;
        }
        uix0 uix0Var = (uix0) obj;
        return jl40.l(this.a, uix0Var.a) && jl40.l(this.b, uix0Var.b) && jl40.l(this.c, uix0Var.c) && this.d == uix0Var.d && this.e == uix0Var.e && jl40.l(this.f, uix0Var.f) && this.g == uix0Var.g && jl40.l(this.h, uix0Var.h) && this.i == uix0Var.i;
    }

    public final int hashCode() {
        int e = unr0.e((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        HeaderCollapseButtonType headerCollapseButtonType = this.e;
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + ((this.g.hashCode() + unr0.b((e + (headerCollapseButtonType == null ? 0 : headerCollapseButtonType.hashCode())) * 31, 31, this.f)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TariffOptionsCardUiState(items=");
        sb.append(this.a);
        sb.append(", button=");
        sb.append(this.b);
        sb.append(", paymentInfo=");
        sb.append(this.c);
        sb.append(", footerCollapseIconVisible=");
        sb.append(this.d);
        sb.append(", headerCollapseButtonType=");
        sb.append(this.e);
        sb.append(", headerTariffClass=");
        sb.append(this.f);
        sb.append(", headerType=");
        sb.append(this.g);
        sb.append(", scrollButtonState=");
        sb.append(this.h);
        sb.append(", isRedirectAnimationsEnabled=");
        return x4e.i(sb, this.i, Extension.C_BRAKE);
    }
}
