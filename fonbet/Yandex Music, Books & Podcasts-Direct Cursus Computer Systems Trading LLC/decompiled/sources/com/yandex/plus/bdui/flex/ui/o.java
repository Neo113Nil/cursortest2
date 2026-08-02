package com.yandex.plus.bdui.flex.ui;

import defpackage.kt4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o {
    public final kt4 a;
    public final com.yandex.plus.log.api.b b;
    public final WeakHashMap c;
    public final LinkedHashMap d;

    public o(kt4 kt4Var, com.yandex.plus.log.api.b bVar) {
        bVar.getClass();
        this.a = kt4Var;
        this.b = bVar;
        this.c = new WeakHashMap();
        this.d = new LinkedHashMap();
    }

    public final void a(n nVar) {
        ArrayList arrayList = new ArrayList();
        WeakHashMap weakHashMap = this.c;
        for (Map.Entry entry : weakHashMap.entrySet()) {
            b bVar = (b) entry.getKey();
            if (!Intrinsics.d((n) entry.getValue(), nVar)) {
                bVar = null;
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        com.yandex.plus.log.api.b bVar2 = this.b;
        if (isEmpty) {
            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.d;
            if (bVar2.b(aVar)) {
                bVar2.c(aVar, "PlusUiControllerUpdateSchedulerImpl", "removeCoordinator(); controllers not found!");
            }
        } else {
            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
            if (bVar2.b(aVar2)) {
                bVar2.c(aVar2, "PlusUiControllerUpdateSchedulerImpl", "removeCoordinator(); remove " + arrayList.size() + " controller(s)");
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                weakHashMap.remove((b) it.next());
            }
        }
        this.d.remove(nVar.a);
    }
}
