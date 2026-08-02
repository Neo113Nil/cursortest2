package ru.yandex.taxi.design.span;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.style.LineHeightSpan;
import android.text.style.ReplacementSpan;
import com.yandex.div.internal.widget.EllipsizedTextView;
import com.yandex.div.state.db.StateEntry;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.evu0;
import defpackage.y6i0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B_\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u00162\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010#J9\u0010&\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'JW\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b-\u0010.JA\u00101\u001a\u00020,2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b1\u00102R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00103R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00104R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00104R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00104R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00105R\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00104R\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00104R\u0014\u00106\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R$\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010?¨\u0006C"}, d2 = {"Lru/yandex/taxi/design/span/SlantedRoundedBackgroundSpan;", "Landroid/text/style/ReplacementSpan;", "Landroid/text/style/LineHeightSpan;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "textColor", "", "horizontalPadding", "verticalPadding", "radius", "slantAngle", "", "strikeThroughText", "minWidth", "maxWidth", "<init>", "(IIFFFFZFF)V", "measuredWidth", "Landroid/graphics/Paint;", "paint", RemoteBioParameters.Y, RemoteBioParameters.X, "Lkotlin/Pair;", "Landroid/graphics/Path;", "createPath", "(FLandroid/graphics/Paint;IF)Lkotlin/Pair;", "", "text", "start", "end", "ellipsizeText", "(Ljava/lang/CharSequence;IILandroid/graphics/Paint;F)Ljava/lang/CharSequence;", "angleDegrees", "height", "calculateSlantWidthFromAngle", "(FF)F", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", "top", "bottom", "Lzy11;", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "spanstartv", "lineHeight", "chooseHeight", "(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V", CA20Status.STATUS_USER_I, "F", "Z", "bgPaint", "Landroid/graphics/Paint;", "textPaint", "Ljava/lang/Integer;", "ellipsizedText", "Ljava/lang/CharSequence;", StateEntry.COLUMN_PATH, "Lkotlin/Pair;", "getTextMaxWidth", "()F", "textMaxWidth", "getAdditionalWidth", "additionalWidth", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SlantedRoundedBackgroundSpan extends ReplacementSpan implements LineHeightSpan {
    public static final int $stable = 8;
    private final int backgroundColor;
    private final Paint bgPaint;
    private CharSequence ellipsizedText;
    private final float horizontalPadding;
    private final float maxWidth;
    private Integer measuredWidth;
    private final float minWidth;
    private Pair<? extends Path, Float> path;
    private final float radius;
    private final float slantAngle;
    private final boolean strikeThroughText;
    private final int textColor;
    private Paint textPaint;
    private final float verticalPadding;

    public SlantedRoundedBackgroundSpan(int i, int i2, float f, float f2, float f3, float f4, boolean z, float f5, float f6) {
        this.backgroundColor = i;
        this.textColor = i2;
        this.horizontalPadding = f;
        this.verticalPadding = f2;
        this.radius = f3;
        this.slantAngle = f4;
        this.strikeThroughText = z;
        this.minWidth = f5;
        this.maxWidth = f6;
        Paint paint = new Paint(1);
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        paint.setPathEffect(new CornerPathEffect(f3));
        this.bgPaint = paint;
    }

    private final float calculateSlantWidthFromAngle(float angleDegrees, float height) {
        if (angleDegrees <= 0.0f) {
            return 0.0f;
        }
        return (float) (Math.tan(Math.toRadians(angleDegrees)) * height);
    }

    public static /* synthetic */ float calculateSlantWidthFromAngle$default(SlantedRoundedBackgroundSpan slantedRoundedBackgroundSpan, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 20.0f;
        }
        return slantedRoundedBackgroundSpan.calculateSlantWidthFromAngle(f, f2);
    }

    private final Pair<Path, Float> createPath(float measuredWidth, Paint paint, int y, float x) {
        float f = y;
        float f2 = (paint.getFontMetrics().top + f) - this.verticalPadding;
        float f3 = f + paint.getFontMetrics().bottom + this.verticalPadding;
        float calculateSlantWidthFromAngle = calculateSlantWidthFromAngle(f3 - f2, this.slantAngle);
        float f4 = (2.0f * calculateSlantWidthFromAngle) + (this.horizontalPadding * 2.0f) + measuredWidth;
        float f5 = this.minWidth;
        if (f4 < f5) {
            f4 = f5;
        }
        float f6 = x + f4;
        Path path = new Path();
        path.moveTo(x + calculateSlantWidthFromAngle, f2);
        path.lineTo(f6, f2);
        path.lineTo(f6 - calculateSlantWidthFromAngle, f3);
        path.lineTo(x, f3);
        path.close();
        return new Pair<>(path, Float.valueOf(f4));
    }

    private final CharSequence ellipsizeText(CharSequence text, int start, int end, Paint paint, float maxWidth) {
        CharSequence k0 = evu0.k0(text.subSequence(start, end));
        if (paint.measureText(k0, 0, k0.length()) <= maxWidth) {
            return k0;
        }
        int length = k0.length();
        while (length > 0) {
            if (paint.measureText(EllipsizedTextView.DEFAULT_ELLIPSIS) + paint.measureText(k0, 0, length) <= maxWidth) {
                break;
            }
            length--;
        }
        return ((Object) k0.subSequence(0, length)) + EllipsizedTextView.DEFAULT_ELLIPSIS;
    }

    private final float getAdditionalWidth() {
        return this.horizontalPadding * 2.0f;
    }

    private final float getTextMaxWidth() {
        return this.maxWidth - (this.horizontalPadding * 2.0f);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence text, int start, int end, int spanstartv, int lineHeight, Paint.FontMetricsInt fm) {
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        Paint paint2 = this.textPaint;
        if (paint2 == null) {
            paint2 = new Paint(paint);
            paint2.setAntiAlias(true);
            paint2.setColor(this.textColor);
            paint2.setStrikeThruText(this.strikeThroughText);
            paint2.setTextAlign(Paint.Align.CENTER);
            this.textPaint = paint2;
        }
        Paint paint3 = paint2;
        CharSequence charSequence = this.ellipsizedText;
        if (charSequence == null) {
            charSequence = ellipsizeText(text, start, end, paint, getTextMaxWidth());
            this.ellipsizedText = charSequence;
        }
        CharSequence charSequence2 = charSequence;
        float measureText = paint.measureText(charSequence2, 0, charSequence2.length());
        Pair pair = this.path;
        if (pair == null) {
            pair = createPath(measureText, paint3, y, x);
            this.path = pair;
        }
        Path path = (Path) pair.getFirst();
        float floatValue = ((Number) pair.getSecond()).floatValue();
        canvas.drawPath(path, this.bgPaint);
        canvas.drawText(charSequence2, 0, charSequence2.length(), (floatValue / 2.0f) + x, y, paint3);
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
        SlantedRoundedBackgroundSpan slantedRoundedBackgroundSpan;
        Paint paint2;
        Integer num = this.measuredWidth;
        if (num != null) {
            return num.intValue();
        }
        CharSequence charSequence = this.ellipsizedText;
        if (charSequence == null) {
            slantedRoundedBackgroundSpan = this;
            paint2 = paint;
            charSequence = slantedRoundedBackgroundSpan.ellipsizeText(text, start, end, paint2, getTextMaxWidth());
        } else {
            slantedRoundedBackgroundSpan = this;
            paint2 = paint;
        }
        int c = (int) y6i0.c((slantedRoundedBackgroundSpan.calculateSlantWidthFromAngle((paint2.getFontMetrics().bottom + slantedRoundedBackgroundSpan.verticalPadding) - (paint2.getFontMetrics().top - slantedRoundedBackgroundSpan.verticalPadding), slantedRoundedBackgroundSpan.slantAngle) * 2.0f) + paint2.measureText(charSequence, 0, charSequence.length()) + slantedRoundedBackgroundSpan.getAdditionalWidth(), slantedRoundedBackgroundSpan.minWidth, slantedRoundedBackgroundSpan.maxWidth);
        slantedRoundedBackgroundSpan.measuredWidth = Integer.valueOf(c);
        return c;
    }

    public SlantedRoundedBackgroundSpan(int i, int i2, float f) {
        this(i, i2, f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 504, null);
    }

    public SlantedRoundedBackgroundSpan(int i, int i2, float f, float f2) {
        this(i, i2, f, f2, 0.0f, 0.0f, false, 0.0f, 0.0f, 496, null);
    }

    public SlantedRoundedBackgroundSpan(int i, int i2, float f, float f2, float f3) {
        this(i, i2, f, f2, f3, 0.0f, false, 0.0f, 0.0f, 480, null);
    }

    public SlantedRoundedBackgroundSpan(int i, int i2, float f, float f2, float f3, float f4) {
        this(i, i2, f, f2, f3, f4, false, 0.0f, 0.0f, 448, null);
    }

    public SlantedRoundedBackgroundSpan(int i, int i2, float f, float f2, float f3, float f4, boolean z) {
        this(i, i2, f, f2, f3, f4, z, 0.0f, 0.0f, 384, null);
    }

    public SlantedRoundedBackgroundSpan(int i, int i2, float f, float f2, float f3, float f4, boolean z, float f5) {
        this(i, i2, f, f2, f3, f4, z, f5, 0.0f, 256, null);
    }

    public SlantedRoundedBackgroundSpan(int i, int i2) {
        this(i, i2, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, 508, null);
    }

    public /* synthetic */ SlantedRoundedBackgroundSpan(int i, int i2, float f, float f2, float f3, float f4, boolean z, float f5, float f6, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? 0.0f : f, (i3 & 8) != 0 ? 0.0f : f2, (i3 & 16) != 0 ? 0.0f : f3, (i3 & 32) != 0 ? 0.0f : f4, (i3 & 64) != 0 ? false : z, (i3 & 128) != 0 ? 0.0f : f5, (i3 & 256) != 0 ? Float.MAX_VALUE : f6);
    }
}
