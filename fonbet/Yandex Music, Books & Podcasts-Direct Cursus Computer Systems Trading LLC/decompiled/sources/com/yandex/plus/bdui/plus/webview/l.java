package com.yandex.plus.bdui.plus.webview;

import android.content.Context;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.tf6;
import defpackage.z7o;
import java.util.Collection;

/* loaded from: classes4.dex */
public final class l extends cg6 {
    public Context j;
    public com.yandex.plus.bdui.m k;
    public com.yandex.plus.bdui.action.h l;
    public com.yandex.plus.bdui.s m;
    public com.yandex.plus.bdui.plus.content.r n;
    public Collection o;
    public com.yandex.passport.internal.entities.j p;
    public tf6 q;
    public WebViewContainer r;
    public /* synthetic */ Object s;
    public final /* synthetic */ com.yandex.plus.bdui.flex.ui.s t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.yandex.plus.bdui.flex.ui.s sVar, cg6 cg6Var) {
        super(cg6Var);
        this.t = sVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        Object m = this.t.m(null, null, null, null, null, null, null, null, this);
        return m == nm6.a ? m : new z7o(m);
    }
}
