package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class tzg extends vzg {
    public final Uri a;

    public tzg(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tzg) && jl40.l(this.a, ((tzg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "System(deeplinkUri=" + this.a + ')';
    }
}
