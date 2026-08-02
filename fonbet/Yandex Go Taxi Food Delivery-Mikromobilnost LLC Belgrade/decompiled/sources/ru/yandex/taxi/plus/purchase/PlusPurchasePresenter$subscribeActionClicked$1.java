package ru.yandex.taxi.plus.purchase;

import defpackage.a0v0;
import defpackage.a46;
import defpackage.b0v0;
import defpackage.bj41;
import defpackage.bkd0;
import defpackage.c0v0;
import defpackage.c21;
import defpackage.d0v0;
import defpackage.d59;
import defpackage.e0v0;
import defpackage.e8b0;
import defpackage.ejd0;
import defpackage.evu0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rid0;
import defpackage.sy60;
import defpackage.tse;
import defpackage.tzf0;
import defpackage.u0v0;
import defpackage.vfc0;
import defpackage.w511;
import defpackage.wls;
import defpackage.yvf0;
import defpackage.zy11;
import defpackage.zzu0;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.plus.purchase.domain.PurchaseStatus;
import ru.yandex.taxi.plus.sdk.home.config.OpenPlusSubscriptionAction;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.plus.purchase.PlusPurchasePresenter$subscribeActionClicked$1", f = "PlusPurchasePresenter.kt", l = {HProv.PP_CONTAINER_EXTENSION}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PlusPurchasePresenter$subscribeActionClicked$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isInitiatedByUser;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusPurchasePresenter$subscribeActionClicked$1(boolean z, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$isInitiatedByUser = z;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlusPurchasePresenter$subscribeActionClicked$1(this.$isInitiatedByUser, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusPurchasePresenter$subscribeActionClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0049, code lost:
    
        if (r1 != ru.yandex.taxi.plus.purchase.AvailableButtonAction.BUY_INAPP) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fe  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object h;
        d dVar;
        rid0 rid0Var;
        rid0 rid0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            if (this.$isInitiatedByUser && (rid0Var = (dVar = this.this$0).D) != null) {
                String b = dVar.A.b();
                if (b != null) {
                    evu0.J(b);
                }
                rid0Var.n();
            }
            d dVar2 = this.this$0;
            u0v0 u0v0Var = dVar2.F;
            if (u0v0Var != null && (r1 = u0v0Var.g) != null) {
                dVar2.z.getClass();
            }
            tzf0 tzf0Var = this.this$0.B;
            tzf0Var.b = OpenPlusSubscriptionAction.NONE;
            vfc0 vfc0Var = tzf0Var.a;
            if (vfc0Var != null) {
                vfc0Var.f();
            }
            d dVar3 = this.this$0;
            ru.yandex.taxi.plus.purchase.domain.a aVar = dVar3.z;
            String str = ((bkd0) dVar3.C.b).b;
            boolean z = this.$isInitiatedByUser;
            String str2 = dVar3.E;
            this.label = 1;
            h = aVar.h(str, str2, this, z);
            if (h == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            h = ((Result) obj).getValue();
        }
        d dVar4 = this.this$0;
        if (!(h instanceof Result.Failure)) {
            e0v0 e0v0Var = (e0v0) h;
            d59 d59Var = dVar4.x;
            PurchaseStatus purchaseStatus = e0v0Var.a;
            switch (purchaseStatus == null ? -1 : ejd0.a[purchaseStatus.ordinal()]) {
                case -1:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    if (!(e0v0Var instanceof zzu0) && !(e0v0Var instanceof a0v0) && !(e0v0Var instanceof d0v0)) {
                        if (!(e0v0Var instanceof b0v0)) {
                            String str3 = ((b0v0) e0v0Var).b;
                            a aVar2 = new a(dVar4);
                            int i2 = d59Var.a;
                            c21 c21Var = sy60.Q2;
                            switch (i2) {
                                case 0:
                                    a46 a46Var = (a46) d59Var.b;
                                    a46Var.A((m950) ((yvf0) a46Var.G).get(), new bj41(str3, aVar2), c21Var);
                                    break;
                                case 1:
                                    a46 a46Var2 = (a46) d59Var.b;
                                    a46Var2.A((m950) ((e8b0) a46Var2.L).get(), new bj41(str3, aVar2), c21Var);
                                    break;
                                default:
                                    ru.yandex.taxi.cashback.router.real.home.a aVar3 = (ru.yandex.taxi.cashback.router.real.home.a) d59Var.b;
                                    aVar3.A((m950) aVar3.Q.get(), new bj41(str3, aVar2), c21Var);
                                    break;
                            }
                        } else {
                            if (!(e0v0Var instanceof c0v0)) {
                                w511.b();
                                return null;
                            }
                            d59Var.a(((bkd0) dVar4.C.b).b, true);
                            break;
                        }
                    }
                    break;
                case 0:
                default:
                    w511.b();
                    return null;
                case 7:
                    rid0 rid0Var3 = dVar4.D;
                    if (rid0Var3 != null) {
                        rid0Var3.m();
                    }
                    if (!(e0v0Var instanceof zzu0)) {
                        if (!(e0v0Var instanceof b0v0)) {
                        }
                        break;
                    }
                    break;
            }
        }
        d dVar5 = this.this$0;
        if (Result.a(h) != null && (rid0Var2 = dVar5.D) != null) {
            rid0Var2.m();
        }
        return zy11Var;
    }
}
