package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class gxt extends kxt {
    public final String b;
    public final nx8 c;
    public volatile jac d;

    public gxt(String str, nx8 nx8Var, jac jacVar) {
        this.b = str;
        this.c = nx8Var;
        this.d = jacVar;
    }

    @Override // defpackage.kxt
    public final void a(Function1 function1) {
        synchronized (this) {
            try {
                if (this.a.c == 0) {
                    jac jacVar = this.d;
                    jacVar.g = ((eym) jacVar.f).a((szb) jacVar.c, new fxt(this, 0));
                }
                super.a(function1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kxt
    public final String c() {
        return this.b;
    }

    @Override // defpackage.kxt
    public final void f(Function1 function1) {
        synchronized (this) {
            super.f(function1);
            if (this.a.c == 0) {
                jac jacVar = this.d;
                ja8 ja8Var = (ja8) jacVar.g;
                if (ja8Var != null) {
                    ja8Var.close();
                }
                jacVar.g = null;
            }
        }
    }

    public final void j(Object obj) {
        synchronized (this) {
            this.d.t(obj);
        }
    }
}
