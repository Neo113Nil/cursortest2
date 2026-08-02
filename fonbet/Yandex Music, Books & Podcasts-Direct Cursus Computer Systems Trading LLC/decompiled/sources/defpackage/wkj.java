package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class wkj {
    public final List a;
    public final List b;
    public final ArrayList c;

    public wkj(List list, List list2, ArrayList arrayList) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkj)) {
            return false;
        }
        wkj wkjVar = (wkj) obj;
        return Intrinsics.d(this.a, wkjVar.a) && Intrinsics.d(this.b, wkjVar.b) && this.c.equals(wkjVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k5r.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffersAnalyticsInfo(offersBatchIds=");
        sb.append(this.a);
        sb.append(", offersPositionIds=");
        sb.append(this.b);
        sb.append(", billingProductIds=");
        return vz1.t(sb, this.c, ")");
    }
}
