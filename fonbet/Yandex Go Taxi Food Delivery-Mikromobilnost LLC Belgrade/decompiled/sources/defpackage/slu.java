package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class slu {
    public final CharSequence a;
    public final kdc b;
    public final Drawable c;

    public slu(kdc kdcVar, Drawable drawable, CharSequence charSequence) {
        this.a = charSequence;
        this.b = kdcVar;
        this.c = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof slu)) {
            return false;
        }
        slu sluVar = (slu) obj;
        return jl40.l(this.a, sluVar.a) && jl40.l(this.b, sluVar.b) && jl40.l(this.c, sluVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kdc kdcVar = this.b;
        int hashCode2 = (hashCode + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31;
        Drawable drawable = this.c;
        return hashCode2 + (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        return "ValueBubble(text=" + ((Object) this.a) + ", color=" + this.b + ", shadow=" + this.c + Extension.C_BRAKE;
    }
}
