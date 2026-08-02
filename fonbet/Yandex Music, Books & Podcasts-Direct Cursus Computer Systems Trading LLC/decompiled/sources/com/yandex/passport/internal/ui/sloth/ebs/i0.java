package com.yandex.passport.internal.ui.sloth.ebs;

import defpackage.b6e;
import defpackage.sqn;
import defpackage.zhp;
import java.io.IOException;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class i0 implements sqn {
    public static final i0 a = new i0();

    public static l1 b(Throwable th) {
        return th instanceof IOException ? l1.b : th instanceof JSONException ? l1.c : th instanceof zhp ? l1.d : th instanceof com.yandex.passport.common.exception.a ? l1.e : th instanceof com.yandex.passport.data.exceptions.a ? l1.f : th instanceof com.yandex.passport.data.exceptions.h ? l1.g : l1.h;
    }

    @Override // defpackage.sqn
    public Object a(Object obj, Object obj2) {
        s0 s0Var = (s0) obj;
        h0 h0Var = (h0) obj2;
        s0Var.getClass();
        if (h0Var instanceof e0) {
            e0 e0Var = (e0) h0Var;
            return s0.a(s0Var, e0Var.a, 0, null, null, e0Var.b, 46);
        }
        if (h0Var instanceof c0) {
            return s0.a(s0Var, null, s0Var.b + 1, null, null, null, 61);
        }
        if (h0Var instanceof b0) {
            return s0.a(s0Var, null, 0, null, null, null, 61);
        }
        if (h0Var instanceof f0) {
            return s0.a(s0Var, null, 0, Integer.valueOf(((f0) h0Var).a), null, null, 59);
        }
        if (h0Var instanceof g0) {
            return s0.a(s0Var, null, 0, null, ((g0) h0Var).a, null, 55);
        }
        if (h0Var instanceof d0) {
            return s0.a(s0Var, null, 0, null, null, null, 31);
        }
        b6e.s();
        return null;
    }
}
