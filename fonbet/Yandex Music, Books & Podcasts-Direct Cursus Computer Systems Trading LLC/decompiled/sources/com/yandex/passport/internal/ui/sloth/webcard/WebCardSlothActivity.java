package com.yandex.passport.internal.ui.sloth.webcard;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.yandex.passport.R;
import defpackage.b1b;
import defpackage.btf;
import defpackage.er0;
import defpackage.ern;
import defpackage.hq0;
import defpackage.jyr;
import defpackage.ndu;
import defpackage.o30;
import defpackage.p30;
import defpackage.tot;
import defpackage.ub7;
import defpackage.vwb;
import defpackage.wdu;
import defpackage.wyf;
import defpackage.x97;
import defpackage.xq0;
import defpackage.ybf;
import defpackage.zsd;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class WebCardSlothActivity extends hq0 {
    public static final /* synthetic */ int e = 0;
    public final jyr a;
    public final jyr b;
    public boolean c;
    public final ybf d;

    public WebCardSlothActivity() {
        final int i = 0;
        this.a = btf.b(new Function0(this) { // from class: com.yandex.passport.internal.ui.sloth.webcard.t0
            public final /* synthetic */ WebCardSlothActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WebCardSlothActivity webCardSlothActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = WebCardSlothActivity.e;
                        Bundle extras = webCardSlothActivity.getIntent().getExtras();
                        if (extras == null) {
                            xq0.q("no extras data");
                            return null;
                        }
                        if (Intrinsics.d(webCardSlothActivity.getIntent().getAction(), "com.yandex.passport.action.DISPLAY_CODE")) {
                            return new j0(extras);
                        }
                        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vwb.O(extras, com.yandex.passport.sloth.data.m.class, "SlothParams") : extras.getParcelable("SlothParams");
                        if (parcelable != null) {
                            return new k0((com.yandex.passport.sloth.data.m) parcelable);
                        }
                        xq0.q("can't get required parcelable SlothParams");
                        return null;
                    case 1:
                        int i4 = WebCardSlothActivity.e;
                        return com.yandex.passport.internal.di.a.a().createWebCardSlothComponent(new x0(webCardSlothActivity, (l0) webCardSlothActivity.a.getValue()));
                    default:
                        int i5 = WebCardSlothActivity.e;
                        return webCardSlothActivity.k().getViewModelFactory();
                }
            }
        });
        final int i2 = 1;
        this.b = btf.b(new Function0(this) { // from class: com.yandex.passport.internal.ui.sloth.webcard.t0
            public final /* synthetic */ WebCardSlothActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WebCardSlothActivity webCardSlothActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = WebCardSlothActivity.e;
                        Bundle extras = webCardSlothActivity.getIntent().getExtras();
                        if (extras == null) {
                            xq0.q("no extras data");
                            return null;
                        }
                        if (Intrinsics.d(webCardSlothActivity.getIntent().getAction(), "com.yandex.passport.action.DISPLAY_CODE")) {
                            return new j0(extras);
                        }
                        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vwb.O(extras, com.yandex.passport.sloth.data.m.class, "SlothParams") : extras.getParcelable("SlothParams");
                        if (parcelable != null) {
                            return new k0((com.yandex.passport.sloth.data.m) parcelable);
                        }
                        xq0.q("can't get required parcelable SlothParams");
                        return null;
                    case 1:
                        int i4 = WebCardSlothActivity.e;
                        return com.yandex.passport.internal.di.a.a().createWebCardSlothComponent(new x0(webCardSlothActivity, (l0) webCardSlothActivity.a.getValue()));
                    default:
                        int i5 = WebCardSlothActivity.e;
                        return webCardSlothActivity.k().getViewModelFactory();
                }
            }
        });
        final int i3 = 2;
        this.d = new ybf(ern.a(k1.class), new v0(this, 0), new Function0(this) { // from class: com.yandex.passport.internal.ui.sloth.webcard.t0
            public final /* synthetic */ WebCardSlothActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WebCardSlothActivity webCardSlothActivity = this.b;
                switch (i22) {
                    case 0:
                        int i32 = WebCardSlothActivity.e;
                        Bundle extras = webCardSlothActivity.getIntent().getExtras();
                        if (extras == null) {
                            xq0.q("no extras data");
                            return null;
                        }
                        if (Intrinsics.d(webCardSlothActivity.getIntent().getAction(), "com.yandex.passport.action.DISPLAY_CODE")) {
                            return new j0(extras);
                        }
                        Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vwb.O(extras, com.yandex.passport.sloth.data.m.class, "SlothParams") : extras.getParcelable("SlothParams");
                        if (parcelable != null) {
                            return new k0((com.yandex.passport.sloth.data.m) parcelable);
                        }
                        xq0.q("can't get required parcelable SlothParams");
                        return null;
                    case 1:
                        int i4 = WebCardSlothActivity.e;
                        return com.yandex.passport.internal.di.a.a().createWebCardSlothComponent(new x0(webCardSlothActivity, (l0) webCardSlothActivity.a.getValue()));
                    default:
                        int i5 = WebCardSlothActivity.e;
                        return webCardSlothActivity.k().getViewModelFactory();
                }
            }
        }, new v0(this, 1));
    }

    public final void j() {
        o30 o30Var = new o30(this);
        o30Var.b(R.string.passport_fatal_error_dialog_text);
        o30Var.a(R.string.passport_error_unknown);
        o30Var.a.m = false;
        o30Var.setPositiveButton(R.string.passport_fatal_error_dialog_button, new com.yandex.passport.internal.ui.sloth.o(3, this));
        p30 create = o30Var.create();
        create.getClass();
        create.show();
    }

    public final w0 k() {
        return (w0) this.b.getValue();
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        b1b.b(this);
        Continuation continuation = null;
        if (-1 != ((er0) getDelegate()).z0) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Setting theme to " + getTheme() + " with nightMode=-1, was " + ((er0) getDelegate()).z0, 8);
            }
            getDelegate().n(-1);
        }
        super.onCreate(bundle);
        int i = 3;
        if (isFinishing() || isChangingConfigurations() || this.c) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Should recreate activity: isFinishing=" + isFinishing() + " isChangingConfigurations=" + isChangingConfigurations() + " isGoingToRecreate=" + this.c, 8);
            }
            x97.y(wyf.F(getLifecycle()), null, null, new com.yandex.passport.internal.ui.sloth.q(this, continuation, 9), 3);
            return;
        }
        View decorView = getWindow().getDecorView();
        tot totVar = new tot(27, this);
        WeakHashMap weakHashMap = wdu.a;
        ndu.n(decorView, totVar);
        setContentView(k().getUi().e());
        l0 l0Var = (l0) this.a.getValue();
        l0Var.getClass();
        k0 k0Var = l0Var instanceof k0 ? (k0) l0Var : null;
        int i2 = 0;
        if ((k0Var != null ? k0Var.a.a : null) instanceof com.yandex.passport.sloth.data.d0) {
            e1 ui = k().getUi();
            ui.getClass();
            ui.O(Float.valueOf(0.0f), 0, 0, 0, c1.b, 0L);
            View e2 = ui.e();
            int color = ui.d.getColor(R.color.passport_roundabout_background);
            e2.getClass();
            e2.setBackgroundColor(color);
        }
        com.yandex.passport.sloth.ui.b0 b0Var = (com.yandex.passport.sloth.ui.b0) k().getUi().e.d.getValue();
        com.yandex.passport.sloth.ui.s0 s0Var = b0Var.m;
        s0Var.d = new com.yandex.passport.sloth.ui.r(b0Var, i2);
        s0Var.f(com.yandex.passport.sloth.ui.p0.b, false);
        ybf ybfVar = this.d;
        zsd.r0(wyf.F(getLifecycle()), new ub7(12, ((k1) ybfVar.getValue()).A, new u0(this, continuation, i2)));
        zsd.r0(wyf.F(getLifecycle()), new ub7(12, ((k1) ybfVar.getValue()).u, new u0(this, continuation, 1)));
        zsd.r0(wyf.F(getLifecycle()), new ub7(12, ((k1) ybfVar.getValue()).w, new u0(this, continuation, 2)));
        zsd.r0(wyf.F(getLifecycle()), new ub7(12, ((k1) ybfVar.getValue()).y, new u0(this, continuation, i)));
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onDestroy()", 8);
        }
    }

    @Override // android.app.Activity
    public final void recreate() {
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "isGoingToRecreate = true", 8);
        }
        this.c = true;
        super.recreate();
    }
}
