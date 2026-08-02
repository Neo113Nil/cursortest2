package ru.yandex.taxi.summary.requirements.list.interactors;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.summary.requirements.list.interactors.RequirementsRoutingInteractor", f = "RequirementsRoutingInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE, HProv.ALG_SID_SHA3_256}, m = "handleRequirementActions", v = 2)
/* loaded from: classes6.dex */
final class RequirementsRoutingInteractor$handleRequirementActions$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequirementsRoutingInteractor$handleRequirementActions$1(h0 h0Var, Continuation continuation) {
        super(continuation);
        this.this$0 = h0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
