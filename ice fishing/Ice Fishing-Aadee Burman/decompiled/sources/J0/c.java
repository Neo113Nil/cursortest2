package J0;

import android.net.Uri;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f1372a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1373b;

    public c(Uri uri, boolean z3) {
        this.f1372a = uri;
        this.f1373b = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        c cVar = (c) obj;
        return kotlin.jvm.internal.h.a(this.f1372a, cVar.f1372a) && this.f1373b == cVar.f1373b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1373b) + (this.f1372a.hashCode() * 31);
    }
}
