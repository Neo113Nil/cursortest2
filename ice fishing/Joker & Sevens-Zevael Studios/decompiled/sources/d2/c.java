package d2;

import ac.o;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public int f1632g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ float f1633h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f1634i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, fc.d dVar2) {
        super(2, dVar2);
        this.f1634i = dVar;
    }

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        c cVar = new c(this.f1634i, dVar);
        cVar.f1633h = ((Number) obj).floatValue();
        return cVar;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create(Float.valueOf(((Number) obj).floatValue()), (fc.d) obj2)).invokeSuspend(o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f1632g;
        if (i10 == 0) {
            v6.a.W(obj);
            float f10 = this.f1633h;
            d dVar = this.f1634i;
            Object g8 = dVar.f1635a.f1996d.f1985g.g(e2.i.f1963e);
            if (g8 == null) {
                g8 = null;
            }
            oc.e eVar = (oc.e) g8;
            if (eVar == null) {
                throw a4.d.e("Required value was null.");
            }
            e1.b bVar = new e1.b((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
            this.f1632g = 1;
            obj = eVar.invoke(bVar, this);
            gc.a aVar = gc.a.f2559g;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
        }
        return new Float(Float.intBitsToFloat((int) (((e1.b) obj).f1929a & 4294967295L)));
    }
}
