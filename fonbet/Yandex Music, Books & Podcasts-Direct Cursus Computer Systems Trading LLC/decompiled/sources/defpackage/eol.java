package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class eol extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ uol l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eol(uol uolVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = uolVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new eol(this.l, continuation, 0);
            default:
                return new eol(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((eol) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object k;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                uol uolVar = this.l;
                if (i == 0) {
                    qgg.h0(obj);
                    x6l x6lVar = uolVar.c;
                    pmt pmtVar = pmt.a;
                    this.k = 1;
                    if (x6lVar.m(pmtVar, this) == nm6Var) {
                    }
                } else if (i == 1) {
                    qgg.h0(obj);
                } else if (i == 2) {
                    qgg.h0(obj);
                    xdh xdhVar = uolVar.d;
                    this.k = 3;
                    k = ((b9l) xdhVar.d).k(this);
                    if (k != nm6Var) {
                        k = Unit.a;
                    }
                    if (k == nm6Var) {
                    }
                } else if (i != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                lum lumVar = uolVar.a;
                this.k = 2;
                if (lumVar.c0(this) == nm6Var) {
                }
                xdh xdhVar2 = uolVar.d;
                this.k = 3;
                k = ((b9l) xdhVar2.d).k(this);
                if (k != nm6Var) {
                }
                if (k == nm6Var) {
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                uol uolVar2 = this.l;
                if (i2 == 0) {
                    qgg.h0(obj);
                    lum lumVar2 = uolVar2.a;
                    this.k = 1;
                    obj = ((s5d) ((cr) lumVar2.a).h).u(this);
                    if (obj == nm6Var2) {
                    }
                } else if (i2 == 1) {
                    qgg.h0(obj);
                } else if (i2 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                long longValue = ((Number) obj).longValue();
                xdh xdhVar3 = uolVar2.d;
                zgl zglVar = new zgl(new Long(longValue), null);
                this.k = 2;
                Object p = ((b9l) xdhVar3.d).p(zglVar, this);
                if (p != nm6Var2) {
                    p = Unit.a;
                }
                if (p == nm6Var2) {
                }
                break;
        }
        return Unit.a;
    }
}
