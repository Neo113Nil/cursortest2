package defpackage;

import android.graphics.Rect;
import android.net.Uri;

/* loaded from: classes.dex */
public final class ufk extends xfk {
    public final Uri a;
    public final Rect b;

    public ufk(Uri uri, Rect rect) {
        this.a = uri;
        this.b = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufk)) {
            return false;
        }
        ufk ufkVar = (ufk) obj;
        return jl40.l(this.a, ufkVar.a) && this.b.equals(ufkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NinePatch(imageUrl=" + this.a + ", insets=" + this.b + ')';
    }
}
