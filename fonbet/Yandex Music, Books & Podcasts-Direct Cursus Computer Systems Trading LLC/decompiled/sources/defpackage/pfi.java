package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class pfi {
    public final String a;
    public final Function0 b;

    public pfi(String str, Function0 function0) {
        str.getClass();
        function0.getClass();
        this.a = str;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfi)) {
            return false;
        }
        pfi pfiVar = (pfi) obj;
        return Intrinsics.d(this.a, pfiVar.a) && Intrinsics.d(this.b, pfiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MoveTrackAction(label=" + this.a + ", action=" + this.b + ")";
    }
}
