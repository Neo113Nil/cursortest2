package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k3k extends aur implements Function2 {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ o3k l;
    public final /* synthetic */ int m;
    public final /* synthetic */ float n;
    public final /* synthetic */ tm0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3k(o3k o3kVar, int i, float f, tm0 tm0Var, Continuation continuation) {
        super(2, continuation);
        this.l = o3kVar;
        this.m = i;
        this.n = f;
        this.o = tm0Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        k3k k3kVar = new k3k(this.l, this.m, this.n, this.o, continuation);
        k3kVar.k = obj;
        return k3kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k3k) create((rwo) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object obj2 = nm6.a;
        int i = this.j;
        int i2 = 1;
        if (i == 0) {
            qgg.h0(obj);
            rwo rwoVar = (rwo) this.k;
            o3k o3kVar = this.l;
            dvf dvfVar = new dvf(rwoVar, o3kVar, i2);
            y5 y5Var = new y5(23, o3kVar);
            this.j = 1;
            float f = r3k.a;
            int i3 = this.m;
            y5Var.invoke(dvfVar, new Integer(i3));
            boolean z = i3 > o3kVar.e;
            int e = (dvfVar.e() - o3kVar.e) + 1;
            if (((z && i3 > dvfVar.e()) || (!z && i3 < o3kVar.e)) && Math.abs(i3 - o3kVar.e) >= 3) {
                int i4 = o3kVar.e;
                if (z) {
                    int i5 = i3 - e;
                    if (i5 >= i4) {
                        i4 = i5;
                    }
                } else {
                    int i6 = e + i3;
                    if (i6 <= i4) {
                        i4 = i6;
                    }
                }
                dvfVar.f(i4, 0);
            }
            Object p = v5g.p(0.0f, dvfVar.b(i3) + this.n, this.o, new qtf(7, new uqn(), dvfVar), this, 4);
            if (p != obj2) {
                p = Unit.a;
            }
            if (p == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }
}
