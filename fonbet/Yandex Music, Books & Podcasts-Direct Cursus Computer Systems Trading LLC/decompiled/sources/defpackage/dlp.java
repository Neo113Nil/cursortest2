package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class dlp {
    public final Boolean a;
    public final Double b;
    public final Integer c;
    public final Integer d;
    public final Long e;

    public dlp(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        this.a = bool;
        this.b = d;
        this.c = num;
        this.d = num2;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlp)) {
            return false;
        }
        dlp dlpVar = (dlp) obj;
        return Intrinsics.d(this.a, dlpVar.a) && Intrinsics.d(this.b, dlpVar.b) && Intrinsics.d(this.c, dlpVar.c) && Intrinsics.d(this.d, dlpVar.d) && Intrinsics.d(this.e, dlpVar.e);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.b;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.e;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionConfigs(sessionEnabled=");
        sb.append(this.a);
        sb.append(", sessionSamplingRate=");
        sb.append(this.b);
        sb.append(", sessionRestartTimeout=");
        sb.append(this.c);
        sb.append(", cacheDuration=");
        sb.append(this.d);
        sb.append(", cacheUpdatedTime=");
        return tlm.k(sb, this.e, ')');
    }
}
