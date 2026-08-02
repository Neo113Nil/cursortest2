package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f2g {
    public final Integer a;
    public final String b;
    public final String c;

    public f2g(Integer num, String str, String str2) {
        this.a = num;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2g)) {
            return false;
        }
        f2g f2gVar = (f2g) obj;
        return Intrinsics.d(this.a, f2gVar.a) && Intrinsics.d(this.b, f2gVar.b) && Intrinsics.d(this.c, f2gVar.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LikedTracksSyncBlockInfo(revision=");
        sb.append(this.a);
        sb.append(", likedChecksum=");
        sb.append(this.b);
        sb.append(", dislikedChecksum=");
        return su4.o(sb, this.c, ")");
    }
}
