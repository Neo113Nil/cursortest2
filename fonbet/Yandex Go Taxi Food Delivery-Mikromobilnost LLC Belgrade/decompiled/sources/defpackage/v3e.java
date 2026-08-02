package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class v3e implements uni {
    public final f030 a;

    public v3e(f030 f030Var) {
        this.a = f030Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v3e) && jl40.l(this.a, ((v3e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ConfirmationModalViewArgs(modalView=" + this.a + Extension.C_BRAKE;
    }
}
