package X;

import z7.InterfaceC5267d;

/* renamed from: X.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0411d extends B7.h implements I7.l {

    /* renamed from: n, reason: collision with root package name */
    public int f3498n;

    @Override // B7.a
    public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
        return new C0411d(1, interfaceC5267d);
    }

    @Override // I7.l
    public final Object invoke(Object obj) {
        C0411d c0411d = (C0411d) create((InterfaceC5267d) obj);
        u7.v vVar = u7.v.f41350a;
        c0411d.invokeSuspend(vVar);
        return vVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f58n;
        int i = this.f3498n;
        if (i == 0) {
            com.bumptech.glide.d.k(obj);
            this.f3498n = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.bumptech.glide.d.k(obj);
        return u7.v.f41350a;
    }
}
