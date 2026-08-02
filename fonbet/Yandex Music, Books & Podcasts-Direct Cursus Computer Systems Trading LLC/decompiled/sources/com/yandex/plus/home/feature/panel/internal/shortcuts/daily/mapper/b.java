package com.yandex.plus.home.feature.panel.internal.shortcuts.daily.mapper;

import android.graphics.drawable.RippleDrawable;
import android.view.View;
import defpackage.cg6;
import defpackage.vzt;

/* loaded from: classes5.dex */
public final class b extends cg6 {
    public com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.g j;
    public View.OnClickListener k;
    public String l;
    public com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f m;
    public com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f n;
    public com.yandex.plus.home.feature.panel.internal.shortcuts.daily.f o;
    public com.yandex.plus.home.feature.panel.internal.shortcuts.daily.d p;
    public View.OnClickListener q;
    public RippleDrawable r;
    public boolean s;
    public boolean t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ vzt w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(vzt vztVar, cg6 cg6Var) {
        super(cg6Var);
        this.w = vztVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.c(null, false, this);
    }
}
