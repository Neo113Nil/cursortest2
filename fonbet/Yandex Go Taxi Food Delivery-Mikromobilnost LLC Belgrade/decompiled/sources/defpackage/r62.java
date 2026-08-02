package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class r62 implements y62 {
    public final v81 a;

    public r62(v81 v81Var) {
        this.a = v81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r62) && jl40.l(this.a, ((r62) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AddressAction(addressUiAction=" + this.a + Extension.C_BRAKE;
    }
}
