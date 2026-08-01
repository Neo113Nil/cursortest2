package n0;

import B7.h;
import I7.p;
import S7.InterfaceC0404w;
import p0.C4824c;
import u7.v;
import z7.InterfaceC5267d;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4746a extends h implements p {

    /* renamed from: n, reason: collision with root package name */
    public int f39450n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4749d f39451u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4746a(C4749d c4749d, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f39451u = c4749d;
    }

    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        return new C4746a(this.f39451u, interfaceC5267d);
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4746a) create((InterfaceC0404w) obj, (InterfaceC5267d) obj2)).invokeSuspend(v.f41353a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f58n;
        int i = this.f39450n;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            return obj;
        }
        com.bumptech.glide.d.k(obj);
        C4824c c4824c = this.f39451u.f39459a;
        this.f39450n = 1;
        Object b9 = c4824c.b(this);
        return b9 == aVar ? aVar : b9;
    }
}
