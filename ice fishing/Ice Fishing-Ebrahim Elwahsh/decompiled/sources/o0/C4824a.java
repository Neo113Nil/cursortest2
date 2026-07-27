package o0;

import E7.p;
import O7.InterfaceC0397w;
import com.bumptech.glide.f;
import q0.AbstractC4871f;
import q0.C4866a;
import q7.v;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.h;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4824a extends h implements p {

    /* renamed from: n, reason: collision with root package name */
    public int f39674n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C4825b f39675u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C4866a f39676v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4824a(C4825b c4825b, C4866a c4866a, InterfaceC5133d interfaceC5133d) {
        super(2, interfaceC5133d);
        this.f39675u = c4825b;
        this.f39676v = c4866a;
    }

    @Override // x7.AbstractC5217a
    public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
        return new C4824a(this.f39675u, this.f39676v, interfaceC5133d);
    }

    @Override // E7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4824a) create((InterfaceC0397w) obj, (InterfaceC5133d) obj2)).invokeSuspend(v.f40183a);
    }

    @Override // x7.AbstractC5217a
    public final Object invokeSuspend(Object obj) {
        EnumC5179a enumC5179a = EnumC5179a.f41704n;
        int i = this.f39674n;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.r(obj);
            return obj;
        }
        f.r(obj);
        AbstractC4871f abstractC4871f = this.f39675u.f39677a;
        this.f39674n = 1;
        Object b9 = abstractC4871f.b(this.f39676v, this);
        return b9 == enumC5179a ? enumC5179a : b9;
    }
}
