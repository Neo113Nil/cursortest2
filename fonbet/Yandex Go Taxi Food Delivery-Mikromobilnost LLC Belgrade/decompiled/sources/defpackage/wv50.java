package defpackage;

import com.apollographql.apollo3.network.http.c;
import kotlinx.coroutines.flow.e;

/* loaded from: classes.dex */
public final class wv50 implements so2 {
    public final c a;
    public final jse b;

    public wv50(c cVar, x160 x160Var, jse jseVar) {
        this.a = cVar;
        this.b = jseVar;
    }

    @Override // defpackage.so2
    public final tpr a(to2 to2Var, kdh kdhVar) {
        tpr a;
        fc70 fc70Var = to2Var.a;
        boolean z = fc70Var instanceof ejg0;
        c cVar = this.a;
        if (z) {
            a = cVar.a(to2Var);
        } else {
            if (!(fc70Var instanceof b050)) {
                ny61.r("");
                return null;
            }
            a = cVar.a(to2Var);
        }
        return e.F(a, this.b);
    }
}
