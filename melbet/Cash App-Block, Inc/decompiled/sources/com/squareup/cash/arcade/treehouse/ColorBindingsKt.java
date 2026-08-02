package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import android.view.View;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.RelationUtil;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.RadioKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda5;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.profile.views.RingtoneView$playRingtone$1;
import com.squareup.cash.ui.widget.keypad.KeypadViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class ColorBindingsKt {
    public static final ComposableLambdaImpl lambda$1453973218 = new ComposableLambdaImpl(new AvatarsKt$$ExternalSyntheticLambda0(6), false, 1453973218);

    /* renamed from: PasscodeDots-T042LqI, reason: not valid java name */
    public static final void m3401PasscodeDotsT042LqI(final int i, final int i2, final long j, final int i3, final Modifier modifier, Composer composer, final int i4) {
        int i5;
        int i6;
        long j2;
        boolean z;
        int i7 = i;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2083368679);
        if ((i4 & 6) == 0) {
            i5 = (gapComposer.changed(i7) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= gapComposer.changed(i2) ? 32 : 16;
        }
        if ((i4 & MLKEMEngine.KyberPolyBytes) == 0) {
            i5 |= gapComposer.changed(j) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= gapComposer.changed(i3) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= gapComposer.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 9363) != 9362)) {
            long Color = ColorKt.Color(ThemeHelpersKt.themeInfo((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext)).colorPalette.pinDot);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Animatable animatable = (Animatable) rememberedValue;
            Integer valueOf = Integer.valueOf(i3);
            boolean changedInstance = ((i5 & 7168) == 2048) | gapComposer.changedInstance(animatable);
            Object rememberedValue2 = gapComposer.rememberedValue();
            long j3 = Color;
            Continuation continuation = null;
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new RingtoneView$playRingtone$1(i3, animatable, continuation, 5);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue2);
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(modifier, 64.0f);
            boolean changedInstance2 = gapComposer.changedInstance(animatable);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new RadioKt$$ExternalSyntheticLambda1(animatable, 7);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier graphicsLayer = ColorKt.graphicsLayer(m277height3ABfNKs, (Function1) rememberedValue3);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, graphicsLayer);
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
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(183633442);
            int i8 = 0;
            while (i8 < i2) {
                NeverEqualPolicy neverEqualPolicy2 = neverEqualPolicy;
                long j4 = j3;
                State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(i8 < i7 ? 1.0f : RecyclerView.DECELERATION_RATE, AnimatableKt.spring$default(0.45f, RecyclerView.DECELERATION_RATE, null, 6), "passcodeDotFill", null, gapComposer, 3120, 20);
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 20.0f);
                boolean changed = gapComposer.changed(j4) | gapComposer.changed(animateFloatAsState) | ((i5 & 896) == 256);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changed || rememberedValue4 == neverEqualPolicy2) {
                    i6 = 6;
                    j2 = j4;
                    z = false;
                    rememberedValue4 = new PasscodeInputComposablesKt$$ExternalSyntheticLambda5(j2, j, animateFloatAsState, 0);
                    gapComposer.updateRememberedValue(rememberedValue4);
                } else {
                    i6 = 6;
                    j2 = j4;
                    z = false;
                }
                CanvasKt.Canvas(i6, gapComposer, m285size3ABfNKs, (Function1) rememberedValue4);
                if (i8 != i2 - 1) {
                    gapComposer.startReplaceGroup(-1400467746);
                    SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 32.0f));
                    gapComposer.end(z);
                } else {
                    gapComposer.startReplaceGroup(-1400407203);
                    gapComposer.end(z);
                }
                i8++;
                neverEqualPolicy = neverEqualPolicy2;
                j3 = j2;
                i7 = i;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.arcade.treehouse.PasscodeInputComposablesKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ColorBindingsKt.m3401PasscodeDotsT042LqI(i, i2, j, i3, modifier, (Composer) obj, Updater.updateChangedFlags(i4 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: PasscodeInput-lVb_Clg, reason: not valid java name */
    public static final void m3402PasscodeInputlVb_Clg(final int i, final int i2, final long j, final int i3, final Function1 function1, final Function0 function0, final Function0 function02, Modifier modifier, Composer composer, final int i4) {
        final Modifier modifier2;
        Modifier modifier3;
        function1.getClass();
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1887754650);
        int i5 = i4 | (gapComposer.changed(i) ? 4 : 2) | (gapComposer.changed(i2) ? 32 : 16) | (gapComposer.changed(j) ? 256 : 128) | (gapComposer.changed(i3) ? 2048 : 1024) | (gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(function0) ? 131072 : 65536) | (gapComposer.changedInstance(function02) ? 1048576 : PKIFailureInfo.signerNotTrusted) | 12582912;
        if (gapComposer.shouldExecute(i5 & 1, (4793491 & i5) != 4793490)) {
            boolean z = ((57344 & i5) == 16384) | ((458752 & i5) == 131072) | ((3670016 & i5) == 1048576);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                rememberedValue = new KeypadViewModel(KeypadViewModel.keysWithoutSeparator, false, new BankingDialogKt$$ExternalSyntheticLambda5(16, ref$BooleanRef, function02), new UtilsKt$$ExternalSyntheticLambda0(24, ref$BooleanRef, function0, function1), 2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            KeypadViewModel keypadViewModel = (KeypadViewModel) rememberedValue;
            View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) rememberedValue2;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            boolean changed = gapComposer.changed(density) | gapComposer.changedInstance(view);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new UtilsKt$$ExternalSyntheticLambda0(25, density, mutableState, view);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(fillMaxWidth, (Function1) rememberedValue3);
            Dp dp = (Dp) mutableState.getValue();
            if (dp == null || (modifier3 = SizeKt.m277height3ABfNKs(companion, dp.value)) == null) {
                modifier3 = companion;
            }
            Modifier then = onGloballyPositioned.then(modifier3);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then);
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
            m3401PasscodeDotsT042LqI(i, i2, j, i3, SpacerKt.m299paddingVpY3zN4(SizeKt.fillMaxWidth(companion, 1.0f), 32.0f, 16.0f), gapComposer, (i5 & 14) | 24576 | (i5 & 112) | (i5 & 896) | (i5 & 7168));
            gapComposer = gapComposer;
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
            RelationUtil.m1189KeypadViewww6aTOc(SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f), keypadViewModel, null, 0L, gapComposer, 6, 12);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(i, i2, j, i3, function1, function0, function02, modifier2, i4) { // from class: com.squareup.cash.arcade.treehouse.PasscodeInputComposablesKt$$ExternalSyntheticLambda3
                public final /* synthetic */ int f$0;
                public final /* synthetic */ int f$1;
                public final /* synthetic */ long f$2;
                public final /* synthetic */ int f$3;
                public final /* synthetic */ Function1 f$4;
                public final /* synthetic */ Function0 f$5;
                public final /* synthetic */ Function0 f$6;
                public final /* synthetic */ Modifier f$7;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    ColorBindingsKt.m3402PasscodeInputlVb_Clg(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static final long getColorById(Colors colors, String str) {
        colors.getClass();
        str.getClass();
        switch (str.hashCode()) {
            case -2141214551:
                if (str.equals("serviceBitcoin")) {
                    return colors.getSemantic().getService().m3343getBitcoin0d7_KjU();
                }
                break;
            case -2119921457:
                if (str.equals("inputChipIcon")) {
                    return colors.getComponent().getInput().chip.icon.m3174getDefault0d7_KjU();
                }
                break;
            case -2119638025:
                if (str.equals("accentSky")) {
                    return colors.getSemantic().getAccent().m3316getSky0d7_KjU();
                }
                break;
            case -2096879507:
                if (str.equals("keypadIcon")) {
                    return colors.getSurface().getKeypad().m3360getIcon0d7_KjU();
                }
                break;
            case -2096549599:
                if (str.equals("keypadText")) {
                    return colors.getSurface().getKeypad().text;
                }
                break;
            case -2019697890:
                if (str.equals("searchBarIconPressed")) {
                    return colors.getComponent().searchBar.icon.m3239getPressed0d7_KjU();
                }
                break;
            case -2016225784:
                if (str.equals("moneyAppletBackground")) {
                    return colors.getSurface().getMoney().getApplet().m3365getBackground0d7_KjU();
                }
                break;
            case -2015987763:
                if (str.equals("investing")) {
                    return colors.getSemantic().getService().investing;
                }
                break;
            case -2010499802:
                if (str.equals("cardBorderPressed")) {
                    return colors.getComponent().card.border.m3123getPressed0d7_KjU();
                }
                break;
            case -1992422315:
                if (str.equals("buttonSubtleBackgroundPressed")) {
                    return colors.getComponent().getButton().getSubtle().background.pressed;
                }
                break;
            case -1976859247:
                if (str.equals("modalButtonDestructiveBackgroundPressed")) {
                    return colors.getComponent().getModal().getButton().destructive.getBackground().m3197getPressed0d7_KjU();
                }
                break;
            case -1945180619:
                if (str.equals("checkboxActiveBorder")) {
                    return colors.getComponent().getCheckbox().active.getBorder().m3140getDefault0d7_KjU();
                }
                break;
            case -1929868703:
                if (str.equals("buttonProminentTextPressed")) {
                    return colors.getComponent().getButton().getProminent().getText().pressed;
                }
                break;
            case -1929511068:
                if (str.equals("timelineDotBackgroundNotStarted")) {
                    return colors.getComponent().getTimeline().getDot().getBackground().m3269getNotStarted0d7_KjU();
                }
                break;
            case -1926514267:
                if (str.equals("brandGreenH1")) {
                    return colors.getBase().m3020getBrandGreenH10d7_KjU();
                }
                break;
            case -1926513926:
                if (str.equals("brandGreenS1")) {
                    return colors.getBase().m3021getBrandGreenS10d7_KjU();
                }
                break;
            case -1919723825:
                if (str.equals("buttonDestructiveProminentIcon")) {
                    return colors.getComponent().getButton().getDestructive().getProminent().icon.f152default;
                }
                break;
            case -1919393917:
                if (str.equals("buttonDestructiveProminentText")) {
                    return colors.getComponent().getButton().getDestructive().getProminent().text.f153default;
                }
                break;
            case -1913511025:
                if (str.equals("timelineLineBorderSkipped")) {
                    return colors.getComponent().getTimeline().getLine().getBorder().m3278getSkipped0d7_KjU();
                }
                break;
            case -1904016739:
                if (str.equals("buttonStandardBackground")) {
                    return colors.getComponent().getButton().getStandard().getBackground().m3118getDefault0d7_KjU();
                }
                break;
            case -1893632493:
                if (str.equals("backgroundApp")) {
                    return colors.getSemantic().getBackground().f1047app;
                }
                break;
            case -1868527352:
                if (str.equals("uiHomeIndicatorBorder")) {
                    return colors.getComponent().getUi().homeIndicator.m3308getBorder0d7_KjU();
                }
                break;
            case -1858746926:
                if (str.equals("cellBackgroundPressed")) {
                    return colors.getComponent().getCell().background.m3125getPressed0d7_KjU();
                }
                break;
            case -1857353145:
                if (str.equals("androidButtonStandardTextDisabled")) {
                    return colors.getComponent().getButton().getStandard().getText().disabled;
                }
                break;
            case -1837877341:
                if (str.equals("inputHelperTextError")) {
                    return colors.getComponent().getInput().helper.text.m3178getError0d7_KjU();
                }
                break;
            case -1822242083:
                if (str.equals("titleBarKeypadBackground")) {
                    return colors.getComponent().getTitleBar().keypad.m3287getBackground0d7_KjU();
                }
                break;
            case -1817269313:
                if (str.equals("titleBarButtonBackgroundTransparentLight")) {
                    return colors.getComponent().getTitleBar().button.background.m3284getTransparentLight0d7_KjU();
                }
                break;
            case -1786976816:
                if (str.equals("copyCodeBackground")) {
                    return colors.getComponent().getCopyCode().background.m3147getDefault0d7_KjU();
                }
                break;
            case -1782079489:
                if (str.equals("segmentedControlOverlayButtonTextSelected")) {
                    return colors.getComponent().getSegmentedControl().overlay.button.text.m3253getSelected0d7_KjU();
                }
                break;
            case -1772695750:
                if (str.equals("halfSheetBackground")) {
                    return colors.getComponent().getHalfSheet().m3160getBackground0d7_KjU();
                }
                break;
            case -1758118409:
                if (str.equals("androidButtonStandardIcon")) {
                    return colors.getComponent().getButton().getStandard().icon.f164default;
                }
                break;
            case -1757788501:
                if (str.equals("androidButtonStandardText")) {
                    return colors.getComponent().getButton().getStandard().getText().m3119getDefault0d7_KjU();
                }
                break;
            case -1752374297:
                if (str.equals("androidButtonDestructiveSubtleIcon")) {
                    return colors.getComponent().getButton().getDestructive().getSubtle().getIcon().f158default;
                }
                break;
            case -1752044389:
                if (str.equals("androidButtonDestructiveSubtleText")) {
                    return colors.getComponent().getButton().getDestructive().getSubtle().getText().f159default;
                }
                break;
            case -1734995139:
                if (str.equals("mooncakeServiceTaxes")) {
                    return colors.getSemantic().getService().taxes;
                }
                break;
            case -1730012776:
                if (str.equals("buttonSubtleIcon")) {
                    return colors.getComponent().getButton().getSubtle().getIcon().f167default;
                }
                break;
            case -1729682868:
                if (str.equals("buttonSubtleText")) {
                    return colors.getComponent().getButton().getSubtle().getText().f168default;
                }
                break;
            case -1697633473:
                if (str.equals("inputIconPressed")) {
                    return colors.getComponent().getInput().getIcon().m3182getPressed0d7_KjU();
                }
                break;
            case -1683979827:
                if (str.equals("iconProminent")) {
                    return colors.getSemantic().getIcon().m3339getProminent0d7_KjU();
                }
                break;
            case -1681627603:
                if (str.equals("copyCodeSuccessBorder")) {
                    return colors.getComponent().getCopyCode().success.m3150getBorder0d7_KjU();
                }
                break;
            case -1675455382:
                if (str.equals("inputBackgroundPressed")) {
                    return colors.getComponent().getInput().background.m3166getPressed0d7_KjU();
                }
                break;
            case -1662222390:
                if (str.equals("optionChipTextDisabled")) {
                    return colors.getComponent().getOptionChip().text.m3228getDisabled0d7_KjU();
                }
                break;
            case -1642648567:
                if (str.equals("radioActiveBorderDisabled")) {
                    return colors.getComponent().getRadio().active.border.m3231getDisabled0d7_KjU();
                }
                break;
            case -1628614296:
                if (str.equals("avatarBackgroundEight")) {
                    return colors.getComponent().getAvatar().getBackground().m3085getEight0d7_KjU();
                }
                break;
            case -1627666941:
                if (str.equals("cellControlsActivityAmountStruckOut")) {
                    return colors.getComponent().getCell().getControls().activityAmount.m3131getStruckOut0d7_KjU();
                }
                break;
            case -1615789850:
                if (str.equals("avatarBackgroundSeven")) {
                    return colors.getComponent().getAvatar().getBackground().m3090getSeven0d7_KjU();
                }
                break;
            case -1614780809:
                if (str.equals("avatarBackgroundThree")) {
                    return colors.getComponent().getAvatar().getBackground().m3092getThree0d7_KjU();
                }
                break;
            case -1608669724:
                if (str.equals("cardBackgroundPressed")) {
                    return colors.getComponent().card.background.m3121getPressed0d7_KjU();
                }
                break;
            case -1603966682:
                if (str.equals("accentPurple")) {
                    return colors.getSemantic().getAccent().m3313getPurple0d7_KjU();
                }
                break;
            case -1581275996:
                if (str.equals("iconExtraSubtle")) {
                    return colors.getSemantic().getIcon().m3337getExtraSubtle0d7_KjU();
                }
                break;
            case -1581103159:
                if (str.equals("brandCashGreen")) {
                    return colors.getBase().m2996getBrandCashGreen0d7_KjU();
                }
                break;
            case -1562648270:
                if (str.equals("inputBorderDisabled")) {
                    return colors.getComponent().getInput().border.m3170getDisabled0d7_KjU();
                }
                break;
            case -1562592344:
                if (str.equals("optionChipBorderSelected")) {
                    return colors.getComponent().getOptionChip().border.m3224getSelected0d7_KjU();
                }
                break;
            case -1535251552:
                if (str.equals("backgroundInversePressed")) {
                    return colors.getSemantic().getBackground().m3322getInversePressed0d7_KjU();
                }
                break;
            case -1529305773:
                if (str.equals("bottomNavigationBitcoinIconSelected")) {
                    return colors.getComponent().getBottomNavigation().bitcoin.icon.m3101getSelected0d7_KjU();
                }
                break;
            case -1528243706:
                if (str.equals("textPlaceholder")) {
                    return colors.getSemantic().getText().placeholder;
                }
                break;
            case -1521299702:
                if (str.equals("uiCursor")) {
                    return colors.getComponent().getUi().m3306getCursor0d7_KjU();
                }
                break;
            case -1515522234:
                if (str.equals("brandSunshine")) {
                    return colors.getBase().m3037getBrandSunshine0d7_KjU();
                }
                break;
            case -1477974009:
                if (str.equals("androidButtonDestructiveStandardTextDisabled")) {
                    return colors.getComponent().getButton().getDestructive().getStandard().getText().disabled;
                }
                break;
            case -1467858082:
                if (str.equals("modalButtonSecondaryTextDisabled")) {
                    return colors.getComponent().getModal().getButton().secondary.text.m3209getDisabled0d7_KjU();
                }
                break;
            case -1455609004:
                if (str.equals("radioInactiveBackground")) {
                    return colors.getComponent().getRadio().inactive.background.m3232getDefault0d7_KjU();
                }
                break;
            case -1454512080:
                if (str.equals("cellBackground")) {
                    return colors.getComponent().getCell().background.m3124getDefault0d7_KjU();
                }
                break;
            case -1447682441:
                if (str.equals("buttonDestructiveStandardBackgroundDisabled")) {
                    return colors.getComponent().getButton().getDestructive().getStandard().getBackground().disabled;
                }
                break;
            case -1442270285:
                if (str.equals("inputTextDisabled")) {
                    return colors.getComponent().getInput().text.m3194getDisabled0d7_KjU();
                }
                break;
            case -1420020686:
                if (str.equals("copyCodeBackgroundPressed")) {
                    return colors.getComponent().getCopyCode().background.m3148getPressed0d7_KjU();
                }
                break;
            case -1418511786:
                if (str.equals("androidButtonStandardBackgroundPressed")) {
                    return colors.getComponent().getButton().getStandard().getBackground().pressed;
                }
                break;
            case -1417280882:
                if (str.equals("iconBrand")) {
                    return colors.getSemantic().getIcon().m3334getBrand0d7_KjU();
                }
                break;
            case -1385986055:
                if (str.equals("blue10")) {
                    return colors.getBase().m2990getBlue100d7_KjU();
                }
                break;
            case -1385986024:
                if (str.equals("blue20")) {
                    return colors.getBase().m2991getBlue200d7_KjU();
                }
                break;
            case -1379355352:
                if (str.equals("uiHandleBorder")) {
                    return colors.getComponent().getUi().getHandle().m3307getBorder0d7_KjU();
                }
                break;
            case -1373091214:
                if (str.equals("modalButtonDestructiveTextPressed")) {
                    return colors.getComponent().getModal().getButton().destructive.text.m3200getPressed0d7_KjU();
                }
                break;
            case -1366984272:
                if (str.equals("toggleThumbBackground")) {
                    return colors.getComponent().getToggle().thumb.background.m3303getDefault0d7_KjU();
                }
                break;
            case -1360342657:
                if (str.equals("avatarBackgroundOne")) {
                    return colors.getComponent().getAvatar().getBackground().m3089getOne0d7_KjU();
                }
                break;
            case -1360338949:
                if (str.equals("avatarBackgroundSix")) {
                    return colors.getComponent().getAvatar().getBackground().m3091getSix0d7_KjU();
                }
                break;
            case -1360337563:
                if (str.equals("avatarBackgroundTwo")) {
                    return colors.getComponent().getAvatar().getBackground().m3093getTwo0d7_KjU();
                }
                break;
            case -1348127146:
                if (str.equals("iconStandard")) {
                    return colors.getSemantic().getIcon().standard;
                }
                break;
            case -1329010141:
                if (str.equals("inputIconLeading")) {
                    return colors.getComponent().getInput().getIcon().leading.m3183getDefault0d7_KjU();
                }
                break;
            case -1312172505:
                if (str.equals("androidButtonSubtleIcon")) {
                    return colors.getComponent().getButton().getSubtle().getIcon().f167default;
                }
                break;
            case -1311842597:
                if (str.equals("androidButtonSubtleText")) {
                    return colors.getComponent().getButton().getSubtle().getText().f168default;
                }
                break;
            case -1284360864:
                if (str.equals("accentPink")) {
                    return colors.getSemantic().getAccent().m3312getPink0d7_KjU();
                }
                break;
            case -1257674676:
                if (str.equals("toggleThumbBackgroundDisabled")) {
                    return colors.getComponent().getToggle().thumb.background.m3304getDisabled0d7_KjU();
                }
                break;
            case -1257454029:
                if (str.equals("radioActiveBackgroundPressed")) {
                    return colors.getComponent().getRadio().active.getBackground().m3229getPressed0d7_KjU();
                }
                break;
            case -1255751722:
                if (str.equals("buttonDestructiveSubtleIcon")) {
                    return colors.getComponent().getButton().getDestructive().getSubtle().getIcon().f158default;
                }
                break;
            case -1255421814:
                if (str.equals("buttonDestructiveSubtleText")) {
                    return colors.getComponent().getButton().getDestructive().getSubtle().getText().f159default;
                }
                break;
            case -1253753729:
                if (str.equals("inputIconLeadingPressed")) {
                    return colors.getComponent().getInput().getIcon().leading.m3185getPressed0d7_KjU();
                }
                break;
            case -1247179022:
                if (str.equals("backgroundInverseRipple")) {
                    return colors.getSemantic().getBackground().m3323getInverseRipple0d7_KjU();
                }
                break;
            case -1237756610:
                if (str.equals("grey10")) {
                    return colors.getBase().m3047getGrey100d7_KjU();
                }
                break;
            case -1237756605:
                if (str.equals("grey15")) {
                    return colors.getBase().m3048getGrey150d7_KjU();
                }
                break;
            case -1237756579:
                if (str.equals("grey20")) {
                    return colors.getBase().m3049getGrey200d7_KjU();
                }
                break;
            case -1237756574:
                if (str.equals("grey25")) {
                    return colors.getBase().m3050getGrey250d7_KjU();
                }
                break;
            case -1237756548:
                if (str.equals("grey30")) {
                    return colors.getBase().m3051getGrey300d7_KjU();
                }
                break;
            case -1237756517:
                if (str.equals("grey40")) {
                    return colors.getBase().m3052getGrey400d7_KjU();
                }
                break;
            case -1237756512:
                if (str.equals("grey45")) {
                    return colors.getBase().m3053getGrey450d7_KjU();
                }
                break;
            case -1237756486:
                if (str.equals("grey50")) {
                    return colors.getBase().m3054getGrey500d7_KjU();
                }
                break;
            case -1237756455:
                if (str.equals("grey60")) {
                    return colors.getBase().m3055getGrey600d7_KjU();
                }
                break;
            case -1237756450:
                if (str.equals("grey65")) {
                    return colors.getBase().m3056getGrey650d7_KjU();
                }
                break;
            case -1237756393:
                if (str.equals("grey80")) {
                    return colors.getBase().m3057getGrey800d7_KjU();
                }
                break;
            case -1237756388:
                if (str.equals("grey85")) {
                    return colors.getBase().m3058getGrey850d7_KjU();
                }
                break;
            case -1237756362:
                if (str.equals("grey90")) {
                    return colors.getBase().m3059getGrey900d7_KjU();
                }
                break;
            case -1237756357:
                if (str.equals("grey95")) {
                    return colors.getBase().m3060getGrey950d7_KjU();
                }
                break;
            case -1237756354:
                if (str.equals("grey98")) {
                    return colors.getBase().m3061getGrey980d7_KjU();
                }
                break;
            case -1224762605:
                if (str.equals("brandCitronH1")) {
                    return colors.getBase().m3016getBrandCitronH10d7_KjU();
                }
                break;
            case -1224762264:
                if (str.equals("brandCitronS1")) {
                    return colors.getBase().m3017getBrandCitronS10d7_KjU();
                }
                break;
            case -1211043648:
                if (str.equals("cellBodyDisabled")) {
                    return colors.getComponent().getCell().body.m3127getDisabled0d7_KjU();
                }
                break;
            case -1207870013:
                if (str.equals("androidButtonSubtleIconDisabled")) {
                    return colors.getComponent().getButton().getSubtle().getIcon().disabled;
                }
                break;
            case -1204203423:
                if (str.equals("brandAquaS1")) {
                    return colors.getBase().m2993getBrandAquaS10d7_KjU();
                }
                break;
            case -1174226375:
                if (str.equals("accentAmber")) {
                    return colors.getSemantic().getAccent().m3310getAmber0d7_KjU();
                }
                break;
            case -1170988679:
                if (str.equals("segmentedControlBackground")) {
                    return colors.getComponent().getSegmentedControl().m3248getBackground0d7_KjU();
                }
                break;
            case -1161830035:
                if (str.equals("filterBarChipBackgroundPressed")) {
                    return colors.getComponent().getFilterBar().getChip().background.m3154getPressed0d7_KjU();
                }
                break;
            case -1161592236:
                if (str.equals("accentOcean")) {
                    return colors.getSemantic().getAccent().m3311getOcean0d7_KjU();
                }
                break;
            case -1158444963:
                if (str.equals("accentRoyal")) {
                    return colors.getSemantic().getAccent().m3314getRoyal0d7_KjU();
                }
                break;
            case -1124404074:
                if (str.equals("androidButtonDestructiveStandardBackgroundPressed")) {
                    return colors.getComponent().getButton().getDestructive().getStandard().getBackground().pressed;
                }
                break;
            case -1120073529:
                if (str.equals("androidButtonSubtleTextPressed")) {
                    return colors.getComponent().getButton().getSubtle().getText().pressed;
                }
                break;
            case -1102904569:
                if (str.equals("androidButtonDestructiveSubtleTextPressed")) {
                    return colors.getComponent().getButton().getDestructive().getSubtle().getText().pressed;
                }
                break;
            case -1075998704:
                if (str.equals("backgroundBitcoin")) {
                    return colors.getSemantic().getService().bitcoinBackground;
                }
                break;
            case -1064416678:
                if (str.equals("textBrand")) {
                    return colors.getSemantic().getText().m3348getBrand0d7_KjU();
                }
                break;
            case -1060308920:
                if (str.equals("toggleActiveBackground")) {
                    return colors.getComponent().getToggle().active.background.m3293getDefault0d7_KjU();
                }
                break;
            case -1038339206:
                if (str.equals("androidButtonProminentIconDisabled")) {
                    return colors.getComponent().getButton().getProminent().icon.disabled;
                }
                break;
            case -1034540795:
                if (str.equals("brandGoldS1")) {
                    return colors.getBase().m3019getBrandGoldS10d7_KjU();
                }
                break;
            case -1033953292:
                if (str.equals("keypadButtonBackground")) {
                    return colors.getSurface().getKeypad().button.getBackground().m3363getDefault0d7_KjU();
                }
                break;
            case -1006798354:
                if (str.equals("radioInactiveBorderDisabled")) {
                    return colors.getComponent().getRadio().inactive.border.m3236getDisabled0d7_KjU();
                }
                break;
            case -1003877689:
                if (str.equals("textLink")) {
                    return colors.getSemantic().getText().m3352getLink0d7_KjU();
                }
                break;
            case -988767561:
                if (str.equals("checkboxActiveBackground")) {
                    return colors.getComponent().getCheckbox().active.background.m3137getDefault0d7_KjU();
                }
                break;
            case -969209392:
                if (str.equals("borderWarning")) {
                    return colors.getSemantic().getBorder().m3333getWarning0d7_KjU();
                }
                break;
            case -964573221:
                if (str.equals("toastButtonBackgroundPressed")) {
                    return colors.getComponent().toast.button.background.m3292getPressed0d7_KjU();
                }
                break;
            case -944095236:
                if (str.equals("iconDanger")) {
                    return colors.getSemantic().getIcon().m3335getDanger0d7_KjU();
                }
                break;
            case -934940736:
                if (str.equals("red100")) {
                    return colors.getBase().m3065getRed1000d7_KjU();
                }
                break;
            case -925059885:
                if (str.equals("timelineBackgroundPressed")) {
                    return colors.getComponent().getTimeline().background.m3265getPressed0d7_KjU();
                }
                break;
            case -920157189:
                if (str.equals("androidButtonSubtleIconPressed")) {
                    return colors.getComponent().getButton().getSubtle().getIcon().pressed;
                }
                break;
            case -918112732:
                if (str.equals("cellBody")) {
                    return colors.getComponent().getCell().body.m3126getDefault0d7_KjU();
                }
                break;
            case -902988229:
                if (str.equals("androidButtonDestructiveSubtleIconPressed")) {
                    return colors.getComponent().getButton().getDestructive().getSubtle().getIcon().pressed;
                }
                break;
            case -892253630:
                if (str.equals("amber10")) {
                    return colors.getBase().m2986getAmber100d7_KjU();
                }
                break;
            case -892253599:
                if (str.equals("amber20")) {
                    return colors.getBase().m2987getAmber200d7_KjU();
                }
                break;
            case -869785981:
                if (str.equals("inputIconTrailingPressed")) {
                    return colors.getComponent().getInput().getIcon().trailing.m3189getPressed0d7_KjU();
                }
                break;
            case -867798282:
                if (str.equals("timelineLineBorderCollapsed")) {
                    return colors.getComponent().getTimeline().getLine().getBorder().m3273getCollapsed0d7_KjU();
                }
                break;
            case -862795401:
                if (str.equals("accentTurquoise")) {
                    return colors.getSemantic().getAccent().m3318getTurquoise0d7_KjU();
                }
                break;
            case -854055004:
                if (str.equals("moneyAppletAssetBackground")) {
                    return colors.getSurface().getMoney().getApplet().getAsset().m3366getBackground0d7_KjU();
                }
                break;
            case -850420471:
                if (str.equals("toggleOffBackground")) {
                    return colors.getComponent().getToggle().off.background.m3299getDefault0d7_KjU();
                }
                break;
            case -842085601:
                if (str.equals("buttonDestructiveProminentTextDisabled")) {
                    return colors.getComponent().getButton().getDestructive().getProminent().text.disabled;
                }
                break;
            case -841135507:
                if (str.equals("radioActiveBorder")) {
                    return colors.getComponent().getRadio().active.border.m3230getDefault0d7_KjU();
                }
                break;
            case -803587271:
                if (str.equals("serviceBitcoinPressed")) {
                    return colors.getSemantic().getService().m3345getBitcoinPressed0d7_KjU();
                }
                break;
            case -798858751:
                if (str.equals("sliderThumbBorder")) {
                    return colors.getComponent().getSlider().thumb.m3261getBorder0d7_KjU();
                }
                break;
            case -797296490:
                if (str.equals("inputBorder")) {
                    return colors.getComponent().getInput().border.m3169getDefault0d7_KjU();
                }
                break;
            case -795615872:
                if (str.equals("filterBarChipIcon")) {
                    return colors.getComponent().getFilterBar().getChip().icon.m3156getDefault0d7_KjU();
                }
                break;
            case -795285964:
                if (str.equals("filterBarChipText")) {
                    return colors.getComponent().getFilterBar().getChip().text.m3158getDefault0d7_KjU();
                }
                break;
            case -790322889:
                if (str.equals("androidButtonDestructiveStandardTextPressed")) {
                    return colors.getComponent().getButton().getDestructive().getStandard().getText().pressed;
                }
                break;
            case -787405411:
                if (str.equals("brandPink")) {
                    return colors.getBase().m3029getBrandPink0d7_KjU();
                }
                break;
            case -775406298:
                if (str.equals("buttonDestructiveSubtleTextDisabled")) {
                    return colors.getComponent().getButton().getDestructive().getSubtle().getText().disabled;
                }
                break;
            case -771146205:
                if (str.equals("brandPurple")) {
                    return colors.getBase().m3030getBrandPurple0d7_KjU();
                }
                break;
            case -763111488:
                if (str.equals("inputCursor")) {
                    return colors.getComponent().getInput().m3164getCursor0d7_KjU();
                }
                break;
            case -742276568:
                if (str.equals("buttonDestructiveStandardTextPressed")) {
                    return colors.getComponent().getButton().getDestructive().getStandard().getText().pressed;
                }
                break;
            case -738250553:
                if (str.equals("iconInfo")) {
                    return colors.getSemantic().getIcon().m3338getInfo0d7_KjU();
                }
                break;
            case -725815656:
                if (str.equals("brandCobaltS1")) {
                    return colors.getBase().m3018getBrandCobaltS10d7_KjU();
                }
                break;
            case -725367663:
                if (str.equals("modalButtonPrimaryBackgroundPressed")) {
                    return colors.getComponent().getModal().getButton().getPrimary().getBackground().m3201getPressed0d7_KjU();
                }
                break;
            case -677446628:
                if (str.equals("filterBarChipIconDisabled")) {
                    return colors.getComponent().getFilterBar().getChip().icon.m3157getDisabled0d7_KjU();
                }
                break;
            case -675632253:
                if (str.equals("androidButtonDestructiveSubtleIconDisabled")) {
                    return colors.getComponent().getButton().getDestructive().getSubtle().getIcon().disabled;
                }
                break;
            case -646093343:
                if (str.equals("toggleOnBackground")) {
                    return colors.getComponent().getToggle().on.background.m3301getDefault0d7_KjU();
                }
                break;
            case -642016943:
                if (str.equals("inputBorderSelected")) {
                    return colors.getComponent().getInput().border.m3172getSelected0d7_KjU();
                }
                break;
            case -640520930:
                if (str.equals("androidButtonDestructiveProminentIcon")) {
                    return colors.getComponent().getButton().getDestructive().getProminent().icon.f152default;
                }
                break;
            case -640191022:
                if (str.equals("androidButtonDestructiveProminentText")) {
                    return colors.getComponent().getButton().getDestructive().getProminent().text.f153default;
                }
                break;
            case -635096653:
                if (str.equals("timelineLineBorderInProgress")) {
                    return colors.getComponent().getTimeline().getLine().getBorder().m3275getInProgress0d7_KjU();
                }
                break;
            case -613056595:
                if (str.equals("titleBarButtonBackgroundTransparentDark")) {
                    return colors.getComponent().getTitleBar().button.background.m3283getTransparentDark0d7_KjU();
                }
                break;
            case -609382104:
                if (str.equals("modalButtonPrimaryDestructiveTextDisabled")) {
                    return colors.getComponent().getModal().getButton().getPrimary().destructive.text.m3203getDisabled0d7_KjU();
                }
                break;
            case -606191490:
                if (str.equals("buttonDestructiveProminentBackgroundPressed")) {
                    return colors.getComponent().getButton().getDestructive().getProminent().getBackground().pressed;
                }
                break;
            case -605037621:
                if (str.equals("searchFieldIcon")) {
                    return colors.getComponent().getSearchField().icon.m3246getDefault0d7_KjU();
                }
                break;
            case -604707713:
                if (str.equals("searchFieldText")) {
                    return colors.getComponent().getSearchField().m3243getText0d7_KjU();
                }
                break;
            case -590406549:
                if (str.equals("androidButtonDestructiveStandardIconPressed")) {
                    return colors.getComponent().getButton().getDestructive().getStandard().getIcon().pressed;
                }
                break;
            case -580341312:
                if (str.equals("segmentedControlOverlayButtonBackgroundSelected")) {
                    return colors.getComponent().getSegmentedControl().overlay.button.getBackground().m3251getSelected0d7_KjU();
                }
                break;
            case -576688932:
                if (str.equals("inputTextPlaceholder")) {
                    return colors.getComponent().getInput().text.m3195getPlaceholder0d7_KjU();
                }
                break;
            case -554047878:
                if (str.equals("optionChipIcon")) {
                    return colors.getComponent().getOptionChip().icon.m3225getDefault0d7_KjU();
                }
                break;
            case -553717970:
                if (str.equals("optionChipText")) {
                    return colors.getComponent().getOptionChip().text.m3227getDefault0d7_KjU();
                }
                break;
            case -542360228:
                if (str.equals("buttonDestructiveStandardIconPressed")) {
                    return colors.getComponent().getButton().getDestructive().getStandard().getIcon().pressed;
                }
                break;
            case -541716631:
                if (str.equals("buttonProminentIconDisabled")) {
                    return colors.getComponent().getButton().getProminent().icon.disabled;
                }
                break;
            case -536945672:
                if (str.equals("cellControlsActivityAmountPending")) {
                    return colors.getComponent().getCell().getControls().activityAmount.m3130getPending0d7_KjU();
                }
                break;
            case -530054247:
                if (str.equals("textProminent")) {
                    return colors.getSemantic().getText().m3354getProminent0d7_KjU();
                }
                break;
            case -511893541:
                if (str.equals("sliderBarUnfilledBackground")) {
                    return colors.getComponent().getSlider().bar.getUnfilled().m3257getBackground0d7_KjU();
                }
                break;
            case -511859731:
                if (str.equals("sheetBackground")) {
                    return colors.getComponent().sheet.m3254getBackground0d7_KjU();
                }
                break;
            case -507645943:
                if (str.equals("toggleInactiveBackgroundDisabled")) {
                    return colors.getComponent().getToggle().inactive.background.m3296getDisabled0d7_KjU();
                }
                break;
            case -496532346:
                if (str.equals("iconSubtle")) {
                    return colors.getSemantic().getIcon().m3340getSubtle0d7_KjU();
                }
                break;
            case -480462234:
                if (str.equals("androidButtonDestructiveSubtleBackgroundPressed")) {
                    return colors.getComponent().getButton().getDestructive().getSubtle().background.pressed;
                }
                break;
            case -467091412:
                if (str.equals("androidButtonStandardBackground")) {
                    return colors.getComponent().getButton().getStandard().getBackground().m3118getDefault0d7_KjU();
                }
                break;
            case -448576010:
                if (str.equals("timelineLineBorderPending")) {
                    return colors.getComponent().getTimeline().getLine().getBorder().m3277getPending0d7_KjU();
                }
                break;
            case -430328775:
                if (str.equals("buttonStandardBackgroundDisabled")) {
                    return colors.getComponent().getButton().getStandard().getBackground().disabled;
                }
                break;
            case -419336883:
                if (str.equals("borderDivider")) {
                    return colors.getComponent().getUi().divider.border;
                }
                break;
            case -403167706:
                if (str.equals("avatarText")) {
                    return colors.getComponent().getAvatar().m3084getText0d7_KjU();
                }
                break;
            case -386694361:
                if (str.equals("bottomNavigationTextSelected")) {
                    return colors.getComponent().getBottomNavigation().text.m3112getSelected0d7_KjU();
                }
                break;
            case -384014696:
                if (str.equals("bottomNavigationBitcoinIcon")) {
                    return colors.getComponent().getBottomNavigation().bitcoin.icon.m3100getDefault0d7_KjU();
                }
                break;
            case -383684788:
                if (str.equals("bottomNavigationBitcoinText")) {
                    return colors.getComponent().getBottomNavigation().bitcoin.text.m3102getDefault0d7_KjU();
                }
                break;
            case -374959660:
                if (str.equals("uiDimmerBackground")) {
                    return colors.getComponent().getUi().dimmer.background;
                }
                break;
            case -367585377:
                if (str.equals("modalButtonSecondaryBackgroundPressed")) {
                    return colors.getComponent().getModal().getButton().secondary.getBackground().m3207getPressed0d7_KjU();
                }
                break;
            case -346780720:
                if (str.equals("accentScarlet")) {
                    return colors.getSemantic().getAccent().m3315getScarlet0d7_KjU();
                }
                break;
            case -336814063:
                if (str.equals("cellControlsIconPressed")) {
                    return colors.getComponent().getCell().getControls().icon.m3133getPressed0d7_KjU();
                }
                break;
            case -334117076:
                if (str.equals("modalButtonPrimaryTextDisabled")) {
                    return colors.getComponent().getModal().getButton().getPrimary().text.m3206getDisabled0d7_KjU();
                }
                break;
            case -325486503:
                if (str.equals("moneyAppletButtonText")) {
                    return colors.getSurface().getMoney().getApplet().button.text.m3370getDefault0d7_KjU();
                }
                break;
            case -303028117:
                if (str.equals("optionCardLabelDisabled")) {
                    return colors.getComponent().getOptionCard().label.m3219getDisabled0d7_KjU();
                }
                break;
            case -299149709:
                if (str.equals("brandScarlet")) {
                    return colors.getBase().m3033getBrandScarlet0d7_KjU();
                }
                break;
            case -290736245:
                if (str.equals("brandMagentaH1")) {
                    return colors.getBase().m3022getBrandMagentaH10d7_KjU();
                }
                break;
            case -290736241:
                if (str.equals("brandMagentaH5")) {
                    return colors.getBase().m3023getBrandMagentaH50d7_KjU();
                }
                break;
            case -290735904:
                if (str.equals("brandMagentaS1")) {
                    return colors.getBase().m3024getBrandMagentaS10d7_KjU();
                }
                break;
            case -281300271:
                if (str.equals("avatarNameText")) {
                    return colors.getComponent().getAvatar().getName().m3094getText0d7_KjU();
                }
                break;
            case -271665008:
                if (str.equals("modalButtonPrimaryText")) {
                    return colors.getComponent().getModal().getButton().getPrimary().text.m3205getDefault0d7_KjU();
                }
                break;
            case -255684013:
                if (str.equals("checkboxActiveBackgroundDisabled")) {
                    return colors.getComponent().getCheckbox().active.background.m3138getDisabled0d7_KjU();
                }
                break;
            case -253638449:
                if (str.equals("optionCardLabel")) {
                    return colors.getComponent().getOptionCard().label.m3218getDefault0d7_KjU();
                }
                break;
            case -252267288:
                if (str.equals("buttonSubtleTextDisabled")) {
                    return colors.getComponent().getButton().getSubtle().getText().disabled;
                }
                break;
            case -239617937:
                if (str.equals("optionCardBackgroundPressed")) {
                    return colors.getComponent().getOptionCard().background.m3211getPressed0d7_KjU();
                }
                break;
            case -238620844:
                if (str.equals("toggleKnobBackgroundDisabled")) {
                    return colors.getComponent().getToggle().knob.background.m3298getDisabled0d7_KjU();
                }
                break;
            case -196594634:
                if (str.equals("buttonSubtleTextPressed")) {
                    return colors.getComponent().getButton().getSubtle().getText().pressed;
                }
                break;
            case -188379699:
                if (str.equals("buttonProminentIcon")) {
                    return colors.getComponent().getButton().getProminent().icon.f161default;
                }
                break;
            case -188049791:
                if (str.equals("buttonProminentText")) {
                    return colors.getComponent().getButton().getProminent().getText().m3116getDefault0d7_KjU();
                }
                break;
            case -158855571:
                if (str.equals("toggleInactiveBackground")) {
                    return colors.getComponent().getToggle().inactive.background.m3295getDefault0d7_KjU();
                }
                break;
            case -158821448:
                if (str.equals("checkboxInactiveBackgroundDisabled")) {
                    return colors.getComponent().getCheckbox().inactive.background.m3142getDisabled0d7_KjU();
                }
                break;
            case -145927256:
                if (str.equals("timelineDotBackgroundInProgress")) {
                    return colors.getComponent().getTimeline().getDot().getBackground().m3268getInProgress0d7_KjU();
                }
                break;
            case -143872523:
                if (str.equals("moneyAppletButtonTextDisabled")) {
                    return colors.getSurface().getMoney().getApplet().button.text.m3371getDisabled0d7_KjU();
                }
                break;
            case -142774671:
                if (str.equals("uiDividerBorder")) {
                    return colors.getComponent().getUi().divider.border;
                }
                break;
            case -138713009:
                if (str.equals("timelineBackground")) {
                    return colors.getComponent().getTimeline().background.m3264getDefault0d7_KjU();
                }
                break;
            case -133745308:
                if (str.equals("borderInverse")) {
                    return colors.getSemantic().getBorder().inverse;
                }
                break;
            case -127086308:
                if (str.equals("checkboxInactiveBackground")) {
                    return colors.getComponent().getCheckbox().inactive.background.m3141getDefault0d7_KjU();
                }
                break;
            case -114110501:
                if (str.equals("bottomNavigationKeypadTextSelected")) {
                    return colors.getComponent().getBottomNavigation().keypad.text.m3110getSelected0d7_KjU();
                }
                break;
            case -109793647:
                if (str.equals("filterBarChipBackgroundDisabled")) {
                    return colors.getComponent().getFilterBar().getChip().background.m3153getDisabled0d7_KjU();
                }
                break;
            case -102703842:
                if (str.equals("bitcoin")) {
                    return colors.getBase().m2988getBitcoin0d7_KjU();
                }
                break;
            case -96609081:
                if (str.equals("buttonDestructiveStandardBackgroundPressed")) {
                    return colors.getComponent().getButton().getDestructive().getStandard().getBackground().pressed;
                }
                break;
            case -94200361:
                if (str.equals("searchFieldIconPressed")) {
                    return colors.getComponent().getSearchField().icon.m3247getPressed0d7_KjU();
                }
                break;
            case -64867936:
                if (str.equals("buttonDestructiveProminentBackgroundDisabled")) {
                    return colors.getComponent().getButton().getDestructive().getProminent().getBackground().disabled;
                }
                break;
            case -60256148:
                if (str.equals("bottomNavigationKeypadIcon")) {
                    return colors.getComponent().getBottomNavigation().keypad.icon.m3107getDefault0d7_KjU();
                }
                break;
            case -59926240:
                if (str.equals("bottomNavigationKeypadText")) {
                    return colors.getComponent().getBottomNavigation().keypad.text.m3109getDefault0d7_KjU();
                }
                break;
            case -53304851:
                if (str.equals("optionChipBorder")) {
                    return colors.getComponent().getOptionChip().border.m3222getDefault0d7_KjU();
                }
                break;
            case -40542545:
                if (str.equals("copyCodeSuccessBackground")) {
                    return colors.getComponent().getCopyCode().success.m3149getBackground0d7_KjU();
                }
                break;
            case -25397222:
                if (str.equals("brandSky")) {
                    return colors.getBase().m3035getBrandSky0d7_KjU();
                }
                break;
            case -14575854:
                if (str.equals("inputBorderError")) {
                    return colors.getComponent().getInput().border.m3171getError0d7_KjU();
                }
                break;
            case -5987169:
                if (str.equals("cellControlsActivityAmount")) {
                    return colors.getComponent().getCell().getControls().activityAmount.m3129getDefault0d7_KjU();
                }
                break;
            case -1180969:
                if (str.equals("buttonDestructiveSubtleBackgroundPressed")) {
                    return colors.getComponent().getButton().getDestructive().getSubtle().background.pressed;
                }
                break;
            case 2713289:
                if (str.equals("textDisabled")) {
                    return colors.getSemantic().getText().m3350getDisabled0d7_KjU();
                }
                break;
            case 3321706:
                if (str.equals("buttonSubtleIconPressed")) {
                    return colors.getComponent().getButton().getSubtle().getIcon().pressed;
                }
                break;
            case 9933825:
                if (str.equals("brandOrcaPastel")) {
                    return colors.getBase().m3028getBrandOrcaPastel0d7_KjU();
                }
                break;
            case 10424323:
                if (str.equals("optionCardBodyDisabled")) {
                    return colors.getComponent().getOptionCard().body.m3213getDisabled0d7_KjU();
                }
                break;
            case 11461942:
                if (str.equals("buttonDestructiveStandardTextDisabled")) {
                    return colors.getComponent().getButton().getDestructive().getStandard().getText().disabled;
                }
                break;
            case 45086099:
                if (str.equals("androidButtonStandardIconDisabled")) {
                    return colors.getComponent().getButton().getStandard().icon.disabled;
                }
                break;
            case 55063068:
                if (str.equals("androidButtonDestructiveSubtleBackground")) {
                    return colors.getComponent().getButton().getDestructive().getSubtle().background.f157default;
                }
                break;
            case 63045570:
                if (str.equals("sliderBarFilledBackground")) {
                    return colors.getComponent().getSlider().bar.getFilled().m3256getBackground0d7_KjU();
                }
                break;
            case 64289718:
                if (str.equals("checkboxInactiveBorderDisabled")) {
                    return colors.getComponent().getCheckbox().inactive.border.m3145getDisabled0d7_KjU();
                }
                break;
            case 65146348:
                if (str.equals("androidButtonDestructiveStandardBackground")) {
                    return colors.getComponent().getButton().getDestructive().getStandard().getBackground().f154default;
                }
                break;
            case 66621871:
                if (str.equals("androidButtonDestructiveProminentBackgroundDisabled")) {
                    return colors.getComponent().getButton().getDestructive().getProminent().getBackground().disabled;
                }
                break;
            case 85857795:
                if (str.equals("bitcoinBg")) {
                    return colors.getBase().m2989getBitcoinBg0d7_KjU();
                }
                break;
            case 105560318:
                if (str.equals("ocean")) {
                    return colors.getBase().brandOcean;
                }
                break;
            case 108387952:
                if (str.equals("red10")) {
                    return colors.getBase().m3064getRed100d7_KjU();
                }
                break;
            case 108387983:
                if (str.equals("red20")) {
                    return colors.getBase().m3066getRed200d7_KjU();
                }
                break;
            case 108388014:
                if (str.equals("red30")) {
                    return colors.getBase().m3067getRed300d7_KjU();
                }
                break;
            case 108388045:
                if (str.equals("red40")) {
                    return colors.getBase().m3068getRed400d7_KjU();
                }
                break;
            case 108388076:
                if (str.equals("red50")) {
                    return colors.getBase().m3069getRed500d7_KjU();
                }
                break;
            case 108388107:
                if (str.equals("red60")) {
                    return colors.getBase().m3070getRed600d7_KjU();
                }
                break;
            case 108388138:
                if (str.equals("red70")) {
                    return colors.getBase().m3071getRed700d7_KjU();
                }
                break;
            case 108388169:
                if (str.equals("red80")) {
                    return colors.getBase().m3072getRed800d7_KjU();
                }
                break;
            case 108388200:
                if (str.equals("red90")) {
                    return colors.getBase().m3073getRed900d7_KjU();
                }
                break;
            case 151137863:
                if (str.equals("toastButtonBackground")) {
                    return colors.getComponent().toast.button.background.m3291getDefault0d7_KjU();
                }
                break;
            case 151151246:
                if (str.equals("backgroundWarning")) {
                    return colors.getSemantic().getBackground().m3328getWarning0d7_KjU();
                }
                break;
            case 159076188:
                if (str.equals("cardBorder")) {
                    return colors.getComponent().card.border.m3122getDefault0d7_KjU();
                }
                break;
            case 161572024:
                if (str.equals("backgroundProminent")) {
                    return colors.getSemantic().getBackground().m3326getProminent0d7_KjU();
                }
                break;
            case 197398101:
                if (str.equals("borderApp")) {
                    return colors.getSemantic().getBorder().m3329getApp0d7_KjU();
                }
                break;
            case 219499962:
                if (str.equals("timelineDotBackgroundSkipped")) {
                    return colors.getComponent().getTimeline().getDot().getBackground().m3271getSkipped0d7_KjU();
                }
                break;
            case 222418999:
                if (str.equals("serviceBitcoinOrange")) {
                    return colors.getSemantic().getService().m3344getBitcoinOrange0d7_KjU();
                }
                break;
            case 230040174:
                if (str.equals("androidButtonDestructiveProminentTextDisabled")) {
                    return colors.getComponent().getButton().getDestructive().getProminent().text.disabled;
                }
                break;
            case 231834595:
                if (str.equals("androidButtonProminentBackgroundRipple")) {
                    return colors.getComponent().getButton().getProminent().getBackground().m3114getRipple0d7_KjU();
                }
                break;
            case 236876920:
                if (str.equals("buttonStandardTextDisabled")) {
                    return colors.getComponent().getButton().getStandard().getText().disabled;
                }
                break;
            case 240216854:
                if (str.equals("optionChipIconDisabled")) {
                    return colors.getComponent().getOptionChip().icon.m3226getDisabled0d7_KjU();
                }
                break;
            case 249517846:
                if (str.equals("optionCardBorderSelectedPressed")) {
                    return colors.getComponent().getOptionCard().border.selected.m3217getPressed0d7_KjU();
                }
                break;
            case 256360033:
                if (str.equals("timelineDotBackgroundCollapsed")) {
                    return colors.getComponent().getTimeline().getDot().getBackground().m3266getCollapsed0d7_KjU();
                }
                break;
            case 270868528:
                if (str.equals("androidButtonProminentTextPressed")) {
                    return colors.getComponent().getButton().getProminent().getText().pressed;
                }
                break;
            case 279941105:
                if (str.equals("brandScarletS1")) {
                    return colors.getBase().m3034getBrandScarletS10d7_KjU();
                }
                break;
            case 283713634:
                if (str.equals("green10")) {
                    return colors.getBase().m3045getGreen100d7_KjU();
                }
                break;
            case 283713665:
                if (str.equals("green20")) {
                    return colors.getBase().m3046getGreen200d7_KjU();
                }
                break;
            case 284509615:
                if (str.equals("textWarning")) {
                    return colors.getSemantic().getText().m3358getWarning0d7_KjU();
                }
                break;
            case 297761314:
                if (str.equals("keypadBackground")) {
                    return colors.getSurface().getKeypad().background;
                }
                break;
            case 313876840:
                if (str.equals("titleBarKeypadIcon")) {
                    return colors.getComponent().getTitleBar().keypad.icon.m3288getDefault0d7_KjU();
                }
                break;
            case 325775467:
                if (str.equals("inputChipIconDisabled")) {
                    return colors.getComponent().getInput().chip.icon.m3175getDisabled0d7_KjU();
                }
                break;
            case 334142007:
                if (str.equals("borderSuccess")) {
                    return colors.getSemantic().getBorder().m3332getSuccess0d7_KjU();
                }
                break;
            case 349356004:
                if (str.equals("serviceTaxes")) {
                    return colors.getSemantic().getService().taxes;
                }
                break;
            case 353637435:
                if (str.equals("inputIconTrailingDisabled")) {
                    return colors.getComponent().getInput().getIcon().trailing.m3187getDisabled0d7_KjU();
                }
                break;
            case 371277028:
                if (str.equals("backgroundExtraProminent")) {
                    return colors.getSemantic().getBackground().m3321getExtraProminent0d7_KjU();
                }
                break;
            case 378658105:
                if (str.equals("backgroundNotification")) {
                    return colors.getSemantic().getBackground().m3325getNotification0d7_KjU();
                }
                break;
            case 395546036:
                if (str.equals("titleBarIcon")) {
                    return colors.getComponent().getTitleBar().icon.m3285getDefault0d7_KjU();
                }
                break;
            case 395875944:
                if (str.equals("titleBarText")) {
                    return colors.getComponent().getTitleBar().m3281getText0d7_KjU();
                }
                break;
            case 409721783:
                if (str.equals("androidButtonDestructiveStandardIcon")) {
                    return colors.getComponent().getButton().getDestructive().getStandard().getIcon().f155default;
                }
                break;
            case 410051691:
                if (str.equals("androidButtonDestructiveStandardText")) {
                    return colors.getComponent().getButton().getDestructive().getStandard().getText().f156default;
                }
                break;
            case 411162176:
                if (str.equals("buttonProminentBackgroundPressed")) {
                    return colors.getComponent().getButton().getProminent().getBackground().pressed;
                }
                break;
            case 413260675:
                if (str.equals("timelineLineBorderDone")) {
                    return colors.getComponent().getTimeline().getLine().getBorder().m3274getDone0d7_KjU();
                }
                break;
            case 424306984:
                if (str.equals("buttonStandardIcon")) {
                    return colors.getComponent().getButton().getStandard().icon.f164default;
                }
                break;
            case 424465235:
                if (str.equals("androidButtonDestructiveStandardIconDisabled")) {
                    return colors.getComponent().getButton().getDestructive().getStandard().getIcon().disabled;
                }
                break;
            case 424636892:
                if (str.equals("buttonStandardText")) {
                    return colors.getComponent().getButton().getStandard().getText().m3119getDefault0d7_KjU();
                }
                break;
            case 426649914:
                if (str.equals("sliderTrackFilledBackground")) {
                    return colors.getComponent().getSlider().track.getFilled().m3262getBackground0d7_KjU();
                }
                break;
            case 437551797:
                if (str.equals("toastBackground")) {
                    return colors.getComponent().toast.getBackground().m3290getDefault0d7_KjU();
                }
                break;
            case 444028802:
                if (str.equals("buttonProminentBackground")) {
                    return colors.getComponent().getButton().getProminent().getBackground().f160default;
                }
                break;
            case 449406002:
                if (str.equals("serviceTaxesBackground")) {
                    return colors.getSemantic().getService().m3347getTaxesBackground0d7_KjU();
                }
                break;
            case 454256049:
                if (str.equals("optionCardBorder")) {
                    return colors.getComponent().getOptionCard().border.m3214getDefault0d7_KjU();
                }
                break;
            case 457902981:
                if (str.equals("sliderKnobBackground")) {
                    return colors.getComponent().getSlider().knob.m3258getBackground0d7_KjU();
                }
                break;
            case 460168959:
                if (str.equals("inputIconDisabled")) {
                    return colors.getComponent().getInput().getIcon().m3180getDisabled0d7_KjU();
                }
                break;
            case 462600369:
                if (str.equals("inputHelperIcon")) {
                    return colors.getComponent().getInput().helper.m3176getIcon0d7_KjU();
                }
                break;
            case 462930277:
                if (str.equals("inputHelperText")) {
                    return colors.getComponent().getInput().helper.text.m3177getDefault0d7_KjU();
                }
                break;
            case 463141782:
                if (str.equals("violet5")) {
                    return colors.getBase().m3078getViolet50d7_KjU();
                }
                break;
            case 484425955:
                if (str.equals("iconWarning")) {
                    return colors.getSemantic().getIcon().m3342getWarning0d7_KjU();
                }
                break;
            case 486170446:
                if (str.equals("cellLabelDisabled")) {
                    return colors.getComponent().getCell().label.m3135getDisabled0d7_KjU();
                }
                break;
            case 486947302:
                if (str.equals("inputLabelDisabled")) {
                    return colors.getComponent().getInput().label.m3191getDisabled0d7_KjU();
                }
                break;
            case 519750602:
                if (str.equals("segmentedControlButtonText")) {
                    return colors.getComponent().getSegmentedControl().button.m3249getText0d7_KjU();
                }
                break;
            case 523006664:
                if (str.equals("androidButtonStandardBackgroundDisabled")) {
                    return colors.getComponent().getButton().getStandard().getBackground().disabled;
                }
                break;
            case 550466094:
                if (str.equals("radioInactiveBackgroundPressed")) {
                    return colors.getComponent().getRadio().inactive.background.m3234getPressed0d7_KjU();
                }
                break;
            case 561014953:
                if (str.equals("inputIconTrailingError")) {
                    return colors.getComponent().getInput().getIcon().trailing.m3188getError0d7_KjU();
                }
                break;
            case 562792130:
                if (str.equals("modalButtonSecondaryText")) {
                    return colors.getComponent().getModal().getButton().secondary.text.m3208getDefault0d7_KjU();
                }
                break;
            case 564140433:
                if (str.equals("tooltipBackground")) {
                    return colors.getComponent().getTooltip().m3305getBackground0d7_KjU();
                }
                break;
            case 566435531:
                if (str.equals("buttonDestructiveSubtleBackground")) {
                    return colors.getComponent().getButton().getDestructive().getSubtle().background.f157default;
                }
                break;
            case 581905267:
                if (str.equals("sheetHandleBorder")) {
                    return colors.getComponent().sheet.getHandle().m3255getBorder0d7_KjU();
                }
                break;
            case 585635610:
                if (str.equals("checkboxInactiveBorder")) {
                    return colors.getComponent().getCheckbox().inactive.border.m3144getDefault0d7_KjU();
                }
                break;
            case 594240099:
                if (str.equals("textLinkVisited")) {
                    return colors.getSemantic().getText().m3353getLinkVisited0d7_KjU();
                }
                break;
            case 609541425:
                if (str.equals("badgeBackground")) {
                    return colors.getComponent().badge.m3095getBackground0d7_KjU();
                }
                break;
            case 623169526:
                if (str.equals("modalButtonPrimaryDestructiveTextPressed")) {
                    return colors.getComponent().getModal().getButton().getPrimary().destructive.text.m3204getPressed0d7_KjU();
                }
                break;
            case 638548844:
                if (str.equals("optionCardBorderSelected")) {
                    return colors.getComponent().getOptionCard().border.selected.m3215getDefault0d7_KjU();
                }
                break;
            case 669079440:
                if (str.equals("modalButtonDestructiveText")) {
                    return colors.getComponent().getModal().getButton().destructive.text.m3198getDefault0d7_KjU();
                }
                break;
            case 692317704:
                if (str.equals("optionCardBorderSelectedDisabled")) {
                    return colors.getComponent().getOptionCard().border.selected.m3216getDisabled0d7_KjU();
                }
                break;
            case 704429357:
                if (str.equals("bottomNavigationBackground")) {
                    return colors.getComponent().getBottomNavigation().m3098getBackground0d7_KjU();
                }
                break;
            case 716066130:
                if (str.equals("radioInactiveBorder")) {
                    return colors.getComponent().getRadio().inactive.border.m3235getDefault0d7_KjU();
                }
                break;
            case 719137805:
                if (str.equals("bottomNavigationBitcoinBackground")) {
                    return colors.getComponent().getBottomNavigation().bitcoin.m3099getBackground0d7_KjU();
                }
                break;
            case 721986235:
                if (str.equals("borderBrand")) {
                    return colors.getSemantic().getBorder().m3330getBrand0d7_KjU();
                }
                break;
            case 760718286:
                if (str.equals("titleBarIconPressed")) {
                    return colors.getComponent().getTitleBar().icon.m3286getPressed0d7_KjU();
                }
                break;
            case 777035533:
                if (str.equals("buttonSubtleBackground")) {
                    return colors.getComponent().getButton().getSubtle().background.f166default;
                }
                break;
            case 778778297:
                if (str.equals("avatarBackgroundFive")) {
                    return colors.getComponent().getAvatar().getBackground().m3086getFive0d7_KjU();
                }
                break;
            case 778784045:
                if (str.equals("avatarBackgroundFour")) {
                    return colors.getComponent().getAvatar().getBackground().m3087getFour0d7_KjU();
                }
                break;
            case 779016377:
                if (str.equals("avatarBackgroundNine")) {
                    return colors.getComponent().getAvatar().getBackground().m3088getNine0d7_KjU();
                }
                break;
            case 785158555:
                if (str.equals("moneyAppletDataInactiveBorder")) {
                    return colors.getSurface().getMoney().getApplet().data.getInactive().m3373getBorder0d7_KjU();
                }
                break;
            case 810837680:
                if (str.equals("filterBarChipBackgroundSelected")) {
                    return colors.getComponent().getFilterBar().getChip().background.m3155getSelected0d7_KjU();
                }
                break;
            case 833817353:
                if (str.equals("borderStandard")) {
                    return colors.getSemantic().getBorder().standard;
                }
                break;
            case 863222279:
                if (str.equals("bottomNavigationBitcoinTextSelected")) {
                    return colors.getComponent().getBottomNavigation().bitcoin.text.m3103getSelected0d7_KjU();
                }
                break;
            case 875909854:
                if (str.equals("androidButtonProminentIcon")) {
                    return colors.getComponent().getButton().getProminent().icon.f161default;
                }
                break;
            case 876239762:
                if (str.equals("androidButtonProminentText")) {
                    return colors.getComponent().getButton().getProminent().getText().m3116getDefault0d7_KjU();
                }
                break;
            case 885267446:
                if (str.equals("moneyAppletButtonBackgroundDisabled")) {
                    return colors.getSurface().getMoney().getApplet().button.background.m3368getDisabled0d7_KjU();
                }
                break;
            case 896952175:
                if (str.equals("androidButtonProminentBackgroundDisabled")) {
                    return colors.getComponent().getButton().getProminent().getBackground().disabled;
                }
                break;
            case 912436992:
                if (str.equals("searchFieldBackground")) {
                    return colors.getComponent().getSearchField().background.m3244getDefault0d7_KjU();
                }
                break;
            case 915471411:
                if (str.equals("optionCardBackground")) {
                    return colors.getComponent().getOptionCard().background.m3210getDefault0d7_KjU();
                }
                break;
            case 922646502:
                if (str.equals("buttonDestructiveStandardIcon")) {
                    return colors.getComponent().getButton().getDestructive().getStandard().getIcon().f155default;
                }
                break;
            case 922976410:
                if (str.equals("buttonDestructiveStandardText")) {
                    return colors.getComponent().getButton().getDestructive().getStandard().getText().f156default;
                }
                break;
            case 926144824:
                if (str.equals("timelineDotBackgroundDone")) {
                    return colors.getComponent().getTimeline().getDot().getBackground().m3267getDone0d7_KjU();
                }
                break;
            case 948675951:
                if (str.equals("borderDanger")) {
                    return colors.getSemantic().getBorder().m3331getDanger0d7_KjU();
                }
                break;
            case 978288526:
                if (str.equals("brandCashGreen05")) {
                    return colors.getBase().m2997getBrandCashGreen050d7_KjU();
                }
                break;
            case 978288552:
                if (str.equals("brandCashGreen10")) {
                    return colors.getBase().m2998getBrandCashGreen100d7_KjU();
                }
                break;
            case 978288557:
                if (str.equals("brandCashGreen15")) {
                    return colors.getBase().m2999getBrandCashGreen150d7_KjU();
                }
                break;
            case 978288583:
                if (str.equals("brandCashGreen20")) {
                    return colors.getBase().m3000getBrandCashGreen200d7_KjU();
                }
                break;
            case 978288588:
                if (str.equals("brandCashGreen25")) {
                    return colors.getBase().m3001getBrandCashGreen250d7_KjU();
                }
                break;
            case 978288614:
                if (str.equals("brandCashGreen30")) {
                    return colors.getBase().m3002getBrandCashGreen300d7_KjU();
                }
                break;
            case 978288619:
                if (str.equals("brandCashGreen35")) {
                    return colors.getBase().m3003getBrandCashGreen350d7_KjU();
                }
                break;
            case 978288645:
                if (str.equals("brandCashGreen40")) {
                    return colors.getBase().m3004getBrandCashGreen400d7_KjU();
                }
                break;
            case 978288650:
                if (str.equals("brandCashGreen45")) {
                    return colors.getBase().m3005getBrandCashGreen450d7_KjU();
                }
                break;
            case 978288676:
                if (str.equals("brandCashGreen50")) {
                    return colors.getBase().m3006getBrandCashGreen500d7_KjU();
                }
                break;
            case 978288681:
                if (str.equals("brandCashGreen55")) {
                    return colors.getBase().m3007getBrandCashGreen550d7_KjU();
                }
                break;
            case 978288707:
                if (str.equals("brandCashGreen60")) {
                    return colors.getBase().m3008getBrandCashGreen600d7_KjU();
                }
                break;
            case 978288712:
                if (str.equals("brandCashGreen65")) {
                    return colors.getBase().m3009getBrandCashGreen650d7_KjU();
                }
                break;
            case 978288738:
                if (str.equals("brandCashGreen70")) {
                    return colors.getBase().m3010getBrandCashGreen700d7_KjU();
                }
                break;
            case 978288743:
                if (str.equals("brandCashGreen75")) {
                    return colors.getBase().m3011getBrandCashGreen750d7_KjU();
                }
                break;
            case 978288769:
                if (str.equals("brandCashGreen80")) {
                    return colors.getBase().m3012getBrandCashGreen800d7_KjU();
                }
                break;
            case 978288774:
                if (str.equals("brandCashGreen85")) {
                    return colors.getBase().m3013getBrandCashGreen850d7_KjU();
                }
                break;
            case 978288800:
                if (str.equals("brandCashGreen90")) {
                    return colors.getBase().m3014getBrandCashGreen900d7_KjU();
                }
                break;
            case 978288805:
                if (str.equals("brandCashGreen95")) {
                    return colors.getBase().m3015getBrandCashGreen950d7_KjU();
                }
                break;
            case 982118500:
                if (str.equals("searchBarIcon")) {
                    return colors.getComponent().searchBar.icon.m3238getDefault0d7_KjU();
                }
                break;
            case 982448408:
                if (str.equals("searchBarText")) {
                    return colors.getComponent().searchBar.text.m3240getDefault0d7_KjU();
                }
                break;
            case 986615330:
                if (str.equals("backgroundInverse")) {
                    return colors.getSemantic().getBackground().inverse;
                }
                break;
            case 1019530067:
                if (str.equals("sliderTrackUnfilledBackground")) {
                    return colors.getComponent().getSlider().track.getUnfilled().m3263getBackground0d7_KjU();
                }
                break;
            case 1030094234:
                if (str.equals("titleBarKeypadIconPressed")) {
                    return colors.getComponent().getTitleBar().keypad.icon.m3289getPressed0d7_KjU();
                }
                break;
            case 1044400906:
                if (str.equals("textStandard")) {
                    return colors.getSemantic().getText().m3355getStandard0d7_KjU();
                }
                break;
            case 1048338958:
                if (str.equals("moneyBackground")) {
                    return colors.getSurface().getMoney().m3364getBackground0d7_KjU();
                }
                break;
            case 1050411144:
                if (str.equals("androidButtonDestructiveStandardBackgroundDisabled")) {
                    return colors.getComponent().getButton().getDestructive().getStandard().getBackground().disabled;
                }
                break;
            case 1056602043:
                if (str.equals("modalBackground")) {
                    return colors.getComponent().getModal().m3196getBackground0d7_KjU();
                }
                break;
            case 1060353643:
                if (str.equals("buttonDestructiveProminentIconDisabled")) {
                    return colors.getComponent().getButton().getDestructive().getProminent().icon.disabled;
                }
                break;
            case 1076086660:
                if (str.equals("inputCheckboxInactiveBorder")) {
                    return colors.getComponent().getInput().getCheckbox().getInactive().getBorder().m3173getDefault0d7_KjU();
                }
                break;
            case 1078562345:
                if (str.equals("titleBarBackground")) {
                    return colors.getComponent().getTitleBar().m3280getBackground0d7_KjU();
                }
                break;
            case 1087026024:
                if (str.equals("moneyAppletButtonBackgroundPressed")) {
                    return colors.getSurface().getMoney().getApplet().button.background.m3369getPressed0d7_KjU();
                }
                break;
            case 1105626833:
                if (str.equals("cellControlsIcon")) {
                    return colors.getComponent().getCell().getControls().icon.m3132getDefault0d7_KjU();
                }
                break;
            case 1105956741:
                if (str.equals("cellControlsText")) {
                    return colors.getComponent().getCell().getControls().m3128getText0d7_KjU();
                }
                break;
            case 1119973699:
                if (str.equals("textInverse")) {
                    return colors.getSemantic().getText().m3351getInverse0d7_KjU();
                }
                break;
            case 1123925683:
                if (str.equals("optionChipBackgroundPressed")) {
                    return colors.getComponent().getOptionChip().background.m3221getPressed0d7_KjU();
                }
                break;
            case 1127032946:
                if (str.equals("buttonDestructiveSubtleIconDisabled")) {
                    return colors.getComponent().getButton().getDestructive().getSubtle().getIcon().disabled;
                }
                break;
            case 1129293537:
                if (str.equals("bottomNavigationKeypadBackground")) {
                    return colors.getComponent().getBottomNavigation().keypad.m3106getBackground0d7_KjU();
                }
                break;
            case 1158972712:
                if (str.equals("inputRadioInactiveBorder")) {
                    return colors.getComponent().getInput().getRadio().getInactive().getBorder().m3192getDefault0d7_KjU();
                }
                break;
            case 1173675979:
                if (str.equals("headerTitle")) {
                    return colors.getComponent().header.m3163getTitle0d7_KjU();
                }
                break;
            case 1179521824:
                if (str.equals("uiHomeIndicatorInverseBorder")) {
                    return colors.getComponent().getUi().homeIndicator.getInverse().m3309getBorder0d7_KjU();
                }
                break;
            case 1184658039:
                if (str.equals("androidButtonSubtleTextDisabled")) {
                    return colors.getComponent().getButton().getSubtle().getText().disabled;
                }
                break;
            case 1200934628:
                if (str.equals("toggleActiveBackgroundDisabled")) {
                    return colors.getComponent().getToggle().active.background.m3294getDisabled0d7_KjU();
                }
                break;
            case 1205258763:
                if (str.equals("backgroundStandard")) {
                    return colors.getSemantic().getBackground().standard;
                }
                break;
            case 1261911281:
                if (str.equals("backgroundDanger")) {
                    return colors.getSemantic().getBackground().m3320getDanger0d7_KjU();
                }
                break;
            case 1269275424:
                if (str.equals("backgroundDimmer")) {
                    return colors.getComponent().getUi().dimmer.background;
                }
                break;
            case 1286279929:
                if (str.equals("backgroundBrand")) {
                    return colors.getSemantic().getBackground().m3319getBrand0d7_KjU();
                }
                break;
            case 1299148443:
                if (str.equals("copyCodeIcon")) {
                    return colors.getComponent().getCopyCode().m3146getIcon0d7_KjU();
                }
                break;
            case 1302883721:
                if (str.equals("accentSunshine")) {
                    return colors.getSemantic().getAccent().m3317getSunshine0d7_KjU();
                }
                break;
            case 1319890039:
                if (str.equals("iconInverse")) {
                    return colors.getSemantic().getIcon().inverse;
                }
                break;
            case 1334484162:
                if (str.equals("checkboxActiveIcon")) {
                    return colors.getComponent().getCheckbox().active.m3136getIcon0d7_KjU();
                }
                break;
            case 1335539135:
                if (str.equals("inputIconLeadingDisabled")) {
                    return colors.getComponent().getInput().getIcon().leading.m3184getDisabled0d7_KjU();
                }
                break;
            case 1344408822:
                if (str.equals("moneyAppletDataActiveBorder")) {
                    return colors.getSurface().getMoney().getApplet().data.getActive().m3372getBorder0d7_KjU();
                }
                break;
            case 1346490780:
                if (str.equals("brandAmber")) {
                    return colors.getBase().m2992getBrandAmber0d7_KjU();
                }
                break;
            case 1354188846:
                if (str.equals("androidButtonProminentTextDisabled")) {
                    return colors.getComponent().getButton().getProminent().getText().disabled;
                }
                break;
            case 1355489957:
                if (str.equals("toggleOffBackgroundDisabled")) {
                    return colors.getComponent().getToggle().off.background.m3300getDisabled0d7_KjU();
                }
                break;
            case 1358542355:
                if (str.equals("androidButtonDestructiveProminentBackground")) {
                    return colors.getComponent().getButton().getDestructive().getProminent().getBackground().f151default;
                }
                break;
            case 1358795838:
                if (str.equals("brandOrangeH1")) {
                    return colors.getBase().m3025getBrandOrangeH10d7_KjU();
                }
                break;
            case 1358795840:
                if (str.equals("brandOrangeH3")) {
                    return colors.getBase().m3026getBrandOrangeH30d7_KjU();
                }
                break;
            case 1358796179:
                if (str.equals("brandOrangeS1")) {
                    return colors.getBase().m3027getBrandOrangeS10d7_KjU();
                }
                break;
            case 1359124919:
                if (str.equals("brandOcean")) {
                    return colors.getBase().brandOcean;
                }
                break;
            case 1362272192:
                if (str.equals("brandRoyal")) {
                    return colors.getBase().m3032getBrandRoyal0d7_KjU();
                }
                break;
            case 1363325572:
                if (str.equals("brandSteel")) {
                    return colors.getBase().m3036getBrandSteel0d7_KjU();
                }
                break;
            case 1364497615:
                if (str.equals("androidButtonProminentBackgroundPressed")) {
                    return colors.getComponent().getButton().getProminent().getBackground().pressed;
                }
                break;
            case 1368556874:
                if (str.equals("inputLabel")) {
                    return colors.getComponent().getInput().label.m3190getDefault0d7_KjU();
                }
                break;
            case 1373031748:
                if (str.equals("segmentedControlOverlayButtonText")) {
                    return colors.getComponent().getSegmentedControl().overlay.button.text.m3252getDefault0d7_KjU();
                }
                break;
            case 1379911110:
                if (str.equals("segmentedControlButtonBackgroundSelected")) {
                    return colors.getComponent().getSegmentedControl().button.getBackground().m3250getSelected0d7_KjU();
                }
                break;
            case 1396238841:
                if (str.equals("borderSubtle")) {
                    return colors.getSemantic().getBorder().subtle;
                }
                break;
            case 1404513497:
                if (str.equals("searchBarBackground")) {
                    return colors.getComponent().searchBar.m3237getBackground0d7_KjU();
                }
                break;
            case 1404760496:
                if (str.equals("textDanger")) {
                    return colors.getSemantic().getText().m3349getDanger0d7_KjU();
                }
                break;
            case 1406588676:
                if (str.equals("buttonDestructiveProminentBackground")) {
                    return colors.getComponent().getButton().getDestructive().getProminent().getBackground().f151default;
                }
                break;
            case 1408324638:
                if (str.equals("buttonProminentBackgroundDisabled")) {
                    return colors.getComponent().getButton().getProminent().getBackground().disabled;
                }
                break;
            case 1431778800:
                if (str.equals("radioInactiveBackgroundDisabled")) {
                    return colors.getComponent().getRadio().inactive.background.m3233getDisabled0d7_KjU();
                }
                break;
            case 1460096952:
                if (str.equals("bottomNavigationIcon")) {
                    return colors.getComponent().getBottomNavigation().icon.m3104getDefault0d7_KjU();
                }
                break;
            case 1460426860:
                if (str.equals("bottomNavigationText")) {
                    return colors.getComponent().getBottomNavigation().text.m3111getDefault0d7_KjU();
                }
                break;
            case 1462330849:
                if (str.equals("searchFieldPlaceholder")) {
                    return colors.getComponent().getSearchField().m3242getPlaceholder0d7_KjU();
                }
                break;
            case 1465287839:
                if (str.equals("inputIconTrailing")) {
                    return colors.getComponent().getInput().getIcon().trailing.m3186getDefault0d7_KjU();
                }
                break;
            case 1466345634:
                if (str.equals("backgroundKeypad")) {
                    return colors.getSemantic().getBackground().m3324getKeypad0d7_KjU();
                }
                break;
            case 1472493278:
                if (str.equals("violet10")) {
                    return colors.getBase().m3074getViolet100d7_KjU();
                }
                break;
            case 1472493309:
                if (str.equals("violet20")) {
                    return colors.getBase().m3075getViolet200d7_KjU();
                }
                break;
            case 1472493340:
                if (str.equals("violet30")) {
                    return colors.getBase().m3076getViolet300d7_KjU();
                }
                break;
            case 1472493371:
                if (str.equals("violet40")) {
                    return colors.getBase().m3077getViolet400d7_KjU();
                }
                break;
            case 1472493402:
                if (str.equals("violet50")) {
                    return colors.getBase().m3079getViolet500d7_KjU();
                }
                break;
            case 1472493433:
                if (str.equals("violet60")) {
                    return colors.getBase().m3080getViolet600d7_KjU();
                }
                break;
            case 1472493464:
                if (str.equals("violet70")) {
                    return colors.getBase().m3081getViolet700d7_KjU();
                }
                break;
            case 1472493495:
                if (str.equals("violet80")) {
                    return colors.getBase().m3082getViolet800d7_KjU();
                }
                break;
            case 1472493526:
                if (str.equals("violet90")) {
                    return colors.getBase().m3083getViolet900d7_KjU();
                }
                break;
            case 1509778107:
                if (str.equals("constantBlack")) {
                    return colors.getBase().constantBlack;
                }
                break;
            case 1510705417:
                if (str.equals("constantClear")) {
                    return colors.getBase().m3044getConstantClear0d7_KjU();
                }
                break;
            case 1515744883:
                if (str.equals("bottomNavigationIconSelected")) {
                    return colors.getComponent().getBottomNavigation().icon.m3105getSelected0d7_KjU();
                }
                break;
            case 1529061093:
                if (str.equals("constantWhite")) {
                    return colors.getBase().constantWhite;
                }
                break;
            case 1531790202:
                if (str.equals("borderProminent")) {
                    return colors.getSemantic().getBorder().prominent;
                }
                break;
            case 1565645495:
                if (str.equals("serviceBitcoinBackground")) {
                    return colors.getSemantic().getService().bitcoinBackground;
                }
                break;
            case 1566457484:
                if (str.equals("modalButtonPrimaryDestructiveText")) {
                    return colors.getComponent().getModal().getButton().getPrimary().destructive.text.m3202getDefault0d7_KjU();
                }
                break;
            case 1578529884:
                if (str.equals("androidButtonSubtleBackground")) {
                    return colors.getComponent().getButton().getSubtle().background.f166default;
                }
                break;
            case 1582586418:
                if (str.equals("brandAzureH2")) {
                    return colors.getBase().m2994getBrandAzureH20d7_KjU();
                }
                break;
            case 1582586758:
                if (str.equals("brandAzureS1")) {
                    return colors.getBase().m2995getBrandAzureS10d7_KjU();
                }
                break;
            case 1587861014:
                if (str.equals("textSuccess")) {
                    return colors.getSemantic().getText().m3357getSuccess0d7_KjU();
                }
                break;
            case 1592554597:
                if (str.equals("inputIconError")) {
                    return colors.getComponent().getInput().getIcon().m3181getError0d7_KjU();
                }
                break;
            case 1612092082:
                if (str.equals("cellLabel")) {
                    return colors.getComponent().getCell().label.m3134getDefault0d7_KjU();
                }
                break;
            case 1650171956:
                if (str.equals("buttonSubtleIconDisabled")) {
                    return colors.getComponent().getButton().getSubtle().getIcon().disabled;
                }
                break;
            case 1670175998:
                if (str.equals("backgroundRipple")) {
                    return colors.getSemantic().getBackground().m3327getRipple0d7_KjU();
                }
                break;
            case 1674884004:
                if (str.equals("brandVioletS1")) {
                    return colors.getBase().m3039getBrandVioletS10d7_KjU();
                }
                break;
            case 1684434977:
                if (str.equals("timelineDotBackgroundPending")) {
                    return colors.getComponent().getTimeline().getDot().getBackground().m3270getPending0d7_KjU();
                }
                break;
            case 1691997336:
                if (str.equals("inputBackground")) {
                    return colors.getComponent().getInput().background.m3165getDefault0d7_KjU();
                }
                break;
            case 1706627939:
                if (str.equals("inputIcon")) {
                    return colors.getComponent().getInput().getIcon().m3179getDefault0d7_KjU();
                }
                break;
            case 1706957847:
                if (str.equals("inputText")) {
                    return colors.getComponent().getInput().text.m3193getDefault0d7_KjU();
                }
                break;
            case 1709474171:
                if (str.equals("backgroundSubtle")) {
                    return colors.getSemantic().getBackground().subtle;
                }
                break;
            case 1715081424:
                if (str.equals("filterBarChipTextDisabled")) {
                    return colors.getComponent().getFilterBar().getChip().text.m3159getDisabled0d7_KjU();
                }
                break;
            case 1716895799:
                if (str.equals("androidButtonDestructiveSubtleTextDisabled")) {
                    return colors.getComponent().getButton().getDestructive().getSubtle().getText().disabled;
                }
                break;
            case 1721683375:
                if (str.equals("cashGreen10")) {
                    return colors.getBase().m3040getCashGreen100d7_KjU();
                }
                break;
            case 1721683406:
                if (str.equals("cashGreen20")) {
                    return colors.getBase().m3041getCashGreen200d7_KjU();
                }
                break;
            case 1721683437:
                if (str.equals("cashGreen30")) {
                    return colors.getBase().m3042getCashGreen300d7_KjU();
                }
                break;
            case 1721683468:
                if (str.equals("cashGreen40")) {
                    return colors.getBase().m3043getCashGreen400d7_KjU();
                }
                break;
            case 1737539850:
                if (str.equals("serviceBorrow")) {
                    return colors.getSemantic().getService().m3346getBorrow0d7_KjU();
                }
                break;
            case 1755451099:
                if (str.equals("purple10")) {
                    return colors.getBase().m3062getPurple100d7_KjU();
                }
                break;
            case 1755451130:
                if (str.equals("purple20")) {
                    return colors.getBase().m3063getPurple200d7_KjU();
                }
                break;
            case 1775275160:
                if (str.equals("serviceInvesting")) {
                    return colors.getSemantic().getService().investing;
                }
                break;
            case 1787777354:
                if (str.equals("iconSuccess")) {
                    return colors.getSemantic().getIcon().m3341getSuccess0d7_KjU();
                }
                break;
            case 1788328743:
                if (str.equals("bottomNavigationKeypadIconSelected")) {
                    return colors.getComponent().getBottomNavigation().keypad.icon.m3108getSelected0d7_KjU();
                }
                break;
            case 1789620262:
                if (str.equals("androidButtonSubtleBackgroundPressed")) {
                    return colors.getComponent().getButton().getSubtle().background.pressed;
                }
                break;
            case 1808657923:
                if (str.equals("sliderKnobBorder")) {
                    return colors.getComponent().getSlider().knob.m3259getBorder0d7_KjU();
                }
                break;
            case 1811743625:
                if (str.equals("optionChipBorderDisabled")) {
                    return colors.getComponent().getOptionChip().border.m3223getDisabled0d7_KjU();
                }
                break;
            case 1812970170:
                if (str.equals("copyCodeSuccessIcon")) {
                    return colors.getComponent().getCopyCode().success.m3151getIcon0d7_KjU();
                }
                break;
            case 1829360885:
                if (str.equals("filterBarChipBackground")) {
                    return colors.getComponent().getFilterBar().getChip().background.m3152getDefault0d7_KjU();
                }
                break;
            case 1836892055:
                if (str.equals("titleBarButtonBackgroundTransparent")) {
                    return colors.getComponent().getTitleBar().button.background.m3282getTransparent0d7_KjU();
                }
                break;
            case 1850811421:
                if (str.equals("buttonProminentTextDisabled")) {
                    return colors.getComponent().getButton().getProminent().getText().disabled;
                }
                break;
            case 1852323386:
                if (str.equals("textSubtle")) {
                    return colors.getSemantic().getText().m3356getSubtle0d7_KjU();
                }
                break;
            case 1864739896:
                if (str.equals("buttonDestructiveSubtleTextPressed")) {
                    return colors.getComponent().getButton().getDestructive().getSubtle().getText().pressed;
                }
                break;
            case 1867811547:
                if (str.equals("buttonDestructiveStandardBackground")) {
                    return colors.getComponent().getButton().getDestructive().getStandard().getBackground().f154default;
                }
                break;
            case 1872660664:
                if (str.equals("toggleKnobBackground")) {
                    return colors.getComponent().getToggle().knob.background.m3297getDefault0d7_KjU();
                }
                break;
            case 1875871429:
                if (str.equals("buttonStandardBackgroundPressed")) {
                    return colors.getComponent().getButton().getStandard().getBackground().pressed;
                }
                break;
            case 1876286831:
                if (str.equals("timelineLineBorderNotStarted")) {
                    return colors.getComponent().getTimeline().getLine().getBorder().m3276getNotStarted0d7_KjU();
                }
                break;
            case 1881505131:
                if (str.equals("checkboxActiveBackgroundPressed")) {
                    return colors.getComponent().getCheckbox().active.background.m3139getPressed0d7_KjU();
                }
                break;
            case 1886294909:
                if (str.equals("toggleOnBackgroundDisabled")) {
                    return colors.getComponent().getToggle().on.background.m3302getDisabled0d7_KjU();
                }
                break;
            case 1887333777:
                if (str.equals("moneyUiDividerBorder")) {
                    return colors.getSurface().getMoney().getUi().getDivider().m3374getBorder0d7_KjU();
                }
                break;
            case 1891902095:
                if (str.equals("androidButtonDestructiveProminentBackgroundPressed")) {
                    return colors.getComponent().getButton().getDestructive().getProminent().getBackground().pressed;
                }
                break;
            case 1905152533:
                if (str.equals("iconDisabled")) {
                    return colors.getSemantic().getIcon().m3336getDisabled0d7_KjU();
                }
                break;
            case 1906293359:
                if (str.equals("optionChipBackground")) {
                    return colors.getComponent().getOptionChip().background.m3220getDefault0d7_KjU();
                }
                break;
            case 1913901186:
                if (str.equals("buttonDestructiveStandardIconDisabled")) {
                    return colors.getComponent().getButton().getDestructive().getStandard().getIcon().disabled;
                }
                break;
            case 1931044396:
                if (str.equals("modalButtonDestructiveTextDisabled")) {
                    return colors.getComponent().getModal().getButton().destructive.text.m3199getDisabled0d7_KjU();
                }
                break;
            case 1957841825:
                if (str.equals("brandPurpleS1")) {
                    return colors.getBase().m3031getBrandPurpleS10d7_KjU();
                }
                break;
            case 1960933210:
                if (str.equals("brandTurquoise")) {
                    return colors.getBase().m3038getBrandTurquoise0d7_KjU();
                }
                break;
            case 1967830274:
                if (str.equals("searchFieldBackgroundPressed")) {
                    return colors.getComponent().getSearchField().background.m3245getPressed0d7_KjU();
                }
                break;
            case 1976992207:
                if (str.equals("headerBody")) {
                    return colors.getComponent().header.m3161getBody0d7_KjU();
                }
                break;
            case 1977189542:
                if (str.equals("headerIcon")) {
                    return colors.getComponent().header.m3162getIcon0d7_KjU();
                }
                break;
            case 1984305246:
                if (str.equals("cardBackground")) {
                    return colors.getComponent().card.background.m3120getDefault0d7_KjU();
                }
                break;
            case 1988170687:
                if (str.equals("keypadButtonIcon")) {
                    return colors.getSurface().getKeypad().button.m3361getIcon0d7_KjU();
                }
                break;
            case 1988500595:
                if (str.equals("keypadButtonText")) {
                    return colors.getSurface().getKeypad().button.m3362getText0d7_KjU();
                }
                break;
            case 2018401615:
                if (str.equals("inputBackgroundSelectedPressed")) {
                    return colors.getComponent().getInput().background.selected.m3168getPressed0d7_KjU();
                }
                break;
            case 2020167811:
                if (str.equals("sliderThumbBackground")) {
                    return colors.getComponent().getSlider().thumb.m3260getBackground0d7_KjU();
                }
                break;
            case 2023177062:
                if (str.equals("checkboxInactiveBackgroundPressed")) {
                    return colors.getComponent().getCheckbox().inactive.background.m3143getPressed0d7_KjU();
                }
                break;
            case 2039040979:
                if (str.equals("androidButtonProminentBackground")) {
                    return colors.getComponent().getButton().getProminent().getBackground().f160default;
                }
                break;
            case 2064138534:
                if (str.equals("timelineDotBorderInProgress")) {
                    return colors.getComponent().getTimeline().getDot().getBorder().m3272getInProgress0d7_KjU();
                }
                break;
            case 2064656236:
                if (str.equals("buttonDestructiveSubtleIconPressed")) {
                    return colors.getComponent().getButton().getDestructive().getSubtle().getIcon().pressed;
                }
                break;
            case 2068321107:
                if (str.equals("inputBackgroundSelected")) {
                    return colors.getComponent().getInput().background.selected.m3167getDefault0d7_KjU();
                }
                break;
            case 2069743719:
                if (str.equals("optionCardBody")) {
                    return colors.getComponent().getOptionCard().body.m3212getDefault0d7_KjU();
                }
                break;
            case 2075353066:
                if (str.equals("searchBarTextPressed")) {
                    return colors.getComponent().searchBar.text.m3241getPressed0d7_KjU();
                }
                break;
            case 2082174810:
                if (str.equals("moneyAppletButtonBackground")) {
                    return colors.getSurface().getMoney().getApplet().button.background.m3367getDefault0d7_KjU();
                }
                break;
            case 2112736112:
                if (str.equals("badgeText")) {
                    return colors.getComponent().badge.m3096getText0d7_KjU();
                }
                break;
            case 2132479418:
                if (str.equals("androidButtonDestructiveProminentIconDisabled")) {
                    return colors.getComponent().getButton().getDestructive().getProminent().icon.disabled;
                }
                break;
            case 2139316164:
                if (str.equals("buttonStandardIconDisabled")) {
                    return colors.getComponent().getButton().getStandard().icon.disabled;
                }
                break;
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ColorScheme ID ", str, " not found!"));
        return 0L;
    }
}
