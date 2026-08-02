package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class im implements jm {
    public final String a;
    public final mqs b;
    public final List c;
    public final mwk d;

    public im(String str, mqs mqsVar, List list, mwk mwkVar) {
        mqsVar.getClass();
        list.getClass();
        mwkVar.getClass();
        this.a = str;
        this.b = mqsVar;
        this.c = list;
        this.d = mwkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im)) {
            return false;
        }
        im imVar = (im) obj;
        return Intrinsics.d(this.a, imVar.a) && Intrinsics.d(this.b, imVar.b) && Intrinsics.d(this.c, imVar.c) && Intrinsics.d(this.d, imVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + k5r.d(k5r.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b.a), 31, this.c);
    }

    public final String toString() {
        return "Success(title=" + this.a + ", track=" + this.b + ", playlistItems=" + this.c + ", playable=" + this.d + ")";
    }
}
