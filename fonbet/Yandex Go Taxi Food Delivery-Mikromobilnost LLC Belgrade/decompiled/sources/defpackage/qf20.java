package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class qf20 {
    public final Drawable a;
    public final String b;

    public qf20(String str, Drawable drawable) {
        this.a = drawable;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf20)) {
            return false;
        }
        return jl40.l(this.b, ((qf20) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() * 31;
    }
}
