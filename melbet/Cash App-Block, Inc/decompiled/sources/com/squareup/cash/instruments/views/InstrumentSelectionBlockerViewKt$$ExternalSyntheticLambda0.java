package com.squareup.cash.instruments.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.room.util.DBUtil;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.initialscreenloader.views.AppUpgradeViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionBlockerViewModel;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda1;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class InstrumentSelectionBlockerViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InstrumentSelectionBlockerViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ InstrumentSelectionBlockerViewKt$$ExternalSyntheticLambda0(InstrumentSelectionBlockerViewModel instrumentSelectionBlockerViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = instrumentSelectionBlockerViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1623010377, new InstrumentSelectionBlockerViewKt$$ExternalSyntheticLambda0(this.f$0, function1, i2), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    InstrumentSelectionBlockerViewModel instrumentSelectionBlockerViewModel = this.f$0;
                    Strings.LoadableFullScreenContent(instrumentSelectionBlockerViewModel, instrumentSelectionBlockerViewModel instanceof InstrumentSelectionBlockerViewModel.Loading, null, null, null, Expect_jvmKt.rememberComposableLambda(-1611701238, new HeroCardViewKt$$ExternalSyntheticLambda1(function1, false, 3), gapComposer2), gapComposer2, 196608, 28);
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new AppUpgradeViewKt$$ExternalSyntheticLambda7(11, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer2, 0, 1);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
