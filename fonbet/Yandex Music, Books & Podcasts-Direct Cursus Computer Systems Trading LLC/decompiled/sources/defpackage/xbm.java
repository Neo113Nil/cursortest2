package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class xbm implements ybm {
    public final String a;
    public final oq b;

    public xbm(oq oqVar, String str) {
        str.getClass();
        oqVar.getClass();
        this.a = str;
        this.b = oqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbm)) {
            return false;
        }
        xbm xbmVar = (xbm) obj;
        return Intrinsics.d(this.a, xbmVar.a) && Intrinsics.d(this.b, xbmVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Unavailable(title=" + this.a + ", album=" + this.b + ")";
    }
}
