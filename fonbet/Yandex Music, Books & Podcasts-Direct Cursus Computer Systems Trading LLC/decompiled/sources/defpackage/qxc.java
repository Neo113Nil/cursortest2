package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes4.dex */
public final class qxc implements i6s {
    public final /* synthetic */ tqn a;
    public final /* synthetic */ rxc b;

    public qxc(tqn tqnVar, rxc rxcVar) {
        this.a = tqnVar;
        this.b = rxcVar;
    }

    @Override // defpackage.i6s
    public final void f(Drawable drawable) {
        drawable.getClass();
        if (this.a.a) {
            return;
        }
        this.b.c().setImageDrawable(drawable);
    }

    @Override // defpackage.i6s
    public final void p(Drawable drawable) {
        if (this.a.a) {
            return;
        }
        this.b.c().setImageBitmap(null);
    }
}
