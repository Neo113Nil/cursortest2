package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class te6 implements ue6 {
    public final u8j0 a;

    public te6() {
        this(new t8j0());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof te6) && jl40.l(this.a, ((te6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WithBottomSheet(bottomSheetStatus=" + this.a + Extension.C_BRAKE;
    }

    public te6(u8j0 u8j0Var) {
        this.a = u8j0Var;
    }
}
