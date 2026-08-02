package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class jcr implements kcr {
    public final mqs a;

    public jcr(mqs mqsVar) {
        mqsVar.getClass();
        this.a = mqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jcr) && Intrinsics.d(this.a, ((jcr) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(0L) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExactTrack(track=" + this.a + ", progressMs=0)";
    }
}
