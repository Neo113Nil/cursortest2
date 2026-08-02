package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class g15 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ rjc b;
    public final /* synthetic */ u12 c;

    public /* synthetic */ g15(rjc rjcVar, u12 u12Var, int i) {
        this.a = i;
        this.b = rjcVar;
        this.c = u12Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x015f -> B:41:0x0163). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0262 -> B:71:0x0266). Please report as a decompilation issue!!! */
    @Override // defpackage.rjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        f15 f15Var;
        f15 f15Var2;
        Object obj2;
        nm6 nm6Var;
        int i;
        rjc rjcVar;
        int i2;
        i15 i15Var;
        int i3;
        rjc rjcVar2;
        int i4;
        int i5;
        rjc rjcVar3;
        Collection arrayList;
        int i6;
        int i7;
        int i8;
        Iterator it;
        int i9;
        j15 j15Var;
        int i10;
        rjc rjcVar4;
        int i11;
        int i12;
        rjc rjcVar5;
        Collection arrayList2;
        int i13;
        int i14;
        int i15;
        Iterator it2;
        int i16;
        k15 k15Var;
        k15 k15Var2;
        Object obj3;
        nm6 nm6Var2;
        int i17;
        rjc rjcVar6;
        int i18;
        switch (this.a) {
            case 0:
                if (continuation instanceof f15) {
                    f15Var = (f15) continuation;
                    int i19 = f15Var.k;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        f15Var.k = i19 - Integer.MIN_VALUE;
                        f15Var2 = f15Var;
                        obj2 = f15Var2.j;
                        nm6Var = nm6.a;
                        i = f15Var2.k;
                        if (i != 0) {
                            qgg.h0(obj2);
                            e15 d = this.c.d();
                            rjc rjcVar7 = this.b;
                            f15Var2.m = rjcVar7;
                            f15Var2.n = 0;
                            f15Var2.k = 1;
                            d.getClass();
                            List list = dw.MyMusicBooks.a;
                            Object f = e15.f(d, vz1.k(list, list), Boolean.FALSE, null, f15Var2, 40);
                            if (f != nm6Var) {
                                rjcVar = rjcVar7;
                                obj2 = f;
                                i2 = 0;
                            }
                        } else if (i == 1) {
                            i2 = f15Var2.n;
                            rjcVar = f15Var2.m;
                            qgg.h0(obj2);
                        } else if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj2);
                            break;
                        }
                        f15Var2.m = null;
                        f15Var2.n = i2;
                        f15Var2.k = 2;
                        if (rjcVar.emit(obj2, f15Var2) == nm6Var) {
                        }
                    }
                }
                f15Var = new f15(this, continuation);
                f15Var2 = f15Var;
                obj2 = f15Var2.j;
                nm6Var = nm6.a;
                i = f15Var2.k;
                if (i != 0) {
                }
                f15Var2.m = null;
                f15Var2.n = i2;
                f15Var2.k = 2;
                if (rjcVar.emit(obj2, f15Var2) == nm6Var) {
                }
                break;
            case 1:
                if (continuation instanceof i15) {
                    i15Var = (i15) continuation;
                    int i20 = i15Var.k;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        i15Var.k = i20 - Integer.MIN_VALUE;
                        i15 i15Var2 = i15Var;
                        Object obj4 = i15Var2.j;
                        nm6 nm6Var3 = nm6.a;
                        i3 = i15Var2.k;
                        u12 u12Var = this.c;
                        int i21 = 2;
                        if (i3 != 0) {
                            qgg.h0(obj4);
                            e15 d2 = u12Var.d();
                            rjc rjcVar8 = this.b;
                            i15Var2.m = rjcVar8;
                            i15Var2.q = 0;
                            i15Var2.r = 0;
                            i15Var2.k = 1;
                            d2.getClass();
                            List list2 = dw.MyMusicBooks.a;
                            Object e = e15.e(d2, vz1.k(list2, list2), Boolean.FALSE, null, i15Var2, 16);
                            if (e != nm6Var3) {
                                rjcVar2 = rjcVar8;
                                obj4 = e;
                                i4 = 0;
                                i5 = 0;
                            }
                        } else if (i3 == 1) {
                            i4 = i15Var2.r;
                            i5 = i15Var2.q;
                            rjcVar2 = i15Var2.m;
                            qgg.h0(obj4);
                        } else if (i3 == 2) {
                            i8 = i15Var2.t;
                            int i22 = i15Var2.s;
                            i6 = i15Var2.r;
                            i7 = i15Var2.q;
                            arrayList = i15Var2.p;
                            it = i15Var2.o;
                            Collection collection = i15Var2.n;
                            rjcVar3 = i15Var2.m;
                            qgg.h0(obj4);
                            arrayList.add((oq) obj4);
                            i9 = i22;
                            arrayList = collection;
                            i21 = 2;
                            Continuation continuation2 = null;
                            if (!it.hasNext()) {
                                oq oqVar = (oq) it.next();
                                i15Var2.m = rjcVar3;
                                Collection collection2 = arrayList;
                                i15Var2.n = collection2;
                                i15Var2.o = it;
                                i15Var2.p = collection2;
                                i15Var2.q = i7;
                                i15Var2.r = i6;
                                i15Var2.s = i9;
                                i15Var2.t = i8;
                                i15Var2.k = i21;
                                u12Var.getClass();
                                Object V = x97.V(dm6.a, new qi(continuation2, oqVar, u12Var, 26), i15Var2);
                                if (V != nm6Var3) {
                                    i22 = i9;
                                    obj4 = V;
                                    collection = arrayList;
                                    arrayList.add((oq) obj4);
                                    i9 = i22;
                                    arrayList = collection;
                                    i21 = 2;
                                    Continuation continuation22 = null;
                                    if (!it.hasNext()) {
                                        i15Var2.m = null;
                                        i15Var2.n = null;
                                        i15Var2.o = null;
                                        i15Var2.p = null;
                                        i15Var2.q = i7;
                                        i15Var2.k = 3;
                                        if (rjcVar3.emit((List) arrayList, i15Var2) == nm6Var3) {
                                        }
                                    }
                                }
                            }
                        } else if (i3 != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj4);
                            break;
                        }
                        List list3 = (List) obj4;
                        rjcVar3 = rjcVar2;
                        arrayList = new ArrayList(v75.o(list3, 10));
                        i6 = i4;
                        i7 = i5;
                        i8 = 0;
                        it = list3.iterator();
                        i9 = 0;
                        Continuation continuation222 = null;
                        if (!it.hasNext()) {
                        }
                    }
                }
                i15Var = new i15(this, continuation);
                i15 i15Var22 = i15Var;
                Object obj42 = i15Var22.j;
                nm6 nm6Var32 = nm6.a;
                i3 = i15Var22.k;
                u12 u12Var2 = this.c;
                int i212 = 2;
                if (i3 != 0) {
                }
                List list32 = (List) obj42;
                rjcVar3 = rjcVar2;
                arrayList = new ArrayList(v75.o(list32, 10));
                i6 = i4;
                i7 = i5;
                i8 = 0;
                it = list32.iterator();
                i9 = 0;
                Continuation continuation2222 = null;
                if (!it.hasNext()) {
                }
                break;
            case 2:
                if (continuation instanceof j15) {
                    j15Var = (j15) continuation;
                    int i23 = j15Var.k;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        j15Var.k = i23 - Integer.MIN_VALUE;
                        j15 j15Var2 = j15Var;
                        Object obj5 = j15Var2.j;
                        nm6 nm6Var4 = nm6.a;
                        i10 = j15Var2.k;
                        u12 u12Var3 = this.c;
                        int i24 = 2;
                        if (i10 != 0) {
                            qgg.h0(obj5);
                            e15 d3 = u12Var3.d();
                            rjc rjcVar9 = this.b;
                            j15Var2.m = rjcVar9;
                            j15Var2.q = 0;
                            j15Var2.r = 0;
                            j15Var2.k = 1;
                            d3.getClass();
                            List list4 = dw.MyMusicPodcasts.a;
                            Object e2 = e15.e(d3, vz1.k(list4, list4), Boolean.FALSE, null, j15Var2, 16);
                            if (e2 != nm6Var4) {
                                rjcVar4 = rjcVar9;
                                obj5 = e2;
                                i11 = 0;
                                i12 = 0;
                            }
                        } else if (i10 == 1) {
                            i11 = j15Var2.r;
                            i12 = j15Var2.q;
                            rjcVar4 = j15Var2.m;
                            qgg.h0(obj5);
                        } else if (i10 == 2) {
                            i15 = j15Var2.t;
                            int i25 = j15Var2.s;
                            i13 = j15Var2.r;
                            i14 = j15Var2.q;
                            arrayList2 = j15Var2.p;
                            it2 = j15Var2.o;
                            Collection collection3 = j15Var2.n;
                            rjcVar5 = j15Var2.m;
                            qgg.h0(obj5);
                            arrayList2.add((oq) obj5);
                            i16 = i25;
                            arrayList2 = collection3;
                            i24 = 2;
                            Continuation continuation3 = null;
                            if (!it2.hasNext()) {
                                oq oqVar2 = (oq) it2.next();
                                j15Var2.m = rjcVar5;
                                Collection collection4 = arrayList2;
                                j15Var2.n = collection4;
                                j15Var2.o = it2;
                                j15Var2.p = collection4;
                                j15Var2.q = i14;
                                j15Var2.r = i13;
                                j15Var2.s = i16;
                                j15Var2.t = i15;
                                j15Var2.k = i24;
                                u12Var3.getClass();
                                Object V2 = x97.V(dm6.a, new qi(continuation3, oqVar2, u12Var3, 26), j15Var2);
                                if (V2 != nm6Var4) {
                                    i25 = i16;
                                    obj5 = V2;
                                    collection3 = arrayList2;
                                    arrayList2.add((oq) obj5);
                                    i16 = i25;
                                    arrayList2 = collection3;
                                    i24 = 2;
                                    Continuation continuation32 = null;
                                    if (!it2.hasNext()) {
                                        j15Var2.m = null;
                                        j15Var2.n = null;
                                        j15Var2.o = null;
                                        j15Var2.p = null;
                                        j15Var2.q = i14;
                                        j15Var2.k = 3;
                                        if (rjcVar5.emit((List) arrayList2, j15Var2) == nm6Var4) {
                                        }
                                    }
                                }
                            }
                        } else if (i10 != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj5);
                            break;
                        }
                        List list5 = (List) obj5;
                        rjcVar5 = rjcVar4;
                        arrayList2 = new ArrayList(v75.o(list5, 10));
                        i13 = i11;
                        i14 = i12;
                        i15 = 0;
                        it2 = list5.iterator();
                        i16 = 0;
                        Continuation continuation322 = null;
                        if (!it2.hasNext()) {
                        }
                    }
                }
                j15Var = new j15(this, continuation);
                j15 j15Var22 = j15Var;
                Object obj52 = j15Var22.j;
                nm6 nm6Var42 = nm6.a;
                i10 = j15Var22.k;
                u12 u12Var32 = this.c;
                int i242 = 2;
                if (i10 != 0) {
                }
                List list52 = (List) obj52;
                rjcVar5 = rjcVar4;
                arrayList2 = new ArrayList(v75.o(list52, 10));
                i13 = i11;
                i14 = i12;
                i15 = 0;
                it2 = list52.iterator();
                i16 = 0;
                Continuation continuation3222 = null;
                if (!it2.hasNext()) {
                }
                break;
            default:
                if (continuation instanceof k15) {
                    k15Var = (k15) continuation;
                    int i26 = k15Var.k;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        k15Var.k = i26 - Integer.MIN_VALUE;
                        k15Var2 = k15Var;
                        obj3 = k15Var2.j;
                        nm6Var2 = nm6.a;
                        i17 = k15Var2.k;
                        if (i17 != 0) {
                            qgg.h0(obj3);
                            e15 d4 = this.c.d();
                            rjc rjcVar10 = this.b;
                            k15Var2.m = rjcVar10;
                            k15Var2.n = 0;
                            k15Var2.k = 1;
                            d4.getClass();
                            List list6 = gys.MyMusicPodcastEpisodes.a;
                            Object f2 = e15.f(d4, vz1.k(list6, list6), Boolean.FALSE, null, k15Var2, 40);
                            if (f2 != nm6Var2) {
                                rjcVar6 = rjcVar10;
                                obj3 = f2;
                                i18 = 0;
                            }
                        } else if (i17 == 1) {
                            i18 = k15Var2.n;
                            rjcVar6 = k15Var2.m;
                            qgg.h0(obj3);
                        } else if (i17 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            break;
                        } else {
                            qgg.h0(obj3);
                            break;
                        }
                        k15Var2.m = null;
                        k15Var2.n = i18;
                        k15Var2.k = 2;
                        if (rjcVar6.emit(obj3, k15Var2) == nm6Var2) {
                        }
                    }
                }
                k15Var = new k15(this, continuation);
                k15Var2 = k15Var;
                obj3 = k15Var2.j;
                nm6Var2 = nm6.a;
                i17 = k15Var2.k;
                if (i17 != 0) {
                }
                k15Var2.m = null;
                k15Var2.n = i18;
                k15Var2.k = 2;
                if (rjcVar6.emit(obj3, k15Var2) == nm6Var2) {
                }
                break;
        }
        return Unit.a;
    }
}
