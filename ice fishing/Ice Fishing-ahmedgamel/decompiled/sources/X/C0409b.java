package X;

import java.util.List;
import z7.InterfaceC5267d;

/* renamed from: X.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0409b extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f3491n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3492u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ List f3493v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0409b(List list, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f3493v = list;
    }

    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        C0409b c0409b = new C0409b(this.f3493v, interfaceC5267d);
        c0409b.f3492u = obj;
        return c0409b;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0409b) create((v) obj, (InterfaceC5267d) obj2)).invokeSuspend(u7.v.f41353a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f58n;
        int i = this.f3491n;
        if (i == 0) {
            com.bumptech.glide.d.k(obj);
            v vVar = (v) this.f3492u;
            this.f3491n = 1;
            if (L3.F.a(this.f3493v, vVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
        }
        return u7.v.f41353a;
    }
}
