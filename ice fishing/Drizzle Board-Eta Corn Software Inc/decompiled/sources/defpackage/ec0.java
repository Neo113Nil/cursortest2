package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ec0 {
    public float MdtA4re8;
    public final WeakReference P7K7Inc8;
    public bc0 b2ZJblxo;
    public float wxUZMvaN;
    public final TextPaint qoPGr6Ce = new TextPaint(1);
    public final c5 NCTxEWno = new c5(1, this);
    public boolean VgvYg0wo = true;

    public ec0(dc0 dc0Var) {
        this.P7K7Inc8 = new WeakReference(null);
        this.P7K7Inc8 = new WeakReference(dc0Var);
    }

    public final void NCTxEWno(bc0 bc0Var, Context context) {
        if (this.b2ZJblxo != bc0Var) {
            this.b2ZJblxo = bc0Var;
            WeakReference weakReference = this.P7K7Inc8;
            if (bc0Var != null) {
                TextPaint textPaint = this.qoPGr6Ce;
                c5 c5Var = this.NCTxEWno;
                bc0Var.wxUZMvaN(context, textPaint, c5Var);
                dc0 dc0Var = (dc0) weakReference.get();
                if (dc0Var != null) {
                    textPaint.drawableState = dc0Var.getState();
                }
                bc0Var.MdtA4re8(context, textPaint, c5Var);
                this.VgvYg0wo = true;
            }
            dc0 dc0Var2 = (dc0) weakReference.get();
            if (dc0Var2 != null) {
                dc0Var2.qoPGr6Ce();
                dc0Var2.onStateChange(dc0Var2.getState());
            }
        }
    }

    public final void qoPGr6Ce(String str) {
        TextPaint textPaint = this.qoPGr6Ce;
        this.MdtA4re8 = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.wxUZMvaN = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.VgvYg0wo = false;
    }
}
