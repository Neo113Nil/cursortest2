package v1;

import N1.p;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    public final C5108e f41380a;

    /* renamed from: b, reason: collision with root package name */
    public int f41381b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap.Config f41382c;

    public i(C5108e c5108e) {
        this.f41380a = c5108e;
    }

    @Override // v1.g
    public final void a() {
        this.f41380a.f(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f41381b == iVar.f41381b && p.b(this.f41382c, iVar.f41382c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f41381b * 31;
        Bitmap.Config config = this.f41382c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return j.c(this.f41381b, this.f41382c);
    }
}
