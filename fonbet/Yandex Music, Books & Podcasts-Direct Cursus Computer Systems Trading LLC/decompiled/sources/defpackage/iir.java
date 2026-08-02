package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class iir extends hdg {
    public final String d;
    public final int e;

    public iir(String str, int i) {
        this.d = str;
        this.e = i;
    }

    @Override // defpackage.hdg
    public final String X() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iir)) {
            return false;
        }
        iir iirVar = (iir) obj;
        return Intrinsics.d(this.d, iirVar.d) && this.e == iirVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "ColorStoredValue(name=" + this.d + ", value=" + ((Object) c85.a(this.e)) + ')';
    }
}
