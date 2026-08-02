package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.recyclerview.widget.RecyclerView;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class LineHeightStyleSpan implements android.text.style.LineHeightSpan {
    public final int endIndex;
    public int firstAscentDiff;
    public int lastDescentDiff;
    public final float lineHeight;
    public final int mode;
    public final float topRatio;
    public final boolean trimFirstLineTop;
    public final boolean trimLastLineBottom;
    public int firstAscent = PKIFailureInfo.systemUnavail;
    public int ascent = PKIFailureInfo.systemUnavail;
    public int descent = PKIFailureInfo.systemUnavail;
    public int lastDescent = PKIFailureInfo.systemUnavail;

    public LineHeightStyleSpan(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.lineHeight = f;
        this.endIndex = i;
        this.trimFirstLineTop = z;
        this.trimLastLineBottom = z2;
        this.topRatio = f2;
        this.mode = i2;
        if ((RecyclerView.DECELERATION_RATE > f2 || f2 > 1.0f) && f2 != -1.0f) {
            InlineClassHelperKt.throwIllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.endIndex;
        int i7 = this.mode;
        boolean z3 = this.trimLastLineBottom;
        boolean z4 = this.trimFirstLineTop;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.firstAscent == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int ceil = (int) Math.ceil(this.lineHeight);
            int i9 = ceil - i8;
            if (i7 != 1 || i9 > 0) {
                float f = this.topRatio;
                if (f == -1.0f) {
                    f = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int ceil2 = (int) (i9 <= 0 ? Math.ceil(i9 * f) : Math.ceil((1.0f - f) * i9));
                int i10 = fontMetricsInt.descent;
                int i11 = ceil2 + i10;
                this.descent = i11;
                int i12 = i11 - ceil;
                this.ascent = i12;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i12 = fontMetricsInt.ascent;
                    }
                    this.firstAscent = i12;
                    if (z3) {
                        i11 = i10;
                    }
                    this.lastDescent = i11;
                    this.firstAscentDiff = fontMetricsInt.ascent - i12;
                    this.lastDescentDiff = i11 - i10;
                } else if (i7 == 2) {
                    int i13 = fontMetricsInt.ascent;
                    this.firstAscent = z4 ? Math.max(i13, i12) : Math.min(i13, i12);
                    int i14 = fontMetricsInt.descent;
                    int i15 = this.descent;
                    this.lastDescent = z3 ? Math.min(i14, i15) : Math.max(i14, i15);
                    this.firstAscentDiff = 0;
                    this.lastDescentDiff = 0;
                }
            } else {
                int i16 = fontMetricsInt.ascent;
                this.ascent = i16;
                int i17 = fontMetricsInt.descent;
                this.descent = i17;
                this.firstAscent = i16;
                this.lastDescent = i17;
                this.firstAscentDiff = 0;
                this.lastDescentDiff = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.firstAscent : this.ascent;
        fontMetricsInt.descent = z2 ? this.lastDescent : this.descent;
    }
}
