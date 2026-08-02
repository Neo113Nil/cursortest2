package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class oft implements rft {
    public final int a;
    public final Bitmap b;
    public final String c;
    public final kft d;
    public final tpi e;

    public oft(int i, Bitmap bitmap, String str, kft kftVar, tpi tpiVar) {
        bitmap.getClass();
        str.getClass();
        tpiVar.getClass();
        this.a = i;
        this.b = bitmap;
        this.c = str;
        this.d = kftVar;
        this.e = tpiVar;
    }

    @Override // defpackage.rft
    public final int a() {
        return this.a;
    }

    @Override // defpackage.rft
    public final Bitmap b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oft)) {
            return false;
        }
        oft oftVar = (oft) obj;
        return this.a == oftVar.a && Intrinsics.d(this.b, oftVar.b) && Intrinsics.d(this.c, oftVar.c) && this.d.equals(oftVar.d) && Intrinsics.d(this.e, oftVar.e);
    }

    @Override // defpackage.rft
    public final String getTitle() {
        return this.c;
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.c(k5r.c((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d.a);
    }

    @Override // defpackage.rft
    public final kft q() {
        return this.d;
    }

    public final String toString() {
        return "NoPlus(layoutResId=" + this.a + ", backgroundBitmap=" + this.b + ", title=" + this.c + ", action=" + this.d + ", metricContext=" + this.e + ')';
    }
}
