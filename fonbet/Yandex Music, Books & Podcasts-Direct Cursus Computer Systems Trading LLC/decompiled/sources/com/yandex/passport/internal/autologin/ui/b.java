package com.yandex.passport.internal.autologin.ui;

import android.content.Context;
import com.yandex.passport.internal.entities.w;
import defpackage.cg6;

/* loaded from: classes4.dex */
public final class b extends cg6 {
    public Context j;
    public com.yandex.passport.internal.properties.g k;
    public w l;
    public /* synthetic */ Object m;
    public final /* synthetic */ k n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k kVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(null, null, null, this);
    }
}
