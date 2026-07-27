package w3;

import android.text.TextPaint;
import java.lang.ref.WeakReference;
import r3.C4959b;
import r3.C4963f;
import z3.C5277d;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public float f41669c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f41671e;

    /* renamed from: f, reason: collision with root package name */
    public C5277d f41672f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f41667a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final C4959b f41668b = new C4959b(1, this);

    /* renamed from: d, reason: collision with root package name */
    public boolean f41670d = true;

    public i(C4963f c4963f) {
        this.f41671e = new WeakReference(null);
        this.f41671e = new WeakReference(c4963f);
    }

    public final float a(String str) {
        if (!this.f41670d) {
            return this.f41669c;
        }
        TextPaint textPaint = this.f41667a;
        this.f41669c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f41670d = false;
        return this.f41669c;
    }
}
