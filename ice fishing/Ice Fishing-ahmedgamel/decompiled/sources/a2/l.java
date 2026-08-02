package a2;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends s {

    /* renamed from: a, reason: collision with root package name */
    public final long f4281a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4282b;

    /* renamed from: c, reason: collision with root package name */
    public final j f4283c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f4284d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4285e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f4286f;

    public l(long j6, long j9, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f4296n;
        this.f4281a = j6;
        this.f4282b = j9;
        this.f4283c = jVar;
        this.f4284d = num;
        this.f4285e = str;
        this.f4286f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        if (this.f4281a != lVar.f4281a) {
            return false;
        }
        if (this.f4282b != lVar.f4282b) {
            return false;
        }
        if (!this.f4283c.equals(lVar.f4283c)) {
            return false;
        }
        Integer num = lVar.f4284d;
        Integer num2 = this.f4284d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = lVar.f4285e;
        String str2 = this.f4285e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f4286f.equals(lVar.f4286f)) {
            return false;
        }
        Object obj2 = w.f4296n;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j6 = this.f4281a;
        long j9 = this.f4282b;
        int hashCode = (((((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003) ^ this.f4283c.hashCode()) * 1000003;
        Integer num = this.f4284d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f4285e;
        return ((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f4286f.hashCode()) * 1000003) ^ w.f4296n.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f4281a + ", requestUptimeMs=" + this.f4282b + ", clientInfo=" + this.f4283c + ", logSource=" + this.f4284d + ", logSourceName=" + this.f4285e + ", logEvents=" + this.f4286f + ", qosTier=" + w.f4296n + "}";
    }
}
