package defpackage;

import android.app.PendingIntent;

/* loaded from: classes3.dex */
public final class yzw extends ldo {
    public final PendingIntent a;
    public final boolean b;

    public yzw(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent == null) {
            jj4.j("Null pendingIntent");
            throw null;
        }
        this.a = pendingIntent;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ldo) {
            yzw yzwVar = (yzw) ((ldo) obj);
            if (this.a.equals(yzwVar.a) && this.b == yzwVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return v3w.e("ReviewInfo{pendingIntent=", this.a.toString(), ", isNoOp=", "}", this.b);
    }
}
