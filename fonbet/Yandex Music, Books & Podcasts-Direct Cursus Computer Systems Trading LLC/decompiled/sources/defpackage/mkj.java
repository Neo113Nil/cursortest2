package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class mkj {
    public final String a;
    public final LinkedHashMap b;
    public final boolean c;

    public mkj(String str, LinkedHashMap linkedHashMap, boolean z) {
        str.getClass();
        this.a = str;
        this.b = linkedHashMap;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkj)) {
            return false;
        }
        mkj mkjVar = (mkj) obj;
        return Intrinsics.d(this.a, mkjVar.a) && this.b.equals(mkjVar.b) && this.c == mkjVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfferConfig(sessionId=");
        sb.append(this.a);
        sb.append(", offers=");
        sb.append(this.b);
        sb.append(", isNativePaymentAvailable=");
        return ouj.r(sb, this.c, ")");
    }
}
