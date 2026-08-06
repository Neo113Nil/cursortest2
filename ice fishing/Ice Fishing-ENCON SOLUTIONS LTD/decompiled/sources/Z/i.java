package Z;

import C1.r;
import P0.q;
import a0.InterfaceC0084a;
import android.app.Activity;
import h1.C0239i;
import m1.EnumC0985a;
import n1.AbstractC0995f;
import t1.p;

/* loaded from: classes.dex */
public final class i extends AbstractC0995f implements p {

    /* renamed from: e, reason: collision with root package name */
    public int f1943e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f1944f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b f1945g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Activity f1946h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b bVar, Activity activity, l1.d dVar) {
        super(2, dVar);
        this.f1945g = bVar;
        this.f1946h = activity;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        i iVar = new i(this.f1945g, this.f1946h, dVar);
        iVar.f1944f = obj;
        return iVar;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i2 = this.f1943e;
        if (i2 == 0) {
            R1.l.F(obj);
            r rVar = (r) this.f1944f;
            q qVar = new q(1, rVar);
            b bVar = this.f1945g;
            ((InterfaceC0084a) bVar.f1929b).b(this.f1946h, new N.c(), qVar);
            H.b bVar2 = new H.b(1, bVar, qVar);
            this.f1943e = 1;
            if (C1.j.b(rVar, bVar2, this) == enumC0985a) {
                return enumC0985a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.l.F(obj);
        }
        return C0239i.f3393a;
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) b((r) obj, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
