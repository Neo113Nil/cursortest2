package kotlin.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class CatchingFishDaggerRealm extends ReplacementSpan {
    public final CatchingFishFirebaseFABGson CatchingFishDaggerWebsocket;
    public TextPaint CatchingFishViewModelFAB;
    public final Paint.FontMetricsInt CatchingFishReduxKtor = new Paint.FontMetricsInt();
    public short CatchingFishWorkManager = -1;
    public float CatchingFishViewModelScope = 1.0f;

    public CatchingFishDaggerRealm(CatchingFishFirebaseFABGson catchingFishFirebaseFABGson) {
        CatchingFishHiltMVPToast.CatchingFishWorkManager(catchingFishFirebaseFABGson, "rasterizer cannot be null");
        this.CatchingFishDaggerWebsocket = catchingFishFirebaseFABGson;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.CatchingFishViewModelFAB;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.CatchingFishViewModelFAB = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                }
            }
            if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.CatchingFishWorkManager, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        CatchingFishMVPOkHttpMVP.CatchingFishParcelableFAB().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        CatchingFishFirebaseFABGson catchingFishFirebaseFABGson = this.CatchingFishDaggerWebsocket;
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = catchingFishFirebaseFABGson.CatchingFishSnackbar;
        Typeface typeface = (Typeface) catchingFishFluxFluxBundle.CatchingFishViewModelScope;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket, catchingFishFirebaseFABGson.CatchingFishParcelableFAB * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.CatchingFishReduxKtor;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        CatchingFishFirebaseFABGson catchingFishFirebaseFABGson = this.CatchingFishDaggerWebsocket;
        this.CatchingFishViewModelScope = abs / (catchingFishFirebaseFABGson.CatchingFishSnackbar().CatchingFishParcelableFAB(14) != 0 ? ((ByteBuffer) r8.CatchingFishViewModelScope).getShort(r1 + r8.CatchingFishReduxKtor) : (short) 0);
        CatchingFishManifestGson CatchingFishSnackbar = catchingFishFirebaseFABGson.CatchingFishSnackbar();
        int CatchingFishParcelableFAB = CatchingFishSnackbar.CatchingFishParcelableFAB(14);
        if (CatchingFishParcelableFAB != 0) {
            ((ByteBuffer) CatchingFishSnackbar.CatchingFishViewModelScope).getShort(CatchingFishParcelableFAB + CatchingFishSnackbar.CatchingFishReduxKtor);
        }
        short s = (short) ((catchingFishFirebaseFABGson.CatchingFishSnackbar().CatchingFishParcelableFAB(12) != 0 ? ((ByteBuffer) r5.CatchingFishViewModelScope).getShort(r7 + r5.CatchingFishReduxKtor) : (short) 0) * this.CatchingFishViewModelScope);
        this.CatchingFishWorkManager = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
