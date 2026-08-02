package com.yandex.plus.bdui.plus.checkout.content.serializer;

import com.yandex.plus.pay.internal.model.PlusPayRichText;

/* loaded from: classes4.dex */
public final class x5 implements com.yandex.plus.bdui.content.a, com.yandex.plus.bdui.action.j {
    public final e a;
    public final long b;
    public final PlusPayRichText c;
    public final com.yandex.plus.bdui.plus.checkout.content.m d;
    public final PlusPayRichText e;
    public final PlusPayRichText f;
    public final com.yandex.plus.bdui.action.a g;
    public final com.yandex.plus.bdui.action.a h;
    public final com.yandex.plus.bdui.action.a i;
    public final com.yandex.plus.bdui.action.a j;
    public final com.yandex.plus.bdui.action.a k;

    public x5(w5 w5Var, r rVar, PlusPayRichText plusPayRichText, com.yandex.plus.bdui.plus.checkout.content.m mVar, PlusPayRichText plusPayRichText2, PlusPayRichText plusPayRichText3) {
        c cVar = w5Var.a.a.k;
        this.a = cVar != null ? new e(rVar, cVar) : null;
        t5 t5Var = w5Var.a;
        this.b = t5Var.a.a;
        this.c = plusPayRichText;
        this.d = mVar;
        this.e = plusPayRichText2;
        this.f = plusPayRichText3;
        n5 n5Var = t5Var.b;
        this.g = n5Var.a;
        this.h = n5Var.b;
        this.i = n5Var.c;
        this.j = n5Var.d;
        this.k = n5Var.e;
    }

    @Override // com.yandex.plus.bdui.action.j
    public final com.yandex.plus.bdui.action.a b() {
        return this.k;
    }
}
