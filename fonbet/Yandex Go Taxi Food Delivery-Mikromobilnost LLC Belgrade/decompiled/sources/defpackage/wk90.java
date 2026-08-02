package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class wk90 {
    public final CharSequence a;
    public final Drawable b;
    public final CharSequence c;

    public wk90(CharSequence charSequence, UiStateDrawableWrapper uiStateDrawableWrapper, String str) {
        this.a = charSequence;
        this.b = uiStateDrawableWrapper;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk90)) {
            return false;
        }
        wk90 wk90Var = (wk90) obj;
        return jl40.l(this.a, wk90Var.a) && jl40.l(this.b, wk90Var.b) && jl40.l(this.c, wk90Var.c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        Drawable drawable = this.b;
        int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        return hashCode2 + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PassengerItemUiState(title=");
        sb.append((Object) this.a);
        sb.append(", leadIcon=");
        sb.append(this.b);
        sb.append(", subtitle=");
        return xvz.n(sb, this.c, Extension.C_BRAKE);
    }
}
