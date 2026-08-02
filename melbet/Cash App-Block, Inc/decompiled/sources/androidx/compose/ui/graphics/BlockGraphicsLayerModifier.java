package androidx.compose.ui.graphics;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.datastore.core.SimpleActor;
import com.google.android.gms.dynamite.zzg;
import com.squareup.util.cash.Countries;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class BlockGraphicsLayerModifier extends Modifier.Node implements LayoutModifierNode, SemanticsModifierNode {
    public Function1 layerBlock;

    public BlockGraphicsLayerModifier(Function1 function1) {
        this.layerBlock = function1;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Shape shape;
        boolean z;
        NodeCoordinator m864requireCoordinator64DMado = DepthSortedSetKt.m864requireCoordinator64DMado(this, 2);
        if (m864requireCoordinator64DMado.wasLayerBlockInvoked) {
            shape = m864requireCoordinator64DMado.lastShape;
            z = m864requireCoordinator64DMado.lastClip;
        } else {
            ReusableGraphicsLayerScope reusableGraphicsLayerScope = ColorKt.reusableGraphicsLayerScope;
            if (reusableGraphicsLayerScope == null) {
                ColorKt.reusableGraphicsLayerScope = new ReusableGraphicsLayerScope();
            } else {
                reusableGraphicsLayerScope.reset();
            }
            ReusableGraphicsLayerScope reusableGraphicsLayerScope2 = ColorKt.reusableGraphicsLayerScope;
            reusableGraphicsLayerScope2.getClass();
            reusableGraphicsLayerScope2.graphicsDensity = m864requireCoordinator64DMado.layoutNode.density;
            reusableGraphicsLayerScope2.size = Countries.m3991toSizeozmzZPI(m864requireCoordinator64DMado.measuredSize);
            Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
            Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                this.layerBlock.invoke(reusableGraphicsLayerScope2);
                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                shape = reusableGraphicsLayerScope2.shape;
                z = reusableGraphicsLayerScope2.clip;
            } catch (Throwable th) {
                zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                throw th;
            }
        }
        if (z) {
            SemanticsPropertiesKt.setShape(semanticsPropertyReceiver, shape);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean isImportantForBounds() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new SimpleActor.AnonymousClass1(3, mo833measureBRTryo0, this));
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.layerBlock + ')';
    }
}
