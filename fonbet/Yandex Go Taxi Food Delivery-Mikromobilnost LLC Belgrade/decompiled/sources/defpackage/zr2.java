package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class zr2 extends vuj0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ WeakReference c;
    public final /* synthetic */ ds2 d;

    public zr2(ds2 ds2Var, int i, int i2, WeakReference weakReference) {
        this.d = ds2Var;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    @Override // defpackage.vuj0
    public final void b(int i) {
    }

    @Override // defpackage.vuj0
    public final void c(Typeface typeface) {
        int i = 1;
        int i2 = this.a;
        if (i2 != -1) {
            typeface = cs2.a(typeface, i2, (this.b & 2) != 0);
        }
        ds2 ds2Var = this.d;
        if (ds2Var.m) {
            ds2Var.l = typeface;
            TextView textView = (TextView) this.c.get();
            if (textView != null) {
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i3 = ds2Var.j;
                if (isAttachedToWindow) {
                    textView.post(new xz(textView, typeface, i3, i));
                } else {
                    textView.setTypeface(typeface, i3);
                }
            }
        }
    }
}
