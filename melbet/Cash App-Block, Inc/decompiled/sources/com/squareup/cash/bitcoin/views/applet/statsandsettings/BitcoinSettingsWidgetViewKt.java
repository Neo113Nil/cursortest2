package com.squareup.cash.bitcoin.views.applet.statsandsettings;

import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
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
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaer;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetOption;
import com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetViewModel;
import com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda12;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.you.WorkYouViewKt$$ExternalSyntheticLambda2;
import com.squareup.util.coroutines.TakeUntilKt;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class BitcoinSettingsWidgetViewKt {
    static {
        new BitcoinSettingsWidgetViewModel(true, CollectionsKt__CollectionsKt.listOf((Object[]) new BitcoinSettingsWidgetOption[]{new BitcoinSettingsWidgetOption.PricePerBitcoin("Price per Bitcoin", "$24.185.04"), new BitcoinSettingsWidgetOption.DisplayCurrency("Display Currency", "BTC"), new BitcoinSettingsWidgetOption.PriceAlerts("Price Alerts")}));
    }

    public static final void BitcoinSettingsWidgetView(BitcoinSettingsWidgetViewModel bitcoinSettingsWidgetViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        bitcoinSettingsWidgetViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1047171470);
        int i2 = i | (gapComposer.changed(bitcoinSettingsWidgetViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1054492870, new BitcoinUiFactory$$ExternalSyntheticLambda12(15, (Object) bitcoinSettingsWidgetViewModel, (Object) function1), gapComposer);
            if (bitcoinSettingsWidgetViewModel.showHeader) {
                gapComposer.startReplaceGroup(1938161940);
                TakeUntilKt.WidgetSectionView(Room.stringResource(gapComposer, R.string.bitcoin_settings_section_header), modifier, null, null, Expect_jvmKt.rememberComposableLambda(1761599981, new OverlayKt$$ExternalSyntheticLambda0(rememberComposableLambda, 8), gapComposer), gapComposer, ((i2 >> 3) & 112) | 196608, 28);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1938322179);
                rememberComposableLambda.invoke((Object) gapComposer, (Object) 6);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinMapViewKt$$ExternalSyntheticLambda0(modifier, (Object) bitcoinSettingsWidgetViewModel, function1, i, 13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [androidx.compose.ui.Modifier] */
    public static final void PrimaryAndSecondaryText(int i, Composer composer, Modifier modifier, String str, String str2) {
        Modifier modifier2;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-548309608);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(str2) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion3, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.End, Alignment.Companion.Top, gapComposer, 6);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Room.m1165Text25TpFw(0, 1, 0, 0, (i2 & 14) | 1572864, 0, 4028, 0L, (Composer) gapComposer, (Modifier) Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier, 1.0f, true), (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Request$Priority$EnumUnboxingLocalUtility.m$1(DefaultSizes.spacing, companion3, 16.0f, gapComposer);
            if (str2 != null) {
                gapComposer.startReplaceGroup(737206981);
                int i3 = (i2 >> 3) & 14;
                String accessibleBitcoinText = zzaer.accessibleBitcoinText(str2, gapComposer);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                if (Intrinsics.areEqual(accessibleBitcoinText, str2)) {
                    gapComposer.startReplaceGroup(737498660);
                    gapComposer.end(false);
                    companion2 = companion3;
                } else {
                    gapComposer.startReplaceGroup(737414774);
                    boolean changed = gapComposer.changed(accessibleBitcoinText);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new BadgeKt$$ExternalSyntheticLambda3(accessibleBitcoinText, 10);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    ?? semantics = SemanticsModifierKt.semantics(companion3, false, (Function1) rememberedValue);
                    gapComposer.end(false);
                    companion2 = semantics;
                }
                companion = companion3;
                Room.m1165Text25TpFw(0, 0, 0, 0, i3, 0, 4088, 0L, (Composer) gapComposer, (Modifier) companion2, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            } else {
                companion = companion3;
                gapComposer.startReplaceGroup(737546214);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WorkYouViewKt$$ExternalSyntheticLambda2(str, str2, modifier2, i, 1);
        }
    }

    public static final void StatsAndSettingsOption(BitcoinSettingsWidgetOption bitcoinSettingsWidgetOption, Modifier modifier, Function0 function0, Composer composer, int i) {
        Modifier modifier2;
        Modifier modifier3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-224316646);
        int i2 = i | (gapComposer.changedInstance(bitcoinSettingsWidgetOption) ? 4 : 2) | 48 | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String secondaryText = bitcoinSettingsWidgetOption.getSecondaryText();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (secondaryText != null) {
                gapComposer.startReplaceGroup(352106985);
                String secondaryText2 = bitcoinSettingsWidgetOption.getSecondaryText();
                secondaryText2.getClass();
                String accessibleBitcoinText = zzaer.accessibleBitcoinText(secondaryText2, gapComposer);
                boolean changedInstance = gapComposer.changedInstance(bitcoinSettingsWidgetOption) | gapComposer.changed(accessibleBitcoinText) | ((i2 & 896) == 256);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new CaptureCheckFaceKt$$ExternalSyntheticLambda11(3, bitcoinSettingsWidgetOption, accessibleBitcoinText, function0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                modifier3 = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(352358674);
                gapComposer.end(false);
                modifier3 = companion;
            }
            CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(Expect_jvmKt.rememberComposableLambda(-817518388, new CashtagViewKt$$ExternalSyntheticLambda10(bitcoinSettingsWidgetOption, 19), gapComposer), modifier3, function0, false, false, null, null, 0L, function0 != null ? CellDefaultAccessory.Push.INSTANCE : null, null, gapComposer, (i2 & 896) | 6, 1528);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinMapViewKt$$ExternalSyntheticLambda0(bitcoinSettingsWidgetOption, modifier2, function0, i, 14);
        }
    }
}
