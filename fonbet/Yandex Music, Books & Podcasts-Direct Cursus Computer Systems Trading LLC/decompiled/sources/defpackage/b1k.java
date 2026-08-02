package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b1k extends g1k {
    public final ofg a;
    public final ofg b;

    public b1k(ofg ofgVar, ofg ofgVar2) {
        this.a = ofgVar;
        this.b = ofgVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1k)) {
            return false;
        }
        b1k b1kVar = (b1k) obj;
        return this.a.equals(b1kVar.a) && Intrinsics.d(this.b, b1kVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ofg ofgVar = this.b;
        return hashCode + (ofgVar == null ? 0 : ofgVar.hashCode());
    }

    public final String toString() {
        String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.a + "\n                    ";
        ofg ofgVar = this.b;
        if (ofgVar != null) {
            str = str + "|   mediatorLoadStates: " + ofgVar + '\n';
        }
        return hlr.e(str.concat("|)"));
    }
}
