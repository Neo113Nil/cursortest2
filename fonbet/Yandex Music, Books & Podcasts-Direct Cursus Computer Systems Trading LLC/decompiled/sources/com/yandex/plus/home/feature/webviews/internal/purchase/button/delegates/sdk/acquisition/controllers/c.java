package com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.acquisition.controllers;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.passport.internal.ui.bouncer.model.middleware.o;
import com.yandex.passport.internal.ui.bouncer.roundabout.k;
import com.yandex.plus.bdui.plus.content.controller.f;
import com.yandex.plus.home.feature.webviews.internal.purchase.pay.g;
import com.yandex.plus.home.internal.di.y;
import defpackage.btf;
import defpackage.dzf;
import defpackage.ezc;
import defpackage.jyr;
import defpackage.kg5;
import defpackage.l1p;
import defpackage.lyf;
import defpackage.rar;
import defpackage.swf;
import defpackage.t4d;
import defpackage.wxm;
import defpackage.wyf;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class c implements b {
    public final ViewGroup a;
    public final ezc b;
    public rar c;
    public final jyr d;
    public final jyr e;

    /* JADX WARN: Multi-variable type inference failed */
    public c(ViewGroup viewGroup, Function0 function0, f fVar, com.yandex.plus.acquisition.adapter.internal.controller.b bVar, wxm wxmVar, o oVar, com.yandex.plus.home.plaque.plugin.internal.proxy.a aVar, y yVar) {
        viewGroup.getClass();
        bVar.getClass();
        aVar.getClass();
        yVar.getClass();
        this.a = viewGroup;
        this.b = (ezc) function0;
        this.d = btf.b(new t4d(bVar, this, fVar, wxmVar, oVar, aVar, yVar, 4));
        this.e = btf.b(new com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a(3, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ezc, kotlin.jvm.functions.Function0] */
    public final void a() {
        this.b.invoke();
        com.yandex.plus.acquisition.adapter.internal.controller.a aVar = (com.yandex.plus.acquisition.adapter.internal.controller.a) this.d.getValue();
        rar rarVar = aVar.b;
        if (rarVar != null) {
            rarVar.g(null);
        }
        aVar.b = null;
        View view = ((g) this.e.getValue()).a;
        view.animate().cancel();
        view.setVisibility(8);
        this.a.removeAllViews();
    }

    public final void b() {
        dzf E = swf.E(this.a);
        if (E != null) {
            com.yandex.plus.acquisition.adapter.internal.controller.a aVar = (com.yandex.plus.acquisition.adapter.internal.controller.a) this.d.getValue();
            k kVar = new k(27, this);
            aVar.getClass();
            rar rarVar = aVar.b;
            if (rarVar == null || !rarVar.b()) {
                aVar.b = com.yandex.plus.bdui.flex.ui.a.j(kg5.t(aVar.a.e, E.getLifecycle(), lyf.d), wyf.F(E.getLifecycle()), new l1p(aVar, kVar, (Continuation) null, 24));
            }
        }
    }
}
