package ru.yandex.taxi.design.span;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.style.LineHeightSpan;
import android.text.style.ReplacementSpan;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.gvu0;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.y6i0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BU\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J9\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJW\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$JA\u0010'\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010)H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00100R\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00100R\u0014\u00104\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/yandex/taxi/design/span/RoundedBackgroundSpan;", "Landroid/text/style/ReplacementSpan;", "Landroid/text/style/LineHeightSpan;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "textColor", "", "horizontalPadding", "verticalPadding", "radius", "", "strikeThroughText", "minWidth", "maxWidth", "<init>", "(IIFFFZFF)V", "", "text", "Landroid/graphics/Paint;", "paint", "ellipsizeText", "(Ljava/lang/CharSequence;Landroid/graphics/Paint;F)Ljava/lang/CharSequence;", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", RemoteBioParameters.X, "top", RemoteBioParameters.Y, "bottom", "Lzy11;", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "spanstartv", "lineHeight", "chooseHeight", "(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", CA20Status.STATUS_USER_I, "F", "Z", "getTextMaxWidth", "()F", "textMaxWidth", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RoundedBackgroundSpan extends ReplacementSpan implements LineHeightSpan {
    public static final int $stable = 8;
    private final int backgroundColor;
    private final float horizontalPadding;
    private final float maxWidth;
    private final float minWidth;
    private final float radius;
    private final boolean strikeThroughText;
    private final int textColor;
    private final float verticalPadding;

    public /* synthetic */ RoundedBackgroundSpan(int i, int i2, float f, float f2, float f3, boolean z, float f4, float f5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? 0.0f : f, (i3 & 8) != 0 ? 0.0f : f2, (i3 & 16) != 0 ? 0.0f : f3, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? 0.0f : f4, (i3 & 128) != 0 ? Float.MAX_VALUE : f5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final CharSequence ellipsizeText(CharSequence text, Paint paint, float maxWidth) {
        CharSequence o0 = evu0.o0(text);
        evu0.m0(o0);
        int length = o0.length();
        if (paint.measureText(o0, 0, o0.length()) <= maxWidth || o0.length() <= 3) {
            return o0;
        }
        String str = "";
        int i = 0;
        float f = 0.0f;
        while (i <= length) {
            boolean z = true;
            int i2 = (i + length) >>> 1;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(gvu0.s0(3, o0.subSequence(0, i2)));
            spannableStringBuilder.append((CharSequence) "...");
            float measureText = maxWidth - paint.measureText(spannableStringBuilder, 0, spannableStringBuilder.length());
            if (f != 0.0f && measureText >= f) {
                z = false;
            }
            if (measureText > 0.0f && z) {
                str = spannableStringBuilder;
                f = measureText;
            }
            if (measureText > 0.0f) {
                i = i2 + 1;
            } else {
                length = i2 - 1;
            }
        }
        return str;
    }

    private final float getTextMaxWidth() {
        return this.maxWidth - (this.horizontalPadding * 2.0f);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence text, int start, int end, int spanstartv, int lineHeight, Paint.FontMetricsInt fm) {
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        paint.setColor(this.backgroundColor);
        CharSequence ellipsizeText = ellipsizeText(text.subSequence(start, end), paint, getTextMaxWidth());
        float measureText = paint.measureText(ellipsizeText, 0, ellipsizeText.length());
        float f = y;
        float f2 = (paint.getFontMetrics().top + f) - this.verticalPadding;
        float f3 = paint.getFontMetrics().bottom + f + this.verticalPadding;
        float f4 = (this.horizontalPadding * 2.0f) + measureText;
        float f5 = this.minWidth;
        if (f4 < f5) {
            f4 = f5;
        }
        RectF rectF = new RectF(x, f2, x + f4, f3);
        float f6 = this.radius;
        canvas.drawRoundRect(rectF, f6, f6, paint);
        paint.setColor(this.textColor);
        paint.setStrikeThruText(this.strikeThroughText);
        paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(ellipsizeText, 0, ellipsizeText.length(), (f4 / 2.0f) + x, f, paint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!RoundedBackgroundSpan.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        RoundedBackgroundSpan roundedBackgroundSpan = (RoundedBackgroundSpan) other;
        return this.backgroundColor == roundedBackgroundSpan.backgroundColor && this.textColor == roundedBackgroundSpan.textColor && this.horizontalPadding == roundedBackgroundSpan.horizontalPadding && this.verticalPadding == roundedBackgroundSpan.verticalPadding && this.radius == roundedBackgroundSpan.radius && this.strikeThroughText == roundedBackgroundSpan.strikeThroughText && this.minWidth == roundedBackgroundSpan.minWidth && this.maxWidth == roundedBackgroundSpan.maxWidth;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
        CharSequence ellipsizeText = ellipsizeText(text.subSequence(start, end), paint, getTextMaxWidth());
        return (int) y6i0.c((this.horizontalPadding * 2.0f) + paint.measureText(ellipsizeText, 0, ellipsizeText.length()), this.minWidth, this.maxWidth);
    }

    public int hashCode() {
        return Float.hashCode(this.maxWidth) + g8e.c(this.minWidth, unr0.e(g8e.c(this.radius, g8e.c(this.verticalPadding, g8e.c(this.horizontalPadding, oyr.b(this.textColor, Integer.hashCode(this.backgroundColor) * 31, 31), 31), 31), 31), 31, this.strikeThroughText), 31);
    }

    public RoundedBackgroundSpan(int i, int i2, float f) {
        this(i, i2, f, 0.0f, 0.0f, false, 0.0f, 0.0f, 248, null);
    }

    public RoundedBackgroundSpan(int i, int i2, float f, float f2) {
        this(i, i2, f, f2, 0.0f, false, 0.0f, 0.0f, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC, null);
    }

    public RoundedBackgroundSpan(int i, int i2, float f, float f2, float f3) {
        this(i, i2, f, f2, f3, false, 0.0f, 0.0f, 224, null);
    }

    public RoundedBackgroundSpan(int i, int i2, float f, float f2, float f3, boolean z) {
        this(i, i2, f, f2, f3, z, 0.0f, 0.0f, 192, null);
    }

    public RoundedBackgroundSpan(int i, int i2, float f, float f2, float f3, boolean z, float f4) {
        this(i, i2, f, f2, f3, z, f4, 0.0f, 128, null);
    }

    public RoundedBackgroundSpan(int i, int i2, float f, float f2, float f3, boolean z, float f4, float f5) {
        this.backgroundColor = i;
        this.textColor = i2;
        this.horizontalPadding = f;
        this.verticalPadding = f2;
        this.radius = f3;
        this.strikeThroughText = z;
        this.minWidth = f4;
        this.maxWidth = f5;
    }

    public RoundedBackgroundSpan(int i, int i2) {
        this(i, i2, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 252, null);
    }
}
