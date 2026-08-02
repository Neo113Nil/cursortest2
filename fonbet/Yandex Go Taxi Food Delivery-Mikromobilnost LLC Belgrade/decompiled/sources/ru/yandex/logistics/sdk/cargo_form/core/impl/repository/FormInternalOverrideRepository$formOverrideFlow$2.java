package ru.yandex.logistics.sdk.cargo_form.core.impl.repository;

import defpackage.j6s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzy11;", "<unused var>", "Lj6s;", ClidProvider.STATE, "<anonymous>", "(VLru/yandex/logistics/sdk/cargo_form/core/api/repository/FormState;)Lru/yandex/logistics/sdk/cargo_form/core/api/repository/FormState;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.core.impl.repository.FormInternalOverrideRepository$formOverrideFlow$2", f = "FormInternalOverrideRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FormInternalOverrideRepository$formOverrideFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FormInternalOverrideRepository$formOverrideFlow$2 formInternalOverrideRepository$formOverrideFlow$2 = new FormInternalOverrideRepository$formOverrideFlow$2(3, (Continuation) obj3);
        formInternalOverrideRepository$formOverrideFlow$2.L$0 = (j6s) obj2;
        return formInternalOverrideRepository$formOverrideFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        j6s j6sVar = (j6s) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return j6sVar;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
