package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y7u {
    public final w6u a;
    public final String b;
    public final gxc c;
    public final List d;
    public final q9u e;
    public final Long f;

    public y7u(w6u w6uVar, String str, gxc gxcVar, List list, q9u q9uVar, Long l) {
        str.getClass();
        gxcVar.getClass();
        this.a = w6uVar;
        this.b = str;
        this.c = gxcVar;
        this.d = list;
        this.e = q9uVar;
        this.f = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7u)) {
            return false;
        }
        y7u y7uVar = (y7u) obj;
        return this.a.equals(y7uVar.a) && Intrinsics.d(this.b, y7uVar.b) && Intrinsics.d(this.c, y7uVar.c) && Intrinsics.d(this.d, y7uVar.d) && Intrinsics.d(this.e, y7uVar.e) && Intrinsics.d(this.f, y7uVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + k5r.c(this.a.a.hashCode() * 31, 31, this.b)) * 31;
        List list = this.d;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        q9u q9uVar = this.e;
        int hashCode3 = (hashCode2 + (q9uVar == null ? 0 : q9uVar.hashCode())) * 31;
        Long l = this.f;
        return hashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "VideoClipRadioStartRequest(contentId=" + this.a + ", from=" + this.b + ", fromData=" + this.c + ", initialQueue=" + this.d + ", startFrom=" + this.e + ", itemToStartFromProgress=" + this.f + ")";
    }
}
