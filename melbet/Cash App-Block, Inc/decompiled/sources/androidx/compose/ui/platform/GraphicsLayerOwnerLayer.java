package androidx.compose.ui.platform;

import android.view.ViewParent;
import androidx.collection.MutableObjectList;
import androidx.compose.ui.graphics.AndroidGraphicsContext;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerV29;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import coil3.size.DimensionKt;
import coil3.size.SizeKt;
import com.squareup.util.cash.Countries;
import curtains.WindowsKt$onNextDraw$1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class GraphicsLayerOwnerLayer implements OwnedLayer {
    public final GraphicsContext context;
    public Function2 drawBlock;
    public boolean drawnWithEnabledZ;
    public GraphicsLayer graphicsLayer;
    public Function0 invalidateParentLayer;
    public float[] inverseMatrixCache;
    public boolean isDestroyed;
    public boolean isDirty;
    public boolean isInverseMatrixDirty;
    public boolean isMatrixDirty;
    public int mutatedFields;
    public ColorKt outline;
    public final AndroidComposeView ownerView;
    public long size = 9223372034707292159L;
    public final float[] matrixCache = Matrix.m699constructorimpl$default();
    public Density density = SizeKt.Density$default();
    public LayoutDirection layoutDirection = LayoutDirection.Ltr;
    public final CanvasDrawScope scope = new CanvasDrawScope();
    public long transformOrigin = TransformOrigin.Center;
    public boolean isIdentity = true;
    public final WindowsKt$onNextDraw$1 recordLambda = new WindowsKt$onNextDraw$1(this, 10);

    public GraphicsLayerOwnerLayer(GraphicsLayer graphicsLayer, AndroidGraphicsContext androidGraphicsContext, AndroidComposeView androidComposeView, Function2 function2, Function0 function0) {
        this.graphicsLayer = graphicsLayer;
        this.context = androidGraphicsContext;
        this.ownerView = androidComposeView;
        this.drawBlock = function2;
        this.invalidateParentLayer = function0;
    }

    /* renamed from: getInverseMatrix-3i98HWw, reason: not valid java name */
    public final float[] m933getInverseMatrix3i98HWw() {
        float[] fArr = this.inverseMatrixCache;
        if (fArr == null) {
            fArr = Matrix.m699constructorimpl$default();
            this.inverseMatrixCache = fArr;
        }
        if (this.isInverseMatrixDirty) {
            this.isInverseMatrixDirty = false;
            float[] m934getMatrixsQKQjiQ = m934getMatrixsQKQjiQ();
            if (this.isIdentity) {
                return m934getMatrixsQKQjiQ;
            }
            if (!TestTagKt.m942invertToJiSxe2E(m934getMatrixsQKQjiQ, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArr[0])) {
            return null;
        }
        return fArr;
    }

    /* renamed from: getMatrix-sQKQjiQ, reason: not valid java name */
    public final float[] m934getMatrixsQKQjiQ() {
        boolean z = this.isMatrixDirty;
        float[] fArr = this.matrixCache;
        if (z) {
            GraphicsLayer graphicsLayer = this.graphicsLayer;
            long j = graphicsLayer.pivotOffset;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = DimensionKt.m1466getCenteruvyYCjk(Countries.m3991toSizeozmzZPI(this.size));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
            GraphicsLayerV29 graphicsLayerV29 = graphicsLayer.impl;
            float f = graphicsLayerV29.translationX;
            float f2 = graphicsLayerV29.translationY;
            float f3 = graphicsLayerV29.rotationX;
            float f4 = graphicsLayerV29.rotationY;
            float f5 = graphicsLayerV29.rotationZ;
            float f6 = graphicsLayerV29.scaleX;
            float f7 = graphicsLayerV29.scaleY;
            double d = f3 * 0.017453292519943295d;
            float sin = (float) Math.sin(d);
            float cos = (float) Math.cos(d);
            float f8 = -sin;
            float f9 = (f2 * cos) - (RecyclerView.DECELERATION_RATE * sin);
            float f10 = (RecyclerView.DECELERATION_RATE * cos) + (f2 * sin);
            double d2 = f4 * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d2);
            float cos2 = (float) Math.cos(d2);
            float f11 = -sin2;
            float f12 = sin * sin2;
            float f13 = sin * cos2;
            float f14 = cos * sin2;
            float f15 = cos * cos2;
            float f16 = (f10 * sin2) + (f * cos2);
            float f17 = (f10 * cos2) + ((-f) * sin2);
            double d3 = f5 * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d3);
            float cos3 = (float) Math.cos(d3);
            float f18 = -sin3;
            float f19 = (cos3 * f12) + (f18 * cos2);
            float f20 = ((f12 * sin3) + (cos2 * cos3)) * f6;
            float f21 = sin3 * cos * f6;
            float f22 = ((sin3 * f13) + (cos3 * f11)) * f6;
            float f23 = f19 * f7;
            float f24 = cos * cos3 * f7;
            float f25 = ((cos3 * f13) + (f18 * f11)) * f7;
            float f26 = f14 * 1.0f;
            float f27 = f8 * 1.0f;
            float f28 = f15 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f20;
                fArr[1] = f21;
                fArr[2] = f22;
                fArr[3] = 0.0f;
                fArr[4] = f23;
                fArr[5] = f24;
                fArr[6] = f25;
                fArr[7] = 0.0f;
                fArr[8] = f26;
                fArr[9] = f27;
                fArr[10] = f28;
                fArr[11] = 0.0f;
                float f29 = -intBitsToFloat;
                fArr[12] = ((f20 * f29) - (intBitsToFloat2 * f23)) + f16 + intBitsToFloat;
                fArr[13] = ((f21 * f29) - (intBitsToFloat2 * f24)) + f9 + intBitsToFloat2;
                fArr[14] = ((f29 * f22) - (intBitsToFloat2 * f25)) + f17;
                fArr[15] = 1.0f;
            }
            this.isMatrixDirty = false;
            this.isIdentity = ColorKt.m688isIdentity58bKbWc(fArr);
        }
        return fArr;
    }

    public final void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        setDirty(true);
    }

    /* renamed from: move--gyyYBs, reason: not valid java name */
    public final void m935movegyyYBs(long j) {
        boolean isArrEnabled$ui = AndroidComposeView.isArrEnabled$ui();
        AndroidComposeView androidComposeView = this.ownerView;
        if (isArrEnabled$ui) {
            androidComposeView.voteFrameRate(-4.0f);
        }
        GraphicsLayer graphicsLayer = this.graphicsLayer;
        if (!IntOffset.m1047equalsimpl0(graphicsLayer.topLeft, j)) {
            graphicsLayer.topLeft = j;
            graphicsLayer.m756setPositionVbeCjmY(j, graphicsLayer.size);
        }
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }

    /* renamed from: resize-ozmzZPI, reason: not valid java name */
    public final void m936resizeozmzZPI(long j) {
        if (IntSize.m1055equalsimpl0(j, this.size)) {
            return;
        }
        if (AndroidComposeView.isArrEnabled$ui()) {
            this.ownerView.voteFrameRate(-4.0f);
        }
        this.size = j;
        invalidate();
    }

    public final void setDirty(boolean z) {
        if (z != this.isDirty) {
            this.isDirty = z;
            AndroidComposeView androidComposeView = this.ownerView;
            MutableObjectList mutableObjectList = androidComposeView.dirtyLayers;
            boolean z2 = androidComposeView.isDrawingContent;
            if (!z) {
                if (z2) {
                    return;
                }
                mutableObjectList.remove(this);
                MutableObjectList mutableObjectList2 = androidComposeView.postponedDirtyLayers;
                if (mutableObjectList2 != null) {
                    mutableObjectList2.remove(this);
                    return;
                }
                return;
            }
            if (!z2) {
                mutableObjectList.add(this);
                return;
            }
            MutableObjectList mutableObjectList3 = androidComposeView.postponedDirtyLayers;
            if (mutableObjectList3 == null) {
                mutableObjectList3 = new MutableObjectList();
                androidComposeView.postponedDirtyLayers = mutableObjectList3;
            }
            mutableObjectList3.add(this);
        }
    }

    public final void updateDisplayList() {
        AndroidComposeView.isArrEnabled$ui();
        if (this.isDirty) {
            if (!TransformOrigin.m714equalsimpl0(this.transformOrigin, TransformOrigin.Center) && !IntSize.m1055equalsimpl0(this.graphicsLayer.size, this.size)) {
                GraphicsLayer graphicsLayer = this.graphicsLayer;
                float intBitsToFloat = Float.intBitsToFloat((int) (this.transformOrigin >> 32)) * ((int) (this.size >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (this.transformOrigin & BodyPartID.bodyIdMax)) * ((int) (this.size & BodyPartID.bodyIdMax));
                graphicsLayer.m755setPivotOffsetk4lQ0M((Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
            }
            this.graphicsLayer.m754recordmLhObY(this.density, this.layoutDirection, this.size, this.recordLambda);
            setDirty(false);
        }
    }
}
