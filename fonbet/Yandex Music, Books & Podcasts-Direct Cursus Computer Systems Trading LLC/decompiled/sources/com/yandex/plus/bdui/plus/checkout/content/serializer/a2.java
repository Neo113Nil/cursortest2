package com.yandex.plus.bdui.plus.checkout.content.serializer;

import com.yandex.plus.pay.internal.model.PlusPayRichText;

/* loaded from: classes4.dex */
public final class a2 {
    public final PlusPayRichText a;
    public final PlusPayRichText b;
    public final com.yandex.plus.core.data.common.y c;
    public final com.yandex.plus.core.data.common.v d;
    public final String e;

    public a2(u1 u1Var) {
        this.a = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(u1Var.c);
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var = u1Var.a;
        this.b = m1Var != null ? com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(m1Var) : null;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.t tVar = u1Var.d;
        this.c = tVar != null ? new com.yandex.plus.core.data.common.y(tVar.a, tVar.b) : null;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.q1 q1Var = u1Var.b;
        q1Var.getClass();
        this.d = new com.yandex.plus.core.data.common.v(com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1.L(q1Var.b), com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1.L(q1Var.a));
        this.e = u1Var.e;
    }
}
