package com.yandex.passport.internal.analytics;

import defpackage.uah;
import java.util.Arrays;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class x {
    public final w a;

    public x(w wVar) {
        wVar.getClass();
        this.a = wVar;
    }

    public final void a(n nVar, Pair... pairArr) {
        this.a.b(nVar, uah.g((Pair[]) Arrays.copyOf(pairArr, pairArr.length)));
    }

    public final void b(String str) {
        a(s.i, new Pair("status", str));
    }
}
