package com.anythink.core.basead.ui.web;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.basead.a;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.cc;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.u.e;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class WebLandPageActivity extends Activity implements b {

    /* renamed from: g, reason: collision with root package name */
    private static final int f11942g = 343452;

    /* renamed from: B, reason: collision with root package name */
    private w f11944B;

    /* renamed from: C, reason: collision with root package name */
    private x f11945C;

    /* renamed from: D, reason: collision with root package name */
    private String f11946D;

    /* renamed from: E, reason: collision with root package name */
    private IOfferClickHandler f11947E;

    /* renamed from: F, reason: collision with root package name */
    private c f11948F;

    /* renamed from: G, reason: collision with root package name */
    private int f11949G;

    /* renamed from: b, reason: collision with root package name */
    JSONArray f11953b;

    /* renamed from: e, reason: collision with root package name */
    long f11956e;

    /* renamed from: l, reason: collision with root package name */
    private WebProgressBarView f11961l;

    /* renamed from: m, reason: collision with root package name */
    private WebView f11962m;

    /* renamed from: n, reason: collision with root package name */
    private ImageView f11963n;

    /* renamed from: o, reason: collision with root package name */
    private ImageView f11964o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f11965p;

    /* renamed from: q, reason: collision with root package name */
    private ValueAnimator f11966q;

    /* renamed from: r, reason: collision with root package name */
    private Random f11967r;

    /* renamed from: s, reason: collision with root package name */
    private int f11968s;

    /* renamed from: t, reason: collision with root package name */
    private long f11969t;

    /* renamed from: u, reason: collision with root package name */
    private Map<String, JSONArray> f11970u;

    /* renamed from: x, reason: collision with root package name */
    private WebLoadFailRefrshView f11973x;

    /* renamed from: y, reason: collision with root package name */
    private RelativeLayout f11974y;

    /* renamed from: h, reason: collision with root package name */
    private final int f11958h = 1;
    private final int i = 2;

    /* renamed from: j, reason: collision with root package name */
    private final int f11959j = 3;

    /* renamed from: k, reason: collision with root package name */
    private final int f11960k = 0;

    /* renamed from: a, reason: collision with root package name */
    int f11952a = 8;

    /* renamed from: v, reason: collision with root package name */
    private String f11971v = "";

    /* renamed from: w, reason: collision with root package name */
    private int f11972w = 0;

    /* renamed from: z, reason: collision with root package name */
    private boolean f11975z = false;

    /* renamed from: A, reason: collision with root package name */
    private boolean f11943A = true;

    /* renamed from: H, reason: collision with root package name */
    private ValueCallback<Uri[]> f11950H = null;

    /* renamed from: I, reason: collision with root package name */
    private final int f11951I = 512;

    /* renamed from: c, reason: collision with root package name */
    int f11954c = 0;

    /* renamed from: d, reason: collision with root package name */
    int f11955d = 0;

    /* renamed from: f, reason: collision with root package name */
    final long f11957f = 2500;

    /* renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$3, reason: invalid class name */
    public class AnonymousClass3 implements DownloadListener {
        public AnonymousClass3() {
        }

        @Override // android.webkit.DownloadListener
        public final void onDownloadStart(String str, String str2, String str3, String str4, long j6) {
            t.b();
            if (WebLandPageActivity.this.f11945C != null && WebLandPageActivity.this.f11945C.f14168o != null && WebLandPageActivity.this.f11945C.f14168o.bn() != 2) {
                WebLandPageActivity.d(WebLandPageActivity.this);
                try {
                    Toast.makeText(WebLandPageActivity.this.getApplicationContext(), q.a(WebLandPageActivity.this.getApplicationContext(), "myoffer_intercept_web_file_download", k.f19636g), 0).show();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            if (WebLandPageActivity.this.f11944B == null || WebLandPageActivity.this.f11945C == null || TextUtils.isEmpty(WebLandPageActivity.this.f11944B.I())) {
                if (WebLandPageActivity.g(WebLandPageActivity.this)) {
                    WebLandPageActivity.a(WebLandPageActivity.this, str, 11);
                    return;
                }
                WebLandPageActivity.b(WebLandPageActivity.this, str, 11);
            } else if (WebLandPageActivity.this.f11947E != null && WebLandPageActivity.this.f11947E != null && WebLandPageActivity.this.f11947E.startDataFetchApp(WebLandPageActivity.this.getApplicationContext(), WebLandPageActivity.this.f11944B, WebLandPageActivity.this.f11945C, str)) {
                WebLandPageActivity webLandPageActivity = WebLandPageActivity.this;
                webLandPageActivity.f11952a = 6;
                webLandPageActivity.f11955d = 1;
            } else if (WebLandPageActivity.g(WebLandPageActivity.this)) {
                WebLandPageActivity.a(WebLandPageActivity.this, str, 7);
                return;
            } else {
                WebLandPageActivity webLandPageActivity2 = WebLandPageActivity.this;
                webLandPageActivity2.f11955d = 2;
                WebLandPageActivity.b(webLandPageActivity2, str, 7);
            }
            WebLandPageActivity.h(WebLandPageActivity.this);
            WebLandPageActivity.this.e();
        }
    }

    /* renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$4, reason: invalid class name */
    public class AnonymousClass4 implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f11980a;

        public AnonymousClass4(String str) {
            this.f11980a = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            e.a(WebLandPageActivity.this.f11944B, WebLandPageActivity.this.f11945C, 3, WebLandPageActivity.this.f11956e > 0, 2, this.f11980a);
        }
    }

    /* renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$5, reason: invalid class name */
    public class AnonymousClass5 implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11982a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f11983b;

        public AnonymousClass5(int i, String str) {
            this.f11982a = i;
            this.f11983b = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            int i6 = this.f11982a;
            if (i6 == 7) {
                WebLandPageActivity.this.f11955d = 2;
            }
            WebLandPageActivity.b(WebLandPageActivity.this, this.f11983b, i6);
            WebLandPageActivity.h(WebLandPageActivity.this);
            e.a(WebLandPageActivity.this.f11944B, WebLandPageActivity.this.f11945C, 3, WebLandPageActivity.this.f11956e > 0, 1, this.f11983b);
            WebLandPageActivity.this.e();
        }
    }

    /* renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$6, reason: invalid class name */
    public class AnonymousClass6 implements View.OnClickListener {
        public AnonymousClass6() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (WebLandPageActivity.this.f11962m == null || !WebLandPageActivity.this.f11962m.canGoBack()) {
                WebLandPageActivity.this.finish();
            } else {
                WebLandPageActivity.this.f11962m.goBack();
            }
        }
    }

    /* renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$7, reason: invalid class name */
    public class AnonymousClass7 implements View.OnClickListener {
        public AnonymousClass7() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            WebLandPageActivity.this.finish();
        }
    }

    private static void b() {
    }

    private static void c() {
    }

    public static /* synthetic */ boolean d(WebLandPageActivity webLandPageActivity) {
        webLandPageActivity.f11975z = true;
        return true;
    }

    private TextView g() {
        TextView textView = new TextView(this);
        new LinearLayout.LayoutParams(0, -2, 1.0f);
        textView.setPadding(q.a((Context) this, 20.0f), 0, 0, q.a((Context) this, 2.0f));
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(Color.parseColor("#666666"));
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        return textView;
    }

    public static /* synthetic */ int h(WebLandPageActivity webLandPageActivity) {
        webLandPageActivity.f11972w = 2;
        return 2;
    }

    @Override // com.anythink.core.basead.ui.web.b
    public void callbackClickResult(cc ccVar) {
        this.f11952a = ccVar.f13905l;
        if (ccVar.f13907n) {
            if (ccVar.f13906m) {
                this.f11954c = 1;
                this.f11972w = 2;
                e();
            } else {
                this.f11954c = 2;
                if (ccVar.f13909p) {
                    e.a(this.f11944B, this.f11945C, 2, this.f11956e > 0, 0, ccVar.f13908o);
                }
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f11956e = System.currentTimeMillis();
            this.f11943A = true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    public void finish() {
        y yVar;
        x xVar = this.f11945C;
        if (xVar != null && (yVar = xVar.f14168o) != null && yVar.j() == 1) {
            try {
                AlertDialog.Builder builder = new AlertDialog.Builder(this, q.a(this, "system_dialog", k.f19634e));
                builder.setMessage(getString(q.a(this, "web_land_page_dialog_title", k.f19636g))).setCancelable(true).setPositiveButton(getString(q.a(this, "web_land_page_dialog_stay", k.f19636g)), new DialogInterface.OnClickListener() { // from class: com.anythink.core.basead.ui.web.WebLandPageActivity.10
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        x xVar2 = WebLandPageActivity.this.f11945C;
                        int b9 = WebLandPageActivity.this.f11944B.b();
                        String v9 = WebLandPageActivity.this.f11944B.v();
                        WebLandPageActivity webLandPageActivity = WebLandPageActivity.this;
                        e.a(xVar2, b9, v9, webLandPageActivity.f11953b, webLandPageActivity.f11971v, 0);
                    }
                }).setNegativeButton(getString(q.a(this, "web_land_page_dialog_yes", k.f19636g)), new DialogInterface.OnClickListener() { // from class: com.anythink.core.basead.ui.web.WebLandPageActivity.9
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        x xVar2 = WebLandPageActivity.this.f11945C;
                        int b9 = WebLandPageActivity.this.f11944B.b();
                        String v9 = WebLandPageActivity.this.f11944B.v();
                        WebLandPageActivity webLandPageActivity = WebLandPageActivity.this;
                        e.a(xVar2, b9, v9, webLandPageActivity.f11953b, webLandPageActivity.f11971v, 1);
                        WebLandPageActivity.this.e();
                    }
                });
                builder.create().show();
                return;
            } catch (Throwable unused) {
            }
        }
        e();
    }

    @Override // com.anythink.core.basead.ui.web.b
    public w getBaseAdContent() {
        return this.f11944B;
    }

    @Override // com.anythink.core.basead.ui.web.b
    public WebProgressBarView getWebProgressBarView() {
        return this.f11961l;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0036 A[Catch: all -> 0x0047, TRY_ENTER, TryCatch #2 {all -> 0x0047, blocks: (B:4:0x0004, B:12:0x000f, B:25:0x0036, B:26:0x0040), top: B:3:0x0004 }] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onActivityResult(int i, int i6, Intent intent) {
        Uri[] uriArr;
        ClipData clipData;
        if (i == 512) {
            if (this.f11950H == null) {
                return;
            }
            if (i6 != -1 || intent == null) {
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
            this.f11950H.onReceiveValue(uriArr);
            this.f11950H = null;
            super.onActivityResult(i, i6, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        WebView webView = this.f11962m;
        if (webView == null || !webView.canGoBack()) {
            super.onBackPressed();
        } else {
            this.f11962m.goBack();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11969t = SystemClock.elapsedRealtime();
        this.f11970u = new LinkedHashMap();
        setResult(-1);
        Intent intent = getIntent();
        if (intent != null) {
            try {
                Serializable serializableExtra = intent.getSerializableExtra(a.C0072a.f11868c);
                if (serializableExtra != null && (serializableExtra instanceof w)) {
                    w wVar = (w) serializableExtra;
                    this.f11944B = wVar;
                    this.f11948F = new c(wVar);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                Serializable serializableExtra2 = intent.getSerializableExtra(a.C0072a.f11870e);
                if (serializableExtra2 != null && (serializableExtra2 instanceof x)) {
                    this.f11945C = (x) serializableExtra2;
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            try {
                Serializable serializableExtra3 = intent.getSerializableExtra(a.C0072a.f11875k);
                if (serializableExtra3 != null && (serializableExtra3 instanceof IOfferClickHandler)) {
                    this.f11947E = (IOfferClickHandler) serializableExtra3;
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
            try {
                this.f11946D = intent.getStringExtra(a.C0072a.i);
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
            try {
                this.f11949G = intent.getIntExtra(a.C0072a.f11880p, -1);
            } catch (Throwable th5) {
                th5.printStackTrace();
            }
            this.f11943A = true;
            try {
                this.f11943A = intent.getBooleanExtra(a.C0072a.f11881q, true);
            } catch (Throwable th6) {
                th6.printStackTrace();
            }
        }
        String str = this.f11946D;
        if (TextUtils.isEmpty(str)) {
            w wVar2 = this.f11944B;
            str = wVar2 != null ? wVar2.H() : "";
        }
        Context applicationContext = getApplicationContext();
        if (TextUtils.isEmpty(str)) {
            Toast.makeText(applicationContext, q.a(applicationContext, "basead_click_empty", k.f19636g), 0).show();
            this.f11972w = 3;
            e();
            return;
        }
        if (this.f11943A) {
            cc a9 = com.anythink.core.basead.a.e.a(applicationContext, str, getBaseAdContent());
            if (a9.f13906m) {
                callbackClickResult(a9);
                return;
            }
            callbackClickResult(a9);
        }
        RelativeLayout f3 = f();
        this.f11974y = f3;
        if (f3 == null) {
            com.anythink.core.basead.a.e.b(str);
            e();
            return;
        }
        setContentView(f3);
        this.f11963n.setOnClickListener(new AnonymousClass6());
        this.f11964o.setOnClickListener(new AnonymousClass7());
        com.anythink.core.basead.ui.a.a.a(this);
        com.anythink.core.basead.ui.a.a.a(this.f11962m, this, this);
        this.f11962m.setDownloadListener(new AnonymousClass3());
        cc a10 = com.anythink.core.basead.a.e.a(str);
        this.f11952a = a10.f13905l;
        this.f11962m.loadUrl(a10.f13908o);
        recordRedirectUrl(this.f11962m.getUrl());
    }

    @Override // android.app.Activity
    public void onDestroy() {
        x xVar;
        super.onDestroy();
        ValueAnimator valueAnimator = this.f11966q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f11966q = null;
        }
        WebView webView = this.f11962m;
        if (webView != null) {
            webView.setDownloadListener(null);
            this.f11962m.destroy();
        }
        this.f11962m = null;
        w wVar = this.f11944B;
        if (wVar == null || (xVar = this.f11945C) == null) {
            return;
        }
        int b9 = wVar.b();
        String v9 = this.f11944B.v();
        Map<String, JSONArray> map = this.f11970u;
        int i = this.f11954c;
        int i6 = this.f11955d;
        int i9 = this.f11952a;
        String str = this.f11946D;
        int i10 = this.f11945C.f14163j;
        int i11 = this.f11949G;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f11969t;
        String str2 = this.f11971v;
        int i12 = this.f11972w;
        if (i12 == 0) {
            i12 = 1;
        }
        e.a(xVar, b9, v9, map, i, i6, i9, str, i10, i11, elapsedRealtime, str2, i12, this.f11975z);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        CookieSyncManager.getInstance().stopSync();
        WebView webView = this.f11962m;
        if (webView != null) {
            webView.setWebChromeClient(null);
            com.anythink.core.basead.ui.a.a.a(this.f11962m, isFinishing());
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        CookieSyncManager.getInstance().startSync();
        WebView webView = this.f11962m;
        if (webView != null) {
            webView.setWebChromeClient(new WebChromeClient() { // from class: com.anythink.core.basead.ui.web.WebLandPageActivity.8
                @Override // android.webkit.WebChromeClient
                public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                    com.anythink.core.basead.ui.a.a.a(WebLandPageActivity.this, str, callback);
                    super.onGeolocationPermissionsShowPrompt(str, callback);
                }

                @Override // android.webkit.WebChromeClient
                public final void onProgressChanged(WebView webView2, int i) {
                    if (WebLandPageActivity.this.f11961l != null) {
                        if (!WebLandPageActivity.this.f11966q.isRunning()) {
                            WebLandPageActivity.this.f11961l.setProgress(((i * 30) / 100) + 70);
                        }
                        if (i == 100) {
                            if (WebLandPageActivity.this.f11966q.isRunning()) {
                                WebLandPageActivity.this.f11966q.cancel();
                                WebLandPageActivity.this.f11961l.setProgress(100);
                            }
                            t.b().a(new Runnable() { // from class: com.anythink.core.basead.ui.web.WebLandPageActivity.8.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    WebLandPageActivity.this.f11961l.setVisibility(8);
                                }
                            }, 200L);
                        }
                    }
                }

                @Override // android.webkit.WebChromeClient
                public final void onReceivedTitle(WebView webView2, String str) {
                    super.onReceivedTitle(webView2, str);
                    if (TextUtils.isEmpty(str) || WebLandPageActivity.this.f11965p == null || WebLandPageActivity.this.f11965p.getText().toString().length() != 0) {
                        return;
                    }
                    WebLandPageActivity.this.f11965p.setText(str);
                }

                @Override // android.webkit.WebChromeClient
                public final boolean onShowFileChooser(WebView webView2, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                    try {
                        WebLandPageActivity.this.f11950H = valueCallback;
                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                        intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*", "audio/*"});
                        intent.addCategory("android.intent.category.OPENABLE");
                        intent.setType("image/* video/* audio/*");
                        WebLandPageActivity.this.startActivityForResult(Intent.createChooser(intent, "File Chooser"), 512);
                        return true;
                    } catch (Throwable unused) {
                        return false;
                    }
                }
            });
            this.f11962m.onResume();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.anythink.core.basead.ui.web.b
    public void onWebFinish() {
        e();
    }

    @Override // com.anythink.core.basead.ui.web.b
    public void onWebPageFinish(WebView webView, String str) {
        WebView webView2;
        WebLoadFailRefrshView webLoadFailRefrshView = this.f11973x;
        if (webLoadFailRefrshView != null && webLoadFailRefrshView.getParent() == null && (webView2 = this.f11962m) != null) {
            webView2.setVisibility(0);
        }
        webView.canGoBack();
        webView.canGoForward();
        if (!TextUtils.isEmpty(str) && this.f11972w != 3 && TextUtils.equals(this.f11971v, str) && !isFinishing()) {
            this.f11972w = 2;
            JSONArray jSONArray = this.f11970u.get(str);
            if (jSONArray != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(System.currentTimeMillis());
                    jSONArray.put(1, sb.toString());
                    this.f11970u.put(str, jSONArray);
                } catch (JSONException unused) {
                }
            }
        }
        c cVar = this.f11948F;
        if (cVar != null) {
            cVar.a(webView, str);
        }
    }

    @Override // com.anythink.core.basead.ui.web.b
    public void onWebPageLoadError(WebView webView, String str) {
        if (TextUtils.equals(this.f11971v, str)) {
            this.f11972w = 3;
        }
        WebLoadFailRefrshView webLoadFailRefrshView = this.f11973x;
        if (webLoadFailRefrshView != null) {
            am.a(webLoadFailRefrshView);
        } else {
            WebLoadFailRefrshView webLoadFailRefrshView2 = new WebLoadFailRefrshView(this);
            this.f11973x = webLoadFailRefrshView2;
            WebView webView2 = this.f11962m;
            if (webView2 != null) {
                webLoadFailRefrshView2.setLayoutParams(webView2.getLayoutParams());
            }
            this.f11973x.setOnRefreshListener(new View.OnClickListener() { // from class: com.anythink.core.basead.ui.web.WebLandPageActivity.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    am.a(WebLandPageActivity.this.f11973x);
                    if (WebLandPageActivity.this.f11962m != null) {
                        WebLandPageActivity.this.f11962m.reload();
                    }
                }
            });
        }
        WebView webView3 = this.f11962m;
        if (webView3 != null) {
            webView3.setVisibility(8);
        }
        this.f11974y.addView(this.f11973x);
    }

    @Override // com.anythink.core.basead.ui.web.b
    public void onWebPageStart(WebView webView, String str) {
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.equals(this.f11971v, str)) {
                this.f11972w = 1;
            }
            JSONArray jSONArray = this.f11970u.get(str);
            if (jSONArray != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(System.currentTimeMillis());
                    jSONArray.put(0, sb.toString());
                    jSONArray.put(1, "");
                    this.f11970u.put(str, jSONArray);
                } catch (JSONException unused) {
                }
            }
        }
        WebLoadFailRefrshView webLoadFailRefrshView = this.f11973x;
        if (webLoadFailRefrshView != null) {
            am.a(webLoadFailRefrshView);
        }
    }

    @Override // com.anythink.core.basead.ui.web.b
    public void recordRedirectUrl(String str) {
        if (this.f11953b == null) {
            this.f11953b = new JSONArray();
        }
        this.f11953b.put(str);
        if (this.f11970u.size() > 0) {
            JSONArray jSONArray = this.f11970u.get(this.f11971v);
            try {
                if (this.f11972w == 0 && jSONArray != null) {
                    if (TextUtils.isEmpty(jSONArray.getString(1))) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(System.currentTimeMillis());
                        jSONArray.put(1, sb.toString());
                    }
                    this.f11970u.put(this.f11971v, jSONArray);
                }
            } catch (Throwable unused) {
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(System.currentTimeMillis());
        jSONArray2.put(sb2.toString());
        jSONArray2.put("");
        this.f11970u.put(str, jSONArray2);
        this.f11971v = str;
        this.f11972w = 0;
    }

    @Override // com.anythink.core.basead.ui.web.b
    public boolean supportDeeplinkJump() {
        return this.f11943A;
    }

    private void d() {
        this.f11963n.setOnClickListener(new AnonymousClass6());
        this.f11964o.setOnClickListener(new AnonymousClass7());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            ((ViewGroup) getWindow().getDecorView()).removeAllViews();
        } catch (Throwable unused) {
        }
        super.finish();
    }

    private RelativeLayout f() {
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setBackgroundColor(-1);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setId(f11942g);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, q.a((Context) this, 55.0f));
        layoutParams.addRule(10);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
        int a9 = q.a((Context) this, 16.0f);
        linearLayout.setPadding(a9, 0, a9, 0);
        relativeLayout.addView(linearLayout);
        this.f11963n = a(getResources().getDrawable(q.a(this, "browser_left_icon", k.f19632c)));
        this.f11964o = a(getResources().getDrawable(q.a(this, "browser_close_icon", k.f19632c)));
        linearLayout.addView(this.f11963n);
        linearLayout.addView(this.f11964o);
        TextView textView = new TextView(this);
        new LinearLayout.LayoutParams(0, -2, 1.0f);
        textView.setPadding(q.a((Context) this, 20.0f), 0, 0, q.a((Context) this, 2.0f));
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(Color.parseColor("#666666"));
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.f11965p = textView;
        linearLayout.addView(textView);
        try {
            this.f11962m = new BaseWebView(getApplicationContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(3, f11942g);
            this.f11962m.setLayoutParams(layoutParams2);
            relativeLayout.addView(this.f11962m);
            View view = new View(this);
            view.setBackgroundColor(-2434342);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, q.a((Context) this, 1.0f));
            layoutParams3.addRule(3, f11942g);
            view.setLayoutParams(layoutParams3);
            relativeLayout.addView(view);
            WebProgressBarView webProgressBarView = new WebProgressBarView(this);
            this.f11961l = webProgressBarView;
            webProgressBarView.setProgress(0);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, q.a((Context) this, 4.0f));
            layoutParams4.addRule(3, f11942g);
            relativeLayout.addView(this.f11961l, layoutParams4);
            Random random = new Random();
            this.f11967r = random;
            this.f11968s = random.nextInt(12) + 3;
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 70);
            this.f11966q = ofInt;
            ofInt.setDuration(1000L);
            this.f11966q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.anythink.core.basead.ui.web.WebLandPageActivity.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (WebLandPageActivity.this.f11961l == null || intValue % WebLandPageActivity.this.f11968s != 0) {
                        return;
                    }
                    WebLandPageActivity webLandPageActivity = WebLandPageActivity.this;
                    webLandPageActivity.f11968s = webLandPageActivity.f11967r.nextInt(12) + 3;
                    WebLandPageActivity.this.f11961l.setProgress(intValue);
                }
            });
            this.f11966q.start();
            return relativeLayout;
        } catch (Throwable unused) {
            return null;
        }
    }

    private boolean h() {
        return System.currentTimeMillis() - this.f11956e > 2500;
    }

    private void b(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.anythink.core.common.v.y.a(str);
        this.f11952a = i;
    }

    public static void a(Context context, com.anythink.core.basead.b.c cVar) {
        Intent intent = new Intent();
        intent.setClass(context, WebLandPageActivity.class);
        intent.putExtra(a.C0072a.f11868c, cVar.f11919c);
        intent.putExtra(a.C0072a.f11870e, cVar.f11924h);
        intent.putExtra(a.C0072a.i, cVar.f11922f);
        intent.putExtra(a.C0072a.f11880p, cVar.i);
        intent.putExtra(a.C0072a.f11881q, cVar.f11926k);
        IOfferClickHandler iOfferClickHandler = cVar.f11923g;
        if (iOfferClickHandler != null) {
            intent.putExtra(a.C0072a.f11875k, iOfferClickHandler);
        }
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public static /* synthetic */ void b(WebLandPageActivity webLandPageActivity, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.anythink.core.common.v.y.a(str);
        webLandPageActivity.f11952a = i;
    }

    public static /* synthetic */ boolean g(WebLandPageActivity webLandPageActivity) {
        return System.currentTimeMillis() - webLandPageActivity.f11956e > 2500;
    }

    public static void a(Context context, String str) {
        com.anythink.core.basead.b.c cVar = new com.anythink.core.basead.b.c();
        cVar.f11922f = str;
        a(context, cVar);
    }

    private void a() {
        Intent intent = getIntent();
        if (intent != null) {
            try {
                Serializable serializableExtra = intent.getSerializableExtra(a.C0072a.f11868c);
                if (serializableExtra != null && (serializableExtra instanceof w)) {
                    w wVar = (w) serializableExtra;
                    this.f11944B = wVar;
                    this.f11948F = new c(wVar);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                Serializable serializableExtra2 = intent.getSerializableExtra(a.C0072a.f11870e);
                if (serializableExtra2 != null && (serializableExtra2 instanceof x)) {
                    this.f11945C = (x) serializableExtra2;
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            try {
                Serializable serializableExtra3 = intent.getSerializableExtra(a.C0072a.f11875k);
                if (serializableExtra3 != null && (serializableExtra3 instanceof IOfferClickHandler)) {
                    this.f11947E = (IOfferClickHandler) serializableExtra3;
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
            try {
                this.f11946D = intent.getStringExtra(a.C0072a.i);
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
            try {
                this.f11949G = intent.getIntExtra(a.C0072a.f11880p, -1);
            } catch (Throwable th5) {
                th5.printStackTrace();
            }
            this.f11943A = true;
            try {
                this.f11943A = intent.getBooleanExtra(a.C0072a.f11881q, true);
            } catch (Throwable th6) {
                th6.printStackTrace();
            }
        }
    }

    private void a(String str) {
        com.anythink.core.basead.ui.a.a.a(this.f11962m, this, this);
        this.f11962m.setDownloadListener(new AnonymousClass3());
        cc a9 = com.anythink.core.basead.a.e.a(str);
        this.f11952a = a9.f13905l;
        this.f11962m.loadUrl(a9.f13908o);
        recordRedirectUrl(this.f11962m.getUrl());
    }

    private void a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this, q.a(this, "system_dialog", k.f19634e));
        builder.setMessage(getString(q.a(this, "web_download_file_confirm_title", k.f19636g))).setCancelable(true).setPositiveButton(getString(q.a(this, "web_download_file_confirm", k.f19636g)), new AnonymousClass5(i, str)).setNegativeButton(getString(q.a(this, "web_download_file_cancel", k.f19636g)), new AnonymousClass4(str));
        builder.create().show();
    }

    private ImageView a(Drawable drawable) {
        ImageView imageView = new ImageView(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(q.a((Context) this, 48.0f), q.a((Context) this, 48.0f));
        layoutParams.gravity = 16;
        layoutParams.rightMargin = q.a((Context) this, 6.0f);
        imageView.setLayoutParams(layoutParams);
        int a9 = q.a((Context) this, 16.0f);
        imageView.setPadding(a9, a9, a9, a9);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(drawable);
        return imageView;
    }

    public static /* synthetic */ void a(WebLandPageActivity webLandPageActivity, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(webLandPageActivity, q.a(webLandPageActivity, "system_dialog", k.f19634e));
        builder.setMessage(webLandPageActivity.getString(q.a(webLandPageActivity, "web_download_file_confirm_title", k.f19636g))).setCancelable(true).setPositiveButton(webLandPageActivity.getString(q.a(webLandPageActivity, "web_download_file_confirm", k.f19636g)), webLandPageActivity.new AnonymousClass5(i, str)).setNegativeButton(webLandPageActivity.getString(q.a(webLandPageActivity, "web_download_file_cancel", k.f19636g)), webLandPageActivity.new AnonymousClass4(str));
        builder.create().show();
    }
}
