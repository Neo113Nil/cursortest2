package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class htq extends j5 {
    public final etq d;
    public final tgo e;

    public htq(etq etqVar) {
        tgo a = etqVar == etq.a ? ugo.a(10) : ugo.a;
        a.getClass();
        this.d = etqVar;
        this.e = a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htq)) {
            return false;
        }
        htq htqVar = (htq) obj;
        return this.d == htqVar.d && Intrinsics.d(this.e, htqVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "Cover(type=" + this.d + ", cornerShape=" + this.e + ")";
    }
}
