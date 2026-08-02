package ru.yandex.taxi.multiorder;

import defpackage.jst;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.superapp.knownOrder.u;

/* loaded from: classes6.dex */
public final class n {
    public final u a;
    public final tt2 b;

    public n(u uVar, tt2 tt2Var) {
        this.a = uVar;
        this.b = tt2Var;
    }

    public final Object a(String str, long j, Continuation continuation) {
        jst.e.n("Waiting for order " + str + " loaded to show details...");
        o oVar = new o(com.yandex.go.coroutines.b.k(kotlinx.coroutines.flow.e.t(new m(new k(this.a.k, str), str)), j, null), new WaitOrderLoadingForDetailsInteractorImpl$waitOrderLoading$4(str, j, null));
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.y(kotlinx.coroutines.flow.e.F(oVar, mdh.b), continuation);
    }
}
