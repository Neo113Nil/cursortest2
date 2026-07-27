package D;

import a.AbstractC0069a;
import java.util.List;
import t0.C0252g;

/* renamed from: D.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004e extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f177i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f178j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f179k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0004e(List list, v0.d dVar) {
        super(2, dVar);
        this.f179k = list;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0004e) l((C0011l) obj, (v0.d) obj2)).n(C0252g.f2994a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        C0004e c0004e = new C0004e(this.f179k, dVar);
        c0004e.f178j = obj;
        return c0004e;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3076e;
        int i2 = this.f177i;
        if (i2 == 0) {
            o.g.z(obj);
            C0011l c0011l = (C0011l) this.f178j;
            this.f177i = 1;
            if (AbstractC0069a.a(this.f179k, c0011l, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.z(obj);
        }
        return C0252g.f2994a;
    }
}
