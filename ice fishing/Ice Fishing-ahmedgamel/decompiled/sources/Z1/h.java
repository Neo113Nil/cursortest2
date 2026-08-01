package Z1;

import java.util.HashMap;
import q2.C4896n;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f4142a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f4143b;

    /* renamed from: c, reason: collision with root package name */
    public final k f4144c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4145d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4146e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f4147f;

    public h(String str, Integer num, k kVar, long j6, long j9, HashMap hashMap) {
        this.f4142a = str;
        this.f4143b = num;
        this.f4144c = kVar;
        this.f4145d = j6;
        this.f4146e = j9;
        this.f4147f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f4147f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f4147f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final C4896n c() {
        C4896n c4896n = new C4896n(2);
        String str = this.f4142a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        c4896n.f40192u = str;
        c4896n.f40193v = this.f4143b;
        k kVar = this.f4144c;
        if (kVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        c4896n.f40194w = kVar;
        c4896n.f40195x = Long.valueOf(this.f4145d);
        c4896n.f40196y = Long.valueOf(this.f4146e);
        c4896n.f40197z = new HashMap(this.f4147f);
        return c4896n;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f4142a.equals(hVar.f4142a)) {
            return false;
        }
        Integer num = hVar.f4143b;
        Integer num2 = this.f4143b;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        return this.f4144c.equals(hVar.f4144c) && this.f4145d == hVar.f4145d && this.f4146e == hVar.f4146e && this.f4147f.equals(hVar.f4147f);
    }

    public final int hashCode() {
        int hashCode = (this.f4142a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f4143b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f4144c.hashCode()) * 1000003;
        long j6 = this.f4145d;
        int i = (hashCode2 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j9 = this.f4146e;
        return ((i ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ this.f4147f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f4142a + ", code=" + this.f4143b + ", encodedPayload=" + this.f4144c + ", eventMillis=" + this.f4145d + ", uptimeMillis=" + this.f4146e + ", autoMetadata=" + this.f4147f + "}";
    }
}
