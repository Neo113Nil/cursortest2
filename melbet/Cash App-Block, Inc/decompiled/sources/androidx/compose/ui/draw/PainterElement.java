package androidx.compose.ui.draw;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/draw/PainterNode;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PainterElement extends ModifierNodeElement {
    public final Alignment alignment;
    public final float alpha;
    public final ColorFilter colorFilter;
    public final ContentScale contentScale;
    public final Painter painter;

    public PainterElement(Painter painter, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter) {
        this.painter = painter;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f;
        this.colorFilter = colorFilter;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        PainterNode painterNode = new PainterNode();
        painterNode.painter = this.painter;
        painterNode.sizeToIntrinsics = true;
        painterNode.alignment = this.alignment;
        painterNode.contentScale = this.contentScale;
        painterNode.alpha = this.alpha;
        painterNode.colorFilter = this.colorFilter;
        return painterNode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return Intrinsics.areEqual(this.painter, painterElement.painter) && Intrinsics.areEqual(this.alignment, painterElement.alignment) && Intrinsics.areEqual(this.contentScale, painterElement.contentScale) && Float.compare(this.alpha, painterElement.alpha) == 0 && Intrinsics.areEqual(this.colorFilter, painterElement.colorFilter);
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.alpha, (this.contentScale.hashCode() + ((this.alignment.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.painter.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        ColorFilter colorFilter = this.colorFilter;
        return m + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("paint");
        inspectorInfo.getProperties().set(this.painter, "painter");
        inspectorInfo.getProperties().set(Boolean.TRUE, "sizeToIntrinsics");
        inspectorInfo.getProperties().set(this.alignment, "alignment");
        inspectorInfo.getProperties().set(this.contentScale, "contentScale");
        inspectorInfo.getProperties().set(Float.valueOf(this.alpha), "alpha");
        inspectorInfo.getProperties().set(this.colorFilter, "colorFilter");
    }

    public final String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=true, alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        PainterNode painterNode = (PainterNode) node;
        boolean z = painterNode.sizeToIntrinsics;
        Painter painter = this.painter;
        boolean z2 = (z && Size.m639equalsimpl0(painterNode.painter.mo759getIntrinsicSizeNHjbRc(), painter.mo759getIntrinsicSizeNHjbRc())) ? false : true;
        painterNode.painter = painter;
        painterNode.sizeToIntrinsics = true;
        painterNode.alignment = this.alignment;
        painterNode.contentScale = this.contentScale;
        painterNode.alpha = this.alpha;
        painterNode.colorFilter = this.colorFilter;
        if (z2) {
            DepthSortedSetKt.requireLayoutNode(painterNode).invalidateMeasurements$ui();
        }
        DepthSortedSetKt.invalidateDraw(painterNode);
    }
}
