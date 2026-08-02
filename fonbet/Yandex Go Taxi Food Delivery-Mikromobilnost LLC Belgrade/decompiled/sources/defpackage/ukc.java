package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class ukc {
    public static final tkc Companion = new tkc();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new z2c(19))};
    public final String a;
    public final png b;

    public /* synthetic */ ukc(int i, String str, png pngVar) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, skc.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = pngVar;
    }

    public final String a() {
        return this.a;
    }

    public final png b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ukc)) {
            return false;
        }
        ukc ukcVar = (ukc) obj;
        return jl40.l(this.a, ukcVar.a) && jl40.l(this.b, ukcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Payload(capabilityId=" + this.a + ", newState=" + this.b + Extension.C_BRAKE;
    }

    public ukc(String str, png pngVar) {
        this.a = str;
        this.b = pngVar;
    }
}
