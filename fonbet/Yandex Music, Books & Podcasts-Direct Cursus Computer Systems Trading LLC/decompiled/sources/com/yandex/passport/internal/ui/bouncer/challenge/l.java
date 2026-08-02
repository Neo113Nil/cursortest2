package com.yandex.passport.internal.ui.bouncer.challenge;

import defpackage.b6e;
import defpackage.sqn;

/* loaded from: classes4.dex */
public final class l implements sqn {
    public static final l a = new l();

    @Override // defpackage.sqn
    public final Object a(Object obj, Object obj2) {
        p pVar = (p) obj;
        k kVar = (k) obj2;
        pVar.getClass();
        if (kVar instanceof j) {
            return new p(pVar.a, ((j) kVar).a);
        }
        if (kVar instanceof i) {
            return new p(((i) kVar).a, pVar.b);
        }
        b6e.s();
        return null;
    }
}
