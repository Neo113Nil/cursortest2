package defpackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes4.dex */
public final class jg4 extends xmm {
    public final s63 d;
    public final q43 e;
    public final gg4 f;
    public final ag4 g;
    public final xdr h;

    public jg4(s63 s63Var, q43 q43Var, gg4 gg4Var) {
        this.d = s63Var;
        this.e = q43Var;
        this.f = gg4Var;
        ag4 ag4Var = (ag4) s63Var.a;
        this.g = ag4Var;
        this.h = ydr.a(new igt(ag4Var.e, true));
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.g;
    }

    @Override // defpackage.xmm
    public final boolean n() {
        return this.h.getValue() instanceof vgt;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        ig4 ig4Var;
        int i;
        rj6 rj6Var;
        LinkedList linkedList;
        CoverPath coverPath;
        String uri;
        if (cg6Var instanceof ig4) {
            ig4Var = (ig4) cg6Var;
            int i2 = ig4Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ig4Var.l = i2 - Integer.MIN_VALUE;
                Object obj = ig4Var.j;
                nm6 nm6Var = nm6.a;
                i = ig4Var.l;
                xdr xdrVar = this.h;
                ag4 ag4Var = this.g;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!n()) {
                        igt igtVar = new igt(ag4Var.e, true);
                        xdrVar.getClass();
                        xdrVar.m(null, igtVar);
                    }
                    int i3 = ag4Var.e;
                    ig4Var.l = 1;
                    obj = this.f.a(ag4Var, i3, z, ig4Var);
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
                    if (!n()) {
                        igt igtVar2 = new igt(ag4Var.e, false);
                        xdrVar.getClass();
                        xdrVar.m(null, igtVar2);
                    }
                    ((pj6) rj6Var).a();
                    return new c73(ag4Var);
                }
                qe4 qe4Var = (qe4) ((qj6) rj6Var).a;
                List list = qe4Var.b;
                int size = list.size();
                int i4 = ag4Var.e;
                if (size != i4) {
                    su4.s(2, null, f1d.e(i4, list.size(), "Error getting a certain number of tracks, expected: ", ", actual: "), null);
                    list = CollectionsKt.q0(list, ag4Var.e);
                }
                List<rf4> list2 = list;
                ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                for (rf4 rf4Var : list2) {
                    arrayList.add(new hg4(yf4.a(rf4Var), rf4Var.b));
                }
                cvl cvlVar = qe4Var.a;
                String str = cvlVar.c.a;
                String str2 = cvlVar.a;
                String str3 = cvlVar.b;
                tn6 tn6Var = cvlVar.p;
                vgt vgtVar = new vgt(arrayList, new eul(str, str2, str3, (tn6Var == null || (linkedList = tn6Var.b) == null || (coverPath = (CoverPath) CollectionsKt.firstOrNull(linkedList)) == null || (uri = coverPath.getUri()) == null) ? null : new u9b(uri, null, null), null));
                xdrVar.getClass();
                xdrVar.m(null, vgtVar);
                int size2 = list.size();
                q43 q43Var = this.e;
                q43Var.b(q43Var.a, size2, null, null);
                return new d73(ag4Var);
            }
        }
        ig4Var = new ig4(this, cg6Var);
        Object obj2 = ig4Var.j;
        nm6 nm6Var2 = nm6.a;
        i = ig4Var.l;
        xdr xdrVar2 = this.h;
        ag4 ag4Var2 = this.g;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }
}
