package ru.yandex.taxi.logistics.sdk.tracking.impl.manual_tips.ui;

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
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.manual_tips.ui.ManualTipScreenKt$TipInput$4$1", f = "ManualTipScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ManualTipScreenKt$TipInput$4$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $errorMessage;
    final /* synthetic */ tls $onErrorShown;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualTipScreenKt$TipInput$4$1(tls tlsVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$errorMessage = str;
        this.$onErrorShown = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ManualTipScreenKt$TipInput$4$1(this.$onErrorShown, this.$errorMessage, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ManualTipScreenKt$TipInput$4$1 manualTipScreenKt$TipInput$4$1 = (ManualTipScreenKt$TipInput$4$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        manualTipScreenKt$TipInput$4$1.invokeSuspend(zy11Var);
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
        String str = this.$errorMessage;
        if (str != null) {
            this.$onErrorShown.invoke(str);
        }
        return zy11.a;
    }
}
