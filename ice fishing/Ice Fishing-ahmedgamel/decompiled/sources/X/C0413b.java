package X;

import java.util.List;
import z7.InterfaceC5240d;

/* renamed from: X.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0413b extends B7.h implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public int f3653n;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f3654u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ List f3655v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0413b(List list, InterfaceC5240d interfaceC5240d) {
        super(2, interfaceC5240d);
        this.f3655v = list;
    }

    @Override // B7.a
    public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
        C0413b c0413b = new C0413b(this.f3655v, interfaceC5240d);
        c0413b.f3654u = obj;
        return c0413b;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0413b) create((v) obj, (InterfaceC5240d) obj2)).invokeSuspend(u7.v.f41073a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f215n;
        int i = this.f3653n;
        if (i == 0) {
            Q3.b.s(obj);
            v vVar = (v) this.f3654u;
            this.f3653n = 1;
            if (Q3.b.a(this.f3655v, vVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
        }
        return u7.v.f41073a;
    }
}
