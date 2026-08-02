package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class i6r {
    public final String a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final String f;

    public i6r(String str, Long l, Long l2, Long l3, Long l4, String str2) {
        this.a = str;
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = l4;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6r)) {
            return false;
        }
        i6r i6rVar = (i6r) obj;
        return Intrinsics.d(this.a, i6rVar.a) && Intrinsics.d(this.b, i6rVar.b) && Intrinsics.d(this.c, i6rVar.c) && Intrinsics.d(this.d, i6rVar.d) && Intrinsics.d(this.e, i6rVar.e) && Intrinsics.d(this.f, i6rVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.d;
        int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.e;
        int hashCode5 = (hashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str2 = this.f;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpeedTelemetry(uuid=");
        sb.append(this.a);
        sb.append(", blurShown=");
        sb.append(this.b);
        sb.append(", imageShown=");
        sb.append(this.c);
        sb.append(", firstFrameShown=");
        sb.append(this.d);
        sb.append(", totalTime=");
        sb.append(this.e);
        sb.append(", eventReason=");
        return dfi.i(sb, this.f, ')');
    }
}
