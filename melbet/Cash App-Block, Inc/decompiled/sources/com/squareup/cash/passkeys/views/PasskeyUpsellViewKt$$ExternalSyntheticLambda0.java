package com.squareup.cash.passkeys.views;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.ui.Modifier;
import androidx.room.util.DBUtil;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.passkeys.viewmodels.PasskeyUpsellViewModel;
import com.squareup.cash.paychecks.views.HelpSheetViewKt$$ExternalSyntheticLambda2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class PasskeyUpsellViewKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PasskeyUpsellViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ PasskeyUpsellViewKt$$ExternalSyntheticLambda0(PasskeyUpsellViewModel passkeyUpsellViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = passkeyUpsellViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Function1 function1 = this.f$1;
        PasskeyUpsellViewModel passkeyUpsellViewModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    gapComposer.skipToGroupEnd();
                } else if (passkeyUpsellViewModel.skippable) {
                    gapComposer.startReplaceGroup(-2015173820);
                    NavigationType navigationType = NavigationType.CLOSE;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new HelpSheetViewKt$$ExternalSyntheticLambda2(12, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.TitleBarSub("", navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer, 54, 108);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-2014990393);
                    DBUtil.TitleBarSub("", NavigationType.NONE, (Modifier) null, (DynamicColorConfiguration) null, (Function0) null, (Modifier) null, (Function3) null, gapComposer, 54, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                    gapComposer.end(false);
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    boolean z = passkeyUpsellViewModel.skippable;
                    boolean z2 = passkeyUpsellViewModel.isRegistering;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (z) {
                        gapComposer2.startReplaceGroup(-1395085098);
                        boolean z3 = !z2;
                        ButtonProminence buttonProminence = ButtonProminence.STANDARD;
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                        boolean changed2 = gapComposer2.changed(function1);
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (changed2 || rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new HelpSheetViewKt$$ExternalSyntheticLambda2(13, function1);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth, buttonProminence, false, z3, null, PasskeyUpsellViewKt.f533lambda$1208828901, gapComposer2, 1573296, 40);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1394780089);
                        gapComposer2.end(false);
                    }
                    boolean z4 = !z2;
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed3 = gapComposer2.changed(function1);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new HelpSheetViewKt$$ExternalSyntheticLambda2(14, function1);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, fillMaxWidth2, buttonProminence2, false, z4, null, PasskeyUpsellViewKt.f536lambda$1835735210, gapComposer2, 1573296, 40);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
