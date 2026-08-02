package androidx.compose.ui.draw;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.BoundsAnimation$animate$1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlockGraphicsLayerModifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.io.LinesSequence;
import kotlin.jvm.internal.Intrinsics;
import sqip.internal.CardImage;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShadowGraphicsLayerElement extends ModifierNodeElement {
    public final long ambientColor;
    public final boolean clip;
    public final float elevation;
    public final Shape shape;
    public final long spotColor;

    public ShadowGraphicsLayerElement(float f, Shape shape, boolean z, long j, long j2) {
        this.elevation = f;
        this.shape = shape;
        this.clip = z;
        this.ambientColor = j;
        this.spotColor = j2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        return new BlockGraphicsLayerModifier(new BoundsAnimation$animate$1(this, 6));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return Dp.m1037equalsimpl0(this.elevation, shadowGraphicsLayerElement.elevation) && Intrinsics.areEqual(this.shape, shadowGraphicsLayerElement.shape) && this.clip == shadowGraphicsLayerElement.clip && Color.m676equalsimpl0(this.ambientColor, shadowGraphicsLayerElement.ambientColor) && Color.m676equalsimpl0(this.spotColor, shadowGraphicsLayerElement.spotColor);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.shape.hashCode() + (Float.hashCode(this.elevation) * 31)) * 31, 31, this.clip);
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return Long.hashCode(this.spotColor) + Recorder$$ExternalSyntheticOutline2.m(m, 31, this.ambientColor);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.name = "shadow";
        LinesSequence linesSequence = inspectorInfo.properties;
        linesSequence.set(new Dp(this.elevation), CardImage.ELEVATION);
        linesSequence.set(this.shape, "shape");
        linesSequence.set(Boolean.valueOf(this.clip), "clip");
        linesSequence.set(new Color(this.ambientColor), "ambientColor");
        linesSequence.set(new Color(this.spotColor), "spotColor");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        Recorder$$ExternalSyntheticOutline1.m104m(this.elevation, ", shape=", sb);
        sb.append(this.shape);
        sb.append(", clip=");
        sb.append(this.clip);
        sb.append(", ambientColor=");
        Recorder$$ExternalSyntheticOutline1.m(this.ambientColor, ", spotColor=", sb);
        sb.append((Object) Color.m682toStringimpl(this.spotColor));
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        NodeCoordinator nodeCoordinator;
        BlockGraphicsLayerModifier blockGraphicsLayerModifier = (BlockGraphicsLayerModifier) node;
        BoundsAnimation$animate$1 boundsAnimation$animate$1 = new BoundsAnimation$animate$1(this, 6);
        blockGraphicsLayerModifier.layerBlock = boundsAnimation$animate$1;
        if (blockGraphicsLayerModifier.getNode().isAttached() && (nodeCoordinator = DepthSortedSetKt.m864requireCoordinator64DMado(blockGraphicsLayerModifier, 2).wrapped) != null) {
            nodeCoordinator.updateLayerBlock(true, boundsAnimation$animate$1);
        }
    }
}
