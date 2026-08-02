package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class m36 extends qp7 implements ayd {
    public final /* synthetic */ byd d;
    public final t26 e;
    public final rmb f;
    public final i36 g;
    public final rw5 h;
    public final jyr i;
    public final String j;
    public final xdr k;
    public final fkn l;

    public m36(t26 t26Var, rmb rmbVar, i36 i36Var, rw5 rw5Var) {
        t26Var.getClass();
        i36Var.getClass();
        rw5Var.getClass();
        this.d = bow.s(t26Var);
        this.e = t26Var;
        this.f = rmbVar;
        this.g = i36Var;
        this.h = rw5Var;
        this.i = l18.b.b(hag.I(b36.class), true);
        this.j = "Skeleton:ConcertsBlock";
        xdr a = ydr.a(new g36(true));
        this.k = a;
        this.l = new fkn(a);
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.e;
    }

    @Override // defpackage.ayd
    public final void b(boolean z) {
        this.d.b(z);
    }

    @Override // defpackage.qp7
    public final boolean m() {
        return this.l.a.getValue() instanceof f36;
    }

    @Override // defpackage.qp7
    public final String n() {
        return this.j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e5, code lost:
    
        if (r15 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f3, code lost:
    
        if (r15 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010b, code lost:
    
        if (r15 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0070, code lost:
    
        if (r15 == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.qp7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        j36 j36Var;
        int i;
        Object obj;
        if (cg6Var instanceof j36) {
            j36Var = (j36) cg6Var;
            int i2 = j36Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j36Var.m = i2 - Integer.MIN_VALUE;
                Object obj2 = j36Var.k;
                Object obj3 = nm6.a;
                i = j36Var.m;
                if (i != 0) {
                    qgg.h0(obj2);
                    b36 b36Var = (b36) this.i.getValue();
                    Long a = this.h.a();
                    String valueOf = a != null ? String.valueOf(a.longValue()) : null;
                    j36Var.j = z;
                    j36Var.m = 1;
                    obj2 = b36Var.a(this.e, z, valueOf, j36Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return (e73) obj2;
                        }
                        if (i == 3) {
                            qgg.h0(obj2);
                            return (e73) obj2;
                        }
                        if (i == 4) {
                            qgg.h0(obj2);
                            return (e73) obj2;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = j36Var.j;
                    qgg.h0(obj2);
                }
                obj = (rj6) obj2;
                if (!(obj instanceof qj6)) {
                    List list = (List) ((qj6) obj).a;
                    i36 i36Var = this.g;
                    i36Var.getClass();
                    list.getClass();
                    List<h06> list2 = list;
                    ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                    for (h06 h06Var : list2) {
                        o36 o36Var = i36Var.a;
                        boolean z2 = i36Var.b;
                        h06Var.getClass();
                        o36Var.getClass();
                        arrayList.add(new ws5(h06Var, aaw.d(h06Var, o36Var, wct.t(), z2)));
                    }
                    obj = new qj6(arrayList);
                } else if (!(obj instanceof pj6)) {
                    b6e.s();
                    return null;
                }
                if (!(obj instanceof qj6)) {
                    List list3 = (List) ((qj6) obj).a;
                    if (list3.isEmpty()) {
                        j36Var.j = z;
                        j36Var.m = 3;
                        obj2 = p(null, j36Var);
                    } else {
                        j36Var.j = z;
                        j36Var.m = 2;
                        obj2 = q(list3, j36Var);
                    }
                } else {
                    if (!(obj instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    IOException a2 = ((pj6) obj).a();
                    j36Var.j = z;
                    j36Var.m = 4;
                    obj2 = p(a2, j36Var);
                }
                return obj3;
            }
        }
        j36Var = new j36(this, cg6Var);
        Object obj22 = j36Var.k;
        Object obj32 = nm6.a;
        i = j36Var.m;
        if (i != 0) {
        }
        obj = (rj6) obj22;
        if (!(obj instanceof qj6)) {
        }
        if (!(obj instanceof qj6)) {
        }
        return obj32;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(IOException iOException, cg6 cg6Var) {
        k36 k36Var;
        int i;
        Object obj;
        if (cg6Var instanceof k36) {
            k36Var = (k36) cg6Var;
            int i2 = k36Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k36Var.l = i2 - Integer.MIN_VALUE;
                Object obj2 = k36Var.j;
                nm6 nm6Var = nm6.a;
                i = k36Var.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    k36Var.l = 1;
                    if (this.d.a(true, k36Var) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                xdr xdrVar = this.k;
                obj = (h36) xdrVar.getValue();
                if (!(obj instanceof g36)) {
                    obj = new g36(false);
                } else if (!(obj instanceof f36)) {
                    b6e.s();
                    return null;
                }
                xdrVar.m(null, obj);
                return new c73(this.e);
            }
        }
        k36Var = new k36(this, cg6Var);
        Object obj22 = k36Var.j;
        nm6 nm6Var2 = nm6.a;
        i = k36Var.l;
        if (i != 0) {
        }
        xdr xdrVar2 = this.k;
        obj = (h36) xdrVar2.getValue();
        if (!(obj instanceof g36)) {
        }
        xdrVar2.m(null, obj);
        return new c73(this.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(List list, cg6 cg6Var) {
        l36 l36Var;
        int i;
        String a;
        if (cg6Var instanceof l36) {
            l36Var = (l36) cg6Var;
            int i2 = l36Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l36Var.l = i2 - Integer.MIN_VALUE;
                Object obj = l36Var.j;
                nm6 nm6Var = nm6.a;
                i = l36Var.l;
                t26 t26Var = this.e;
                if (i != 0) {
                    qgg.h0(obj);
                    rmb.h(this.f, list.size(), 2);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new c36((ws5) it.next()));
                    }
                    o43 o43Var = t26Var.e;
                    if (o43Var != null && (a = o43Var.a()) != null) {
                        arrayList = CollectionsKt.h0(arrayList, new d36(a));
                    }
                    f36 f36Var = new f36(arrayList);
                    xdr xdrVar = this.k;
                    xdrVar.getClass();
                    xdrVar.m(null, f36Var);
                    l36Var.l = 1;
                    if (this.d.a(false, l36Var) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return new d73(t26Var);
            }
        }
        l36Var = new l36(this, cg6Var);
        Object obj2 = l36Var.j;
        nm6 nm6Var2 = nm6.a;
        i = l36Var.l;
        t26 t26Var2 = this.e;
        if (i != 0) {
        }
        return new d73(t26Var2);
    }
}
