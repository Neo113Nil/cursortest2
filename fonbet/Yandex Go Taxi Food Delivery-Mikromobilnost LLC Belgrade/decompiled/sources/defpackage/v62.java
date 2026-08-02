package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class v62 implements y62 {
    public final iej0 a;

    public v62(iej0 iej0Var) {
        this.a = iej0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v62) && jl40.l(this.a, ((v62) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RequirementChipAction(requirementChipUiAction=" + this.a + Extension.C_BRAKE;
    }
}
