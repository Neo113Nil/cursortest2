package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class aav extends fav {
    public final q6v b;
    public final k7v c;
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aav(q6v q6vVar, k7v k7vVar) {
        super(true);
        k7vVar.getClass();
        boolean z = true;
        this.b = q6vVar;
        this.c = k7vVar;
        int ordinal = q6vVar.b.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2) {
                b6e.s();
                throw null;
            }
            z = false;
        }
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aav)) {
            return false;
        }
        aav aavVar = (aav) obj;
        return this.b.equals(aavVar.b) && Intrinsics.d(this.c, aavVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "Feedback(words=" + this.b + ", feedback=" + this.c + ")";
    }
}
