package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wh6 implements xh6 {
    public final mqs a;

    public wh6(mqs mqsVar) {
        mqsVar.getClass();
        this.a = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wh6) && Intrinsics.d(this.a, ((wh6) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "QueueTrackItem(track=" + this.a + ")";
    }
}
