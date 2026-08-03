package v5;

import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l extends s {

    /* renamed from: a, reason: collision with root package name */
    public final long f7283a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7284b;

    /* renamed from: c, reason: collision with root package name */
    public final j f7285c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f7286d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7287e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f7288f;

    public l(long j3, long j6, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f7298g;
        this.f7283a = j3;
        this.f7284b = j6;
        this.f7285c = jVar;
        this.f7286d = num;
        this.f7287e = str;
        this.f7288f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        Object obj2 = w.f7298g;
        ArrayList arrayList = lVar.f7288f;
        String str = lVar.f7287e;
        Integer num = lVar.f7286d;
        j jVar = lVar.f7285c;
        if (this.f7283a != lVar.f7283a || this.f7284b != lVar.f7284b || !this.f7285c.equals(jVar)) {
            return false;
        }
        Integer num2 = this.f7286d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.f7287e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.f7288f.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j3 = this.f7283a;
        long j6 = this.f7284b;
        int hashCode = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003) ^ this.f7285c.hashCode()) * 1000003;
        Integer num = this.f7286d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f7287e;
        return ((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f7288f.hashCode()) * 1000003) ^ w.f7298g.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f7283a + ", requestUptimeMs=" + this.f7284b + ", clientInfo=" + this.f7285c + ", logSource=" + this.f7286d + ", logSourceName=" + this.f7287e + ", logEvents=" + this.f7288f + ", qosTier=" + w.f7298g + "}";
    }
}
