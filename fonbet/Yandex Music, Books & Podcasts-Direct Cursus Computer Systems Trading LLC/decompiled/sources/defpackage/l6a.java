package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l6a implements m6a {
    public final int a;
    public final m4a b;
    public final t5a c;
    public final r2a d;
    public final r2a e;

    public l6a(int i, m4a m4aVar, t5a t5aVar, r2a r2aVar, r2a r2aVar2) {
        this.a = i;
        this.b = m4aVar;
        this.c = t5aVar;
        this.d = r2aVar;
        this.e = r2aVar2;
    }

    @Override // defpackage.m6a
    public final m4a a() {
        return this.b;
    }

    @Override // defpackage.m6a
    public final v3a b() {
        return new v3a(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6a)) {
            return false;
        }
        l6a l6aVar = (l6a) obj;
        return this.a == l6aVar.a && Intrinsics.d(this.b, l6aVar.b) && Intrinsics.d(this.c, l6aVar.c) && Intrinsics.d(this.d, l6aVar.d) && Intrinsics.d(this.e, l6aVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        t5a t5aVar = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (t5aVar == null ? 0 : t5aVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "Rendered(epoch=" + v3a.a(this.a) + ", lastDocument=" + this.b + ", query=" + this.c + ", actionCallbacksConfig=" + this.d + ", previousLifecycleCallbacksConfig=" + this.e + ")";
    }
}
