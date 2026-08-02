package com.yandex.passport.internal.usecase;

import defpackage.b6e;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class b1 {
    public final com.yandex.passport.internal.core.accounts.s a;

    public b1(com.yandex.passport.internal.core.accounts.s sVar) {
        sVar.getClass();
        this.a = sVar;
    }

    public final ArrayList a(com.yandex.passport.internal.core.accounts.h hVar) {
        com.yandex.passport.api.n nVar;
        com.yandex.passport.internal.d dVar = (com.yandex.passport.internal.d) hVar.e;
        com.yandex.passport.internal.core.accounts.s sVar = this.a;
        sVar.getClass();
        dVar.getClass();
        List w0 = CollectionsKt.w0(sVar.a(dVar).values());
        ArrayList arrayList = new ArrayList();
        for (Object obj : w0) {
            com.yandex.passport.internal.entities.n nVar2 = (com.yandex.passport.internal.entities.n) obj;
            EnumSet j = ((com.yandex.passport.internal.entities.k) hVar.b).j();
            switch (nVar2.c.ordinal()) {
                case 0:
                    nVar = com.yandex.passport.api.n.PORTAL;
                    break;
                case 1:
                    nVar = com.yandex.passport.api.n.LITE;
                    break;
                case 2:
                    nVar = com.yandex.passport.api.n.SOCIAL;
                    break;
                case 3:
                    nVar = com.yandex.passport.api.n.PDD;
                    break;
                case 4:
                    nVar = com.yandex.passport.api.n.PHONISH;
                    break;
                case 5:
                    nVar = com.yandex.passport.api.n.MAILISH;
                    break;
                case 6:
                    nVar = com.yandex.passport.api.n.MUSIC_PHONISH;
                    break;
                case 7:
                    nVar = com.yandex.passport.api.n.CHILDISH;
                    break;
                case 8:
                    nVar = com.yandex.passport.api.n.UNDEFINED;
                    break;
                default:
                    b6e.s();
                    return null;
            }
            if (j.contains(nVar) && ((ArrayList) hVar.c).contains(nVar2.b) && !((ArrayList) hVar.d).contains(nVar2.a)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
