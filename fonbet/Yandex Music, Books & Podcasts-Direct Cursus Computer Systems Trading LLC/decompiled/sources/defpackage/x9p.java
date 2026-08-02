package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class x9p extends aur implements Function2 {
    public final /* synthetic */ int j;
    public long k;
    public int l;
    public final /* synthetic */ uol m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9p(uol uolVar, long j, Continuation continuation) {
        super(2, continuation);
        this.j = 2;
        this.m = uolVar;
        this.k = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new x9p(this.m, continuation, 0);
            case 1:
                return new x9p(this.m, continuation, 1);
            default:
                return new x9p(this.m, this.k, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((x9p) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.l;
                uol uolVar = this.m;
                if (i == 0) {
                    qgg.h0(obj);
                    this.l = 1;
                    obj = uolVar.f(this);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j = this.k;
                        qgg.h0(obj);
                        return new Long(yhn.f(j, 0L, ((Number) obj).longValue()));
                    }
                    qgg.h0(obj);
                }
                long longValue = ((Number) obj).longValue() - 15000;
                this.k = longValue;
                this.l = 2;
                obj = uolVar.a(this);
                if (obj == nm6Var) {
                    return nm6Var;
                }
                j = longValue;
                return new Long(yhn.f(j, 0L, ((Number) obj).longValue()));
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.l;
                uol uolVar2 = this.m;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.l = 1;
                    obj = uolVar2.f(this);
                    if (obj == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j2 = this.k;
                        qgg.h0(obj);
                        return new Long(yhn.f(j2, 0L, ((Number) obj).longValue()));
                    }
                    qgg.h0(obj);
                }
                long longValue2 = ((Number) obj).longValue() + 30000;
                this.k = longValue2;
                this.l = 2;
                obj = uolVar2.a(this);
                if (obj == nm6Var2) {
                    return nm6Var2;
                }
                j2 = longValue2;
                return new Long(yhn.f(j2, 0L, ((Number) obj).longValue()));
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.l;
                if (i3 != 0) {
                    if (i3 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                long j3 = this.k;
                this.l = 1;
                Object p = c9g.p(this.m, j3, this);
                return p == nm6Var3 ? nm6Var3 : p;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x9p(uol uolVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = uolVar;
    }
}
