package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z0p extends pxm {
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0p(String str) {
        super("podcast:".concat(str), "podcast");
        str.getClass();
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0p) && Intrinsics.d(this.c, ((z0p) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return hrg.q("Podcast(id=", this.c, ")");
    }
}
