package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class vrp implements wrp {
    public final List a;
    public final gjl b;
    public final int c;

    public vrp(List list, gjl gjlVar) {
        list.getClass();
        this.a = list;
        this.b = gjlVar;
        this.c = list.size();
    }

    @Override // defpackage.wrp
    public final int a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrp)) {
            return false;
        }
        vrp vrpVar = (vrp) obj;
        return Intrinsics.d(this.a, vrpVar.a) && Intrinsics.d(this.b, vrpVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gjl gjlVar = this.b;
        return hashCode + (gjlVar == null ? 0 : gjlVar.hashCode());
    }

    public final String toString() {
        return "Success(buttons=" + this.a + ", analyticsPayload=" + this.b + ")";
    }
}
