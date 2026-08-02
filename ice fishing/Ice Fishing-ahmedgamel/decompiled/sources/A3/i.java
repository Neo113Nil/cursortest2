package A3;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f160a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f161b;

    /* renamed from: c, reason: collision with root package name */
    public final int f162c;

    /* renamed from: d, reason: collision with root package name */
    public int f163d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f168j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f164e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f165f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f166g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public int f167h = 1;
    public boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f169k = null;

    public i(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f160a = charSequence;
        this.f161b = textPaint;
        this.f162c = i;
        this.f163d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f160a == null) {
            this.f160a = "";
        }
        int max = Math.max(0, this.f162c);
        CharSequence charSequence = this.f160a;
        int i = this.f165f;
        TextPaint textPaint = this.f161b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f169k);
        }
        int min = Math.min(charSequence.length(), this.f163d);
        this.f163d = min;
        if (this.f168j && this.f165f == 1) {
            this.f164e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f164e);
        obtain.setIncludePad(this.i);
        obtain.setTextDirection(this.f168j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f169k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f165f);
        float f2 = this.f166g;
        if (f2 != 1.0f) {
            obtain.setLineSpacing(0.0f, f2);
        }
        if (this.f165f > 1) {
            obtain.setHyphenationFrequency(this.f167h);
        }
        return obtain.build();
    }
}
