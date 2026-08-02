package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f5a implements ohb {
    public final t5a a;
    public final Throwable b;

    public f5a(t5a t5aVar, Throwable th) {
        this.a = t5aVar;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f5a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        f5a f5aVar = (f5a) obj;
        return Intrinsics.d(this.a, f5aVar.a) && this.b.equals(f5aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Failed(query=" + this.a + ", error=" + this.b + ")";
    }
}
