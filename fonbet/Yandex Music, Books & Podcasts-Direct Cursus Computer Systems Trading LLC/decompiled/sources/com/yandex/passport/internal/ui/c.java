package com.yandex.passport.internal.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import com.yandex.passport.R;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.flags.experiments.o;
import com.yandex.passport.internal.flags.experiments.q;
import defpackage.hq0;
import defpackage.qd;
import defpackage.tn3;
import defpackage.tot;
import defpackage.y2x;

/* loaded from: classes4.dex */
public abstract class c extends hq0 {
    public com.yandex.passport.legacy.lx.j a;
    public com.yandex.passport.internal.core.accounts.k b;
    public o0 c;

    @Override // defpackage.hq0, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        com.yandex.passport.internal.helper.h localeHelper = com.yandex.passport.internal.di.a.a().getLocaleHelper();
        super.attachBaseContext(localeHelper.b(context));
        localeHelper.b(this);
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        com.yandex.passport.internal.e k = k();
        if (k != null) {
            overridePendingTransition(k.e, k.f);
        }
    }

    public final void j() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().n(true);
        }
        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }
        qd supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            Resources.Theme theme = getTheme();
            int i = R.attr.passportBackButtonDrawable;
            int i2 = R.drawable.passport_back;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(new int[]{i});
            try {
                Drawable w = y2x.w(this, obtainStyledAttributes.getResourceId(0, i2));
                obtainStyledAttributes.recycle();
                supportActionBar.o(w);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    public com.yandex.passport.internal.e k() {
        return null;
    }

    public final boolean l(MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.b = a.getAndroidAccountManagerHelper();
        this.c = a.getEventReporter();
        q experimentsUpdater = a.getExperimentsUpdater();
        o oVar = o.b;
        com.yandex.passport.common.core.a aVar = com.yandex.passport.common.core.b.b;
        experimentsUpdater.a(oVar);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            if (getSupportFragmentManager().H() > 0) {
                getSupportFragmentManager().T();
                return true;
            }
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public void onPause() {
        com.yandex.passport.legacy.lx.j jVar = this.a;
        if (jVar != null) {
            jVar.a();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public void onResume() {
        super.onResume();
        this.a = new com.yandex.passport.legacy.lx.e(new com.yandex.passport.legacy.lx.i(new tn3(7, this))).h(new tot(15, this), new androidx.core.app.q(14));
    }
}
