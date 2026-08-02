package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.Updater$$ExternalSyntheticLambda0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class ValueInsets {
    public static final void LookaheadScope(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(441837433);
        byte b = 0;
        int i2 = 1;
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = new LookaheadScopeImpl();
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Object obj2 = (LookaheadScopeImpl) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = LookaheadScopeKt$LookaheadScope$1$1.INSTANCE;
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function0 function0 = (Function0) rememberedValue2;
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
            RootMeasurePolicy$measure$1 rootMeasurePolicy$measure$1 = RootMeasurePolicy$measure$1.INSTANCE$1;
            if (gapComposer.inserting) {
                gapComposer.apply(Unit.INSTANCE, new Updater$$ExternalSyntheticLambda0(rootMeasurePolicy$measure$1, i2, b));
            }
            Updater.m576setimpl(gapComposer, obj2, LookaheadScopeKt$LookaheadScope$2$2.INSTANCE);
            composableLambdaImpl.invoke(obj2, (Object) gapComposer, (Object) 48);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LookaheadScopeKt$LookaheadScope$4(i, b, composableLambdaImpl);
        }
    }

    public static final Rect boundsInParent(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return parentLayoutCoordinates != null ? parentLayoutCoordinates.localBoundingBoxOf(layoutCoordinates, true) : new Rect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, (int) (layoutCoordinates.mo838getSizeYbymL2g() >> 32), (int) (layoutCoordinates.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax));
    }

    public static final Rect boundsInWindow(LayoutCoordinates layoutCoordinates, boolean z) {
        LayoutCoordinates findRootCoordinates = findRootCoordinates(layoutCoordinates);
        float mo838getSizeYbymL2g = (int) (findRootCoordinates.mo838getSizeYbymL2g() >> 32);
        float mo838getSizeYbymL2g2 = (int) (findRootCoordinates.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax);
        Rect localBoundingBoxOf = findRootCoordinates.localBoundingBoxOf(layoutCoordinates, z);
        float f = localBoundingBoxOf.left;
        float f2 = RecyclerView.DECELERATION_RATE;
        if (z) {
            if (f < RecyclerView.DECELERATION_RATE) {
                f = 0.0f;
            }
            if (f > mo838getSizeYbymL2g) {
                f = mo838getSizeYbymL2g;
            }
        }
        float f3 = localBoundingBoxOf.top;
        if (z) {
            if (f3 < RecyclerView.DECELERATION_RATE) {
                f3 = 0.0f;
            }
            if (f3 > mo838getSizeYbymL2g2) {
                f3 = mo838getSizeYbymL2g2;
            }
        }
        float f4 = localBoundingBoxOf.right;
        if (z) {
            if (f4 < RecyclerView.DECELERATION_RATE) {
                f4 = 0.0f;
            }
            if (f4 <= mo838getSizeYbymL2g) {
                mo838getSizeYbymL2g = f4;
            }
            f4 = mo838getSizeYbymL2g;
        }
        float f5 = localBoundingBoxOf.bottom;
        if (z) {
            if (f5 >= RecyclerView.DECELERATION_RATE) {
                f2 = f5;
            }
            if (f2 <= mo838getSizeYbymL2g2) {
                mo838getSizeYbymL2g2 = f2;
            }
            f5 = mo838getSizeYbymL2g2;
        }
        if (f == f4 || f3 == f5) {
            return Rect.Zero;
        }
        long mo843localToWindowMKHz9U = findRootCoordinates.mo843localToWindowMKHz9U((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f3) & BodyPartID.bodyIdMax));
        long mo843localToWindowMKHz9U2 = findRootCoordinates.mo843localToWindowMKHz9U((Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f3) & BodyPartID.bodyIdMax));
        long mo843localToWindowMKHz9U3 = findRootCoordinates.mo843localToWindowMKHz9U((Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f5) & BodyPartID.bodyIdMax));
        long mo843localToWindowMKHz9U4 = findRootCoordinates.mo843localToWindowMKHz9U((Float.floatToRawIntBits(f5) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (mo843localToWindowMKHz9U >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (mo843localToWindowMKHz9U2 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (mo843localToWindowMKHz9U4 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (mo843localToWindowMKHz9U3 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (mo843localToWindowMKHz9U & BodyPartID.bodyIdMax));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (mo843localToWindowMKHz9U2 & BodyPartID.bodyIdMax));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (mo843localToWindowMKHz9U4 & BodyPartID.bodyIdMax));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (mo843localToWindowMKHz9U3 & BodyPartID.bodyIdMax));
        return new Rect(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m860equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static final LayoutCoordinates findRootCoordinates(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = parentLayoutCoordinates;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
        NodeCoordinator nodeCoordinator = layoutCoordinates2 instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinates2 : null;
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.wrappedBy;
        while (true) {
            NodeCoordinator nodeCoordinator3 = nodeCoordinator2;
            NodeCoordinator nodeCoordinator4 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator3;
            if (nodeCoordinator == null) {
                return nodeCoordinator4;
            }
            nodeCoordinator2 = nodeCoordinator.wrappedBy;
        }
    }

    public static final Modifier layout(Modifier modifier, Function3 function3) {
        return modifier.then(new LayoutElement(function3));
    }

    public static final Modifier onGloballyPositioned(Modifier modifier, Function1 function1) {
        return modifier.then(new OnGloballyPositionedElement(function1));
    }

    public static final long positionInParent(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            return parentLayoutCoordinates.mo839localPositionOfR5De75A(layoutCoordinates, 0L);
        }
        return 0L;
    }

    /* renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m861timesUQTWf7w(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)) * Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
        return (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }
}
