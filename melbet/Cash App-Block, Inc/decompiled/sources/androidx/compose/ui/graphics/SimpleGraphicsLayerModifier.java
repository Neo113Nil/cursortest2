package androidx.compose.ui.graphics;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.datastore.core.SimpleActor;
import curtains.WindowsKt$onNextDraw$1;

/* loaded from: classes.dex */
public final class SimpleGraphicsLayerModifier extends Modifier.Node implements LayoutModifierNode, SemanticsModifierNode {
    public float alpha;
    public long ambientShadowColor;
    public int blendMode;
    public float cameraDistance;
    public boolean clip;
    public int compositingStrategy;
    public WindowsKt$onNextDraw$1 layerBlock;
    public float rotationZ;
    public float scaleX;
    public float scaleY;
    public float shadowElevation;
    public Shape shape;
    public long spotShadowColor;
    public long transformOrigin;

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (this.clip) {
            SemanticsPropertiesKt.setShape(semanticsPropertyReceiver, this.shape);
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
        return MeasureScope.layout$default(measureScope, mo833measureBRTryo0.width, mo833measureBRTryo0.height, new SimpleActor.AnonymousClass1(4, mo833measureBRTryo0, this));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.scaleX);
        sb.append(", scaleY=");
        sb.append(this.scaleY);
        sb.append(", alpha = ");
        sb.append(this.alpha);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.shadowElevation);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.rotationZ);
        sb.append(", cameraDistance=");
        sb.append(this.cameraDistance);
        sb.append(", transformOrigin=");
        sb.append((Object) TransformOrigin.m715toStringimpl(this.transformOrigin));
        sb.append(", shape=");
        sb.append(this.shape);
        sb.append(", clip=");
        sb.append(this.clip);
        sb.append(", renderEffect=null, ambientShadowColor=");
        Recorder$$ExternalSyntheticOutline1.m(this.ambientShadowColor, ", spotShadowColor=", sb);
        Recorder$$ExternalSyntheticOutline1.m(this.spotShadowColor, ", compositingStrategy=", sb);
        sb.append((Object) CompositingStrategy.m697toStringimpl(this.compositingStrategy));
        sb.append(", blendMode=");
        sb.append((Object) BlendMode.m669toStringimpl(this.blendMode));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
