package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y0p extends pxm {
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0p(String str) {
        super("playlist:".concat(str), "playlist");
        str.getClass();
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0p) && Intrinsics.d(this.c, ((y0p) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return hrg.q("Playlist(id=", this.c, ")");
    }
}
