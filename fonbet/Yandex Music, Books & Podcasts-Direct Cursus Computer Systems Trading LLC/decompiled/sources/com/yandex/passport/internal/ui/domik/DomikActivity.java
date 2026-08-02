package com.yandex.passport.internal.ui.domik;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.yandex.passport.R;
import com.yandex.passport.api.y1;
import com.yandex.passport.internal.analytics.l0;
import com.yandex.passport.internal.analytics.m0;
import com.yandex.passport.internal.analytics.n0;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.analytics.p0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.ui.sloth.authsdk.h0;
import com.yandex.passport.internal.widget.ErrorView;
import com.yandex.passport.internal.widget.KeyboardDetectorLayout;
import defpackage.b6e;
import defpackage.bjt;
import defpackage.ciu;
import defpackage.cxb;
import defpackage.e5b;
import defpackage.ern;
import defpackage.fb7;
import defpackage.gfu;
import defpackage.is6;
import defpackage.jfu;
import defpackage.lm4;
import defpackage.su4;
import defpackage.vwb;
import defpackage.xal;
import defpackage.xjj;
import defpackage.xq0;
import defpackage.xy0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Stack;
import kotlin.Pair;

/* loaded from: classes4.dex */
public class DomikActivity extends com.yandex.passport.internal.ui.base.a implements com.yandex.passport.internal.ui.social.a, com.yandex.passport.internal.ui.domik.samlsso.f, k {
    public static final /* synthetic */ int n = 0;
    public com.yandex.passport.internal.properties.l e;
    public n0 f;
    public Toolbar g;
    public ErrorView h;
    public ErrorView i;
    public com.yandex.passport.internal.ui.domik.di.a j;
    public f k;
    public FrameLayout l;
    public View m;

    @Override // com.yandex.passport.internal.ui.c
    public final com.yandex.passport.internal.e k() {
        com.yandex.passport.internal.properties.l lVar = this.e;
        if (lVar != null) {
            return lVar.f;
        }
        return null;
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        com.yandex.passport.internal.ui.domik.identifier.c cVar = (com.yandex.passport.internal.ui.domik.identifier.c) getSupportFragmentManager().D("com.yandex.passport.internal.ui.domik.identifier.c");
        if (cVar != null) {
            cVar.onActivityResult(i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.yandex.passport.internal.ui.base.a, defpackage.hn5, android.app.Activity
    public final void onBackPressed() {
        com.yandex.passport.internal.ui.domik.base.a p = p();
        if (p != null) {
            n0 n0Var = this.f;
            m0 F = p.F();
            n0Var.getClass();
            l0 l0Var = l0.BACK_PRESSED;
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            n0Var.c(F, l0Var, e5bVar);
        }
        super.onBackPressed();
        overridePendingTransition(R.anim.passport_slide_left_in, R.anim.passport_slide_left_out);
    }

    @Override // com.yandex.passport.internal.ui.base.a, com.yandex.passport.internal.ui.c, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        com.yandex.passport.internal.l lVar;
        Bundle extras = getIntent().getExtras();
        final int i = 0;
        if (extras == null) {
            super.onCreate(bundle);
            o0 o0Var = this.c;
            ComponentName callingActivity = getCallingActivity();
            o0Var.getClass();
            xy0 xy0Var = new xy0(0);
            xy0Var.put("calling_activity", callingActivity != null ? callingActivity.toShortString() : "null");
            o0Var.a.b(com.yandex.passport.internal.analytics.l.p, xy0Var);
            finish();
            return;
        }
        com.yandex.passport.internal.properties.l lVar2 = (com.yandex.passport.internal.properties.l) com.appsflyer.internal.k.h(extras, com.yandex.passport.internal.util.p.class, "passport-login-properties");
        if (lVar2 == null) {
            xq0.q(com.appsflyer.internal.k.m("Bundle has no ", com.yandex.passport.internal.properties.l.class));
            return;
        }
        this.e = lVar2;
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.c = a.getEventReporter();
        this.f = a.getStatefulReporter();
        jfu viewModelStore = getViewModelStore();
        gfu defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        is6 defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        bjt bjtVar = new bjt(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        lm4 a2 = ern.a(f.class);
        String f = a2.f();
        if (f == null) {
            xq0.x("Local and anonymous classes can not be ViewModels");
            return;
        }
        f fVar = (f) bjtVar.j(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
        this.k = fVar;
        this.j = a.createDomikComponent(new com.yandex.passport.internal.ui.domik.di.b(this, this.e, fVar));
        if (!extras.getBoolean("run_as_transparent") || Build.VERSION.SDK_INT <= 26) {
            l domikDesignProvider = this.j.getDomikDesignProvider();
            y1 y1Var = this.e.e;
            domikDesignProvider.getClass();
            y1Var.getClass();
            setTheme(com.yandex.passport.internal.ui.util.s.d(y1Var, this));
        } else {
            l domikDesignProvider2 = this.j.getDomikDesignProvider();
            y1 y1Var2 = this.e.e;
            domikDesignProvider2.getClass();
            y1Var2.getClass();
            setTheme(com.yandex.passport.internal.ui.util.s.f(y1Var2, this));
        }
        super.onCreate(bundle);
        setContentView(R.layout.passport_activity_authorization);
        this.l = (FrameLayout) findViewById(R.id.passport_activity_authorization_layout);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frame_content);
        this.l.setSystemUiVisibility(1280);
        final int i2 = 1;
        this.l.setOnApplyWindowInsetsListener(new ciu(this, 1));
        ((ArrayList) this.d.c).add(new com.yandex.passport.internal.ui.base.k() { // from class: com.yandex.passport.internal.ui.domik.i
            @Override // com.yandex.passport.internal.ui.base.k
            public final void a() {
                int i3 = DomikActivity.n;
                DomikActivity domikActivity = DomikActivity.this;
                domikActivity.r();
                domikActivity.q();
            }
        });
        this.g = (Toolbar) findViewById(R.id.toolbar);
        View findViewById = findViewById(R.id.passport_button_up);
        this.m = findViewById;
        findViewById.setOnClickListener(new xal(16, this));
        setSupportActionBar(this.g);
        r();
        this.k.q.n(this, new com.yandex.passport.internal.ui.util.l(this) { // from class: com.yandex.passport.internal.ui.domik.h
            public final /* synthetic */ DomikActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.xjj
            public final void onChanged(Object obj) {
                int i3 = i2;
                DomikActivity domikActivity = this.b;
                switch (i3) {
                    case 0:
                        String str = (String) obj;
                        int i4 = DomikActivity.n;
                        Intent intent = new Intent();
                        str.getClass();
                        intent.putExtras(cxb.K(new Pair("task_id_value", str)));
                        domikActivity.setResult(3, intent);
                        domikActivity.finish();
                        break;
                    case 1:
                        domikActivity.n((com.yandex.passport.internal.ui.base.m) obj);
                        break;
                    case 2:
                        domikActivity.finish();
                        break;
                    case 3:
                        int i5 = DomikActivity.n;
                        domikActivity.setResult(13, new Intent().putExtra(Constants.KEY_EXCEPTION, (com.yandex.passport.api.exception.j) obj));
                        domikActivity.finish();
                        break;
                    case 4:
                        int i6 = DomikActivity.n;
                        Intent intent2 = new Intent();
                        intent2.putExtras(((t) obj).t());
                        domikActivity.setResult(-1, intent2);
                        domikActivity.finish();
                        break;
                    default:
                        int i7 = DomikActivity.n;
                        Intent intent3 = new Intent();
                        intent3.putExtra("forbidden_web_am_for_this_auth", true);
                        domikActivity.setResult(-1, intent3);
                        domikActivity.finish();
                        break;
                }
            }
        });
        final int i3 = 2;
        this.k.A.n(this, new com.yandex.passport.internal.ui.util.l(this) { // from class: com.yandex.passport.internal.ui.domik.h
            public final /* synthetic */ DomikActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.xjj
            public final void onChanged(Object obj) {
                int i32 = i3;
                DomikActivity domikActivity = this.b;
                switch (i32) {
                    case 0:
                        String str = (String) obj;
                        int i4 = DomikActivity.n;
                        Intent intent = new Intent();
                        str.getClass();
                        intent.putExtras(cxb.K(new Pair("task_id_value", str)));
                        domikActivity.setResult(3, intent);
                        domikActivity.finish();
                        break;
                    case 1:
                        domikActivity.n((com.yandex.passport.internal.ui.base.m) obj);
                        break;
                    case 2:
                        domikActivity.finish();
                        break;
                    case 3:
                        int i5 = DomikActivity.n;
                        domikActivity.setResult(13, new Intent().putExtra(Constants.KEY_EXCEPTION, (com.yandex.passport.api.exception.j) obj));
                        domikActivity.finish();
                        break;
                    case 4:
                        int i6 = DomikActivity.n;
                        Intent intent2 = new Intent();
                        intent2.putExtras(((t) obj).t());
                        domikActivity.setResult(-1, intent2);
                        domikActivity.finish();
                        break;
                    default:
                        int i7 = DomikActivity.n;
                        Intent intent3 = new Intent();
                        intent3.putExtra("forbidden_web_am_for_this_auth", true);
                        domikActivity.setResult(-1, intent3);
                        domikActivity.finish();
                        break;
                }
            }
        });
        final int i4 = 3;
        this.k.v.n(this, new com.yandex.passport.internal.ui.util.l(this) { // from class: com.yandex.passport.internal.ui.domik.h
            public final /* synthetic */ DomikActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.xjj
            public final void onChanged(Object obj) {
                int i32 = i4;
                DomikActivity domikActivity = this.b;
                switch (i32) {
                    case 0:
                        String str = (String) obj;
                        int i42 = DomikActivity.n;
                        Intent intent = new Intent();
                        str.getClass();
                        intent.putExtras(cxb.K(new Pair("task_id_value", str)));
                        domikActivity.setResult(3, intent);
                        domikActivity.finish();
                        break;
                    case 1:
                        domikActivity.n((com.yandex.passport.internal.ui.base.m) obj);
                        break;
                    case 2:
                        domikActivity.finish();
                        break;
                    case 3:
                        int i5 = DomikActivity.n;
                        domikActivity.setResult(13, new Intent().putExtra(Constants.KEY_EXCEPTION, (com.yandex.passport.api.exception.j) obj));
                        domikActivity.finish();
                        break;
                    case 4:
                        int i6 = DomikActivity.n;
                        Intent intent2 = new Intent();
                        intent2.putExtras(((t) obj).t());
                        domikActivity.setResult(-1, intent2);
                        domikActivity.finish();
                        break;
                    default:
                        int i7 = DomikActivity.n;
                        Intent intent3 = new Intent();
                        intent3.putExtra("forbidden_web_am_for_this_auth", true);
                        domikActivity.setResult(-1, intent3);
                        domikActivity.finish();
                        break;
                }
            }
        });
        final int i5 = 4;
        this.k.u.n(this, new com.yandex.passport.internal.ui.util.l(this) { // from class: com.yandex.passport.internal.ui.domik.h
            public final /* synthetic */ DomikActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.xjj
            public final void onChanged(Object obj) {
                int i32 = i5;
                DomikActivity domikActivity = this.b;
                switch (i32) {
                    case 0:
                        String str = (String) obj;
                        int i42 = DomikActivity.n;
                        Intent intent = new Intent();
                        str.getClass();
                        intent.putExtras(cxb.K(new Pair("task_id_value", str)));
                        domikActivity.setResult(3, intent);
                        domikActivity.finish();
                        break;
                    case 1:
                        domikActivity.n((com.yandex.passport.internal.ui.base.m) obj);
                        break;
                    case 2:
                        domikActivity.finish();
                        break;
                    case 3:
                        int i52 = DomikActivity.n;
                        domikActivity.setResult(13, new Intent().putExtra(Constants.KEY_EXCEPTION, (com.yandex.passport.api.exception.j) obj));
                        domikActivity.finish();
                        break;
                    case 4:
                        int i6 = DomikActivity.n;
                        Intent intent2 = new Intent();
                        intent2.putExtras(((t) obj).t());
                        domikActivity.setResult(-1, intent2);
                        domikActivity.finish();
                        break;
                    default:
                        int i7 = DomikActivity.n;
                        Intent intent3 = new Intent();
                        intent3.putExtra("forbidden_web_am_for_this_auth", true);
                        domikActivity.setResult(-1, intent3);
                        domikActivity.finish();
                        break;
                }
            }
        });
        final int i6 = 5;
        this.k.z.n(this, new com.yandex.passport.internal.ui.util.l(this) { // from class: com.yandex.passport.internal.ui.domik.h
            public final /* synthetic */ DomikActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.xjj
            public final void onChanged(Object obj) {
                int i32 = i6;
                DomikActivity domikActivity = this.b;
                switch (i32) {
                    case 0:
                        String str = (String) obj;
                        int i42 = DomikActivity.n;
                        Intent intent = new Intent();
                        str.getClass();
                        intent.putExtras(cxb.K(new Pair("task_id_value", str)));
                        domikActivity.setResult(3, intent);
                        domikActivity.finish();
                        break;
                    case 1:
                        domikActivity.n((com.yandex.passport.internal.ui.base.m) obj);
                        break;
                    case 2:
                        domikActivity.finish();
                        break;
                    case 3:
                        int i52 = DomikActivity.n;
                        domikActivity.setResult(13, new Intent().putExtra(Constants.KEY_EXCEPTION, (com.yandex.passport.api.exception.j) obj));
                        domikActivity.finish();
                        break;
                    case 4:
                        int i62 = DomikActivity.n;
                        Intent intent2 = new Intent();
                        intent2.putExtras(((t) obj).t());
                        domikActivity.setResult(-1, intent2);
                        domikActivity.finish();
                        break;
                    default:
                        int i7 = DomikActivity.n;
                        Intent intent3 = new Intent();
                        intent3.putExtra("forbidden_web_am_for_this_auth", true);
                        domikActivity.setResult(-1, intent3);
                        domikActivity.finish();
                        break;
                }
            }
        });
        this.i = (ErrorView) findViewById(R.id.view_permanent_error);
        ErrorView errorView = (ErrorView) findViewById(R.id.view_temporary_error);
        this.h = errorView;
        ErrorView[] errorViewArr = {this.i, errorView};
        com.yandex.passport.common.network.n nVar = new com.yandex.passport.common.network.n(frameLayout, errorViewArr);
        for (int i7 = 0; i7 < 2; i7++) {
            errorViewArr[i7].setAnimationUpdateListener$passport_release(new h0(18, nVar));
        }
        this.k.x.f(this, new xjj(this) { // from class: com.yandex.passport.internal.ui.domik.j
            public final /* synthetic */ DomikActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.xjj
            public final void onChanged(Object obj) {
                int i8 = i;
                DomikActivity domikActivity = this.b;
                switch (i8) {
                    case 0:
                        String str = (String) obj;
                        ErrorView errorView2 = domikActivity.h;
                        if (str != null) {
                            errorView2.q(str);
                            break;
                        } else {
                            errorView2.p();
                            break;
                        }
                    default:
                        int i9 = DomikActivity.n;
                        domikActivity.q();
                        break;
                }
            }
        });
        ErrorView errorView2 = this.h;
        com.yandex.passport.internal.common.e eVar = new com.yandex.passport.internal.common.e(24, this);
        errorView2.getClass();
        errorView2.n.add(eVar);
        f fVar2 = this.k;
        Context applicationContext = getApplicationContext();
        if (fVar2.B == null) {
            applicationContext.getClass();
            fVar2.B = new com.yandex.passport.internal.network.n(applicationContext);
        }
        fVar2.B.f(this, new xjj(this) { // from class: com.yandex.passport.internal.ui.domik.j
            public final /* synthetic */ DomikActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.xjj
            public final void onChanged(Object obj) {
                int i8 = i2;
                DomikActivity domikActivity = this.b;
                switch (i8) {
                    case 0:
                        String str = (String) obj;
                        ErrorView errorView22 = domikActivity.h;
                        if (str != null) {
                            errorView22.q(str);
                            break;
                        } else {
                            errorView22.p();
                            break;
                        }
                    default:
                        int i9 = DomikActivity.n;
                        domikActivity.q();
                        break;
                }
            }
        });
        if (bundle == null) {
            androidx.fragment.app.y supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a l = su4.l(supportFragmentManager, supportFragmentManager);
            Parcelable.Creator<d> creator = d.CREATOR;
            l.d(0, (com.yandex.passport.internal.ui.domik.identifier.c) com.yandex.passport.internal.ui.domik.base.a.D(s.a(this.e), new com.yandex.passport.internal.ui.authbytrack.a(i3)), "com.yandex.passport.internal.ui.domik.identifier.c", 1);
            l.k(true, true);
            r rVar = (r) extras.getParcelable("extra_external_auth_request");
            v domikRouter = this.j.getDomikRouter();
            domikRouter.getClass();
            boolean z = extras.getBoolean("is_relogin", false);
            Bundle bundle2 = extras.containsKey("master-account") ? extras : null;
            if (bundle2 != null) {
                Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vwb.O(bundle2, com.yandex.passport.internal.l.class, "master-account") : bundle2.getParcelable("master-account");
                if (parcelable == null) {
                    xq0.q("can't get required parcelable master-account");
                    return;
                }
                lVar = (com.yandex.passport.internal.l) parcelable;
            } else {
                lVar = null;
            }
            boolean z2 = extras.getBoolean("is_account_changing_allowed", true);
            if (rVar != null) {
                if (rVar instanceof p) {
                    domikRouter.a.q.m(new com.yandex.passport.internal.ui.base.m(new fb7(11, domikRouter, ((p) rVar).a), "SamlSsoAuthFragment", false, 3));
                } else {
                    if (!(rVar instanceof q)) {
                        b6e.s();
                        return;
                    }
                    domikRouter.e(true, ((q) rVar).a, true, null);
                }
            } else if (z) {
                v.a(domikRouter, lVar, z2);
            } else if (lVar != null) {
                v.a(domikRouter, lVar, z2);
            } else {
                domikRouter.c();
            }
        } else {
            Bundle bundle3 = bundle.getBundle("reporter_session_hash");
            if (bundle3 != null) {
                n0 n0Var = this.f;
                n0Var.getClass();
                n0Var.d = bundle3.getString("session_hash");
                n0Var.b = bundle3.getBoolean("from_auth_sdk");
                n0Var.c = (z) bundle3.getSerializable("reg_origin");
                if (bundle3.containsKey("current_screen")) {
                    n0Var.e = m0.values()[bundle3.getInt("current_screen")];
                }
                n0Var.f = bundle3.getString("source");
            }
        }
        this.k.w.n(this, new com.yandex.passport.internal.ui.util.l(this) { // from class: com.yandex.passport.internal.ui.domik.h
            public final /* synthetic */ DomikActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.xjj
            public final void onChanged(Object obj) {
                int i32 = i;
                DomikActivity domikActivity = this.b;
                switch (i32) {
                    case 0:
                        String str = (String) obj;
                        int i42 = DomikActivity.n;
                        Intent intent = new Intent();
                        str.getClass();
                        intent.putExtras(cxb.K(new Pair("task_id_value", str)));
                        domikActivity.setResult(3, intent);
                        domikActivity.finish();
                        break;
                    case 1:
                        domikActivity.n((com.yandex.passport.internal.ui.base.m) obj);
                        break;
                    case 2:
                        domikActivity.finish();
                        break;
                    case 3:
                        int i52 = DomikActivity.n;
                        domikActivity.setResult(13, new Intent().putExtra(Constants.KEY_EXCEPTION, (com.yandex.passport.api.exception.j) obj));
                        domikActivity.finish();
                        break;
                    case 4:
                        int i62 = DomikActivity.n;
                        Intent intent2 = new Intent();
                        intent2.putExtras(((t) obj).t());
                        domikActivity.setResult(-1, intent2);
                        domikActivity.finish();
                        break;
                    default:
                        int i72 = DomikActivity.n;
                        Intent intent3 = new Intent();
                        intent3.putExtra("forbidden_web_am_for_this_auth", true);
                        domikActivity.setResult(-1, intent3);
                        domikActivity.finish();
                        break;
                }
            }
        });
        KeyboardDetectorLayout keyboardDetectorLayout = (KeyboardDetectorLayout) findViewById(R.id.keyboard_detector);
        com.yandex.passport.internal.ui.bouncer.roundabout.k kVar = new com.yandex.passport.internal.ui.bouncer.roundabout.k(6, this);
        keyboardDetectorLayout.getClass();
        keyboardDetectorLayout.b.add(kVar);
        kVar.invoke(Boolean.valueOf(keyboardDetectorLayout.c));
        getLifecycle().a(this.f);
        getLifecycle().a(new p0(a.getAnalyticsTrackerWrapper(), this.e.s));
    }

    @Override // com.yandex.passport.internal.ui.c, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        return menuItem.getItemId() == 16908332 ? l(menuItem) : super.onOptionsItemSelected(menuItem);
    }

    @Override // com.yandex.passport.internal.ui.base.a, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        n0 n0Var = this.f;
        n0Var.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("current_screen", n0Var.e.ordinal());
        bundle2.putString("session_hash", n0Var.d);
        bundle2.putBoolean("from_auth_sdk", n0Var.b);
        bundle2.putSerializable("reg_origin", n0Var.c);
        bundle2.putString("source", n0Var.f);
        bundle.putBundle("reporter_session_hash", bundle2);
    }

    @Override // defpackage.hq0
    public final boolean onSupportNavigateUp() {
        if (super.onSupportNavigateUp()) {
            return true;
        }
        onBackPressed();
        return true;
    }

    public final com.yandex.passport.internal.ui.domik.base.a p() {
        Stack stack = (Stack) this.d.b;
        com.yandex.passport.internal.ui.base.j D = stack.isEmpty() ? null : com.yandex.passport.common.network.n.D((com.yandex.passport.internal.ui.base.i) stack.peek());
        if (D != null) {
            androidx.fragment.app.o oVar = D.b;
            if (oVar instanceof com.yandex.passport.internal.ui.domik.base.a) {
                return (com.yandex.passport.internal.ui.domik.base.a) oVar;
            }
        }
        androidx.fragment.app.o C = getSupportFragmentManager().C(R.id.container);
        if (C instanceof com.yandex.passport.internal.ui.domik.base.a) {
            return (com.yandex.passport.internal.ui.domik.base.a) C;
        }
        return null;
    }

    public final void q() {
        f fVar = this.k;
        if (fVar.B == null) {
            fVar.B = new com.yandex.passport.internal.network.n(this);
        }
        Boolean bool = (Boolean) fVar.B.d();
        p();
        if (bool == null || bool.booleanValue()) {
            this.i.p();
        } else {
            this.i.q(getString(R.string.passport_network_connecting));
        }
    }

    public final void r() {
        if (p() != null && (!this.e.p.a || ((Stack) this.d.b).size() >= 2)) {
            j();
            return;
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().n(false);
        }
        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(false);
        }
    }
}
