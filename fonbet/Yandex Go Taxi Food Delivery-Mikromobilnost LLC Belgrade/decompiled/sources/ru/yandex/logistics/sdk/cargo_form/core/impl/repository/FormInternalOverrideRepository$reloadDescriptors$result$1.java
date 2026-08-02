package ru.yandex.logistics.sdk.cargo_form.core.impl.repository;

import defpackage.j6s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lfpc;", "Ln4s;", "<anonymous>", "(Ltse;)Lfpc;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.core.impl.repository.FormInternalOverrideRepository$reloadDescriptors$result$1", f = "FormInternalOverrideRepository.kt", l = {102}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FormInternalOverrideRepository$reloadDescriptors$result$1 extends SuspendLambda implements wls {
    final /* synthetic */ j6s $state;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormInternalOverrideRepository$reloadDescriptors$result$1(b bVar, j6s j6sVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$state = j6sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FormInternalOverrideRepository$reloadDescriptors$result$1(this.this$0, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FormInternalOverrideRepository$reloadDescriptors$result$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ru.yandex.logistics.sdk.cargo_form.core.impl.data.a aVar = this.this$0.c;
        j6s j6sVar = this.$state;
        this.label = 1;
        Object a = aVar.a(j6sVar, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
