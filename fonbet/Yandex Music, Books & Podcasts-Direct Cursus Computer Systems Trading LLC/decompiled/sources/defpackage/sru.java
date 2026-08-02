package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class sru implements tru {
    public final boolean a;
    public final List b;
    public final boolean c;

    public sru(List list, boolean z, boolean z2) {
        list.getClass();
        this.a = z;
        this.b = list;
        this.c = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public static sru a(sru sruVar, boolean z, ArrayList arrayList, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = sruVar.a;
        }
        ArrayList arrayList2 = arrayList;
        if ((i & 2) != 0) {
            arrayList2 = sruVar.b;
        }
        if ((i & 4) != 0) {
            z2 = sruVar.c;
        }
        sruVar.getClass();
        arrayList2.getClass();
        return new sru(arrayList2, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sru)) {
            return false;
        }
        sru sruVar = (sru) obj;
        return this.a == sruVar.a && Intrinsics.d(this.b, sruVar.b) && this.c == sruVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + k5r.d(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    @Override // defpackage.tru
    public final boolean k() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(isInvitationLinkLoading=");
        sb.append(this.a);
        sb.append(", waves=");
        sb.append(this.b);
        sb.append(", isRefreshing=");
        return ouj.r(sb, this.c, ")");
    }
}
