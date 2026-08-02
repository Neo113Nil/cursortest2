package com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper;

import android.graphics.drawable.RippleDrawable;
import android.view.View;
import defpackage.cg6;
import defpackage.vzt;

/* loaded from: classes5.dex */
public final class a extends cg6 {
    public com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.c j;
    public View.OnClickListener k;
    public String l;
    public RippleDrawable m;
    public com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f n;
    public com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f o;
    public View.OnClickListener p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ vzt s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(vzt vztVar, cg6 cg6Var) {
        super(cg6Var);
        this.s = vztVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.b(null, null, this);
    }
}
