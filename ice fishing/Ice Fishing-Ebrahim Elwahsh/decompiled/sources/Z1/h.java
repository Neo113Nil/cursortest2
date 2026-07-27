package Z1;

import java.util.HashMap;
import q2.C4903n;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f4219a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f4220b;

    /* renamed from: c, reason: collision with root package name */
    public final k f4221c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4222d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4223e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f4224f;

    public h(String str, Integer num, k kVar, long j9, long j10, HashMap hashMap) {
        this.f4219a = str;
        this.f4220b = num;
        this.f4221c = kVar;
        this.f4222d = j9;
        this.f4223e = j10;
        this.f4224f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f4224f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f4224f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final C4903n c() {
        C4903n c4903n = new C4903n(2);
        String str = this.f4219a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        c4903n.f40101u = str;
        c4903n.f40102v = this.f4220b;
        k kVar = this.f4221c;
        if (kVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        c4903n.f40103w = kVar;
        c4903n.f40104x = Long.valueOf(this.f4222d);
        c4903n.f40105y = Long.valueOf(this.f4223e);
        c4903n.f40106z = new HashMap(this.f4224f);
        return c4903n;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f4219a.equals(hVar.f4219a)) {
            return false;
        }
        Integer num = hVar.f4220b;
        Integer num2 = this.f4220b;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        return this.f4221c.equals(hVar.f4221c) && this.f4222d == hVar.f4222d && this.f4223e == hVar.f4223e && this.f4224f.equals(hVar.f4224f);
    }

    public final int hashCode() {
        int hashCode = (this.f4219a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f4220b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f4221c.hashCode()) * 1000003;
        long j9 = this.f4222d;
        int i = (hashCode2 ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f4223e;
        return ((i ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f4224f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f4219a + ", code=" + this.f4220b + ", encodedPayload=" + this.f4221c + ", eventMillis=" + this.f4222d + ", uptimeMillis=" + this.f4223e + ", autoMetadata=" + this.f4224f + "}";
    }
}
