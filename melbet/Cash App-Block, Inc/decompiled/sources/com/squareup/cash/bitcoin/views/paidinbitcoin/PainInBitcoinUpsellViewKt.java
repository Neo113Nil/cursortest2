package com.squareup.cash.bitcoin.views.paidinbitcoin;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda11;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DividerKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.viewmodels.paidinbitcoin.PaidInBitcoinCardUpsellViewModel;
import com.squareup.cash.bitcoin.viewmodels.paidinbitcoin.PaidInBitcoinLandingViewModel;
import com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda12;
import com.squareup.cash.bitcoin.views.map.BitcoinLocationViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.GetFlowLoadingViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.paychecks.views.DistributePaycheckViewKt$$ExternalSyntheticLambda7;
import com.squareup.util.cash.Countries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class PainInBitcoinUpsellViewKt {

    /* renamed from: lambda$-1529020154, reason: not valid java name */
    public static final ComposableLambdaImpl f268lambda$1529020154 = new ComposableLambdaImpl(new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(1), false, -1529020154);
    public static final ComposableLambdaImpl lambda$581671205 = new ComposableLambdaImpl(new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(2), false, 581671205);
    public static final ComposableLambdaImpl lambda$360917471 = new ComposableLambdaImpl(new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(3), false, 360917471);

    /* renamed from: lambda$-1032651473, reason: not valid java name */
    public static final ComposableLambdaImpl f267lambda$1032651473 = new ComposableLambdaImpl(new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(4), false, -1032651473);
    public static final ComposableLambdaImpl lambda$117180814 = new ComposableLambdaImpl(new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(5), false, 117180814);

    /* renamed from: lambda$-1573760056, reason: not valid java name */
    public static final ComposableLambdaImpl f269lambda$1573760056 = new ComposableLambdaImpl(new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(6), false, -1573760056);

    /* renamed from: lambda$-803991023, reason: not valid java name */
    public static final ComposableLambdaImpl f270lambda$803991023 = new ComposableLambdaImpl(new BitcoinLocationViewKt$$ExternalSyntheticLambda5(12), false, -803991023);

    public static final void ButtonContent(int i, Composer composer, Modifier modifier, String str, Function1 function1) {
        int i2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-562712300);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            DimensionKt.ButtonCtaGroup(companion, false, null, null, Expect_jvmKt.rememberComposableLambda(1881471382, new TabContentViewKt$$ExternalSyntheticLambda11(function1, str, 9), gapComposer), gapComposer, ((i3 >> 6) & 14) | 24576, 14);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DistributePaycheckViewKt$$ExternalSyntheticLambda7(i, 2, modifier2, str, function1);
        }
    }

    public static final void PaidInBitcoinLanding(PaidInBitcoinLandingViewModel paidInBitcoinLandingViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2102456586);
        int i2 = (gapComposer.changed(paidInBitcoinLandingViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            ArcadeThemeKt.ArcadeTheme(DimensionKt.m1468withTint4WTKRHQ(colors, colors2.semantic.icon.brand), null, null, Expect_jvmKt.rememberComposableLambda(-1229870571, new BitcoinUiFactory$$ExternalSyntheticLambda12(function1, paidInBitcoinLandingViewModel), gapComposer), gapComposer, 3072, 6);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda3((Object) paidInBitcoinLandingViewModel, function1, (Object) modifier2, i, 15);
        }
    }

    public static final void PaidInBitcoinLandingContent(PaidInBitcoinLandingViewModel paidInBitcoinLandingViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2007968191);
        int i2 = i | (gapComposer.changed(paidInBitcoinLandingViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxWidth(modifier, 1.0f), ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
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
            AvatarSize avatarSize = AvatarSize.Size64;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            AvatarEntry avatarEntry = new AvatarEntry("", colors.semantic.icon.brand, null, new AvatarImage.LocalIcon(Icons.Deposit32, 0L, 6), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            TextViewKt.Avatar(avatarSize, avatarEntry, SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2), false, gapComposer, 6, 24);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Countries.PageHeader(Room.stringResource(gapComposer, R.string.paid_in_bitcoin_sell_title), (Modifier) null, (Function2) null, paidInBitcoinLandingViewModel.subtitle, gapComposer, 0, 6);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            if (paidInBitcoinLandingViewModel.showSignUpContent) {
                gapComposer.startReplaceGroup(258585274);
                SignUpContent(null, gapComposer, 0);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(258613143);
                gapComposer.end(false);
            }
            DBUtil.SpacerWithinSectionMedium(0, 0, gapComposer, new LayoutWeightElement(1.0f, true));
            ButtonContent(i2 & 112, gapComposer, null, paidInBitcoinLandingViewModel.selectPercentageButton, function1);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinMapViewKt$$ExternalSyntheticLambda0(modifier, (Object) paidInBitcoinLandingViewModel, function1, i, 19);
        }
    }

    public static final void PaidInBitcoinUpsell(PaidInBitcoinCardUpsellViewModel paidInBitcoinCardUpsellViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1184811756);
        int i2 = (gapComposer.changedInstance(paidInBitcoinCardUpsellViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(961884993, new BitcoinUiFactory$$ExternalSyntheticLambda12(paidInBitcoinCardUpsellViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinMapViewKt$$ExternalSyntheticLambda0(modifier2, (Object) paidInBitcoinCardUpsellViewModel, function1, i, 20);
        }
    }

    public static final void SignUpContent(Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(559321450);
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f268lambda$1529020154, lambda$581671205, null, null, false, false, lambda$360917471, null, null, 0L, gapComposer, 12582966, 3964);
            CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(f267lambda$1032651473, lambda$117180814, null, null, false, false, f269lambda$1573760056, null, null, 0L, gapComposer, 12582966, 3964);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier2, i, 10);
        }
    }
}
