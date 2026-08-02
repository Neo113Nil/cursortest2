package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class zgl {
    public final Long a;
    public final qvs b;

    public zgl(Long l, qvs qvsVar) {
        this.a = l;
        this.b = qvsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgl)) {
            return false;
        }
        zgl zglVar = (zgl) obj;
        return Intrinsics.d(this.a, zglVar.a) && Intrinsics.d(this.b, zglVar.b);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        qvs qvsVar = this.b;
        return hashCode + (qvsVar != null ? qvsVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlayerPreparedInfo(startPositionMs=" + this.a + ", fade=" + this.b + ")";
    }
}
