package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import com.yandex.plus.home.feature.webviews.internal.home.PlusHomeWebView;
import com.yandex.plus.home.feature.webviews.internal.toolbar.WebViewToolbar;
import com.yandex.plus.webview.api.WebViewContainer;

/* loaded from: classes2.dex */
public final class z4d0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlusHomeWebView b;
    public final /* synthetic */ int c;

    public /* synthetic */ z4d0(PlusHomeWebView plusHomeWebView, int i, int i2) {
        this.a = i2;
        this.b = plusHomeWebView;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        PlusHomeWebView plusHomeWebView = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = plusHomeWebView.findViewById(i2);
                    if (findViewById != null) {
                        return findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                } catch (ClassCastException e) {
                    dy31.f(kgxVar, e);
                    return null;
                }
            case 1:
                kgx kgxVar2 = (kgx) obj;
                try {
                    View findViewById2 = plusHomeWebView.findViewById(i2);
                    if (findViewById2 != null) {
                        return (WebViewContainer) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.webview.api.WebViewContainer");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
            case 2:
                kgx kgxVar3 = (kgx) obj;
                try {
                    return (WebViewToolbar) plusHomeWebView.findViewById(i2);
                } catch (ClassCastException e3) {
                    dy31.f(kgxVar3, e3);
                    return null;
                }
            case 3:
                kgx kgxVar4 = (kgx) obj;
                try {
                    View findViewById3 = plusHomeWebView.findViewById(i2);
                    if (findViewById3 != null) {
                        return (ViewGroup) findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                } catch (ClassCastException e4) {
                    dy31.f(kgxVar4, e4);
                    return null;
                }
            case 4:
                kgx kgxVar5 = (kgx) obj;
                try {
                    View findViewById4 = plusHomeWebView.findViewById(i2);
                    if (findViewById4 != null) {
                        return (ViewStub) findViewById4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewStub");
                } catch (ClassCastException e5) {
                    dy31.f(kgxVar5, e5);
                    return null;
                }
            case 5:
                kgx kgxVar6 = (kgx) obj;
                try {
                    View findViewById5 = plusHomeWebView.findViewById(i2);
                    if (findViewById5 != null) {
                        return (Button) findViewById5;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
                } catch (ClassCastException e6) {
                    dy31.f(kgxVar6, e6);
                    return null;
                }
            case 6:
                kgx kgxVar7 = (kgx) obj;
                try {
                    View findViewById6 = plusHomeWebView.findViewById(i2);
                    if (findViewById6 != null) {
                        return (ViewGroup) findViewById6;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                } catch (ClassCastException e7) {
                    dy31.f(kgxVar7, e7);
                    return null;
                }
            case 7:
                kgx kgxVar8 = (kgx) obj;
                try {
                    View findViewById7 = plusHomeWebView.findViewById(i2);
                    if (findViewById7 != null) {
                        return (ViewGroup) findViewById7;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                } catch (ClassCastException e8) {
                    dy31.f(kgxVar8, e8);
                    return null;
                }
            default:
                kgx kgxVar9 = (kgx) obj;
                try {
                    View findViewById8 = plusHomeWebView.findViewById(i2);
                    if (findViewById8 != null) {
                        return (ViewGroup) findViewById8;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                } catch (ClassCastException e9) {
                    dy31.f(kgxVar9, e9);
                    return null;
                }
        }
    }
}
