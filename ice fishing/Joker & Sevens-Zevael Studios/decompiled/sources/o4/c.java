package o4;

import android.net.Uri;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f5193a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5194b;

    public c(boolean z10, Uri uri) {
        this.f5193a = uri;
        this.f5194b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        pc.j.c(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        c cVar = (c) obj;
        return pc.j.a(this.f5193a, cVar.f5193a) && this.f5194b == cVar.f5194b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5194b) + (this.f5193a.hashCode() * 31);
    }
}
