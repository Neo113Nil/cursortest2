package com.anythink.basead.ui.animplayerview;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.TranslateAnimation;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.anythink.basead.j.e;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.basead.ui.web.BaseWebView;
import com.anythink.core.basead.ui.web.WebProgressBarView;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.cc;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.res.image.RecycleImageView;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class WebLandpagePlayerView extends BaseAnimPlayerView implements com.anythink.core.basead.ui.web.b {

    /* renamed from: A, reason: collision with root package name */
    int f10642A;

    /* renamed from: B, reason: collision with root package name */
    int f10643B;

    /* renamed from: C, reason: collision with root package name */
    IOfferClickHandler f10644C;

    /* renamed from: D, reason: collision with root package name */
    int f10645D;

    /* renamed from: E, reason: collision with root package name */
    String f10646E;

    /* renamed from: F, reason: collision with root package name */
    boolean f10647F;

    /* renamed from: G, reason: collision with root package name */
    private final int f10648G;

    /* renamed from: H, reason: collision with root package name */
    private final int f10649H;

    /* renamed from: I, reason: collision with root package name */
    private final int f10650I;
    private final int J;

    /* renamed from: K, reason: collision with root package name */
    private TranslateAnimation f10651K;

    /* renamed from: L, reason: collision with root package name */
    private TranslateAnimation f10652L;

    /* renamed from: M, reason: collision with root package name */
    private TranslateAnimation f10653M;

    /* renamed from: N, reason: collision with root package name */
    private WebView f10654N;

    /* renamed from: O, reason: collision with root package name */
    private com.anythink.core.basead.ui.web.c f10655O;

    /* renamed from: P, reason: collision with root package name */
    private ValueCallback<Uri[]> f10656P;

    /* renamed from: Q, reason: collision with root package name */
    private final int f10657Q;

    /* renamed from: R, reason: collision with root package name */
    private String f10658R;

    /* renamed from: S, reason: collision with root package name */
    private int f10659S;

    /* renamed from: T, reason: collision with root package name */
    private Map<String, JSONArray> f10660T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f10661U;

    /* renamed from: h, reason: collision with root package name */
    LinearLayout f10662h;

    /* renamed from: com.anythink.basead.ui.animplayerview.WebLandpagePlayerView$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f10663a;

        public AnonymousClass1(Context context) {
            this.f10663a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            WebLandpagePlayerView.a(WebLandpagePlayerView.this, this.f10663a);
            WebLandpagePlayerView.a(WebLandpagePlayerView.this);
        }
    }

    /* renamed from: com.anythink.basead.ui.animplayerview.WebLandpagePlayerView$2, reason: invalid class name */
    public class AnonymousClass2 implements Animation.AnimationListener {
        public AnonymousClass2() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            if (WebLandpagePlayerView.this.f10654N != null) {
                WebLandpagePlayerView.this.f10654N.setVisibility(0);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.animplayerview.WebLandpagePlayerView$3, reason: invalid class name */
    public class AnonymousClass3 implements DownloadListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f10666a;

        public AnonymousClass3(Context context) {
            this.f10666a = context;
        }

        @Override // android.webkit.DownloadListener
        public final void onDownloadStart(String str, String str2, String str3, String str4, long j9) {
            y yVar;
            t.b();
            x xVar = WebLandpagePlayerView.this.f10630y;
            if (xVar != null && (yVar = xVar.f14325o) != null && yVar.bn() != 2) {
                WebLandpagePlayerView.c(WebLandpagePlayerView.this);
                try {
                    Toast.makeText(t.b().g(), q.a(t.b().g(), "myoffer_intercept_web_file_download", k.f19794g), 0).show();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            WebLandpagePlayerView webLandpagePlayerView = WebLandpagePlayerView.this;
            w wVar = webLandpagePlayerView.f10629x;
            if (wVar == null || webLandpagePlayerView.f10630y == null || TextUtils.isEmpty(wVar.I())) {
                WebLandpagePlayerView.this.f10642A = 11;
                com.anythink.core.common.v.y.a(str);
            } else {
                IOfferClickHandler iOfferClickHandler = WebLandpagePlayerView.this.f10644C;
                if (iOfferClickHandler != null && iOfferClickHandler != null) {
                    WebLandpagePlayerView webLandpagePlayerView2 = WebLandpagePlayerView.this;
                    if (webLandpagePlayerView2.f10644C.startDataFetchApp(this.f10666a, webLandpagePlayerView2.f10629x, webLandpagePlayerView2.f10630y, str)) {
                        WebLandpagePlayerView webLandpagePlayerView3 = WebLandpagePlayerView.this;
                        webLandpagePlayerView3.f10642A = 6;
                        webLandpagePlayerView3.f10643B = 1;
                    }
                }
                WebLandpagePlayerView.this.f10643B = 2;
                com.anythink.core.common.v.y.a(str);
                WebLandpagePlayerView.this.f10642A = 7;
            }
            WebLandpagePlayerView.d(WebLandpagePlayerView.this);
        }
    }

    public WebLandpagePlayerView(Context context) {
        super(context, null);
        this.f10648G = 1;
        this.f10649H = 2;
        this.f10650I = 3;
        this.J = 0;
        this.f10642A = 8;
        this.f10643B = 0;
        this.f10656P = null;
        this.f10657Q = 512;
        this.f10645D = 0;
        this.f10647F = false;
        this.f10658R = "";
        this.f10659S = 0;
        this.f10661U = false;
    }

    private void i() {
        if (this.f10652L == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -getMeasuredHeight());
            this.f10652L = translateAnimation;
            translateAnimation.setFillAfter(true);
            this.f10652L.setDuration(1200L);
        }
        if (this.f10653M == null) {
            TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, getMeasuredHeight(), 0.0f);
            this.f10653M = translateAnimation2;
            translateAnimation2.setFillAfter(true);
            this.f10653M.setDuration(1200L);
            this.f10653M.setAnimationListener(new AnonymousClass2());
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView
    public final void a() {
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView
    public final void b() {
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView
    public final void c() {
    }

    @Override // com.anythink.core.basead.ui.web.b
    public void callbackClickResult(cc ccVar) {
        this.f10642A = ccVar.f14062l;
        if (ccVar.f14064n) {
            if (!ccVar.f14063m) {
                this.f10645D = 2;
            } else {
                this.f10645D = 1;
                this.f10659S = 2;
            }
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView
    public final void d() {
    }

    @Override // com.anythink.core.basead.ui.web.b
    public w getBaseAdContent() {
        return this.f10629x;
    }

    @Override // com.anythink.core.basead.ui.web.b
    public WebProgressBarView getWebProgressBarView() {
        return null;
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView, com.anythink.basead.ui.animplayerview.BasePlayerView
    public void init(w wVar, x xVar, boolean z8, List<Bitmap> list, e eVar) {
        super.init(wVar, xVar, z8, list, eVar);
        Context context = getContext();
        a(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels - q.a(context, 40.0f));
        this.f10660T = new LinkedHashMap();
        LinearLayout linearLayout = new LinearLayout(context);
        this.f10662h = linearLayout;
        linearLayout.setGravity(1);
        this.f10662h.setOrientation(1);
        this.f10662h.setBackgroundColor(-1);
        RecycleImageView recycleImageView = new RecycleImageView(context);
        recycleImageView.setImageResource(q.a(getContext(), "myoffer_arrow_up", k.f19790c));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(q.a(context, 9.0f), q.a(context, 9.0f));
        layoutParams.topMargin = q.a(context, 3.0f);
        this.f10662h.addView(recycleImageView, layoutParams);
        TextView textView = new TextView(context);
        textView.setText(q.a(getContext(), "myoffer_slide_hint", k.f19794g));
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(Color.parseColor("#000000"));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = q.a(context, 1.0f);
        this.f10662h.addView(textView, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, q.a(context, 54.0f));
        layoutParams3.addRule(12);
        layoutParams3.setMargins(0, 0, 0, 0);
        addView(this.f10662h, layoutParams3);
        if (this.f10651K == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, q.a(context, 18.0f), 0.0f);
            this.f10651K = translateAnimation;
            translateAnimation.setFillAfter(true);
            this.f10651K.setRepeatMode(2);
            this.f10651K.setRepeatCount(-1);
            this.f10651K.setInterpolator(new AnticipateInterpolator());
            this.f10651K.setDuration(600L);
        }
        this.f10662h.startAnimation(this.f10651K);
        post(new AnonymousClass1(context));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0036 A[Catch: all -> 0x0047, TRY_ENTER, TryCatch #2 {all -> 0x0047, blocks: (B:4:0x0004, B:12:0x000f, B:25:0x0036, B:26:0x0040), top: B:3:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onActivityResult(int i, int i4, Intent intent) {
        Uri[] uriArr;
        ClipData clipData;
        if (i == 512) {
            try {
                if (this.f10656P == null) {
                    return;
                }
                if (i4 != -1 || intent == null) {
                    uriArr = null;
                } else {
                    String dataString = intent.getDataString();
                    try {
                        clipData = intent.getClipData();
                    } catch (Throwable unused) {
                    }
                    if (clipData != null) {
                        uriArr = new Uri[clipData.getItemCount()];
                        for (int i9 = 0; i9 < clipData.getItemCount(); i9++) {
                            try {
                                uriArr[i9] = clipData.getItemAt(i9).getUri();
                            } catch (Throwable unused2) {
                            }
                        }
                        if (dataString != null) {
                            uriArr = new Uri[]{Uri.parse(dataString)};
                        }
                    }
                    uriArr = null;
                    if (dataString != null) {
                    }
                }
                this.f10656P.onReceiveValue(uriArr);
                this.f10656P = null;
            } catch (Throwable unused3) {
            }
        }
    }

    @Override // com.anythink.core.basead.ui.web.b
    public void onWebFinish() {
    }

    @Override // com.anythink.core.basead.ui.web.b
    public void onWebPageFinish(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && this.f10659S != 3) {
            this.f10659S = 2;
            JSONArray jSONArray = this.f10660T.get(str);
            if (jSONArray != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(System.currentTimeMillis());
                    jSONArray.put(1, sb.toString());
                    this.f10660T.put(str, jSONArray);
                } catch (JSONException unused) {
                }
            }
        }
        com.anythink.core.basead.ui.web.c cVar = this.f10655O;
        if (cVar != null) {
            cVar.a(webView, str);
        }
    }

    @Override // com.anythink.core.basead.ui.web.b
    public void onWebPageLoadError(WebView webView, String str) {
        this.f10659S = 3;
    }

    @Override // com.anythink.core.basead.ui.web.b
    public void onWebPageStart(WebView webView, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f10659S = 1;
        JSONArray jSONArray = this.f10660T.get(str);
        if (jSONArray != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(System.currentTimeMillis());
                jSONArray.put(0, sb.toString());
                jSONArray.put(1, "");
                this.f10660T.put(str, jSONArray);
            } catch (JSONException unused) {
            }
        }
    }

    public synchronized boolean openInternalWebView(String str, IOfferClickHandler iOfferClickHandler) {
        try {
            if (TextUtils.isEmpty(this.f10646E)) {
                this.f10646E = str;
                this.f10644C = iOfferClickHandler;
                post(new Runnable() { // from class: com.anythink.basead.ui.animplayerview.WebLandpagePlayerView.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (WebLandpagePlayerView.this.f10654N != null) {
                            cc a9 = com.anythink.core.basead.a.e.a(WebLandpagePlayerView.this.f10646E);
                            WebLandpagePlayerView webLandpagePlayerView = WebLandpagePlayerView.this;
                            webLandpagePlayerView.f10642A = a9.f14062l;
                            webLandpagePlayerView.f10654N.loadUrl(a9.f14065o);
                            WebLandpagePlayerView webLandpagePlayerView2 = WebLandpagePlayerView.this;
                            webLandpagePlayerView2.recordRedirectUrl(webLandpagePlayerView2.f10654N.getUrl());
                            if (WebLandpagePlayerView.this.f10662h.getAnimation() != null) {
                                WebLandpagePlayerView.this.f10662h.getAnimation().cancel();
                            }
                            WebLandpagePlayerView webLandpagePlayerView3 = WebLandpagePlayerView.this;
                            webLandpagePlayerView3.f10662h.startAnimation(webLandpagePlayerView3.f10652L);
                            WebLandpagePlayerView.this.f10654N.startAnimation(WebLandpagePlayerView.this.f10653M);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f10647F;
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView, com.anythink.basead.ui.animplayerview.BasePlayerView
    public void pause() {
        super.pause();
        if (this.f10654N != null) {
            CookieSyncManager.getInstance().stopSync();
            this.f10654N.setWebChromeClient(null);
            com.anythink.core.basead.ui.a.a.a(this.f10654N, getContext() instanceof Activity ? ((Activity) getContext()).isFinishing() : false);
        }
    }

    @Override // com.anythink.core.basead.ui.web.b
    public void recordRedirectUrl(String str) {
        if (this.f10660T.size() > 0) {
            JSONArray jSONArray = this.f10660T.get(this.f10658R);
            try {
                if (this.f10659S == 0 && jSONArray != null) {
                    if (TextUtils.isEmpty(jSONArray.getString(1))) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(System.currentTimeMillis());
                        jSONArray.put(1, sb.toString());
                    }
                    this.f10660T.put(this.f10658R, jSONArray);
                }
            } catch (Throwable unused) {
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(System.currentTimeMillis());
        jSONArray2.put(sb2.toString());
        jSONArray2.put("");
        this.f10660T.put(str, jSONArray2);
        this.f10658R = str;
        this.f10659S = 0;
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView, com.anythink.basead.ui.animplayerview.BasePlayerView
    public void release(int i) {
        x xVar;
        super.release(i);
        WebView webView = this.f10654N;
        if (webView != null) {
            webView.setDownloadListener(null);
            this.f10654N.destroy();
        }
        this.f10654N = null;
        w wVar = this.f10629x;
        if (wVar == null || (xVar = this.f10630y) == null) {
            return;
        }
        int b9 = wVar.b();
        String v6 = this.f10629x.v();
        Map<String, JSONArray> map = this.f10660T;
        int i4 = this.f10645D;
        int i9 = this.f10643B;
        int i10 = this.f10642A;
        String str = this.f10646E;
        int i11 = this.f10630y.f14320j;
        String str2 = this.f10658R;
        int i12 = this.f10659S;
        if (i12 == 0) {
            i12 = 1;
        }
        com.anythink.core.common.u.e.a(xVar, b9, v6, map, i4, i9, i10, str, i11, 1, 0L, str2, i12, this.f10661U);
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView, com.anythink.basead.ui.animplayerview.BasePlayerView
    public void start() {
        super.start();
        if (this.f10654N != null) {
            CookieSyncManager.getInstance().startSync();
            this.f10654N.setWebChromeClient(new WebChromeClient() { // from class: com.anythink.basead.ui.animplayerview.WebLandpagePlayerView.4
                @Override // android.webkit.WebChromeClient
                public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                    com.anythink.core.basead.ui.a.a.a(WebLandpagePlayerView.this.getContext(), str, callback);
                    super.onGeolocationPermissionsShowPrompt(str, callback);
                }

                @Override // android.webkit.WebChromeClient
                public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                    try {
                        WebLandpagePlayerView.this.f10656P = valueCallback;
                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                        intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*", "audio/*"});
                        intent.addCategory("android.intent.category.OPENABLE");
                        intent.setType("image/* video/* audio/*");
                        if (!(WebLandpagePlayerView.this.getContext() instanceof Activity)) {
                            return true;
                        }
                        ((Activity) WebLandpagePlayerView.this.getContext()).startActivityForResult(Intent.createChooser(intent, "File Chooser"), 512);
                        return true;
                    } catch (Throwable unused) {
                        return false;
                    }
                }
            });
            this.f10654N.onResume();
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView, com.anythink.basead.ui.animplayerview.BasePlayerView
    public void stop() {
        super.stop();
    }

    @Override // com.anythink.core.basead.ui.web.b
    public boolean supportDeeplinkJump() {
        return true;
    }

    public static /* synthetic */ boolean c(WebLandpagePlayerView webLandpagePlayerView) {
        webLandpagePlayerView.f10661U = true;
        return true;
    }

    public static /* synthetic */ int d(WebLandpagePlayerView webLandpagePlayerView) {
        webLandpagePlayerView.f10659S = 2;
        return 2;
    }

    private void a(Context context) {
        a(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels - q.a(context, 40.0f));
        this.f10660T = new LinkedHashMap();
        LinearLayout linearLayout = new LinearLayout(context);
        this.f10662h = linearLayout;
        linearLayout.setGravity(1);
        this.f10662h.setOrientation(1);
        this.f10662h.setBackgroundColor(-1);
        RecycleImageView recycleImageView = new RecycleImageView(context);
        recycleImageView.setImageResource(q.a(getContext(), "myoffer_arrow_up", k.f19790c));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(q.a(context, 9.0f), q.a(context, 9.0f));
        layoutParams.topMargin = q.a(context, 3.0f);
        this.f10662h.addView(recycleImageView, layoutParams);
        TextView textView = new TextView(context);
        textView.setText(q.a(getContext(), "myoffer_slide_hint", k.f19794g));
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(Color.parseColor("#000000"));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = q.a(context, 1.0f);
        this.f10662h.addView(textView, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, q.a(context, 54.0f));
        layoutParams3.addRule(12);
        layoutParams3.setMargins(0, 0, 0, 0);
        addView(this.f10662h, layoutParams3);
        if (this.f10651K == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, q.a(context, 18.0f), 0.0f);
            this.f10651K = translateAnimation;
            translateAnimation.setFillAfter(true);
            this.f10651K.setRepeatMode(2);
            this.f10651K.setRepeatCount(-1);
            this.f10651K.setInterpolator(new AnticipateInterpolator());
            this.f10651K.setDuration(600L);
        }
        this.f10662h.startAnimation(this.f10651K);
        post(new AnonymousClass1(context));
    }

    private void b(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        this.f10662h = linearLayout;
        linearLayout.setGravity(1);
        this.f10662h.setOrientation(1);
        this.f10662h.setBackgroundColor(-1);
        RecycleImageView recycleImageView = new RecycleImageView(context);
        recycleImageView.setImageResource(q.a(getContext(), "myoffer_arrow_up", k.f19790c));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(q.a(context, 9.0f), q.a(context, 9.0f));
        layoutParams.topMargin = q.a(context, 3.0f);
        this.f10662h.addView(recycleImageView, layoutParams);
        TextView textView = new TextView(context);
        textView.setText(q.a(getContext(), "myoffer_slide_hint", k.f19794g));
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(Color.parseColor("#000000"));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = q.a(context, 1.0f);
        this.f10662h.addView(textView, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, q.a(context, 54.0f));
        layoutParams3.addRule(12);
        layoutParams3.setMargins(0, 0, 0, 0);
        addView(this.f10662h, layoutParams3);
        if (this.f10651K == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, q.a(context, 18.0f), 0.0f);
            this.f10651K = translateAnimation;
            translateAnimation.setFillAfter(true);
            this.f10651K.setRepeatMode(2);
            this.f10651K.setRepeatCount(-1);
            this.f10651K.setInterpolator(new AnticipateInterpolator());
            this.f10651K.setDuration(600L);
        }
        this.f10662h.startAnimation(this.f10651K);
    }

    private void c(Context context) {
        try {
            this.f10654N = new BaseWebView(context);
            this.f10655O = new com.anythink.core.basead.ui.web.c(this.f10629x);
            this.f10654N.setBackgroundColor(-1);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, getMeasuredHeight());
            this.f10654N.setVisibility(8);
            addView(this.f10654N, layoutParams);
            com.anythink.core.basead.ui.a.a.a(context);
            com.anythink.core.basead.ui.a.a.a(this.f10654N, context, this);
            this.f10654N.setDownloadListener(new AnonymousClass3(context));
            this.f10647F = true;
        } catch (Throwable unused) {
            this.f10647F = false;
        }
    }

    private void d(Context context) {
        com.anythink.core.basead.ui.a.a.a(this.f10654N, context, this);
        this.f10654N.setDownloadListener(new AnonymousClass3(context));
    }

    public WebLandpagePlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f10648G = 1;
        this.f10649H = 2;
        this.f10650I = 3;
        this.J = 0;
        this.f10642A = 8;
        this.f10643B = 0;
        this.f10656P = null;
        this.f10657Q = 512;
        this.f10645D = 0;
        this.f10647F = false;
        this.f10658R = "";
        this.f10659S = 0;
        this.f10661U = false;
    }

    public WebLandpagePlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10648G = 1;
        this.f10649H = 2;
        this.f10650I = 3;
        this.J = 0;
        this.f10642A = 8;
        this.f10643B = 0;
        this.f10656P = null;
        this.f10657Q = 512;
        this.f10645D = 0;
        this.f10647F = false;
        this.f10658R = "";
        this.f10659S = 0;
        this.f10661U = false;
    }

    public static /* synthetic */ void a(WebLandpagePlayerView webLandpagePlayerView, Context context) {
        try {
            webLandpagePlayerView.f10654N = new BaseWebView(context);
            webLandpagePlayerView.f10655O = new com.anythink.core.basead.ui.web.c(webLandpagePlayerView.f10629x);
            webLandpagePlayerView.f10654N.setBackgroundColor(-1);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, webLandpagePlayerView.getMeasuredHeight());
            webLandpagePlayerView.f10654N.setVisibility(8);
            webLandpagePlayerView.addView(webLandpagePlayerView.f10654N, layoutParams);
            com.anythink.core.basead.ui.a.a.a(context);
            com.anythink.core.basead.ui.a.a.a(webLandpagePlayerView.f10654N, context, webLandpagePlayerView);
            webLandpagePlayerView.f10654N.setDownloadListener(webLandpagePlayerView.new AnonymousClass3(context));
            webLandpagePlayerView.f10647F = true;
        } catch (Throwable unused) {
            webLandpagePlayerView.f10647F = false;
        }
    }

    public static /* synthetic */ void a(WebLandpagePlayerView webLandpagePlayerView) {
        if (webLandpagePlayerView.f10652L == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -webLandpagePlayerView.getMeasuredHeight());
            webLandpagePlayerView.f10652L = translateAnimation;
            translateAnimation.setFillAfter(true);
            webLandpagePlayerView.f10652L.setDuration(1200L);
        }
        if (webLandpagePlayerView.f10653M == null) {
            TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, webLandpagePlayerView.getMeasuredHeight(), 0.0f);
            webLandpagePlayerView.f10653M = translateAnimation2;
            translateAnimation2.setFillAfter(true);
            webLandpagePlayerView.f10653M.setDuration(1200L);
            webLandpagePlayerView.f10653M.setAnimationListener(webLandpagePlayerView.new AnonymousClass2());
        }
    }
}
