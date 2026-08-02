package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d6v implements e6v {
    public final z4q a;
    public final c6v b;

    public d6v(z4q z4qVar, c6v c6vVar) {
        z4qVar.getClass();
        c6vVar.getClass();
        this.a = z4qVar;
        this.b = c6vVar;
    }

    public static d6v a(d6v d6vVar) {
        z4q z4qVar = d6vVar.a;
        c6v c6vVar = d6vVar.b;
        d6vVar.getClass();
        z4qVar.getClass();
        c6vVar.getClass();
        return new d6v(z4qVar, c6vVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6v)) {
            return false;
        }
        d6v d6vVar = (d6v) obj;
        return Intrinsics.d(this.a, d6vVar.a) && this.b == d6vVar.b;
    }

    @Override // defpackage.e6v
    public final u3q getEntity() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WaveSource(entity=" + this.a + ", sourceType=" + this.b + ")";
    }
}
