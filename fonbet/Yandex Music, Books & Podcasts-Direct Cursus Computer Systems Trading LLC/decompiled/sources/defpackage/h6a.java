package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h6a implements m6a {
    public final int a;
    public final m4a b;
    public final t5a c;
    public final w3a d;

    public h6a(int i, m4a m4aVar, t5a t5aVar, w3a w3aVar) {
        this.a = i;
        this.b = m4aVar;
        this.c = t5aVar;
        this.d = w3aVar;
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
        if (!(obj instanceof h6a)) {
            return false;
        }
        h6a h6aVar = (h6a) obj;
        return this.a == h6aVar.a && Intrinsics.d(this.b, h6aVar.b) && Intrinsics.d(this.c, h6aVar.c) && this.d.equals(h6aVar.d);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        m4a m4aVar = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (m4aVar == null ? 0 : m4aVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "Failed(epoch=" + v3a.a(this.a) + ", lastDocument=" + this.b + ", query=" + this.c + ", error=" + this.d + ")";
    }
}
