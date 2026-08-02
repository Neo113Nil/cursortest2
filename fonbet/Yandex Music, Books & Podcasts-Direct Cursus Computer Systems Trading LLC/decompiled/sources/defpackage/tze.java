package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class tze extends qp7 implements ayd {
    public final /* synthetic */ byd d;
    public final ize e;
    public final oze f;
    public final q43 g;
    public final String h;
    public final xdr i;

    public tze(ize izeVar, oze ozeVar, q43 q43Var) {
        izeVar.getClass();
        this.d = bow.s(izeVar);
        this.e = izeVar;
        this.f = ozeVar;
        this.g = q43Var;
        this.h = "Skeleton:ItemListBlock";
        this.i = ydr.a(new pze(p(), true));
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
        return this.i.getValue() instanceof qze;
    }

    @Override // defpackage.qp7
    public final String n() {
        return this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
    
        if (r8 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0061, code lost:
    
        if (r12 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.qp7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        sze szeVar;
        int i;
        rj6 rj6Var;
        List list;
        uze uzeVar;
        Integer num;
        if (cg6Var instanceof sze) {
            szeVar = (sze) cg6Var;
            int i2 = szeVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                szeVar.n = i2 - Integer.MIN_VALUE;
                Object obj = szeVar.l;
                nm6 nm6Var = nm6.a;
                i = szeVar.n;
                xdr xdrVar = this.i;
                ize izeVar = this.e;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!m()) {
                        pze pzeVar = new pze(p(), true);
                        xdrVar.getClass();
                        xdrVar.m(null, pzeVar);
                    }
                    szeVar.j = z;
                    szeVar.n = 1;
                    obj = this.f.a(izeVar, z, szeVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uzeVar = szeVar.k;
                        qgg.h0(obj);
                        num = izeVar.b.b;
                        if (num != null && num.intValue() == 0) {
                            b(uzeVar.a.isEmpty());
                        }
                        return new d73(izeVar);
                    }
                    z = szeVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    if (!m()) {
                        pze pzeVar2 = new pze(p(), false);
                        xdrVar.getClass();
                        xdrVar.m(null, pzeVar2);
                    }
                    ((pj6) rj6Var).a();
                    return new c73(izeVar);
                }
                uze uzeVar2 = (uze) ((qj6) rj6Var).a;
                List list2 = uzeVar2.a;
                boolean isEmpty = list2.isEmpty();
                if (isEmpty) {
                    if (!m()) {
                        pze pzeVar3 = new pze(p(), false);
                        xdrVar.getClass();
                        xdrVar.m(null, pzeVar3);
                    }
                } else {
                    if (isEmpty) {
                        b6e.s();
                        return null;
                    }
                    Integer num2 = izeVar.b.b;
                    if (num2 != null) {
                        int intValue = num2.intValue();
                        list = CollectionsKt.q0(list2, intValue);
                        if (intValue <= 0) {
                            list = null;
                        }
                    }
                    list = list2;
                    qze qzeVar = new qze(list);
                    xdrVar.getClass();
                    xdrVar.m(null, qzeVar);
                }
                q43.c(this.g, list2.size());
                boolean isEmpty2 = list2.isEmpty();
                szeVar.k = uzeVar2;
                szeVar.j = z;
                szeVar.n = 2;
                if (this.d.a(isEmpty2, szeVar) != nm6Var) {
                    uzeVar = uzeVar2;
                    num = izeVar.b.b;
                    if (num != null) {
                        b(uzeVar.a.isEmpty());
                    }
                    return new d73(izeVar);
                }
                return nm6Var;
            }
        }
        szeVar = new sze(this, cg6Var);
        Object obj2 = szeVar.l;
        nm6 nm6Var2 = nm6.a;
        i = szeVar.n;
        xdr xdrVar2 = this.i;
        ize izeVar2 = this.e;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }

    public final int p() {
        Integer num = this.e.b.b;
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
