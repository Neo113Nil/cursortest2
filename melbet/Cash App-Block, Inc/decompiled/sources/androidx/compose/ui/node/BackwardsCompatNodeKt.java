package androidx.compose.ui.node;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.coroutines.ConnectionPoolKt;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabx;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagn;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.list.ListOrderedKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel;
import com.squareup.cash.bitcoin.views.exchange.BitcoinExchangeViewKt;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.bitcoin.views.transfer.BitcoinExchangeFullScreenViewKt$Content$1$1;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda2;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.offers.backend.api.OffersAnalyticsEventSpec;
import com.squareup.cash.offers.viewmodels.OffersTimelineViewModel$OffersTimelineSheet;
import com.squareup.cash.offers.views.home.OffersHomeV2Kt$$ExternalSyntheticLambda7;
import com.squareup.cash.offers.views.timeline.OffersTimelineKt$OffersTimeline$2$1$1;
import com.squareup.cash.overlays.FakeOverlayLayerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.pools.views.StartPoolAmountKt$$ExternalSyntheticLambda4;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.util.compose.SharedViewEventsKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class BackwardsCompatNodeKt {
    public static final void BitcoinExchangeFullScreenUi(BitcoinTransferViewModel bitcoinTransferViewModel, Function1 function1, RealImageLoader realImageLoader, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-411933189);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(bitcoinTransferViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        int i3 = i2 | 27648;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
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
            ArcadeThemeKt.ArcadeTheme(DimensionKt.m1468withTint4WTKRHQ(colors, colors2.semantic.icon.brand), null, null, Expect_jvmKt.rememberComposableLambda(-692773818, new BitcoinMapViewKt$$ExternalSyntheticLambda0(realImageLoader, bitcoinTransferViewModel, function1), gapComposer), gapComposer, 3072, 6);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2((Object) bitcoinTransferViewModel, function1, (Object) realImageLoader, modifier2, i, 17);
        }
    }

    public static final void Content(BitcoinTransferViewModel.Content.FullScreenContent fullScreenContent, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1447914397);
        int i3 = (gapComposer.changedInstance(fullScreenContent) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i4 = i3 | (gapComposer.changed(companion) ? 256 : 128) | (gapComposer.changedInstance(null) ? 2048 : 1024);
        int i5 = 3;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            RealCashVibrator realCashVibrator = (RealCashVibrator) gapComposer.consume(LocalCashVibratorKt.LocalCashVibrator);
            Shaker rememberShaker = SharedViewEventsKt.rememberShaker(true, gapComposer, 0);
            Money money = fullScreenContent.maxAmount;
            CurrencyCode currencyCode = money.currency_code;
            currencyCode.getClass();
            AmountConfig.MoneyConfig moneyConfig = new AmountConfig.MoneyConfig(currencyCode, null, false, Moneys.wholeDigits(money), 6);
            boolean changedInstance = ((i4 & 112) == 32) | gapComposer.changedInstance(realCashVibrator) | gapComposer.changedInstance(rememberShaker);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new StartPoolAmountKt$$ExternalSyntheticLambda4(function1, realCashVibrator, rememberShaker, 3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            AmountDisplayState rememberAmountDisplayState = ConnectionPoolKt.rememberAmountDisplayState(moneyConfig, null, (Function1) rememberedValue, gapComposer, 2);
            boolean changed = gapComposer.changed(rememberAmountDisplayState) | gapComposer.changedInstance(fullScreenContent);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new BitcoinExchangeFullScreenViewKt$Content$1$1(rememberAmountDisplayState, fullScreenContent, (Continuation) null);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, money, (Function2) rememberedValue2);
            String str = fullScreenContent.restoreKeypadAmount;
            boolean changedInstance2 = gapComposer.changedInstance(fullScreenContent) | gapComposer.changed(rememberAmountDisplayState);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new BitcoinExchangeFullScreenViewKt$Content$1$1(fullScreenContent, rememberAmountDisplayState, (Continuation) null);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, str, (Function2) rememberedValue3);
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                i2 = 0;
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                i2 = 0;
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, i2);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
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
            int i6 = i4 & 14;
            int i7 = i4 << 6;
            BitcoinExchangeViewKt.BitcoinExchangeKeypadAmountPicker(fullScreenContent, rememberAmountDisplayState, rememberShaker, function1, Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier, 1.0f, true), null, false, gapComposer, (i7 & 458752) | i6 | (i7 & 7168), 64);
            zzabx.ButtonDefaultGroupVertical(null, Expect_jvmKt.rememberComposableLambda(-1239055837, new BorrowHomeKt$$ExternalSyntheticLambda0(9, fullScreenContent, function1), gapComposer), gapComposer, 48, 1);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda2(fullScreenContent, function1, i, i5);
        }
    }

    public static final void OffersTimeline(OffersTimelineViewModel$OffersTimelineSheet offersTimelineViewModel$OffersTimelineSheet, Function1 function1, Composer composer, int i) {
        OffersTimelineViewModel$OffersTimelineSheet offersTimelineViewModel$OffersTimelineSheet2;
        Function1 function12 = function1;
        offersTimelineViewModel$OffersTimelineSheet.getClass();
        function12.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1759333652);
        int i2 = i | (gapComposer.changedInstance(offersTimelineViewModel$OffersTimelineSheet) ? 4 : 2) | (gapComposer.changedInstance(function12) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier nestedScroll = NestedScrollModifierKt.nestedScroll(ImageKt.verticalScroll$default(SizeKt.fillMaxWidth(companion, 1.0f), ImageKt.rememberScrollState(gapComposer), false, 14), zzagn.rememberNestedScrollInteropConnection(gapComposer), null);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, nestedScroll);
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
            String str = offersTimelineViewModel$OffersTimelineSheet.titleText;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalTypography;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, ((Typography) gapComposer.consume(staticProvidableCompositionLocal2)).header.m996getColor0d7_KjU(), (Composer) gapComposer, m300paddingVpY3zN4$default, ((Typography) gapComposer.consume(staticProvidableCompositionLocal2)).header, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            offersTimelineViewModel$OffersTimelineSheet2 = offersTimelineViewModel$OffersTimelineSheet;
            ListOrderedKt.ListOrderedStandard(SizeKt.fillMaxWidth(companion, 1.0f), offersTimelineViewModel$OffersTimelineSheet2.offersTimeline, gapComposer, 6, 0);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(fillMaxWidth, 16.0f, 16.0f);
            int i3 = i2 & 112;
            boolean changedInstance = gapComposer.changedInstance(offersTimelineViewModel$OffersTimelineSheet2) | (i3 == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == obj) {
                rememberedValue = new OffersHomeV2Kt$$ExternalSyntheticLambda7(7, function1, offersTimelineViewModel$OffersTimelineSheet2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, m299paddingVpY3zN4, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(924104433, new P2PListViewKt$$ExternalSyntheticLambda12(offersTimelineViewModel$OffersTimelineSheet2, 16), gapComposer), gapComposer, 1573248, 56);
            gapComposer = gapComposer;
            gapComposer.end(true);
            OffersAnalyticsEventSpec offersAnalyticsEventSpec = offersTimelineViewModel$OffersTimelineSheet2.impressionEvent;
            if (offersAnalyticsEventSpec == null) {
                gapComposer.startReplaceGroup(-821706627);
                gapComposer.end(false);
                function12 = function1;
            } else {
                gapComposer.startReplaceGroup(-821706626);
                Unit unit = Unit.INSTANCE;
                boolean changed = gapComposer.changed(offersAnalyticsEventSpec) | (i3 == 32);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == obj) {
                    function12 = function1;
                    rememberedValue2 = new OffersTimelineKt$OffersTimeline$2$1$1(function12, offersAnalyticsEventSpec, null, 0);
                    gapComposer.updateRememberedValue(rememberedValue2);
                } else {
                    function12 = function1;
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
                gapComposer.end(false);
            }
        } else {
            offersTimelineViewModel$OffersTimelineSheet2 = offersTimelineViewModel$OffersTimelineSheet;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FakeOverlayLayerKt$$ExternalSyntheticLambda0(offersTimelineViewModel$OffersTimelineSheet2, function12, i, 23);
        }
    }

    public static final boolean access$isChainUpdate(BackwardsCompatNode backwardsCompatNode) {
        TailModifierNode tailModifierNode = (TailModifierNode) DepthSortedSetKt.requireLayoutNode(backwardsCompatNode).nodes.tail;
        tailModifierNode.getClass();
        return tailModifierNode.attachHasBeenRun;
    }
}
