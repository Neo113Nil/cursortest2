package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ogr {
    public final Long a;
    public final String b;
    public final String c;

    public ogr(Long l, String str, String str2) {
        this.a = l;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogr)) {
            return false;
        }
        ogr ogrVar = (ogr) obj;
        return Intrinsics.d(this.a, ogrVar.a) && Intrinsics.d(this.b, ogrVar.b) && Intrinsics.d(this.c, ogrVar.c);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatEntityUiData(value=");
        sb.append(this.a);
        sb.append(", suffix=");
        sb.append(this.b);
        sb.append(", subtitle=");
        return su4.o(sb, this.c, ")");
    }
}
