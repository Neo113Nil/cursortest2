package com.squareup.cash.money.views;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import app.cash.local.viewmodels.LocalCheckoutSpecialInstructionsViewModel;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneyTabUIKt$$ExternalSyntheticLambda37 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Function f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ float f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Modifier f$5;
    public final /* synthetic */ int f$6;

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda37(ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, int i, float f, ComposableLambdaImpl composableLambdaImpl3, Modifier modifier, int i2, int i3) {
        this.f$0 = composableLambdaImpl;
        this.f$1 = composableLambdaImpl2;
        this.f$2 = i;
        this.f$3 = f;
        this.f$4 = composableLambdaImpl3;
        this.f$5 = modifier;
        this.f$6 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        Object obj3 = this.f$4;
        Object obj4 = this.f$0;
        Function function = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(24631);
                MoneyTabUIKt.MoneyTabScaffold((ComposableLambdaImpl) obj4, (ComposableLambdaImpl) function, this.f$2, this.f$3, (ComposableLambdaImpl) obj3, this.f$5, this.f$6, (Composer) obj, updateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                CheckoutTipSectionKt.m1304CheckoutSpecialInstructionsSectionFJfuzF0((LocalCheckoutSpecialInstructionsViewModel) obj4, (Function1) function, this.f$5, (PaddingValues) obj3, this.f$3, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$6);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                Modifier modifier = this.f$5;
                KeypadKt.m3655ToolbarFJfuzF0(modifier, (Function2) function, (ComposableLambdaImpl) obj4, (Function3) obj3, this.f$3, (Composer) obj, updateChangedFlags2, this.f$6);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda37(Modifier modifier, Function2 function2, ComposableLambdaImpl composableLambdaImpl, Function3 function3, float f, int i, int i2) {
        this.f$5 = modifier;
        this.f$1 = function2;
        this.f$0 = composableLambdaImpl;
        this.f$4 = function3;
        this.f$3 = f;
        this.f$2 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ MoneyTabUIKt$$ExternalSyntheticLambda37(LocalCheckoutSpecialInstructionsViewModel localCheckoutSpecialInstructionsViewModel, Function1 function1, Modifier modifier, PaddingValues paddingValues, float f, int i, int i2) {
        this.f$0 = localCheckoutSpecialInstructionsViewModel;
        this.f$1 = function1;
        this.f$5 = modifier;
        this.f$4 = paddingValues;
        this.f$3 = f;
        this.f$2 = i;
        this.f$6 = i2;
    }
}
