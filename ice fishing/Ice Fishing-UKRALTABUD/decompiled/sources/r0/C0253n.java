package r0;

import K0.InterfaceC0045v;
import java.util.List;

/* renamed from: r0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0253n extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public int f2898j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0238L f2899k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f2900l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0253n(C0238L c0238l, List list, v0.d dVar) {
        super(2, dVar);
        this.f2899k = c0238l;
        this.f2900l = list;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0253n) l((InterfaceC0045v) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new C0253n(this.f2899k, this.f2900l, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f2898j;
        if (i2 == 0) {
            o.g.C(obj);
            this.f2898j = 1;
            obj = C0238L.s(this.f2899k, this.f2900l, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.C(obj);
        }
        return obj;
    }
}
