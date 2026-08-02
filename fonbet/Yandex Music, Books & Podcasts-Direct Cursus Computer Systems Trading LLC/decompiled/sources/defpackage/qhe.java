package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final class qhe extends xmm implements ayd {
    public final /* synthetic */ byd d;
    public final s63 e;
    public final gs4 f;
    public final ohe g;
    public final yge h;
    public final xdr i;

    public qhe(s63 s63Var, gs4 gs4Var, ohe oheVar, jyr jyrVar) {
        drf drfVar = s63Var.a;
        wfm wfmVar = (wfm) drfVar;
        wfmVar.getClass();
        this.d = new byd(wfmVar, jyrVar);
        this.e = s63Var;
        this.f = gs4Var;
        this.g = oheVar;
        yge ygeVar = (yge) drfVar;
        this.h = ygeVar;
        this.i = ydr.a(new cgt(ygeVar.d, true));
    }

    @Override // defpackage.rnq
    public final drf a() {
        return this.h;
    }

    @Override // defpackage.ayd
    public final void b(boolean z) {
        this.d.b(z);
    }

    @Override // defpackage.xmm
    public final boolean n() {
        return this.i.getValue() instanceof pgt;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // defpackage.xmm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(boolean z, cg6 cg6Var) {
        phe pheVar;
        int i;
        rj6 rj6Var;
        boolean z2 = z;
        if (cg6Var instanceof phe) {
            pheVar = (phe) cg6Var;
            int i2 = pheVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pheVar.m = i2 - Integer.MIN_VALUE;
                Object obj = pheVar.k;
                nm6 nm6Var = nm6.a;
                i = pheVar.m;
                xdr xdrVar = this.i;
                yge ygeVar = this.h;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!n()) {
                        cgt cgtVar = new cgt(ygeVar.d, true);
                        xdrVar.getClass();
                        xdrVar.m(null, cgtVar);
                    }
                    pheVar.j = z2;
                    pheVar.m = 1;
                    obj = this.g.a(ygeVar, z2, pheVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return new d73(ygeVar);
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = pheVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (rj6Var instanceof qj6) {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    if (!n()) {
                        cgt cgtVar2 = new cgt(ygeVar.d, false);
                        xdrVar.getClass();
                        xdrVar.m(null, cgtVar2);
                    }
                    ((pj6) rj6Var).a();
                    return new c73(ygeVar);
                }
                rhe rheVar = (rhe) ((qj6) rj6Var).a;
                ArrayList arrayList = rheVar.a;
                int i3 = 10;
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zge zgeVar = (zge) it.next();
                    zgeVar.getClass();
                    String str = zgeVar.a;
                    String str2 = zgeVar.b;
                    String pathForSize = kg5.M(zgeVar.c, WebPath$Storage.AVATARS).getPathForSize(wct.s());
                    ArrayList arrayList3 = zgeVar.d;
                    ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, i3));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        dhe dheVar = (dhe) it2.next();
                        dheVar.getClass();
                        lt ltVar = dheVar.a;
                        Iterator it3 = it;
                        Iterator it4 = it2;
                        String str3 = ltVar.c;
                        ArrayList arrayList5 = dheVar.b;
                        nm6 nm6Var2 = nm6Var;
                        boolean z3 = z2;
                        arrayList4.add(new ehe(new rab(str3, CollectionsKt.X(arrayList5, null, null, null, new mvd(24), 31), null, vz1.w(kg5.M(ltVar.e, WebPath$Storage.AVATARS)), ltVar.g, ltVar.d == WarningContent.EXPLICIT, dheVar.c), ltVar, arrayList5));
                        it = it3;
                        it2 = it4;
                        nm6Var = nm6Var2;
                        z2 = z3;
                    }
                    arrayList2.add(new ahe(str, str2, pathForSize, arrayList4));
                    z2 = z2;
                    i3 = 10;
                }
                boolean z4 = z2;
                nm6 nm6Var3 = nm6Var;
                boolean isEmpty = arrayList2.isEmpty();
                if (isEmpty) {
                    if (!n()) {
                        cgt cgtVar3 = new cgt(ygeVar.d, false);
                        xdrVar.getClass();
                        xdrVar.m(null, cgtVar3);
                    }
                } else {
                    if (isEmpty) {
                        b6e.s();
                        return null;
                    }
                    pgt pgtVar = new pgt(ygeVar.d, arrayList2, (ahe) CollectionsKt.Q(arrayList2));
                    xdrVar.getClass();
                    xdrVar.m(null, pgtVar);
                }
                ArrayList arrayList6 = new ArrayList(v75.o(arrayList2, 10));
                Iterator it5 = arrayList2.iterator();
                int i4 = 0;
                while (it5.hasNext()) {
                    Object next = it5.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        u75.n();
                        throw null;
                    }
                    ahe aheVar = (ahe) next;
                    arrayList6.add(new f70(aheVar.a, e70.a, i4, aheVar.d.size()));
                    i4 = i5;
                }
                this.f.N(arrayList6, rheVar.b);
                boolean isEmpty2 = arrayList2.isEmpty();
                pheVar.j = z4;
                pheVar.m = 2;
                if (this.d.a(isEmpty2, pheVar) == nm6Var3) {
                    return nm6Var3;
                }
                return new d73(ygeVar);
            }
        }
        pheVar = new phe(this, cg6Var);
        Object obj2 = pheVar.k;
        nm6 nm6Var4 = nm6.a;
        i = pheVar.m;
        xdr xdrVar2 = this.i;
        yge ygeVar2 = this.h;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (rj6Var instanceof qj6) {
        }
    }
}
