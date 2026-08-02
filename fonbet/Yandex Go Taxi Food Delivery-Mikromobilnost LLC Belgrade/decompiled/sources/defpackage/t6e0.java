package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class t6e0 implements ig5 {
    public static final p6e0 Companion = new p6e0();
    public final s6e0 a;

    public /* synthetic */ t6e0(int i, s6e0 s6e0Var) {
        if (1 == (i & 1)) {
            this.a = s6e0Var;
        } else {
            qje.Z(i, 1, o6e0.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t6e0) && jl40.l(this.a, ((t6e0) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a.a);
    }

    public final String toString() {
        return "PopToRootAction(params=" + this.a + Extension.C_BRAKE;
    }
}
