package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class px {
    public final String a;
    public final sx b;
    public final String c;
    public final String d;
    public final ArrayList e;

    public px(String str, sx sxVar, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = sxVar;
        this.c = str2;
        this.d = str3;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px)) {
            return false;
        }
        px pxVar = (px) obj;
        return this.a.equals(pxVar.a) && this.b == pxVar.b && Intrinsics.d(this.c, pxVar.c) && Intrinsics.d(this.d, pxVar.d) && this.e.equals(pxVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlbumRelatedAlbumsBlock(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", title=");
        su4.v(sb, this.c, ", categoryId=", this.d, ", albums=");
        return vz1.t(sb, this.e, ")");
    }
}
