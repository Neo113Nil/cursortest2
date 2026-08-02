package com.squareup.cash.investing.components.categories;

import android.view.View;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda4;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.globalsearch.views.QuickAccessBarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.google.pay.GooglePayPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda10;
import com.squareup.cash.history.views.SkipPaymentView$$ExternalSyntheticLambda1;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda11;
import com.squareup.cash.investing.components.MyFirstConfigurationView$$ExternalSyntheticLambda2;
import com.squareup.cash.investing.components.news.NewsArticleAdapter$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryDetailViewModel;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryFilterViewModel;
import com.squareup.cash.investing.viewmodels.search.FilterGroupCarousel;
import com.squareup.cash.investing.viewmodels.search.InvestingFilterResultViewModel;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda18;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.util.Strings;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class InvestingCategoryDetailKt {
    public static final ComposableLambdaImpl lambda$847654628 = new ComposableLambdaImpl(new InstrumentCellKt$$ExternalSyntheticLambda11(12), false, 847654628);

    /* renamed from: lambda$-732679268, reason: not valid java name */
    public static final ComposableLambdaImpl f446lambda$732679268 = new ComposableLambdaImpl(new InstrumentCellKt$$ExternalSyntheticLambda11(13), false, -732679268);

    public static final void FilterResultRow(InvestingFilterResultViewModel investingFilterResultViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(537243423);
        int i2 = (gapComposer.changed(investingFilterResultViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new NewsArticleAdapter$$ExternalSyntheticLambda1(3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new GLSceneScope$$ExternalSyntheticLambda10(22, investingFilterResultViewModel, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            AndroidView_androidKt.AndroidView(function12, fillMaxSize, (Function1) rememberedValue2, gapComposer, 54, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SkipPaymentView$$ExternalSyntheticLambda1(investingFilterResultViewModel, function1, i, 20);
        }
    }

    public static final void InvestingCategoryDetail(InvestingCategoryDetailViewModel investingCategoryDetailViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        investingCategoryDetailViewModel.getClass();
        function1.getClass();
        realImageLoader.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(935368074);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(investingCategoryDetailViewModel) : gapComposer.changedInstance(investingCategoryDetailViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1349850645, new QuickAccessBarKt$$ExternalSyntheticLambda1(18, investingCategoryDetailViewModel, realImageLoader, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18((Object) investingCategoryDetailViewModel, function1, (Object) realImageLoader, i, 10);
        }
    }

    public static final void InvestingCategoryFilter(InvestingCategoryFilterViewModel investingCategoryFilterViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        investingCategoryFilterViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1513022322);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(investingCategoryFilterViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            boolean z = investingCategoryFilterViewModel instanceof InvestingCategoryFilterViewModel.Loading;
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MyFirstConfigurationView$$ExternalSyntheticLambda2(24);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Strings.LoadableFullScreenContent(investingCategoryFilterViewModel, z, navigationBarsPadding, (Function1) rememberedValue, null, Expect_jvmKt.rememberComposableLambda(1652701039, new LocalViewFactory$$ExternalSyntheticLambda4(29, investingCategoryFilterViewModel, function1), gapComposer), gapComposer, 199680 | (i3 & 14), 16);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18(modifier2, (Object) investingCategoryFilterViewModel, function1, i, 11);
        }
    }

    public static final void InvestingFilterGroupCarousel(FilterGroupCarousel filterGroupCarousel, Function1 function1, Composer composer, int i) {
        int i2;
        filterGroupCarousel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(64068268);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(filterGroupCarousel) : gapComposer.changedInstance(filterGroupCarousel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 19;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, MooncakeTheme.getColors(gapComposer).background, ColorKt.RectangleShape);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new MyFirstConfigurationView$$ExternalSyntheticLambda2(29);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            boolean changedInstance = ((i2 & 14) == 4 || ((i2 & 8) != 0 && gapComposer.changedInstance(filterGroupCarousel))) | gapComposer.changedInstance(view) | ((i2 & 112) == 32);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new GpsConfigQueries$$ExternalSyntheticLambda3(i3, filterGroupCarousel, view, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            AndroidView_androidKt.AndroidView(function12, m177backgroundbw27NRU, (Function1) rememberedValue2, gapComposer, 6, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GooglePayPresenter$$ExternalSyntheticLambda0(filterGroupCarousel, function1, i, i3);
        }
    }
}
