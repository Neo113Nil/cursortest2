package defpackage;

import android.view.View;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l79 {
    public final /* synthetic */ int a;
    public final gc8 b;
    public final hp8 c;

    public /* synthetic */ l79(gc8 gc8Var, hp8 hp8Var, int i) {
        this.a = i;
        this.b = gc8Var;
        this.c = hp8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x0335  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(e23 e23Var, qv8 qv8Var, List list) {
        gc8 gc8Var;
        View view;
        pm9 pm9Var;
        View view2;
        e23 G;
        boolean z;
        Object pm9Var2;
        View view3;
        gc8 gc8Var2;
        int i;
        long j;
        boolean z2;
        List list2;
        gc8 gc8Var3;
        View view4;
        List K;
        switch (this.a) {
            case 0:
                xzb xzbVar = e23Var.b;
                gc8 gc8Var4 = this.b;
                int i2 = 0;
                View childAt = gc8Var4.getChildAt(0);
                jc8 jc8Var = qv8Var.a;
                long j2 = qv8Var.b;
                StringBuilder sb = new StringBuilder();
                sb.append(j2);
                dp8 d = jc8Var.d();
                String H = d instanceof dm9 ? wvo.H((dm9) d) : d.getId();
                sb.append(H != null ? StringUtils.PROCESS_POSTFIX_DELIMITER.concat(H) : "");
                pm9 pm9Var3 = new pm9(c5b.a, 8, t75.c(sb.toString()), j2);
                int size = list.size();
                if (size != 0) {
                    boolean z3 = true;
                    if (size != 1) {
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            qq6.d("Empty collection can't be reduced.");
                            return;
                        }
                        Object obj = it.next();
                        while (it.hasNext()) {
                            pm9 pm9Var4 = (pm9) it.next();
                            pm9 pm9Var5 = (pm9) obj;
                            if (pm9Var5.a != pm9Var4.a) {
                                gc8Var2 = gc8Var4;
                                view3 = childAt;
                                z = z3;
                                pm9Var2 = null;
                                i = i2;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                Iterator it2 = pm9Var5.b.iterator();
                                int i3 = i2;
                                while (true) {
                                    if (it2.hasNext()) {
                                        Object next = it2.next();
                                        int i4 = i3 + 1;
                                        if (i3 < 0) {
                                            u75.n();
                                            throw null;
                                        }
                                        z = z3;
                                        Pair pair = (Pair) next;
                                        Pair pair2 = (Pair) CollectionsKt.S(pm9Var4.b, i3);
                                        if (pair2 != null && Intrinsics.d(pair, pair2)) {
                                            arrayList.add(pair);
                                            z3 = z;
                                            i3 = i4;
                                        }
                                    } else {
                                        z = z3;
                                    }
                                }
                                view3 = childAt;
                                long j3 = pm9Var5.a;
                                List list3 = pm9Var5.c;
                                Iterator it3 = arrayList.iterator();
                                int i5 = 0;
                                while (it3.hasNext()) {
                                    Pair pair3 = (Pair) it3.next();
                                    gc8 gc8Var5 = gc8Var4;
                                    int size2 = list3.size() - 1;
                                    long j4 = j3;
                                    int i6 = i5;
                                    while (true) {
                                        if (i6 < size2) {
                                            int i7 = size2;
                                            if (Intrinsics.d(list3.get(i6), (String) pair3.a)) {
                                                int i8 = i6 + 1;
                                                i5 = i8;
                                                if (Intrinsics.d(list3.get(i8), (String) pair3.b)) {
                                                    break;
                                                }
                                            }
                                            i6++;
                                            size2 = i7;
                                        } else {
                                            i5 = list3.size();
                                        }
                                    }
                                    j3 = j4;
                                    gc8Var4 = gc8Var5;
                                }
                                gc8Var2 = gc8Var4;
                                long j5 = j3;
                                i = 0;
                                List subList = list3.subList(0, i5 + 1);
                                if (pm9Var5.d || pm9Var4.d) {
                                    j = j5;
                                    z2 = z;
                                } else {
                                    j = j5;
                                    z2 = false;
                                }
                                pm9Var2 = new pm9(j, arrayList, subList, z2);
                            }
                            i2 = i;
                            childAt = view3;
                            gc8Var4 = gc8Var2;
                            z3 = z;
                            obj = pm9Var2 == null ? pm9Var3 : pm9Var2;
                        }
                        gc8Var = gc8Var4;
                        view = childAt;
                        pm9Var = (pm9) obj;
                    } else {
                        gc8Var = gc8Var4;
                        view = childAt;
                        pm9Var = (pm9) CollectionsKt.Q(list);
                    }
                } else {
                    gc8Var = gc8Var4;
                    view = childAt;
                    pm9Var = pm9Var3;
                }
                if (!pm9Var.b.isEmpty()) {
                    Pair P = wvo.P(view, qv8Var, pm9Var, xzbVar);
                    if (P == null) {
                        return;
                    }
                    mm9 mm9Var = (mm9) P.a;
                    ob8 ob8Var = (ob8) P.b;
                    if (mm9Var != null) {
                        pm9 path = mm9Var.getPath();
                        pm9Var3 = path == null ? pm9Var : path;
                        jc8Var = ob8Var;
                        view2 = mm9Var;
                        G = bg3.G(view2);
                        if (G == null) {
                            G = gc8Var.getBindingContext$div_release();
                        }
                        pm9 g = pm9Var3.g();
                        hp8 hp8Var = this.c;
                        hp8Var.b(G, view2, jc8Var, g);
                        hp8Var.a(G.a);
                        return;
                    }
                }
                view2 = view;
                G = bg3.G(view2);
                if (G == null) {
                }
                pm9 g2 = pm9Var3.g();
                hp8 hp8Var2 = this.c;
                hp8Var2.b(G, view2, jc8Var, g2);
                hp8Var2.a(G.a);
                return;
            default:
                xzb xzbVar2 = e23Var.b;
                gc8 gc8Var6 = this.b;
                View childAt2 = gc8Var6.getChildAt(0);
                jc8 jc8Var2 = qv8Var.a;
                if (list.isEmpty()) {
                    gc8Var3 = gc8Var6;
                    view4 = childAt2;
                    K = list;
                } else {
                    List o0 = CollectionsKt.o0(list, new mj(16));
                    List<pm9> list4 = o0;
                    Object Q = CollectionsKt.Q(o0);
                    int o = v75.o(list4, 9);
                    if (o == 0) {
                        list2 = t75.c(Q);
                    } else {
                        ArrayList arrayList2 = new ArrayList(o + 1);
                        arrayList2.add(Q);
                        Object obj2 = Q;
                        for (pm9 pm9Var6 : list4) {
                            pm9 pm9Var7 = (pm9) obj2;
                            List list5 = pm9Var7.b;
                            long j6 = pm9Var7.a;
                            View view5 = childAt2;
                            long j7 = pm9Var6.a;
                            gc8 gc8Var7 = gc8Var6;
                            List list6 = pm9Var6.b;
                            if (j6 == j7 && list5.size() < list6.size()) {
                                int i9 = 0;
                                for (Object obj3 : list5) {
                                    int i10 = i9 + 1;
                                    if (i9 < 0) {
                                        u75.n();
                                        throw null;
                                    }
                                    Pair pair4 = (Pair) obj3;
                                    Pair pair5 = (Pair) list6.get(i9);
                                    List list7 = list6;
                                    if (Intrinsics.d((String) pair4.a, (String) pair5.a) && Intrinsics.d((String) pair4.b, (String) pair5.b)) {
                                        list6 = list7;
                                        i9 = i10;
                                    }
                                }
                                arrayList2.add(pm9Var7);
                                childAt2 = view5;
                                gc8Var6 = gc8Var7;
                                obj2 = pm9Var7;
                            }
                            pm9Var7 = pm9Var6;
                            arrayList2.add(pm9Var7);
                            childAt2 = view5;
                            gc8Var6 = gc8Var7;
                            obj2 = pm9Var7;
                        }
                        list2 = arrayList2;
                    }
                    gc8Var3 = gc8Var6;
                    view4 = childAt2;
                    K = CollectionsKt.K(list2);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : K) {
                    if (!((pm9) obj4).b.isEmpty()) {
                        arrayList3.add(obj4);
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it4 = arrayList3.iterator();
                while (true) {
                    boolean hasNext = it4.hasNext();
                    hp8 hp8Var3 = this.c;
                    if (!hasNext) {
                        if (linkedHashSet.isEmpty()) {
                            e23 bindingContext$div_release = gc8Var3.getBindingContext$div_release();
                            long j8 = qv8Var.b;
                            jc8 jc8Var3 = qv8Var.a;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(j8);
                            dp8 d2 = jc8Var3.d();
                            String H2 = d2 instanceof dm9 ? wvo.H((dm9) d2) : d2.getId();
                            sb2.append(H2 != null ? StringUtils.PROCESS_POSTFIX_DELIMITER.concat(H2) : "");
                            hp8Var3.b(bindingContext$div_release, view4, jc8Var2, new pm9(c5b.a, 8, t75.c(sb2.toString()), j8));
                        }
                        hp8Var3.a(e23Var.a);
                        return;
                    }
                    pm9 pm9Var8 = (pm9) it4.next();
                    Pair P2 = wvo.P(view4, qv8Var, pm9Var8, xzbVar2);
                    if (P2 == null) {
                        return;
                    }
                    mm9 mm9Var2 = (mm9) P2.a;
                    ob8 ob8Var2 = (ob8) P2.b;
                    if (mm9Var2 != null && !linkedHashSet.contains(mm9Var2)) {
                        pm9 path2 = mm9Var2.getPath();
                        if (path2 != null) {
                            pm9Var8 = path2;
                        }
                        e23 bindingContext = mm9Var2.getBindingContext();
                        if (bindingContext == null) {
                            bindingContext = gc8Var3.getBindingContext$div_release();
                        }
                        hp8Var3.b(bindingContext, mm9Var2, ob8Var2, pm9Var8.g());
                        linkedHashSet.add(mm9Var2);
                    }
                }
                break;
        }
    }
}
