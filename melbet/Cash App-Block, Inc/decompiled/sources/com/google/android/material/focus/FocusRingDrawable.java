package com.google.android.material.focus;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.FloatProperty;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import com.google.android.material.R$styleable;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapeAppearance;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.StateListShapeAppearanceModel;
import com.squareup.cash.ui.SplashScreenAnimationObserver;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes4.dex */
public class FocusRingDrawable extends DrawableWrapper {
    public static final ColorDrawable EMPTY_DRAWABLE = new ColorDrawable(0);
    public static final int[] FOCUSED_STATE_SET = {R.attr.state_focused, R.attr.state_window_focused};
    public static final OvershootInterpolator INTERPOLATOR = new OvershootInterpolator(4.0f);
    public static final AnonymousClass1 PROPERTY_INTERPOLATION = new AnonymousClass1("interpolation", 0);
    public ObjectAnimator animator;
    public boolean focused;
    public float interpolation;
    public WeakReference materialShapeDrawable;
    public final Matrix matrix;
    public boolean mutated;
    public final Paint paint;
    public final MediaSourceList pathProvider;
    public boolean previousStateSetEmpty;
    public float shapeAppearanceCornerSize;
    public final Path shapeAppearancePath;
    public FocusRingState state;
    public final Path tmpPath;
    public final Rect tmpRect;
    public final RectF tmpRectF;

    /* renamed from: com.google.android.material.focus.FocusRingDrawable$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends FloatProperty {
        public final /* synthetic */ int $r8$classId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(String str, int i) {
            super(str);
            this.$r8$classId = i;
        }

        @Override // android.util.Property
        public final Float get(Object obj) {
            switch (this.$r8$classId) {
                case 0:
                    return Float.valueOf(((FocusRingDrawable) obj).interpolation);
                default:
                    SplashScreenAnimationObserver splashScreenAnimationObserver = (SplashScreenAnimationObserver) obj;
                    splashScreenAnimationObserver.getClass();
                    return Float.valueOf(splashScreenAnimationObserver.translationY.getFloatValue());
            }
        }

        @Override // android.util.FloatProperty
        public final void setValue(Object obj, float f) {
            switch (this.$r8$classId) {
                case 0:
                    FocusRingDrawable focusRingDrawable = (FocusRingDrawable) obj;
                    focusRingDrawable.interpolation = f;
                    focusRingDrawable.invalidateSelf();
                    break;
                default:
                    SplashScreenAnimationObserver splashScreenAnimationObserver = (SplashScreenAnimationObserver) obj;
                    splashScreenAnimationObserver.getClass();
                    splashScreenAnimationObserver.translationY.setFloatValue(f);
                    break;
            }
        }
    }

    public FocusRingDrawable(FocusRingState focusRingState, Resources resources) {
        super(null);
        Paint paint = new Paint(1);
        this.paint = paint;
        this.tmpRectF = new RectF();
        this.tmpRect = new Rect();
        this.tmpPath = new Path();
        this.shapeAppearancePath = new Path();
        this.matrix = new Matrix();
        this.pathProvider = MediaSourceList.getInstanceOrCreate();
        this.shapeAppearanceCornerSize = -1.0f;
        this.interpolation = 1.0f;
        this.focused = false;
        this.mutated = false;
        FocusRingState focusRingState2 = new FocusRingState(focusRingState);
        this.state = focusRingState2;
        Drawable.ConstantState constantState = focusRingState2.wrappedState;
        if (constantState != null) {
            setDrawable(resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
        paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.state.ringOuterStrokeWidth)) {
            return;
        }
        paint.setStrokeWidth(this.state.ringOuterStrokeWidth);
    }

    public static FocusRingDrawable find(Drawable drawable) {
        if (drawable instanceof FocusRingDrawable) {
            return (FocusRingDrawable) drawable;
        }
        if (drawable instanceof DrawableWrapper) {
            Drawable drawable2 = ((DrawableWrapper) drawable).getDrawable();
            if (drawable2 instanceof FocusRingDrawable) {
                return (FocusRingDrawable) drawable2;
            }
        }
        if (!(drawable instanceof LayerDrawable)) {
            return null;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        for (int i = 0; i < layerDrawable.getNumberOfLayers(); i++) {
            Drawable drawable3 = layerDrawable.getDrawable(i);
            if (drawable3 instanceof FocusRingDrawable) {
                return (FocusRingDrawable) drawable3;
            }
        }
        return null;
    }

    public static int getValueDataIfAttr(TypedArray typedArray, int i) {
        if (typedArray.getType(i) != 2) {
            return PKIFailureInfo.systemUnavail;
        }
        TypedValue typedValue = new TypedValue();
        return typedArray.getValue(i, typedValue) ? typedValue.data : PKIFailureInfo.systemUnavail;
    }

    public static FocusRingDrawable layer(Context context, LayerDrawable layerDrawable, MaterialShapeDrawable materialShapeDrawable) {
        if (!MaterialAttributes.resolveBoolean(context.getTheme(), com.squareup.cash.R.attr.focusRingsEnabled, false)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, EMPTY_DRAWABLE);
        if (materialShapeDrawable != null) {
            focusRingDrawable.materialShapeDrawable = new WeakReference(materialShapeDrawable);
        }
        layerDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(layerDrawable);
        return focusRingDrawable;
    }

    public static float maybeResolveDimension(float f, Resources.Theme theme, int i, TypedArray typedArray, int i2, int i3) {
        if (!Float.isNaN(f)) {
            return f;
        }
        Resources resources = theme.getResources();
        if (i != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i2, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i3 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i3);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        init(theme);
    }

    public final void calculateBounds(RectF rectF) {
        Rect rect = this.state.ringCustomBounds;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        WeakReference weakReference = this.materialShapeDrawable;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((MaterialShapeDrawable) this.materialShapeDrawable.get()).getBounds());
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        Rect rect2 = this.tmpRect;
        rippleDrawable.getHotspotBounds(rect2);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect2.inset(Math.max(0, (rect2.width() / 2) - radius), Math.max(0, (rect2.height() / 2) - radius));
        }
        rectF.set(rect2);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0046, code lost:
    
        if (r1.isEmpty() == false) goto L9;
     */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f;
        int radius;
        super.draw(canvas);
        FocusRingState focusRingState = this.state;
        if (focusRingState.ringEnabled && this.focused) {
            float f2 = focusRingState.ringInset;
            float f3 = focusRingState.ringOuterStrokeWidth / 2.0f;
            float f4 = this.interpolation;
            float f5 = (f3 * f4) + f2;
            float f6 = ((focusRingState.ringInnerStrokeWidth / 2.0f) * f4) + f2 + focusRingState.ringInnerInset;
            Path path = this.shapeAppearancePath;
            if (path.isEmpty()) {
                WeakReference weakReference = this.materialShapeDrawable;
                if (weakReference != null && weakReference.get() != null) {
                    path = ((MaterialShapeDrawable) this.materialShapeDrawable.get()).path;
                }
                path = null;
            }
            Path path2 = path;
            FocusRingState focusRingState2 = this.state;
            if (path2 != null) {
                drawPath(canvas, path2, f6, focusRingState2.ringInnerStrokeWidth, focusRingState2.ringInnerColor);
                FocusRingState focusRingState3 = this.state;
                drawPath(canvas, path2, f5, focusRingState3.ringOuterStrokeWidth, focusRingState3.ringOuterColor);
                return;
            }
            if (Float.isNaN(focusRingState2.ringRadius)) {
                f = this.shapeAppearanceCornerSize;
                if (f < RecyclerView.DECELERATION_RATE) {
                    WeakReference weakReference2 = this.materialShapeDrawable;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) this.materialShapeDrawable.get();
                        float calculateRoundRectCornerSize = materialShapeDrawable.calculateRoundRectCornerSize(materialShapeDrawable.getBoundsAsRectF$1(), materialShapeDrawable.drawableState.shapeAppearance.getDefaultShape(), materialShapeDrawable.springAnimatedCornerSizes);
                        if (calculateRoundRectCornerSize >= RecyclerView.DECELERATION_RATE) {
                            calculateRoundRectCornerSize *= materialShapeDrawable.drawableState.interpolation;
                        }
                        if (calculateRoundRectCornerSize >= RecyclerView.DECELERATION_RATE) {
                            f = Math.max(RecyclerView.DECELERATION_RATE, calculateRoundRectCornerSize - (this.state.ringOuterStrokeWidth / 2.0f));
                        }
                    }
                    Drawable drawable = getDrawable();
                    f = (!(drawable instanceof RippleDrawable) || (radius = ((RippleDrawable) drawable).getRadius()) < 0) ? 0.0f : radius;
                }
            } else {
                f = this.state.ringRadius;
            }
            float max = Math.max(RecyclerView.DECELERATION_RATE, f - (this.state.ringOuterStrokeWidth / 2.0f));
            FocusRingState focusRingState4 = this.state;
            float f7 = focusRingState4.ringInnerStrokeWidth;
            int i = focusRingState4.ringInnerColor;
            RectF rectF = this.tmpRectF;
            calculateBounds(rectF);
            rectF.inset(f6, f6);
            float f8 = f7 * this.interpolation;
            Paint paint = this.paint;
            paint.setStrokeWidth(f8);
            paint.setColor(i);
            canvas.drawRoundRect(rectF, max, max, paint);
            FocusRingState focusRingState5 = this.state;
            float f9 = focusRingState5.ringOuterStrokeWidth;
            int i2 = focusRingState5.ringOuterColor;
            calculateBounds(rectF);
            rectF.inset(f5, f5);
            paint.setStrokeWidth(f9 * this.interpolation);
            paint.setColor(i2);
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public final void drawPath(Canvas canvas, Path path, float f, float f2, int i) {
        RectF rectF = this.tmpRectF;
        calculateBounds(rectF);
        float f3 = f * 2.0f;
        float width = 1.0f - (f3 / rectF.width());
        float height = 1.0f - (f3 / rectF.height());
        Matrix matrix = this.matrix;
        matrix.reset();
        matrix.postScale(width, height, rectF.centerX(), rectF.centerY());
        Path path2 = this.tmpPath;
        path.transform(matrix, path2);
        float f4 = f2 * this.interpolation;
        Paint paint = this.paint;
        paint.setStrokeWidth(f4);
        paint.setColor(i);
        canvas.drawPath(path2, paint);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        FocusRingState focusRingState = this.state;
        if (focusRingState.wrappedState == null) {
            return null;
        }
        focusRingState.mChangingConfigurations = getChangingConfigurations();
        return this.state;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            if (super.hasFocusStateSpecified()) {
                return true;
            }
            return this.state.ringEnabled;
        } catch (NoSuchMethodError unused) {
            return this.state.ringEnabled;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        int[] iArr = R$styleable.FocusRingDrawable;
        TypedArray obtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, iArr, 0, 0) : resources.obtainAttributes(attributeSet, iArr);
        this.state.ringEnabledAttr = getValueDataIfAttr(obtainStyledAttributes, 0);
        int i = this.state.ringEnabledAttr;
        int i2 = PKIFailureInfo.systemUnavail;
        if (i == Integer.MIN_VALUE && obtainStyledAttributes.hasValue(0)) {
            FocusRingState focusRingState = this.state;
            focusRingState.ringEnabled = obtainStyledAttributes.getBoolean(0, focusRingState.ringEnabled);
            this.state.ringEnabledInflated = true;
        }
        this.state.ringOuterColorAttr = getValueDataIfAttr(obtainStyledAttributes, 5);
        FocusRingState focusRingState2 = this.state;
        if (focusRingState2.ringOuterColorAttr == Integer.MIN_VALUE) {
            focusRingState2.ringOuterColor = obtainStyledAttributes.getColor(5, PKIFailureInfo.systemUnavail);
        }
        this.state.ringInnerColorAttr = getValueDataIfAttr(obtainStyledAttributes, 1);
        FocusRingState focusRingState3 = this.state;
        if (focusRingState3.ringInnerColorAttr == Integer.MIN_VALUE) {
            focusRingState3.ringInnerColor = obtainStyledAttributes.getColor(1, PKIFailureInfo.systemUnavail);
        }
        this.state.ringOuterStrokeWidthAttr = getValueDataIfAttr(obtainStyledAttributes, 6);
        FocusRingState focusRingState4 = this.state;
        if (focusRingState4.ringOuterStrokeWidthAttr == Integer.MIN_VALUE) {
            focusRingState4.ringOuterStrokeWidth = obtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.state.ringInnerStrokeWidthAttr = getValueDataIfAttr(obtainStyledAttributes, 3);
        FocusRingState focusRingState5 = this.state;
        if (focusRingState5.ringInnerStrokeWidthAttr == Integer.MIN_VALUE) {
            focusRingState5.ringInnerStrokeWidth = obtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.state.ringInnerStrokeWidthAttr = getValueDataIfAttr(obtainStyledAttributes, 3);
        FocusRingState focusRingState6 = this.state;
        if (focusRingState6.ringInnerStrokeWidthAttr == Integer.MIN_VALUE) {
            focusRingState6.ringInnerStrokeWidth = obtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.state.ringRadiusAttr = getValueDataIfAttr(obtainStyledAttributes, 7);
        FocusRingState focusRingState7 = this.state;
        if (focusRingState7.ringRadiusAttr == Integer.MIN_VALUE) {
            focusRingState7.ringRadius = obtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.state.ringInsetAttr = getValueDataIfAttr(obtainStyledAttributes, 4);
        FocusRingState focusRingState8 = this.state;
        if (focusRingState8.ringInsetAttr == Integer.MIN_VALUE) {
            focusRingState8.ringInset = obtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.state.ringInnerInsetAttr = getValueDataIfAttr(obtainStyledAttributes, 2);
        FocusRingState focusRingState9 = this.state;
        if (focusRingState9.ringInnerInsetAttr == Integer.MIN_VALUE) {
            focusRingState9.ringInnerInset = obtainStyledAttributes.getDimension(2, Float.NaN);
        }
        this.state.ringShapeAppearanceAttr = getValueDataIfAttr(obtainStyledAttributes, 8);
        FocusRingState focusRingState10 = this.state;
        if (obtainStyledAttributes.getType(8) == 1) {
            i2 = obtainStyledAttributes.getResourceId(8, PKIFailureInfo.systemUnavail);
        }
        focusRingState10.ringShapeAppearanceResId = i2;
        obtainStyledAttributes.recycle();
        int depth = xmlPullParser.getDepth();
        Drawable drawable = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                break;
            } else if (next == 2) {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawable != null) {
            setDrawable(drawable);
            this.state.wrappedState = drawable.getConstantState();
        } else {
            ColorDrawable colorDrawable = EMPTY_DRAWABLE;
            setDrawable(colorDrawable);
            this.state.wrappedState = colorDrawable.getConstantState();
        }
    }

    public final void init(Resources.Theme theme) {
        TypedValue resolve;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(R$styleable.FocusRingDrawable);
        int i = this.state.ringEnabledAttr;
        if (i != Integer.MIN_VALUE && (resolve = MaterialAttributes.resolve(theme, i)) != null) {
            FocusRingState focusRingState = this.state;
            focusRingState.ringEnabled = resolve.data != 0;
            focusRingState.ringEnabledInflated = true;
        }
        FocusRingState focusRingState2 = this.state;
        if (!focusRingState2.ringEnabledInflated) {
            focusRingState2.ringEnabled = MaterialAttributes.resolveBoolean(theme, com.squareup.cash.R.attr.focusRingsEnabled, focusRingState2.ringEnabled);
        }
        FocusRingState focusRingState3 = this.state;
        if (focusRingState3.ringEnabled) {
            int i2 = focusRingState3.ringOuterColor;
            int i3 = focusRingState3.ringOuterColorAttr;
            if (i2 == Integer.MIN_VALUE) {
                if (i3 != Integer.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    if (theme.resolveAttribute(i3, typedValue, true)) {
                        i2 = typedValue.data;
                    }
                }
                i2 = obtainStyledAttributes.getColor(5, -16777216);
            }
            focusRingState3.ringOuterColor = i2;
            FocusRingState focusRingState4 = this.state;
            int i4 = focusRingState4.ringInnerColor;
            int i5 = focusRingState4.ringInnerColorAttr;
            if (i4 == Integer.MIN_VALUE) {
                if (i5 != Integer.MIN_VALUE) {
                    TypedValue typedValue2 = new TypedValue();
                    if (theme.resolveAttribute(i5, typedValue2, true)) {
                        i4 = typedValue2.data;
                    }
                }
                i4 = obtainStyledAttributes.getColor(1, -1);
            }
            focusRingState4.ringInnerColor = i4;
            FocusRingState focusRingState5 = this.state;
            focusRingState5.ringOuterStrokeWidth = maybeResolveDimension(focusRingState5.ringOuterStrokeWidth, theme, focusRingState5.ringOuterStrokeWidthAttr, obtainStyledAttributes, 6, com.squareup.cash.R.dimen.mtrl_focus_ring_outer_stroke_width);
            FocusRingState focusRingState6 = this.state;
            focusRingState6.ringInnerStrokeWidth = maybeResolveDimension(focusRingState6.ringInnerStrokeWidth, theme, focusRingState6.ringInnerStrokeWidthAttr, obtainStyledAttributes, 3, com.squareup.cash.R.dimen.mtrl_focus_ring_inner_stroke_width);
            FocusRingState focusRingState7 = this.state;
            focusRingState7.ringRadius = maybeResolveDimension(focusRingState7.ringRadius, theme, focusRingState7.ringRadiusAttr, obtainStyledAttributes, 7, 0);
            FocusRingState focusRingState8 = this.state;
            focusRingState8.ringInset = maybeResolveDimension(focusRingState8.ringInset, theme, focusRingState8.ringInsetAttr, obtainStyledAttributes, 4, 0);
            if (Float.isNaN(this.state.ringInset)) {
                this.state.ringInset = RecyclerView.DECELERATION_RATE;
            }
            FocusRingState focusRingState9 = this.state;
            focusRingState9.ringInnerInset = maybeResolveDimension(focusRingState9.ringInnerInset, theme, focusRingState9.ringInnerInsetAttr, obtainStyledAttributes, 2, com.squareup.cash.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            FocusRingState focusRingState10 = this.state;
            int i6 = focusRingState10.ringShapeAppearanceResId;
            int[] iArr = R$styleable.ShapeAppearance;
            if (i6 != Integer.MIN_VALUE) {
                focusRingState10.ringShapeAppearance = ShapeAppearanceModel.builder(theme.obtainStyledAttributes(i6, iArr), new AbsoluteCornerSize(RecyclerView.DECELERATION_RATE)).build();
            } else {
                int i7 = focusRingState10.ringShapeAppearanceAttr;
                if (i7 == Integer.MIN_VALUE) {
                    i7 = com.squareup.cash.R.attr.focusRingsShapeAppearance;
                }
                TypedValue resolve2 = MaterialAttributes.resolve(theme, i7);
                if (resolve2 != null) {
                    this.state.ringShapeAppearance = ShapeAppearanceModel.builder(theme.obtainStyledAttributes(resolve2.resourceId, iArr), new AbsoluteCornerSize(RecyclerView.DECELERATION_RATE)).build();
                }
            }
        }
        obtainStyledAttributes.recycle();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.paint;
        paint.setStyle(style);
        if (Float.isNaN(this.state.ringOuterStrokeWidth)) {
            return;
        }
        paint.setStrokeWidth(this.state.ringOuterStrokeWidth);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Drawable drawable = getDrawable();
        return drawable != null && drawable.isProjected();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || this.state.ringEnabled;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.animator = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.mutated && super.mutate() == this) {
            this.state = new FocusRingState(this.state);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.state.wrappedState = drawable.getConstantState();
            }
            this.mutated = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x018c  */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBoundsChange(Rect rect) {
        float[] fArr;
        float f;
        ShapeAppearanceModel shapeAppearanceModel;
        super.onBoundsChange(rect);
        FocusRingState focusRingState = this.state;
        if (!focusRingState.ringEnabled) {
            return;
        }
        ShapeAppearance shapeAppearance = focusRingState.ringShapeAppearance;
        if (shapeAppearance != null) {
            updateShapeAppearanceCornerSizeOrPath(shapeAppearance);
            return;
        }
        Drawable drawable = getDrawable();
        ShapeAppearanceModel shapeAppearanceModel2 = null;
        if (drawable instanceof ShapeDrawable) {
            Outline outline = new Outline();
            ((ShapeDrawable) drawable).getOutline(outline);
            if (outline.getRadius() > RecyclerView.DECELERATION_RATE) {
                RoundedCornerTreatment roundedCornerTreatment = new RoundedCornerTreatment();
                RoundedCornerTreatment roundedCornerTreatment2 = new RoundedCornerTreatment();
                RoundedCornerTreatment roundedCornerTreatment3 = new RoundedCornerTreatment();
                RoundedCornerTreatment roundedCornerTreatment4 = new RoundedCornerTreatment();
                Transition.AnonymousClass1 anonymousClass1 = new Transition.AnonymousClass1();
                Transition.AnonymousClass1 anonymousClass12 = new Transition.AnonymousClass1();
                Transition.AnonymousClass1 anonymousClass13 = new Transition.AnonymousClass1();
                Transition.AnonymousClass1 anonymousClass14 = new Transition.AnonymousClass1();
                float radius = outline.getRadius();
                AbsoluteCornerSize absoluteCornerSize = new AbsoluteCornerSize(radius);
                AbsoluteCornerSize absoluteCornerSize2 = new AbsoluteCornerSize(radius);
                AbsoluteCornerSize absoluteCornerSize3 = new AbsoluteCornerSize(radius);
                AbsoluteCornerSize absoluteCornerSize4 = new AbsoluteCornerSize(radius);
                shapeAppearanceModel = new ShapeAppearanceModel();
                shapeAppearanceModel.topLeftCorner = roundedCornerTreatment;
                shapeAppearanceModel.topRightCorner = roundedCornerTreatment2;
                shapeAppearanceModel.bottomRightCorner = roundedCornerTreatment3;
                shapeAppearanceModel.bottomLeftCorner = roundedCornerTreatment4;
                shapeAppearanceModel.topLeftCornerSize = absoluteCornerSize;
                shapeAppearanceModel.topRightCornerSize = absoluteCornerSize2;
                shapeAppearanceModel.bottomRightCornerSize = absoluteCornerSize3;
                shapeAppearanceModel.bottomLeftCornerSize = absoluteCornerSize4;
                shapeAppearanceModel.topEdge = anonymousClass1;
                shapeAppearanceModel.rightEdge = anonymousClass12;
                shapeAppearanceModel.bottomEdge = anonymousClass13;
                shapeAppearanceModel.leftEdge = anonymousClass14;
                shapeAppearanceModel2 = shapeAppearanceModel;
            }
            if (shapeAppearanceModel2 == null) {
                updateShapeAppearanceCornerSizeOrPath(shapeAppearanceModel2);
                return;
            } else {
                this.shapeAppearanceCornerSize = -1.0f;
                this.shapeAppearancePath.reset();
                return;
            }
        }
        if (drawable instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            try {
                fArr = gradientDrawable.getCornerRadii();
            } catch (NullPointerException unused) {
                fArr = null;
            }
            if (fArr != null) {
                RoundedCornerTreatment roundedCornerTreatment5 = new RoundedCornerTreatment();
                RoundedCornerTreatment roundedCornerTreatment6 = new RoundedCornerTreatment();
                RoundedCornerTreatment roundedCornerTreatment7 = new RoundedCornerTreatment();
                RoundedCornerTreatment roundedCornerTreatment8 = new RoundedCornerTreatment();
                Transition.AnonymousClass1 anonymousClass15 = new Transition.AnonymousClass1();
                Transition.AnonymousClass1 anonymousClass16 = new Transition.AnonymousClass1();
                Transition.AnonymousClass1 anonymousClass17 = new Transition.AnonymousClass1();
                Transition.AnonymousClass1 anonymousClass18 = new Transition.AnonymousClass1();
                AbsoluteCornerSize absoluteCornerSize5 = new AbsoluteCornerSize(Math.min(fArr[0], fArr[1]));
                AbsoluteCornerSize absoluteCornerSize6 = new AbsoluteCornerSize(Math.min(fArr[2], fArr[3]));
                AbsoluteCornerSize absoluteCornerSize7 = new AbsoluteCornerSize(Math.min(fArr[4], fArr[5]));
                AbsoluteCornerSize absoluteCornerSize8 = new AbsoluteCornerSize(Math.min(fArr[6], fArr[7]));
                shapeAppearanceModel = new ShapeAppearanceModel();
                shapeAppearanceModel.topLeftCorner = roundedCornerTreatment5;
                shapeAppearanceModel.topRightCorner = roundedCornerTreatment6;
                shapeAppearanceModel.bottomRightCorner = roundedCornerTreatment7;
                shapeAppearanceModel.bottomLeftCorner = roundedCornerTreatment8;
                shapeAppearanceModel.topLeftCornerSize = absoluteCornerSize5;
                shapeAppearanceModel.topRightCornerSize = absoluteCornerSize6;
                shapeAppearanceModel.bottomRightCornerSize = absoluteCornerSize7;
                shapeAppearanceModel.bottomLeftCornerSize = absoluteCornerSize8;
                shapeAppearanceModel.topEdge = anonymousClass15;
                shapeAppearanceModel.rightEdge = anonymousClass16;
                shapeAppearanceModel.bottomEdge = anonymousClass17;
                shapeAppearanceModel.leftEdge = anonymousClass18;
                shapeAppearanceModel2 = shapeAppearanceModel;
            } else {
                try {
                    f = gradientDrawable.getCornerRadius();
                } catch (NullPointerException unused2) {
                    f = -1.0f;
                }
                if (f > RecyclerView.DECELERATION_RATE) {
                    RoundedCornerTreatment roundedCornerTreatment9 = new RoundedCornerTreatment();
                    RoundedCornerTreatment roundedCornerTreatment10 = new RoundedCornerTreatment();
                    RoundedCornerTreatment roundedCornerTreatment11 = new RoundedCornerTreatment();
                    RoundedCornerTreatment roundedCornerTreatment12 = new RoundedCornerTreatment();
                    Transition.AnonymousClass1 anonymousClass19 = new Transition.AnonymousClass1();
                    Transition.AnonymousClass1 anonymousClass110 = new Transition.AnonymousClass1();
                    Transition.AnonymousClass1 anonymousClass111 = new Transition.AnonymousClass1();
                    Transition.AnonymousClass1 anonymousClass112 = new Transition.AnonymousClass1();
                    AbsoluteCornerSize absoluteCornerSize9 = new AbsoluteCornerSize(f);
                    AbsoluteCornerSize absoluteCornerSize10 = new AbsoluteCornerSize(f);
                    AbsoluteCornerSize absoluteCornerSize11 = new AbsoluteCornerSize(f);
                    AbsoluteCornerSize absoluteCornerSize12 = new AbsoluteCornerSize(f);
                    ShapeAppearanceModel shapeAppearanceModel3 = new ShapeAppearanceModel();
                    shapeAppearanceModel3.topLeftCorner = roundedCornerTreatment9;
                    shapeAppearanceModel3.topRightCorner = roundedCornerTreatment10;
                    shapeAppearanceModel3.bottomRightCorner = roundedCornerTreatment11;
                    shapeAppearanceModel3.bottomLeftCorner = roundedCornerTreatment12;
                    shapeAppearanceModel3.topLeftCornerSize = absoluteCornerSize9;
                    shapeAppearanceModel3.topRightCornerSize = absoluteCornerSize10;
                    shapeAppearanceModel3.bottomRightCornerSize = absoluteCornerSize11;
                    shapeAppearanceModel3.bottomLeftCornerSize = absoluteCornerSize12;
                    shapeAppearanceModel3.topEdge = anonymousClass19;
                    shapeAppearanceModel3.rightEdge = anonymousClass110;
                    shapeAppearanceModel3.bottomEdge = anonymousClass111;
                    shapeAppearanceModel3.leftEdge = anonymousClass112;
                    shapeAppearanceModel2 = shapeAppearanceModel3;
                }
            }
        }
        if (shapeAppearanceModel2 == null) {
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        FocusRingState focusRingState = this.state;
        if (!focusRingState.ringEnabled) {
            this.focused = false;
            return super.onStateChange(iArr);
        }
        boolean stateSetMatches = StateSet.stateSetMatches(focusRingState.ringStateSet, iArr);
        boolean z = this.focused != stateSetMatches;
        this.focused = stateSetMatches;
        if (z && iArr.length > 0 && !this.previousStateSetEmpty) {
            ObjectAnimator objectAnimator = this.animator;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.animator = null;
            }
            if (stateSetMatches) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, PROPERTY_INTERPOLATION, RecyclerView.DECELERATION_RATE, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.setInterpolator(INTERPOLATOR);
                ofFloat.addListener(new Transition.AnonymousClass3(this, 6));
                this.animator = ofFloat;
                ofFloat.start();
            } else {
                this.interpolation = 1.0f;
            }
        }
        this.previousStateSetEmpty = iArr.length == 0;
        return super.onStateChange(iArr) || z;
    }

    public final void updateShapeAppearanceCornerSizeOrPath(ShapeAppearance shapeAppearance) {
        RectF rectF = this.tmpRectF;
        calculateBounds(rectF);
        ShapeAppearanceModel shapeForState = shapeAppearance.getShapeForState(FOCUSED_STATE_SET);
        boolean isRoundRect = shapeForState.isRoundRect(rectF);
        Path path = this.shapeAppearancePath;
        if (!isRoundRect) {
            this.pathProvider.calculatePath(shapeForState, null, 1.0f, rectF, null, path);
            this.shapeAppearanceCornerSize = -1.0f;
            return;
        }
        FocusRingState focusRingState = this.state;
        float f = ((focusRingState.ringOuterStrokeWidth / 2.0f) * this.interpolation) + focusRingState.ringInset;
        rectF.inset(f, f);
        this.shapeAppearanceCornerSize = shapeForState.topLeftCornerSize.getCornerSize(rectF);
        path.reset();
    }

    public final class FocusRingState extends Drawable.ConstantState {
        public int mChangingConfigurations;
        public Rect ringCustomBounds;
        public boolean ringEnabled;
        public int ringEnabledAttr;
        public boolean ringEnabledInflated;
        public int ringInnerColor;
        public int ringInnerColorAttr;
        public float ringInnerInset;
        public int ringInnerInsetAttr;
        public float ringInnerStrokeWidth;
        public int ringInnerStrokeWidthAttr;
        public float ringInset;
        public int ringInsetAttr;
        public int ringOuterColor;
        public int ringOuterColorAttr;
        public float ringOuterStrokeWidth;
        public int ringOuterStrokeWidthAttr;
        public float ringRadius;
        public int ringRadiusAttr;
        public ShapeAppearance ringShapeAppearance;
        public int ringShapeAppearanceAttr;
        public int ringShapeAppearanceResId;
        public int[] ringStateSet;
        public Drawable.ConstantState wrappedState;

        public FocusRingState(FocusRingState focusRingState) {
            this.mChangingConfigurations = 0;
            this.ringEnabled = false;
            this.ringEnabledAttr = PKIFailureInfo.systemUnavail;
            this.ringEnabledInflated = false;
            this.ringOuterColor = PKIFailureInfo.systemUnavail;
            this.ringOuterColorAttr = PKIFailureInfo.systemUnavail;
            this.ringInnerColor = PKIFailureInfo.systemUnavail;
            this.ringInnerColorAttr = PKIFailureInfo.systemUnavail;
            this.ringOuterStrokeWidth = Float.NaN;
            this.ringOuterStrokeWidthAttr = PKIFailureInfo.systemUnavail;
            this.ringInnerStrokeWidth = Float.NaN;
            this.ringInnerStrokeWidthAttr = PKIFailureInfo.systemUnavail;
            this.ringRadius = Float.NaN;
            this.ringRadiusAttr = PKIFailureInfo.systemUnavail;
            this.ringInset = Float.NaN;
            this.ringInsetAttr = PKIFailureInfo.systemUnavail;
            this.ringInnerInset = Float.NaN;
            this.ringInnerInsetAttr = PKIFailureInfo.systemUnavail;
            this.ringShapeAppearance = null;
            this.ringShapeAppearanceResId = PKIFailureInfo.systemUnavail;
            this.ringShapeAppearanceAttr = PKIFailureInfo.systemUnavail;
            this.ringCustomBounds = null;
            this.ringStateSet = FocusRingDrawable.FOCUSED_STATE_SET;
            if (focusRingState != null) {
                this.wrappedState = focusRingState.wrappedState;
                this.mChangingConfigurations = focusRingState.mChangingConfigurations;
                this.ringEnabled = focusRingState.ringEnabled;
                this.ringEnabledAttr = focusRingState.ringEnabledAttr;
                this.ringEnabledInflated = focusRingState.ringEnabledInflated;
                this.ringOuterColor = focusRingState.ringOuterColor;
                this.ringOuterColorAttr = focusRingState.ringOuterColorAttr;
                this.ringInnerColor = focusRingState.ringInnerColor;
                this.ringInnerColorAttr = focusRingState.ringInnerColorAttr;
                this.ringOuterStrokeWidth = focusRingState.ringOuterStrokeWidth;
                this.ringOuterStrokeWidthAttr = focusRingState.ringOuterStrokeWidthAttr;
                this.ringInnerStrokeWidth = focusRingState.ringInnerStrokeWidth;
                this.ringInnerStrokeWidthAttr = focusRingState.ringInnerStrokeWidthAttr;
                this.ringRadius = focusRingState.ringRadius;
                this.ringRadiusAttr = focusRingState.ringRadiusAttr;
                this.ringInset = focusRingState.ringInset;
                this.ringInsetAttr = focusRingState.ringInsetAttr;
                this.ringInnerInset = focusRingState.ringInnerInset;
                this.ringInnerInsetAttr = focusRingState.ringInnerInsetAttr;
                this.ringShapeAppearanceResId = focusRingState.ringShapeAppearanceResId;
                this.ringShapeAppearanceAttr = focusRingState.ringShapeAppearanceAttr;
                ShapeAppearance shapeAppearance = focusRingState.ringShapeAppearance;
                if (shapeAppearance instanceof ShapeAppearanceModel) {
                    this.ringShapeAppearance = ((ShapeAppearanceModel) shapeAppearance).toBuilder().build();
                } else if (shapeAppearance instanceof StateListShapeAppearanceModel) {
                    this.ringShapeAppearance = ((StateListShapeAppearanceModel) shapeAppearance).toBuilder().build();
                } else {
                    this.ringShapeAppearance = shapeAppearance;
                }
                if (focusRingState.ringCustomBounds != null) {
                    this.ringCustomBounds = new Rect(focusRingState.ringCustomBounds);
                }
                int[] iArr = focusRingState.ringStateSet;
                this.ringStateSet = Arrays.copyOf(iArr, iArr.length);
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            Drawable.ConstantState constantState = this.wrappedState;
            return this.mChangingConfigurations | (constantState != null ? constantState.getChangingConfigurations() : 0);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new FocusRingDrawable(this, (Resources) null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new FocusRingDrawable(this, resources);
        }
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.paint = new Paint(1);
        this.tmpRectF = new RectF();
        this.tmpRect = new Rect();
        this.tmpPath = new Path();
        this.shapeAppearancePath = new Path();
        this.matrix = new Matrix();
        this.pathProvider = MediaSourceList.getInstanceOrCreate();
        this.shapeAppearanceCornerSize = -1.0f;
        this.interpolation = 1.0f;
        this.focused = false;
        this.mutated = false;
        FocusRingState focusRingState = new FocusRingState(null);
        this.state = focusRingState;
        if (drawable != null) {
            focusRingState.wrappedState = drawable.getConstantState();
        }
        init(context.getTheme());
    }

    public FocusRingDrawable() {
        super(null);
        this.paint = new Paint(1);
        this.tmpRectF = new RectF();
        this.tmpRect = new Rect();
        this.tmpPath = new Path();
        this.shapeAppearancePath = new Path();
        this.matrix = new Matrix();
        this.pathProvider = MediaSourceList.getInstanceOrCreate();
        this.shapeAppearanceCornerSize = -1.0f;
        this.interpolation = 1.0f;
        this.focused = false;
        this.mutated = false;
        this.state = new FocusRingState(null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
