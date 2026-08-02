package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class x6g extends aur implements Function2 {
    public final /* synthetic */ int j = 0;
    public int k;
    public final /* synthetic */ z6g l;
    public final /* synthetic */ cjc m;
    public final /* synthetic */ sdr n;
    public final /* synthetic */ cjc o;
    public final /* synthetic */ v6k p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6g(cjc cjcVar, z6g z6gVar, v6k v6kVar, sdr sdrVar, cjc cjcVar2, Continuation continuation) {
        super(2, continuation);
        this.m = cjcVar;
        this.l = z6gVar;
        this.p = v6kVar;
        this.n = sdrVar;
        this.o = cjcVar2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new x6g(this.m, this.l, this.p, this.n, this.o, continuation);
            default:
                return new x6g(this.l, this.m, this.n, this.o, this.p, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
            case 0:
                return ((x6g) create(mm6Var, continuation)).invokeSuspend(Unit.a);
            default:
                ((x6g) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                return nm6.a;
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        r90 r90Var;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    eno s0 = szf.s0(new wf3(this.m, 15));
                    pm pmVar = new pm(this.l, this.p, this.n, this.o, 9);
                    this.k = 1;
                    if (s0.collect(pmVar, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 != 0 && i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                do {
                    r90Var = new r90(this.l, this.m, this.n, this.o, this.p, 1);
                    this.k = 1;
                } while (bzf.D(getContext()).P(r90Var, this) != nm6Var2);
                return nm6Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6g(z6g z6gVar, cjc cjcVar, sdr sdrVar, cjc cjcVar2, v6k v6kVar, Continuation continuation) {
        super(2, continuation);
        this.l = z6gVar;
        this.m = cjcVar;
        this.n = sdrVar;
        this.o = cjcVar2;
        this.p = v6kVar;
    }
}
