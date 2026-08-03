package ac;

import java.io.Serializable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p implements f, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public oc.a f278g;

    /* renamed from: h, reason: collision with root package name */
    public Object f279h;

    @Override // ac.f
    public final Object getValue() {
        if (this.f279h == n.f276a) {
            oc.a aVar = this.f278g;
            pc.j.b(aVar);
            this.f279h = aVar.invoke();
            this.f278g = null;
        }
        return this.f279h;
    }

    public final String toString() {
        return this.f279h != n.f276a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
