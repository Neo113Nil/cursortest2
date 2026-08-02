package ru.yandex.taxi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.g4i0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.kgx;
import defpackage.ny61;
import defpackage.oji;
import defpackage.qd00;
import defpackage.qje;
import defpackage.vh;
import defpackage.w511;
import defpackage.xbi0;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001YB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001f\u0010\u001eJ!\u0010\"\u001a\u00020\f2\b\b\u0001\u0010 \u001a\u00020\u00062\b\b\u0001\u0010!\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\f2\b\b\u0001\u0010$\u001a\u00020\u0006¢\u0006\u0004\b%\u0010\u0013J\u0017\u0010&\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b&\u0010\u001eJ\u0017\u0010'\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b'\u0010\u001eJ\u0017\u0010(\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b(\u0010\u001eJ\u0017\u0010)\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b)\u0010\u001eR\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R+\u0010;\u001a\u0002032\u0006\u00104\u001a\u0002038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R+\u0010B\u001a\u00020<2\u0006\u00104\u001a\u00020<8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b=\u00106\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR+\u0010D\u001a\u00020\n2\u0006\u00104\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bC\u00106\u001a\u0004\bD\u0010E\"\u0004\bF\u0010\u000eR+\u0010M\u001a\u00020G2\u0006\u00104\u001a\u00020G8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bH\u00106\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR/\u0010T\u001a\u0004\u0018\u00010N2\b\u00104\u001a\u0004\u0018\u00010N8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bO\u00106\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR+\u0010X\u001a\u00020\n2\u0006\u00104\u001a\u00020\n8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bU\u00106\u001a\u0004\bV\u0010E\"\u0004\bW\u0010\u000e¨\u0006Z"}, d2 = {"Lru/yandex/taxi/widget/PlaceholderView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "hardware", "Lzy11;", "clipShimmeringToDrawable", "(Z)V", "clearShimmeringClip", "()V", "startOffset", "setStartOffset", "(I)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "dispatchDraw", "contentColor", "shimmerColor", "updateColors", "(II)V", "width", "updateGradientWidth", "drawCustomDrawable", "drawLine", "drawOval", "drawRect", "Landroid/graphics/RectF;", "currentDrawRect", "Landroid/graphics/RectF;", "Lru/yandex/taxi/widget/ShimmeringPaint;", "shimmeringPaint$delegate", "Li3y;", "getShimmeringPaint", "()Lru/yandex/taxi/widget/ShimmeringPaint;", "shimmeringPaint", "Lru/yandex/taxi/widget/PlaceholderView$PlaceholderType;", "<set-?>", "placeholderType$delegate", "Lxbi0;", "getPlaceholderType", "()Lru/yandex/taxi/widget/PlaceholderView$PlaceholderType;", "setPlaceholderType", "(Lru/yandex/taxi/widget/PlaceholderView$PlaceholderType;)V", "placeholderType", "Landroid/graphics/Paint;", "paint$delegate", "getPaint", "()Landroid/graphics/Paint;", "setPaint", "(Landroid/graphics/Paint;)V", "paint", "isHorizontalLine$delegate", "isHorizontalLine", "()Z", "setHorizontalLine", "", "rectCornerRadius$delegate", "getRectCornerRadius", "()F", "setRectCornerRadius", "(F)V", "rectCornerRadius", "Landroid/graphics/drawable/Drawable;", "drawable$delegate", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "setDrawable", "(Landroid/graphics/drawable/Drawable;)V", "drawable", "shimmering$delegate", "getShimmering", "setShimmering", "shimmering", "PlaceholderType", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlaceholderView extends View {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new MutablePropertyReference1Impl("placeholderType", 0, "getPlaceholderType()Lru/yandex/taxi/widget/PlaceholderView$PlaceholderType;", PlaceholderView.class), new MutablePropertyReference1Impl("paint", 0, "getPaint()Landroid/graphics/Paint;", PlaceholderView.class), new MutablePropertyReference1Impl("isHorizontalLine", 0, "isHorizontalLine()Z", PlaceholderView.class), new MutablePropertyReference1Impl("rectCornerRadius", 0, "getRectCornerRadius()F", PlaceholderView.class), new MutablePropertyReference1Impl("drawable", 0, "getDrawable()Landroid/graphics/drawable/Drawable;", PlaceholderView.class), new MutablePropertyReference1Impl("shimmering", 0, "getShimmering()Z", PlaceholderView.class)};
    public static final int $stable = 8;
    private final RectF currentDrawRect;

    /* renamed from: drawable$delegate, reason: from kotlin metadata */
    private final xbi0 drawable;

    /* renamed from: isHorizontalLine$delegate, reason: from kotlin metadata */
    private final xbi0 isHorizontalLine;

    /* renamed from: paint$delegate, reason: from kotlin metadata */
    private final xbi0 paint;

    /* renamed from: placeholderType$delegate, reason: from kotlin metadata */
    private final xbi0 placeholderType;

    /* renamed from: rectCornerRadius$delegate, reason: from kotlin metadata */
    private final xbi0 rectCornerRadius;

    /* renamed from: shimmering$delegate, reason: from kotlin metadata */
    private final xbi0 shimmering;

    /* renamed from: shimmeringPaint$delegate, reason: from kotlin metadata */
    private final i3y shimmeringPaint;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/widget/PlaceholderView$PlaceholderType;", "", "Companion", "ru/yandex/taxi/widget/e", "RECTANGLE", "OVAL", "ROUNDED_LINE", "DRAWABLE", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class PlaceholderType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PlaceholderType[] $VALUES;
        public static final e Companion;
        public static final PlaceholderType DRAWABLE;
        public static final PlaceholderType OVAL;
        public static final PlaceholderType RECTANGLE;
        public static final PlaceholderType ROUNDED_LINE;

        static {
            PlaceholderType placeholderType = new PlaceholderType("RECTANGLE", 0);
            RECTANGLE = placeholderType;
            PlaceholderType placeholderType2 = new PlaceholderType("OVAL", 1);
            OVAL = placeholderType2;
            PlaceholderType placeholderType3 = new PlaceholderType("ROUNDED_LINE", 2);
            ROUNDED_LINE = placeholderType3;
            PlaceholderType placeholderType4 = new PlaceholderType("DRAWABLE", 3);
            DRAWABLE = placeholderType4;
            PlaceholderType[] placeholderTypeArr = {placeholderType, placeholderType2, placeholderType3, placeholderType4};
            $VALUES = placeholderTypeArr;
            $ENTRIES = kotlin.enums.a.a(placeholderTypeArr);
            Companion = new e();
        }

        public static PlaceholderType valueOf(String str) {
            return (PlaceholderType) Enum.valueOf(PlaceholderType.class, str);
        }

        public static PlaceholderType[] values() {
            return (PlaceholderType[]) $VALUES.clone();
        }
    }

    public PlaceholderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        this.currentDrawRect = new RectF();
        this.shimmeringPaint = kotlin.a.a(new qd00(context, 14));
        PlaceholderType placeholderType = PlaceholderType.RECTANGLE;
        vh vhVar = new vh();
        vhVar.a = placeholderType;
        this.placeholderType = vhVar;
        Paint paint = new Paint(1);
        vh vhVar2 = new vh();
        vhVar2.a = paint;
        this.paint = vhVar2;
        Boolean bool = Boolean.TRUE;
        vh vhVar3 = new vh();
        vhVar3.a = bool;
        this.isHorizontalLine = vhVar3;
        Float valueOf = Float.valueOf(0.0f);
        vh vhVar4 = new vh();
        vhVar4.a = valueOf;
        this.rectCornerRadius = vhVar4;
        vh vhVar5 = new vh();
        vhVar5.a = null;
        this.drawable = vhVar5;
        this.shimmering = new oji(this);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, g4i0.PlaceholderView, i, 0);
        PlaceholderType.Companion.getClass();
        int i3 = g4i0.PlaceholderView_placeholder_type;
        if (obtainStyledAttributes.hasValue(i3) && (i2 = obtainStyledAttributes.getInt(i3, 0)) != 0) {
            if (i2 == 1) {
                placeholderType = PlaceholderType.OVAL;
            } else if (i2 == 2) {
                placeholderType = PlaceholderType.ROUNDED_LINE;
            } else {
                if (i2 != 3) {
                    ny61.g("Invalid \"placeholder_type\" value");
                    throw null;
                }
                placeholderType = PlaceholderType.DRAWABLE;
            }
        }
        setPlaceholderType(placeholderType);
        updateColors(obtainStyledAttributes.getColor(g4i0.PlaceholderView_placeholder_color, qje.t(xng0.bgMinor, getContext())), qje.t(xng0.shimmeringDefaultColor, getContext()));
        setHorizontalLine(obtainStyledAttributes.getBoolean(g4i0.PlaceholderView_placeholder_horizontal_line, isHorizontalLine()));
        setRectCornerRadius(obtainStyledAttributes.getDimension(g4i0.PlaceholderView_placeholder_corner_radius, 0.0f));
        setDrawable(obtainStyledAttributes.getDrawable(g4i0.PlaceholderView_placeholder_drawable_source));
        setShimmering(obtainStyledAttributes.getBoolean(g4i0.PlaceholderView_placeholder_shimmering, getShimmering()));
        int i4 = obtainStyledAttributes.getInt(g4i0.PlaceholderView_placeholder_animation_time, 1500);
        if (i4 != 1500) {
            getShimmeringPaint().setDuration(i4);
        }
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void clipShimmeringToDrawable$default(PlaceholderView placeholderView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        placeholderView.clipShimmeringToDrawable(z);
    }

    private final void drawCustomDrawable(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.draw(canvas);
        }
        if (getShimmering()) {
            canvas.drawRect(this.currentDrawRect, getShimmeringPaint());
        }
    }

    private final void drawLine(Canvas canvas) {
        float height = (isHorizontalLine() ? getHeight() : getWidth()) / 2.0f;
        boolean shimmering = getShimmering();
        RectF rectF = this.currentDrawRect;
        if (shimmering) {
            canvas.drawRoundRect(rectF, height, height, getShimmeringPaint());
        } else {
            canvas.drawRoundRect(rectF, height, height, getPaint());
        }
    }

    private final void drawOval(Canvas canvas) {
        boolean shimmering = getShimmering();
        RectF rectF = this.currentDrawRect;
        if (shimmering) {
            canvas.drawOval(rectF, getShimmeringPaint());
        } else {
            canvas.drawOval(rectF, getPaint());
        }
    }

    private final void drawRect(Canvas canvas) {
        canvas.drawRoundRect(this.currentDrawRect, getRectCornerRadius(), getRectCornerRadius(), getPaint());
        boolean shimmering = getShimmering();
        RectF rectF = this.currentDrawRect;
        if (shimmering) {
            canvas.drawRoundRect(rectF, getRectCornerRadius(), getRectCornerRadius(), getShimmeringPaint());
        } else {
            canvas.drawRoundRect(rectF, getRectCornerRadius(), getRectCornerRadius(), getPaint());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShimmeringPaint getShimmeringPaint() {
        return (ShimmeringPaint) this.shimmeringPaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShimmeringPaint shimmeringPaint_delegate$lambda$0(Context context) {
        ShimmeringPaint shimmeringPaint = new ShimmeringPaint(context);
        shimmeringPaint.setFlags(1);
        return shimmeringPaint;
    }

    public final void clearShimmeringClip() {
        getShimmeringPaint().setXfermode(null);
        setLayerType(0, null);
    }

    public final void clipShimmeringToDrawable(boolean hardware) {
        getShimmeringPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        if (hardware) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getShimmering()) {
            getShimmeringPaint().updateShimmering(this);
            postInvalidateOnAnimation();
        }
    }

    public final Drawable getDrawable() {
        return (Drawable) this.drawable.getValue(this, $$delegatedProperties[4]);
    }

    public final Paint getPaint() {
        return (Paint) this.paint.getValue(this, $$delegatedProperties[1]);
    }

    public final PlaceholderType getPlaceholderType() {
        return (PlaceholderType) this.placeholderType.getValue(this, $$delegatedProperties[0]);
    }

    public final float getRectCornerRadius() {
        return ((Number) this.rectCornerRadius.getValue(this, $$delegatedProperties[3])).floatValue();
    }

    public final boolean getShimmering() {
        return ((Boolean) this.shimmering.getValue(this, $$delegatedProperties[5])).booleanValue();
    }

    public final boolean isHorizontalLine() {
        return ((Boolean) this.isHorizontalLine.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = f.a[getPlaceholderType().ordinal()];
        if (i == 1) {
            drawRect(canvas);
            return;
        }
        if (i == 2) {
            drawOval(canvas);
            return;
        }
        if (i == 3) {
            drawLine(canvas);
        } else if (i == 4) {
            drawCustomDrawable(canvas);
        } else {
            w511.b();
        }
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (getShimmering()) {
            getShimmeringPaint().updateOffset(this);
        }
        this.currentDrawRect.set(0.0f, 0.0f, getWidth(), getHeight());
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    public final void setDrawable(Drawable drawable) {
        this.drawable.setValue(this, $$delegatedProperties[4], drawable);
    }

    public final void setHorizontalLine(boolean z) {
        this.isHorizontalLine.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    public final void setPaint(Paint paint) {
        this.paint.setValue(this, $$delegatedProperties[1], paint);
    }

    public final void setPlaceholderType(PlaceholderType placeholderType) {
        this.placeholderType.setValue(this, $$delegatedProperties[0], placeholderType);
    }

    public final void setRectCornerRadius(float f) {
        this.rectCornerRadius.setValue(this, $$delegatedProperties[3], Float.valueOf(f));
    }

    public final void setShimmering(boolean z) {
        this.shimmering.setValue(this, $$delegatedProperties[5], Boolean.valueOf(z));
    }

    public final void setStartOffset(int startOffset) {
        getShimmeringPaint().setStartOffset(startOffset);
    }

    public final void updateColors(int contentColor, int shimmerColor) {
        getShimmeringPaint().setColors(shimmerColor, contentColor);
        getPaint().setColor(contentColor);
    }

    public final void updateGradientWidth(int width) {
        getShimmeringPaint().setGradientWidth(width);
    }

    public PlaceholderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PlaceholderView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ PlaceholderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
