package com.yandex.passport.internal.ui.challenge.delete;

import defpackage.b6e;
import defpackage.sqn;

/* loaded from: classes4.dex */
public final class s implements sqn, u0 {
    public static final s a = new s();
    public static final s b = new s();
    public static final s c = new s();
    public static final s d = new s();
    public static final s e = new s();

    @Override // defpackage.sqn
    public Object a(Object obj, Object obj2) {
        z zVar = (z) obj;
        r rVar = (r) obj2;
        zVar.getClass();
        if (rVar instanceof q) {
            return new z(zVar.a, ((q) rVar).a);
        }
        if (rVar instanceof p) {
            return new z(((p) rVar).a, zVar.b);
        }
        b6e.s();
        return null;
    }
}
