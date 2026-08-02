package com.squareup.cash.investing.components.stockmetric;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.investing.viewmodels.StockMetricTypePickerViewModel;
import com.squareup.cash.launcher.IntentLauncher$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.MoneyTabSectionUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class ComposableStockMetricTypePickerSheet extends ComposeUiView implements OutsideTapCloses {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableStockMetricTypePickerSheet(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(StockMetricTypePickerViewModel stockMetricTypePickerViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1040710725);
        int i2 = (gapComposer.changed(stockMetricTypePickerViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(this) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-1990691082, new ComposableStockMetricTypePickerSheet$$ExternalSyntheticLambda0(stockMetricTypePickerViewModel, this, function1), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposableStockMetricTypePickerSheet$$ExternalSyntheticLambda0(this, stockMetricTypePickerViewModel, function1, i);
        }
    }

    public final void OptionItem(StockMetricTypePickerViewModel.Option option, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1334295503);
        int i2 = i | (gapComposer2.changed(option) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new IntentLauncher$$ExternalSyntheticLambda0(17, function1, option);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(ImageKt.m183clickableoSLSa3U$default(companion, false, null, null, (Function0) rememberedValue, 15), 32.0f, 20.0f, 24.0f, 20.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m301paddingqDBjuR0);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer = gapComposer2;
            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4080, MooncakeTheme.getColors(gapComposer2).label, (Composer) gapComposer, (Modifier) new LayoutWeightElement(1.0f, true), MooncakeTheme.getTypography(gapComposer2).smallBody, (TextLineBalancing) null, option.getLabel(), (Map) null, (Function1) null, false);
            if (option.isSelected()) {
                gapComposer.startReplaceGroup(873672955);
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                Painter painterResource = Countries.painterResource(R.drawable.investing_components_stock_metric_type_checked_icon, 0, gapComposer);
                long j = MooncakeTheme.getColors(gapComposer).investing;
                ImageKt.Image(painterResource, null, m302paddingqDBjuR0$default, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 432, 56);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(874007631);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(this, option, function1, i, 11);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((StockMetricTypePickerViewModel) obj, function1, gapComposer, 0);
    }
}
