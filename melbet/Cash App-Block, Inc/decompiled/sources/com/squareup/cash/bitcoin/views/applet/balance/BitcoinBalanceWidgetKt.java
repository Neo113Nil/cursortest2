package com.squareup.cash.bitcoin.views.applet.balance;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt$$ExternalSyntheticLambda13;
import app.cash.molecule.PlatformKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda5;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacg;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaer;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.views.BankingDialog$$ExternalSyntheticLambda1;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda2;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.bitcoin.viewmodels.applet.balance.BitcoinBalanceWidgetViewModel;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.checks.ConfirmBackOfCheckKt$$ExternalSyntheticLambda6;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.ui.widget.text.AnimatedAmountTextView;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class BitcoinBalanceWidgetKt {
    static {
        new BitcoinBalanceWidgetViewModel("$150.00", ".00047 BTC", "Bitcoin", 15000L);
    }

    public static final void BalancePrimaryAmount(String str, Modifier modifier, Long l, Composer composer, int i) {
        Modifier modifier2;
        String accessibleBitcoinText;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-990087148);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | 48 | (gapComposer.changed(l) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            if (str == null) {
                gapComposer.startReplaceGroup(-2145662858);
                gapComposer.end(false);
                accessibleBitcoinText = null;
            } else {
                gapComposer.startReplaceGroup(2008995051);
                accessibleBitcoinText = zzaer.accessibleBitcoinText(str, gapComposer);
                gapComposer.end(false);
            }
            if (accessibleBitcoinText == null) {
                accessibleBitcoinText = "";
            }
            boolean changed = gapComposer.changed(accessibleBitcoinText);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BadgeKt$$ExternalSyntheticLambda3(accessibleBitcoinText, 7);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modifier2 = Modifier.Companion.$$INSTANCE;
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier2, (Function1) rememberedValue);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clearAndSetSemantics);
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
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalTextStyle;
            TextStyle textStyle = (TextStyle) gapComposer.consume(dynamicProvidableCompositionLocal);
            if (textStyle == null) {
                gapComposer.startReplaceGroup(396274042);
                textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).numeralLarge;
            } else {
                gapComposer.startReplaceGroup(396272523);
            }
            gapComposer.end(false);
            long j = ((Color) gapComposer.consume(ArcadeThemeKt.LocalTextColor)).value;
            AnimatedAmountTextView.Amount amount = new AnimatedAmountTextView.Amount(l != null ? l.longValue() : 0L, 1L, str == null ? "" : str);
            TextStyle textStyle2 = (TextStyle) gapComposer.consume(dynamicProvidableCompositionLocal);
            VisibleKt.m3482AnimatedAmountTextJDMA8c0(null, textStyle, j, textStyle2 != null ? textStyle2.paragraphStyle.textAlign : 5, amount, null, false, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).numeralSmall.spanStyle.fontSize, gapComposer, 0, 97);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BankingDialog$$ExternalSyntheticLambda1(str, modifier2, l, i, 29);
        }
    }

    public static final void BalanceSubAmount(int i, Composer composer, Modifier modifier, String str, Function1 function1) {
        Modifier modifier2;
        String accessibleBitcoinText;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2109271547);
        int i2 = i | (gapComposer.changedInstance(function1) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            if (str == null) {
                gapComposer.startReplaceGroup(-1936944859);
                gapComposer.end(false);
                accessibleBitcoinText = null;
            } else {
                gapComposer.startReplaceGroup(214612572);
                accessibleBitcoinText = zzaer.accessibleBitcoinText(str, gapComposer);
                gapComposer.end(false);
            }
            if (accessibleBitcoinText == null) {
                accessibleBitcoinText = "";
            }
            String stringResource = Room.stringResource(gapComposer, R.string.bitcoin_views_switch_currency);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
            Role role = new Role(0);
            boolean z = (i2 & 14) == 4;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == obj) {
                rememberedValue2 = new BenefitsHubViewKt$$ExternalSyntheticLambda4(29, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(companion, mutableInteractionSourceImpl, null, false, null, role, (Function0) rememberedValue2, 12);
            boolean changed = gapComposer.changed(accessibleBitcoinText) | gapComposer.changed(stringResource);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed || rememberedValue3 == obj) {
                rememberedValue3 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(accessibleBitcoinText, stringResource, 9);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(m182clickableO2vRcR0$default, (Function1) rememberedValue3);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clearAndSetSemantics);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier.Companion companion2 = companion;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str == null ? "" : str, (Map) null, (Function1) null, false);
            Strings.getSizes(gapComposer).getClass();
            Request$Priority$EnumUnboxingLocalUtility.m$1(DefaultSizes.spacing, companion2, 8.0f, gapComposer);
            Icons icons = Icons.Switcher16;
            long j = Strings.getColors(gapComposer).semantic.icon.standard;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == obj) {
                rememberedValue4 = new BenefitsHubViewKt$$ExternalSyntheticLambda2(19);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Trace.m1191Iconww6aTOc(icons, (String) null, SemanticsModifierKt.clearAndSetSemantics(companion2, (Function1) rememberedValue4), j, gapComposer, 54, 0);
            gapComposer.end(true);
            modifier2 = companion2;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckoutTipSectionKt$$ExternalSyntheticLambda13(function1, str, modifier2, i);
        }
    }

    public static final void BitcoinBalanceWidget(BitcoinBalanceWidgetViewModel bitcoinBalanceWidgetViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        ComposableLambdaImpl rememberComposableLambda;
        bitcoinBalanceWidgetViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1974951974);
        int i2 = 4;
        int i3 = (gapComposer.changedInstance(bitcoinBalanceWidgetViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            String str = bitcoinBalanceWidgetViewModel.sectionTitle;
            if (str == null) {
                gapComposer.startReplaceGroup(962985632);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(962985633);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1917638938, new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(str, i2), gapComposer);
                gapComposer.end(false);
            }
            zzacg.m2009HeroNumericsHeadertv5qRRQ(Expect_jvmKt.rememberComposableLambda(946320448, new CashtagViewKt$$ExternalSyntheticLambda10(bitcoinBalanceWidgetViewModel, 18), gapComposer), fillMaxWidth, 0, rememberComposableLambda, (Function3) null, Expect_jvmKt.rememberComposableLambda(-2109150733, new BankingDialogKt$$ExternalSyntheticLambda2(23, function1, bitcoinBalanceWidgetViewModel), gapComposer), (Function2) null, gapComposer, 196614, 84);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BankingDialog$$ExternalSyntheticLambda1((Object) bitcoinBalanceWidgetViewModel, function1, (Object) modifier, i, 28);
        }
    }
}
