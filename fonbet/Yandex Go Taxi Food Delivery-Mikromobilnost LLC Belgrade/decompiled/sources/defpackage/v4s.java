package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class v4s {
    public final String a;
    public final pre b;

    public v4s(String str, pre preVar) {
        this.a = str;
        this.b = preVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4s)) {
            return false;
        }
        v4s v4sVar = (v4s) obj;
        return jl40.l(this.a, v4sVar.a) && this.b.equals(v4sVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FormLayoutModifierReplaceWidget(widgetId=" + this.a + ", replacement=" + this.b + Extension.C_BRAKE;
    }
}
