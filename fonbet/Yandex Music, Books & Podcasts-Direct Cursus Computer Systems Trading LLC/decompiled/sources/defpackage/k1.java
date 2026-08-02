package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class k1 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ n1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(n1 n1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = n1Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new k1(this.l, continuation, 0);
            default:
                return new k1(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 0:
                return ((k1) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
            default:
                return ((k1) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0050 -> B:8:0x0053). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    n1 n1Var = this.l;
                    if (!n1Var.i.b()) {
                        n1Var.i = n1Var.c();
                    }
                    this.k = 1;
                    if (n1.a(n1Var, this) == nm6Var) {
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
                n1 n1Var2 = this.l;
                if (i2 == 0) {
                    qgg.h0(obj);
                    long currentTimeMillis = System.currentTimeMillis() - n1Var2.f;
                    long j2 = n1Var2.d;
                    j = currentTimeMillis > j2 ? 0L : j2 - currentTimeMillis;
                    if (!saf.X(getContext())) {
                    }
                } else if (i2 == 1) {
                    qgg.h0(obj);
                    this.k = 2;
                    obj = n1.a(n1Var2, this);
                    if (obj == nm6Var2) {
                    }
                    j = ((Number) obj).longValue();
                    if (j == -1) {
                    }
                    if (!saf.X(getContext())) {
                    }
                } else if (i2 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    j = ((Number) obj).longValue();
                    if (j == -1) {
                        break;
                    }
                    if (!saf.X(getContext())) {
                        this.k = 1;
                        if (y2x.o(j, this) == nm6Var2) {
                        }
                        this.k = 2;
                        obj = n1.a(n1Var2, this);
                        if (obj == nm6Var2) {
                        }
                        j = ((Number) obj).longValue();
                        if (j == -1) {
                        }
                        if (!saf.X(getContext())) {
                            break;
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }
}
