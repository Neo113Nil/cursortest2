package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ydw0 {
    public final boolean a;
    public final tdw0 b;

    public ydw0(boolean z, tdw0 tdw0Var) {
        this.a = z;
        this.b = tdw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydw0)) {
            return false;
        }
        ydw0 ydw0Var = (ydw0) obj;
        return this.a == ydw0Var.a && jl40.l(this.b, ydw0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SuperappSearchbarState(isVisible=" + this.a + ", mode=" + this.b + Extension.C_BRAKE;
    }
}
