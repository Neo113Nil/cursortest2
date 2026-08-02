package androidx.compose.animation;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
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
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.emoji2.text.MetadataRepo;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.util.cash.Countries;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.InteractionResult;

/* loaded from: classes3.dex */
public abstract class CrossfadeKt {
    public static final SharedBoundsNode$$ExternalSyntheticLambda0 BoundsTransform = new SharedBoundsNode$$ExternalSyntheticLambda0(1);

    /* JADX WARN: Removed duplicated region for block: B:110:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Crossfade(Transition transition, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, Function1 function1, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        Function1 function12;
        ComposableLambdaImpl composableLambdaImpl2;
        Function1 function13;
        RecomposeScopeImpl endRestartGroup;
        Function1 function14;
        Transition transition2 = transition;
        InteractionResult interactionResult = transition2.transitionState;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1877370462);
        int i3 = (i & 6) == 0 ? (gapComposer.changed(transition2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(finiteAnimationSpec) ? 256 : 128;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function12 = function1;
            i3 |= gapComposer.changedInstance(function12) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                composableLambdaImpl2 = composableLambdaImpl;
                i3 |= gapComposer.changedInstance(composableLambdaImpl2) ? 16384 : PKIFailureInfo.certRevoked;
            } else {
                composableLambdaImpl2 = composableLambdaImpl;
            }
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
                gapComposer.skipToGroupEnd();
                function13 = function12;
            } else {
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (i4 != 0) {
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = CrossfadeKt$Crossfade$3$1.INSTANCE;
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    function14 = (Function1) rememberedValue;
                } else {
                    function14 = function12;
                }
                Object rememberedValue2 = gapComposer.rememberedValue();
                Object obj = rememberedValue2;
                if (rememberedValue2 == neverEqualPolicy) {
                    SnapshotStateList snapshotStateList = new SnapshotStateList();
                    snapshotStateList.add(interactionResult.getCurrentState());
                    gapComposer.updateRememberedValue(snapshotStateList);
                    obj = snapshotStateList;
                }
                SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    long[] jArr = ScatterMapKt.EmptyGroup;
                    rememberedValue3 = new MutableScatterMap();
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                MutableScatterMap mutableScatterMap = (MutableScatterMap) rememberedValue3;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = transition2.targetState$delegate;
                if (Intrinsics.areEqual(interactionResult.getCurrentState(), parcelableSnapshotMutableState.getValue())) {
                    gapComposer.startReplaceGroup(321145192);
                    if (snapshotStateList2.size() == 1 && Intrinsics.areEqual(snapshotStateList2.get(0), parcelableSnapshotMutableState.getValue())) {
                        gapComposer.startReplaceGroup(321469824);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(321279546);
                        boolean z = (i3 & 14) == 4;
                        Object rememberedValue4 = gapComposer.rememberedValue();
                        if (z || rememberedValue4 == neverEqualPolicy) {
                            rememberedValue4 = new BoundsAnimation$animate$1(transition2, 2);
                            gapComposer.updateRememberedValue(rememberedValue4);
                        }
                        CollectionsKt__MutableCollectionsKt.removeAll(snapshotStateList2, (Function1) rememberedValue4);
                        mutableScatterMap.clear();
                        gapComposer.end(false);
                    }
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(321475776);
                    gapComposer.end(false);
                }
                if (mutableScatterMap.contains(parcelableSnapshotMutableState.getValue())) {
                    gapComposer.startReplaceGroup(322279296);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(321536443);
                    ListIterator listIterator = snapshotStateList2.listIterator();
                    int i5 = 0;
                    while (true) {
                        StateListIterator stateListIterator = (StateListIterator) listIterator;
                        if (!stateListIterator.hasNext()) {
                            i5 = -1;
                            break;
                        } else if (Intrinsics.areEqual(function14.invoke(stateListIterator.next()), function14.invoke(parcelableSnapshotMutableState.getValue()))) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    if (i5 == -1) {
                        snapshotStateList2.add(parcelableSnapshotMutableState.getValue());
                    } else {
                        snapshotStateList2.set(i5, parcelableSnapshotMutableState.getValue());
                    }
                    mutableScatterMap.clear();
                    int size = snapshotStateList2.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj2 = snapshotStateList2.get(i6);
                        mutableScatterMap.set(obj2, Expect_jvmKt.rememberComposableLambda(-934471669, new CrossfadeKt$Crossfade$5$1(transition2, finiteAnimationSpec, obj2, composableLambdaImpl2, 0), gapComposer));
                        i6++;
                        transition2 = transition;
                        composableLambdaImpl2 = composableLambdaImpl;
                    }
                    gapComposer.end(false);
                }
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
                Updater.m574initimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                gapComposer.startReplaceGroup(-1312707512);
                int size2 = snapshotStateList2.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    Object obj3 = snapshotStateList2.get(i7);
                    gapComposer.startMovableGroup(1171574969, function14.invoke(obj3));
                    Function2 function2 = (Function2) mutableScatterMap.get(obj3);
                    if (function2 == null) {
                        gapComposer.startReplaceGroup(1959122128);
                    } else {
                        gapComposer.startReplaceGroup(1171576145);
                        function2.invoke(gapComposer, 0);
                    }
                    gapComposer.end(false);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
                gapComposer.end(true);
                function13 = function14;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new CrossfadeKt$Crossfade$1(transition, modifier, finiteAnimationSpec, function13, composableLambdaImpl, i, i2, 1);
                return;
            }
            return;
        }
        function12 = function1;
        if ((i & 24576) != 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final Rect access$obtainBoundsFromLastTarget(SharedElement sharedElement, SharedBoundsNode sharedBoundsNode) {
        long mo840localPositionOfS_NoaFU;
        if (sharedBoundsNode != null) {
            List list = sharedElement.get_allEntries();
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (!Intrinsics.areEqual(((SharedElementEntry) list.get(i)).boundsProvider, sharedBoundsNode)) {
                    i++;
                } else if (sharedBoundsNode.isAttached()) {
                    if (!sharedBoundsNode.isPlaced) {
                        return sharedBoundsNode.boundsBeforeDetached;
                    }
                    LayoutCoordinates layoutCoordinates = sharedBoundsNode.sharedElementEntry.getSharedElement().scope.nullableRoot;
                    if (layoutCoordinates != null) {
                        mo840localPositionOfS_NoaFU = layoutCoordinates.mo840localPositionOfS_NoaFU(DepthSortedSetKt.requireLayoutCoordinates(sharedBoundsNode), 0L, (r4 & 4) != 0);
                        return DBUtil.m1180Recttz77jQw(mo840localPositionOfS_NoaFU, Countries.m3991toSizeozmzZPI(DepthSortedSetKt.requireLayoutCoordinates(sharedBoundsNode).measuredSize));
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                    return null;
                }
            }
        }
        return null;
    }

    /* renamed from: access$updateTargetData-BGTQxF0, reason: not valid java name */
    public static final void m145access$updateTargetDataBGTQxF0(MetadataRepo metadataRepo, long j, long j2, long j3, boolean z) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = (ParcelableSnapshotMutableState) metadataRepo.mEmojiCharArray;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = (ParcelableSnapshotMutableState) metadataRepo.mTypeface;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = (ParcelableSnapshotMutableState) metadataRepo.mMetadataList;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = (ParcelableSnapshotMutableState) metadataRepo.mRootNode;
        if (!Offset.m622equalsimpl0(((Offset) parcelableSnapshotMutableState4.getValue()).packedValue, j3) || !Size.m639equalsimpl0(((Size) parcelableSnapshotMutableState3.getValue()).packedValue, j) || z) {
            parcelableSnapshotMutableState3.setValue(new Size(j));
            parcelableSnapshotMutableState4.setValue(new Offset(j3));
            if (z) {
                Recorder$$ExternalSyntheticOutline1.m(Offset.m625minusMKHz9U(Offset.m625minusMKHz9U(j2, j3), Offset.m625minusMKHz9U(((Offset) parcelableSnapshotMutableState2.getValue()).packedValue, ((Offset) parcelableSnapshotMutableState.getValue()).packedValue)), parcelableSnapshotMutableState);
            }
        }
        Recorder$$ExternalSyntheticOutline1.m(Offset.m625minusMKHz9U(j2, j3), parcelableSnapshotMutableState2);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m146equalsimpl0(int i, int i2) {
        return i == i2;
    }

    public static final Rect getTargetBounds(MetadataRepo metadataRepo) {
        return DBUtil.m1180Recttz77jQw(Offset.m626plusMKHz9U(((Offset) ((ParcelableSnapshotMutableState) metadataRepo.mEmojiCharArray).getValue()).packedValue, ((Offset) ((ParcelableSnapshotMutableState) metadataRepo.mRootNode).getValue()).packedValue), ((Size) ((ParcelableSnapshotMutableState) metadataRepo.mMetadataList).getValue()).packedValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Crossfade(Object obj, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, String str, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        FiniteAnimationSpec finiteAnimationSpec2;
        int i5;
        String str2;
        FiniteAnimationSpec finiteAnimationSpec3;
        String str3;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-513216493);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? gapComposer.changed(obj) : gapComposer.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                finiteAnimationSpec2 = finiteAnimationSpec;
                i3 |= gapComposer.changedInstance(finiteAnimationSpec2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    str2 = str;
                    i3 |= gapComposer.changed(str2) ? 2048 : 1024;
                    if ((i & 24576) == 0) {
                        i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 16384 : PKIFailureInfo.certRevoked;
                    }
                    if (!gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
                        Modifier modifier3 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                        FiniteAnimationSpec tween$default = i4 != 0 ? AnimatableKt.tween$default(0, 0, null, 7) : finiteAnimationSpec2;
                        String str4 = i5 != 0 ? "Crossfade" : str2;
                        Crossfade(AnimatableKt.updateTransition(obj, str4, gapComposer, (i3 & 14) | ((i3 >> 6) & 112), 0), modifier3, tween$default, (Function1) null, composableLambdaImpl, gapComposer, i3 & 58352, 4);
                        str3 = str4;
                        modifier2 = modifier3;
                        finiteAnimationSpec3 = tween$default;
                    } else {
                        gapComposer.skipToGroupEnd();
                        finiteAnimationSpec3 = finiteAnimationSpec2;
                        str3 = str2;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new CrossfadeKt$Crossfade$1(obj, modifier2, finiteAnimationSpec3, str3, composableLambdaImpl, i, i2, 0);
                        return;
                    }
                    return;
                }
                str2 = str;
                if ((i & 24576) == 0) {
                }
                if (!gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            finiteAnimationSpec2 = finiteAnimationSpec;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            str2 = str;
            if ((i & 24576) == 0) {
            }
            if (!gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        finiteAnimationSpec2 = finiteAnimationSpec;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        str2 = str;
        if ((i & 24576) == 0) {
        }
        if (!gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
