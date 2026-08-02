package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class jia {
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;

    public jia(List list, List list2, List list3, List list4, List list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jia)) {
            return false;
        }
        jia jiaVar = (jia) obj;
        return Intrinsics.d(this.a, jiaVar.a) && Intrinsics.d(this.b, jiaVar.b) && Intrinsics.d(this.c, jiaVar.c) && Intrinsics.d(this.d, jiaVar.d) && Intrinsics.d(this.e, jiaVar.e);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.c;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.d;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.e;
        return hashCode4 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadedSectionsBlockDataItems(playlists=");
        sb.append(this.a);
        sb.append(", albums=");
        sb.append(this.b);
        sb.append(", books=");
        sb.append(this.c);
        sb.append(", podcasts=");
        sb.append(this.d);
        sb.append(", kids=");
        return vz1.u(sb, this.e, ")");
    }
}
