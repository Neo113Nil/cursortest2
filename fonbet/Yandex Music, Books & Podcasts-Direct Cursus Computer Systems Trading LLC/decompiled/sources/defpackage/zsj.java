package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class zsj {
    public final Uri a;
    public final long b;
    public final nb7 c;
    public final db7 d;
    public final boolean e;

    public zsj(Uri uri, long j, nb7 nb7Var, db7 db7Var, boolean z) {
        uri.getClass();
        db7Var.getClass();
        this.a = uri;
        this.b = j;
        this.c = nb7Var;
        this.d = db7Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsj)) {
            return false;
        }
        zsj zsjVar = (zsj) obj;
        return Intrinsics.d(this.a, zsjVar.a) && this.b == zsjVar.b && this.c.equals(zsjVar.c) && Intrinsics.d(this.d, zsjVar.d) && this.e == zsjVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + tlm.c(this.b, this.a.hashCode() * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "OpenResult(successfulUri=" + this.a + ", bytesToRead=" + this.b + ", openedDataSpec=" + this.c + ", dataSource=" + this.d + ", openedNotActiveDataSource=" + this.e + ")";
    }
}
