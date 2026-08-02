package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class jbu extends u7g {
    public final String c;

    public jbu(String str) {
        str.getClass();
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jbu) && Intrinsics.d(this.c, ((jbu) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return hrg.q("Url(url=", this.c, ")");
    }
}
