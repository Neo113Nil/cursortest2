package com.squareup.cash.bitcoin.views.applet;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
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
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.ShaderKt;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.TileMode;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda3;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.google.mlkit.vision.text.zzc;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda10;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.banking.views.BankingDialog$$ExternalSyntheticLambda1;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda2;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.activity.BitcoinDependentActivityViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.autoinvest.BitcoinHomeAutoInvestWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.balance.BitcoinBalanceWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.boost.BitcoinBoostWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.buttons.BitcoinTradeButtonsWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.disabled.DependentBitcoinDisabledViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.disclosure.BitcoinHomeDisclosureWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.education.BitcoinStoriesWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.graph.BitcoinHomeGraphWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.kyb.KybRestrictionModel;
import com.squareup.cash.bitcoin.viewmodels.applet.map.BitcoinMapCardWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.news.BitcoinHomeNewsWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.onramp.BitcoinOnRampWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.pendingidv.BitcoinHomePendingIdvWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.performance.BitcoinPerformanceSummaryViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.stackingtools.BitcoinStackingToolsViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetViewModel;
import com.squareup.cash.bitcoin.viewmodels.applet.toolbar.BitcoinHomeToolbarViewModel;
import com.squareup.cash.bitcoin.viewmodels.welcome.BitcoinWelcomeViewModel;
import com.squareup.cash.bitcoin.views.BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda12;
import com.squareup.cash.bitcoin.views.applet.balance.BitcoinBalanceWidgetKt;
import com.squareup.cash.bitcoin.views.applet.boost.BitcoinBoostWidgetViewKt;
import com.squareup.cash.bitcoin.views.applet.buttons.BitcoinTradeButtonsWidgetViewKt;
import com.squareup.cash.bitcoin.views.applet.disclosure.BitcoinDisclosureWidgetViewKt;
import com.squareup.cash.bitcoin.views.applet.education.BitcoinStoriesWidgetViewKt;
import com.squareup.cash.bitcoin.views.applet.graph.BitcoinGraphWidgetKt;
import com.squareup.cash.bitcoin.views.applet.idv.BitcoinPendingIdvWidgetViewKt;
import com.squareup.cash.bitcoin.views.applet.onramp.BitcoinOnRampWidgetViewKt;
import com.squareup.cash.bitcoin.views.applet.performance.BitcoinPerformanceSummaryViewKt;
import com.squareup.cash.bitcoin.views.applet.stackingtools.BitcoinStackingToolsViewKt;
import com.squareup.cash.bitcoin.views.applet.statsandsettings.BitcoinSettingsWidgetViewKt;
import com.squareup.cash.bitcoin.views.applet.welcome.BitcoinWelcomeWidgetViewKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class BitcoinHomeViewKt {
    public static final ComposableLambdaImpl lambda$1452471184 = new ComposableLambdaImpl(new AvatarsKt$$ExternalSyntheticLambda0(14), false, 1452471184);

    public static final void AddSeparator(boolean z, BitcoinHomeWidgetViewModel bitcoinHomeWidgetViewModel, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1707120009);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(bitcoinHomeWidgetViewModel) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = bitcoinHomeWidgetViewModel instanceof BitcoinSettingsWidgetViewModel;
            if (z2 && !((BitcoinSettingsWidgetViewModel) bitcoinHomeWidgetViewModel).showHeader) {
                gapComposer.startReplaceGroup(135183379);
                DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else if (bitcoinHomeWidgetViewModel instanceof BitcoinBalanceWidgetViewModel) {
                gapComposer.startReplaceGroup(135185778);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else if ((bitcoinHomeWidgetViewModel instanceof BitcoinStoriesWidgetViewModel) && (bitcoinHomeWidgetViewModel instanceof BitcoinStoriesWidgetViewModel.Failure)) {
                gapComposer.startReplaceGroup(-104114184);
                DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else if ((bitcoinHomeWidgetViewModel instanceof BitcoinHomeGraphWidgetViewModel) || (bitcoinHomeWidgetViewModel instanceof KybRestrictionModel) || (bitcoinHomeWidgetViewModel instanceof BitcoinHomePendingIdvWidgetViewModel) || (bitcoinHomeWidgetViewModel instanceof BitcoinWelcomeViewModel)) {
                gapComposer.startReplaceGroup(135192018);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else if ((bitcoinHomeWidgetViewModel instanceof BitcoinHomeAutoInvestWidgetViewModel) || z2 || (bitcoinHomeWidgetViewModel instanceof BitcoinOnRampWidgetViewModel) || (bitcoinHomeWidgetViewModel instanceof BitcoinStackingToolsViewModel) || (bitcoinHomeWidgetViewModel instanceof BitcoinMapCardWidgetViewModel) || (bitcoinHomeWidgetViewModel instanceof BitcoinPerformanceSummaryViewModel)) {
                gapComposer.startReplaceGroup(135193660);
                DBUtil.SpacerBetweenSectionXLargeBelowCell(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else if (z) {
                gapComposer.startReplaceGroup(135195507);
                DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-103875701);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeViewKt$$ExternalSyntheticLambda3(z, bitcoinHomeWidgetViewModel, i, 3);
        }
    }

    public static final void AddWidgetView(BitcoinHomeWidgetViewModel bitcoinHomeWidgetViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(821169357);
        int i2 = (gapComposer2.changedInstance(bitcoinHomeWidgetViewModel) ? 4 : 2) | i | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changed(modifier) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            if (bitcoinHomeWidgetViewModel instanceof BitcoinWelcomeViewModel) {
                gapComposer2.startReplaceGroup(-677225749);
                BitcoinWelcomeWidgetViewKt.BitcoinWelcomeWidgetView((BitcoinWelcomeViewModel) bitcoinHomeWidgetViewModel, modifier, gapComposer2, ((i2 >> 3) & 112) | (i2 & 14));
                gapComposer2.end(false);
            } else if (bitcoinHomeWidgetViewModel instanceof BitcoinOnRampWidgetViewModel) {
                gapComposer2.startReplaceGroup(-677107484);
                BitcoinOnRampWidgetViewKt.BitcoinOnRampWidgetView((BitcoinOnRampWidgetViewModel) bitcoinHomeWidgetViewModel, function1, modifier, gapComposer2, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                gapComposer2.end(false);
            } else if (bitcoinHomeWidgetViewModel instanceof BitcoinSettingsWidgetViewModel) {
                gapComposer2.startReplaceGroup(-676831305);
                BitcoinSettingsWidgetViewKt.BitcoinSettingsWidgetView((BitcoinSettingsWidgetViewModel) bitcoinHomeWidgetViewModel, function1, modifier, gapComposer2, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                gapComposer2.end(false);
            } else if (bitcoinHomeWidgetViewModel instanceof BitcoinTradeButtonsWidgetViewModel) {
                gapComposer2.startReplaceGroup(-676692301);
                BitcoinTradeButtonsWidgetViewKt.BitcoinTradeButtonsWidgetView((BitcoinTradeButtonsWidgetViewModel) bitcoinHomeWidgetViewModel, function1, modifier, gapComposer2, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                gapComposer2.end(false);
            } else if (bitcoinHomeWidgetViewModel instanceof BitcoinStoriesWidgetViewModel) {
                gapComposer2.startReplaceGroup(-676547066);
                BitcoinStoriesWidgetViewKt.BitcoinStoriesWidgetView(modifier, function1, (BitcoinStoriesWidgetViewModel) bitcoinHomeWidgetViewModel, gapComposer2, ((i2 << 6) & 896) | ((i2 >> 6) & 14) | (i2 & 112));
                gapComposer2.end(false);
            } else if (bitcoinHomeWidgetViewModel instanceof BitcoinHomeGraphWidgetViewModel) {
                gapComposer2.startReplaceGroup(-676419842);
                BitcoinGraphWidgetKt.BitcoinGraphWidget((BitcoinHomeGraphWidgetViewModel) bitcoinHomeWidgetViewModel, function1, modifier, gapComposer2, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                gapComposer2.end(false);
            } else if (bitcoinHomeWidgetViewModel instanceof BitcoinBalanceWidgetViewModel) {
                gapComposer2.startReplaceGroup(-676292804);
                BitcoinBalanceWidgetKt.BitcoinBalanceWidget((BitcoinBalanceWidgetViewModel) bitcoinHomeWidgetViewModel, function1, modifier, gapComposer2, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                gapComposer2.end(false);
            } else if (bitcoinHomeWidgetViewModel instanceof BitcoinHomeAutoInvestWidgetViewModel) {
                gapComposer2.startReplaceGroup(-676156683);
                PathOperation.BitcoinAutoInvestWidgetView((BitcoinHomeAutoInvestWidgetViewModel) bitcoinHomeWidgetViewModel, function1, modifier, gapComposer2, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                gapComposer2.end(false);
            } else if (bitcoinHomeWidgetViewModel instanceof BitcoinBoostWidgetViewModel) {
                gapComposer2.startReplaceGroup(-676020190);
                ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                BitcoinBoostWidgetViewKt.BitcoinBoostWidgetView((BitcoinBoostWidgetViewModel) bitcoinHomeWidgetViewModel, function1, SpacerKt.m300paddingVpY3zN4$default(modifier, 16.0f, RecyclerView.DECELERATION_RATE, 2), gapComposer2, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer2.end(false);
            } else if (bitcoinHomeWidgetViewModel instanceof BitcoinHomePendingIdvWidgetViewModel) {
                gapComposer2.startReplaceGroup(-675794851);
                ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                BitcoinPendingIdvWidgetViewKt.BitcoinPendingIdvWidgetView((BitcoinHomePendingIdvWidgetViewModel) bitcoinHomeWidgetViewModel, function1, SpacerKt.m300paddingVpY3zN4$default(modifier, 16.0f, RecyclerView.DECELERATION_RATE, 2), gapComposer2, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                gapComposer2.end(false);
            } else if (bitcoinHomeWidgetViewModel instanceof BitcoinHomeDisclosureWidgetViewModel) {
                gapComposer2.startReplaceGroup(-675567435);
                BitcoinDisclosureWidgetViewKt.BitcoinDisclosureWidgetView((BitcoinHomeDisclosureWidgetViewModel) bitcoinHomeWidgetViewModel, function1, modifier, gapComposer2, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                gapComposer2.end(false);
            } else if (bitcoinHomeWidgetViewModel instanceof BitcoinHomeNewsWidgetViewModel) {
                gapComposer2.startReplaceGroup(-675430725);
                TileMode.BitcoinNewsWidgetView((BitcoinHomeNewsWidgetViewModel) bitcoinHomeWidgetViewModel, function1, modifier, gapComposer2, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                gapComposer2.end(false);
            } else if (bitcoinHomeWidgetViewModel instanceof KybRestrictionModel) {
                gapComposer2.startReplaceGroup(-675306880);
                UiCallbackModel uiCallbackModel = ((KybRestrictionModel) bitcoinHomeWidgetViewModel).uiCallbackModel;
                ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                gapComposer = gapComposer2;
                ColorResources_androidKt.FeatureRestrictionCallbackBanner(uiCallbackModel, SpacerKt.m300paddingVpY3zN4$default(modifier, 16.0f, RecyclerView.DECELERATION_RATE, 2), false, true, gapComposer, 3072, 4);
                gapComposer.end(false);
            } else {
                gapComposer = gapComposer2;
                if (bitcoinHomeWidgetViewModel instanceof BitcoinStackingToolsViewModel) {
                    gapComposer.startReplaceGroup(-675059283);
                    BitcoinStackingToolsViewKt.BitcoinStackingToolsView((BitcoinStackingToolsViewModel) bitcoinHomeWidgetViewModel, function1, null, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                    gapComposer.end(false);
                } else if (bitcoinHomeWidgetViewModel instanceof BitcoinPerformanceSummaryViewModel) {
                    gapComposer.startReplaceGroup(-674942072);
                    BitcoinPerformanceSummaryViewKt.BitcoinPerformanceSummaryView((BitcoinPerformanceSummaryViewModel) bitcoinHomeWidgetViewModel, function1, null, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 4);
                    gapComposer = gapComposer;
                    gapComposer.end(false);
                } else if (bitcoinHomeWidgetViewModel instanceof DependentBitcoinDisabledViewModel) {
                    gapComposer.startReplaceGroup(-674821017);
                    ShaderKt.DependentBitcoinDisabledWidget((DependentBitcoinDisabledViewModel) bitcoinHomeWidgetViewModel, function1, null, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                    gapComposer.end(false);
                } else if (bitcoinHomeWidgetViewModel instanceof BitcoinDependentActivityViewModel) {
                    gapComposer.startReplaceGroup(-674699001);
                    ClipOp.BitcoinDependentActivityWidget((BitcoinDependentActivityViewModel) bitcoinHomeWidgetViewModel, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                    gapComposer.end(false);
                } else if (bitcoinHomeWidgetViewModel instanceof BitcoinMapCardWidgetViewModel) {
                    gapComposer.startReplaceGroup(-674580612);
                    ShadowKt.BitcoinMapWidgetView((BitcoinMapCardWidgetViewModel) bitcoinHomeWidgetViewModel, function1, modifier, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-674480947);
                    WorkInProgressWidgetView(gapComposer, 0);
                    gapComposer.end(false);
                }
            }
            gapComposer = gapComposer2;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BankingDialog$$ExternalSyntheticLambda1((Object) bitcoinHomeWidgetViewModel, function1, (Object) modifier, i, 25);
        }
    }

    public static final void BitcoinHomeContent(BitcoinHomeViewModel bitcoinHomeViewModel, Function1 function1, zzc zzcVar, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-623603596);
        int i2 = (gapComposer.changedInstance(bitcoinHomeViewModel) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | (gapComposer.changed(zzcVar) ? 256 : 128);
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
            ArcadeThemeKt.ArcadeTheme(DimensionKt.m1468withTint4WTKRHQ(colors, colors2.semantic.icon.brand), null, null, Expect_jvmKt.rememberComposableLambda(1538203081, new BankingDialog$$ExternalSyntheticLambda1(bitcoinHomeViewModel, function1, zzcVar, 23), gapComposer), gapComposer, 3072, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(bitcoinHomeViewModel, function1, zzcVar, i, 29);
        }
    }

    public static final void HandleScrollEvents(LazyListState lazyListState, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1937942646);
        int i2 = (gapComposer.changed(lazyListState) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BitcoinHomeViewKt$HandleScrollEvents$1$1(function1, lazyListState, (Continuation) null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, lazyListState, (Function2) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinUiFactory$$ExternalSyntheticLambda12(lazyListState, function1, i, 8);
        }
    }

    public static final void Toolbar(BitcoinHomeToolbarViewModel bitcoinHomeToolbarViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1743544641);
        int i2 = i | (gapComposer.changedInstance(bitcoinHomeToolbarViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String str = bitcoinHomeToolbarViewModel.title;
            NavigationType navigationType = NavigationType.BACK;
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BenefitsHubViewKt$$ExternalSyntheticLambda4(28, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-41108190, new BankingDialogKt$$ExternalSyntheticLambda2(21, (Object) bitcoinHomeToolbarViewModel, function1), gapComposer);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            DBUtil.TitleBarSub(str, navigationType, companion, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, rememberComposableLambda, gapComposer, 1573296, 40);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BankingDialog$$ExternalSyntheticLambda1((Object) bitcoinHomeToolbarViewModel, function1, (Object) modifier2, i, 24);
        }
    }

    public static final void TopDivider(BitcoinHomeWidgetViewModel bitcoinHomeWidgetViewModel, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-873007776);
        int i2 = (gapComposer.changedInstance(bitcoinHomeWidgetViewModel) ? 4 : 2) | i | 48;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = bitcoinHomeWidgetViewModel instanceof KybRestrictionModel;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (z || (bitcoinHomeWidgetViewModel instanceof BitcoinHomePendingIdvWidgetViewModel) || (bitcoinHomeWidgetViewModel instanceof BitcoinBalanceWidgetViewModel)) {
                gapComposer.startReplaceGroup(-1747422838);
                DBUtil.SpacerWithinSectionMedium(6, 0, gapComposer, companion);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1747361334);
                DBUtil.SpacerBetweenSectionLarge(6, 0, gapComposer, companion);
                gapComposer.end(false);
            }
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinUiFactory$$ExternalSyntheticLambda12(bitcoinHomeWidgetViewModel, modifier, i, 7);
        }
    }

    public static final void WorkInProgressWidgetView(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(886205862);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4092, 0L, (Composer) gapComposer, BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.Center), (TextStyle) null, (TextLineBalancing) null, "Work in progress", (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinInvoiceEntryViewKt$$ExternalSyntheticLambda0(i, 16);
        }
    }
}
