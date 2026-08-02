package com.yandex.passport.sloth.ui;

import defpackage.b6e;
import defpackage.sqn;

/* loaded from: classes4.dex */
public final class l0 implements sqn {
    public static final l0 a = new l0();

    @Override // defpackage.sqn
    public Object a(Object obj, Object obj2) {
        p1 p1Var = (p1) obj;
        k0 k0Var = (k0) obj2;
        p1Var.getClass();
        if (k0Var instanceof j0) {
            return new p1(p1Var.a, ((j0) k0Var).a);
        }
        if (k0Var instanceof i0) {
            return new p1(true, null);
        }
        b6e.s();
        return null;
    }
}
