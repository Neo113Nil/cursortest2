package ru.yandex.taxi.eatskit.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.hj41;
import defpackage.qje;
import defpackage.xng0;
import defpackage.z3c0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001 B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lru/yandex/taxi/eatskit/widget/WebPlaceholder;", "Landroid/view/View;", "Lz3c0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "", RemoteBioParameters.Y, "Lzy11;", "drawItemListPlaceholder", "(Landroid/graphics/Canvas;F)V", "height", "drawItemPlaceholder", "(Landroid/graphics/Canvas;FF)V", "onDraw", "(Landroid/graphics/Canvas;)V", "applyTheme", "()V", "Landroid/graphics/Paint;", "tilePaint", "Landroid/graphics/Paint;", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/RectF;", "Companion", "hj41", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WebPlaceholder extends View implements z3c0 {
    public static final hj41 Companion = new hj41();
    private final RectF rect;
    private final Paint tilePaint;

    public WebPlaceholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.tilePaint = paint;
        this.rect = new RectF();
        paint.setColor(qje.t(xng0.bgMinor, getContext()));
    }

    private final void drawItemListPlaceholder(Canvas canvas, float y) {
        Companion.getClass();
        float a = hj41.a(200);
        drawItemPlaceholder(canvas, y, a);
        float a2 = hj41.a(8) + a + y;
        float a3 = hj41.a(72);
        for (int i = 0; i < 3; i++) {
            drawItemPlaceholder(canvas, a2, a3);
            Companion.getClass();
            a2 += hj41.a(8) + a3;
        }
    }

    private final void drawItemPlaceholder(Canvas canvas, float y, float height) {
        RectF rectF = this.rect;
        rectF.top = y;
        rectF.bottom = y + height;
        Companion.getClass();
        rectF.left = hj41.a(8);
        this.rect.right = getWidth() - hj41.a(8);
        canvas.drawRoundRect(this.rect, hj41.a(24), hj41.a(24), this.tilePaint);
    }

    @Override // defpackage.z3c0
    public void applyTheme() {
        this.tilePaint.setColor(qje.t(xng0.bgMinor, getContext()));
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Companion.getClass();
        drawItemListPlaceholder(canvas, hj41.a(76));
    }

    public WebPlaceholder(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public WebPlaceholder(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ WebPlaceholder(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
