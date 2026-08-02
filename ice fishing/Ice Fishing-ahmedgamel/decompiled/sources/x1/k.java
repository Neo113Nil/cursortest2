package x1;

import P1.p;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: a, reason: collision with root package name */
    public final C5188f f41834a;

    /* renamed from: b, reason: collision with root package name */
    public int f41835b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap.Config f41836c;

    public k(C5188f c5188f) {
        this.f41834a = c5188f;
    }

    @Override // x1.i
    public final void a() {
        this.f41834a.f(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f41835b == kVar.f41835b && p.b(this.f41836c, kVar.f41836c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f41835b * 31;
        Bitmap.Config config = this.f41836c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return l.c(this.f41835b, this.f41836c);
    }
}
