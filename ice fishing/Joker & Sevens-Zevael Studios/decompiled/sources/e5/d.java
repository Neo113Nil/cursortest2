package e5;

import ac.o;
import hc.j;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2115g;

    /* renamed from: h, reason: collision with root package name */
    public int f2116h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c5.b f2117i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(c5.b bVar, fc.d dVar, int i10) {
        super(2, dVar);
        this.f2115g = i10;
        this.f2117i = bVar;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        switch (this.f2115g) {
            case 0:
                return new d(this.f2117i, dVar, 0);
            default:
                return new d(this.f2117i, dVar, 1);
        }
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        y yVar = (y) obj;
        fc.d dVar = (fc.d) obj2;
        switch (this.f2115g) {
        }
        return ((d) create(yVar, dVar)).invokeSuspend(o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2115g) {
            case 0:
                int i10 = this.f2116h;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return obj;
                }
                v6.a.W(obj);
                this.f2116h = 1;
                c5.b bVar = this.f2117i;
                Object obj2 = bVar.a(new c5.a(bVar, 1)).f2315b;
                gc.a aVar = gc.a.f2559g;
                return obj2 == aVar ? aVar : obj2;
            default:
                int i11 = this.f2116h;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return obj;
                }
                v6.a.W(obj);
                this.f2116h = 1;
                c5.b bVar2 = this.f2117i;
                Object obj3 = bVar2.a(new c5.a(bVar2, 2)).f2315b;
                gc.a aVar2 = gc.a.f2559g;
                return obj3 == aVar2 ? aVar2 : obj3;
        }
    }
}
