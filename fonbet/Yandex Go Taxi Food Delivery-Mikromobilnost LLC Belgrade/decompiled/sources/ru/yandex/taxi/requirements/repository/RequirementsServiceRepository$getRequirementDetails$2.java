package ru.yandex.taxi.requirements.repository;

import defpackage.cmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xfj0;
import defpackage.xnt;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.requirements.api.RequirementsApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lxfj0;", "<anonymous>", "(Ltse;)Lxfj0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.requirements.repository.RequirementsServiceRepository$getRequirementDetails$2", f = "RequirementsServiceRepository.kt", l = {29}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RequirementsServiceRepository$getRequirementDetails$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $payloadJson;
    Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequirementsServiceRepository$getRequirementDetails$2(String str, e eVar, Continuation continuation) {
        super(2, continuation);
        this.$payloadJson = str;
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RequirementsServiceRepository$getRequirementDetails$2(this.$payloadJson, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RequirementsServiceRepository$getRequirementDetails$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        String str = this.$payloadJson;
        cmt<xfj0> a = ((RequirementsApi) this.this$0.c.getValue()).a(str != null ? (kotlinx.serialization.json.b) ((xnt) this.this$0.b).c(str, kotlinx.serialization.json.b.Companion.serializer()) : new kotlinx.serialization.json.c(kotlin.collections.b.f()));
        this.L$0 = null;
        this.label = 1;
        Object a2 = ru.yandex.taxi.network.api.a.a(a, null, this);
        return a2 == coroutineSingletons ? coroutineSingletons : a2;
    }
}
