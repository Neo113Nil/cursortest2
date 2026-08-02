package defpackage;

import java.util.Calendar;

/* loaded from: classes12.dex */
public final class y1n implements a2n {
    public final boolean a;
    public final Calendar b;

    public y1n(Calendar calendar, boolean z) {
        this.a = z;
        this.b = calendar;
    }

    @Override // defpackage.a2n
    public final Calendar a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1n)) {
            return false;
        }
        y1n y1nVar = (y1n) obj;
        return this.a == y1nVar.a && jl40.l(this.b, y1nVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
