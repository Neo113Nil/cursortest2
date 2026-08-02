package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class rn1 implements sn1 {
    public final List a;
    public final gjl b;

    public rn1(List list, gjl gjlVar) {
        list.getClass();
        this.a = list;
        this.b = gjlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn1)) {
            return false;
        }
        rn1 rn1Var = (rn1) obj;
        return Intrinsics.d(this.a, rn1Var.a) && Intrinsics.d(this.b, rn1Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gjl gjlVar = this.b;
        return hashCode + (gjlVar == null ? 0 : gjlVar.hashCode());
    }

    public final String toString() {
        return "Success(artists=" + this.a + ", analyticsPayload=" + this.b + ")";
    }
}
