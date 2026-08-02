package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class qyt implements tyt, fyt {
    public final String a;
    public final pyt b;

    public qyt(String str, pyt pytVar) {
        str.getClass();
        this.a = str;
        this.b = pytVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyt)) {
            return false;
        }
        qyt qytVar = (qyt) obj;
        return Intrinsics.d(this.a, qytVar.a) && Intrinsics.d(this.b, qytVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        pyt pytVar = this.b;
        return hashCode + (pytVar == null ? 0 : pytVar.hashCode());
    }

    public final String toString() {
        return "Search(query=" + this.a + ", searchFromLocalEntity=" + this.b + ")";
    }
}
