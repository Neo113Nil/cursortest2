package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class v0w0 {
    public final FormattedText a;
    public final FormattedText b;
    public final String c;
    public final String d;
    public final Map e;

    public v0w0(FormattedText formattedText, FormattedText formattedText2, String str, String str2, LinkedHashMap linkedHashMap) {
        this.a = formattedText;
        this.b = formattedText2;
        this.c = str;
        this.d = str2;
        this.e = linkedHashMap;
    }

    public final Map a() {
        return this.e;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    public final FormattedText d() {
        return this.b;
    }

    public final FormattedText e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0w0)) {
            return false;
        }
        v0w0 v0w0Var = (v0w0) obj;
        return jl40.l(this.a, v0w0Var.a) && jl40.l(this.b, v0w0Var.b) && jl40.l(this.c, v0w0Var.c) && jl40.l(this.d, v0w0Var.d) && jl40.l(this.e, v0w0Var.e);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.c(this.a.a.hashCode() * 31, 31, this.b.a), 31, this.c), 31, this.d);
        Map map = this.e;
        return b + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder r = n.r("SuperAppMainOnboarding(title=", this.a, ", subtitle=", this.b, ", shortcutId=");
        g8e.D(r, this.c, ", onboardingId=", this.d, ", analyticsPayload=");
        return b64.r(r, this.e, Extension.C_BRAKE);
    }
}
