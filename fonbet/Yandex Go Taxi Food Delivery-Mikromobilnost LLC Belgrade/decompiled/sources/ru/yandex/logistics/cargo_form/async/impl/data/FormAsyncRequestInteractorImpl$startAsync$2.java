package ru.yandex.logistics.cargo_form.async.impl.data;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formasynctask.V2FormAsyncTaskRequestDto;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lan2;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/V2FormAsyncTaskResponseDto;", "<anonymous>", "()Lan2;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.cargo_form.async.impl.data.FormAsyncRequestInteractorImpl$startAsync$2", f = "FormAsyncRequestInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class FormAsyncRequestInteractorImpl$startAsync$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $idempotencyToken;
    final /* synthetic */ Object $state;
    final /* synthetic */ String $taskId;
    final /* synthetic */ Object $taskParams;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormAsyncRequestInteractorImpl$startAsync$2(a aVar, String str, String str2, Object obj, Object obj2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$idempotencyToken = str;
        this.$taskId = str2;
        this.$state = obj;
        this.$taskParams = obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new FormAsyncRequestInteractorImpl$startAsync$2(this.this$0, this.$idempotencyToken, this.$taskId, this.$state, this.$taskParams, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((FormAsyncRequestInteractorImpl$startAsync$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return ((FormAsyncApi) this.this$0.i.get()).b(this.$idempotencyToken, new V2FormAsyncTaskRequestDto(this.$taskId, this.$state, this.$taskParams));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
