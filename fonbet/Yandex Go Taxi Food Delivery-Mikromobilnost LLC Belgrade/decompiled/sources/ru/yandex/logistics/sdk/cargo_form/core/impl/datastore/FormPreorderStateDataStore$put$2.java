package ru.yandex.logistics.sdk.cargo_form.core.impl.datastore;

import defpackage.ez40;
import defpackage.kme0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lez40;", Constants.KEY_DATA, "Lzy11;", "<anonymous>", "(Lez40;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.core.impl.datastore.FormPreorderStateDataStore$put$2", f = "FormPreorderStateDataStore.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FormPreorderStateDataStore$put$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $mode;
    final /* synthetic */ FormStateRestoreModel $model;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormPreorderStateDataStore$put$2(String str, c cVar, FormStateRestoreModel formStateRestoreModel, Continuation continuation) {
        super(2, continuation);
        this.$mode = str;
        this.this$0 = cVar;
        this.$model = formStateRestoreModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FormPreorderStateDataStore$put$2 formPreorderStateDataStore$put$2 = new FormPreorderStateDataStore$put$2(this.$mode, this.this$0, this.$model, continuation);
        formPreorderStateDataStore$put$2.L$0 = obj;
        return formPreorderStateDataStore$put$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        FormPreorderStateDataStore$put$2 formPreorderStateDataStore$put$2 = (FormPreorderStateDataStore$put$2) create((ez40) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        formPreorderStateDataStore$put$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ez40 ez40Var = (ez40) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ez40Var.g(new kme0(this.$mode), this.this$0.b.toJson(this.$model));
        return zy11.a;
    }
}
