package defpackage;

import java.util.Objects;

/* loaded from: classes10.dex */
public final class y001 {
    public final int a;
    public final lyi0[] b;
    public final loo[] c;
    public final r801 d;
    public final Object e;

    public y001(lyi0[] lyi0VarArr, loo[] looVarArr, r801 r801Var, Object obj) {
        d6z.l(lyi0VarArr.length == looVarArr.length);
        this.b = lyi0VarArr;
        this.c = (loo[]) looVarArr.clone();
        this.d = r801Var;
        this.e = obj;
        this.a = lyi0VarArr.length;
    }

    public final boolean a(y001 y001Var, int i) {
        return y001Var != null && Objects.equals(this.b[i], y001Var.b[i]) && Objects.equals(this.c[i], y001Var.c[i]);
    }

    public final boolean b(int i) {
        return this.b[i] != null;
    }
}
