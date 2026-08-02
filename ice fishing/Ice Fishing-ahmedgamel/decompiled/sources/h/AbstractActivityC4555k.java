package h;

import D.AbstractC0279i;
import D.P;
import D.Q;
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
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractActivityC0484x;
import com.IceFishing.LiveIceFishing.C5248R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import k.AbstractC4625b;
import k.C4627d;
import k.C4632i;
import k.InterfaceC4624a;
import m.C4723s;
import m.I0;
import m.d1;

/* renamed from: h.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC4555k extends AbstractActivityC0484x implements InterfaceC4556l, P, InterfaceC4547c {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private p mDelegate;
    private Resources mResources;

    public AbstractActivityC4555k() {
        getSavedStateRegistry().c(DELEGATE_TAG, new C4553i(this));
        addOnContextAvailableListener(new C4554j(this));
    }

    @Override // androidx.activity.p, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = (LayoutInflaterFactory2C4537A) getDelegate();
        layoutInflaterFactory2C4537A.x();
        ((ViewGroup) layoutInflaterFactory2C4537A.f37806T.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C4537A.f37790F.a(layoutInflaterFactory2C4537A.f37788E.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration configuration;
        int i;
        int i4;
        int i6;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = (LayoutInflaterFactory2C4537A) getDelegate();
        layoutInflaterFactory2C4537A.f37818p0 = true;
        int i15 = layoutInflaterFactory2C4537A.f37822t0;
        if (i15 == -100) {
            i15 = p.f37932u;
        }
        int E8 = layoutInflaterFactory2C4537A.E(context, i15);
        if (p.c(context) && p.c(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (p.f37930B) {
                    try {
                        K.l lVar = p.f37933v;
                        if (lVar == null) {
                            if (p.f37934w == null) {
                                p.f37934w = K.l.a(AbstractC0279i.e(context));
                            }
                            if (!p.f37934w.f1592a.f1593a.isEmpty()) {
                                p.f37933v = p.f37934w;
                            }
                        } else if (!lVar.equals(p.f37934w)) {
                            K.l lVar2 = p.f37933v;
                            p.f37934w = lVar2;
                            AbstractC0279i.d(context, lVar2.f1592a.f1593a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!p.f37936y) {
                p.f37931n.execute(new RunnableC4557m(context, i14));
            }
        }
        K.l q8 = LayoutInflaterFactory2C4537A.q(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C4537A.u(context, E8, q8, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C4627d) {
            try {
                ((C4627d) context).a(LayoutInflaterFactory2C4537A.u(context, E8, q8, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (LayoutInflaterFactory2C4537A.f37782K0) {
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
                    float f2 = configuration3.fontScale;
                    float f9 = configuration4.fontScale;
                    if (f2 != f9) {
                        configuration.fontScale = f9;
                    }
                    int i16 = configuration3.mcc;
                    int i17 = configuration4.mcc;
                    if (i16 != i17) {
                        configuration.mcc = i17;
                    }
                    int i18 = configuration3.mnc;
                    int i19 = configuration4.mnc;
                    if (i18 != i19) {
                        configuration.mnc = i19;
                    }
                    int i20 = Build.VERSION.SDK_INT;
                    u.a(configuration3, configuration4, configuration);
                    int i21 = configuration3.touchscreen;
                    int i22 = configuration4.touchscreen;
                    if (i21 != i22) {
                        configuration.touchscreen = i22;
                    }
                    int i23 = configuration3.keyboard;
                    int i24 = configuration4.keyboard;
                    if (i23 != i24) {
                        configuration.keyboard = i24;
                    }
                    int i25 = configuration3.keyboardHidden;
                    int i26 = configuration4.keyboardHidden;
                    if (i25 != i26) {
                        configuration.keyboardHidden = i26;
                    }
                    int i27 = configuration3.navigation;
                    int i28 = configuration4.navigation;
                    if (i27 != i28) {
                        configuration.navigation = i28;
                    }
                    int i29 = configuration3.navigationHidden;
                    int i30 = configuration4.navigationHidden;
                    if (i29 != i30) {
                        configuration.navigationHidden = i30;
                    }
                    int i31 = configuration3.orientation;
                    int i32 = configuration4.orientation;
                    if (i31 != i32) {
                        configuration.orientation = i32;
                    }
                    int i33 = configuration3.screenLayout & 15;
                    int i34 = configuration4.screenLayout & 15;
                    if (i33 != i34) {
                        configuration.screenLayout |= i34;
                    }
                    int i35 = configuration3.screenLayout & 192;
                    int i36 = configuration4.screenLayout & 192;
                    if (i35 != i36) {
                        configuration.screenLayout |= i36;
                    }
                    int i37 = configuration3.screenLayout & 48;
                    int i38 = configuration4.screenLayout & 48;
                    if (i37 != i38) {
                        configuration.screenLayout |= i38;
                    }
                    int i39 = configuration3.screenLayout & 768;
                    int i40 = configuration4.screenLayout & 768;
                    if (i39 != i40) {
                        configuration.screenLayout |= i40;
                    }
                    if (i20 >= 26) {
                        i = configuration3.colorMode;
                        int i41 = i & 3;
                        i4 = configuration4.colorMode;
                        if (i41 != (i4 & 3)) {
                            i12 = configuration.colorMode;
                            i13 = configuration4.colorMode;
                            configuration.colorMode = i12 | (i13 & 3);
                        }
                        i6 = configuration3.colorMode;
                        int i42 = i6 & 12;
                        i9 = configuration4.colorMode;
                        if (i42 != (i9 & 12)) {
                            i10 = configuration.colorMode;
                            i11 = configuration4.colorMode;
                            configuration.colorMode = i10 | (i11 & 12);
                        }
                    }
                    int i43 = configuration3.uiMode & 15;
                    int i44 = configuration4.uiMode & 15;
                    if (i43 != i44) {
                        configuration.uiMode |= i44;
                    }
                    int i45 = configuration3.uiMode & 48;
                    int i46 = configuration4.uiMode & 48;
                    if (i45 != i46) {
                        configuration.uiMode |= i46;
                    }
                    int i47 = configuration3.screenWidthDp;
                    int i48 = configuration4.screenWidthDp;
                    if (i47 != i48) {
                        configuration.screenWidthDp = i48;
                    }
                    int i49 = configuration3.screenHeightDp;
                    int i50 = configuration4.screenHeightDp;
                    if (i49 != i50) {
                        configuration.screenHeightDp = i50;
                    }
                    int i51 = configuration3.smallestScreenWidthDp;
                    int i52 = configuration4.smallestScreenWidthDp;
                    if (i51 != i52) {
                        configuration.smallestScreenWidthDp = i52;
                    }
                    int i53 = configuration3.densityDpi;
                    int i54 = configuration4.densityDpi;
                    if (i53 != i54) {
                        configuration.densityDpi = i54;
                    }
                }
            }
            Configuration u6 = LayoutInflaterFactory2C4537A.u(context, E8, q8, configuration, true);
            C4627d c4627d = new C4627d(context, C5248R.style.Theme_AppCompat_Empty);
            c4627d.a(u6);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = c4627d.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        F.p.a(theme);
                    } else {
                        synchronized (F.b.f912e) {
                            if (!F.b.f914g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                                    F.b.f913f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e9) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e9);
                                }
                                F.b.f914g = true;
                            }
                            Method method = F.b.f913f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, new Object[0]);
                                } catch (IllegalAccessException | InvocationTargetException e10) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e10);
                                    F.b.f913f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = c4627d;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC4545a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // D.AbstractActivityC0283m, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC4545a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = (LayoutInflaterFactory2C4537A) getDelegate();
        layoutInflaterFactory2C4537A.x();
        return (T) layoutInflaterFactory2C4537A.f37788E.findViewById(i);
    }

    public p getDelegate() {
        if (this.mDelegate == null) {
            T0.l lVar = p.f37931n;
            this.mDelegate = new LayoutInflaterFactory2C4537A(this, null, this, this);
        }
        return this.mDelegate;
    }

    @Override // h.InterfaceC4547c
    public InterfaceC4546b getDrawerToggleDelegate() {
        LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = (LayoutInflaterFactory2C4537A) getDelegate();
        layoutInflaterFactory2C4537A.getClass();
        return new I0.j(24, layoutInflaterFactory2C4537A);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = (LayoutInflaterFactory2C4537A) getDelegate();
        if (layoutInflaterFactory2C4537A.f37796I == null) {
            layoutInflaterFactory2C4537A.C();
            AbstractC4545a abstractC4545a = layoutInflaterFactory2C4537A.f37794H;
            layoutInflaterFactory2C4537A.f37796I = new C4632i(abstractC4545a != null ? abstractC4545a.e() : layoutInflaterFactory2C4537A.f37786D);
        }
        return layoutInflaterFactory2C4537A.f37796I;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i = d1.f39199a;
        }
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC4545a getSupportActionBar() {
        LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = (LayoutInflaterFactory2C4537A) getDelegate();
        layoutInflaterFactory2C4537A.C();
        return layoutInflaterFactory2C4537A.f37794H;
    }

    @Override // D.P
    public Intent getSupportParentActivityIntent() {
        return AbstractC0279i.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().b();
    }

    @Override // androidx.activity.p, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = (LayoutInflaterFactory2C4537A) getDelegate();
        if (layoutInflaterFactory2C4537A.Y && layoutInflaterFactory2C4537A.f37805S) {
            layoutInflaterFactory2C4537A.C();
            AbstractC4545a abstractC4545a = layoutInflaterFactory2C4537A.f37794H;
            if (abstractC4545a != null) {
                abstractC4545a.g();
            }
        }
        C4723s a9 = C4723s.a();
        Context context = layoutInflaterFactory2C4537A.f37786D;
        synchronized (a9) {
            I0 i02 = a9.f39292a;
            synchronized (i02) {
                s.e eVar = (s.e) i02.f39084b.get(context);
                if (eVar != null) {
                    eVar.h();
                }
            }
        }
        layoutInflaterFactory2C4537A.f37821s0 = new Configuration(layoutInflaterFactory2C4537A.f37786D.getResources().getConfiguration());
        layoutInflaterFactory2C4537A.o(false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(Q q8) {
        q8.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = AbstractC0279i.a(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            AbstractActivityC4555k abstractActivityC4555k = q8.f361u;
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(abstractActivityC4555k.getPackageManager());
            }
            ArrayList arrayList = q8.f360n;
            int size = arrayList.size();
            try {
                for (Intent b9 = AbstractC0279i.b(abstractActivityC4555k, component); b9 != null; b9 = AbstractC0279i.b(abstractActivityC4555k, b9.getComponent())) {
                    arrayList.add(size, b9);
                }
                arrayList.add(supportParentActivityIntent);
            } catch (PackageManager.NameNotFoundException e9) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e9);
            }
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0484x, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.AbstractActivityC0484x, androidx.activity.p, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC4545a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.activity.p, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C4537A) getDelegate()).x();
    }

    @Override // androidx.fragment.app.AbstractActivityC0484x, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = (LayoutInflaterFactory2C4537A) getDelegate();
        layoutInflaterFactory2C4537A.C();
        AbstractC4545a abstractC4545a = layoutInflaterFactory2C4537A.f37794H;
        if (abstractC4545a != null) {
            abstractC4545a.q(true);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0484x, android.app.Activity
    public void onStart() {
        super.onStart();
        ((LayoutInflaterFactory2C4537A) getDelegate()).o(true, false);
    }

    @Override // androidx.fragment.app.AbstractActivityC0484x, android.app.Activity
    public void onStop() {
        super.onStop();
        LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = (LayoutInflaterFactory2C4537A) getDelegate();
        layoutInflaterFactory2C4537A.C();
        AbstractC4545a abstractC4545a = layoutInflaterFactory2C4537A.f37794H;
        if (abstractC4545a != null) {
            abstractC4545a.q(false);
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
        Q q8 = new Q(this);
        onCreateSupportNavigateUpTaskStack(q8);
        onPrepareSupportNavigateUpTaskStack(q8);
        ArrayList arrayList = q8.f360n;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        q8.f361u.startActivities(intentArr, null);
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
        getDelegate().l(charSequence);
    }

    @Override // h.InterfaceC4556l
    public AbstractC4625b onWindowStartingSupportActionMode(InterfaceC4624a interfaceC4624a) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC4545a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.p, android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        getDelegate().i(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = (LayoutInflaterFactory2C4537A) getDelegate();
        if (layoutInflaterFactory2C4537A.f37785C instanceof Activity) {
            layoutInflaterFactory2C4537A.C();
            AbstractC4545a abstractC4545a = layoutInflaterFactory2C4537A.f37794H;
            if (abstractC4545a instanceof M) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            layoutInflaterFactory2C4537A.f37796I = null;
            if (abstractC4545a != null) {
                abstractC4545a.h();
            }
            layoutInflaterFactory2C4537A.f37794H = null;
            if (toolbar != null) {
                Object obj = layoutInflaterFactory2C4537A.f37785C;
                C4544H c4544h = new C4544H(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : layoutInflaterFactory2C4537A.J, layoutInflaterFactory2C4537A.f37790F);
                layoutInflaterFactory2C4537A.f37794H = c4544h;
                layoutInflaterFactory2C4537A.f37790F.f37944u = c4544h.f37846c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                layoutInflaterFactory2C4537A.f37790F.f37944u = null;
            }
            layoutInflaterFactory2C4537A.b();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C4537A) getDelegate()).f37823u0 = i;
    }

    public AbstractC4625b startSupportActionMode(InterfaceC4624a interfaceC4624a) {
        return getDelegate().n(interfaceC4624a);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().b();
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().g(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }

    @Override // androidx.activity.p, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().j(view);
    }

    @Override // androidx.activity.p, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().k(view, layoutParams);
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public void onLocalesChanged(K.l lVar) {
    }

    public void onNightModeChanged(int i) {
    }

    public void onPrepareSupportNavigateUpTaskStack(Q q8) {
    }

    @Override // h.InterfaceC4556l
    public void onSupportActionModeFinished(AbstractC4625b abstractC4625b) {
    }

    @Override // h.InterfaceC4556l
    public void onSupportActionModeStarted(AbstractC4625b abstractC4625b) {
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z6) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z6) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z6) {
    }
}
