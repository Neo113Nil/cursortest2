package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class yvs0 implements fws0, fib, hz {
    public final FormattedText a;
    public final int b;
    public final String c;
    public final Object d;
    public final r9x0 e;
    public final r9x0 f;
    public final String g;
    public final String h;

    public yvs0(FormattedText formattedText, int i, String str, Object obj, r9x0 r9x0Var, r9x0 r9x0Var2, String str2, String str3) {
        this.a = formattedText;
        this.b = i;
        this.c = str;
        this.d = obj;
        this.e = r9x0Var;
        this.f = r9x0Var2;
        this.g = str2;
        this.h = str3;
    }

    @Override // defpackage.fib
    public final boolean a() {
        return false;
    }

    @Override // defpackage.fib
    public final r9x0 b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvs0)) {
            return false;
        }
        yvs0 yvs0Var = (yvs0) obj;
        return this.a.equals(yvs0Var.a) && this.b == yvs0Var.b && jl40.l(this.c, yvs0Var.c) && jl40.l(this.d, yvs0Var.d) && jl40.l(this.e, yvs0Var.e) && jl40.l(this.f, yvs0Var.f) && jl40.l(this.g, yvs0Var.g) && jl40.l(this.h, yvs0Var.h);
    }

    @Override // defpackage.fib, defpackage.hz
    public final r9x0 getAction() {
        return this.e;
    }

    @Override // defpackage.fib
    public final String getKey() {
        return this.c;
    }

    @Override // defpackage.fib
    public final Object getValue() {
        return this.d;
    }

    public final int hashCode() {
        int c = smw0.c(unr0.b(oyr.b(this.b, this.a.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        r9x0 r9x0Var = this.e;
        int hashCode = (c + (r9x0Var == null ? 0 : r9x0Var.hashCode())) * 31;
        r9x0 r9x0Var2 = this.f;
        int hashCode2 = (hashCode + (r9x0Var2 == null ? 0 : r9x0Var2.hashCode())) * 31;
        String str = this.g;
        int e = unr0.e((hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, false);
        String str2 = this.h;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrailRichCheckControl(unselectedText=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", key=");
        sb.append(this.c);
        sb.append(", value=");
        sb.append(this.d);
        sb.append(", action=");
        sb.append(this.e);
        sb.append(", actionOnUnselect=");
        sb.append(this.f);
        sb.append(", metricaLabel=");
        return g8e.r(sb, this.g, ", disabledUnselect=false, presentationId=", this.h, Extension.C_BRAKE);
    }
}
