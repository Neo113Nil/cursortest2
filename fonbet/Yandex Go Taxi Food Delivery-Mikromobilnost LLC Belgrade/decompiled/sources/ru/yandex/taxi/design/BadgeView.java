package ru.yandex.taxi.design;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.widget.FrameLayout;
import defpackage.c4i0;
import defpackage.dzg0;
import defpackage.j73;
import defpackage.k4o;
import defpackage.mrg0;
import defpackage.nwy0;
import defpackage.tje;
import defpackage.tp11;
import defpackage.um4;
import defpackage.wuj0;
import defpackage.xw31;
import defpackage.yma1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 R2\u00020\u00012\u00020\u0002:\u0002STB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00192\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010!\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00102\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0014¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00102\b\b\u0001\u0010.\u001a\u00020\u0007¢\u0006\u0004\b/\u0010-J\u0017\u00101\u001a\u00020\u00102\b\b\u0001\u00100\u001a\u00020\u0007¢\u0006\u0004\b1\u0010-J\u0017\u00103\u001a\u00020\u00102\b\u00102\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00102\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J\u001d\u0010;\u001a\u00020\u00102\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u0007¢\u0006\u0004\b;\u0010*J\u0017\u0010>\u001a\u00020\u00102\b\b\u0001\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J\u0015\u0010A\u001a\u00020\u00102\u0006\u0010@\u001a\u00020\u0007¢\u0006\u0004\bA\u0010-J\u0017\u0010D\u001a\u00020\u00102\u0006\u0010C\u001a\u00020BH\u0014¢\u0006\u0004\bD\u0010ER\u0016\u0010.\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010FR\u0018\u00102\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010GR\u0014\u00106\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010NR\u0014\u0010\u0018\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010FR\u0014\u0010P\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010FR\u0016\u0010Q\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010FR\u0016\u0010\u0017\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010FR\u0016\u0010+\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010F¨\u0006U"}, d2 = {"Lru/yandex/taxi/design/BadgeView;", "Landroid/widget/FrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/yandex/taxi/widget/RobotoTextView;", "initTextView", "(Landroid/content/Context;)Lru/yandex/taxi/widget/RobotoTextView;", "Landroid/content/res/TypedArray;", "attributes", "Lzy11;", "applyAttributes", "(Landroid/content/res/TypedArray;)V", "shapeId", "Lru/yandex/taxi/design/BadgeView$Shape;", "shapeByResId", "(I)Lru/yandex/taxi/design/BadgeView$Shape;", "badgeWidth", "badgeHeight", "Landroid/util/Pair;", "calculateSizesAfterRotation", "(II)Landroid/util/Pair;", "Landroid/graphics/Point;", "p", "rp", "", "angleRad", "rotatePoint", "(Landroid/graphics/Point;Landroid/graphics/Point;D)Landroid/graphics/Point;", "", "isShapeChanged", "invalidateBackground", "(Z)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "angle", "setAngle", "(I)V", "tintColor", "setTintColor", "textColor", "setTextColor", "shape", "setShape", "(Lru/yandex/taxi/design/BadgeView$Shape;)V", "", "text", "setText", "(Ljava/lang/CharSequence;)V", "typeface", "style", "setTextTypeface", "", "size", "setTextSize", "(F)V", "horizontalMargin", "setTextHorizontalMargin", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", CA20Status.STATUS_USER_I, "Lru/yandex/taxi/design/BadgeView$Shape;", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroid/graphics/Paint;", "bgPaint", "Landroid/graphics/Paint;", "Landroid/graphics/drawable/VectorDrawable;", "leftDrawable", "Landroid/graphics/drawable/VectorDrawable;", "rightDrawable", "defaultTextSize", "textHorizontalMargin", "Companion", "Shape", "um4", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public class BadgeView extends FrameLayout implements nwy0 {
    public static final um4 Companion = new um4();
    private static final int SHAPE_WITH_DRAWABLE_INTERSECTION_PX = 1;
    private int angle;
    private final int badgeHeight;
    private int badgeWidth;
    private final Paint bgPaint;
    private final int defaultTextSize;
    private VectorDrawable leftDrawable;
    private VectorDrawable rightDrawable;
    private Shape shape;
    private final RobotoTextView text;
    private int textHorizontalMargin;
    private int tintColor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\t\u001a\u00020\u00028\u0006¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006j\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/design/BadgeView$Shape;", "", "", "typeface", CA20Status.STATUS_USER_I, "f", "()I", "getTypeface$annotations", "()V", "style", "c", "getStyle$annotations", "left", "a", "right", "b", "BUBBLE", "STICKER", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Shape {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Shape[] $VALUES;
        public static final Shape BUBBLE;
        public static final Shape STICKER;
        private final int left;
        private final int right;
        private final int style;
        private final int typeface = 5;

        static {
            Shape shape = new Shape(0, 3, dzg0.ic_bubble_left, dzg0.ic_bubble_right, "BUBBLE");
            BUBBLE = shape;
            Shape shape2 = new Shape(1, 1, dzg0.ic_sticker_left, dzg0.ic_sticker_right, "STICKER");
            STICKER = shape2;
            Shape[] shapeArr = {shape, shape2};
            $VALUES = shapeArr;
            $ENTRIES = kotlin.enums.a.a(shapeArr);
        }

        public Shape(int i, int i2, int i3, int i4, String str) {
            this.style = i2;
            this.left = i3;
            this.right = i4;
        }

        public static Shape valueOf(String str) {
            return (Shape) Enum.valueOf(Shape.class, str);
        }

        public static Shape[] values() {
            return (Shape[]) $VALUES.clone();
        }

        /* renamed from: a, reason: from getter */
        public final int getLeft() {
            return this.left;
        }

        /* renamed from: b, reason: from getter */
        public final int getRight() {
            return this.right;
        }

        /* renamed from: c, reason: from getter */
        public final int getStyle() {
            return this.style;
        }

        /* renamed from: f, reason: from getter */
        public final int getTypeface() {
            return this.typeface;
        }
    }

    public BadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.bgPaint = paint;
        this.badgeHeight = tje.u(24, getContext());
        this.defaultTextSize = tje.u(13, getContext());
        this.textHorizontalMargin = tje.r(mrg0.go_design_s_space, getContext());
        setWillNotDraw(false);
        RobotoTextView initTextView = initTextView(context);
        this.text = initTextView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(initTextView, layoutParams);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c4i0.BadgeView, i, 0);
        try {
            applyAttributes(obtainStyledAttributes);
            obtainStyledAttributes.recycle();
            xw31.B(this.textHorizontalMargin, this);
            invalidateBackground(false);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void applyAttributes(TypedArray attributes) {
        this.tintColor = attributes.getColor(c4i0.BadgeView_badge_color, 0);
        this.textHorizontalMargin = attributes.getDimensionPixelSize(c4i0.BadgeView_badge_horizontal_padding, this.textHorizontalMargin);
        setTextTypeface(attributes.getInt(c4i0.BadgeView_badge_text_typeface, 0), attributes.getInt(c4i0.BadgeView_badge_text_style, 0));
        setTextSize(attributes.getDimension(c4i0.BadgeView_badge_text_size, this.defaultTextSize));
        setShape(shapeByResId(attributes.getInt(c4i0.BadgeView_badge_shape, -1)));
        this.text.setTextColor(attributes.getColor(c4i0.BadgeView_badge_text_color, 0));
        this.text.setText(attributes.getString(c4i0.BadgeView_badge_text));
        setAngle(attributes.getInt(c4i0.BadgeView_badge_angle, 0));
    }

    private final Pair<Integer, Integer> calculateSizesAfterRotation(int badgeWidth, int badgeHeight) {
        double radians = Math.toRadians(this.angle);
        Point point = new Point(badgeWidth / 2, (-badgeHeight) / 2);
        Point rotatePoint = rotatePoint(new Point(0, badgeHeight), point, radians);
        Point rotatePoint2 = rotatePoint(new Point(badgeWidth, badgeHeight), point, radians);
        Point rotatePoint3 = rotatePoint(new Point(0, 0), point, radians);
        Point rotatePoint4 = rotatePoint(new Point(badgeWidth, 0), point, radians);
        int[] iArr = {rotatePoint3.y, rotatePoint4.y, rotatePoint.y, rotatePoint2.y};
        int[] iArr2 = {rotatePoint3.x, rotatePoint4.x, rotatePoint.x, rotatePoint2.x};
        int T = j73.T(iArr);
        return new Pair<>(Integer.valueOf(Math.abs(j73.Q(iArr2) - j73.T(iArr2))), Integer.valueOf(Math.abs(j73.Q(iArr) - T)));
    }

    private final RobotoTextView initTextView(Context context) {
        RobotoTextView robotoTextView = new RobotoTextView(context, null, 0, 6, null);
        robotoTextView.setLines(1);
        robotoTextView.setSingleLine(true);
        robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
        robotoTextView.setGravity(17);
        robotoTextView.setTextSize(0, this.defaultTextSize);
        return robotoTextView;
    }

    private final void invalidateBackground(boolean isShapeChanged) {
        Shape shape = this.shape;
        if (shape != null) {
            setTextTypeface(shape.getTypeface(), shape.getStyle());
            if (isShapeChanged || this.leftDrawable == null) {
                Resources resources = getResources();
                int left = shape.getLeft();
                ThreadLocal threadLocal = wuj0.a;
                Drawable b = yma1.b(resources, left, null);
                VectorDrawable vectorDrawable = b instanceof VectorDrawable ? (VectorDrawable) b : null;
                if (vectorDrawable != null) {
                    VectorDrawable vectorDrawable2 = (VectorDrawable) vectorDrawable.mutate();
                    this.leftDrawable = vectorDrawable2;
                    vectorDrawable2.setColorFilter(this.tintColor, PorterDuff.Mode.SRC_ATOP);
                }
            }
            if (isShapeChanged || this.rightDrawable == null) {
                Resources resources2 = getResources();
                int right = shape.getRight();
                ThreadLocal threadLocal2 = wuj0.a;
                Drawable b2 = yma1.b(resources2, right, null);
                VectorDrawable vectorDrawable3 = b2 instanceof VectorDrawable ? (VectorDrawable) b2 : null;
                if (vectorDrawable3 != null) {
                    VectorDrawable vectorDrawable4 = (VectorDrawable) vectorDrawable3.mutate();
                    this.rightDrawable = vectorDrawable4;
                    vectorDrawable4.setColorFilter(this.tintColor, PorterDuff.Mode.SRC_ATOP);
                }
            }
        } else {
            this.leftDrawable = null;
            this.rightDrawable = null;
            ColorStateList backgroundTintList = getBackgroundTintList();
            if (backgroundTintList == null || backgroundTintList.getDefaultColor() != this.tintColor) {
                setBackgroundTintList(ColorStateList.valueOf(this.tintColor));
            }
        }
        invalidate();
    }

    private final Point rotatePoint(Point p, Point rp, double angleRad) {
        return new Point((int) (((Math.cos(angleRad) * (p.x - rp.x)) - (Math.sin(angleRad) * (p.y - rp.y))) + rp.x), (int) ((Math.cos(angleRad) * (p.y - rp.y)) + (Math.sin(angleRad) * (p.x - r6)) + rp.y));
    }

    private final Shape shapeByResId(int shapeId) {
        if (shapeId == 0) {
            return Shape.STICKER;
        }
        if (shapeId != 1) {
            return null;
        }
        return Shape.BUBBLE;
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public /* bridge */ void applyTheme(ThemeType themeType) {
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        VectorDrawable vectorDrawable;
        VectorDrawable vectorDrawable2;
        super.onDraw(canvas);
        if (this.shape == null || (vectorDrawable = this.leftDrawable) == null || (vectorDrawable2 = this.rightDrawable) == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int i = width / 2;
        int min = Math.min(vectorDrawable.getIntrinsicWidth(), (i - (this.badgeWidth / 2)) + this.textHorizontalMargin);
        int max = Math.max(width - vectorDrawable2.getIntrinsicWidth(), ((this.badgeWidth / 2) + i) - this.textHorizontalMargin);
        int i2 = height / 2;
        int i3 = this.badgeHeight;
        int i4 = i2 - (i3 / 2);
        int i5 = (i3 / 2) + i2;
        canvas.save();
        canvas.rotate(this.angle, width / 2.0f, height / 2.0f);
        this.bgPaint.setColor(this.tintColor);
        canvas.drawRect(min - 1, i4, max + 1, i5, this.bgPaint);
        vectorDrawable.setBounds(0, i4, min, i5);
        vectorDrawable.draw(canvas);
        vectorDrawable2.setBounds(max, i4, width, i5);
        vectorDrawable2.draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.shape == null) {
            return;
        }
        int max = Math.max(getMinimumWidth(), (this.textHorizontalMargin * 2) + this.text.getMeasuredWidth());
        this.badgeWidth = max;
        Pair<Integer, Integer> calculateSizesAfterRotation = calculateSizesAfterRotation(max, this.badgeHeight);
        setMeasuredDimension(((Number) calculateSizesAfterRotation.first).intValue(), ((Number) calculateSizesAfterRotation.second).intValue());
    }

    public final void setAngle(int angle) {
        this.angle = angle;
        this.text.setRotation(angle);
        requestLayout();
        invalidateBackground(false);
    }

    public final void setShape(Shape shape) {
        if (this.shape != shape) {
            this.shape = shape;
            invalidateBackground(true);
            if (shape != null) {
                setLayerType(1, this.bgPaint);
            }
        }
    }

    public final void setText(CharSequence text) {
        this.text.setText(text);
    }

    public final void setTextColor(int textColor) {
        this.text.setTextColor(textColor);
    }

    public final void setTextHorizontalMargin(int horizontalMargin) {
        this.textHorizontalMargin = horizontalMargin;
        xw31.B(horizontalMargin, this);
    }

    public final void setTextSize(float size) {
        this.text.setTextSize(0, size);
    }

    public final void setTextTypeface(int typeface, int style) {
        Boolean bool = tp11.a;
        tp11.a(typeface, style, this.text);
    }

    public final void setTintColor(int tintColor) {
        this.tintColor = tintColor;
        invalidateBackground(false);
    }

    public BadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public BadgeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ BadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
