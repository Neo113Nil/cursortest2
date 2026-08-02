package ru.yandex.taxi.widget;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;
import ru.CryptoPro.XAdES.XAdESParameters;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/widget/LetterSpacingSpan;", "Landroid/text/style/MetricAffectingSpan;", "", "letterSpacing", "<init>", "(F)V", "Landroid/text/TextPaint;", "paint", "Lzy11;", "apply", "(Landroid/text/TextPaint;)V", XAdESParameters.XML_SIGNATURE_PREFIX, "updateDrawState", "updateMeasureState", "F", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LetterSpacingSpan extends MetricAffectingSpan {
    public static final int $stable = 8;
    private final float letterSpacing;

    public LetterSpacingSpan(float f) {
        this.letterSpacing = f;
    }

    private final void apply(TextPaint paint) {
        paint.setLetterSpacing(this.letterSpacing);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds) {
        apply(ds);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint paint) {
        apply(paint);
    }
}
