package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class wx6 implements j6s {
    public final int a;
    public final int b;
    public e0o c;

    public wx6() {
        if (!xut.j(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            xq0.x("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
            throw null;
        }
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
    }

    @Override // defpackage.j6s
    public final void a(anq anqVar) {
        ((jlq) anqVar).c(this.a, this.b);
    }

    @Override // defpackage.j6s
    public final e0o f() {
        return this.c;
    }

    @Override // defpackage.j6s
    public final void h(e0o e0oVar) {
        this.c = e0oVar;
    }

    @Override // defpackage.zyf
    public final void b() {
    }

    @Override // defpackage.zyf
    public final void onDestroy() {
    }

    @Override // defpackage.zyf
    public final void onStop() {
    }

    @Override // defpackage.j6s
    public final void c(jlq jlqVar) {
    }

    @Override // defpackage.j6s
    public final void e(Drawable drawable) {
    }

    @Override // defpackage.j6s
    public final void i(Drawable drawable) {
    }
}
