package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class jk4 {
    public final jyr a;
    public final jyr b;
    public int c;
    public final crh d;
    public final gk4 e;
    public final xdr f;
    public final cz g;

    public jk4() {
        bdt I = hag.I(Application.class);
        l18 l18Var = l18.b;
        this.a = l18Var.b(I, true);
        jyr b = l18Var.b(hag.I(nk4.class), true);
        this.b = btf.b(new r93(18, this));
        String J = vwb.J("F3514B38");
        ArrayList<String> arrayList = new ArrayList<>();
        if (!arrayList.contains(J)) {
            arrayList.add(J);
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", arrayList);
        this.d = new crh(bundle, arrayList);
        this.e = new gk4(0, this);
        xdr a = ydr.a(c5b.a);
        this.f = a;
        int i = 2;
        Continuation continuation = null;
        this.g = new cz(new u21(10, new ub7(12, ((nk4) b.getValue()).b, new lf2(i, 4, continuation)), new ub7(12, a, new xc(i, 7, continuation)), new hk4(3, 0, continuation)), this, 22);
    }

    public static final void a(jk4 jk4Var) {
        ssg.a(4, "ChromeCastDiscoveryCenter", "Requesting available routes", null);
        xdr xdrVar = jk4Var.f;
        ((krh) jk4Var.b.getValue()).getClass();
        ArrayList f = krh.f();
        f.getClass();
        ssg.a(4, "ChromeCastDiscoveryCenter", "All routes received: ".concat(CollectionsKt.X(f, null, null, null, null, 63)), null);
        ArrayList arrayList = new ArrayList();
        Iterator it = f.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            irh irhVar = (irh) next;
            if (!irhVar.d() && irhVar.g && irhVar.h(jk4Var.d)) {
                arrayList.add(next);
            }
        }
        xdrVar.l(CollectionsKt.o0(arrayList, new C1318t(29)));
    }

    public static kk4 b(irh irhVar) {
        String str = irhVar.c;
        str.getClass();
        String str2 = irhVar.d;
        str2.getClass();
        ofc ofcVar = ek4.a;
        int i = irhVar.n;
        ofcVar.getClass();
        return new kk4(str, str2, i != 1 ? i != 2 ? ek4.d : ek4.c : ek4.b);
    }
}
