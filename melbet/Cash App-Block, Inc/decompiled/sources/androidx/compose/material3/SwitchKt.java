package androidx.compose.material3;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.SnapSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.Role;
import app.cash.molecule.PlatformKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class SwitchKt {
    public static final SnapSpec SnapSpec;
    public static final float SwitchHeight;
    public static final float SwitchWidth;
    public static final float ThumbDiameter;
    public static final float ThumbPadding;
    public static final float UncheckedThumbDiameter;

    static {
        float f = SwitchTokens.SelectedHandleWidth;
        ThumbDiameter = f;
        UncheckedThumbDiameter = SwitchTokens.UnselectedHandleWidth;
        SwitchWidth = SwitchTokens.TrackWidth;
        float f2 = SwitchTokens.TrackHeight;
        SwitchHeight = f2;
        ThumbPadding = (f2 - f) / 2.0f;
        SnapSpec = new SnapSpec(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Switch(boolean z, Function1 function1, Modifier modifier, Function2 function2, boolean z2, SwitchColors switchColors, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function2 function22;
        int i5;
        boolean z3;
        SwitchColors switchColors2;
        int i6;
        Modifier modifier3;
        Function2 function23;
        RecomposeScopeImpl endRestartGroup;
        int i7;
        Function2 function24;
        Modifier modifier4;
        int i8;
        SwitchColors switchColors3;
        MutableInteractionSourceImpl mutableInteractionSourceImpl;
        int i9;
        int i10;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-263339167);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function22 = function2;
                i3 |= gapComposer.changedInstance(function22) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    z3 = z2;
                    i3 |= gapComposer.changed(z3) ? 16384 : PKIFailureInfo.certRevoked;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            switchColors2 = switchColors;
                            if (gapComposer.changed(switchColors2)) {
                                i10 = PKIFailureInfo.unsupportedVersion;
                                i3 |= i10;
                            }
                        } else {
                            switchColors2 = switchColors;
                        }
                        i10 = 65536;
                        i3 |= i10;
                    } else {
                        switchColors2 = switchColors;
                    }
                    i6 = i3 | 1572864;
                    if (gapComposer.shouldExecute(i6 & 1, (599187 & i6) == 599186)) {
                        gapComposer.skipToGroupEnd();
                        modifier3 = modifier2;
                        function23 = function22;
                    } else {
                        gapComposer.startDefaults();
                        int i12 = i & 1;
                        Modifier modifier5 = Modifier.Companion.$$INSTANCE;
                        if (i12 == 0 || gapComposer.getDefaultsInvalid()) {
                            if (i11 != 0) {
                                modifier2 = modifier5;
                            }
                            Function2 function25 = i4 != 0 ? null : function22;
                            if (i5 != 0) {
                                z3 = true;
                            }
                            if ((i2 & 32) != 0) {
                                ColorScheme colorScheme = (ColorScheme) gapComposer.consume(ColorSchemeKt.LocalColorScheme);
                                SwitchColors switchColors4 = colorScheme.defaultSwitchColorsCached;
                                long j = colorScheme.surface;
                                if (switchColors4 == null) {
                                    long fromToken = ColorSchemeKt.fromToken(colorScheme, SwitchTokens.SelectedHandleColor);
                                    long fromToken2 = ColorSchemeKt.fromToken(colorScheme, SwitchTokens.SelectedTrackColor);
                                    long j2 = Color.Transparent;
                                    long fromToken3 = ColorSchemeKt.fromToken(colorScheme, SwitchTokens.SelectedIconColor);
                                    long fromToken4 = ColorSchemeKt.fromToken(colorScheme, SwitchTokens.UnselectedHandleColor);
                                    long fromToken5 = ColorSchemeKt.fromToken(colorScheme, SwitchTokens.UnselectedTrackColor);
                                    long fromToken6 = ColorSchemeKt.fromToken(colorScheme, SwitchTokens.UnselectedFocusTrackOutlineColor);
                                    long fromToken7 = ColorSchemeKt.fromToken(colorScheme, SwitchTokens.UnselectedIconColor);
                                    long m684compositeOverOWjLjI = ColorKt.m684compositeOverOWjLjI(Color.m675copywmQWz5c$default(SwitchTokens.DisabledSelectedHandleOpacity, ColorSchemeKt.fromToken(colorScheme, SwitchTokens.DisabledSelectedHandleColor), 14), j);
                                    long fromToken8 = ColorSchemeKt.fromToken(colorScheme, SwitchTokens.DisabledSelectedTrackColor);
                                    float f = SwitchTokens.DisabledTrackOpacity;
                                    i8 = i6;
                                    switchColors3 = new SwitchColors(fromToken, fromToken2, j2, fromToken3, fromToken4, fromToken5, fromToken6, fromToken7, m684compositeOverOWjLjI, ColorKt.m684compositeOverOWjLjI(Color.m675copywmQWz5c$default(f, fromToken8, 14), j), j2, ColorKt.m684compositeOverOWjLjI(Color.m675copywmQWz5c$default(SwitchTokens.DisabledSelectedIconOpacity, ColorSchemeKt.fromToken(colorScheme, SwitchTokens.DisabledSelectedIconColor), 14), j), ColorKt.m684compositeOverOWjLjI(Color.m675copywmQWz5c$default(SwitchTokens.DisabledUnselectedHandleOpacity, ColorSchemeKt.fromToken(colorScheme, SwitchTokens.DisabledUnselectedHandleColor), 14), j), ColorKt.m684compositeOverOWjLjI(Color.m675copywmQWz5c$default(f, ColorSchemeKt.fromToken(colorScheme, SwitchTokens.DisabledUnselectedTrackColor), 14), j), ColorKt.m684compositeOverOWjLjI(Color.m675copywmQWz5c$default(f, ColorSchemeKt.fromToken(colorScheme, SwitchTokens.DisabledUnselectedTrackOutlineColor), 14), j), ColorKt.m684compositeOverOWjLjI(Color.m675copywmQWz5c$default(SwitchTokens.DisabledUnselectedIconOpacity, ColorSchemeKt.fromToken(colorScheme, SwitchTokens.DisabledUnselectedIconColor), 14), j));
                                    colorScheme.defaultSwitchColorsCached = switchColors3;
                                } else {
                                    i8 = i6;
                                    switchColors3 = switchColors4;
                                }
                                switchColors2 = switchColors3;
                                i6 = i8 & (-458753);
                            }
                            i7 = i6;
                            function24 = function25;
                            modifier4 = modifier2;
                        } else {
                            gapComposer.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i6 &= -458753;
                            }
                            i7 = i6;
                            modifier4 = modifier2;
                            function24 = function22;
                        }
                        gapComposer.endDefaults();
                        gapComposer.startReplaceGroup(1768604058);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                        }
                        MutableInteractionSourceImpl mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) rememberedValue;
                        gapComposer.end(false);
                        if (function1 != null) {
                            HorizontalAlignmentLine horizontalAlignmentLine = InteractiveComponentSizeKt.MinimumInteractiveTopAlignmentLine;
                            i9 = 2;
                            mutableInteractionSourceImpl = mutableInteractionSourceImpl2;
                            modifier5 = SelectableKt.m336toggleableO2vRcR0(MinimumInteractiveModifier.INSTANCE, z, mutableInteractionSourceImpl, null, z3, new Role(2), function1);
                        } else {
                            mutableInteractionSourceImpl = mutableInteractionSourceImpl2;
                            i9 = 2;
                        }
                        int i13 = i7 << 3;
                        int i14 = i7 >> 6;
                        SwitchImpl(SizeKt.m282requiredSizeVpY3zN4(SizeKt.wrapContentSize$default(modifier4.then(modifier5), Alignment.Companion.Center, i9), SwitchWidth, SwitchHeight), z, z3, switchColors2, function24, mutableInteractionSourceImpl, ShapesKt.getValue(SwitchTokens.HandleShape, gapComposer), gapComposer, (i13 & 112) | (i14 & 896) | (i14 & 7168) | (i13 & 57344));
                        modifier3 = modifier4;
                        function23 = function24;
                    }
                    boolean z4 = z3;
                    SwitchColors switchColors5 = switchColors2;
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new SwitchKt$$ExternalSyntheticLambda0(z, function1, modifier3, function23, z4, switchColors5, i, i2);
                        return;
                    }
                    return;
                }
                z3 = z2;
                if ((196608 & i) != 0) {
                }
                i6 = i3 | 1572864;
                if (gapComposer.shouldExecute(i6 & 1, (599187 & i6) == 599186)) {
                }
                boolean z42 = z3;
                SwitchColors switchColors52 = switchColors2;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function22 = function2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z3 = z2;
            if ((196608 & i) != 0) {
            }
            i6 = i3 | 1572864;
            if (gapComposer.shouldExecute(i6 & 1, (599187 & i6) == 599186)) {
            }
            boolean z422 = z3;
            SwitchColors switchColors522 = switchColors2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function22 = function2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z3 = z2;
        if ((196608 & i) != 0) {
        }
        i6 = i3 | 1572864;
        if (gapComposer.shouldExecute(i6 & 1, (599187 & i6) == 599186)) {
        }
        boolean z4222 = z3;
        SwitchColors switchColors5222 = switchColors2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0131, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0.rememberedValue(), java.lang.Integer.valueOf(r9)) == false) goto L94;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SwitchImpl(Modifier modifier, boolean z, boolean z2, SwitchColors switchColors, Function2 function2, MutableInteractionSourceImpl mutableInteractionSourceImpl, Shape shape, Composer composer, int i) {
        int i2;
        Applier applier;
        long j;
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-670917213);
        Applier applier2 = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(switchColors) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changed(mutableInteractionSourceImpl) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changed(shape) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            long j2 = z2 ? z ? switchColors.checkedTrackColor : switchColors.uncheckedTrackColor : z ? switchColors.disabledCheckedTrackColor : switchColors.disabledUncheckedTrackColor;
            long j3 = z2 ? z ? switchColors.checkedThumbColor : switchColors.uncheckedThumbColor : z ? switchColors.disabledCheckedThumbColor : switchColors.disabledUncheckedThumbColor;
            Shape value = ShapesKt.getValue(SwitchTokens.TrackShape, gapComposer);
            float f = SwitchTokens.TrackOutlineWidth;
            if (z2) {
                applier = applier2;
                j = z ? switchColors.checkedBorderColor : switchColors.uncheckedBorderColor;
            } else {
                applier = applier2;
                j = z ? switchColors.disabledCheckedBorderColor : switchColors.disabledUncheckedBorderColor;
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ImageKt.m178borderxT4_qwU(modifier, f, j, value), j2, value);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            if (gapComposer.inserting) {
                i3 = i2;
            } else {
                i3 = i2;
            }
            Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$13);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier m177backgroundbw27NRU2 = ImageKt.m177backgroundbw27NRU(IndicationKt.indication(BoxScopeInstance.INSTANCE.align(Modifier.Companion.$$INSTANCE, Alignment.Companion.CenterStart).then(new ThumbElement(mutableInteractionSourceImpl, z, MenuKt.value(MotionSchemeKeyTokens.FastSpatial, gapComposer))), mutableInteractionSourceImpl, RippleKt.m548rippleH2RKhps$default(4, SwitchTokens.StateLayerSize / 2.0f, false)), j3, shape);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int currentCompositeKeyHash2 = Updater.getCurrentCompositeKeyHash(gapComposer);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash2, gapComposer, currentCompositeKeyHash2, composeUiNode$Companion$SetModifier$13);
            }
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            if (function2 != null) {
                gapComposer.startReplaceGroup(1235836927);
                Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(z2 ? z ? switchColors.checkedIconColor : switchColors.uncheckedIconColor : z ? switchColors.disabledCheckedIconColor : switchColors.disabledUncheckedIconColor, ContentColorKt.LocalContentColor), function2, gapComposer, ((i3 >> 9) & 112) | 8);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1236071411);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SwitchKt$$ExternalSyntheticLambda1(modifier, z, z2, switchColors, function2, mutableInteractionSourceImpl, shape, i);
        }
    }
}
