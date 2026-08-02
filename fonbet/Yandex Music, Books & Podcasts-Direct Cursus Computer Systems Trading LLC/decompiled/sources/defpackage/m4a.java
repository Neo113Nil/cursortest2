package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m4a extends l4a {
    public final q2a a;
    public final t5a b;
    public final q4a c;
    public final boolean d;
    public final boolean e;

    public m4a(q2a q2aVar, t5a t5aVar, q4a q4aVar, boolean z, boolean z2) {
        this.a = q2aVar;
        this.b = t5aVar;
        this.c = q4aVar;
        this.d = z;
        this.e = z2;
    }

    public static m4a a(m4a m4aVar, q2a q2aVar) {
        t5a t5aVar = m4aVar.b;
        q4a q4aVar = m4aVar.c;
        boolean z = m4aVar.d;
        boolean z2 = m4aVar.e;
        m4aVar.getClass();
        return new m4a(q2aVar, t5aVar, q4aVar, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m4a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        m4a m4aVar = (m4a) obj;
        return Intrinsics.d(this.a, m4aVar.a) && Intrinsics.d(this.b, m4aVar.b) && Intrinsics.d(this.c, m4aVar.c) && this.d == m4aVar.d && this.e == m4aVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        t5a t5aVar = this.b;
        return Boolean.hashCode(this.e) + k5r.e((this.c.hashCode() + ((hashCode + (t5aVar != null ? t5aVar.hashCode() : 0)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DocumentFetchResult(document=");
        sb.append(this.a);
        sb.append(", redirect=");
        sb.append(this.b);
        sb.append(", lifetime=");
        sb.append(this.c);
        sb.append(", staleIfError=");
        sb.append(this.d);
        sb.append(", screenIsBroken=");
        return ouj.r(sb, this.e, ")");
    }

    public /* synthetic */ m4a(q2a q2aVar) {
        this(q2aVar, null, q4a.b, false, false);
    }
}
