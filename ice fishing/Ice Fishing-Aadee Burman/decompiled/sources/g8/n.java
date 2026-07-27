package g8;

import D.H;
import u7.C5084b;
import u7.v;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class n extends B7.g implements I7.q, kotlin.jvm.internal.f {

    /* renamed from: n, reason: collision with root package name */
    public final int f37721n;

    /* renamed from: u, reason: collision with root package name */
    public int f37722u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ C5084b f37723v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ G1.a f37724w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(G1.a aVar, InterfaceC5267d interfaceC5267d) {
        super(interfaceC5267d);
        this.f37724w = aVar;
        this.f37721n = 3;
    }

    @Override // kotlin.jvm.internal.f
    public final int getArity() {
        return this.f37721n;
    }

    @Override // I7.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        n nVar = new n(this.f37724w, (InterfaceC5267d) obj3);
        nVar.f37723v = (C5084b) obj;
        return nVar.invokeSuspend(v.f41350a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f58n;
        int i = this.f37722u;
        if (i == 0) {
            com.bumptech.glide.d.k(obj);
            C5084b c5084b = this.f37723v;
            G1.a aVar2 = this.f37724w;
            H h9 = (H) aVar2.f1051v;
            byte r9 = h9.r();
            if (r9 == 1) {
                return aVar2.l(true);
            }
            if (r9 == 0) {
                return aVar2.l(false);
            }
            if (r9 != 6) {
                if (r9 == 8) {
                    return aVar2.k();
                }
                H.m(h9, "Can't begin reading element, unexpected token", 0, 6);
                throw null;
            }
            this.f37722u = 1;
            obj = G1.a.b(aVar2, c5084b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
        }
        return (f8.l) obj;
    }

    @Override // B7.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        kotlin.jvm.internal.s.f38718a.getClass();
        String a9 = kotlin.jvm.internal.t.a(this);
        kotlin.jvm.internal.h.d(a9, "renderLambdaToString(...)");
        return a9;
    }
}
