package Y1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k extends r {

    /* renamed from: a, reason: collision with root package name */
    public final long f3921a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f3922b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3923c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f3924d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3925e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3926f;

    /* renamed from: g, reason: collision with root package name */
    public final n f3927g;

    public k(long j6, Integer num, long j9, byte[] bArr, String str, long j10, n nVar) {
        this.f3921a = j6;
        this.f3922b = num;
        this.f3923c = j9;
        this.f3924d = bArr;
        this.f3925e = str;
        this.f3926f = j10;
        this.f3927g = nVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        k kVar = (k) rVar;
        if (this.f3921a != kVar.f3921a) {
            return false;
        }
        Integer num = this.f3922b;
        if (num == null) {
            if (kVar.f3922b != null) {
                return false;
            }
        } else if (!num.equals(kVar.f3922b)) {
            return false;
        }
        if (this.f3923c != kVar.f3923c) {
            return false;
        }
        if (!Arrays.equals(this.f3924d, rVar instanceof k ? ((k) rVar).f3924d : kVar.f3924d)) {
            return false;
        }
        String str = kVar.f3925e;
        String str2 = this.f3925e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f3926f != kVar.f3926f) {
            return false;
        }
        n nVar = kVar.f3927g;
        n nVar2 = this.f3927g;
        return nVar2 == null ? nVar == null : nVar2.equals(nVar);
    }

    public final int hashCode() {
        long j6 = this.f3921a;
        int i = (((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f3922b;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j9 = this.f3923c;
        int hashCode2 = (((hashCode ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f3924d)) * 1000003;
        String str = this.f3925e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j10 = this.f3926f;
        int i6 = (hashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        n nVar = this.f3927g;
        return i6 ^ (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f3921a + ", eventCode=" + this.f3922b + ", eventUptimeMs=" + this.f3923c + ", sourceExtension=" + Arrays.toString(this.f3924d) + ", sourceExtensionJsonProto3=" + this.f3925e + ", timezoneOffsetSeconds=" + this.f3926f + ", networkConnectionInfo=" + this.f3927g + "}";
    }
}
