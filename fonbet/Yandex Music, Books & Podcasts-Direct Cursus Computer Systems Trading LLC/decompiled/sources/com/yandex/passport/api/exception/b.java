package com.yandex.passport.api.exception;

import com.yandex.passport.api.z1;

/* loaded from: classes4.dex */
public final class b extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2) {
        super("There is no account with " + str + " = " + str2);
        str2.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(z1 z1Var) {
        super("There is no account with uid " + z1Var);
        z1Var.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(com.yandex.passport.common.core.f fVar) {
        this(com.yandex.plus.pay.ui.core.b.J(fVar));
        fVar.getClass();
    }
}
