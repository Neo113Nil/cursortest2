package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class wgg {
    public final List a;
    public final boolean b;

    public wgg(List list, boolean z) {
        list.getClass();
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgg)) {
            return false;
        }
        wgg wggVar = (wgg) obj;
        return Intrinsics.d(this.a, wggVar.a) && this.b == wggVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Artists(artists=" + this.a + ", hasMore=" + this.b + ")";
    }
}
