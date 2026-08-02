package ru.yandex.taxi.carplates.model.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.LineHeightSpan;
import android.text.style.ReplacementSpan;
import android.util.TypedValue;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.b64;
import defpackage.eja1;
import defpackage.hst;
import defpackage.jst;
import defpackage.krg0;
import defpackage.m78;
import defpackage.up11;
import defpackage.w68;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001>BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\"\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010!\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u001aH\u0002¢\u0006\u0004\b&\u0010'J/\u0010)\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0005H\u0002¢\u0006\u0004\b)\u0010*J=\u0010-\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010!\u001a\u00020\u00052\b\b\u0001\u0010(\u001a\u00020\u00052\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b-\u0010.JC\u00101\u001a\u00020%2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00052\b\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b1\u00102J[\u00107\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010!\u001a\u00020\u00052\b\b\u0001\u0010(\u001a\u00020\u00052\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u001aH\u0016¢\u0006\u0004\b7\u00108R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00109R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010:R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010:R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010;R\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010:R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010<R$\u0010?\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\b\u0012\u00060>R\u00020\u00000=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010;R\u0014\u0010D\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010;R\u0014\u0010E\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010:R\u0014\u00106\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010:R\u0014\u0010F\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010:R\u0014\u00104\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010:R\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006J"}, d2 = {"Lru/yandex/taxi/carplates/model/view/CarPlatesFormatterSpan;", "Landroid/text/style/ReplacementSpan;", "Landroid/text/style/LineHeightSpan;", "Landroid/content/Context;", "context", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "textColor", "", "maxTextSize", "", "", "Lw68;", "plateValueAndFormatMap", "startSpace", "", "enabledRectangle", "useShortPlate", "<init>", "(Landroid/content/Context;IIFLjava/util/Map;IZZ)V", "Landroid/graphics/Canvas;", "canvas", "carPlateWidth", "carPlateNumberIsTooLarge", "(Landroid/graphics/Canvas;F)Z", "group", "Landroid/graphics/Paint;", "getPaintByGroup", "(Ljava/lang/String;)Landroid/graphics/Paint;", "hasTopGravity", "(Ljava/lang/String;)Z", "", "text", "start", "getRectWidth", "(Ljava/lang/CharSequence;I)F", "paint", "Lzy11;", "initTextPaints", "(Landroid/graphics/Paint;)V", "end", "measureText", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;II)F", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetricsInt", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "spanstartv", "lineHeight", "chooseHeight", "(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V", RemoteBioParameters.X, "top", RemoteBioParameters.Y, "bottom", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "Landroid/content/Context;", CA20Status.STATUS_USER_I, "F", "Z", "", "Lm78;", "groupStyleWithPaintMap", "Ljava/util/Map;", "backgroundPaint", "Landroid/graphics/Paint;", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "horizontalPadding", "ascent", "descent", "Landroid/graphics/RectF;", "sizeRect", "Landroid/graphics/RectF;", "carplates"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CarPlatesFormatterSpan extends ReplacementSpan implements LineHeightSpan {
    private final int ascent;
    private final int backgroundColor;
    private final int bottom;
    private final Context context;
    private final float cornerRadius;
    private final int descent;
    private final boolean enabledRectangle;
    private final float horizontalPadding;
    private final float maxTextSize;
    private final int startSpace;
    private final int textColor;
    private final int top;
    private final Map<String, m78> groupStyleWithPaintMap = new LinkedHashMap();
    private final Paint backgroundPaint = new Paint();
    private final RectF sizeRect = new RectF();

    public CarPlatesFormatterSpan(Context context, int i, int i2, float f, Map<String, w68> map, int i3, boolean z, boolean z2) {
        this.context = context;
        this.backgroundColor = i;
        this.textColor = i2;
        this.maxTextSize = f;
        this.startSpace = i3;
        this.enabledRectangle = z;
        this.cornerRadius = context.getResources().getDimensionPixelOffset(krg0.car_number_corner_radius);
        this.horizontalPadding = context.getResources().getDimensionPixelOffset(krg0.car_number_padding);
        this.ascent = context.getResources().getDimensionPixelOffset(krg0.car_number_ascent);
        this.bottom = context.getResources().getDimensionPixelOffset(krg0.car_number_bottom);
        this.descent = context.getResources().getDimensionPixelOffset(krg0.car_number_descent);
        this.top = context.getResources().getDimensionPixelOffset(krg0.car_number_top);
        for (String str : map.keySet()) {
            w68 w68Var = map.get(str);
            if (!z2 || w68Var == null || !w68Var.d) {
                this.groupStyleWithPaintMap.put(str, new m78(this, new Paint(), w68Var == null ? w68.f : w68Var, w68Var != null && w68Var.e));
            }
        }
    }

    private final boolean carPlateNumberIsTooLarge(Canvas canvas, float carPlateWidth) {
        return carPlateWidth > ((float) canvas.getWidth());
    }

    private final Paint getPaintByGroup(String group) {
        m78 m78Var = this.groupStyleWithPaintMap.get(group);
        return m78Var != null ? m78Var.a : new Paint();
    }

    private final float getRectWidth(CharSequence text, int start) {
        float f = 0.0f;
        for (String str : this.groupStyleWithPaintMap.keySet()) {
            float measureText = measureText(getPaintByGroup(str), text, start, str.length() + start);
            if (measureText < 0.0f) {
                return -1.0f;
            }
            f += measureText;
            start += str.length();
        }
        return (this.horizontalPadding * 2.0f) + f;
    }

    private final boolean hasTopGravity(String group) {
        m78 m78Var = this.groupStyleWithPaintMap.get(group);
        if (m78Var != null) {
            return m78Var.c;
        }
        return false;
    }

    private final void initTextPaints(Paint paint) {
        for (m78 m78Var : this.groupStyleWithPaintMap.values()) {
            int i = this.textColor;
            Context context = this.context;
            Paint paint2 = m78Var.a;
            paint2.set(paint);
            paint2.setColor(i);
            int[] iArr = up11.a;
            paint2.setTypeface(eja1.w(3, 0));
            w68 w68Var = m78Var.b;
            float f = w68Var.c;
            float applyDimension = TypedValue.applyDimension(2, 10.0f, context.getResources().getDisplayMetrics());
            float applyDimension2 = TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
            if (applyDimension2 >= applyDimension) {
                applyDimension = Math.min(applyDimension2, m78Var.d.maxTextSize);
            }
            paint2.setTextSize(applyDimension);
            paint2.setFontFeatureSettings(w68Var.b);
            paint2.setLetterSpacing(w68Var.a);
        }
    }

    private final float measureText(Paint paint, CharSequence text, int start, int end) {
        if ((start | end | (end - start) | (text.length() - end)) >= 0) {
            return paint.measureText(text, start, end);
        }
        hst hstVar = jst.e;
        StringBuilder s = b64.s(text.length(), start, "Can't measure text with length=", " start=", " end=");
        s.append(end);
        hstVar.s(new IndexOutOfBoundsException(s.toString()));
        return -1.0f;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence text, int start, int end, int spanstartv, int lineHeight, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            fontMetricsInt.bottom = this.bottom;
            fontMetricsInt.descent = this.descent;
            fontMetricsInt.top = this.top;
            fontMetricsInt.ascent = this.ascent;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        Canvas canvas2 = canvas;
        initTextPaints(paint);
        float f = x == 0.0f ? x : x + this.startSpace;
        float f2 = top;
        float rectWidth = getRectWidth(text, start);
        if (rectWidth < 0.0f) {
            jst.e.s(new IllegalArgumentException("Wrong width for rect: " + rectWidth + " text: " + ((Object) text)));
            return;
        }
        if (carPlateNumberIsTooLarge(canvas2, rectWidth)) {
            jst.e.s(new IllegalArgumentException("Wrong value for car plate number: " + ((Object) text)));
            return;
        }
        float f3 = this.horizontalPadding + f;
        this.sizeRect.set(f, f2, rectWidth + f, bottom);
        this.backgroundPaint.setColor(this.backgroundColor);
        this.backgroundPaint.setStyle(Paint.Style.FILL);
        if (this.enabledRectangle) {
            RectF rectF = this.sizeRect;
            float f4 = this.cornerRadius;
            canvas2.drawRoundRect(rectF, f4, f4, this.backgroundPaint);
        }
        int i = start;
        float f5 = 0.0f;
        for (String str : this.groupStyleWithPaintMap.keySet()) {
            Paint paintByGroup = getPaintByGroup(str);
            float f6 = f3 + f5;
            canvas2.drawText(text, i, str.length() + i, f6, hasTopGravity(str) ? (paint.descent() / 2.0f) + ((top + bottom) / 2.0f) : y, paintByGroup);
            float measureText = measureText(paintByGroup, text, i, str.length() + i);
            f5 = measureText < 0.0f ? 0.0f : measureText;
            i += str.length();
            canvas2 = canvas;
            f3 = f6;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fontMetricsInt) {
        initTextPaints(paint);
        return ((int) getRectWidth(text.toString().toUpperCase(Locale.getDefault()), start)) + this.startSpace;
    }
}
