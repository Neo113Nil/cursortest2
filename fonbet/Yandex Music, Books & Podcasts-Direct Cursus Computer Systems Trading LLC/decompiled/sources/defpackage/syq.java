package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class syq {
    public List a = null;
    public Integer b = null;
    public Integer c = null;
    public boolean d = false;
    public Long e = null;
    public Long f = null;
    public Integer g = null;
    public Integer h = null;
    public Integer i = null;
    public Integer j = null;
    public Integer k = null;
    public Integer l = null;
    public Integer m = null;
    public Integer n = null;
    public Integer o = null;
    public String p = null;
    public String q = null;
    public String r = null;
    public long s = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syq)) {
            return false;
        }
        syq syqVar = (syq) obj;
        return Intrinsics.d(this.a, syqVar.a) && Intrinsics.d(this.b, syqVar.b) && Intrinsics.d(this.c, syqVar.c) && this.d == syqVar.d && Intrinsics.d(this.e, syqVar.e) && Intrinsics.d(this.f, syqVar.f) && Intrinsics.d(this.g, syqVar.g) && Intrinsics.d(this.h, syqVar.h) && Intrinsics.d(this.i, syqVar.i) && Intrinsics.d(this.j, syqVar.j) && Intrinsics.d(this.k, syqVar.k) && Intrinsics.d(this.l, syqVar.l) && Intrinsics.d(this.m, syqVar.m) && Intrinsics.d(this.n, syqVar.n) && Intrinsics.d(this.o, syqVar.o) && Intrinsics.d(this.p, syqVar.p) && Intrinsics.d(this.q, syqVar.q) && Intrinsics.d(this.r, syqVar.r) && this.s == syqVar.s;
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int e = k5r.e((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.d);
        Long l = this.e;
        int hashCode3 = (e + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num3 = this.g;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.h;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.i;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.j;
        int hashCode8 = (hashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.k;
        int hashCode9 = (hashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.l;
        int hashCode10 = (hashCode9 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.m;
        int hashCode11 = (hashCode10 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.n;
        int hashCode12 = (hashCode11 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.o;
        int hashCode13 = (hashCode12 + (num11 == null ? 0 : num11.hashCode())) * 31;
        String str = this.p;
        int hashCode14 = (hashCode13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.q;
        int hashCode15 = (hashCode14 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.r;
        return Long.hashCode(this.s) + ((hashCode15 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        List list = this.a;
        Integer num = this.b;
        Integer num2 = this.c;
        boolean z = this.d;
        Long l = this.e;
        Long l2 = this.f;
        Integer num3 = this.g;
        Integer num4 = this.h;
        Integer num5 = this.i;
        Integer num6 = this.j;
        Integer num7 = this.k;
        Integer num8 = this.l;
        Integer num9 = this.m;
        Integer num10 = this.n;
        Integer num11 = this.o;
        String str = this.p;
        String str2 = this.q;
        String str3 = this.r;
        long j = this.s;
        StringBuilder sb = new StringBuilder("SmartDownloadStatus(timeIntervals=");
        sb.append(list);
        sb.append(", tracksToAdd=");
        sb.append(num);
        sb.append(", tracksToDelete=");
        sb.append(num2);
        sb.append(", requestUpdate=");
        sb.append(z);
        sb.append(", prevUpdateTimeMs=");
        sb.append(l);
        sb.append(", nextUpdateTimeMs=");
        sb.append(l2);
        sb.append(", tracksToDownload=");
        sb.append(num3);
        sb.append(", downloadedTrackCount=");
        sb.append(num4);
        sb.append(", deletedTrackCount=");
        sb.append(num5);
        sb.append(", userCachedTracks=");
        sb.append(num6);
        sb.append(", autoCachedTracks=");
        sb.append(num7);
        sb.append(", smartCachedTracks=");
        sb.append(num8);
        sb.append(", storageMaxSizeMb=");
        sb.append(num9);
        sb.append(", storageOccupiedSizeMb=");
        sb.append(num10);
        sb.append(", totalOccupiedSizeMb=");
        sb.append(num11);
        sb.append(", currentQuality=");
        sb.append(str);
        sb.append(", error=");
        su4.v(sb, str2, ", payload=", str3, ", totalTimeSec=");
        return hrg.m(j, ")", sb);
    }
}
