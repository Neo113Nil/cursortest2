package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z7.InterfaceC5240d;

/* renamed from: X.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0416e extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public Iterator f3661n;

    /* renamed from: u, reason: collision with root package name */
    public Object f3662u;

    /* renamed from: v, reason: collision with root package name */
    public int f3663v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f3664w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f3665x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3666y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0416e(List list, ArrayList arrayList, InterfaceC5240d interfaceC5240d) {
        super(2, interfaceC5240d);
        this.f3665x = list;
        this.f3666y = arrayList;
    }

    @Override // B7.a
    public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
        C0416e c0416e = new C0416e(this.f3665x, this.f3666y, interfaceC5240d);
        c0416e.f3664w = obj;
        return c0416e;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0416e) create(obj, (InterfaceC5240d) obj2)).invokeSuspend(u7.v.f41073a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        A7.a aVar = A7.a.f215n;
        int i = this.f3663v;
        if (i == 0) {
            Q3.b.s(obj);
            obj = this.f3664w;
            it = this.f3665x.iterator();
            list = this.f3666y;
        } else if (i == 1) {
            Object obj2 = this.f3662u;
            Iterator it2 = this.f3661n;
            List list2 = (List) this.f3664w;
            Q3.b.s(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0415d(1, null));
                this.f3664w = list2;
                this.f3661n = it2;
                this.f3662u = null;
                this.f3663v = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f3661n;
            list = (List) this.f3664w;
            Q3.b.s(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f3664w = list;
        this.f3661n = it;
        this.f3662u = obj;
        this.f3663v = 1;
        throw null;
    }
}
