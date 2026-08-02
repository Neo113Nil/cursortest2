package com.yandex.passport.internal.push;

import com.yandex.passport.api.v2;
import defpackage.b6e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class t implements s {
    public static final t a = new t();

    public static String a(v2 v2Var) {
        v2Var.getClass();
        int ordinal = v2Var.ordinal();
        if (ordinal == 0) {
            return "";
        }
        if (ordinal == 1) {
            return ".hms";
        }
        if (ordinal == 2) {
            return ".rustore";
        }
        b6e.s();
        return null;
    }

    public static String b(com.yandex.passport.common.core.f fVar, v2 v2Var) {
        fVar.getClass();
        v2Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(fVar.a.a);
        sb.append(':');
        sb.append(fVar.b);
        return sb.toString().concat(a(v2Var));
    }

    @Override // com.yandex.passport.internal.push.s
    public Object f(Continuation continuation) {
        return Unit.a;
    }
}
