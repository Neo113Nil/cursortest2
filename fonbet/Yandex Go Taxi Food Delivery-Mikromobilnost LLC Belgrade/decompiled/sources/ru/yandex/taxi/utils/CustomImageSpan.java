package ru.yandex.taxi.utils;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import defpackage.jl40;
import defpackage.vjf;
import defpackage.xjf;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0016\u0018\u0000 32\u00020\u0001:\u00024\tB;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ;\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018JW\u0010!\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010,R*\u0010\u0003\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00065"}, d2 = {"Lru/yandex/taxi/utils/CustomImageSpan;", "Landroid/text/style/ReplacementSpan;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "verticalAlignment", "", "updateFontMetrics", "drawAsTextColor", "Lxjf;", "compareInfo", "<init>", "(Landroid/graphics/drawable/Drawable;IZZLxjf;)V", "applyDrawableBounds", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;", "Landroid/graphics/Paint;", "paint", "", "text", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", "", RemoteBioParameters.X, "top", RemoteBioParameters.Y, "bottom", "Lzy11;", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", CA20Status.STATUS_USER_I, "getVerticalAlignment", "Z", "Lxjf;", "value", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "setDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Companion", "vjf", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public class CustomImageSpan extends ReplacementSpan {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    public static final vjf Companion = new vjf();
    private final xjf compareInfo;
    private final boolean drawAsTextColor;
    private Drawable drawable;
    private final boolean updateFontMetrics;
    private final int verticalAlignment;

    public /* synthetic */ CustomImageSpan(Drawable drawable, int i, boolean z, boolean z2, xjf xjfVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawable, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? null : xjfVar);
    }

    private final Drawable applyDrawableBounds(Drawable drawable) {
        Drawable mutate = drawable.mutate();
        if (mutate.getBounds().isEmpty()) {
            mutate.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        return mutate;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:3:0x0004, B:10:0x0028, B:12:0x002c, B:13:0x0035, B:18:0x001a, B:19:0x001d, B:20:0x0022, B:21:0x0026), top: B:2:0x0004 }] */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        int i;
        int i2;
        int save = canvas.save();
        try {
            int height = this.drawable.getBounds().height();
            int i3 = this.verticalAlignment;
            if (i3 != 0) {
                if (i3 == 1) {
                    i2 = (y - top) - height;
                } else if (i3 != 2) {
                    i2 = 0;
                } else {
                    i = (bottom - top) / 2;
                    height /= 2;
                }
                if (this.drawAsTextColor) {
                    this.drawable.setTint(paint.getColor());
                }
                canvas.translate(x, top + i2);
                this.drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
            i = bottom - top;
            i2 = i - height;
            if (this.drawAsTextColor) {
            }
            canvas.translate(x, top + i2);
            this.drawable.draw(canvas);
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!getClass().equals(other != null ? other.getClass() : null)) {
            return false;
        }
        xjf xjfVar = this.compareInfo;
        if (xjfVar == null) {
            return this == other;
        }
        CustomImageSpan customImageSpan = other instanceof CustomImageSpan ? (CustomImageSpan) other : null;
        return jl40.l(xjfVar, customImageSpan != null ? customImageSpan.compareInfo : null);
    }

    public final Drawable getDrawable() {
        return this.drawable;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
        Rect bounds = this.drawable.getBounds();
        if (fm != null) {
            paint.getFontMetricsInt(fm);
            if (this.updateFontMetrics) {
                int i = this.verticalAlignment;
                if (i == 0) {
                    fm.ascent = fm.descent - bounds.height();
                } else if (i == 1) {
                    fm.ascent = -bounds.height();
                } else if (i == 2) {
                    float f = (fm.ascent + fm.descent) / 2.0f;
                    fm.ascent = (int) (f - (bounds.height() / 2));
                    fm.descent = (int) (f + (bounds.height() / 2));
                }
                fm.top = fm.ascent;
                fm.bottom = fm.descent;
            }
        }
        return bounds.width();
    }

    public final int getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public int hashCode() {
        xjf xjfVar = this.compareInfo;
        return xjfVar != null ? xjfVar.hashCode() : super.hashCode();
    }

    public final void setDrawable(Drawable drawable) {
        this.drawable = applyDrawableBounds(drawable);
    }

    public CustomImageSpan(Drawable drawable, int i) {
        this(drawable, i, false, false, null, 28, null);
    }

    public CustomImageSpan(Drawable drawable, int i, boolean z) {
        this(drawable, i, z, false, null, 24, null);
    }

    public CustomImageSpan(Drawable drawable, int i, boolean z, boolean z2) {
        this(drawable, i, z, z2, null, 16, null);
    }

    public CustomImageSpan(Drawable drawable, int i, boolean z, boolean z2, xjf xjfVar) {
        this.verticalAlignment = i;
        this.updateFontMetrics = z;
        this.drawAsTextColor = z2;
        this.compareInfo = xjfVar;
        this.drawable = applyDrawableBounds(drawable);
    }

    public CustomImageSpan(Drawable drawable) {
        this(drawable, 0, false, false, null, 30, null);
    }
}
