package defpackage;

/* loaded from: classes6.dex */
public final class rhs {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public rhs(long j, boolean z, boolean z2, boolean z3) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static rhs a(rhs rhsVar, long j, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            j = rhsVar.a;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            z = rhsVar.b;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = rhsVar.c;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            z3 = rhsVar.d;
        }
        rhsVar.getClass();
        return new rhs(j2, z4, z5, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhs)) {
            return false;
        }
        rhs rhsVar = (rhs) obj;
        return nsa.e(this.a, rhsVar.a) && this.b == rhsVar.b && this.c == rhsVar.c && this.d == rhsVar.d;
    }

    public final int hashCode() {
        msa msaVar = nsa.b;
        return Boolean.hashCode(this.d) + k5r.e(k5r.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return v3w.g(v3w.h("TimePickerBottomSheetUiState(time=", nsa.t(this.a), ", showEndOfEntitySwitch=", ", endOfEntitySwitchChecked=", this.b), this.c, ", timerIsRunning=", this.d, ")");
    }
}
