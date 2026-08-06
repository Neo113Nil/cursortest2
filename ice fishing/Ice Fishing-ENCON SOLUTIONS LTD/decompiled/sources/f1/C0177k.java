package f1;

import h1.C0239i;
import java.util.List;
import n1.AbstractC0995f;

/* renamed from: f1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177k extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f2938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f2939f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0177k(List list, l1.d dVar) {
        super(2, dVar);
        this.f2939f = list;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        C0177k c0177k = new C0177k(this.f2939f, dVar);
        c0177k.f2938e = obj;
        return c0177k;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        R1.l.F(obj);
        I.b bVar = (I.b) this.f2938e;
        List<String> list = this.f2939f;
        if (list != null) {
            for (String name : list) {
                kotlin.jvm.internal.i.e(name, "name");
                I.d dVar = new I.d(name);
                bVar.b();
                bVar.f707a.remove(dVar);
            }
        } else {
            bVar.b();
            bVar.f707a.clear();
        }
        return C0239i.f3393a;
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        C0177k c0177k = (C0177k) b((I.b) obj, (l1.d) obj2);
        C0239i c0239i = C0239i.f3393a;
        c0177k.g(c0239i);
        return c0239i;
    }
}
