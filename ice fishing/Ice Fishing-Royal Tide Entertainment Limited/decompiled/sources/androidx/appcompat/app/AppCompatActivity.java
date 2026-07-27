package androidx.appcompat.app;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.text.CatchingFishAdMobFAB;
import kotlin.text.CatchingFishAdMobGsonPayPal;
import kotlin.text.CatchingFishBiometricBundle;
import kotlin.text.CatchingFishBundleDagger;
import kotlin.text.CatchingFishCardViewMVI;
import kotlin.text.CatchingFishCoroutineRedux;
import kotlin.text.CatchingFishDagger;
import kotlin.text.CatchingFishGlideSnackbar;
import kotlin.text.CatchingFishGraphQLFragment;
import kotlin.text.CatchingFishGraphQLManifest;
import kotlin.text.CatchingFishGsonMVIRetrofit;
import kotlin.text.CatchingFishIntentStateFlow;
import kotlin.text.CatchingFishJUnitFlux;
import kotlin.text.CatchingFishLayoutMVVMFlux;
import kotlin.text.CatchingFishLayoutView;
import kotlin.text.CatchingFishMVVMAsyncTask;
import kotlin.text.CatchingFishMockkWidgetKtor;
import kotlin.text.CatchingFishOkHttpFAB;
import kotlin.text.CatchingFishPayPalWebsocket;
import kotlin.text.CatchingFishPicassoCardView;
import kotlin.text.CatchingFishPicassoMVPJUnit;
import kotlin.text.CatchingFishViewAppCompat;
import kotlin.text.CatchingFishViewModelIntent;

/* loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements CatchingFishLayoutView {
    public CatchingFishMockkWidgetKtor CatchingFishFragmentFactory;

    public AppCompatActivity() {
        ((CatchingFishViewModelIntent) this.CatchingFishViewModelScope.CatchingFishWorkManager).CatchingFishCardViewRealm("androidx:appcompat", new CatchingFishPayPalWebsocket(this));
        CatchingFishViewModelFAB(new CatchingFishAdMobGsonPayPal(this));
    }

    public final CatchingFishBundleDagger CatchingFishOkHttp() {
        if (this.CatchingFishFragmentFactory == null) {
            CatchingFishCardViewMVI catchingFishCardViewMVI = CatchingFishBundleDagger.CatchingFishReduxKtor;
            this.CatchingFishFragmentFactory = new CatchingFishMockkWidgetKtor(this, null, this, this);
        }
        return this.CatchingFishFragmentFactory;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        CatchingFishFragmentHandler();
        CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = (CatchingFishMockkWidgetKtor) CatchingFishOkHttp();
        catchingFishMockkWidgetKtor.CatchingFishCoroutineFlow();
        ((ViewGroup) catchingFishMockkWidgetKtor.CatchingFishFragmentFactory.findViewById(R.id.content)).addView(view, layoutParams);
        catchingFishMockkWidgetKtor.CatchingFishStateLiveData.CatchingFishParcelableFAB(catchingFishMockkWidgetKtor.CatchingFishAnimationMockk.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = (CatchingFishMockkWidgetKtor) CatchingFishOkHttp();
        catchingFishMockkWidgetKtor.CatchingFishRecyclerView = true;
        int i9 = catchingFishMockkWidgetKtor.CatchingFishJUnitRealm;
        if (i9 == -100) {
            i9 = CatchingFishBundleDagger.CatchingFishDaggerWebsocket;
        }
        int CatchingFishPayPal = catchingFishMockkWidgetKtor.CatchingFishPayPal(context, i9);
        if (CatchingFishBundleDagger.CatchingFishParcelableFAB(context) && CatchingFishBundleDagger.CatchingFishParcelableFAB(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (CatchingFishBundleDagger.CatchingFishEspressoTesting) {
                    try {
                        CatchingFishIntentStateFlow catchingFishIntentStateFlow = CatchingFishBundleDagger.CatchingFishWorkManager;
                        if (catchingFishIntentStateFlow == null) {
                            if (CatchingFishBundleDagger.CatchingFishViewModelScope == null) {
                                CatchingFishBundleDagger.CatchingFishViewModelScope = CatchingFishIntentStateFlow.CatchingFishParcelableFAB(CatchingFishAdMobFAB.CatchingFishSensorManager(context));
                            }
                            if (!CatchingFishBundleDagger.CatchingFishViewModelScope.CatchingFishParcelableFAB.CatchingFishParcelableFAB.isEmpty()) {
                                CatchingFishBundleDagger.CatchingFishWorkManager = CatchingFishBundleDagger.CatchingFishViewModelScope;
                            }
                        } else if (!catchingFishIntentStateFlow.equals(CatchingFishBundleDagger.CatchingFishViewModelScope)) {
                            CatchingFishIntentStateFlow catchingFishIntentStateFlow2 = CatchingFishBundleDagger.CatchingFishWorkManager;
                            CatchingFishBundleDagger.CatchingFishViewModelScope = catchingFishIntentStateFlow2;
                            CatchingFishAdMobFAB.CatchingFishFragmentFactory(context, catchingFishIntentStateFlow2.CatchingFishParcelableFAB.CatchingFishParcelableFAB.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!CatchingFishBundleDagger.CatchingFishLayout) {
                CatchingFishBundleDagger.CatchingFishReduxKtor.execute(new CatchingFishDagger(context, 1));
            }
        }
        CatchingFishIntentStateFlow CatchingFishUnitTesting = CatchingFishMockkWidgetKtor.CatchingFishUnitTesting(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(CatchingFishMockkWidgetKtor.CatchingFishNavigation(context, CatchingFishPayPal, CatchingFishUnitTesting, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof CatchingFishGraphQLManifest) {
            try {
                ((CatchingFishGraphQLManifest) context).CatchingFishParcelableFAB(CatchingFishMockkWidgetKtor.CatchingFishNavigation(context, CatchingFishPayPal, CatchingFishUnitTesting, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (CatchingFishMockkWidgetKtor.CatchingFishView) {
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
                    int i10 = configuration3.mcc;
                    int i11 = configuration4.mcc;
                    if (i10 != i11) {
                        configuration.mcc = i11;
                    }
                    int i12 = configuration3.mnc;
                    int i13 = configuration4.mnc;
                    if (i12 != i13) {
                        configuration.mnc = i13;
                    }
                    int i14 = Build.VERSION.SDK_INT;
                    CatchingFishGlideSnackbar.CatchingFishParcelableFAB(configuration3, configuration4, configuration);
                    int i15 = configuration3.touchscreen;
                    int i16 = configuration4.touchscreen;
                    if (i15 != i16) {
                        configuration.touchscreen = i16;
                    }
                    int i17 = configuration3.keyboard;
                    int i18 = configuration4.keyboard;
                    if (i17 != i18) {
                        configuration.keyboard = i18;
                    }
                    int i19 = configuration3.keyboardHidden;
                    int i20 = configuration4.keyboardHidden;
                    if (i19 != i20) {
                        configuration.keyboardHidden = i20;
                    }
                    int i21 = configuration3.navigation;
                    int i22 = configuration4.navigation;
                    if (i21 != i22) {
                        configuration.navigation = i22;
                    }
                    int i23 = configuration3.navigationHidden;
                    int i24 = configuration4.navigationHidden;
                    if (i23 != i24) {
                        configuration.navigationHidden = i24;
                    }
                    int i25 = configuration3.orientation;
                    int i26 = configuration4.orientation;
                    if (i25 != i26) {
                        configuration.orientation = i26;
                    }
                    int i27 = configuration3.screenLayout & 15;
                    int i28 = configuration4.screenLayout & 15;
                    if (i27 != i28) {
                        configuration.screenLayout |= i28;
                    }
                    int i29 = configuration3.screenLayout & 192;
                    int i30 = configuration4.screenLayout & 192;
                    if (i29 != i30) {
                        configuration.screenLayout |= i30;
                    }
                    int i31 = configuration3.screenLayout & 48;
                    int i32 = configuration4.screenLayout & 48;
                    if (i31 != i32) {
                        configuration.screenLayout |= i32;
                    }
                    int i33 = configuration3.screenLayout & 768;
                    int i34 = configuration4.screenLayout & 768;
                    if (i33 != i34) {
                        configuration.screenLayout |= i34;
                    }
                    if (i14 >= 26) {
                        i = configuration3.colorMode;
                        int i35 = i & 3;
                        i2 = configuration4.colorMode;
                        if (i35 != (i2 & 3)) {
                            i7 = configuration.colorMode;
                            i8 = configuration4.colorMode;
                            configuration.colorMode = i7 | (i8 & 3);
                        }
                        i3 = configuration3.colorMode;
                        int i36 = i3 & 12;
                        i4 = configuration4.colorMode;
                        if (i36 != (i4 & 12)) {
                            i5 = configuration.colorMode;
                            i6 = configuration4.colorMode;
                            configuration.colorMode = i5 | (i6 & 12);
                        }
                    }
                    int i37 = configuration3.uiMode & 15;
                    int i38 = configuration4.uiMode & 15;
                    if (i37 != i38) {
                        configuration.uiMode |= i38;
                    }
                    int i39 = configuration3.uiMode & 48;
                    int i40 = configuration4.uiMode & 48;
                    if (i39 != i40) {
                        configuration.uiMode |= i40;
                    }
                    int i41 = configuration3.screenWidthDp;
                    int i42 = configuration4.screenWidthDp;
                    if (i41 != i42) {
                        configuration.screenWidthDp = i42;
                    }
                    int i43 = configuration3.screenHeightDp;
                    int i44 = configuration4.screenHeightDp;
                    if (i43 != i44) {
                        configuration.screenHeightDp = i44;
                    }
                    int i45 = configuration3.smallestScreenWidthDp;
                    int i46 = configuration4.smallestScreenWidthDp;
                    if (i45 != i46) {
                        configuration.smallestScreenWidthDp = i46;
                    }
                    int i47 = configuration3.densityDpi;
                    int i48 = configuration4.densityDpi;
                    if (i47 != i48) {
                        configuration.densityDpi = i48;
                    }
                }
            }
            Configuration CatchingFishNavigation = CatchingFishMockkWidgetKtor.CatchingFishNavigation(context, CatchingFishPayPal, CatchingFishUnitTesting, configuration, true);
            CatchingFishGraphQLManifest catchingFishGraphQLManifest = new CatchingFishGraphQLManifest(context, com.catchingfish.fishcatcherpro.R.style.Theme_AppCompat_Empty);
            catchingFishGraphQLManifest.CatchingFishParcelableFAB(CatchingFishNavigation);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = catchingFishGraphQLManifest.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        CatchingFishJUnitFlux.CatchingFishFragmentHandler(theme);
                    } else {
                        synchronized (CatchingFishBiometricBundle.CatchingFishViewModelFAB) {
                            if (!CatchingFishBiometricBundle.CatchingFishFragmentHandler) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    CatchingFishBiometricBundle.CatchingFishLayout = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException unused3) {
                                }
                                CatchingFishBiometricBundle.CatchingFishFragmentHandler = true;
                            }
                            Method method = CatchingFishBiometricBundle.CatchingFishLayout;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException unused4) {
                                    CatchingFishBiometricBundle.CatchingFishLayout = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused5) {
            }
            context = catchingFishGraphQLManifest;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((CatchingFishMockkWidgetKtor) CatchingFishOkHttp()).CatchingFishGsonAppCompat();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((CatchingFishMockkWidgetKtor) CatchingFishOkHttp()).CatchingFishGsonAppCompat();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = (CatchingFishMockkWidgetKtor) CatchingFishOkHttp();
        catchingFishMockkWidgetKtor.CatchingFishCoroutineFlow();
        return catchingFishMockkWidgetKtor.CatchingFishAnimationMockk.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = (CatchingFishMockkWidgetKtor) CatchingFishOkHttp();
        if (catchingFishMockkWidgetKtor.CatchingFish == null) {
            catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat();
            CatchingFishGraphQLFragment catchingFishGraphQLFragment = catchingFishMockkWidgetKtor.CatchingFishNavigation;
            catchingFishMockkWidgetKtor.CatchingFish = new CatchingFishPicassoCardView(catchingFishGraphQLFragment != null ? catchingFishGraphQLFragment.CatchingFishAppCompat() : catchingFishMockkWidgetKtor.CatchingFishUnitTesting);
        }
        return catchingFishMockkWidgetKtor.CatchingFish;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = CatchingFishViewAppCompat.CatchingFishParcelableFAB;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = (CatchingFishMockkWidgetKtor) CatchingFishOkHttp();
        if (catchingFishMockkWidgetKtor.CatchingFishNavigation != null) {
            catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat();
            catchingFishMockkWidgetKtor.CatchingFishNavigation.getClass();
            catchingFishMockkWidgetKtor.CatchingFishCardViewRealm(0);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = (CatchingFishMockkWidgetKtor) CatchingFishOkHttp();
        if (catchingFishMockkWidgetKtor.CatchingFishEspressoMockk && catchingFishMockkWidgetKtor.CatchingFishCustomView) {
            catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat();
            CatchingFishGraphQLFragment catchingFishGraphQLFragment = catchingFishMockkWidgetKtor.CatchingFishNavigation;
            if (catchingFishGraphQLFragment != null) {
                catchingFishGraphQLFragment.CatchingFishJUnitRealm(catchingFishGraphQLFragment.CatchingFishDaggerHiltFAB.getResources().getBoolean(com.catchingfish.fishcatcherpro.R.bool.abc_action_bar_embed_tabs));
            }
        }
        CatchingFishPicassoMVPJUnit CatchingFishParcelableFAB = CatchingFishPicassoMVPJUnit.CatchingFishParcelableFAB();
        Context context = catchingFishMockkWidgetKtor.CatchingFishUnitTesting;
        synchronized (CatchingFishParcelableFAB) {
            CatchingFishCoroutineRedux catchingFishCoroutineRedux = CatchingFishParcelableFAB.CatchingFishParcelableFAB;
            synchronized (catchingFishCoroutineRedux) {
                CatchingFishLayoutMVVMFlux catchingFishLayoutMVVMFlux = (CatchingFishLayoutMVVMFlux) catchingFishCoroutineRedux.CatchingFishSnackbar.get(context);
                if (catchingFishLayoutMVVMFlux != null) {
                    catchingFishLayoutMVVMFlux.CatchingFishParcelableFAB();
                }
            }
        }
        catchingFishMockkWidgetKtor.CatchingFishStateFlow = new Configuration(catchingFishMockkWidgetKtor.CatchingFishUnitTesting.getResources().getConfiguration());
        catchingFishMockkWidgetKtor.CatchingFishEspressoTesting(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        CatchingFishOkHttp().CatchingFishCoroutine();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent CatchingFishGsonAppCompat;
        if (!super.onMenuItemSelected(i, menuItem)) {
            CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = (CatchingFishMockkWidgetKtor) CatchingFishOkHttp();
            catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat();
            CatchingFishGraphQLFragment catchingFishGraphQLFragment = catchingFishMockkWidgetKtor.CatchingFishNavigation;
            if (menuItem.getItemId() != 16908332 || catchingFishGraphQLFragment == null || (((CatchingFishMVVMAsyncTask) catchingFishGraphQLFragment.CatchingFishCardViewRealm).CatchingFishSnackbar & 4) == 0 || (CatchingFishGsonAppCompat = CatchingFishOkHttpFAB.CatchingFishGsonAppCompat(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(CatchingFishGsonAppCompat)) {
                navigateUpTo(CatchingFishGsonAppCompat);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent CatchingFishGsonAppCompat2 = CatchingFishOkHttpFAB.CatchingFishGsonAppCompat(this);
            if (CatchingFishGsonAppCompat2 == null) {
                CatchingFishGsonAppCompat2 = CatchingFishOkHttpFAB.CatchingFishGsonAppCompat(this);
            }
            if (CatchingFishGsonAppCompat2 != null) {
                ComponentName component = CatchingFishGsonAppCompat2.getComponent();
                if (component == null) {
                    component = CatchingFishGsonAppCompat2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent CatchingFishCardViewRealm = CatchingFishOkHttpFAB.CatchingFishCardViewRealm(this, component);
                    while (CatchingFishCardViewRealm != null) {
                        arrayList.add(size, CatchingFishCardViewRealm);
                        CatchingFishCardViewRealm = CatchingFishOkHttpFAB.CatchingFishCardViewRealm(this, CatchingFishCardViewRealm.getComponent());
                    }
                    arrayList.add(CatchingFishGsonAppCompat2);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((CatchingFishMockkWidgetKtor) CatchingFishOkHttp()).CatchingFishCoroutineFlow();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = (CatchingFishMockkWidgetKtor) CatchingFishOkHttp();
        catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat();
        CatchingFishGraphQLFragment catchingFishGraphQLFragment = catchingFishMockkWidgetKtor.CatchingFishNavigation;
        if (catchingFishGraphQLFragment != null) {
            catchingFishGraphQLFragment.CatchingFishGradleManifest = true;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((CatchingFishMockkWidgetKtor) CatchingFishOkHttp()).CatchingFishEspressoTesting(true, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        CatchingFishMockkWidgetKtor catchingFishMockkWidgetKtor = (CatchingFishMockkWidgetKtor) CatchingFishOkHttp();
        catchingFishMockkWidgetKtor.CatchingFishGsonAppCompat();
        CatchingFishGraphQLFragment catchingFishGraphQLFragment = catchingFishMockkWidgetKtor.CatchingFishNavigation;
        if (catchingFishGraphQLFragment != null) {
            catchingFishGraphQLFragment.CatchingFishGradleManifest = false;
            CatchingFishGsonMVIRetrofit catchingFishGsonMVIRetrofit = catchingFishGraphQLFragment.CatchingFishPayPalLiveData;
            if (catchingFishGsonMVIRetrofit != null) {
                catchingFishGsonMVIRetrofit.CatchingFishParcelableFAB();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        CatchingFishOkHttp().CatchingFishCloudMessaging(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((CatchingFishMockkWidgetKtor) CatchingFishOkHttp()).CatchingFishGsonAppCompat();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i) {
        CatchingFishFragmentHandler();
        CatchingFishOkHttp().CatchingFishViewModelScope(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((CatchingFishMockkWidgetKtor) CatchingFishOkHttp()).CatchingFishAnimation = i;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        CatchingFishFragmentHandler();
        CatchingFishOkHttp().CatchingFishLayout(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        CatchingFishFragmentHandler();
        CatchingFishOkHttp().CatchingFishFragmentHandler(view, layoutParams);
    }
}
