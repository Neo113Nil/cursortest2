package D;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: D.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0007h extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public Iterator f195j;

    /* renamed from: k, reason: collision with root package name */
    public Object f196k;

    /* renamed from: l, reason: collision with root package name */
    public int f197l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f198m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List f199n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ArrayList f200o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0007h(List list, ArrayList arrayList, v0.d dVar) {
        super(2, dVar);
        this.f199n = list;
        this.f200o = arrayList;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0007h) l(obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        C0007h c0007h = new C0007h(this.f199n, this.f200o, dVar);
        c0007h.f198m = obj;
        return c0007h;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        Iterator it;
        List list;
        int i2 = this.f197l;
        if (i2 == 0) {
            o.g.C(obj);
            obj = this.f198m;
            it = this.f199n.iterator();
            list = this.f200o;
        } else if (i2 == 1) {
            Object obj2 = this.f196k;
            Iterator it2 = this.f195j;
            List list2 = (List) this.f198m;
            o.g.C(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0006g(1, null));
                this.f198m = list2;
                this.f195j = it2;
                this.f196k = null;
                this.f197l = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f195j;
            list = (List) this.f198m;
            o.g.C(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f198m = list;
        this.f195j = it;
        this.f196k = obj;
        this.f197l = 1;
        throw null;
    }
}
