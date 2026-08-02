package ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.widget.sticky_widgets;

import defpackage.lhg;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.on1;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.widget.sticky_widgets.AiChatWidgetKt$AiChatWidget$1$1", f = "AiChatWidget.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AiChatWidgetKt$AiChatWidget$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ lhg $analyticsEventListener;
    final /* synthetic */ on1 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiChatWidgetKt$AiChatWidget$1$1(lhg lhgVar, on1 on1Var, Continuation continuation) {
        super(2, continuation);
        this.$analyticsEventListener = lhgVar;
        this.$state = on1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AiChatWidgetKt$AiChatWidget$1$1(this.$analyticsEventListener, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AiChatWidgetKt$AiChatWidget$1$1 aiChatWidgetKt$AiChatWidget$1$1 = (AiChatWidgetKt$AiChatWidget$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        aiChatWidgetKt$AiChatWidget$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        lhg lhgVar = this.$analyticsEventListener;
        on1 on1Var = this.$state;
        lhg.a(lhgVar, on1Var.f, on1Var.g);
        return zy11.a;
    }
}
