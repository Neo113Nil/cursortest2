package w5;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f7681a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f7682b;

    /* renamed from: c, reason: collision with root package name */
    public final k f7683c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7684d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7685e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f7686f;

    public h(String str, Integer num, k kVar, long j3, long j6, HashMap hashMap) {
        this.f7681a = str;
        this.f7682b = num;
        this.f7683c = kVar;
        this.f7684d = j3;
        this.f7685e = j6;
        this.f7686f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f7686f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f7686f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final d8.m c() {
        d8.m mVar = new d8.m();
        String str = this.f7681a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        mVar.f1797a = str;
        mVar.f1798b = this.f7682b;
        k kVar = this.f7683c;
        if (kVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        mVar.f1799c = kVar;
        mVar.f1800d = Long.valueOf(this.f7684d);
        mVar.f1801e = Long.valueOf(this.f7685e);
        mVar.f1802f = new HashMap(this.f7686f);
        return mVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            Integer num2 = hVar.f7682b;
            if (this.f7681a.equals(hVar.f7681a) && ((num = this.f7682b) != null ? num.equals(num2) : num2 == null) && this.f7683c.equals(hVar.f7683c) && this.f7684d == hVar.f7684d && this.f7685e == hVar.f7685e && this.f7686f.equals(hVar.f7686f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f7681a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f7682b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f7683c.hashCode()) * 1000003;
        long j3 = this.f7684d;
        int i10 = (hashCode2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j6 = this.f7685e;
        return ((i10 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.f7686f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f7681a + ", code=" + this.f7682b + ", encodedPayload=" + this.f7683c + ", eventMillis=" + this.f7684d + ", uptimeMillis=" + this.f7685e + ", autoMetadata=" + this.f7686f + "}";
    }
}
