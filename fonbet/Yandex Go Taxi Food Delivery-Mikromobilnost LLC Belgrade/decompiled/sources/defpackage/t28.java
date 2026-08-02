package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class t28 {
    public static final s28 Companion = new s28();
    public final r28 a;

    public /* synthetic */ t28(int i, r28 r28Var) {
        if (1 == (i & 1)) {
            this.a = r28Var;
        } else {
            qje.Z(i, 1, o28.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t28) && jl40.l(this.a, ((t28) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.a);
    }

    public final String toString() {
        return "CapabilitiesResponse(capabilities=" + this.a + Extension.C_BRAKE;
    }

    public t28(r28 r28Var) {
        this.a = r28Var;
    }
}
