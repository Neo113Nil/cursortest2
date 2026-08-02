package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes4.dex */
public final class pxc implements lhu {
    public final ImageView a;
    public final /* synthetic */ rxc b;
    public final /* synthetic */ tqn c;
    public final /* synthetic */ la8 d;

    public pxc(rxc rxcVar, tqn tqnVar, la8 la8Var) {
        this.b = rxcVar;
        this.c = tqnVar;
        this.d = la8Var;
        this.a = rxcVar.c();
    }

    @Override // defpackage.i6s
    public final void f(Drawable drawable) {
        drawable.getClass();
        this.c.a = true;
        this.d.a();
        rxc rxcVar = this.b;
        rxcVar.c().setImageDrawable(drawable);
        rxc.a(rxcVar);
    }

    @Override // defpackage.lhu
    public final View getView() {
        return this.a;
    }

    @Override // defpackage.i6s
    public final void p(Drawable drawable) {
        rxc rxcVar = this.b;
        rxcVar.c().setImageBitmap(null);
        rxc.a(rxcVar);
    }
}
