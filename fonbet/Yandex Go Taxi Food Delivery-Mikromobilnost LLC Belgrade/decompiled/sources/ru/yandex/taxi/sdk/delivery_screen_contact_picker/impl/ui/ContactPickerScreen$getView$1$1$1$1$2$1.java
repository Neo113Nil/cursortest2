package ru.yandex.taxi.sdk.delivery_screen_contact_picker.impl.ui;

import android.content.Intent;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yd00;
import defpackage.ye;
import defpackage.yur;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.sdk.delivery_screen_contact_picker.impl.ui.ContactPickerScreen$getView$1$1$1$1$2$1", f = "ContactPickerScreen.kt", l = {82}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ContactPickerScreen$getView$1$1$1$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ Intent $externalContactPickerIntent;
    final /* synthetic */ yd00 $externalContactPickerLauncher;
    final /* synthetic */ yur $focusRequester;
    final /* synthetic */ d $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactPickerScreen$getView$1$1$1$1$2$1(d dVar, yur yurVar, yd00 yd00Var, Intent intent, Continuation continuation) {
        super(2, continuation);
        this.$viewModel = dVar;
        this.$focusRequester = yurVar;
        this.$externalContactPickerLauncher = yd00Var;
        this.$externalContactPickerIntent = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ContactPickerScreen$getView$1$1$1$1$2$1(this.$viewModel, this.$focusRequester, this.$externalContactPickerLauncher, this.$externalContactPickerIntent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ContactPickerScreen$getView$1$1$1$1$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n0 n0Var = this.$viewModel.F;
            ye yeVar = new ye(4, this.$focusRequester, this.$externalContactPickerLauncher, this.$externalContactPickerIntent);
            this.label = 1;
            n0Var.getClass();
            if (n0.m(n0Var, yeVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ny61.A();
        return null;
    }
}
