package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class tvk0 {
    public final CharSequence a;
    public final String b;
    public final fvk0 c;

    public tvk0(CharSequence charSequence, String str, fvk0 fvk0Var) {
        this.a = charSequence;
        this.b = str;
        this.c = fvk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvk0)) {
            return false;
        }
        tvk0 tvk0Var = (tvk0) obj;
        return jl40.l(this.a, tvk0Var.a) && this.b.equals(tvk0Var.b) && this.c.equals(tvk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Slider(title=" + ((Object) this.a) + ", subtitle=" + ((Object) this.b) + ", action=" + this.c + Extension.C_BRAKE;
    }
}
