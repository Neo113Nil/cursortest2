package defpackage;

import android.os.Bundle;
import com.yandex.music.shared.media.session.common.state.a;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class mgh extends aur implements tyc {
    public /* synthetic */ rgh j;
    public /* synthetic */ h4q k;
    public /* synthetic */ n4q l;
    public /* synthetic */ y08 m;
    public final /* synthetic */ kpm n;
    public final /* synthetic */ ngh o;
    public final /* synthetic */ rdk p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgh(kpm kpmVar, ngh nghVar, rdk rdkVar, Continuation continuation) {
        super(5, continuation);
        this.n = kpmVar;
        this.o = nghVar;
        this.p = rdkVar;
    }

    @Override // defpackage.tyc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ngh nghVar = this.o;
        rdk rdkVar = this.p;
        mgh mghVar = new mgh(this.n, nghVar, rdkVar, (Continuation) obj5);
        mghVar.j = (rgh) obj;
        mghVar.k = (h4q) obj2;
        mghVar.l = (n4q) obj3;
        mghVar.m = (y08) obj4;
        return mghVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v16, types: [arf, java.lang.Object] */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3;
        Object obj2;
        ngh nghVar;
        a aVar;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        rgh rghVar = this.j;
        h4q h4qVar = this.k;
        n4q n4qVar = this.l;
        y08 y08Var = this.m;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        boolean d = Intrinsics.d(rghVar, ogh.a);
        kpm kpmVar = this.n;
        if (d) {
            kpmVar.K();
            return lgh.u;
        }
        if (rghVar instanceof qgh) {
            kpmVar.K();
            String str = ((qgh) rghVar).a;
            lgh lghVar = lgh.u;
            a aVar2 = a.f;
            a aVar3 = new a(new xfb(str));
            d8l d8lVar = d8l.b;
            d8lVar.getClass();
            int i5 = (1 & 212972) != 0 ? lghVar.a : 0;
            if ((2 & 212972) != 0) {
                aVar3 = lghVar.b;
            }
            a aVar4 = aVar3;
            a aVar5 = lghVar.c;
            hoh hohVar = lghVar.d;
            blp blpVar = lghVar.f;
            List list = lghVar.g;
            Bundle bundle = lghVar.h;
            int i6 = lghVar.i;
            int i7 = lghVar.j;
            boolean z5 = lghVar.k;
            int i8 = lghVar.l;
            boolean z6 = lghVar.m;
            boolean z7 = lghVar.n;
            h4q h4qVar2 = (212972 & 16384) != 0 ? lghVar.o : h4qVar;
            if ((32768 & 212972) != 0) {
                n4qVar = lghVar.p;
            }
            n4q n4qVar2 = n4qVar;
            int i9 = lghVar.q;
            boolean z8 = lghVar.r;
            if ((212972 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                y08Var = lghVar.s;
            }
            y08 y08Var2 = y08Var;
            String str2 = (212972 & 524288) != 0 ? lghVar.t : str;
            lghVar.getClass();
            hohVar.getClass();
            d8lVar.getClass();
            blpVar.getClass();
            list.getClass();
            bundle.getClass();
            h4qVar2.getClass();
            n4qVar2.getClass();
            y08Var2.getClass();
            return new lgh(i5, aVar4, aVar5, hohVar, d8lVar, blpVar, list, bundle, i6, i7, z5, i8, z6, z7, h4qVar2, n4qVar2, i9, z8, y08Var2, str2);
        }
        if (!(rghVar instanceof pgh)) {
            b6e.s();
            return null;
        }
        pgh pghVar = (pgh) rghVar;
        n7q n7qVar = pghVar.a;
        w0l w0lVar = pghVar.b;
        v0l v0lVar = pghVar.c;
        rnh rnhVar = pghVar.d;
        cgh cghVar = pghVar.e;
        boolean z9 = w0lVar == w0l.b || w0lVar == w0l.c;
        int ordinal = w0lVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            i = 1;
        } else {
            if (ordinal != 2) {
                b6e.s();
                return null;
            }
            i = 2;
        }
        boolean z10 = v0lVar == v0l.d && z9;
        int i10 = i;
        boolean z11 = v0lVar == v0l.b;
        int i11 = w0lVar == w0l.c ? 1 : 0;
        nyn x = v7g.x(n7qVar);
        x.getClass();
        int ordinal2 = x.ordinal();
        if (ordinal2 == 0) {
            i2 = i10;
            i3 = 0;
        } else if (ordinal2 == 1) {
            i2 = i10;
            i3 = 1;
        } else {
            if (ordinal2 != 2) {
                b6e.s();
                return null;
            }
            i2 = i10;
            i3 = 2;
        }
        boolean booleanValue = ((Boolean) wdg.A(n7qVar, fs7.i)).booleanValue();
        boolean z12 = z10;
        int F = f8g.F(n7qVar);
        mwk E = gdg.E(n7qVar);
        ngh nghVar2 = this.o;
        if (E != null) {
            wnh wnhVar = nghVar2.b;
            obj2 = null;
            co6 co6Var = (co6) dag.p(E, new h1b());
            wnhVar.getClass();
            co6Var.getClass();
            wnhVar.g.a(co6Var);
        } else {
            obj2 = null;
        }
        rdk rdkVar = this.p;
        g3i g3iVar = (g3i) rdkVar.c;
        o8q o8qVar = (o8q) rdkVar.b;
        cghVar.getClass();
        rnhVar.getClass();
        if (Intrinsics.d((n7q) rdkVar.e, n7qVar) && Intrinsics.d((cgh) rdkVar.f, cghVar) && Intrinsics.d((rnh) rdkVar.g, rnhVar)) {
            a aVar6 = (a) rdkVar.d;
            if (aVar6 == null) {
                a aVar7 = a.f;
                nghVar = nghVar2;
                aVar = new a(new anx(n7qVar, cghVar, rnhVar, o8qVar, g3iVar));
            } else {
                aVar = aVar6;
                nghVar = nghVar2;
            }
        } else {
            a aVar8 = a.f;
            nghVar = nghVar2;
            aVar = new a(new anx(n7qVar, cghVar, rnhVar, o8qVar, g3iVar));
        }
        rdkVar.d = aVar;
        rdkVar.e = n7qVar;
        rdkVar.f = cghVar;
        rdkVar.g = rnhVar;
        eoh eohVar = new eoh();
        eohVar.a = (String) wdg.A(n7qVar, d51.e);
        hoh hohVar2 = new hoh(eohVar);
        int ordinal3 = v0lVar.ordinal();
        if (ordinal3 == 0) {
            i4 = 1;
        } else if (ordinal3 == 1 || ordinal3 == 2) {
            i4 = 2;
        } else {
            i4 = 3;
            if (ordinal3 != 3) {
                b6e.s();
                return obj2;
            }
        }
        if (i4 == 1) {
            i4 = aVar.p() ? 4 : 2;
        }
        boolean b0 = o2g.b0(n7qVar.b());
        gal galVar = nghVar.c;
        boolean booleanValue2 = ((Boolean) wdg.A(n7qVar, ofc.i)).booleanValue();
        boolean booleanValue3 = ((Boolean) wdg.A(n7qVar, rwd.i)).booleanValue();
        boolean z13 = y08Var.d != null;
        galVar.getClass();
        boolean booleanValue4 = ((Boolean) wdg.A(n7qVar, d51.k)).booleanValue();
        boolean booleanValue5 = ((Boolean) wdg.A(n7qVar, kjn.g)).booleanValue();
        boolean b02 = o2g.b0(n7qVar.b());
        boolean z14 = z9;
        axk axkVar = (axk) dag.p(n7qVar.b(), aaw.f);
        axkVar.getClass();
        int ordinal4 = axkVar.ordinal();
        if (ordinal4 == 0 || ordinal4 == 1) {
            z = true;
        } else {
            if (ordinal4 != 2) {
                b6e.s();
                return obj2;
            }
            z = false;
        }
        int ordinal5 = axkVar.ordinal();
        if (ordinal5 != 0) {
            z2 = z;
            if (ordinal5 != 1 && ordinal5 != 2) {
                b6e.s();
                return obj2;
            }
            z3 = false;
        } else {
            z2 = z;
            z3 = true;
        }
        d8l d8lVar2 = gal.a;
        d8lVar2.getClass();
        boolean z15 = z3;
        ozw ozwVar = new ozw(d8lVar2);
        boolean z16 = !booleanValue2;
        ozwVar.B(7, z16);
        ozwVar.B(6, z16);
        boolean z17 = !booleanValue3;
        ozwVar.B(9, z17);
        ozwVar.B(8, z17);
        ozwVar.B(10, !z2);
        boolean z18 = !z15;
        ozwVar.B(4, z18);
        ozwVar.B(5, z18);
        ozwVar.B(11, z18);
        ozwVar.B(12, z18);
        ozwVar.B(14, !booleanValue4);
        ozwVar.B(15, !booleanValue5);
        ozwVar.B(13, !b02);
        boolean z19 = !z13;
        ozwVar.B(25, z19);
        ozwVar.B(26, z19);
        ozwVar.B(33, true);
        ozwVar.B(34, true);
        d8l d8lVar3 = new d8l(((bz2) ozwVar.b).q());
        boolean booleanValue6 = ((Boolean) wdg.A(n7qVar, b3i.g)).booleanValue();
        boolean booleanValue7 = ((Boolean) dag.p(n7qVar.b(), e88.c)).booleanValue();
        clp clpVar = nghVar.d;
        boolean z20 = d8lVar3.a(7) || d8lVar3.a(6);
        boolean z21 = d8lVar3.a(9) || d8lVar3.a(8);
        j1g j1gVar = cghVar.b;
        clpVar.getClass();
        j1gVar.getClass();
        blp blpVar2 = clpVar.b;
        blpVar2.getClass();
        HashSet hashSet = new HashSet(blpVar2.a);
        ArrayList arrayList = new ArrayList();
        int i12 = i4;
        Bundle bundle2 = new Bundle();
        ce5 ce5Var = clpVar.a;
        if (b0) {
            z4 = booleanValue6;
            arrayList.add((tb5) ce5Var.g.getValue());
            alp alpVar = (alp) ce5Var.f.getValue();
            alpVar.getClass();
            hashSet.add(alpVar);
            arrayList.add((tb5) ce5Var.i.getValue());
            alp alpVar2 = (alp) ce5Var.h.getValue();
            alpVar2.getClass();
            hashSet.add(alpVar2);
        } else {
            z4 = booleanValue6;
            arrayList.add((tb5) ce5Var.d.getValue());
            arrayList.add((tb5) ce5Var.e.getValue());
            if (!z20) {
                alp alpVar3 = (alp) ce5Var.b.getValue();
                alpVar3.getClass();
                hashSet.add(alpVar3);
            }
            if (!z21) {
                alp alpVar4 = (alp) ce5Var.c.getValue();
                alpVar4.getClass();
                hashSet.add(alpVar4);
            }
        }
        alp alpVar5 = j1gVar == j1g.a ? (alp) ce5Var.n.getValue() : (alp) ce5Var.a.getValue();
        boolean z22 = z20;
        alp alpVar6 = j1gVar == j1g.c ? (alp) ce5Var.j.getValue() : (alp) ce5Var.l.getValue();
        if (!b0 || (!z22 && !z21)) {
            arrayList.add((tb5) ce5Var.k.getValue());
            arrayList.add((tb5) ce5Var.m.getValue());
            arrayList.add((tb5) ce5Var.o.getValue());
            arrayList.add((tb5) ce5Var.p.getValue());
            if (booleanValue7) {
                alpVar6.getClass();
                hashSet.add(alpVar6);
            }
            if (z4) {
                alpVar5.getClass();
                hashSet.add(alpVar5);
            }
        }
        return new lgh(F, aVar, aVar, hohVar2, d8lVar3, new blp(hashSet), arrayList, bundle2, i12, i11, z14, i2, z12, z11, h4qVar, n4qVar, i3, booleanValue, y08Var, null);
    }
}
