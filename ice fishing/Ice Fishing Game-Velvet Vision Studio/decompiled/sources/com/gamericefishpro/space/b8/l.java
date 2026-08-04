package com.gamericefishpro.space.b8;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends s {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final w g;

    public l(long j, Integer num, long j2, byte[] bArr, String str, long j3, w wVar) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = wVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        w wVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            l lVar = (l) sVar;
            w wVar2 = lVar.g;
            String str2 = lVar.e;
            Integer num2 = lVar.b;
            if (this.a == lVar.a && ((num = this.b) != null ? num.equals(num2) : num2 == null) && this.c == lVar.c) {
                if (Arrays.equals(this.d, sVar instanceof l ? ((l) sVar).d : lVar.d) && ((str = this.e) != null ? str.equals(str2) : str2 == null) && this.f == lVar.f && ((wVar = this.g) != null ? wVar.equals(wVar2) : wVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j2 = this.c;
        int iHashCode2 = (((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f;
        int i2 = (iHashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        w wVar = this.g;
        return i2 ^ (wVar != null ? wVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }
}
