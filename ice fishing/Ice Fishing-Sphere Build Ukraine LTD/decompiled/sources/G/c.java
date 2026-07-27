package G;

import D0.p;
import E0.i;
import java.util.concurrent.atomic.AtomicBoolean;
import t0.C0252g;

/* loaded from: classes.dex */
public final class c extends x0.f implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f331i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f332j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0.f f333k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar, v0.d dVar) {
        super(2, dVar);
        this.f333k = (x0.f) pVar;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((c) l((b) obj, (v0.d) obj2)).n(C0252g.f2994a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [D0.p, x0.f] */
    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        c cVar = new c(this.f333k, dVar);
        cVar.f332j = obj;
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [D0.p, x0.f] */
    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3076e;
        int i2 = this.f331i;
        if (i2 == 0) {
            o.g.z(obj);
            b bVar = (b) this.f332j;
            this.f331i = 1;
            obj = this.f333k.f(bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.z(obj);
        }
        b bVar2 = (b) obj;
        i.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((AtomicBoolean) bVar2.f330b.f30f).set(true);
        return bVar2;
    }
}
