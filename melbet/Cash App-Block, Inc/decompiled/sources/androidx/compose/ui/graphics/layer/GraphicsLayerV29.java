package androidx.compose.ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import coil3.memory.MemoryCacheService;

/* loaded from: classes.dex */
public final class GraphicsLayerV29 {
    public float alpha;
    public long ambientShadowColor;
    public int blendMode;
    public float cameraDistance;
    public final CanvasDrawScope canvasDrawScope;
    public final MemoryCacheService canvasHolder;
    public boolean clip;
    public boolean clipToBounds;
    public boolean clipToOutline;
    public int compositingStrategy;
    public Paint layerPaint;
    public Matrix matrix;
    public boolean outlineIsProvided;
    public RenderEffect renderEffect;
    public final RenderNode renderNode;
    public float rotationX;
    public float rotationY;
    public float rotationZ;
    public float scaleX;
    public float scaleY;
    public float shadowElevation;
    public long size;
    public long spotShadowColor;
    public float translationX;
    public float translationY;

    public GraphicsLayerV29() {
        MemoryCacheService memoryCacheService = new MemoryCacheService(9);
        CanvasDrawScope canvasDrawScope = new CanvasDrawScope();
        this.canvasHolder = memoryCacheService;
        this.canvasDrawScope = canvasDrawScope;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.renderNode = renderNode;
        this.size = 0L;
        renderNode.setClipToBounds(false);
        m758applyCompositingStrategyZ1X6vPc(renderNode, 0);
        this.alpha = 1.0f;
        this.blendMode = 3;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        long j = Color.Black;
        this.ambientShadowColor = j;
        this.spotShadowColor = j;
        this.cameraDistance = 8.0f;
        this.compositingStrategy = 0;
    }

    public final void applyClip() {
        boolean z = this.clip;
        boolean z2 = false;
        boolean z3 = z && !this.outlineIsProvided;
        if (z && this.outlineIsProvided) {
            z2 = true;
        }
        boolean z4 = this.clipToBounds;
        RenderNode renderNode = this.renderNode;
        if (z3 != z4) {
            this.clipToBounds = z3;
            renderNode.setClipToBounds(z3);
        }
        if (z2 != this.clipToOutline) {
            this.clipToOutline = z2;
            renderNode.setClipToOutline(z2);
        }
    }

    /* renamed from: applyCompositingStrategy-Z1X6vPc, reason: not valid java name */
    public final void m758applyCompositingStrategyZ1X6vPc(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        Paint paint = this.layerPaint;
        if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void updateLayerProperties() {
        int i = this.compositingStrategy;
        RenderNode renderNode = this.renderNode;
        if (i != 1 && this.blendMode == 3 && this.renderEffect == null) {
            m758applyCompositingStrategyZ1X6vPc(renderNode, i);
        } else {
            m758applyCompositingStrategyZ1X6vPc(renderNode, 1);
        }
    }
}
