package com.yandex.plus.pay.ui.yb.web.internal.ui;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.pay.ui.common.api.ui.view.ProgressView;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.s9f;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class d implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlusPayYbWebActivity b;

    public /* synthetic */ d(PlusPayYbWebActivity plusPayYbWebActivity, int i) {
        this.a = i;
        this.b = plusPayYbWebActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        PlusPayYbWebActivity plusPayYbWebActivity = this.b;
        switch (i) {
            case 0:
                s9f s9fVar = (s9f) obj;
                s9fVar.getClass();
                try {
                    View findViewById = plusPayYbWebActivity.findViewById(R.id.yb_web_root);
                    if (findViewById != null) {
                        return (ViewGroup) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                } catch (ClassCastException e) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar, e);
                    return null;
                }
            case 1:
                s9f s9fVar2 = (s9f) obj;
                s9fVar2.getClass();
                try {
                    View findViewById2 = plusPayYbWebActivity.findViewById(R.id.yb_web_progress_view);
                    if (findViewById2 != null) {
                        return (ProgressView) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.common.api.ui.view.ProgressView");
                } catch (ClassCastException e2) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar2, e2);
                    return null;
                }
            default:
                s9f s9fVar3 = (s9f) obj;
                s9fVar3.getClass();
                try {
                    View findViewById3 = plusPayYbWebActivity.findViewById(R.id.yb_web_webview_container);
                    if (findViewById3 != null) {
                        return (WebViewContainer) findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.webview.api.WebViewContainer");
                } catch (ClassCastException e3) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar3, e3);
                    return null;
                }
        }
    }
}
