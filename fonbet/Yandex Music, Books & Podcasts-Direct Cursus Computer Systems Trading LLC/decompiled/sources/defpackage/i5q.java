package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i5q {
    public final p5d a;
    public final mwk b;

    public i5q(p5d p5dVar) {
        mwk mwkVar;
        this.a = p5dVar;
        this.b = (p5dVar == null || (mwkVar = p5dVar.a) == null) ? h1b.e : mwkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i5q) && Intrinsics.d(this.a, ((i5q) obj).a);
    }

    public final int hashCode() {
        p5d p5dVar = this.a;
        if (p5dVar == null) {
            return 0;
        }
        return p5dVar.hashCode();
    }

    public final String toString() {
        return "PlayingState(configuration=" + this.a + ")";
    }
}
