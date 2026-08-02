package ru.yandex.taxi.masstransit.overlay.icons;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import defpackage.tje;
import defpackage.v4m;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001cR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'¨\u0006+"}, d2 = {"Lru/yandex/taxi/masstransit/overlay/icons/DotIconView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "size", "Lzy11;", "setSize", "(F)V", "", "color", "setColor", "(I)V", "", "selected", "setSelected", "(Z)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "shadowRadius", CA20Status.STATUS_USER_I, "innerSizeDiff", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/RectF;", "accentColor", "Z", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "innerPaint", "F", "innerSize", "Companion", "v4m", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DotIconView extends View {
    public static final int $stable = 8;
    public static final v4m Companion = new v4m();
    public static final int DEFAULT_SIZE = 8;
    private static final int SHADOW_COLOR = 639705119;
    private int accentColor;
    private final Paint innerPaint;
    private float innerSize;
    private final int innerSizeDiff;
    private final Paint paint;
    private final RectF rect;
    private boolean selected;
    private int shadowRadius;
    private float size;

    public DotIconView(Context context) {
        super(context);
        this.shadowRadius = tje.u(4, getContext());
        this.innerSizeDiff = tje.u(2, getContext());
        this.rect = new RectF();
        this.paint = new Paint();
        this.innerPaint = new Paint();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.drawCircle(this.rect.centerX(), this.rect.centerY(), this.size / 2.0f, this.paint);
        canvas.drawCircle(this.rect.centerX(), this.rect.centerY(), this.innerSize / 2.0f, this.innerPaint);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        RectF rectF = this.rect;
        float f = this.size;
        rectF.set(0.0f, 0.0f, f, f);
        setMeasuredDimension((int) this.rect.width(), (int) this.rect.height());
    }

    public final void setColor(int color) {
        this.accentColor = color;
        Paint paint = this.paint;
        int i = this.shadowRadius;
        paint.setShadowLayer(i, 0.0f, i / 2.0f, SHADOW_COLOR);
        this.paint.setColor(-1);
        this.paint.setAntiAlias(true);
        this.innerPaint.setColor(color);
        this.innerPaint.setAntiAlias(true);
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public final void setSize(float size) {
        this.size = size;
        this.innerSize = size - this.innerSizeDiff;
    }
}
