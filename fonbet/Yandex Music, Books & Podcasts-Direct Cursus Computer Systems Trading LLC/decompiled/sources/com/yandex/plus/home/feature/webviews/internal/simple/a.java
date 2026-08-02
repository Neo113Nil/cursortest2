package com.yandex.plus.home.feature.webviews.internal.simple;

import android.view.View;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internal.toolbar.WebViewToolbar;
import defpackage.s9f;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ a(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        e eVar = this.b;
        switch (i) {
            case 0:
                s9f[] s9fVarArr = e.s;
                View findViewById = eVar.findViewById(R.id.toolbar);
                findViewById.getClass();
                View findViewById2 = eVar.findViewById(R.id.pull_out_line_icon);
                findViewById2.getClass();
                return new com.yandex.plus.home.feature.webviews.internal.toolbar.c((WebViewToolbar) findViewById, eVar.c, findViewById2, eVar.d, new c(0, eVar.h, u.class, "routeBack", "routeBack()Z", 8, 0), new com.yandex.plus.home.analytics.evgen.c(0, eVar.h, u.class, "closeTopDeeplink", "closeTopDeeplink()V", 0, 24));
            case 1:
                return e.o(eVar);
            case 2:
                return e.m(eVar);
            case 3:
                return e.k(eVar);
            default:
                return e.n(eVar);
        }
    }
}
