package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class kyv extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ lyv l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kyv(lyv lyvVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = lyvVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new kyv(this.l, continuation, 0);
            case 1:
                return new kyv(this.l, continuation, 1);
            default:
                return new kyv(this.l, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((kyv) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    rxv rxvVar = this.l.a;
                    act actVar = myv.b;
                    this.k = 1;
                    if (rxvVar.b(2.2f, actVar, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    rxv rxvVar2 = this.l.a;
                    jeh jehVar = jeh.a;
                    act actVar2 = myv.a;
                    this.k = 1;
                    if (rxvVar2.s(jehVar, null, actVar2, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                rxv rxvVar3 = this.l.a;
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    act actVar3 = myv.b;
                    this.k = 1;
                    if (rxvVar3.b(1.0f, actVar3, this) == nm6Var3) {
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                x6k x6kVar = rxvVar3.w;
                Boolean bool = Boolean.TRUE;
                x6kVar.setValue(bool);
                rxvVar3.z.setValue(bool);
                rxvVar3.o(true);
                rxvVar3.r(false);
                break;
        }
        return Unit.a;
    }
}
