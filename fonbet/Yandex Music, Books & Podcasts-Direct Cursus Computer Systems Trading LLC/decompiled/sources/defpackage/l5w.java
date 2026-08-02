package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class l5w extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ n5w l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l5w(n5w n5wVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = n5wVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new l5w(this.l, continuation, 0);
            default:
                return new l5w(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((l5w) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object h5wVar;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object a = n5w.a(this.l, this);
                    return a == nm6Var ? nm6Var : a;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                n5w n5wVar = this.l;
                try {
                    if (i2 == 0) {
                        qgg.h0(obj);
                        w2f w2fVar = n5wVar.m;
                        l5w l5wVar = new l5w(n5wVar, null, 0);
                        this.k = 1;
                        obj = x97.V(w2fVar, l5wVar, this);
                        if (obj == nm6Var2) {
                            return nm6Var2;
                        }
                    } else {
                        if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    h5wVar = (k5w) obj;
                } catch (c5w e) {
                    h5wVar = new j5w(e.a);
                } catch (CancellationException unused) {
                    h5wVar = new h5w();
                } catch (Throwable th) {
                    jsg.j().h(o5w.a, "Unexpected error in WorkerWrapper", th);
                    h5wVar = new h5w();
                }
                Object s = n5wVar.h.s(new b6n(24, new fb7(7, h5wVar, n5wVar)));
                s.getClass();
                return s;
        }
    }
}
