package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes10.dex */
public final class xxg {
    public final Drawable a;
    public final boolean b;

    public xxg(Drawable drawable, boolean z) {
        this.a = drawable;
        this.b = z;
    }

    public final Drawable a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxg)) {
            return false;
        }
        xxg xxgVar = (xxg) obj;
        return jl40.l(this.a, xxgVar.a) && this.b == xxgVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
