package defpackage;

import com.yandex.go.zone.dto.objects.a3;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class u7e0 implements d8e0 {
    public final String a;
    public final String b;
    public final CharSequence c;
    public final CharSequence d;
    public final String e;
    public final boolean f;
    public final a3 g;

    public u7e0(String str, String str2, String str3, String str4, String str5, boolean z, a3 a3Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = a3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7e0)) {
            return false;
        }
        u7e0 u7e0Var = (u7e0) obj;
        return jl40.l(this.a, u7e0Var.a) && jl40.l(this.b, u7e0Var.b) && jl40.l(this.c, u7e0Var.c) && jl40.l(this.d, u7e0Var.d) && jl40.l(this.e, u7e0Var.e) && this.f == u7e0Var.f && jl40.l(this.g, u7e0Var.g);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.g.hashCode() + unr0.e(unr0.b(smw0.b(smw0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder v = b64.v("ButtonItem(id=", this.a, ", modelId=", this.b, ", text=");
        vfc.A(v, this.c, ", subtitle=", this.d, ", analyticsEvent=");
        tse0.y(this.e, ", isPrimaryButton=", ", action=", v, this.f);
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
