package S0;

import D.y;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public String f2806a;

    /* renamed from: b, reason: collision with root package name */
    public int f2807b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.h.a(this.f2806a, oVar.f2806a) && this.f2807b == oVar.f2807b;
    }

    public final int hashCode() {
        return AbstractC5049e.d(this.f2807b) + (this.f2806a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f2806a + ", state=" + y.z(this.f2807b) + ')';
    }
}
