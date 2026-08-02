package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class nlt {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Map d;
    public final Map e;

    public nlt(Integer num, Integer num2, Integer num3, f9h f9hVar, f9h f9hVar2) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = f9hVar;
        this.e = f9hVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlt)) {
            return false;
        }
        nlt nltVar = (nlt) obj;
        return Intrinsics.d(this.a, nltVar.a) && Intrinsics.d(this.b, nltVar.b) && Intrinsics.d(this.c, nltVar.c) && Intrinsics.d(this.d, nltVar.d) && Intrinsics.d(this.e, nltVar.e);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Map map = this.d;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.e;
        return hashCode4 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        return "UnreadCounters(messageCount=" + this.a + ", messageCountInChat=" + this.b + ", chatCount=" + this.c + ", namespaces=" + this.d + ", guids=" + this.e + ")";
    }
}
