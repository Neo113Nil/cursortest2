package J0;

import android.net.Uri;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f1401a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1402b;

    public c(Uri uri, boolean z6) {
        this.f1401a = uri;
        this.f1402b = z6;
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
        return kotlin.jvm.internal.h.a(this.f1401a, cVar.f1401a) && this.f1402b == cVar.f1402b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1402b) + (this.f1401a.hashCode() * 31);
    }
}
