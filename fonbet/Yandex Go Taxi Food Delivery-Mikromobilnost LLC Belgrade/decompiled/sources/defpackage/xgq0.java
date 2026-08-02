package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class xgq0 {
    public static final wgq0 Companion = new wgq0();
    public final String a;

    public /* synthetic */ xgq0(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, vgq0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xgq0) && jl40.l(this.a, ((xgq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("DecodedPayload(methodId=", this.a, Extension.C_BRAKE);
    }
}
