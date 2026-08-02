package b2;

import java.util.HashMap;
import s2.C4945n;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f5531a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f5532b;

    /* renamed from: c, reason: collision with root package name */
    public final j f5533c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5534d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5535e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f5536f;

    public h(String str, Integer num, j jVar, long j6, long j9, HashMap hashMap) {
        this.f5531a = str;
        this.f5532b = num;
        this.f5533c = jVar;
        this.f5534d = j6;
        this.f5535e = j9;
        this.f5536f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f5536f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f5536f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final C4945n c() {
        C4945n c4945n = new C4945n(2);
        String str = this.f5531a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        c4945n.f40491u = str;
        c4945n.f40492v = this.f5532b;
        j jVar = this.f5533c;
        if (jVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        c4945n.f40493w = jVar;
        c4945n.f40494x = Long.valueOf(this.f5534d);
        c4945n.f40495y = Long.valueOf(this.f5535e);
        c4945n.f40496z = new HashMap(this.f5536f);
        return c4945n;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f5531a.equals(hVar.f5531a)) {
            return false;
        }
        Integer num = hVar.f5532b;
        Integer num2 = this.f5532b;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        return this.f5533c.equals(hVar.f5533c) && this.f5534d == hVar.f5534d && this.f5535e == hVar.f5535e && this.f5536f.equals(hVar.f5536f);
    }

    public final int hashCode() {
        int hashCode = (this.f5531a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f5532b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f5533c.hashCode()) * 1000003;
        long j6 = this.f5534d;
        int i = (hashCode2 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j9 = this.f5535e;
        return ((i ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ this.f5536f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f5531a + ", code=" + this.f5532b + ", encodedPayload=" + this.f5533c + ", eventMillis=" + this.f5534d + ", uptimeMillis=" + this.f5535e + ", autoMetadata=" + this.f5536f + "}";
    }
}
