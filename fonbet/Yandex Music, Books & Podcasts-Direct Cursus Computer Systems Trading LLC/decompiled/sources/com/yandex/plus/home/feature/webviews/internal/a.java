package com.yandex.plus.home.feature.webviews.internal;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import com.yandex.plus.home.feature.webviews.internal.home.k;
import com.yandex.plus.home.feature.webviews.internal.toolbar.WebViewToolbar;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.s9f;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class a implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ a(k kVar, int i) {
        this.a = i;
        this.b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        k kVar = this.b;
        switch (i) {
            case 0:
                s9f s9fVar = (s9f) obj;
                s9fVar.getClass();
                try {
                    View findViewById = kVar.findViewById(R.id.plus_sdk_loading_animation_layout);
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
                    View findViewById2 = kVar.findViewById(R.id.top_spacer_view);
                    if (findViewById2 != null) {
                        return findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                } catch (ClassCastException e2) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar2, e2);
                    return null;
                }
            case 2:
                s9f s9fVar3 = (s9f) obj;
                s9fVar3.getClass();
                try {
                    View findViewById3 = kVar.findViewById(R.id.plus_home_webview_contracts_container);
                    if (findViewById3 != null) {
                        return (WebViewContainer) findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.webview.api.WebViewContainer");
                } catch (ClassCastException e3) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar3, e3);
                    return null;
                }
            case 3:
                s9f s9fVar4 = (s9f) obj;
                s9fVar4.getClass();
                try {
                    return (WebViewToolbar) kVar.findViewById(R.id.plus_home_toolbar);
                } catch (ClassCastException e4) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar4, e4);
                    return null;
                }
            case 4:
                s9f s9fVar5 = (s9f) obj;
                s9fVar5.getClass();
                try {
                    View findViewById4 = kVar.findViewById(R.id.plus_sdk_home_host_pay_container);
                    if (findViewById4 != null) {
                        return (ViewGroup) findViewById4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                } catch (ClassCastException e5) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar5, e5);
                    return null;
                }
            case 5:
                s9f s9fVar6 = (s9f) obj;
                s9fVar6.getClass();
                try {
                    View findViewById5 = kVar.findViewById(R.id.ssl_error_view_stub);
                    if (findViewById5 != null) {
                        return (ViewStub) findViewById5;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewStub");
                } catch (ClassCastException e6) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar6, e6);
                    return null;
                }
            case 6:
                s9f s9fVar7 = (s9f) obj;
                s9fVar7.getClass();
                try {
                    View findViewById6 = kVar.findViewById(R.id.btn_to_article);
                    if (findViewById6 != null) {
                        return (Button) findViewById6;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
                } catch (ClassCastException e7) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar7, e7);
                    return null;
                }
            case 7:
                s9f s9fVar8 = (s9f) obj;
                s9fVar8.getClass();
                try {
                    View findViewById7 = kVar.findViewById(R.id.plus_home_web_view_error_layout);
                    if (findViewById7 != null) {
                        return (ViewGroup) findViewById7;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                } catch (ClassCastException e8) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar8, e8);
                    return null;
                }
            case 8:
                s9f s9fVar9 = (s9f) obj;
                s9fVar9.getClass();
                try {
                    View findViewById8 = kVar.findViewById(R.id.plus_sdk_home_native_pay_layout);
                    if (findViewById8 != null) {
                        return (ViewGroup) findViewById8;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                } catch (ClassCastException e9) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar9, e9);
                    return null;
                }
            default:
                s9f s9fVar10 = (s9f) obj;
                s9fVar10.getClass();
                try {
                    View findViewById9 = kVar.findViewById(R.id.plus_sdk_home_acquisition_sdk_button_section_container);
                    if (findViewById9 != null) {
                        return (ViewGroup) findViewById9;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                } catch (ClassCastException e10) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar10, e10);
                    return null;
                }
        }
    }
}
