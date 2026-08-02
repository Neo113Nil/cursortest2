package com.squareup.cash.crypto.common.views;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.input.InputChipGridScope;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda2;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.crypto.common.viewmodels.BitcoinP2pConversionPercentageViewModel;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda2;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class BitcoinP2pConversionPercentageViewKt$$ExternalSyntheticLambda5 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BitcoinP2pConversionPercentageViewModel.Content f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ BitcoinP2pConversionPercentageViewKt$$ExternalSyntheticLambda5(BitcoinP2pConversionPercentageViewModel.Content content, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = content;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        final Function1 function1 = this.f$1;
        BitcoinP2pConversionPercentageViewModel.Content content = this.f$0;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = false;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    String str = content.title;
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(22, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.TitleBarSub(str, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 48, 108);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                InputChipGridScope inputChipGridScope = (InputChipGridScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                inputChipGridScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(inputChipGridScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    for (BitcoinP2pConversionPercentageViewModel.Content.PickerOption pickerOption : content.pickerOptions) {
                        if (pickerOption.isCustom) {
                            gapComposer2.startReplaceGroup(4122650);
                            boolean z5 = pickerOption.isSelected;
                            String str2 = pickerOption.accessibilityHint;
                            boolean changed2 = gapComposer2.changed(function1);
                            Object rememberedValue2 = gapComposer2.rememberedValue();
                            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                rememberedValue2 = new CaptureCheckFaceKt$$ExternalSyntheticLambda2(23, function1);
                                gapComposer2.updateRememberedValue(rememberedValue2);
                            }
                            GapComposer gapComposer3 = gapComposer2;
                            inputChipGridScope.InputChip(((intValue2 << 18) & 3670016) | 6, 34, (Composer) gapComposer3, BitcoinP2pConversionPercentageViewKt.lambda$147432236, (Modifier) null, str2, (Function0) rememberedValue2, z5, false);
                            gapComposer2 = gapComposer3;
                            gapComposer2.end(false);
                        } else {
                            gapComposer2.startReplaceGroup(4402301);
                            String str3 = pickerOption.label;
                            boolean z6 = pickerOption.isSelected;
                            String str4 = pickerOption.accessibilityHint;
                            boolean changed3 = gapComposer2.changed(function1) | gapComposer2.changedInstance(pickerOption);
                            Object rememberedValue3 = gapComposer2.rememberedValue();
                            if (changed3 || rememberedValue3 == neverEqualPolicy) {
                                rememberedValue3 = new ArcadeModal2Kt$$ExternalSyntheticLambda2(10, function1, pickerOption);
                                gapComposer2.updateRememberedValue(rememberedValue3);
                            }
                            inputChipGridScope.InputChip(str3, (Modifier) null, str4, (Function0) rememberedValue3, z6, false, (Composer) gapComposer2, (intValue2 << 18) & 3670016, 34);
                            gapComposer2.end(false);
                        }
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    final BitcoinP2pConversionPercentageViewModel.Content.Action action = content.secondaryAction;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (action == null) {
                        gapComposer4.startReplaceGroup(-1276336892);
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(-1276336891);
                        ButtonProminence buttonProminence = ButtonProminence.STANDARD;
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                        boolean changed4 = gapComposer4.changed(function1) | gapComposer4.changedInstance(action);
                        Object rememberedValue4 = gapComposer4.rememberedValue();
                        Object obj4 = rememberedValue4;
                        if (changed4 || rememberedValue4 == neverEqualPolicy) {
                            final boolean z7 = z3 ? 1 : 0;
                            Function0 function0 = new Function0() { // from class: com.squareup.cash.crypto.common.views.BitcoinP2pConversionPercentageViewKt$$ExternalSyntheticLambda20
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i2 = z7;
                                    BitcoinP2pConversionPercentageViewModel.Content.Action action2 = action;
                                    Function1 function12 = function1;
                                    switch (i2) {
                                        case 0:
                                            function12.invoke(action2.event);
                                            break;
                                        default:
                                            function12.invoke(action2.event);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer4.updateRememberedValue(function0);
                            obj4 = function0;
                        }
                        final boolean z8 = z4 ? 1 : 0;
                        coil3.size.SizeKt.ButtonCta((Function0) obj4, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(-424469397, new Function3() { // from class: com.squareup.cash.crypto.common.views.BitcoinP2pConversionPercentageViewKt$$ExternalSyntheticLambda21
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                int i2 = z8;
                                BitcoinP2pConversionPercentageViewModel.Content.Action action2 = action;
                                switch (i2) {
                                    case 0:
                                        Composer composer4 = (Composer) obj6;
                                        int intValue4 = ((Integer) obj7).intValue();
                                        ((RowScope) obj5).getClass();
                                        GapComposer gapComposer5 = (GapComposer) composer4;
                                        if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, action2.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer5.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer5 = (Composer) obj6;
                                        int intValue5 = ((Integer) obj7).intValue();
                                        ((RowScope) obj5).getClass();
                                        GapComposer gapComposer6 = (GapComposer) composer5;
                                        if (gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, action2.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer6.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer4), gapComposer4, 1573296, 56);
                        gapComposer4.end(false);
                    }
                    final BitcoinP2pConversionPercentageViewModel.Content.Action action2 = content.primaryAction;
                    if (action2 == null) {
                        gapComposer4.startReplaceGroup(-1276069021);
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(-1276069020);
                        ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                        boolean changed5 = gapComposer4.changed(function1) | gapComposer4.changedInstance(action2);
                        Object rememberedValue5 = gapComposer4.rememberedValue();
                        Object obj5 = rememberedValue5;
                        if (changed5 || rememberedValue5 == neverEqualPolicy) {
                            final boolean z9 = z ? 1 : 0;
                            Function0 function02 = new Function0() { // from class: com.squareup.cash.crypto.common.views.BitcoinP2pConversionPercentageViewKt$$ExternalSyntheticLambda20
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i2 = z9;
                                    BitcoinP2pConversionPercentageViewModel.Content.Action action22 = action2;
                                    Function1 function12 = function1;
                                    switch (i2) {
                                        case 0:
                                            function12.invoke(action22.event);
                                            break;
                                        default:
                                            function12.invoke(action22.event);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer4.updateRememberedValue(function02);
                            obj5 = function02;
                        }
                        final boolean z10 = z2 ? 1 : 0;
                        coil3.size.SizeKt.ButtonCta((Function0) obj5, fillMaxWidth2, buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(124074900, new Function3() { // from class: com.squareup.cash.crypto.common.views.BitcoinP2pConversionPercentageViewKt$$ExternalSyntheticLambda21
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj52, Object obj6, Object obj7) {
                                int i2 = z10;
                                BitcoinP2pConversionPercentageViewModel.Content.Action action22 = action2;
                                switch (i2) {
                                    case 0:
                                        Composer composer4 = (Composer) obj6;
                                        int intValue4 = ((Integer) obj7).intValue();
                                        ((RowScope) obj52).getClass();
                                        GapComposer gapComposer5 = (GapComposer) composer4;
                                        if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, action22.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer5.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer5 = (Composer) obj6;
                                        int intValue5 = ((Integer) obj7).intValue();
                                        ((RowScope) obj52).getClass();
                                        GapComposer gapComposer6 = (GapComposer) composer5;
                                        if (gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, action22.text, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer6.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer4), gapComposer4, 1573296, 56);
                        gapComposer4.end(false);
                    }
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
