package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ytq0 {
    public final String a;

    public ytq0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ytq0) && jl40.l(this.a, ((ytq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("ServerTooltipAnchorEntity(viewId=", this.a, Extension.C_BRAKE);
    }
}
