package A3;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public float f174c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f176e;

    /* renamed from: f, reason: collision with root package name */
    public D3.d f177f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f172a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final j f173b = new j(0, this);

    /* renamed from: d, reason: collision with root package name */
    public boolean f175d = true;

    public l(v3.e eVar) {
        this.f176e = new WeakReference(null);
        this.f176e = new WeakReference(eVar);
    }

    public final float a(String str) {
        if (!this.f175d) {
            return this.f174c;
        }
        TextPaint textPaint = this.f172a;
        this.f174c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f175d = false;
        return this.f174c;
    }
}
