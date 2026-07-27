package w3;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: w3.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5168g {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f41657a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f41658b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41659c;

    /* renamed from: d, reason: collision with root package name */
    public int f41660d;

    /* renamed from: j, reason: collision with root package name */
    public boolean f41665j;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f41661e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f41662f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f41663g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public int f41664h = 1;
    public boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f41666k = null;

    public C5168g(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f41657a = charSequence;
        this.f41658b = textPaint;
        this.f41659c = i;
        this.f41660d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f41657a == null) {
            this.f41657a = "";
        }
        int max = Math.max(0, this.f41659c);
        CharSequence charSequence = this.f41657a;
        int i = this.f41662f;
        TextPaint textPaint = this.f41658b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f41666k);
        }
        int min = Math.min(charSequence.length(), this.f41660d);
        this.f41660d = min;
        if (this.f41665j && this.f41662f == 1) {
            this.f41661e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f41661e);
        obtain.setIncludePad(this.i);
        obtain.setTextDirection(this.f41665j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f41666k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f41662f);
        float f6 = this.f41663g;
        if (f6 != 1.0f) {
            obtain.setLineSpacing(0.0f, f6);
        }
        if (this.f41662f > 1) {
            obtain.setHyphenationFrequency(this.f41664h);
        }
        return obtain.build();
    }
}
