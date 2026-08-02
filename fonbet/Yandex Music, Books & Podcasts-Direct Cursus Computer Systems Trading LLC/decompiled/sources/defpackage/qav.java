package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class qav extends xmm implements ayd {
    public final /* synthetic */ byd d;
    public final gav e;
    public final gs4 f;
    public final mav g;
    public final xdr h;

    public qav(gav gavVar, gs4 gs4Var, mav mavVar, jyr jyrVar) {
        gavVar.getClass();
        this.d = new byd(gavVar, jyrVar);
        this.e = gavVar;
        this.f = gs4Var;
        this.g = mavVar;
        this.h = ydr.a(new ggt(gavVar.d, true));
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
        return this.h.getValue() instanceof tgt;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x014a, code lost:
    
        if (r17.d.a(r2, r3) == r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x014c, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0063, code lost:
    
        if (r2 == r4) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        pav pavVar;
        int i;
        rj6 rj6Var;
        boolean z2 = z;
        if (cg6Var instanceof pav) {
            pavVar = (pav) cg6Var;
            int i2 = pavVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pavVar.m = i2 - Integer.MIN_VALUE;
                Object obj = pavVar.k;
                nm6 nm6Var = nm6.a;
                i = pavVar.m;
                xdr xdrVar = this.h;
                gav gavVar = this.e;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!n()) {
                        ggt ggtVar = new ggt(gavVar.d, true);
                        xdrVar.getClass();
                        xdrVar.m(null, ggtVar);
                    }
                    pavVar.j = z2;
                    pavVar.m = 1;
                    obj = this.g.a(gavVar, z2, pavVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return new d73(gavVar);
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = pavVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    if (!n()) {
                        ggt ggtVar2 = new ggt(gavVar.d, false);
                        xdrVar.getClass();
                        xdrVar.m(null, ggtVar2);
                    }
                    ((pj6) rj6Var).a();
                    return new c73(gavVar);
                }
                rav ravVar = (rav) ((qj6) rj6Var).a;
                ArrayList<hou> arrayList = ravVar.a;
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                for (hou houVar : arrayList) {
                    houVar.getClass();
                    String str = houVar.a;
                    String str2 = houVar.b;
                    ArrayList arrayList3 = houVar.c;
                    ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        arrayList4.add(ngg.N((zsu) it.next()));
                    }
                    arrayList2.add(new oav(str, str2, arrayList4));
                }
                boolean isEmpty = arrayList2.isEmpty();
                if (!isEmpty) {
                    if (isEmpty) {
                        b6e.s();
                        return null;
                    }
                    tgt tgtVar = new tgt(gavVar.d, arrayList2, (oav) CollectionsKt.Q(arrayList2));
                    xdrVar.getClass();
                    xdrVar.m(null, tgtVar);
                } else if (!n()) {
                    ggt ggtVar3 = new ggt(gavVar.d, false);
                    xdrVar.getClass();
                    xdrVar.m(null, ggtVar3);
                }
                ArrayList arrayList5 = new ArrayList(v75.o(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        u75.n();
                        throw null;
                    }
                    oav oavVar = (oav) next;
                    oavVar.getClass();
                    arrayList5.add(new f70(oavVar.a, e70.b, i3, oavVar.c.size()));
                    i3 = i4;
                }
                this.f.N(arrayList5, ravVar.b);
                boolean isEmpty2 = arrayList2.isEmpty();
                pavVar.j = z2;
                pavVar.m = 2;
            }
        }
        pavVar = new pav(this, cg6Var);
        Object obj2 = pavVar.k;
        nm6 nm6Var2 = nm6.a;
        i = pavVar.m;
        xdr xdrVar2 = this.h;
        gav gavVar2 = this.e;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }
}
