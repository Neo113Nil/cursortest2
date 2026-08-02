package jason.statham.tools;

import defpackage.b64;
import defpackage.d6x;
import defpackage.gw00;
import defpackage.j5x;
import defpackage.jl40;
import defpackage.k5x;
import defpackage.kbs;
import defpackage.m5x;
import defpackage.ny61;
import defpackage.o5x;
import defpackage.oyr;
import defpackage.p5x;
import defpackage.p6x;
import defpackage.q5x;
import defpackage.q6x;
import defpackage.r5x;
import defpackage.r6x;
import defpackage.s6x;
import defpackage.scc;
import defpackage.tls;
import defpackage.v4x;
import defpackage.v6x;
import defpackage.vg10;
import defpackage.w511;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes9.dex */
public abstract class a {
    public static final d6x a(d6x d6xVar, final r5x r5xVar, final j5x j5xVar) {
        return new d6x(l(d6xVar.a, r5xVar, new tls() { // from class: jason.statham.tools.JasonPatcherKt$append$updatedValue$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                j5x j5xVar2 = (j5x) obj;
                o5x o5xVar = (o5x) kotlin.collections.a.Z(r5x.this.a);
                if (o5xVar instanceof q5x) {
                    String str = ((q5x) o5xVar).a;
                    if (!(j5xVar2 instanceof m5x)) {
                        if (j5xVar2 == null) {
                            return a.h(str, a.b(j5xVar));
                        }
                        kbs.f(j5xVar2, "Expected JasonObject as value container but actual container is ");
                        return null;
                    }
                    m5x m5xVar = (m5x) j5xVar2;
                    j5x j5xVar3 = (j5x) m5xVar.a.get(str);
                    if (j5xVar3 instanceof v4x) {
                        v4x v4xVar = (v4x) j5xVar3;
                        return a.f(m5xVar, str, a.e(v4xVar, v4xVar.a.size(), j5xVar));
                    }
                    if (j5xVar3 == null) {
                        return a.f(m5xVar, str, a.b(j5xVar));
                    }
                    kbs.f(j5xVar2, "Expected JasonArray as value container but actual container is ");
                    return null;
                }
                if (!(o5xVar instanceof p5x)) {
                    w511.b();
                    return null;
                }
                int i = ((p5x) o5xVar).a;
                if (!(j5xVar2 instanceof v4x)) {
                    if (j5xVar2 == null) {
                        return a.b(a.b(j5xVar));
                    }
                    kbs.f(j5xVar2, "Expected JasonArray as value container but actual container is ");
                    return null;
                }
                v4x v4xVar2 = (v4x) j5xVar2;
                j5x j5xVar4 = (j5x) v4xVar2.a.get(i);
                if (j5xVar4 instanceof v4x) {
                    v4x v4xVar3 = (v4x) j5xVar4;
                    return a.e(v4xVar2, i, a.e(v4xVar3, v4xVar3.a.size(), j5xVar));
                }
                kbs.f(j5xVar2, "Expected JasonArray as value container but actual container is ");
                return null;
            }
        }), d6xVar.b);
    }

    public static final v4x b(j5x j5xVar) {
        return new v4x(Collections.singletonList(j5xVar));
    }

    public static final d6x c(d6x d6xVar, final r5x r5xVar, final j5x j5xVar, s6x s6xVar) {
        return new d6x(l(d6xVar.a, r5xVar, new tls() { // from class: jason.statham.tools.JasonPatcherKt$assign$updatedValue$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                j5x j5xVar2 = (j5x) obj;
                o5x o5xVar = (o5x) kotlin.collections.a.Z(r5x.this.a);
                if (o5xVar instanceof q5x) {
                    if (j5xVar2 instanceof m5x) {
                        return a.f((m5x) j5xVar2, ((q5x) o5xVar).a, j5xVar);
                    }
                    if (j5xVar2 == null) {
                        return a.h(((q5x) o5xVar).a, j5xVar);
                    }
                    kbs.f(j5xVar2, "Expected JasonObject as value container but actual container is ");
                    return null;
                }
                if (!(o5xVar instanceof p5x)) {
                    w511.b();
                    return null;
                }
                if (j5xVar2 instanceof v4x) {
                    return a.e((v4x) j5xVar2, ((p5x) o5xVar).a, j5xVar);
                }
                if (j5xVar2 != null) {
                    kbs.f(j5xVar2, "Expected JasonArray as value container but actual container is ");
                    return null;
                }
                int i = ((p5x) o5xVar).a;
                if (i == 0) {
                    return a.b(j5xVar);
                }
                ny61.m(oyr.j(i, "Attempt to set element with index ", " while array is empty"));
                return null;
            }
        }), n(d6xVar.b, s6xVar));
    }

    public static final d6x d(d6x d6xVar, final r5x r5xVar, final j5x j5xVar, s6x s6xVar) {
        v6x l = l(d6xVar.a, r5xVar, new tls() { // from class: jason.statham.tools.JasonPatcherKt$assignNodeWithDescendingTags$updatedValue$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                j5x j5xVar2 = (j5x) obj;
                o5x o5xVar = (o5x) kotlin.collections.a.Z(r5x.this.a);
                if (o5xVar instanceof q5x) {
                    if (j5xVar2 instanceof m5x) {
                        return a.f((m5x) j5xVar2, ((q5x) o5xVar).a, j5xVar);
                    }
                    if (j5xVar2 == null) {
                        return a.h(((q5x) o5xVar).a, j5xVar);
                    }
                    kbs.f(j5xVar2, "Expected JasonObject as value container but actual container is ");
                    return null;
                }
                if (!(o5xVar instanceof p5x)) {
                    w511.b();
                    return null;
                }
                if (j5xVar2 instanceof v4x) {
                    return a.e((v4x) j5xVar2, ((p5x) o5xVar).a, j5xVar);
                }
                if (j5xVar2 != null) {
                    kbs.f(j5xVar2, "Expected JasonArray as value container but actual container is ");
                    return null;
                }
                int i = ((p5x) o5xVar).a;
                if (i == 0) {
                    return a.b(j5xVar);
                }
                ny61.m(oyr.j(i, "Attempt to set element with index ", " while array is empty"));
                return null;
            }
        });
        s6x s6xVar2 = d6xVar.b;
        Map map = s6xVar.a;
        if (!map.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                q6x q6xVar = (q6x) entry.getValue();
                for (o5x o5xVar : kotlin.collections.a.q0(r5xVar.a)) {
                    if (o5xVar instanceof q5x) {
                        q6xVar = new r6x(gw00.e(new Pair(((q5x) o5xVar).a, q6xVar)));
                    }
                }
                linkedHashMap.put(key, q6xVar);
            }
            s6xVar2 = n(s6xVar2, new s6x(linkedHashMap));
        }
        return new d6x(l, s6xVar2);
    }

    public static final v4x e(v4x v4xVar, int i, j5x j5xVar) {
        ArrayList arrayList = new ArrayList(v4xVar.a);
        if (i < arrayList.size()) {
            arrayList.set(i, j5xVar);
        } else {
            if (i != arrayList.size()) {
                ny61.i(b64.t(i, "Attempt to set element with index ", " while array size is "), v4xVar.a.size());
                return null;
            }
            arrayList.add(j5xVar);
        }
        return new v4x(arrayList);
    }

    public static final m5x f(m5x m5xVar, String str, j5x j5xVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(m5xVar.a);
        linkedHashMap.put(str, j5xVar);
        return new m5x(linkedHashMap);
    }

    public static final d6x g(d6x d6xVar, final r5x r5xVar) {
        return new d6x(l(d6xVar.a, r5xVar, new tls() { // from class: jason.statham.tools.JasonPatcherKt$deleteNode$updatedValue$1
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                j5x j5xVar = (j5x) obj;
                o5x o5xVar = (o5x) kotlin.collections.a.Z(r5x.this.a);
                if (o5xVar instanceof q5x) {
                    if (j5xVar instanceof m5x) {
                        return a.i((m5x) j5xVar, ((q5x) o5xVar).a);
                    }
                    if (j5xVar != null) {
                        kbs.f(j5xVar, "Expected JasonObject as value container but actual container is ");
                        return null;
                    }
                } else {
                    if (!(o5xVar instanceof p5x)) {
                        w511.b();
                        return null;
                    }
                    if (j5xVar instanceof v4x) {
                        v4x v4xVar = (v4x) j5xVar;
                        List list = v4xVar.a;
                        int i = ((p5x) o5xVar).a;
                        if (i >= list.size()) {
                            return v4xVar;
                        }
                        ArrayList arrayList = new ArrayList(list);
                        arrayList.remove(i);
                        return new v4x(arrayList);
                    }
                    if (j5xVar != null) {
                        kbs.f(j5xVar, "Expected JasonArray as value container but actual container is ");
                        return null;
                    }
                }
                return null;
            }
        }), d6xVar.b);
    }

    public static final m5x h(String str, j5x j5xVar) {
        return new m5x(gw00.e(new Pair(str, j5xVar)));
    }

    public static final m5x i(m5x m5xVar, String str) {
        Map map = m5xVar.a;
        if (map.containsKey(str)) {
            if (map.size() == 1) {
                return null;
            }
            if (map.containsKey(str)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.remove(str);
                return new m5x(linkedHashMap);
            }
        }
        return m5xVar;
    }

    public static final j5x j(j5x j5xVar, r5x r5xVar, int i, tls tlsVar) {
        ArrayList arrayList = r5xVar.a;
        ArrayList arrayList2 = r5xVar.a;
        o5x o5xVar = (o5x) arrayList.get(i);
        if (o5xVar instanceof q5x) {
            return k(j5xVar instanceof m5x ? (m5x) j5xVar : null, r5xVar, i, tlsVar);
        }
        if (!(o5xVar instanceof p5x)) {
            w511.b();
            return null;
        }
        v4x v4xVar = j5xVar instanceof v4x ? (v4x) j5xVar : null;
        o5x o5xVar2 = (o5x) arrayList2.get(i);
        if (!(o5xVar2 instanceof p5x)) {
            vg10.r(o5xVar2, "Traverse over JasonArray possible only with JasonPath.Index but actual path fragment is ");
            return null;
        }
        int i2 = ((p5x) o5xVar2).a;
        if (scc.f(arrayList2) == i) {
            j5x j5xVar2 = (j5x) tlsVar.invoke(v4xVar);
            if (j5xVar2 instanceof v4x) {
                return (v4x) j5xVar2;
            }
            vg10.r(j5xVar2, "Expected JasonArray but actual node is ");
            return null;
        }
        j5x j5xVar3 = v4xVar != null ? (j5x) v4xVar.a.get(i2) : null;
        j5x j = j(j5xVar3, r5xVar, i + 1, tlsVar);
        if (j == null) {
            j = k5x.a;
        }
        return !jl40.l(j, j5xVar3) ? v4xVar != null ? e(v4xVar, i2, j) : b(j) : v4xVar == null ? b(j) : v4xVar;
    }

    public static final m5x k(m5x m5xVar, r5x r5xVar, int i, tls tlsVar) {
        o5x o5xVar = (o5x) r5xVar.a.get(i);
        if (!(o5xVar instanceof q5x)) {
            vg10.r(o5xVar, "Traverse over JasonObject possible only with JasonPath.Key but actual path fragment is ");
            return null;
        }
        String str = ((q5x) o5xVar).a;
        if (scc.f(r5xVar.a) == i) {
            j5x j5xVar = (j5x) tlsVar.invoke(m5xVar);
            if (j5xVar != null) {
                if (j5xVar instanceof m5x) {
                    return (m5x) j5xVar;
                }
                vg10.r(j5xVar, "Expected JasonObject but actual node is ");
                return null;
            }
        } else {
            j5x j5xVar2 = m5xVar != null ? (j5x) m5xVar.a.get(str) : null;
            j5x j = j(j5xVar2, r5xVar, i + 1, tlsVar);
            if (m5xVar != null) {
                return !jl40.l(j, j5xVar2) ? j == null ? i(m5xVar, str) : f(m5xVar, str, j) : m5xVar;
            }
            if (j != null) {
                return h(str, j);
            }
        }
        return null;
    }

    public static final v6x l(v6x v6xVar, r5x r5xVar, tls tlsVar) {
        m5x k = k(v6xVar.a, r5xVar, 0, tlsVar);
        if (k == null) {
            k = k5x.a;
        }
        return new v6x(k);
    }

    public static final r6x m(r6x r6xVar, r6x r6xVar2) {
        if (!r6xVar.equals(r6xVar2)) {
            Map map = r6xVar2.a;
            if (!map.isEmpty()) {
                Map map2 = r6xVar.a;
                if (map2.isEmpty()) {
                    return r6xVar2;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                for (Map.Entry entry : map2.entrySet()) {
                    String str = (String) entry.getKey();
                    q6x q6xVar = (q6x) entry.getValue();
                    q6x q6xVar2 = (q6x) map.get(str);
                    if (q6xVar2 == null) {
                        linkedHashMap.put(str, q6xVar);
                    } else if ((q6xVar instanceof r6x) && (q6xVar2 instanceof r6x)) {
                        linkedHashMap.put(str, m((r6x) q6xVar, (r6x) q6xVar2));
                    } else if ((q6xVar instanceof p6x) && (q6xVar2 instanceof r6x)) {
                        linkedHashMap.put(str, q6xVar);
                    } else {
                        linkedHashMap.put(str, q6xVar2);
                    }
                }
                return new r6x(linkedHashMap);
            }
        }
        return r6xVar;
    }

    public static final s6x n(s6x s6xVar, s6x s6xVar2) {
        if (!jl40.l(s6xVar, s6xVar2)) {
            Map map = s6xVar2.a;
            if (!map.isEmpty()) {
                if (s6xVar.a.isEmpty()) {
                    return s6xVar2;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                for (Map.Entry entry : s6xVar.a.entrySet()) {
                    String str = (String) entry.getKey();
                    q6x q6xVar = (q6x) entry.getValue();
                    q6x q6xVar2 = (q6x) map.get(str);
                    if (q6xVar2 == null) {
                        linkedHashMap.put(str, q6xVar);
                    } else if ((q6xVar instanceof r6x) && (q6xVar2 instanceof r6x)) {
                        linkedHashMap.put(str, m((r6x) q6xVar, (r6x) q6xVar2));
                    } else {
                        linkedHashMap.put(str, q6xVar2);
                    }
                }
                return new s6x(linkedHashMap);
            }
        }
        return s6xVar;
    }
}
