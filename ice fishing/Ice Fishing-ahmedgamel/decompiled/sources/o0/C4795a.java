package o0;

import B7.h;
import I7.p;
import S7.InterfaceC0408w;
import q0.AbstractC4866f;
import q0.C4861a;
import u7.v;
import z7.InterfaceC5240d;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4795a extends h implements p {

    /* renamed from: n, reason: collision with root package name */
    public int f39710n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4796b f39711u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C4861a f39712v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4795a(C4796b c4796b, C4861a c4861a, InterfaceC5240d interfaceC5240d) {
        super(2, interfaceC5240d);
        this.f39711u = c4796b;
        this.f39712v = c4861a;
    }

    @Override // B7.a
    public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
        return new C4795a(this.f39711u, this.f39712v, interfaceC5240d);
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4795a) create((InterfaceC0408w) obj, (InterfaceC5240d) obj2)).invokeSuspend(v.f41073a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f215n;
        int i = this.f39710n;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            return obj;
        }
        Q3.b.s(obj);
        AbstractC4866f abstractC4866f = this.f39711u.f39713a;
        this.f39710n = 1;
        Object b9 = abstractC4866f.b(this.f39712v, this);
        return b9 == aVar ? aVar : b9;
    }
}
