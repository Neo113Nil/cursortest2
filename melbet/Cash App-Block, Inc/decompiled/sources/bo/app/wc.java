package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class wc {
    public final xc a;
    public final String b;

    public wc(xc xcVar, String str) {
        xcVar.getClass();
        str.getClass();
        this.a = xcVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc)) {
            return false;
        }
        wc wcVar = (wc) obj;
        return this.a == wcVar.a && Intrinsics.areEqual(this.b, wcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RemotePath(pathType=" + this.a + ", remoteUrl=" + this.b + ")";
    }
}
