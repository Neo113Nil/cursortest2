package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$styleable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider$Lazy;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.squareup.cash.R;
import com.squareup.util.Strings;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public class ShapeableImageView extends AppCompatImageView implements Shapeable {
    public final Paint borderPaint;
    public int bottomContentPadding;
    public final Paint clearPaint;
    public final RectF destination;
    public int endContentPadding;
    public boolean hasAdjustedPaddingAfterLayoutDirectionResolved;
    public int leftContentPadding;
    public final Path maskPath;
    public final RectF maskRect;
    public final Path path;
    public final MediaSourceList pathProvider;
    public int rightContentPadding;
    public MaterialShapeDrawable shadowDrawable;
    public ShapeAppearanceModel shapeAppearanceModel;
    public int startContentPadding;
    public ColorStateList strokeColor;
    public float strokeWidth;
    public int topContentPadding;

    public final class OutlineProvider extends ViewOutlineProvider {
        public final Rect rect = new Rect();

        public OutlineProvider() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            ShapeableImageView shapeableImageView = ShapeableImageView.this;
            if (shapeableImageView.shapeAppearanceModel == null) {
                return;
            }
            if (shapeableImageView.shadowDrawable == null) {
                shapeableImageView.shadowDrawable = new MaterialShapeDrawable(shapeableImageView.shapeAppearanceModel);
            }
            RectF rectF = shapeableImageView.destination;
            Rect rect = this.rect;
            rectF.round(rect);
            shapeableImageView.shadowDrawable.setBounds(rect);
            shapeableImageView.shadowDrawable.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, i);
        this.pathProvider = ShapeAppearancePathProvider$Lazy.INSTANCE;
        this.path = new Path();
        this.hasAdjustedPaddingAfterLayoutDirectionResolved = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.clearPaint = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.destination = new RectF();
        this.maskRect = new RectF();
        this.maskPath = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R$styleable.ShapeableImageView, i, R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.strokeColor = ContextUtilsKt.getColorStateList(context2, obtainStyledAttributes, 9);
        this.strokeWidth = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.leftContentPadding = dimensionPixelSize;
        this.topContentPadding = dimensionPixelSize;
        this.rightContentPadding = dimensionPixelSize;
        this.bottomContentPadding = dimensionPixelSize;
        this.leftContentPadding = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.topContentPadding = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.rightContentPadding = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.bottomContentPadding = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.startContentPadding = obtainStyledAttributes.getDimensionPixelSize(5, PKIFailureInfo.systemUnavail);
        this.endContentPadding = obtainStyledAttributes.getDimensionPixelSize(2, PKIFailureInfo.systemUnavail);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.borderPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.shapeAppearanceModel = ShapeAppearanceModel.builder(context2, attributeSet, i, R.style.Widget_MaterialComponents_ShapeableImageView).build();
        setOutlineProvider(new OutlineProvider());
    }

    public final int getContentPaddingEnd() {
        int i = this.endContentPadding;
        return i != Integer.MIN_VALUE ? i : isRtl$1() ? this.leftContentPadding : this.rightContentPadding;
    }

    public final int getContentPaddingLeft() {
        int i;
        int i2;
        if (this.startContentPadding != Integer.MIN_VALUE || this.endContentPadding != Integer.MIN_VALUE) {
            if (isRtl$1() && (i2 = this.endContentPadding) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!isRtl$1() && (i = this.startContentPadding) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.leftContentPadding;
    }

    public final int getContentPaddingRight() {
        int i;
        int i2;
        if (this.startContentPadding != Integer.MIN_VALUE || this.endContentPadding != Integer.MIN_VALUE) {
            if (isRtl$1() && (i2 = this.startContentPadding) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!isRtl$1() && (i = this.endContentPadding) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.rightContentPadding;
    }

    public final int getContentPaddingStart() {
        int i = this.startContentPadding;
        return i != Integer.MIN_VALUE ? i : isRtl$1() ? this.rightContentPadding : this.leftContentPadding;
    }

    @Override // android.view.View
    public final int getPaddingBottom() {
        return super.getPaddingBottom() - this.bottomContentPadding;
    }

    @Override // android.view.View
    public final int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public final int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public final int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public final int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public final int getPaddingTop() {
        return super.getPaddingTop() - this.topContentPadding;
    }

    public final boolean isRtl$1() {
        return getLayoutDirection() == 1;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.maskPath, this.clearPaint);
        if (this.strokeColor == null) {
            return;
        }
        float f = this.strokeWidth;
        Paint paint = this.borderPaint;
        paint.setStrokeWidth(f);
        int colorForState = this.strokeColor.getColorForState(getDrawableState(), this.strokeColor.getDefaultColor());
        if (this.strokeWidth <= RecyclerView.DECELERATION_RATE || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.path, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.hasAdjustedPaddingAfterLayoutDirectionResolved && isLayoutDirectionResolved()) {
            this.hasAdjustedPaddingAfterLayoutDirectionResolved = true;
            if (!isPaddingRelative() && this.startContentPadding == Integer.MIN_VALUE && this.endContentPadding == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        updateShapeMask(i, i2);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.startContentPadding = PKIFailureInfo.systemUnavail;
        this.endContentPadding = PKIFailureInfo.systemUnavail;
        super.setPadding((super.getPaddingLeft() - this.leftContentPadding) + i, (super.getPaddingTop() - this.topContentPadding) + i2, (super.getPaddingRight() - this.rightContentPadding) + i3, (super.getPaddingBottom() - this.bottomContentPadding) + i4);
        this.leftContentPadding = i;
        this.topContentPadding = i2;
        this.rightContentPadding = i3;
        this.bottomContentPadding = i4;
    }

    public void setContentPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative((super.getPaddingStart() - getContentPaddingStart()) + i, (super.getPaddingTop() - this.topContentPadding) + i2, (super.getPaddingEnd() - getContentPaddingEnd()) + i3, (super.getPaddingBottom() - this.bottomContentPadding) + i4);
        this.leftContentPadding = isRtl$1() ? i3 : i;
        this.topContentPadding = i2;
        if (!isRtl$1()) {
            i = i3;
        }
        this.rightContentPadding = i;
        this.bottomContentPadding = i4;
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(getContentPaddingLeft() + i, i2 + this.topContentPadding, getContentPaddingRight() + i3, i4 + this.bottomContentPadding);
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(getContentPaddingStart() + i, i2 + this.topContentPadding, getContentPaddingEnd() + i3, i4 + this.bottomContentPadding);
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearanceModel = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.shadowDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        updateShapeMask(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.strokeColor = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(Strings.getColorStateList(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.strokeWidth != f) {
            this.strokeWidth = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public final void updateShapeMask(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = i - getPaddingRight();
        float paddingBottom = i2 - getPaddingBottom();
        RectF rectF = this.destination;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        ShapeAppearanceModel shapeAppearanceModel = this.shapeAppearanceModel;
        MediaSourceList mediaSourceList = this.pathProvider;
        Path path = this.path;
        mediaSourceList.calculatePath(shapeAppearanceModel, null, 1.0f, rectF, null, path);
        Path path2 = this.maskPath;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.maskRect;
        rectF2.set(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, i, i2);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }
}
