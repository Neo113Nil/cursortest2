package ru.yandex.taxi.masstransit.overlay.icons;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import defpackage.eja1;
import defpackage.k4o;
import defpackage.qje;
import defpackage.s531;
import defpackage.tje;
import defpackage.unr0;
import defpackage.up11;
import defpackage.w511;
import defpackage.xng0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\b\b\u0007\u0018\u0000 92\u00020\u0001:\u0004:;\u0013<B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000f\u001a\u00020\u000e*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u000e*\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010'\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010(\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001fR\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u00106\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000205038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00108¨\u0006="}, d2 = {"Lru/yandex/taxi/masstransit/overlay/icons/VehicleIconView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/graphics/Canvas;", "", "name", "", "bgColor", "nameColor", "Lru/yandex/taxi/masstransit/overlay/icons/VehicleIconView$LabelDirection;", "labelDirection", "Lzy11;", "drawLabel", "(Landroid/graphics/Canvas;Ljava/lang/String;IILru/yandex/taxi/masstransit/overlay/icons/VehicleIconView$LabelDirection;)V", "drawLabelShadow", "(Landroid/graphics/Canvas;Lru/yandex/taxi/masstransit/overlay/icons/VehicleIconView$LabelDirection;)V", "Lru/yandex/taxi/masstransit/overlay/icons/c;", ClidProvider.STATE, "render", "(Lru/yandex/taxi/masstransit/overlay/icons/c;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "everFrontColor", CA20Status.STATUS_USER_I, "", "radius", "F", "Landroid/graphics/Paint;", "labelBgPaint", "Landroid/graphics/Paint;", "labelShadowPaint", "labelTextPaint", "iconPaint", "Landroid/graphics/Rect;", "labelTextBounds", "Landroid/graphics/Rect;", "labelPadding", "Landroid/graphics/Path;", "labelBgPath", "Landroid/graphics/Path;", "Landroid/graphics/RectF;", "labelBgRect", "Landroid/graphics/RectF;", "", "Lru/yandex/taxi/masstransit/overlay/icons/VehicleIconView$LabelAnchor;", "", "radiuses", "Ljava/util/Map;", "Lru/yandex/taxi/masstransit/overlay/icons/c;", "Companion", "LabelDirection", "LabelAnchor", "s531", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VehicleIconView extends View {
    public static final int $stable = 8;
    public static final s531 Companion = new s531();
    private final int everFrontColor;
    private final Paint iconPaint;
    private final Paint labelBgPaint;
    private final Path labelBgPath;
    private final RectF labelBgRect;
    private final int labelPadding;
    private final Paint labelShadowPaint;
    private final Rect labelTextBounds;
    private final Paint labelTextPaint;
    private final float radius;
    private final Map<LabelAnchor, float[]> radiuses;
    private c state;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/masstransit/overlay/icons/VehicleIconView$LabelAnchor;", "", "TOP_LEFT", "TOP_RIGHT", "BOTTOM_LEFT", "BOTTOM_RIGHT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class LabelAnchor {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ LabelAnchor[] $VALUES;
        public static final LabelAnchor BOTTOM_LEFT;
        public static final LabelAnchor BOTTOM_RIGHT;
        public static final LabelAnchor TOP_LEFT;
        public static final LabelAnchor TOP_RIGHT;

        static {
            LabelAnchor labelAnchor = new LabelAnchor("TOP_LEFT", 0);
            TOP_LEFT = labelAnchor;
            LabelAnchor labelAnchor2 = new LabelAnchor("TOP_RIGHT", 1);
            TOP_RIGHT = labelAnchor2;
            LabelAnchor labelAnchor3 = new LabelAnchor("BOTTOM_LEFT", 2);
            BOTTOM_LEFT = labelAnchor3;
            LabelAnchor labelAnchor4 = new LabelAnchor("BOTTOM_RIGHT", 3);
            BOTTOM_RIGHT = labelAnchor4;
            LabelAnchor[] labelAnchorArr = {labelAnchor, labelAnchor2, labelAnchor3, labelAnchor4};
            $VALUES = labelAnchorArr;
            $ENTRIES = kotlin.enums.a.a(labelAnchorArr);
        }

        public static LabelAnchor valueOf(String str) {
            return (LabelAnchor) Enum.valueOf(LabelAnchor.class, str);
        }

        public static LabelAnchor[] values() {
            return (LabelAnchor[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/masstransit/overlay/icons/VehicleIconView$LabelDirection;", "", "UP", "DOWN", "LEFT", "RIGHT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class LabelDirection {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ LabelDirection[] $VALUES;
        public static final LabelDirection DOWN;
        public static final LabelDirection LEFT;
        public static final LabelDirection RIGHT;
        public static final LabelDirection UP;

        static {
            LabelDirection labelDirection = new LabelDirection("UP", 0);
            UP = labelDirection;
            LabelDirection labelDirection2 = new LabelDirection("DOWN", 1);
            DOWN = labelDirection2;
            LabelDirection labelDirection3 = new LabelDirection("LEFT", 2);
            LEFT = labelDirection3;
            LabelDirection labelDirection4 = new LabelDirection("RIGHT", 3);
            RIGHT = labelDirection4;
            LabelDirection[] labelDirectionArr = {labelDirection, labelDirection2, labelDirection3, labelDirection4};
            $VALUES = labelDirectionArr;
            $ENTRIES = kotlin.enums.a.a(labelDirectionArr);
        }

        public static LabelDirection valueOf(String str) {
            return (LabelDirection) Enum.valueOf(LabelDirection.class, str);
        }

        public static LabelDirection[] values() {
            return (LabelDirection[]) $VALUES.clone();
        }
    }

    private VehicleIconView(Context context) {
        super(context);
        int t = qje.t(xng0.everFront, getContext());
        this.everFrontColor = t;
        float w = tje.w(8, getContext());
        this.radius = w;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(t);
        this.labelBgPaint = paint;
        Paint f = unr0.f(true);
        f.setMaskFilter(new BlurMaskFilter(w, BlurMaskFilter.Blur.NORMAL));
        f.setColor(qje.t(xng0.effectShadowBottom, context));
        this.labelShadowPaint = f;
        Paint f2 = unr0.f(true);
        f2.setTextSize(tje.x(getContext(), 13.0f));
        int[] iArr = up11.a;
        f2.setTypeface(eja1.w(3, 0));
        f2.setTextAlign(Paint.Align.CENTER);
        this.labelTextPaint = f2;
        this.iconPaint = unr0.f(true);
        this.labelTextBounds = new Rect();
        this.labelPadding = tje.u(5, getContext());
        this.labelBgPath = new Path();
        this.labelBgRect = new RectF();
        this.radiuses = kotlin.collections.b.i(new Pair(LabelAnchor.TOP_LEFT, new float[]{0.0f, 0.0f, w, w, w, w, w, w}), new Pair(LabelAnchor.TOP_RIGHT, new float[]{w, w, 0.0f, 0.0f, w, w, w, w}), new Pair(LabelAnchor.BOTTOM_RIGHT, new float[]{w, w, w, w, 0.0f, 0.0f, w, w}), new Pair(LabelAnchor.BOTTOM_LEFT, new float[]{w, w, w, w, w, w, 0.0f, 0.0f}));
    }

    private final void drawLabel(Canvas canvas, String str, int i, int i2, LabelDirection labelDirection) {
        this.labelBgPaint.setColor(i);
        this.labelTextPaint.setColor(i2);
        drawLabelShadow(canvas, labelDirection);
        canvas.drawPath(this.labelBgPath, this.labelBgPaint);
        canvas.save();
        int i3 = d.a[labelDirection.ordinal()];
        if (i3 == 1) {
            canvas.translate((this.labelTextBounds.width() / 2.0f) + this.labelPadding, this.labelTextBounds.height() + this.labelPadding);
            canvas.drawText(str, 0.0f, 0.0f, this.labelTextPaint);
        } else if (i3 == 2) {
            canvas.translate((this.labelTextBounds.width() / 2.0f) + this.labelPadding, this.labelPadding);
            canvas.rotate(180.0f);
            canvas.drawText(str, 0.0f, 0.0f, this.labelTextPaint);
        } else if (i3 == 3) {
            canvas.translate(this.labelPadding + this.labelTextBounds.height(), (this.labelTextBounds.width() / 2.0f) + this.labelPadding);
            canvas.rotate(-90.0f);
            canvas.drawText(str, 0.0f, 0.0f, this.labelTextPaint);
        } else {
            if (i3 != 4) {
                w511.b();
                return;
            }
            int i4 = this.labelPadding;
            canvas.translate(i4, (this.labelTextBounds.width() / 2.0f) + i4);
            canvas.rotate(90.0f);
            canvas.drawText(str, 0.0f, 0.0f, this.labelTextPaint);
        }
        canvas.restore();
    }

    private final void drawLabelShadow(Canvas canvas, LabelDirection labelDirection) {
        float w;
        RectF rectF;
        RectF rectF2 = this.labelBgRect;
        int[] iArr = d.a;
        int i = iArr[labelDirection.ordinal()];
        if (i == 1 || i == 2) {
            w = tje.w(8, getContext());
        } else {
            if (i != 3 && i != 4) {
                w511.b();
                return;
            }
            w = tje.w(2, getContext());
        }
        int i2 = iArr[labelDirection.ordinal()];
        if (i2 == 1) {
            rectF = new RectF(0.0f, w, rectF2.width(), rectF2.height() + w);
        } else if (i2 == 2) {
            rectF = new RectF(0.0f, -w, rectF2.width(), rectF2.height() - w);
        } else if (i2 == 3) {
            rectF = new RectF(w, 0.0f, rectF2.width() + w, rectF2.height());
        } else {
            if (i2 != 4) {
                w511.b();
                return;
            }
            rectF = new RectF(-w, 0.0f, rectF2.width() - w, rectF2.height());
        }
        float f = this.radius;
        canvas.drawRoundRect(rectF, f, f, this.labelShadowPaint);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        VehicleIconView vehicleIconView;
        Canvas canvas2;
        c cVar = this.state;
        if (cVar == null) {
            return;
        }
        int i = cVar.b;
        boolean z = cVar.f;
        Bitmap bitmap = cVar.d;
        if (bitmap == null) {
            return;
        }
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        if (cVar.e || z) {
            canvas.save();
            canvas.translate(((bitmap.getWidth() / 2) + measuredWidth) - cVar.g, measuredHeight - (this.labelBgRect.height() / 2.0f));
            Pair pair = z ? new Pair(Integer.valueOf(this.everFrontColor), Integer.valueOf(i)) : new Pair(Integer.valueOf(i), Integer.valueOf(this.everFrontColor));
            vehicleIconView = this;
            canvas2 = canvas;
            vehicleIconView.drawLabel(canvas2, cVar.a, ((Number) pair.getSecond()).intValue(), ((Number) pair.getFirst()).intValue(), cVar.c);
            canvas2.restore();
        } else {
            vehicleIconView = this;
            canvas2 = canvas;
        }
        canvas2.save();
        canvas2.translate(measuredWidth - (bitmap.getWidth() / 2.0f), measuredHeight - (bitmap.getHeight() / 2.0f));
        canvas2.drawBitmap(bitmap, 0.0f, 0.0f, vehicleIconView.iconPaint);
        canvas2.restore();
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width;
        int i;
        int height;
        int i2;
        c cVar = this.state;
        Bitmap bitmap = cVar != null ? cVar.d : null;
        if (cVar != null) {
            LabelDirection labelDirection = cVar.c;
            if (bitmap != null) {
                int[] iArr = d.a;
                int i3 = iArr[labelDirection.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    width = this.labelTextBounds.width() + this.labelPadding;
                    i = this.labelPadding;
                } else if (i3 != 3 && i3 != 4) {
                    w511.b();
                    return;
                } else {
                    width = this.labelTextBounds.height() + this.labelPadding;
                    i = this.labelPadding;
                }
                int i4 = width + i;
                int width2 = ((bitmap.getWidth() + i4) + i4) - cVar.g;
                int i5 = iArr[labelDirection.ordinal()];
                if (i5 == 1 || i5 == 2) {
                    height = this.labelTextBounds.height() + this.labelPadding;
                    i2 = this.labelPadding;
                } else if (i5 != 3 && i5 != 4) {
                    w511.b();
                    return;
                } else {
                    height = this.labelTextBounds.width() + this.labelPadding;
                    i2 = this.labelPadding;
                }
                setMeasuredDimension(width2, Math.max(bitmap.getHeight(), height + i2));
                return;
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final void render(c state) {
        RectF rectF;
        float[] fArr;
        this.state = state;
        Paint paint = this.labelTextPaint;
        String str = state.a;
        paint.getTextBounds(str, 0, str.length(), this.labelTextBounds);
        int height = this.labelTextBounds.height() + this.labelPadding;
        int i = this.labelPadding;
        float f = height + i;
        float width = this.labelTextBounds.width() + i + this.labelPadding;
        LabelDirection labelDirection = state.c;
        int[] iArr = d.a;
        int i2 = iArr[labelDirection.ordinal()];
        if (i2 == 1 || i2 == 2) {
            rectF = new RectF(0.0f, 0.0f, width, f);
        } else {
            if (i2 != 3 && i2 != 4) {
                w511.b();
                return;
            }
            rectF = new RectF(0.0f, 0.0f, f, width);
        }
        int i3 = iArr[labelDirection.ordinal()];
        if (i3 == 1) {
            fArr = this.radiuses.get(LabelAnchor.TOP_LEFT);
        } else if (i3 == 2) {
            fArr = this.radiuses.get(LabelAnchor.BOTTOM_LEFT);
        } else if (i3 == 3) {
            fArr = this.radiuses.get(LabelAnchor.BOTTOM_LEFT);
        } else {
            if (i3 != 4) {
                w511.b();
                return;
            }
            fArr = this.radiuses.get(LabelAnchor.TOP_LEFT);
        }
        this.labelBgPath.reset();
        Path path = this.labelBgPath;
        if (fArr == null) {
            fArr = new float[0];
        }
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        this.labelBgRect.set(rectF);
        requestLayout();
    }

    public /* synthetic */ VehicleIconView(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }
}
