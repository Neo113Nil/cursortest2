package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b1p extends pxm {
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1p(String str) {
        super("track:".concat(str), "track");
        str.getClass();
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1p) && Intrinsics.d(this.c, ((b1p) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return hrg.q("Track(id=", this.c, ")");
    }
}
