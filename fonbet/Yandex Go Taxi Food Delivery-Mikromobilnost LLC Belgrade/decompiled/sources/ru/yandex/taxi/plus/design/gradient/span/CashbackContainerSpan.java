package ru.yandex.taxi.plus.design.gradient.span;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Spanned;
import android.text.style.ReplacementSpan;
import defpackage.i3y;
import defpackage.j73;
import defpackage.m39;
import defpackage.ufd;
import defpackage.v29;
import defpackage.we8;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.taxi.utils.CustomImageSpan;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J;\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00172\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u0018JW\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u000f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\b008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u00069"}, d2 = {"Lru/yandex/taxi/plus/design/gradient/span/CashbackContainerSpan;", "Landroid/text/style/ReplacementSpan;", "<init>", "()V", "Landroid/graphics/Paint;", "paint", "Landroid/text/Spanned;", "text", "", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Landroid/text/Spanned;IILandroid/graphics/Paint$FontMetricsInt;)I", "", "isEndedWithLineBreak", "(Landroid/text/Spanned;I)Z", "Landroid/graphics/Canvas;", "canvas", "getOrCreateIntermediateCanvas", "(Landroid/graphics/Canvas;)Landroid/graphics/Canvas;", "createIntermediateCanvas", "", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "", RemoteBioParameters.X, "top", RemoteBioParameters.Y, "bottom", "Lzy11;", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/graphics/Rect;", "rect", "Landroid/graphics/Rect;", "Lm39;", "drawDelegate$delegate", "Li3y;", "getDrawDelegate", "()Lm39;", "drawDelegate", "", "Lv29;", "sizes", "Ljava/util/Map;", "Landroid/graphics/Bitmap;", "intermediateBitmap", "Landroid/graphics/Bitmap;", "intermediateCanvas", "Landroid/graphics/Canvas;", "plus_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CashbackContainerSpan extends ReplacementSpan {
    private Bitmap intermediateBitmap;
    private Canvas intermediateCanvas;
    private final Rect rect = new Rect();

    /* renamed from: drawDelegate$delegate, reason: from kotlin metadata */
    private final i3y drawDelegate = a.a(new we8(14));
    private final Map<v29, Integer> sizes = new HashMap();

    private final Canvas createIntermediateCanvas(Canvas canvas) {
        Bitmap createBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap);
        this.intermediateBitmap = createBitmap;
        this.intermediateCanvas = canvas2;
        return canvas2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m39 drawDelegate_delegate$lambda$0() {
        return new ufd();
    }

    private final m39 getDrawDelegate() {
        return (m39) this.drawDelegate.getValue();
    }

    private final Canvas getOrCreateIntermediateCanvas(Canvas canvas) {
        Canvas canvas2 = this.intermediateCanvas;
        return canvas2 == null ? createIntermediateCanvas(canvas) : canvas2;
    }

    private final int getSize(Paint paint, Spanned text, int start, int end, Paint.FontMetricsInt fm) {
        CustomImageSpan customImageSpan = (CustomImageSpan) j73.D(text.getSpans(start, end, CustomImageSpan.class));
        if (customImageSpan != null) {
            return customImageSpan.getSize(paint, text, start, end, fm);
        }
        if (fm != null) {
            paint.getFontMetricsInt(fm);
        }
        return (int) Math.ceil(paint.measureText(text, start, end));
    }

    private final boolean isEndedWithLineBreak(Spanned text, int end) {
        return end > 0 && text.charAt(end - 1) == '\n';
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        float f;
        if (text instanceof Spanned) {
            Canvas orCreateIntermediateCanvas = getOrCreateIntermediateCanvas(canvas);
            Spanned spanned = (Spanned) text;
            CustomImageSpan customImageSpan = (CustomImageSpan) j73.D(spanned.getSpans(start, end, CustomImageSpan.class));
            if (customImageSpan != null) {
                customImageSpan.draw(orCreateIntermediateCanvas, text, start, end, x, top, y, bottom, paint);
                f = x;
                orCreateIntermediateCanvas = orCreateIntermediateCanvas;
            } else {
                f = x;
                orCreateIntermediateCanvas.drawText(text, start, end, f, y, paint);
            }
            Integer num = this.sizes.get(new v29(start, end));
            int intValue = num != null ? num.intValue() : 0;
            int spanStart = spanned.getSpanStart(this);
            Rect rect = this.rect;
            if (spanStart == start) {
                int i = (int) f;
                rect.left = i;
                rect.top = top;
                rect.right = i + intValue;
            } else {
                int i2 = (int) f;
                rect.left = Math.min(i2, rect.left);
                Rect rect2 = this.rect;
                rect2.right = Math.max(rect2.right, i2 + intValue);
            }
            Bitmap bitmap = this.intermediateBitmap;
            if (spanned.getSpanEnd(this) != end || bitmap == null) {
                return;
            }
            this.rect.bottom = bottom;
            getDrawDelegate().a(this.rect.width(), this.rect.height());
            m39 drawDelegate = getDrawDelegate();
            Rect rect3 = this.rect;
            drawDelegate.d(rect3.left, rect3.top);
            getDrawDelegate().c(orCreateIntermediateCanvas, this.rect);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return CashbackContainerSpan.class.equals(other != null ? other.getClass() : null);
    }

    public int hashCode() {
        return CashbackContainerSpan.class.hashCode();
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
        if (!(text instanceof Spanned)) {
            return 0;
        }
        Spanned spanned = (Spanned) text;
        if (isEndedWithLineBreak(spanned, end)) {
            end--;
        }
        int i = end;
        int size = getSize(paint, spanned, start, i, fm);
        this.sizes.put(new v29(start, i), Integer.valueOf(size));
        return size;
    }
}
