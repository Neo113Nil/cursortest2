package com.squareup.cash.payments.views;

import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import coil3.size.SizeKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.payments.viewmodels.SchedulePaymentViewModel;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class SchedulePaymentViewKt$$ExternalSyntheticLambda4 implements Function3 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ SchedulePaymentViewModel f$1;

    public /* synthetic */ SchedulePaymentViewKt$$ExternalSyntheticLambda4(SchedulePaymentViewModel schedulePaymentViewModel, Function1 function1) {
        this.f$1 = schedulePaymentViewModel;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Function1 function1 = this.f$0;
        SchedulePaymentViewModel schedulePaymentViewModel = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ScrollingScaffoldContentScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Countries.PageHeader(Room.stringResource(gapComposer, R.string.schedule_payment_title), (Modifier) null, (Function2) null, Room.stringResource(gapComposer, R.string.schedule_payment_subtitle), gapComposer, 0, 6);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                    String stringResource = Room.stringResource(gapComposer, R.string.schedule_payment_frequency_label);
                    TextStyle textStyle = Strings.getTypography(gapComposer).labelMedium;
                    long j = Strings.getColors(gapComposer).semantic.text.subtle;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalScreenMargin;
                    float f = ((Dp) gapComposer.consume(staticProvidableCompositionLocal)).value;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, f, RecyclerView.DECELERATION_RATE, 2);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new MainPaymentViewKt$$ExternalSyntheticLambda25(14);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j, (Composer) gapComposer, SemanticsModifierKt.semantics(m300paddingVpY3zN4$default, false, (Function1) rememberedValue), textStyle, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                    Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(companion, ((Dp) gapComposer.consume(staticProvidableCompositionLocal)).value, RecyclerView.DECELERATION_RATE, 2);
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new UtilKt$$ExternalSyntheticLambda0(28, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    QuickPayViewKt.FrequencyButtons(m300paddingVpY3zN4$default2, (Function1) rememberedValue2, schedulePaymentViewModel.frequencies, schedulePaymentViewModel.selectedFrequency, gapComposer, 0);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                    String stringResource2 = Room.stringResource(gapComposer, R.string.schedule_payment_date_label);
                    TextStyle textStyle2 = Strings.getTypography(gapComposer).labelMedium;
                    long j2 = Strings.getColors(gapComposer).semantic.text.subtle;
                    Modifier m300paddingVpY3zN4$default3 = SpacerKt.m300paddingVpY3zN4$default(companion, ((Dp) gapComposer.consume(staticProvidableCompositionLocal)).value, RecyclerView.DECELERATION_RATE, 2);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new MainPaymentViewKt$$ExternalSyntheticLambda25(15);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, j2, (Composer) gapComposer, SemanticsModifierKt.semantics(m300paddingVpY3zN4$default3, false, (Function1) rememberedValue3), textStyle2, (TextLineBalancing) null, stringResource2, (Map) null, (Function1) null, false);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                    boolean changed2 = gapComposer.changed(function1);
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new UtilKt$$ExternalSyntheticLambda0(29, function1);
                        gapComposer.updateRememberedValue(rememberedValue4);
                    }
                    QuickPayViewKt.WeekDates((Function1) rememberedValue4, schedulePaymentViewModel.dates, schedulePaymentViewModel.selectedDate, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (schedulePaymentViewModel.hasExistingSelection) {
                        gapComposer2.startReplaceGroup(-1904014427);
                        boolean changed3 = gapComposer2.changed(function1);
                        Object rememberedValue5 = gapComposer2.rememberedValue();
                        if (changed3 || rememberedValue5 == neverEqualPolicy) {
                            rememberedValue5 = new WarningDialogViewKt$$ExternalSyntheticLambda5(19, function1);
                            gapComposer2.updateRememberedValue(rememberedValue5);
                        }
                        SizeKt.ButtonCta((Function0) rememberedValue5, null, ButtonProminence.STANDARD, true, false, null, QuickPayViewKt.f548lambda$1625806479, gapComposer2, 1576320, 50);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1903745533);
                        boolean changed4 = gapComposer2.changed(function1);
                        Object rememberedValue6 = gapComposer2.rememberedValue();
                        if (changed4 || rememberedValue6 == neverEqualPolicy) {
                            rememberedValue6 = new WarningDialogViewKt$$ExternalSyntheticLambda5(20, function1);
                            gapComposer2.updateRememberedValue(rememberedValue6);
                        }
                        SizeKt.ButtonCta((Function0) rememberedValue6, null, ButtonProminence.STANDARD, false, false, null, QuickPayViewKt.f546lambda$1137985784, gapComposer2, 1573248, 58);
                        gapComposer2.end(false);
                    }
                    boolean changed5 = gapComposer2.changed(function1);
                    Object rememberedValue7 = gapComposer2.rememberedValue();
                    if (changed5 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new WarningDialogViewKt$$ExternalSyntheticLambda5(21, function1);
                        gapComposer2.updateRememberedValue(rememberedValue7);
                    }
                    SizeKt.ButtonCta((Function0) rememberedValue7, null, ButtonProminence.PROMINENT, false, false, null, QuickPayViewKt.lambda$854534700, gapComposer2, 1573248, 58);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SchedulePaymentViewKt$$ExternalSyntheticLambda4(Function1 function1, SchedulePaymentViewModel schedulePaymentViewModel) {
        this.f$0 = function1;
        this.f$1 = schedulePaymentViewModel;
    }
}
