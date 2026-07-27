package r0;

import K0.InterfaceC0045v;
import android.content.Context;
import java.util.List;

/* renamed from: r0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0251l extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public int f2892j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0238L f2893k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f2894l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0251l(C0238L c0238l, List list, v0.d dVar) {
        super(2, dVar);
        this.f2893k = c0238l;
        this.f2894l = list;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0251l) l((InterfaceC0045v) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new C0251l(this.f2893k, this.f2894l, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f2892j;
        if (i2 == 0) {
            o.g.C(obj);
            Context context = this.f2893k.f2861f;
            if (context == null) {
                E0.i.g("context");
                throw null;
            }
            A.j a2 = AbstractC0239M.a(context);
            C0250k c0250k = new C0250k(this.f2894l, null);
            this.f2892j = 1;
            obj = a2.o(new G.h(c0250k, null), this);
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
