package defpackage;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class gqv extends fqv {
    public static final kqv s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        s = kqv.h(null, windowInsets);
    }

    public gqv(kqv kqvVar, WindowInsets windowInsets) {
        super(kqvVar, windowInsets);
    }

    @Override // defpackage.fqv, defpackage.bqv, defpackage.hqv
    public zne g(int i) {
        return zne.d(this.c.getInsets(jqv.a(i)));
    }

    @Override // defpackage.fqv, defpackage.bqv, defpackage.hqv
    public zne h(int i) {
        return zne.d(this.c.getInsetsIgnoringVisibility(jqv.a(i)));
    }

    @Override // defpackage.fqv, defpackage.bqv, defpackage.hqv
    public boolean q(int i) {
        return this.c.isVisible(jqv.a(i));
    }

    public gqv(kqv kqvVar, gqv gqvVar) {
        super(kqvVar, gqvVar);
    }
}
