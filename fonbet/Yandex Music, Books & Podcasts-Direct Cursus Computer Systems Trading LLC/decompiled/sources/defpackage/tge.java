package defpackage;

import android.content.Context;

/* loaded from: classes6.dex */
public final class tge {
    public final jyr b;
    public zu0 d;
    public final jyr a = l18.b.b(hag.I(oq7.class), true);
    public final xdr c = ydr.a(pge.a);
    public final oge e = new oge(this);

    public tge(Context context) {
        this.b = btf.b(new vw1(context, 3));
    }

    public final void a() {
        xdr xdrVar = this.c;
        pge pgeVar = pge.e;
        xdrVar.getClass();
        xdrVar.m(null, pgeVar);
        this.d = null;
        tax taxVar = (tax) this.b.getValue();
        oge ogeVar = this.e;
        synchronized (taxVar) {
            e5x e5xVar = taxVar.b;
            synchronized (e5xVar) {
                e5xVar.a.e("unregisterListener", new Object[0]);
                if (ogeVar == null) {
                    throw new NullPointerException("Unregistered Play Core listener should not be null.");
                }
                e5xVar.d.remove(ogeVar);
                e5xVar.a();
            }
        }
    }
}
