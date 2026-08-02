package defpackage;

import flex.logger.FlexLogLevel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class ujr {
    public final FlexLogLevel a;
    public final String b;
    public final i3y c;
    public final sjr d;

    public ujr(FlexLogLevel flexLogLevel, String str, i3y i3yVar, sjr sjrVar) {
        this.a = flexLogLevel;
        this.b = str;
        this.c = i3yVar;
        this.d = sjrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujr)) {
            return false;
        }
        ujr ujrVar = (ujr) obj;
        return this.a == ujrVar.a && jl40.l(this.b, ujrVar.b) && jl40.l(this.c, ujrVar.c) && jl40.l(this.d, ujrVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "FlexLogEntry(level=" + this.a + ", message=" + this.b + ", context=" + this.c + ", metadata=" + this.d + Extension.C_BRAKE;
    }
}
