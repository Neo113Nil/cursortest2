package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class uib {
    public final String a;
    public final long b;
    public final Map c;

    public uib(String str, long j, Map map) {
        map.getClass();
        this.a = str;
        this.b = j;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uib)) {
            return false;
        }
        uib uibVar = (uib) obj;
        return this.a.equals(uibVar.a) && this.b == uibVar.b && Intrinsics.d(this.c, uibVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + tlm.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventMetadata(sessionId=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", additionalCustomKeys=");
        return k5r.p(sb, this.c, ')');
    }
}
