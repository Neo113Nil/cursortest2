package defpackage;

import com.appsflyer.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class jeg {
    public final long a;
    public final Long b;
    public final Long c;
    public final meg d;
    public final Long e;
    public final Boolean f;
    public final meg g;
    public final Long h;
    public final Boolean i;

    public jeg(long j, Long l, Long l2, meg megVar, Long l3, Boolean bool, meg megVar2, Long l4, Boolean bool2) {
        this.a = j;
        this.b = l;
        this.c = l2;
        this.d = megVar;
        this.e = l3;
        this.f = bool;
        this.g = megVar2;
        this.h = l4;
        this.i = bool2;
    }

    public final jeg a(Function1 function1) {
        ieg iegVar = new ieg();
        iegVar.a = this.a;
        iegVar.b = this.b;
        iegVar.c = this.c;
        iegVar.d = this.d;
        iegVar.e = this.e;
        iegVar.f = this.f;
        iegVar.g = this.g;
        iegVar.h = this.h;
        iegVar.i = this.i;
        function1.invoke(iegVar);
        return new jeg(iegVar.a, iegVar.b, iegVar.c, iegVar.d, iegVar.e, iegVar.f, iegVar.g, iegVar.h, iegVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jeg)) {
            return false;
        }
        jeg jegVar = (jeg) obj;
        return this.a == jegVar.a && Intrinsics.d(this.b, jegVar.b) && Intrinsics.d(this.c, jegVar.c) && Intrinsics.d(this.d, jegVar.d) && Intrinsics.d(this.e, jegVar.e) && Intrinsics.d(this.f, jegVar.f) && Intrinsics.d(this.g, jegVar.g) && Intrinsics.d(this.h, jegVar.h) && Intrinsics.d(this.i, jegVar.i);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.c;
        int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
        meg megVar = this.d;
        int hashCode4 = (hashCode3 + (megVar != null ? megVar.hashCode() : 0)) * 31;
        Long l3 = this.e;
        int hashCode5 = (hashCode4 + (l3 != null ? l3.hashCode() : 0)) * 31;
        Boolean bool = this.f;
        int hashCode6 = (hashCode5 + (bool != null ? bool.hashCode() : 0)) * 31;
        meg megVar2 = this.g;
        int hashCode7 = (hashCode6 + (megVar2 != null ? megVar2.hashCode() : 0)) * 31;
        Long l4 = this.h;
        int hashCode8 = (hashCode7 + (l4 != null ? l4.hashCode() : 0)) * 31;
        Boolean bool2 = this.i;
        return hashCode8 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadControlBufferState(lastEstimatedMaxTargetBuffer=");
        sb.append(this.a);
        sb.append(", bufferForPlaybackMs=");
        sb.append(this.b);
        sb.append(", bufferForPlaybackAfterRebufferMs=");
        sb.append(this.c);
        sb.append(", lastSCLParameters=");
        sb.append(this.d);
        sb.append(", lastSCLTimestamp=");
        sb.append(this.e);
        sb.append(", lastSCLResult=");
        sb.append(this.f);
        sb.append(", lastSSPParameters=");
        sb.append(this.g);
        sb.append(", lastSSPTimestamp=");
        sb.append(this.h);
        sb.append(", lastSSPResult=");
        return k.p(sb, this.i, ')');
    }
}
