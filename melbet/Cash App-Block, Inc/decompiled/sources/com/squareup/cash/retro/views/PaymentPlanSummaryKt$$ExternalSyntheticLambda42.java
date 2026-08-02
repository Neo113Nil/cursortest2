package com.squareup.cash.retro.views;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.avatar.components.StackedAvatarsKt;
import com.squareup.cash.earnings.views.streamdetail.EarningsStreamDetailKt;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.savings.views.CelebrationKt$$ExternalSyntheticLambda1;
import com.squareup.cash.ui.widget.StackedAvatarView$TextSize;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class PaymentPlanSummaryKt$$ExternalSyntheticLambda42 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StackedAvatarViewModel.Single f$0;

    public /* synthetic */ PaymentPlanSummaryKt$$ExternalSyntheticLambda42(StackedAvatarViewModel.Single single, int i) {
        this.$r8$classId = 2;
        this.f$0 = single;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        StackedAvatarViewModel.Single single = this.f$0;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i2 = 2;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new CelebrationKt$$ExternalSyntheticLambda1(i2);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    AvatarsKt.Avatar(AvatarSize.Size32, this.f$0, SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue), null, new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(17), gapComposer, 70, 8);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    TextViewKt.Avatar(AvatarSize.Size64, AvatarsKt.toAvatarEntry(single.avatar, null, null, gapComposer2, 8, 3), null, false, gapComposer2, 6, 28);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                EarningsStreamDetailKt.AvatarOrShimmer(single, (Composer) obj, Updater.updateChangedFlags(9));
                break;
            case 3:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    TextViewKt.Avatar(AvatarSize.Size48, AvatarsKt.toAvatarEntry(single.avatar, null, null, gapComposer3, 8, 3), null, false, gapComposer3, 6, 28);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 4:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    StackedAvatarsKt.StackedAvatars(this.f$0, new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(19), SizeKt.m285size3ABfNKs(companion, 40.0f), StackedAvatarView$TextSize.SMALL, gapComposer4, 3464, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            default:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    StackedAvatarsKt.StackedAvatars(this.f$0, new PaymentPlanSummaryKt$$ExternalSyntheticLambda11(18), SizeKt.m285size3ABfNKs(companion, 63.0f), StackedAvatarView$TextSize.LARGE, gapComposer5, 3464, 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PaymentPlanSummaryKt$$ExternalSyntheticLambda42(StackedAvatarViewModel.Single single, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = single;
    }
}
