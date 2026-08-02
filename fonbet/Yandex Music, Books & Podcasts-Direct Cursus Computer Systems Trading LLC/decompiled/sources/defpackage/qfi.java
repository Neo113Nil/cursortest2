package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class qfi {
    public final String a;
    public final Function0 b;

    public qfi(String str, Function0 function0) {
        str.getClass();
        function0.getClass();
        this.a = str;
        this.b = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfi)) {
            return false;
        }
        qfi qfiVar = (qfi) obj;
        return Intrinsics.d(this.a, qfiVar.a) && Intrinsics.d(this.b, qfiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MoveTrackAction(label=" + this.a + ", action=" + this.b + ")";
    }
}
