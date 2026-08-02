package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline$Generic;
import androidx.compose.ui.graphics.Outline$Rectangle;
import androidx.compose.ui.graphics.Outline$Rounded;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import coil3.ComponentRegistry$Builder$$ExternalSyntheticLambda3;
import com.plaid.internal.EnumC0170g;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class BackgroundNode extends Modifier.Node implements DrawModifierNode, ObserverModifierNode, SemanticsModifierNode {
    public float alpha;
    public Brush brush;
    public long color;
    public LayoutDirection lastLayoutDirection;
    public ColorKt lastOutline;
    public Shape lastShape;
    public long lastSize;
    public Shape shape;
    public ColorKt tmpOutline;

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setShape(semanticsPropertyReceiver, this.shape);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(LayoutNodeDrawScope layoutNodeDrawScope) {
        ColorKt colorKt;
        Brush brush;
        float f;
        AndroidPath androidPath;
        LayoutNodeDrawScope layoutNodeDrawScope2;
        CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.canvasDrawScope;
        if (this.shape == ColorKt.RectangleShape) {
            if (!Color.m676equalsimpl0(this.color, Color.Unspecified)) {
                DrawScope.m747drawRectnJ9OG0$default(layoutNodeDrawScope, this.color, 0L, 0L, RecyclerView.DECELERATION_RATE, null, null, 0, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            }
            Brush brush2 = this.brush;
            if (brush2 != null) {
                DrawScope.m746drawRectAsUm42w$default(layoutNodeDrawScope, brush2, 0L, 0L, this.alpha, null, null, 0, 118);
            }
        } else {
            if (Size.m639equalsimpl0(canvasDrawScope.mo753getSizeNHjbRc(), this.lastSize) && layoutNodeDrawScope.getLayoutDirection() == this.lastLayoutDirection && Intrinsics.areEqual(this.lastShape, this.shape)) {
                colorKt = this.lastOutline;
                colorKt.getClass();
            } else {
                DepthSortedSetKt.observeReads(this, new ComponentRegistry$Builder$$ExternalSyntheticLambda3(3, this, layoutNodeDrawScope));
                colorKt = this.tmpOutline;
                this.tmpOutline = null;
            }
            this.lastOutline = colorKt;
            this.lastSize = canvasDrawScope.mo753getSizeNHjbRc();
            this.lastLayoutDirection = layoutNodeDrawScope.getLayoutDirection();
            this.lastShape = this.shape;
            colorKt.getClass();
            if (!Color.m676equalsimpl0(this.color, Color.Unspecified)) {
                ColorKt.m685drawOutlinewDX37Ww$default(layoutNodeDrawScope, colorKt, this.color);
            }
            Brush brush3 = this.brush;
            if (brush3 != null) {
                float f2 = this.alpha;
                boolean z = colorKt instanceof Outline$Rectangle;
                Fill fill = Fill.INSTANCE;
                if (z) {
                    Rect rect = ((Outline$Rectangle) colorKt).rect;
                    float f3 = rect.left;
                    float f4 = rect.top;
                    layoutNodeDrawScope.mo734drawRectAsUm42w(brush3, (BodyPartID.bodyIdMax & Float.floatToRawIntBits(f4)) | (Float.floatToRawIntBits(f3) << 32), ColorKt.size(rect), f2, fill, null, 3);
                } else {
                    if (colorKt instanceof Outline$Rounded) {
                        Outline$Rounded outline$Rounded = (Outline$Rounded) colorKt;
                        brush = brush3;
                        androidPath = outline$Rounded.roundRectPath;
                        if (androidPath != null) {
                            layoutNodeDrawScope2 = layoutNodeDrawScope;
                            f = f2;
                        } else {
                            RoundRect roundRect = outline$Rounded.roundRect;
                            float intBitsToFloat = Float.intBitsToFloat((int) (roundRect.bottomLeftCornerRadius >> 32));
                            float f5 = roundRect.left;
                            float f6 = roundRect.top;
                            long floatToRawIntBits = (Float.floatToRawIntBits(f6) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f5) << 32);
                            float width = roundRect.getWidth();
                            float height = roundRect.getHeight();
                            layoutNodeDrawScope.m875drawRoundRectZuiqVtQ(brush, floatToRawIntBits, (Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & BodyPartID.bodyIdMax), (BodyPartID.bodyIdMax & Float.floatToRawIntBits(intBitsToFloat)) | (Float.floatToRawIntBits(intBitsToFloat) << 32), f2, fill);
                        }
                    } else {
                        if (!(colorKt instanceof Outline$Generic)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        AndroidPath androidPath2 = ((Outline$Generic) colorKt).path;
                        brush = brush3;
                        f = f2;
                        androidPath = androidPath2;
                        layoutNodeDrawScope2 = layoutNodeDrawScope;
                    }
                    layoutNodeDrawScope2.mo731drawPathGBMwjPU(androidPath, brush, f, fill, 3);
                }
            }
        }
        layoutNodeDrawScope.drawContent();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean isImportantForBounds() {
        return false;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        this.lastSize = 9205357640488583168L;
        this.lastLayoutDirection = null;
        this.lastOutline = null;
        this.lastShape = null;
        DepthSortedSetKt.invalidateDraw(this);
    }
}
