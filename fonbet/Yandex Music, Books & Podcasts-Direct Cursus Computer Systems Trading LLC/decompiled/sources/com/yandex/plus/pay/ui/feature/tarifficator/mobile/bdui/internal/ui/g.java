package com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui;

import defpackage.dzf;
import defpackage.yn7;

/* loaded from: classes5.dex */
public final class g implements yn7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yn7
    public final void onPause(dzf dzfVar) {
        switch (this.a) {
            case 0:
                ((com.yandex.plus.core.analytics.metrica.f) this.b).a.pauseSession();
                break;
            case 1:
                ((com.yandex.plus.core.analytics.metrica.f) this.b).a.pauseSession();
                break;
            default:
                com.yandex.plus.home.plaque.plugin.internal.defaults.a aVar = (com.yandex.plus.home.plaque.plugin.internal.defaults.a) this.b;
                aVar.c.N().removeMessages(1);
                aVar.d(false);
                break;
        }
    }

    @Override // defpackage.yn7
    public final void onResume(dzf dzfVar) {
        int i = this.a;
        dzfVar.getClass();
        switch (i) {
            case 0:
                ((com.yandex.plus.core.analytics.metrica.f) this.b).a.resumeSession();
                break;
            case 1:
                ((com.yandex.plus.core.analytics.metrica.f) this.b).a.resumeSession();
                break;
            default:
                com.yandex.plus.home.plaque.plugin.internal.defaults.a aVar = (com.yandex.plus.home.plaque.plugin.internal.defaults.a) this.b;
                aVar.c.R(new com.yandex.plus.home.feature.webviews.internal.stories.i(0, aVar, com.yandex.plus.home.plaque.plugin.internal.defaults.a.class, "checkVisibility", "checkVisibility()V", 0, 18));
                break;
        }
    }
}
