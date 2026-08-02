package com.squareup.cash.arcade.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.material.AppBarKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda1;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimatable;
import com.airbnb.lottie.compose.LottieAnimatableKt;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda5;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.HapticsKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.internal.UtilsKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public abstract class CopyCodeKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ea  */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CopyCode(ComposableLambdaImpl composableLambdaImpl, Function2 function2, String str, Modifier modifier, Icons icons, CopyCodeState copyCodeState, Function1 function1, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Icons icons2;
        Modifier modifier3;
        CopyCodeState copyCodeState2;
        RecomposeScopeImpl endRestartGroup;
        Icons icons3;
        int i5;
        CopyCodeState rememberCopyCodeState;
        Object rememberedValue;
        NeverEqualPolicy neverEqualPolicy;
        MutableInteractionSourceImpl mutableInteractionSourceImpl;
        int i6;
        CopyCodeColors copyCodeColors;
        Colors colors;
        Colors colors2;
        boolean changed;
        Object rememberedValue2;
        ?? r13;
        Object rememberedValue3;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        Icons icons4;
        boolean z;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        CopyCodeState copyCodeState3;
        int i7;
        int i8;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1510035291);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(str) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= gapComposer.changed(icons == null ? -1 : icons.ordinal()) ? 16384 : PKIFailureInfo.certRevoked;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= gapComposer.changed((Object) null) ? PKIFailureInfo.unsupportedVersion : 65536;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0 && gapComposer.changedInstance(copyCodeState)) {
                    i8 = PKIFailureInfo.badCertTemplate;
                    i3 |= i8;
                }
                i8 = PKIFailureInfo.signerNotTrusted;
                i3 |= i8;
            }
            if ((12582912 & i) == 0) {
                i3 |= gapComposer.changedInstance(function1) ? 8388608 : 4194304;
            }
            if (gapComposer.shouldExecute(i3 & 1, (4793491 & i3) == 4793490)) {
                gapComposer.skipToGroupEnd();
                icons2 = icons;
                modifier3 = modifier2;
                copyCodeState2 = copyCodeState;
            } else {
                gapComposer.startDefaults();
                int i10 = i & 1;
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                if (i10 == 0 || gapComposer.getDefaultsInvalid()) {
                    if (i9 != 0) {
                        modifier2 = companion;
                    }
                    Icons icons5 = i4 != 0 ? null : icons;
                    if ((i2 & 64) != 0) {
                        Icons icons6 = icons5;
                        i5 = i3 & (-3670017);
                        rememberCopyCodeState = rememberCopyCodeState(gapComposer);
                        icons3 = icons6;
                        gapComposer.endDefaults();
                        Function0 rememberHapticTrigger = PlatformKt.rememberHapticTrigger(((Haptics) gapComposer.consume(HapticsKt.LocalHaptics)).success, gapComposer, 0);
                        rememberedValue = gapComposer.rememberedValue();
                        neverEqualPolicy = Composer.Companion.Empty;
                        if (rememberedValue == neverEqualPolicy) {
                            rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                        }
                        mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                        if (((Boolean) Room.collectIsPressedAsState(mutableInteractionSourceImpl, gapComposer, 6).getValue()).booleanValue()) {
                            i6 = i5;
                            if (((Boolean) rememberCopyCodeState.isAnimating$delegate.getValue()).booleanValue()) {
                                gapComposer.startReplaceGroup(-555011195);
                                copyCodeColors = new CopyCodeColors(Strings.getColors(gapComposer).semantic.text.standard, Strings.getColors(gapComposer).semantic.text.subtle, Strings.getColors(gapComposer).component.copyCode.success.icon, Strings.getColors(gapComposer).semantic.icon.standard);
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(-555009916);
                                copyCodeColors = new CopyCodeColors(Strings.getColors(gapComposer).semantic.text.standard, Strings.getColors(gapComposer).semantic.text.subtle, Strings.getColors(gapComposer).component.copyCode.icon, Strings.getColors(gapComposer).semantic.icon.standard);
                                gapComposer.end(false);
                            }
                        } else {
                            gapComposer.startReplaceGroup(-555012860);
                            i6 = i5;
                            copyCodeColors = new CopyCodeColors(Strings.getColors(gapComposer).semantic.text.standard, Strings.getColors(gapComposer).semantic.text.subtle, Strings.getColors(gapComposer).component.copyCode.icon, Strings.getColors(gapComposer).semantic.icon.standard);
                            gapComposer.end(false);
                        }
                        CopyCodeColors copyCodeColors2 = copyCodeColors;
                        Modifier m276defaultMinSizeVpY3zN4$default = SizeKt.m276defaultMinSizeVpY3zN4$default(modifier2, RecyclerView.DECELERATION_RATE, function2 != null ? 56.0f : 76.0f, 1);
                        colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors != null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                            colors2 = colors;
                        }
                        Icons icons7 = icons3;
                        Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(m276defaultMinSizeVpY3zN4$default, colors2.component.copyCode.background.f180default, ColorKt.RectangleShape);
                        IndicationNodeFactory indicationNodeFactory = (IndicationNodeFactory) gapComposer.consume(IndicationKt.LocalIndication);
                        changed = gapComposer.changed(rememberHapticTrigger) | ((i6 & 29360128) != 8388608) | gapComposer.changedInstance(rememberCopyCodeState);
                        rememberedValue2 = gapComposer.rememberedValue();
                        if (!changed || rememberedValue2 == neverEqualPolicy) {
                            r13 = 0;
                            rememberedValue2 = new CopyCodeKt$$ExternalSyntheticLambda4((int) (0 == true ? 1 : 0), (Object) rememberHapticTrigger, (Object) function1, (Object) rememberCopyCodeState);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        } else {
                            r13 = 0;
                        }
                        Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(m177backgroundbw27NRU, mutableInteractionSourceImpl, indicationNodeFactory, false, str, null, (Function0) rememberedValue2, 20);
                        rememberedValue3 = gapComposer.rememberedValue();
                        if (rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = new CopyCodeKt$$ExternalSyntheticLambda5(r13);
                            gapComposer.updateRememberedValue(rememberedValue3);
                        }
                        Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(SemanticsModifierKt.semantics(m182clickableO2vRcR0$default, r13, (Function1) rememberedValue3), 16.0f, 16.0f);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, r13);
                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                        if (applier != null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer.useNode();
                        }
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                        Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$15);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$16);
                        Integer valueOf = Integer.valueOf(hashCode);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$17);
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                        Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                        Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$18);
                        Modifier modifier4 = modifier2;
                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer, 6);
                        int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$15);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$16);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$17, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                        Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$18);
                        if (icons7 == null) {
                            gapComposer.startReplaceGroup(-1345235304);
                            gapComposer.end(false);
                            z = false;
                            copyCodeState3 = rememberCopyCodeState;
                            composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$16;
                            ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                            composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$17;
                            layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                            composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$15;
                            composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$18;
                            i7 = 6;
                            icons4 = icons7;
                        } else {
                            gapComposer.startReplaceGroup(-1345235303);
                            layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                            ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                            composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$18;
                            composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$17;
                            composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$16;
                            icons4 = icons7;
                            z = false;
                            composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$15;
                            copyCodeState3 = rememberCopyCodeState;
                            i7 = 6;
                            Trace.m1191Iconww6aTOc(icons4, (String) null, new WithAlignmentLineElement(AlignmentLinesKt.FirstLineCenter), copyCodeColors2.leadingIconColor, gapComposer, (i6 >> 12) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                            gapComposer.end(false);
                        }
                        if (1.0f > 0.0d) {
                            z = true;
                        }
                        if (!z) {
                            InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                        }
                        Modifier then = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).then(new WithAlignmentLineElement(AlignmentLinesKt.FirstLineCenter));
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.Start, gapComposer, i7);
                        int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, then);
                        gapComposer.startReusableNode();
                        if (gapComposer.inserting) {
                            gapComposer.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer.useNode();
                        }
                        Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$14);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$13);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$12, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$1);
                        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalTextStyle;
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                        ProvidedValue defaultProvidedValue$runtime = dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(((Typography) gapComposer.consume(staticProvidableCompositionLocal)).labelMedium);
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalTextColor;
                        Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, re$$ExternalSyntheticOutline0.m(copyCodeColors2.textColorLabel, staticProvidableCompositionLocal2)}, Expect_jvmKt.rememberComposableLambda(-1833627909, new AppBarKt$$ExternalSyntheticLambda4(composableLambdaImpl, 20), gapComposer), gapComposer, 56);
                        Updater.CompositionLocalProvider(new ProvidedValue[]{dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodyMedium), re$$ExternalSyntheticOutline0.m(copyCodeColors2.textColorBody, staticProvidableCompositionLocal2)}, Expect_jvmKt.rememberComposableLambda(-1019155086, new ToastKt$$ExternalSyntheticLambda11(3, function2), gapComposer), gapComposer, 56);
                        gapComposer.end(true);
                        CopyCodeState copyCodeState4 = copyCodeState3;
                        CopyCodeAnimation(new VerticalAlignElement(Alignment.Companion.CenterVertically), copyCodeState4, copyCodeColors2, gapComposer, (i6 >> 15) & 112);
                        gapComposer.end(true);
                        gapComposer.end(true);
                        copyCodeState2 = copyCodeState4;
                        icons2 = icons4;
                        modifier3 = modifier4;
                    } else {
                        icons3 = icons5;
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    icons3 = icons;
                }
                i5 = i3;
                rememberCopyCodeState = copyCodeState;
                gapComposer.endDefaults();
                Function0 rememberHapticTrigger2 = PlatformKt.rememberHapticTrigger(((Haptics) gapComposer.consume(HapticsKt.LocalHaptics)).success, gapComposer, 0);
                rememberedValue = gapComposer.rememberedValue();
                neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                }
                mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                if (((Boolean) Room.collectIsPressedAsState(mutableInteractionSourceImpl, gapComposer, 6).getValue()).booleanValue()) {
                }
                CopyCodeColors copyCodeColors22 = copyCodeColors;
                Modifier m276defaultMinSizeVpY3zN4$default2 = SizeKt.m276defaultMinSizeVpY3zN4$default(modifier2, RecyclerView.DECELERATION_RATE, function2 != null ? 56.0f : 76.0f, 1);
                colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors != null) {
                }
                Icons icons72 = icons3;
                Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(m276defaultMinSizeVpY3zN4$default2, colors2.component.copyCode.background.f180default, ColorKt.RectangleShape);
                IndicationNodeFactory indicationNodeFactory2 = (IndicationNodeFactory) gapComposer.consume(IndicationKt.LocalIndication);
                changed = gapComposer.changed(rememberHapticTrigger2) | ((i6 & 29360128) != 8388608) | gapComposer.changedInstance(rememberCopyCodeState);
                rememberedValue2 = gapComposer.rememberedValue();
                if (changed) {
                }
                r13 = 0;
                rememberedValue2 = new CopyCodeKt$$ExternalSyntheticLambda4((int) (0 == true ? 1 : 0), (Object) rememberHapticTrigger2, (Object) function1, (Object) rememberCopyCodeState);
                gapComposer.updateRememberedValue(rememberedValue2);
                Modifier m182clickableO2vRcR0$default2 = ImageKt.m182clickableO2vRcR0$default(m177backgroundbw27NRU2, mutableInteractionSourceImpl, indicationNodeFactory2, false, str, null, (Function0) rememberedValue2, 20);
                rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                }
                Modifier m299paddingVpY3zN42 = SpacerKt.m299paddingVpY3zN4(SemanticsModifierKt.semantics(m182clickableO2vRcR0$default2, r13, (Function1) rememberedValue3), 16.0f, 16.0f);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, r13);
                int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN42);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$122 = ComposeUiNode.Companion.Constructor;
                if (applier != null) {
                }
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new ToastKt$$ExternalSyntheticLambda3(composableLambdaImpl, function2, str, modifier3, icons2, copyCodeState2, function1, i, i2);
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((12582912 & i) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (4793491 & i3) == 4793490)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void CopyCodeAnimation(Modifier modifier, CopyCodeState copyCodeState, CopyCodeColors copyCodeColors, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1874775356);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(copyCodeState) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(copyCodeColors) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            LottieCompositionResult rememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(LottieCompositionSpec.RawRes.m1524boximpl(LottieCompositionSpec.RawRes.m1525constructorimpl(colors.isLight ? R.raw.copy_code_light : R.raw.copy_code_dark)), null, null, null, null, null, gapComposer, 0, 62);
            LottieAnimatable rememberLottieAnimatable = LottieAnimatableKt.rememberLottieAnimatable(gapComposer, 0);
            boolean isInScreenshotTest = UtilsKt.isInScreenshotTest(gapComposer);
            Boolean bool = (Boolean) copyCodeState.isAnimating$delegate.getValue();
            bool.booleanValue();
            LottieComposition lottieComposition = (LottieComposition) rememberLottieComposition.getValue();
            boolean changedInstance = gapComposer.changedInstance(copyCodeState) | gapComposer.changed(rememberLottieComposition) | gapComposer.changed(rememberLottieAnimatable);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == obj) {
                rememberedValue = new CopyCodeKt$CopyCodeAnimation$1$1(copyCodeState, rememberLottieAnimatable, rememberLottieComposition, null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(bool, lottieComposition, (Function2) rememberedValue, gapComposer);
            if (isInScreenshotTest) {
                gapComposer.startReplaceGroup(322705102);
                Trace.m1191Iconww6aTOc(((Boolean) copyCodeState.isAnimating$delegate.getValue()).booleanValue() ? Icons.Check24 : Icons.Copy24, (String) null, modifier, copyCodeColors.copyIconColor, gapComposer, ((i2 << 6) & 896) | 48, 0);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(322887351);
                LottieComposition lottieComposition2 = (LottieComposition) rememberLottieComposition.getValue();
                boolean changed = gapComposer.changed(rememberLottieAnimatable);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == obj) {
                    rememberedValue2 = new CheckboxKt$$ExternalSyntheticLambda5(rememberLottieAnimatable, 1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                LottieAnimationKt.LottieAnimation(lottieComposition2, (Function0) rememberedValue2, modifier, false, false, false, false, null, false, null, null, null, false, false, null, null, false, gapComposer, (i2 << 6) & 896, 0, 131064);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(modifier, copyCodeState, copyCodeColors, i, 0);
        }
    }

    public static final CopyCodeState rememberCopyCodeState(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        AndroidClipboardManager androidClipboardManager = (AndroidClipboardManager) gapComposer.consume(CompositionLocalsKt.LocalClipboardManager);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new CopyCodeState(androidClipboardManager);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (CopyCodeState) rememberedValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CopyCode(String str, String str2, String str3, Modifier modifier, CopyCodeState copyCodeState, Function1 function1, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1 function12;
        GapComposer gapComposer;
        CopyCodeState copyCodeState2;
        Function1 function13;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        Function1 function14;
        int i5;
        ComposableLambdaImpl rememberComposableLambda;
        int i6;
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(506734137);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(str2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changed(str3) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 2048 : 1024;
            i4 = 221184 | i3;
            if ((1572864 & i) == 0) {
                i4 = 745472 | i3;
            }
            if ((12582912 & i) != 0) {
                if ((i2 & 128) == 0) {
                    function12 = function1;
                    if (gapComposer2.changedInstance(function12)) {
                        i6 = 8388608;
                        i4 |= i6;
                    }
                } else {
                    function12 = function1;
                }
                i6 = 4194304;
                i4 |= i6;
            } else {
                function12 = function1;
            }
            if (!gapComposer2.shouldExecute(i4 & 1, (4793491 & i4) == 4793490)) {
                gapComposer2.startDefaults();
                if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                    gapComposer2.skipToGroupEnd();
                    i5 = i4 & (-3670017);
                    if ((i2 & 128) != 0) {
                        i5 = i4 & (-33030145);
                    }
                    copyCodeState2 = copyCodeState;
                } else {
                    if (i7 != 0) {
                        modifier2 = Modifier.Companion.$$INSTANCE;
                    }
                    copyCodeState2 = rememberCopyCodeState(gapComposer2);
                    int i8 = i4 & (-3670017);
                    if ((i2 & 128) != 0) {
                        boolean z = ((i4 & 112) == 32) | ((i4 & 14) == 4);
                        Object rememberedValue = gapComposer2.rememberedValue();
                        if (z || rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(str2, str, 7);
                            gapComposer2.updateRememberedValue(rememberedValue);
                        }
                        function12 = (Function1) rememberedValue;
                        i5 = i4 & (-33030145);
                    } else {
                        function14 = function12;
                        i5 = i8;
                        Modifier modifier4 = modifier2;
                        gapComposer2.endDefaults();
                        ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-265741688, new ToastKt$$ExternalSyntheticLambda1(str, 22), gapComposer2);
                        if (str2 != null) {
                            gapComposer2.startReplaceGroup(-692993484);
                            gapComposer2.end(false);
                            rememberComposableLambda = null;
                        } else {
                            gapComposer2.startReplaceGroup(-692993483);
                            rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-6693314, new ToastKt$$ExternalSyntheticLambda1(str2, 23), gapComposer2);
                            gapComposer2.end(false);
                        }
                        gapComposer = gapComposer2;
                        CopyCode(rememberComposableLambda2, rememberComposableLambda, str3, modifier4, null, copyCodeState2, function14, gapComposer, (i5 & 896) | 6 | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 29360128), 0);
                        modifier3 = modifier4;
                        function13 = function14;
                    }
                }
                function14 = function12;
                Modifier modifier42 = modifier2;
                gapComposer2.endDefaults();
                ComposableLambdaImpl rememberComposableLambda22 = Expect_jvmKt.rememberComposableLambda(-265741688, new ToastKt$$ExternalSyntheticLambda1(str, 22), gapComposer2);
                if (str2 != null) {
                }
                gapComposer = gapComposer2;
                CopyCode(rememberComposableLambda22, rememberComposableLambda, str3, modifier42, null, copyCodeState2, function14, gapComposer, (i5 & 896) | 6 | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 29360128), 0);
                modifier3 = modifier42;
                function13 = function14;
            } else {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                copyCodeState2 = copyCodeState;
                function13 = function12;
                modifier3 = modifier2;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(str, str2, str3, modifier3, copyCodeState2, function13, i, i2);
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = 221184 | i3;
        if ((1572864 & i) == 0) {
        }
        if ((12582912 & i) != 0) {
        }
        if (!gapComposer2.shouldExecute(i4 & 1, (4793491 & i4) == 4793490)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
