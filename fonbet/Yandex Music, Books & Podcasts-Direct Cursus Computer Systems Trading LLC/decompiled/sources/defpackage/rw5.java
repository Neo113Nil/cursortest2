package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class rw5 {
    public final frt a;
    public final vdr b;
    public final Function0 c;
    public final xx5 d;
    public final tf6 e;
    public final xdr f;
    public final AtomicBoolean g;

    public rw5(frt frtVar, cc7 cc7Var, vdr vdrVar, cp5 cp5Var) {
        frtVar.getClass();
        cc7Var.getClass();
        vdrVar.getClass();
        cp5Var.getClass();
        this.a = frtVar;
        this.b = vdrVar;
        this.c = cp5Var;
        this.d = new xx5(cc7Var);
        this.e = gld.e(dm6.b);
        this.f = ydr.a(qx5.a);
        this.g = new AtomicBoolean(false);
    }

    public final Long a() {
        if (((Boolean) this.b.getValue()).booleanValue() && ((Boolean) this.c.invoke()).booleanValue()) {
            Object value = this.f.getValue();
            ox5 ox5Var = value instanceof ox5 ? (ox5) value : null;
            if (ox5Var != null) {
                return Long.valueOf(ox5Var.a.a);
            }
        }
        return null;
    }

    public final void b(rx5 rx5Var) {
        if (((Boolean) this.b.getValue()).booleanValue()) {
            x97.y(this.e, null, null, new vv4(this, rx5Var, (Continuation) null, 13), 3);
        }
    }
}
