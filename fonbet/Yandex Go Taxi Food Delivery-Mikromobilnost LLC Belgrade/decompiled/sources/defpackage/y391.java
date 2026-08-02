package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class y391 {
    public static final ImmutableSet d = ImmutableSet.l(3, "_syn", "_err", "_el");
    public String a;
    public final long b;
    public final HashMap c;

    public y391(String str, long j, HashMap hashMap) {
        this.a = str;
        this.b = j;
        HashMap hashMap2 = new HashMap();
        this.c = hashMap2;
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
    }

    public static Object e(String str, Object obj, Object obj2) {
        if (d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    public final long a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final HashMap c() {
        return this.c;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final y391 clone() {
        return new y391(this.a, this.b, new HashMap(this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y391)) {
            return false;
        }
        y391 y391Var = (y391) obj;
        if (this.b == y391Var.b && this.a.equals(y391Var.a)) {
            return this.c.equals(y391Var.c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.b;
        return this.c.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.a;
        String obj = this.c.toString();
        int length = String.valueOf(str).length();
        long j = this.b;
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(j).length() + 9 + obj.length() + 1);
        x4e.C(sb, "Event{name='", str, "', timestamp=");
        uw51.v(j, ", params=", obj, sb);
        sb.append("}");
        return sb.toString();
    }
}
