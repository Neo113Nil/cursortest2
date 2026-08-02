package androidx.compose.material;

import android.view.KeyEvent;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.HoverableElement;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.ProgressSemanticsKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SliderDefaults$Thumb$1$1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.ranges.ClosedFloatRange;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class SliderKt {
    public static final Modifier DefaultSliderConstraints = SizeKt.m279heightInVpY3zN4$default(SizeKt.m292widthInVpY3zN4$default(Modifier.Companion.$$INSTANCE, 144.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, 48.0f, 1);
    public static final TweenSpec SliderToTickAnimation = new TweenSpec(100, (Easing) null, 6);

    public static final void CorrectValueSideEffect(Function1 function1, ClosedFloatingPointRange closedFloatingPointRange, ClosedFloatRange closedFloatRange, MutableState mutableState, float f, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-743965752);
        int i2 = i | (gapComposer.changedInstance(function1) ? 4 : 2) | (gapComposer.changed(closedFloatingPointRange) ? 32 : 16) | (gapComposer.changed(closedFloatRange) ? 256 : 128) | (gapComposer.changed(f) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((57344 & i2) == 16384) | ((i2 & 896) == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                SliderKt$$ExternalSyntheticLambda6 sliderKt$$ExternalSyntheticLambda6 = new SliderKt$$ExternalSyntheticLambda6(closedFloatingPointRange, function1, f, mutableState, closedFloatRange);
                gapComposer.updateRememberedValue(sliderKt$$ExternalSyntheticLambda6);
                rememberedValue = sliderKt$$ExternalSyntheticLambda6;
            }
            Updater.SideEffect((Function0) rememberedValue, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda7(function1, closedFloatingPointRange, closedFloatRange, mutableState, f, i);
        }
    }

    public static final void Slider(final float f, Function1 function1, Modifier modifier, boolean z, final ClosedFloatingPointRange closedFloatingPointRange, final Function0 function0, final DefaultSliderColors defaultSliderColors, Composer composer, int i) {
        GapComposer gapComposer;
        boolean z2;
        boolean z3;
        Modifier then;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1962335196);
        int i2 = i | (gapComposer2.changed(f) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changed(modifier) ? 256 : 128) | 3072 | (gapComposer2.changed(closedFloatingPointRange) ? 16384 : PKIFailureInfo.certRevoked) | 12779520 | (gapComposer2.changed(defaultSliderColors) ? 67108864 : 33554432);
        if (gapComposer2.shouldExecute(i2 & 1, (38347923 & i2) != 38347922)) {
            gapComposer2.startDefaults();
            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                z3 = true;
            } else {
                gapComposer2.skipToGroupEnd();
                z3 = z;
            }
            gapComposer2.endDefaults();
            gapComposer2.startReplaceGroup(-1127489737);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
            }
            final MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
            gapComposer2.end(false);
            final MutableState rememberUpdatedState = Updater.rememberUpdatedState(function1, gapComposer2);
            final MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(function0, gapComposer2);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = EmptyList.INSTANCE;
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            final List list = (List) rememberedValue2;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = InteractiveComponentSizeKt.LocalMinimumInteractiveComponentEnforcement;
            then = modifier.then(MinimumInteractiveModifier.INSTANCE).then(new SizeElement((r13 & 1) != 0 ? Float.NaN : 20.0f, (r13 & 2) != 0 ? Float.NaN : 20.0f, (r13 & 4) != 0 ? Float.NaN : RecyclerView.DECELERATION_RATE, (r13 & 8) != 0 ? Float.NaN : RecyclerView.DECELERATION_RATE, false));
            ClosedFloatRange closedFloatRange = (ClosedFloatRange) closedFloatingPointRange;
            Modifier focusable = CanvasKt.focusable(SemanticsModifierKt.semantics(SemanticsModifierKt.semantics(then, false, new SliderKt$$ExternalSyntheticLambda5(z3, closedFloatingPointRange, RangesKt___RangesKt.coerceIn(f, closedFloatRange._start, closedFloatRange._endInclusive), function1, function0, 0)), true, new ProgressSemanticsKt$$ExternalSyntheticLambda0(f, closedFloatingPointRange, 0)), z3, mutableInteractionSourceImpl);
            final boolean z4 = gapComposer2.consume(CompositionLocalsKt.LocalLayoutDirection) == LayoutDirection.Rtl;
            final boolean z5 = z3;
            z2 = z5;
            gapComposer = gapComposer2;
            OffsetKt.BoxWithConstraints(KeyEventType.onKeyEvent(focusable, new Function1() { // from class: androidx.compose.material.SliderKt$slideOnKeyEvents$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    KeyEvent keyEvent = ((androidx.compose.ui.input.key.KeyEvent) obj).nativeKeyEvent;
                    if (!z5) {
                        return Boolean.FALSE;
                    }
                    int m790getTypeZmokQxo = KeyEventType.m790getTypeZmokQxo(keyEvent);
                    boolean z6 = false;
                    if (m790getTypeZmokQxo != 2) {
                        if (m790getTypeZmokQxo == 1) {
                            long Key = KeyEventType.Key(keyEvent.getKeyCode());
                            if (Key.m771equalsimpl0(Key, Key.DirectionUp) || Key.m771equalsimpl0(Key, Key.DirectionDown) || Key.m771equalsimpl0(Key, Key.DirectionRight) || Key.m771equalsimpl0(Key, Key.DirectionLeft) || Key.m771equalsimpl0(Key, Key.MoveHome) || Key.m771equalsimpl0(Key, Key.MoveEnd) || Key.m771equalsimpl0(Key, Key.PageUp) || Key.m771equalsimpl0(Key, Key.PageDown)) {
                                Function0 function02 = (Function0) rememberUpdatedState2.getValue();
                                if (function02 != null) {
                                    function02.invoke();
                                }
                                z6 = true;
                            }
                        }
                        return Boolean.valueOf(z6);
                    }
                    ClosedFloatingPointRange closedFloatingPointRange2 = closedFloatingPointRange;
                    ClosedFloatRange closedFloatRange2 = (ClosedFloatRange) closedFloatingPointRange2;
                    float f2 = closedFloatRange2._start;
                    float f3 = closedFloatRange2._endInclusive;
                    float abs = Math.abs(f3 - f2) / 100.0f;
                    long Key2 = KeyEventType.Key(keyEvent.getKeyCode());
                    boolean m771equalsimpl0 = Key.m771equalsimpl0(Key2, Key.DirectionUp);
                    float f4 = f;
                    MutableState mutableState = rememberUpdatedState;
                    if (m771equalsimpl0) {
                        ((Function1) mutableState.getValue()).invoke(RangesKt___RangesKt.coerceIn(Float.valueOf(f4 + abs), closedFloatingPointRange2));
                    } else if (Key.m771equalsimpl0(Key2, Key.DirectionDown)) {
                        ((Function1) mutableState.getValue()).invoke(RangesKt___RangesKt.coerceIn(Float.valueOf(f4 - abs), closedFloatingPointRange2));
                    } else {
                        boolean m771equalsimpl02 = Key.m771equalsimpl0(Key2, Key.DirectionRight);
                        boolean z7 = z4;
                        if (m771equalsimpl02) {
                            ((Function1) mutableState.getValue()).invoke(RangesKt___RangesKt.coerceIn(Float.valueOf(((z7 ? -1 : 1) * abs) + f4), closedFloatingPointRange2));
                        } else if (Key.m771equalsimpl0(Key2, Key.DirectionLeft)) {
                            ((Function1) mutableState.getValue()).invoke(RangesKt___RangesKt.coerceIn(Float.valueOf(f4 - ((z7 ? -1 : 1) * abs)), closedFloatingPointRange2));
                        } else if (Key.m771equalsimpl0(Key2, Key.MoveHome)) {
                            ((Function1) mutableState.getValue()).invoke(Float.valueOf(f2));
                        } else if (Key.m771equalsimpl0(Key2, Key.MoveEnd)) {
                            ((Function1) mutableState.getValue()).invoke(Float.valueOf(f3));
                        } else {
                            if (!Key.m771equalsimpl0(Key2, Key.PageUp)) {
                                if (Key.m771equalsimpl0(Key2, Key.PageDown)) {
                                    ((Function1) mutableState.getValue()).invoke(RangesKt___RangesKt.coerceIn(Float.valueOf((RangesKt___RangesKt.coerceIn(10, 1, 10) * abs) + f4), closedFloatingPointRange2));
                                }
                                return Boolean.valueOf(z6);
                            }
                            ((Function1) mutableState.getValue()).invoke(RangesKt___RangesKt.coerceIn(Float.valueOf(f4 - (RangesKt___RangesKt.coerceIn(10, 1, 10) * abs)), closedFloatingPointRange2));
                        }
                    }
                    z6 = true;
                    return Boolean.valueOf(z6);
                }
            }), null, false, Expect_jvmKt.rememberComposableLambda(2085116814, new Function3() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    MutableFloatState mutableFloatState;
                    SliderDraggableState sliderDraggableState;
                    Object obj4;
                    MutableFloatState mutableFloatState2;
                    BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= ((GapComposer) composer2).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                    }
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                        boolean z6 = gapComposer3.consume(CompositionLocalsKt.LocalLayoutDirection) == LayoutDirection.Rtl;
                        float m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(boxWithConstraintsScopeImpl.constraints);
                        Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                        Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                        Density density = (Density) gapComposer3.consume(CompositionLocalsKt.LocalDensity);
                        ref$FloatRef.element = Math.max(m1025getMaxWidthimpl - density.mo236toPx0680j_4(10.0f), RecyclerView.DECELERATION_RATE);
                        ref$FloatRef2.element = Math.min(density.mo236toPx0680j_4(10.0f), ref$FloatRef.element);
                        Object rememberedValue3 = gapComposer3.rememberedValue();
                        Object obj5 = Composer.Companion.Empty;
                        if (rememberedValue3 == obj5) {
                            rememberedValue3 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer3);
                            gapComposer3.updateRememberedValue(rememberedValue3);
                        }
                        Object obj6 = (CoroutineScope) rememberedValue3;
                        Object rememberedValue4 = gapComposer3.rememberedValue();
                        ClosedFloatingPointRange closedFloatingPointRange2 = ClosedFloatingPointRange.this;
                        float f2 = f;
                        if (rememberedValue4 == obj5) {
                            ClosedFloatRange closedFloatRange2 = (ClosedFloatRange) closedFloatingPointRange2;
                            float f3 = closedFloatRange2._start;
                            float f4 = closedFloatRange2._endInclusive;
                            float f5 = ref$FloatRef2.element;
                            float f6 = ref$FloatRef.element;
                            float f7 = f4 - f3;
                            float f8 = f7 == RecyclerView.DECELERATION_RATE ? 0.0f : (f2 - f3) / f7;
                            if (f8 < RecyclerView.DECELERATION_RATE) {
                                f8 = 0.0f;
                            }
                            if (f8 > 1.0f) {
                                f8 = 1.0f;
                            }
                            rememberedValue4 = Recorder$$ExternalSyntheticOutline2.m(TransactorKt.lerp(f5, f6, f8), gapComposer3);
                        }
                        MutableFloatState mutableFloatState3 = (MutableFloatState) rememberedValue4;
                        Object rememberedValue5 = gapComposer3.rememberedValue();
                        if (rememberedValue5 == obj5) {
                            rememberedValue5 = Recorder$$ExternalSyntheticOutline2.m(RecyclerView.DECELERATION_RATE, gapComposer3);
                        }
                        MutableFloatState mutableFloatState4 = (MutableFloatState) rememberedValue5;
                        boolean changed = gapComposer3.changed(ref$FloatRef2.element) | gapComposer3.changed(ref$FloatRef.element) | gapComposer3.changed(closedFloatingPointRange2);
                        Object rememberedValue6 = gapComposer3.rememberedValue();
                        if (changed || rememberedValue6 == obj5) {
                            mutableFloatState = mutableFloatState4;
                            Object sliderDraggableState2 = new SliderDraggableState(new SliderKt$$ExternalSyntheticLambda3(mutableFloatState3, mutableFloatState4, ref$FloatRef2, ref$FloatRef, rememberUpdatedState, closedFloatingPointRange2, 0));
                            gapComposer3.updateRememberedValue(sliderDraggableState2);
                            rememberedValue6 = sliderDraggableState2;
                        } else {
                            mutableFloatState = mutableFloatState4;
                        }
                        SliderDraggableState sliderDraggableState3 = (SliderDraggableState) rememberedValue6;
                        boolean changed2 = gapComposer3.changed(closedFloatingPointRange2) | gapComposer3.changed(ref$FloatRef2.element) | gapComposer3.changed(ref$FloatRef.element);
                        Object rememberedValue7 = gapComposer3.rememberedValue();
                        if (changed2 || rememberedValue7 == obj5) {
                            rememberedValue7 = new SliderKt$Slider$2$2$1(closedFloatingPointRange2, ref$FloatRef2, ref$FloatRef);
                            gapComposer3.updateRememberedValue(rememberedValue7);
                        }
                        SliderKt.CorrectValueSideEffect((Function1) ((KFunction) rememberedValue7), closedFloatingPointRange2, new ClosedFloatRange(ref$FloatRef2.element, ref$FloatRef.element), mutableFloatState3, f2, gapComposer3, 3072);
                        List list2 = list;
                        boolean changedInstance = gapComposer3.changedInstance(list2) | gapComposer3.changed(ref$FloatRef2.element) | gapComposer3.changed(ref$FloatRef.element) | gapComposer3.changedInstance(obj6) | gapComposer3.changedInstance(sliderDraggableState3);
                        Object obj7 = function0;
                        boolean changed3 = changedInstance | gapComposer3.changed(obj7);
                        Object rememberedValue8 = gapComposer3.rememberedValue();
                        if (changed3 || rememberedValue8 == obj5) {
                            sliderDraggableState = sliderDraggableState3;
                            obj4 = obj5;
                            mutableFloatState2 = mutableFloatState3;
                            Object sliderKt$$ExternalSyntheticLambda4 = new SliderKt$$ExternalSyntheticLambda4(mutableFloatState2, list2, ref$FloatRef2, ref$FloatRef, obj6, sliderDraggableState, obj7, 0);
                            gapComposer3.updateRememberedValue(sliderKt$$ExternalSyntheticLambda4);
                            rememberedValue8 = sliderKt$$ExternalSyntheticLambda4;
                        } else {
                            obj4 = obj5;
                            sliderDraggableState = sliderDraggableState3;
                            mutableFloatState2 = mutableFloatState3;
                        }
                        MutableState rememberUpdatedState3 = Updater.rememberUpdatedState((Function1) rememberedValue8, gapComposer3);
                        Object obj8 = obj4;
                        boolean z7 = z5;
                        MutableInteractionSourceImpl mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
                        SliderKt$$ExternalSyntheticLambda9 sliderKt$$ExternalSyntheticLambda9 = new SliderKt$$ExternalSyntheticLambda9(z7, sliderDraggableState, mutableInteractionSourceImpl2, m1025getMaxWidthimpl, z6, mutableFloatState, mutableFloatState2, rememberUpdatedState3);
                        SliderDraggableState sliderDraggableState4 = sliderDraggableState;
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        Modifier composed = PlatformKt.composed(companion, sliderKt$$ExternalSyntheticLambda9);
                        Orientation orientation = Orientation.Horizontal;
                        boolean booleanValue = ((Boolean) sliderDraggableState4.isDragging$delegate.getValue()).booleanValue();
                        boolean changed4 = gapComposer3.changed(rememberUpdatedState3);
                        Object rememberedValue9 = gapComposer3.rememberedValue();
                        if (changed4 || rememberedValue9 == obj8) {
                            rememberedValue9 = new SliderKt$Slider$2$drag$1$1(rememberUpdatedState3, null);
                            gapComposer3.updateRememberedValue(rememberedValue9);
                        }
                        Modifier draggable$default = DraggableKt.draggable$default(companion, sliderDraggableState4, orientation, z7, mutableInteractionSourceImpl2, booleanValue, null, (Function3) rememberedValue9, z6, 32);
                        ClosedFloatRange closedFloatRange3 = (ClosedFloatRange) closedFloatingPointRange2;
                        float f9 = closedFloatRange3._start;
                        float f10 = closedFloatRange3._endInclusive;
                        float coerceIn = RangesKt___RangesKt.coerceIn(f2, f9, f10);
                        float f11 = f10 - f9;
                        float f12 = f11 == RecyclerView.DECELERATION_RATE ? 0.0f : (coerceIn - f9) / f11;
                        if (f12 < RecyclerView.DECELERATION_RATE) {
                            f12 = 0.0f;
                        }
                        SliderKt.SliderImpl(z7, f12 <= 1.0f ? f12 : 1.0f, list2, defaultSliderColors, ref$FloatRef.element - ref$FloatRef2.element, mutableInteractionSourceImpl2, composed.then(draggable$default), gapComposer3, 0);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), gapComposer, 3072, 6);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            z2 = z;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda2(f, function1, modifier, z2, closedFloatingPointRange, function0, defaultSliderColors, i);
        }
    }

    public static final void SliderImpl(final boolean z, final float f, final List list, final DefaultSliderColors defaultSliderColors, final float f2, final MutableInteractionSourceImpl mutableInteractionSourceImpl, final Modifier modifier, Composer composer, final int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1679682785);
        int i2 = i | (gapComposer.changed(z) ? 4 : 2) | (gapComposer.changed(f) ? 32 : 16) | (gapComposer.changedInstance(list) ? 256 : 128) | (gapComposer.changed(defaultSliderColors) ? 2048 : 1024) | (gapComposer.changed(f2) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(mutableInteractionSourceImpl) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changed(modifier) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            Modifier then = modifier.then(DefaultSliderConstraints);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            float mo236toPx0680j_4 = density.mo236toPx0680j_4(4.0f);
            float mo236toPx0680j_42 = density.mo236toPx0680j_4(10.0f);
            float mo232toDpu2uoSUM = density.mo232toDpu2uoSUM(f2) * f;
            int i3 = i2 >> 6;
            int i4 = i2 << 9;
            Track(SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), defaultSliderColors, z, f, list, mo236toPx0680j_42, mo236toPx0680j_4, gapComposer, (i3 & 112) | 3078 | ((i2 << 6) & 896) | (i4 & 57344) | (i4 & 458752));
            m505SliderThumbPcYyNuk(mo232toDpu2uoSUM, mutableInteractionSourceImpl, defaultSliderColors, z, gapComposer, (i3 & 7168) | 1572918 | ((i2 << 3) & 57344) | ((i2 << 15) & 458752));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(z, f, list, defaultSliderColors, f2, mutableInteractionSourceImpl, modifier, i) { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda10
                public final /* synthetic */ boolean f$0;
                public final /* synthetic */ float f$1;
                public final /* synthetic */ List f$2;
                public final /* synthetic */ DefaultSliderColors f$3;
                public final /* synthetic */ float f$4;
                public final /* synthetic */ MutableInteractionSourceImpl f$5;
                public final /* synthetic */ Modifier f$6;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    SliderKt.SliderImpl(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* renamed from: SliderThumb-PcYyNuk, reason: not valid java name */
    public static final void m505SliderThumbPcYyNuk(float f, MutableInteractionSourceImpl mutableInteractionSourceImpl, DefaultSliderColors defaultSliderColors, boolean z, Composer composer, int i) {
        int i2;
        Modifier then;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(428907178);
        int i3 = i & 6;
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        if (i3 == 0) {
            i2 = (gapComposer.changed(boxScopeInstance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i & 48;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i4 == 0) {
            i2 |= gapComposer.changed(companion) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(mutableInteractionSourceImpl) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(defaultSliderColors) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changed(z) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changed(20.0f) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            Modifier align = boxScopeInstance.align(SpacerKt.m302paddingqDBjuR0$default(companion, f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), Alignment.Companion.CenterStart);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, align);
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
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new SnapshotStateList();
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
            boolean z2 = (i2 & 7168) == 2048;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new SliderDefaults$Thumb$1$1(mutableInteractionSourceImpl, snapshotStateList, null, 2);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, mutableInteractionSourceImpl, (Function2) rememberedValue2);
            float f2 = !snapshotStateList.isEmpty() ? 6.0f : 1.0f;
            then = IndicationKt.indication(SizeKt.m287sizeVpY3zN4(companion, 20.0f, 20.0f), mutableInteractionSourceImpl, RippleKt.m500rippleH2RKhps$default(24.0f, 4, 0L, false)).then(new HoverableElement(mutableInteractionSourceImpl));
            if (!z) {
                f2 = RecyclerView.DECELERATION_RATE;
            }
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            Modifier m591shadows4CzXII$default = ShadowKt.m591shadows4CzXII$default(then, f2, roundedCornerShape, false, 24);
            gapComposer.startReplaceGroup(-1733795637);
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(new Color(z ? defaultSliderColors.thumbColor : defaultSliderColors.disabledThumbColor), gapComposer);
            gapComposer.end(false);
            SpacerKt.Spacer(gapComposer, ImageKt.m177backgroundbw27NRU(m591shadows4CzXII$default, ((Color) rememberUpdatedState.getValue()).value, roundedCornerShape));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda11(f, mutableInteractionSourceImpl, defaultSliderColors, z, i);
        }
    }

    public static final void Track(final Modifier modifier, final DefaultSliderColors defaultSliderColors, final boolean z, final float f, final List list, final float f2, final float f3, Composer composer, final int i) {
        int i2;
        final float f4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1833126050);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(defaultSliderColors) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(RecyclerView.DECELERATION_RATE) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(f) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(list) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            f4 = f2;
            i2 |= gapComposer.changed(f4) ? 1048576 : PKIFailureInfo.signerNotTrusted;
        } else {
            f4 = f2;
        }
        if ((12582912 & i) == 0) {
            i2 |= gapComposer.changed(f3) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (4793491 & i3) != 4793490)) {
            final MutableState trackColor = defaultSliderColors.trackColor(z, false, gapComposer);
            final MutableState trackColor2 = defaultSliderColors.trackColor(z, true, gapComposer);
            final MutableState tickColor = defaultSliderColors.tickColor(z, false, gapComposer);
            final MutableState tickColor2 = defaultSliderColors.tickColor(z, true, gapComposer);
            boolean changed = ((i3 & 3670016) == 1048576) | gapComposer.changed(trackColor) | ((29360128 & i3) == 8388608) | ((57344 & i3) == 16384) | ((i3 & 7168) == 2048) | gapComposer.changed(trackColor2) | gapComposer.changedInstance(list) | gapComposer.changed(tickColor) | gapComposer.changed(tickColor2);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                Function1 function1 = new Function1() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        long j;
                        long j2;
                        long j3;
                        DrawScope drawScope = (DrawScope) obj;
                        boolean z2 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                        long mo752getCenterF1C5BW0 = drawScope.mo752getCenterF1C5BW0();
                        long j4 = BodyPartID.bodyIdMax;
                        float intBitsToFloat = Float.intBitsToFloat((int) (mo752getCenterF1C5BW0 & BodyPartID.bodyIdMax));
                        float f5 = f4;
                        long floatToRawIntBits = (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & BodyPartID.bodyIdMax);
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) - f5;
                        long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo752getCenterF1C5BW0() & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
                        if (z2) {
                            j2 = floatToRawIntBits;
                            j = floatToRawIntBits2;
                        } else {
                            j = floatToRawIntBits;
                            j2 = j;
                        }
                        if (!z2) {
                            j2 = floatToRawIntBits2;
                        }
                        long j5 = ((Color) trackColor.getValue()).value;
                        float f6 = f3;
                        drawScope.mo729drawLineNGM6Ib0(j5, j, j2, (r23 & 8) != 0 ? 0.0f : f6, (r23 & 16) != 0 ? 0 : 1, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                        int i4 = (int) (j >> 32);
                        float intBitsToFloat3 = Float.intBitsToFloat(i4);
                        int i5 = (int) (j2 >> 32);
                        float intBitsToFloat4 = Float.intBitsToFloat(i5) - Float.intBitsToFloat(i4);
                        float f7 = f;
                        float f8 = (intBitsToFloat4 * f7) + intBitsToFloat3;
                        long floatToRawIntBits3 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo752getCenterF1C5BW0() & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f8) << 32);
                        float intBitsToFloat5 = ((Float.intBitsToFloat(i5) - Float.intBitsToFloat(i4)) * RecyclerView.DECELERATION_RATE) + Float.intBitsToFloat(i4);
                        long j6 = j;
                        j3 = j2;
                        drawScope.mo729drawLineNGM6Ib0(((Color) trackColor2.getValue()).value, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo752getCenterF1C5BW0() & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat5) << 32), floatToRawIntBits3, (r23 & 8) != 0 ? 0.0f : f6, (r23 & 16) != 0 ? 0 : 1, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                        List list2 = list;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj2 : list2) {
                            float floatValue = ((Number) obj2).floatValue();
                            Boolean valueOf = Boolean.valueOf(floatValue > f7 || floatValue < RecyclerView.DECELERATION_RATE);
                            Object obj3 = linkedHashMap.get(valueOf);
                            if (obj3 == null) {
                                obj3 = new ArrayList();
                                linkedHashMap.put(valueOf, obj3);
                            }
                            ((List) obj3).add(obj2);
                        }
                        Iterator it = linkedHashMap.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
                            List list3 = (List) entry.getValue();
                            ArrayList arrayList = new ArrayList(list3.size());
                            int size = list3.size();
                            int i6 = 0;
                            while (i6 < size) {
                                Iterator it2 = it;
                                float intBitsToFloat6 = Float.intBitsToFloat((int) (Trace.m1192lerpWko1d7g(((Number) list3.get(i6)).floatValue(), j6, j3) >> 32));
                                float intBitsToFloat7 = Float.intBitsToFloat((int) (drawScope.mo752getCenterF1C5BW0() & j4));
                                long j7 = j4;
                                arrayList.add(new Offset((Float.floatToRawIntBits(intBitsToFloat7) & j7) | (Float.floatToRawIntBits(intBitsToFloat6) << 32)));
                                i6++;
                                it = it2;
                                list3 = list3;
                                j4 = j7;
                            }
                            Iterator it3 = it;
                            long j8 = j4;
                            long j9 = j3;
                            drawScope.mo733drawPointsF8ZwMP8(arrayList, ((Color) (booleanValue ? tickColor : tickColor2).getValue()).value, f6);
                            it = it3;
                            j3 = j9;
                            j4 = j8;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(function1);
                rememberedValue = function1;
            }
            CanvasKt.Canvas(i3 & 14, gapComposer, modifier, (Function1) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: androidx.compose.material.SliderKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    SliderKt.Track(Modifier.this, defaultSliderColors, z, f, list, f2, f3, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
