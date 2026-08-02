package defpackage;

import android.view.Surface;

/* loaded from: classes10.dex */
public final class v84 extends wnw0 {
    public final int a;
    public final Surface b;

    public v84(int i, Surface surface) {
        this.a = i;
        if (surface != null) {
            this.b = surface;
        } else {
            ny61.t("Null surface");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wnw0)) {
            return false;
        }
        v84 v84Var = (v84) ((wnw0) obj);
        return this.a == v84Var.a && this.b.equals(v84Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Result{resultCode=" + this.a + ", surface=" + this.b + "}";
    }
}
