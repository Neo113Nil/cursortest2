package com.yandex.plus.bdui.action;

import defpackage.e5b;
import defpackage.f0q;
import defpackage.ldi;
import defpackage.md;
import defpackage.z2a;
import java.util.Map;

/* loaded from: classes4.dex */
public final class c {
    public final /* synthetic */ int a = 0;
    public final com.yandex.plus.log.api.b b;
    public final Object c;
    public final Object d;

    public c(com.yandex.plus.bdui.flex.utils.b bVar, ldi ldiVar, com.yandex.plus.log.api.b bVar2) {
        bVar.getClass();
        ldiVar.getClass();
        bVar2.getClass();
        this.c = bVar;
        this.d = ldiVar;
        this.b = bVar2;
    }

    public final void a(a aVar, h hVar, Map map) {
        md eVar;
        switch (this.a) {
            case 0:
                aVar.getClass();
                hVar.getClass();
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
                com.yandex.plus.log.api.b bVar = this.b;
                if (bVar.b(aVar2)) {
                    bVar.c(aVar2, "ActionDispatcherWrapper", "dispatch(); action = " + aVar + ", context = " + hVar + ", payload = " + map);
                }
                if (!((Boolean) ((com.yandex.plus.bdui.flex.ui.content.c) this.d).invoke(aVar)).booleanValue()) {
                    if (bVar.b(aVar2)) {
                        bVar.c(aVar2, "ActionDispatcherWrapper", "dispatch(); action " + aVar + " not handled locally, dispatch normally");
                    }
                    ((c) this.c).a(aVar, hVar, map);
                    break;
                } else if (bVar.b(aVar2)) {
                    bVar.c(aVar2, "ActionDispatcherWrapper", "dispatch(); action " + aVar + " handled locally");
                    break;
                }
                break;
            default:
                com.yandex.plus.bdui.flex.utils.b bVar2 = (com.yandex.plus.bdui.flex.utils.b) this.c;
                aVar.getClass();
                hVar.getClass();
                com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
                com.yandex.plus.log.api.b bVar3 = this.b;
                if (bVar3.b(aVar3)) {
                    bVar3.c(aVar3, "PlusActionDispatcher", "Dispatch action = " + aVar + " with payload = " + map);
                }
                bVar2.getClass();
                com.yandex.plus.bdui.flex.action.j jVar = aVar instanceof com.yandex.plus.bdui.flex.action.j ? (com.yandex.plus.bdui.flex.action.j) aVar : null;
                if (jVar == null || (eVar = jVar.a) == null) {
                    eVar = new com.yandex.plus.bdui.flex.action.e(aVar, map);
                }
                f0q c = bVar2.c(hVar.a);
                ldi ldiVar = (ldi) this.d;
                z2a z2aVar = new z2a(c);
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                ldiVar.b(eVar, z2aVar, e5bVar);
                break;
        }
    }

    public c(c cVar, com.yandex.plus.log.api.b bVar, com.yandex.plus.bdui.flex.ui.content.c cVar2) {
        cVar.getClass();
        bVar.getClass();
        this.c = cVar;
        this.b = bVar;
        this.d = cVar2;
    }
}
