package ru.yandex.taxi.interactor;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.ik31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wmj0;
import defpackage.xcj0;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lik31;", PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, "", "Lwu0;", "contentItems", "Lxcj0;", "<anonymous>", "(Lik31;Ljava/util/List;)Lxcj0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.interactor.RequirementAddressFormStateInteractor$stateFlow$1", f = "RequirementAddressFormStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RequirementAddressFormStateInteractor$stateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequirementAddressFormStateInteractor$stateFlow$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RequirementAddressFormStateInteractor$stateFlow$1 requirementAddressFormStateInteractor$stateFlow$1 = new RequirementAddressFormStateInteractor$stateFlow$1(this.this$0, (Continuation) obj3);
        requirementAddressFormStateInteractor$stateFlow$1.L$0 = (ik31) obj;
        requirementAddressFormStateInteractor$stateFlow$1.L$1 = (List) obj2;
        return requirementAddressFormStateInteractor$stateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ik31 ik31Var = (ik31) this.L$0;
        List list = (List) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        wmj0 b = this.this$0.c.b();
        String str = (String) b.c.get(b.f.g.a);
        if (str == null) {
            str = "";
        }
        String e = ik31Var.b.a.e();
        return new xcj0(list, str, e != null ? e : "");
    }
}
