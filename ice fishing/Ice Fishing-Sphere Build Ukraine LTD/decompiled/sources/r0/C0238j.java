package r0;

import L0.InterfaceC0063v;
import android.content.Context;
import java.util.List;
import t0.C0252g;

/* renamed from: r0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0238j extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f2891i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ J f2892j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f2893k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0238j(J j2, List list, v0.d dVar) {
        super(2, dVar);
        this.f2892j = j2;
        this.f2893k = list;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0238j) l((InterfaceC0063v) obj, (v0.d) obj2)).n(C0252g.f2994a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new C0238j(this.f2892j, this.f2893k, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3076e;
        int i2 = this.f2891i;
        if (i2 == 0) {
            o.g.z(obj);
            Context context = this.f2892j.f2863e;
            if (context == null) {
                E0.i.g("context");
                throw null;
            }
            A.j a2 = K.a(context);
            C0237i c0237i = new C0237i(this.f2893k, null);
            this.f2891i = 1;
            obj = a2.o(new G.h(c0237i, null), this);
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
