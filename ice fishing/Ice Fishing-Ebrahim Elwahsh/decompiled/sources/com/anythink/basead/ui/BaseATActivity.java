package com.anythink.basead.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.anythink.basead.b.c.d;
import com.anythink.basead.d.f;
import com.anythink.basead.d.g;
import com.anythink.basead.g.b;
import com.anythink.basead.g.i;
import com.anythink.basead.g.j;
import com.anythink.basead.mixad.c.a.a;
import com.anythink.basead.ui.h5template.WTWebViewBaseScreenATView;
import com.anythink.core.api.ATNativeAdInfo;
import com.anythink.core.api.ATSDKGlobalSetting;
import com.anythink.core.api.BaseAd;
import com.anythink.core.basead.a;
import com.anythink.core.common.a.o;
import com.anythink.core.common.b;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.bf;
import com.anythink.core.common.h.r;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.l.e.a.a;
import com.anythink.core.common.l.e.a.e;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class BaseATActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9861a = "BaseATActivity";

    /* renamed from: A, reason: collision with root package name */
    private boolean f9862A;

    /* renamed from: b, reason: collision with root package name */
    boolean f9863b;

    /* renamed from: c, reason: collision with root package name */
    bf f9864c;

    /* renamed from: j, reason: collision with root package name */
    i f9870j;

    /* renamed from: l, reason: collision with root package name */
    long f9872l;

    /* renamed from: m, reason: collision with root package name */
    long f9873m;

    /* renamed from: n, reason: collision with root package name */
    long f9874n;

    /* renamed from: o, reason: collision with root package name */
    private BaseScreenATView f9875o;

    /* renamed from: p, reason: collision with root package name */
    private x f9876p;

    /* renamed from: q, reason: collision with root package name */
    private w f9877q;

    /* renamed from: r, reason: collision with root package name */
    private String f9878r;

    /* renamed from: s, reason: collision with root package name */
    private b.AbstractC0041b f9879s;

    /* renamed from: t, reason: collision with root package name */
    private String f9880t;

    /* renamed from: u, reason: collision with root package name */
    private int f9881u;

    /* renamed from: v, reason: collision with root package name */
    private int f9882v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f9883w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f9884x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f9885y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f9886z;

    /* renamed from: d, reason: collision with root package name */
    long f9865d = 0;

    /* renamed from: e, reason: collision with root package name */
    long f9866e = 0;

    /* renamed from: f, reason: collision with root package name */
    float f9867f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    boolean f9868g = false;

    /* renamed from: h, reason: collision with root package name */
    boolean f9869h = false;
    b.a i = new b.a() { // from class: com.anythink.basead.ui.BaseATActivity.1
        @Override // com.anythink.core.common.b.a
        public final void a(Object obj) {
            if (!(obj instanceof bf) || BaseATActivity.this.f9877q == null) {
                return;
            }
            bf bfVar = (bf) obj;
            if (bfVar.a().I().equals(BaseATActivity.this.f9877q.I())) {
                BaseATActivity baseATActivity = BaseATActivity.this;
                if (baseATActivity.f9863b) {
                    bfVar.a(baseATActivity);
                } else {
                    baseATActivity.f9864c = bfVar;
                }
            }
        }
    };

    /* renamed from: k, reason: collision with root package name */
    boolean f9871k = false;

    private void d() {
        try {
            if (!this.f9871k) {
                w wVar = this.f9877q;
                if (wVar == null || wVar.r() == null || this.f9877q.r().bP() != 1) {
                    return;
                }
            } else if (!ATSDKGlobalSetting.isHideNavAndStatusBar) {
                return;
            }
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.systemUiVisibility = 2050;
            window.setAttributes(attributes);
            window.addFlags(1024);
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i4, Intent intent) {
        BaseScreenATView baseScreenATView = this.f9875o;
        if (baseScreenATView != null) {
            baseScreenATView.onActivityResult(i, i4, intent);
        }
        super.onActivityResult(i, i4, intent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (t.b().g() == null) {
            t.b().a(getApplicationContext());
        }
        a(bundle);
        d();
        try {
            a.InterfaceC0082a b9 = com.anythink.basead.mixad.a.a().b(this.f9878r);
            if (b9 != null) {
                b9.a(this);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.f9864c = null;
        this.f9870j = null;
        com.anythink.core.common.b.a().b("1", this.i);
        BaseScreenATView baseScreenATView = this.f9875o;
        if (baseScreenATView != null) {
            baseScreenATView.removeAllViews();
            this.f9875o.F();
            this.f9875o = null;
        }
        w wVar = this.f9877q;
        if (wVar != null && wVar.L() && !this.f9877q.c()) {
            o.a().b();
        }
        if (this.f9876p != null) {
            com.anythink.core.common.u.a.a().a(this.f9876p.f14315d + this.f9876p.f14314c);
        }
        if (!TextUtils.isEmpty(this.f9878r)) {
            com.anythink.basead.g.b.a().b(this.f9878r);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (4 == i) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        long j9 = this.f9874n + 1;
        this.f9874n = j9;
        if (j9 <= 5) {
            StringBuilder sb = new StringBuilder("3-");
            i iVar = this.f9870j;
            sb.append(iVar != null ? iVar.i() : "0");
            a(sb.toString(), SystemClock.elapsedRealtime() - this.f9872l);
        }
        this.f9863b = false;
        BaseScreenATView baseScreenATView = this.f9875o;
        if (baseScreenATView != null) {
            baseScreenATView.D();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                super.onResume();
            } catch (Throwable unused) {
                c();
            }
        } else {
            super.onResume();
        }
        d();
        this.f9872l = SystemClock.elapsedRealtime();
        long j9 = this.f9873m + 1;
        this.f9873m = j9;
        if (j9 <= 5) {
            StringBuilder sb = new StringBuilder("2-");
            i iVar = this.f9870j;
            sb.append(iVar != null ? iVar.i() : "0");
            a(sb.toString(), 0L);
        }
        this.f9863b = true;
        BaseScreenATView baseScreenATView = this.f9875o;
        if (baseScreenATView != null) {
            baseScreenATView.A();
        }
        bf bfVar = this.f9864c;
        if (bfVar != null) {
            bfVar.a(this);
            this.f9864c = null;
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        BaseScreenATView baseScreenATView = this.f9875o;
        if (baseScreenATView != null) {
            if (baseScreenATView.isShowEndCard()) {
                bundle.putBoolean(a.C0071a.f12028f, true);
            }
            bundle.putBoolean(a.C0071a.f12029g, this.f9875o.isVideoMute());
            bundle.putBoolean(a.C0071a.f12031j, this.f9875o.hasReward());
            bundle.putLong(a.C0071a.f12033l, this.f9875o.getShowBannerTime());
            bundle.putLong(a.C0071a.f12034m, this.f9875o.getHideBannerTime());
            bundle.putFloat(a.C0071a.f12035n, this.f9875o.getCloseButtonScaleFactor());
            bundle.putBoolean(a.C0071a.f12030h, this.f9875o.getHasPerformClick());
            bundle.putBoolean(a.C0071a.f12036o, this.f9875o.isShowingEndCardAfterVideoPlay());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        if (z8) {
            d();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (Build.VERSION.SDK_INT == 26) {
            super.setTheme(q.a(this, "myoffer_half_screen_fit_by_o", k.f19792e));
        } else {
            super.setTheme(i);
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseATActivity$2, reason: invalid class name */
    public class AnonymousClass2 extends i {

        /* renamed from: a, reason: collision with root package name */
        String f9888a = "1";

        public AnonymousClass2() {
        }

        @Override // com.anythink.basead.g.b.AbstractC0041b
        public final void a(j jVar) {
            if (BaseATActivity.this.f9879s != null) {
                BaseATActivity.this.f9879s.a(jVar);
            }
        }

        @Override // com.anythink.basead.g.b.AbstractC0041b
        public final void b() {
            if (BaseATActivity.this.f9879s != null) {
                BaseATActivity.this.f9879s.b();
            }
        }

        @Override // com.anythink.basead.g.b.AbstractC0041b
        public final void c() {
            if (BaseATActivity.this.f9879s != null) {
                BaseATActivity.this.f9879s.c();
            }
        }

        @Override // com.anythink.basead.g.b.AbstractC0041b
        public final void d() {
            if (BaseATActivity.this.f9879s != null) {
                BaseATActivity.this.f9879s.a(e());
                BaseATActivity.this.f9879s.d();
            }
            BaseATActivity.this.c();
        }

        @Override // com.anythink.basead.g.i
        public final void f() {
            this.f9888a = "1";
            BaseATActivity.this.a("4", 0L);
        }

        @Override // com.anythink.basead.g.i
        public final void g() {
            if (TextUtils.equals(this.f9888a, "1")) {
                this.f9888a = "2";
            }
            BaseATActivity baseATActivity = BaseATActivity.this;
            baseATActivity.a("5-".concat(baseATActivity.f9873m - baseATActivity.f9874n <= 0 ? "2" : "1"), 0L);
        }

        @Override // com.anythink.basead.g.i
        public final void h() {
            if (TextUtils.equals(this.f9888a, "1")) {
                this.f9888a = "3";
                BaseATActivity baseATActivity = BaseATActivity.this;
                baseATActivity.a("6-".concat(baseATActivity.f9873m - baseATActivity.f9874n <= 0 ? "2" : "1"), 0L);
            }
        }

        @Override // com.anythink.basead.g.i
        public final String i() {
            return this.f9888a;
        }

        @Override // com.anythink.basead.g.b.AbstractC0041b
        public final void a(f fVar) {
            if (BaseATActivity.this.f9879s != null) {
                BaseATActivity.this.f9879s.a(fVar);
            }
        }

        @Override // com.anythink.basead.g.b.AbstractC0041b
        public final void b(j jVar) {
            if (BaseATActivity.this.f9879s != null) {
                BaseATActivity.this.f9879s.b(jVar);
            }
        }

        @Override // com.anythink.basead.g.b.AbstractC0041b
        public final void a() {
            if (BaseATActivity.this.f9879s != null) {
                BaseATActivity.this.f9879s.a();
            }
        }

        @Override // com.anythink.basead.g.b.AbstractC0041b
        public final void a(boolean z8) {
            if (BaseATActivity.this.f9879s != null) {
                BaseATActivity.this.f9879s.a(z8);
            }
        }
    }

    private void b() {
        a.InterfaceC0082a b9 = com.anythink.basead.mixad.a.a().b(this.f9878r);
        if (b9 != null) {
            b9.a(this);
        }
    }

    private void c(Bundle bundle) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        this.f9870j = anonymousClass2;
        this.f9875o.setListener(anonymousClass2);
        if (bundle != null) {
            this.f9883w = bundle.getBoolean(a.C0071a.f12028f);
            this.f9884x = bundle.getBoolean(a.C0071a.f12029g);
            this.f9885y = bundle.getBoolean(a.C0071a.f12031j);
            this.f9865d = bundle.getLong(a.C0071a.f12033l);
            this.f9866e = bundle.getLong(a.C0071a.f12034m);
            this.f9867f = bundle.getFloat(a.C0071a.f12035n);
            this.f9868g = bundle.getBoolean(a.C0071a.f12030h, false);
            this.f9869h = bundle.getBoolean(a.C0071a.f12036o, false);
        }
        this.f9875o.setIsShowEndCard(this.f9883w);
        this.f9875o.setHasReward(this.f9885y);
        if (bundle != null) {
            this.f9875o.setVideoMute(this.f9884x);
            this.f9875o.setShowBannerTime(this.f9865d);
            this.f9875o.setHideBannerTime(this.f9866e);
            this.f9875o.setCloseButtonScaleFactor(this.f9867f);
            this.f9875o.setHasPerformClick(this.f9868g);
            this.f9875o.setShowingEndCardAfterVideoPlay(this.f9869h);
        }
        try {
            this.f9875o.init();
        } catch (Throwable th) {
            th.printStackTrace();
            try {
                b.AbstractC0041b abstractC0041b = this.f9879s;
                if (abstractC0041b != null) {
                    abstractC0041b.a(g.a(g.f6336k, q.a(th.getStackTrace())));
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            c();
        }
    }

    public static void a(Activity activity, com.anythink.core.basead.b.c cVar) {
        Intent intent = new Intent();
        Context g9 = t.b().g();
        if (activity == null || activity.isFinishing()) {
            Log.i("anythink_BaseATActivity", "Activity is null");
        } else {
            g9 = activity;
        }
        boolean a9 = a(cVar.f12074a, cVar.f12081h);
        if (cVar.f12078e == 2) {
            if (!a9 && !cVar.f12082j) {
                intent.setClass(g9, ATLandscapeActivity.class);
            } else {
                intent.setClass(g9, ATLandscapeTranslucentActivity.class);
            }
        } else if (!a9 && !cVar.f12082j) {
            intent.setClass(g9, ATPortraitActivity.class);
        } else {
            intent.setClass(g9, ATPortraitTranslucentActivity.class);
        }
        intent.putExtra(a.C0071a.f12026d, cVar.f12077d);
        com.anythink.basead.ui.e.a.a().a(cVar.f12077d, cVar);
        if (!(g9 instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            g9.startActivity(intent);
            if (activity == null || activity.isFinishing()) {
                return;
            }
            activity.overridePendingTransition(0, 0);
        } catch (Throwable th) {
            b.AbstractC0041b a10 = com.anythink.basead.g.b.a().a(cVar.f12077d);
            if (a10 != null) {
                a10.a(g.a(g.f6328b, th.getMessage()));
            }
        }
    }

    private void b(Bundle bundle) {
        if (bundle != null) {
            this.f9883w = bundle.getBoolean(a.C0071a.f12028f);
            this.f9884x = bundle.getBoolean(a.C0071a.f12029g);
            this.f9885y = bundle.getBoolean(a.C0071a.f12031j);
            this.f9865d = bundle.getLong(a.C0071a.f12033l);
            this.f9866e = bundle.getLong(a.C0071a.f12034m);
            this.f9867f = bundle.getFloat(a.C0071a.f12035n);
            this.f9868g = bundle.getBoolean(a.C0071a.f12030h, false);
            this.f9869h = bundle.getBoolean(a.C0071a.f12036o, false);
        }
    }

    private void a() {
        Intent intent = getIntent();
        try {
            if (intent != null) {
                this.f9878r = intent.getStringExtra(a.C0071a.f12026d);
                com.anythink.core.basead.b.c a9 = com.anythink.basead.ui.e.a.a().a(this.f9878r);
                if (a9 != null) {
                    this.f9880t = a9.f12075b;
                    this.f9881u = a9.f12074a;
                    this.f9877q = a9.f12076c;
                    this.f9876p = a9.f12081h;
                }
                this.f9886z = a(this.f9881u, this.f9876p);
                return;
            }
            Log.e("anythink", f9861a + " Intent is null.");
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            finish();
            overridePendingTransition(0, 0);
        } catch (Throwable unused) {
        }
    }

    private static boolean a(int i, x xVar) {
        y yVar;
        if (xVar == null || (yVar = xVar.f14325o) == null || i != 3) {
            return false;
        }
        return TextUtils.equals("2", yVar.Q());
    }

    private BaseScreenATView a(com.anythink.basead.mixad.c.a.a aVar, BaseAd baseAd) {
        int i = this.f9881u;
        if (i != 1) {
            if (i == 3) {
                if (baseAd != null) {
                    boolean z8 = this.f9886z;
                    if (aVar != null) {
                        Object a9 = new com.anythink.basead.mixad.c.b(new a.C0042a().a(aVar).a(this).a(z8).a(this.f9880t).a(this.f9882v).a()).a();
                        if (a9 instanceof BaseScreenATView) {
                            this.f9862A = a9 instanceof e;
                            return (BaseScreenATView) a9;
                        }
                    }
                    return null;
                }
                if (this.f9877q.ao() == 3) {
                    if (d.b(this.f9877q)) {
                        return new WTWebViewBaseScreenATView(this, this.f9876p, this.f9877q, this.f9880t, this.f9881u, this.f9882v);
                    }
                    if (this.f9877q.r().bF() != 1) {
                        b.AbstractC0041b abstractC0041b = this.f9879s;
                        if (abstractC0041b != null) {
                            abstractC0041b.a(g.a(g.f6345t, g.ad));
                        }
                        c();
                        return null;
                    }
                }
                if (this.f9886z) {
                    if (this.f9876p.f14325o.at() == 1 && this.f9882v == 1) {
                        return new LetterHalfScreenATView(this, this.f9876p, this.f9877q, this.f9880t, this.f9881u, this.f9882v);
                    }
                    return new HalfScreenATView(this, this.f9876p, this.f9877q, this.f9880t, this.f9881u, this.f9882v);
                }
                if (this.f9876p.f14325o.at() == 1 && this.f9882v == 1) {
                    return new LetterFullScreenATView(this, this.f9876p, this.f9877q, this.f9880t, this.f9881u, this.f9882v);
                }
                return new FullScreenATView(this, this.f9876p, this.f9877q, this.f9880t, this.f9881u, this.f9882v);
            }
        } else if (this.f9877q.ao() == 3) {
            if (d.b(this.f9877q)) {
                return new WTWebViewBaseScreenATView(this, this.f9876p, this.f9877q, this.f9880t, this.f9881u, this.f9882v);
            }
            if (this.f9877q.r().bF() != 1) {
                b.AbstractC0041b abstractC0041b2 = this.f9879s;
                if (abstractC0041b2 != null) {
                    abstractC0041b2.a(g.a(g.f6345t, g.ad));
                }
                c();
                return null;
            }
        }
        return new FullScreenATView(this, this.f9876p, this.f9877q, this.f9880t, this.f9881u, this.f9882v);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(Bundle bundle) {
        BaseAd baseAd;
        BaseScreenATView a9;
        if (this instanceof ATLandscapeActivity) {
            this.f9882v = 2;
        } else {
            this.f9882v = 1;
        }
        Intent intent = getIntent();
        try {
            if (intent != null) {
                this.f9878r = intent.getStringExtra(a.C0071a.f12026d);
                com.anythink.core.basead.b.c a10 = com.anythink.basead.ui.e.a.a().a(this.f9878r);
                if (a10 != null) {
                    this.f9880t = a10.f12075b;
                    this.f9881u = a10.f12074a;
                    this.f9877q = a10.f12076c;
                    this.f9876p = a10.f12081h;
                }
                this.f9886z = a(this.f9881u, this.f9876p);
            } else {
                Log.e("anythink", f9861a + " Intent is null.");
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        this.f9879s = com.anythink.basead.g.b.a().a(this.f9878r);
        a("1", 0L);
        x xVar = this.f9876p;
        if (xVar != null && xVar.f14325o != null) {
            if (this.f9877q != null) {
                com.anythink.core.common.b.a().a("1", this.i);
                com.anythink.basead.mixad.c.a.a a11 = com.anythink.basead.mixad.a.a().a(this.f9878r);
                if (a11 != null && a11.a() != null) {
                    ATNativeAdInfo a12 = a11.a();
                    if (a12 instanceof com.anythink.core.common.l.e.a.g) {
                        baseAd = ((com.anythink.core.common.l.e.a.g) a12).a();
                        this.f9871k = true;
                        a9 = a(a11, baseAd);
                        this.f9875o = a9;
                        if (a9 != null) {
                            return;
                        }
                        if (!this.f9862A && !this.f9886z) {
                            ViewGroup customAdContainer = baseAd != null ? baseAd.getCustomAdContainer() : null;
                            if (customAdContainer != null) {
                                customAdContainer.addView(this.f9875o);
                                am.a(customAdContainer);
                                setContentView(customAdContainer);
                                this.f9875o.handleFullScreenClick();
                            } else {
                                setContentView(this.f9875o);
                            }
                        } else {
                            setContentView(a9);
                        }
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
                        this.f9870j = anonymousClass2;
                        this.f9875o.setListener(anonymousClass2);
                        if (bundle != null) {
                            this.f9883w = bundle.getBoolean(a.C0071a.f12028f);
                            this.f9884x = bundle.getBoolean(a.C0071a.f12029g);
                            this.f9885y = bundle.getBoolean(a.C0071a.f12031j);
                            this.f9865d = bundle.getLong(a.C0071a.f12033l);
                            this.f9866e = bundle.getLong(a.C0071a.f12034m);
                            this.f9867f = bundle.getFloat(a.C0071a.f12035n);
                            this.f9868g = bundle.getBoolean(a.C0071a.f12030h, false);
                            this.f9869h = bundle.getBoolean(a.C0071a.f12036o, false);
                        }
                        this.f9875o.setIsShowEndCard(this.f9883w);
                        this.f9875o.setHasReward(this.f9885y);
                        if (bundle != null) {
                            this.f9875o.setVideoMute(this.f9884x);
                            this.f9875o.setShowBannerTime(this.f9865d);
                            this.f9875o.setHideBannerTime(this.f9866e);
                            this.f9875o.setCloseButtonScaleFactor(this.f9867f);
                            this.f9875o.setHasPerformClick(this.f9868g);
                            this.f9875o.setShowingEndCardAfterVideoPlay(this.f9869h);
                        }
                        try {
                            this.f9875o.init();
                            return;
                        } catch (Throwable th) {
                            th.printStackTrace();
                            try {
                                b.AbstractC0041b abstractC0041b = this.f9879s;
                                if (abstractC0041b != null) {
                                    abstractC0041b.a(g.a(g.f6336k, q.a(th.getStackTrace())));
                                }
                            } catch (Throwable th2) {
                                th2.printStackTrace();
                            }
                            c();
                            return;
                        }
                    }
                }
                baseAd = null;
                a9 = a(a11, baseAd);
                this.f9875o = a9;
                if (a9 != null) {
                }
            } else {
                StringBuilder sb = new StringBuilder();
                String str = f9861a;
                sb.append(str);
                sb.append(" onCreate: OfferAd = null");
                Log.e("anythink", sb.toString());
                try {
                    b.AbstractC0041b abstractC0041b2 = this.f9879s;
                    if (abstractC0041b2 != null) {
                        abstractC0041b2.a(g.a(g.f6336k, str + " onCreate: OfferAd = null"));
                    }
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
                c();
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            String str2 = f9861a;
            sb2.append(str2);
            sb2.append("Start Screen Ad Error.");
            Log.e("anythink", sb2.toString());
            try {
                b.AbstractC0041b abstractC0041b3 = this.f9879s;
                if (abstractC0041b3 != null) {
                    abstractC0041b3.a(g.a(g.f6336k, str2 + "Start FullScreen Ad Error."));
                }
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, long j9) {
        String str2;
        String str3;
        w wVar = this.f9877q;
        if (wVar == null || wVar.b() == 10) {
            return;
        }
        try {
            x xVar = this.f9876p;
            String str4 = xVar != null ? xVar.f14314c : "";
            if (xVar == null) {
                str2 = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f9876p.f14320j);
                str2 = sb.toString();
            }
            if (this.f9876p != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f9876p.f14317f);
                str3 = sb2.toString();
            } else {
                str3 = "";
            }
            w wVar2 = this.f9877q;
            int b9 = wVar2 != null ? wVar2.b() : -1;
            w wVar3 = this.f9877q;
            String v6 = wVar3 != null ? wVar3.v() : "";
            w wVar4 = this.f9877q;
            com.anythink.core.common.u.e.a(str, xVar, str4, str2, str3, b9, 0, v6, wVar4 instanceof r ? ((r) wVar4).aD() : "", com.anythink.basead.b.e.a(this.f9877q, this.f9876p), j9);
        } catch (Throwable unused) {
        }
    }

    private BaseScreenATView a(com.anythink.basead.mixad.c.a.a aVar, boolean z8) {
        if (aVar == null) {
            return null;
        }
        Object a9 = new com.anythink.basead.mixad.c.b(new a.C0042a().a(aVar).a(this).a(z8).a(this.f9880t).a(this.f9882v).a()).a();
        if (!(a9 instanceof BaseScreenATView)) {
            return null;
        }
        this.f9862A = a9 instanceof e;
        return (BaseScreenATView) a9;
    }
}
