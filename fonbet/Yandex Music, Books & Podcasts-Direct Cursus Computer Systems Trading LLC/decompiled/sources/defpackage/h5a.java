package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h5a implements ohb {
    public final t5a a;
    public final m4a b;

    public h5a(t5a t5aVar, m4a m4aVar) {
        this.a = t5aVar;
        this.b = m4aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!h5a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        h5a h5aVar = (h5a) obj;
        return Intrinsics.d(this.a, h5aVar.a) && Intrinsics.d(this.b, h5aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Finished(query=" + this.a + ", documentFetchResult=" + this.b + ")";
    }
}
