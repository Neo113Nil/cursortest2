package com.yandex.passport.internal.ui.challenge.logout;

import defpackage.b6e;
import defpackage.sqn;

/* loaded from: classes4.dex */
public final class d0 implements sqn {
    public static final d0 a = new d0();

    @Override // defpackage.sqn
    public Object a(Object obj, Object obj2) {
        n nVar = (n) obj;
        c0 c0Var = (c0) obj2;
        nVar.getClass();
        if (c0Var instanceof a0) {
            return n.a(nVar, null, null, Boolean.valueOf(((a0) c0Var).a), null, 11);
        }
        if (c0Var instanceof y) {
            return n.a(nVar, ((y) c0Var).a, null, null, null, 14);
        }
        if (c0Var instanceof b0) {
            return n.a(nVar, null, null, null, ((b0) c0Var).a, 7);
        }
        if (c0Var instanceof z) {
            return n.a(nVar, null, ((z) c0Var).a, null, null, 13);
        }
        b6e.s();
        return null;
    }
}
