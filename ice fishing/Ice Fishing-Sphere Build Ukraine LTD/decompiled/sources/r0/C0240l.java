package r0;

import L0.InterfaceC0063v;
import java.util.List;
import t0.C0252g;

/* renamed from: r0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0240l extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f2897i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ J f2898j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f2899k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0240l(J j2, List list, v0.d dVar) {
        super(2, dVar);
        this.f2898j = j2;
        this.f2899k = list;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0240l) l((InterfaceC0063v) obj, (v0.d) obj2)).n(C0252g.f2994a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new C0240l(this.f2898j, this.f2899k, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3076e;
        int i2 = this.f2897i;
        if (i2 == 0) {
            o.g.z(obj);
            this.f2897i = 1;
            obj = J.s(this.f2898j, this.f2899k, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.z(obj);
        }
        return obj;
    }
}
