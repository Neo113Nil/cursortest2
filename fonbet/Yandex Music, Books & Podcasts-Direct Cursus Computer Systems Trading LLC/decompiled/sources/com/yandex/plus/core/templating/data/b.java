package com.yandex.plus.core.templating.data;

import com.yandex.plus.bdui.plus.content.controller.f;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class b extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ f k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = fVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return f.e(this.k, null, null, 0L, this);
    }
}
