package androidx.compose.foundation;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.AndroidComposeView$getFocusedRect$1;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/BackgroundNode;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BackgroundElement extends ModifierNodeElement {
    public final float alpha;
    public final Brush brush;
    public final long color;
    public final AndroidComposeView$getFocusedRect$1 inspectorInfo;
    public final Shape shape;

    public BackgroundElement(long j, Brush brush, Shape shape, int i) {
        AndroidComposeView$getFocusedRect$1 androidComposeView$getFocusedRect$1 = AndroidComposeView$getFocusedRect$1.INSTANCE$3;
        j = (i & 1) != 0 ? Color.Unspecified : j;
        brush = (i & 2) != 0 ? null : brush;
        this.color = j;
        this.brush = brush;
        this.alpha = 1.0f;
        this.shape = shape;
        this.inspectorInfo = androidComposeView$getFocusedRect$1;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        BackgroundNode backgroundNode = new BackgroundNode();
        backgroundNode.color = this.color;
        backgroundNode.brush = this.brush;
        backgroundNode.alpha = this.alpha;
        backgroundNode.shape = this.shape;
        backgroundNode.lastSize = 9205357640488583168L;
        return backgroundNode;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && Color.m676equalsimpl0(this.color, backgroundElement.color) && Intrinsics.areEqual(this.brush, backgroundElement.brush) && this.alpha == backgroundElement.alpha && Intrinsics.areEqual(this.shape, backgroundElement.shape);
    }

    public final int hashCode() {
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        int hashCode = Long.hashCode(this.color) * 31;
        Brush brush = this.brush;
        return this.shape.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.alpha, (hashCode + (brush != null ? brush.hashCode() : 0)) * 31, 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.getClass();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        BackgroundNode backgroundNode = (BackgroundNode) node;
        backgroundNode.color = this.color;
        backgroundNode.brush = this.brush;
        backgroundNode.alpha = this.alpha;
        Shape shape = backgroundNode.shape;
        Shape shape2 = this.shape;
        if (!Intrinsics.areEqual(shape, shape2)) {
            backgroundNode.shape = shape2;
            DepthSortedSetKt.requireLayoutNode(backgroundNode).invalidateSemantics$ui();
        }
        DepthSortedSetKt.invalidateDraw(backgroundNode);
    }
}
