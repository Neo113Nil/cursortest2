package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class sz01 {
    public final String a;
    public final List b;

    public sz01(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz01)) {
            return false;
        }
        sz01 sz01Var = (sz01) obj;
        return jl40.l(this.a, sz01Var.a) && jl40.l(this.b, sz01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nnm.h("TranslatorConfig(languageCode=", this.a, ", supportedLanguageCodes=", Extension.C_BRAKE, this.b);
    }
}
