package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u0p extends pxm {
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0p(String str) {
        super("album:".concat(str), "album");
        str.getClass();
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0p) && Intrinsics.d(this.c, ((u0p) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return hrg.q("Album(id=", this.c, ")");
    }
}
