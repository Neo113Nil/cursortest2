package com.gamericefishpro.space.e;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends com.gamericefishpro.space.b9.a {
    public final a g;

    public q(a aVar) {
        this.g = aVar;
    }

    public final void L(Object obj) {
        com.gamericefishpro.space.h.d dVar = this.g.a;
        if (dVar == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
        com.gamericefishpro.space.d.j jVar = dVar.g;
        LinkedHashMap linkedHashMap = jVar.b;
        ArrayList arrayList = jVar.d;
        String str = dVar.h;
        Object obj2 = linkedHashMap.get(str);
        com.gamericefishpro.space.i.a aVar = dVar.i;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int iIntValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            jVar.b(iIntValue, aVar, obj);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }
}
