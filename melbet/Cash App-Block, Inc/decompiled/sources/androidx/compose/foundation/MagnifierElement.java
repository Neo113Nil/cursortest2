package androidx.compose.foundation;

import android.view.View;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.FocusableNode;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.io.LinesSequence;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sqip.internal.CardImage;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/MagnifierElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/MagnifierNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MagnifierElement extends ModifierNodeElement {
    public final Function1 onSizeChanged;
    public final FocusableNode.TraverseKey platformMagnifierFactory;
    public final Function1 sourceCenter;

    public MagnifierElement(Function1 function1, Function1 function12, FocusableNode.TraverseKey traverseKey) {
        this.sourceCenter = function1;
        this.onSizeChanged = function12;
        this.platformMagnifierFactory = traverseKey;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new MagnifierNode(this.sourceCenter, this.onSizeChanged, this.platformMagnifierFactory);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return this.platformMagnifierFactory.hashCode() + Recorder$$ExternalSyntheticOutline1.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(Float.NaN, CameraState$Type$EnumUnboxingLocalUtility.m(Float.NaN, Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(Float.NaN, this.sourceCenter.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true), 31, this.onSizeChanged);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "magnifier";
        LinesSequence linesSequence = inspectorInfo.properties;
        linesSequence.set(this.sourceCenter, "sourceCenter");
        linesSequence.set(null, "magnifierCenter");
        linesSequence.set(Float.valueOf(Float.NaN), "zoom");
        linesSequence.set(new DpSize(9205357640488583168L), "size");
        linesSequence.set(new Dp(Float.NaN), "cornerRadius");
        linesSequence.set(new Dp(Float.NaN), CardImage.ELEVATION);
        linesSequence.set(Boolean.TRUE, "clippingEnabled");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        MagnifierNode magnifierNode = (MagnifierNode) node;
        float f = magnifierNode.zoom;
        long j = magnifierNode.size;
        float f2 = magnifierNode.cornerRadius;
        boolean z = magnifierNode.useTextDefault;
        float f3 = magnifierNode.elevation;
        boolean z2 = magnifierNode.clippingEnabled;
        FocusableNode.TraverseKey traverseKey = magnifierNode.platformMagnifierFactory;
        View view = magnifierNode.view;
        Density density = magnifierNode.density;
        magnifierNode.sourceCenter = this.sourceCenter;
        magnifierNode.zoom = Float.NaN;
        magnifierNode.useTextDefault = true;
        magnifierNode.size = 9205357640488583168L;
        magnifierNode.cornerRadius = Float.NaN;
        magnifierNode.elevation = Float.NaN;
        magnifierNode.clippingEnabled = true;
        magnifierNode.onSizeChanged = this.onSizeChanged;
        FocusableNode.TraverseKey traverseKey2 = this.platformMagnifierFactory;
        magnifierNode.platformMagnifierFactory = traverseKey2;
        View requireView = DepthSortedSetKt.requireView(magnifierNode);
        Density density2 = DepthSortedSetKt.requireLayoutNode(magnifierNode).density;
        if (magnifierNode.magnifier != null) {
            SemanticsPropertyKey semanticsPropertyKey = Magnifier_androidKt.MagnifierPositionInRoot;
            if (!Float.isNaN(Float.NaN) || !Float.isNaN(f)) {
                int i = (Float.NaN > f ? 1 : (Float.NaN == f ? 0 : -1));
            }
            if (!DpSize.m1042equalsimpl0(9205357640488583168L, j) || !Dp.m1037equalsimpl0(Float.NaN, f2) || !Dp.m1037equalsimpl0(Float.NaN, f3) || true != z || true != z2 || !traverseKey2.equals(traverseKey) || !requireView.equals(view) || !Intrinsics.areEqual(density2, density)) {
                magnifierNode.recreateMagnifier();
            }
        }
        magnifierNode.updateMagnifier();
    }
}
