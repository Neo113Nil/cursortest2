package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mft implements rft {
    public final int a;
    public final Bitmap b;
    public final String c;
    public final kft d;
    public final tpi e;
    public final Bitmap f;

    public mft(int i, Bitmap bitmap, String str, kft kftVar, tpi tpiVar, Bitmap bitmap2) {
        bitmap.getClass();
        str.getClass();
        tpiVar.getClass();
        bitmap2.getClass();
        this.a = i;
        this.b = bitmap;
        this.c = str;
        this.d = kftVar;
        this.e = tpiVar;
        this.f = bitmap2;
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
        if (!(obj instanceof mft)) {
            return false;
        }
        mft mftVar = (mft) obj;
        return this.a == mftVar.a && Intrinsics.d(this.b, mftVar.b) && Intrinsics.d(this.c, mftVar.c) && this.d.equals(mftVar.d) && Intrinsics.d(this.e, mftVar.e) && Intrinsics.d(this.f, mftVar.f);
    }

    @Override // defpackage.rft
    public final String getTitle() {
        return this.c;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + k5r.c(k5r.c((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d.a)) * 31);
    }

    @Override // defpackage.rft
    public final kft q() {
        return this.d;
    }

    public final String toString() {
        return "Gift(layoutResId=" + this.a + ", backgroundBitmap=" + this.b + ", title=" + this.c + ", action=" + this.d + ", metricContext=" + this.e + ", centerImageBitmap=" + this.f + ')';
    }
}
