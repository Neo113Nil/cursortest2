package com.squareup.cash.p2pblocking.views;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.money.views.MoneyTabToolbarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda8;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSelectionViewModel;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class AllowlistSelectionKt$$ExternalSyntheticLambda2 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AllowlistSelectionViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ AllowlistSelectionKt$$ExternalSyntheticLambda2(AllowlistSelectionViewModel allowlistSelectionViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = allowlistSelectionViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        AllowlistSelectionViewModel allowlistSelectionViewModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    String str = allowlistSelectionViewModel.searchModel.continueButtonText;
                    if (str == null) {
                        gapComposer.startReplaceGroup(201285768);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(201285769);
                        ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                        boolean changed = gapComposer.changed(function1);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (changed || rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new P2PListViewKt$$ExternalSyntheticLambda0(19, function1);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(1957500285, new MoneyTabToolbarKt$$ExternalSyntheticLambda1(str, 15), gapComposer), gapComposer, 1573296, 56);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Countries.PageHeader(Expect_jvmKt.rememberComposableLambda(-634457948, new SuggestionUiKt$$ExternalSyntheticLambda8(allowlistSelectionViewModel, 21), gapComposer2), (Modifier) null, (Function2) null, Expect_jvmKt.rememberComposableLambda(-1880764863, new AllowlistSelectionKt$$ExternalSyntheticLambda6(allowlistSelectionViewModel, function1, 1, (byte) 0), gapComposer2), gapComposer2, 3078, 6);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
