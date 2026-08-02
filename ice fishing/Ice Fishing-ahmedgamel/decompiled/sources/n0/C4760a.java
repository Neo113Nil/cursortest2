package n0;

import B7.h;
import I7.p;
import S7.InterfaceC0408w;
import p0.C4828c;
import u7.v;
import z7.InterfaceC5240d;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4760a extends h implements p {

    /* renamed from: n, reason: collision with root package name */
    public int f39609n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4763d f39610u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4760a(C4763d c4763d, InterfaceC5240d interfaceC5240d) {
        super(2, interfaceC5240d);
        this.f39610u = c4763d;
    }

    @Override // B7.a
    public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
        return new C4760a(this.f39610u, interfaceC5240d);
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4760a) create((InterfaceC0408w) obj, (InterfaceC5240d) obj2)).invokeSuspend(v.f41073a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f215n;
        int i = this.f39609n;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            return obj;
        }
        Q3.b.s(obj);
        C4828c c4828c = this.f39610u.f39618a;
        this.f39609n = 1;
        Object b9 = c4828c.b(this);
        return b9 == aVar ? aVar : b9;
    }
}
