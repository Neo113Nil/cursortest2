package D;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t0.C0252g;

/* renamed from: D.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0007h extends x0.f implements D0.p {

    /* renamed from: i, reason: collision with root package name */
    public Iterator f195i;

    /* renamed from: j, reason: collision with root package name */
    public Object f196j;

    /* renamed from: k, reason: collision with root package name */
    public int f197k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f198l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f199m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f200n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0007h(List list, ArrayList arrayList, v0.d dVar) {
        super(2, dVar);
        this.f199m = list;
        this.f200n = arrayList;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0007h) l(obj, (v0.d) obj2)).n(C0252g.f2994a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        C0007h c0007h = new C0007h(this.f199m, this.f200n, dVar);
        c0007h.f198l = obj;
        return c0007h;
    }

    @Override // x0.b
    public final Object n(Object obj) {
        Iterator it;
        List list;
        int i2 = this.f197k;
        if (i2 == 0) {
            o.g.z(obj);
            obj = this.f198l;
            it = this.f199m.iterator();
            list = this.f200n;
        } else if (i2 == 1) {
            Object obj2 = this.f196j;
            Iterator it2 = this.f195i;
            List list2 = (List) this.f198l;
            o.g.z(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0006g(1, null));
                this.f198l = list2;
                this.f195i = it2;
                this.f196j = null;
                this.f197k = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f195i;
            list = (List) this.f198l;
            o.g.z(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f198l = list;
        this.f195i = it;
        this.f196j = obj;
        this.f197k = 1;
        throw null;
    }
}
