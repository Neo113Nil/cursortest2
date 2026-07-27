package D;

import a.AbstractC0069a;
import java.util.List;

/* renamed from: D.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004e extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public int f177j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f178k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f179l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0004e(List list, v0.d dVar) {
        super(2, dVar);
        this.f179l = list;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0004e) l((C0011l) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        C0004e c0004e = new C0004e(this.f179l, dVar);
        c0004e.f178k = obj;
        return c0004e;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f177j;
        if (i2 == 0) {
            o.g.C(obj);
            C0011l c0011l = (C0011l) this.f178k;
            this.f177j = 1;
            if (AbstractC0069a.a(this.f179l, c0011l, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.C(obj);
        }
        return t0.g.f2989a;
    }
}
