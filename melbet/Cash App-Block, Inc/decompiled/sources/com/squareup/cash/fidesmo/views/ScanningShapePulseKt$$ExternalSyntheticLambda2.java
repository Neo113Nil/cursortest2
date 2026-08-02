package com.squareup.cash.fidesmo.views;

import androidx.collection.internal.RuntimeHelpersKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavDestination;
import app.cash.local.viewmodels.LocalCheckoutPaymentSectionViewModel;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import com.squareup.cash.core.navigationcontainer.UiContainerKt;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ScanningShapePulseKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ ScanningShapePulseKt$$ExternalSyntheticLambda2(Modifier modifier, MoneybotChatViewModel.Content.Chat chat, LazyListState lazyListState, float f, Function1 function1, int i) {
        this.$r8$classId = 3;
        this.f$0 = modifier;
        this.f$1 = chat;
        this.f$3 = lazyListState;
        this.f$2 = f;
        this.f$4 = function1;
        this.f$5 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$1;
        int i2 = this.f$5;
        Object obj4 = this.f$4;
        Object obj5 = this.f$3;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                ScanningShapePulseKt.ScanningShapePulseContent((Modifier) obj6, (ScanningShapePulseParams) obj3, this.f$2, (ScanningStepAnimation) obj5, (ScanningStabilityAnimation) obj4, (Composer) obj, updateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                CheckoutTipSectionKt.m1305ExpandablePaymentMethodSection942rkJo((String) obj6, (LocalCheckoutPaymentSectionViewModel) obj3, this.f$2, (PaddingValues) obj5, (Function1) obj4, (Composer) obj, updateChangedFlags2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                UiContainerKt.FabTab((Function1) obj3, (Function1) obj5, (Function1) obj4, this.f$2, (Modifier) obj6, (Composer) obj, updateChangedFlags3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(i2 | 1);
                RuntimeHelpersKt.m135MoneybotMessageListhGBTI10((Modifier) obj6, (MoneybotChatViewModel.Content.Chat) obj3, (LazyListState) obj5, this.f$2, (Function1) obj4, (Composer) obj, updateChangedFlags4);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags5 = Updater.updateChangedFlags(i2 | 1);
                NavDestination.Companion.SheetCrossfade(this.f$1, this.f$2, (Modifier) obj6, (Function1) obj5, (ComposableLambdaImpl) obj4, (Composer) obj, updateChangedFlags5);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ScanningShapePulseKt$$ExternalSyntheticLambda2(Object obj, float f, Modifier modifier, Function1 function1, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = 4;
        this.f$1 = obj;
        this.f$2 = f;
        this.f$0 = modifier;
        this.f$3 = function1;
        this.f$4 = composableLambdaImpl;
        this.f$5 = i;
    }

    public /* synthetic */ ScanningShapePulseKt$$ExternalSyntheticLambda2(Object obj, Object obj2, float f, Object obj3, Object obj4, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = f;
        this.f$3 = obj3;
        this.f$4 = obj4;
        this.f$5 = i;
    }

    public /* synthetic */ ScanningShapePulseKt$$ExternalSyntheticLambda2(Function1 function1, Function1 function12, Function1 function13, float f, Modifier modifier, int i) {
        this.$r8$classId = 2;
        this.f$1 = function1;
        this.f$3 = function12;
        this.f$4 = function13;
        this.f$2 = f;
        this.f$0 = modifier;
        this.f$5 = i;
    }
}
