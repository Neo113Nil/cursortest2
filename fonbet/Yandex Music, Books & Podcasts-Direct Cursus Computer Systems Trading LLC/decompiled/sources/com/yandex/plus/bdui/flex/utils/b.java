package com.yandex.plus.bdui.flex.utils;

import com.yandex.passport.internal.ui.l;
import com.yandex.passport.sloth.command.data.k0;
import com.yandex.plus.bdui.flex.action.j;
import com.yandex.plus.bdui.flex.document.FlexSlice;
import com.yandex.plus.bdui.m;
import com.yandex.plus.bdui.q;
import com.yandex.plus.core.reflect.i;
import defpackage.asq;
import defpackage.b6e;
import defpackage.btf;
import defpackage.ern;
import defpackage.f0q;
import defpackage.f9f;
import defpackage.jyr;
import defpackage.kb6;
import defpackage.lm4;
import defpackage.m2a;
import defpackage.md;
import defpackage.n2a;
import defpackage.o2a;
import defpackage.p2a;
import defpackage.q2a;
import defpackage.r7b;
import defpackage.sro;
import defpackage.t5a;
import defpackage.v75;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {
    public final q a;
    public final jyr b = btf.b(new k0(18));

    public b(q qVar) {
        this.a = qVar;
    }

    public static o2a a(com.yandex.plus.bdui.document.c cVar) {
        m2a m2aVar;
        com.yandex.plus.bdui.document.a aVar = cVar.b;
        n2a n2aVar = null;
        if (aVar != null) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                m2aVar = m2a.a;
            } else if (ordinal == 1) {
                m2aVar = m2a.b;
            } else if (ordinal == 2) {
                m2aVar = m2a.c;
            } else {
                if (ordinal != 3) {
                    b6e.s();
                    return null;
                }
                m2aVar = m2a.d;
            }
        } else {
            m2aVar = null;
        }
        com.yandex.plus.bdui.document.b bVar = cVar.c;
        if (bVar != null) {
            if (a.b[bVar.ordinal()] != 1) {
                b6e.s();
                return null;
            }
            n2aVar = n2a.a;
        }
        return new o2a(cVar.a, m2aVar, n2aVar);
    }

    public static com.yandex.plus.bdui.action.a f(md mdVar) {
        com.yandex.plus.bdui.action.a aVar;
        mdVar.getClass();
        com.yandex.plus.bdui.flex.action.e eVar = mdVar instanceof com.yandex.plus.bdui.flex.action.e ? (com.yandex.plus.bdui.flex.action.e) mdVar : null;
        return (eVar == null || (aVar = eVar.a) == null) ? new j(mdVar) : aVar;
    }

    public static com.yandex.plus.bdui.document.c g(o2a o2aVar) {
        com.yandex.plus.bdui.document.a aVar;
        m2a m2aVar = o2aVar.b;
        com.yandex.plus.bdui.document.b bVar = null;
        if (m2aVar != null) {
            int ordinal = m2aVar.ordinal();
            if (ordinal == 0) {
                aVar = com.yandex.plus.bdui.document.a.a;
            } else if (ordinal == 1) {
                aVar = com.yandex.plus.bdui.document.a.b;
            } else if (ordinal == 2) {
                aVar = com.yandex.plus.bdui.document.a.c;
            } else {
                if (ordinal != 3) {
                    b6e.s();
                    return null;
                }
                aVar = com.yandex.plus.bdui.document.a.d;
            }
        } else {
            aVar = null;
        }
        n2a n2aVar = o2aVar.c;
        if (n2aVar != null) {
            if (a.a[n2aVar.ordinal()] != 1) {
                b6e.s();
                return null;
            }
            bVar = com.yandex.plus.bdui.document.b.a;
        }
        return new com.yandex.plus.bdui.document.c(o2aVar.a, aVar, bVar);
    }

    public static com.yandex.plus.bdui.query.e i(t5a t5aVar) {
        t5aVar.getClass();
        String str = t5aVar.a;
        Map map = t5aVar.b;
        Map map2 = t5aVar.c;
        str.getClass();
        map.getClass();
        return new com.yandex.plus.bdui.query.e(str, map, map2);
    }

    public final q2a b(com.yandex.plus.bdui.document.e eVar) {
        p2a p2aVar;
        eVar.getClass();
        com.yandex.plus.bdui.flex.content.a aVar = new com.yandex.plus.bdui.flex.content.a(eVar.a);
        com.yandex.plus.bdui.plus.scaffold.a aVar2 = eVar.b;
        com.yandex.plus.bdui.flex.scaffold.a aVar3 = aVar2 != null ? new com.yandex.plus.bdui.flex.scaffold.a(aVar2) : null;
        f0q c = c(eVar.c);
        com.yandex.plus.bdui.document.d dVar = eVar.d;
        if (dVar != null) {
            com.yandex.plus.bdui.document.c cVar = dVar.a;
            o2a a = cVar != null ? a(cVar) : null;
            com.yandex.plus.bdui.document.c cVar2 = dVar.b;
            p2aVar = new p2a(a, cVar2 != null ? a(cVar2) : null);
        } else {
            p2aVar = null;
        }
        return new q2a(aVar, aVar3, c, null, null, p2aVar);
    }

    public final f0q c(com.yandex.plus.bdui.shared.b bVar) {
        bVar.getClass();
        Collection b = bVar.b();
        ArrayList arrayList = new ArrayList(v75.o(b, 10));
        Iterator it = b.iterator();
        while (it.hasNext()) {
            arrayList.add(d((com.yandex.plus.bdui.shared.a) it.next()));
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            return f0q.b;
        }
        f0q f0qVar = f0q.b;
        return asq.y(arrayList);
    }

    public final FlexSlice d(com.yandex.plus.bdui.shared.a aVar) {
        aVar.getClass();
        final i iVar = (i) this.b.getValue();
        final com.yandex.plus.core.reflect.g[] gVarArr = {new com.yandex.passport.sloth.ui.c(5, aVar), new l(10, aVar, this)};
        iVar.getClass();
        lm4 a = ern.a(aVar.getClass());
        LinkedHashMap linkedHashMap = iVar.b;
        ClassLoader classLoader = (ClassLoader) linkedHashMap.get(a);
        if (classLoader == null) {
            classLoader = new com.yandex.plus.core.reflect.a((ClassLoader) iVar.d.getValue());
            linkedHashMap.put(a, classLoader);
        }
        final Class b = a.b();
        b.getClass();
        Object newProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{FlexSlice.class}, new InvocationHandler() { // from class: com.yandex.plus.core.reflect.h
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                Class<?> declaringClass = method.getDeclaringClass();
                boolean d = Intrinsics.d(declaringClass, Object.class);
                i iVar2 = i.this;
                if (d && Intrinsics.d(method.getName(), "toString")) {
                    return ((String) iVar2.c.getValue()) + '$' + b.b(b) + '@' + System.identityHashCode(iVar2);
                }
                if (Intrinsics.d(declaringClass, Object.class)) {
                    if (objArr == null) {
                        objArr = new Object[0];
                    }
                    return method.invoke(iVar2, Arrays.copyOf(objArr, objArr.length));
                }
                g[] gVarArr2 = gVarArr;
                e eVar = e.a;
                d dVar = eVar;
                for (g gVar : gVarArr2) {
                    obj.getClass();
                    Object[] objArr2 = objArr == null ? new Object[0] : objArr;
                    dVar = gVar.invoke(obj, method, Arrays.copyOf(objArr2, objArr2.length));
                    if (dVar instanceof f) {
                        break;
                    }
                }
                if (dVar instanceof f) {
                    return ((f) dVar).a;
                }
                if (!dVar.equals(eVar)) {
                    b6e.s();
                    return null;
                }
                throw new IllegalStateException(("Unknown method " + method.getName() + '!').toString());
            }
        });
        newProxyInstance.getClass();
        iVar.a.add(ern.a(newProxyInstance.getClass()));
        return (FlexSlice) newProxyInstance;
    }

    public final m e(r7b r7bVar) {
        r7bVar.getClass();
        return new m((com.yandex.plus.bdui.action.c) this.a.invoke(this, r7bVar.a));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.yandex.plus.bdui.document.e h(q2a q2aVar) {
        com.yandex.plus.bdui.plus.scaffold.a aVar;
        p2a p2aVar;
        q2aVar.getClass();
        kb6 kb6Var = q2aVar.a;
        kb6Var.getClass();
        com.yandex.plus.bdui.document.d dVar = null;
        com.yandex.plus.bdui.flex.content.a aVar2 = kb6Var instanceof com.yandex.plus.bdui.flex.content.a ? (com.yandex.plus.bdui.flex.content.a) kb6Var : null;
        com.yandex.plus.bdui.content.a aVar3 = aVar2 != null ? aVar2.a : null;
        if (aVar3 == null) {
            return null;
        }
        sro sroVar = q2aVar.b;
        if (sroVar != null) {
            com.yandex.plus.bdui.flex.scaffold.a aVar4 = sroVar instanceof com.yandex.plus.bdui.flex.scaffold.a ? (com.yandex.plus.bdui.flex.scaffold.a) sroVar : null;
            if (aVar4 != null) {
                aVar = aVar4.a;
                com.yandex.plus.bdui.shared.b j = j(q2aVar.c);
                p2aVar = q2aVar.f;
                if (p2aVar != null) {
                    o2a o2aVar = p2aVar.a;
                    com.yandex.plus.bdui.document.c g = o2aVar != null ? g(o2aVar) : null;
                    o2a o2aVar2 = p2aVar.b;
                    dVar = new com.yandex.plus.bdui.document.d(g, o2aVar2 != null ? g(o2aVar2) : null);
                }
                return new com.yandex.plus.bdui.document.e(aVar3, aVar, j, dVar);
            }
        }
        aVar = null;
        com.yandex.plus.bdui.shared.b j2 = j(q2aVar.c);
        p2aVar = q2aVar.f;
        if (p2aVar != null) {
        }
        return new com.yandex.plus.bdui.document.e(aVar3, aVar, j2, dVar);
    }

    public final com.yandex.plus.bdui.shared.b j(f0q f0qVar) {
        f0qVar.getClass();
        LinkedHashSet linkedHashSet = ((i) this.b.getValue()).a;
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            FlexSlice flexSlice = (FlexSlice) f0qVar.b((f9f) it.next());
            if (flexSlice != null) {
                arrayList.add(flexSlice);
            }
        }
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((FlexSlice) it2.next()).getPlusSlice());
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        return arrayList2 != null ? new com.yandex.plus.bdui.shared.b(arrayList2) : com.yandex.plus.bdui.shared.b.a;
    }
}
