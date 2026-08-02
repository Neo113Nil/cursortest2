package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class yjc {
    public static final xjc Companion = new xjc();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new z2c(13))};
    public final String a;
    public final String b;
    public final png c;

    public /* synthetic */ yjc(int i, String str, String str2, png pngVar) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, wjc.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = pngVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjc)) {
            return false;
        }
        yjc yjcVar = (yjc) obj;
        return jl40.l(this.a, yjcVar.a) && jl40.l(this.b, yjcVar.b) && jl40.l(this.c, yjcVar.c);
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

    public yjc(String str, String str2, png pngVar) {
        this.a = str;
        this.b = str2;
        this.c = pngVar;
    }
}
