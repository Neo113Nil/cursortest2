package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class w611 implements h711 {
    public final String a;
    public final bzy0 b;
    public final h911 c;
    public final String d;

    public w611(String str, bzy0 bzy0Var, h911 h911Var, String str2) {
        this.a = str;
        this.b = bzy0Var;
        this.c = h911Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w611)) {
            return false;
        }
        w611 w611Var = (w611) obj;
        return jl40.l(this.a, w611Var.a) && this.b.equals(w611Var.b) && this.c.equals(w611Var.c) && this.d.equals(w611Var.d);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // defpackage.h711
    public final k911 j() {
        return this.c;
    }

    public final String toString() {
        return "ThreadVariantsButtonItem(text=" + this.a + ", state=" + this.b + ", transportType=" + this.c + ", id=" + this.d + Extension.C_BRAKE;
    }
}
