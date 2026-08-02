package com.squareup.cash.investing.components.exchange;

import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda34;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.amountslider.viewmodels.AmountSelection;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda9;
import com.squareup.cash.investing.components.news.InvestingNewsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.investing.components.news.NewsArticleAdapter$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.viewmodels.exchange.InvestingExchangeViewModel;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda5;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import string.TrimMode;

/* loaded from: classes6.dex */
public abstract class InvestingExchangeAtmPickerKt {
    static {
        new InvestingExchangeViewModel.Content.BottomSheetContent("Buy bitcoin", new InvestingExchangeViewModel.Content.Subtitle("Recurring order", InvestingExchangeViewModel.Content.Icon.RECURRING), true, CollectionsKt__CollectionsKt.listOf((Object[]) new AmountSelection[]{new AmountSelection.TradeSome(1L, "1", false, true), new AmountSelection.TradeSome(10L, "10", false, true), new AmountSelection.TradeSome(20L, "20", false, true), new AmountSelection.TradeSome(50L, "50", false, true), new AmountSelection.TradeSome(100L, "100", false, true), new AmountSelection.TradeCustomize("...", "Custom amount")}), "10", new Money((Long) 1000L, (CurrencyCode) null, 6), "Buy", true, false);
    }

    public static final void InvestingExchangeAtmPicker(InvestingExchangeViewModel.Content.BottomSheetContent bottomSheetContent, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        GapComposer gapComposer;
        Modifier modifier3;
        bottomSheetContent.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(672353127);
        int i4 = i | ((i & 8) == 0 ? gapComposer2.changed(bottomSheetContent) : gapComposer2.changedInstance(bottomSheetContent) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (gapComposer2.changed(modifier2) ? 256 : 128);
        }
        int i6 = i3;
        if (gapComposer2.shouldExecute(i6 & 1, (i6 & 147) != 146)) {
            Modifier modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier4, 1.0f);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
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
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            OrderHeader(bottomSheetContent.title, bottomSheetContent.subtitle, bottomSheetContent.orderTypeButtonVisible, function1, gapComposer2, (i6 << 6) & 7168);
            gapComposer = gapComposer2;
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            List list = bottomSheetContent.amountSelections;
            boolean z = (i6 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new InviteContactsBodyKt$$ExternalSyntheticLambda5(11, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            TrimMode.AtmPickerGrid(0, 1, gapComposer, null, list, (Function1) rememberedValue);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            gapComposer.end(true);
            modifier3 = modifier4;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InstrumentCellKt$$ExternalSyntheticLambda9((Object) bottomSheetContent, function1, modifier3, i, i2, 4);
        }
    }

    public static final void OrderHeader(String str, InvestingExchangeViewModel.Content.Subtitle subtitle, boolean z, Function1 function1, Composer composer, int i) {
        String str2;
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-771153063);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (gapComposer2.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? gapComposer2.changed(subtitle) : gapComposer2.changedInstance(subtitle) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new NewsArticleAdapter$$ExternalSyntheticLambda1(16);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            int i3 = i2;
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
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).header;
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            gapComposer = gapComposer2;
            Room.m1165Text25TpFw(0, 2, 0, 0, (i3 & 14) | 1572864, 0, 4018, colors.semantic.text.standard, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            if (subtitle == null) {
                gapComposer.startReplaceGroup(1765912109);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1765912110);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, companion, 4.0f, gapComposer);
                InvestingExchangeSubtitleKt.m3583InvestingExchangeSubtitle5stqomU(subtitle, 0, gapComposer, 0, 2);
                gapComposer.end(false);
            }
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            if (z) {
                gapComposer.startReplaceGroup(1766110913);
                boolean z2 = (i3 & 7168) == 2048;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z2 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new InvestingNewsKt$$ExternalSyntheticLambda0(18, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                coil3.size.SizeKt.ButtonDropdown((Function0) rememberedValue2, null, false, null, ComposableSingletons$InvestingExchangeSubtitleKt.f448lambda$1973686970, gapComposer, 24576, 14);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1766312723);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34(str, subtitle, z, function1, i, 21);
        }
    }
}
