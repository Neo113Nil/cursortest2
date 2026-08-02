package ru.yandex.music.webview;

import android.R;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import defpackage.btf;
import defpackage.h8v;
import defpackage.hag;
import defpackage.jh1;
import defpackage.jyr;
import defpackage.l18;
import defpackage.np2;
import defpackage.su4;
import defpackage.wev;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.webview.WebViewScreenActivity;

/* loaded from: classes6.dex */
public final class WebViewScreenActivity extends np2 {
    public static final /* synthetic */ int A = 0;
    public final jyr v;
    public final jyr w;
    public final jyr x;
    public final jyr y = l18.b.b(hag.I(wev.class), true);
    public final jyr z = btf.b(new h8v(14));

    public WebViewScreenActivity() {
        final int i = 0;
        this.v = btf.b(new Function0(this) { // from class: uev
            public final /* synthetic */ WebViewScreenActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WebViewScreenActivity webViewScreenActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = WebViewScreenActivity.A;
                        return webViewScreenActivity.getIntent().getStringExtra("webview.url");
                    case 1:
                        int i4 = WebViewScreenActivity.A;
                        return Boolean.valueOf(webViewScreenActivity.getIntent().getBooleanExtra("webview.needAuthorization", false));
                    default:
                        int i5 = WebViewScreenActivity.A;
                        return (xfv) webViewScreenActivity.getIntent().getParcelableExtra("webview.settings");
                }
            }
        });
        final int i2 = 1;
        this.w = btf.b(new Function0(this) { // from class: uev
            public final /* synthetic */ WebViewScreenActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WebViewScreenActivity webViewScreenActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = WebViewScreenActivity.A;
                        return webViewScreenActivity.getIntent().getStringExtra("webview.url");
                    case 1:
                        int i4 = WebViewScreenActivity.A;
                        return Boolean.valueOf(webViewScreenActivity.getIntent().getBooleanExtra("webview.needAuthorization", false));
                    default:
                        int i5 = WebViewScreenActivity.A;
                        return (xfv) webViewScreenActivity.getIntent().getParcelableExtra("webview.settings");
                }
            }
        });
        final int i3 = 2;
        this.x = btf.b(new Function0(this) { // from class: uev
            public final /* synthetic */ WebViewScreenActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WebViewScreenActivity webViewScreenActivity = this.b;
                switch (i22) {
                    case 0:
                        int i32 = WebViewScreenActivity.A;
                        return webViewScreenActivity.getIntent().getStringExtra("webview.url");
                    case 1:
                        int i4 = WebViewScreenActivity.A;
                        return Boolean.valueOf(webViewScreenActivity.getIntent().getBooleanExtra("webview.needAuthorization", false));
                    default:
                        int i5 = WebViewScreenActivity.A;
                        return (xfv) webViewScreenActivity.getIntent().getParcelableExtra("webview.settings");
                }
            }
        });
    }

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        jyr jyrVar = this.v;
        String str = (String) jyrVar.getValue();
        if (str != null) {
            supportFragmentManager.B = new jh1(8, this, str);
        }
        super.onCreate(bundle);
        if (((String) jyrVar.getValue()) == null) {
            finish();
        } else if (bundle == null) {
            y supportFragmentManager2 = getSupportFragmentManager();
            a l = su4.l(supportFragmentManager2, supportFragmentManager2);
            l.f(R.id.content, (Class) this.z.getValue(), null);
            l.j();
        }
    }
}
