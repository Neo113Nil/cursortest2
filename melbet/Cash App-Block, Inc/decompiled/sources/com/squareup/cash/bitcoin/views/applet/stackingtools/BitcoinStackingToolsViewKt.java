package com.squareup.cash.bitcoin.views.applet.stackingtools;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda2;
import com.squareup.cash.bitcoin.viewmodels.applet.stackingtools.BitcoinStackingToolsViewModel;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositsViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.checks.VerifyCheckDepositKt$$ExternalSyntheticLambda14;
import com.squareup.cash.common.composeui.ArcadeBannerCardKt$$ExternalSyntheticLambda4;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.util.coroutines.TakeUntilKt;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class BitcoinStackingToolsViewKt {
    static {
        Boolean bool = Boolean.FALSE;
        new BitcoinStackingToolsViewModel(new BitcoinStackingToolsViewModel.BitcoinStackingToolsItem(bool, "Receive as bitcoin", "50% of each payment received"), new BitcoinStackingToolsViewModel.BitcoinStackingToolsItem(bool, "Round Ups", "Invest your spare change"), new BitcoinStackingToolsViewModel.BitcoinStackingToolsItem(bool, "Auto Invest", "Setup recurring buys"), new BitcoinStackingToolsViewModel.BitcoinStackingToolsItem(bool, "Paid in bitcoin", "Invest your direct deposits into bitcoin without a fee"), true);
    }

    public static final void BitcoinStackingToolsView(BitcoinStackingToolsViewModel bitcoinStackingToolsViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        bitcoinStackingToolsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(259257876);
        int i2 = i | (gapComposer.changedInstance(bitcoinStackingToolsViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            String str = null;
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
            String stringResource = Room.stringResource(gapComposer, R.string.bitcoin_views_grow_your_bitcoin);
            if (bitcoinStackingToolsViewModel.showLearnMore) {
                str = re$$ExternalSyntheticOutline0.m(gapComposer, 1094090281, R.string.profile_section_btc_satoshis_learn_more, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(1094184490);
                gapComposer.end(false);
            }
            String str2 = str;
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BitcoinDepositsViewKt$$ExternalSyntheticLambda11(15, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            TakeUntilKt.WidgetSectionView(stringResource, null, str2, (Function0) rememberedValue, Expect_jvmKt.rememberComposableLambda(1344973496, new BankingDialogKt$$ExternalSyntheticLambda2(28, (Object) bitcoinStackingToolsViewModel, function1), gapComposer), gapComposer, 196608, 18);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinMapViewKt$$ExternalSyntheticLambda0(modifier2, (Object) bitcoinStackingToolsViewModel, function1, i, 12);
        }
    }

    public static final void CellDefault(final BitcoinStackingToolsViewModel.BitcoinStackingToolsItem bitcoinStackingToolsItem, Function0 function0, Icons icons, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Pair pair;
        CellDefaultAccessory cellDefaultAccessory;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(614421343);
        int i2 = i | (gapComposer.changedInstance(bitcoinStackingToolsItem) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | 3072;
        final int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Boolean bool = bitcoinStackingToolsItem.enabled;
            if (bool.equals(Boolean.TRUE)) {
                gapComposer.startReplaceGroup(2048397706);
                String stringResource = Room.stringResource(gapComposer, R.string.bitcoin_views_on_label);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                pair = new Pair(stringResource, new Color(colors.semantic.text.standard));
                gapComposer.end(false);
            } else {
                if (!bool.equals(Boolean.FALSE)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 2048396484, false);
                }
                gapComposer.startReplaceGroup(2048401894);
                String stringResource2 = Room.stringResource(gapComposer, R.string.bitcoin_views_off_label);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                pair = new Pair(stringResource2, new Color(colors2.semantic.icon.disabled));
                gapComposer.end(false);
            }
            String str = (String) pair.first;
            long j = ((Color) pair.second).value;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors3 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors3 == null) {
                colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j2 = colors3.semantic.background.subtle;
            Colors colors4 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors4 == null) {
                colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j3 = colors4.semantic.icon.subtle;
            if (str == null) {
                gapComposer.startReplaceGroup(-923545672);
                gapComposer.end(false);
                cellDefaultAccessory = CellDefaultAccessory.Push.INSTANCE;
            } else {
                gapComposer.startReplaceGroup(-923495514);
                CellDefaultAccessory label = new CellDefaultAccessory.Label(Expect_jvmKt.rememberComposableLambda(680563676, new ArcadeBannerCardKt$$ExternalSyntheticLambda4(str, j, 3), gapComposer), 2);
                gapComposer.end(false);
                cellDefaultAccessory = label;
            }
            final int i4 = 1;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons, null, j2, Expect_jvmKt.rememberComposableLambda(1156529562, new Function2() { // from class: com.squareup.cash.bitcoin.views.applet.stackingtools.BitcoinStackingToolsViewKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i3;
                    BitcoinStackingToolsViewModel.BitcoinStackingToolsItem bitcoinStackingToolsItem2 = bitcoinStackingToolsItem;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bitcoinStackingToolsItem2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bitcoinStackingToolsItem2.subtitle, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), companion, j3, function0, null, false, false, Expect_jvmKt.rememberComposableLambda(1686517958, new Function2() { // from class: com.squareup.cash.bitcoin.views.applet.stackingtools.BitcoinStackingToolsViewKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    BitcoinStackingToolsViewModel.BitcoinStackingToolsItem bitcoinStackingToolsItem2 = bitcoinStackingToolsItem;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bitcoinStackingToolsItem2.title, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer3;
                            if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, bitcoinStackingToolsItem2.subtitle, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), null, cellDefaultAccessory, 0L, null, gapComposer, 27702 | ((i2 << 15) & 3670016), 6, 27520);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new VerifyCheckDepositKt$$ExternalSyntheticLambda14(bitcoinStackingToolsItem, function0, icons, modifier2, i);
        }
    }
}
