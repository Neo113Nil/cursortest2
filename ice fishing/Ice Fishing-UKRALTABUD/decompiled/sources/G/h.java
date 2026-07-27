package G;

import D0.p;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class h extends x0.f implements p {

    /* renamed from: j, reason: collision with root package name */
    public int f336j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f337k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0.f f338l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(p pVar, v0.d dVar) {
        super(2, dVar);
        this.f338l = (x0.f) pVar;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((h) l((b) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [D0.p, x0.f] */
    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        h hVar = new h(this.f338l, dVar);
        hVar.f337k = obj;
        return hVar;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [D0.p, x0.f] */
    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f336j;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) this.f337k;
            o.g.C(obj);
            return bVar;
        }
        o.g.C(obj);
        b bVar2 = new b(new LinkedHashMap(((b) this.f337k).a()), false);
        this.f337k = bVar2;
        this.f336j = 1;
        return this.f338l.f(bVar2, this) == aVar ? aVar : bVar2;
    }
}
