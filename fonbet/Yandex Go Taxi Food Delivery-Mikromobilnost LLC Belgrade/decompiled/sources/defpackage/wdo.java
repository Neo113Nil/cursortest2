package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class wdo {
    public static final vdo Companion = new vdo();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new cao(5))};
    public final String a;
    public final png b;

    public /* synthetic */ wdo(int i, String str, png pngVar) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, udo.a.getDescriptor());
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
        if (!(obj instanceof wdo)) {
            return false;
        }
        wdo wdoVar = (wdo) obj;
        return jl40.l(this.a, wdoVar.a) && jl40.l(this.b, wdoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Payload(capabilityId=" + this.a + ", event=" + this.b + Extension.C_BRAKE;
    }
}
