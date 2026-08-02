package defpackage;

import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class dmc extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ pjc m;
    public final /* synthetic */ gm5 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dmc(pjc pjcVar, gm5 gm5Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = pjcVar;
        this.n = gm5Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                dmc dmcVar = new dmc(this.m, this.n, continuation, 0);
                dmcVar.l = obj;
                return dmcVar;
            default:
                dmc dmcVar2 = new dmc(this.m, this.n, continuation, 1);
                dmcVar2.l = obj;
                return dmcVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((dmc) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        xqn xqnVar;
        int i = this.j;
        pjc pjcVar = this.m;
        gm5 gm5Var = this.n;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                try {
                    if (i2 == 0) {
                        qgg.h0(obj);
                        mm6 mm6Var = (mm6) this.l;
                        xqn xqnVar2 = new xqn();
                        tl0 tl0Var = new tl0(19, xqnVar2, mm6Var, gm5Var);
                        this.l = xqnVar2;
                        this.k = 1;
                        if (pjcVar.collect(tl0Var, this) == nm6Var) {
                            return nm6Var;
                        }
                        xqnVar = xqnVar2;
                    } else {
                        if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xqnVar = (xqn) this.l;
                        qgg.h0(obj);
                    }
                    if (xqnVar.a == null) {
                        r7o r7oVar = z7o.b;
                        gm5Var.U(new z7o(new t7o(new NoSuchElementException("Flow is empty"))));
                    }
                    return Unit.a;
                } finally {
                }
            default:
                mm6 mm6Var2 = (mm6) this.l;
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                try {
                    if (i3 == 0) {
                        qgg.h0(obj);
                        t58 t58Var = new t58(new xqn(), mm6Var2, gm5Var);
                        this.l = null;
                        this.k = 1;
                        if (pjcVar.collect(t58Var, this) == nm6Var2) {
                            return nm6Var2;
                        }
                    } else {
                        if (i3 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    return Unit.a;
                } finally {
                }
        }
    }
}
