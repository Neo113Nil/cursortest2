package defpackage;

import android.text.SpannableStringBuilder;

/* loaded from: classes2.dex */
public final class wky0 {
    public final CharSequence a;
    public final h2d0 b;

    public wky0(SpannableStringBuilder spannableStringBuilder, h2d0 h2d0Var) {
        this.a = spannableStringBuilder;
        this.b = h2d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wky0)) {
            return false;
        }
        wky0 wky0Var = (wky0) obj;
        return jl40.l(this.a, wky0Var.a) && this.b.equals(wky0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TextContent(text=" + ((Object) this.a) + ", textDrawableHolder=" + this.b + ')';
    }
}
