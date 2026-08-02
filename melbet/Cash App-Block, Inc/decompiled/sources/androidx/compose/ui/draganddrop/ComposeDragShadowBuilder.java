package androidx.compose.ui.draganddrop;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityImpl;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class ComposeDragShadowBuilder extends View.DragShadowBuilder {
    public final long decorationSize;
    public final DensityImpl density;
    public final Function1 drawDragDecoration;

    public ComposeDragShadowBuilder(DensityImpl densityImpl, long j, Function1 function1) {
        this.density = densityImpl;
        this.decorationSize = j;
        this.drawDragDecoration = function1;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        CanvasDrawScope canvasDrawScope = new CanvasDrawScope();
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        Canvas canvas2 = AndroidCanvas_androidKt.EmptyCanvas;
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.internalCanvas = canvas;
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.drawParams;
        Density density = drawParams.density;
        LayoutDirection layoutDirection2 = drawParams.layoutDirection;
        androidx.compose.ui.graphics.Canvas canvas3 = drawParams.canvas;
        long j = drawParams.size;
        drawParams.density = this.density;
        drawParams.layoutDirection = layoutDirection;
        drawParams.canvas = androidCanvas;
        drawParams.size = this.decorationSize;
        androidCanvas.save();
        this.drawDragDecoration.invoke(canvasDrawScope);
        androidCanvas.restore();
        drawParams.density = density;
        drawParams.layoutDirection = layoutDirection2;
        drawParams.canvas = canvas3;
        drawParams.size = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.decorationSize;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        DensityImpl densityImpl = this.density;
        point.set(densityImpl.mo230roundToPx0680j_4(intBitsToFloat / densityImpl.getDensity()), densityImpl.mo230roundToPx0680j_4(Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) / densityImpl.getDensity()));
        point2.set(point.x / 2, point.y / 2);
    }
}
