package r0;

import L0.InterfaceC0063v;
import android.content.Context;
import t0.C0252g;

/* loaded from: classes.dex */
public final class B extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public int f2833i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f2834j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ J f2835k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f2836l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(String str, J j2, boolean z2, v0.d dVar) {
        super(2, dVar);
        this.f2834j = str;
        this.f2835k = j2;
        this.f2836l = z2;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((B) l((InterfaceC0063v) obj, (v0.d) obj2)).n(C0252g.f2994a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new B(this.f2834j, this.f2835k, this.f2836l, dVar);
    }

    @Override // x0.b
    public final Object n(Object obj) {
        w0.a aVar = w0.a.f3076e;
        int i2 = this.f2833i;
        if (i2 == 0) {
            o.g.z(obj);
            G.d dVar = new G.d(this.f2834j);
            Context context = this.f2835k.f2863e;
            if (context == null) {
                E0.i.g("context");
                throw null;
            }
            A.j a2 = K.a(context);
            A a3 = new A(dVar, this.f2836l, null);
            this.f2833i = 1;
            if (a2.o(new G.h(a3, null), this) == aVar) {
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
