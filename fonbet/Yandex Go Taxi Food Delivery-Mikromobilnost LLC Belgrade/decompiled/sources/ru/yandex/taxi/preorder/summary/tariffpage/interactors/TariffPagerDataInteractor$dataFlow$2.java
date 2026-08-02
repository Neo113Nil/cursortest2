package ru.yandex.taxi.preorder.summary.tariffpage.interactors;

import defpackage.dms;
import defpackage.i890;
import defpackage.ik31;
import defpackage.ikx0;
import defpackage.jl40;
import defpackage.m1a0;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u0006\u0010\b\u001a\u00020\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lik31;", "snapshot", "Lm1a0;", "paymentInfo", "", "Lcom/yandex/go/tariffcard/repository/Offer;", "showHighlightingEtaOffer", "", "<unused var>", "Li890;", "<anonymous>", "(Lik31;Lm1a0;Ljava/lang/String;Ljava/lang/Object;)Li890;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.tariffpage.interactors.TariffPagerDataInteractor$dataFlow$2", f = "TariffPagerDataInteractor.kt", l = {50}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TariffPagerDataInteractor$dataFlow$2 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffPagerDataInteractor$dataFlow$2(e eVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        TariffPagerDataInteractor$dataFlow$2 tariffPagerDataInteractor$dataFlow$2 = new TariffPagerDataInteractor$dataFlow$2(this.this$0, (Continuation) obj5);
        tariffPagerDataInteractor$dataFlow$2.L$0 = (ik31) obj;
        tariffPagerDataInteractor$dataFlow$2.L$1 = (m1a0) obj2;
        tariffPagerDataInteractor$dataFlow$2.L$2 = (String) obj3;
        return tariffPagerDataInteractor$dataFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TariffPagerDataInteractor$dataFlow$2 tariffPagerDataInteractor$dataFlow$2;
        ik31 ik31Var = (ik31) this.L$0;
        m1a0 m1a0Var = (m1a0) this.L$1;
        String str = (String) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.preorder.summary.tariffpage.data.vertical.a aVar = this.this$0.e;
            this.L$0 = ik31Var;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            tariffPagerDataInteractor$dataFlow$2 = this;
            obj = aVar.c(ik31Var, aVar.c.c(), m1a0Var, str, tariffPagerDataInteractor$dataFlow$2);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            tariffPagerDataInteractor$dataFlow$2 = this;
        }
        List list = (List) obj;
        mi31 mi31Var = ik31Var.b;
        String str2 = mi31Var.f;
        String str3 = mi31Var.b;
        tariffPagerDataInteractor$dataFlow$2.this$0.getClass();
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            ikx0 ikx0Var = (ikx0) it.next();
            if (jl40.l(ikx0Var.b.b, str2) && jl40.l(ikx0Var.b.a, str3)) {
                break;
            }
            i2++;
        }
        return new i890(i2, str2, str3, list);
    }
}
