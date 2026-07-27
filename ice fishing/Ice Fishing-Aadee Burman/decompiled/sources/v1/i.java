package v1;

import N1.p;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    public final C5108e f41377a;

    /* renamed from: b, reason: collision with root package name */
    public int f41378b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap.Config f41379c;

    public i(C5108e c5108e) {
        this.f41377a = c5108e;
    }

    @Override // v1.g
    public final void a() {
        this.f41377a.f(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f41378b == iVar.f41378b && p.b(this.f41379c, iVar.f41379c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f41378b * 31;
        Bitmap.Config config = this.f41379c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return j.c(this.f41378b, this.f41379c);
    }
}
