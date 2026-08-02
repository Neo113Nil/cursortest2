package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes4.dex */
public final class oxc implements i6s {
    public final /* synthetic */ rxc a;

    public oxc(rxc rxcVar) {
        this.a = rxcVar;
    }

    @Override // defpackage.i6s
    public final void f(Drawable drawable) {
        drawable.getClass();
        rxc rxcVar = this.a;
        rxcVar.d().setImageDrawable(drawable);
        rxc.a(rxcVar);
    }

    @Override // defpackage.i6s
    public final void p(Drawable drawable) {
        rxc rxcVar = this.a;
        rxcVar.d().setImageBitmap(null);
        rxc.a(rxcVar);
    }
}
