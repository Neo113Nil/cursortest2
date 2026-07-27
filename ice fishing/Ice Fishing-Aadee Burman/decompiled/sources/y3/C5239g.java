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
    public CharSequence f41906a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f41907b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41908c;

    /* renamed from: d, reason: collision with root package name */
    public int f41909d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f41914j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f41910e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f41911f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f41912g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public int f41913h = 1;
    public boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f41915k = null;

    public C5239g(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f41906a = charSequence;
        this.f41907b = textPaint;
        this.f41908c = i;
        this.f41909d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f41906a == null) {
            this.f41906a = "";
        }
        int max = Math.max(0, this.f41908c);
        CharSequence charSequence = this.f41906a;
        int i = this.f41911f;
        TextPaint textPaint = this.f41907b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f41915k);
        }
        int min = Math.min(charSequence.length(), this.f41909d);
        this.f41909d = min;
        if (this.f41914j && this.f41911f == 1) {
            this.f41910e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f41910e);
        obtain.setIncludePad(this.i);
        obtain.setTextDirection(this.f41914j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f41915k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f41911f);
        float f3 = this.f41912g;
        if (f3 != 1.0f) {
            obtain.setLineSpacing(0.0f, f3);
        }
        if (this.f41911f > 1) {
            obtain.setHyphenationFrequency(this.f41913h);
        }
        return obtain.build();
    }
}
