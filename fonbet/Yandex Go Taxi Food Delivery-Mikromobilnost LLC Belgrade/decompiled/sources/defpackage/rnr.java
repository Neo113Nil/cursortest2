package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class rnr {
    public final CharSequence a;
    public final Drawable b;
    public final CharSequence c;
    public final CharSequence d;
    public final boolean e;

    public rnr(String str, UiStateDrawableWrapper uiStateDrawableWrapper, String str2, CharSequence charSequence, boolean z) {
        this.a = str;
        this.b = uiStateDrawableWrapper;
        this.c = str2;
        this.d = charSequence;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnr)) {
            return false;
        }
        rnr rnrVar = (rnr) obj;
        return jl40.l(this.a, rnrVar.a) && jl40.l(this.b, rnrVar.b) && jl40.l(this.c, rnrVar.c) && jl40.l(this.d, rnrVar.d) && this.e == rnrVar.e;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        Drawable drawable = this.b;
        int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.d;
        return Boolean.hashCode(this.e) + ((hashCode3 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlightInputUiState(title=");
        sb.append((Object) this.a);
        sb.append(", leadIcon=");
        sb.append(this.b);
        sb.append(", messageText=");
        vfc.A(sb, this.c, ", inputValue=", this.d, ", hasError=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
