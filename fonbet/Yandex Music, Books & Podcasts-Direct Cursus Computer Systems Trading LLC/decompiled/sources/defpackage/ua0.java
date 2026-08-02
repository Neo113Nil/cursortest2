package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class ua0 extends aur implements ryc {
    public int j;
    public /* synthetic */ ca0 k;
    public /* synthetic */ ml7 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ja0 n;
    public final /* synthetic */ float o;
    public final /* synthetic */ tm0 p;
    public final /* synthetic */ uqn q;
    public final /* synthetic */ uf7 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua0(ja0 ja0Var, float f, tm0 tm0Var, uqn uqnVar, uf7 uf7Var, Continuation continuation) {
        super(4, continuation);
        this.n = ja0Var;
        this.o = f;
        this.p = tm0Var;
        this.q = uqnVar;
        this.r = uf7Var;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        uqn uqnVar = this.q;
        uf7 uf7Var = this.r;
        ua0 ua0Var = new ua0(this.n, this.o, this.p, uqnVar, uf7Var, (Continuation) obj4);
        ua0Var.k = (ca0) obj;
        ua0Var.l = (ml7) obj2;
        ua0Var.m = obj3;
        return ua0Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
    
        if (com.yandex.music.core.ui.compose.draggable.a.c(r14.n, r1, r2, r3, r4, r14.p, r14) == r7) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
    
        if (defpackage.v5g.q(r1, r6, false, r3, r14) == r7) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
    
        if (com.yandex.music.core.ui.compose.draggable.a.c(r14.n, r1, r2, r3, r4, r14.p, r14) == r7) goto L42;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ca0 ca0Var = this.k;
        ml7 ml7Var = this.l;
        Object obj2 = this.m;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        uqn uqnVar = this.q;
        if (i == 0) {
            qgg.h0(obj);
            float d = ml7Var.d(obj2);
            if (!Float.isNaN(d)) {
                uqn uqnVar2 = new uqn();
                ja0 ja0Var = this.n;
                float e = Float.isNaN(ja0Var.j.e()) ? 0.0f : ja0Var.j.e();
                uqnVar2.a = e;
                if (e != d) {
                    float f = this.o;
                    if ((d - e) * f < 0.0f || f == 0.0f) {
                        this.k = null;
                        this.l = null;
                        this.m = null;
                        this.j = 1;
                    } else {
                        uf7 uf7Var = this.r;
                        float m = ghh.m(uf7Var, e, f);
                        float f2 = this.o;
                        if (f2 <= 0.0f ? m > d : m < d) {
                            this.k = null;
                            this.l = null;
                            this.m = null;
                            this.j = 3;
                        } else {
                            vm0 J = wdp.J(uqnVar2.a, f2, 28);
                            ta0 ta0Var = new ta0(d, uqnVar2, ca0Var, uqnVar);
                            this.k = null;
                            this.l = null;
                            this.m = null;
                            this.j = 2;
                        }
                    }
                    return nm6Var;
                }
            }
        } else if (i == 1) {
            qgg.h0(obj);
            uqnVar.a = 0.0f;
        } else if (i == 2) {
            qgg.h0(obj);
        } else {
            if (i != 3) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
            uqnVar.a = 0.0f;
        }
        return Unit.a;
    }
}
