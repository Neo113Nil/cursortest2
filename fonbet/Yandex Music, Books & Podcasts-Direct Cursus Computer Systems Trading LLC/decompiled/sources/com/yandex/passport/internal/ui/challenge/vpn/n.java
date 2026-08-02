package com.yandex.passport.internal.ui.challenge.vpn;

import defpackage.b6e;
import defpackage.sqn;

/* loaded from: classes4.dex */
public final class n implements sqn {
    public static final n a = new n();

    @Override // defpackage.sqn
    public final Object a(Object obj, Object obj2) {
        q qVar = (q) obj;
        m mVar = (m) obj2;
        qVar.getClass();
        if (mVar instanceof l) {
            return q.a(qVar, ((l) mVar).a, false, 13);
        }
        if (mVar.equals(i.a)) {
            return q.a(qVar, null, false, 14);
        }
        if (mVar instanceof k) {
            return q.a(qVar, null, false, 11);
        }
        if (mVar instanceof j) {
            return q.a(qVar, null, ((j) mVar).a, 7);
        }
        b6e.s();
        return null;
    }
}
