package com.squareup.cash.blockers.scenarioplan.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.scenarioplan.viewmodels.ScenarioPlanLoadingViewModel;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class ScenarioPlanLoadingViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ ScenarioPlanLoadingViewModel f$0;

    public /* synthetic */ ScenarioPlanLoadingViewKt$$ExternalSyntheticLambda0(ScenarioPlanLoadingViewModel scenarioPlanLoadingViewModel) {
        this.f$0 = scenarioPlanLoadingViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.$r8$classId) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ScenarioPlanLoadingViewModel scenarioPlanLoadingViewModel = this.f$0;
                    boolean z = scenarioPlanLoadingViewModel instanceof ScenarioPlanLoadingViewModel.Loading;
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Strings.LoadableFullScreenContent(scenarioPlanLoadingViewModel, z, ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape), null, null, ScenarioPlanLoadingViewKt.f274lambda$56271650, gapComposer, 196608, 24);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                ScenarioPlanLoadingViewKt.ScenarioPlanLoading(this.f$0, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ScenarioPlanLoadingViewKt$$ExternalSyntheticLambda0(ScenarioPlanLoadingViewModel scenarioPlanLoadingViewModel, int i) {
        this.f$0 = scenarioPlanLoadingViewModel;
    }
}
