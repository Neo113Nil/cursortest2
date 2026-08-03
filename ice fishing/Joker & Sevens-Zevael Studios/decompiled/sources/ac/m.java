package ac;

import java.io.Serializable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m implements f, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public oc.a f273g;

    /* renamed from: h, reason: collision with root package name */
    public volatile Object f274h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f275i;

    public m(oc.a aVar) {
        pc.j.e(aVar, "initializer");
        this.f273g = aVar;
        this.f274h = n.f276a;
        this.f275i = this;
    }

    @Override // ac.f
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f274h;
        n nVar = n.f276a;
        if (obj2 != nVar) {
            return obj2;
        }
        synchronized (this.f275i) {
            obj = this.f274h;
            if (obj == nVar) {
                oc.a aVar = this.f273g;
                pc.j.b(aVar);
                obj = aVar.invoke();
                this.f274h = obj;
                this.f273g = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f274h != n.f276a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
