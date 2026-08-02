package com.squareup.cash.family.safetyhub.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.room.Room;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda9;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda3;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda0;
import com.squareup.cash.family.familyhub.views.FamilyHomeSectionsKt$$ExternalSyntheticLambda6;
import com.squareup.cash.family.safetyhub.viewmodels.SafetyEducationPageViewModel;
import com.squareup.cash.favorites.components.AddFavoritesViewKt$$ExternalSyntheticLambda15;
import com.squareup.protos.cash.aegis.core.ColoredString;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.util.cash.StringsKt;
import com.squareup.workflow1.Worker;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;

/* loaded from: classes6.dex */
public abstract class MultiColorPageTitleKt {

    /* renamed from: lambda$-1377618438, reason: not valid java name */
    public static final ComposableLambdaImpl f418lambda$1377618438 = new ComposableLambdaImpl(new AddFavoritesViewKt$$ExternalSyntheticLambda15(19), false, -1377618438);

    static {
        new ComposableLambdaImpl(new FamilyHomeSectionsKt$$ExternalSyntheticLambda6(17), false, 227400344);
    }

    public static final void MultiColorPageTitle(int i, Composer composer, List list) {
        Color m;
        list.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1792268707);
        int i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            gapComposer.startReplaceGroup(-88338723);
            AnnotatedString.Builder builder = new AnnotatedString.Builder();
            gapComposer.startReplaceGroup(-88337367);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ColoredString coloredString = (ColoredString) it.next();
                com.squareup.protos.cash.ui.Color color = coloredString.color;
                if (color == null) {
                    gapComposer.startReplaceGroup(-88326206);
                    gapComposer.end(false);
                    m = null;
                } else {
                    m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -557038561, color, gapComposer, false);
                }
                builder.pushStyle(new SpanStyle(m != null ? m.value : Color.Unspecified, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER));
                LocalizedString localizedString = coloredString.text;
                Worker.DefaultImpls.appendMarkdown$default(builder, localizedString != null ? StringsKt.translated(localizedString) : "", null, 6);
                builder.pop();
            }
            gapComposer.end(false);
            AnnotatedString annotatedString = builder.toAnnotatedString();
            gapComposer.end(false);
            Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, annotatedString, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).pageTitle, (TextLineBalancing) null, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda9(i, 4, list);
        }
    }

    public static final void SafetyEducationPageView(SafetyEducationPageViewModel safetyEducationPageViewModel, Function1 function1, Composer composer, int i) {
        safetyEducationPageViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-826708267);
        int i2 = (gapComposer.changedInstance(safetyEducationPageViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(SpacerKt.systemBarsPadding(Modifier.Companion.$$INSTANCE), 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            ScreenScaffoldKt.ScreenScaffoldColumn(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape), null, null, Expect_jvmKt.rememberComposableLambda(-1598720003, new ArcadeModal2Kt$$ExternalSyntheticLambda0(19, safetyEducationPageViewModel, function1), gapComposer), null, Expect_jvmKt.rememberComposableLambda(562249171, new ArcadeModal$$ExternalSyntheticLambda3(safetyEducationPageViewModel, 22), gapComposer), gapComposer, 199680, 22);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SafetyHubUiFactory$$ExternalSyntheticLambda2(safetyEducationPageViewModel, function1, i);
        }
    }
}
