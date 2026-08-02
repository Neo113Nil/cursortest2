package defpackage;

import androidx.compose.animation.core.a;
import androidx.compose.animation.core.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public final class zi2 extends bj2 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zi2(int i, tls tlsVar) {
        super(tlsVar);
        this.c = i;
    }

    public static a c(ph7 ph7Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Iterator it = ph7Var.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj instanceof a) {
                break;
            }
        }
        if (!(obj instanceof a)) {
            obj = null;
        }
        a aVar = (a) obj;
        Collection singletonList = aVar != null ? Collections.singletonList(aVar) : EmptyList.a;
        Collection<x1u> collection = ph7Var.g;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((x1u) it2.next()).f.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it3.next();
                if (obj3 instanceof a) {
                    break;
                }
            }
            if (!(obj3 instanceof a)) {
                obj3 = null;
            }
            a aVar2 = (a) obj3;
            if (aVar2 != null) {
                arrayList.add(aVar2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (x1u x1uVar : collection) {
            cj2 cj2Var = cj2.a;
            List arrayList3 = new ArrayList();
            ArrayList i = scc.i(x1uVar);
            while (true) {
                if (i.isEmpty()) {
                    break;
                }
                x1u x1uVar2 = (x1u) ycc.z(i);
                if (((Boolean) cj2Var.invoke(x1uVar2)).booleanValue()) {
                    arrayList3 = Collections.singletonList(x1uVar2);
                    break;
                }
                i.addAll(x1uVar2.g);
            }
            x1u x1uVar3 = (x1u) kotlin.collections.a.R(arrayList3);
            if (x1uVar3 != null) {
                arrayList2.add(x1uVar3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            Iterator it5 = ((x1u) it4.next()).f.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it5.next();
                if (obj2 instanceof a) {
                    break;
                }
            }
            if (!(obj2 instanceof a)) {
                obj2 = null;
            }
            a aVar3 = (a) obj2;
            if (aVar3 != null) {
                arrayList4.add(aVar3);
            }
        }
        return (a) kotlin.collections.a.R(kotlin.collections.a.m0(kotlin.collections.a.m0(arrayList4, arrayList), singletonList));
    }

    public static jj2 d(ph7 ph7Var) {
        Collection collection = ph7Var.g;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (jl40.l(((x1u) obj).b, "rememberUpdatedState")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ycc.r(((x1u) it.next()).g, arrayList2);
        }
        ArrayList m0 = kotlin.collections.a.m0(arrayList2, arrayList);
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = m0.iterator();
        while (it2.hasNext()) {
            ycc.r(((x1u) it2.next()).f, arrayList3);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (next instanceof m3u0) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList(tcc.n(arrayList4, 10));
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((m3u0) it4.next()).getValue());
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            Object next2 = it5.next();
            if (next2 instanceof jj2) {
                arrayList6.add(next2);
            }
        }
        return (jj2) kotlin.collections.a.R(arrayList6);
    }

    public static oz40 e(ph7 ph7Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Iterator it = ph7Var.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj instanceof oz40) {
                break;
            }
        }
        if (!(obj instanceof oz40)) {
            obj = null;
        }
        oz40 oz40Var = (oz40) obj;
        Collection singletonList = oz40Var != null ? Collections.singletonList(oz40Var) : EmptyList.a;
        Collection<x1u> collection = ph7Var.g;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            Iterator it3 = ((x1u) it2.next()).f.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it3.next();
                if (obj3 instanceof oz40) {
                    break;
                }
            }
            if (!(obj3 instanceof oz40)) {
                obj3 = null;
            }
            oz40 oz40Var2 = (oz40) obj3;
            if (oz40Var2 != null) {
                arrayList.add(oz40Var2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (x1u x1uVar : collection) {
            cj2 cj2Var = cj2.a;
            List arrayList3 = new ArrayList();
            ArrayList i = scc.i(x1uVar);
            while (true) {
                if (i.isEmpty()) {
                    break;
                }
                x1u x1uVar2 = (x1u) ycc.z(i);
                if (((Boolean) cj2Var.invoke(x1uVar2)).booleanValue()) {
                    arrayList3 = Collections.singletonList(x1uVar2);
                    break;
                }
                i.addAll(x1uVar2.g);
            }
            x1u x1uVar3 = (x1u) kotlin.collections.a.R(arrayList3);
            if (x1uVar3 != null) {
                arrayList2.add(x1uVar3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            Iterator it5 = ((x1u) it4.next()).f.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it5.next();
                if (obj2 instanceof oz40) {
                    break;
                }
            }
            if (!(obj2 instanceof oz40)) {
                obj2 = null;
            }
            oz40 oz40Var3 = (oz40) obj2;
            if (oz40Var3 != null) {
                arrayList4.add(oz40Var3);
            }
        }
        return (oz40) kotlin.collections.a.R(kotlin.collections.a.m0(kotlin.collections.a.m0(arrayList4, arrayList), singletonList));
    }

    public static oz40 f(x1u x1uVar) {
        Object obj;
        Collection collection = x1uVar.f;
        Collection collection2 = x1uVar.g;
        ArrayList arrayList = new ArrayList();
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            ycc.r(((x1u) it.next()).g, arrayList);
        }
        ArrayList m0 = kotlin.collections.a.m0(arrayList, collection2);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = m0.iterator();
        while (it2.hasNext()) {
            ycc.r(((x1u) it2.next()).f, arrayList2);
        }
        Iterator it3 = kotlin.collections.a.m0(arrayList2, collection).iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            if (obj instanceof oz40) {
                break;
            }
        }
        return (oz40) (obj instanceof oz40 ? obj : null);
    }

    public static x1u g(x1u x1uVar) {
        Object obj = null;
        if (x1uVar.c == null || !jl40.l(x1uVar.b, "AnimatedContent")) {
            x1uVar = null;
        }
        if (x1uVar == null) {
            return null;
        }
        Iterator it = x1uVar.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (jl40.l(((x1u) next).b, "updateTransition")) {
                obj = next;
                break;
            }
        }
        return (x1u) obj;
    }

    public static x1u h(x1u x1uVar) {
        Object obj = null;
        if (x1uVar.c == null || !jl40.l(x1uVar.b, "AnimatedVisibility")) {
            x1uVar = null;
        }
        if (x1uVar == null) {
            return null;
        }
        Iterator it = x1uVar.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (jl40.l(((x1u) next).b, "updateTransition")) {
                obj = next;
                break;
            }
        }
        return (x1u) obj;
    }

    @Override // defpackage.bj2
    public final void a(Collection collection) {
        oe2 oe2Var;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        rsv rsvVar;
        Object obj6;
        Object obj7;
        int i = this.c;
        LinkedHashSet linkedHashSet = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList();
                for (Object obj8 : collection) {
                    if (!((x1u) obj8).a().isEmpty()) {
                        arrayList.add(obj8);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((x1u) it.next()).a().iterator();
                    while (it2.hasNext()) {
                        ((g530) it2.next()).a.c(new eo1(9, this));
                    }
                }
                break;
            case 1:
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = collection.iterator();
                while (it3.hasNext()) {
                    x1u x1uVar = (x1u) it3.next();
                    if (x1uVar.c == null || !jl40.l(x1uVar.b, "animateValueAsState")) {
                        x1uVar = null;
                    }
                    ph7 ph7Var = (x1uVar == null || !(x1uVar instanceof ph7)) ? null : (ph7) x1uVar;
                    if (ph7Var != null) {
                        arrayList2.add(ph7Var);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    ph7 ph7Var2 = (ph7) it4.next();
                    a c = c(ph7Var2);
                    jj2 d = d(ph7Var2);
                    oz40 e = e(ph7Var2);
                    if (c == null || d == null || e == null) {
                        oe2Var = null;
                    } else {
                        Object value = e.getValue();
                        ztz0 ztz0Var = value instanceof ztz0 ? (ztz0) value : null;
                        if (ztz0Var == null) {
                            ztz0Var = new ztz0(c.e());
                        }
                        oe2Var = new oe2(c, d, new c1x0(e, ztz0Var));
                        e.setValue(ztz0Var);
                    }
                    if (oe2Var != null) {
                        arrayList3.add(oe2Var);
                    }
                }
                linkedHashSet.addAll(arrayList3);
                break;
            case 2:
                ArrayList arrayList4 = new ArrayList();
                Iterator it5 = collection.iterator();
                while (it5.hasNext()) {
                    x1u g = g((x1u) it5.next());
                    if (g != null) {
                        arrayList4.add(g);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it6 = arrayList4.iterator();
                while (it6.hasNext()) {
                    Iterator it7 = ((x1u) it6.next()).f.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            obj2 = it7.next();
                            if (obj2 instanceof zx01) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    if (!(obj2 instanceof zx01)) {
                        obj2 = null;
                    }
                    zx01 zx01Var = (zx01) obj2;
                    if (zx01Var != null) {
                        arrayList5.add(zx01Var);
                    }
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it8 = arrayList4.iterator();
                while (it8.hasNext()) {
                    x1u x1uVar2 = (x1u) it8.next();
                    cj2 cj2Var = cj2.a;
                    List arrayList7 = new ArrayList();
                    ArrayList i2 = scc.i(x1uVar2);
                    while (true) {
                        if (!i2.isEmpty()) {
                            x1u x1uVar3 = (x1u) ycc.z(i2);
                            if (((Boolean) cj2Var.invoke(x1uVar3)).booleanValue()) {
                                arrayList7 = Collections.singletonList(x1uVar3);
                            } else {
                                i2.addAll(x1uVar3.g);
                            }
                        }
                    }
                    x1u x1uVar4 = (x1u) kotlin.collections.a.R(arrayList7);
                    if (x1uVar4 != null) {
                        arrayList6.add(x1uVar4);
                    }
                }
                ArrayList arrayList8 = new ArrayList();
                Iterator it9 = arrayList6.iterator();
                while (it9.hasNext()) {
                    Iterator it10 = ((x1u) it9.next()).f.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            obj = it10.next();
                            if (obj instanceof zx01) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    if (!(obj instanceof zx01)) {
                        obj = null;
                    }
                    zx01 zx01Var2 = (zx01) obj;
                    if (zx01Var2 != null) {
                        arrayList8.add(zx01Var2);
                    }
                }
                ArrayList m0 = kotlin.collections.a.m0(arrayList8, arrayList5);
                ArrayList arrayList9 = new ArrayList(tcc.n(m0, 10));
                Iterator it11 = m0.iterator();
                while (it11.hasNext()) {
                    arrayList9.add(new af2((zx01) it11.next()));
                }
                linkedHashSet.addAll(arrayList9);
                break;
            case 3:
                ArrayList arrayList10 = new ArrayList();
                Iterator it12 = collection.iterator();
                while (it12.hasNext()) {
                    x1u h = h((x1u) it12.next());
                    if (h != null) {
                        arrayList10.add(h);
                    }
                }
                ArrayList arrayList11 = new ArrayList();
                Iterator it13 = arrayList10.iterator();
                while (it13.hasNext()) {
                    Iterator it14 = ((x1u) it13.next()).f.iterator();
                    while (true) {
                        if (it14.hasNext()) {
                            obj4 = it14.next();
                            if (obj4 instanceof zx01) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    if (!(obj4 instanceof zx01)) {
                        obj4 = null;
                    }
                    zx01 zx01Var3 = (zx01) obj4;
                    if (zx01Var3 != null) {
                        arrayList11.add(zx01Var3);
                    }
                }
                ArrayList arrayList12 = new ArrayList();
                Iterator it15 = arrayList10.iterator();
                while (it15.hasNext()) {
                    x1u x1uVar5 = (x1u) it15.next();
                    cj2 cj2Var2 = cj2.a;
                    List arrayList13 = new ArrayList();
                    ArrayList i3 = scc.i(x1uVar5);
                    while (true) {
                        if (!i3.isEmpty()) {
                            x1u x1uVar6 = (x1u) ycc.z(i3);
                            if (((Boolean) cj2Var2.invoke(x1uVar6)).booleanValue()) {
                                arrayList13 = Collections.singletonList(x1uVar6);
                            } else {
                                i3.addAll(x1uVar6.g);
                            }
                        }
                    }
                    x1u x1uVar7 = (x1u) kotlin.collections.a.R(arrayList13);
                    if (x1uVar7 != null) {
                        arrayList12.add(x1uVar7);
                    }
                }
                ArrayList arrayList14 = new ArrayList();
                Iterator it16 = arrayList12.iterator();
                while (it16.hasNext()) {
                    Iterator it17 = ((x1u) it16.next()).f.iterator();
                    while (true) {
                        if (it17.hasNext()) {
                            obj3 = it17.next();
                            if (obj3 instanceof zx01) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    if (!(obj3 instanceof zx01)) {
                        obj3 = null;
                    }
                    zx01 zx01Var4 = (zx01) obj3;
                    if (zx01Var4 != null) {
                        arrayList14.add(zx01Var4);
                    }
                }
                ArrayList m02 = kotlin.collections.a.m0(arrayList14, arrayList11);
                ArrayList arrayList15 = new ArrayList(tcc.n(m02, 10));
                Iterator it18 = m02.iterator();
                while (it18.hasNext()) {
                    arrayList15.add(new og2((zx01) it18.next()));
                }
                linkedHashSet.addAll(arrayList15);
                break;
            case 4:
                ArrayList arrayList16 = new ArrayList();
                Iterator it19 = collection.iterator();
                while (it19.hasNext()) {
                    x1u x1uVar8 = (x1u) it19.next();
                    if (x1uVar8.c == null || !jl40.l(x1uVar8.b, "rememberInfiniteTransition")) {
                        x1uVar8 = null;
                    }
                    ph7 ph7Var3 = (x1uVar8 == null || !(x1uVar8 instanceof ph7)) ? null : (ph7) x1uVar8;
                    if (ph7Var3 != null) {
                        arrayList16.add(ph7Var3);
                    }
                }
                ArrayList arrayList17 = new ArrayList();
                Iterator it20 = arrayList16.iterator();
                while (it20.hasNext()) {
                    ph7 ph7Var4 = (ph7) it20.next();
                    Collection collection2 = ph7Var4.f;
                    Collection collection3 = ph7Var4.g;
                    ArrayList arrayList18 = new ArrayList();
                    Iterator it21 = collection3.iterator();
                    while (it21.hasNext()) {
                        ycc.r(((x1u) it21.next()).f, arrayList18);
                    }
                    Iterator it22 = kotlin.collections.a.m0(arrayList18, collection2).iterator();
                    while (true) {
                        if (it22.hasNext()) {
                            obj5 = it22.next();
                            if (obj5 instanceof c) {
                            }
                        } else {
                            obj5 = null;
                        }
                    }
                    if (!(obj5 instanceof c)) {
                        obj5 = null;
                    }
                    c cVar = (c) obj5;
                    oz40 f = f(ph7Var4);
                    if (cVar == null || f == null) {
                        rsvVar = null;
                    } else {
                        Object value2 = f.getValue();
                        ztz0 ztz0Var2 = value2 instanceof ztz0 ? (ztz0) value2 : null;
                        if (ztz0Var2 == null) {
                            ztz0Var2 = new ztz0(0L);
                        }
                        rsvVar = new rsv(cVar, new c1x0(f, ztz0Var2));
                        f.setValue(ztz0Var2);
                    }
                    if (rsvVar != null) {
                        arrayList17.add(rsvVar);
                    }
                }
                linkedHashSet.addAll(arrayList17);
                break;
            default:
                ArrayList arrayList19 = new ArrayList();
                Iterator it23 = collection.iterator();
                while (it23.hasNext()) {
                    x1u x1uVar9 = (x1u) it23.next();
                    if (x1uVar9.c == null || !jl40.l(x1uVar9.b, "updateTransition")) {
                        x1uVar9 = null;
                    }
                    if (x1uVar9 != null) {
                        arrayList19.add(x1uVar9);
                    }
                }
                ArrayList arrayList20 = new ArrayList();
                Iterator it24 = arrayList19.iterator();
                while (it24.hasNext()) {
                    Iterator it25 = ((x1u) it24.next()).f.iterator();
                    while (true) {
                        if (it25.hasNext()) {
                            obj7 = it25.next();
                            if (obj7 instanceof zx01) {
                            }
                        } else {
                            obj7 = null;
                        }
                    }
                    if (!(obj7 instanceof zx01)) {
                        obj7 = null;
                    }
                    zx01 zx01Var5 = (zx01) obj7;
                    if (zx01Var5 != null) {
                        arrayList20.add(zx01Var5);
                    }
                }
                ArrayList arrayList21 = new ArrayList();
                Iterator it26 = arrayList19.iterator();
                while (it26.hasNext()) {
                    x1u x1uVar10 = (x1u) it26.next();
                    cj2 cj2Var3 = cj2.a;
                    List arrayList22 = new ArrayList();
                    ArrayList i4 = scc.i(x1uVar10);
                    while (true) {
                        if (!i4.isEmpty()) {
                            x1u x1uVar11 = (x1u) ycc.z(i4);
                            if (((Boolean) cj2Var3.invoke(x1uVar11)).booleanValue()) {
                                arrayList22 = Collections.singletonList(x1uVar11);
                            } else {
                                i4.addAll(x1uVar11.g);
                            }
                        }
                    }
                    x1u x1uVar12 = (x1u) kotlin.collections.a.R(arrayList22);
                    if (x1uVar12 != null) {
                        arrayList21.add(x1uVar12);
                    }
                }
                ArrayList arrayList23 = new ArrayList();
                Iterator it27 = arrayList21.iterator();
                while (it27.hasNext()) {
                    Iterator it28 = ((x1u) it27.next()).f.iterator();
                    while (true) {
                        if (it28.hasNext()) {
                            obj6 = it28.next();
                            if (obj6 instanceof zx01) {
                            }
                        } else {
                            obj6 = null;
                        }
                    }
                    if (!(obj6 instanceof zx01)) {
                        obj6 = null;
                    }
                    zx01 zx01Var6 = (zx01) obj6;
                    if (zx01Var6 != null) {
                        arrayList23.add(zx01Var6);
                    }
                }
                ArrayList m03 = kotlin.collections.a.m0(arrayList23, arrayList20);
                ArrayList arrayList24 = new ArrayList(tcc.n(m03, 10));
                Iterator it29 = m03.iterator();
                while (it29.hasNext()) {
                    arrayList24.add(new py01((zx01) it29.next()));
                }
                linkedHashSet.addAll(arrayList24);
                break;
        }
    }

    @Override // defpackage.bj2
    public final boolean b(x1u x1uVar) {
        Object obj;
        ph7 ph7Var = null;
        ph7Var = null;
        switch (this.c) {
            case 0:
                if (!x1uVar.a().isEmpty()) {
                    List a = x1uVar.a();
                    if (!(a instanceof Collection) || !a.isEmpty()) {
                        Iterator it = a.iterator();
                        while (it.hasNext()) {
                            if (((g530) it.next()).a.c(new f22(15))) {
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            case 1:
                if (x1uVar.c == null || !jl40.l(x1uVar.b, "animateValueAsState")) {
                    x1uVar = null;
                }
                if (x1uVar != null && (x1uVar instanceof ph7)) {
                    ph7Var = (ph7) x1uVar;
                }
                if (ph7Var != null && c(ph7Var) != null && d(ph7Var) != null && e(ph7Var) != null) {
                    break;
                }
                break;
            case 2:
                if (g(x1uVar) != null) {
                    break;
                }
                break;
            case 3:
                if (h(x1uVar) != null) {
                    break;
                }
                break;
            case 4:
                x1u x1uVar2 = (x1uVar.c == null || !jl40.l(x1uVar.b, "rememberInfiniteTransition")) ? null : x1uVar;
                if (((x1uVar2 == null || !(x1uVar2 instanceof ph7)) ? null : (ph7) x1uVar2) != null) {
                    Collection collection = x1uVar.f;
                    Collection collection2 = x1uVar.g;
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        ycc.r(((x1u) it2.next()).f, arrayList);
                    }
                    Iterator it3 = kotlin.collections.a.m0(arrayList, collection).iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj = it3.next();
                            if (obj instanceof c) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    if (((c) (obj instanceof c ? obj : null)) != null && f(x1uVar) != null) {
                        break;
                    }
                }
                break;
            default:
                if (x1uVar.c == null || !jl40.l(x1uVar.b, "updateTransition")) {
                    x1uVar = null;
                }
                if (x1uVar != null) {
                    break;
                }
                break;
        }
        return true;
    }
}
