package com.yandex.passport.internal.ui.router;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.passport.R;
import com.yandex.passport.api.y1;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.k0;
import com.yandex.passport.internal.push.w0;
import defpackage.b6e;
import defpackage.btf;
import defpackage.dxd;
import defpackage.er0;
import defpackage.ern;
import defpackage.hq0;
import defpackage.in5;
import defpackage.jk6;
import defpackage.jyr;
import defpackage.kws;
import defpackage.ph;
import defpackage.szf;
import defpackage.vwb;
import defpackage.wn5;
import defpackage.wyf;
import defpackage.x6k;
import defpackage.x97;
import defpackage.ybf;
import defpackage.zh;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class GlobalRouterActivity extends hq0 {
    public static final /* synthetic */ int i = 0;
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public boolean f;
    public final ybf a = new ybf(ern.a(q.class), new d(this, 0), new w0(16), new d(this, 1));
    public final zh b = registerForActivityResult(new dxd(2, new jk6(0, 8, GlobalRouterActivity.class, this, "viewModel", "getViewModel()Lcom/yandex/passport/internal/ui/router/GlobalRouterViewModel;")), new com.yandex.passport.internal.links.j(this, 2));
    public final x6k g = szf.g0(f.a);
    public final c h = new c(this);

    public GlobalRouterActivity() {
        final int i2 = 0;
        this.c = btf.b(new Function0(this) { // from class: com.yandex.passport.internal.ui.router.a
            public final /* synthetic */ GlobalRouterActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                k0 k0Var;
                int i3 = i2;
                GlobalRouterActivity globalRouterActivity = this.b;
                switch (i3) {
                    case 0:
                        int i4 = GlobalRouterActivity.i;
                        return new k(globalRouterActivity, 10);
                    case 1:
                        int i5 = GlobalRouterActivity.i;
                        Bundle extras = globalRouterActivity.getIntent().getExtras();
                        if (extras != null) {
                            try {
                                extras.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
                                com.yandex.passport.internal.properties.l lVar = (com.yandex.passport.internal.properties.l) extras.getParcelable("passport-login-properties");
                                if (lVar != null) {
                                    return lVar;
                                }
                                throw new IllegalStateException("Bundle has no ".concat(com.yandex.passport.internal.properties.l.class.getSimpleName()).toString());
                            } catch (Exception unused) {
                            }
                        }
                        return null;
                    default:
                        int i6 = GlobalRouterActivity.i;
                        com.yandex.passport.internal.properties.l lVar2 = (com.yandex.passport.internal.properties.l) globalRouterActivity.d.getValue();
                        return Boolean.valueOf((lVar2 == null || (k0Var = lVar2.p) == null) ? false : k0Var.o);
                }
            }
        });
        final int i3 = 1;
        this.d = btf.b(new Function0(this) { // from class: com.yandex.passport.internal.ui.router.a
            public final /* synthetic */ GlobalRouterActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                k0 k0Var;
                int i32 = i3;
                GlobalRouterActivity globalRouterActivity = this.b;
                switch (i32) {
                    case 0:
                        int i4 = GlobalRouterActivity.i;
                        return new k(globalRouterActivity, 10);
                    case 1:
                        int i5 = GlobalRouterActivity.i;
                        Bundle extras = globalRouterActivity.getIntent().getExtras();
                        if (extras != null) {
                            try {
                                extras.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
                                com.yandex.passport.internal.properties.l lVar = (com.yandex.passport.internal.properties.l) extras.getParcelable("passport-login-properties");
                                if (lVar != null) {
                                    return lVar;
                                }
                                throw new IllegalStateException("Bundle has no ".concat(com.yandex.passport.internal.properties.l.class.getSimpleName()).toString());
                            } catch (Exception unused) {
                            }
                        }
                        return null;
                    default:
                        int i6 = GlobalRouterActivity.i;
                        com.yandex.passport.internal.properties.l lVar2 = (com.yandex.passport.internal.properties.l) globalRouterActivity.d.getValue();
                        return Boolean.valueOf((lVar2 == null || (k0Var = lVar2.p) == null) ? false : k0Var.o);
                }
            }
        });
        final int i4 = 2;
        this.e = btf.b(new Function0(this) { // from class: com.yandex.passport.internal.ui.router.a
            public final /* synthetic */ GlobalRouterActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                k0 k0Var;
                int i32 = i4;
                GlobalRouterActivity globalRouterActivity = this.b;
                switch (i32) {
                    case 0:
                        int i42 = GlobalRouterActivity.i;
                        return new k(globalRouterActivity, 10);
                    case 1:
                        int i5 = GlobalRouterActivity.i;
                        Bundle extras = globalRouterActivity.getIntent().getExtras();
                        if (extras != null) {
                            try {
                                extras.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
                                com.yandex.passport.internal.properties.l lVar = (com.yandex.passport.internal.properties.l) extras.getParcelable("passport-login-properties");
                                if (lVar != null) {
                                    return lVar;
                                }
                                throw new IllegalStateException("Bundle has no ".concat(com.yandex.passport.internal.properties.l.class.getSimpleName()).toString());
                            } catch (Exception unused) {
                            }
                        }
                        return null;
                    default:
                        int i6 = GlobalRouterActivity.i;
                        com.yandex.passport.internal.properties.l lVar2 = (com.yandex.passport.internal.properties.l) globalRouterActivity.d.getValue();
                        return Boolean.valueOf((lVar2 == null || (k0Var = lVar2.p) == null) ? false : k0Var.o);
                }
            }
        });
    }

    public static final void j(GlobalRouterActivity globalRouterActivity, ph phVar) {
        globalRouterActivity.setResult(phVar.a.b, phVar.b);
        globalRouterActivity.finish();
        if (globalRouterActivity.k()) {
            int i2 = R.anim.passport_smooth_close;
            if (Build.VERSION.SDK_INT >= 34) {
                globalRouterActivity.overrideActivityTransition(1, 0, i2);
            } else {
                globalRouterActivity.overridePendingTransition(0, i2);
            }
        }
    }

    public final boolean k() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        y1 y1Var;
        i iVar;
        y1 y1Var2;
        int i2;
        Continuation continuation = null;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Global Route with " + getIntent(), 8);
        }
        boolean k = k();
        jyr jyrVar = this.d;
        if (k) {
            com.yandex.passport.internal.properties.l lVar = (com.yandex.passport.internal.properties.l) jyrVar.getValue();
            if (lVar == null || (y1Var2 = lVar.e) == null) {
                y1Var2 = y1.d;
            }
            int ordinal = y1Var2.ordinal();
            if (ordinal != 0) {
                i2 = 2;
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            b6e.s();
                            return;
                        }
                        i2 = -1;
                    }
                }
                if (i2 != ((er0) getDelegate()).z0) {
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Setting theme to " + y1Var2 + " with nightMode=" + i2 + ", was " + ((er0) getDelegate()).z0, 8);
                    }
                    getDelegate().n(i2);
                }
            }
            i2 = 1;
            if (i2 != ((er0) getDelegate()).z0) {
            }
        }
        super.onCreate(bundle);
        if (k()) {
            if (isFinishing() || isChangingConfigurations() || this.f) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Should recreate activity: isFinishing=" + isFinishing() + " isChangingConfigurations=" + isChangingConfigurations() + " isGoingToRecreate=" + this.f, 8);
                }
                x97.y(wyf.F(getLifecycle()), null, null, new com.yandex.passport.internal.provider.communication.c(this, continuation, 26), 3);
                return;
            }
            PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
            if (bundle != null && (iVar = (i) vwb.O(bundle, i.class, "BACKGROUND_STATE_KEY")) != null) {
                this.g.setValue(iVar);
            }
            if (((Boolean) a.getFlagRepository().b(com.yandex.passport.internal.flags.o.d0)).booleanValue()) {
                com.yandex.passport.internal.properties.l lVar2 = (com.yandex.passport.internal.properties.l) jyrVar.getValue();
                if (lVar2 == null || (y1Var = lVar2.e) == null) {
                    y1Var = y1.d;
                }
                in5.a(this, new wn5(new kws(26, com.yandex.plus.pay.ui.core.b.G(y1Var), a, this), 1631901768, true));
            } else {
                setContentView(((k) this.c.getValue()).e());
            }
        }
        x97.y(wyf.F(getLifecycle()), null, null, new com.yandex.passport.internal.provider.communication.c(((q) this.a.getValue()).m, continuation, this, 25), 3);
        x97.y(wyf.F(getLifecycle()), null, null, new com.yandex.passport.internal.provider.communication.c(this, bundle, continuation, 27), 3);
        if (k()) {
            getApplication().registerActivityLifecycleCallbacks(this.h);
        }
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (k()) {
            getApplication().unregisterActivityLifecycleCallbacks(this.h);
        }
    }

    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("BACKGROUND_STATE_KEY", (Parcelable) this.g.getValue());
    }

    @Override // android.app.Activity
    public final void recreate() {
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "isGoingToRecreate = true", 8);
        }
        this.f = true;
        super.recreate();
    }
}
