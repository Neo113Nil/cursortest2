package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class xyy0 implements m1j {
    public final String a;
    public final bzy0 b;
    public final h911 c;
    public final String d;

    public xyy0(String str, bzy0 bzy0Var, h911 h911Var, String str2) {
        this.a = str;
        this.b = bzy0Var;
        this.c = h911Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyy0)) {
            return false;
        }
        xyy0 xyy0Var = (xyy0) obj;
        return jl40.l(this.a, xyy0Var.a) && this.b.equals(xyy0Var.b) && this.c.equals(xyy0Var.c) && jl40.l(this.d, xyy0Var.d);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ThreadVariantsButtonItem(text=" + this.a + ", state=" + this.b + ", transportType=" + this.c + ", id=" + this.d + Extension.C_BRAKE;
    }
}
