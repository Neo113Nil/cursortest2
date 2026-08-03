package h1;

import f1.o;
import pc.j;
import s2.l;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public s2.c f2591a;

    /* renamed from: b, reason: collision with root package name */
    public l f2592b;

    /* renamed from: c, reason: collision with root package name */
    public o f2593c;

    /* renamed from: d, reason: collision with root package name */
    public long f2594d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f2591a, aVar.f2591a) && this.f2592b == aVar.f2592b && j.a(this.f2593c, aVar.f2593c) && e1.e.a(this.f2594d, aVar.f2594d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f2594d) + ((this.f2593c.hashCode() + ((this.f2592b.hashCode() + (this.f2591a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f2591a + ", layoutDirection=" + this.f2592b + ", canvas=" + this.f2593c + ", size=" + ((Object) e1.e.f(this.f2594d)) + ')';
    }
}
