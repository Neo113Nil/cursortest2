package com.yandex.plus.home.feature.webviews.internal;

import android.view.ViewGroup;
import com.yandex.plus.home.datasource.openapi.models.u6;
import com.yandex.plus.home.feature.webviews.internal.home.k;
import defpackage.ern;
import defpackage.s9f;
import defpackage.yxm;

/* loaded from: classes5.dex */
public final class b {
    public static final /* synthetic */ s9f[] e;
    public final com.yandex.plus.home.feature.webviews.internalapi.animation.a a;
    public final com.yandex.plus.home.feature.webviews.internal.error.b b;
    public final com.yandex.plus.home.feature.webviews.internalapi.animation.animator.c c;
    public final com.yandex.plus.bdui.plus.content.controller.f d;

    static {
        yxm yxmVar = new yxm(b.class, "loadingAnimationLayout", "getLoadingAnimationLayout()Landroid/view/ViewGroup;", 0);
        ern.a.getClass();
        e = new s9f[]{yxmVar};
    }

    public b(k kVar, com.yandex.plus.home.feature.webviews.internalapi.animation.a aVar, com.yandex.plus.home.feature.webviews.internal.error.b bVar, com.yandex.plus.home.feature.webviews.internalapi.animation.animator.c cVar) {
        aVar.getClass();
        cVar.getClass();
        this.a = aVar;
        this.b = bVar;
        this.c = cVar;
        this.d = new com.yandex.plus.bdui.plus.content.controller.f(new a(kVar, 0));
    }

    public final ViewGroup a() {
        return (ViewGroup) this.d.g(e[0]);
    }

    public final void b() {
        this.b.a(true);
        ((com.yandex.plus.home.feature.webviews.internalapi.animation.animator.a) this.c).c(a(), new u6(25));
        ViewGroup a = a();
        com.yandex.plus.home.animation.a aVar = (com.yandex.plus.home.animation.a) this.a;
        aVar.getClass();
        a.getClass();
        aVar.a.h(a);
    }
}
