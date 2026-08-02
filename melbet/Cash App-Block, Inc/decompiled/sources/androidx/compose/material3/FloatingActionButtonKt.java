package androidx.compose.material3;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.Icons$Filled;
import androidx.compose.material3.tokens.ExtendedFabLargeTokens;
import androidx.compose.material3.tokens.ExtendedFabPrimaryTokens;
import androidx.compose.material3.tokens.ExtendedFabSmallTokens;
import androidx.compose.material3.tokens.FabBaselineTokens;
import androidx.compose.material3.tokens.FabPrimaryContainerTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.paging.PageFetcher$flow$1;
import app.cash.molecule.PlatformKt;
import com.plaid.internal.EnumC0170g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class FloatingActionButtonKt {
    public static final float ExtendedFabMinimumWidth;
    public static final float ExtendedFabTextPadding;

    static {
        int i = ExtendedFabSmallTokens.$r8$clinit;
        TypographyKeyTokens typographyKeyTokens = TypographyKeyTokens.BodyLarge;
        int i2 = ExtendedFabLargeTokens.$r8$clinit;
        ExtendedFabTextPadding = 20.0f;
        ExtendedFabMinimumWidth = 80.0f;
    }

    /* renamed from: ExtendedFloatingActionButton-X-z6DiA, reason: not valid java name */
    public static final void m530ExtendedFloatingActionButtonXz6DiA(Function0 function0, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, Composer composer, int i) {
        Modifier modifier2;
        Shape shape2;
        long j3;
        long j4;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        Shape value;
        long value2;
        long m519contentColorForek8zF_U;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        int i2;
        Modifier modifier3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1039585610);
        int i3 = i | (gapComposer.changedInstance(function0) ? 4 : 2) | 1647792;
        if (gapComposer.shouldExecute(i3 & 1, (4793491 & i3) != 4793490)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                value = ShapesKt.getValue(ExtendedFabPrimaryTokens.ContainerShape, gapComposer);
                value2 = ColorSchemeKt.getValue(FabPrimaryContainerTokens.ContainerColor, gapComposer);
                m519contentColorForek8zF_U = ColorSchemeKt.m519contentColorForek8zF_U(value2, gapComposer);
                floatingActionButtonElevation3 = new FloatingActionButtonElevation(FabPrimaryContainerTokens.ContainerElevation, FabPrimaryContainerTokens.PressedContainerElevation, FabPrimaryContainerTokens.FocusedContainerElevation, FabPrimaryContainerTokens.HoveredContainerElevation);
                i2 = i3 & (-524161);
                modifier3 = Modifier.Companion.$$INSTANCE;
            } else {
                gapComposer.skipToGroupEnd();
                i2 = i3 & (-524161);
                modifier3 = modifier;
                value = shape;
                value2 = j;
                m519contentColorForek8zF_U = j2;
                floatingActionButtonElevation3 = floatingActionButtonElevation;
            }
            gapComposer.endDefaults();
            Modifier modifier4 = modifier3;
            long j5 = value2;
            long j6 = m519contentColorForek8zF_U;
            FloatingActionButtonElevation floatingActionButtonElevation4 = floatingActionButtonElevation3;
            m531FloatingActionButtonXz6DiA(function0, modifier4, value, j5, j6, floatingActionButtonElevation4, Expect_jvmKt.rememberComposableLambda(-1233936436, new ComposableSingletons$ScaffoldKt$lambda$39202156$1(4), gapComposer), gapComposer, (i2 & 14) | 14155824);
            modifier2 = modifier4;
            shape2 = value;
            j3 = j5;
            j4 = j6;
            floatingActionButtonElevation2 = floatingActionButtonElevation4;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            shape2 = shape;
            j3 = j;
            j4 = j2;
            floatingActionButtonElevation2 = floatingActionButtonElevation;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FloatingActionButtonKt$$ExternalSyntheticLambda0(function0, modifier2, shape2, j3, j4, floatingActionButtonElevation2, i);
        }
    }

    /* renamed from: FloatingActionButton-X-z6DiA, reason: not valid java name */
    public static final void m531FloatingActionButtonXz6DiA(Function0 function0, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(748201188);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(shape) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(j2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changed(floatingActionButtonElevation) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer2.changed((Object) null) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer2.changedInstance(composableLambdaImpl) ? 8388608 : 4194304;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (4793491 & i2) != 4793490)) {
            gapComposer2.startDefaults();
            if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
            }
            gapComposer2.endDefaults();
            int i3 = i2 << 9;
            gapComposer = gapComposer2;
            m532FloatingActionButtonlFWlFE(function0, TypographyKt.getValue(ExtendedFabPrimaryTokens.LabelTextFont, gapComposer2), FabBaselineTokens.ContainerWidth, modifier, shape, j, j2, floatingActionButtonElevation, composableLambdaImpl, gapComposer, (i2 & 14) | 3456 | (i3 & 57344) | (i3 & 458752) | (i3 & 3670016) | (i3 & 29360128) | (i3 & 234881024) | (i3 & 1879048192), (i2 >> 21) & 14);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FloatingActionButtonKt$$ExternalSyntheticLambda1(function0, modifier, shape, j, j2, floatingActionButtonElevation, composableLambdaImpl, i);
        }
    }

    /* renamed from: FloatingActionButton-lF-WlFE, reason: not valid java name */
    public static final void m532FloatingActionButtonlFWlFE(final Function0 function0, final TextStyle textStyle, final float f, final Modifier modifier, final Shape shape, final long j, final long j2, final FloatingActionButtonElevation floatingActionButtonElevation, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i, final int i2) {
        int i3;
        Shape shape2;
        ComposableLambdaImpl composableLambdaImpl2;
        int i4;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(121669932);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(textStyle) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer2.changed(56.0f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= gapComposer2.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            shape2 = shape;
            i3 |= gapComposer2.changed(shape2) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            shape2 = shape;
        }
        if ((1572864 & i) == 0) {
            i3 |= gapComposer2.changed(j) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i3 |= gapComposer2.changed(j2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= gapComposer2.changed(floatingActionButtonElevation) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= gapComposer2.changed((Object) null) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i2 & 6) == 0) {
            composableLambdaImpl2 = composableLambdaImpl;
            i4 = i2 | (gapComposer2.changedInstance(composableLambdaImpl2) ? 4 : 2);
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
            i4 = i2;
        }
        int i5 = i3;
        if (gapComposer2.shouldExecute(i5 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            gapComposer2.startDefaults();
            if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
            }
            gapComposer2.endDefaults();
            gapComposer2.startReplaceGroup(-282833393);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
            gapComposer2.end(false);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new androidx.compose.material.ButtonKt$$ExternalSyntheticLambda2(25);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Modifier semantics = SemanticsModifierKt.semantics(modifier, false, (Function1) rememberedValue2);
            float f2 = floatingActionButtonElevation.defaultElevation;
            int i6 = i5 >> 21;
            int i7 = i6 & 112;
            boolean changed = gapComposer2.changed(mutableInteractionSourceImpl);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new FloatingActionButtonElevationAnimatable(floatingActionButtonElevation.defaultElevation, floatingActionButtonElevation.pressedElevation, floatingActionButtonElevation.hoveredElevation, floatingActionButtonElevation.focusedElevation);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = (FloatingActionButtonElevationAnimatable) rememberedValue3;
            boolean changedInstance = gapComposer2.changedInstance(floatingActionButtonElevationAnimatable) | (((i7 ^ 48) > 32 && gapComposer2.changed(floatingActionButtonElevation)) || (i6 & 48) == 32);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new PageFetcher$flow$1(floatingActionButtonElevationAnimatable, floatingActionButtonElevation, null, 5);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            Updater.LaunchedEffect(gapComposer2, floatingActionButtonElevation, (Function2) rememberedValue4);
            boolean changed2 = gapComposer2.changed(mutableInteractionSourceImpl) | gapComposer2.changedInstance(floatingActionButtonElevationAnimatable);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new SliderState$drag$2(mutableInteractionSourceImpl, floatingActionButtonElevationAnimatable, (Continuation) null, 1);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            Updater.LaunchedEffect(gapComposer2, mutableInteractionSourceImpl, (Function2) rememberedValue5);
            final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
            int i8 = i5 >> 6;
            gapComposer = gapComposer2;
            SurfaceKt.m556Surfaceo_FOJdg(function0, semantics, false, shape2, j, j2, f2, ((Dp) floatingActionButtonElevationAnimatable.animatable.internalState.value$delegate.getValue()).value, null, mutableInteractionSourceImpl, Expect_jvmKt.rememberComposableLambda(-1779603465, new Function2() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int intValue = ((Number) obj2).intValue();
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                        final float f3 = f;
                        final ComposableLambdaImpl composableLambdaImpl4 = composableLambdaImpl3;
                        Icons$Filled.m567ProvideContentColorTextStyle3JVO9M(j2, textStyle, Expect_jvmKt.rememberComposableLambda(-1767363041, new Function2() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$3.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                int intValue2 = ((Number) obj4).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    Modifier m275defaultMinSizeVpY3zN4 = SizeKt.m275defaultMinSizeVpY3zN4(Modifier.Companion.$$INSTANCE, f3, 56.0f);
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                                    int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer4);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, m275defaultMinSizeVpY3zN4);
                                    ComposeUiNode.Companion.getClass();
                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                    if (gapComposer4.applier == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    gapComposer4.startReusableNode();
                                    if (gapComposer4.inserting) {
                                        gapComposer4.createNode(layoutNode$Companion$Constructor$1);
                                    } else {
                                        gapComposer4.useNode();
                                    }
                                    Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
                                    if (gapComposer4.inserting || !Intrinsics.areEqual(gapComposer4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer4, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
                                    }
                                    Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                    Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl4, gapComposer4, true);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer3), gapComposer3, MLKEMEngine.KyberPolyBytes);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), gapComposer, (i5 & 14) | (i8 & 7168) | (57344 & i8) | (i8 & 458752), EnumC0170g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: androidx.compose.material3.FloatingActionButtonKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                    int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                    FloatingActionButtonKt.m532FloatingActionButtonlFWlFE(Function0.this, textStyle, f, modifier, shape, j, j2, floatingActionButtonElevation, composableLambdaImpl, (Composer) obj, updateChangedFlags, updateChangedFlags2);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
