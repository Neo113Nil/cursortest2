package com.squareup.cash.arcade.components.internal;

import android.os.Build;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationKt;
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
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda5;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleConfiguration;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public abstract class UtilsKt {
    public static final ComposableLambdaImpl lambda$1099111706 = new ComposableLambdaImpl(new SaversKt$$ExternalSyntheticLambda5(7), false, 1099111706);

    /* renamed from: InputBox-VQfMllA, reason: not valid java name */
    public static final void m3396InputBoxVQfMllA(final String str, final InputColors inputColors, final long j, final long j2, final MutableInteractionSourceImpl mutableInteractionSourceImpl, final Function2 function2, final Function2 function22, final Function2 function23, final String str2, boolean z, final Function2 function24, Composer composer, final int i, final int i2, final int i3) {
        Function2 function25;
        boolean z2;
        int i4;
        GapComposer gapComposer;
        final boolean z3;
        inputColors.getClass();
        mutableInteractionSourceImpl.getClass();
        function24.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-742570630);
        int i5 = (gapComposer2.changed(str) ? 4 : 2) | i | (gapComposer2.changed(inputColors) ? 32 : 16) | (gapComposer2.changed(j) ? 256 : 128) | (gapComposer2.changed(j2) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i5 |= gapComposer2.changed(mutableInteractionSourceImpl) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i6 = i5 | (gapComposer2.changedInstance(function2) ? PKIFailureInfo.unsupportedVersion : 65536);
        if ((1572864 & i) == 0) {
            function25 = function22;
            i6 |= gapComposer2.changedInstance(function25) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        } else {
            function25 = function22;
        }
        if ((12582912 & i) == 0) {
            i6 |= gapComposer2.changedInstance(function23) ? 8388608 : 4194304;
        }
        int i7 = i6 | (gapComposer2.changed(str2) ? 67108864 : 33554432);
        int i8 = i3 & 512;
        if (i8 != 0) {
            i7 |= 805306368;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 805306368) == 0) {
                i7 |= gapComposer2.changed(z2) ? PKIFailureInfo.duplicateCertReq : 268435456;
            }
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (gapComposer2.changedInstance(function24) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i9 = i7;
        if (gapComposer2.shouldExecute(i9 & 1, ((i7 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            final boolean z4 = i8 != 0 ? true : z2;
            final MutableState collectIsFocusedAsState = Countries.collectIsFocusedAsState(mutableInteractionSourceImpl, gapComposer2, (i9 >> 12) & 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer2, 6);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, Modifier.Companion.$$INSTANCE);
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
            if (function2 != null) {
                gapComposer2.startReplaceGroup(-739550498);
                Updater.CompositionLocalProvider(new ProvidedValue[]{re$$ExternalSyntheticOutline0.m(inputColors.labelColor, ArcadeThemeKt.LocalTextColor), ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelMedium)}, Expect_jvmKt.rememberComposableLambda(2092719113, new ContextKt$$ExternalSyntheticLambda0(2, function2), gapComposer2), gapComposer2, 56);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-739365986);
                gapComposer2.end(false);
            }
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Object obj = DefaultSizes.border.entries;
            final RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f);
            gapComposer = gapComposer2;
            final Function2 function26 = function25;
            Updater.CompositionLocalProvider(RippleKt.LocalRippleConfiguration.defaultProvidedValue$runtime(inputRippleConfiguration(((Boolean) collectIsFocusedAsState.getValue()).booleanValue(), gapComposer2)), Expect_jvmKt.rememberComposableLambda(1365998084, new Function2() { // from class: com.squareup.cash.arcade.components.internal.InputBoxKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    float f;
                    InputColors inputColors2;
                    int i10;
                    String str3;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    boolean shouldExecute = gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2);
                    Applier applier = gapComposer3.applier;
                    if (shouldExecute) {
                        BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                        int i11 = 3;
                        Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                        if (((Boolean) collectIsFocusedAsState.getValue()).booleanValue()) {
                            gapComposer3.startReplaceGroup(-1535822838);
                            ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                            Object obj4 = DefaultSizes.border.annotationsMap;
                            gapComposer3.end(false);
                            f = 2.0f;
                        } else {
                            gapComposer3.startReplaceGroup(-1535824855);
                            ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                            Object obj5 = DefaultSizes.border.annotationsMap;
                            gapComposer3.end(false);
                            f = 1.0f;
                        }
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        long j3 = j;
                        RoundedCornerShape roundedCornerShape = m340RoundedCornerShape0680j_4;
                        Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(SizeKt.m279heightInVpY3zN4$default(IndicationKt.indication(ClipKt.clip(ImageKt.m177backgroundbw27NRU(ImageKt.m178borderxT4_qwU(companion, f, j3, roundedCornerShape), j2, roundedCornerShape), roundedCornerShape), mutableInteractionSourceImpl, RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer3, 0, 15)), 52.0f, RecyclerView.DECELERATION_RATE, 2), 16.0f, 12.0f);
                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned, vertical, gapComposer3, 54);
                        int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m299paddingVpY3zN4);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer3.useNode();
                        }
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                        Updater.m576setimpl(gapComposer3, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                        Integer valueOf = Integer.valueOf(hashCode2);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                        Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                        Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                        Function2 function27 = function26;
                        InputColors inputColors3 = inputColors;
                        if (function27 != null) {
                            gapComposer3.startReplaceGroup(510765974);
                            Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(inputColors3.leadingIcon, ArcadeThemeKt.LocalIconColor), Expect_jvmKt.rememberComposableLambda(2145986917, new ContextKt$$ExternalSyntheticLambda0(i11, function27), gapComposer3), gapComposer3, 56);
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(510869762);
                            gapComposer3.end(false);
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                        int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, layoutWeightElement);
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer3.useNode();
                        }
                        Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer3, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalTextStyle;
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                        Updater.CompositionLocalProvider(new ProvidedValue[]{dynamicProvidableCompositionLocal.defaultProvidedValue$runtime(((Typography) gapComposer3.consume(staticProvidableCompositionLocal)).input), re$$ExternalSyntheticOutline0.m(inputColors3.textColor, ArcadeThemeKt.LocalTextColor)}, UtilsKt.lambda$1099111706, gapComposer3, 56);
                        function24.invoke(gapComposer3, 0);
                        String str4 = str2;
                        if (str4 == null || !((str3 = str) == null || str3.length() == 0)) {
                            inputColors2 = inputColors3;
                            i10 = 56;
                            gapComposer3.startReplaceGroup(672559560);
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(672301051);
                            TextStyle textStyle = ((Typography) gapComposer3.consume(staticProvidableCompositionLocal)).input;
                            Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                            if (colors == null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                            } else {
                                gapComposer3.startReplaceGroup(-1762997739);
                                gapComposer3.end(false);
                            }
                            long j4 = colors.component.input.text.placeholder;
                            inputColors2 = inputColors3;
                            i10 = 56;
                            Room.m1165Text25TpFw(0, z4 ? 1 : Integer.MAX_VALUE, 0, 0, 0, 0, 4018, j4, (Composer) gapComposer3, (Modifier) null, textStyle, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                            gapComposer3 = gapComposer3;
                            gapComposer3.end(false);
                        }
                        gapComposer3.end(true);
                        Function2 function28 = function23;
                        if (function28 != null) {
                            gapComposer3.startReplaceGroup(511489204);
                            Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(inputColors2.trailingIcon, ArcadeThemeKt.LocalIconColor), Expect_jvmKt.rememberComposableLambda(-1686521650, new ContextKt$$ExternalSyntheticLambda0(4, function28), gapComposer3), gapComposer3, i10);
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(511594914);
                            gapComposer3.end(false);
                        }
                        gapComposer3.end(true);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer), gapComposer, 56);
            gapComposer.end(true);
            z3 = z4;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            z3 = z2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.arcade.components.internal.InputBoxKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                    int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                    UtilsKt.m3396InputBoxVQfMllA(str, inputColors, j, j2, mutableInteractionSourceImpl, function2, function22, function23, str2, z3, function24, (Composer) obj2, updateChangedFlags, updateChangedFlags2, i3);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: default, reason: not valid java name */
    public static InputColors m3397default(Composer composer) {
        return new InputColors(Strings.getColors(composer).component.input.border.f186default, Strings.getColors(composer).component.input.border.selected, Strings.getColors(composer).component.input.text.f195default, Strings.getColors(composer).component.input.helper.text.f189default, Strings.getColors(composer).component.input.label.f193default, Strings.getColors(composer).component.input.icon.leading.f191default, Strings.getColors(composer).component.input.icon.trailing.f192default, Strings.getColors(composer).component.input.helper.icon, Strings.getColors(composer).component.input.background.f184default);
    }

    public static InputColors disabled(Composer composer) {
        return new InputColors(Strings.getColors(composer).component.input.border.disabled, Strings.getColors(composer).component.input.border.selected, Strings.getColors(composer).component.input.text.disabled, Strings.getColors(composer).component.input.helper.text.f189default, Strings.getColors(composer).component.input.label.disabled, Strings.getColors(composer).component.input.icon.leading.disabled, Strings.getColors(composer).component.input.icon.trailing.disabled, Strings.getColors(composer).component.input.helper.icon, Strings.getColors(composer).component.input.background.f184default);
    }

    public static InputColors error(Composer composer) {
        return new InputColors(Strings.getColors(composer).component.input.border.error, Strings.getColors(composer).component.input.border.error, Strings.getColors(composer).component.input.text.f195default, Strings.getColors(composer).component.input.helper.text.error, Strings.getColors(composer).component.input.label.f193default, Strings.getColors(composer).component.input.icon.leading.f191default, Strings.getColors(composer).component.input.icon.trailing.error, Strings.getColors(composer).component.input.helper.icon, Strings.getColors(composer).component.input.background.f184default);
    }

    public static final long getProminentInverse(Colors.Semantic.Icon icon, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        return (colors.isLight ? ColorsDarkKt.colorsDark : ColorsLightKt.colorsLight).semantic.icon.prominent;
    }

    public static final RippleConfiguration inputRippleConfiguration(boolean z, Composer composer) {
        RippleConfiguration rippleConfiguration = (RippleConfiguration) ((GapComposer) composer).consume(RippleKt.LocalRippleConfiguration);
        RippleAlpha rippleAlpha = rippleConfiguration.rippleAlpha;
        return RippleConfiguration.m3399copyDxMtmZc$default(rippleConfiguration, 0L, new RippleAlpha(rippleAlpha.draggedAlpha, RecyclerView.DECELERATION_RATE, rippleAlpha.hoveredAlpha, z ? 0.0f : rippleAlpha.pressedAlpha), 1);
    }

    public static final boolean isInScreenshotTest(Composer composer) {
        if (((Boolean) ((GapComposer) composer).consume(InspectionModeKt.LocalInspectionMode)).booleanValue()) {
            return true;
        }
        String str = Build.FINGERPRINT;
        str.getClass();
        return StringsKt.contains((CharSequence) str, (CharSequence) "layoutlib", false) || str.equals("robolectric");
    }

    /* renamed from: tintFilter-8_81llA, reason: not valid java name */
    public static final BlendModeColorFilter m3398tintFilter8_81llA(long j) {
        return new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5)));
    }
}
