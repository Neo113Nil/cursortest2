package com.squareup.cash.growtools.views.manager;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda1;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class GrowToolsManagerView$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GrowToolsManagerViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ GrowToolsManagerView$$ExternalSyntheticLambda1(GrowToolsManagerViewModel growToolsManagerViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = growToolsManagerViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        int i2 = 2;
        int i3 = 1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1146648683, new GrowToolsManagerView$$ExternalSyntheticLambda1(this.f$0, function1, i3), gapComposer), gapComposer, 3072, 7);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    GrowToolsManagerViewModel growToolsManagerViewModel = this.f$0;
                    Strings.LoadableFullScreenContent(growToolsManagerViewModel, growToolsManagerViewModel instanceof GrowToolsManagerViewModel.Loading, null, null, null, Expect_jvmKt.rememberComposableLambda(1622411278, new HeroCardViewKt$$ExternalSyntheticLambda1(function1, r2, i2), gapComposer2), gapComposer2, 196608, 28);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
