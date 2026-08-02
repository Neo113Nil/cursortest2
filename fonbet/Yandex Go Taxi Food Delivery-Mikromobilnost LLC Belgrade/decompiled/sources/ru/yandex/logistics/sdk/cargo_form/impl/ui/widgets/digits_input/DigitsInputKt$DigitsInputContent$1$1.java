package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.digits_input;

import defpackage.eja1;
import defpackage.hoy0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.xjj;
import defpackage.yur;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.digits_input.DigitsInputKt$DigitsInputContent$1$1", f = "DigitsInput.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DigitsInputKt$DigitsInputContent$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ yur $focusRequester;
    final /* synthetic */ xjj $model;
    final /* synthetic */ oz40 $textFieldValue$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigitsInputKt$DigitsInputContent$1$1(xjj xjjVar, yur yurVar, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$model = xjjVar;
        this.$focusRequester = yurVar;
        this.$textFieldValue$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DigitsInputKt$DigitsInputContent$1$1(this.$model, this.$focusRequester, this.$textFieldValue$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DigitsInputKt$DigitsInputContent$1$1 digitsInputKt$DigitsInputContent$1$1 = (DigitsInputKt$DigitsInputContent$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        digitsInputKt$DigitsInputContent$1$1.invokeSuspend(zy11Var);
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
        if (this.$model.d) {
            yur.b(this.$focusRequester);
            oz40 oz40Var = this.$textFieldValue$delegate;
            hoy0 hoy0Var = (hoy0) oz40Var.getValue();
            int length = ((hoy0) this.$textFieldValue$delegate.getValue()).a.b.length();
            oz40Var.setValue(hoy0.a(hoy0Var, null, eja1.c(length, length), 5));
        }
        return zy11.a;
    }
}
