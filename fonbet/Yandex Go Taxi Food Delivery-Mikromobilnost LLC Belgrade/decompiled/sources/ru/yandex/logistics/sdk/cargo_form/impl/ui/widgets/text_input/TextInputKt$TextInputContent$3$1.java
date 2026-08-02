package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text_input;

import defpackage.eja1;
import defpackage.hoy0;
import defpackage.jl40;
import defpackage.jpy0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text_input.TextInputKt$TextInputContent$3$1", f = "TextInput.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TextInputKt$TextInputContent$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ jpy0 $model;
    final /* synthetic */ oz40 $text$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputKt$TextInputContent$3$1(jpy0 jpy0Var, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$model = jpy0Var;
        this.$text$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextInputKt$TextInputContent$3$1(this.$model, this.$text$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TextInputKt$TextInputContent$3$1 textInputKt$TextInputContent$3$1 = (TextInputKt$TextInputContent$3$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        textInputKt$TextInputContent$3$1.invokeSuspend(zy11Var);
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
        if (!jl40.l(((hoy0) this.$text$delegate.getValue()).a.b, this.$model.c)) {
            oz40 oz40Var = this.$text$delegate;
            String str = this.$model.c;
            int length = str.length();
            oz40Var.setValue(new hoy0(str, eja1.c(length, length), 4));
        }
        return zy11.a;
    }
}
