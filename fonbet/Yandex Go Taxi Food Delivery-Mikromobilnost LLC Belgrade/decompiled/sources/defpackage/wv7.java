package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class wv7 {
    public final String a;
    public final Boolean b;
    public final cw7 c;
    public final String d;

    public wv7(String str, Boolean bool, cw7 cw7Var, String str2) {
        this.a = str;
        this.b = bool;
        this.c = cw7Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv7)) {
            return false;
        }
        wv7 wv7Var = (wv7) obj;
        return jl40.l(this.a, wv7Var.a) && this.b.equals(wv7Var.b) && this.c.equals(wv7Var.c) && jl40.l(this.d, wv7Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CancelMessageButton(title=" + this.a + ", highlighted=" + this.b + ", action=" + this.c + ", metricaLabel=" + this.d + Extension.C_BRAKE;
    }
}
