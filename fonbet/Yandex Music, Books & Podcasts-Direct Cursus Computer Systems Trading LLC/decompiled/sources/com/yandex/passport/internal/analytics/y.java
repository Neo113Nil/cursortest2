package com.yandex.passport.internal.analytics;

import defpackage.uah;
import java.util.Arrays;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class y {
    public final w a;

    public y(w wVar) {
        wVar.getClass();
        this.a = wVar;
    }

    public final void a(com.yandex.passport.internal.entities.t tVar) {
        tVar.getClass();
        h hVar = h.j;
        String b = com.yandex.passport.internal.util.l.b(tVar.a);
        if (b == null) {
            b = "null";
        }
        b(hVar, new Pair("track_id", b));
    }

    public final void b(n nVar, Pair... pairArr) {
        this.a.b(nVar, uah.g((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
    }
}
