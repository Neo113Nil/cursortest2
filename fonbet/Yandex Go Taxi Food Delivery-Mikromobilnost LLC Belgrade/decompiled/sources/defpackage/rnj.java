package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class rnj extends kr {
    public static final qnj Companion = new qnj();
    public final Boolean a;

    public /* synthetic */ rnj(Boolean bool, int i) {
        if (1 == (i & 1)) {
            this.a = bool;
        } else {
            qje.Z(i, 1, pnj.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && rnj.class == obj.getClass() && jl40.l(this.a, ((rnj) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool != null) {
            return bool.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "DisableSectionScrollAction(persist=" + this.a + Extension.C_BRAKE;
    }
}
