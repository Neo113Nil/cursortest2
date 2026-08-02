package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i6a implements m6a {
    public final v3a a;
    public final t5a b;

    public i6a(v3a v3aVar, t5a t5aVar, int i) {
        t5aVar = (i & 4) != 0 ? null : t5aVar;
        this.a = v3aVar;
        this.b = t5aVar;
    }

    @Override // defpackage.m6a
    public final m4a a() {
        return null;
    }

    @Override // defpackage.m6a
    public final v3a b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6a)) {
            return false;
        }
        i6a i6aVar = (i6a) obj;
        return Intrinsics.d(this.a, i6aVar.a) && Intrinsics.d(this.b, i6aVar.b);
    }

    public final int hashCode() {
        v3a v3aVar = this.a;
        int hashCode = (v3aVar == null ? 0 : Integer.hashCode(v3aVar.a)) * 961;
        t5a t5aVar = this.b;
        return hashCode + (t5aVar != null ? t5aVar.hashCode() : 0);
    }

    public final String toString() {
        return "Idle(epoch=" + this.a + ", lastDocument=null, query=" + this.b + ")";
    }
}
