package v5;

import java.util.Arrays;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k extends r {

    /* renamed from: a, reason: collision with root package name */
    public final long f7276a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f7277b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7278c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f7279d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7280e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7281f;

    /* renamed from: g, reason: collision with root package name */
    public final v f7282g;

    public k(long j3, Integer num, long j6, byte[] bArr, String str, long j10, v vVar) {
        this.f7276a = j3;
        this.f7277b = num;
        this.f7278c = j6;
        this.f7279d = bArr;
        this.f7280e = str;
        this.f7281f = j10;
        this.f7282g = vVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        v vVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            k kVar = (k) rVar;
            v vVar2 = kVar.f7282g;
            String str2 = kVar.f7280e;
            Integer num2 = kVar.f7277b;
            if (this.f7276a == kVar.f7276a && ((num = this.f7277b) != null ? num.equals(num2) : num2 == null) && this.f7278c == kVar.f7278c) {
                if (Arrays.equals(this.f7279d, rVar instanceof k ? ((k) rVar).f7279d : kVar.f7279d) && ((str = this.f7280e) != null ? str.equals(str2) : str2 == null) && this.f7281f == kVar.f7281f && ((vVar = this.f7282g) != null ? vVar.equals(vVar2) : vVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f7276a;
        int i10 = (((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f7277b;
        int hashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j6 = this.f7278c;
        int hashCode2 = (((hashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f7279d)) * 1000003;
        String str = this.f7280e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j10 = this.f7281f;
        int i11 = (hashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        v vVar = this.f7282g;
        return i11 ^ (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f7276a + ", eventCode=" + this.f7277b + ", eventUptimeMs=" + this.f7278c + ", sourceExtension=" + Arrays.toString(this.f7279d) + ", sourceExtensionJsonProto3=" + this.f7280e + ", timezoneOffsetSeconds=" + this.f7281f + ", networkConnectionInfo=" + this.f7282g + "}";
    }
}
