package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zpr {
    public final String a;
    public final Integer b;
    public final String c;

    public zpr(String str, Integer num, String str2) {
        this.a = str;
        this.b = num;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpr)) {
            return false;
        }
        zpr zprVar = (zpr) obj;
        return Intrinsics.d(this.a, zprVar.a) && Intrinsics.d(this.b, zprVar.b) && Intrinsics.d(this.c, zprVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubtitlesTrackData(title=");
        sb.append(this.a);
        sb.append(", bitrate=");
        sb.append(this.b);
        sb.append(", language=");
        return dfi.i(sb, this.c, ')');
    }
}
