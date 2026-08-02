package ru.yandex.taxi.requirements.interactor;

import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import defpackage.b580;
import defpackage.ijj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.srq0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsrq0;", "Lb580;", "Lzy11;", "<anonymous>", "(Lsrq0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.requirements.interactor.RequirementOptionFilterInteractor$extractTariffRequirements$$inlined$extractTariffRequirements$1", f = "RequirementOptionFilterInteractor.kt", l = {HProv.PP_INFO}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
public final class RequirementOptionFilterInteractor$extractTariffRequirements$$inlined$extractTariffRequirements$1 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ ZoneTariffInfo $tariffInfo$inlined;
    final /* synthetic */ List $tariffRequirements;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ ijj0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequirementOptionFilterInteractor$extractTariffRequirements$$inlined$extractTariffRequirements$1(List list, ijj0 ijj0Var, Continuation continuation, ZoneTariffInfo zoneTariffInfo) {
        super(2, continuation);
        this.$tariffRequirements = list;
        this.this$0 = ijj0Var;
        this.$tariffInfo$inlined = zoneTariffInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RequirementOptionFilterInteractor$extractTariffRequirements$$inlined$extractTariffRequirements$1 requirementOptionFilterInteractor$extractTariffRequirements$$inlined$extractTariffRequirements$1 = new RequirementOptionFilterInteractor$extractTariffRequirements$$inlined$extractTariffRequirements$1(this.$tariffRequirements, this.this$0, continuation, this.$tariffInfo$inlined);
        requirementOptionFilterInteractor$extractTariffRequirements$$inlined$extractTariffRequirements$1.L$0 = obj;
        return requirementOptionFilterInteractor$extractTariffRequirements$$inlined$extractTariffRequirements$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RequirementOptionFilterInteractor$extractTariffRequirements$$inlined$extractTariffRequirements$1) create((srq0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        srq0 srq0Var = (srq0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            it = this.$tariffRequirements.iterator();
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) this.L$1;
            kotlin.b.b(obj);
        }
        while (it.hasNext()) {
            b580 b580Var = (b580) it.next();
            ru.yandex.taxi.requirements.models.net.c cVar = (ru.yandex.taxi.requirements.models.net.c) ((Map) this.$tariffInfo$inlined.J.getValue()).get(b580Var.a);
            if (cVar != null) {
                if (b580Var.c()) {
                    b580Var = ijj0.a(this.this$0, b580Var, cVar);
                }
                if (b580Var != null) {
                    this.L$0 = srq0Var;
                    this.L$1 = it;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 1;
                    if (srq0Var.a(b580Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    continue;
                }
            }
        }
        return zy11.a;
    }
}
