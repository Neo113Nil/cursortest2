package androidx.compose.material3;

import android.view.KeyEvent;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.AccessibilityUtilKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.os.BundleKt;
import androidx.paging.MulticastedPagingData$asPagingData$2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class SliderKt {
    public static final VerticalAlignmentLine CornerSizeAlignmentLine;
    public static final long ThumbSize;
    public static final float ThumbTrackGapSize;
    public static final float ThumbWidth;
    public static final float TrackHeight = SliderTokens.InactiveTrackHeight;
    public static final float TrackInsideCornerSize;

    static {
        float f = SliderTokens.HandleWidth;
        ThumbWidth = f;
        float f2 = SliderTokens.HandleHeight;
        ThumbSize = BundleKt.m1091DpSizeYgX7TsA(f, f2);
        BundleKt.m1091DpSizeYgX7TsA(f2, f);
        ThumbTrackGapSize = 6.0f;
        TrackInsideCornerSize = 2.0f;
        CornerSizeAlignmentLine = new VerticalAlignmentLine(SliderKt$CornerSizeAlignmentLine$1.INSTANCE);
    }

    public static final void Slider(final float f, final Function1 function1, final Modifier modifier, final boolean z, SliderColors sliderColors, final MutableInteractionSourceImpl mutableInteractionSourceImpl, final int i, final ComposableLambdaImpl composableLambdaImpl, final ComposableLambdaImpl composableLambdaImpl2, final ClosedFloatRange closedFloatRange, Composer composer, final int i2, final int i3) {
        int i4;
        SliderColors sliderColors2;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        ComposableLambdaImpl composableLambdaImpl3;
        int i5;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(985901935);
        if ((i2 & 6) == 0) {
            i4 = (gapComposer2.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= gapComposer2.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= gapComposer2.changedInstance(null) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i2) == 0) {
            sliderColors2 = sliderColors;
            i4 |= gapComposer2.changed(sliderColors2) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            sliderColors2 = sliderColors;
        }
        if ((1572864 & i2) == 0) {
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
            i4 |= gapComposer2.changed(mutableInteractionSourceImpl2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        } else {
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
        }
        if ((12582912 & i2) == 0) {
            i4 |= gapComposer2.changed(i) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            composableLambdaImpl3 = composableLambdaImpl;
            i4 |= gapComposer2.changedInstance(composableLambdaImpl3) ? 67108864 : 33554432;
        } else {
            composableLambdaImpl3 = composableLambdaImpl;
        }
        if ((805306368 & i2) == 0) {
            i4 |= gapComposer2.changedInstance(composableLambdaImpl2) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (gapComposer2.changed(closedFloatRange) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if (gapComposer2.shouldExecute(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true)) {
            gapComposer2.startDefaults();
            if ((i2 & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
            }
            gapComposer2.endDefaults();
            boolean z2 = ((29360128 & i4) == 8388608) | ((((i5 & 14) ^ 6) > 4 && gapComposer2.changed(closedFloatRange)) || (i5 & 6) == 4);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SliderState(f, i, closedFloatRange);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            SliderState sliderState = (SliderState) rememberedValue;
            sliderState.getClass();
            sliderState.onValueChange = function1;
            sliderState.setValue(f);
            int i6 = ((i4 >> 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION) | ((i4 >> 6) & 57344);
            int i7 = i4 >> 9;
            gapComposer = gapComposer2;
            Slider(sliderState, modifier, z, null, mutableInteractionSourceImpl2, composableLambdaImpl3, composableLambdaImpl2, gapComposer, i6 | (458752 & i7) | (i7 & 3670016));
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final SliderColors sliderColors3 = sliderColors2;
            endRestartGroup.block = new Function2() { // from class: androidx.compose.material3.SliderKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    SliderKt.Slider(f, function1, modifier, z, sliderColors3, mutableInteractionSourceImpl, i, composableLambdaImpl, composableLambdaImpl2, closedFloatRange, (Composer) obj, Updater.updateChangedFlags(i2 | 1), Updater.updateChangedFlags(i3));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b7, code lost:
    
        if (r3 == r2) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SliderImpl(Modifier modifier, SliderState sliderState, final boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, Composer composer, int i) {
        int i2;
        ComposableLambdaImpl composableLambdaImpl3;
        SliderState sliderState2;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        GapComposer gapComposer;
        Orientation orientation;
        Modifier then;
        Object obj;
        boolean z2;
        ComposableLambdaImpl composableLambdaImpl4 = composableLambdaImpl2;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = sliderState.valueState$delegate;
        final ClosedFloatRange closedFloatRange = sliderState.valueRange;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(898172835);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(sliderState) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(mutableInteractionSourceImpl) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changedInstance(composableLambdaImpl) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changedInstance(composableLambdaImpl4) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i3 = i2;
        int i4 = 0;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 74899) != 74898)) {
            boolean z3 = gapComposer2.consume(CompositionLocalsKt.LocalLayoutDirection) == LayoutDirection.Rtl;
            sliderState.isRtl = z3;
            Orientation orientation2 = sliderState.orientation;
            boolean z4 = orientation2 == Orientation.Horizontal && z3;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier pointerInput = z ? SuspendingPointerInputFilterKt.pointerInput(companion, sliderState, mutableInteractionSourceImpl, new SliderKt$sliderTapModifier$1(sliderState, i4)) : companion;
            Orientation orientation3 = sliderState.orientation;
            boolean booleanValue = ((Boolean) sliderState.isDragging$delegate.getValue()).booleanValue();
            boolean changedInstance = gapComposer2.changedInstance(sliderState);
            Object rememberedValue = gapComposer2.rememberedValue();
            Modifier modifier2 = pointerInput;
            Object obj2 = Composer.Companion.Empty;
            Continuation continuation = null;
            if (changedInstance || rememberedValue == obj2) {
                orientation = orientation3;
                rememberedValue = new MulticastedPagingData$asPagingData$2(sliderState, continuation, 2);
                gapComposer2.updateRememberedValue(rememberedValue);
            } else {
                orientation = orientation3;
            }
            gapComposer = gapComposer2;
            Modifier draggable$default = DraggableKt.draggable$default(companion, sliderState, orientation, z, mutableInteractionSourceImpl, booleanValue, null, (Function3) rememberedValue, z4, 32);
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
            final boolean z5 = z4;
            sliderState2 = sliderState;
            Orientation orientation4 = Orientation.Vertical;
            Modifier wrapContentHeight = orientation2 == orientation4 ? SizeKt.wrapContentHeight(RulerKt.layoutId(companion, SliderComponents.THUMB), Alignment.Companion.CenterVertically, (r2 & 2) == 0) : SizeKt.wrapContentWidth$default(RulerKt.layoutId(companion, SliderComponents.THUMB), null, 3);
            HorizontalAlignmentLine horizontalAlignmentLine = InteractiveComponentSizeKt.MinimumInteractiveTopAlignmentLine;
            Modifier then2 = modifier.then(MinimumInteractiveModifier.INSTANCE);
            float f = ThumbWidth;
            float f2 = TrackHeight;
            then = then2.then(new SizeElement((r13 & 1) != 0 ? Float.NaN : orientation2 == orientation4 ? f2 : f, (r13 & 2) != 0 ? Float.NaN : orientation2 == orientation4 ? f : f2, (r13 & 4) != 0 ? Float.NaN : RecyclerView.DECELERATION_RATE, (r13 & 8) != 0 ? Float.NaN : RecyclerView.DECELERATION_RATE, false));
            Modifier focusable = CanvasKt.focusable(SemanticsModifierKt.semantics(SemanticsModifierKt.semantics(then, false, new SliderKt$$ExternalSyntheticLambda5(z, sliderState2, 0)).then(orientation2 == orientation4 ? AccessibilityUtilKt.IncreaseVerticalSemanticsBounds : AccessibilityUtilKt.IncreaseHorizontalSemanticsBounds), true, new ProgressSemanticsKt$$ExternalSyntheticLambda0(parcelableSnapshotMutableFloatState.getFloatValue(), new ClosedFloatRange(closedFloatRange._start, closedFloatRange._endInclusive), sliderState2.steps)), z, mutableInteractionSourceImpl2);
            final int i5 = sliderState2.steps;
            final float floatValue = parcelableSnapshotMutableFloatState.getFloatValue();
            final Function1 function1 = sliderState2.onValueChange;
            if (i5 < 0) {
                a$$ExternalSyntheticBUOutline0.m$3("steps should be >= 0");
                return;
            }
            Modifier modifier3 = wrapContentHeight;
            Modifier then3 = KeyEventType.onKeyEvent(focusable, new Function1() { // from class: androidx.compose.material3.SliderKt$slideOnKeyEvents$2
                /* JADX WARN: Code restructure failed: missing block: B:63:0x0144, code lost:
                
                    if (androidx.compose.ui.input.key.Key.m771equalsimpl0(r13, androidx.compose.ui.input.key.Key.PageDown) == false) goto L63;
                 */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj3) {
                    Function1 function12;
                    KeyEvent keyEvent = ((androidx.compose.ui.input.key.KeyEvent) obj3).nativeKeyEvent;
                    ClosedFloatRange closedFloatRange2 = closedFloatRange;
                    float f3 = closedFloatRange2._start;
                    float f4 = closedFloatRange2._endInclusive;
                    if (z && (function12 = function1) != null) {
                        int m790getTypeZmokQxo = KeyEventType.m790getTypeZmokQxo(keyEvent);
                        boolean z6 = false;
                        if (m790getTypeZmokQxo != 2) {
                            if (m790getTypeZmokQxo == 1) {
                                long Key = KeyEventType.Key(keyEvent.getKeyCode());
                                if (!Key.m771equalsimpl0(Key, Key.DirectionUp)) {
                                    if (!Key.m771equalsimpl0(Key, Key.DirectionDown)) {
                                        if (!Key.m771equalsimpl0(Key, Key.DirectionRight)) {
                                            if (!Key.m771equalsimpl0(Key, Key.DirectionLeft)) {
                                                if (!Key.m771equalsimpl0(Key, Key.MoveHome)) {
                                                    if (!Key.m771equalsimpl0(Key, Key.MoveEnd)) {
                                                        if (!Key.m771equalsimpl0(Key, Key.PageUp)) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                z6 = true;
                            }
                            return Boolean.valueOf(z6);
                        }
                        float abs = Math.abs(f4 - f3);
                        int i6 = i5;
                        float f5 = abs / (i6 > 0 ? i6 + 1 : 100);
                        int i7 = z5 ? -1 : 1;
                        long Key2 = KeyEventType.Key(keyEvent.getKeyCode());
                        boolean m771equalsimpl0 = Key.m771equalsimpl0(Key2, Key.DirectionUp);
                        float f6 = floatValue;
                        if (m771equalsimpl0) {
                            function12.invoke(RangesKt___RangesKt.coerceIn(Float.valueOf((i7 * f5) + f6), closedFloatRange2));
                        } else if (Key.m771equalsimpl0(Key2, Key.DirectionDown)) {
                            function12.invoke(RangesKt___RangesKt.coerceIn(Float.valueOf(f6 - (i7 * f5)), closedFloatRange2));
                        } else if (Key.m771equalsimpl0(Key2, Key.DirectionRight)) {
                            function12.invoke(RangesKt___RangesKt.coerceIn(Float.valueOf((i7 * f5) + f6), closedFloatRange2));
                        } else if (Key.m771equalsimpl0(Key2, Key.DirectionLeft)) {
                            function12.invoke(RangesKt___RangesKt.coerceIn(Float.valueOf(f6 - (i7 * f5)), closedFloatRange2));
                        } else if (Key.m771equalsimpl0(Key2, Key.MoveHome)) {
                            function12.invoke(Float.valueOf(f3));
                        } else if (Key.m771equalsimpl0(Key2, Key.MoveEnd)) {
                            function12.invoke(Float.valueOf(f4));
                        } else {
                            if (!Key.m771equalsimpl0(Key2, Key.PageUp)) {
                                if (Key.m771equalsimpl0(Key2, Key.PageDown)) {
                                    function12.invoke(RangesKt___RangesKt.coerceIn(Float.valueOf((RangesKt___RangesKt.coerceIn(r5 / 10, 1, 10) * f5) + f6), closedFloatRange2));
                                }
                                return Boolean.valueOf(z6);
                            }
                            function12.invoke(RangesKt___RangesKt.coerceIn(Float.valueOf(f6 - (RangesKt___RangesKt.coerceIn(r5 / 10, 1, 10) * f5)), closedFloatRange2));
                        }
                        z6 = true;
                        return Boolean.valueOf(z6);
                    }
                    return Boolean.FALSE;
                }
            }).then(modifier2).then(draggable$default);
            boolean changedInstance2 = gapComposer.changedInstance(sliderState2);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance2) {
                obj = obj2;
            } else {
                obj = obj2;
            }
            rememberedValue2 = new SliderKt$SliderImpl$2$1(sliderState2, 0);
            gapComposer.updateRememberedValue(rememberedValue2);
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
            int currentCompositeKeyHash = Updater.getCurrentCompositeKeyHash(gapComposer);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then3);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, measurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash, gapComposer, currentCompositeKeyHash, composeUiNode$Companion$SetModifier$13);
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            boolean changedInstance3 = gapComposer.changedInstance(sliderState2);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == obj) {
                z2 = false;
                rememberedValue3 = new SliderKt$$ExternalSyntheticLambda3(sliderState2, 0 == true ? 1 : 0);
                gapComposer.updateRememberedValue(rememberedValue3);
            } else {
                z2 = false;
            }
            Modifier onSizeChanged = RulerKt.onSizeChanged(modifier3, (Function1) rememberedValue3);
            BiasAlignment biasAlignment = Alignment.Companion.TopStart;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z2);
            int currentCompositeKeyHash2 = Updater.getCurrentCompositeKeyHash(gapComposer);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, onSizeChanged);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash2, gapComposer, currentCompositeKeyHash2, composeUiNode$Companion$SetModifier$13);
            }
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            int i6 = (i3 >> 3) & 14;
            composableLambdaImpl3 = composableLambdaImpl;
            composableLambdaImpl3.invoke(sliderState2, gapComposer, Integer.valueOf(((i3 >> 9) & 112) | i6));
            gapComposer.end(true);
            Modifier layoutId = RulerKt.layoutId(companion, SliderComponents.TRACK);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int currentCompositeKeyHash3 = Updater.getCurrentCompositeKeyHash(gapComposer);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, layoutId);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            if (gapComposer.inserting || !Intrinsics.areEqual(gapComposer.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                Recorder$$ExternalSyntheticOutline1.m(currentCompositeKeyHash3, gapComposer, currentCompositeKeyHash3, composeUiNode$Companion$SetModifier$13);
            }
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            composableLambdaImpl4 = composableLambdaImpl2;
            composableLambdaImpl4.invoke(sliderState2, gapComposer, Integer.valueOf(i6 | ((i3 >> 12) & 112)));
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            composableLambdaImpl3 = composableLambdaImpl;
            sliderState2 = sliderState;
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda4(modifier, sliderState2, z, mutableInteractionSourceImpl2, composableLambdaImpl3, composableLambdaImpl4, i);
        }
    }

    public static final float access$snapValueToTick(float f, float f2, float f3, float[] fArr) {
        Float valueOf;
        if (fArr.length == 0) {
            valueOf = null;
        } else {
            float f4 = fArr[0];
            int i = 1;
            int length = fArr.length - 1;
            if (length == 0) {
                valueOf = Float.valueOf(f4);
            } else {
                float abs = Math.abs(TransactorKt.lerp(f2, f3, f4) - f);
                if (1 <= length) {
                    while (true) {
                        float f5 = fArr[i];
                        float abs2 = Math.abs(TransactorKt.lerp(f2, f3, f5) - f);
                        if (Float.compare(abs, abs2) > 0) {
                            f4 = f5;
                            abs = abs2;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                valueOf = Float.valueOf(f4);
            }
        }
        return valueOf != null ? TransactorKt.lerp(f2, f3, valueOf.floatValue()) : f;
    }

    public static final void Slider(float f, Function1 function1, Modifier modifier, boolean z, ClosedFloatRange closedFloatRange, int i, final SliderColors sliderColors, MutableInteractionSourceImpl mutableInteractionSourceImpl, Composer composer, int i2) {
        float f2;
        int i3;
        Function1 function12;
        Modifier modifier2;
        boolean z2;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        final MutableInteractionSourceImpl mutableInteractionSourceImpl3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-202044027);
        if ((i2 & 6) == 0) {
            f2 = f;
            i3 = (gapComposer.changed(f2) ? 4 : 2) | i2;
        } else {
            f2 = f;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            function12 = function1;
            i3 |= gapComposer.changedInstance(function12) ? 32 : 16;
        } else {
            function12 = function1;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int i4 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            i4 |= gapComposer.changed(closedFloatRange) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i2) == 0) {
            i4 |= gapComposer.changed(i) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i5 = i4 | 1572864;
        if ((12582912 & i2) == 0) {
            i5 |= gapComposer.changed(sliderColors) ? 8388608 : 4194304;
        }
        int i6 = i5 | 100663296;
        final boolean z3 = true;
        if (gapComposer.shouldExecute(i6 & 1, (38347923 & i6) != 38347922)) {
            gapComposer.startDefaults();
            if ((i2 & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
                z3 = z;
                mutableInteractionSourceImpl3 = mutableInteractionSourceImpl;
            } else {
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                }
                mutableInteractionSourceImpl3 = (MutableInteractionSourceImpl) rememberedValue;
            }
            gapComposer.endDefaults();
            int i7 = i6 >> 6;
            int i8 = (i6 & 14) | 905969664 | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (57344 & i7) | (458752 & i7) | (i7 & 3670016) | (29360128 & (i6 << 6));
            int i9 = (i6 >> 12) & 14;
            Function1 function13 = function12;
            Modifier modifier3 = modifier2;
            boolean z4 = z3;
            Slider(f2, function13, modifier3, z4, sliderColors, mutableInteractionSourceImpl3, i, Expect_jvmKt.rememberComposableLambda(308249025, new Function3() { // from class: androidx.compose.material3.SliderKt$Slider$2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    SliderDefaults.INSTANCE.m551Thumb9LiSoMs(MutableInteractionSourceImpl.this, null, sliderColors, z3, 0L, (Composer) obj2, 196608);
                    return Unit.INSTANCE;
                }
            }, gapComposer), Expect_jvmKt.rememberComposableLambda(-1843234110, new SliderKt$Slider$3(z3, sliderColors), gapComposer), closedFloatRange, gapComposer, i8, i9);
            z2 = z4;
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl3;
        } else {
            gapComposer.skipToGroupEnd();
            z2 = z;
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda0(f, function1, modifier, z2, closedFloatRange, i, sliderColors, mutableInteractionSourceImpl2, i2);
        }
    }

    public static final void Slider(SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, MutableInteractionSourceImpl mutableInteractionSourceImpl, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, Composer composer, int i) {
        int i2;
        SliderColors sliderColors2;
        int i3;
        SliderColors colors;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(409861960);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(sliderState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(mutableInteractionSourceImpl) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
                i3 = i2 & (-7169);
                colors = sliderColors;
            } else {
                SliderDefaults sliderDefaults = SliderDefaults.INSTANCE;
                i3 = i2 & (-7169);
                colors = SliderDefaults.colors(gapComposer);
            }
            gapComposer.endDefaults();
            if (sliderState.steps >= 0) {
                int i4 = i3 >> 3;
                SliderImpl(modifier, sliderState, z, mutableInteractionSourceImpl, composableLambdaImpl, composableLambdaImpl2, gapComposer, (i3 & 896) | (i4 & 14) | ((i3 << 3) & 112) | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
                sliderColors2 = colors;
            } else {
                a$$ExternalSyntheticBUOutline0.m$3("steps should be >= 0");
                return;
            }
        } else {
            gapComposer.skipToGroupEnd();
            sliderColors2 = sliderColors;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SliderKt$$ExternalSyntheticLambda2(sliderState, modifier, z, sliderColors2, mutableInteractionSourceImpl, composableLambdaImpl, composableLambdaImpl2, i);
        }
    }
}
