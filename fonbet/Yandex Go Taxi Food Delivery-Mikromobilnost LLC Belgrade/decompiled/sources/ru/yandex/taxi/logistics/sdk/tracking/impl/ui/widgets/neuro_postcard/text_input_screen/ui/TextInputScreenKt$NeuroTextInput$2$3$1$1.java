package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.text_input_screen.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard.text_input_screen.ui.TextInputScreenKt$NeuroTextInput$2$3$1$1", f = "TextInputScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TextInputScreenKt$NeuroTextInput$2$3$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $errorInputMessageMetricaLabel;
    final /* synthetic */ tls $onShown;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputScreenKt$NeuroTextInput$2$3$1$1(tls tlsVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$onShown = tlsVar;
        this.$errorInputMessageMetricaLabel = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextInputScreenKt$NeuroTextInput$2$3$1$1(this.$onShown, this.$errorInputMessageMetricaLabel, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TextInputScreenKt$NeuroTextInput$2$3$1$1 textInputScreenKt$NeuroTextInput$2$3$1$1 = (TextInputScreenKt$NeuroTextInput$2$3$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        textInputScreenKt$NeuroTextInput$2$3$1$1.invokeSuspend(zy11Var);
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
        this.$onShown.invoke(this.$errorInputMessageMetricaLabel);
        return zy11.a;
    }
}
