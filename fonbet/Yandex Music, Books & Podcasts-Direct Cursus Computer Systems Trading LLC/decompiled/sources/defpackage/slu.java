package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final class slu extends xmm implements ayd {
    public final /* synthetic */ byd d;
    public final mlu e;
    public final gs4 f;
    public final qlu g;
    public final xdr h;

    public slu(mlu mluVar, gs4 gs4Var, qlu qluVar, jyr jyrVar) {
        mluVar.getClass();
        this.d = new byd(mluVar, jyrVar);
        this.e = mluVar;
        this.f = gs4Var;
        this.g = qluVar;
        this.h = ydr.a(new fgt(mluVar.d, true));
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.e;
    }

    @Override // defpackage.ayd
    public final void b(boolean z) {
        this.d.b(z);
    }

    @Override // defpackage.xmm
    public final boolean n() {
        return this.h.getValue() instanceof sgt;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        rlu rluVar;
        int i;
        rj6 rj6Var;
        boolean z2;
        rlu rluVar2;
        nm6 nm6Var;
        mlu mluVar;
        boolean z3 = z;
        if (cg6Var instanceof rlu) {
            rluVar = (rlu) cg6Var;
            int i2 = rluVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rluVar.m = i2 - Integer.MIN_VALUE;
                Object obj = rluVar.k;
                nm6 nm6Var2 = nm6.a;
                i = rluVar.m;
                xdr xdrVar = this.h;
                mlu mluVar2 = this.e;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!n()) {
                        fgt fgtVar = new fgt(mluVar2.d, true);
                        xdrVar.getClass();
                        xdrVar.m(null, fgtVar);
                    }
                    rluVar.j = z3;
                    rluVar.m = 1;
                    obj = this.g.a(mluVar2, z3, rluVar);
                    if (obj == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        mluVar = mluVar2;
                        return new d73(mluVar);
                    }
                    z3 = rluVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    if (!n()) {
                        fgt fgtVar2 = new fgt(mluVar2.d, false);
                        xdrVar.getClass();
                        xdrVar.m(null, fgtVar2);
                    }
                    ((pj6) rj6Var).a();
                    return new c73(mluVar2);
                }
                tlu tluVar = (tlu) ((qj6) rj6Var).a;
                ArrayList arrayList = tluVar.a;
                boolean isEmpty = arrayList.isEmpty();
                if (isEmpty) {
                    if (!n()) {
                        fgt fgtVar3 = new fgt(mluVar2.d, false);
                        xdrVar.getClass();
                        xdrVar.m(null, fgtVar3);
                    }
                    z2 = z3;
                    rluVar2 = rluVar;
                    nm6Var = nm6Var2;
                    mluVar = mluVar2;
                } else {
                    if (isEmpty) {
                        b6e.s();
                        return null;
                    }
                    String str = mluVar2.d;
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        dlu dluVar = (dlu) it.next();
                        dluVar.getClass();
                        String str2 = dluVar.a;
                        String str3 = dluVar.b;
                        ArrayList<hlu> arrayList3 = dluVar.c;
                        ArrayList arrayList4 = new ArrayList();
                        for (hlu hluVar : arrayList3) {
                            Iterator it2 = it;
                            hluVar.getClass();
                            mlu mluVar3 = mluVar2;
                            dou douVar = hluVar.a;
                            nm6 nm6Var3 = nm6Var2;
                            String str4 = douVar.c;
                            String str5 = douVar.d;
                            np npVar = hluVar.b;
                            boolean z4 = z3;
                            op opVar = npVar.b;
                            rlu rluVar3 = rluVar;
                            String pathForSize = new jcv(opVar.a, WebPath$Storage.AVATARS).getPathForSize(wct.s());
                            String str6 = npVar.a;
                            Integer b0 = y2x.b0(opVar.b);
                            klu kluVar = b0 != null ? new klu(str4, str5, pathForSize, str6, b0.intValue(), npVar.c) : null;
                            ilu iluVar = kluVar != null ? new ilu(kluVar, douVar) : null;
                            if (iluVar != null) {
                                arrayList4.add(iluVar);
                            }
                            mluVar2 = mluVar3;
                            it = it2;
                            nm6Var2 = nm6Var3;
                            z3 = z4;
                            rluVar = rluVar3;
                        }
                        arrayList2.add(new glu(dluVar, new flu(str2, str3, arrayList4)));
                    }
                    z2 = z3;
                    rluVar2 = rluVar;
                    nm6Var = nm6Var2;
                    mluVar = mluVar2;
                    sgt sgtVar = new sgt(str, arrayList2, (glu) CollectionsKt.Q(arrayList2));
                    xdrVar.getClass();
                    xdrVar.m(null, sgtVar);
                }
                ArrayList arrayList5 = new ArrayList(v75.o(arrayList, 10));
                int i3 = 0;
                for (Object obj2 : arrayList) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        u75.n();
                        throw null;
                    }
                    dlu dluVar2 = (dlu) obj2;
                    arrayList5.add(new f70(dluVar2.a, e70.b, i3, dluVar2.c.size()));
                    i3 = i4;
                }
                this.f.N(arrayList5, tluVar.b);
                boolean isEmpty2 = arrayList.isEmpty();
                rlu rluVar4 = rluVar2;
                rluVar4.j = z2;
                rluVar4.m = 2;
                Object a = this.d.a(isEmpty2, rluVar4);
                nm6 nm6Var4 = nm6Var;
                if (a == nm6Var4) {
                    return nm6Var4;
                }
                return new d73(mluVar);
            }
        }
        rluVar = new rlu(this, cg6Var);
        Object obj3 = rluVar.k;
        nm6 nm6Var22 = nm6.a;
        i = rluVar.m;
        xdr xdrVar2 = this.h;
        mlu mluVar22 = this.e;
        if (i != 0) {
        }
        rj6Var = (rj6) obj3;
        if (rj6Var instanceof qj6) {
        }
    }
}
