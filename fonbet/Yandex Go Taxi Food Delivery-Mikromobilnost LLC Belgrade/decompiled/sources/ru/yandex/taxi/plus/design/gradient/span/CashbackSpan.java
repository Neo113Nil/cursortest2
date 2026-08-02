package ru.yandex.taxi.plus.design.gradient.span;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;
import defpackage.i3y;
import defpackage.m39;
import defpackage.ufd;
import defpackage.we8;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJW\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/yandex/taxi/plus/design/gradient/span/CashbackSpan;", "Landroid/text/style/ReplacementSpan;", "<init>", "()V", "Landroid/graphics/Paint;", "paint", "", "text", "", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", "", RemoteBioParameters.X, "top", RemoteBioParameters.Y, "bottom", "Lzy11;", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/graphics/Rect;", "rect", "Landroid/graphics/Rect;", "Lm39;", "drawDelegate$delegate", "Li3y;", "getDrawDelegate", "()Lm39;", "drawDelegate", "plus_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CashbackSpan extends ReplacementSpan {
    private final Rect rect = new Rect();

    /* renamed from: drawDelegate$delegate, reason: from kotlin metadata */
    private final i3y drawDelegate = a.a(new we8(17));

    /* JADX INFO: Access modifiers changed from: private */
    public static final m39 drawDelegate_delegate$lambda$0() {
        return new ufd();
    }

    private final m39 getDrawDelegate() {
        return (m39) this.drawDelegate.getValue();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        int i;
        Paint paint2;
        if (this.rect.isEmpty()) {
            i = end;
            paint2 = paint;
            paint2.getTextBounds(text.toString(), start, i, this.rect);
            Rect rect = this.rect;
            getDrawDelegate().a(rect.width() + rect.left, this.rect.height() - this.rect.bottom);
        } else {
            i = end;
            paint2 = paint;
        }
        getDrawDelegate().b(canvas, text, start, i, x, y, this.rect.top + y, paint2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return CashbackSpan.class.equals(other != null ? other.getClass() : null);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
        if (fm != null) {
            paint.getFontMetricsInt(fm);
        }
        return (int) Math.ceil(paint.measureText(text, start, end));
    }

    public int hashCode() {
        return CashbackSpan.class.hashCode();
    }
}
