package com.yandex.passport.internal.ui.bouncer.chooser;

import defpackage.b6e;
import defpackage.sqn;

/* loaded from: classes4.dex */
public final class q implements sqn {
    public static final q a = new q();

    @Override // defpackage.sqn
    public final Object a(Object obj, Object obj2) {
        w wVar = (w) obj;
        p pVar = (p) obj2;
        wVar.getClass();
        if (pVar instanceof m) {
            return w.a(wVar, null, ((m) pVar).a, null, null, 13);
        }
        if (pVar instanceof n) {
            return w.a(wVar, null, null, ((n) pVar).a, null, 11);
        }
        if (pVar instanceof l) {
            return w.a(wVar, null, null, null, ((l) pVar).a, 7);
        }
        if (pVar instanceof o) {
            return w.a(wVar, ((o) pVar).a, null, null, null, 14);
        }
        b6e.s();
        return null;
    }
}
