package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tpc {
    public final qpc a;
    public final tqc b;

    public tpc(qpc qpcVar, tqc tqcVar) {
        tqcVar.getClass();
        this.a = qpcVar;
        this.b = tqcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpc)) {
            return false;
        }
        tpc tpcVar = (tpc) obj;
        return Intrinsics.d(this.a, tpcVar.a) && Intrinsics.d(this.b, tpcVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.a;
    }

    public final String toString() {
        return "FontFamilyWithWeight(fontFamily=" + this.a + ", weight=" + this.b + ')';
    }

    public tpc(qpc qpcVar) {
        this(qpcVar, tqc.m);
    }
}
