package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j6a implements m6a {
    public final int a;
    public final m4a b;
    public final t5a c;
    public final q2a d;

    public j6a(int i, m4a m4aVar, t5a t5aVar, q2a q2aVar) {
        this.a = i;
        this.b = m4aVar;
        this.c = t5aVar;
        this.d = q2aVar;
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
        if (!(obj instanceof j6a)) {
            return false;
        }
        j6a j6aVar = (j6a) obj;
        return this.a == j6aVar.a && Intrinsics.d(this.b, j6aVar.b) && Intrinsics.d(this.c, j6aVar.c) && Intrinsics.d(this.d, j6aVar.d);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        m4a m4aVar = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (m4aVar == null ? 0 : m4aVar.hashCode())) * 31)) * 31;
        q2a q2aVar = this.d;
        return hashCode2 + (q2aVar != null ? q2aVar.hashCode() : 0);
    }

    public final String toString() {
        return "Loading(epoch=" + v3a.a(this.a) + ", lastDocument=" + this.b + ", query=" + this.c + ", preview=" + this.d + ")";
    }
}
