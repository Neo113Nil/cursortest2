package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidPaint;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline$Generic;
import androidx.compose.ui.graphics.Outline$Rectangle;
import androidx.compose.ui.graphics.Outline$Rounded;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContextKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.DisplayCompat;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.MemoryCacheService;
import coil3.util.AndroidSystemCallbacks;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.wire.GrpcMethod;
import curtains.WindowsKt$onNextDraw$1;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class GraphicsLayer {
    public Outline androidOutline;
    public boolean clip;
    public final GraphicsLayerV29 impl;
    public ColorKt internalOutline;
    public boolean isReleased;
    public AndroidPath outlinePath;
    public int parentLayerUsages;
    public RectF pathBounds;
    public long pivotOffset;
    public AndroidPath roundRectClipPath;
    public float roundRectCornerRadius;
    public long size;
    public CanvasDrawScope softwareDrawScope;
    public AndroidPaint softwareLayerPaint;
    public long topLeft;
    public boolean usePathForClip;
    public Density density = DrawContextKt.DefaultDensity;
    public LayoutDirection layoutDirection = LayoutDirection.Ltr;
    public Function1 drawBlock = GraphicsLayer$drawBlock$1.INSTANCE;
    public final WindowsKt$onNextDraw$1 clipDrawBlock = new WindowsKt$onNextDraw$1(this, 2);
    public boolean outlineDirty = true;
    public long roundRectOutlineTopLeft = 0;
    public long roundRectOutlineSize = 9205357640488583168L;
    public final AndroidSystemCallbacks childDependenciesTracker = new AndroidSystemCallbacks();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        lowerCase.equals("robolectric");
    }

    public GraphicsLayer(GraphicsLayerV29 graphicsLayerV29) {
        this.impl = graphicsLayerV29;
        graphicsLayerV29.clip = false;
        graphicsLayerV29.applyClip();
        this.topLeft = 0L;
        this.size = 0L;
        this.pivotOffset = 9205357640488583168L;
    }

    public final void configureOutlineAndClip() {
        GraphicsLayerV29 graphicsLayerV29 = this.impl;
        RenderNode renderNode = graphicsLayerV29.renderNode;
        if (this.outlineDirty) {
            boolean z = this.clip;
            if (z || graphicsLayerV29.shadowElevation > RecyclerView.DECELERATION_RATE) {
                AndroidPath androidPath = this.outlinePath;
                if (androidPath != null) {
                    RectF rectF = this.pathBounds;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.pathBounds = rectF;
                    }
                    boolean z2 = androidPath instanceof AndroidPath;
                    if (!z2) {
                        a$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
                        return;
                    }
                    Path path = androidPath.internalPath;
                    path.computeBounds(rectF, false);
                    Outline outline = this.androidOutline;
                    if (outline == null) {
                        outline = new Outline();
                        this.androidOutline = outline;
                    }
                    if (Build.VERSION.SDK_INT >= 30) {
                        WindowCompat$Api35Impl.setPath(outline, androidPath);
                    } else {
                        if (!z2) {
                            a$$ExternalSyntheticBUOutline0.m("Unable to obtain android.graphics.Path");
                            return;
                        }
                        outline.setConvexPath(path);
                    }
                    this.usePathForClip = !outline.canClip();
                    this.outlinePath = androidPath;
                    outline.setAlpha(graphicsLayerV29.alpha);
                    Math.round(rectF.width());
                    Math.round(rectF.height());
                    renderNode.setOutline(outline);
                    graphicsLayerV29.outlineIsProvided = true;
                    graphicsLayerV29.applyClip();
                    if (this.usePathForClip && this.clip) {
                        graphicsLayerV29.clip = false;
                        graphicsLayerV29.applyClip();
                        renderNode.discardDisplayList();
                    } else {
                        graphicsLayerV29.clip = this.clip;
                        graphicsLayerV29.applyClip();
                    }
                } else {
                    graphicsLayerV29.clip = z;
                    graphicsLayerV29.applyClip();
                    Outline outline2 = this.androidOutline;
                    if (outline2 == null) {
                        outline2 = new Outline();
                        this.androidOutline = outline2;
                    }
                    Outline outline3 = outline2;
                    long m3991toSizeozmzZPI = Countries.m3991toSizeozmzZPI(this.size);
                    long j = this.roundRectOutlineTopLeft;
                    long j2 = this.roundRectOutlineSize;
                    long j3 = j2 == 9205357640488583168L ? m3991toSizeozmzZPI : j2;
                    int i = (int) (j >> 32);
                    int round = Math.round(Float.intBitsToFloat(i));
                    int i2 = (int) (j & BodyPartID.bodyIdMax);
                    outline3.setRoundRect(round, Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i)), Math.round(Float.intBitsToFloat((int) (j3 & BodyPartID.bodyIdMax)) + Float.intBitsToFloat(i2)), this.roundRectCornerRadius);
                    outline3.setAlpha(graphicsLayerV29.alpha);
                    Countries.m3989roundToIntSizeuvyYCjk(j3);
                    renderNode.setOutline(outline3);
                    graphicsLayerV29.outlineIsProvided = true;
                    graphicsLayerV29.applyClip();
                }
            } else {
                graphicsLayerV29.clip = false;
                graphicsLayerV29.applyClip();
                renderNode.setOutline(null);
                graphicsLayerV29.outlineIsProvided = false;
                graphicsLayerV29.applyClip();
            }
        }
        this.outlineDirty = false;
    }

    public final void discardContentIfReleasedAndHaveNoParentLayerUsages() {
        if (this.isReleased && this.parentLayerUsages == 0) {
            AndroidSystemCallbacks androidSystemCallbacks = this.childDependenciesTracker;
            GraphicsLayer graphicsLayer = (GraphicsLayer) androidSystemCallbacks.imageLoader;
            if (graphicsLayer != null) {
                graphicsLayer.parentLayerUsages--;
                graphicsLayer.discardContentIfReleasedAndHaveNoParentLayerUsages();
                androidSystemCallbacks.imageLoader = null;
            }
            MutableScatterSet mutableScatterSet = (MutableScatterSet) androidSystemCallbacks.componentCallbacks;
            if (mutableScatterSet != null) {
                Object[] objArr = mutableScatterSet.elements;
                long[] jArr = mutableScatterSet.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    r11.parentLayerUsages--;
                                    ((GraphicsLayer) objArr[(i << 3) + i3]).discardContentIfReleasedAndHaveNoParentLayerUsages();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                mutableScatterSet.clear();
            }
            this.impl.renderNode.discardDisplayList();
        }
    }

    public final void drawWithChildTracking(DrawScope drawScope) {
        AndroidSystemCallbacks androidSystemCallbacks = this.childDependenciesTracker;
        androidSystemCallbacks.activityCallbacks = (GraphicsLayer) androidSystemCallbacks.imageLoader;
        MutableScatterSet mutableScatterSet = (MutableScatterSet) androidSystemCallbacks.componentCallbacks;
        if (mutableScatterSet != null && mutableScatterSet.isNotEmpty()) {
            MutableScatterSet mutableScatterSet2 = (MutableScatterSet) androidSystemCallbacks.application;
            if (mutableScatterSet2 == null) {
                MutableScatterSet mutableScatterSet3 = ScatterSetKt.EmptyScatterSet;
                mutableScatterSet2 = new MutableScatterSet();
                androidSystemCallbacks.application = mutableScatterSet2;
            }
            mutableScatterSet2.plusAssign(mutableScatterSet);
            mutableScatterSet.clear();
        }
        androidSystemCallbacks.shutdown = true;
        this.drawBlock.invoke(drawScope);
        androidSystemCallbacks.shutdown = false;
        GraphicsLayer graphicsLayer = (GraphicsLayer) androidSystemCallbacks.activityCallbacks;
        if (graphicsLayer != null) {
            graphicsLayer.parentLayerUsages--;
            graphicsLayer.discardContentIfReleasedAndHaveNoParentLayerUsages();
        }
        MutableScatterSet mutableScatterSet4 = (MutableScatterSet) androidSystemCallbacks.application;
        if (mutableScatterSet4 == null || !mutableScatterSet4.isNotEmpty()) {
            return;
        }
        Object[] objArr = mutableScatterSet4.elements;
        long[] jArr = mutableScatterSet4.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            r9.parentLayerUsages--;
                            ((GraphicsLayer) objArr[(i << 3) + i3]).discardContentIfReleasedAndHaveNoParentLayerUsages();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        mutableScatterSet4.clear();
    }

    public final ColorKt getOutline() {
        ColorKt outline$Rectangle;
        ColorKt colorKt = this.internalOutline;
        AndroidPath androidPath = this.outlinePath;
        if (colorKt != null) {
            return colorKt;
        }
        if (androidPath != null) {
            Outline$Generic outline$Generic = new Outline$Generic(androidPath);
            this.internalOutline = outline$Generic;
            return outline$Generic;
        }
        long m3991toSizeozmzZPI = Countries.m3991toSizeozmzZPI(this.size);
        long j = this.roundRectOutlineTopLeft;
        long j2 = this.roundRectOutlineSize;
        if (j2 != 9205357640488583168L) {
            m3991toSizeozmzZPI = j2;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (m3991toSizeozmzZPI >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (m3991toSizeozmzZPI & BodyPartID.bodyIdMax)) + intBitsToFloat2;
        if (this.roundRectCornerRadius > RecyclerView.DECELERATION_RATE) {
            long floatToRawIntBits = (Float.floatToRawIntBits(r0) << 32) | (Float.floatToRawIntBits(r0) & BodyPartID.bodyIdMax);
            outline$Rectangle = new Outline$Rounded(Strings.RoundRect(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & BodyPartID.bodyIdMax))));
        } else {
            outline$Rectangle = new Outline$Rectangle(new Rect(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.internalOutline = outline$Rectangle;
        return outline$Rectangle;
    }

    /* renamed from: record-mL-hObY, reason: not valid java name */
    public final void m754recordmLhObY(Density density, LayoutDirection layoutDirection, long j, Function1 function1) {
        if (!IntSize.m1055equalsimpl0(this.size, j)) {
            this.size = j;
            m756setPositionVbeCjmY(this.topLeft, j);
            if (this.roundRectOutlineSize == 9205357640488583168L) {
                this.outlineDirty = true;
                configureOutlineAndClip();
            }
        }
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = function1;
        recordInternal();
    }

    public final void recordInternal() {
        Density density = this.density;
        LayoutDirection layoutDirection = this.layoutDirection;
        WindowsKt$onNextDraw$1 windowsKt$onNextDraw$1 = this.clipDrawBlock;
        GraphicsLayerV29 graphicsLayerV29 = this.impl;
        CanvasDrawScope canvasDrawScope = graphicsLayerV29.canvasDrawScope;
        RenderNode renderNode = graphicsLayerV29.renderNode;
        RecordingCanvas beginRecording = renderNode.beginRecording();
        try {
            MemoryCacheService memoryCacheService = graphicsLayerV29.canvasHolder;
            AndroidCanvas androidCanvas = (AndroidCanvas) memoryCacheService.imageLoader;
            Canvas canvas = androidCanvas.internalCanvas;
            androidCanvas.internalCanvas = beginRecording;
            GrpcMethod grpcMethod = canvasDrawScope.drawContext;
            grpcMethod.setDensity(density);
            grpcMethod.setLayoutDirection(layoutDirection);
            grpcMethod.requestAdapter = this;
            grpcMethod.m4000setSizeuvyYCjk(graphicsLayerV29.size);
            grpcMethod.setCanvas(androidCanvas);
            windowsKt$onNextDraw$1.invoke(canvasDrawScope);
            ((AndroidCanvas) memoryCacheService.imageLoader).internalCanvas = canvas;
        } finally {
            renderNode.endRecording();
        }
    }

    public final void setAlpha(float f) {
        GraphicsLayerV29 graphicsLayerV29 = this.impl;
        if (graphicsLayerV29.alpha == f) {
            return;
        }
        graphicsLayerV29.alpha = f;
        graphicsLayerV29.renderNode.setAlpha(f);
    }

    public final void setClip(boolean z) {
        if (this.clip != z) {
            this.clip = z;
            this.outlineDirty = true;
            configureOutlineAndClip();
        }
    }

    /* renamed from: setPivotOffset-k-4lQ0M, reason: not valid java name */
    public final void m755setPivotOffsetk4lQ0M(long j) {
        if (Offset.m622equalsimpl0(this.pivotOffset, j)) {
            return;
        }
        this.pivotOffset = j;
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.impl.renderNode;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            renderNode.setPivotY(Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
        }
    }

    /* renamed from: setPosition-VbeCjmY, reason: not valid java name */
    public final void m756setPositionVbeCjmY(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & BodyPartID.bodyIdMax);
        GraphicsLayerV29 graphicsLayerV29 = this.impl;
        graphicsLayerV29.renderNode.setPosition(i, i2, ((int) (j2 >> 32)) + i, ((int) (BodyPartID.bodyIdMax & j2)) + i2);
        graphicsLayerV29.size = Countries.m3991toSizeozmzZPI(j2);
    }

    public final void setRenderEffect(RenderEffect renderEffect) {
        GraphicsLayerV29 graphicsLayerV29 = this.impl;
        if (Intrinsics.areEqual(graphicsLayerV29.renderEffect, renderEffect)) {
            return;
        }
        graphicsLayerV29.renderEffect = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            DisplayCompat.setRenderEffect(graphicsLayerV29.renderNode, renderEffect);
        }
    }

    /* renamed from: setRoundRectOutline-TNW_H78, reason: not valid java name */
    public final void m757setRoundRectOutlineTNW_H78(float f, long j, long j2) {
        if (Offset.m622equalsimpl0(this.roundRectOutlineTopLeft, j) && Size.m639equalsimpl0(this.roundRectOutlineSize, j2) && this.roundRectCornerRadius == f && this.outlinePath == null) {
            return;
        }
        this.internalOutline = null;
        this.outlinePath = null;
        this.outlineDirty = true;
        this.usePathForClip = false;
        this.roundRectOutlineTopLeft = j;
        this.roundRectOutlineSize = j2;
        this.roundRectCornerRadius = f;
        configureOutlineAndClip();
    }
}
