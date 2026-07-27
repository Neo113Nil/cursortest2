package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z7.InterfaceC5267d;

/* renamed from: X.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0412e extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public Iterator f3499n;

    /* renamed from: u, reason: collision with root package name */
    public Object f3500u;

    /* renamed from: v, reason: collision with root package name */
    public int f3501v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f3502w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f3503x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3504y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0412e(List list, ArrayList arrayList, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f3503x = list;
        this.f3504y = arrayList;
    }

    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        C0412e c0412e = new C0412e(this.f3503x, this.f3504y, interfaceC5267d);
        c0412e.f3502w = obj;
        return c0412e;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0412e) create(obj, (InterfaceC5267d) obj2)).invokeSuspend(u7.v.f41350a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        A7.a aVar = A7.a.f58n;
        int i = this.f3501v;
        if (i == 0) {
            com.bumptech.glide.d.k(obj);
            obj = this.f3502w;
            it = this.f3503x.iterator();
            list = this.f3504y;
        } else if (i == 1) {
            Object obj2 = this.f3500u;
            Iterator it2 = this.f3499n;
            List list2 = (List) this.f3502w;
            com.bumptech.glide.d.k(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0411d(1, null));
                this.f3502w = list2;
                this.f3499n = it2;
                this.f3500u = null;
                this.f3501v = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f3499n;
            list = (List) this.f3502w;
            com.bumptech.glide.d.k(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f3502w = list;
        this.f3499n = it;
        this.f3500u = obj;
        this.f3501v = 1;
        throw null;
    }
}
