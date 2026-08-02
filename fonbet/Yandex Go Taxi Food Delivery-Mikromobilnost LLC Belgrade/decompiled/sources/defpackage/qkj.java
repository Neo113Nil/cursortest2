package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class qkj implements xbi0, vm11 {
    public tls a;
    public Object b;

    public /* synthetic */ qkj(tls tlsVar, Object obj) {
        this.b = obj;
        this.a = tlsVar;
    }

    @Override // defpackage.vbi0
    public Object getValue(Object obj, kgx kgxVar) {
        return this.b;
    }

    @Override // defpackage.vm11
    public Object q() {
        return this.b;
    }

    @Override // defpackage.xbi0
    public void setValue(Object obj, kgx kgxVar, Object obj2) {
        Object invoke;
        View view = (View) obj;
        tls tlsVar = this.a;
        if (tlsVar != null && (invoke = tlsVar.invoke(obj2)) != null) {
            obj2 = invoke;
        }
        if (jl40.l(this.b, obj2)) {
            return;
        }
        this.b = obj2;
        view.requestLayout();
    }

    @Override // defpackage.vm11
    public boolean t(Object obj) {
        return ((Boolean) this.a.invoke(obj)).booleanValue();
    }
}
