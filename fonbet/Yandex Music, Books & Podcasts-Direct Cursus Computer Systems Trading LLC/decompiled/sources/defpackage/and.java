package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.common.media.context.LaunchActionInfo;
import ru.yandex.music.common.media.context.Page;
import ru.yandex.music.common.media.context.h;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes5.dex */
public final class and {
    public final l48 a;

    public and(l48 l48Var) {
        this.a = l48Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(wmd wmdVar, vmd vmdVar, cg6 cg6Var) {
        zmd zmdVar;
        int i;
        String str;
        String str2;
        String str3;
        List list;
        v8n v8nVar;
        if (cg6Var instanceof zmd) {
            zmdVar = (zmd) cg6Var;
            int i2 = zmdVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zmdVar.m = i2 - Integer.MIN_VALUE;
                Object obj = zmdVar.k;
                nm6 nm6Var = nm6.a;
                i = zmdVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    String str4 = wmdVar.a;
                    if ((str4 == null || str4.length() == 0) && (((str = wmdVar.b) == null || str.length() == 0) && (((str2 = wmdVar.c) == null || str2.length() == 0) && ((str3 = wmdVar.d) == null || str3.length() == 0)))) {
                        StationId f = StationId.f("user:onyourwave");
                        f.getClass();
                        return new xmd(l48.y(f));
                    }
                    i9w i9wVar = i9w.f;
                    String a = wmdVar.a();
                    zmdVar.j = vmdVar;
                    zmdVar.m = 1;
                    obj = i9wVar.G(a, true, zmdVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vmdVar = zmdVar.j;
                    qgg.h0(obj);
                }
                list = (List) obj;
                if (list != null) {
                    int i3 = vmdVar == null ? -1 : ymd.a[vmdVar.ordinal()];
                    l48 l48Var = this.a;
                    v8n v8nVar2 = null;
                    if (i3 != -1) {
                        if (i3 == 1) {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : list) {
                                if (obj2 instanceof f3p) {
                                    arrayList.add(obj2);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((f3p) it.next()).b);
                            }
                            Object firstOrNull = CollectionsKt.firstOrNull(arrayList2);
                            if (firstOrNull != null) {
                                if (firstOrNull instanceof oq) {
                                    v8nVar = l48Var.h((oq) firstOrNull);
                                } else if (firstOrNull instanceof c01) {
                                    v8nVar = l48Var.i((c01) firstOrNull);
                                } else if (firstOrNull instanceof cvl) {
                                    v8nVar = l48Var.s((cvl) firstOrNull);
                                } else if (firstOrNull instanceof u1u) {
                                    v8nVar = l48.y(((u1u) firstOrNull).a);
                                } else {
                                    if (!(firstOrNull instanceof n7n)) {
                                        xq0.x("type not supported");
                                        return null;
                                    }
                                    v8nVar = l48.v(((n7n) firstOrNull).c);
                                }
                                if (v8nVar == null) {
                                }
                                v8nVar2 = v8nVar;
                                if (v8nVar2 != null) {
                                }
                            }
                        } else {
                            if (i3 != 2) {
                                b6e.s();
                                return null;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj3 : list) {
                                if (obj3 instanceof g3p) {
                                    arrayList3.add(obj3);
                                }
                            }
                            ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                arrayList4.add(((g3p) it2.next()).b);
                            }
                            Object firstOrNull2 = CollectionsKt.firstOrNull(arrayList4);
                            if (firstOrNull2 != null) {
                                if (firstOrNull2 instanceof oq) {
                                    v8nVar = l48Var.h((oq) firstOrNull2);
                                } else if (firstOrNull2 instanceof c01) {
                                    v8nVar = l48Var.i((c01) firstOrNull2);
                                } else if (firstOrNull2 instanceof cvl) {
                                    v8nVar = l48Var.s((cvl) firstOrNull2);
                                } else if (firstOrNull2 instanceof u1u) {
                                    v8nVar = l48.y(((u1u) firstOrNull2).a);
                                } else {
                                    if (!(firstOrNull2 instanceof n7n)) {
                                        xq0.x("type not supported");
                                        return null;
                                    }
                                    v8nVar = l48.v(((n7n) firstOrNull2).c);
                                }
                                if (v8nVar == null) {
                                    i4p i4pVar = (i4p) CollectionsKt.firstOrNull(list);
                                    if (i4pVar instanceof f3p) {
                                        ArrayList arrayList5 = new ArrayList();
                                        for (Object obj4 : list) {
                                            if (obj4 instanceof f3p) {
                                                arrayList5.add(obj4);
                                            }
                                        }
                                        ArrayList arrayList6 = new ArrayList(v75.o(arrayList5, 10));
                                        Iterator it3 = arrayList5.iterator();
                                        while (it3.hasNext()) {
                                            arrayList6.add(((f3p) it3.next()).b);
                                        }
                                        Object firstOrNull3 = CollectionsKt.firstOrNull(arrayList6);
                                        if (firstOrNull3 != null) {
                                            if (firstOrNull3 instanceof oq) {
                                                v8nVar = l48Var.h((oq) firstOrNull3);
                                            } else if (firstOrNull3 instanceof c01) {
                                                v8nVar = l48Var.i((c01) firstOrNull3);
                                            } else if (firstOrNull3 instanceof cvl) {
                                                v8nVar = l48Var.s((cvl) firstOrNull3);
                                            } else if (firstOrNull3 instanceof u1u) {
                                                v8nVar = l48.y(((u1u) firstOrNull3).a);
                                            } else {
                                                if (!(firstOrNull3 instanceof n7n)) {
                                                    xq0.x("type not supported");
                                                    return null;
                                                }
                                                v8nVar = l48.v(((n7n) firstOrNull3).c);
                                            }
                                            if (v8nVar == null) {
                                                ArrayList arrayList7 = new ArrayList();
                                                for (Object obj5 : list) {
                                                    if (obj5 instanceof f4p) {
                                                        arrayList7.add(obj5);
                                                    }
                                                }
                                                ArrayList arrayList8 = new ArrayList(v75.o(arrayList7, 10));
                                                Iterator it4 = arrayList7.iterator();
                                                while (it4.hasNext()) {
                                                    arrayList8.add(((f4p) it4.next()).b);
                                                }
                                                if (arrayList8.isEmpty()) {
                                                    arrayList8 = null;
                                                }
                                                if (arrayList8 != null) {
                                                    LaunchActionInfo launchActionInfo = LaunchActionInfo.AUTOMOTIVE_ASSISTANT;
                                                    launchActionInfo.getClass();
                                                    v8nVar2 = l3l.h(new h(Page.TRACK, launchActionInfo).h(), arrayList8, new a6l(new gxc(avf.G("assistant"), weo.t()), null)).b();
                                                }
                                                if (v8nVar2 != null) {
                                                    return new xmd(v8nVar2);
                                                }
                                            }
                                        }
                                        v8nVar = null;
                                        if (v8nVar == null) {
                                        }
                                    } else if (i4pVar instanceof g3p) {
                                        ArrayList arrayList9 = new ArrayList();
                                        for (Object obj6 : list) {
                                            if (obj6 instanceof g3p) {
                                                arrayList9.add(obj6);
                                            }
                                        }
                                        ArrayList arrayList10 = new ArrayList(v75.o(arrayList9, 10));
                                        Iterator it5 = arrayList9.iterator();
                                        while (it5.hasNext()) {
                                            arrayList10.add(((g3p) it5.next()).b);
                                        }
                                        Object firstOrNull4 = CollectionsKt.firstOrNull(arrayList10);
                                        if (firstOrNull4 != null) {
                                            if (firstOrNull4 instanceof oq) {
                                                v8nVar = l48Var.h((oq) firstOrNull4);
                                            } else if (firstOrNull4 instanceof c01) {
                                                v8nVar = l48Var.i((c01) firstOrNull4);
                                            } else if (firstOrNull4 instanceof cvl) {
                                                v8nVar = l48Var.s((cvl) firstOrNull4);
                                            } else if (firstOrNull4 instanceof u1u) {
                                                v8nVar = l48.y(((u1u) firstOrNull4).a);
                                            } else {
                                                if (!(firstOrNull4 instanceof n7n)) {
                                                    xq0.x("type not supported");
                                                    return null;
                                                }
                                                v8nVar = l48.v(((n7n) firstOrNull4).c);
                                            }
                                            if (v8nVar == null) {
                                            }
                                        }
                                        v8nVar = null;
                                        if (v8nVar == null) {
                                        }
                                    } else if (i4pVar instanceof b4p) {
                                        ArrayList arrayList11 = new ArrayList();
                                        for (Object obj7 : list) {
                                            if (obj7 instanceof b4p) {
                                                arrayList11.add(obj7);
                                            }
                                        }
                                        ArrayList arrayList12 = new ArrayList(v75.o(arrayList11, 10));
                                        Iterator it6 = arrayList11.iterator();
                                        while (it6.hasNext()) {
                                            arrayList12.add(((b4p) it6.next()).b);
                                        }
                                        Object firstOrNull5 = CollectionsKt.firstOrNull(arrayList12);
                                        if (firstOrNull5 != null) {
                                            if (firstOrNull5 instanceof oq) {
                                                v8nVar = l48Var.h((oq) firstOrNull5);
                                            } else if (firstOrNull5 instanceof c01) {
                                                v8nVar = l48Var.i((c01) firstOrNull5);
                                            } else if (firstOrNull5 instanceof cvl) {
                                                v8nVar = l48Var.s((cvl) firstOrNull5);
                                            } else if (firstOrNull5 instanceof u1u) {
                                                v8nVar = l48.y(((u1u) firstOrNull5).a);
                                            } else {
                                                if (!(firstOrNull5 instanceof n7n)) {
                                                    xq0.x("type not supported");
                                                    return null;
                                                }
                                                v8nVar = l48.v(((n7n) firstOrNull5).c);
                                            }
                                            if (v8nVar == null) {
                                            }
                                        }
                                        v8nVar = null;
                                        if (v8nVar == null) {
                                        }
                                    } else if (i4pVar instanceof a4p) {
                                        ArrayList arrayList13 = new ArrayList();
                                        for (Object obj8 : list) {
                                            if (obj8 instanceof a4p) {
                                                arrayList13.add(obj8);
                                            }
                                        }
                                        ArrayList arrayList14 = new ArrayList(v75.o(arrayList13, 10));
                                        Iterator it7 = arrayList13.iterator();
                                        while (it7.hasNext()) {
                                            arrayList14.add(((a4p) it7.next()).b);
                                        }
                                        Object firstOrNull6 = CollectionsKt.firstOrNull(arrayList14);
                                        if (firstOrNull6 != null) {
                                            if (firstOrNull6 instanceof oq) {
                                                v8nVar = l48Var.h((oq) firstOrNull6);
                                            } else if (firstOrNull6 instanceof c01) {
                                                v8nVar = l48Var.i((c01) firstOrNull6);
                                            } else if (firstOrNull6 instanceof cvl) {
                                                v8nVar = l48Var.s((cvl) firstOrNull6);
                                            } else if (firstOrNull6 instanceof u1u) {
                                                v8nVar = l48.y(((u1u) firstOrNull6).a);
                                            } else {
                                                if (!(firstOrNull6 instanceof n7n)) {
                                                    xq0.x("type not supported");
                                                    return null;
                                                }
                                                v8nVar = l48.v(((n7n) firstOrNull6).c);
                                            }
                                            if (v8nVar == null) {
                                            }
                                        }
                                        v8nVar = null;
                                        if (v8nVar == null) {
                                        }
                                    } else if (i4pVar instanceof c4p) {
                                        ArrayList arrayList15 = new ArrayList();
                                        for (Object obj9 : list) {
                                            if (obj9 instanceof c4p) {
                                                arrayList15.add(obj9);
                                            }
                                        }
                                        ArrayList arrayList16 = new ArrayList(v75.o(arrayList15, 10));
                                        Iterator it8 = arrayList15.iterator();
                                        while (it8.hasNext()) {
                                            arrayList16.add(((c4p) it8.next()).b);
                                        }
                                        Object firstOrNull7 = CollectionsKt.firstOrNull(arrayList16);
                                        if (firstOrNull7 != null) {
                                            if (firstOrNull7 instanceof oq) {
                                                v8nVar = l48Var.h((oq) firstOrNull7);
                                            } else if (firstOrNull7 instanceof c01) {
                                                v8nVar = l48Var.i((c01) firstOrNull7);
                                            } else if (firstOrNull7 instanceof cvl) {
                                                v8nVar = l48Var.s((cvl) firstOrNull7);
                                            } else if (firstOrNull7 instanceof u1u) {
                                                v8nVar = l48.y(((u1u) firstOrNull7).a);
                                            } else {
                                                if (!(firstOrNull7 instanceof n7n)) {
                                                    xq0.x("type not supported");
                                                    return null;
                                                }
                                                v8nVar = l48.v(((n7n) firstOrNull7).c);
                                            }
                                            if (v8nVar == null) {
                                            }
                                        }
                                        v8nVar = null;
                                        if (v8nVar == null) {
                                        }
                                    } else if (i4pVar instanceof g4p) {
                                        ArrayList arrayList17 = new ArrayList();
                                        for (Object obj10 : list) {
                                            if (obj10 instanceof g4p) {
                                                arrayList17.add(obj10);
                                            }
                                        }
                                        ArrayList arrayList18 = new ArrayList(v75.o(arrayList17, 10));
                                        Iterator it9 = arrayList17.iterator();
                                        while (it9.hasNext()) {
                                            arrayList18.add(((g4p) it9.next()).b);
                                        }
                                        Object firstOrNull8 = CollectionsKt.firstOrNull(arrayList18);
                                        if (firstOrNull8 != null) {
                                            if (firstOrNull8 instanceof oq) {
                                                v8nVar = l48Var.h((oq) firstOrNull8);
                                            } else if (firstOrNull8 instanceof c01) {
                                                v8nVar = l48Var.i((c01) firstOrNull8);
                                            } else if (firstOrNull8 instanceof cvl) {
                                                v8nVar = l48Var.s((cvl) firstOrNull8);
                                            } else if (firstOrNull8 instanceof u1u) {
                                                v8nVar = l48.y(((u1u) firstOrNull8).a);
                                            } else {
                                                if (!(firstOrNull8 instanceof n7n)) {
                                                    xq0.x("type not supported");
                                                    return null;
                                                }
                                                v8nVar = l48.v(((n7n) firstOrNull8).c);
                                            }
                                            if (v8nVar == null) {
                                            }
                                        }
                                        v8nVar = null;
                                        if (v8nVar == null) {
                                        }
                                    } else if (i4pVar instanceof h4p) {
                                        ArrayList arrayList19 = new ArrayList();
                                        for (Object obj11 : list) {
                                            if (obj11 instanceof h4p) {
                                                arrayList19.add(obj11);
                                            }
                                        }
                                        ArrayList arrayList20 = new ArrayList(v75.o(arrayList19, 10));
                                        Iterator it10 = arrayList19.iterator();
                                        while (it10.hasNext()) {
                                            arrayList20.add(((h4p) it10.next()).b);
                                        }
                                        Object firstOrNull9 = CollectionsKt.firstOrNull(arrayList20);
                                        if (firstOrNull9 != null) {
                                            if (firstOrNull9 instanceof oq) {
                                                v8nVar = l48Var.h((oq) firstOrNull9);
                                            } else if (firstOrNull9 instanceof c01) {
                                                v8nVar = l48Var.i((c01) firstOrNull9);
                                            } else if (firstOrNull9 instanceof cvl) {
                                                v8nVar = l48Var.s((cvl) firstOrNull9);
                                            } else if (firstOrNull9 instanceof u1u) {
                                                v8nVar = l48.y(((u1u) firstOrNull9).a);
                                            } else {
                                                if (!(firstOrNull9 instanceof n7n)) {
                                                    xq0.x("type not supported");
                                                    return null;
                                                }
                                                v8nVar = l48.v(((n7n) firstOrNull9).c);
                                            }
                                            if (v8nVar == null) {
                                            }
                                        }
                                        v8nVar = null;
                                        if (v8nVar == null) {
                                        }
                                    } else {
                                        if (!(i4pVar instanceof z3p) && !(i4pVar instanceof f4p)) {
                                            if (i4pVar instanceof d4p) {
                                                ArrayList arrayList21 = new ArrayList();
                                                for (Object obj12 : list) {
                                                    if (obj12 instanceof d4p) {
                                                        arrayList21.add(obj12);
                                                    }
                                                }
                                                ArrayList arrayList22 = new ArrayList(v75.o(arrayList21, 10));
                                                Iterator it11 = arrayList21.iterator();
                                                while (it11.hasNext()) {
                                                    arrayList22.add(((d4p) it11.next()).b);
                                                }
                                                Object firstOrNull10 = CollectionsKt.firstOrNull(arrayList22);
                                                if (firstOrNull10 != null) {
                                                    if (firstOrNull10 instanceof oq) {
                                                        v8nVar = l48Var.h((oq) firstOrNull10);
                                                    } else if (firstOrNull10 instanceof c01) {
                                                        v8nVar = l48Var.i((c01) firstOrNull10);
                                                    } else if (firstOrNull10 instanceof cvl) {
                                                        v8nVar = l48Var.s((cvl) firstOrNull10);
                                                    } else if (firstOrNull10 instanceof u1u) {
                                                        v8nVar = l48.y(((u1u) firstOrNull10).a);
                                                    } else {
                                                        if (!(firstOrNull10 instanceof n7n)) {
                                                            xq0.x("type not supported");
                                                            return null;
                                                        }
                                                        v8nVar = l48.v(((n7n) firstOrNull10).c);
                                                    }
                                                    if (v8nVar == null) {
                                                    }
                                                }
                                            } else if (!(i4pVar instanceof u3p) && !(i4pVar instanceof i3p) && !(i4pVar instanceof h3p) && !(i4pVar instanceof o3p) && !(i4pVar instanceof l3p) && !(i4pVar instanceof x3p) && !(i4pVar instanceof v3p) && !(i4pVar instanceof r3p) && !(i4pVar instanceof p3p) && !(i4pVar instanceof m3p) && !(i4pVar instanceof j3p) && !(i4pVar instanceof q3p) && !(i4pVar instanceof n3p) && !(i4pVar instanceof w3p) && !(i4pVar instanceof k3p) && !(i4pVar instanceof t3p) && i4pVar != null) {
                                                b6e.s();
                                                return null;
                                            }
                                        }
                                        v8nVar = null;
                                        if (v8nVar == null) {
                                        }
                                    }
                                }
                                v8nVar2 = v8nVar;
                                if (v8nVar2 != null) {
                                }
                            }
                        }
                    }
                    v8nVar = null;
                    if (v8nVar == null) {
                    }
                    v8nVar2 = v8nVar;
                    if (v8nVar2 != null) {
                    }
                }
                return xmd.b;
            }
        }
        zmdVar = new zmd(this, cg6Var);
        Object obj13 = zmdVar.k;
        nm6 nm6Var2 = nm6.a;
        i = zmdVar.m;
        if (i != 0) {
        }
        list = (List) obj13;
        if (list != null) {
        }
        return xmd.b;
    }
}
