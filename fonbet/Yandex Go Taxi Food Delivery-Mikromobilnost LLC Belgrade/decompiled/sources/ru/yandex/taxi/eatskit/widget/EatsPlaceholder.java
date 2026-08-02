package ru.yandex.taxi.eatskit.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.qje;
import defpackage.xng0;
import defpackage.yfn;
import defpackage.z3c0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001fB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lru/yandex/taxi/eatskit/widget/EatsPlaceholder;", "Landroid/view/View;", "Lz3c0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "Lzy11;", "drawCategoriesPlaceholder", "(Landroid/graphics/Canvas;)V", "", RemoteBioParameters.Y, "drawRestaurantsPlaceholder", "(Landroid/graphics/Canvas;F)V", "drawRestaurantPlaceholder", "onDraw", "applyTheme", "()V", "Landroid/graphics/Paint;", "tilePaint", "Landroid/graphics/Paint;", "Landroid/graphics/RectF;", "rect", "Landroid/graphics/RectF;", "Companion", "yfn", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EatsPlaceholder extends View implements z3c0 {
    public static final yfn Companion = new yfn();
    private final RectF rect;
    private final Paint tilePaint;

    public EatsPlaceholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.tilePaint = paint;
        this.rect = new RectF();
        paint.setColor(qje.t(xng0.bgMinor, getContext()));
    }

    private final void drawCategoriesPlaceholder(Canvas canvas) {
        float width = getWidth();
        Companion.getClass();
        int a = (int) ((width / yfn.a(80)) + 1.0f);
        float f = 0.0f;
        for (int i = 0; i < a; i++) {
            RectF rectF = this.rect;
            Companion.getClass();
            rectF.left = yfn.a(16) + f;
            this.rect.right = yfn.a(48) + yfn.a(16) + f;
            RectF rectF2 = this.rect;
            rectF2.top = 0.0f;
            rectF2.bottom = yfn.a(48);
            canvas.drawRoundRect(this.rect, yfn.a(16), yfn.a(16), this.tilePaint);
            this.rect.left = yfn.a(12) + f;
            this.rect.right = yfn.a(56) + yfn.a(12) + f;
            this.rect.top = yfn.a(60);
            this.rect.bottom = yfn.a(74);
            canvas.drawRoundRect(this.rect, yfn.a(4), yfn.a(4), this.tilePaint);
            f += yfn.a(80);
        }
    }

    private final void drawRestaurantPlaceholder(Canvas canvas, float y) {
        RectF rectF = this.rect;
        rectF.top = y;
        Companion.getClass();
        rectF.bottom = yfn.a(220) + y;
        this.rect.left = yfn.a(12);
        this.rect.right = getWidth() - yfn.a(12);
        canvas.drawRoundRect(this.rect, yfn.a(16), yfn.a(16), this.tilePaint);
        RectF rectF2 = this.rect;
        rectF2.top = yfn.a(14) + rectF2.bottom;
        RectF rectF3 = this.rect;
        rectF3.bottom = yfn.a(24) + rectF3.top;
        this.rect.left = yfn.a(24);
        RectF rectF4 = this.rect;
        rectF4.right = yfn.a(120) + rectF4.left;
        canvas.drawRoundRect(this.rect, yfn.a(4), yfn.a(4), this.tilePaint);
        RectF rectF5 = this.rect;
        rectF5.top = yfn.a(8) + rectF5.bottom;
        RectF rectF6 = this.rect;
        rectF6.bottom = yfn.a(14) + rectF6.top;
        this.rect.left = yfn.a(24);
        RectF rectF7 = this.rect;
        rectF7.right = yfn.a(76) + rectF7.left;
        canvas.drawRoundRect(this.rect, yfn.a(4), yfn.a(4), this.tilePaint);
    }

    private final void drawRestaurantsPlaceholder(Canvas canvas, float y) {
        Companion.getClass();
        float a = yfn.a(280);
        int height = (int) (((getHeight() - y) / yfn.a(280)) + 1.0f);
        if (height < 0) {
            return;
        }
        int i = 0;
        while (true) {
            drawRestaurantPlaceholder(canvas, y);
            Companion.getClass();
            y += yfn.a(28) + a;
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
        drawCategoriesPlaceholder(canvas);
        Companion.getClass();
        drawRestaurantsPlaceholder(canvas, yfn.a(108));
    }

    public EatsPlaceholder(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EatsPlaceholder(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ EatsPlaceholder(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
