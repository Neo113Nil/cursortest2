package com.yandex.plus.home.feature.webviews.internal.toolbar;

import android.view.View;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import defpackage.ezc;
import defpackage.oj;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class c {
    public final WebViewToolbar a;
    public final View b;
    public final com.yandex.plus.home.feature.webviews.internalapi.toolbar.a c;
    public final oj d;
    public final ezc e;
    public final String f;

    /* JADX WARN: Multi-variable type inference failed */
    public c(WebViewToolbar webViewToolbar, com.yandex.plus.resources.core.a aVar, View view, com.yandex.plus.home.feature.webviews.internalapi.toolbar.a aVar2, Function0 function0, Function0 function02) {
        webViewToolbar.getClass();
        aVar.getClass();
        view.getClass();
        aVar2.getClass();
        this.a = webViewToolbar;
        this.b = view;
        this.c = aVar2;
        this.d = (oj) function0;
        this.e = (ezc) function02;
        boolean z = aVar2.a;
        boolean z2 = aVar2.b;
        if (z && z2) {
            webViewToolbar.setVisibility(0);
            webViewToolbar.setIsDashVisible(true);
            view.setVisibility(8);
        } else {
            webViewToolbar.setIsDashVisible(false);
            webViewToolbar.setVisibility(z ? 0 : 8);
            view.setVisibility(z2 ? 0 : 8);
        }
        this.f = r1.m(((com.yandex.plus.resources.core.c) aVar).a(R.string.Home_ContentPlaceholder_SimpleWebView_Toolbar_Title), webViewToolbar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [ezc, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.jvm.functions.Function0, oj] */
    public final void a(com.yandex.plus.home.feature.webviews.internalapi.toolbar.b bVar) {
        bVar.getClass();
        WebViewToolbar webViewToolbar = this.a;
        if (webViewToolbar.getVisibility() == 0) {
            webViewToolbar.setTitle(bVar.b);
            com.yandex.plus.home.feature.webviews.internalapi.toolbar.a aVar = this.c;
            if (aVar.d && bVar.c) {
                webViewToolbar.y();
                webViewToolbar.setOnStartIconClickListener(this.d);
            } else {
                webViewToolbar.w();
            }
            if (!aVar.c) {
                webViewToolbar.v();
            } else {
                webViewToolbar.z();
                webViewToolbar.setOnEndIconClickListener(this.e);
            }
        }
    }
}
