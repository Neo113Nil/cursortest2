package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class h9l extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ j9l l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h9l(j9l j9lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = j9lVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new h9l(this.l, continuation, 0);
            default:
                return new h9l(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((h9l) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    ysh yshVar = (ysh) this.l.n.getValue();
                    this.k = 1;
                    Object emit = ((juh) yshVar.a.getValue()).a.emit("PlayerAdapter.play()", this);
                    if (emit != nm6Var) {
                        emit = Unit.a;
                    }
                    if (emit != nm6Var) {
                        emit = Unit.a;
                    }
                    if (emit == nm6Var) {
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
                if (i2 != 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                ssg.a(3, "SessionPlayerAdapter", "setPlayWhenReady waiting ready state", null);
                a1l a1lVar = new a1l(this.l.h.c, 11);
                this.k = 1;
                Object i0 = zsd.i0(a1lVar, this);
                return i0 == nm6Var2 ? nm6Var2 : i0;
        }
    }
}
