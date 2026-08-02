package g8;

import D.G;
import u7.C5076b;
import u7.v;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class n extends B7.g implements I7.q, kotlin.jvm.internal.f {

    /* renamed from: n, reason: collision with root package name */
    public final int f37746n;

    /* renamed from: u, reason: collision with root package name */
    public int f37747u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ C5076b f37748v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ I1.a f37749w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(I1.a aVar, InterfaceC5240d interfaceC5240d) {
        super(interfaceC5240d);
        this.f37749w = aVar;
        this.f37746n = 3;
    }

    @Override // kotlin.jvm.internal.f
    public final int getArity() {
        return this.f37746n;
    }

    @Override // I7.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        n nVar = new n(this.f37749w, (InterfaceC5240d) obj3);
        nVar.f37748v = (C5076b) obj;
        return nVar.invokeSuspend(v.f41073a);
    }

    @Override // B7.a
    public final Object invokeSuspend(Object obj) {
        A7.a aVar = A7.a.f215n;
        int i = this.f37747u;
        if (i == 0) {
            Q3.b.s(obj);
            C5076b c5076b = this.f37748v;
            I1.a aVar2 = this.f37749w;
            G g9 = (G) aVar2.f1304v;
            byte r9 = g9.r();
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
                G.n(g9, "Can't begin reading element, unexpected token", 0, 6);
                throw null;
            }
            this.f37747u = 1;
            obj = I1.a.a(aVar2, c5076b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
        }
        return (f8.l) obj;
    }

    @Override // B7.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        kotlin.jvm.internal.s.f38645a.getClass();
        String a9 = kotlin.jvm.internal.t.a(this);
        kotlin.jvm.internal.h.d(a9, "renderLambdaToString(...)");
        return a9;
    }
}
