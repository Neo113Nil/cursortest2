package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class col extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public col(uol uolVar, boolean z, long j, Continuation continuation) {
        super(2, continuation);
        this.j = 1;
        this.l = uolVar;
        this.m = z;
        this.n = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new col(this.m, (uol) this.l, this.n, continuation, 0);
            case 1:
                return new col((uol) this.l, this.m, this.n, continuation);
            default:
                return new col(this.m, (oj0) this.l, this.n, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((col) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object f;
        switch (this.j) {
            case 0:
                uol uolVar = (uol) this.l;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    pmt pmtVar = this.m ? pmt.c : pmt.b;
                    x6l x6lVar = uolVar.c;
                    this.k = 1;
                    if (x6lVar.m(pmtVar, this) == nm6Var) {
                    }
                } else if (i == 1) {
                    qgg.h0(obj);
                } else if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                xdh xdhVar = uolVar.d;
                this.k = 2;
                Object z = ((b9l) xdhVar.d).z(this.n, this);
                if (z != nm6Var) {
                    z = Unit.a;
                }
                if (z == nm6Var) {
                }
                break;
            case 1:
                uol uolVar2 = (uol) this.l;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    x6l x6lVar2 = uolVar2.c;
                    this.k = 1;
                    if (x6lVar2.l(this) == nm6Var2) {
                    }
                } else if (i2 == 1) {
                    qgg.h0(obj);
                } else if (i2 == 2) {
                    qgg.h0(obj);
                    xdh xdhVar2 = uolVar2.d;
                    this.k = 3;
                    f = ((b9l) xdhVar2.d).f(this.n, this);
                    if (f != nm6Var2) {
                        f = Unit.a;
                    }
                    if (f == nm6Var2) {
                    }
                } else if (i2 != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                if (this.m) {
                    lum lumVar = uolVar2.a;
                    this.k = 2;
                    if (lumVar.b0(this) == nm6Var2) {
                    }
                }
                xdh xdhVar22 = uolVar2.d;
                this.k = 3;
                f = ((b9l) xdhVar22.d).f(this.n, this);
                if (f != nm6Var2) {
                }
                if (f == nm6Var2) {
                }
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    cyi cyiVar = ((oj0) this.l).a;
                    if (this.m) {
                        this.k = 2;
                        if (cyiVar.a(this.n, 0L, this) == nm6Var3) {
                        }
                    } else {
                        this.k = 1;
                        if (cyiVar.a(0L, this.n, this) == nm6Var3) {
                        }
                    }
                } else if (i3 != 1 && i3 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ col(boolean z, Object obj, long j, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = z;
        this.l = obj;
        this.n = j;
    }
}
