package com.squareup.cash.paychecks.views;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.offers.views.home.OffersHomeV2Kt$$ExternalSyntheticLambda7;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.paychecks.viewmodels.EditDistributionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class EditDistributionViewKt$$ExternalSyntheticLambda8 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EditDistributionViewModel.Content f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ EditDistributionViewKt$$ExternalSyntheticLambda8(EditDistributionViewModel.Content content, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = content;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        EditDistributionViewModel.Content content = this.f$0;
        switch (i) {
            case 0:
                ColumnScope columnScope = (ColumnScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                columnScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(columnScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    SpacerKt.Spacer(gapComposer, columnScope.weight(2.0f, SizeKt.fillMaxWidth(companion, 1.0f), true));
                    HelpSheetViewKt.Controls(0, gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, 44.0f, RecyclerView.DECELERATION_RATE, 44.0f, 32.0f, 2), content, function1);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                    boolean z = content.primaryAction.enabled;
                    boolean changed = gapComposer2.changed(function1) | gapComposer2.changedInstance(content);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new OffersHomeV2Kt$$ExternalSyntheticLambda7(20, function1, content);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, z, null, Expect_jvmKt.rememberComposableLambda(-692558765, new P2PListViewKt$$ExternalSyntheticLambda12(content, 29), gapComposer2), gapComposer2, 1573296, 40);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                Modifier modifier = (Modifier) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                modifier.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(modifier) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    HelpSheetViewKt.Footer((intValue3 << 6) & 896, gapComposer3, modifier, content, function1);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
