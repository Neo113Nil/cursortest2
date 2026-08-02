package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class cml {
    public final Object a;
    public final eml b;

    public cml(Object obj, eml emlVar) {
        emlVar.getClass();
        this.a = obj;
        this.b = emlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cml)) {
            return false;
        }
        cml cmlVar = (cml) obj;
        return Intrinsics.d(this.a, cmlVar.a) && Intrinsics.d(this.b, cmlVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "PlayerScreenPlayable(data=" + this.a + ", likePlayableState=" + this.b + ")";
    }
}
