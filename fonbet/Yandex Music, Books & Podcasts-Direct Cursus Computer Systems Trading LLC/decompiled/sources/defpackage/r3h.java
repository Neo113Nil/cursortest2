package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r3h implements t3h {
    public final zfr a;

    public r3h(zfr zfrVar) {
        zfrVar.getClass();
        this.a = zfrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r3h) && Intrinsics.d(this.a, ((r3h) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Static(lyricsData=" + this.a + ")";
    }
}
