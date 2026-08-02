package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class djw implements ejw {
    public final bbq a;

    public djw(bbq bbqVar) {
        bbqVar.getClass();
        this.a = bbqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof djw) && Intrinsics.d(this.a, ((djw) obj).a);
    }

    @Override // defpackage.ejw
    public final f5q getEntity() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WaveEntity(entity=" + this.a + ")";
    }
}
