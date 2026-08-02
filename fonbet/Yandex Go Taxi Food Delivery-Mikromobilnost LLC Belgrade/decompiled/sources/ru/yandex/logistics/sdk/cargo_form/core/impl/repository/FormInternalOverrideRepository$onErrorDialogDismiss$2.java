package ru.yandex.logistics.sdk.cargo_form.core.impl.repository;

import defpackage.mvg;
import defpackage.nv8;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wth;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.core.impl.repository.FormInternalOverrideRepository$onErrorDialogDismiss$2", f = "FormInternalOverrideRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FormInternalOverrideRepository$onErrorDialogDismiss$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormInternalOverrideRepository$onErrorDialogDismiss$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FormInternalOverrideRepository$onErrorDialogDismiss$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        FormInternalOverrideRepository$onErrorDialogDismiss$2 formInternalOverrideRepository$onErrorDialogDismiss$2 = (FormInternalOverrideRepository$onErrorDialogDismiss$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        formInternalOverrideRepository$onErrorDialogDismiss$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ((com.yandex.go.logistics.cargo_flow.a) ((nv8) this.this$0.g.b).b.a.b).r(new wth(5));
        return zy11.a;
    }
}
