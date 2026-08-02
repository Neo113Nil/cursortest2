package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c1p extends pxm {
    public final String c;

    public c1p(String str) {
        super("wave:".concat(str), "wave");
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1p) && Intrinsics.d(this.c, ((c1p) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return hrg.q("Vibe(id=", this.c, ")");
    }
}
