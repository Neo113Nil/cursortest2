package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o3h {
    public final mqs a;
    public final y5g b;

    public o3h(mqs mqsVar, y5g y5gVar) {
        mqsVar.getClass();
        this.a = mqsVar;
        this.b = y5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3h)) {
            return false;
        }
        o3h o3hVar = (o3h) obj;
        return Intrinsics.d(this.a, o3hVar.a) && this.b.equals(o3hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "LyricsResult(track=" + this.a + ", lyrics=" + this.b + ")";
    }
}
