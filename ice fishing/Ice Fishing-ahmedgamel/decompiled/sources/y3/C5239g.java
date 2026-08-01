package y3;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: y3.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5239g {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f41909a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f41910b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41911c;

    /* renamed from: d, reason: collision with root package name */
    public int f41912d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f41917j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f41913e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f41914f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f41915g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public int f41916h = 1;
    public boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f41918k = null;

    public C5239g(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f41909a = charSequence;
        this.f41910b = textPaint;
        this.f41911c = i;
        this.f41912d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f41909a == null) {
            this.f41909a = "";
        }
        int max = Math.max(0, this.f41911c);
        CharSequence charSequence = this.f41909a;
        int i = this.f41914f;
        TextPaint textPaint = this.f41910b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f41918k);
        }
        int min = Math.min(charSequence.length(), this.f41912d);
        this.f41912d = min;
        if (this.f41917j && this.f41914f == 1) {
            this.f41913e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f41913e);
        obtain.setIncludePad(this.i);
        obtain.setTextDirection(this.f41917j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f41918k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f41914f);
        float f3 = this.f41915g;
        if (f3 != 1.0f) {
            obtain.setLineSpacing(0.0f, f3);
        }
        if (this.f41914f > 1) {
            obtain.setHyphenationFrequency(this.f41916h);
        }
        return obtain.build();
    }
}
