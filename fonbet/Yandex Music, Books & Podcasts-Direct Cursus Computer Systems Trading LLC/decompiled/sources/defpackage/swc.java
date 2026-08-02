package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class swc extends aur implements pyc {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ rjc l;
    public /* synthetic */ Object m;
    public final /* synthetic */ uwc n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ swc(Continuation continuation, uwc uwcVar, int i) {
        super(3, continuation);
        this.j = i;
        this.n = uwcVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rjc rjcVar = (rjc) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                swc swcVar = new swc(continuation, this.n, 0);
                swcVar.l = rjcVar;
                swcVar.m = obj2;
                return swcVar.invokeSuspend(Unit.a);
            case 1:
                swc swcVar2 = new swc(continuation, this.n, 1);
                swcVar2.l = rjcVar;
                swcVar2.m = obj2;
                return swcVar2.invokeSuspend(Unit.a);
            default:
                swc swcVar3 = new swc(continuation, this.n, 2);
                swcVar3.l = rjcVar;
                swcVar3.m = obj2;
                return swcVar3.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        pjc fsVar;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    rjc rjcVar = this.l;
                    eno enoVar = new eno(new akc(this.n, (Continuation) null, 6));
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar, enoVar, this) == nm6Var) {
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
                    rjc rjcVar2 = this.l;
                    uwc uwcVar = this.n;
                    Continuation continuation = null;
                    yc4 M0 = zsd.M0(new u21(10, uwcVar.a, new clc(uwcVar.e, new z21(2, 19, continuation)), new hk4(3, 4, continuation)), new swc(continuation, uwcVar, 0));
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar2, M0, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar3 = this.l;
                    if (((Boolean) this.m).booleanValue()) {
                        uwc uwcVar2 = this.n;
                        fsVar = new u21(10, uwcVar2.f, ((z66) uwcVar2.c.getValue()).c(), new w83(3, uwcVar2, uwc.class, "prepareOneTapState", "prepareOneTapState(Lcom/yandex/music/shared/plus/acquisition/api/offers/data/OfferRequestResult;Lcom/yandex/music/shared/utils/network/connectivity/ConnectivityInfo;)Lcom/yandex/music/plus/features/freemium/offer/core/api/FreemiumOfferLoadingState;", 4, 4));
                    } else {
                        fsVar = new fs(15, cxc.a);
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar3, fsVar, this) == nm6Var3) {
                    }
                } else if (i3 != 1) {
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
