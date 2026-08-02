package S0;

import D.x;
import u.AbstractC5050e;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public String f2935a;

    /* renamed from: b, reason: collision with root package name */
    public int f2936b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.h.a(this.f2935a, oVar.f2935a) && this.f2936b == oVar.f2936b;
    }

    public final int hashCode() {
        return AbstractC5050e.d(this.f2936b) + (this.f2935a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.f2935a + ", state=" + x.z(this.f2936b) + ')';
    }
}
