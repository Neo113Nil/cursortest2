package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class gs0 extends hag {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ WeakReference c;
    public final /* synthetic */ ls0 d;

    public gs0(ls0 ls0Var, int i, int i2, WeakReference weakReference) {
        this.d = ls0Var;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    @Override // defpackage.hag
    public final void u(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
            typeface = ks0.a(typeface, i, (this.b & 2) != 0);
        }
        ls0 ls0Var = this.d;
        if (ls0Var.m) {
            ls0Var.l = typeface;
            TextView textView = (TextView) this.c.get();
            if (textView != null) {
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i2 = ls0Var.j;
                if (isAttachedToWindow) {
                    textView.post(new hs0(textView, typeface, i2, 0));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    @Override // defpackage.hag
    public final void t(int i) {
    }
}
