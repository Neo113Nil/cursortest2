package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class qkc {
    public static final pkc Companion = new pkc();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new z2c(18))};
    public final String a;
    public final png b;

    public /* synthetic */ qkc(int i, String str, png pngVar) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, okc.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = pngVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkc)) {
            return false;
        }
        qkc qkcVar = (qkc) obj;
        return jl40.l(this.a, qkcVar.a) && jl40.l(this.b, qkcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Payload(capabilityId=" + this.a + ", event=" + this.b + Extension.C_BRAKE;
    }

    public qkc(String str, png pngVar) {
        this.a = str;
        this.b = pngVar;
    }
}
