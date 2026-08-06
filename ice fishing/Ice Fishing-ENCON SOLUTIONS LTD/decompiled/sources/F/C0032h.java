package F;

import h1.C0239i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n1.AbstractC0995f;

/* renamed from: F.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032h extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public Iterator f490e;

    /* renamed from: f, reason: collision with root package name */
    public Object f491f;

    /* renamed from: g, reason: collision with root package name */
    public int f492g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f493h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f494i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ArrayList f495j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0032h(List list, ArrayList arrayList, l1.d dVar) {
        super(2, dVar);
        this.f494i = list;
        this.f495j = arrayList;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        C0032h c0032h = new C0032h(this.f494i, this.f495j, dVar);
        c0032h.f493h = obj;
        return c0032h;
    }

    @Override // n1.AbstractC0991b
    public final Object g(Object obj) {
        Iterator it;
        List list;
        int i2 = this.f492g;
        if (i2 == 0) {
            R1.l.F(obj);
            obj = this.f493h;
            it = this.f494i.iterator();
            list = this.f495j;
        } else if (i2 == 1) {
            Object obj2 = this.f491f;
            Iterator it2 = this.f490e;
            List list2 = (List) this.f493h;
            R1.l.F(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0031g(1, null));
                this.f493h = list2;
                this.f490e = it2;
                this.f491f = null;
                this.f492g = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f490e;
            list = (List) this.f493h;
            R1.l.F(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f493h = list;
        this.f490e = it;
        this.f491f = obj;
        this.f492g = 1;
        throw null;
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0032h) b(obj, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
