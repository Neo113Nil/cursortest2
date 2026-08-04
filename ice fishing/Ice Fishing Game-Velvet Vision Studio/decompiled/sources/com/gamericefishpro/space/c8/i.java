package com.gamericefishpro.space.c8;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final String a;
    public final Integer b;
    public final m c;
    public final long d;
    public final long e;
    public final Map f;

    public i(String str, Integer num, m mVar, long j, long j2, HashMap map) {
        this.a = str;
        this.b = num;
        this.c = mVar;
        this.d = j;
        this.e = j2;
        this.f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final h c() {
        h hVar = new h();
        String str = this.a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        hVar.a = str;
        hVar.b = this.b;
        m mVar = this.c;
        if (mVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        hVar.c = mVar;
        hVar.d = Long.valueOf(this.d);
        hVar.e = Long.valueOf(this.e);
        hVar.f = new HashMap(this.f);
        return hVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            Integer num2 = iVar.b;
            if (this.a.equals(iVar.a) && ((num = this.b) != null ? num.equals(num2) : num2 == null) && this.c.equals(iVar.c) && this.d == iVar.d && this.e == iVar.e && this.f.equals(iVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}
