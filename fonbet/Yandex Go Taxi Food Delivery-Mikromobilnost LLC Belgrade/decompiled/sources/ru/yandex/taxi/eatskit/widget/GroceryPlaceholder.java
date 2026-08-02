package ru.yandex.taxi.eatskit.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.n;
import defpackage.qje;
import defpackage.t1u;
import defpackage.xng0;
import defpackage.z3c0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001'B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001c\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Lru/yandex/taxi/eatskit/widget/GroceryPlaceholder;", "Landroid/view/View;", "Lz3c0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Canvas;", "canvas", "", RemoteBioParameters.Y, "itemCount", "drawHeaders", "(Landroid/graphics/Canvas;FI)F", "itemWidth", RemoteBioParameters.X, "Lzy11;", "drawHeaderItem", "(Landroid/graphics/Canvas;FFF)V", "drawInputPlaceholder", "(Landroid/graphics/Canvas;F)F", "onDraw", "(Landroid/graphics/Canvas;)V", "columnCount", "drawTilesGrid", "(Landroid/graphics/Canvas;FI)V", "applyTheme", "()V", "Landroid/graphics/Paint;", "tilePaint", "Landroid/graphics/Paint;", "Landroid/graphics/RectF;", "tmpRect", "Landroid/graphics/RectF;", "Companion", "t1u", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GroceryPlaceholder extends View implements z3c0 {
    public static final t1u Companion = new t1u();
    public static final int NUMBER_OF_CATEGORIES_IN_ROW = 2;
    private final Paint tilePaint;
    private final RectF tmpRect;

    public GroceryPlaceholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        this.tilePaint = paint;
        this.tmpRect = new RectF();
        paint.setColor(qje.t(xng0.bgMinor, getContext()));
    }

    private final void drawHeaderItem(Canvas canvas, float itemWidth, float x, float y) {
        RectF rectF = this.tmpRect;
        rectF.left = x;
        rectF.top = y;
        rectF.right = (itemWidth / 2.0f) + x;
        Companion.getClass();
        rectF.bottom = t1u.a(12) + y;
        canvas.drawRoundRect(this.tmpRect, t1u.a(12), t1u.a(12), this.tilePaint);
        float a = t1u.a(8) + t1u.a(12) + y;
        RectF rectF2 = this.tmpRect;
        rectF2.left = x;
        rectF2.top = a;
        rectF2.right = x + itemWidth;
        rectF2.bottom = t1u.a(16) + a;
        canvas.drawRoundRect(this.tmpRect, t1u.a(12), t1u.a(12), this.tilePaint);
    }

    private final float drawHeaders(Canvas canvas, float y, int itemCount) {
        float width = getWidth();
        Companion.getClass();
        float a = ((width - (t1u.a(16) * itemCount)) - 1.0f) / 3.0f;
        float f = 0.0f;
        for (int i = 0; i < itemCount; i++) {
            drawHeaderItem(canvas, a, f, y);
            Companion.getClass();
            f += t1u.a(16) + a;
        }
        Companion.getClass();
        return t1u.a(36) + y;
    }

    private final float drawInputPlaceholder(Canvas canvas, float y) {
        RectF rectF = this.tmpRect;
        rectF.top = y;
        Companion.getClass();
        rectF.bottom = t1u.a(48) + y;
        RectF rectF2 = this.tmpRect;
        rectF2.left = 0.0f;
        rectF2.right = getWidth();
        canvas.drawRoundRect(this.tmpRect, t1u.a(12), t1u.a(12), this.tilePaint);
        return this.tmpRect.bottom;
    }

    @Override // defpackage.z3c0
    public void applyTheme() {
        this.tilePaint.setColor(qje.t(xng0.bgMinor, getContext()));
        invalidate();
    }

    public final void drawTilesGrid(Canvas canvas, float y, int columnCount) {
        int height = getHeight();
        float width = getWidth();
        Companion.getClass();
        float a = (width - (t1u.a(8) * (columnCount - 1))) / columnCount;
        int a2 = (int) n.a(height, y, a, 1.0f);
        for (int i = 0; i < a2; i++) {
            float f = 0.0f;
            for (int i2 = 0; i2 < columnCount; i2++) {
                RectF rectF = this.tmpRect;
                rectF.top = y;
                rectF.left = f;
                rectF.bottom = y + a;
                rectF.right = f + a;
                Companion.getClass();
                canvas.drawRoundRect(rectF, t1u.a(12), t1u.a(12), this.tilePaint);
                f += t1u.a(8) + a;
            }
            Companion.getClass();
            y += t1u.a(8) + a;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float drawHeaders = drawHeaders(canvas, 0.0f, 3);
        Companion.getClass();
        drawTilesGrid(canvas, t1u.a(20) + drawInputPlaceholder(canvas, t1u.a(28) + drawHeaders), 2);
    }

    public GroceryPlaceholder(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public GroceryPlaceholder(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ GroceryPlaceholder(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
