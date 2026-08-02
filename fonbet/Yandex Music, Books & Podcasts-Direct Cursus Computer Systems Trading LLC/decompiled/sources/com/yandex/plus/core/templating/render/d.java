package com.yandex.plus.core.templating.render;

import defpackage.cg6;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class d extends cg6 {
    public ArrayList j;
    public /* synthetic */ Object k;
    public final /* synthetic */ com.yandex.plus.bdui.flex.factory.e l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.yandex.plus.bdui.flex.factory.e eVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = eVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.h(null, null, null, this);
    }
}
