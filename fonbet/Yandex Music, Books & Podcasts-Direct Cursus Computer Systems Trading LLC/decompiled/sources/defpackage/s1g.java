package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s1g {
    public final Integer a;
    public final String b;

    public s1g(Integer num, String str) {
        this.a = num;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1g)) {
            return false;
        }
        s1g s1gVar = (s1g) obj;
        return Intrinsics.d(this.a, s1gVar.a) && Intrinsics.d(this.b, s1gVar.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "LikedAlbumsSyncBlockInfo(revision=" + this.a + ", checkSum=" + this.b + ")";
    }
}
