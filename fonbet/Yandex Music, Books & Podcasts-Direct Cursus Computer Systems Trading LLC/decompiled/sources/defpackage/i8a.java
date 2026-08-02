package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final class i8a extends xmm implements ayd {
    public final /* synthetic */ byd d;
    public final s63 e;
    public final rmb f;
    public final z7a g;
    public final jyr h;
    public final xdr i;
    public final fkn j;

    public i8a(s63 s63Var, rmb rmbVar) {
        drf drfVar = s63Var.a;
        this.d = bow.s((uvn) drfVar);
        this.e = s63Var;
        this.f = rmbVar;
        this.g = (z7a) drfVar;
        this.h = l18.b.b(hag.I(c8a.class), true);
        xdr a = ydr.a(new e8a(true));
        this.i = a;
        this.j = new fkn(a);
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.g;
    }

    @Override // defpackage.ayd
    public final void b(boolean z) {
        this.d.b(z);
    }

    @Override // defpackage.xmm
    public final boolean n() {
        return this.j.a.getValue() instanceof d8a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        g8a g8aVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof g8a) {
            g8aVar = (g8a) cg6Var;
            int i2 = g8aVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g8aVar.m = i2 - Integer.MIN_VALUE;
                Object obj = g8aVar.k;
                Object obj2 = nm6.a;
                i = g8aVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    c8a c8aVar = (c8a) this.h.getValue();
                    g8aVar.j = z;
                    g8aVar.m = 1;
                    obj = c8aVar.a(this.g, z, g8aVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return (e73) obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = g8aVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (rj6Var instanceof pj6) {
                        ((pj6) rj6Var).a();
                        return p();
                    }
                    b6e.s();
                    return null;
                }
                List q0 = CollectionsKt.q0((Iterable) ((qj6) rj6Var).a, 8);
                if (q0.isEmpty()) {
                    return p();
                }
                g8aVar.j = z;
                g8aVar.m = 2;
                obj = q(q0, g8aVar);
            }
        }
        g8aVar = new g8a(this, cg6Var);
        Object obj3 = g8aVar.k;
        Object obj22 = nm6.a;
        i = g8aVar.m;
        if (i != 0) {
        }
        rj6Var = (rj6) obj3;
        if (rj6Var instanceof qj6) {
        }
    }

    public final c73 p() {
        xdr xdrVar;
        Object value;
        Object obj;
        b(true);
        do {
            xdrVar = this.i;
            value = xdrVar.getValue();
            obj = (f8a) value;
            if (obj instanceof e8a) {
                obj = new e8a(false);
            } else if (!(obj instanceof d8a)) {
                b6e.s();
                return null;
            }
        } while (!xdrVar.k(value, obj));
        return new c73(this.g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(List list, cg6 cg6Var) {
        h8a h8aVar;
        int i;
        if (cg6Var instanceof h8a) {
            h8aVar = (h8a) cg6Var;
            int i2 = h8aVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h8aVar.l = i2 - Integer.MIN_VALUE;
                Object obj = h8aVar.j;
                nm6 nm6Var = nm6.a;
                i = h8aVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    List<m7a> list2 = list;
                    ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                    for (m7a m7aVar : list2) {
                        m7aVar.getClass();
                        u51 u51Var = m7aVar.c;
                        String str = u51Var.b;
                        u9b u9bVar = u51Var.c;
                        if (u9bVar != null) {
                            u9bVar.e(wct.s(), WebPath$Storage.AVATARS);
                        }
                        str.getClass();
                        arrayList.add(new x7a(m7aVar, new imp()));
                    }
                    d8a d8aVar = new d8a(arrayList);
                    xdr xdrVar = this.i;
                    xdrVar.getClass();
                    xdrVar.m(null, d8aVar);
                    rmb.h(this.f, list.size(), 2);
                    boolean isEmpty = list.isEmpty();
                    h8aVar.l = 1;
                    if (this.d.a(isEmpty, h8aVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return new d73(this.g);
            }
        }
        h8aVar = new h8a(this, cg6Var);
        Object obj2 = h8aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = h8aVar.l;
        if (i != 0) {
        }
        return new d73(this.g);
    }
}
