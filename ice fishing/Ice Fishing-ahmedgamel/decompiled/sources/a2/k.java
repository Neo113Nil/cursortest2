package a2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k extends r {

    /* renamed from: a, reason: collision with root package name */
    public final long f4274a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f4275b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4276c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f4277d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4278e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4279f;

    /* renamed from: g, reason: collision with root package name */
    public final n f4280g;

    public k(long j6, Integer num, long j9, byte[] bArr, String str, long j10, n nVar) {
        this.f4274a = j6;
        this.f4275b = num;
        this.f4276c = j9;
        this.f4277d = bArr;
        this.f4278e = str;
        this.f4279f = j10;
        this.f4280g = nVar;
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
        if (this.f4274a != kVar.f4274a) {
            return false;
        }
        Integer num = this.f4275b;
        if (num == null) {
            if (kVar.f4275b != null) {
                return false;
            }
        } else if (!num.equals(kVar.f4275b)) {
            return false;
        }
        if (this.f4276c != kVar.f4276c) {
            return false;
        }
        if (!Arrays.equals(this.f4277d, rVar instanceof k ? ((k) rVar).f4277d : kVar.f4277d)) {
            return false;
        }
        String str = kVar.f4278e;
        String str2 = this.f4278e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f4279f != kVar.f4279f) {
            return false;
        }
        n nVar = kVar.f4280g;
        n nVar2 = this.f4280g;
        return nVar2 == null ? nVar == null : nVar2.equals(nVar);
    }

    public final int hashCode() {
        long j6 = this.f4274a;
        int i = (((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f4275b;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j9 = this.f4276c;
        int hashCode2 = (((hashCode ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f4277d)) * 1000003;
        String str = this.f4278e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j10 = this.f4279f;
        int i4 = (hashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        n nVar = this.f4280g;
        return i4 ^ (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f4274a + ", eventCode=" + this.f4275b + ", eventUptimeMs=" + this.f4276c + ", sourceExtension=" + Arrays.toString(this.f4277d) + ", sourceExtensionJsonProto3=" + this.f4278e + ", timezoneOffsetSeconds=" + this.f4279f + ", networkConnectionInfo=" + this.f4280g + "}";
    }
}
