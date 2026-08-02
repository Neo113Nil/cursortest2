package defpackage;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.d1;
import androidx.core.app.f;
import androidx.fragment.app.t;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class hq0 extends t implements kq0 {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private rq0 mDelegate;
    private Resources mResources;

    public hq0() {
        getSavedStateRegistry().c(DELEGATE_TAG, new fq0(this));
        addOnContextAvailableListener(new gq0(this));
    }

    @Override // defpackage.hn5, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        er0 er0Var = (er0) getDelegate();
        er0Var.A();
        ((ViewGroup) er0Var.B.findViewById(R.id.content)).addView(view, layoutParams);
        er0Var.m.a(er0Var.l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration;
        er0 er0Var = (er0) getDelegate();
        er0Var.v0 = true;
        int i = er0Var.z0;
        if (i == -100) {
            i = rq0.b;
        }
        int H = er0Var.H(context, i);
        if (rq0.f(context)) {
            rq0.q(context);
        }
        dqg t = er0Var.t(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(er0.x(context, H, t, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof uf6) {
            try {
                ((uf6) context).a(er0.x(context, H, t, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (er0.Q0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i2 = configuration3.mcc;
                    int i3 = configuration4.mcc;
                    if (i2 != i3) {
                        configuration.mcc = i3;
                    }
                    int i4 = configuration3.mnc;
                    int i5 = configuration4.mnc;
                    if (i4 != i5) {
                        configuration.mnc = i5;
                    }
                    wq0.a(configuration3, configuration4, configuration);
                    int i6 = configuration3.touchscreen;
                    int i7 = configuration4.touchscreen;
                    if (i6 != i7) {
                        configuration.touchscreen = i7;
                    }
                    int i8 = configuration3.keyboard;
                    int i9 = configuration4.keyboard;
                    if (i8 != i9) {
                        configuration.keyboard = i9;
                    }
                    int i10 = configuration3.keyboardHidden;
                    int i11 = configuration4.keyboardHidden;
                    if (i10 != i11) {
                        configuration.keyboardHidden = i11;
                    }
                    int i12 = configuration3.navigation;
                    int i13 = configuration4.navigation;
                    if (i12 != i13) {
                        configuration.navigation = i13;
                    }
                    int i14 = configuration3.navigationHidden;
                    int i15 = configuration4.navigationHidden;
                    if (i14 != i15) {
                        configuration.navigationHidden = i15;
                    }
                    int i16 = configuration3.orientation;
                    int i17 = configuration4.orientation;
                    if (i16 != i17) {
                        configuration.orientation = i17;
                    }
                    int i18 = configuration3.screenLayout & 15;
                    int i19 = configuration4.screenLayout & 15;
                    if (i18 != i19) {
                        configuration.screenLayout |= i19;
                    }
                    int i20 = configuration3.screenLayout & 192;
                    int i21 = configuration4.screenLayout & 192;
                    if (i20 != i21) {
                        configuration.screenLayout |= i21;
                    }
                    int i22 = configuration3.screenLayout & 48;
                    int i23 = configuration4.screenLayout & 48;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 768;
                    int i25 = configuration4.screenLayout & 768;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        gvt.l(configuration3, configuration4, configuration);
                    }
                    int i26 = configuration3.uiMode & 15;
                    int i27 = configuration4.uiMode & 15;
                    if (i26 != i27) {
                        configuration.uiMode |= i27;
                    }
                    int i28 = configuration3.uiMode & 48;
                    int i29 = configuration4.uiMode & 48;
                    if (i28 != i29) {
                        configuration.uiMode |= i29;
                    }
                    int i30 = configuration3.screenWidthDp;
                    int i31 = configuration4.screenWidthDp;
                    if (i30 != i31) {
                        configuration.screenWidthDp = i31;
                    }
                    int i32 = configuration3.screenHeightDp;
                    int i33 = configuration4.screenHeightDp;
                    if (i32 != i33) {
                        configuration.screenHeightDp = i33;
                    }
                    int i34 = configuration3.smallestScreenWidthDp;
                    int i35 = configuration4.smallestScreenWidthDp;
                    if (i34 != i35) {
                        configuration.smallestScreenWidthDp = i35;
                    }
                    int i36 = configuration3.densityDpi;
                    int i37 = configuration4.densityDpi;
                    if (i36 != i37) {
                        configuration.densityDpi = i37;
                    }
                }
            }
            Configuration x = er0.x(context, H, t, configuration, true);
            uf6 uf6Var = new uf6(context, ru.yandex.music.R.style.Theme_AppCompat_Empty);
            uf6Var.a(x);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = uf6Var.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        mi.C(theme);
                    } else {
                        synchronized (h4a.k) {
                            if (!h4a.m) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    h4a.l = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                }
                                h4a.m = true;
                            }
                            Method method = h4a.l;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e2) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                    h4a.l = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = uf6Var;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        qd supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.i, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        qd supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.k(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        er0 er0Var = (er0) getDelegate();
        er0Var.A();
        return (T) er0Var.l.findViewById(i);
    }

    @NonNull
    public rq0 getDelegate() {
        if (this.mDelegate == null) {
            qhp qhpVar = rq0.a;
            this.mDelegate = new er0(this, null, this, this);
        }
        return this.mDelegate;
    }

    public ke getDrawerToggleDelegate() {
        ((er0) getDelegate()).getClass();
        return new e3s(13);
    }

    @Override // android.app.Activity
    @NonNull
    public MenuInflater getMenuInflater() {
        er0 er0Var = (er0) getDelegate();
        if (er0Var.p == null) {
            er0Var.F();
            qd qdVar = er0Var.o;
            er0Var.p = new msr(qdVar != null ? qdVar.e() : er0Var.k);
        }
        return er0Var.p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i = lzt.a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public qd getSupportActionBar() {
        er0 er0Var = (er0) getDelegate();
        er0Var.F();
        return er0Var.o;
    }

    public Intent getSupportParentActivityIntent() {
        return f.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().e();
    }

    @Override // defpackage.hn5, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        er0 er0Var = (er0) getDelegate();
        if (er0Var.G && er0Var.A) {
            er0Var.F();
            qd qdVar = er0Var.o;
            if (qdVar != null) {
                qdVar.h();
            }
        }
        ir0 a = ir0.a();
        Context context = er0Var.k;
        synchronized (a) {
            w2o w2oVar = a.a;
            synchronized (w2oVar) {
                ovg ovgVar = (ovg) w2oVar.b.get(context);
                if (ovgVar != null) {
                    ovgVar.b();
                }
            }
        }
        er0Var.y0 = new Configuration(er0Var.k.getResources().getConfiguration());
        er0Var.r(false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(@NonNull d1 d1Var) {
        d1Var.getClass();
        ArrayList arrayList = d1Var.a;
        hq0 hq0Var = d1Var.b;
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = f.a(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(hq0Var.getPackageManager());
            }
            int size = arrayList.size();
            try {
                for (Intent b = f.b(hq0Var, component); b != null; b = f.b(hq0Var, b.getComponent())) {
                    arrayList.add(size, b);
                }
                arrayList.add(supportParentActivityIntent);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                xq0.t(e);
            }
        }
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().h();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        qd supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // defpackage.hn5, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, @NonNull Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((er0) getDelegate()).A();
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        er0 er0Var = (er0) getDelegate();
        er0Var.F();
        qd qdVar = er0Var.o;
        if (qdVar != null) {
            qdVar.p(true);
        }
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public void onStart() {
        super.onStart();
        ((er0) getDelegate()).r(true, false);
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public void onStop() {
        super.onStop();
        er0 er0Var = (er0) getDelegate();
        er0Var.F();
        qd qdVar = er0Var.o;
        if (qdVar != null) {
            qdVar.p(false);
        }
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        d1 d1Var = new d1(this);
        onCreateSupportNavigateUpTaskStack(d1Var);
        onPrepareSupportNavigateUpTaskStack(d1Var);
        ArrayList arrayList = d1Var.a;
        if (arrayList.isEmpty()) {
            xq0.q("No intents added to TaskStackBuilder; cannot startActivities");
            return false;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        d1Var.b.startActivities(intentArr, null);
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().o(charSequence);
    }

    @Override // defpackage.kq0
    public ig onWindowStartingSupportActionMode(@NonNull hg hgVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        qd supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.l()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // defpackage.hn5, android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        getDelegate().k(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        er0 er0Var = (er0) getDelegate();
        if (er0Var.j instanceof Activity) {
            er0Var.F();
            qd qdVar = er0Var.o;
            if (qdVar instanceof hpv) {
                xq0.q("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                return;
            }
            er0Var.p = null;
            if (qdVar != null) {
                qdVar.i();
            }
            er0Var.o = null;
            if (toolbar != null) {
                Object obj = er0Var.j;
                tos tosVar = new tos(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : er0Var.q, er0Var.m);
                er0Var.o = tosVar;
                er0Var.m.b = tosVar.c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                er0Var.m.b = null;
            }
            er0Var.e();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        ((er0) getDelegate()).A0 = i;
    }

    public ig startSupportActionMode(@NonNull hg hgVar) {
        return getDelegate().p(hgVar);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().e();
    }

    public void supportNavigateUpTo(@NonNull Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().j(i);
    }

    public boolean supportShouldUpRecreateTask(@NonNull Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    @Override // defpackage.hn5, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().l(view);
    }

    @Override // defpackage.hn5, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().m(view, layoutParams);
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public hq0(int i) {
        super(i);
        getSavedStateRegistry().c(DELEGATE_TAG, new fq0(this));
        addOnContextAvailableListener(new gq0(this));
    }

    public void onLocalesChanged(@NonNull dqg dqgVar) {
    }

    public void onNightModeChanged(int i) {
    }

    public void onPrepareSupportNavigateUpTaskStack(@NonNull d1 d1Var) {
    }

    @Override // defpackage.kq0
    public void onSupportActionModeFinished(@NonNull ig igVar) {
    }

    @Override // defpackage.kq0
    public void onSupportActionModeStarted(@NonNull ig igVar) {
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }
}
