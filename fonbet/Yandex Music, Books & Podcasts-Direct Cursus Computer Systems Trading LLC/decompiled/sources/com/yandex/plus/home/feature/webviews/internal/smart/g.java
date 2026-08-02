package com.yandex.plus.home.feature.webviews.internal.smart;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.s9f;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class g implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ g(i iVar, int i) {
        this.a = i;
        this.b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        i iVar = this.b;
        switch (i) {
            case 0:
                s9f s9fVar = (s9f) obj;
                s9fVar.getClass();
                try {
                    View findViewById = iVar.findViewById(R.id.top_spacer_view);
                    if (findViewById != null) {
                        return findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                } catch (ClassCastException e) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar, e);
                    return null;
                }
            case 1:
                s9f s9fVar2 = (s9f) obj;
                s9fVar2.getClass();
                try {
                    View findViewById2 = iVar.findViewById(R.id.plus_smart_web_view_contracts_container);
                    if (findViewById2 != null) {
                        return (WebViewContainer) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.webview.api.WebViewContainer");
                } catch (ClassCastException e2) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar2, e2);
                    return null;
                }
            case 2:
                s9f s9fVar3 = (s9f) obj;
                s9fVar3.getClass();
                try {
                    View findViewById3 = iVar.findViewById(R.id.progress_bar_layout);
                    if (findViewById3 != null) {
                        return (ViewGroup) findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                } catch (ClassCastException e3) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar3, e3);
                    return null;
                }
            default:
                s9f s9fVar4 = (s9f) obj;
                s9fVar4.getClass();
                try {
                    View findViewById4 = iVar.findViewById(R.id.error_layout);
                    if (findViewById4 != null) {
                        return (ViewGroup) findViewById4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                } catch (ClassCastException e4) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar4, e4);
                    return null;
                }
        }
    }
}
