package com.yandex.plus.core.templating.template;

import com.yandex.plus.core.templating.render.a0;
import com.yandex.plus.core.templating.render.z;
import defpackage.b6e;
import defpackage.ern;
import defpackage.lm4;
import defpackage.s9f;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class j implements z {
    public final lm4 a;
    public i b;
    public final com.yandex.plus.log.api.b c;

    public j(lm4 lm4Var, i iVar, com.yandex.plus.log.api.b bVar) {
        bVar.getClass();
        this.a = lm4Var;
        this.b = iVar;
        this.c = bVar;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "TemplateableImpl", "init()");
        }
        if (this.b instanceof g) {
            try {
                if (lm4Var.equals(ern.a(String.class)) && !(this.b instanceof f)) {
                    throw new IllegalArgumentException("Only StringTemplate available for String templateables!");
                }
                if (!lm4Var.equals(ern.a(String.class)) && !(this.b instanceof e)) {
                    throw new IllegalArgumentException("Only SingleTemplate available for non-String templateables!");
                }
            } catch (Throwable th) {
                com.yandex.plus.log.api.b bVar2 = this.c;
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
                if (bVar2.b(aVar2)) {
                    bVar2.a(aVar2, "TemplateableImpl", "init(); templateable class and state is not compatible!", th);
                }
                throw th;
            }
        }
    }

    @Override // com.yandex.plus.core.templating.render.z
    public final void a(Map map) {
        map.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "TemplateableImpl", "render(); data = " + map);
        }
        i iVar = this.b;
        g gVar = iVar instanceof g ? (g) iVar : null;
        if (gVar == null) {
            if (bVar.b(aVar)) {
                bVar.c(aVar, "TemplateableImpl", "render(); already rendered");
            }
        } else {
            Object a = gVar.a(map);
            if (bVar.b(aVar)) {
                bVar.c(aVar, "TemplateableImpl", "render(); succeeded with value = " + a);
            }
            this.b = new h(a);
        }
    }

    @Override // com.yandex.plus.core.templating.render.z
    public final boolean b() {
        boolean z = !(this.b instanceof g);
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "TemplateableImpl", "isRendered() = " + z);
        }
        return z;
    }

    @Override // com.yandex.plus.core.templating.render.z
    public final Set c() {
        List list;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "TemplateableImpl", "getPlaceholders()");
        }
        i iVar = this.b;
        if (iVar instanceof g) {
            list = ((g) iVar).b();
        } else {
            if (!(iVar instanceof h)) {
                b6e.s();
                return null;
            }
            list = null;
        }
        if (bVar.b(aVar)) {
            bVar.c(aVar, "TemplateableImpl", "getPlaceholders(); tokens = " + list);
        }
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((c) it.next()).a);
        }
        return CollectionsKt.A0(arrayList);
    }

    public final Object d(s9f s9fVar) {
        LinkedHashSet linkedHashSet;
        s9fVar.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.log.api.b bVar = this.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "TemplateableImpl", "getValue()");
        }
        i iVar = this.b;
        if (!(iVar instanceof g)) {
            if (!(iVar instanceof h)) {
                b6e.s();
                return null;
            }
            if (bVar.b(aVar)) {
                bVar.c(aVar, "TemplateableImpl", "getValue(); value = " + ((h) iVar).a);
            }
            return ((h) iVar).a;
        }
        com.yandex.plus.core.kotlin.extensions.b bVar2 = (com.yandex.plus.core.kotlin.extensions.b) com.yandex.plus.core.kotlin.extensions.a.a.get();
        if (!((bVar2 == null || (linkedHashSet = bVar2.c) == null) ? false : linkedHashSet.contains(a0.class))) {
            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
            if (bVar.b(aVar2)) {
                bVar.c(aVar2, "TemplateableImpl", "getValue(); not rendered yet!");
            }
        }
        throw new a0(this, "Templateable<" + com.yandex.plus.core.reflect.b.b(((g) iVar).c()) + '>');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a.equals(jVar.a) && this.b.equals(jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
