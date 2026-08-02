package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class zml {
    public final List a;
    public final boolean b;
    public final String c;
    public final nxk d;
    public final ajl e;

    public zml(List list, boolean z, String str, nxk nxkVar, ajl ajlVar) {
        list.getClass();
        str.getClass();
        nxkVar.getClass();
        ajlVar.getClass();
        this.a = list;
        this.b = z;
        this.c = str;
        this.d = nxkVar;
        this.e = ajlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zml)) {
            return false;
        }
        zml zmlVar = (zml) obj;
        return Intrinsics.d(this.a, zmlVar.a) && this.b == zmlVar.b && Intrinsics.d(this.c, zmlVar.c) && Intrinsics.d(this.d, zmlVar.d) && Intrinsics.d(this.e, zmlVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + k5r.c(k5r.e(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        return "PlayerScreenSkeletonBlocksState(blockViewModels=" + this.a + ", hasMoreBlocks=" + this.b + ", skeletonPlayableId=" + this.c + ", playableType=" + this.d + ", analytics=" + this.e + ")";
    }
}
