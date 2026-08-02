package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class o6i extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ j7i l;
    public final /* synthetic */ s6i m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o6i(j7i j7iVar, s6i s6iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = j7iVar;
        this.m = s6iVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new o6i(this.l, this.m, continuation, 0);
            default:
                return new o6i(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((o6i) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object emit;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    s6i s6iVar = this.m;
                    if (CollectionsKt.firstOrNull(s6iVar.a) instanceof yrj) {
                        s6iVar.c.a(we5.a);
                        emit = Unit.a;
                    } else {
                        emit = this.l.H.emit(s6iVar, this);
                        if (emit != nm6Var) {
                            emit = Unit.a;
                        }
                    }
                    if (emit == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (this.l.R(this.m, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
