package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ibu extends u7g {
    public final String c;

    public ibu(String str) {
        str.getClass();
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ibu) && Intrinsics.d(this.c, ((ibu) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return hrg.q("Id(id=", this.c, ")");
    }
}
