package com.squareup.cash.investing.components.families;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.investing.components.news.InvestingNewsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.viewmodels.families.DependentDisabledStateViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.SendChannel;

/* loaded from: classes6.dex */
public final /* synthetic */ class DependentDisabledStateViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ DependentDisabledStateViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ DependentDisabledStateViewKt$$ExternalSyntheticLambda0(DependentDisabledStateViewModel dependentDisabledStateViewModel, Function1 function1) {
        this.f$0 = dependentDisabledStateViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        DependentDisabledStateViewModel dependentDisabledStateViewModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    Icons icons = Icons.AlertOutline24;
                    String str = dependentDisabledStateViewModel.title;
                    String str2 = dependentDisabledStateViewModel.ctaText;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new InvestingNewsKt$$ExternalSyntheticLambda0(23, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    VisibleKt.ArcadeBannerCard(icons, str, null, null, null, str2, (Function0) rememberedValue, VisibleKt.standard(gapComposer), gapComposer, 6, 28);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                SendChannel.DefaultImpls.DependentDisabledStateView(dependentDisabledStateViewModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DependentDisabledStateViewKt$$ExternalSyntheticLambda0(DependentDisabledStateViewModel dependentDisabledStateViewModel, Function1 function1, int i) {
        this.f$0 = dependentDisabledStateViewModel;
        this.f$1 = function1;
    }
}
