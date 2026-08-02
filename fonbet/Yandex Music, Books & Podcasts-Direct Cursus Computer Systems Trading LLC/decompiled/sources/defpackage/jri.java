package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class jri implements kri {
    public final mqs a;

    public jri(mqs mqsVar) {
        mqsVar.getClass();
        this.a = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jri) && Intrinsics.d(this.a, ((jri) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "QueueTrackItem(track=" + this.a + ")";
    }
}
