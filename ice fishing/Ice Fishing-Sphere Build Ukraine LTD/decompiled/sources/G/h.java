package G;

import D0.p;
import java.util.LinkedHashMap;
import t0.C0252g;

/* loaded from: classes.dex */
public final class h extends x0.f implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f337i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f338j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0.f f339k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(p pVar, v0.d dVar) {
        super(2, dVar);
        this.f339k = (x0.f) pVar;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((h) l((b) obj, (v0.d) obj2)).n(C0252g.f2994a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [D0.p, x0.f] */
    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        h hVar = new h(this.f339k, dVar);
        hVar.f338j = obj;
        return hVar;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [D0.p, x0.f] */
    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3076e;
        int i2 = this.f337i;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) this.f338j;
            o.g.z(obj);
            return bVar;
        }
        o.g.z(obj);
        b bVar2 = new b(new LinkedHashMap(((b) this.f338j).a()), false);
        this.f338j = bVar2;
        this.f337i = 1;
        return this.f339k.f(bVar2, this) == aVar ? aVar : bVar2;
    }
}
