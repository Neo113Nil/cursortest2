package L0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f503a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f504b;

    /* renamed from: c, reason: collision with root package name */
    public final int f505c;

    /* renamed from: d, reason: collision with root package name */
    public int f506d;
    public boolean j;
    public Layout.Alignment e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f507f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f508g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public int f509h = 1;
    public boolean i = true;

    /* renamed from: k, reason: collision with root package name */
    public TextUtils.TruncateAt f510k = null;

    public h(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f503a = charSequence;
        this.f504b = textPaint;
        this.f505c = i;
        this.f506d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f503a == null) {
            this.f503a = "";
        }
        int max = Math.max(0, this.f505c);
        CharSequence charSequence = this.f503a;
        int i = this.f507f;
        TextPaint textPaint = this.f504b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f510k);
        }
        int min = Math.min(charSequence.length(), this.f506d);
        this.f506d = min;
        if (this.j && this.f507f == 1) {
            this.e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.e);
        obtain.setIncludePad(this.i);
        obtain.setTextDirection(this.j ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f510k;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f507f);
        float f2 = this.f508g;
        if (f2 != 1.0f) {
            obtain.setLineSpacing(RecyclerView.f2111C0, f2);
        }
        if (this.f507f > 1) {
            obtain.setHyphenationFrequency(this.f509h);
        }
        return obtain.build();
    }
}
