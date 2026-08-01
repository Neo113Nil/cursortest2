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
    public static final String f9704a = "BaseATActivity";

    /* renamed from: A, reason: collision with root package name */
    private boolean f9705A;

    /* renamed from: b, reason: collision with root package name */
    boolean f9706b;

    /* renamed from: c, reason: collision with root package name */
    bf f9707c;

    /* renamed from: j, reason: collision with root package name */
    i f9713j;

    /* renamed from: l, reason: collision with root package name */
    long f9715l;

    /* renamed from: m, reason: collision with root package name */
    long f9716m;

    /* renamed from: n, reason: collision with root package name */
    long f9717n;

    /* renamed from: o, reason: collision with root package name */
    private BaseScreenATView f9718o;

    /* renamed from: p, reason: collision with root package name */
    private x f9719p;

    /* renamed from: q, reason: collision with root package name */
    private w f9720q;

    /* renamed from: r, reason: collision with root package name */
    private String f9721r;

    /* renamed from: s, reason: collision with root package name */
    private b.AbstractC0042b f9722s;

    /* renamed from: t, reason: collision with root package name */
    private String f9723t;

    /* renamed from: u, reason: collision with root package name */
    private int f9724u;

    /* renamed from: v, reason: collision with root package name */
    private int f9725v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f9726w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f9727x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f9728y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f9729z;

    /* renamed from: d, reason: collision with root package name */
    long f9708d = 0;

    /* renamed from: e, reason: collision with root package name */
    long f9709e = 0;

    /* renamed from: f, reason: collision with root package name */
    float f9710f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    boolean f9711g = false;

    /* renamed from: h, reason: collision with root package name */
    boolean f9712h = false;
    b.a i = new b.a() { // from class: com.anythink.basead.ui.BaseATActivity.1
        @Override // com.anythink.core.common.b.a
        public final void a(Object obj) {
            if (!(obj instanceof bf) || BaseATActivity.this.f9720q == null) {
                return;
            }
            bf bfVar = (bf) obj;
            if (bfVar.a().I().equals(BaseATActivity.this.f9720q.I())) {
                BaseATActivity baseATActivity = BaseATActivity.this;
                if (baseATActivity.f9706b) {
                    bfVar.a(baseATActivity);
                } else {
                    baseATActivity.f9707c = bfVar;
                }
            }
        }
    };

    /* renamed from: k, reason: collision with root package name */
    boolean f9714k = false;

    private void d() {
        try {
            if (!this.f9714k) {
                w wVar = this.f9720q;
                if (wVar == null || wVar.r() == null || this.f9720q.r().bP() != 1) {
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
    public void onActivityResult(int i, int i6, Intent intent) {
        BaseScreenATView baseScreenATView = this.f9718o;
        if (baseScreenATView != null) {
            baseScreenATView.onActivityResult(i, i6, intent);
        }
        super.onActivityResult(i, i6, intent);
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
            a.InterfaceC0083a b9 = com.anythink.basead.mixad.a.a().b(this.f9721r);
            if (b9 != null) {
                b9.a(this);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.f9707c = null;
        this.f9713j = null;
        com.anythink.core.common.b.a().b("1", this.i);
        BaseScreenATView baseScreenATView = this.f9718o;
        if (baseScreenATView != null) {
            baseScreenATView.removeAllViews();
            this.f9718o.F();
            this.f9718o = null;
        }
        w wVar = this.f9720q;
        if (wVar != null && wVar.L() && !this.f9720q.c()) {
            o.a().b();
        }
        if (this.f9719p != null) {
            com.anythink.core.common.u.a.a().a(this.f9719p.f14158d + this.f9719p.f14157c);
        }
        if (!TextUtils.isEmpty(this.f9721r)) {
            com.anythink.basead.g.b.a().b(this.f9721r);
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
        long j6 = this.f9717n + 1;
        this.f9717n = j6;
        if (j6 <= 5) {
            StringBuilder sb = new StringBuilder("3-");
            i iVar = this.f9713j;
            sb.append(iVar != null ? iVar.i() : "0");
            a(sb.toString(), SystemClock.elapsedRealtime() - this.f9715l);
        }
        this.f9706b = false;
        BaseScreenATView baseScreenATView = this.f9718o;
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
        this.f9715l = SystemClock.elapsedRealtime();
        long j6 = this.f9716m + 1;
        this.f9716m = j6;
        if (j6 <= 5) {
            StringBuilder sb = new StringBuilder("2-");
            i iVar = this.f9713j;
            sb.append(iVar != null ? iVar.i() : "0");
            a(sb.toString(), 0L);
        }
        this.f9706b = true;
        BaseScreenATView baseScreenATView = this.f9718o;
        if (baseScreenATView != null) {
            baseScreenATView.A();
        }
        bf bfVar = this.f9707c;
        if (bfVar != null) {
            bfVar.a(this);
            this.f9707c = null;
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        BaseScreenATView baseScreenATView = this.f9718o;
        if (baseScreenATView != null) {
            if (baseScreenATView.isShowEndCard()) {
                bundle.putBoolean(a.C0072a.f11871f, true);
            }
            bundle.putBoolean(a.C0072a.f11872g, this.f9718o.isVideoMute());
            bundle.putBoolean(a.C0072a.f11874j, this.f9718o.hasReward());
            bundle.putLong(a.C0072a.f11876l, this.f9718o.getShowBannerTime());
            bundle.putLong(a.C0072a.f11877m, this.f9718o.getHideBannerTime());
            bundle.putFloat(a.C0072a.f11878n, this.f9718o.getCloseButtonScaleFactor());
            bundle.putBoolean(a.C0072a.f11873h, this.f9718o.getHasPerformClick());
            bundle.putBoolean(a.C0072a.f11879o, this.f9718o.isShowingEndCardAfterVideoPlay());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        if (z3) {
            d();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (Build.VERSION.SDK_INT == 26) {
            super.setTheme(q.a(this, "myoffer_half_screen_fit_by_o", k.f19634e));
        } else {
            super.setTheme(i);
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseATActivity$2, reason: invalid class name */
    public class AnonymousClass2 extends i {

        /* renamed from: a, reason: collision with root package name */
        String f9731a = "1";

        public AnonymousClass2() {
        }

        @Override // com.anythink.basead.g.b.AbstractC0042b
        public final void a(j jVar) {
            if (BaseATActivity.this.f9722s != null) {
                BaseATActivity.this.f9722s.a(jVar);
            }
        }

        @Override // com.anythink.basead.g.b.AbstractC0042b
        public final void b() {
            if (BaseATActivity.this.f9722s != null) {
                BaseATActivity.this.f9722s.b();
            }
        }

        @Override // com.anythink.basead.g.b.AbstractC0042b
        public final void c() {
            if (BaseATActivity.this.f9722s != null) {
                BaseATActivity.this.f9722s.c();
            }
        }

        @Override // com.anythink.basead.g.b.AbstractC0042b
        public final void d() {
            if (BaseATActivity.this.f9722s != null) {
                BaseATActivity.this.f9722s.a(e());
                BaseATActivity.this.f9722s.d();
            }
            BaseATActivity.this.c();
        }

        @Override // com.anythink.basead.g.i
        public final void f() {
            this.f9731a = "1";
            BaseATActivity.this.a("4", 0L);
        }

        @Override // com.anythink.basead.g.i
        public final void g() {
            if (TextUtils.equals(this.f9731a, "1")) {
                this.f9731a = "2";
            }
            BaseATActivity baseATActivity = BaseATActivity.this;
            baseATActivity.a("5-".concat(baseATActivity.f9716m - baseATActivity.f9717n <= 0 ? "2" : "1"), 0L);
        }

        @Override // com.anythink.basead.g.i
        public final void h() {
            if (TextUtils.equals(this.f9731a, "1")) {
                this.f9731a = "3";
                BaseATActivity baseATActivity = BaseATActivity.this;
                baseATActivity.a("6-".concat(baseATActivity.f9716m - baseATActivity.f9717n <= 0 ? "2" : "1"), 0L);
            }
        }

        @Override // com.anythink.basead.g.i
        public final String i() {
            return this.f9731a;
        }

        @Override // com.anythink.basead.g.b.AbstractC0042b
        public final void a(f fVar) {
            if (BaseATActivity.this.f9722s != null) {
                BaseATActivity.this.f9722s.a(fVar);
            }
        }

        @Override // com.anythink.basead.g.b.AbstractC0042b
        public final void b(j jVar) {
            if (BaseATActivity.this.f9722s != null) {
                BaseATActivity.this.f9722s.b(jVar);
            }
        }

        @Override // com.anythink.basead.g.b.AbstractC0042b
        public final void a() {
            if (BaseATActivity.this.f9722s != null) {
                BaseATActivity.this.f9722s.a();
            }
        }

        @Override // com.anythink.basead.g.b.AbstractC0042b
        public final void a(boolean z3) {
            if (BaseATActivity.this.f9722s != null) {
                BaseATActivity.this.f9722s.a(z3);
            }
        }
    }

    private void b() {
        a.InterfaceC0083a b9 = com.anythink.basead.mixad.a.a().b(this.f9721r);
        if (b9 != null) {
            b9.a(this);
        }
    }

    private void c(Bundle bundle) {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        this.f9713j = anonymousClass2;
        this.f9718o.setListener(anonymousClass2);
        if (bundle != null) {
            this.f9726w = bundle.getBoolean(a.C0072a.f11871f);
            this.f9727x = bundle.getBoolean(a.C0072a.f11872g);
            this.f9728y = bundle.getBoolean(a.C0072a.f11874j);
            this.f9708d = bundle.getLong(a.C0072a.f11876l);
            this.f9709e = bundle.getLong(a.C0072a.f11877m);
            this.f9710f = bundle.getFloat(a.C0072a.f11878n);
            this.f9711g = bundle.getBoolean(a.C0072a.f11873h, false);
            this.f9712h = bundle.getBoolean(a.C0072a.f11879o, false);
        }
        this.f9718o.setIsShowEndCard(this.f9726w);
        this.f9718o.setHasReward(this.f9728y);
        if (bundle != null) {
            this.f9718o.setVideoMute(this.f9727x);
            this.f9718o.setShowBannerTime(this.f9708d);
            this.f9718o.setHideBannerTime(this.f9709e);
            this.f9718o.setCloseButtonScaleFactor(this.f9710f);
            this.f9718o.setHasPerformClick(this.f9711g);
            this.f9718o.setShowingEndCardAfterVideoPlay(this.f9712h);
        }
        try {
            this.f9718o.init();
        } catch (Throwable th) {
            th.printStackTrace();
            try {
                b.AbstractC0042b abstractC0042b = this.f9722s;
                if (abstractC0042b != null) {
                    abstractC0042b.a(g.a(g.f6179k, q.a(th.getStackTrace())));
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            c();
        }
    }

    public static void a(Activity activity, com.anythink.core.basead.b.c cVar) {
        Intent intent = new Intent();
        Context g4 = t.b().g();
        if (activity == null || activity.isFinishing()) {
            Log.i("anythink_BaseATActivity", "Activity is null");
        } else {
            g4 = activity;
        }
        boolean a9 = a(cVar.f11917a, cVar.f11924h);
        if (cVar.f11921e == 2) {
            if (!a9 && !cVar.f11925j) {
                intent.setClass(g4, ATLandscapeActivity.class);
            } else {
                intent.setClass(g4, ATLandscapeTranslucentActivity.class);
            }
        } else if (!a9 && !cVar.f11925j) {
            intent.setClass(g4, ATPortraitActivity.class);
        } else {
            intent.setClass(g4, ATPortraitTranslucentActivity.class);
        }
        intent.putExtra(a.C0072a.f11869d, cVar.f11920d);
        com.anythink.basead.ui.e.a.a().a(cVar.f11920d, cVar);
        if (!(g4 instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            g4.startActivity(intent);
            if (activity == null || activity.isFinishing()) {
                return;
            }
            activity.overridePendingTransition(0, 0);
        } catch (Throwable th) {
            b.AbstractC0042b a10 = com.anythink.basead.g.b.a().a(cVar.f11920d);
            if (a10 != null) {
                a10.a(g.a(g.f6171b, th.getMessage()));
            }
        }
    }

    private void b(Bundle bundle) {
        if (bundle != null) {
            this.f9726w = bundle.getBoolean(a.C0072a.f11871f);
            this.f9727x = bundle.getBoolean(a.C0072a.f11872g);
            this.f9728y = bundle.getBoolean(a.C0072a.f11874j);
            this.f9708d = bundle.getLong(a.C0072a.f11876l);
            this.f9709e = bundle.getLong(a.C0072a.f11877m);
            this.f9710f = bundle.getFloat(a.C0072a.f11878n);
            this.f9711g = bundle.getBoolean(a.C0072a.f11873h, false);
            this.f9712h = bundle.getBoolean(a.C0072a.f11879o, false);
        }
    }

    private void a() {
        Intent intent = getIntent();
        try {
            if (intent != null) {
                this.f9721r = intent.getStringExtra(a.C0072a.f11869d);
                com.anythink.core.basead.b.c a9 = com.anythink.basead.ui.e.a.a().a(this.f9721r);
                if (a9 != null) {
                    this.f9723t = a9.f11918b;
                    this.f9724u = a9.f11917a;
                    this.f9720q = a9.f11919c;
                    this.f9719p = a9.f11924h;
                }
                this.f9729z = a(this.f9724u, this.f9719p);
                return;
            }
            Log.e("anythink", f9704a + " Intent is null.");
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
        if (xVar == null || (yVar = xVar.f14168o) == null || i != 3) {
            return false;
        }
        return TextUtils.equals("2", yVar.Q());
    }

    private BaseScreenATView a(com.anythink.basead.mixad.c.a.a aVar, BaseAd baseAd) {
        int i = this.f9724u;
        if (i != 1) {
            if (i == 3) {
                if (baseAd != null) {
                    boolean z3 = this.f9729z;
                    if (aVar != null) {
                        Object a9 = new com.anythink.basead.mixad.c.b(new a.C0043a().a(aVar).a(this).a(z3).a(this.f9723t).a(this.f9725v).a()).a();
                        if (a9 instanceof BaseScreenATView) {
                            this.f9705A = a9 instanceof e;
                            return (BaseScreenATView) a9;
                        }
                    }
                    return null;
                }
                if (this.f9720q.ao() == 3) {
                    if (d.b(this.f9720q)) {
                        return new WTWebViewBaseScreenATView(this, this.f9719p, this.f9720q, this.f9723t, this.f9724u, this.f9725v);
                    }
                    if (this.f9720q.r().bF() != 1) {
                        b.AbstractC0042b abstractC0042b = this.f9722s;
                        if (abstractC0042b != null) {
                            abstractC0042b.a(g.a(g.f6188t, g.ad));
                        }
                        c();
                        return null;
                    }
                }
                if (this.f9729z) {
                    if (this.f9719p.f14168o.at() == 1 && this.f9725v == 1) {
                        return new LetterHalfScreenATView(this, this.f9719p, this.f9720q, this.f9723t, this.f9724u, this.f9725v);
                    }
                    return new HalfScreenATView(this, this.f9719p, this.f9720q, this.f9723t, this.f9724u, this.f9725v);
                }
                if (this.f9719p.f14168o.at() == 1 && this.f9725v == 1) {
                    return new LetterFullScreenATView(this, this.f9719p, this.f9720q, this.f9723t, this.f9724u, this.f9725v);
                }
                return new FullScreenATView(this, this.f9719p, this.f9720q, this.f9723t, this.f9724u, this.f9725v);
            }
        } else if (this.f9720q.ao() == 3) {
            if (d.b(this.f9720q)) {
                return new WTWebViewBaseScreenATView(this, this.f9719p, this.f9720q, this.f9723t, this.f9724u, this.f9725v);
            }
            if (this.f9720q.r().bF() != 1) {
                b.AbstractC0042b abstractC0042b2 = this.f9722s;
                if (abstractC0042b2 != null) {
                    abstractC0042b2.a(g.a(g.f6188t, g.ad));
                }
                c();
                return null;
            }
        }
        return new FullScreenATView(this, this.f9719p, this.f9720q, this.f9723t, this.f9724u, this.f9725v);
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
            this.f9725v = 2;
        } else {
            this.f9725v = 1;
        }
        Intent intent = getIntent();
        try {
            if (intent != null) {
                this.f9721r = intent.getStringExtra(a.C0072a.f11869d);
                com.anythink.core.basead.b.c a10 = com.anythink.basead.ui.e.a.a().a(this.f9721r);
                if (a10 != null) {
                    this.f9723t = a10.f11918b;
                    this.f9724u = a10.f11917a;
                    this.f9720q = a10.f11919c;
                    this.f9719p = a10.f11924h;
                }
                this.f9729z = a(this.f9724u, this.f9719p);
            } else {
                Log.e("anythink", f9704a + " Intent is null.");
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        this.f9722s = com.anythink.basead.g.b.a().a(this.f9721r);
        a("1", 0L);
        x xVar = this.f9719p;
        if (xVar != null && xVar.f14168o != null) {
            if (this.f9720q != null) {
                com.anythink.core.common.b.a().a("1", this.i);
                com.anythink.basead.mixad.c.a.a a11 = com.anythink.basead.mixad.a.a().a(this.f9721r);
                if (a11 != null && a11.a() != null) {
                    ATNativeAdInfo a12 = a11.a();
                    if (a12 instanceof com.anythink.core.common.l.e.a.g) {
                        baseAd = ((com.anythink.core.common.l.e.a.g) a12).a();
                        this.f9714k = true;
                        a9 = a(a11, baseAd);
                        this.f9718o = a9;
                        if (a9 != null) {
                            return;
                        }
                        if (!this.f9705A && !this.f9729z) {
                            ViewGroup customAdContainer = baseAd != null ? baseAd.getCustomAdContainer() : null;
                            if (customAdContainer != null) {
                                customAdContainer.addView(this.f9718o);
                                am.a(customAdContainer);
                                setContentView(customAdContainer);
                                this.f9718o.handleFullScreenClick();
                            } else {
                                setContentView(this.f9718o);
                            }
                        } else {
                            setContentView(a9);
                        }
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
                        this.f9713j = anonymousClass2;
                        this.f9718o.setListener(anonymousClass2);
                        if (bundle != null) {
                            this.f9726w = bundle.getBoolean(a.C0072a.f11871f);
                            this.f9727x = bundle.getBoolean(a.C0072a.f11872g);
                            this.f9728y = bundle.getBoolean(a.C0072a.f11874j);
                            this.f9708d = bundle.getLong(a.C0072a.f11876l);
                            this.f9709e = bundle.getLong(a.C0072a.f11877m);
                            this.f9710f = bundle.getFloat(a.C0072a.f11878n);
                            this.f9711g = bundle.getBoolean(a.C0072a.f11873h, false);
                            this.f9712h = bundle.getBoolean(a.C0072a.f11879o, false);
                        }
                        this.f9718o.setIsShowEndCard(this.f9726w);
                        this.f9718o.setHasReward(this.f9728y);
                        if (bundle != null) {
                            this.f9718o.setVideoMute(this.f9727x);
                            this.f9718o.setShowBannerTime(this.f9708d);
                            this.f9718o.setHideBannerTime(this.f9709e);
                            this.f9718o.setCloseButtonScaleFactor(this.f9710f);
                            this.f9718o.setHasPerformClick(this.f9711g);
                            this.f9718o.setShowingEndCardAfterVideoPlay(this.f9712h);
                        }
                        try {
                            this.f9718o.init();
                            return;
                        } catch (Throwable th) {
                            th.printStackTrace();
                            try {
                                b.AbstractC0042b abstractC0042b = this.f9722s;
                                if (abstractC0042b != null) {
                                    abstractC0042b.a(g.a(g.f6179k, q.a(th.getStackTrace())));
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
                this.f9718o = a9;
                if (a9 != null) {
                }
            } else {
                StringBuilder sb = new StringBuilder();
                String str = f9704a;
                sb.append(str);
                sb.append(" onCreate: OfferAd = null");
                Log.e("anythink", sb.toString());
                try {
                    b.AbstractC0042b abstractC0042b2 = this.f9722s;
                    if (abstractC0042b2 != null) {
                        abstractC0042b2.a(g.a(g.f6179k, str + " onCreate: OfferAd = null"));
                    }
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
                c();
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            String str2 = f9704a;
            sb2.append(str2);
            sb2.append("Start Screen Ad Error.");
            Log.e("anythink", sb2.toString());
            try {
                b.AbstractC0042b abstractC0042b3 = this.f9722s;
                if (abstractC0042b3 != null) {
                    abstractC0042b3.a(g.a(g.f6179k, str2 + "Start FullScreen Ad Error."));
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
        w wVar = this.f9720q;
        if (wVar == null || wVar.b() == 10) {
            return;
        }
        try {
            x xVar = this.f9719p;
            String str4 = xVar != null ? xVar.f14157c : "";
            if (xVar == null) {
                str2 = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f9719p.f14163j);
                str2 = sb.toString();
            }
            if (this.f9719p != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f9719p.f14160f);
                str3 = sb2.toString();
            } else {
                str3 = "";
            }
            w wVar2 = this.f9720q;
            int b9 = wVar2 != null ? wVar2.b() : -1;
            w wVar3 = this.f9720q;
            String v9 = wVar3 != null ? wVar3.v() : "";
            w wVar4 = this.f9720q;
            com.anythink.core.common.u.e.a(str, xVar, str4, str2, str3, b9, 0, v9, wVar4 instanceof r ? ((r) wVar4).aD() : "", com.anythink.basead.b.e.a(this.f9720q, this.f9719p), j6);
        } catch (Throwable unused) {
        }
    }

    private BaseScreenATView a(com.anythink.basead.mixad.c.a.a aVar, boolean z3) {
        if (aVar == null) {
            return null;
        }
        Object a9 = new com.anythink.basead.mixad.c.b(new a.C0043a().a(aVar).a(this).a(z3).a(this.f9723t).a(this.f9725v).a()).a();
        if (!(a9 instanceof BaseScreenATView)) {
            return null;
        }
        this.f9705A = a9 instanceof e;
        return (BaseScreenATView) a9;
    }
}
