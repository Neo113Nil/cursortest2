package androidx.compose.ui.graphics.vector;

import android.graphics.Path;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPathMeasure;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PathComponent extends VNode {
    public AndroidPath _tmpPath;
    public Brush fill;
    public boolean isTrimPathDirty;
    public final AndroidPath path;
    public final Lazy pathMeasure$delegate;
    public AndroidPath renderPath;
    public Brush stroke;
    public float strokeLineWidth;
    public Stroke strokeStyle;
    public float trimPathOffset;
    public float trimPathStart;
    public float fillAlpha = 1.0f;
    public List pathData = VectorKt.EmptyPath;
    public float strokeAlpha = 1.0f;
    public int strokeLineCap = 0;
    public int strokeLineJoin = 0;
    public float strokeLineMiter = 4.0f;
    public float trimPathEnd = 1.0f;
    public boolean isPathDirty = true;
    public boolean isStrokeDirty = true;

    public PathComponent() {
        AndroidPath Path = AndroidPath_androidKt.Path();
        this.path = Path;
        this.renderPath = Path;
        this.pathMeasure$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) PathComponent$pathMeasure$2.INSTANCE);
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public final void draw(DrawScope drawScope) {
        Stroke stroke;
        if (this.isPathDirty) {
            PathParserKt.toPath(this.pathData, this.path);
            updateRenderPath();
        } else if (this.isTrimPathDirty) {
            updateRenderPath();
        }
        this.isPathDirty = false;
        this.isTrimPathDirty = false;
        Brush brush = this.fill;
        if (brush != null) {
            DrawScope.m744drawPathGBMwjPU$default(drawScope, this.renderPath, brush, this.fillAlpha, null, 56);
        }
        Brush brush2 = this.stroke;
        if (brush2 != null) {
            Stroke stroke2 = this.strokeStyle;
            if (this.isStrokeDirty || stroke2 == null) {
                Stroke stroke3 = new Stroke(this.strokeLineWidth, this.strokeLineMiter, this.strokeLineCap, this.strokeLineJoin, null, 16);
                this.strokeStyle = stroke3;
                this.isStrokeDirty = false;
                stroke = stroke3;
            } else {
                stroke = stroke2;
            }
            DrawScope.m744drawPathGBMwjPU$default(drawScope, this.renderPath, brush2, this.strokeAlpha, stroke, 48);
        }
    }

    public final String toString() {
        return this.path.toString();
    }

    public final void updateRenderPath() {
        float f = this.trimPathStart;
        AndroidPath androidPath = this.path;
        if (f == RecyclerView.DECELERATION_RATE && this.trimPathEnd == 1.0f) {
            this.renderPath = androidPath;
            return;
        }
        if (Intrinsics.areEqual(this.renderPath, androidPath)) {
            this.renderPath = AndroidPath_androidKt.Path();
        } else {
            int i = this.renderPath.internalPath.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
            this.renderPath.rewind();
            this.renderPath.m666setFillTypeoQ8Xj4U(i);
        }
        Lazy lazy = this.pathMeasure$delegate;
        ((AndroidPathMeasure) lazy.getValue()).setPath(androidPath);
        float length = ((AndroidPathMeasure) lazy.getValue()).getLength();
        float f2 = this.trimPathStart;
        float f3 = this.trimPathOffset;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.trimPathEnd + f3) % 1.0f) * length;
        if (f4 <= f5) {
            ((AndroidPathMeasure) lazy.getValue()).getSegment(f4, f5, this.renderPath);
            return;
        }
        AndroidPath androidPath2 = this._tmpPath;
        if (androidPath2 == null) {
            androidPath2 = AndroidPath_androidKt.Path();
            this._tmpPath = androidPath2;
        }
        androidPath2.reset();
        ((AndroidPathMeasure) lazy.getValue()).getSegment(f4, length, androidPath2);
        AndroidPath.m664addPathUv8p0NA$default(this.renderPath, androidPath2);
        androidPath2.reset();
        ((AndroidPathMeasure) lazy.getValue()).getSegment(RecyclerView.DECELERATION_RATE, f5, androidPath2);
        AndroidPath.m664addPathUv8p0NA$default(this.renderPath, androidPath2);
    }
}
