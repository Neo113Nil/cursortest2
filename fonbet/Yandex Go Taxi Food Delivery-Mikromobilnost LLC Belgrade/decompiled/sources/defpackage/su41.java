package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.plus.home.feature.webviews.internal.toolbar.WebViewToolbar;

/* loaded from: classes2.dex */
public final class su41 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebViewToolbar b;
    public final /* synthetic */ int c;

    public /* synthetic */ su41(WebViewToolbar webViewToolbar, int i, int i2) {
        this.a = i2;
        this.b = webViewToolbar;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        WebViewToolbar webViewToolbar = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = webViewToolbar.findViewById(i2);
                    if (findViewById != null) {
                        return (TextView) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e) {
                    dy31.f(kgxVar, e);
                    return null;
                }
            case 1:
                kgx kgxVar2 = (kgx) obj;
                try {
                    View findViewById2 = webViewToolbar.findViewById(i2);
                    if (findViewById2 != null) {
                        return (ImageView) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
            case 2:
                kgx kgxVar3 = (kgx) obj;
                try {
                    View findViewById3 = webViewToolbar.findViewById(i2);
                    if (findViewById3 != null) {
                        return (ImageView) findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                } catch (ClassCastException e3) {
                    dy31.f(kgxVar3, e3);
                    return null;
                }
            default:
                kgx kgxVar4 = (kgx) obj;
                try {
                    View findViewById4 = webViewToolbar.findViewById(i2);
                    if (findViewById4 != null) {
                        return findViewById4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                } catch (ClassCastException e4) {
                    dy31.f(kgxVar4, e4);
                    return null;
                }
        }
    }
}
