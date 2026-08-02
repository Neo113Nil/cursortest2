package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ge7 {
    public final md a;

    public ge7(md mdVar) {
        mdVar.getClass();
        this.a = mdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ge7) && Intrinsics.d(this.a, ((ge7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Action(action=" + this.a + ')';
    }
}
