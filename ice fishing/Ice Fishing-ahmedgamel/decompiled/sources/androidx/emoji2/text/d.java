package androidx.emoji2.text;

import android.text.TextPaint;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f4762b = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f4763a;

    public d() {
        TextPaint textPaint = new TextPaint();
        this.f4763a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
