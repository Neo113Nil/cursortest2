package com.gamericefishpro.space.n;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends com.gamericefishpro.space.t3.b {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ WeakReference g;
    public final /* synthetic */ e0 h;

    public z(e0 e0Var, int i, int i2, WeakReference weakReference) {
        this.h = e0Var;
        this.e = i;
        this.f = i2;
        this.g = weakReference;
    }

    @Override // com.gamericefishpro.space.t3.b
    public final void h(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.e) != -1) {
            typeface = d0.a(typeface, i, (this.f & 2) != 0);
        }
        e0 e0Var = this.h;
        if (e0Var.m) {
            e0Var.l = typeface;
            TextView textView = (TextView) this.g.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new a0(e0Var.j, 0, textView, typeface));
                } else {
                    textView.setTypeface(typeface, e0Var.j);
                }
            }
        }
    }

    @Override // com.gamericefishpro.space.t3.b
    public final void g(int i) {
    }
}
