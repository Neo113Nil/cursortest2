package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class mxg extends aur implements Function1 {
    public int j;
    public final /* synthetic */ qxg k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ float n;
    public final /* synthetic */ ayg o;
    public final /* synthetic */ float p;
    public final /* synthetic */ zxg q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxg(qxg qxgVar, int i, int i2, float f, ayg aygVar, float f2, zxg zxgVar, Continuation continuation) {
        super(1, continuation);
        this.k = qxgVar;
        this.l = i;
        this.m = i2;
        this.n = f;
        this.o = aygVar;
        this.p = f2;
        this.q = zxgVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        return new mxg(this.k, this.l, this.m, this.n, this.o, this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((mxg) create((Continuation) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        CoroutineContext coroutineContext;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        qxg qxgVar = this.k;
        try {
            if (i == 0) {
                qgg.h0(obj);
                qxgVar.h(this.l);
                x6k x6kVar = qxgVar.a;
                x6k x6kVar2 = qxgVar.c;
                int i2 = this.m;
                x6kVar2.setValue(Integer.valueOf(i2));
                x6k x6kVar3 = qxgVar.d;
                Boolean bool = Boolean.FALSE;
                x6kVar3.setValue(bool);
                x6k x6kVar4 = qxgVar.f;
                float f = this.n;
                x6kVar4.setValue(Float.valueOf(f));
                qxgVar.e.setValue(null);
                x6k x6kVar5 = qxgVar.i;
                ayg aygVar = this.o;
                x6kVar5.setValue(aygVar);
                qxgVar.i(this.p);
                qxgVar.g.setValue(bool);
                qxgVar.l.setValue(Long.MIN_VALUE);
                if (aygVar == null) {
                    x6kVar.setValue(bool);
                    return Unit.a;
                }
                if (Float.isInfinite(f)) {
                    qxgVar.i(qxgVar.c());
                    x6kVar.setValue(bool);
                    qxgVar.h(i2);
                    return Unit.a;
                }
                x6kVar.setValue(Boolean.TRUE);
                int ordinal = this.q.ordinal();
                if (ordinal == 0) {
                    coroutineContext = g.a;
                } else {
                    if (ordinal != 1) {
                        throw new x7j();
                    }
                    coroutineContext = l8j.c;
                }
                lxg lxgVar = new lxg(this.q, saf.Q(getContext()), this.m, this.l, this.k, null, 0);
                this.j = 1;
                if (x97.V(coroutineContext, lxgVar, this) == nm6Var) {
                    return nm6Var;
                }
            } else {
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
            }
            saf.K(getContext());
            qxg.b(qxgVar, false);
            return Unit.a;
        } catch (Throwable th) {
            qxg.b(qxgVar, false);
            throw th;
        }
    }
}
