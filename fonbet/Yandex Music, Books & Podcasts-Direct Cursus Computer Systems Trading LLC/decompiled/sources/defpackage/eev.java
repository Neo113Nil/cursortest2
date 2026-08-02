package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.yandex.passport.internal.social.esia.i;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class eev implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebView b;

    public /* synthetic */ eev(WebView webView, int i) {
        this.a = i;
        this.b = webView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((Context) obj).getClass();
                return this.b;
            case 1:
                Context context = (Context) obj;
                context.getClass();
                FrameLayout frameLayout = new FrameLayout(context);
                WebView webView = this.b;
                if (webView.getParent() != null) {
                    ViewParent parent = webView.getParent();
                    parent.getClass();
                    ((ViewGroup) parent).removeView(webView);
                }
                frameLayout.addView(webView);
                return frameLayout;
            case 2:
                ((oa8) obj).getClass();
                return new i(this.b, 0);
            case 3:
                ((oa8) obj).getClass();
                return new i(this.b, 1);
            case 4:
                Context context2 = (Context) obj;
                context2.getClass();
                FrameLayout frameLayout2 = new FrameLayout(context2);
                WebView webView2 = this.b;
                if (webView2.getParent() != null) {
                    ViewParent parent2 = webView2.getParent();
                    parent2.getClass();
                    ((ViewGroup) parent2).removeView(webView2);
                }
                frameLayout2.addView(webView2);
                return frameLayout2;
            case 5:
                ((oa8) obj).getClass();
                return new i(this.b, 2);
            case 6:
                Context context3 = (Context) obj;
                context3.getClass();
                FrameLayout frameLayout3 = new FrameLayout(context3);
                WebView webView3 = this.b;
                if (webView3.getParent() != null) {
                    ViewParent parent3 = webView3.getParent();
                    parent3.getClass();
                    ((ViewGroup) parent3).removeView(webView3);
                }
                frameLayout3.addView(webView3);
                return frameLayout3;
            default:
                ((oa8) obj).getClass();
                return new i(this.b, 3);
        }
    }
}
