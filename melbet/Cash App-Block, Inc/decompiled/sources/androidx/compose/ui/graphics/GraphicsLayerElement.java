package androidx.compose.ui.graphics;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.recyclerview.widget.RecyclerView;
import curtains.WindowsKt$onNextDraw$1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.io.LinesSequence;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class GraphicsLayerElement extends ModifierNodeElement {
    public final float alpha;
    public final long ambientShadowColor;
    public final boolean clip;
    public final int compositingStrategy;
    public final float rotationZ;
    public final float scaleX;
    public final float scaleY;
    public final float shadowElevation;
    public final Shape shape;
    public final long spotShadowColor;
    public final long transformOrigin;

    public GraphicsLayerElement(float f, float f2, float f3, float f4, float f5, long j, Shape shape, boolean z, long j2, long j3, int i) {
        this.scaleX = f;
        this.scaleY = f2;
        this.alpha = f3;
        this.shadowElevation = f4;
        this.rotationZ = f5;
        this.transformOrigin = j;
        this.shape = shape;
        this.clip = z;
        this.ambientShadowColor = j2;
        this.spotShadowColor = j3;
        this.compositingStrategy = i;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        SimpleGraphicsLayerModifier simpleGraphicsLayerModifier = new SimpleGraphicsLayerModifier();
        simpleGraphicsLayerModifier.scaleX = this.scaleX;
        simpleGraphicsLayerModifier.scaleY = this.scaleY;
        simpleGraphicsLayerModifier.alpha = this.alpha;
        simpleGraphicsLayerModifier.shadowElevation = this.shadowElevation;
        simpleGraphicsLayerModifier.rotationZ = this.rotationZ;
        simpleGraphicsLayerModifier.cameraDistance = 8.0f;
        simpleGraphicsLayerModifier.transformOrigin = this.transformOrigin;
        simpleGraphicsLayerModifier.shape = this.shape;
        simpleGraphicsLayerModifier.clip = this.clip;
        simpleGraphicsLayerModifier.ambientShadowColor = this.ambientShadowColor;
        simpleGraphicsLayerModifier.spotShadowColor = this.spotShadowColor;
        simpleGraphicsLayerModifier.compositingStrategy = this.compositingStrategy;
        simpleGraphicsLayerModifier.blendMode = 3;
        simpleGraphicsLayerModifier.layerBlock = new WindowsKt$onNextDraw$1(simpleGraphicsLayerModifier, 1);
        return simpleGraphicsLayerModifier;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.scaleX, graphicsLayerElement.scaleX) == 0 && Float.compare(this.scaleY, graphicsLayerElement.scaleY) == 0 && Float.compare(this.alpha, graphicsLayerElement.alpha) == 0 && Float.compare(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == 0 && Float.compare(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == 0 && Float.compare(this.shadowElevation, graphicsLayerElement.shadowElevation) == 0 && Float.compare(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == 0 && Float.compare(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == 0 && Float.compare(this.rotationZ, graphicsLayerElement.rotationZ) == 0 && Float.compare(8.0f, 8.0f) == 0 && TransformOrigin.m714equalsimpl0(this.transformOrigin, graphicsLayerElement.transformOrigin) && Intrinsics.areEqual(this.shape, graphicsLayerElement.shape) && this.clip == graphicsLayerElement.clip && Color.m676equalsimpl0(this.ambientShadowColor, graphicsLayerElement.ambientShadowColor) && Color.m676equalsimpl0(this.spotShadowColor, graphicsLayerElement.spotShadowColor) && this.compositingStrategy == graphicsLayerElement.compositingStrategy;
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(8.0f, CameraState$Type$EnumUnboxingLocalUtility.m(this.rotationZ, CameraState$Type$EnumUnboxingLocalUtility.m(RecyclerView.DECELERATION_RATE, CameraState$Type$EnumUnboxingLocalUtility.m(RecyclerView.DECELERATION_RATE, CameraState$Type$EnumUnboxingLocalUtility.m(this.shadowElevation, CameraState$Type$EnumUnboxingLocalUtility.m(RecyclerView.DECELERATION_RATE, CameraState$Type$EnumUnboxingLocalUtility.m(RecyclerView.DECELERATION_RATE, CameraState$Type$EnumUnboxingLocalUtility.m(this.alpha, CameraState$Type$EnumUnboxingLocalUtility.m(this.scaleY, Float.hashCode(this.scaleX) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = TransformOrigin.$r8$clinit;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.shape.hashCode() + Recorder$$ExternalSyntheticOutline2.m(m, 31, this.transformOrigin)) * 31, 961, this.clip);
        int i2 = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(3, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.compositingStrategy, Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(m2, 31, this.ambientShadowColor), 31, this.spotShadowColor), 31), 31);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("graphicsLayer");
        inspectorInfo.getProperties().set(Float.valueOf(this.scaleX), "scaleX");
        inspectorInfo.getProperties().set(Float.valueOf(this.scaleY), "scaleY");
        inspectorInfo.getProperties().set(Float.valueOf(this.alpha), "alpha");
        LinesSequence properties = inspectorInfo.getProperties();
        Float valueOf = Float.valueOf(RecyclerView.DECELERATION_RATE);
        properties.set(valueOf, "translationX");
        inspectorInfo.getProperties().set(valueOf, "translationY");
        inspectorInfo.getProperties().set(Float.valueOf(this.shadowElevation), "shadowElevation");
        inspectorInfo.getProperties().set(valueOf, "rotationX");
        inspectorInfo.getProperties().set(valueOf, "rotationY");
        inspectorInfo.getProperties().set(Float.valueOf(this.rotationZ), "rotationZ");
        inspectorInfo.getProperties().set(Float.valueOf(8.0f), "cameraDistance");
        inspectorInfo.getProperties().set(new TransformOrigin(this.transformOrigin), "transformOrigin");
        inspectorInfo.getProperties().set(this.shape, "shape");
        inspectorInfo.getProperties().set(Boolean.valueOf(this.clip), "clip");
        inspectorInfo.getProperties().set(null, "renderEffect");
        inspectorInfo.getProperties().set(new Color(this.ambientShadowColor), "ambientShadowColor");
        inspectorInfo.getProperties().set(new Color(this.spotShadowColor), "spotShadowColor");
        inspectorInfo.getProperties().set(new CompositingStrategy(this.compositingStrategy), "compositingStrategy");
        inspectorInfo.getProperties().set(new BlendMode(), "blendMode");
        inspectorInfo.getProperties().set(null, "colorFilter");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb.append(this.scaleX);
        sb.append(", scaleY=");
        sb.append(this.scaleY);
        sb.append(", alpha=");
        sb.append(this.alpha);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.shadowElevation);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb.append(this.rotationZ);
        sb.append(", cameraDistance=8.0, transformOrigin=");
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
        sb.append((Object) BlendMode.m669toStringimpl(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        NodeCoordinator nodeCoordinator;
        SimpleGraphicsLayerModifier simpleGraphicsLayerModifier = (SimpleGraphicsLayerModifier) node;
        simpleGraphicsLayerModifier.scaleX = this.scaleX;
        simpleGraphicsLayerModifier.scaleY = this.scaleY;
        simpleGraphicsLayerModifier.alpha = this.alpha;
        simpleGraphicsLayerModifier.shadowElevation = this.shadowElevation;
        simpleGraphicsLayerModifier.rotationZ = this.rotationZ;
        simpleGraphicsLayerModifier.cameraDistance = 8.0f;
        simpleGraphicsLayerModifier.transformOrigin = this.transformOrigin;
        simpleGraphicsLayerModifier.shape = this.shape;
        simpleGraphicsLayerModifier.clip = this.clip;
        simpleGraphicsLayerModifier.ambientShadowColor = this.ambientShadowColor;
        simpleGraphicsLayerModifier.spotShadowColor = this.spotShadowColor;
        simpleGraphicsLayerModifier.compositingStrategy = this.compositingStrategy;
        simpleGraphicsLayerModifier.blendMode = 3;
        WindowsKt$onNextDraw$1 windowsKt$onNextDraw$1 = simpleGraphicsLayerModifier.layerBlock;
        if (simpleGraphicsLayerModifier.getNode().isAttached() && (nodeCoordinator = DepthSortedSetKt.m864requireCoordinator64DMado(simpleGraphicsLayerModifier, 2).wrapped) != null) {
            nodeCoordinator.updateLayerBlock(true, windowsKt$onNextDraw$1);
        }
    }
}
