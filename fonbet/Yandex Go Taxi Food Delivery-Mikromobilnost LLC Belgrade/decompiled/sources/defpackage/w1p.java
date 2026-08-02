package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;

/* loaded from: classes12.dex */
public final class w1p implements q {
    public final /* synthetic */ x1p a;

    public w1p(x1p x1pVar) {
        this.a = x1pVar;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        Lifecycle.Event event2 = Lifecycle.Event.ON_DESTROY;
        x1p x1pVar = this.a;
        if (event != event2) {
            x1pVar.b.g(event);
            return;
        }
        l30 l30Var = x1pVar.c;
        if (l30Var != null) {
            l30Var.cancel();
        }
        x1pVar.c = null;
    }
}
