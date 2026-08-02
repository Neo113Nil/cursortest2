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
    int f11271A;

    /* renamed from: B, reason: collision with root package name */
    int f11272B;

    /* renamed from: C, reason: collision with root package name */
    IOfferClickHandler f11273C;

    /* renamed from: D, reason: collision with root package name */
    int f11274D;

    /* renamed from: E, reason: collision with root package name */
    String f11275E;

    /* renamed from: F, reason: collision with root package name */
    boolean f11276F;

    /* renamed from: G, reason: collision with root package name */
    private final int f11277G;

    /* renamed from: H, reason: collision with root package name */
    private final int f11278H;

    /* renamed from: I, reason: collision with root package name */
    private final int f11279I;
    private final int J;

    /* renamed from: K, reason: collision with root package name */
    private TranslateAnimation f11280K;

    /* renamed from: L, reason: collision with root package name */
    private TranslateAnimation f11281L;

    /* renamed from: M, reason: collision with root package name */
    private TranslateAnimation f11282M;

    /* renamed from: N, reason: collision with root package name */
    private WebView f11283N;

    /* renamed from: O, reason: collision with root package name */
    private com.anythink.core.basead.ui.web.c f11284O;

    /* renamed from: P, reason: collision with root package name */
    private ValueCallback<Uri[]> f11285P;

    /* renamed from: Q, reason: collision with root package name */
    private final int f11286Q;

    /* renamed from: R, reason: collision with root package name */
    private String f11287R;

    /* renamed from: S, reason: collision with root package name */
    private int f11288S;

    /* renamed from: T, reason: collision with root package name */
    private Map<String, JSONArray> f11289T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f11290U;

    /* renamed from: h, reason: collision with root package name */
    LinearLayout f11291h;

    /* renamed from: com.anythink.basead.ui.animplayerview.WebLandpagePlayerView$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f11292a;

        public AnonymousClass1(Context context) {
            this.f11292a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            WebLandpagePlayerView.a(WebLandpagePlayerView.this, this.f11292a);
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
            if (WebLandpagePlayerView.this.f11283N != null) {
                WebLandpagePlayerView.this.f11283N.setVisibility(0);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.animplayerview.WebLandpagePlayerView$3, reason: invalid class name */
    public class AnonymousClass3 implements DownloadListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f11295a;

        public AnonymousClass3(Context context) {
            this.f11295a = context;
        }

        @Override // android.webkit.DownloadListener
        public final void onDownloadStart(String str, String str2, String str3, String str4, long j6) {
            y yVar;
            t.b();
            x xVar = WebLandpagePlayerView.this.f11259y;
            if (xVar != null && (yVar = xVar.f14954o) != null && yVar.bn() != 2) {
                WebLandpagePlayerView.c(WebLandpagePlayerView.this);
                try {
                    Toast.makeText(t.b().g(), q.a(t.b().g(), "myoffer_intercept_web_file_download", k.f20423g), 0).show();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            WebLandpagePlayerView webLandpagePlayerView = WebLandpagePlayerView.this;
            w wVar = webLandpagePlayerView.f11258x;
            if (wVar == null || webLandpagePlayerView.f11259y == null || TextUtils.isEmpty(wVar.I())) {
                WebLandpagePlayerView.this.f11271A = 11;
                com.anythink.core.common.v.y.a(str);
            } else {
                IOfferClickHandler iOfferClickHandler = WebLandpagePlayerView.this.f11273C;
                if (iOfferClickHandler != null && iOfferClickHandler != null) {
                    WebLandpagePlayerView webLandpagePlayerView2 = WebLandpagePlayerView.this;
                    if (webLandpagePlayerView2.f11273C.startDataFetchApp(this.f11295a, webLandpagePlayerView2.f11258x, webLandpagePlayerView2.f11259y, str)) {
                        WebLandpagePlayerView webLandpagePlayerView3 = WebLandpagePlayerView.this;
                        webLandpagePlayerView3.f11271A = 6;
                        webLandpagePlayerView3.f11272B = 1;
                    }
                }
                WebLandpagePlayerView.this.f11272B = 2;
                com.anythink.core.common.v.y.a(str);
                WebLandpagePlayerView.this.f11271A = 7;
            }
            WebLandpagePlayerView.d(WebLandpagePlayerView.this);
        }
    }

    public WebLandpagePlayerView(Context context) {
        super(context, null);
        this.f11277G = 1;
        this.f11278H = 2;
        this.f11279I = 3;
        this.J = 0;
        this.f11271A = 8;
        this.f11272B = 0;
        this.f11285P = null;
        this.f11286Q = 512;
        this.f11274D = 0;
        this.f11276F = false;
        this.f11287R = "";
        this.f11288S = 0;
        this.f11290U = false;
    }

    private void i() {
        if (this.f11281L == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -getMeasuredHeight());
            this.f11281L = translateAnimation;
            translateAnimation.setFillAfter(true);
            this.f11281L.setDuration(1200L);
        }
        if (this.f11282M == null) {
            TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, getMeasuredHeight(), 0.0f);
            this.f11282M = translateAnimation2;
            translateAnimation2.setFillAfter(true);
            this.f11282M.setDuration(1200L);
            this.f11282M.setAnimationListener(new AnonymousClass2());
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
        this.f11271A = ccVar.f14691l;
        if (ccVar.f14693n) {
            if (!ccVar.f14692m) {
                this.f11274D = 2;
            } else {
                this.f11274D = 1;
                this.f11288S = 2;
            }
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView
    public final void d() {
    }

    @Override // com.anythink.core.basead.ui.web.b
    public w getBaseAdContent() {
        return this.f11258x;
    }

    @Override // com.anythink.core.basead.ui.web.b
    public WebProgressBarView getWebProgressBarView() {
        return null;
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView, com.anythink.basead.ui.animplayerview.BasePlayerView
    public void init(w wVar, x xVar, boolean z6, List<Bitmap> list, e eVar) {
        super.init(wVar, xVar, z6, list, eVar);
        Context context = getContext();
        a(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels - q.a(context, 40.0f));
        this.f11289T = new LinkedHashMap();
        LinearLayout linearLayout = new LinearLayout(context);
        this.f11291h = linearLayout;
        linearLayout.setGravity(1);
        this.f11291h.setOrientation(1);
        this.f11291h.setBackgroundColor(-1);
        RecycleImageView recycleImageView = new RecycleImageView(context);
        recycleImageView.setImageResource(q.a(getContext(), "myoffer_arrow_up", k.f20419c));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(q.a(context, 9.0f), q.a(context, 9.0f));
        layoutParams.topMargin = q.a(context, 3.0f);
        this.f11291h.addView(recycleImageView, layoutParams);
        TextView textView = new TextView(context);
        textView.setText(q.a(getContext(), "myoffer_slide_hint", k.f20423g));
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(Color.parseColor("#000000"));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = q.a(context, 1.0f);
        this.f11291h.addView(textView, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, q.a(context, 54.0f));
        layoutParams3.addRule(12);
        layoutParams3.setMargins(0, 0, 0, 0);
        addView(this.f11291h, layoutParams3);
        if (this.f11280K == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, q.a(context, 18.0f), 0.0f);
            this.f11280K = translateAnimation;
            translateAnimation.setFillAfter(true);
            this.f11280K.setRepeatMode(2);
            this.f11280K.setRepeatCount(-1);
            this.f11280K.setInterpolator(new AnticipateInterpolator());
            this.f11280K.setDuration(600L);
        }
        this.f11291h.startAnimation(this.f11280K);
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
                if (this.f11285P == null) {
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
                        for (int i6 = 0; i6 < clipData.getItemCount(); i6++) {
                            try {
                                uriArr[i6] = clipData.getItemAt(i6).getUri();
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
                this.f11285P.onReceiveValue(uriArr);
                this.f11285P = null;
            } catch (Throwable unused3) {
            }
        }
    }

    @Override // com.anythink.core.basead.ui.web.b
    public void onWebFinish() {
    }

    @Override // com.anythink.core.basead.ui.web.b
    public void onWebPageFinish(WebView webView, String str) {
        if (!TextUtils.isEmpty(str) && this.f11288S != 3) {
            this.f11288S = 2;
            JSONArray jSONArray = this.f11289T.get(str);
            if (jSONArray != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(System.currentTimeMillis());
                    jSONArray.put(1, sb.toString());
                    this.f11289T.put(str, jSONArray);
                } catch (JSONException unused) {
                }
            }
        }
        com.anythink.core.basead.ui.web.c cVar = this.f11284O;
        if (cVar != null) {
            cVar.a(webView, str);
        }
    }

    @Override // com.anythink.core.basead.ui.web.b
    public void onWebPageLoadError(WebView webView, String str) {
        this.f11288S = 3;
    }

    @Override // com.anythink.core.basead.ui.web.b
    public void onWebPageStart(WebView webView, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f11288S = 1;
        JSONArray jSONArray = this.f11289T.get(str);
        if (jSONArray != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(System.currentTimeMillis());
                jSONArray.put(0, sb.toString());
                jSONArray.put(1, "");
                this.f11289T.put(str, jSONArray);
            } catch (JSONException unused) {
            }
        }
    }

    public synchronized boolean openInternalWebView(String str, IOfferClickHandler iOfferClickHandler) {
        try {
            if (TextUtils.isEmpty(this.f11275E)) {
                this.f11275E = str;
                this.f11273C = iOfferClickHandler;
                post(new Runnable() { // from class: com.anythink.basead.ui.animplayerview.WebLandpagePlayerView.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (WebLandpagePlayerView.this.f11283N != null) {
                            cc a9 = com.anythink.core.basead.a.e.a(WebLandpagePlayerView.this.f11275E);
                            WebLandpagePlayerView webLandpagePlayerView = WebLandpagePlayerView.this;
                            webLandpagePlayerView.f11271A = a9.f14691l;
                            webLandpagePlayerView.f11283N.loadUrl(a9.f14694o);
                            WebLandpagePlayerView webLandpagePlayerView2 = WebLandpagePlayerView.this;
                            webLandpagePlayerView2.recordRedirectUrl(webLandpagePlayerView2.f11283N.getUrl());
                            if (WebLandpagePlayerView.this.f11291h.getAnimation() != null) {
                                WebLandpagePlayerView.this.f11291h.getAnimation().cancel();
                            }
                            WebLandpagePlayerView webLandpagePlayerView3 = WebLandpagePlayerView.this;
                            webLandpagePlayerView3.f11291h.startAnimation(webLandpagePlayerView3.f11281L);
                            WebLandpagePlayerView.this.f11283N.startAnimation(WebLandpagePlayerView.this.f11282M);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f11276F;
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView, com.anythink.basead.ui.animplayerview.BasePlayerView
    public void pause() {
        super.pause();
        if (this.f11283N != null) {
            CookieSyncManager.getInstance().stopSync();
            this.f11283N.setWebChromeClient(null);
            com.anythink.core.basead.ui.a.a.a(this.f11283N, getContext() instanceof Activity ? ((Activity) getContext()).isFinishing() : false);
        }
    }

    @Override // com.anythink.core.basead.ui.web.b
    public void recordRedirectUrl(String str) {
        if (this.f11289T.size() > 0) {
            JSONArray jSONArray = this.f11289T.get(this.f11287R);
            try {
                if (this.f11288S == 0 && jSONArray != null) {
                    if (TextUtils.isEmpty(jSONArray.getString(1))) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(System.currentTimeMillis());
                        jSONArray.put(1, sb.toString());
                    }
                    this.f11289T.put(this.f11287R, jSONArray);
                }
            } catch (Throwable unused) {
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(System.currentTimeMillis());
        jSONArray2.put(sb2.toString());
        jSONArray2.put("");
        this.f11289T.put(str, jSONArray2);
        this.f11287R = str;
        this.f11288S = 0;
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView, com.anythink.basead.ui.animplayerview.BasePlayerView
    public void release(int i) {
        x xVar;
        super.release(i);
        WebView webView = this.f11283N;
        if (webView != null) {
            webView.setDownloadListener(null);
            this.f11283N.destroy();
        }
        this.f11283N = null;
        w wVar = this.f11258x;
        if (wVar == null || (xVar = this.f11259y) == null) {
            return;
        }
        int b9 = wVar.b();
        String v9 = this.f11258x.v();
        Map<String, JSONArray> map = this.f11289T;
        int i4 = this.f11274D;
        int i6 = this.f11272B;
        int i9 = this.f11271A;
        String str = this.f11275E;
        int i10 = this.f11259y.f14949j;
        String str2 = this.f11287R;
        int i11 = this.f11288S;
        if (i11 == 0) {
            i11 = 1;
        }
        com.anythink.core.common.u.e.a(xVar, b9, v9, map, i4, i6, i9, str, i10, 1, 0L, str2, i11, this.f11290U);
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView, com.anythink.basead.ui.animplayerview.BasePlayerView
    public void start() {
        super.start();
        if (this.f11283N != null) {
            CookieSyncManager.getInstance().startSync();
            this.f11283N.setWebChromeClient(new WebChromeClient() { // from class: com.anythink.basead.ui.animplayerview.WebLandpagePlayerView.4
                @Override // android.webkit.WebChromeClient
                public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                    com.anythink.core.basead.ui.a.a.a(WebLandpagePlayerView.this.getContext(), str, callback);
                    super.onGeolocationPermissionsShowPrompt(str, callback);
                }

                @Override // android.webkit.WebChromeClient
                public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                    try {
                        WebLandpagePlayerView.this.f11285P = valueCallback;
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
            this.f11283N.onResume();
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
        webLandpagePlayerView.f11290U = true;
        return true;
    }

    public static /* synthetic */ int d(WebLandpagePlayerView webLandpagePlayerView) {
        webLandpagePlayerView.f11288S = 2;
        return 2;
    }

    private void a(Context context) {
        a(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels - q.a(context, 40.0f));
        this.f11289T = new LinkedHashMap();
        LinearLayout linearLayout = new LinearLayout(context);
        this.f11291h = linearLayout;
        linearLayout.setGravity(1);
        this.f11291h.setOrientation(1);
        this.f11291h.setBackgroundColor(-1);
        RecycleImageView recycleImageView = new RecycleImageView(context);
        recycleImageView.setImageResource(q.a(getContext(), "myoffer_arrow_up", k.f20419c));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(q.a(context, 9.0f), q.a(context, 9.0f));
        layoutParams.topMargin = q.a(context, 3.0f);
        this.f11291h.addView(recycleImageView, layoutParams);
        TextView textView = new TextView(context);
        textView.setText(q.a(getContext(), "myoffer_slide_hint", k.f20423g));
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(Color.parseColor("#000000"));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = q.a(context, 1.0f);
        this.f11291h.addView(textView, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, q.a(context, 54.0f));
        layoutParams3.addRule(12);
        layoutParams3.setMargins(0, 0, 0, 0);
        addView(this.f11291h, layoutParams3);
        if (this.f11280K == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, q.a(context, 18.0f), 0.0f);
            this.f11280K = translateAnimation;
            translateAnimation.setFillAfter(true);
            this.f11280K.setRepeatMode(2);
            this.f11280K.setRepeatCount(-1);
            this.f11280K.setInterpolator(new AnticipateInterpolator());
            this.f11280K.setDuration(600L);
        }
        this.f11291h.startAnimation(this.f11280K);
        post(new AnonymousClass1(context));
    }

    private void b(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        this.f11291h = linearLayout;
        linearLayout.setGravity(1);
        this.f11291h.setOrientation(1);
        this.f11291h.setBackgroundColor(-1);
        RecycleImageView recycleImageView = new RecycleImageView(context);
        recycleImageView.setImageResource(q.a(getContext(), "myoffer_arrow_up", k.f20419c));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(q.a(context, 9.0f), q.a(context, 9.0f));
        layoutParams.topMargin = q.a(context, 3.0f);
        this.f11291h.addView(recycleImageView, layoutParams);
        TextView textView = new TextView(context);
        textView.setText(q.a(getContext(), "myoffer_slide_hint", k.f20423g));
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(Color.parseColor("#000000"));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = q.a(context, 1.0f);
        this.f11291h.addView(textView, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, q.a(context, 54.0f));
        layoutParams3.addRule(12);
        layoutParams3.setMargins(0, 0, 0, 0);
        addView(this.f11291h, layoutParams3);
        if (this.f11280K == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, q.a(context, 18.0f), 0.0f);
            this.f11280K = translateAnimation;
            translateAnimation.setFillAfter(true);
            this.f11280K.setRepeatMode(2);
            this.f11280K.setRepeatCount(-1);
            this.f11280K.setInterpolator(new AnticipateInterpolator());
            this.f11280K.setDuration(600L);
        }
        this.f11291h.startAnimation(this.f11280K);
    }

    private void c(Context context) {
        try {
            this.f11283N = new BaseWebView(context);
            this.f11284O = new com.anythink.core.basead.ui.web.c(this.f11258x);
            this.f11283N.setBackgroundColor(-1);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, getMeasuredHeight());
            this.f11283N.setVisibility(8);
            addView(this.f11283N, layoutParams);
            com.anythink.core.basead.ui.a.a.a(context);
            com.anythink.core.basead.ui.a.a.a(this.f11283N, context, this);
            this.f11283N.setDownloadListener(new AnonymousClass3(context));
            this.f11276F = true;
        } catch (Throwable unused) {
            this.f11276F = false;
        }
    }

    private void d(Context context) {
        com.anythink.core.basead.ui.a.a.a(this.f11283N, context, this);
        this.f11283N.setDownloadListener(new AnonymousClass3(context));
    }

    public WebLandpagePlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f11277G = 1;
        this.f11278H = 2;
        this.f11279I = 3;
        this.J = 0;
        this.f11271A = 8;
        this.f11272B = 0;
        this.f11285P = null;
        this.f11286Q = 512;
        this.f11274D = 0;
        this.f11276F = false;
        this.f11287R = "";
        this.f11288S = 0;
        this.f11290U = false;
    }

    public WebLandpagePlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11277G = 1;
        this.f11278H = 2;
        this.f11279I = 3;
        this.J = 0;
        this.f11271A = 8;
        this.f11272B = 0;
        this.f11285P = null;
        this.f11286Q = 512;
        this.f11274D = 0;
        this.f11276F = false;
        this.f11287R = "";
        this.f11288S = 0;
        this.f11290U = false;
    }

    public static /* synthetic */ void a(WebLandpagePlayerView webLandpagePlayerView, Context context) {
        try {
            webLandpagePlayerView.f11283N = new BaseWebView(context);
            webLandpagePlayerView.f11284O = new com.anythink.core.basead.ui.web.c(webLandpagePlayerView.f11258x);
            webLandpagePlayerView.f11283N.setBackgroundColor(-1);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, webLandpagePlayerView.getMeasuredHeight());
            webLandpagePlayerView.f11283N.setVisibility(8);
            webLandpagePlayerView.addView(webLandpagePlayerView.f11283N, layoutParams);
            com.anythink.core.basead.ui.a.a.a(context);
            com.anythink.core.basead.ui.a.a.a(webLandpagePlayerView.f11283N, context, webLandpagePlayerView);
            webLandpagePlayerView.f11283N.setDownloadListener(webLandpagePlayerView.new AnonymousClass3(context));
            webLandpagePlayerView.f11276F = true;
        } catch (Throwable unused) {
            webLandpagePlayerView.f11276F = false;
        }
    }

    public static /* synthetic */ void a(WebLandpagePlayerView webLandpagePlayerView) {
        if (webLandpagePlayerView.f11281L == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -webLandpagePlayerView.getMeasuredHeight());
            webLandpagePlayerView.f11281L = translateAnimation;
            translateAnimation.setFillAfter(true);
            webLandpagePlayerView.f11281L.setDuration(1200L);
        }
        if (webLandpagePlayerView.f11282M == null) {
            TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, webLandpagePlayerView.getMeasuredHeight(), 0.0f);
            webLandpagePlayerView.f11282M = translateAnimation2;
            translateAnimation2.setFillAfter(true);
            webLandpagePlayerView.f11282M.setDuration(1200L);
            webLandpagePlayerView.f11282M.setAnimationListener(webLandpagePlayerView.new AnonymousClass2());
        }
    }
}
