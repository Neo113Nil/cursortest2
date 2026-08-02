package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t1g {
    public final Integer a;
    public final String b;
    public final String c;

    public t1g(Integer num, String str, String str2) {
        this.a = num;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1g)) {
            return false;
        }
        t1g t1gVar = (t1g) obj;
        return Intrinsics.d(this.a, t1gVar.a) && Intrinsics.d(this.b, t1gVar.b) && Intrinsics.d(this.c, t1gVar.c);
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
        StringBuilder sb = new StringBuilder("LikedArtistsSyncBlockInfo(revision=");
        sb.append(this.a);
        sb.append(", likedChecksum=");
        sb.append(this.b);
        sb.append(", dislikedChecksum=");
        return su4.o(sb, this.c, ")");
    }
}
