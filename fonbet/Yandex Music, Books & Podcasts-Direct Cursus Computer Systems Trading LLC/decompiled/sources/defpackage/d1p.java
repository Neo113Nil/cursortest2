package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d1p extends pxm {
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1p(String str) {
        super("clip:".concat(str), "clip");
        str.getClass();
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1p) && Intrinsics.d(this.c, ((d1p) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return hrg.q("VideoClip(id=", this.c, ")");
    }
}
