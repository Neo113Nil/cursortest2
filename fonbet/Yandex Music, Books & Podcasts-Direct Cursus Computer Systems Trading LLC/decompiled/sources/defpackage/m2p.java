package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class m2p extends qp7 {
    public final ize d;
    public final q43 e;
    public final jyr f;
    public final jyr g;
    public final jyr h;
    public final j0q i;
    public final xdr j;

    public m2p(ize izeVar, q43 q43Var) {
        izeVar.getClass();
        this.d = izeVar;
        this.e = q43Var;
        bdt I = hag.I(o8q.class);
        l18 l18Var = l18.b;
        this.f = l18Var.b(I, true);
        this.g = l18Var.b(hag.I(z66.class), true);
        this.h = l18Var.b(hag.I(e2p.class), true);
        this.i = new j0q();
        this.j = ydr.a(new i2p(p(), true));
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.d;
    }

    @Override // defpackage.qp7
    public final boolean m() {
        k2p k2pVar = (k2p) this.j.getValue();
        if ((k2pVar instanceof h2p) || (k2pVar instanceof j2p)) {
            return true;
        }
        if (k2pVar instanceof i2p) {
            return false;
        }
        b6e.s();
        return false;
    }

    @Override // defpackage.qp7
    public final String n() {
        return "Skeleton:SearchHistoryBlock";
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a3, code lost:
    
        if (r0 == null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.qp7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        l2p l2pVar;
        int i;
        rj6 rj6Var;
        List list;
        if (cg6Var instanceof l2p) {
            l2pVar = (l2p) cg6Var;
            int i2 = l2pVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l2pVar.l = i2 - Integer.MIN_VALUE;
                Object obj = l2pVar.j;
                nm6 nm6Var = nm6.a;
                i = l2pVar.l;
                ize izeVar = this.d;
                xdr xdrVar = this.j;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!m()) {
                        i2p i2pVar = new i2p(p(), true);
                        xdrVar.getClass();
                        xdrVar.m(null, i2pVar);
                    }
                    e2p e2pVar = (e2p) this.h.getValue();
                    l2pVar.l = 1;
                    obj = e2pVar.c(izeVar, true, l2pVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    if (!m()) {
                        i2p i2pVar2 = new i2p(p(), false);
                        xdrVar.getClass();
                        xdrVar.m(null, i2pVar2);
                    }
                    ((pj6) rj6Var).a();
                    return new c73(izeVar);
                }
                List list2 = ((uze) ((qj6) rj6Var).a).a;
                boolean isEmpty = list2.isEmpty();
                if (isEmpty) {
                    h2p h2pVar = new h2p(((o8q) this.f.getValue()).a.c(R.string.empty_own_search_history));
                    xdrVar.getClass();
                    xdrVar.m(null, h2pVar);
                } else {
                    if (isEmpty) {
                        b6e.s();
                        return null;
                    }
                    Integer num = izeVar.b.b;
                    if (num != null) {
                        int intValue = num.intValue();
                        list = CollectionsKt.q0(list2, intValue);
                        if (intValue <= 0) {
                            list = null;
                        }
                    }
                    list = list2;
                    j2p j2pVar = new j2p(new qze(list));
                    xdrVar.getClass();
                    xdrVar.m(null, j2pVar);
                }
                int size = list2.size();
                q43 q43Var = this.e;
                q43Var.b(q43Var.a, size, null, null);
                return new d73(izeVar);
            }
        }
        l2pVar = new l2p(this, cg6Var);
        Object obj2 = l2pVar.j;
        nm6 nm6Var2 = nm6.a;
        i = l2pVar.l;
        ize izeVar2 = this.d;
        xdr xdrVar2 = this.j;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }

    public final int p() {
        Integer num = this.d.b.b;
        if (num == null) {
            return 4;
        }
        if (num.intValue() <= 0) {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return 4;
    }
}
