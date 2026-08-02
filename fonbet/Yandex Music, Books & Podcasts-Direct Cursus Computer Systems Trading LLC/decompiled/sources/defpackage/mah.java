package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mah {
    public final lah a;
    public final String b;
    public final Integer c;
    public final String d;
    public final String e;
    public final Long f;
    public final Long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Map k;

    public mah(lah lahVar, String str, Integer num, String str2, String str3, Long l, Long l2, Long l3, Long l4, Long l5, Map map) {
        this.a = lahVar;
        this.b = str;
        this.c = num;
        this.d = str2;
        this.e = str3;
        this.f = l;
        this.g = l2;
        this.h = l3;
        this.i = l4;
        this.j = l5;
        this.k = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!mah.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        mah mahVar = (mah) obj;
        return Intrinsics.d(this.a, mahVar.a) && Intrinsics.d(this.b, mahVar.b) && Intrinsics.d(this.c, mahVar.c) && Intrinsics.d(this.d, mahVar.d) && Intrinsics.d(this.e, mahVar.e) && Intrinsics.d(this.f, mahVar.f) && Intrinsics.d(this.g, mahVar.g) && Intrinsics.d(this.h, mahVar.h) && Intrinsics.d(this.i, mahVar.i) && Intrinsics.d(this.j, mahVar.j) && Intrinsics.d(this.k, mahVar.k);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num = this.c;
        int intValue = (hashCode2 + (num != null ? num.intValue() : 0)) * 31;
        String str2 = this.d;
        int hashCode3 = (intValue + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Long l = this.f;
        int hashCode5 = (hashCode4 + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.g;
        int hashCode6 = (hashCode5 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.h;
        int hashCode7 = (hashCode6 + (l3 != null ? l3.hashCode() : 0)) * 31;
        Long l4 = this.i;
        int hashCode8 = (hashCode7 + (l4 != null ? l4.hashCode() : 0)) * 31;
        Long l5 = this.j;
        return this.k.hashCode() + ((hashCode8 + (l5 != null ? l5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MapiRequestDetails(request=" + this.a + ", url=" + this.b + ", responseCode=" + this.c + ", message=" + this.d + ", xRequestId=" + this.e + ", startedAtMillis=" + this.f + ", finishedAtMillis=" + this.g + ", requestDurationInMillis=" + this.h + ", parseDurationInMillis=" + this.i + ", totalDurationInMillis=" + this.j + ", additional=" + this.k + ")";
    }
}
