package com.yandex.plus.bdui.plus.checkout.content.serializer;

import com.yandex.plus.pay.internal.model.PlusPayRichText;

/* loaded from: classes4.dex */
public final class b2 {
    public final boolean a;
    public final String b;
    public final String c;
    public final PlusPayRichText d;
    public final PlusPayRichText e;
    public final com.yandex.plus.core.data.common.y f;
    public final boolean g;
    public final com.yandex.plus.core.data.common.v h;
    public final com.yandex.plus.core.data.common.v i;

    public b2(l1 l1Var, l1 l1Var2) {
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var2;
        this.a = l1Var.e;
        this.b = l1Var.a;
        this.c = l1Var.b;
        g1 g1Var = l1Var.g;
        this.d = (g1Var == null || (m1Var2 = g1Var.b) == null) ? null : com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(m1Var2);
        this.e = (g1Var == null || (m1Var = g1Var.a) == null) ? null : com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(m1Var);
        this.f = new com.yandex.plus.core.data.common.y(l1Var.c.b, l1Var.d.b);
        this.g = l1Var.f;
        k1 k1Var = l1Var2.c;
        k1 k1Var2 = l1Var2.d;
        String str = k1Var.c;
        com.yandex.plus.core.data.common.f fVar = str != null ? new com.yandex.plus.core.data.common.f(r.d(str)) : null;
        String str2 = k1Var2.c;
        this.h = new com.yandex.plus.core.data.common.v(fVar, str2 != null ? new com.yandex.plus.core.data.common.f(r.d(str2)) : null);
        String str3 = l1Var2.c.a;
        com.yandex.plus.core.data.common.f fVar2 = str3 != null ? new com.yandex.plus.core.data.common.f(r.d(str3)) : null;
        String str4 = k1Var2.a;
        this.i = new com.yandex.plus.core.data.common.v(fVar2, str4 != null ? new com.yandex.plus.core.data.common.f(r.d(str4)) : null);
    }
}
