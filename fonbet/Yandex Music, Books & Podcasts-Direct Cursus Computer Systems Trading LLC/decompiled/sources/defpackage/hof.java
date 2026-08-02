package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hof {
    public static final mvn g = new mvn(26);
    public static final jyr h;
    public static final jyr i;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final hyn d;
    public final mqs e;
    public final int f;

    static {
        bdt I = hag.I(r1l.class);
        l18 l18Var = l18.b;
        h = l18Var.b(I, true);
        i = l18Var.b(hag.I(ay.class), true);
    }

    public hof(boolean z, boolean z2, boolean z3, hyn hynVar, mqs mqsVar, int i2) {
        mqsVar.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = hynVar;
        this.e = mqsVar;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hof)) {
            return false;
        }
        hof hofVar = (hof) obj;
        return this.a == hofVar.a && this.b == hofVar.b && this.c == hofVar.c && this.d == hofVar.d && Intrinsics.d(this.e, hofVar.e) && this.f == hofVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + k5r.c((this.d.hashCode() + k5r.e(k5r.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e.a);
    }

    public final String toString() {
        StringBuilder j = eta.j("LaunchedEntityInfo(resetShuffleRepeat=", this.a, ", shuffleEnabled=", this.b, ", exactPositionSpecified=");
        j.append(this.c);
        j.append(", repeatMode=");
        j.append(this.d);
        j.append(", startTrack=");
        j.append(this.e);
        j.append(", startTrackPosition=");
        j.append(this.f);
        j.append(")");
        return j.toString();
    }
}
