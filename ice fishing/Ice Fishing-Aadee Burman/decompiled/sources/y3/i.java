package y3;

import android.text.TextPaint;
import java.lang.ref.WeakReference;
import t3.C5039b;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public float f41918c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f41920e;

    /* renamed from: f, reason: collision with root package name */
    public B3.d f41921f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f41916a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final C5039b f41917b = new C5039b(1, this);

    /* renamed from: d, reason: collision with root package name */
    public boolean f41919d = true;

    public i(t3.f fVar) {
        this.f41920e = new WeakReference(null);
        this.f41920e = new WeakReference(fVar);
    }

    public final float a(String str) {
        if (!this.f41919d) {
            return this.f41918c;
        }
        TextPaint textPaint = this.f41916a;
        this.f41918c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f41919d = false;
        return this.f41918c;
    }
}
