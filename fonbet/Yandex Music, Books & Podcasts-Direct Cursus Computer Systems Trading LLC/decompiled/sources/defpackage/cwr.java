package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class cwr implements jwr {
    public final s1g a;
    public final List b;

    public cwr(s1g s1gVar, ArrayList arrayList) {
        this.a = s1gVar;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwr)) {
            return false;
        }
        cwr cwrVar = (cwr) obj;
        return this.a.equals(cwrVar.a) && Intrinsics.d(this.b, cwrVar.b);
    }

    @Override // defpackage.jwr
    public final n43 getType() {
        return g43.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "LikedAlbumsSyncBlock(info=" + this.a + ", liked=" + this.b + ")";
    }
}
