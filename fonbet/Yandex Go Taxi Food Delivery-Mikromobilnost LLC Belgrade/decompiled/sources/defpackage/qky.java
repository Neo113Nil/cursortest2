package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes6.dex */
public final class qky {
    public static final pky Companion = new pky();
    public final String a;
    public final String b;

    public /* synthetic */ qky(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, oky.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qky)) {
            return false;
        }
        qky qkyVar = (qky) obj;
        return jl40.l(this.a, qkyVar.a) && jl40.l(this.b, qkyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("LinkCardResponse(webviewUrl=", this.a, ", sessionId=", this.b, Extension.C_BRAKE);
    }
}
