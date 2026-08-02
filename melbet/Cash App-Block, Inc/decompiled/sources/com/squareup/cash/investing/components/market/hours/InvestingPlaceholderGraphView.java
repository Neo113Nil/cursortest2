package com.squareup.cash.investing.components.market.hours;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacg;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.datefilterbar.views.DateFilterChipKt$$ExternalSyntheticLambda0;
import com.squareup.cash.formview.components.FormView$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.viewmodels.market.hours.InvestingPlaceholderGraphViewModel;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda18;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda5;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.views.MoneyTabSectionUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphTimeRangeViewModel;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphTabsViewKt;
import com.squareup.util.cash.Countries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class InvestingPlaceholderGraphView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingPlaceholderGraphView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(InvestingPlaceholderGraphViewModel investingPlaceholderGraphViewModel, Function1 function1, Composer composer, int i) {
        InvestingPlaceholderGraphView investingPlaceholderGraphView;
        InvestingPlaceholderGraphViewModel investingPlaceholderGraphViewModel2;
        Function1 function12;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1021884046);
        int i2 = (gapComposer.changed(investingPlaceholderGraphViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            investingPlaceholderGraphView = this;
            investingPlaceholderGraphViewModel2 = investingPlaceholderGraphViewModel;
            function12 = function1;
            gapComposer.skipToGroupEnd();
        } else {
            if (investingPlaceholderGraphViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            investingPlaceholderGraphView = this;
            investingPlaceholderGraphViewModel2 = investingPlaceholderGraphViewModel;
            function12 = function1;
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-902978317, new InvestingPlaceholderGraphView$$ExternalSyntheticLambda0(investingPlaceholderGraphView, investingPlaceholderGraphViewModel2, function12, 0, (byte) 0), gapComposer), gapComposer, 6);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InvestingPlaceholderGraphView$$ExternalSyntheticLambda0(investingPlaceholderGraphView, investingPlaceholderGraphViewModel2, function12, i);
        }
    }

    public final void GraphTimeRangeButtons(InvestingPlaceholderGraphViewModel investingPlaceholderGraphViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-978130956);
        int i2 = i | (gapComposer.changed(investingPlaceholderGraphViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 32.0f, RecyclerView.DECELERATION_RATE, 10.0f, 5);
            InvestingGraphTimeRangeViewModel investingGraphTimeRangeViewModel = new InvestingGraphTimeRangeViewModel(investingPlaceholderGraphViewModel.selectedRange);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new InviteContactsBodyKt$$ExternalSyntheticLambda5(13, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            InvestingGraphTabsViewKt.InvestingGraphTimeRangeMooncakeButtons(investingGraphTimeRangeViewModel, (Function1) rememberedValue, m302paddingqDBjuR0$default, gapComposer, 3120);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18(this, investingPlaceholderGraphViewModel, function1, i, 15);
        }
    }

    /* renamed from: PlaceholderGraph-Bx497Mc, reason: not valid java name */
    public final void m3584PlaceholderGraphBx497Mc(InvestingPlaceholderGraphViewModel investingPlaceholderGraphViewModel, Function1 function1, ComposableLambdaImpl composableLambdaImpl, long j, Composer composer, int i) {
        Modifier wrapContentHeight;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1907389258);
        int i2 = i | (gapComposer.changed(investingPlaceholderGraphViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(j) ? 2048 : 1024) | (gapComposer.changedInstance(this) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            wrapContentHeight = SizeKt.wrapContentHeight(companion, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxWidth(wrapContentHeight, 1.0f), MooncakeTheme.getColors(gapComposer).background, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, horizontal, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            composableLambdaImpl.invoke((Object) gapComposer, (Object) 6);
            ImageKt.Image(Countries.painterResource(R.drawable.investing_components_placeholder_graph, 0, gapComposer), null, SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 65.0f, RecyclerView.DECELERATION_RATE, 70.0f, 5), null, ContentScale.Companion.Crop, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 25008, 40);
            GraphTimeRangeButtons(investingPlaceholderGraphViewModel, function1, gapComposer, ((i2 >> 6) & 896) | (i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | 512);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DateFilterChipKt$$ExternalSyntheticLambda0(this, investingPlaceholderGraphViewModel, function1, composableLambdaImpl, j, i);
        }
    }

    public final void PlaceholderHeaderNew(Modifier modifier, InvestingPlaceholderGraphViewModel investingPlaceholderGraphViewModel, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1607390467);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changed(investingPlaceholderGraphViewModel) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            zzacg.m2009HeroNumericsHeadertv5qRRQ(Expect_jvmKt.rememberComposableLambda(354747479, new CashMapViewKt$$ExternalSyntheticLambda5(investingPlaceholderGraphViewModel, 8), gapComposer), modifier, 0, (Function2) null, (Function3) null, Expect_jvmKt.rememberComposableLambda(1406006660, new FormView$$ExternalSyntheticLambda0(investingPlaceholderGraphViewModel, 29), gapComposer), (Function2) null, gapComposer, ((i2 << 3) & 112) | 196614, 92);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(this, modifier, investingPlaceholderGraphViewModel, false, i, 2);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((InvestingPlaceholderGraphViewModel) obj, function1, gapComposer, 0);
    }
}
