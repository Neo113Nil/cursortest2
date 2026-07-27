package J0;

import android.net.Uri;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f1297a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1298b;

    public c(Uri uri, boolean z8) {
        this.f1297a = uri;
        this.f1298b = z8;
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
        return kotlin.jvm.internal.h.a(this.f1297a, cVar.f1297a) && this.f1298b == cVar.f1298b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1298b) + (this.f1297a.hashCode() * 31);
    }
}
