package com.squareup.cash.payments.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import coil3.size.SizeKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.blockers.views.CalendarDatePickerKt;
import com.squareup.cash.moneybot.viewmodels.chat.MessageViewModel;
import com.squareup.cash.moneybot.views.card.InsightBarChartSelectionState;
import com.squareup.cash.moneybot.views.message.ChatMessageUiKt;
import com.squareup.cash.payments.viewmodels.ToolbarViewModel;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda25;
import java.time.LocalDate;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class MainPaymentViewKt$$ExternalSyntheticLambda24 implements Function2 {
    public final /* synthetic */ int $r8$classId = 2;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ boolean f$5;

    public /* synthetic */ MainPaymentViewKt$$ExternalSyntheticLambda24(Modifier modifier, MessageViewModel messageViewModel, boolean z, boolean z2, Function1 function1, InsightBarChartSelectionState insightBarChartSelectionState, int i) {
        this.f$0 = modifier;
        this.f$1 = messageViewModel;
        this.f$4 = z;
        this.f$5 = z2;
        this.f$2 = function1;
        this.f$3 = insightBarChartSelectionState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ToolbarViewModel toolbarViewModel;
        int i = this.$r8$classId;
        Object obj3 = this.f$3;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ToolbarViewModel toolbarViewModel2 = (ToolbarViewModel) obj5;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj4;
                TouchRecorder touchRecorder = (TouchRecorder) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new MainPaymentViewKt$$ExternalSyntheticLambda25(0);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, true, (Function1) rememberedValue);
                    boolean z = toolbarViewModel2.isActionEnabled;
                    boolean changedInstance = gapComposer.changedInstance(toolbarViewModel2) | gapComposer.changed(delegatingSoftwareKeyboardController);
                    Function1 function1 = this.f$2;
                    boolean changed = changedInstance | gapComposer.changed(function1) | gapComposer.changedInstance(touchRecorder);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        toolbarViewModel = toolbarViewModel2;
                        UiWorkflow$$ExternalSyntheticLambda25 uiWorkflow$$ExternalSyntheticLambda25 = new UiWorkflow$$ExternalSyntheticLambda25(toolbarViewModel, delegatingSoftwareKeyboardController, function1, touchRecorder, 11);
                        gapComposer.updateRememberedValue(uiWorkflow$$ExternalSyntheticLambda25);
                        rememberedValue2 = uiWorkflow$$ExternalSyntheticLambda25;
                    } else {
                        toolbarViewModel = toolbarViewModel2;
                    }
                    SizeKt.ButtonCompact((Function0) rememberedValue2, semantics, buttonProminence, false, z, null, Expect_jvmKt.rememberComposableLambda(-77245940, new MainPaymentViewKt$$ExternalSyntheticLambda27(toolbarViewModel, this.f$4, this.f$5), gapComposer), gapComposer, 1573248, 40);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                CalendarDatePickerKt.CalendarDay(this.f$4, (LocalDate) obj5, (LocalDate) obj4, (LocalDate) obj3, this.f$2, this.f$5, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ChatMessageUiKt.ChatMessageUi((Modifier) obj5, (MessageViewModel) obj4, this.f$4, this.f$5, this.f$2, (InsightBarChartSelectionState) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                ((Integer) obj2).getClass();
                AccountPickerScreenKt.Footer((String) obj5, this.f$2, this.f$4, this.f$5, (Function0) obj4, (Set) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MainPaymentViewKt$$ExternalSyntheticLambda24(DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, ToolbarViewModel toolbarViewModel, TouchRecorder touchRecorder, Function1 function1, boolean z, boolean z2) {
        this.f$0 = toolbarViewModel;
        this.f$1 = delegatingSoftwareKeyboardController;
        this.f$2 = function1;
        this.f$3 = touchRecorder;
        this.f$4 = z;
        this.f$5 = z2;
    }

    public /* synthetic */ MainPaymentViewKt$$ExternalSyntheticLambda24(String str, Function1 function1, boolean z, boolean z2, Function0 function0, Set set, int i) {
        this.f$0 = str;
        this.f$2 = function1;
        this.f$4 = z;
        this.f$5 = z2;
        this.f$1 = function0;
        this.f$3 = set;
    }

    public /* synthetic */ MainPaymentViewKt$$ExternalSyntheticLambda24(boolean z, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, Function1 function1, boolean z2, int i) {
        this.f$4 = z;
        this.f$0 = localDate;
        this.f$1 = localDate2;
        this.f$3 = localDate3;
        this.f$2 = function1;
        this.f$5 = z2;
    }
}
