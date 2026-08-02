package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class d1m extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ mmo m;
    public final /* synthetic */ lxl n;
    public final /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1m(mmo mmoVar, lxl lxlVar, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = mmoVar;
        this.n = lxlVar;
        this.o = z;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                d1m d1mVar = new d1m(this.m, this.n, this.o, continuation, 0);
                d1mVar.l = obj;
                return d1mVar;
            case 1:
                d1m d1mVar2 = new d1m(this.m, this.n, this.o, continuation, 1);
                d1mVar2.l = obj;
                return d1mVar2;
            default:
                d1m d1mVar3 = new d1m(this.m, this.n, this.o, continuation, 2);
                d1mVar3.l = obj;
                return d1mVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        rjc rjcVar = (rjc) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((d1m) create(rjcVar, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                rjc rjcVar = (rjc) this.l;
                nm6 nm6Var = nm6.a;
                int i = this.k;
                mmo mmoVar = this.m;
                if (i == 0) {
                    qgg.h0(obj);
                    cut cutVar = (cut) ((jyr) mmoVar.c).getValue();
                    hxl hxlVar = (hxl) this.n;
                    String str = hxlVar.a;
                    String str2 = hxlVar.b;
                    this.l = rjcVar;
                    this.k = 1;
                    obj = cutVar.i(str, str2, this.o, this);
                    if (obj == nm6Var) {
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
                this.l = null;
                this.k = 2;
                if (mmo.d(mmoVar, rjcVar, (rj6) obj, this) == nm6Var) {
                }
                break;
            case 1:
                rjc rjcVar2 = (rjc) this.l;
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                mmo mmoVar2 = this.m;
                if (i2 == 0) {
                    qgg.h0(obj);
                    cut cutVar2 = (cut) ((jyr) mmoVar2.c).getValue();
                    jxl jxlVar = (jxl) this.n;
                    String str3 = jxlVar.a;
                    String str4 = jxlVar.b;
                    this.l = rjcVar2;
                    this.k = 1;
                    obj = cutVar2.i(str3, str4, this.o, this);
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
                mmoVar2.getClass();
                a1m T0 = mmo.T0((rj6) obj);
                this.l = null;
                this.k = 2;
                if (rjcVar2.emit(T0, this) == nm6Var2) {
                }
                break;
            default:
                rjc rjcVar3 = (rjc) this.l;
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                mmo mmoVar3 = this.m;
                if (i3 == 0) {
                    qgg.h0(obj);
                    cut cutVar3 = (cut) ((jyr) mmoVar3.c).getValue();
                    String str5 = ((kxl) this.n).a;
                    this.l = rjcVar3;
                    this.k = 1;
                    obj = cutVar3.j(str5, this.o, this);
                    if (obj == nm6Var3) {
                    }
                } else if (i3 == 1) {
                    qgg.h0(obj);
                } else if (i3 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                this.l = null;
                this.k = 2;
                if (mmo.d(mmoVar3, rjcVar3, (rj6) obj, this) == nm6Var3) {
                }
                break;
        }
        return Unit.a;
    }
}
