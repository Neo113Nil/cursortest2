package androidx.navigation;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.ui.ArcadeBottomSheetStyle;
import java.util.List;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes3.dex */
public abstract class Navigation {
    public static final ArcadeBottomSheetStyle ArcadeBottomSheetStyle(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        return new ArcadeBottomSheetStyle(colors);
    }

    public static final NavHostController findNavController(View view) {
        view.getClass();
        NavHostController navHostController = (NavHostController) SequencesKt___SequencesKt.firstOrNull(SequencesKt___SequencesKt.mapNotNull(SequencesKt__SequencesKt.generateSequence(new Navigation$$ExternalSyntheticLambda1(0), view), new Navigation$$ExternalSyntheticLambda1(20)));
        if (navHostController != null) {
            return navHostController;
        }
        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("View ", view, " does not have a NavController set");
        return null;
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewBenefitsHub.deepLinkSpecs;
    }

    public static final ArcadeBottomSheetStyle ArcadeBottomSheetStyle(View view) {
        view.getClass();
        return new ArcadeBottomSheetStyle(ThemeHelpersKt.themeInfo(view).arcadeColors);
    }
}
