package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class vzz {
    public final CharSequence a;
    public final CharSequence b;
    public final Drawable c;
    public final boolean d;
    public final tzz e;

    public vzz(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z, tzz tzzVar) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = drawable;
        this.d = z;
        this.e = tzzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzz)) {
            return false;
        }
        vzz vzzVar = (vzz) obj;
        return jl40.l(this.a, vzzVar.a) && jl40.l(this.b, vzzVar.b) && jl40.l(this.c, vzzVar.c) && this.d == vzzVar.d && jl40.l(this.e, vzzVar.e);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        Drawable drawable = this.c;
        int e = unr0.e((hashCode2 + (drawable == null ? 0 : drawable.hashCode())) * 31, 31, this.d);
        tzz tzzVar = this.e;
        return e + (tzzVar != null ? tzzVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "LuggageToggleUiState(title=", ", subtitle=", ", leadIcon=");
        r.append(this.c);
        r.append(", isToggled=");
        r.append(this.d);
        r.append(", bubbleModal=");
        r.append(this.e);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
