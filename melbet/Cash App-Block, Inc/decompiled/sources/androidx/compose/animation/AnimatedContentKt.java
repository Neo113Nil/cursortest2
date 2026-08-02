package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.StateListIterator;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
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

/* loaded from: classes.dex */
public abstract class AnimatedContentKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedContent(final Transition transition, Modifier modifier, Function1 function1, Alignment alignment, Function1 function12, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Alignment alignment2;
        int i5;
        Function1 function13;
        ComposableLambdaImpl composableLambdaImpl2;
        Function1 function14;
        GapComposer gapComposer;
        final Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        MutableScatterMap mutableScatterMap;
        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl;
        Object obj;
        SnapshotStateList snapshotStateList;
        SnapshotStateList snapshotStateList2;
        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl2;
        Transition.DeferredAnimation deferredAnimation;
        boolean z;
        final Function1 function15 = function1;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(511725103);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(transition) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= gapComposer2.changedInstance(function15) ? 256 : 128;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                alignment2 = alignment;
                i3 |= gapComposer2.changed(alignment2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function13 = function12;
                    i3 |= gapComposer2.changedInstance(function13) ? 16384 : PKIFailureInfo.certRevoked;
                    if ((196608 & i) != 0) {
                        composableLambdaImpl2 = composableLambdaImpl;
                        i3 |= gapComposer2.changedInstance(composableLambdaImpl2) ? PKIFailureInfo.unsupportedVersion : 65536;
                    } else {
                        composableLambdaImpl2 = composableLambdaImpl;
                    }
                    if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                        function14 = function15;
                        gapComposer = gapComposer2;
                        gapComposer.skipToGroupEnd();
                        modifier3 = modifier2;
                    } else {
                        Modifier modifier4 = Modifier.Companion.$$INSTANCE;
                        Modifier modifier5 = i6 != 0 ? modifier4 : modifier2;
                        if (i4 != 0) {
                            alignment2 = Alignment.Companion.TopStart;
                        }
                        Object obj2 = Composer.Companion.Empty;
                        if (i5 != 0) {
                            Object rememberedValue = gapComposer2.rememberedValue();
                            if (rememberedValue == obj2) {
                                rememberedValue = CrossfadeKt$Crossfade$3$1.INSTANCE$2;
                                gapComposer2.updateRememberedValue(rememberedValue);
                            }
                            function13 = (Function1) rememberedValue;
                        }
                        LayoutDirection layoutDirection = (LayoutDirection) gapComposer2.consume(CompositionLocalsKt.LocalLayoutDirection);
                        int i7 = i3 & 14;
                        boolean z2 = i7 == 4;
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (z2 || rememberedValue2 == obj2) {
                            rememberedValue2 = new AnimatedContentTransitionScopeImpl(transition, alignment2, layoutDirection);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl3 = (AnimatedContentTransitionScopeImpl) rememberedValue2;
                        boolean z3 = i7 == 4;
                        Object rememberedValue3 = gapComposer2.rememberedValue();
                        Object obj3 = rememberedValue3;
                        if (z3 || rememberedValue3 == obj2) {
                            Object[] objArr = {transition.transitionState.getCurrentState()};
                            SnapshotStateList snapshotStateList3 = new SnapshotStateList();
                            snapshotStateList3.addAll(ArraysKt___ArraysKt.toList(objArr));
                            gapComposer2.updateRememberedValue(snapshotStateList3);
                            obj3 = snapshotStateList3;
                        }
                        SnapshotStateList snapshotStateList4 = (SnapshotStateList) obj3;
                        boolean z4 = i7 == 4;
                        Object rememberedValue4 = gapComposer2.rememberedValue();
                        if (z4 || rememberedValue4 == obj2) {
                            long[] jArr = ScatterMapKt.EmptyGroup;
                            rememberedValue4 = new MutableScatterMap();
                            gapComposer2.updateRememberedValue(rememberedValue4);
                        }
                        MutableScatterMap mutableScatterMap2 = (MutableScatterMap) rememberedValue4;
                        InteractionResult interactionResult = transition.transitionState;
                        ParcelableSnapshotMutableState parcelableSnapshotMutableState = transition.targetState$delegate;
                        if (!snapshotStateList4.contains(interactionResult.getCurrentState())) {
                            snapshotStateList4.clear();
                            snapshotStateList4.add(interactionResult.getCurrentState());
                        }
                        if (Intrinsics.areEqual(interactionResult.getCurrentState(), parcelableSnapshotMutableState.getValue())) {
                            if (snapshotStateList4.size() != 1 || !Intrinsics.areEqual(snapshotStateList4.get(0), interactionResult.getCurrentState())) {
                                snapshotStateList4.clear();
                                snapshotStateList4.add(interactionResult.getCurrentState());
                            }
                            if (mutableScatterMap2._size != 1 || mutableScatterMap2.containsKey(interactionResult.getCurrentState())) {
                                mutableScatterMap2.clear();
                            }
                            animatedContentTransitionScopeImpl3.contentAlignment = alignment2;
                            animatedContentTransitionScopeImpl3.layoutDirection = layoutDirection;
                        }
                        if (!Intrinsics.areEqual(interactionResult.getCurrentState(), parcelableSnapshotMutableState.getValue()) && !snapshotStateList4.contains(parcelableSnapshotMutableState.getValue())) {
                            ListIterator listIterator = snapshotStateList4.listIterator();
                            int i8 = 0;
                            while (true) {
                                StateListIterator stateListIterator = (StateListIterator) listIterator;
                                ListIterator listIterator2 = listIterator;
                                if (!stateListIterator.hasNext()) {
                                    i8 = -1;
                                    break;
                                } else {
                                    if (Intrinsics.areEqual(function13.invoke(stateListIterator.next()), function13.invoke(parcelableSnapshotMutableState.getValue()))) {
                                        break;
                                    }
                                    i8++;
                                    listIterator = listIterator2;
                                }
                            }
                            if (i8 == -1) {
                                snapshotStateList4.add(parcelableSnapshotMutableState.getValue());
                            } else {
                                snapshotStateList4.set(i8, parcelableSnapshotMutableState.getValue());
                            }
                        }
                        if (mutableScatterMap2.containsKey(parcelableSnapshotMutableState.getValue()) && mutableScatterMap2.containsKey(interactionResult.getCurrentState())) {
                            gapComposer2.startReplaceGroup(1968995539);
                            gapComposer2.end(false);
                            mutableScatterMap = mutableScatterMap2;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl3;
                            function14 = function15;
                            obj = obj2;
                            snapshotStateList = snapshotStateList4;
                        } else {
                            gapComposer2.startReplaceGroup(1966410449);
                            mutableScatterMap2.clear();
                            int size = snapshotStateList4.size();
                            int i9 = 0;
                            while (i9 < size) {
                                int i10 = i9;
                                final Object obj4 = snapshotStateList4.get(i10);
                                MutableScatterMap mutableScatterMap3 = mutableScatterMap2;
                                final SnapshotStateList snapshotStateList5 = snapshotStateList4;
                                Object obj5 = obj2;
                                final AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl4 = animatedContentTransitionScopeImpl3;
                                final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
                                mutableScatterMap3.set(obj4, Expect_jvmKt.rememberComposableLambda(-23915175, new Function2() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj6, Object obj7) {
                                        Composer composer2 = (Composer) obj6;
                                        int intValue = ((Number) obj7).intValue();
                                        int i11 = 0;
                                        GapComposer gapComposer3 = (GapComposer) composer2;
                                        if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            Object rememberedValue5 = gapComposer3.rememberedValue();
                                            Function1 function16 = function15;
                                            final AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl5 = animatedContentTransitionScopeImpl4;
                                            Object obj8 = Composer.Companion.Empty;
                                            if (rememberedValue5 == obj8) {
                                                rememberedValue5 = (ContentTransform) function16.invoke(animatedContentTransitionScopeImpl5);
                                                gapComposer3.updateRememberedValue(rememberedValue5);
                                            }
                                            ContentTransform contentTransform = (ContentTransform) rememberedValue5;
                                            Transition transition2 = Transition.this;
                                            Transition.Segment segment = transition2.getSegment();
                                            ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = transition2.targetState$delegate;
                                            Object targetState = segment.getTargetState();
                                            final Object obj9 = obj4;
                                            boolean changed = gapComposer3.changed(Intrinsics.areEqual(targetState, obj9));
                                            Object rememberedValue6 = gapComposer3.rememberedValue();
                                            if (changed || rememberedValue6 == obj8) {
                                                rememberedValue6 = Intrinsics.areEqual(transition2.getSegment().getTargetState(), obj9) ? ExitTransitionImpl.None : ((ContentTransform) function16.invoke(animatedContentTransitionScopeImpl5)).initialContentExit;
                                                gapComposer3.updateRememberedValue(rememberedValue6);
                                            }
                                            final ExitTransitionImpl exitTransitionImpl = (ExitTransitionImpl) rememberedValue6;
                                            Object rememberedValue7 = gapComposer3.rememberedValue();
                                            if (rememberedValue7 == obj8) {
                                                rememberedValue7 = new AnimatedContentTransitionScopeImpl.ChildData(Intrinsics.areEqual(obj9, parcelableSnapshotMutableState2.getValue()));
                                                gapComposer3.updateRememberedValue(rememberedValue7);
                                            }
                                            AnimatedContentTransitionScopeImpl.ChildData childData = (AnimatedContentTransitionScopeImpl.ChildData) rememberedValue7;
                                            EnterTransitionImpl enterTransitionImpl = contentTransform.targetContentEnter;
                                            boolean changedInstance = gapComposer3.changedInstance(contentTransform);
                                            Object rememberedValue8 = gapComposer3.rememberedValue();
                                            if (changedInstance || rememberedValue8 == obj8) {
                                                rememberedValue8 = new AnimatedContentKt$AnimatedContent$6$1$1$1(contentTransform, i11);
                                                gapComposer3.updateRememberedValue(rememberedValue8);
                                            }
                                            Modifier layout = ValueInsets.layout(Modifier.Companion.$$INSTANCE, (Function3) rememberedValue8);
                                            childData.isTarget$delegate.setValue(Boolean.valueOf(Intrinsics.areEqual(obj9, parcelableSnapshotMutableState2.getValue())));
                                            Modifier then = layout.then(childData);
                                            boolean changedInstance2 = gapComposer3.changedInstance(obj9);
                                            Object rememberedValue9 = gapComposer3.rememberedValue();
                                            if (changedInstance2 || rememberedValue9 == obj8) {
                                                rememberedValue9 = new AnimatedEnterExitMeasurePolicy$measure$1(obj9, 1);
                                                gapComposer3.updateRememberedValue(rememberedValue9);
                                            }
                                            Function1 function17 = (Function1) rememberedValue9;
                                            boolean changed2 = gapComposer3.changed(exitTransitionImpl);
                                            Object rememberedValue10 = gapComposer3.rememberedValue();
                                            if (changed2 || rememberedValue10 == obj8) {
                                                rememberedValue10 = new Function2() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj10, Object obj11) {
                                                        EnterExitState enterExitState = (EnterExitState) obj10;
                                                        EnterExitState enterExitState2 = (EnterExitState) obj11;
                                                        EnterExitState enterExitState3 = EnterExitState.PostExit;
                                                        return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !ExitTransitionImpl.this.data.hold);
                                                    }
                                                };
                                                gapComposer3.updateRememberedValue(rememberedValue10);
                                            }
                                            Function2 function2 = (Function2) rememberedValue10;
                                            final SnapshotStateList snapshotStateList6 = snapshotStateList5;
                                            final ComposableLambdaImpl composableLambdaImpl4 = composableLambdaImpl3;
                                            AnimatedContentKt.AnimatedEnterExitImpl(Transition.this, function17, then, enterTransitionImpl, exitTransitionImpl, function2, Expect_jvmKt.rememberComposableLambda(-143346359, new Function3() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public final Object invoke(Object obj10, Object obj11, Object obj12) {
                                                    AnimatedVisibilityScope animatedVisibilityScope = (AnimatedVisibilityScope) obj10;
                                                    Composer composer3 = (Composer) obj11;
                                                    int intValue2 = ((Number) obj12).intValue();
                                                    if ((intValue2 & 6) == 0) {
                                                        intValue2 |= (intValue2 & 8) == 0 ? ((GapComposer) composer3).changed(animatedVisibilityScope) : ((GapComposer) composer3).changedInstance(animatedVisibilityScope) ? 4 : 2;
                                                    }
                                                    int i12 = 1;
                                                    GapComposer gapComposer4 = (GapComposer) composer3;
                                                    if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                                        SnapshotStateList snapshotStateList7 = SnapshotStateList.this;
                                                        boolean changed3 = gapComposer4.changed(snapshotStateList7);
                                                        Object obj13 = obj9;
                                                        boolean changedInstance3 = changed3 | gapComposer4.changedInstance(obj13);
                                                        AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl6 = animatedContentTransitionScopeImpl5;
                                                        boolean changedInstance4 = changedInstance3 | gapComposer4.changedInstance(animatedContentTransitionScopeImpl6);
                                                        Object rememberedValue11 = gapComposer4.rememberedValue();
                                                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                                        if (changedInstance4 || rememberedValue11 == neverEqualPolicy) {
                                                            rememberedValue11 = new FocusOwnerImpl$focusSearch$1(i12, snapshotStateList7, obj13, animatedContentTransitionScopeImpl6);
                                                            gapComposer4.updateRememberedValue(rememberedValue11);
                                                        }
                                                        Updater.DisposableEffect(animatedVisibilityScope, (Function1) rememberedValue11, gapComposer4);
                                                        MutableScatterMap mutableScatterMap4 = animatedContentTransitionScopeImpl6.targetSizeMap;
                                                        animatedVisibilityScope.getClass();
                                                        mutableScatterMap4.set(obj13, ((AnimatedVisibilityScopeImpl) animatedVisibilityScope).targetSize);
                                                        Object rememberedValue12 = gapComposer4.rememberedValue();
                                                        if (rememberedValue12 == neverEqualPolicy) {
                                                            rememberedValue12 = new AnimatedContentScopeImpl(animatedVisibilityScope);
                                                            gapComposer4.updateRememberedValue(rememberedValue12);
                                                        }
                                                        composableLambdaImpl4.invoke(rememberedValue12, obj13, (Object) gapComposer4, (Object) 0);
                                                    } else {
                                                        gapComposer4.skipToGroupEnd();
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, gapComposer3), gapComposer3, 12582912);
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }, gapComposer2));
                                i9 = i10 + 1;
                                animatedContentTransitionScopeImpl3 = animatedContentTransitionScopeImpl4;
                                mutableScatterMap2 = mutableScatterMap3;
                                snapshotStateList4 = snapshotStateList5;
                                function15 = function15;
                                obj2 = obj5;
                                size = size;
                                composableLambdaImpl2 = composableLambdaImpl;
                            }
                            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl5 = animatedContentTransitionScopeImpl3;
                            mutableScatterMap = mutableScatterMap2;
                            animatedContentTransitionScopeImpl = animatedContentTransitionScopeImpl5;
                            function14 = function15;
                            obj = obj2;
                            snapshotStateList = snapshotStateList4;
                            gapComposer2.end(false);
                        }
                        boolean changed = gapComposer2.changed(transition.getSegment()) | gapComposer2.changed(animatedContentTransitionScopeImpl);
                        Object rememberedValue5 = gapComposer2.rememberedValue();
                        if (changed || rememberedValue5 == obj) {
                            rememberedValue5 = (ContentTransform) function14.invoke(animatedContentTransitionScopeImpl);
                            gapComposer2.updateRememberedValue(rememberedValue5);
                        }
                        ContentTransform contentTransform = (ContentTransform) rememberedValue5;
                        Transition transition2 = animatedContentTransitionScopeImpl.transition;
                        boolean changed2 = gapComposer2.changed(animatedContentTransitionScopeImpl);
                        Object rememberedValue6 = gapComposer2.rememberedValue();
                        if (changed2 || rememberedValue6 == obj) {
                            rememberedValue6 = Updater.mutableStateOf$default(Boolean.FALSE);
                            gapComposer2.updateRememberedValue(rememberedValue6);
                        }
                        MutableState mutableState = (MutableState) rememberedValue6;
                        MutableState rememberUpdatedState = Updater.rememberUpdatedState(contentTransform.sizeTransform, gapComposer2);
                        if (Intrinsics.areEqual(transition2.transitionState.getCurrentState(), transition2.targetState$delegate.getValue())) {
                            mutableState.setValue(Boolean.FALSE);
                        } else if (rememberUpdatedState.getValue() != null) {
                            mutableState.setValue(Boolean.TRUE);
                        }
                        if (((Boolean) mutableState.getValue()).booleanValue()) {
                            gapComposer2.startReplaceGroup(1353077497);
                            AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl6 = animatedContentTransitionScopeImpl;
                            snapshotStateList2 = snapshotStateList;
                            gapComposer = gapComposer2;
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl6;
                            deferredAnimation = AnimatableKt.createDeferredAnimation(animatedContentTransitionScopeImpl6.transition, AnimatableKt.IntSizeToVector, null, gapComposer, 0, 2);
                            boolean changed3 = gapComposer.changed(deferredAnimation);
                            Object rememberedValue7 = gapComposer.rememberedValue();
                            if (changed3 || rememberedValue7 == obj) {
                                SizeTransformImpl sizeTransformImpl = (SizeTransformImpl) rememberUpdatedState.getValue();
                                if (sizeTransformImpl == null || sizeTransformImpl.clip) {
                                    modifier4 = ClipKt.clipToBounds(modifier4);
                                }
                                gapComposer.updateRememberedValue(modifier4);
                                rememberedValue7 = modifier4;
                            }
                            modifier4 = (Modifier) rememberedValue7;
                            gapComposer.end(false);
                        } else {
                            snapshotStateList2 = snapshotStateList;
                            gapComposer = gapComposer2;
                            animatedContentTransitionScopeImpl2 = animatedContentTransitionScopeImpl;
                            gapComposer.startReplaceGroup(1353343539);
                            gapComposer.end(false);
                            animatedContentTransitionScopeImpl2.animatedSize = null;
                            deferredAnimation = null;
                        }
                        Modifier then = modifier5.then(modifier4.then(new AnimatedContentTransitionScopeImpl.SizeModifierElement(deferredAnimation, rememberUpdatedState, animatedContentTransitionScopeImpl2)));
                        Object rememberedValue8 = gapComposer.rememberedValue();
                        if (rememberedValue8 == obj) {
                            rememberedValue8 = new AnimatedContentMeasurePolicy(animatedContentTransitionScopeImpl2);
                            gapComposer.updateRememberedValue(rememberedValue8);
                        }
                        AnimatedContentMeasurePolicy animatedContentMeasurePolicy = (AnimatedContentMeasurePolicy) rememberedValue8;
                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then);
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
                        Updater.m576setimpl(gapComposer, animatedContentMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        gapComposer.startReplaceGroup(-860173498);
                        int size2 = snapshotStateList2.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            SnapshotStateList snapshotStateList6 = snapshotStateList2;
                            Object obj6 = snapshotStateList6.get(i11);
                            gapComposer.startMovableGroup(-2026002954, function13.invoke(obj6));
                            Function2 function2 = (Function2) mutableScatterMap.get(obj6);
                            if (function2 == null) {
                                gapComposer.startReplaceGroup(1618454323);
                                z = false;
                            } else {
                                z = false;
                                gapComposer.startReplaceGroup(-2026001778);
                                function2.invoke(gapComposer, 0);
                            }
                            gapComposer.end(z);
                            gapComposer.end(z);
                            i11++;
                            snapshotStateList2 = snapshotStateList6;
                        }
                        gapComposer.end(false);
                        gapComposer.end(true);
                        modifier3 = modifier5;
                    }
                    final Alignment alignment3 = alignment2;
                    final Function1 function16 = function13;
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Function1 function17 = function14;
                        endRestartGroup.block = new Function2() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj7, Object obj8) {
                                ((Number) obj8).intValue();
                                AnimatedContentKt.AnimatedContent(Transition.this, modifier3, function17, alignment3, function16, composableLambdaImpl, (Composer) obj7, Updater.updateChangedFlags(i | 1), i2);
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
                function13 = function12;
                if ((196608 & i) != 0) {
                }
                if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                }
                final Alignment alignment32 = alignment2;
                final Function1 function162 = function13;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            alignment2 = alignment;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function13 = function12;
            if ((196608 & i) != 0) {
            }
            if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
            }
            final Alignment alignment322 = alignment2;
            final Function1 function1622 = function13;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        alignment2 = alignment;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function13 = function12;
        if ((196608 & i) != 0) {
        }
        if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
        }
        final Alignment alignment3222 = alignment2;
        final Function1 function16222 = function13;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void AnimatedEnterExitImpl(final Transition transition, final Function1 function1, final Modifier modifier, final EnterTransitionImpl enterTransitionImpl, final ExitTransitionImpl exitTransitionImpl, final Function2 function2, final Function3 function3, Composer composer, final int i) {
        int i2;
        GapComposer gapComposer;
        ExitTransitionImpl exitTransitionImpl2;
        int i3;
        boolean z;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1912839215);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(transition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(enterTransitionImpl) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer2.changed(exitTransitionImpl) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer2.changedInstance(function2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i4 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i4 |= gapComposer2.changedInstance(function3) ? 8388608 : 4194304;
        }
        int i5 = i4;
        if (gapComposer2.shouldExecute(i5 & 1, (i5 & 4793491) != 4793490)) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = transition.targetState$delegate;
            InteractionResult interactionResult = transition.transitionState;
            if (((Boolean) function1.invoke(parcelableSnapshotMutableState.getValue())).booleanValue() || ((Boolean) function1.invoke(interactionResult.getCurrentState())).booleanValue() || transition.isSeeking() || transition.getHasInitialValueAnimations()) {
                gapComposer2.startReplaceGroup(-232386135);
                int i6 = i5 & 14;
                int i7 = i6 | 48;
                int i8 = i7 & 14;
                boolean z2 = ((i8 ^ 6) > 4 && gapComposer2.changed(transition)) || (i7 & 6) == 4;
                Object rememberedValue = gapComposer2.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (z2 || rememberedValue == neverEqualPolicy) {
                    rememberedValue = interactionResult.getCurrentState();
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                if (transition.isSeeking()) {
                    rememberedValue = interactionResult.getCurrentState();
                }
                gapComposer2.startReplaceGroup(1844425648);
                EnterExitState targetEnterExit = targetEnterExit(transition, function1, rememberedValue, gapComposer2);
                gapComposer2.end(false);
                Object value = transition.targetState$delegate.getValue();
                gapComposer2.startReplaceGroup(1844425648);
                EnterExitState targetEnterExit2 = targetEnterExit(transition, function1, value, gapComposer2);
                gapComposer2.end(false);
                Transition createChildTransitionInternal = AnimatableKt.createChildTransitionInternal(transition, targetEnterExit, targetEnterExit2, "EnterExitTransition", gapComposer2, i8 | 3072);
                EnterTransitionImpl trackActiveEnter = EnterExitTransitionKt.trackActiveEnter(createChildTransitionInternal, enterTransitionImpl, gapComposer2, (i5 >> 6) & 112);
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = createChildTransitionInternal.targetState$delegate;
                InteractionResult interactionResult2 = createChildTransitionInternal.transitionState;
                ExitTransitionImpl trackActiveExit = EnterExitTransitionKt.trackActiveExit(createChildTransitionInternal, exitTransitionImpl, gapComposer2, (i5 >> 9) & 112);
                MutableState rememberUpdatedState = Updater.rememberUpdatedState(function2, gapComposer2);
                Object invoke = function2.invoke(interactionResult2.getCurrentState(), parcelableSnapshotMutableState2.getValue());
                boolean changed = gapComposer2.changed(createChildTransitionInternal) | gapComposer2.changed(rememberUpdatedState);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                Continuation continuation = null;
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    exitTransitionImpl2 = trackActiveExit;
                    i3 = 1;
                    rememberedValue2 = new DataStoreImpl$data$1(createChildTransitionInternal, rememberUpdatedState, continuation, i3);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                } else {
                    exitTransitionImpl2 = trackActiveExit;
                    i3 = 1;
                }
                MutableState produceState = Updater.produceState(gapComposer2, invoke, (Function2) rememberedValue2);
                Object currentState = interactionResult2.getCurrentState();
                EnterExitState enterExitState = EnterExitState.PostExit;
                if (currentState == enterExitState && parcelableSnapshotMutableState2.getValue() == enterExitState && ((Boolean) produceState.getValue()).booleanValue()) {
                    gapComposer2.startReplaceGroup(-229368781);
                    gapComposer2.end(false);
                    z = false;
                    gapComposer = gapComposer2;
                } else {
                    gapComposer2.startReplaceGroup(-230699766);
                    int i9 = i6 == 4 ? i3 : 0;
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (i9 != 0 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new AnimatedVisibilityScopeImpl(createChildTransitionInternal);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl = (AnimatedVisibilityScopeImpl) rememberedValue3;
                    z = false;
                    Modifier createModifier = EnterExitTransitionKt.createModifier(createChildTransitionInternal, trackActiveEnter, exitTransitionImpl2, null, "Built-in", gapComposer2, 199680, 8);
                    gapComposer = gapComposer2;
                    gapComposer.startReplaceGroup(-7404393);
                    gapComposer.end(false);
                    Modifier then = modifier.then(createModifier.then(Modifier.Companion.$$INSTANCE));
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new AnimatedEnterExitMeasurePolicy(animatedVisibilityScopeImpl);
                        gapComposer.updateRememberedValue(rememberedValue4);
                    }
                    AnimatedEnterExitMeasurePolicy animatedEnterExitMeasurePolicy = (AnimatedEnterExitMeasurePolicy) rememberedValue4;
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
                    Updater.m576setimpl(gapComposer, animatedEnterExitMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    function3.invoke(animatedVisibilityScopeImpl, gapComposer, Integer.valueOf((i5 >> 18) & 112));
                    gapComposer.end(true);
                    gapComposer.end(false);
                }
                gapComposer.end(z);
            } else {
                gapComposer2.startReplaceGroup(-229362829);
                gapComposer2.end(false);
                gapComposer = gapComposer2;
            }
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    AnimatedContentKt.AnimatedEnterExitImpl(Transition.this, function1, modifier, enterTransitionImpl, exitTransitionImpl, function2, function3, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(boolean z, Modifier modifier, EnterTransitionImpl enterTransitionImpl, ExitTransitionImpl exitTransitionImpl, String str, Function3 function3, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        EnterTransitionImpl enterTransitionImpl2;
        int i5;
        ExitTransitionImpl exitTransitionImpl2;
        int i6;
        Modifier modifier3;
        EnterTransitionImpl enterTransitionImpl3;
        ExitTransitionImpl exitTransitionImpl3;
        String str2;
        RecomposeScopeImpl endRestartGroup;
        EnterTransitionImpl enterTransitionImpl4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1448730565);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                enterTransitionImpl2 = enterTransitionImpl;
                i3 |= gapComposer.changed(enterTransitionImpl2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    exitTransitionImpl2 = exitTransitionImpl;
                    i3 |= gapComposer.changed(exitTransitionImpl2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= gapComposer.changed(str) ? 16384 : PKIFailureInfo.certRevoked;
                        if ((196608 & i) == 0) {
                            i3 |= gapComposer.changedInstance(function3) ? PKIFailureInfo.unsupportedVersion : 65536;
                        }
                        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
                            Modifier modifier4 = i7 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                            if (i4 != 0) {
                                EnterTransitionImpl fadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 3);
                                Rect rect = VisibilityThresholdsKt.RectVisibilityThreshold;
                                enterTransitionImpl4 = fadeIn$default.plus(EnterExitTransitionKt.expandIn(AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, new IntSize(4294967297L), 1), Alignment.Companion.BottomEnd, CrossfadeKt$Crossfade$3$1.INSTANCE$11, true));
                            } else {
                                enterTransitionImpl4 = enterTransitionImpl2;
                            }
                            ExitTransitionImpl plus = i5 != 0 ? EnterExitTransitionKt.shrinkOut$default().plus(EnterExitTransitionKt.fadeOut$default(null, 3)) : exitTransitionImpl2;
                            String str3 = i6 != 0 ? "AnimatedVisibility" : str;
                            Transition updateTransition = AnimatableKt.updateTransition(Boolean.valueOf(z), str3, gapComposer, (i3 & 14) | ((i3 >> 9) & 112), 0);
                            Object rememberedValue = gapComposer.rememberedValue();
                            if (rememberedValue == Composer.Companion.Empty) {
                                rememberedValue = CrossfadeKt$Crossfade$3$1.INSTANCE$4;
                                gapComposer.updateRememberedValue(rememberedValue);
                            }
                            Function1 function1 = (Function1) rememberedValue;
                            int i8 = i3 << 3;
                            AnimatedVisibilityImpl(updateTransition, function1, modifier4, enterTransitionImpl4, plus, function3, gapComposer, (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | (i3 & 458752));
                            str2 = str3;
                            modifier3 = modifier4;
                            enterTransitionImpl3 = enterTransitionImpl4;
                            exitTransitionImpl3 = plus;
                        } else {
                            gapComposer.skipToGroupEnd();
                            modifier3 = modifier2;
                            enterTransitionImpl3 = enterTransitionImpl2;
                            exitTransitionImpl3 = exitTransitionImpl2;
                            str2 = str;
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.block = new AnimatedVisibilityKt$AnimatedVisibility$2(z, modifier3, enterTransitionImpl3, exitTransitionImpl3, str2, function3, i, i2, 0);
                            return;
                        }
                        return;
                    }
                    if ((196608 & i) == 0) {
                    }
                    if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransitionImpl2 = exitTransitionImpl;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                if ((196608 & i) == 0) {
                }
                if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            enterTransitionImpl2 = enterTransitionImpl;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            exitTransitionImpl2 = exitTransitionImpl;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        enterTransitionImpl2 = enterTransitionImpl;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        exitTransitionImpl2 = exitTransitionImpl;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void AnimatedVisibilityImpl(final Transition transition, final Function1 function1, Modifier modifier, EnterTransitionImpl enterTransitionImpl, ExitTransitionImpl exitTransitionImpl, Function3 function3, Composer composer, int i) {
        int i2;
        EnterTransitionImpl enterTransitionImpl2;
        ExitTransitionImpl exitTransitionImpl2;
        Function3 function32;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1706321816);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(transition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            enterTransitionImpl2 = enterTransitionImpl;
            i2 |= gapComposer.changed(enterTransitionImpl2) ? 2048 : 1024;
        } else {
            enterTransitionImpl2 = enterTransitionImpl;
        }
        if ((i & 24576) == 0) {
            exitTransitionImpl2 = exitTransitionImpl;
            i2 |= gapComposer.changed(exitTransitionImpl2) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            exitTransitionImpl2 = exitTransitionImpl;
        }
        if ((i & 196608) == 0) {
            function32 = function3;
            i2 |= gapComposer.changedInstance(function32) ? PKIFailureInfo.unsupportedVersion : 65536;
        } else {
            function32 = function3;
        }
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new Function3() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        long j;
                        MeasureScope measureScope = (MeasureScope) obj;
                        Placeable mo833measureBRTryo0 = ((Measurable) obj2).mo833measureBRTryo0(((Constraints) obj3).value);
                        if (measureScope.isLookingAhead()) {
                            if (!((Boolean) Function1.this.invoke(transition.targetState$delegate.getValue())).booleanValue()) {
                                j = 0;
                                return MeasureScope.layout$default(measureScope, (int) (j >> 32), (int) (BodyPartID.bodyIdMax & j), new SkipToLookaheadSizeNode$measure$1$1(mo833measureBRTryo0, 1));
                            }
                        }
                        j = (mo833measureBRTryo0.width << 32) | (mo833measureBRTryo0.height & BodyPartID.bodyIdMax);
                        return MeasureScope.layout$default(measureScope, (int) (j >> 32), (int) (BodyPartID.bodyIdMax & j), new SkipToLookaheadSizeNode$measure$1$1(mo833measureBRTryo0, 1));
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier layout = ValueInsets.layout(modifier, (Function3) rememberedValue);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1.INSTANCE;
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            AnimatedEnterExitImpl(transition, function1, layout, enterTransitionImpl2, exitTransitionImpl2, (Function2) rememberedValue2, function32, gapComposer, 196608 | i4 | i3 | (i2 & 7168) | (57344 & i2) | ((i2 << 6) & 29360128));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AnimatedVisibilityKt$AnimatedVisibility$13(transition, function1, modifier, enterTransitionImpl, exitTransitionImpl, function3, i, 1);
        }
    }

    public static SizeTransformImpl SizeTransform$default(int i, Function2 function2) {
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            function2 = AnimatedContentKt$SizeTransform$1.INSTANCE;
        }
        return new SizeTransformImpl(z, function2);
    }

    public static Modifier animateContentSize$default(Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, int i) {
        if ((i & 1) != 0) {
            Rect rect = VisibilityThresholdsKt.RectVisibilityThreshold;
            finiteAnimationSpec = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 400.0f, new IntSize(4294967297L), 1);
        }
        return ClipKt.clipToBounds(modifier).then(new SizeAnimationModifierElement(finiteAnimationSpec));
    }

    /* renamed from: isValid-ozmzZPI, reason: not valid java name */
    public static final boolean m137isValidozmzZPI(long j) {
        return !IntSize.m1055equalsimpl0(j, -9223372034707292160L);
    }

    public static final EnterExitState targetEnterExit(Transition transition, Function1 function1, Object obj, Composer composer) {
        EnterExitState enterExitState;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startMovableGroup(-422486745, transition);
        boolean isSeeking = transition.isSeeking();
        InteractionResult interactionResult = transition.transitionState;
        if (isSeeking) {
            gapComposer.startReplaceGroup(-212166497);
            gapComposer.end(false);
            enterExitState = ((Boolean) function1.invoke(obj)).booleanValue() ? EnterExitState.Visible : ((Boolean) function1.invoke(interactionResult.getCurrentState())).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
        } else {
            gapComposer.startReplaceGroup(-211892364);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            if (((Boolean) function1.invoke(interactionResult.getCurrentState())).booleanValue()) {
                mutableState.setValue(Boolean.TRUE);
            }
            enterExitState = ((Boolean) function1.invoke(obj)).booleanValue() ? EnterExitState.Visible : ((Boolean) mutableState.getValue()).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
            gapComposer.end(false);
        }
        gapComposer.end(false);
        return enterExitState;
    }

    public static final ContentTransform togetherWith(EnterTransitionImpl enterTransitionImpl, ExitTransitionImpl exitTransitionImpl) {
        return new ContentTransform(enterTransitionImpl, exitTransitionImpl, RecyclerView.DECELERATION_RATE, 12);
    }

    public static final ContentTransform with(EnterTransitionImpl enterTransitionImpl, ExitTransitionImpl exitTransitionImpl) {
        return new ContentTransform(enterTransitionImpl, exitTransitionImpl, RecyclerView.DECELERATION_RATE, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(boolean z, Modifier modifier, EnterTransitionImpl enterTransitionImpl, ExitTransitionImpl exitTransitionImpl, String str, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        EnterTransitionImpl enterTransitionImpl2;
        int i4;
        ExitTransitionImpl exitTransitionImpl2;
        int i5;
        String str2;
        Modifier modifier2;
        EnterTransitionImpl enterTransitionImpl3;
        ExitTransitionImpl exitTransitionImpl3;
        String str3;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(234057107);
        if ((i & 48) == 0) {
            i3 = (gapComposer.changed(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i6 = i3 | MLKEMEngine.KyberPolyBytes;
        int i7 = i2 & 4;
        if (i7 != 0) {
            i6 = i3 | 3456;
        } else if ((i & 3072) == 0) {
            enterTransitionImpl2 = enterTransitionImpl;
            i6 |= gapComposer.changed(enterTransitionImpl2) ? 2048 : 1024;
            i4 = i2 & 8;
            if (i4 == 0) {
                i6 |= 24576;
            } else if ((i & 24576) == 0) {
                exitTransitionImpl2 = exitTransitionImpl;
                i6 |= gapComposer.changed(exitTransitionImpl2) ? 16384 : PKIFailureInfo.certRevoked;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i6 |= 196608;
                } else if ((196608 & i) == 0) {
                    str2 = str;
                    i6 |= gapComposer.changed(str2) ? PKIFailureInfo.unsupportedVersion : 65536;
                    if ((1572864 & i) == 0) {
                        i6 |= gapComposer.changedInstance(composableLambdaImpl) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    }
                    if (!gapComposer.shouldExecute(i6 & 1, (599185 & i6) == 599184)) {
                        if (i7 != 0) {
                            enterTransitionImpl2 = EnterExitTransitionKt.fadeIn$default(null, 3).plus(EnterExitTransitionKt.expandHorizontally$default(null, null, 15));
                        }
                        ExitTransitionImpl plus = i4 != 0 ? EnterExitTransitionKt.fadeOut$default(null, 3).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, null, 15)) : exitTransitionImpl2;
                        String str4 = i5 != 0 ? "AnimatedVisibility" : str2;
                        int i8 = i6 >> 3;
                        Transition updateTransition = AnimatableKt.updateTransition(Boolean.valueOf(z), str4, gapComposer, (i8 & 14) | ((i6 >> 12) & 112), 0);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = CrossfadeKt$Crossfade$3$1.INSTANCE$5;
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        EnterTransitionImpl enterTransitionImpl4 = enterTransitionImpl2;
                        AnimatedVisibilityImpl(updateTransition, (Function1) rememberedValue, companion, enterTransitionImpl4, plus, composableLambdaImpl, gapComposer, (i6 & 57344) | (i6 & 896) | 48 | (i6 & 7168) | (458752 & i8));
                        str3 = str4;
                        modifier2 = companion;
                        enterTransitionImpl3 = enterTransitionImpl4;
                        exitTransitionImpl3 = plus;
                    } else {
                        gapComposer.skipToGroupEnd();
                        modifier2 = modifier;
                        enterTransitionImpl3 = enterTransitionImpl2;
                        exitTransitionImpl3 = exitTransitionImpl2;
                        str3 = str2;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new AnimatedVisibilityKt$AnimatedVisibility$2(z, modifier2, enterTransitionImpl3, exitTransitionImpl3, str3, composableLambdaImpl, i, i2, 1);
                        return;
                    }
                    return;
                }
                str2 = str;
                if ((1572864 & i) == 0) {
                }
                if (!gapComposer.shouldExecute(i6 & 1, (599185 & i6) == 599184)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            exitTransitionImpl2 = exitTransitionImpl;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            str2 = str;
            if ((1572864 & i) == 0) {
            }
            if (!gapComposer.shouldExecute(i6 & 1, (599185 & i6) == 599184)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        enterTransitionImpl2 = enterTransitionImpl;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        exitTransitionImpl2 = exitTransitionImpl;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        str2 = str;
        if ((1572864 & i) == 0) {
        }
        if (!gapComposer.shouldExecute(i6 & 1, (599185 & i6) == 599184)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final ColumnScope columnScope, final boolean z, Modifier modifier, EnterTransitionImpl enterTransitionImpl, ExitTransitionImpl exitTransitionImpl, String str, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final EnterTransitionImpl enterTransitionImpl2;
        int i5;
        ExitTransitionImpl exitTransitionImpl2;
        int i6;
        String str2;
        ComposableLambdaImpl composableLambdaImpl2;
        final ExitTransitionImpl exitTransitionImpl3;
        final Modifier modifier3;
        GapComposer gapComposer;
        final String str3;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1799879339);
        if ((i & 48) == 0) {
            i3 = (gapComposer2.changed(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                enterTransitionImpl2 = enterTransitionImpl;
                i3 |= gapComposer2.changed(enterTransitionImpl2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    exitTransitionImpl2 = exitTransitionImpl;
                    i3 |= gapComposer2.changed(exitTransitionImpl2) ? 16384 : PKIFailureInfo.certRevoked;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        str2 = str;
                        i3 |= gapComposer2.changed(str2) ? PKIFailureInfo.unsupportedVersion : 65536;
                        if ((1572864 & i) == 0) {
                            composableLambdaImpl2 = composableLambdaImpl;
                            i3 |= gapComposer2.changedInstance(composableLambdaImpl2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                        } else {
                            composableLambdaImpl2 = composableLambdaImpl;
                        }
                        if (gapComposer2.shouldExecute(i3 & 1, (599185 & i3) != 599184)) {
                            if (i7 != 0) {
                                modifier2 = Modifier.Companion.$$INSTANCE;
                            }
                            EnterTransitionImpl plus = i4 != 0 ? EnterExitTransitionKt.fadeIn$default(null, 3).plus(EnterExitTransitionKt.expandVertically$default(null, 15)) : enterTransitionImpl2;
                            ExitTransitionImpl plus2 = i5 != 0 ? EnterExitTransitionKt.fadeOut$default(null, 3).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, 15)) : exitTransitionImpl2;
                            if (i6 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            int i8 = i3 >> 3;
                            Transition updateTransition = AnimatableKt.updateTransition(Boolean.valueOf(z), str2, gapComposer2, (i8 & 14) | ((i3 >> 12) & 112), 0);
                            Object rememberedValue = gapComposer2.rememberedValue();
                            if (rememberedValue == Composer.Companion.Empty) {
                                rememberedValue = CrossfadeKt$Crossfade$3$1.INSTANCE$6;
                                gapComposer2.updateRememberedValue(rememberedValue);
                            }
                            AnimatedVisibilityImpl(updateTransition, (Function1) rememberedValue, modifier2, plus, plus2, composableLambdaImpl2, gapComposer2, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i8 & 458752));
                            exitTransitionImpl3 = plus2;
                            enterTransitionImpl2 = plus;
                            gapComposer = gapComposer2;
                            str3 = str2;
                            modifier3 = modifier2;
                        } else {
                            gapComposer2.skipToGroupEnd();
                            exitTransitionImpl3 = exitTransitionImpl2;
                            modifier3 = modifier2;
                            gapComposer = gapComposer2;
                            str3 = str2;
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.block = new Function2() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Number) obj2).intValue();
                                    AnimatedContentKt.AnimatedVisibility(ColumnScope.this, z, modifier3, enterTransitionImpl2, exitTransitionImpl3, str3, composableLambdaImpl, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                                    return Unit.INSTANCE;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    str2 = str;
                    if ((1572864 & i) == 0) {
                    }
                    if (gapComposer2.shouldExecute(i3 & 1, (599185 & i3) != 599184)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                exitTransitionImpl2 = exitTransitionImpl;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((1572864 & i) == 0) {
                }
                if (gapComposer2.shouldExecute(i3 & 1, (599185 & i3) != 599184)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            enterTransitionImpl2 = enterTransitionImpl;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            exitTransitionImpl2 = exitTransitionImpl;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str2 = str;
            if ((1572864 & i) == 0) {
            }
            if (gapComposer2.shouldExecute(i3 & 1, (599185 & i3) != 599184)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        enterTransitionImpl2 = enterTransitionImpl;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        exitTransitionImpl2 = exitTransitionImpl;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        if ((1572864 & i) == 0) {
        }
        if (gapComposer2.shouldExecute(i3 & 1, (599185 & i3) != 599184)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedVisibility(final MutableTransitionState mutableTransitionState, Modifier modifier, final EnterTransitionImpl enterTransitionImpl, final ExitTransitionImpl exitTransitionImpl, String str, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final String str2;
        final Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(657024243);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? gapComposer.changed(mutableTransitionState) : gapComposer.changedInstance(mutableTransitionState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= gapComposer.changed(enterTransitionImpl) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= gapComposer.changed(exitTransitionImpl) ? 2048 : 1024;
            }
            i4 = i3 | 24576;
            if ((196608 & i) == 0) {
                i4 |= gapComposer.changedInstance(composableLambdaImpl) ? PKIFailureInfo.unsupportedVersion : 65536;
            }
            if (!gapComposer.shouldExecute(i4 & 1, (74899 & i4) == 74898)) {
                Modifier modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                Transition rememberTransition = AnimatableKt.rememberTransition(mutableTransitionState, "AnimatedVisibility", gapComposer, (i4 & 14) | ((i4 >> 9) & 112), 0);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = CrossfadeKt$Crossfade$3$1.INSTANCE$7;
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function1 function1 = (Function1) rememberedValue;
                int i6 = i4 << 3;
                AnimatedVisibilityImpl(rememberTransition, function1, modifier4, enterTransitionImpl, exitTransitionImpl, composableLambdaImpl, gapComposer, (i6 & 57344) | (i6 & 896) | 48 | (i6 & 7168) | (i4 & 458752));
                str2 = "AnimatedVisibility";
                modifier3 = modifier4;
            } else {
                gapComposer.skipToGroupEnd();
                str2 = str;
                modifier3 = modifier2;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new Function2() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Number) obj2).intValue();
                        AnimatedContentKt.AnimatedVisibility(MutableTransitionState.this, modifier3, enterTransitionImpl, exitTransitionImpl, str2, composableLambdaImpl, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        if ((i & 3072) == 0) {
        }
        i4 = i3 | 24576;
        if ((196608 & i) == 0) {
        }
        if (!gapComposer.shouldExecute(i4 & 1, (74899 & i4) == 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void AnimatedVisibility(MutableTransitionState mutableTransitionState, Modifier modifier, EnterTransitionImpl enterTransitionImpl, ExitTransitionImpl exitTransitionImpl, String str, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        Modifier modifier2;
        String str2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1763490971);
        int i2 = i | (gapComposer.changed(mutableTransitionState) ? 32 : 16) | 196992;
        if (gapComposer.shouldExecute(i2 & 1, (599185 & i2) != 599184)) {
            Transition rememberTransition = AnimatableKt.rememberTransition(mutableTransitionState, "AnimatedVisibility", gapComposer, ((i2 >> 3) & 14) | 48, 0);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = CrossfadeKt$Crossfade$3$1.INSTANCE$8;
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            AnimatedVisibilityImpl(rememberTransition, (Function1) rememberedValue, companion, enterTransitionImpl, exitTransitionImpl, composableLambdaImpl, gapComposer, 224688);
            modifier2 = companion;
            str2 = "AnimatedVisibility";
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            str2 = str;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AnimatedVisibilityKt$AnimatedVisibility$10(mutableTransitionState, modifier2, enterTransitionImpl, exitTransitionImpl, str2, composableLambdaImpl, i);
        }
    }

    public static final void AnimatedVisibility(Transition transition, Function1 function1, Modifier modifier, EnterTransitionImpl enterTransitionImpl, ExitTransitionImpl exitTransitionImpl, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1699747442);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(transition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changed(enterTransitionImpl) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= gapComposer.changed(exitTransitionImpl) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i3 |= gapComposer.changedInstance(composableLambdaImpl) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            AnimatedVisibilityImpl(transition, function1, companion, enterTransitionImpl, exitTransitionImpl, composableLambdaImpl, gapComposer, i3 & 524286);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AnimatedVisibilityKt$AnimatedVisibility$13(transition, function1, modifier2, enterTransitionImpl, exitTransitionImpl, composableLambdaImpl, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedContent(final Object obj, Modifier modifier, Function1 function1, Alignment alignment, String str, Function1 function12, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Function1 function13;
        int i5;
        Alignment alignment2;
        int i6;
        int i7;
        final Modifier modifier2;
        final Function1 function14;
        final Function1 function15;
        final Alignment alignment3;
        final String str2;
        RecomposeScopeImpl endRestartGroup;
        int i8;
        Function1 function16;
        Function1 function17;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1501828832);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? gapComposer.changed(obj) : gapComposer.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= gapComposer.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                function13 = function1;
                i3 |= gapComposer.changedInstance(function13) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    alignment2 = alignment;
                    i3 |= gapComposer.changed(alignment2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= gapComposer.changed(str) ? 16384 : PKIFailureInfo.certRevoked;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else if ((196608 & i) == 0) {
                            i3 |= gapComposer.changedInstance(function12) ? PKIFailureInfo.unsupportedVersion : 65536;
                            if ((1572864 & i) == 0) {
                                i3 |= gapComposer.changedInstance(composableLambdaImpl) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                            }
                            if (!gapComposer.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
                                Modifier modifier3 = i9 != 0 ? Modifier.Companion.$$INSTANCE : modifier;
                                Object obj2 = Composer.Companion.Empty;
                                if (i4 != 0) {
                                    Object rememberedValue = gapComposer.rememberedValue();
                                    if (rememberedValue == obj2) {
                                        rememberedValue = CrossfadeKt$Crossfade$3$1.INSTANCE$1;
                                        gapComposer.updateRememberedValue(rememberedValue);
                                    }
                                    function16 = (Function1) rememberedValue;
                                    i8 = i7;
                                } else {
                                    i8 = i7;
                                    function16 = function13;
                                }
                                Alignment alignment4 = i5 != 0 ? Alignment.Companion.TopStart : alignment2;
                                str2 = i6 != 0 ? "AnimatedContent" : str;
                                if (i8 != 0) {
                                    Object rememberedValue2 = gapComposer.rememberedValue();
                                    if (rememberedValue2 == obj2) {
                                        rememberedValue2 = AnimatedContentKt$AnimatedContent$2$1.INSTANCE;
                                        gapComposer.updateRememberedValue(rememberedValue2);
                                    }
                                    function17 = (Function1) rememberedValue2;
                                } else {
                                    function17 = function12;
                                }
                                Transition updateTransition = AnimatableKt.updateTransition(obj, str2, gapComposer, (i3 & 14) | ((i3 >> 9) & 112), 0);
                                int i10 = i3 & 8176;
                                int i11 = i3 >> 3;
                                AnimatedContent(updateTransition, modifier3, function16, alignment4, function17, composableLambdaImpl, gapComposer, i10 | (57344 & i11) | (i11 & 458752), 0);
                                modifier2 = modifier3;
                                function15 = function16;
                                alignment3 = alignment4;
                                function14 = function17;
                            } else {
                                gapComposer.skipToGroupEnd();
                                modifier2 = modifier;
                                function14 = function12;
                                function15 = function13;
                                alignment3 = alignment2;
                                str2 = str;
                            }
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.block = new Function2() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        ((Number) obj4).intValue();
                                        AnimatedContentKt.AnimatedContent(obj, modifier2, function15, alignment3, str2, function14, composableLambdaImpl, (Composer) obj3, Updater.updateChangedFlags(i | 1), i2);
                                        return Unit.INSTANCE;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        if ((1572864 & i) == 0) {
                        }
                        if (!gapComposer.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    if ((1572864 & i) == 0) {
                    }
                    if (!gapComposer.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                alignment2 = alignment;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                if ((1572864 & i) == 0) {
                }
                if (!gapComposer.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function13 = function1;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            alignment2 = alignment;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if (!gapComposer.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function13 = function1;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        alignment2 = alignment;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if (!gapComposer.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
