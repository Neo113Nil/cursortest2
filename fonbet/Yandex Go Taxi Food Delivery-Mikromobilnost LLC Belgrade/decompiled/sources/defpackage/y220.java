package defpackage;

/* loaded from: classes8.dex */
public final class y220 {
    public final String a;

    public y220(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y220) && jl40.l(this.a, ((y220) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return oyr.p("TranslatorParams(translationLangCode=", this.a, ", translationSupportedLangCodes=null)");
    }
}
