package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class uzz {
    public final CharSequence a;
    public final CharSequence b;
    public final Drawable c;
    public final int d;
    public final int e;
    public final tzz f;

    public uzz(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, int i, int i2, tzz tzzVar) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = drawable;
        this.d = i;
        this.e = i2;
        this.f = tzzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzz)) {
            return false;
        }
        uzz uzzVar = (uzz) obj;
        return jl40.l(this.a, uzzVar.a) && jl40.l(this.b, uzzVar.b) && jl40.l(this.c, uzzVar.c) && this.d == uzzVar.d && this.e == uzzVar.e && jl40.l(this.f, uzzVar.f);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        Drawable drawable = this.c;
        int b = oyr.b(this.e, oyr.b(this.d, (hashCode2 + (drawable == null ? 0 : drawable.hashCode())) * 31, 31), 31);
        tzz tzzVar = this.f;
        return b + (tzzVar != null ? tzzVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "LuggageCountUiState(title=", ", subtitle=", ", leadIcon=");
        r.append(this.c);
        r.append(", count=");
        r.append(this.d);
        r.append(", maxCount=");
        r.append(this.e);
        r.append(", bubbleModal=");
        r.append(this.f);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
