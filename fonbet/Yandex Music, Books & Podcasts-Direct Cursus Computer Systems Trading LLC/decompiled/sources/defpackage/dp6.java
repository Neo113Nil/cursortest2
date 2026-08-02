package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class dp6 {
    public final v97 a;
    public final nsh b;

    public dp6(v97 v97Var, jac jacVar) {
        this.a = v97Var;
        this.b = new nsh(jacVar);
    }

    public final void a(String str) {
        nsh nshVar = this.b;
        synchronized (nshVar) {
            if (!Objects.equals((String) nshVar.c, str)) {
                nsh.H((jac) nshVar.b, str, (String) nshVar.d);
                nshVar.c = str;
            }
        }
    }
}
