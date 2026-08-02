package ru.yandex.taxi.eatskit.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.ceb0;
import defpackage.qje;
import defpackage.xng0;
import defpackage.z3c0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0001\u001eB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lru/yandex/taxi/eatskit/widget/PharmacyPlaceholder;", "Landroid/view/View;", "Lz3c0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "", RemoteBioParameters.Y, "Lzy11;", "drawRestaurantsPlaceholder", "(Landroid/graphics/Canvas;F)V", "drawRestaurantPlaceholder", "onDraw", "(Landroid/graphics/Canvas;)V", "applyTheme", "()V", "Landroid/graphics/Paint;", "tilePaint", "Landroid/graphics/Paint;", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/RectF;", "Companion", "ceb0", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PharmacyPlaceholder extends View implements z3c0 {
    public static final ceb0 Companion = new ceb0();
    private final RectF rect;
    private final Paint tilePaint;

    public PharmacyPlaceholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.tilePaint = paint;
        this.rect = new RectF();
        paint.setColor(qje.t(xng0.bgMinor, getContext()));
    }

    private final void drawRestaurantPlaceholder(Canvas canvas, float y) {
        RectF rectF = this.rect;
        rectF.top = y;
        Companion.getClass();
        rectF.bottom = ceb0.a(220) + y;
        this.rect.left = ceb0.a(12);
        this.rect.right = getWidth() - ceb0.a(12);
        canvas.drawRoundRect(this.rect, ceb0.a(16), ceb0.a(16), this.tilePaint);
        RectF rectF2 = this.rect;
        rectF2.top = ceb0.a(14) + rectF2.bottom;
        RectF rectF3 = this.rect;
        rectF3.bottom = ceb0.a(24) + rectF3.top;
        this.rect.left = ceb0.a(24);
        RectF rectF4 = this.rect;
        rectF4.right = ceb0.a(120) + rectF4.left;
        canvas.drawRoundRect(this.rect, ceb0.a(4), ceb0.a(4), this.tilePaint);
        RectF rectF5 = this.rect;
        rectF5.top = ceb0.a(8) + rectF5.bottom;
        RectF rectF6 = this.rect;
        rectF6.bottom = ceb0.a(14) + rectF6.top;
        this.rect.left = ceb0.a(24);
        RectF rectF7 = this.rect;
        rectF7.right = ceb0.a(76) + rectF7.left;
        canvas.drawRoundRect(this.rect, ceb0.a(4), ceb0.a(4), this.tilePaint);
    }

    private final void drawRestaurantsPlaceholder(Canvas canvas, float y) {
        Companion.getClass();
        float a = ceb0.a(280);
        int height = (int) (((getHeight() - y) / ceb0.a(280)) + 1.0f);
        if (height < 0) {
            return;
        }
        int i = 0;
        while (true) {
            drawRestaurantPlaceholder(canvas, y);
            Companion.getClass();
            y += ceb0.a(28) + a;
            if (i == height) {
                return;
            } else {
                i++;
            }
        }
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
        drawRestaurantsPlaceholder(canvas, ceb0.a(108));
    }

    public PharmacyPlaceholder(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PharmacyPlaceholder(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ PharmacyPlaceholder(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
