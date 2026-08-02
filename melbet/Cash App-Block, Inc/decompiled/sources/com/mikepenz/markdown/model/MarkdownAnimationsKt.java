package com.mikepenz.markdown.model;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.graphics.Color;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import com.squareup.cash.investing.components.search.InvestingSearchCategoryCarouselKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryTileContentModel;
import com.squareup.cash.investing.viewmodels.search.CategoryTile$CategoryCarousel;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.MoneyTabSectionUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.taptopay.views.TapToPayPaymentKt$$ExternalSyntheticLambda3;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonEncoder;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes9.dex */
public abstract class MarkdownAnimationsKt {
    public static final void InvestingCategoryCarouselCard(InvestingCategoryTileContentModel investingCategoryTileContentModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(217545683);
        int i2 = (gapComposer.changedInstance(investingCategoryTileContentModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(realImageLoader) ? 256 : 128);
        boolean z = true;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Color composeColor = ComposeUtilsKt.toComposeColor(investingCategoryTileContentModel.backgroundColor, gapComposer);
            if (composeColor == null) {
                gapComposer.startReplaceGroup(-1391988388);
                j = MooncakeTheme.getColors(gapComposer).investing;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1391990341);
                gapComposer.end(false);
                j = composeColor.value;
            }
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) != 4 && !gapComposer.changedInstance(investingCategoryTileContentModel)) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z3 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new IntentLauncher$$ExternalSyntheticLambda0(15, function1, investingCategoryTileContentModel);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            JsonElementBuildersKt.m4210InvestingCarouselCard3IgeMak((Function0) rememberedValue, j, Expect_jvmKt.rememberComposableLambda(143421507, new TapToPayPaymentKt$$ExternalSyntheticLambda3(investingCategoryTileContentModel, j, realImageLoader), gapComposer), gapComposer, MLKEMEngine.KyberPolyBytes);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(investingCategoryTileContentModel, function1, realImageLoader, i, 7);
        }
    }

    public static final void InvestingSearchCategoryCarousel(CategoryTile$CategoryCarousel categoryTile$CategoryCarousel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        function1.getClass();
        realImageLoader.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-4460544);
        int i2 = (gapComposer.changed(categoryTile$CategoryCarousel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(realImageLoader) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-1520715739, new InvestingSearchCategoryCarouselKt$$ExternalSyntheticLambda0(categoryTile$CategoryCarousel, function1, realImageLoader), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InvestingSearchCategoryCarouselKt$$ExternalSyntheticLambda0(categoryTile$CategoryCarousel, function1, realImageLoader, i);
        }
    }

    public static final JsonDecoder asJsonDecoder(Decoder decoder) {
        decoder.getClass();
        JsonDecoder jsonDecoder = decoder instanceof JsonDecoder ? (JsonDecoder) decoder : null;
        if (jsonDecoder != null) {
            return jsonDecoder;
        }
        a$$ExternalSyntheticBUOutline0.m$1(SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, decoder.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
        return null;
    }

    public static final JsonEncoder asJsonEncoder(Encoder encoder) {
        encoder.getClass();
        JsonEncoder jsonEncoder = encoder instanceof JsonEncoder ? (JsonEncoder) encoder : null;
        if (jsonEncoder != null) {
            return jsonEncoder;
        }
        a$$ExternalSyntheticBUOutline0.m$1(SizeMode$EnumUnboxingLocalUtility.m(Reflection.factory, encoder.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ")));
        return null;
    }
}
