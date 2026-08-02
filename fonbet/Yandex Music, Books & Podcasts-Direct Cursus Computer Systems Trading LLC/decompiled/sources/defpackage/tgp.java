package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class tgp {
    public final int a;
    public final cle b;
    public final ArrayList c;
    public boolean d;
    public boolean e;
    public final ime f;
    public ofg g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;

    public tgp(int i, cle cleVar) {
        if (i == 0) {
            throw null;
        }
        this.a = i;
        this.b = cleVar;
        this.c = new ArrayList();
        this.f = new ime(15);
    }

    public static c7t d(c7t c7tVar) {
        int[] iArr = c7tVar.a;
        List list = c7tVar.b;
        List h = u75.h(CollectionsKt.Q(list), CollectionsKt.Y(list));
        int i = c7tVar.c;
        List list2 = c7tVar.d;
        return new c7t(iArr, h, i, u75.h(Integer.valueOf(list2 != null ? ((Number) CollectionsKt.Q(list2)).intValue() : 0), Integer.valueOf(list2 != null ? ((Number) CollectionsKt.Y(list2)).intValue() : list.size() - 1)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r13v3, types: [b1k] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(g1k g1kVar, cg6 cg6Var) {
        qgp qgpVar;
        int i;
        tgp tgpVar;
        Object obj;
        boolean z;
        if (cg6Var instanceof qgp) {
            qgpVar = (qgp) cg6Var;
            int i2 = qgpVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qgpVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = qgpVar.k;
                nm6 nm6Var = nm6.a;
                i = qgpVar.m;
                if (i != 0) {
                    qgg.h0(obj2);
                    if (g1kVar instanceof a1k) {
                        qgpVar.j = this;
                        qgpVar.m = 1;
                        obj2 = b((a1k) g1kVar, qgpVar);
                        if (obj2 != nm6Var) {
                            tgpVar = this;
                            obj = (g1k) obj2;
                        }
                    } else {
                        boolean z2 = g1kVar instanceof w0k;
                        ime imeVar = this.f;
                        if (z2) {
                            obj = (w0k) g1kVar;
                            imeVar.W(null, nfg.c);
                            ArrayList arrayList = this.c;
                            if (arrayList.isEmpty()) {
                                this.d = false;
                            }
                            z75.z(arrayList, new hxo(5, new IntRange(0, 0, 1)));
                            tgpVar = this;
                        } else if (g1kVar instanceof b1k) {
                            ?? r13 = (b1k) g1kVar;
                            qgpVar.j = this;
                            qgpVar.m = 2;
                            ofg ofgVar = this.g;
                            ofg Z = imeVar.Z();
                            ofg ofgVar2 = r13.a;
                            ofg ofgVar3 = r13.b;
                            if (!Z.equals(ofgVar2) || !Intrinsics.d(ofgVar, ofgVar3)) {
                                imeVar.V(ofgVar2);
                                this.g = ofgVar3;
                                if (ofgVar3 != null) {
                                    qu2 qu2Var = ofgVar3.b;
                                    if (qu2Var.a) {
                                        if (!Intrinsics.d(ofgVar != null ? ofgVar.b : null, qu2Var)) {
                                            a1k a1kVar = a1k.g;
                                            c5b c5bVar = c5b.a;
                                            int i3 = this.h;
                                            c5bVar.getClass();
                                            r13 = b(new a1k(pfg.b, c5bVar, i3, -1, ofgVar2, ofgVar3), qgpVar);
                                        }
                                    }
                                }
                                if (ofgVar3 != null) {
                                    qu2 qu2Var2 = ofgVar3.c;
                                    if (qu2Var2.a) {
                                        if (!Intrinsics.d(ofgVar != null ? ofgVar.c : null, qu2Var2)) {
                                            a1k a1kVar2 = a1k.g;
                                            c5b c5bVar2 = c5b.a;
                                            int i4 = this.i;
                                            c5bVar2.getClass();
                                            r13 = b(new a1k(pfg.c, c5bVar2, -1, i4, ofgVar2, ofgVar3), qgpVar);
                                        }
                                    }
                                }
                            }
                            obj2 = r13;
                            if (obj2 != nm6Var) {
                                tgpVar = this;
                                obj = (g1k) obj2;
                            }
                        } else {
                            if (!(g1kVar instanceof f1k)) {
                                b6e.s();
                                return null;
                            }
                            qgpVar.j = this;
                            qgpVar.m = 3;
                            obj2 = c((f1k) g1kVar, qgpVar);
                            if (obj2 != nm6Var) {
                                tgpVar = this;
                                obj = (g1k) obj2;
                            }
                        }
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    tgpVar = qgpVar.j;
                    qgg.h0(obj2);
                    obj = (g1k) obj2;
                } else if (i == 2) {
                    tgpVar = qgpVar.j;
                    qgg.h0(obj2);
                    obj = (g1k) obj2;
                } else {
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tgpVar = qgpVar.j;
                    qgg.h0(obj2);
                    obj = (g1k) obj2;
                }
                z = tgpVar.d;
                ArrayList arrayList2 = tgpVar.c;
                if (!z && !arrayList2.isEmpty()) {
                    xq0.q("deferred endTerm, page stash should be empty");
                    return null;
                }
                if (tgpVar.e || arrayList2.isEmpty()) {
                    return obj;
                }
                xq0.q("deferred startTerm, page stash should be empty");
                return null;
            }
        }
        qgpVar = new qgp(this, cg6Var);
        Object obj22 = qgpVar.k;
        nm6 nm6Var2 = nm6.a;
        i = qgpVar.m;
        if (i != 0) {
        }
        z = tgpVar.d;
        ArrayList arrayList22 = tgpVar.c;
        if (!z) {
        }
        if (tgpVar.e) {
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0676  */
    /* JADX WARN: Type inference failed for: r1v73, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x0455 -> B:121:0x045c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x073d -> B:28:0x073e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0653 -> B:60:0x065b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(a1k a1kVar, cg6 cg6Var) {
        rgp rgpVar;
        int i;
        boolean z;
        boolean z2;
        int i2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z3;
        c7t c7tVar;
        Integer num;
        c7t c7tVar2;
        Integer num2;
        pfg pfgVar;
        tgp tgpVar;
        c7t c7tVar3;
        c7t c7tVar4;
        boolean z4;
        Integer num3;
        ArrayList arrayList4;
        boolean z5;
        boolean z6;
        tgp tgpVar2;
        pfg pfgVar2;
        tgp tgpVar3;
        rgp rgpVar2;
        a1k a1kVar2;
        c7t c7tVar5;
        ArrayList arrayList5;
        ArrayList arrayList6;
        Integer num4;
        Integer num5;
        a1k a1kVar3;
        int i3;
        c7t c7tVar6;
        int i4;
        pfg pfgVar3;
        boolean z7;
        int i5;
        ArrayList arrayList7;
        a1k a1kVar4;
        tgp tgpVar4;
        Integer num6;
        c7t c7tVar7;
        c7t c7tVar8;
        tgp tgpVar5;
        Object obj;
        ArrayList arrayList8;
        pfg pfgVar4;
        int i6;
        c7t c7tVar9;
        boolean z8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        Iterator it;
        Object next;
        Iterator it2;
        c7t c7tVar10;
        Integer num7;
        ArrayList arrayList11;
        ArrayList arrayList12;
        a1k a1kVar5;
        tgp tgpVar6;
        c7t c7tVar11;
        a1k a1kVar6;
        tgp tgpVar7;
        pfg pfgVar5;
        c7t c7tVar12;
        int i7;
        Object obj2;
        boolean z9;
        ArrayList arrayList13;
        ArrayList arrayList14;
        c7t c7tVar13;
        Integer num8;
        ArrayList arrayList15;
        c7t c7tVar14;
        Iterator it3;
        c7t c7tVar15;
        c7t c7tVar16;
        ArrayList arrayList16;
        Integer num9;
        int i8;
        pfg pfgVar6;
        Object T;
        ArrayList arrayList17;
        a1k a1kVar7;
        Integer num10;
        pfg pfgVar7;
        pfg pfgVar8;
        int i9;
        int i10;
        int i11;
        int i12;
        int intValue;
        c7t c7tVar17;
        ArrayList arrayList18;
        Object obj3;
        Integer num11;
        c7t c7tVar18;
        c7t c7tVar19;
        int intValue2;
        int g;
        boolean z10;
        tgp tgpVar8;
        ArrayList arrayList19;
        int i13;
        a1k a1kVar8;
        ArrayList arrayList20;
        int i14;
        int i15;
        ArrayList arrayList21;
        ArrayList arrayList22;
        ArrayList arrayList23;
        c7t c7tVar20;
        ArrayList arrayList24;
        pfg pfgVar9;
        a1k a1kVar9 = a1kVar;
        if (cg6Var instanceof rgp) {
            rgpVar = (rgp) cg6Var;
            int i16 = rgpVar.z;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                rgpVar.z = i16 - Integer.MIN_VALUE;
                Object obj4 = rgpVar.x;
                nm6 nm6Var = nm6.a;
                i = rgpVar.z;
                pfg pfgVar10 = pfg.b;
                pfg pfgVar11 = pfg.c;
                switch (i) {
                    case 0:
                        qgg.h0(obj4);
                        a1kVar9.getClass();
                        ofg ofgVar = a1kVar9.f;
                        ofg ofgVar2 = a1kVar9.e;
                        pfg pfgVar12 = a1kVar9.a;
                        List list = a1kVar9.b;
                        int i17 = this.a;
                        if (i17 == 0) {
                            throw null;
                        }
                        if (pfgVar12 == pfgVar11) {
                            z = this.e;
                        } else {
                            int D = ouj.D(i17);
                            if (D == 0) {
                                z = ofgVar2.b.a && (ofgVar == null || ofgVar.b.a);
                            } else {
                                if (D != 1) {
                                    b6e.s();
                                    return null;
                                }
                                z = ofgVar2.b.a;
                            }
                        }
                        if (i17 == 0) {
                            throw null;
                        }
                        if (pfgVar12 == pfgVar10) {
                            z2 = this.d;
                        } else {
                            int D2 = ouj.D(i17);
                            if (D2 == 0) {
                                z2 = ofgVar2.c.a && (ofgVar == null || ofgVar.c.a);
                            } else {
                                if (D2 != 1) {
                                    b6e.s();
                                    return null;
                                }
                                z2 = ofgVar2.c.a;
                            }
                        }
                        List list2 = list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator it4 = list2.iterator();
                            while (it4.hasNext()) {
                                if (!((c7t) it4.next()).b.isEmpty()) {
                                    i2 = 0;
                                    if (!this.k && pfgVar12 == pfgVar10 && i2 == 0) {
                                        xq0.x("Additional prepend event after prepend state is done");
                                        return null;
                                    }
                                    if (!this.j && pfgVar12 == pfgVar11 && i2 == 0) {
                                        xq0.x("Additional append event after append state is done");
                                        return null;
                                    }
                                    this.f.V(ofgVar2);
                                    this.g = ofgVar;
                                    if (pfgVar12 != pfgVar11) {
                                        this.h = a1kVar9.c;
                                    }
                                    if (pfgVar12 != pfgVar10) {
                                        this.i = a1kVar9.d;
                                    }
                                    cle cleVar = this.b;
                                    ArrayList arrayList25 = this.c;
                                    if (i2 != 0) {
                                        if ((z || z2) && (!this.k || !this.j)) {
                                            if (arrayList25.isEmpty()) {
                                                if (z && z2 && !this.k && !this.j) {
                                                    rgpVar.j = this;
                                                    rgpVar.k = a1kVar9;
                                                    z6 = true;
                                                    rgpVar.z = 1;
                                                    obj4 = cleVar.invoke(null, null, rgpVar);
                                                    if (obj4 != nm6Var) {
                                                        tgpVar2 = this;
                                                        tgpVar2.d = false;
                                                        tgpVar2.e = false;
                                                        tgpVar2.k = z6;
                                                        tgpVar2.j = z6;
                                                        if (obj4 == null) {
                                                            return new a1k(a1kVar9.a, t75.c(new c7t(new int[]{0}, t75.c(obj4), 0, t75.c(0))), a1kVar9.c, a1kVar9.d, a1kVar9.e, a1kVar9.f);
                                                        }
                                                        a1kVar9.getClass();
                                                        return a1kVar9;
                                                    }
                                                    return nm6Var;
                                                }
                                                if (!z2 || this.j) {
                                                    z5 = true;
                                                } else {
                                                    z5 = true;
                                                    this.d = true;
                                                }
                                                if (z && !this.k) {
                                                    this.e = z5;
                                                }
                                            }
                                        }
                                        return a1kVar9;
                                    }
                                    arrayList = new ArrayList(list.size());
                                    arrayList2 = new ArrayList(list.size());
                                    if (i2 != 0) {
                                        int i18 = 0;
                                        while (i18 < list.size() - 1 && ((c7t) list.get(i18)).b.isEmpty()) {
                                            i18++;
                                        }
                                        num2 = new Integer(i18);
                                        c7tVar2 = (c7t) list.get(i18);
                                        arrayList3 = arrayList25;
                                        int size = list.size() - 1;
                                        while (true) {
                                            if (size > 0) {
                                                z3 = z;
                                                if (((c7t) list.get(size)).b.isEmpty()) {
                                                    size--;
                                                    z = z3;
                                                }
                                            } else {
                                                z3 = z;
                                            }
                                        }
                                        num = new Integer(size);
                                        c7tVar = (c7t) list.get(size);
                                    } else {
                                        arrayList3 = arrayList25;
                                        z3 = z;
                                        c7tVar = null;
                                        num = null;
                                        c7tVar2 = null;
                                        num2 = null;
                                    }
                                    if (!z3 && !this.k) {
                                        this.k = true;
                                        if (i2 != 0) {
                                            c7tVar3 = (c7t) CollectionsKt.Q(arrayList3);
                                        } else {
                                            c7tVar2.getClass();
                                            c7tVar3 = c7tVar2;
                                        }
                                        pfgVar = pfgVar10;
                                        Object Q = CollectionsKt.Q(c7tVar3.b);
                                        rgpVar.j = this;
                                        rgpVar.k = a1kVar9;
                                        rgpVar.l = arrayList;
                                        rgpVar.m = arrayList2;
                                        rgpVar.n = c7tVar2;
                                        rgpVar.o = num2;
                                        rgpVar.p = c7tVar;
                                        rgpVar.q = num;
                                        rgpVar.r = c7tVar3;
                                        rgpVar.s = arrayList;
                                        rgpVar.t = z2;
                                        rgpVar.u = i2;
                                        rgpVar.z = 2;
                                        obj4 = cleVar.invoke(null, Q, rgpVar);
                                        if (obj4 != nm6Var) {
                                            Integer num12 = num;
                                            c7tVar4 = c7tVar;
                                            z4 = z2;
                                            num3 = num12;
                                            tgpVar = this;
                                            arrayList4 = arrayList;
                                            Object obj5 = obj4;
                                            int i19 = c7tVar3.c;
                                            List list3 = c7tVar3.d;
                                            qgg.C(arrayList4, obj5, null, c7tVar3, i19, list3 == null ? ((Number) CollectionsKt.Q(list3)).intValue() : 0);
                                            Integer num13 = num3;
                                            z2 = z4;
                                            c7tVar = c7tVar4;
                                            num = num13;
                                            if (i2 == 0) {
                                            }
                                        }
                                        return nm6Var;
                                    }
                                    pfgVar = pfgVar10;
                                    tgpVar = this;
                                    if (i2 == 0) {
                                        pfgVar2 = pfgVar11;
                                        rgp rgpVar3 = rgpVar;
                                        tgpVar3 = tgpVar;
                                        rgpVar2 = rgpVar3;
                                        a1kVar2 = a1kVar9;
                                        c7tVar5 = c7tVar;
                                        arrayList5 = arrayList;
                                        arrayList6 = arrayList2;
                                        if (z2) {
                                        }
                                        arrayList21 = arrayList5;
                                        tgpVar3.d = false;
                                        tgpVar3.e = false;
                                        pfgVar9 = a1kVar2.a;
                                        ArrayList arrayList26 = tgpVar3.c;
                                        if (pfgVar9 == pfgVar2) {
                                        }
                                        return new a1k(a1kVar2.a, arrayList21, a1kVar2.c, a1kVar2.d, a1kVar2.e, a1kVar2.f);
                                    }
                                    num2.getClass();
                                    int intValue3 = num2.intValue();
                                    num4 = num;
                                    num5 = num2;
                                    a1kVar3 = a1kVar9;
                                    i3 = intValue3;
                                    c7tVar6 = c7tVar;
                                    i4 = 0;
                                    if (i4 < i3) {
                                        c7t c7tVar21 = (c7t) a1kVar3.b.get(i4);
                                        pfgVar4 = pfgVar11;
                                        cle cleVar2 = tgpVar.b;
                                        rgpVar.j = tgpVar;
                                        rgpVar.k = a1kVar3;
                                        rgpVar.l = arrayList;
                                        rgpVar.m = arrayList2;
                                        rgpVar.n = c7tVar2;
                                        rgpVar.o = num5;
                                        rgpVar.p = c7tVar6;
                                        rgpVar.q = num4;
                                        rgpVar.r = arrayList;
                                        Integer num14 = num4;
                                        rgpVar.s = null;
                                        rgpVar.t = z2;
                                        rgpVar.u = i2;
                                        rgpVar.v = i4;
                                        rgpVar.w = i3;
                                        rgpVar.z = 3;
                                        Object T2 = qgg.T(c7tVar21, cleVar2, rgpVar);
                                        if (T2 != nm6Var) {
                                            i6 = i2;
                                            num4 = num14;
                                            c7tVar9 = c7tVar6;
                                            obj4 = T2;
                                            z8 = z2;
                                            arrayList9 = arrayList;
                                            arrayList9.add(obj4);
                                            i4++;
                                            z2 = z8;
                                            c7tVar6 = c7tVar9;
                                            i2 = i6;
                                            pfgVar11 = pfgVar4;
                                            if (i4 < i3) {
                                                Integer num15 = num4;
                                                pfgVar3 = pfgVar11;
                                                if (a1kVar3.a != pfgVar3 || tgpVar.c.isEmpty()) {
                                                    z7 = z2;
                                                    i5 = i2;
                                                    arrayList7 = arrayList2;
                                                    a1kVar4 = a1kVar3;
                                                    tgpVar4 = tgpVar;
                                                    num6 = num15;
                                                    c7tVar7 = c7tVar6;
                                                    c7tVar2.getClass();
                                                    tgpVar4.getClass();
                                                    arrayList7.add(d(c7tVar2));
                                                    cle cleVar3 = tgpVar4.b;
                                                    rgpVar.j = tgpVar4;
                                                    rgpVar.k = a1kVar4;
                                                    rgpVar.l = arrayList;
                                                    rgpVar.m = arrayList7;
                                                    rgpVar.n = num5;
                                                    rgpVar.o = c7tVar7;
                                                    rgpVar.p = num6;
                                                    rgpVar.q = arrayList;
                                                    rgpVar.r = null;
                                                    rgpVar.s = null;
                                                    rgpVar.t = z7;
                                                    rgpVar.u = i5;
                                                    rgpVar.z = 5;
                                                    obj4 = qgg.T(c7tVar2, cleVar3, rgpVar);
                                                    if (obj4 != nm6Var) {
                                                        arrayList10 = arrayList;
                                                        arrayList.add(obj4);
                                                        List list4 = a1kVar4.b;
                                                        int intValue4 = num5.intValue();
                                                        num6.getClass();
                                                        it = list4.subList(intValue4, num6.intValue() + 1).iterator();
                                                        if (it.hasNext()) {
                                                            qq6.d("Empty collection can't be reduced.");
                                                            return null;
                                                        }
                                                        next = it.next();
                                                        c7t c7tVar22 = c7tVar7;
                                                        it2 = it;
                                                        c7tVar10 = c7tVar22;
                                                        num7 = num6;
                                                        arrayList11 = arrayList7;
                                                        arrayList12 = arrayList10;
                                                        a1kVar5 = a1kVar4;
                                                        tgpVar6 = tgpVar4;
                                                        if (it2.hasNext()) {
                                                            c7tVar11 = (c7t) it2.next();
                                                            c7t c7tVar23 = (c7t) next;
                                                            if (c7tVar11.b.isEmpty()) {
                                                                pfgVar5 = pfgVar3;
                                                                tgp tgpVar9 = tgpVar6;
                                                                c7tVar14 = c7tVar10;
                                                                i8 = i5;
                                                                tgpVar7 = tgpVar9;
                                                                num9 = num7;
                                                                arrayList15 = arrayList11;
                                                                arrayList16 = arrayList12;
                                                                c7tVar15 = c7tVar11;
                                                                it3 = it2;
                                                                c7tVar16 = c7tVar23;
                                                                pfgVar6 = pfgVar;
                                                                if (!c7tVar15.b.isEmpty()) {
                                                                }
                                                                cle cleVar4 = tgpVar7.b;
                                                                rgpVar.j = tgpVar7;
                                                                rgpVar.k = a1kVar5;
                                                                rgpVar.l = arrayList16;
                                                                rgpVar.m = arrayList15;
                                                                rgpVar.n = c7tVar14;
                                                                rgpVar.o = num9;
                                                                rgpVar.p = it3;
                                                                rgpVar.q = c7tVar15;
                                                                rgpVar.r = c7tVar16;
                                                                rgpVar.s = arrayList16;
                                                                rgpVar.t = z7;
                                                                rgpVar.u = i8;
                                                                rgpVar.z = 7;
                                                                T = qgg.T(c7tVar15, cleVar4, rgpVar);
                                                                if (T != nm6Var) {
                                                                }
                                                            } else {
                                                                cle cleVar5 = tgpVar6.b;
                                                                Object Y = CollectionsKt.Y(c7tVar23.b);
                                                                pfgVar5 = pfgVar3;
                                                                Object Q2 = CollectionsKt.Q(c7tVar11.b);
                                                                rgpVar.j = tgpVar6;
                                                                rgpVar.k = a1kVar5;
                                                                rgpVar.l = arrayList12;
                                                                rgpVar.m = arrayList11;
                                                                rgpVar.n = c7tVar10;
                                                                rgpVar.o = num7;
                                                                rgpVar.p = it2;
                                                                rgpVar.q = c7tVar11;
                                                                rgpVar.r = c7tVar23;
                                                                rgpVar.s = null;
                                                                rgpVar.t = z7;
                                                                rgpVar.u = i5;
                                                                rgpVar.z = 6;
                                                                Object invoke = cleVar5.invoke(Y, Q2, rgpVar);
                                                                if (invoke != nm6Var) {
                                                                    c7tVar12 = c7tVar23;
                                                                    obj2 = invoke;
                                                                    z9 = z7;
                                                                    arrayList13 = arrayList12;
                                                                    a1kVar6 = a1kVar5;
                                                                    c7tVar13 = c7tVar10;
                                                                    i7 = i5;
                                                                    num8 = num7;
                                                                    tgpVar7 = tgpVar6;
                                                                    arrayList14 = arrayList11;
                                                                    c7t c7tVar24 = c7tVar11;
                                                                    Iterator it5 = it2;
                                                                    pfgVar7 = a1kVar6.a;
                                                                    pfgVar8 = pfgVar;
                                                                    if (pfgVar7 != pfgVar8) {
                                                                        i9 = i7;
                                                                        i10 = c7tVar12.c;
                                                                    } else {
                                                                        i9 = i7;
                                                                        i10 = c7tVar24.c;
                                                                    }
                                                                    if (pfgVar7 != pfgVar8) {
                                                                        List list5 = c7tVar24.d;
                                                                        if (list5 != null) {
                                                                            intValue = ((Number) CollectionsKt.Q(list5)).intValue();
                                                                        } else {
                                                                            i11 = i10;
                                                                            pfgVar = pfgVar8;
                                                                            i12 = 0;
                                                                            qgg.C(arrayList13, obj2, c7tVar12, c7tVar24, i11, i12);
                                                                            ArrayList arrayList27 = arrayList14;
                                                                            c7tVar14 = c7tVar13;
                                                                            a1kVar5 = a1kVar6;
                                                                            arrayList15 = arrayList27;
                                                                            i8 = i9;
                                                                            c7tVar16 = c7tVar12;
                                                                            num9 = num8;
                                                                            it3 = it5;
                                                                            c7tVar15 = c7tVar24;
                                                                            arrayList16 = arrayList13;
                                                                            z7 = z9;
                                                                            pfgVar6 = pfgVar;
                                                                            if (!c7tVar15.b.isEmpty()) {
                                                                                tgpVar7.getClass();
                                                                                arrayList15.add(d(c7tVar15));
                                                                            }
                                                                            cle cleVar42 = tgpVar7.b;
                                                                            rgpVar.j = tgpVar7;
                                                                            rgpVar.k = a1kVar5;
                                                                            rgpVar.l = arrayList16;
                                                                            rgpVar.m = arrayList15;
                                                                            rgpVar.n = c7tVar14;
                                                                            rgpVar.o = num9;
                                                                            rgpVar.p = it3;
                                                                            rgpVar.q = c7tVar15;
                                                                            rgpVar.r = c7tVar16;
                                                                            rgpVar.s = arrayList16;
                                                                            rgpVar.t = z7;
                                                                            rgpVar.u = i8;
                                                                            rgpVar.z = 7;
                                                                            T = qgg.T(c7tVar15, cleVar42, rgpVar);
                                                                            if (T != nm6Var) {
                                                                                tgp tgpVar10 = tgpVar7;
                                                                                i5 = i8;
                                                                                c7tVar10 = c7tVar14;
                                                                                tgpVar6 = tgpVar10;
                                                                                arrayList17 = arrayList16;
                                                                                a1kVar7 = a1kVar5;
                                                                                num10 = num9;
                                                                                arrayList16.add(T);
                                                                                if (!c7tVar15.b.isEmpty()) {
                                                                                    c7tVar16 = c7tVar15;
                                                                                }
                                                                                num7 = num10;
                                                                                arrayList11 = arrayList15;
                                                                                a1kVar5 = a1kVar7;
                                                                                pfgVar3 = pfgVar5;
                                                                                pfgVar = pfgVar6;
                                                                                next = c7tVar16;
                                                                                it2 = it3;
                                                                                arrayList12 = arrayList17;
                                                                                if (it2.hasNext()) {
                                                                                    pfgVar2 = pfgVar3;
                                                                                    if (a1kVar5.a != pfgVar || tgpVar6.c.isEmpty()) {
                                                                                        z2 = z7;
                                                                                        c7tVar17 = c7tVar10;
                                                                                        arrayList18 = arrayList12;
                                                                                        i2 = i5;
                                                                                        intValue2 = num7.intValue() + 1;
                                                                                        g = u75.g(a1kVar5.b);
                                                                                        if (intValue2 > g) {
                                                                                            arrayList5 = arrayList18;
                                                                                            rgpVar2 = rgpVar;
                                                                                            a1kVar2 = a1kVar5;
                                                                                            tgpVar3 = tgpVar6;
                                                                                            c7tVar5 = c7tVar17;
                                                                                            arrayList6 = arrayList11;
                                                                                            if (z2) {
                                                                                            }
                                                                                            arrayList21 = arrayList5;
                                                                                            tgpVar3.d = false;
                                                                                            tgpVar3.e = false;
                                                                                            pfgVar9 = a1kVar2.a;
                                                                                            ArrayList arrayList262 = tgpVar3.c;
                                                                                            if (pfgVar9 == pfgVar2) {
                                                                                            }
                                                                                            return new a1k(a1kVar2.a, arrayList21, a1kVar2.c, a1kVar2.d, a1kVar2.e, a1kVar2.f);
                                                                                        }
                                                                                        ArrayList arrayList28 = arrayList11;
                                                                                        z10 = z2;
                                                                                        tgpVar8 = tgpVar6;
                                                                                        arrayList19 = arrayList28;
                                                                                        i13 = i2;
                                                                                        a1kVar8 = a1kVar5;
                                                                                        arrayList20 = arrayList18;
                                                                                        c7tVar5 = c7tVar17;
                                                                                        i14 = intValue2;
                                                                                        i15 = g;
                                                                                        c7t c7tVar25 = (c7t) a1kVar8.b.get(i14);
                                                                                        cle cleVar6 = tgpVar8.b;
                                                                                        rgpVar.j = tgpVar8;
                                                                                        rgpVar.k = a1kVar8;
                                                                                        rgpVar.l = arrayList20;
                                                                                        rgpVar.m = arrayList19;
                                                                                        rgpVar.n = c7tVar5;
                                                                                        rgpVar.o = arrayList20;
                                                                                        rgpVar.p = null;
                                                                                        rgpVar.q = null;
                                                                                        rgpVar.r = null;
                                                                                        rgpVar.s = null;
                                                                                        rgpVar.t = z10;
                                                                                        rgpVar.u = i13;
                                                                                        rgpVar.v = i14;
                                                                                        rgpVar.w = i15;
                                                                                        rgpVar.z = 9;
                                                                                        obj4 = qgg.T(c7tVar25, cleVar6, rgpVar);
                                                                                        if (obj4 != nm6Var) {
                                                                                            arrayList24 = arrayList20;
                                                                                            arrayList20.add(obj4);
                                                                                            if (i14 == i15) {
                                                                                                i14++;
                                                                                                arrayList20 = arrayList24;
                                                                                                c7t c7tVar252 = (c7t) a1kVar8.b.get(i14);
                                                                                                cle cleVar62 = tgpVar8.b;
                                                                                                rgpVar.j = tgpVar8;
                                                                                                rgpVar.k = a1kVar8;
                                                                                                rgpVar.l = arrayList20;
                                                                                                rgpVar.m = arrayList19;
                                                                                                rgpVar.n = c7tVar5;
                                                                                                rgpVar.o = arrayList20;
                                                                                                rgpVar.p = null;
                                                                                                rgpVar.q = null;
                                                                                                rgpVar.r = null;
                                                                                                rgpVar.s = null;
                                                                                                rgpVar.t = z10;
                                                                                                rgpVar.u = i13;
                                                                                                rgpVar.v = i14;
                                                                                                rgpVar.w = i15;
                                                                                                rgpVar.z = 9;
                                                                                                obj4 = qgg.T(c7tVar252, cleVar62, rgpVar);
                                                                                                if (obj4 != nm6Var) {
                                                                                                }
                                                                                            } else {
                                                                                                rgpVar2 = rgpVar;
                                                                                                i2 = i13;
                                                                                                a1kVar2 = a1kVar8;
                                                                                                tgpVar3 = tgpVar8;
                                                                                                z2 = z10;
                                                                                                arrayList6 = arrayList19;
                                                                                                arrayList5 = arrayList24;
                                                                                                if (z2 || tgpVar3.j) {
                                                                                                    arrayList21 = arrayList5;
                                                                                                    tgpVar3.d = false;
                                                                                                    tgpVar3.e = false;
                                                                                                    pfgVar9 = a1kVar2.a;
                                                                                                    ArrayList arrayList2622 = tgpVar3.c;
                                                                                                    if (pfgVar9 == pfgVar2) {
                                                                                                        arrayList2622.addAll(arrayList6);
                                                                                                    } else {
                                                                                                        arrayList2622.addAll(0, arrayList6);
                                                                                                    }
                                                                                                    return new a1k(a1kVar2.a, arrayList21, a1kVar2.c, a1kVar2.d, a1kVar2.e, a1kVar2.f);
                                                                                                }
                                                                                                tgpVar3.j = true;
                                                                                                if (i2 != 0) {
                                                                                                    c7tVar5 = (c7t) CollectionsKt.Y(tgpVar3.c);
                                                                                                } else {
                                                                                                    c7tVar5.getClass();
                                                                                                }
                                                                                                cle cleVar7 = tgpVar3.b;
                                                                                                Object Y2 = CollectionsKt.Y(c7tVar5.b);
                                                                                                rgpVar2.j = tgpVar3;
                                                                                                rgpVar2.k = a1kVar2;
                                                                                                rgpVar2.l = arrayList5;
                                                                                                rgpVar2.m = arrayList6;
                                                                                                rgpVar2.n = c7tVar5;
                                                                                                rgpVar2.o = arrayList5;
                                                                                                rgpVar2.p = null;
                                                                                                rgpVar2.q = null;
                                                                                                rgpVar2.r = null;
                                                                                                rgpVar2.s = null;
                                                                                                rgpVar2.z = 10;
                                                                                                obj4 = cleVar7.invoke(Y2, null, rgpVar2);
                                                                                                if (obj4 != nm6Var) {
                                                                                                    arrayList22 = arrayList5;
                                                                                                    arrayList23 = arrayList22;
                                                                                                    c7tVar20 = c7tVar5;
                                                                                                    Object obj6 = obj4;
                                                                                                    int i20 = c7tVar20.c;
                                                                                                    List list6 = c7tVar20.d;
                                                                                                    qgg.C(arrayList23, obj6, c7tVar20, null, i20, list6 == null ? ((Number) CollectionsKt.Y(list6)).intValue() : u75.g(c7tVar20.b));
                                                                                                    arrayList21 = arrayList22;
                                                                                                    tgpVar3.d = false;
                                                                                                    tgpVar3.e = false;
                                                                                                    pfgVar9 = a1kVar2.a;
                                                                                                    ArrayList arrayList26222 = tgpVar3.c;
                                                                                                    if (pfgVar9 == pfgVar2) {
                                                                                                    }
                                                                                                    return new a1k(a1kVar2.a, arrayList21, a1kVar2.c, a1kVar2.d, a1kVar2.e, a1kVar2.f);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        c7t c7tVar26 = (c7t) CollectionsKt.Q(tgpVar6.c);
                                                                                        cle cleVar8 = tgpVar6.b;
                                                                                        c7tVar10.getClass();
                                                                                        Object Y3 = CollectionsKt.Y(c7tVar10.b);
                                                                                        Object Q3 = CollectionsKt.Q(c7tVar26.b);
                                                                                        rgpVar.j = tgpVar6;
                                                                                        rgpVar.k = a1kVar5;
                                                                                        rgpVar.l = arrayList12;
                                                                                        rgpVar.m = arrayList11;
                                                                                        rgpVar.n = c7tVar10;
                                                                                        rgpVar.o = num7;
                                                                                        rgpVar.p = c7tVar26;
                                                                                        rgpVar.q = null;
                                                                                        rgpVar.r = null;
                                                                                        rgpVar.s = null;
                                                                                        rgpVar.t = z7;
                                                                                        rgpVar.u = i5;
                                                                                        rgpVar.z = 8;
                                                                                        Object invoke2 = cleVar8.invoke(Y3, Q3, rgpVar);
                                                                                        if (invoke2 != nm6Var) {
                                                                                            obj3 = invoke2;
                                                                                            num11 = num7;
                                                                                            c7tVar18 = c7tVar26;
                                                                                            c7tVar19 = c7tVar10;
                                                                                            boolean z11 = z7;
                                                                                            ArrayList arrayList29 = arrayList12;
                                                                                            int i21 = c7tVar19.c;
                                                                                            List list7 = c7tVar19.d;
                                                                                            qgg.C(arrayList29, obj3, c7tVar19, c7tVar18, i21, list7 == null ? ((Number) CollectionsKt.Y(list7)).intValue() : u75.g(c7tVar19.b));
                                                                                            z2 = z11;
                                                                                            num7 = num11;
                                                                                            arrayList18 = arrayList29;
                                                                                            c7tVar17 = c7tVar19;
                                                                                            i2 = i5;
                                                                                            intValue2 = num7.intValue() + 1;
                                                                                            g = u75.g(a1kVar5.b);
                                                                                            if (intValue2 > g) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        List list8 = c7tVar12.d;
                                                                        intValue = list8 != null ? ((Number) CollectionsKt.Y(list8)).intValue() : u75.g(c7tVar12.b);
                                                                    }
                                                                    pfgVar = pfgVar8;
                                                                    i12 = intValue;
                                                                    i11 = i10;
                                                                    qgg.C(arrayList13, obj2, c7tVar12, c7tVar24, i11, i12);
                                                                    ArrayList arrayList272 = arrayList14;
                                                                    c7tVar14 = c7tVar13;
                                                                    a1kVar5 = a1kVar6;
                                                                    arrayList15 = arrayList272;
                                                                    i8 = i9;
                                                                    c7tVar16 = c7tVar12;
                                                                    num9 = num8;
                                                                    it3 = it5;
                                                                    c7tVar15 = c7tVar24;
                                                                    arrayList16 = arrayList13;
                                                                    z7 = z9;
                                                                    pfgVar6 = pfgVar;
                                                                    if (!c7tVar15.b.isEmpty()) {
                                                                    }
                                                                    cle cleVar422 = tgpVar7.b;
                                                                    rgpVar.j = tgpVar7;
                                                                    rgpVar.k = a1kVar5;
                                                                    rgpVar.l = arrayList16;
                                                                    rgpVar.m = arrayList15;
                                                                    rgpVar.n = c7tVar14;
                                                                    rgpVar.o = num9;
                                                                    rgpVar.p = it3;
                                                                    rgpVar.q = c7tVar15;
                                                                    rgpVar.r = c7tVar16;
                                                                    rgpVar.s = arrayList16;
                                                                    rgpVar.t = z7;
                                                                    rgpVar.u = i8;
                                                                    rgpVar.z = 7;
                                                                    T = qgg.T(c7tVar15, cleVar422, rgpVar);
                                                                    if (T != nm6Var) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    c7t c7tVar27 = (c7t) CollectionsKt.Y(tgpVar.c);
                                                    cle cleVar9 = tgpVar.b;
                                                    Object Y4 = CollectionsKt.Y(c7tVar27.b);
                                                    c7tVar2.getClass();
                                                    Object Q4 = CollectionsKt.Q(c7tVar2.b);
                                                    rgpVar.j = tgpVar;
                                                    rgpVar.k = a1kVar3;
                                                    rgpVar.l = arrayList;
                                                    rgpVar.m = arrayList2;
                                                    rgpVar.n = c7tVar2;
                                                    rgpVar.o = num5;
                                                    rgpVar.p = c7tVar6;
                                                    tgp tgpVar11 = tgpVar;
                                                    rgpVar.q = num15;
                                                    rgpVar.r = c7tVar27;
                                                    rgpVar.s = null;
                                                    rgpVar.t = z2;
                                                    rgpVar.u = i2;
                                                    rgpVar.z = 4;
                                                    Object invoke3 = cleVar9.invoke(Y4, Q4, rgpVar);
                                                    if (invoke3 != nm6Var) {
                                                        c7tVar8 = c7tVar27;
                                                        z7 = z2;
                                                        tgpVar5 = tgpVar11;
                                                        num6 = num15;
                                                        obj = invoke3;
                                                        c7tVar7 = c7tVar6;
                                                        arrayList8 = arrayList;
                                                        int i22 = c7tVar2.c;
                                                        List list9 = c7tVar2.d;
                                                        c7t c7tVar28 = c7tVar2;
                                                        qgg.C(arrayList8, obj, c7tVar8, c7tVar28, i22, list9 == null ? ((Number) CollectionsKt.Q(list9)).intValue() : 0);
                                                        a1k a1kVar10 = a1kVar3;
                                                        tgpVar4 = tgpVar5;
                                                        i5 = i2;
                                                        arrayList7 = arrayList2;
                                                        a1kVar4 = a1kVar10;
                                                        arrayList = arrayList8;
                                                        c7tVar2 = c7tVar28;
                                                        c7tVar2.getClass();
                                                        tgpVar4.getClass();
                                                        arrayList7.add(d(c7tVar2));
                                                        cle cleVar32 = tgpVar4.b;
                                                        rgpVar.j = tgpVar4;
                                                        rgpVar.k = a1kVar4;
                                                        rgpVar.l = arrayList;
                                                        rgpVar.m = arrayList7;
                                                        rgpVar.n = num5;
                                                        rgpVar.o = c7tVar7;
                                                        rgpVar.p = num6;
                                                        rgpVar.q = arrayList;
                                                        rgpVar.r = null;
                                                        rgpVar.s = null;
                                                        rgpVar.t = z7;
                                                        rgpVar.u = i5;
                                                        rgpVar.z = 5;
                                                        obj4 = qgg.T(c7tVar2, cleVar32, rgpVar);
                                                        if (obj4 != nm6Var) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return nm6Var;
                                }
                            }
                        }
                        i2 = 1;
                        if (!this.k) {
                        }
                        if (!this.j) {
                        }
                        this.f.V(ofgVar2);
                        this.g = ofgVar;
                        if (pfgVar12 != pfgVar11) {
                        }
                        if (pfgVar12 != pfgVar10) {
                        }
                        cle cleVar10 = this.b;
                        ArrayList arrayList252 = this.c;
                        if (i2 != 0) {
                        }
                        arrayList = new ArrayList(list.size());
                        arrayList2 = new ArrayList(list.size());
                        if (i2 != 0) {
                        }
                        if (!z3) {
                        }
                        pfgVar = pfgVar10;
                        tgpVar = this;
                        if (i2 == 0) {
                        }
                        break;
                    case 1:
                        a1kVar9 = rgpVar.k;
                        tgpVar2 = rgpVar.j;
                        qgg.h0(obj4);
                        z6 = true;
                        tgpVar2.d = false;
                        tgpVar2.e = false;
                        tgpVar2.k = z6;
                        tgpVar2.j = z6;
                        if (obj4 == null) {
                        }
                        break;
                    case 2:
                        int i23 = rgpVar.u;
                        z4 = rgpVar.t;
                        ArrayList arrayList30 = rgpVar.s;
                        c7tVar3 = (c7t) rgpVar.r;
                        num3 = (Integer) rgpVar.q;
                        c7tVar4 = (c7t) rgpVar.p;
                        Integer num16 = (Integer) rgpVar.o;
                        c7tVar2 = (c7t) rgpVar.n;
                        arrayList2 = rgpVar.m;
                        ArrayList arrayList31 = rgpVar.l;
                        a1k a1kVar11 = rgpVar.k;
                        tgp tgpVar12 = rgpVar.j;
                        qgg.h0(obj4);
                        tgpVar = tgpVar12;
                        a1kVar9 = a1kVar11;
                        arrayList4 = arrayList30;
                        arrayList = arrayList31;
                        num2 = num16;
                        i2 = i23;
                        pfgVar = pfgVar10;
                        Object obj52 = obj4;
                        int i192 = c7tVar3.c;
                        List list32 = c7tVar3.d;
                        qgg.C(arrayList4, obj52, null, c7tVar3, i192, list32 == null ? ((Number) CollectionsKt.Q(list32)).intValue() : 0);
                        Integer num132 = num3;
                        z2 = z4;
                        c7tVar = c7tVar4;
                        num = num132;
                        if (i2 == 0) {
                        }
                        break;
                    case 3:
                        int i24 = rgpVar.w;
                        i4 = rgpVar.v;
                        int i25 = rgpVar.u;
                        boolean z12 = rgpVar.t;
                        arrayList9 = (ArrayList) rgpVar.r;
                        Integer num17 = (Integer) rgpVar.q;
                        c7tVar9 = (c7t) rgpVar.p;
                        Integer num18 = (Integer) rgpVar.o;
                        c7t c7tVar29 = (c7t) rgpVar.n;
                        ArrayList arrayList32 = rgpVar.m;
                        ArrayList arrayList33 = rgpVar.l;
                        a1k a1kVar12 = rgpVar.k;
                        tgp tgpVar13 = rgpVar.j;
                        qgg.h0(obj4);
                        tgpVar = tgpVar13;
                        i3 = i24;
                        pfgVar = pfgVar10;
                        z8 = z12;
                        num4 = num17;
                        num5 = num18;
                        c7tVar2 = c7tVar29;
                        arrayList2 = arrayList32;
                        a1kVar3 = a1kVar12;
                        pfgVar4 = pfgVar11;
                        i6 = i25;
                        arrayList = arrayList33;
                        arrayList9.add(obj4);
                        i4++;
                        z2 = z8;
                        c7tVar6 = c7tVar9;
                        i2 = i6;
                        pfgVar11 = pfgVar4;
                        if (i4 < i3) {
                        }
                        return nm6Var;
                    case 4:
                        int i26 = rgpVar.u;
                        z7 = rgpVar.t;
                        c7t c7tVar30 = (c7t) rgpVar.r;
                        num6 = (Integer) rgpVar.q;
                        c7tVar7 = (c7t) rgpVar.p;
                        num5 = (Integer) rgpVar.o;
                        c7t c7tVar31 = (c7t) rgpVar.n;
                        ArrayList arrayList34 = rgpVar.m;
                        ArrayList arrayList35 = rgpVar.l;
                        a1kVar3 = rgpVar.k;
                        tgpVar5 = rgpVar.j;
                        qgg.h0(obj4);
                        obj = obj4;
                        c7tVar8 = c7tVar30;
                        arrayList8 = arrayList35;
                        arrayList2 = arrayList34;
                        c7tVar2 = c7tVar31;
                        i2 = i26;
                        pfgVar = pfgVar10;
                        pfgVar3 = pfgVar11;
                        int i222 = c7tVar2.c;
                        List list92 = c7tVar2.d;
                        c7t c7tVar282 = c7tVar2;
                        qgg.C(arrayList8, obj, c7tVar8, c7tVar282, i222, list92 == null ? ((Number) CollectionsKt.Q(list92)).intValue() : 0);
                        a1k a1kVar102 = a1kVar3;
                        tgpVar4 = tgpVar5;
                        i5 = i2;
                        arrayList7 = arrayList2;
                        a1kVar4 = a1kVar102;
                        arrayList = arrayList8;
                        c7tVar2 = c7tVar282;
                        c7tVar2.getClass();
                        tgpVar4.getClass();
                        arrayList7.add(d(c7tVar2));
                        cle cleVar322 = tgpVar4.b;
                        rgpVar.j = tgpVar4;
                        rgpVar.k = a1kVar4;
                        rgpVar.l = arrayList;
                        rgpVar.m = arrayList7;
                        rgpVar.n = num5;
                        rgpVar.o = c7tVar7;
                        rgpVar.p = num6;
                        rgpVar.q = arrayList;
                        rgpVar.r = null;
                        rgpVar.s = null;
                        rgpVar.t = z7;
                        rgpVar.u = i5;
                        rgpVar.z = 5;
                        obj4 = qgg.T(c7tVar2, cleVar322, rgpVar);
                        if (obj4 != nm6Var) {
                        }
                        return nm6Var;
                    case 5:
                        i5 = rgpVar.u;
                        z7 = rgpVar.t;
                        arrayList = (ArrayList) rgpVar.q;
                        num6 = (Integer) rgpVar.p;
                        c7tVar7 = (c7t) rgpVar.o;
                        num5 = (Integer) rgpVar.n;
                        arrayList7 = rgpVar.m;
                        arrayList10 = rgpVar.l;
                        a1kVar4 = rgpVar.k;
                        tgpVar4 = rgpVar.j;
                        qgg.h0(obj4);
                        pfgVar = pfgVar10;
                        pfgVar3 = pfgVar11;
                        arrayList.add(obj4);
                        List list42 = a1kVar4.b;
                        int intValue42 = num5.intValue();
                        num6.getClass();
                        it = list42.subList(intValue42, num6.intValue() + 1).iterator();
                        if (it.hasNext()) {
                        }
                        break;
                    case 6:
                        int i27 = rgpVar.u;
                        boolean z13 = rgpVar.t;
                        c7t c7tVar32 = (c7t) rgpVar.r;
                        c7tVar11 = (c7t) rgpVar.q;
                        it2 = (Iterator) rgpVar.p;
                        Integer num19 = (Integer) rgpVar.o;
                        c7t c7tVar33 = (c7t) rgpVar.n;
                        ArrayList arrayList36 = rgpVar.m;
                        ArrayList arrayList37 = rgpVar.l;
                        a1kVar6 = rgpVar.k;
                        tgpVar7 = rgpVar.j;
                        qgg.h0(obj4);
                        pfgVar5 = pfgVar11;
                        c7tVar12 = c7tVar32;
                        i7 = i27;
                        pfgVar = pfgVar10;
                        obj2 = obj4;
                        z9 = z13;
                        arrayList13 = arrayList37;
                        arrayList14 = arrayList36;
                        c7tVar13 = c7tVar33;
                        num8 = num19;
                        c7t c7tVar242 = c7tVar11;
                        Iterator it52 = it2;
                        pfgVar7 = a1kVar6.a;
                        pfgVar8 = pfgVar;
                        if (pfgVar7 != pfgVar8) {
                        }
                        if (pfgVar7 != pfgVar8) {
                        }
                        pfgVar = pfgVar8;
                        i12 = intValue;
                        i11 = i10;
                        qgg.C(arrayList13, obj2, c7tVar12, c7tVar242, i11, i12);
                        ArrayList arrayList2722 = arrayList14;
                        c7tVar14 = c7tVar13;
                        a1kVar5 = a1kVar6;
                        arrayList15 = arrayList2722;
                        i8 = i9;
                        c7tVar16 = c7tVar12;
                        num9 = num8;
                        it3 = it52;
                        c7tVar15 = c7tVar242;
                        arrayList16 = arrayList13;
                        z7 = z9;
                        pfgVar6 = pfgVar;
                        if (!c7tVar15.b.isEmpty()) {
                        }
                        cle cleVar4222 = tgpVar7.b;
                        rgpVar.j = tgpVar7;
                        rgpVar.k = a1kVar5;
                        rgpVar.l = arrayList16;
                        rgpVar.m = arrayList15;
                        rgpVar.n = c7tVar14;
                        rgpVar.o = num9;
                        rgpVar.p = it3;
                        rgpVar.q = c7tVar15;
                        rgpVar.r = c7tVar16;
                        rgpVar.s = arrayList16;
                        rgpVar.t = z7;
                        rgpVar.u = i8;
                        rgpVar.z = 7;
                        T = qgg.T(c7tVar15, cleVar4222, rgpVar);
                        if (T != nm6Var) {
                        }
                        return nm6Var;
                    case 7:
                        int i28 = rgpVar.u;
                        z7 = rgpVar.t;
                        arrayList16 = rgpVar.s;
                        c7tVar16 = (c7t) rgpVar.r;
                        c7tVar15 = (c7t) rgpVar.q;
                        it3 = (Iterator) rgpVar.p;
                        num10 = (Integer) rgpVar.o;
                        c7t c7tVar34 = (c7t) rgpVar.n;
                        arrayList15 = rgpVar.m;
                        arrayList17 = rgpVar.l;
                        a1kVar7 = rgpVar.k;
                        tgp tgpVar14 = rgpVar.j;
                        qgg.h0(obj4);
                        pfgVar5 = pfgVar11;
                        c7tVar10 = c7tVar34;
                        tgpVar6 = tgpVar14;
                        T = obj4;
                        pfgVar6 = pfgVar10;
                        i5 = i28;
                        arrayList16.add(T);
                        if (!c7tVar15.b.isEmpty()) {
                        }
                        num7 = num10;
                        arrayList11 = arrayList15;
                        a1kVar5 = a1kVar7;
                        pfgVar3 = pfgVar5;
                        pfgVar = pfgVar6;
                        next = c7tVar16;
                        it2 = it3;
                        arrayList12 = arrayList17;
                        if (it2.hasNext()) {
                        }
                        return nm6Var;
                    case 8:
                        i5 = rgpVar.u;
                        z7 = rgpVar.t;
                        c7t c7tVar35 = (c7t) rgpVar.p;
                        Integer num20 = (Integer) rgpVar.o;
                        c7t c7tVar36 = (c7t) rgpVar.n;
                        arrayList11 = rgpVar.m;
                        arrayList12 = rgpVar.l;
                        a1kVar5 = rgpVar.k;
                        tgpVar6 = rgpVar.j;
                        qgg.h0(obj4);
                        obj3 = obj4;
                        num11 = num20;
                        c7tVar18 = c7tVar35;
                        pfgVar2 = pfgVar11;
                        c7tVar19 = c7tVar36;
                        boolean z112 = z7;
                        ArrayList arrayList292 = arrayList12;
                        int i212 = c7tVar19.c;
                        List list72 = c7tVar19.d;
                        qgg.C(arrayList292, obj3, c7tVar19, c7tVar18, i212, list72 == null ? ((Number) CollectionsKt.Y(list72)).intValue() : u75.g(c7tVar19.b));
                        z2 = z112;
                        num7 = num11;
                        arrayList18 = arrayList292;
                        c7tVar17 = c7tVar19;
                        i2 = i5;
                        intValue2 = num7.intValue() + 1;
                        g = u75.g(a1kVar5.b);
                        if (intValue2 > g) {
                        }
                        break;
                    case 9:
                        i15 = rgpVar.w;
                        i14 = rgpVar.v;
                        i13 = rgpVar.u;
                        z10 = rgpVar.t;
                        arrayList20 = (ArrayList) rgpVar.o;
                        c7tVar5 = (c7t) rgpVar.n;
                        arrayList19 = rgpVar.m;
                        arrayList24 = rgpVar.l;
                        a1kVar8 = rgpVar.k;
                        tgpVar8 = rgpVar.j;
                        qgg.h0(obj4);
                        pfgVar2 = pfgVar11;
                        arrayList20.add(obj4);
                        if (i14 == i15) {
                        }
                        break;
                    case 10:
                        ?? r1 = (List) rgpVar.o;
                        c7tVar20 = (c7t) rgpVar.n;
                        arrayList6 = rgpVar.m;
                        arrayList22 = rgpVar.l;
                        a1kVar2 = rgpVar.k;
                        tgpVar3 = rgpVar.j;
                        qgg.h0(obj4);
                        arrayList23 = r1;
                        pfgVar2 = pfgVar11;
                        Object obj62 = obj4;
                        int i202 = c7tVar20.c;
                        List list62 = c7tVar20.d;
                        qgg.C(arrayList23, obj62, c7tVar20, null, i202, list62 == null ? ((Number) CollectionsKt.Y(list62)).intValue() : u75.g(c7tVar20.b));
                        arrayList21 = arrayList22;
                        tgpVar3.d = false;
                        tgpVar3.e = false;
                        pfgVar9 = a1kVar2.a;
                        ArrayList arrayList262222 = tgpVar3.c;
                        if (pfgVar9 == pfgVar2) {
                        }
                        return new a1k(a1kVar2.a, arrayList21, a1kVar2.c, a1kVar2.d, a1kVar2.e, a1kVar2.f);
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        rgpVar = new rgp(this, cg6Var);
        Object obj42 = rgpVar.x;
        nm6 nm6Var2 = nm6.a;
        i = rgpVar.z;
        pfg pfgVar102 = pfg.b;
        pfg pfgVar112 = pfg.c;
        switch (i) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0077 -> B:10:0x007a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(f1k f1kVar, cg6 cg6Var) {
        sgp sgpVar;
        int i;
        ArrayList q;
        int size;
        int i2;
        tgp tgpVar;
        ArrayList arrayList;
        Object S;
        if (cg6Var instanceof sgp) {
            sgpVar = (sgp) cg6Var;
            int i3 = sgpVar.r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sgpVar.r = i3 - Integer.MIN_VALUE;
                Object obj = sgpVar.p;
                nm6 nm6Var = nm6.a;
                i = sgpVar.r;
                if (i != 0) {
                    q = su4.q(obj);
                    size = f1kVar.a.size();
                    if (size >= 0) {
                        i2 = 0;
                        tgpVar = this;
                        arrayList = q;
                        Object S2 = CollectionsKt.S(f1kVar.a, i2 - 1);
                        S = CollectionsKt.S(f1kVar.a, i2);
                        cle cleVar = tgpVar.b;
                        sgpVar.j = tgpVar;
                        sgpVar.k = f1kVar;
                        sgpVar.l = arrayList;
                        sgpVar.m = S;
                        sgpVar.n = i2;
                        sgpVar.o = size;
                        sgpVar.r = 1;
                        obj = cleVar.invoke(S2, S, sgpVar);
                        if (obj != nm6Var) {
                        }
                    }
                    f1kVar.getClass();
                    return new f1k(q);
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i4 = sgpVar.o;
                int i5 = sgpVar.n;
                Object obj2 = sgpVar.m;
                List list = sgpVar.l;
                f1k f1kVar2 = sgpVar.k;
                tgpVar = sgpVar.j;
                qgg.h0(obj);
                int i6 = i4;
                f1kVar = f1kVar2;
                S = obj2;
                ArrayList arrayList2 = list;
                if (obj != null) {
                    arrayList2.add(obj);
                }
                if (S != null) {
                    arrayList2.add(S);
                }
                if (i5 == i6) {
                    int i7 = i5 + 1;
                    size = i6;
                    i2 = i7;
                    arrayList = arrayList2;
                    Object S22 = CollectionsKt.S(f1kVar.a, i2 - 1);
                    S = CollectionsKt.S(f1kVar.a, i2);
                    cle cleVar2 = tgpVar.b;
                    sgpVar.j = tgpVar;
                    sgpVar.k = f1kVar;
                    sgpVar.l = arrayList;
                    sgpVar.m = S;
                    sgpVar.n = i2;
                    sgpVar.o = size;
                    sgpVar.r = 1;
                    obj = cleVar2.invoke(S22, S, sgpVar);
                    if (obj != nm6Var) {
                        return nm6Var;
                    }
                    int i8 = i2;
                    i6 = size;
                    i5 = i8;
                    arrayList2 = arrayList;
                    if (obj != null) {
                    }
                    if (S != null) {
                    }
                    if (i5 == i6) {
                        q = arrayList2;
                        f1kVar.getClass();
                        return new f1k(q);
                    }
                }
            }
        }
        sgpVar = new sgp(this, cg6Var);
        Object obj3 = sgpVar.p;
        nm6 nm6Var2 = nm6.a;
        i = sgpVar.r;
        if (i != 0) {
        }
    }
}
