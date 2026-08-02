package com.google.android.material.shape;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.google.android.material.drawable.DrawableUtils$OutlineCompatL;
import com.google.android.material.drawable.DrawableUtils$OutlineCompatR;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.shadow.ShadowRenderer;
import com.google.android.material.shape.ShapePath;
import com.google.mlkit.vision.common.zzb;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.RealBugReportSenderFactory;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes4.dex */
public class MaterialShapeDrawable extends Drawable implements Shapeable {
    public static final SpringAnimatedCornerSizeProperty[] CORNER_SIZES_IN_PX;
    public static final Paint clearPaint;
    public final BitSet containsIncompatibleShadowOp;
    public final ShapePath.ShadowCompatOperation[] cornerShadowOperation;
    public final SpringAnimation[] cornerSpringAnimations;
    public SpringForce cornerSpringForce;
    public MaterialShapeDrawableState drawableState;
    public final ShapePath.ShadowCompatOperation[] edgeShadowOperation;
    public final Paint fillPaint;
    public final RectF insetRectF;
    public boolean isRoundRectCornerMorph;
    public final Matrix matrix;
    public MaterialButton$$ExternalSyntheticLambda3 onCornerSizeChangeListener;
    public final Path path;
    public final RectF pathBounds;
    public boolean pathDirty;
    public final Path pathInsetByStroke;
    public final MediaSourceList pathProvider;
    public final JCAContext pathShadowListener;
    public final RectF rectF;
    public int resolvedTintColor;
    public final Region scratchRegion;
    public boolean shadowBitmapDrawingEnable;
    public final ShadowRenderer shadowRenderer;
    public float[] springAnimatedCornerSizes;
    public float[] springAnimatedStrokeCornerSizes;
    public final zzb strokeInsetCornerSizeUnaryOperator;
    public final Paint strokePaint;
    public boolean strokePathDirty;
    public ShapeAppearanceModel strokeShapeAppearanceModel;
    public PorterDuffColorFilter strokeTintFilter;
    public PorterDuffColorFilter tintFilter;
    public final Region transparentRegion;

    public final class SpringAnimatedCornerSizeProperty extends PlatformKt {
        public final int index;

        public SpringAnimatedCornerSizeProperty(int i) {
            this.index = i;
        }

        @Override // app.cash.molecule.PlatformKt
        public final float getValue(Object obj) {
            float[] fArr = ((MaterialShapeDrawable) obj).springAnimatedCornerSizes;
            return fArr != null ? fArr[this.index] : RecyclerView.DECELERATION_RATE;
        }

        @Override // app.cash.molecule.PlatformKt
        public final void setValue(Object obj, float f) {
            MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) obj;
            float[] fArr = materialShapeDrawable.springAnimatedCornerSizes;
            if (fArr != null) {
                int i = this.index;
                if (fArr[i] != f) {
                    fArr[i] = f;
                    MaterialButton$$ExternalSyntheticLambda3 materialButton$$ExternalSyntheticLambda3 = materialShapeDrawable.onCornerSizeChangeListener;
                    if (materialButton$$ExternalSyntheticLambda3 != null) {
                        float cornerSizeDiffX = materialShapeDrawable.getCornerSizeDiffX();
                        MaterialButton materialButton = (MaterialButton) materialButton$$ExternalSyntheticLambda3.f$0;
                        int i2 = (int) (cornerSizeDiffX * 0.11f);
                        if (materialButton.opticalCenterShift != i2) {
                            materialButton.opticalCenterShift = i2;
                            materialButton.updatePaddingsAndSizeForWidthAnimation();
                            materialButton.invalidate();
                        }
                    }
                    materialShapeDrawable.invalidateSelf();
                }
            }
        }
    }

    static {
        Paint paint = new Paint(1);
        clearPaint = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        CORNER_SIZES_IN_PX = new SpringAnimatedCornerSizeProperty[4];
        int i = 0;
        while (true) {
            SpringAnimatedCornerSizeProperty[] springAnimatedCornerSizePropertyArr = CORNER_SIZES_IN_PX;
            if (i >= springAnimatedCornerSizePropertyArr.length) {
                return;
            }
            springAnimatedCornerSizePropertyArr[i] = new SpringAnimatedCornerSizeProperty(i);
            i++;
        }
    }

    public MaterialShapeDrawable(MaterialShapeDrawableState materialShapeDrawableState) {
        this.strokeInsetCornerSizeUnaryOperator = new zzb(this);
        this.cornerShadowOperation = new ShapePath.ShadowCompatOperation[4];
        this.edgeShadowOperation = new ShapePath.ShadowCompatOperation[4];
        this.containsIncompatibleShadowOp = new BitSet(8);
        this.matrix = new Matrix();
        this.path = new Path();
        this.pathInsetByStroke = new Path();
        this.rectF = new RectF();
        this.insetRectF = new RectF();
        this.transparentRegion = new Region();
        this.scratchRegion = new Region();
        Paint paint = new Paint(1);
        this.fillPaint = paint;
        Paint paint2 = new Paint(1);
        this.strokePaint = paint2;
        this.shadowRenderer = new ShadowRenderer();
        this.pathProvider = MediaSourceList.getInstanceOrCreate();
        this.pathBounds = new RectF();
        this.shadowBitmapDrawingEnable = true;
        this.isRoundRectCornerMorph = true;
        this.cornerSpringAnimations = new SpringAnimation[4];
        this.drawableState = materialShapeDrawableState;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        updateTintFilter();
        updateColorsForState(getState());
        this.pathShadowListener = new JCAContext(this, 2);
    }

    public final void calculatePath(RectF rectF, Path path) {
        this.pathProvider.calculatePath(this.drawableState.shapeAppearance.getDefaultShape(), this.springAnimatedCornerSizes, this.drawableState.interpolation, rectF, this.pathShadowListener, path);
        if (this.drawableState.scale != 1.0f) {
            Matrix matrix = this.matrix;
            matrix.reset();
            float f = this.drawableState.scale;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.pathBounds, true);
    }

    public final float calculateRoundRectCornerSize(RectF rectF, ShapeAppearanceModel shapeAppearanceModel, float[] fArr) {
        if (fArr == null) {
            if (shapeAppearanceModel.isRoundRect(rectF)) {
                return shapeAppearanceModel.topLeftCornerSize.getCornerSize(rectF);
            }
            return -1.0f;
        }
        if (this.isRoundRectCornerMorph) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final int compositeElevationOverlayIfNeeded(int i) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        float f = materialShapeDrawableState.elevation + RecyclerView.DECELERATION_RATE + materialShapeDrawableState.parentAbsoluteElevation;
        ElevationOverlayProvider elevationOverlayProvider = materialShapeDrawableState.elevationOverlayProvider;
        return elevationOverlayProvider != null ? elevationOverlayProvider.compositeOverlayIfNeeded(f, i) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.tintFilter;
        Paint paint2 = this.fillPaint;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.drawableState.alpha;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.strokeTintFilter;
        Paint paint3 = this.strokePaint;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.drawableState.strokeWidth);
        int alpha2 = paint3.getAlpha();
        int i2 = this.drawableState.alpha;
        paint3.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = hasCompatShadow() || !isRoundRect();
        Paint.Style style = this.drawableState.paintStyle;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z2 = this.pathDirty;
            paint = paint2;
            Path path = this.path;
            if (z2) {
                if (z) {
                    calculatePath(getBoundsAsRectF$1(), path);
                }
                this.pathDirty = false;
            }
            if (hasCompatShadow()) {
                canvas.save();
                canvas.translate((int) (Math.sin(Math.toRadians(0.0d)) * this.drawableState.shadowCompatOffset), getShadowOffsetY());
                if (this.shadowBitmapDrawingEnable) {
                    Rect bounds = getBounds();
                    RectF rectF = this.pathBounds;
                    int width = (int) (rectF.width() - bounds.width());
                    int height = (int) (rectF.height() - bounds.height());
                    if (width < 0 || height < 0) {
                        a$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m107m(width, height, "Invalid shadow bounds. Check that the treatments result in a valid path. extra width: ", " extra height: ", " path bounds: "), rectF);
                        return;
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(Boxes$$ExternalSyntheticOutline1.m(this.drawableState.shadowCompatRadius, 2, (int) rectF.width(), width), Boxes$$ExternalSyntheticOutline1.m(this.drawableState.shadowCompatRadius, 2, (int) rectF.height(), height), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    int i3 = bounds.left;
                    int i4 = this.drawableState.shadowCompatRadius;
                    float f = (i3 - i4) - width;
                    float f2 = (bounds.top - i4) - height;
                    canvas2.translate(-f, -f2);
                    drawCompatShadow(canvas2);
                    canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    drawCompatShadow(canvas);
                    canvas.restore();
                }
            }
            drawShape(canvas, paint, path, this.drawableState.shapeAppearance.getDefaultShape(), this.springAnimatedCornerSizes, getBoundsAsRectF$1());
        } else {
            paint = paint2;
        }
        if (hasStroke()) {
            if (this.strokePathDirty) {
                ShapeAppearanceModel shapeAppearanceModel = getShapeAppearanceModel();
                RealBugReportSenderFactory builder = shapeAppearanceModel.toBuilder();
                CornerSize cornerSize = shapeAppearanceModel.topLeftCornerSize;
                zzb zzbVar = this.strokeInsetCornerSizeUnaryOperator;
                builder.endpoint = zzbVar.apply(cornerSize);
                builder.backStackDumper = zzbVar.apply(shapeAppearanceModel.topRightCornerSize);
                builder.cashDatabase = zzbVar.apply(shapeAppearanceModel.bottomLeftCornerSize);
                builder.featureEligibilityDumper = zzbVar.apply(shapeAppearanceModel.bottomRightCornerSize);
                this.strokeShapeAppearanceModel = builder.build();
                float[] fArr = this.springAnimatedCornerSizes;
                if (fArr != null) {
                    if (this.springAnimatedStrokeCornerSizes == null) {
                        this.springAnimatedStrokeCornerSizes = new float[fArr.length];
                    }
                    float strokeInsetLength = getStrokeInsetLength();
                    int i5 = 0;
                    while (true) {
                        float[] fArr2 = this.springAnimatedCornerSizes;
                        if (i5 >= fArr2.length) {
                            break;
                        }
                        this.springAnimatedStrokeCornerSizes[i5] = Math.max(RecyclerView.DECELERATION_RATE, fArr2[i5] - strokeInsetLength);
                        i5++;
                    }
                } else {
                    this.springAnimatedStrokeCornerSizes = null;
                }
                if (z) {
                    ShapeAppearanceModel shapeAppearanceModel2 = this.strokeShapeAppearanceModel;
                    float[] fArr3 = this.springAnimatedStrokeCornerSizes;
                    float f3 = this.drawableState.interpolation;
                    RectF boundsAsRectF$1 = getBoundsAsRectF$1();
                    RectF rectF2 = this.insetRectF;
                    rectF2.set(boundsAsRectF$1);
                    float strokeInsetLength2 = getStrokeInsetLength();
                    rectF2.inset(strokeInsetLength2, strokeInsetLength2);
                    this.pathProvider.calculatePath(shapeAppearanceModel2, fArr3, f3, rectF2, null, this.pathInsetByStroke);
                }
                this.strokePathDirty = false;
            }
            drawStrokeShape(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void drawCompatShadow(Canvas canvas) {
        if (this.containsIncompatibleShadowOp.cardinality() > 0) {
            Log.w("MaterialShapeDrawable", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.drawableState.shadowCompatOffset;
        Path path = this.path;
        ShadowRenderer shadowRenderer = this.shadowRenderer;
        if (i != 0) {
            canvas.drawPath(path, shadowRenderer.shadowPaint);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            ShapePath.ShadowCompatOperation shadowCompatOperation = this.cornerShadowOperation[i2];
            int i3 = this.drawableState.shadowCompatRadius;
            Matrix matrix = ShapePath.ShadowCompatOperation.IDENTITY_MATRIX;
            shadowCompatOperation.draw(matrix, shadowRenderer, i3, canvas);
            this.edgeShadowOperation[i2].draw(matrix, shadowRenderer, this.drawableState.shadowCompatRadius, canvas);
        }
        if (this.shadowBitmapDrawingEnable) {
            int sin = (int) (Math.sin(Math.toRadians(0.0d)) * this.drawableState.shadowCompatOffset);
            int shadowOffsetY = getShadowOffsetY();
            canvas.translate(-sin, -shadowOffsetY);
            canvas.drawPath(path, clearPaint);
            canvas.translate(sin, shadowOffsetY);
        }
    }

    public final void drawShape(Canvas canvas, Paint paint, Path path, ShapeAppearanceModel shapeAppearanceModel, float[] fArr, RectF rectF) {
        float calculateRoundRectCornerSize = calculateRoundRectCornerSize(rectF, shapeAppearanceModel, fArr);
        if (calculateRoundRectCornerSize < RecyclerView.DECELERATION_RATE) {
            canvas.drawPath(path, paint);
        } else {
            float f = calculateRoundRectCornerSize * this.drawableState.interpolation;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public void drawStrokeShape(Canvas canvas) {
        ShapeAppearanceModel shapeAppearanceModel = this.strokeShapeAppearanceModel;
        float[] fArr = this.springAnimatedStrokeCornerSizes;
        RectF boundsAsRectF$1 = getBoundsAsRectF$1();
        RectF rectF = this.insetRectF;
        rectF.set(boundsAsRectF$1);
        float strokeInsetLength = getStrokeInsetLength();
        rectF.inset(strokeInsetLength, strokeInsetLength);
        drawShape(canvas, this.strokePaint, this.pathInsetByStroke, shapeAppearanceModel, fArr, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.drawableState.alpha;
    }

    public final RectF getBoundsAsRectF$1() {
        Rect bounds = getBounds();
        RectF rectF = this.rectF;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.drawableState;
    }

    public final float getCornerSizeDiffX() {
        float[] fArr = this.springAnimatedCornerSizes;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF boundsAsRectF$1 = getBoundsAsRectF$1();
        ShapeAppearanceModel shapeAppearanceModel = getShapeAppearanceModel();
        MediaSourceList mediaSourceList = this.pathProvider;
        mediaSourceList.getClass();
        float cornerSize = shapeAppearanceModel.topLeftCornerSize.getCornerSize(boundsAsRectF$1);
        ShapeAppearanceModel shapeAppearanceModel2 = getShapeAppearanceModel();
        mediaSourceList.getClass();
        float cornerSize2 = shapeAppearanceModel2.bottomLeftCornerSize.getCornerSize(boundsAsRectF$1) + cornerSize;
        ShapeAppearanceModel shapeAppearanceModel3 = getShapeAppearanceModel();
        mediaSourceList.getClass();
        float cornerSize3 = cornerSize2 - shapeAppearanceModel3.bottomRightCornerSize.getCornerSize(boundsAsRectF$1);
        ShapeAppearanceModel shapeAppearanceModel4 = getShapeAppearanceModel();
        mediaSourceList.getClass();
        return (cornerSize3 - shapeAppearanceModel4.topRightCornerSize.getCornerSize(boundsAsRectF$1)) / 2.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.drawableState.shadowCompatMode == 2) {
            return;
        }
        RectF boundsAsRectF$1 = getBoundsAsRectF$1();
        if (boundsAsRectF$1.isEmpty()) {
            return;
        }
        float calculateRoundRectCornerSize = calculateRoundRectCornerSize(boundsAsRectF$1, this.drawableState.shapeAppearance.getDefaultShape(), this.springAnimatedCornerSizes);
        if (calculateRoundRectCornerSize >= RecyclerView.DECELERATION_RATE) {
            outline.setRoundRect(getBounds(), calculateRoundRectCornerSize * this.drawableState.interpolation);
            return;
        }
        boolean z = this.pathDirty;
        Path path = this.path;
        if (z) {
            calculatePath(boundsAsRectF$1, path);
            this.pathDirty = false;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            DrawableUtils$OutlineCompatR.setPath(outline, path);
        } else {
            try {
                DrawableUtils$OutlineCompatL.setConvexPath(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.drawableState.padding;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public final int getShadowOffsetY() {
        return (int) (Math.cos(Math.toRadians(0.0d)) * this.drawableState.shadowCompatOffset);
    }

    public final ShapeAppearanceModel getShapeAppearanceModel() {
        return this.drawableState.shapeAppearance.getDefaultShape();
    }

    public final float getStrokeInsetLength() {
        return hasStroke() ? this.strokePaint.getStrokeWidth() / 2.0f : RecyclerView.DECELERATION_RATE;
    }

    public final float getTopLeftCornerResolvedSize() {
        float[] fArr = this.springAnimatedCornerSizes;
        return fArr != null ? fArr[3] : this.drawableState.shapeAppearance.getDefaultShape().topLeftCornerSize.getCornerSize(getBoundsAsRectF$1());
    }

    public final float getTopRightCornerResolvedSize() {
        float[] fArr = this.springAnimatedCornerSizes;
        return fArr != null ? fArr[0] : this.drawableState.shapeAppearance.getDefaultShape().topRightCornerSize.getCornerSize(getBoundsAsRectF$1());
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.transparentRegion;
        region.set(bounds);
        RectF boundsAsRectF$1 = getBoundsAsRectF$1();
        Path path = this.path;
        calculatePath(boundsAsRectF$1, path);
        Region region2 = this.scratchRegion;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final boolean hasCompatShadow() {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        int i = materialShapeDrawableState.shadowCompatMode;
        if (i == 1 || materialShapeDrawableState.shadowCompatRadius <= 0) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (isRoundRect()) {
            return false;
        }
        this.path.isConvex();
        return false;
    }

    public final boolean hasStroke() {
        Paint.Style style = this.drawableState.paintStyle;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.strokePaint.getStrokeWidth() > RecyclerView.DECELERATION_RATE;
    }

    public final void initializeElevationOverlay(Context context) {
        this.drawableState.elevationOverlayProvider = new ElevationOverlayProvider(context);
        updateZ();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.pathDirty = true;
        this.strokePathDirty = true;
        super.invalidateSelf();
    }

    public final boolean isRoundRect() {
        if (this.drawableState.shapeAppearance.getShapeForState(getState()).isRoundRect(getBoundsAsRectF$1())) {
            return this.springAnimatedCornerSizes == null || this.isRoundRectCornerMorph;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.drawableState.tintList;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.drawableState.getClass();
        ColorStateList colorStateList2 = this.drawableState.strokeColor;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.drawableState.fillColor;
        return (colorStateList3 != null && colorStateList3.isStateful()) || this.drawableState.shapeAppearance.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.drawableState = new MaterialShapeDrawableState(this.drawableState);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.pathDirty = true;
        this.strokePathDirty = true;
        super.onBoundsChange(rect);
        if (!this.drawableState.shapeAppearance.isStateful() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        SpringAnimation[] springAnimationArr = this.cornerSpringAnimations;
        int length = springAnimationArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                SpringAnimation springAnimation = springAnimationArr[i];
                if (springAnimation != null && springAnimation.mRunning) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        updateShape(state, true ^ z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.drawableState.shapeAppearance.isStateful()) {
            updateShape(iArr, false);
        }
        boolean z = updateColorsForState(iArr) || updateTintFilter();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.alpha != i) {
            materialShapeDrawableState.alpha = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.drawableState.getClass();
        super.invalidateSelf();
    }

    public final void setCornerSpringForce(SpringForce springForce) {
        if (this.cornerSpringForce == springForce) {
            return;
        }
        this.cornerSpringForce = springForce;
        int i = 0;
        while (true) {
            SpringAnimation[] springAnimationArr = this.cornerSpringAnimations;
            if (i >= springAnimationArr.length) {
                updateShape(getState(), true);
                invalidateSelf();
                return;
            }
            if (springAnimationArr[i] == null) {
                springAnimationArr[i] = new SpringAnimation(this, CORNER_SIZES_IN_PX[i]);
            }
            SpringAnimation springAnimation = springAnimationArr[i];
            SpringForce springForce2 = new SpringForce();
            springForce2.setDampingRatio((float) springForce.mDampingRatio);
            double d = springForce.mNaturalFreq;
            springForce2.setStiffness((float) (d * d));
            springAnimation.mSpring = springForce2;
            i++;
        }
    }

    public final void setElevation(float f) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.elevation != f) {
            materialShapeDrawableState.elevation = f;
            updateZ();
        }
    }

    public final void setFillColor(ColorStateList colorStateList) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.fillColor != colorStateList) {
            materialShapeDrawableState.fillColor = colorStateList;
            onStateChange(getState());
        }
    }

    public final void setInterpolation(float f) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.interpolation != f) {
            materialShapeDrawableState.interpolation = f;
            this.pathDirty = true;
            this.strokePathDirty = true;
            invalidateSelf();
        }
    }

    public final void setPaintStyle() {
        this.drawableState.paintStyle = Paint.Style.FILL;
        super.invalidateSelf();
    }

    public final void setShadowColor() {
        this.shadowRenderer.setShadowColor(-12303292);
        this.drawableState.getClass();
        super.invalidateSelf();
    }

    public final void setShadowCompatibilityMode(int i) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.shadowCompatMode != i) {
            materialShapeDrawableState.shadowCompatMode = i;
            super.invalidateSelf();
        }
    }

    public final void setShapeAppearance(ShapeAppearance shapeAppearance) {
        if (shapeAppearance instanceof ShapeAppearanceModel) {
            setShapeAppearanceModel((ShapeAppearanceModel) shapeAppearance);
            return;
        }
        StateListShapeAppearanceModel stateListShapeAppearanceModel = (StateListShapeAppearanceModel) shapeAppearance;
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.shapeAppearance != stateListShapeAppearanceModel) {
            materialShapeDrawableState.shapeAppearance = stateListShapeAppearanceModel;
            updateShape(getState(), true);
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public final void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.drawableState.shapeAppearance = shapeAppearanceModel;
        this.springAnimatedCornerSizes = null;
        this.springAnimatedStrokeCornerSizes = null;
        invalidateSelf();
    }

    public final void setStrokeColor(ColorStateList colorStateList) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.strokeColor != colorStateList) {
            materialShapeDrawableState.strokeColor = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.drawableState.tintList = colorStateList;
        updateTintFilter();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.tintMode != mode) {
            materialShapeDrawableState.tintMode = mode;
            updateTintFilter();
            super.invalidateSelf();
        }
    }

    public final boolean updateColorsForState(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.drawableState.fillColor == null || color2 == (colorForState2 = this.drawableState.fillColor.getColorForState(iArr, (color2 = (paint2 = this.fillPaint).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.drawableState.strokeColor == null || color == (colorForState = this.drawableState.strokeColor.getColorForState(iArr, (color = (paint = this.strokePaint).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateShape(int[] iArr, boolean z) {
        boolean z2;
        RectF boundsAsRectF$1 = getBoundsAsRectF$1();
        if (!this.drawableState.shapeAppearance.isStateful() || boundsAsRectF$1.isEmpty()) {
            return;
        }
        int i = 0;
        boolean z3 = z | (this.cornerSpringForce == null);
        if (this.springAnimatedCornerSizes == null) {
            this.springAnimatedCornerSizes = new float[4];
        }
        ShapeAppearanceModel shapeForState = this.drawableState.shapeAppearance.getShapeForState(iArr);
        float[] fArr = this.springAnimatedCornerSizes;
        if (fArr.length > 1) {
            float f = fArr[0];
            for (int i2 = 1; i2 < fArr.length; i2++) {
                if (fArr[i2] != f) {
                    break;
                }
            }
        }
        if (shapeForState.isRoundRect(getBoundsAsRectF$1())) {
            z2 = true;
            this.isRoundRectCornerMorph = z2;
            if (!z2) {
                this.pathDirty = true;
                this.strokePathDirty = true;
            }
            while (i < 4) {
                this.pathProvider.getClass();
                float cornerSize = (i != 1 ? i != 2 ? i != 3 ? shapeForState.topRightCornerSize : shapeForState.topLeftCornerSize : shapeForState.bottomLeftCornerSize : shapeForState.bottomRightCornerSize).getCornerSize(boundsAsRectF$1);
                if (z3) {
                    this.springAnimatedCornerSizes[i] = cornerSize;
                }
                SpringAnimation[] springAnimationArr = this.cornerSpringAnimations;
                SpringAnimation springAnimation = springAnimationArr[i];
                if (springAnimation != null) {
                    springAnimation.animateToFinalPosition(cornerSize);
                    if (z3) {
                        springAnimationArr[i].skipToEnd();
                    }
                }
                i++;
            }
            if (z3) {
                return;
            }
            invalidateSelf();
            return;
        }
        z2 = false;
        this.isRoundRectCornerMorph = z2;
        if (!z2) {
        }
        while (i < 4) {
        }
        if (z3) {
        }
    }

    public final boolean updateTintFilter() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.tintFilter;
        PorterDuffColorFilter porterDuffColorFilter3 = this.strokeTintFilter;
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        ColorStateList colorStateList = materialShapeDrawableState.tintList;
        PorterDuff.Mode mode = materialShapeDrawableState.tintMode;
        if (colorStateList == null || mode == null) {
            int color = this.fillPaint.getColor();
            int compositeElevationOverlayIfNeeded = compositeElevationOverlayIfNeeded(color);
            this.resolvedTintColor = compositeElevationOverlayIfNeeded;
            porterDuffColorFilter = compositeElevationOverlayIfNeeded != color ? new PorterDuffColorFilter(compositeElevationOverlayIfNeeded, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int compositeElevationOverlayIfNeeded2 = compositeElevationOverlayIfNeeded(colorStateList.getColorForState(getState(), 0));
            this.resolvedTintColor = compositeElevationOverlayIfNeeded2;
            porterDuffColorFilter = new PorterDuffColorFilter(compositeElevationOverlayIfNeeded2, mode);
        }
        this.tintFilter = porterDuffColorFilter;
        this.drawableState.getClass();
        this.strokeTintFilter = null;
        this.drawableState.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.tintFilter) && Objects.equals(porterDuffColorFilter3, this.strokeTintFilter)) ? false : true;
    }

    public final void updateZ() {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        float f = materialShapeDrawableState.elevation + RecyclerView.DECELERATION_RATE;
        materialShapeDrawableState.shadowCompatRadius = (int) Math.ceil(0.75f * f);
        this.drawableState.shadowCompatOffset = (int) Math.ceil(f * 0.25f);
        updateTintFilter();
        if (hasCompatShadow() || !isRoundRect()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public class MaterialShapeDrawableState extends Drawable.ConstantState {
        public int alpha;
        public float elevation;
        public ElevationOverlayProvider elevationOverlayProvider;
        public ColorStateList fillColor;
        public float interpolation;
        public Rect padding;
        public Paint.Style paintStyle;
        public float parentAbsoluteElevation;
        public final float scale;
        public int shadowCompatMode;
        public int shadowCompatOffset;
        public int shadowCompatRadius;
        public ShapeAppearance shapeAppearance;
        public ColorStateList strokeColor;
        public float strokeWidth;
        public ColorStateList tintList;
        public PorterDuff.Mode tintMode;

        public MaterialShapeDrawableState(MaterialShapeDrawableState materialShapeDrawableState) {
            this.fillColor = null;
            this.strokeColor = null;
            this.tintList = null;
            this.tintMode = PorterDuff.Mode.SRC_IN;
            this.padding = null;
            this.scale = 1.0f;
            this.interpolation = 1.0f;
            this.alpha = 255;
            this.parentAbsoluteElevation = RecyclerView.DECELERATION_RATE;
            this.elevation = RecyclerView.DECELERATION_RATE;
            this.shadowCompatMode = 0;
            this.shadowCompatRadius = 0;
            this.shadowCompatOffset = 0;
            this.paintStyle = Paint.Style.FILL_AND_STROKE;
            this.shapeAppearance = materialShapeDrawableState.shapeAppearance;
            this.elevationOverlayProvider = materialShapeDrawableState.elevationOverlayProvider;
            this.strokeWidth = materialShapeDrawableState.strokeWidth;
            this.fillColor = materialShapeDrawableState.fillColor;
            this.strokeColor = materialShapeDrawableState.strokeColor;
            this.tintMode = materialShapeDrawableState.tintMode;
            this.tintList = materialShapeDrawableState.tintList;
            this.alpha = materialShapeDrawableState.alpha;
            this.scale = materialShapeDrawableState.scale;
            this.shadowCompatOffset = materialShapeDrawableState.shadowCompatOffset;
            this.shadowCompatMode = materialShapeDrawableState.shadowCompatMode;
            this.interpolation = materialShapeDrawableState.interpolation;
            this.parentAbsoluteElevation = materialShapeDrawableState.parentAbsoluteElevation;
            this.elevation = materialShapeDrawableState.elevation;
            this.shadowCompatRadius = materialShapeDrawableState.shadowCompatRadius;
            this.paintStyle = materialShapeDrawableState.paintStyle;
            if (materialShapeDrawableState.padding != null) {
                this.padding = new Rect(materialShapeDrawableState.padding);
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this);
            materialShapeDrawable.pathDirty = true;
            materialShapeDrawable.strokePathDirty = true;
            return materialShapeDrawable;
        }

        public MaterialShapeDrawableState(ShapeAppearance shapeAppearance) {
            this.fillColor = null;
            this.strokeColor = null;
            this.tintList = null;
            this.tintMode = PorterDuff.Mode.SRC_IN;
            this.padding = null;
            this.scale = 1.0f;
            this.interpolation = 1.0f;
            this.alpha = 255;
            this.parentAbsoluteElevation = RecyclerView.DECELERATION_RATE;
            this.elevation = RecyclerView.DECELERATION_RATE;
            this.shadowCompatMode = 0;
            this.shadowCompatRadius = 0;
            this.shadowCompatOffset = 0;
            this.paintStyle = Paint.Style.FILL_AND_STROKE;
            this.shapeAppearance = shapeAppearance;
            this.elevationOverlayProvider = null;
        }
    }

    public MaterialShapeDrawable(Context context, AttributeSet attributeSet, int i, int i2) {
        this(ShapeAppearanceModel.builder(context, attributeSet, i, i2).build());
    }

    public MaterialShapeDrawable(ShapeAppearanceModel shapeAppearanceModel) {
        this(new MaterialShapeDrawableState(shapeAppearanceModel));
    }

    public MaterialShapeDrawable(ShapeAppearance shapeAppearance) {
        this(new MaterialShapeDrawableState(shapeAppearance));
    }

    public MaterialShapeDrawable() {
        this(new ShapeAppearanceModel());
    }
}
