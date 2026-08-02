package X;

import z7.InterfaceC5240d;

/* renamed from: X.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0415d extends B7.h implements I7.l {

    /* renamed from: n, reason: collision with root package name */
    public int f3660n;

    @Override // B7.a
    public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
        return new C0415d(1, interfaceC5240d);
    }

    @Override // I7.l
    public final Object invoke(Object obj) {
        C0415d c0415d = (C0415d) create((InterfaceC5240d) obj);
        u7.v vVar = u7.v.f41073a;
        c0415d.invokeSuspend(vVar);
        return vVar;
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f215n;
        int i = this.f3660n;
        if (i == 0) {
            Q3.b.s(obj);
            this.f3660n = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Q3.b.s(obj);
        return u7.v.f41073a;
    }
}
