package j2;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h implements LineHeightSpan {

    /* renamed from: g, reason: collision with root package name */
    public final float f3504g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3505h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3506i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3507j;

    /* renamed from: k, reason: collision with root package name */
    public final float f3508k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3509l;

    /* renamed from: m, reason: collision with root package name */
    public int f3510m = Integer.MIN_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public int f3511n = Integer.MIN_VALUE;

    /* renamed from: o, reason: collision with root package name */
    public int f3512o = Integer.MIN_VALUE;

    /* renamed from: p, reason: collision with root package name */
    public int f3513p = Integer.MIN_VALUE;

    /* renamed from: q, reason: collision with root package name */
    public int f3514q;

    /* renamed from: r, reason: collision with root package name */
    public int f3515r;

    public h(float f10, int i10, boolean z10, boolean z11, float f11, boolean z12) {
        this.f3504g = f10;
        this.f3505h = i10;
        this.f3506i = z10;
        this.f3507j = z11;
        this.f3508k = f11;
        this.f3509l = z12;
        if ((0.0f > f11 || f11 > 1.0f) && f11 != -1.0f) {
            m2.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i10, int i11, int i12, int i13, Paint.FontMetricsInt fontMetricsInt) {
        int i14 = fontMetricsInt.descent;
        int i15 = fontMetricsInt.ascent;
        if (i14 - i15 <= 0) {
            return;
        }
        boolean z10 = i10 == 0;
        boolean z11 = i11 == this.f3505h;
        boolean z12 = this.f3507j;
        boolean z13 = this.f3506i;
        if (z10 && z11 && z13 && z12) {
            return;
        }
        if (this.f3510m == Integer.MIN_VALUE) {
            int i16 = i14 - i15;
            int ceil = (int) Math.ceil(this.f3504g);
            int i17 = ceil - i16;
            if (!this.f3509l || i17 > 0) {
                float f10 = this.f3508k;
                if (f10 == -1.0f) {
                    f10 = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int ceil2 = (int) (i17 <= 0 ? Math.ceil(i17 * f10) : Math.ceil((1.0f - f10) * i17));
                int i18 = fontMetricsInt.descent;
                int i19 = ceil2 + i18;
                this.f3512o = i19;
                int i20 = i19 - ceil;
                this.f3511n = i20;
                if (z13) {
                    i20 = fontMetricsInt.ascent;
                }
                this.f3510m = i20;
                if (z12) {
                    i19 = i18;
                }
                this.f3513p = i19;
                this.f3514q = fontMetricsInt.ascent - i20;
                this.f3515r = i19 - i18;
            } else {
                int i21 = fontMetricsInt.ascent;
                this.f3511n = i21;
                int i22 = fontMetricsInt.descent;
                this.f3512o = i22;
                this.f3510m = i21;
                this.f3513p = i22;
                this.f3514q = 0;
                this.f3515r = 0;
            }
        }
        fontMetricsInt.ascent = z10 ? this.f3510m : this.f3511n;
        fontMetricsInt.descent = z11 ? this.f3513p : this.f3512o;
    }
}
