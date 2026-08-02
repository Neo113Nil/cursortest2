package com.yandex.plus.home.feature.webviews.internal.smart;

import android.view.View;
import com.yandex.plus.home.feature.webviews.internal.container.u;
import com.yandex.plus.home.feature.webviews.internal.toolbar.WebViewToolbar;
import defpackage.s9f;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final /* synthetic */ class f implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ f(i iVar, int i) {
        this.a = i;
        this.b = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        i iVar = this.b;
        switch (i) {
            case 0:
                s9f[] s9fVarArr = i.r;
                View findViewById = iVar.findViewById(R.id.toolbar);
                findViewById.getClass();
                View findViewById2 = iVar.findViewById(R.id.pull_out_line_icon);
                findViewById2.getClass();
                return new com.yandex.plus.home.feature.webviews.internal.toolbar.c((WebViewToolbar) findViewById, iVar.c, findViewById2, iVar.d, new com.yandex.plus.home.feature.webviews.internal.simple.c(0, iVar.h, u.class, "routeBack", "routeBack()Z", 8, 1), new com.yandex.plus.home.analytics.evgen.c(0, iVar.h, u.class, "closeTopDeeplink", "closeTopDeeplink()V", 0, 26));
            case 1:
                return i.m(iVar);
            case 2:
                return i.j(iVar);
            default:
                return i.k(iVar);
        }
    }
}
