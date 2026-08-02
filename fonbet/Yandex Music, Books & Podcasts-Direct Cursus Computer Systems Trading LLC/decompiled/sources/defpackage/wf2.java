package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class wf2 {
    public final xdr a;
    public final fkn b;
    public final uf2 c;
    public final vf2 d;

    public wf2() {
        xdr a = ydr.a(q5b.a);
        this.a = a;
        this.b = new fkn(a);
        this.c = new uf2(0, this);
        this.d = new vf2(this);
    }

    public static final void a(wf2 wf2Var, m73 m73Var) {
        xdr xdrVar = wf2Var.a;
        Iterable iterable = (Iterable) xdrVar.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            n73 n73Var = (n73) obj;
            if (!Intrinsics.d(n73Var.a, "music-launch") || n73Var.b != m73Var) {
                arrayList.add(obj);
            }
        }
        xdrVar.l(CollectionsKt.A0(arrayList));
    }
}
