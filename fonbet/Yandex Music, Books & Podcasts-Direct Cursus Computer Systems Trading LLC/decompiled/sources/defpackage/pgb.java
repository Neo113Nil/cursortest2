package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pgb extends sce {
    public final Drawable a;
    public final rce b;
    public final Throwable c;

    public pgb(Drawable drawable, rce rceVar, Throwable th) {
        this.a = drawable;
        this.b = rceVar;
        this.c = th;
    }

    @Override // defpackage.sce
    public final Drawable a() {
        return this.a;
    }

    @Override // defpackage.sce
    public final rce b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgb)) {
            return false;
        }
        pgb pgbVar = (pgb) obj;
        return Intrinsics.d(this.a, pgbVar.a) && Intrinsics.d(this.b, pgbVar.b) && this.c.equals(pgbVar.c);
    }

    public final int hashCode() {
        Drawable drawable = this.a;
        return this.c.hashCode() + ((this.b.hashCode() + ((drawable != null ? drawable.hashCode() : 0) * 31)) * 31);
    }
}
