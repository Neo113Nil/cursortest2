package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m8l implements u8l {
    public final n7q a;
    public final Long b;
    public final qvs c;

    public m8l(n7q n7qVar, Long l, qvs qvsVar) {
        n7qVar.getClass();
        this.a = n7qVar;
        this.b = l;
        this.c = qvsVar;
    }

    @Override // defpackage.u8l
    public final n7q a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8l)) {
            return false;
        }
        m8l m8lVar = (m8l) obj;
        return Intrinsics.d(this.a, m8lVar.a) && Intrinsics.d(this.b, m8lVar.b) && Intrinsics.d(this.c, m8lVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        qvs qvsVar = this.c;
        return hashCode2 + (qvsVar != null ? qvsVar.hashCode() : 0);
    }

    public final String toString() {
        return "Prepared(queueState=" + this.a + ", startPositionMs=" + this.b + ", fade=" + this.c + ")";
    }
}
