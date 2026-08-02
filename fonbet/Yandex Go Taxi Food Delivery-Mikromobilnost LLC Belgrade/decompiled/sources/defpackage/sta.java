package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class sta implements uta {
    public final cta a;

    public sta(cta ctaVar) {
        this.a = ctaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sta) && jl40.l(this.a, ((sta) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnButtonClick(buttonAction=" + this.a + Extension.C_BRAKE;
    }
}
