package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class bjb {
    public final n0l a;

    public bjb(n0l n0lVar) {
        this.a = n0lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bjb) && Intrinsics.d(this.a, ((bjb) obj).a);
    }

    public final int hashCode() {
        n0l n0lVar = this.a;
        if (n0lVar == null) {
            return 0;
        }
        return n0lVar.hashCode();
    }

    public final String toString() {
        return "EventContext(playbackOptions=" + this.a + ')';
    }
}
