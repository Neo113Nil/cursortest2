package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget;

import defpackage.d6n;
import defpackage.mvg;
import defpackage.n351;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.DynamicContentPhotosWidget$Content$2$1", f = "DynamicContentPhotosWidget.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DynamicContentPhotosWidget$Content$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ n351 $model;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicContentPhotosWidget$Content$2$1(e eVar, n351 n351Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$model = n351Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DynamicContentPhotosWidget$Content$2$1(this.this$0, this.$model, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DynamicContentPhotosWidget$Content$2$1 dynamicContentPhotosWidget$Content$2$1 = (DynamicContentPhotosWidget$Content$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        dynamicContentPhotosWidget$Content$2$1.invokeSuspend(zy11Var);
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
        this.this$0.b.a(((d6n) this.$model).f);
        return zy11.a;
    }
}
