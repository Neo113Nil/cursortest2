package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class tdo {
    public static final sdo Companion = new sdo();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new cao(4))};
    public final String a;
    public final String b;
    public final png c;

    public /* synthetic */ tdo(int i, String str, String str2, png pngVar) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, rdo.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = pngVar;
    }

    public final String a() {
        return this.a;
    }

    public final png b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdo)) {
            return false;
        }
        tdo tdoVar = (tdo) obj;
        return jl40.l(this.a, tdoVar.a) && jl40.l(this.b, tdoVar.b) && jl40.l(this.c, tdoVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder v = b64.v("Payload(capabilityId=", this.a, ", directiveName=", this.b, ", directiveData=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
