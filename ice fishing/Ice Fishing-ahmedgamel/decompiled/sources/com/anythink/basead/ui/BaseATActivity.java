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
    public static final String f10490a = "BaseATActivity";

    /* renamed from: A, reason: collision with root package name */
    private boolean f10491A;

    /* renamed from: b, reason: collision with root package name */
    boolean f10492b;

    /* renamed from: c, reason: collision with root package name */
    bf f10493c;

    /* renamed from: j, reason: collision with root package name */
    i f10499j;

    /* renamed from: l, reason: collision with root package name */
    long f10501l;

    /* renamed from: m, reason: collision with root package name */
    long f10502m;

    /* renamed from: n, reason: collision with root package name */
    long f10503n;

    /* renamed from: o, reason: collision with root package name */
    private BaseScreenATView f10504o;

    /* renamed from: p, reason: collision with root package name */
    private x f10505p;

    /* renamed from: q, reason: collision with root package name */
    private w f10506q;

    /* renamed from: r, reason: collision with root package name */
    private String f10507r;

    /* renamed from: s, reason: collision with root package name */
    private b.AbstractC0042b f10508s;

    /* renamed from: t, reason: collision with root package name */
    private String f10509t;

    /* renamed from: u, reason: collision with root package name */
    private int f10510u;

    /* renamed from: v, reason: collision with root package name */
    private int f10511v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f10512w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f10513x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f10514y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f10515z;

    /* renamed from: d, reason: collision with root package name */
    long f10494d = 0;

    /* renamed from: e, reason: collision with root package name */
    long f10495e = 0;

    /* renamed from: f, reason: collision with root package name */
    float f10496f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    boolean f10497g = false;

    /* renamed from: h, reason: collision with root package name */
    boolean f10498h = false;
    b.a i = new b.a() { // from class: com.anythink.basead.ui.BaseATActivity.1
        @Override // com.anythink.core.common.b.a
        public final void a(Object obj) {
            if (!(obj instanceof bf) || BaseATActivity.this.f10506q == null) {
                return;
            }
            bf bfVar = (bf) obj;
            if (bfVar.a().I().equals(BaseATActivity.this.f10506q.I())) {
                BaseATActivity baseATActivity = BaseATActivity.this;
                if (baseATActivity.f10492b) {
                    bfVar.a(baseATActivity);
                } else {
                    baseATActivity.f10493c = bfVar;
                }
            }
        }
    };

    /* renamed from: k, reason: collision with root package name */
    boolean f10500k = false;

    private void d() {
        try {
            if (!this.f10500k) {
                w wVar = this.f10506q;
                if (wVar == null || wVar.r() == null || this.f10506q.r().bP() != 1) {
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
        BaseScreenATView baseScreenATView = this.f10504o;
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
            a.InterfaceC0083a b9 = com.anythink.basead.mixad.a.a().b(this.f10507r);
            if (b9 != null) {
                b9.a(this);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.f10493c = null;
        this.f10499j = null;
        com.anythink.core.common.b.a().b("1", this.i);
        BaseScreenATView baseScreenATView = this.f10504o;
        if (baseScreenATView != null) {
            baseScreenATView.removeAllViews();
            this.f10504o.F();
            this.f10504o = null;
        }
        w wVar = this.f10506q;
        if (wVar != null && wVar.L() && !this.f10506q.c()) {
            o.a().b();
        }
        if (this.f10505p != null) {
            com.anythink.core.common.u.a.a().a(this.f10505p.f14944d + this.f10505p.f14943c);
        }
        if (!TextUtils.isEmpty(this.f10507r)) {
            com.anythink.basead.g.b.a().b(this.f10507r);
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
        long j6 = this.f10503n + 1;
        this.f10503n = j6;
        if (j6 <= 5) {
            StringBuilder sb = new StringBuilder("3-");
            i iVar = this.f10499j;
            sb.append(iVar != null ? iVar.i() : "0");
            a(sb.toString(), SystemClock.elapsedRealtime() - this.f10501l);
        }
        this.f10492b = false;
        BaseScreenATView baseScreenATView = this.f10504o;
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
        this.f10501l = SystemClock.elapsedRealtime();
        long j6 = this.f10502m + 1;
        this.f10502m = j6;
        if (j6 <= 5) {
            StringBuilder sb = new StringBuilder("2-");
            i iVar = this.f10499j;
            sb.append(iVar != null ? iVar.i() : "0");
            a(sb.toString(), 0L);
        }
        this.f10492b = true;
        BaseScreenATView baseScreenATView = this.f10504o;
        if (baseScreenATView != null) {
            baseScreenATView.A();
        }
        bf bfVar = this.f10493c;
        if (bfVar != null) {
            bfVar.a(this);
            this.f10493c = null;
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        BaseScreenATView baseScreenATView = this.f10504o;
        if (baseScreenATView != null) {
            if (baseScreenATView.isShowEndCard()) {
                bundle.putBoolean(a.C0072a.f12657f, true);
            }
            bundle.putBoolean(a.C0072a.f12658g, this.f10504o.isVideoMute());
            bundle.putBoolean(a.C0072a.f12660j, this.f10504o.hasReward());
            bundle.putLong(a.C0072a.f12662l, this.f10504o.getShowBannerTime());
            bundle.putLong(a.C0072a.f12663m, this.f10504o.getHideBannerTime());
            bundle.putFloat(a.C0072a.f12664n, this.f10504o.getCloseButtonScaleFactor());
            bundle.putBoolean(a.C0072a.f12659h, this.f10504o.getHasPerformClick());
            bundle.putBoolean(a.C0072a.f12665o, this.f10504o.isShowingEndCardAfterVideoPlay());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        if (z6) {
            d();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (Build.VERSION.SDK_INT == 26) {
            super.setTheme(q.a(this, "myoffer_half_screen_fit_by_o", k.f20421e));
        } else {
            super.setTheme(i);
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseATActivity$2, reason: invalid class name */
    public class AnonymousClass2 extends i {

        /* renamed from: a, reason: collision with root package name */
        String f10517a = "1";

        public AnonymousClass2() {
        }

        @Override // com.anythink.basead.g.b.AbstractC0042b
        public final void a(j jVar) {
            if (BaseATActivity.this.f10508s != null) {
                BaseATActivity.this.f10508s.a(jVar);
            }
        }

        @Override // com.anythink.basead.g.b.AbstractC0042b
        public final void b() {
            if (BaseATActivity.this.f10508s != null) {
                BaseATActivity.this.f10508s.b();
            }
        }

        @Override // com.anythink.basead.g.b.AbstractC0042b
        public final void c() {
            if (BaseATActivity.this.f10508s != null) {
                BaseATActivity.this.f10508s.c();
            }
        }

        @Override // com.anythink.basead.g.b.AbstractC0042b
        public final void d() {
            if (BaseATActivity.this.f10508s != null) {
                BaseATActivity.this.f10508s.a(e());
                BaseATActivity.this.f10508s.d();
            }
            BaseATActivity.this.c();
        }

        @Override // com.anythink.basead.g.i
        public final void f() {
            this.f10517a = "1";
            BaseATActivity.this.a("4", 0L);
        }

        @Override // com.anythink.basead.g.i
        public final void g() {
            if (TextUtils.equals(this.f10517a, "1")) {
                this.f10517a = "2";
            }
            BaseATActivity baseATActivity = BaseATActivity.this;
            baseATActivity.a("5-".concat(baseATActivity.f10502m - baseATActivity.f10503n <= 0 ? "2" : "1"), 0L);
        }

        @Override // com.anythink.basead.g.i
        public final void h() {
            if (TextUtils.equals(this.f10517a, "1")) {
                this.f10517a = "3";
                BaseATActivity baseATActivity = BaseATActivity.this;
                baseATActivity.a("6-".concat(baseATActivity.f10502m - baseATActivity.f10503n <= 0 ? "2" : "1"), 0L);
            }
        }

        @Override // com.anythink.basead.g.i
        public final String i() {
            return this.f10517a;
        }

        @Override // com.anythink.basead.g.b.AbstractC0042b
        public final void a(f fVar) {
            if (BaseATActivity.this.f10508s != null) {
                BaseATActivity.this.f10508s.a(fVar);
            }
        }

        @Override // com.anythink.basead.g.b.AbstractC0042b
        public final void b(j jVar) {
            if (BaseATActivity.this.f10508s != null) {
                BaseATActivity.this.f10508s.b(jVar);
            }
        }

        @Override // com.anythink.basead.g.b.AbstractC0042b
        public final void a() {
            if (BaseATActivity.this.f10508s != null) {
                BaseATActivity.this.f10508s.a();
            }
        }

        @Override // com.anythink.basead.g.b.AbstractC0042b
        public final void a(boolean z6) {
            if (BaseATActivity.this.f10508s != null) {
                BaseATActivity.this.f10508s.a(z6);
            }
        }
    }

    private void b() {
        a.InterfaceC0083a b9 = com.anythink.basead.mixad.a.a().b(this.f10507r);
        if (b9 != null) {
            b9.a(this);
        }
    }

    private void c(Bundle bundle) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        this.f10499j = anonymousClass2;
        this.f10504o.setListener(anonymousClass2);
        if (bundle != null) {
            this.f10512w = bundle.getBoolean(a.C0072a.f12657f);
            this.f10513x = bundle.getBoolean(a.C0072a.f12658g);
            this.f10514y = bundle.getBoolean(a.C0072a.f12660j);
            this.f10494d = bundle.getLong(a.C0072a.f12662l);
            this.f10495e = bundle.getLong(a.C0072a.f12663m);
            this.f10496f = bundle.getFloat(a.C0072a.f12664n);
            this.f10497g = bundle.getBoolean(a.C0072a.f12659h, false);
            this.f10498h = bundle.getBoolean(a.C0072a.f12665o, false);
        }
        this.f10504o.setIsShowEndCard(this.f10512w);
        this.f10504o.setHasReward(this.f10514y);
        if (bundle != null) {
            this.f10504o.setVideoMute(this.f10513x);
            this.f10504o.setShowBannerTime(this.f10494d);
            this.f10504o.setHideBannerTime(this.f10495e);
            this.f10504o.setCloseButtonScaleFactor(this.f10496f);
            this.f10504o.setHasPerformClick(this.f10497g);
            this.f10504o.setShowingEndCardAfterVideoPlay(this.f10498h);
        }
        try {
            this.f10504o.init();
        } catch (Throwable th) {
            th.printStackTrace();
            try {
                b.AbstractC0042b abstractC0042b = this.f10508s;
                if (abstractC0042b != null) {
                    abstractC0042b.a(g.a(g.f6965k, q.a(th.getStackTrace())));
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
        boolean a9 = a(cVar.f12703a, cVar.f12710h);
        if (cVar.f12707e == 2) {
            if (!a9 && !cVar.f12711j) {
                intent.setClass(g9, ATLandscapeActivity.class);
            } else {
                intent.setClass(g9, ATLandscapeTranslucentActivity.class);
            }
        } else if (!a9 && !cVar.f12711j) {
            intent.setClass(g9, ATPortraitActivity.class);
        } else {
            intent.setClass(g9, ATPortraitTranslucentActivity.class);
        }
        intent.putExtra(a.C0072a.f12655d, cVar.f12706d);
        com.anythink.basead.ui.e.a.a().a(cVar.f12706d, cVar);
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
            b.AbstractC0042b a10 = com.anythink.basead.g.b.a().a(cVar.f12706d);
            if (a10 != null) {
                a10.a(g.a(g.f6957b, th.getMessage()));
            }
        }
    }

    private void b(Bundle bundle) {
        if (bundle != null) {
            this.f10512w = bundle.getBoolean(a.C0072a.f12657f);
            this.f10513x = bundle.getBoolean(a.C0072a.f12658g);
            this.f10514y = bundle.getBoolean(a.C0072a.f12660j);
            this.f10494d = bundle.getLong(a.C0072a.f12662l);
            this.f10495e = bundle.getLong(a.C0072a.f12663m);
            this.f10496f = bundle.getFloat(a.C0072a.f12664n);
            this.f10497g = bundle.getBoolean(a.C0072a.f12659h, false);
            this.f10498h = bundle.getBoolean(a.C0072a.f12665o, false);
        }
    }

    private void a() {
        Intent intent = getIntent();
        try {
            if (intent != null) {
                this.f10507r = intent.getStringExtra(a.C0072a.f12655d);
                com.anythink.core.basead.b.c a9 = com.anythink.basead.ui.e.a.a().a(this.f10507r);
                if (a9 != null) {
                    this.f10509t = a9.f12704b;
                    this.f10510u = a9.f12703a;
                    this.f10506q = a9.f12705c;
                    this.f10505p = a9.f12710h;
                }
                this.f10515z = a(this.f10510u, this.f10505p);
                return;
            }
            Log.e("anythink", f10490a + " Intent is null.");
        } catch (Exception e9) {
            e9.printStackTrace();
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
        if (xVar == null || (yVar = xVar.f14954o) == null || i != 3) {
            return false;
        }
        return TextUtils.equals("2", yVar.Q());
    }

    private BaseScreenATView a(com.anythink.basead.mixad.c.a.a aVar, BaseAd baseAd) {
        int i = this.f10510u;
        if (i != 1) {
            if (i == 3) {
                if (baseAd != null) {
                    boolean z6 = this.f10515z;
                    if (aVar != null) {
                        Object a9 = new com.anythink.basead.mixad.c.b(new a.C0043a().a(aVar).a(this).a(z6).a(this.f10509t).a(this.f10511v).a()).a();
                        if (a9 instanceof BaseScreenATView) {
                            this.f10491A = a9 instanceof e;
                            return (BaseScreenATView) a9;
                        }
                    }
                    return null;
                }
                if (this.f10506q.ao() == 3) {
                    if (d.b(this.f10506q)) {
                        return new WTWebViewBaseScreenATView(this, this.f10505p, this.f10506q, this.f10509t, this.f10510u, this.f10511v);
                    }
                    if (this.f10506q.r().bF() != 1) {
                        b.AbstractC0042b abstractC0042b = this.f10508s;
                        if (abstractC0042b != null) {
                            abstractC0042b.a(g.a(g.f6974t, g.ad));
                        }
                        c();
                        return null;
                    }
                }
                if (this.f10515z) {
                    if (this.f10505p.f14954o.at() == 1 && this.f10511v == 1) {
                        return new LetterHalfScreenATView(this, this.f10505p, this.f10506q, this.f10509t, this.f10510u, this.f10511v);
                    }
                    return new HalfScreenATView(this, this.f10505p, this.f10506q, this.f10509t, this.f10510u, this.f10511v);
                }
                if (this.f10505p.f14954o.at() == 1 && this.f10511v == 1) {
                    return new LetterFullScreenATView(this, this.f10505p, this.f10506q, this.f10509t, this.f10510u, this.f10511v);
                }
                return new FullScreenATView(this, this.f10505p, this.f10506q, this.f10509t, this.f10510u, this.f10511v);
            }
        } else if (this.f10506q.ao() == 3) {
            if (d.b(this.f10506q)) {
                return new WTWebViewBaseScreenATView(this, this.f10505p, this.f10506q, this.f10509t, this.f10510u, this.f10511v);
            }
            if (this.f10506q.r().bF() != 1) {
                b.AbstractC0042b abstractC0042b2 = this.f10508s;
                if (abstractC0042b2 != null) {
                    abstractC0042b2.a(g.a(g.f6974t, g.ad));
                }
                c();
                return null;
            }
        }
        return new FullScreenATView(this, this.f10505p, this.f10506q, this.f10509t, this.f10510u, this.f10511v);
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
            this.f10511v = 2;
        } else {
            this.f10511v = 1;
        }
        Intent intent = getIntent();
        try {
            if (intent != null) {
                this.f10507r = intent.getStringExtra(a.C0072a.f12655d);
                com.anythink.core.basead.b.c a10 = com.anythink.basead.ui.e.a.a().a(this.f10507r);
                if (a10 != null) {
                    this.f10509t = a10.f12704b;
                    this.f10510u = a10.f12703a;
                    this.f10506q = a10.f12705c;
                    this.f10505p = a10.f12710h;
                }
                this.f10515z = a(this.f10510u, this.f10505p);
            } else {
                Log.e("anythink", f10490a + " Intent is null.");
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        this.f10508s = com.anythink.basead.g.b.a().a(this.f10507r);
        a("1", 0L);
        x xVar = this.f10505p;
        if (xVar != null && xVar.f14954o != null) {
            if (this.f10506q != null) {
                com.anythink.core.common.b.a().a("1", this.i);
                com.anythink.basead.mixad.c.a.a a11 = com.anythink.basead.mixad.a.a().a(this.f10507r);
                if (a11 != null && a11.a() != null) {
                    ATNativeAdInfo a12 = a11.a();
                    if (a12 instanceof com.anythink.core.common.l.e.a.g) {
                        baseAd = ((com.anythink.core.common.l.e.a.g) a12).a();
                        this.f10500k = true;
                        a9 = a(a11, baseAd);
                        this.f10504o = a9;
                        if (a9 != null) {
                            return;
                        }
                        if (!this.f10491A && !this.f10515z) {
                            ViewGroup customAdContainer = baseAd != null ? baseAd.getCustomAdContainer() : null;
                            if (customAdContainer != null) {
                                customAdContainer.addView(this.f10504o);
                                am.a(customAdContainer);
                                setContentView(customAdContainer);
                                this.f10504o.handleFullScreenClick();
                            } else {
                                setContentView(this.f10504o);
                            }
                        } else {
                            setContentView(a9);
                        }
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
                        this.f10499j = anonymousClass2;
                        this.f10504o.setListener(anonymousClass2);
                        if (bundle != null) {
                            this.f10512w = bundle.getBoolean(a.C0072a.f12657f);
                            this.f10513x = bundle.getBoolean(a.C0072a.f12658g);
                            this.f10514y = bundle.getBoolean(a.C0072a.f12660j);
                            this.f10494d = bundle.getLong(a.C0072a.f12662l);
                            this.f10495e = bundle.getLong(a.C0072a.f12663m);
                            this.f10496f = bundle.getFloat(a.C0072a.f12664n);
                            this.f10497g = bundle.getBoolean(a.C0072a.f12659h, false);
                            this.f10498h = bundle.getBoolean(a.C0072a.f12665o, false);
                        }
                        this.f10504o.setIsShowEndCard(this.f10512w);
                        this.f10504o.setHasReward(this.f10514y);
                        if (bundle != null) {
                            this.f10504o.setVideoMute(this.f10513x);
                            this.f10504o.setShowBannerTime(this.f10494d);
                            this.f10504o.setHideBannerTime(this.f10495e);
                            this.f10504o.setCloseButtonScaleFactor(this.f10496f);
                            this.f10504o.setHasPerformClick(this.f10497g);
                            this.f10504o.setShowingEndCardAfterVideoPlay(this.f10498h);
                        }
                        try {
                            this.f10504o.init();
                            return;
                        } catch (Throwable th) {
                            th.printStackTrace();
                            try {
                                b.AbstractC0042b abstractC0042b = this.f10508s;
                                if (abstractC0042b != null) {
                                    abstractC0042b.a(g.a(g.f6965k, q.a(th.getStackTrace())));
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
                this.f10504o = a9;
                if (a9 != null) {
                }
            } else {
                StringBuilder sb = new StringBuilder();
                String str = f10490a;
                sb.append(str);
                sb.append(" onCreate: OfferAd = null");
                Log.e("anythink", sb.toString());
                try {
                    b.AbstractC0042b abstractC0042b2 = this.f10508s;
                    if (abstractC0042b2 != null) {
                        abstractC0042b2.a(g.a(g.f6965k, str + " onCreate: OfferAd = null"));
                    }
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
                c();
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            String str2 = f10490a;
            sb2.append(str2);
            sb2.append("Start Screen Ad Error.");
            Log.e("anythink", sb2.toString());
            try {
                b.AbstractC0042b abstractC0042b3 = this.f10508s;
                if (abstractC0042b3 != null) {
                    abstractC0042b3.a(g.a(g.f6965k, str2 + "Start FullScreen Ad Error."));
                }
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, long j6) {
        String str2;
        String str3;
        w wVar = this.f10506q;
        if (wVar == null || wVar.b() == 10) {
            return;
        }
        try {
            x xVar = this.f10505p;
            String str4 = xVar != null ? xVar.f14943c : "";
            if (xVar == null) {
                str2 = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f10505p.f14949j);
                str2 = sb.toString();
            }
            if (this.f10505p != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f10505p.f14946f);
                str3 = sb2.toString();
            } else {
                str3 = "";
            }
            w wVar2 = this.f10506q;
            int b9 = wVar2 != null ? wVar2.b() : -1;
            w wVar3 = this.f10506q;
            String v9 = wVar3 != null ? wVar3.v() : "";
            w wVar4 = this.f10506q;
            com.anythink.core.common.u.e.a(str, xVar, str4, str2, str3, b9, 0, v9, wVar4 instanceof r ? ((r) wVar4).aD() : "", com.anythink.basead.b.e.a(this.f10506q, this.f10505p), j6);
        } catch (Throwable unused) {
        }
    }

    private BaseScreenATView a(com.anythink.basead.mixad.c.a.a aVar, boolean z6) {
        if (aVar == null) {
            return null;
        }
        Object a9 = new com.anythink.basead.mixad.c.b(new a.C0043a().a(aVar).a(this).a(z6).a(this.f10509t).a(this.f10511v).a()).a();
        if (!(a9 instanceof BaseScreenATView)) {
            return null;
        }
        this.f10491A = a9 instanceof e;
        return (BaseScreenATView) a9;
    }
}
