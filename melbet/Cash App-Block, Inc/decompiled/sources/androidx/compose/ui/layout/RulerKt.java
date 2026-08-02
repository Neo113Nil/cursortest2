package androidx.compose.ui.layout;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.Updater$$ExternalSyntheticLambda0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.spatial.ThrottledCallbacks;
import androidx.compose.ui.spatial.ThrottledCallbacks.Entry;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3;
import androidx.glance.ImageKt$Image$3;
import androidx.glance.layout.ColumnKt$Column$4;
import androidx.glance.layout.SpacerKt$Spacer$3;
import app.cash.molecule.PlatformKt;
import app.cash.trifle.KeyHandle$keyPair$2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class RulerKt {
    public static final NoOpSubcomposeSlotReusePolicy ReusedSlotId = new NoOpSubcomposeSlotReusePolicy(1);
    public static final Object UnspecifiedSlotId = new Object();

    public static final void MultiMeasureLayout(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, MeasurePolicy measurePolicy, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1663319424);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changed(measurePolicy) ? 256 : 128);
        byte b = 0;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int hashCode = Integer.hashCode(Updater.getCurrentCompositeKeyHash(gapComposer));
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = LayoutNode$Companion$Constructor$1.INSTANCE;
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
            ComposeUiNode.Companion.getClass();
            Updater.m576setimpl(gapComposer, measurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            if (gapComposer.inserting) {
                gapComposer.apply(Unit.INSTANCE, new Updater$$ExternalSyntheticLambda0(LayoutKt$MultiMeasureLayout$1$1.INSTANCE, i3, b));
            }
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Recorder$$ExternalSyntheticOutline2.m(6, composableLambdaImpl, gapComposer, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ImageKt$Image$3(modifier, composableLambdaImpl, measurePolicy, i, 1);
        }
    }

    public static final void SubcomposeLayout(SubcomposeLayoutState subcomposeLayoutState, Modifier modifier, Function2 function2, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-511989831);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(subcomposeLayoutState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function2) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            GapComposer.CompositionContextImpl buildContext = gapComposer.buildContext();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = LayoutNode$Companion$Constructor$1.INSTANCE;
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
            Updater.m576setimpl(gapComposer, subcomposeLayoutState, subcomposeLayoutState.setRoot);
            Updater.m576setimpl(gapComposer, buildContext, subcomposeLayoutState.setCompositionContext);
            Updater.m576setimpl(gapComposer, function2, subcomposeLayoutState.setMeasurePolicy);
            ComposeUiNode.Companion.getClass();
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            gapComposer.end(true);
            if (gapComposer.getSkipping()) {
                gapComposer.startReplaceGroup(-1259187287);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1259245908);
                boolean changedInstance = gapComposer.changedInstance(subcomposeLayoutState);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new KeyHandle$keyPair$2(subcomposeLayoutState, i3);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Updater.SideEffect((Function0) rememberedValue, gapComposer);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AndroidDialog_androidKt$Dialog$3(subcomposeLayoutState, modifier, function2, i, 1);
        }
    }

    public static final float access$mergeRulerValues(Placeable.PlacementScope placementScope, boolean z, VerticalRuler[] verticalRulerArr, float f) {
        float f2 = Float.NaN;
        for (VerticalRuler verticalRuler : verticalRulerArr) {
            float current = placementScope.current(verticalRuler);
            if (!Float.isNaN(f2)) {
                int i = z != (current > f2) ? i + 1 : 0;
            }
            f2 = current;
        }
        return Float.isNaN(f2) ? f : f2;
    }

    public static final ComposableLambdaImpl combineAsVirtualLayouts(List list) {
        return new ComposableLambdaImpl(new SpacerKt$Spacer$3(list, 3), true, 1271844412);
    }

    public static final Object getLayoutId(Measurable measurable) {
        Object parentData = measurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    public static final LookaheadDelegate getRootLookaheadDelegate(LookaheadDelegate lookaheadDelegate) {
        LayoutNode layoutNode = lookaheadDelegate.coordinator.layoutNode;
        while (true) {
            LayoutNode parent$ui = layoutNode.getParent$ui();
            if ((parent$ui != null ? parent$ui.lookaheadRoot : null) == null) {
                LookaheadDelegate lookaheadDelegate2 = ((NodeCoordinator) layoutNode.nodes.outerCoordinator).getLookaheadDelegate();
                lookaheadDelegate2.getClass();
                return lookaheadDelegate2;
            }
            LayoutNode parent$ui2 = layoutNode.getParent$ui();
            LayoutNode layoutNode2 = parent$ui2 != null ? parent$ui2.lookaheadRoot : null;
            layoutNode2.getClass();
            if (layoutNode2.isVirtualLookaheadRoot) {
                layoutNode = layoutNode.getParent$ui();
                layoutNode.getClass();
            } else {
                LayoutNode parent$ui3 = layoutNode.getParent$ui();
                parent$ui3.getClass();
                layoutNode = parent$ui3.lookaheadRoot;
                layoutNode.getClass();
            }
        }
    }

    public static final Modifier layoutId(Modifier modifier, Object obj) {
        return modifier.then(new LayoutIdElement(obj));
    }

    public static int maxHeight(LayoutModifier layoutModifier, LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return layoutModifier.mo351measure3p2s80s(new IntrinsicsMeasureScope(lookaheadCapablePlaceable, lookaheadCapablePlaceable.getLayoutDirection()), new MeasuringIntrinsics$DefaultIntrinsicMeasurable(intrinsicMeasurable, MeasuringIntrinsics$IntrinsicMinMax.Max, MeasuringIntrinsics$IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i, 0, 0, 13)).getHeight();
    }

    public static int maxWidth(LayoutModifier layoutModifier, LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return layoutModifier.mo351measure3p2s80s(new IntrinsicsMeasureScope(lookaheadCapablePlaceable, lookaheadCapablePlaceable.getLayoutDirection()), new MeasuringIntrinsics$DefaultIntrinsicMeasurable(intrinsicMeasurable, MeasuringIntrinsics$IntrinsicMinMax.Max, MeasuringIntrinsics$IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i, 7)).getWidth();
    }

    public static int minHeight(LayoutModifier layoutModifier, LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return layoutModifier.mo351measure3p2s80s(new IntrinsicsMeasureScope(lookaheadCapablePlaceable, lookaheadCapablePlaceable.getLayoutDirection()), new MeasuringIntrinsics$DefaultIntrinsicMeasurable(intrinsicMeasurable, MeasuringIntrinsics$IntrinsicMinMax.Min, MeasuringIntrinsics$IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i, 0, 0, 13)).getHeight();
    }

    public static int minWidth(LayoutModifier layoutModifier, LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return layoutModifier.mo351measure3p2s80s(new IntrinsicsMeasureScope(lookaheadCapablePlaceable, lookaheadCapablePlaceable.getLayoutDirection()), new MeasuringIntrinsics$DefaultIntrinsicMeasurable(intrinsicMeasurable, MeasuringIntrinsics$IntrinsicMinMax.Min, MeasuringIntrinsics$IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i, 7)).getWidth();
    }

    public static final Modifier onLayoutRectChanged(Modifier modifier, Function1 function1) {
        return modifier.then(new OnLayoutRectChangedElement(function1));
    }

    public static final Modifier onPlaced(Modifier modifier, Function1 function1) {
        return modifier.then(new OnPlacedElement(function1));
    }

    public static final Modifier onSizeChanged(Modifier modifier, Function1 function1) {
        return modifier.then(new OnSizeChangedModifier(function1));
    }

    public static Modifier onVisibilityChanged$default(Modifier modifier, long j, float f, Function1 function1, int i) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        return modifier.then(new OnVisibilityChangedElement(j, f, function1));
    }

    public static final ThrottledCallbacks.Entry registerOnLayoutRectChanged(Modifier.Node node, Function1 function1) {
        LayoutNode requireLayoutNode = DepthSortedSetKt.requireLayoutNode(node);
        int i = requireLayoutNode.semanticsId;
        RectManager rectManager = ((AndroidComposeView) LayoutNodeKt.requireOwner(requireLayoutNode)).rectManager;
        ThrottledCallbacks throttledCallbacks = rectManager.throttledCallbacks;
        throttledCallbacks.getClass();
        MutableIntObjectMap mutableIntObjectMap = throttledCallbacks.rectChangedMap;
        ThrottledCallbacks.Entry entry = throttledCallbacks.new Entry(i, node, function1);
        Object obj = mutableIntObjectMap.get(i);
        if (obj == null) {
            mutableIntObjectMap.set(i, entry);
            obj = entry;
        }
        ThrottledCallbacks.Entry entry2 = (ThrottledCallbacks.Entry) obj;
        if (entry2 != entry) {
            while (true) {
                ThrottledCallbacks.Entry entry3 = entry2.next;
                if (entry3 == null) {
                    break;
                }
                entry2 = entry3;
            }
            entry2.next = entry;
        }
        if (DepthSortedSetKt.requireLayoutNode(node.getNode()).addedToRectList) {
            rectManager.rects.updateHasCallbacks(i, true);
        }
        rectManager.isDirty = true;
        rectManager.scheduleDebounceCallback();
        return entry;
    }

    public static final void SubcomposeLayout(Modifier modifier, Function2 function2, Composer composer, int i, int i2) {
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function2) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SubcomposeLayoutState(NoOpSubcomposeSlotReusePolicy.INSTANCE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SubcomposeLayout((SubcomposeLayoutState) rememberedValue, modifier, function2, gapComposer, (i3 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ColumnKt$Column$4(modifier2, function2, i, i2, 2);
        }
    }
}
