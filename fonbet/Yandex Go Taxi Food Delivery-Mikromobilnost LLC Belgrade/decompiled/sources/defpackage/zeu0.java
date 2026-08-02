package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zeu0 {
    public final bfu0 a;

    public zeu0(bfu0 bfu0Var) {
        this.a = bfu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zeu0) && jl40.l(this.a, ((zeu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StickyWidgetModel(widget=" + this.a + Extension.C_BRAKE;
    }
}
