package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class toh extends kr {
    public static final soh Companion = new soh();
    public final String a;

    public /* synthetic */ toh(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            qje.Z(i, 1, roh.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof toh) && toh.class.equals(obj.getClass())) {
            return jl40.l(this.a, ((toh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("DeferredDecodingAction(actionRaw=", this.a, Extension.C_BRAKE);
    }
}
