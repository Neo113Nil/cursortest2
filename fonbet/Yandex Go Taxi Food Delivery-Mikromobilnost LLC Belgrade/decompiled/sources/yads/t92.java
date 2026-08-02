package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.monetization.ads.base.webview.HtmlWebViewClient;
import com.monetization.ads.base.webview.HtmlWebViewClientListener;
import defpackage.a081;
import defpackage.a391;
import defpackage.c071;
import defpackage.dg61;
import defpackage.dha1;
import defpackage.f391;
import defpackage.fm81;
import defpackage.g8e;
import defpackage.rp81;
import defpackage.vs71;
import defpackage.w511;
import defpackage.xga1;

/* loaded from: classes7.dex */
public abstract class t92 extends mo implements HtmlWebViewClientListener, c071 {
    public static boolean j;
    public final Context b;
    public final vs71 c;
    public final eb2 d;
    public final a391 e;
    public dg61 f;
    public f391 g;
    public boolean h;
    public boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t92(Context context, rp81 rp81Var, AttributeSet attributeSet, int i) {
        super(r4, attributeSet);
        int i2;
        rp81Var = (i & 2) != 0 ? new rp81() : rp81Var;
        attributeSet = (i & 4) != 0 ? null : attributeSet;
        Context applicationContext = context.getApplicationContext();
        vs71 vs71Var = new vs71();
        eb2 a = eb2.h.a(applicationContext);
        this.b = applicationContext;
        this.c = vs71Var;
        this.d = a;
        this.e = new a391();
        setBackgroundColor(0);
        setVisibility(4);
        setHorizontalScrollBarEnabled(false);
        setHorizontalScrollbarOverlay(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollbarOverlay(false);
        setScrollBarStyle(0);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setSupportZoom(false);
        getSettings().setBuiltInZoomControls(false);
        getSettings().setTextZoom(100);
        getSettings().setMinimumFontSize(1);
        getSettings().setMinimumLogicalFontSize(1);
        WebSettings settings = getSettings();
        dha1.f();
        synchronized (a081.f) {
        }
        int ordinal = rp81Var.a.ordinal();
        if (ordinal == 0) {
            i2 = -1;
        } else if (ordinal != 1) {
            i2 = 3;
            if (ordinal != 2) {
                if (ordinal != 3) {
                    w511.b();
                    throw null;
                }
                i2 = 2;
            }
        } else {
            i2 = 1;
        }
        settings.setCacheMode(i2);
        WebSettings settings2 = getSettings();
        if (xga1.b(21)) {
            settings2.setMixedContentMode(2);
        }
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        setWebViewClient(new HtmlWebViewClient(this, null, 2, null));
        setWebChromeClient(new vz0());
        if (j) {
            return;
        }
        j = true;
    }

    @Override // defpackage.c071
    public final void a(za2 za2Var) {
        boolean z;
        if (za2Var != za2.c) {
            this.c.getClass();
            if (vs71.a(this) && this.d.a()) {
                z = true;
                a(z);
            }
        }
        z = false;
        a(z);
    }

    @Override // yads.mo
    public final void b() {
        setHtmlWebViewListener(null);
        super.b();
    }

    public abstract void c();

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        dg61 dg61Var;
        if (motionEvent != null && motionEvent.getAction() == 0 && (dg61Var = this.f) != null) {
            dg61Var.a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = true;
        this.d.a(this);
        this.c.getClass();
        a(vs71.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.i = false;
        this.c.getClass();
        a(vs71.a(this));
        this.d.b(this);
        super.onDetachedFromWindow();
    }

    public void onOverrideUrlLoading(Context context, String str) {
        dg61 dg61Var = this.f;
        if (dg61Var != null) {
            dg61Var.a(str);
        }
    }

    public void onPageFinished() {
        a391 a391Var = this.e;
        synchronized (a391Var.a) {
            if (a391Var.b) {
                return;
            }
            a391Var.b = true;
            a(this);
        }
    }

    public void onReceivedError(int i) {
        f391 f391Var = this.g;
        if (f391Var != null) {
            f391Var.onReceivedError(i);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.c.getClass();
        a(vs71.a(this));
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.c.getClass();
        a(vs71.a(this));
    }

    public final void setHtmlWebViewErrorListener(f391 f391Var) {
        this.g = f391Var;
    }

    public void setHtmlWebViewListener(dg61 dg61Var) {
        this.f = dg61Var;
    }

    public static final void a(t92 t92Var) {
        t92Var.c();
    }

    @Override // yads.mo
    public final String a() {
        return g8e.o("<style type='text/css'> \n  * { \n      -webkit-tap-highlight-color: rgba(0, 0, 0, 0) !important; \n      -webkit-focus-ring-color: rgba(0, 0, 0, 0) !important; \n      outline: none !important; \n    } \n</style> \n", fm81.a);
    }

    public final void a(boolean z) {
        if (this.h != z) {
            this.h = z;
            dg61 dg61Var = this.f;
            if (dg61Var != null) {
                dg61Var.a(z);
            }
        }
    }
}
