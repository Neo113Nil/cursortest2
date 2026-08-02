package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class zy9 {
    public final CharSequence a;
    public final List b;

    public zy9(CharSequence charSequence, List list) {
        this.a = charSequence;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy9)) {
            return false;
        }
        zy9 zy9Var = (zy9) obj;
        return jl40.l(this.a, zy9Var.a) && this.b.equals(zy9Var.b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return this.b.hashCode() + ((charSequence == null ? 0 : charSequence.hashCode()) * 31);
    }

    public final String toString() {
        return "ChargersFeedbackChips(title=" + ((Object) this.a) + ", items=" + this.b + Extension.C_BRAKE;
    }
}
