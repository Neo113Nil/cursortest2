package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class las {
    public float c;
    public float d;
    public final WeakReference f;
    public x9s g;
    public final TextPaint a = new TextPaint(1);
    public final nj4 b = new nj4(1, this);
    public boolean e = true;

    public las(kas kasVar) {
        this.f = new WeakReference(null);
        this.f = new WeakReference(kasVar);
    }

    public final void a(String str) {
        TextPaint textPaint = this.a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.e = false;
    }

    public final void b(x9s x9sVar, Context context) {
        if (this.g != x9sVar) {
            this.g = x9sVar;
            if (x9sVar != null) {
                TextPaint textPaint = this.a;
                nj4 nj4Var = this.b;
                x9sVar.e(context, textPaint, nj4Var);
                kas kasVar = (kas) this.f.get();
                if (kasVar != null) {
                    textPaint.drawableState = kasVar.getState();
                }
                x9sVar.d(context, textPaint, nj4Var);
                this.e = true;
            }
            kas kasVar2 = (kas) this.f.get();
            if (kasVar2 != null) {
                kasVar2.a();
                kasVar2.onStateChange(kasVar2.getState());
            }
        }
    }
}
