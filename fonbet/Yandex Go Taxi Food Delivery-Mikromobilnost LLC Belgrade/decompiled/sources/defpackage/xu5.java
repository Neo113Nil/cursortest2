package defpackage;

import androidx.lifecycle.Lifecycle;

/* loaded from: classes2.dex */
public final class xu5 {
    public final sls a;
    public final tls b;
    public Object c = zoy0.c;
    public wu5 d;

    public xu5(sls slsVar, tls tlsVar) {
        this.a = slsVar;
        this.b = tlsVar;
    }

    public final Object a(kgx kgxVar) {
        if (this.c == zoy0.c) {
            Lifecycle lifecycle = (Lifecycle) this.a.invoke();
            wu5 wu5Var = new wu5(0, this, lifecycle);
            lifecycle.a(wu5Var);
            this.d = wu5Var;
            this.c = this.b.invoke(kgxVar);
        }
        return this.c;
    }
}
