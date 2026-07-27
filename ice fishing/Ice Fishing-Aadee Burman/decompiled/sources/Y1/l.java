package Y1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends s {

    /* renamed from: a, reason: collision with root package name */
    public final long f3928a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3929b;

    /* renamed from: c, reason: collision with root package name */
    public final j f3930c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f3931d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3932e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3933f;

    public l(long j6, long j9, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f3943n;
        this.f3928a = j6;
        this.f3929b = j9;
        this.f3930c = jVar;
        this.f3931d = num;
        this.f3932e = str;
        this.f3933f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        if (this.f3928a != lVar.f3928a) {
            return false;
        }
        if (this.f3929b != lVar.f3929b) {
            return false;
        }
        if (!this.f3930c.equals(lVar.f3930c)) {
            return false;
        }
        Integer num = lVar.f3931d;
        Integer num2 = this.f3931d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = lVar.f3932e;
        String str2 = this.f3932e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f3933f.equals(lVar.f3933f)) {
            return false;
        }
        Object obj2 = w.f3943n;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j6 = this.f3928a;
        long j9 = this.f3929b;
        int hashCode = (((((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003) ^ this.f3930c.hashCode()) * 1000003;
        Integer num = this.f3931d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f3932e;
        return ((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f3933f.hashCode()) * 1000003) ^ w.f3943n.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f3928a + ", requestUptimeMs=" + this.f3929b + ", clientInfo=" + this.f3930c + ", logSource=" + this.f3931d + ", logSourceName=" + this.f3932e + ", logEvents=" + this.f3933f + ", qosTier=" + w.f3943n + "}";
    }
}
