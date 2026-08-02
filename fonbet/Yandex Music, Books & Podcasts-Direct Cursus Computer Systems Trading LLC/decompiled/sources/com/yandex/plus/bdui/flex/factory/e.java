package com.yandex.plus.bdui.flex.factory;

import com.yandex.plus.core.templating.render.z;
import com.yandex.plus.home.plaque.repository.api.model.q;
import com.yandex.plus.home.plaque.repository.api.model.r;
import com.yandex.plus.home.plaque.repository.api.model.s;
import com.yandex.plus.plaquesdk.plaque.api.models.j0;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.gf;
import defpackage.h9f;
import defpackage.hf;
import defpackage.j0v;
import defpackage.jf;
import defpackage.kah;
import defpackage.kc6;
import defpackage.lc6;
import defpackage.mc6;
import defpackage.nm6;
import defpackage.pg;
import defpackage.q5b;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.tah;
import defpackage.uop;
import defpackage.v75;
import defpackage.vro;
import defpackage.wis;
import defpackage.wro;
import defpackage.xq0;
import defpackage.xro;
import defpackage.z75;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class e {
    public final com.yandex.plus.log.api.b a;

    public e(com.yandex.plus.log.api.b bVar, int i) {
        switch (i) {
            case 2:
                bVar.getClass();
                this.a = bVar;
                break;
            case 3:
                bVar.getClass();
                this.a = bVar;
                break;
            case 4:
                bVar.getClass();
                this.a = bVar;
                break;
            case 5:
                this.a = bVar;
                break;
            case 6:
                bVar.getClass();
                this.a = bVar;
                break;
            default:
                bVar.getClass();
                this.a = bVar;
                break;
        }
    }

    public static boolean a(s sVar, Map map) {
        int compareTo;
        if (sVar instanceof com.yandex.plus.home.plaque.repository.api.model.e) {
            Collection collection = ((com.yandex.plus.home.plaque.repository.api.model.e) sVar).a;
            if (!(collection instanceof Collection) || !collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!a((s) it.next(), map)) {
                        return false;
                    }
                }
            }
        } else {
            if (sVar instanceof com.yandex.plus.home.plaque.repository.api.model.f) {
                ArrayList arrayList = ((com.yandex.plus.home.plaque.repository.api.model.f) sVar).a;
                if (arrayList.isEmpty()) {
                    return false;
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (a((s) it2.next(), map)) {
                    }
                }
                return false;
            }
            if (sVar instanceof com.yandex.plus.home.plaque.repository.api.model.m) {
                if (a(((com.yandex.plus.home.plaque.repository.api.model.m) sVar).a, map)) {
                    return false;
                }
            } else {
                if (sVar instanceof com.yandex.plus.home.plaque.repository.api.model.g) {
                    return ((com.yandex.plus.home.plaque.repository.api.model.g) sVar).a;
                }
                if (sVar instanceof com.yandex.plus.home.plaque.repository.api.model.i) {
                    com.yandex.plus.home.plaque.repository.api.model.i iVar = (com.yandex.plus.home.plaque.repository.api.model.i) sVar;
                    com.yandex.plus.home.plaque.feature.internal.domain.conditions.c b = b(iVar.a, map);
                    if (!(b instanceof com.yandex.plus.home.plaque.feature.internal.domain.conditions.a)) {
                        if (b instanceof com.yandex.plus.home.plaque.feature.internal.domain.conditions.b) {
                            return false;
                        }
                        b6e.s();
                        return false;
                    }
                    r rVar = iVar.c;
                    r rVar2 = ((com.yandex.plus.home.plaque.feature.internal.domain.conditions.a) b).a;
                    com.yandex.plus.home.plaque.repository.api.model.h hVar = iVar.b;
                    if ((rVar instanceof com.yandex.plus.home.plaque.repository.api.model.o) && (rVar2 instanceof com.yandex.plus.home.plaque.repository.api.model.o)) {
                        compareTo = Double.compare(((com.yandex.plus.home.plaque.repository.api.model.o) rVar).a.doubleValue(), ((com.yandex.plus.home.plaque.repository.api.model.o) rVar2).a.doubleValue());
                    } else if ((rVar instanceof com.yandex.plus.home.plaque.repository.api.model.p) && (rVar2 instanceof com.yandex.plus.home.plaque.repository.api.model.p)) {
                        compareTo = ((com.yandex.plus.home.plaque.repository.api.model.p) rVar).a.compareTo(((com.yandex.plus.home.plaque.repository.api.model.p) rVar2).a);
                    } else if ((rVar instanceof com.yandex.plus.home.plaque.repository.api.model.n) && (rVar2 instanceof com.yandex.plus.home.plaque.repository.api.model.n)) {
                        compareTo = Boolean.compare(((com.yandex.plus.home.plaque.repository.api.model.n) rVar).a, ((com.yandex.plus.home.plaque.repository.api.model.n) rVar2).a);
                    } else {
                        if (!(rVar instanceof q) || !(rVar2 instanceof q)) {
                            return false;
                        }
                        compareTo = ((q) rVar).a.toString().compareTo(((q) rVar2).a.toString());
                    }
                    int ordinal = hVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    if (ordinal != 4) {
                                        b6e.s();
                                        return false;
                                    }
                                    if (compareTo > 0) {
                                        return false;
                                    }
                                } else if (compareTo >= 0) {
                                    return false;
                                }
                            } else if (compareTo < 0) {
                                return false;
                            }
                        } else if (compareTo <= 0) {
                            return false;
                        }
                    } else if (compareTo != 0) {
                        return false;
                    }
                } else {
                    if (sVar instanceof com.yandex.plus.home.plaque.repository.api.model.j) {
                        com.yandex.plus.home.plaque.repository.api.model.j jVar = (com.yandex.plus.home.plaque.repository.api.model.j) sVar;
                        r rVar3 = jVar.b;
                        com.yandex.plus.home.plaque.feature.internal.domain.conditions.c b2 = b(jVar.a, map);
                        if (b2 instanceof com.yandex.plus.home.plaque.feature.internal.domain.conditions.a) {
                            return uop.b(((com.yandex.plus.home.plaque.feature.internal.domain.conditions.a) b2).a).contains(rVar3);
                        }
                        if (b2 instanceof com.yandex.plus.home.plaque.feature.internal.domain.conditions.b) {
                            return ((com.yandex.plus.home.plaque.feature.internal.domain.conditions.b) b2).a.contains(rVar3);
                        }
                        b6e.s();
                        return false;
                    }
                    if (sVar instanceof com.yandex.plus.home.plaque.repository.api.model.k) {
                        com.yandex.plus.home.plaque.repository.api.model.k kVar = (com.yandex.plus.home.plaque.repository.api.model.k) sVar;
                        HashSet hashSet = kVar.b;
                        com.yandex.plus.home.plaque.feature.internal.domain.conditions.c b3 = b(kVar.a, map);
                        if (b3 instanceof com.yandex.plus.home.plaque.feature.internal.domain.conditions.a) {
                            return CollectionsKt.I(hashSet, ((com.yandex.plus.home.plaque.feature.internal.domain.conditions.a) b3).a);
                        }
                        if (b3 instanceof com.yandex.plus.home.plaque.feature.internal.domain.conditions.b) {
                            return hashSet.containsAll(((com.yandex.plus.home.plaque.feature.internal.domain.conditions.b) b3).a);
                        }
                        b6e.s();
                        return false;
                    }
                    if (!(sVar instanceof com.yandex.plus.home.plaque.repository.api.model.l)) {
                        b6e.s();
                        return false;
                    }
                    com.yandex.plus.home.plaque.feature.internal.domain.conditions.c b4 = b(((com.yandex.plus.home.plaque.repository.api.model.l) sVar).a, map);
                    if (b4 instanceof com.yandex.plus.home.plaque.feature.internal.domain.conditions.a) {
                        if (((com.yandex.plus.home.plaque.feature.internal.domain.conditions.a) b4).a == null) {
                            return false;
                        }
                    } else {
                        if (!(b4 instanceof com.yandex.plus.home.plaque.feature.internal.domain.conditions.b)) {
                            b6e.s();
                            return false;
                        }
                        if (((com.yandex.plus.home.plaque.feature.internal.domain.conditions.b) b4).a.isEmpty()) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static com.yandex.plus.home.plaque.feature.internal.domain.conditions.c b(String str, Map map) {
        Object obj = map.get(str);
        if (obj instanceof Number) {
            return new com.yandex.plus.home.plaque.feature.internal.domain.conditions.a(new com.yandex.plus.home.plaque.repository.api.model.o((Number) obj));
        }
        if (obj instanceof Boolean) {
            return new com.yandex.plus.home.plaque.feature.internal.domain.conditions.a(new com.yandex.plus.home.plaque.repository.api.model.n(((Boolean) obj).booleanValue()));
        }
        if (obj instanceof Character) {
            return new com.yandex.plus.home.plaque.feature.internal.domain.conditions.a(new com.yandex.plus.home.plaque.repository.api.model.p(String.valueOf(((Character) obj).charValue())));
        }
        if (obj instanceof String) {
            return new com.yandex.plus.home.plaque.feature.internal.domain.conditions.a(new com.yandex.plus.home.plaque.repository.api.model.p((String) obj));
        }
        if (!(obj instanceof Iterable)) {
            return new com.yandex.plus.home.plaque.feature.internal.domain.conditions.a(obj != null ? new q(obj) : null);
        }
        HashSet hashSet = new HashSet();
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object oVar = next instanceof Number ? new com.yandex.plus.home.plaque.repository.api.model.o((Number) next) : next instanceof Character ? new com.yandex.plus.home.plaque.repository.api.model.p(String.valueOf(((Character) next).charValue())) : next instanceof String ? new com.yandex.plus.home.plaque.repository.api.model.p((String) next) : next instanceof Boolean ? new com.yandex.plus.home.plaque.repository.api.model.n(((Boolean) next).booleanValue()) : next == null ? null : new q(next);
            if (oVar != null) {
                hashSet.add(oVar);
            }
        }
        return new com.yandex.plus.home.plaque.feature.internal.domain.conditions.b(hashSet);
    }

    public void c(jf jfVar) {
        Pair pair;
        if (jfVar instanceof gf) {
            pair = new Pair(new d(0, jfVar, gf.class, "toString", "toString()Ljava/lang/String;", 0, 12), ((gf) jfVar).d);
        } else {
            if (!(jfVar instanceof hf)) {
                b6e.s();
                return;
            }
            pair = new Pair(new d(0, jfVar, hf.class, "toString", "toString()Ljava/lang/String;", 0, 13), null);
        }
        h9f h9fVar = (h9f) pair.a;
        Throwable th = (Throwable) pair.b;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
        com.yandex.plus.log.api.b bVar = this.a;
        if (bVar.b(aVar)) {
            bVar.a(aVar, "ActionParserIssueHandlerImpl", (String) ((Function0) h9fVar).invoke(), th);
        }
    }

    public void d(mc6 mc6Var) {
        Pair pair;
        if (mc6Var instanceof kc6) {
            pair = new Pair(new d(0, mc6Var, kc6.class, "toString", "toString()Ljava/lang/String;", 0, 14), ((kc6) mc6Var).d);
        } else {
            if (!(mc6Var instanceof lc6)) {
                b6e.s();
                return;
            }
            pair = new Pair(new d(0, mc6Var, lc6.class, "toString", "toString()Ljava/lang/String;", 0, 15), null);
        }
        h9f h9fVar = (h9f) pair.a;
        Throwable th = (Throwable) pair.b;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
        com.yandex.plus.log.api.b bVar = this.a;
        if (bVar.b(aVar)) {
            bVar.a(aVar, "ContentParserIssueHandlerImpl", (String) ((Function0) h9fVar).invoke(), th);
        }
    }

    public void e(xro xroVar) {
        Pair pair;
        if (xroVar instanceof vro) {
            pair = new Pair(new d(0, xroVar, vro.class, "toString", "toString()Ljava/lang/String;", 0, 16), ((vro) xroVar).d);
        } else {
            if (!(xroVar instanceof wro)) {
                b6e.s();
                return;
            }
            pair = new Pair(new d(0, xroVar, wro.class, "toString", "toString()Ljava/lang/String;", 0, 17), null);
        }
        h9f h9fVar = (h9f) pair.a;
        Throwable th = (Throwable) pair.b;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
        com.yandex.plus.log.api.b bVar = this.a;
        if (bVar.b(aVar)) {
            bVar.a(aVar, "ScaffoldParserIssueHandlerImpl", (String) ((Function0) h9fVar).invoke(), th);
        }
    }

    public void f(pg pgVar, String str, kah kahVar) {
        pgVar.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
        com.yandex.plus.log.api.b bVar = this.a;
        if (bVar.b(aVar)) {
            bVar.a(aVar, "ActionExecutor", "Remote action parse error for query = " + pgVar + " with requestId = " + str + '!', kahVar);
        }
    }

    public void g(pg pgVar, String str, kah kahVar, Integer num) {
        pgVar.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
        com.yandex.plus.log.api.b bVar = this.a;
        if (bVar.b(aVar)) {
            bVar.a(aVar, "ActionExecutor", "Remote action request error for query = " + pgVar + " with requestId = " + str + " with responseCode = " + num + '!', kahVar);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:59|60))(7:61|(1:63)|64|(5:67|(3:69|(1:71)|72)(1:79)|(3:74|75|76)(1:78)|77|65)|80|81|(12:83|(2:86|84)|87|88|(1:90)|91|(2:94|92)|95|96|(1:98)|99|(1:101))(4:102|(1:104)|51|52))|12|13|(9:15|(1:17)|18|(8:21|22|23|24|(2:26|(1:28))|29|(1:38)(5:31|32|(1:34)|35|36)|19)|47|48|(1:50)|51|52)(4:53|(1:55)|56|57)))|111|6|7|(0)(0)|12|13|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0035, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x012b, code lost:
    
        r12 = defpackage.z7o.b;
        r13 = new defpackage.t7o(r11);
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0032, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x012a, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x002f, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0122, code lost:
    
        r12 = defpackage.z7o.b;
        r13 = new defpackage.t7o(r11);
        r10 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[LOOP:0: B:19:0x0157->B:38:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v0, types: [j0v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(Set set, j0v j0vVar, com.yandex.plus.bdui.shared.b bVar, cg6 cg6Var) {
        com.yandex.plus.core.templating.render.d dVar;
        int i;
        Throwable a;
        t7o t7oVar;
        Object obj;
        Throwable a2;
        Pair pair;
        if (cg6Var instanceof com.yandex.plus.core.templating.render.d) {
            dVar = (com.yandex.plus.core.templating.render.d) cg6Var;
            int i2 = dVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = dVar.k;
                nm6 nm6Var = nm6.a;
                i = dVar.m;
                com.yandex.plus.log.api.b bVar2 = this.a;
                if (i != 0) {
                    qgg.h0(obj2);
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                    if (bVar2.b(aVar)) {
                        bVar2.c(aVar, "DefaultTemplateRenderer", "renderTemplates(); renderables size = " + set.size());
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        z zVar = (z) it.next();
                        if (zVar.b()) {
                            pair = null;
                        } else {
                            Set c = zVar.c();
                            if (c == null) {
                                c = q5b.a;
                            }
                            pair = new Pair(zVar, c);
                        }
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                        if (bVar2.b(aVar2)) {
                            bVar2.c(aVar2, "DefaultTemplateRenderer", "renderTemplates(); all renderables already rendered");
                        }
                        return Unit.a;
                    }
                    ?? arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add((z) ((Pair) it2.next()).a);
                    }
                    com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
                    if (bVar2.b(aVar3)) {
                        bVar2.c(aVar3, "DefaultTemplateRenderer", "renderTemplates(); not rendered renderables size = " + arrayList2.size());
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        z75.t(arrayList3, (Set) ((Pair) it3.next()).b);
                    }
                    Set A0 = CollectionsKt.A0(arrayList3);
                    com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
                    if (bVar2.b(aVar4)) {
                        bVar2.c(aVar4, "DefaultTemplateRenderer", "renderTemplates(); placeholders = " + A0);
                    }
                    r7o r7oVar = z7o.b;
                    dVar.j = arrayList2;
                    dVar.m = 1;
                    obj2 = j0vVar.invoke(A0, bVar, dVar);
                    set = arrayList2;
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r10 = dVar.j;
                    qgg.h0(obj2);
                    set = r10;
                }
                r7o r7oVar2 = z7o.b;
                Set<z> set2 = set;
                a = z7o.a(obj2);
                if (a == null) {
                    com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.e;
                    if (bVar2.b(aVar5)) {
                        bVar2.a(aVar5, "DefaultTemplateRenderer", "renderTemplates(); get data failed!", a);
                    }
                    throw new com.yandex.plus.core.templating.data.a("Data failed!", a);
                }
                Map map = (Map) obj2;
                com.yandex.plus.log.api.a aVar6 = com.yandex.plus.log.api.a.c;
                if (bVar2.b(aVar6)) {
                    bVar2.c(aVar6, "DefaultTemplateRenderer", "renderTemplates(); render of all not rendered renderables with values = " + map);
                }
                for (z zVar2 : set2) {
                    try {
                        r7o r7oVar3 = z7o.b;
                        zVar2.a(map);
                        obj = Unit.a;
                    } catch (wis e) {
                        r7o r7oVar4 = z7o.b;
                        t7oVar = new t7o(e);
                        obj = t7oVar;
                        if (!(obj instanceof t7o)) {
                        }
                        a2 = z7o.a(obj);
                        if (a2 != null) {
                        }
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Throwable th) {
                        r7o r7oVar5 = z7o.b;
                        t7oVar = new t7o(th);
                        obj = t7oVar;
                        if (!(obj instanceof t7o)) {
                        }
                        a2 = z7o.a(obj);
                        if (a2 != null) {
                        }
                    }
                    if (!(obj instanceof t7o)) {
                        com.yandex.plus.log.api.a aVar7 = com.yandex.plus.log.api.a.c;
                        if (bVar2.b(aVar7)) {
                            bVar2.c(aVar7, "DefaultTemplateRenderer", "renderTemplates(); render of renderable = " + zVar2 + " succeeded");
                        }
                    }
                    a2 = z7o.a(obj);
                    if (a2 != null) {
                        com.yandex.plus.log.api.a aVar8 = com.yandex.plus.log.api.a.e;
                        if (bVar2.b(aVar8)) {
                            bVar2.a(aVar8, "DefaultTemplateRenderer", "renderTemplates(); render of renderable = " + zVar2 + " failed!", a2);
                        }
                        throw new com.yandex.plus.core.templating.data.a("Some renderables rendering failed!", a2);
                    }
                }
                com.yandex.plus.log.api.a aVar9 = com.yandex.plus.log.api.a.c;
                if (bVar2.b(aVar9)) {
                    bVar2.c(aVar9, "DefaultTemplateRenderer", "renderTemplates(); render of all not rendered renderables succeeded");
                }
                return Unit.a;
            }
        }
        dVar = new com.yandex.plus.core.templating.render.d(this, cg6Var);
        Object obj22 = dVar.k;
        nm6 nm6Var2 = nm6.a;
        i = dVar.m;
        com.yandex.plus.log.api.b bVar22 = this.a;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        Set<z> set22 = set;
        a = z7o.a(obj22);
        if (a == null) {
        }
    }

    public com.yandex.plus.home.plaque.repository.api.model.c i(List list, com.yandex.plus.home.plaque.feature.api.context.b bVar) {
        Object next;
        j0 b;
        list.getClass();
        bVar.getClass();
        List<com.yandex.plus.home.plaque.repository.api.model.c> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (a(((com.yandex.plus.home.plaque.repository.api.model.c) obj).e(), bVar.a)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        String str = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int d = ((com.yandex.plus.home.plaque.repository.api.model.c) next).d();
                do {
                    Object next2 = it.next();
                    int d2 = ((com.yandex.plus.home.plaque.repository.api.model.c) next2).d();
                    if (d < d2) {
                        next = next2;
                        d = d2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        com.yandex.plus.home.plaque.repository.api.model.c cVar = (com.yandex.plus.home.plaque.repository.api.model.c) next;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar2 = this.a;
        if (bVar2.b(aVar)) {
            int a = tah.a(v75.o(list2, 10));
            if (a < 16) {
                a = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(a);
            for (com.yandex.plus.home.plaque.repository.api.model.c cVar2 : list2) {
                linkedHashMap.put(cVar2.b().a, cVar2.e());
            }
            StringBuilder sb = new StringBuilder("selectPlaque(context=");
            sb.append(bVar);
            sb.append(",plaques=");
            sb.append(linkedHashMap);
            sb.append("): ");
            if (cVar != null && (b = cVar.b()) != null) {
                str = b.a;
            }
            sb.append(str);
            bVar2.c(aVar, "PlaqueConditionInteractorImpl", sb.toString());
        }
        return cVar;
    }

    public e(com.yandex.plus.bdui.flex.utils.b bVar, com.yandex.plus.log.api.b bVar2) {
        this.a = bVar2;
    }
}
