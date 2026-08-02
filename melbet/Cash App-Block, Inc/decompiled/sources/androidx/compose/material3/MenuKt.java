package androidx.compose.material3;

import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverterImpl;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.AnchoredDraggableDefaults;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.interaction.FocusInteraction$Focus;
import androidx.compose.foundation.interaction.HoverInteraction$Enter;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.UnionInsets;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.DefaultButtonElevation$elevation$2$1;
import androidx.compose.material.DrawerKt$$ExternalSyntheticLambda1;
import androidx.compose.material.ModalBottomSheetState$$ExternalSyntheticLambda1;
import androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda5;
import androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda8;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.material3.ButtonKt$Button$2;
import androidx.compose.material3.internal.ChildSemanticsNodeElement;
import androidx.compose.material3.internal.Icons$Filled;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.material3.internal.TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0;
import androidx.compose.material3.tokens.ButtonSmallTokens;
import androidx.compose.material3.tokens.ElevatedButtonTokens;
import androidx.compose.material3.tokens.FilledButtonTokens;
import androidx.compose.material3.tokens.FilledTonalButtonTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.OutlinedButtonTokens;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.material3.tokens.SmallIconButtonTokens;
import androidx.compose.material3.tokens.StandardIconButtonTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.input.VisualTransformation$Companion$$ExternalSyntheticLambda0;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.os.BundleKt;
import androidx.navigation.Navigation$$ExternalSyntheticLambda1;
import androidx.navigation.Navigator$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.badging.backend.RealBadger2$clear$2;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda3;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda3;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.InteractionResult;

/* loaded from: classes3.dex */
public abstract class MenuKt {
    public static final RippleAlpha RippleAlpha = new RippleAlpha(0.16f, 0.1f, 0.08f, 0.1f);

    /* JADX WARN: Removed duplicated region for block: B:161:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Button(Function0 function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, BorderStroke borderStroke, PaddingValues paddingValues, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        Shape shape2;
        ButtonElevation buttonElevation2;
        int i4;
        BorderStroke borderStroke2;
        int i5;
        int i6;
        GapComposer gapComposer;
        boolean z3;
        Shape shape3;
        BorderStroke borderStroke3;
        PaddingValues paddingValues2;
        RecomposeScopeImpl endRestartGroup;
        PaddingValues paddingValues3;
        BorderStroke borderStroke4;
        boolean z4;
        int i7;
        Shape shape4;
        int i8;
        long j;
        long j2;
        long j3;
        MutableInteractionSourceImpl mutableInteractionSourceImpl;
        AnimationState animationState;
        int i9;
        int i10;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1310015664);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(modifier) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            z2 = z;
            i3 |= gapComposer2.changed(z2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    shape2 = shape;
                    if (gapComposer2.changed(shape2)) {
                        i10 = 2048;
                        i3 |= i10;
                    }
                } else {
                    shape2 = shape;
                }
                i10 = 1024;
                i3 |= i10;
            } else {
                shape2 = shape;
            }
            if ((i & 24576) == 0) {
                i3 |= gapComposer2.changed(buttonColors) ? 16384 : PKIFailureInfo.certRevoked;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    buttonElevation2 = buttonElevation;
                    if (gapComposer2.changed(buttonElevation2)) {
                        i9 = PKIFailureInfo.unsupportedVersion;
                        i3 |= i9;
                    }
                } else {
                    buttonElevation2 = buttonElevation;
                }
                i9 = 65536;
                i3 |= i9;
            } else {
                buttonElevation2 = buttonElevation;
            }
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                borderStroke2 = borderStroke;
                i3 |= gapComposer2.changed(borderStroke2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i3 |= gapComposer2.changed(paddingValues) ? 8388608 : 4194304;
                }
                int i12 = i3;
                if ((i2 & 256) != 0) {
                    i6 = i12 | 100663296;
                } else if ((i & 100663296) == 0) {
                    i6 = i12 | (gapComposer2.changed((Object) null) ? 67108864 : 33554432);
                } else {
                    i6 = i12;
                }
                if ((i & 805306368) == 0) {
                    i6 |= gapComposer2.changedInstance(composableLambdaImpl) ? PKIFailureInfo.duplicateCertReq : 268435456;
                }
                boolean z5 = true;
                if (gapComposer2.shouldExecute(i6 & 1, (i6 & 306783379) != 306783378)) {
                    gapComposer2.startDefaults();
                    if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                        if (i11 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 8) != 0) {
                            PaddingValuesImpl paddingValuesImpl = ButtonDefaults.ContentPadding;
                            i6 &= -7169;
                            shape2 = ShapesKt.getValue(ButtonSmallTokens.ContainerShapeRound, gapComposer2);
                        }
                        if ((i2 & 32) != 0) {
                            PaddingValuesImpl paddingValuesImpl2 = ButtonDefaults.ContentPadding;
                            buttonElevation2 = new ButtonElevation(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, FilledButtonTokens.HoveredContainerElevation);
                            i6 &= -458753;
                        }
                        if (i4 != 0) {
                            borderStroke2 = null;
                        }
                        PaddingValues paddingValues4 = i5 != 0 ? ButtonDefaults.ContentPadding : paddingValues;
                        int i13 = i6;
                        paddingValues3 = paddingValues4;
                        borderStroke4 = borderStroke2;
                        z4 = z2;
                        i7 = i13;
                        shape4 = shape2;
                    } else {
                        gapComposer2.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i6 &= -7169;
                        }
                        if ((i2 & 32) != 0) {
                            i6 &= -458753;
                        }
                        shape4 = shape2;
                        borderStroke4 = borderStroke2;
                        z4 = z2;
                        i7 = i6;
                        paddingValues3 = paddingValues;
                    }
                    gapComposer2.endDefaults();
                    gapComposer2.startReplaceGroup(1691738187);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
                    }
                    MutableInteractionSourceImpl mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) rememberedValue;
                    gapComposer2.end(false);
                    if (z4) {
                        i8 = i7;
                        j = buttonColors.containerColor;
                    } else {
                        i8 = i7;
                        j = buttonColors.disabledContainerColor;
                    }
                    PaddingValues paddingValues5 = paddingValues3;
                    long j4 = z4 ? buttonColors.contentColor : buttonColors.disabledContentColor;
                    BorderStroke borderStroke5 = borderStroke4;
                    if (buttonElevation2 == null) {
                        gapComposer2.startReplaceGroup(1691921830);
                        gapComposer2.end(false);
                        j2 = j4;
                        j3 = j;
                        mutableInteractionSourceImpl = mutableInteractionSourceImpl2;
                        animationState = null;
                    } else {
                        gapComposer2.startReplaceGroup(-499611205);
                        int i14 = ((i8 >> 6) & 14) | ((i8 >> 9) & 896);
                        j2 = j4;
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = new SnapshotStateList();
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue2;
                        boolean changed = gapComposer2.changed(mutableInteractionSourceImpl2);
                        Object rememberedValue3 = gapComposer2.rememberedValue();
                        if (changed || rememberedValue3 == neverEqualPolicy) {
                            j3 = j;
                            rememberedValue3 = new SliderDefaults$Thumb$1$1(mutableInteractionSourceImpl2, snapshotStateList, null, 3);
                            gapComposer2.updateRememberedValue(rememberedValue3);
                        } else {
                            j3 = j;
                        }
                        Updater.LaunchedEffect(gapComposer2, mutableInteractionSourceImpl2, (Function2) rememberedValue3);
                        Interaction interaction = (Interaction) CollectionsKt.lastOrNull((List) snapshotStateList);
                        float f = !z4 ? RecyclerView.DECELERATION_RATE : interaction instanceof PressInteraction.Press ? buttonElevation2.pressedElevation : interaction instanceof HoverInteraction$Enter ? buttonElevation2.hoveredElevation : interaction instanceof FocusInteraction$Focus ? buttonElevation2.focusedElevation : buttonElevation2.defaultElevation;
                        Object rememberedValue4 = gapComposer2.rememberedValue();
                        if (rememberedValue4 == neverEqualPolicy) {
                            mutableInteractionSourceImpl = mutableInteractionSourceImpl2;
                            rememberedValue4 = new Animatable(new Dp(f), AnimatableKt.DpToVector, (Object) null, 12);
                            gapComposer2.updateRememberedValue(rememberedValue4);
                        } else {
                            mutableInteractionSourceImpl = mutableInteractionSourceImpl2;
                        }
                        Animatable animatable = (Animatable) rememberedValue4;
                        Dp dp = new Dp(f);
                        boolean changedInstance = gapComposer2.changedInstance(animatable) | gapComposer2.changed(f) | ((((i14 & 14) ^ 6) > 4 && gapComposer2.changed(z4)) || (i14 & 6) == 4);
                        if ((((i14 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 || !gapComposer2.changed(buttonElevation2)) && (i14 & MLKEMEngine.KyberPolyBytes) != 256) {
                            z5 = false;
                        }
                        boolean changedInstance2 = changedInstance | z5 | gapComposer2.changedInstance(interaction);
                        Object rememberedValue5 = gapComposer2.rememberedValue();
                        if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
                            rememberedValue5 = new DefaultButtonElevation$elevation$2$1(animatable, f, z4, buttonElevation2, interaction, null, 1);
                            gapComposer2.updateRememberedValue(rememberedValue5);
                        }
                        Updater.LaunchedEffect(gapComposer2, dp, (Function2) rememberedValue5);
                        animationState = animatable.internalState;
                        gapComposer2.end(false);
                    }
                    float f2 = animationState != null ? ((Dp) animationState.value$delegate.getValue()).value : RecyclerView.DECELERATION_RATE;
                    Object rememberedValue6 = gapComposer2.rememberedValue();
                    if (rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new androidx.compose.material.ButtonKt$$ExternalSyntheticLambda2(17);
                        gapComposer2.updateRememberedValue(rememberedValue6);
                    }
                    long j5 = j2;
                    int i15 = i8;
                    gapComposer = gapComposer2;
                    SurfaceKt.m556Surfaceo_FOJdg(function0, SemanticsModifierKt.semantics(modifier, false, (Function1) rememberedValue6), z4, shape4, j3, j5, RecyclerView.DECELERATION_RATE, f2, borderStroke5, mutableInteractionSourceImpl, Expect_jvmKt.rememberComposableLambda(-535639973, new ButtonKt$Button$2(j5, paddingValues5, composableLambdaImpl, 0), gapComposer2), gapComposer, (i15 & 8078) | ((i15 << 6) & 234881024), 64);
                    paddingValues2 = paddingValues5;
                    z3 = z4;
                    shape3 = shape4;
                    borderStroke3 = borderStroke5;
                } else {
                    gapComposer = gapComposer2;
                    gapComposer.skipToGroupEnd();
                    z3 = z2;
                    shape3 = shape2;
                    borderStroke3 = borderStroke2;
                    paddingValues2 = paddingValues;
                }
                ButtonElevation buttonElevation3 = buttonElevation2;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new ButtonKt$$ExternalSyntheticLambda2(function0, modifier, z3, shape3, buttonColors, buttonElevation3, borderStroke3, paddingValues2, composableLambdaImpl, i, i2);
                    return;
                }
                return;
            }
            borderStroke2 = borderStroke;
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            int i122 = i3;
            if ((i2 & 256) != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            boolean z52 = true;
            if (gapComposer2.shouldExecute(i6 & 1, (i6 & 306783379) != 306783378)) {
            }
            ButtonElevation buttonElevation32 = buttonElevation2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z2 = z;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) != 0) {
        }
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        borderStroke2 = borderStroke;
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        int i1222 = i3;
        if ((i2 & 256) != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        boolean z522 = true;
        if (gapComposer2.shouldExecute(i6 & 1, (i6 & 306783379) != 306783378)) {
        }
        ButtonElevation buttonElevation322 = buttonElevation2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: DropdownMenuContent-Qj0Zi0g, reason: not valid java name */
    public static final void m535DropdownMenuContentQj0Zi0g(final Modifier modifier, final MutableTransitionState mutableTransitionState, final MutableState mutableState, final ScrollState scrollState, final Shape shape, final long j, final float f, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(848986741);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changed(mutableTransitionState) ? 32 : 16) | (gapComposer.changed(scrollState) ? 2048 : 1024) | (gapComposer.changed(shape) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(j) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changed(RecyclerView.DECELERATION_RATE) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer.changed(f) ? 8388608 : 4194304) | (gapComposer.changed((Object) null) ? 67108864 : 33554432) | (gapComposer.changedInstance(composableLambdaImpl) ? PKIFailureInfo.duplicateCertReq : 268435456);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 306783379) != 306783378)) {
            Transition updateTransition = AnimatableKt.updateTransition(mutableTransitionState, "DropDownMenu", gapComposer, ((i2 >> 3) & 14) | 48);
            SpringSpec value = value(MotionSchemeKeyTokens.FastSpatial, gapComposer);
            SpringSpec value2 = value(MotionSchemeKeyTokens.FastEffects, gapComposer);
            TwoWayConverterImpl twoWayConverterImpl = AnimatableKt.FloatToVector;
            InteractionResult interactionResult = updateTransition.transitionState;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = updateTransition.targetState$delegate;
            boolean booleanValue = ((Boolean) interactionResult.getCurrentState()).booleanValue();
            gapComposer.startReplaceGroup(143964305);
            float f2 = booleanValue ? 1.0f : 0.8f;
            gapComposer.end(false);
            Float valueOf = Float.valueOf(f2);
            boolean booleanValue2 = ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue();
            gapComposer.startReplaceGroup(143964305);
            float f3 = booleanValue2 ? 1.0f : 0.8f;
            gapComposer.end(false);
            Float valueOf2 = Float.valueOf(f3);
            updateTransition.getSegment();
            gapComposer.startReplaceGroup(-745957716);
            gapComposer.end(false);
            Transition.TransitionAnimationState createTransitionAnimation = AnimatableKt.createTransitionAnimation(updateTransition, valueOf, valueOf2, value, twoWayConverterImpl, gapComposer, 0);
            boolean booleanValue3 = ((Boolean) updateTransition.transitionState.getCurrentState()).booleanValue();
            gapComposer.startReplaceGroup(892761509);
            float f4 = booleanValue3 ? 1.0f : RecyclerView.DECELERATION_RATE;
            gapComposer.end(false);
            Float valueOf3 = Float.valueOf(f4);
            boolean booleanValue4 = ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue();
            gapComposer.startReplaceGroup(892761509);
            float f5 = booleanValue4 ? 1.0f : RecyclerView.DECELERATION_RATE;
            gapComposer.end(false);
            Float valueOf4 = Float.valueOf(f5);
            updateTransition.getSegment();
            gapComposer.startReplaceGroup(2839488);
            gapComposer.end(false);
            Transition.TransitionAnimationState createTransitionAnimation2 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf3, valueOf4, value2, twoWayConverterImpl, gapComposer, 0);
            boolean booleanValue5 = ((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
            boolean changed = gapComposer.changed(booleanValue5) | gapComposer.changed(createTransitionAnimation) | ((i2 & 112) == 32) | gapComposer.changed(createTransitionAnimation2);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                MenuKt$$ExternalSyntheticLambda0 menuKt$$ExternalSyntheticLambda0 = new MenuKt$$ExternalSyntheticLambda0(booleanValue5, mutableTransitionState, mutableState, createTransitionAnimation, createTransitionAnimation2);
                gapComposer.updateRememberedValue(menuKt$$ExternalSyntheticLambda0);
                rememberedValue = menuKt$$ExternalSyntheticLambda0;
            }
            int i3 = i2 >> 9;
            int i4 = i2 >> 6;
            SurfaceKt.m554SurfaceT9BRK9s(ColorKt.graphicsLayer(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue), shape, j, 0L, f, Expect_jvmKt.rememberComposableLambda(-1463404422, new TooltipKt$TooltipBox$3(modifier, scrollState, composableLambdaImpl, 3), gapComposer), gapComposer, (i3 & 896) | (i3 & 112) | 12582912 | (57344 & i4) | (458752 & i4) | (i4 & 3670016), 8);
            gapComposer = gapComposer;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(mutableTransitionState, mutableState, scrollState, shape, j, f, composableLambdaImpl, i) { // from class: androidx.compose.material3.MenuKt$$ExternalSyntheticLambda1
                public final /* synthetic */ MutableTransitionState f$1;
                public final /* synthetic */ MutableState f$2;
                public final /* synthetic */ ScrollState f$3;
                public final /* synthetic */ Shape f$4;
                public final /* synthetic */ long f$5;
                public final /* synthetic */ float f$7;
                public final /* synthetic */ ComposableLambdaImpl f$9;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(385);
                    MenuKt.m535DropdownMenuContentQj0Zi0g(Modifier.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$7, this.f$9, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void DropdownMenuItemContent(ComposableLambdaImpl composableLambdaImpl, Function0 function0, Modifier modifier, Function2 function2, Function2 function22, boolean z, MenuItemColors menuItemColors, PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        Function0 function02;
        Function2 function23;
        MenuItemColors menuItemColors2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1325192924);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function02 = function0;
            i2 |= gapComposer.changedInstance(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function23 = function2;
            i2 |= gapComposer.changedInstance(function23) ? 2048 : 1024;
        } else {
            function23 = function2;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(function22) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changed(z) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            menuItemColors2 = menuItemColors;
            i2 |= gapComposer.changed(menuItemColors2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        } else {
            menuItemColors2 = menuItemColors;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer.changed(paddingValues) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= gapComposer.changed((Object) null) ? 67108864 : 33554432;
        }
        if (gapComposer.shouldExecute(i2 & 1, (38347923 & i2) != 38347922)) {
            Modifier padding = SpacerKt.padding(SizeKt.m289sizeInqDBjuR0$default(SizeKt.fillMaxWidth(ImageKt.m182clickableO2vRcR0$default(modifier, null, RippleKt.m548rippleH2RKhps$default(6, RecyclerView.DECELERATION_RATE, true), z, null, null, function02, 24), 1.0f), 112.0f, 48.0f, 280.0f, RecyclerView.DECELERATION_RATE, 8), paddingValues);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, padding);
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
            if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
            }
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            TextKt.ProvideTextStyle(((Typography) gapComposer.consume(TypographyKt.LocalTypography)).labelLarge, Expect_jvmKt.rememberComposableLambda(865999929, new MenuKt$DropdownMenuItemContent$1$1(function23, menuItemColors2, z, function22, composableLambdaImpl), gapComposer), gapComposer, 48);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SheetKt$$ExternalSyntheticLambda3(composableLambdaImpl, function0, modifier, function2, function22, z, menuItemColors, paddingValues, i);
        }
    }

    public static final void ElevatedButton(Function0 function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, PaddingValues paddingValues, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        boolean z2;
        Shape shape2;
        ButtonElevation buttonElevation2;
        PaddingValues paddingValues2;
        int i3;
        PaddingValues paddingValues3;
        boolean z3;
        ButtonElevation buttonElevation3;
        Shape shape3;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1943994298);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 32 : 16;
        }
        int i4 = i2 | MLKEMEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
            i4 = i2 | 1408;
        }
        if ((i & 24576) == 0) {
            i4 |= gapComposer2.changed(buttonColors) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        int i5 = 114819072 | i4;
        if ((805306368 & i) == 0) {
            i5 |= gapComposer2.changedInstance(composableLambdaImpl) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if (gapComposer2.shouldExecute(i5 & 1, (306783379 & i5) != 306783378)) {
            gapComposer2.startDefaults();
            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                PaddingValuesImpl paddingValuesImpl = ButtonDefaults.ContentPadding;
                Shape value = ShapesKt.getValue(ButtonSmallTokens.ContainerShapeRound, gapComposer2);
                ButtonElevation buttonElevation4 = new ButtonElevation(ElevatedButtonTokens.ContainerElevation, ElevatedButtonTokens.PressedContainerElevation, ElevatedButtonTokens.FocusedContainerElevation, ElevatedButtonTokens.HoveredContainerElevation);
                i3 = i5 & (-465921);
                paddingValues3 = ButtonDefaults.ContentPadding;
                z3 = true;
                buttonElevation3 = buttonElevation4;
                shape3 = value;
            } else {
                gapComposer2.skipToGroupEnd();
                i3 = i5 & (-465921);
                z3 = z;
                shape3 = shape;
                buttonElevation3 = buttonElevation;
                paddingValues3 = paddingValues;
            }
            gapComposer2.endDefaults();
            gapComposer = gapComposer2;
            Button(function0, modifier, z3, shape3, buttonColors, buttonElevation3, null, paddingValues3, composableLambdaImpl, gapComposer, i3 & 2147483646, 0);
            z2 = z3;
            shape2 = shape3;
            buttonElevation2 = buttonElevation3;
            paddingValues2 = paddingValues3;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            z2 = z;
            shape2 = shape;
            buttonElevation2 = buttonElevation;
            paddingValues2 = paddingValues;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ButtonKt$$ExternalSyntheticLambda3(function0, modifier, z2, shape2, buttonColors, buttonElevation2, paddingValues2, composableLambdaImpl, i, 0);
        }
    }

    public static final void FilledTonalButton(Function0 function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, ButtonElevation buttonElevation, PaddingValues paddingValues, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        boolean z2;
        Shape shape2;
        ButtonElevation buttonElevation2;
        PaddingValues paddingValues2;
        int i3;
        Shape shape3;
        PaddingValues paddingValues3;
        boolean z3;
        ButtonElevation buttonElevation3;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-102343472);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 32 : 16;
        }
        int i4 = i2 | MLKEMEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
            i4 = i2 | 1408;
        }
        if ((i & 24576) == 0) {
            i4 |= gapComposer2.changed(buttonColors) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        int i5 = 114819072 | i4;
        if ((805306368 & i) == 0) {
            i5 |= gapComposer2.changedInstance(composableLambdaImpl) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if (gapComposer2.shouldExecute(i5 & 1, (306783379 & i5) != 306783378)) {
            gapComposer2.startDefaults();
            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                PaddingValuesImpl paddingValuesImpl = ButtonDefaults.ContentPadding;
                Shape value = ShapesKt.getValue(ButtonSmallTokens.ContainerShapeRound, gapComposer2);
                ButtonElevation buttonElevation4 = new ButtonElevation(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, FilledTonalButtonTokens.HoverContainerElevation);
                i3 = i5 & (-465921);
                shape3 = value;
                paddingValues3 = ButtonDefaults.ContentPadding;
                z3 = true;
                buttonElevation3 = buttonElevation4;
            } else {
                gapComposer2.skipToGroupEnd();
                i3 = i5 & (-465921);
                z3 = z;
                shape3 = shape;
                buttonElevation3 = buttonElevation;
                paddingValues3 = paddingValues;
            }
            gapComposer2.endDefaults();
            gapComposer = gapComposer2;
            Button(function0, modifier, z3, shape3, buttonColors, buttonElevation3, null, paddingValues3, composableLambdaImpl, gapComposer, i3 & 2147483646, 0);
            z2 = z3;
            shape2 = shape3;
            buttonElevation2 = buttonElevation3;
            paddingValues2 = paddingValues3;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            z2 = z;
            shape2 = shape;
            buttonElevation2 = buttonElevation;
            paddingValues2 = paddingValues;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ButtonKt$$ExternalSyntheticLambda3(function0, modifier, z2, shape2, buttonColors, buttonElevation2, paddingValues2, composableLambdaImpl, i, 1);
        }
    }

    /* renamed from: HorizontalDivider-9IZ8Weo, reason: not valid java name */
    public static final void m536HorizontalDivider9IZ8Weo(float f, int i, long j, Composer composer, Modifier modifier) {
        Modifier modifier2;
        Modifier modifier3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(75144485);
        int i2 = i | 54 | (gapComposer.changed(j) ? 256 : 128);
        int i3 = 0;
        boolean z = true;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                f = DividerDefaults.Thickness;
                modifier3 = Modifier.Companion.$$INSTANCE;
            } else {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier;
            }
            gapComposer.endDefaults();
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(modifier3, 1.0f), f);
            if ((((i2 & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 || !gapComposer.changed(j)) && (i2 & MLKEMEngine.KyberPolyBytes) != 256) {
                z = false;
            }
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new DividerKt$$ExternalSyntheticLambda0(f, j, i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CanvasKt.Canvas(0, gapComposer, m277height3ABfNKs, (Function1) rememberedValue);
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        float f2 = f;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DividerKt$$ExternalSyntheticLambda1(modifier2, f2, j, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IconButton(Function0 function0, Modifier modifier, boolean z, IconButtonColors iconButtonColors, Shape shape, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Shape shape2;
        boolean z3;
        IconButtonColors iconButtonColors2;
        RecomposeScopeImpl endRestartGroup;
        int i6;
        IconButtonColors iconButtonColors3;
        Shape value;
        boolean z4;
        IconButtonColors iconButtonColors4;
        Modifier modifier3;
        int i7;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1413012038);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                z2 = z;
                i3 |= gapComposer.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    i3 |= 1024;
                }
                i5 = i3 | 24576;
                if ((196608 & i) == 0) {
                    i5 = 90112 | i3;
                }
                if ((1572864 & i) == 0) {
                    i5 |= gapComposer.changedInstance(composableLambdaImpl) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
                if (gapComposer.shouldExecute(i5 & 1, (599187 & i5) != 599186)) {
                    gapComposer.startDefaults();
                    if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                        Modifier modifier4 = i8 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                        boolean z5 = i4 == 0 ? z2 : true;
                        long j = ((Color) gapComposer.consume(ContentColorKt.LocalContentColor)).value;
                        ColorScheme colorScheme = (ColorScheme) gapComposer.consume(ColorSchemeKt.LocalColorScheme);
                        IconButtonColors iconButtonColors5 = colorScheme.defaultIconButtonColorsCached;
                        if (iconButtonColors5 == null) {
                            long j2 = Color.Transparent;
                            IconButtonColors iconButtonColors6 = new IconButtonColors(j2, j, j2, Color.m675copywmQWz5c$default(StandardIconButtonTokens.DisabledOpacity, j, 14));
                            colorScheme.defaultIconButtonColorsCached = iconButtonColors6;
                            iconButtonColors5 = iconButtonColors6;
                        }
                        long j3 = iconButtonColors5.contentColor;
                        if (Color.m676equalsimpl0(j3, j)) {
                            iconButtonColors3 = iconButtonColors5;
                            i6 = -465921;
                        } else {
                            long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(StandardIconButtonTokens.DisabledOpacity, j, 14);
                            i6 = -465921;
                            long j4 = iconButtonColors5.containerColor;
                            long j5 = iconButtonColors5.disabledContainerColor;
                            if (j == 16) {
                                j = j3;
                            }
                            iconButtonColors3 = new IconButtonColors(j4, j, j5, m675copywmQWz5c$default != 16 ? m675copywmQWz5c$default : iconButtonColors5.disabledContentColor);
                        }
                        value = ShapesKt.getValue(SmallIconButtonTokens.ContainerShapeRound, gapComposer);
                        z4 = z5;
                        iconButtonColors4 = iconButtonColors3;
                        modifier3 = modifier4;
                        i7 = i5 & i6;
                    } else {
                        gapComposer.skipToGroupEnd();
                        i7 = i5 & (-465921);
                        iconButtonColors4 = iconButtonColors;
                        value = shape;
                        modifier3 = modifier2;
                        z4 = z2;
                    }
                    gapComposer.endDefaults();
                    int i9 = i7 << 3;
                    IconButtonImpl(modifier3, function0, z4, value, iconButtonColors4, composableLambdaImpl, gapComposer, ((i7 >> 3) & 14) | (i9 & 112) | (i7 & 896) | (i9 & 458752) | (i7 & 3670016));
                    modifier2 = modifier3;
                    z3 = z4;
                    shape2 = value;
                    iconButtonColors2 = iconButtonColors4;
                } else {
                    gapComposer.skipToGroupEnd();
                    shape2 = shape;
                    z3 = z2;
                    iconButtonColors2 = iconButtonColors;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(function0, modifier2, z3, iconButtonColors2, shape2, composableLambdaImpl, i, i2, 0);
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            i5 = i3 | 24576;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if (gapComposer.shouldExecute(i5 & 1, (599187 & i5) != 599186)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        i5 = i3 | 24576;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if (gapComposer.shouldExecute(i5 & 1, (599187 & i5) != 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void IconButtonImpl(Modifier modifier, Function0 function0, boolean z, Shape shape, IconButtonColors iconButtonColors, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        Modifier then;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1134296466);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(shape) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(iconButtonColors) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changed((Object) null) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) != 599186)) {
            gapComposer.startReplaceGroup(977045485);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
            gapComposer.end(false);
            HorizontalAlignmentLine horizontalAlignmentLine = InteractiveComponentSizeKt.MinimumInteractiveTopAlignmentLine;
            Modifier then2 = modifier.then(MinimumInteractiveModifier.INSTANCE);
            float f = SmallIconButtonTokens.DefaultLeadingSpace;
            then = ImageKt.m182clickableO2vRcR0$default(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m286size6HolHcs(BundleKt.m1091DpSizeYgX7TsA(SmallIconButtonTokens.IconSize + f + f, 40.0f), then2), shape), z ? iconButtonColors.containerColor : iconButtonColors.disabledContainerColor, shape), mutableInteractionSourceImpl, RippleKt.m548rippleH2RKhps$default(7, RecyclerView.DECELERATION_RATE, false), z, null, new Role(0), function0, 8).then(new ChildSemanticsNodeElement(new Navigation$$ExternalSyntheticLambda1(3)));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetCompositeKeyHash;
            if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$1);
            }
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(z ? iconButtonColors.contentColor : iconButtonColors.disabledContentColor, ContentColorKt.LocalContentColor), composableLambdaImpl, gapComposer, ((i3 >> 15) & 112) | 8);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda4(modifier, function0, z, shape, iconButtonColors, composableLambdaImpl, i);
        }
    }

    public static final void OutlinedButton(Function0 function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, BorderStroke borderStroke, PaddingValues paddingValues, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        boolean z2;
        Shape shape2;
        BorderStroke borderStroke2;
        PaddingValues paddingValues2;
        int i3;
        Shape shape3;
        PaddingValues paddingValues3;
        BorderStroke borderStroke3;
        boolean z3;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(399974542);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 32 : 16;
        }
        int i4 = i2 | MLKEMEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
            i4 = i2 | 1408;
        }
        if ((i & 24576) == 0) {
            i4 |= gapComposer2.changed(buttonColors) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i5 = 196608 | i4;
        if ((1572864 & i) == 0) {
            i5 = 720896 | i4;
        }
        int i6 = i5 | 113246208;
        if ((805306368 & i) == 0) {
            i6 |= gapComposer2.changedInstance(composableLambdaImpl) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if (gapComposer2.shouldExecute(i6 & 1, (306783379 & i6) != 306783378)) {
            gapComposer2.startDefaults();
            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                PaddingValuesImpl paddingValuesImpl = ButtonDefaults.ContentPadding;
                Shape value = ShapesKt.getValue(ButtonSmallTokens.ContainerShapeRound, gapComposer2);
                float f = ButtonSmallTokens.OutlinedOutlineWidth;
                gapComposer2.startReplaceGroup(-112346942);
                long value2 = ColorSchemeKt.getValue(OutlinedButtonTokens.OutlineColor, gapComposer2);
                gapComposer2.end(false);
                BorderStroke m173BorderStrokecXLIe8U = CanvasKt.m173BorderStrokecXLIe8U(value2, f);
                i3 = i6 & (-3677185);
                shape3 = value;
                paddingValues3 = ButtonDefaults.ContentPadding;
                borderStroke3 = m173BorderStrokecXLIe8U;
                z3 = true;
            } else {
                gapComposer2.skipToGroupEnd();
                i3 = i6 & (-3677185);
                z3 = z;
                shape3 = shape;
                borderStroke3 = borderStroke;
                paddingValues3 = paddingValues;
            }
            gapComposer2.endDefaults();
            gapComposer = gapComposer2;
            Button(function0, modifier, z3, shape3, buttonColors, null, borderStroke3, paddingValues3, composableLambdaImpl, gapComposer, i3 & 2147483646, 0);
            z2 = z3;
            shape2 = shape3;
            borderStroke2 = borderStroke3;
            paddingValues2 = paddingValues3;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            z2 = z;
            shape2 = shape;
            borderStroke2 = borderStroke;
            paddingValues2 = paddingValues;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SheetKt$$ExternalSyntheticLambda3(function0, modifier, z2, shape2, buttonColors, borderStroke2, paddingValues2, composableLambdaImpl, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedTextField(final String str, final Function1 function1, final Modifier modifier, boolean z, boolean z2, final TextStyle textStyle, final Function2 function2, final Function2 function22, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, int i, int i2, Shape shape, TextFieldColors textFieldColors, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        boolean z3;
        final Function2 function23;
        int i6;
        TextFieldColors textFieldColors2;
        final boolean z4;
        final VisualTransformation visualTransformation2;
        final KeyboardOptions keyboardOptions2;
        final KeyboardActions keyboardActions2;
        final int i7;
        final int i8;
        final boolean z5;
        final TextFieldColors textFieldColors3;
        final Shape shape2;
        RecomposeScopeImpl endRestartGroup;
        KeyboardOptions keyboardOptions3;
        final Shape shape3;
        final TextFieldColors textFieldColors4;
        final VisualTransformation visualTransformation3;
        final int i9;
        final int i10;
        final boolean z6;
        final KeyboardActions keyboardActions3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1901501544);
        if ((i3 & 6) == 0) {
            i5 = (gapComposer.changed(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        char c = 128;
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i5 |= gapComposer.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int i11 = i5 | 3072;
        int i12 = i4 & 16;
        if (i12 != 0) {
            i11 = i5 | 27648;
        } else if ((i3 & 24576) == 0) {
            z3 = z2;
            i11 |= gapComposer.changed(z3) ? 16384 : PKIFailureInfo.certRevoked;
            if ((196608 & i3) == 0) {
                i11 |= gapComposer.changed(textStyle) ? PKIFailureInfo.unsupportedVersion : 65536;
            }
            if ((1572864 & i3) != 0) {
                function23 = function2;
                i11 |= gapComposer.changedInstance(function23) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            } else {
                function23 = function2;
            }
            if ((12582912 & i3) == 0) {
                i11 |= gapComposer.changedInstance(function22) ? 8388608 : 4194304;
            }
            i6 = i11 | 905969664;
            if ((i4 & 4194304) != 0) {
                textFieldColors2 = textFieldColors;
                if (gapComposer.changed(textFieldColors2)) {
                    c = 256;
                }
            } else {
                textFieldColors2 = textFieldColors;
            }
            boolean z7 = true;
            if (gapComposer.shouldExecute(i6 & 1, (306783379 & i6) == 306783378 || ((c | 22) & 147) != 146)) {
                gapComposer.skipToGroupEnd();
                z4 = z;
                visualTransformation2 = visualTransformation;
                keyboardOptions2 = keyboardOptions;
                keyboardActions2 = keyboardActions;
                i7 = i;
                i8 = i2;
                z5 = z3;
                textFieldColors3 = textFieldColors2;
                shape2 = shape;
            } else {
                gapComposer.startDefaults();
                if ((i3 & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                    if (i12 != 0) {
                        z3 = false;
                    }
                    keyboardOptions3 = KeyboardOptions.Default;
                    KeyboardActions keyboardActions4 = KeyboardActions.Default;
                    Shape value = ShapesKt.getValue(OutlinedTextFieldTokens.ContainerShape, gapComposer);
                    int i13 = i4 & 4194304;
                    VisualTransformation$Companion$$ExternalSyntheticLambda0 visualTransformation$Companion$$ExternalSyntheticLambda0 = VisualTransformation.Companion.None;
                    if (i13 != 0) {
                        z6 = z3;
                        shape3 = value;
                        textFieldColors4 = OutlinedTextFieldDefaults.colors(gapComposer, 6);
                        visualTransformation3 = visualTransformation$Companion$$ExternalSyntheticLambda0;
                        i9 = 1;
                        i10 = Integer.MAX_VALUE;
                    } else {
                        shape3 = value;
                        textFieldColors4 = textFieldColors2;
                        visualTransformation3 = visualTransformation$Companion$$ExternalSyntheticLambda0;
                        i9 = 1;
                        i10 = Integer.MAX_VALUE;
                        z6 = z3;
                    }
                    keyboardActions3 = keyboardActions4;
                } else {
                    gapComposer.skipToGroupEnd();
                    z7 = z;
                    visualTransformation3 = visualTransformation;
                    keyboardOptions3 = keyboardOptions;
                    keyboardActions3 = keyboardActions;
                    i10 = i;
                    i9 = i2;
                    shape3 = shape;
                    textFieldColors4 = textFieldColors2;
                    z6 = z3;
                }
                gapComposer.endDefaults();
                gapComposer.startReplaceGroup(1310051731);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                }
                final MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                gapComposer.end(false);
                gapComposer.startReplaceGroup(1981927842);
                long m996getColor0d7_KjU = textStyle.m996getColor0d7_KjU();
                if (m996getColor0d7_KjU == 16) {
                    m996getColor0d7_KjU = !z7 ? textFieldColors4.disabledTextColor : ((Boolean) Countries.collectIsFocusedAsState(mutableInteractionSourceImpl, gapComposer, 0).getValue()).booleanValue() ? textFieldColors4.focusedTextColor : textFieldColors4.unfocusedTextColor;
                }
                long j = m996getColor0d7_KjU;
                gapComposer.end(false);
                final TextStyle merge = textStyle.merge(new TextStyle(j, 0L, null, null, 0L, 0L, 0, 0, 0L, null, 16777214));
                final Modifier modifier3 = modifier2;
                final boolean z8 = z7;
                final KeyboardOptions keyboardOptions4 = keyboardOptions3;
                Updater.CompositionLocalProvider(TextSelectionColorsKt.LocalTextSelectionColors.defaultProvidedValue$runtime(textFieldColors4.textSelectionColors), Expect_jvmKt.rememberComposableLambda(1874034984, new Function2() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        int intValue = ((Number) obj2).intValue();
                        GapComposer gapComposer2 = (GapComposer) composer2;
                        if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                            Function2 function24 = function23;
                            Modifier modifier4 = Modifier.Companion.$$INSTANCE;
                            if (function24 != null) {
                                gapComposer2.startReplaceGroup(-903490605);
                                Object rememberedValue2 = gapComposer2.rememberedValue();
                                if (rememberedValue2 == Composer.Companion.Empty) {
                                    rememberedValue2 = new androidx.compose.material.ButtonKt$$ExternalSyntheticLambda2(26);
                                    gapComposer2.updateRememberedValue(rememberedValue2);
                                }
                                modifier4 = SpacerKt.m302paddingqDBjuR0$default(SemanticsModifierKt.semantics(modifier4, true, (Function1) rememberedValue2), RecyclerView.DECELERATION_RATE, Icons$Filled.minimizedLabelHalfHeight(gapComposer2), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                                gapComposer2.end(false);
                            } else {
                                gapComposer2.startReplaceGroup(-903106918);
                                gapComposer2.end(false);
                            }
                            Modifier then = Modifier.this.then(modifier4);
                            Icons$Filled.m568getString2EP1pXo(gapComposer2, R.string.default_error_message);
                            Modifier m275defaultMinSizeVpY3zN4 = SizeKt.m275defaultMinSizeVpY3zN4(then, 280.0f, 56.0f);
                            final TextFieldColors textFieldColors5 = textFieldColors4;
                            SolidColor solidColor = new SolidColor(textFieldColors5.cursorColor);
                            final Function2 function25 = function22;
                            final Shape shape4 = shape3;
                            final String str2 = str;
                            final boolean z9 = z8;
                            final VisualTransformation visualTransformation4 = visualTransformation3;
                            final MutableInteractionSourceImpl mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                            final Function2 function26 = function23;
                            BasicTextFieldKt.BasicTextField(str2, function1, m275defaultMinSizeVpY3zN4, z9, z6, merge, keyboardOptions4, keyboardActions3, false, i10, i9, visualTransformation4, null, mutableInteractionSourceImpl2, solidColor, Expect_jvmKt.rememberComposableLambda(-1189274459, new Function3() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3.2
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    Function2 function27 = (Function2) obj3;
                                    Composer composer3 = (Composer) obj4;
                                    int intValue2 = ((Number) obj5).intValue();
                                    if ((intValue2 & 6) == 0) {
                                        intValue2 |= ((GapComposer) composer3).changedInstance(function27) ? 4 : 2;
                                    }
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                        final Shape shape5 = shape4;
                                        int i14 = intValue2;
                                        final boolean z10 = z9;
                                        final MutableInteractionSourceImpl mutableInteractionSourceImpl3 = mutableInteractionSourceImpl2;
                                        final TextFieldColors textFieldColors6 = textFieldColors5;
                                        OutlinedTextFieldDefaults.INSTANCE.DecorationBox(str2, function27, z10, false, visualTransformation4, mutableInteractionSourceImpl3, false, function26, function25, null, textFieldColors6, null, Expect_jvmKt.rememberComposableLambda(-656940872, new Function2() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.3.2.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj6, Object obj7) {
                                                Composer composer4 = (Composer) obj6;
                                                int intValue3 = ((Number) obj7).intValue();
                                                GapComposer gapComposer4 = (GapComposer) composer4;
                                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                    OutlinedTextFieldDefaults.INSTANCE.m539Container4EFweAY(z10, false, mutableInteractionSourceImpl3, null, textFieldColors6, shape5, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, gapComposer4, 100663296, 200);
                                                } else {
                                                    gapComposer4.skipToGroupEnd();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, gapComposer3), gapComposer3, (i14 << 3) & 112);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer2), gapComposer2, 0, 196608, 4096);
                        } else {
                            gapComposer2.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, 56);
                textFieldColors3 = textFieldColors4;
                z4 = z8;
                z5 = z6;
                keyboardOptions2 = keyboardOptions4;
                keyboardActions2 = keyboardActions3;
                i7 = i10;
                i8 = i9;
                visualTransformation2 = visualTransformation3;
                shape2 = shape3;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new Function2() { // from class: androidx.compose.material3.OutlinedTextFieldKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int updateChangedFlags = Updater.updateChangedFlags(i3 | 1);
                        MenuKt.OutlinedTextField(str, function1, modifier, z4, z5, textStyle, function2, function22, visualTransformation2, keyboardOptions2, keyboardActions2, i7, i8, shape2, textFieldColors3, (Composer) obj, updateChangedFlags, i4);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        z3 = z2;
        if ((196608 & i3) == 0) {
        }
        if ((1572864 & i3) != 0) {
        }
        if ((12582912 & i3) == 0) {
        }
        i6 = i11 | 905969664;
        if ((i4 & 4194304) != 0) {
        }
        boolean z72 = true;
        if (gapComposer.shouldExecute(i6 & 1, (306783379 & i6) == 306783378 || ((c | 22) & 147) != 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x026c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1.rememberedValue(), java.lang.Integer.valueOf(r9)) == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x054b, code lost:
    
        if (r1.changedInstance(r0) != false) goto L282;
     */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedTextFieldLayout(Function2 function2, Function3 function3, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, boolean z, TextFieldLabelPosition$Attached textFieldLabelPosition$Attached, TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0, Function1 function1, ComposableLambdaImpl composableLambdaImpl, Function2 function27, PaddingValues paddingValues, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        Function2 function28;
        Function3 function32;
        GapComposer gapComposer;
        Applier applier;
        NeverEqualPolicy neverEqualPolicy;
        BiasAlignment biasAlignment;
        int i5;
        BiasAlignment biasAlignment2;
        Modifier.Companion companion;
        float f;
        BiasAlignment biasAlignment3;
        LayoutDirection layoutDirection;
        boolean z3;
        float f2;
        BiasAlignment biasAlignment4;
        Modifier wrapContentHeight;
        boolean z4;
        Modifier wrapContentHeight2;
        TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$02;
        boolean z5;
        Object rememberedValue;
        Modifier wrapContentHeight3;
        Modifier wrapContentHeight4;
        Modifier wrapContentHeight5;
        Function2 function29 = function22;
        Function2 function210 = function26;
        PaddingValues paddingValues2 = paddingValues;
        BiasAlignment biasAlignment5 = Alignment.Companion.Center;
        BiasAlignment biasAlignment6 = Alignment.Companion.TopStart;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(753699262);
        Applier applier2 = gapComposer2.applier;
        int i6 = i & 6;
        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
        if (i6 == 0) {
            i3 = i | (gapComposer2.changed(companion2) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(function2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changedInstance(function3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer2.changedInstance(function29) ? 2048 : 1024;
        }
        int i7 = i & 24576;
        int i8 = PKIFailureInfo.certRevoked;
        if (i7 == 0) {
            i3 |= gapComposer2.changedInstance(function23) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= gapComposer2.changedInstance(function24) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= gapComposer2.changedInstance(function25) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i & 12582912) == 0) {
            i3 |= gapComposer2.changedInstance(function210) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            z2 = z;
            i3 |= gapComposer2.changed(z2) ? 67108864 : 33554432;
        } else {
            z2 = z;
        }
        if ((i & 805306368) == 0) {
            i3 |= gapComposer2.changed(textFieldLabelPosition$Attached) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? gapComposer2.changed(textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0) : gapComposer2.changedInstance(textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changedInstance(composableLambdaImpl) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= gapComposer2.changedInstance(function27) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            if (gapComposer2.changed(paddingValues2)) {
                i8 = 16384;
            }
            i4 |= i8;
        }
        int i9 = i4;
        if (gapComposer2.shouldExecute(i3 & 1, ((i3 & 306783379) == 306783378 && (i9 & 9363) == 9362) ? false : true)) {
            float f3 = ((Dp) gapComposer2.consume(InteractiveComponentSizeKt.LocalMinimumInteractiveComponentSize)).value;
            if (Float.isNaN(f3)) {
                f3 = 0.0f;
            }
            float f4 = (f3 - SmallIconButtonTokens.IconSize) / 2.0f;
            if (f4 < RecyclerView.DECELERATION_RATE) {
                f4 = 0.0f;
            }
            int i10 = i9 & 14;
            boolean changed = ((i3 & 234881024) == 67108864) | ((i9 & 112) == 32) | ((i3 & 1879048192) == 536870912) | (i10 == 4 || ((i9 & 8) != 0 && gapComposer2.changed(textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0))) | ((i9 & 57344) == 16384) | gapComposer2.changed(f4);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (changed || rememberedValue2 == neverEqualPolicy2) {
                applier = applier2;
                neverEqualPolicy = neverEqualPolicy2;
                biasAlignment = biasAlignment5;
                i5 = i10;
                biasAlignment2 = biasAlignment6;
                gapComposer = gapComposer2;
                companion = companion2;
                f = f4;
                OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = new OutlinedTextFieldMeasurePolicy(function1, z2, textFieldLabelPosition$Attached, textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0, paddingValues2, f);
                gapComposer.updateRememberedValue(outlinedTextFieldMeasurePolicy);
                rememberedValue2 = outlinedTextFieldMeasurePolicy;
            } else {
                applier = applier2;
                neverEqualPolicy = neverEqualPolicy2;
                biasAlignment = biasAlignment5;
                i5 = i10;
                biasAlignment2 = biasAlignment6;
                gapComposer = gapComposer2;
                companion = companion2;
                f = f4;
            }
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy2 = (OutlinedTextFieldMeasurePolicy) rememberedValue2;
            LayoutDirection layoutDirection2 = (LayoutDirection) gapComposer.consume(CompositionLocalsKt.LocalLayoutDirection);
            int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            float f5 = f;
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
            Updater.m576setimpl(gapComposer, outlinedTextFieldMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            if (gapComposer.inserting) {
                biasAlignment3 = biasAlignment2;
            } else {
                biasAlignment3 = biasAlignment2;
            }
            Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$13);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            composableLambdaImpl.invoke(gapComposer, Integer.valueOf((i9 >> 6) & 14));
            MinimumInteractiveModifier minimumInteractiveModifier = MinimumInteractiveModifier.INSTANCE;
            if (function23 != null) {
                gapComposer.startReplaceGroup(2145628269);
                Modifier then = RulerKt.layoutId(companion, "Leading").then(minimumInteractiveModifier);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int currentCompositeKeyHash2 = Updater.getCurrentCompositeKeyHash(gapComposer);
                layoutDirection = layoutDirection2;
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, then);
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
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash2, gapComposer, currentCompositeKeyHash2, composeUiNode$Companion$SetModifier$13);
                }
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                z3 = false;
                Recorder$$ExternalSyntheticOutline2.m((i3 >> 12) & 14, function23, gapComposer, true, false);
            } else {
                layoutDirection = layoutDirection2;
                z3 = false;
                gapComposer.startReplaceGroup(2145874285);
                gapComposer.end(false);
            }
            if (function24 != null) {
                gapComposer.startReplaceGroup(2145917003);
                Modifier then2 = RulerKt.layoutId(companion, "Trailing").then(minimumInteractiveModifier);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z3);
                int currentCompositeKeyHash3 = Updater.getCurrentCompositeKeyHash(gapComposer);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, then2);
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
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash3, gapComposer, currentCompositeKeyHash3, composeUiNode$Companion$SetModifier$13);
                }
                Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                Recorder$$ExternalSyntheticOutline2.m((i3 >> 15) & 14, function24, gapComposer, true, false);
            } else {
                gapComposer.startReplaceGroup(2146164941);
                gapComposer.end(z3);
            }
            paddingValues2 = paddingValues;
            LayoutDirection layoutDirection3 = layoutDirection;
            float calculateStartPadding = SpacerKt.calculateStartPadding(paddingValues2, layoutDirection3);
            float calculateEndPadding = SpacerKt.calculateEndPadding(paddingValues2, layoutDirection3);
            if (function23 != null) {
                calculateStartPadding -= f5;
                if (calculateStartPadding < RecyclerView.DECELERATION_RATE) {
                    calculateStartPadding = 0.0f;
                }
            }
            float f6 = calculateStartPadding;
            if (function24 != null) {
                float f7 = calculateEndPadding - f5;
                if (f7 < RecyclerView.DECELERATION_RATE) {
                    f7 = 0.0f;
                }
                f2 = f7;
            } else {
                f2 = calculateEndPadding;
            }
            if (function25 != null) {
                gapComposer.startReplaceGroup(2146868920);
                wrapContentHeight5 = SizeKt.wrapContentHeight(SizeKt.m279heightInVpY3zN4$default(RulerKt.layoutId(companion, "Prefix"), 24.0f, RecyclerView.DECELERATION_RATE, 2), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(wrapContentHeight5, f6, RecyclerView.DECELERATION_RATE, 2.0f, RecyclerView.DECELERATION_RATE, 10);
                biasAlignment4 = biasAlignment3;
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment4, false);
                int currentCompositeKeyHash4 = Updater.getCurrentCompositeKeyHash(gapComposer);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash4, gapComposer, currentCompositeKeyHash4, composeUiNode$Companion$SetModifier$13);
                }
                Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                Recorder$$ExternalSyntheticOutline2.m((i3 >> 18) & 14, function25, gapComposer, true, false);
            } else {
                biasAlignment4 = biasAlignment3;
                gapComposer.startReplaceGroup(2147196621);
                gapComposer.end(false);
            }
            if (function26 != null) {
                gapComposer.startReplaceGroup(2147239866);
                wrapContentHeight4 = SizeKt.wrapContentHeight(SizeKt.m279heightInVpY3zN4$default(RulerKt.layoutId(companion, "Suffix"), 24.0f, RecyclerView.DECELERATION_RATE, 2), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(wrapContentHeight4, 2.0f, RecyclerView.DECELERATION_RATE, f2, RecyclerView.DECELERATION_RATE, 10);
                MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment4, false);
                int currentCompositeKeyHash5 = Updater.getCurrentCompositeKeyHash(gapComposer);
                PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default2);
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
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy4, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
                if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash5, gapComposer, currentCompositeKeyHash5, composeUiNode$Companion$SetModifier$13);
                }
                Updater.m576setimpl(gapComposer, materializeModifier5, composeUiNode$Companion$SetModifier$14);
                function210 = function26;
                Recorder$$ExternalSyntheticOutline2.m((i3 >> 21) & 14, function210, gapComposer, true, false);
            } else {
                function210 = function26;
                gapComposer.startReplaceGroup(-2147401651);
                gapComposer.end(false);
            }
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.m279heightInVpY3zN4$default(companion, 24.0f, RecyclerView.DECELERATION_RATE, 2), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Modifier m302paddingqDBjuR0$default3 = SpacerKt.m302paddingqDBjuR0$default(wrapContentHeight, function25 == null ? f6 : RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, function210 == null ? f2 : RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 10);
            if (function3 != null) {
                gapComposer.startReplaceGroup(-2147031666);
                function32 = function3;
                function32.invoke(RulerKt.layoutId(companion, "Hint").then(m302paddingqDBjuR0$default3), gapComposer, Integer.valueOf((i3 >> 3) & 112));
                gapComposer.end(false);
            } else {
                function32 = function3;
                gapComposer.startReplaceGroup(-2146940371);
                gapComposer.end(false);
            }
            Modifier then3 = RulerKt.layoutId(companion, "TextField").then(m302paddingqDBjuR0$default3);
            MeasurePolicy maybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment4, true);
            int currentCompositeKeyHash6 = Updater.getCurrentCompositeKeyHash(gapComposer);
            PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer, then3);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy5, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$12);
            if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash6, gapComposer, currentCompositeKeyHash6, composeUiNode$Companion$SetModifier$13);
            }
            Updater.m576setimpl(gapComposer, materializeModifier6, composeUiNode$Companion$SetModifier$14);
            Recorder$$ExternalSyntheticOutline1.m((i3 >> 3) & 14, function2, gapComposer, true);
            if (function22 != null) {
                gapComposer.startReplaceGroup(-2146287790);
                if (i5 != 4) {
                    if ((i9 & 8) != 0) {
                        textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$02 = textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0;
                    } else {
                        textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$02 = textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0;
                    }
                    z5 = false;
                    rememberedValue = gapComposer.rememberedValue();
                    if (!z5 || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new Worker$$ExternalSyntheticLambda0(textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$02, 6);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    wrapContentHeight3 = SizeKt.wrapContentHeight(ValueInsets.layout(companion, new DismissableToastKt$$ExternalSyntheticLambda3(1, (Function0) rememberedValue)), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    Modifier then4 = RulerKt.layoutId(wrapContentHeight3, "Label").then(companion);
                    MeasurePolicy maybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment4, false);
                    int currentCompositeKeyHash7 = Updater.getCurrentCompositeKeyHash(gapComposer);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope7 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier7 = PlatformKt.materializeModifier(gapComposer, then4);
                    if (applier != null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy6, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope7, composeUiNode$Companion$SetModifier$12);
                    if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                        Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash7, gapComposer, currentCompositeKeyHash7, composeUiNode$Companion$SetModifier$13);
                    }
                    Updater.m576setimpl(gapComposer, materializeModifier7, composeUiNode$Companion$SetModifier$14);
                    function29 = function22;
                    Recorder$$ExternalSyntheticOutline2.m((i3 >> 9) & 14, function29, gapComposer, true, false);
                } else {
                    textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$02 = textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0;
                }
                z5 = true;
                rememberedValue = gapComposer.rememberedValue();
                if (!z5) {
                }
                rememberedValue = new Worker$$ExternalSyntheticLambda0(textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$02, 6);
                gapComposer.updateRememberedValue(rememberedValue);
                wrapContentHeight3 = SizeKt.wrapContentHeight(ValueInsets.layout(companion, new DismissableToastKt$$ExternalSyntheticLambda3(1, (Function0) rememberedValue)), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                Modifier then42 = RulerKt.layoutId(wrapContentHeight3, "Label").then(companion);
                MeasurePolicy maybeCachedBoxMeasurePolicy62 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment4, false);
                int currentCompositeKeyHash72 = Updater.getCurrentCompositeKeyHash(gapComposer);
                PersistentCompositionLocalHashMap currentCompositionLocalScope72 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier72 = PlatformKt.materializeModifier(gapComposer, then42);
                if (applier != null) {
                }
            } else {
                function29 = function22;
                gapComposer.startReplaceGroup(-2145892819);
                gapComposer.end(false);
            }
            if (function27 != null) {
                gapComposer.startReplaceGroup(-2145844304);
                wrapContentHeight2 = SizeKt.wrapContentHeight(SizeKt.m279heightInVpY3zN4$default(RulerKt.layoutId(companion, "Supporting"), 16.0f, RecyclerView.DECELERATION_RATE, 2), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                Modifier padding = SpacerKt.padding(wrapContentHeight2, new PaddingValuesImpl(16.0f, 4.0f, 16.0f, RecyclerView.DECELERATION_RATE));
                MeasurePolicy maybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment4, false);
                int currentCompositeKeyHash8 = Updater.getCurrentCompositeKeyHash(gapComposer);
                PersistentCompositionLocalHashMap currentCompositionLocalScope8 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier8 = PlatformKt.materializeModifier(gapComposer, padding);
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
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy7, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope8, composeUiNode$Companion$SetModifier$12);
                if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash8, gapComposer, currentCompositeKeyHash8, composeUiNode$Companion$SetModifier$13);
                }
                Updater.m576setimpl(gapComposer, materializeModifier8, composeUiNode$Companion$SetModifier$14);
                int i11 = (i9 >> 9) & 14;
                function28 = function27;
                z4 = true;
                Recorder$$ExternalSyntheticOutline2.m(i11, function28, gapComposer, true, false);
            } else {
                function28 = function27;
                z4 = true;
                gapComposer.startReplaceGroup(-2145508915);
                gapComposer.end(false);
            }
            gapComposer.end(z4);
        } else {
            function28 = function27;
            function32 = function3;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OutlinedTextFieldKt$$ExternalSyntheticLambda3(function2, function32, function29, function23, function24, function25, function210, z, textFieldLabelPosition$Attached, textFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0, function1, composableLambdaImpl, function28, paddingValues2, i, i2);
        }
    }

    /* renamed from: Scaffold-TvnljyQ, reason: not valid java name */
    public static final void m537ScaffoldTvnljyQ(Modifier modifier, Function2 function2, Function2 function22, Function2 function23, final ComposableLambdaImpl composableLambdaImpl, int i, long j, long j2, WindowInsets windowInsets, final ComposableLambdaImpl composableLambdaImpl2, Composer composer, final int i2) {
        final Modifier modifier2;
        final Function2 function24;
        final Function2 function25;
        final Function2 function26;
        final int i3;
        final long j3;
        final long j4;
        final WindowInsets windowInsets2;
        long j5;
        Modifier modifier3;
        WindowInsets windowInsets3;
        final Function2 function27;
        final int i4;
        long j6;
        final Function2 function28;
        final Function2 function29;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1211482744);
        int i5 = i2 | 38473142;
        if (gapComposer.shouldExecute(i5 & 1, (306783379 & i5) != 306783378)) {
            gapComposer.startDefaults();
            if ((i2 & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                ComposableLambdaImpl composableLambdaImpl3 = ComposableSingletons$ScaffoldKt.f9lambda$39202156;
                ComposableLambdaImpl composableLambdaImpl4 = ComposableSingletons$ScaffoldKt.lambda$1582488484;
                ComposableLambdaImpl composableLambdaImpl5 = ComposableSingletons$ScaffoldKt.lambda$414328099;
                long j7 = ((ColorScheme) gapComposer.consume(ColorSchemeKt.LocalColorScheme)).background;
                long m519contentColorForek8zF_U = ColorSchemeKt.m519contentColorForek8zF_U(j7, gapComposer);
                WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                UnionInsets unionInsets = new UnionInsets(Arrangement$End$1.current(gapComposer).systemBars, Arrangement$End$1.current(gapComposer).displayCutout);
                j5 = m519contentColorForek8zF_U;
                modifier3 = Modifier.Companion.$$INSTANCE;
                windowInsets3 = unionInsets;
                function27 = composableLambdaImpl4;
                i4 = 2;
                j6 = j7;
                function28 = composableLambdaImpl5;
                function29 = composableLambdaImpl3;
            } else {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier;
                function29 = function2;
                function27 = function22;
                function28 = function23;
                i4 = i;
                j6 = j;
                j5 = j2;
                windowInsets3 = windowInsets;
            }
            gapComposer.endDefaults();
            boolean changed = gapComposer.changed(windowInsets3);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changed || rememberedValue == obj) {
                rememberedValue = new MutableWindowInsets(windowInsets3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            final MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) rememberedValue;
            boolean changed2 = gapComposer.changed(mutableWindowInsets) | gapComposer.changed(windowInsets3);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == obj) {
                rememberedValue2 = new Navigator$$ExternalSyntheticLambda0(13, mutableWindowInsets, windowInsets3);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier onConsumedWindowInsetsChanged = OffsetKt.onConsumedWindowInsetsChanged(modifier3, (Function1) rememberedValue2);
            Function2 function210 = function29;
            Function2 function211 = function28;
            Function2 function212 = function27;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(848889571, new Function2() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Number) obj3).intValue();
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                        MenuKt.m538ScaffoldLayoutFMILGgc(i4, 0, mutableWindowInsets, gapComposer2, composableLambdaImpl2, composableLambdaImpl, function29, function28, function27);
                    } else {
                        gapComposer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer);
            long j8 = j6;
            long j9 = j5;
            SurfaceKt.m554SurfaceT9BRK9s(onConsumedWindowInsetsChanged, null, j8, j9, RecyclerView.DECELERATION_RATE, rememberComposableLambda, gapComposer, 12582912, 114);
            j3 = j8;
            j4 = j9;
            windowInsets2 = windowInsets3;
            function26 = function211;
            i3 = i4;
            function24 = function210;
            function25 = function212;
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            function24 = function2;
            function25 = function22;
            function26 = function23;
            i3 = i;
            j3 = j;
            j4 = j2;
            windowInsets2 = windowInsets;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(function24, function25, function26, composableLambdaImpl, i3, j3, j4, windowInsets2, composableLambdaImpl2, i2) { // from class: androidx.compose.material3.ScaffoldKt$$ExternalSyntheticLambda1
                public final /* synthetic */ Function2 f$1;
                public final /* synthetic */ Function2 f$2;
                public final /* synthetic */ Function2 f$3;
                public final /* synthetic */ ComposableLambdaImpl f$4;
                public final /* synthetic */ int f$5;
                public final /* synthetic */ long f$6;
                public final /* synthetic */ long f$7;
                public final /* synthetic */ WindowInsets f$8;
                public final /* synthetic */ ComposableLambdaImpl f$9;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(805330945);
                    MenuKt.m537ScaffoldTvnljyQ(Modifier.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, (Composer) obj2, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: ScaffoldLayout-FMILGgc, reason: not valid java name */
    public static final void m538ScaffoldLayoutFMILGgc(int i, int i2, WindowInsets windowInsets, Composer composer, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, Function2 function2, Function2 function22, Function2 function23) {
        int i3;
        int i4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-280287501);
        int i5 = i2 | (gapComposer.changed(i) ? 4 : 2) | (gapComposer.changedInstance(function2) ? 32 : 16) | (gapComposer.changedInstance(composableLambdaImpl) ? 256 : 128) | (gapComposer.changedInstance(function22) ? 2048 : 1024) | (gapComposer.changedInstance(composableLambdaImpl2) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(windowInsets) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changedInstance(function23) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer.shouldExecute(i5 & 1, (599187 & i5) != 599186)) {
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = new ScaffoldKt$ScaffoldLayout$contentPadding$1$1();
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1 = (ScaffoldKt$ScaffoldLayout$contentPadding$1$1) rememberedValue;
            boolean z = (i5 & 112) == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == obj) {
                rememberedValue2 = new ComposableLambdaImpl(new DatePickerKt$DatePickerHeader$1$1(6, function2), true, 605195056);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function2 function24 = (Function2) rememberedValue2;
            boolean z2 = (i5 & 7168) == 2048;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z2 || rememberedValue3 == obj) {
                rememberedValue3 = new ComposableLambdaImpl(new DatePickerKt$DatePickerHeader$1$1(5, function22), true, 418899191);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Function2 function25 = (Function2) rememberedValue3;
            boolean z3 = (57344 & i5) == 16384;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (z3 || rememberedValue4 == obj) {
                rememberedValue4 = new ComposableLambdaImpl(new DateInputKt$DateInputTextField$3(composableLambdaImpl2, 2), true, 338600263);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Function2 function26 = (Function2) rememberedValue4;
            boolean z4 = (i5 & 896) == 256;
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (z4 || rememberedValue5 == obj) {
                i3 = i5;
                rememberedValue5 = new ComposableLambdaImpl(new ButtonKt$Button$2.AnonymousClass1(composableLambdaImpl, scaffoldKt$ScaffoldLayout$contentPadding$1$1, 4), true, -1776388365);
                gapComposer.updateRememberedValue(rememberedValue5);
            } else {
                i3 = i5;
            }
            Function2 function27 = (Function2) rememberedValue5;
            boolean z5 = (i3 & 3670016) == 1048576;
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (z5 || rememberedValue6 == obj) {
                rememberedValue6 = new ComposableLambdaImpl(new DatePickerKt$DatePickerHeader$1$1(4, function23), true, -1731662488);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            Function2 function28 = (Function2) rememberedValue6;
            boolean changed = ((i3 & 458752) == 131072) | gapComposer.changed(function24) | gapComposer.changed(function25) | gapComposer.changed(function26) | ((i3 & 14) == 4) | gapComposer.changed(function28) | gapComposer.changed(function27);
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (changed || rememberedValue7 == obj) {
                i4 = 0;
                Object scaffoldKt$$ExternalSyntheticLambda5 = new ScaffoldKt$$ExternalSyntheticLambda5(windowInsets, function24, function25, function26, i, function28, scaffoldKt$ScaffoldLayout$contentPadding$1$1, function27);
                gapComposer.updateRememberedValue(scaffoldKt$$ExternalSyntheticLambda5);
                rememberedValue7 = scaffoldKt$$ExternalSyntheticLambda5;
            } else {
                i4 = 0;
            }
            RulerKt.SubcomposeLayout((Modifier) null, (Function2) rememberedValue7, gapComposer, i4, 1);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScaffoldKt$$ExternalSyntheticLambda8(i, function2, composableLambdaImpl, function22, composableLambdaImpl2, windowInsets, function23, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [androidx.compose.runtime.internal.ComposableLambdaImpl] */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.runtime.internal.ComposableLambdaImpl] */
    /* JADX WARN: Type inference failed for: r8v13, types: [kotlin.coroutines.Continuation] */
    public static final void SwipeToDismissBox(SwipeToDismissBoxState swipeToDismissBoxState, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, boolean z, boolean z2, boolean z3, Function1 function1, ComposableLambdaImpl composableLambdaImpl2, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        ComposableLambdaImpl composableLambdaImpl3;
        boolean z4;
        boolean z5;
        Throwable th;
        SnapFlingBehavior snapFlingBehavior;
        Function1 function12;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-741495334);
        Applier applier = gapComposer.applier;
        int i4 = i | (gapComposer.changedInstance(swipeToDismissBoxState) ? 4 : 2);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i4 | (gapComposer.changed(modifier2) ? 256 : 128);
        }
        int i6 = i3 | 221184 | (gapComposer.changedInstance(function1) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer.shouldExecute(i6 & 1, (4793491 & i6) != 4793490)) {
            Modifier modifier3 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            AnchoredDraggableState anchoredDraggableState = swipeToDismissBoxState.anchoredDraggableState;
            AnchoredDraggableState anchoredDraggableState2 = swipeToDismissBoxState.anchoredDraggableState;
            Orientation orientation = Orientation.Horizontal;
            boolean z6 = ((SwipeToDismissBoxValue) anchoredDraggableState.settledValue$delegate.getValue()) == SwipeToDismissBoxValue.Settled;
            Function1 function13 = swipeToDismissBoxState.positionalThreshold;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (function13 != null) {
                gapComposer.startReplaceGroup(387581105);
                TweenSpec tweenSpec = AnchoredDraggableDefaults.SnapAnimationSpec;
                Function1 function14 = swipeToDismissBoxState.positionalThreshold;
                if (function14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("positionalThreshold");
                    throw null;
                }
                TweenSpec tweenSpec2 = AnchoredDraggableDefaults.SnapAnimationSpec;
                th = null;
                TweenSpec tweenSpec3 = AnchoredDraggableDefaults.SnapAnimationSpec;
                Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                boolean changed = gapComposer.changed(density) | gapComposer.changed(anchoredDraggableState2) | gapComposer.changed(function14) | gapComposer.changed(tweenSpec3);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy) {
                    SnapFlingBehavior snapFlingBehavior2 = new SnapFlingBehavior(new Recorder.AnonymousClass3(12, anchoredDraggableState2, function14, new ModalBottomSheetState$$ExternalSyntheticLambda1(density, 1)), Draggable2DKt.NoOpDecayAnimationSpec, tweenSpec3);
                    gapComposer.updateRememberedValue(snapFlingBehavior2);
                    rememberedValue = snapFlingBehavior2;
                }
                gapComposer.end(false);
                snapFlingBehavior = (SnapFlingBehavior) rememberedValue;
            } else {
                th = null;
                gapComposer.startReplaceGroup(-869685853);
                gapComposer.end(false);
                snapFlingBehavior = null;
            }
            Modifier anchoredDraggable$default = Draggable2DKt.anchoredDraggable$default(modifier3, anchoredDraggableState, orientation, z6, snapFlingBehavior, 24);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, true);
            int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, anchoredDraggable$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Throwable th2 = th;
                Updater.invalidApplier();
                throw th2;
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
            if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$13);
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier matchParentSize = BoxScopeInstance.INSTANCE.matchParentSize();
            Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
            BiasAlignment.Vertical vertical = Alignment.Companion.Top;
            Modifier modifier4 = modifier3;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 0);
            int currentCompositeKeyHash2 = Updater.getCurrentCompositeKeyHash(gapComposer);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, matchParentSize);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash2, gapComposer, currentCompositeKeyHash2, composeUiNode$Companion$SetModifier$13);
            }
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composableLambdaImpl.invoke(rowScopeInstance, gapComposer, 54);
            gapComposer.end(true);
            boolean changedInstance = gapComposer.changedInstance(swipeToDismissBoxState);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new SliderDefaults$$ExternalSyntheticLambda0(swipeToDismissBoxState, z, 2);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier draggableAnchorsV2 = Icons$Filled.draggableAnchorsV2(anchoredDraggableState2, (Function2) rememberedValue2);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 0);
            int currentCompositeKeyHash3 = Updater.getCurrentCompositeKeyHash(gapComposer);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, draggableAnchorsV2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash3, gapComposer, currentCompositeKeyHash3, composeUiNode$Companion$SetModifier$13);
            }
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            ?? r3 = composableLambdaImpl2;
            r3.invoke(rowScopeInstance, gapComposer, 54);
            gapComposer.end(true);
            gapComposer.end(true);
            SwipeToDismissBoxValue swipeToDismissBoxValue = (SwipeToDismissBoxValue) anchoredDraggableState2.settledValue$delegate.getValue();
            boolean changedInstance2 = gapComposer.changedInstance(swipeToDismissBoxState) | ((i6 & 3670016) == 1048576);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                function12 = function1;
                rememberedValue3 = new RealBadger2$clear$2((Object) swipeToDismissBoxState, (Object) function12, (Continuation) th, 13);
                gapComposer.updateRememberedValue(rememberedValue3);
            } else {
                function12 = function1;
            }
            Updater.LaunchedEffect(swipeToDismissBoxValue, function12, (Function2) rememberedValue3, gapComposer);
            modifier2 = modifier4;
            z4 = true;
            z5 = true;
            composableLambdaImpl3 = r3;
        } else {
            composableLambdaImpl3 = composableLambdaImpl2;
            gapComposer.skipToGroupEnd();
            z4 = z2;
            z5 = z3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SwipeToDismissBoxKt$$ExternalSyntheticLambda1(swipeToDismissBoxState, composableLambdaImpl, modifier2, z, z4, z5, function1, composableLambdaImpl3, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextButton(Function0 function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, PaddingValues paddingValues, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Shape shape2;
        ButtonColors buttonColors2;
        int i4;
        GapComposer gapComposer;
        PaddingValues paddingValues2;
        Modifier modifier3;
        boolean z2;
        RecomposeScopeImpl endRestartGroup;
        Shape shape3;
        ButtonColors buttonColors3;
        Modifier modifier4;
        Shape shape4;
        ButtonColors buttonColors4;
        PaddingValues paddingValues3;
        int i5;
        int i6;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1061374109);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 32 : 16;
            int i8 = i3 | MLKEMEngine.KyberPolyBytes;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    shape2 = shape;
                    if (gapComposer2.changed(shape2)) {
                        i6 = 2048;
                        i8 |= i6;
                    }
                } else {
                    shape2 = shape;
                }
                i6 = 1024;
                i8 |= i6;
            } else {
                shape2 = shape;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    buttonColors2 = buttonColors;
                    if (gapComposer2.changed(buttonColors2)) {
                        i5 = 16384;
                        i8 |= i5;
                    }
                } else {
                    buttonColors2 = buttonColors;
                }
                i5 = PKIFailureInfo.certRevoked;
                i8 |= i5;
            } else {
                buttonColors2 = buttonColors;
            }
            if ((i2 & 32) == 0) {
                i8 |= 196608;
            } else if ((i & 196608) == 0) {
                i8 |= gapComposer2.changed((Object) null) ? PKIFailureInfo.unsupportedVersion : 65536;
            }
            if ((i2 & 64) == 0) {
                i8 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i8 |= gapComposer2.changed((Object) null) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            }
            i4 = i8 | 113246208;
            if ((805306368 & i) == 0) {
                i4 |= gapComposer2.changedInstance(composableLambdaImpl) ? PKIFailureInfo.duplicateCertReq : 268435456;
            }
            boolean z3 = true;
            if (gapComposer2.shouldExecute(i4 & 1, (306783379 & i4) == 306783378)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                paddingValues2 = paddingValues;
                modifier3 = modifier2;
                z2 = z;
            } else {
                gapComposer2.startDefaults();
                if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                    Modifier modifier5 = i7 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
                        PaddingValuesImpl paddingValuesImpl = ButtonDefaults.ContentPadding;
                        shape3 = ShapesKt.getValue(ButtonSmallTokens.ContainerShapeRound, gapComposer2);
                        i4 &= -7169;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        PaddingValuesImpl paddingValuesImpl2 = ButtonDefaults.ContentPadding;
                        buttonColors3 = ButtonDefaults.getDefaultTextButtonColors$material3((ColorScheme) gapComposer2.consume(ColorSchemeKt.LocalColorScheme));
                        i4 &= -57345;
                    } else {
                        buttonColors3 = buttonColors2;
                    }
                    modifier4 = modifier5;
                    shape4 = shape3;
                    buttonColors4 = buttonColors3;
                    paddingValues3 = ButtonDefaults.TextButtonContentPadding;
                } else {
                    gapComposer2.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                    }
                    z3 = z;
                    paddingValues3 = paddingValues;
                    modifier4 = modifier2;
                    shape4 = shape2;
                    buttonColors4 = buttonColors2;
                }
                gapComposer2.endDefaults();
                gapComposer = gapComposer2;
                Button(function0, modifier4, z3, shape4, buttonColors4, null, null, paddingValues3, composableLambdaImpl, gapComposer, i4 & 2147483646, 0);
                modifier3 = modifier4;
                z2 = z3;
                shape2 = shape4;
                buttonColors2 = buttonColors4;
                paddingValues2 = paddingValues3;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new ButtonKt$$ExternalSyntheticLambda4(function0, modifier3, z2, shape2, buttonColors2, paddingValues2, composableLambdaImpl, i, i2);
                return;
            }
            return;
        }
        modifier2 = modifier;
        int i82 = i3 | MLKEMEngine.KyberPolyBytes;
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((i2 & 32) == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i4 = i82 | 113246208;
        if ((805306368 & i) == 0) {
        }
        boolean z32 = true;
        if (gapComposer2.shouldExecute(i4 & 1, (306783379 & i4) == 306783378)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void drawStopIndicator_EgI2THU$drawIndicator(float f, float f2, long j, DrawScope drawScope) {
        float f3 = f / 2.0f;
        float intBitsToFloat = (Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) - f3) - f2;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) / 2.0f;
        DrawScope.m738drawCircleVaOC9Bg$default(drawScope, j, f3, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax), null, 0, 120);
    }

    public static final SwipeToDismissBoxState rememberSwipeToDismissBoxState(Composer composer, Function1 function1) {
        SwipeToDismissBoxValue swipeToDismissBoxValue = SwipeToDismissBoxValue.Settled;
        Object[] objArr = new Object[0];
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(8, new Savers_androidKt$$ExternalSyntheticLambda0((byte) 0, 2), new GestureNodeKt$$ExternalSyntheticLambda0(4, function1));
        boolean changed = ((GapComposer) composer).changed(swipeToDismissBoxValue.ordinal()) | ((GapComposer) composer).changed(function1);
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new DrawerKt$$ExternalSyntheticLambda1(3, function1);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (SwipeToDismissBoxState) SaverKt.m581rememberSaveable(objArr, (Saver) workLauncherImpl, (Function0) rememberedValue, (Composer) gapComposer, 0);
    }

    public static final SpringSpec value(MotionSchemeKeyTokens motionSchemeKeyTokens, Composer composer) {
        MotionScheme$StandardMotionSchemeImpl motionScheme$StandardMotionSchemeImpl = (MotionScheme$StandardMotionSchemeImpl) ((GapComposer) composer).consume(MaterialThemeKt._localMotionScheme);
        int ordinal = motionSchemeKeyTokens.ordinal();
        if (ordinal == 0) {
            motionScheme$StandardMotionSchemeImpl.getClass();
            SpringSpec springSpec = MotionScheme$StandardMotionSchemeImpl.defaultSpatialSpec;
            springSpec.getClass();
            return springSpec;
        }
        if (ordinal == 1) {
            motionScheme$StandardMotionSchemeImpl.getClass();
            SpringSpec springSpec2 = MotionScheme$StandardMotionSchemeImpl.fastSpatialSpec;
            springSpec2.getClass();
            return springSpec2;
        }
        if (ordinal == 2) {
            motionScheme$StandardMotionSchemeImpl.getClass();
            SpringSpec springSpec3 = MotionScheme$StandardMotionSchemeImpl.slowSpatialSpec;
            springSpec3.getClass();
            return springSpec3;
        }
        if (ordinal == 3) {
            motionScheme$StandardMotionSchemeImpl.getClass();
            SpringSpec springSpec4 = MotionScheme$StandardMotionSchemeImpl.defaultEffectsSpec;
            springSpec4.getClass();
            return springSpec4;
        }
        if (ordinal == 4) {
            motionScheme$StandardMotionSchemeImpl.getClass();
            SpringSpec springSpec5 = MotionScheme$StandardMotionSchemeImpl.fastEffectsSpec;
            springSpec5.getClass();
            return springSpec5;
        }
        if (ordinal != 5) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        motionScheme$StandardMotionSchemeImpl.getClass();
        SpringSpec springSpec6 = MotionScheme$StandardMotionSchemeImpl.slowEffectsSpec;
        springSpec6.getClass();
        return springSpec6;
    }

    public static final void OutlinedTextField(final TextFieldValue textFieldValue, Function1 function1, Modifier modifier, boolean z, TextStyle textStyle, final Function2 function2, Function2 function22, final Function2 function23, final boolean z2, final VisualTransformation visualTransformation, final KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, final boolean z3, int i, int i2, Shape shape, final TextFieldColors textFieldColors, Composer composer, int i3) {
        int i4;
        final Function1 function12;
        Modifier modifier2;
        Function2 function24;
        GapComposer gapComposer;
        boolean z4;
        TextStyle textStyle2;
        KeyboardActions keyboardActions2;
        int i5;
        int i6;
        Shape shape2;
        TextStyle textStyle3;
        final KeyboardActions keyboardActions3;
        final int i7;
        final Shape value;
        final int i8;
        long j;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(2057288437);
        if ((i3 & 6) == 0) {
            i4 = (gapComposer2.changed(textFieldValue) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            function12 = function1;
            i4 |= gapComposer2.changedInstance(function12) ? 32 : 16;
        } else {
            function12 = function1;
        }
        if ((i3 & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i4 |= gapComposer2.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int i9 = i4 | 27648;
        if ((196608 & i3) == 0) {
            i9 = 93184 | i4;
        }
        if ((1572864 & i3) == 0) {
            i9 |= gapComposer2.changedInstance(function2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i3) == 0) {
            function24 = function22;
            i9 |= gapComposer2.changedInstance(function24) ? 8388608 : 4194304;
        } else {
            function24 = function22;
        }
        int i10 = i9 | 905969664;
        boolean z5 = true;
        if (gapComposer2.shouldExecute(i10 & 1, ((i10 & 306783379) == 306783378 && (((((gapComposer2.changed(z2) ? (char) 2048 : (char) 1024) | 438) | (gapComposer2.changed(visualTransformation) ? 16384 : PKIFailureInfo.certRevoked)) | 840433664) & 306783379) == 306783378 && (((gapComposer2.changed(textFieldColors) ? (char) 256 : (char) 128) | 22) & 147) == 146) ? false : true)) {
            gapComposer2.startDefaults();
            if ((i3 & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
                z5 = z;
                textStyle3 = textStyle;
                keyboardActions3 = keyboardActions;
                i7 = i;
                i8 = i2;
                value = shape;
            } else {
                textStyle3 = (TextStyle) gapComposer2.consume(TextKt.LocalTextStyle);
                keyboardActions3 = KeyboardActions.Default;
                i7 = z3 ? 1 : Integer.MAX_VALUE;
                value = ShapesKt.getValue(OutlinedTextFieldTokens.ContainerShape, gapComposer2);
                i8 = 1;
            }
            gapComposer2.endDefaults();
            gapComposer2.startReplaceGroup(-502250010);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
            }
            final MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
            gapComposer2.end(false);
            gapComposer2.startReplaceGroup(1369277167);
            long m996getColor0d7_KjU = textStyle3.m996getColor0d7_KjU();
            if (m996getColor0d7_KjU == 16) {
                boolean booleanValue = ((Boolean) Countries.collectIsFocusedAsState(mutableInteractionSourceImpl, gapComposer2, 0).getValue()).booleanValue();
                if (!z5) {
                    j = textFieldColors.disabledTextColor;
                } else if (z2) {
                    j = textFieldColors.errorTextColor;
                } else if (booleanValue) {
                    j = textFieldColors.focusedTextColor;
                } else {
                    j = textFieldColors.unfocusedTextColor;
                }
                m996getColor0d7_KjU = j;
            }
            long j2 = m996getColor0d7_KjU;
            gapComposer2.end(false);
            final TextStyle merge = textStyle3.merge(new TextStyle(j2, 0L, null, null, 0L, 0L, 0, 0, 0L, null, 16777214));
            ProvidedValue defaultProvidedValue$runtime = TextSelectionColorsKt.LocalTextSelectionColors.defaultProvidedValue$runtime(textFieldColors.textSelectionColors);
            final Modifier modifier3 = modifier2;
            final boolean z6 = z5;
            final Function2 function25 = function24;
            Function2 function26 = new Function2() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int intValue = ((Number) obj2).intValue();
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                        Function2 function27 = function2;
                        Modifier modifier4 = Modifier.Companion.$$INSTANCE;
                        if (function27 != null) {
                            gapComposer3.startReplaceGroup(-1901539802);
                            Object rememberedValue2 = gapComposer3.rememberedValue();
                            if (rememberedValue2 == Composer.Companion.Empty) {
                                rememberedValue2 = new androidx.compose.material.ButtonKt$$ExternalSyntheticLambda2(27);
                                gapComposer3.updateRememberedValue(rememberedValue2);
                            }
                            modifier4 = SpacerKt.m302paddingqDBjuR0$default(SemanticsModifierKt.semantics(modifier4, true, (Function1) rememberedValue2), RecyclerView.DECELERATION_RATE, Icons$Filled.minimizedLabelHalfHeight(gapComposer3), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(-1901156115);
                            gapComposer3.end(false);
                        }
                        Modifier then = Modifier.this.then(modifier4);
                        String m568getString2EP1pXo = Icons$Filled.m568getString2EP1pXo(gapComposer3, R.string.default_error_message);
                        boolean z7 = z2;
                        if (z7) {
                            then = SemanticsModifierKt.semantics(then, false, new androidx.compose.material.IconKt$$ExternalSyntheticLambda0(m568getString2EP1pXo, 10));
                        }
                        Modifier m275defaultMinSizeVpY3zN4 = SizeKt.m275defaultMinSizeVpY3zN4(then, 280.0f, 56.0f);
                        final TextFieldColors textFieldColors2 = textFieldColors;
                        SolidColor solidColor = new SolidColor(z7 ? textFieldColors2.errorCursorColor : textFieldColors2.cursorColor);
                        final Function2 function28 = function23;
                        final Shape shape3 = value;
                        final TextFieldValue textFieldValue2 = textFieldValue;
                        final boolean z8 = z6;
                        final boolean z9 = z3;
                        final VisualTransformation visualTransformation2 = visualTransformation;
                        final MutableInteractionSourceImpl mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                        final boolean z10 = z2;
                        final Function2 function29 = function2;
                        final Function2 function210 = function25;
                        BasicTextFieldKt.BasicTextField(textFieldValue2, function12, m275defaultMinSizeVpY3zN4, z8, merge, keyboardOptions, keyboardActions3, z9, i7, i8, visualTransformation2, null, mutableInteractionSourceImpl2, solidColor, Expect_jvmKt.rememberComposableLambda(674541106, new Function3() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$5.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                Function2 function211 = (Function2) obj3;
                                Composer composer3 = (Composer) obj4;
                                int intValue2 = ((Number) obj5).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((GapComposer) composer3).changedInstance(function211) ? 4 : 2;
                                }
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    String str = TextFieldValue.this.annotatedString.text;
                                    final Shape shape4 = shape3;
                                    final boolean z11 = z8;
                                    final boolean z12 = z10;
                                    final MutableInteractionSourceImpl mutableInteractionSourceImpl3 = mutableInteractionSourceImpl2;
                                    final TextFieldColors textFieldColors3 = textFieldColors2;
                                    OutlinedTextFieldDefaults.INSTANCE.DecorationBox(str, function211, z11, z9, visualTransformation2, mutableInteractionSourceImpl3, z12, function29, function210, function28, textFieldColors3, null, Expect_jvmKt.rememberComposableLambda(1409265477, new Function2() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.5.2.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj6, Object obj7) {
                                            Composer composer4 = (Composer) obj6;
                                            int intValue3 = ((Number) obj7).intValue();
                                            GapComposer gapComposer5 = (GapComposer) composer4;
                                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                OutlinedTextFieldDefaults.INSTANCE.m539Container4EFweAY(z11, z12, mutableInteractionSourceImpl3, null, textFieldColors3, shape4, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, gapComposer5, 100663296, 200);
                                            } else {
                                                gapComposer5.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer4), gapComposer4, (intValue2 << 3) & 112);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer3), gapComposer3, 0, 196608, 4096);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            };
            gapComposer = gapComposer2;
            Updater.CompositionLocalProvider(defaultProvidedValue$runtime, Expect_jvmKt.rememberComposableLambda(-2094276683, function26, gapComposer), gapComposer, 56);
            z4 = z6;
            i5 = i7;
            i6 = i8;
            shape2 = value;
            textStyle2 = textStyle3;
            keyboardActions2 = keyboardActions3;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            z4 = z;
            textStyle2 = textStyle;
            keyboardActions2 = keyboardActions;
            i5 = i;
            i6 = i2;
            shape2 = shape;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OutlinedTextFieldKt$$ExternalSyntheticLambda4(textFieldValue, function1, modifier, z4, textStyle2, function2, function22, function23, z2, visualTransformation, keyboardOptions, keyboardActions2, z3, i5, i6, shape2, textFieldColors, i3);
        }
    }
}
