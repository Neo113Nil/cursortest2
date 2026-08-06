package I;

import R1.l;
import h1.C0239i;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.i;
import m1.EnumC0985a;
import n1.AbstractC0995f;
import t1.p;

/* loaded from: classes.dex */
public final class c extends AbstractC0995f implements p {

    /* renamed from: e, reason: collision with root package name */
    public int f709e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f710f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0995f f711g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar, l1.d dVar) {
        super(2, dVar);
        this.f711g = (AbstractC0995f) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [n1.f, t1.p] */
    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        c cVar = new c(this.f711g, dVar);
        cVar.f710f = obj;
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [n1.f, t1.p] */
    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i2 = this.f709e;
        if (i2 == 0) {
            l.F(obj);
            b bVar = (b) this.f710f;
            this.f709e = 1;
            obj = this.f711g.invoke(bVar, this);
            if (obj == enumC0985a) {
                return enumC0985a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.F(obj);
        }
        b bVar2 = (b) obj;
        i.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((AtomicBoolean) bVar2.f708b.f124b).set(true);
        return bVar2;
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) b((b) obj, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
