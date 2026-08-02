package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t7c implements oun {
    public final md a;
    public final f0q b;
    public final f0q c;

    public t7c(md mdVar, f0q f0qVar) {
        this.a = mdVar;
        this.b = f0qVar;
        this.c = f0qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t7c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        t7c t7cVar = (t7c) obj;
        return Intrinsics.d(this.a, t7cVar.a) && Intrinsics.d(this.b, t7cVar.b);
    }

    public final int hashCode() {
        md mdVar = this.a;
        int hashCode = (mdVar != null ? mdVar.hashCode() : 0) * 31;
        f0q f0qVar = this.b;
        return hashCode + (f0qVar != null ? f0qVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "Feedback(action=" + this.a + ", shared=" + this.b + ")";
    }
}
