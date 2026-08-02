package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class fqv extends eqv {
    public static final kqv r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        r = kqv.h(null, windowInsets);
    }

    public fqv(kqv kqvVar, WindowInsets windowInsets) {
        super(kqvVar, windowInsets);
    }

    @Override // defpackage.bqv, defpackage.hqv
    public zne g(int i) {
        return zne.d(this.c.getInsets(iqv.a(i)));
    }

    @Override // defpackage.bqv, defpackage.hqv
    public zne h(int i) {
        return zne.d(this.c.getInsetsIgnoringVisibility(iqv.a(i)));
    }

    @Override // defpackage.bqv, defpackage.hqv
    public boolean q(int i) {
        return this.c.isVisible(iqv.a(i));
    }

    public fqv(kqv kqvVar, fqv fqvVar) {
        super(kqvVar, fqvVar);
    }

    @Override // defpackage.bqv, defpackage.hqv
    public final void d(View view) {
    }
}
