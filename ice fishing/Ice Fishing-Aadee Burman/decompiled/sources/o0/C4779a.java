package o0;

import B7.h;
import I7.p;
import S7.InterfaceC0404w;
import com.bumptech.glide.d;
import q0.AbstractC4866f;
import q0.C4861a;
import u7.v;
import z7.InterfaceC5267d;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4779a extends h implements p {

    /* renamed from: n, reason: collision with root package name */
    public int f39543n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4780b f39544u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C4861a f39545v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4779a(C4780b c4780b, C4861a c4861a, InterfaceC5267d interfaceC5267d) {
        super(2, interfaceC5267d);
        this.f39544u = c4780b;
        this.f39545v = c4861a;
    }

    @Override // B7.a
    public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
        return new C4779a(this.f39544u, this.f39545v, interfaceC5267d);
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4779a) create((InterfaceC0404w) obj, (InterfaceC5267d) obj2)).invokeSuspend(v.f41350a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f58n;
        int i = this.f39543n;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.k(obj);
            return obj;
        }
        d.k(obj);
        AbstractC4866f abstractC4866f = this.f39544u.f39546a;
        this.f39543n = 1;
        Object b9 = abstractC4866f.b(this.f39545v, this);
        return b9 == aVar ? aVar : b9;
    }
}
