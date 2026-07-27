package kotlin.text;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.adjust.sdk.network.ErrorCodes;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class CatchingFishMockkWidgetKtor extends CatchingFishBundleDagger implements CatchingFishFABGradleLayout, LayoutInflater.Factory2 {
    public static final CatchingFishGraphQLRealmFAB CatchingFishGradleLiveData = new CatchingFishGraphQLRealmFAB(0);
    public static final int[] CatchingFishRetrofit = {R.attr.windowBackground};
    public static final boolean CatchingFishView = !"robolectric".equals(Build.FINGERPRINT);
    public CatchingFishPicassoCardView CatchingFish;
    public CatchingFishCardViewHandler CatchingFishAndroidX;
    public int CatchingFishAnimation;
    public Window CatchingFishAnimationMockk;
    public boolean CatchingFishAppCompat;
    public boolean CatchingFishCameraXIntent;
    public PopupWindow CatchingFishCardViewRealm;
    public CatchingFishOkHttpManifest CatchingFishCoroutineFlow;
    public boolean CatchingFishCustomView;
    public boolean CatchingFishDagger;
    public CatchingFishAndroidXPicasso CatchingFishDaggerHiltFAB;
    public boolean CatchingFishDaggerMVVM;
    public boolean CatchingFishDataStoreIntent;
    public boolean CatchingFishEspressoMockk;
    public OnBackInvokedDispatcher CatchingFishFirebase;
    public ViewGroup CatchingFishFragmentFactory;
    public boolean CatchingFishGradleManifest;
    public ActionBarContextView CatchingFishGsonAppCompat;
    public boolean CatchingFishHandler;
    public final int CatchingFishJUnitRealm;
    public CharSequence CatchingFishJetpackCompose;
    public View CatchingFishJobScheduler;
    public CatchingFishDaggerHiltHilt CatchingFishLayoutInflater;
    public int CatchingFishMVVMAppCompat;
    public Rect CatchingFishMockkOkHttp;
    public CatchingFishCardViewHandler CatchingFishMoshiDaggerHilt;
    public CatchingFishDaggerHiltHilt[] CatchingFishMotionLayout;
    public TextView CatchingFishMutableLiveData;
    public CatchingFishGraphQLFragment CatchingFishNavigation;
    public boolean CatchingFishNavigationGson;
    public final Object CatchingFishOkHttp;
    public boolean CatchingFishParcelable;
    public CatchingFishGradleSpannable CatchingFishParcelableFlux;
    public CatchingFishAsyncTaskToast CatchingFishPayPal;
    public boolean CatchingFishPayPalLiveData;
    public boolean CatchingFishPayPalService;
    public CatchingFishHiltHilt CatchingFishPicasso;
    public boolean CatchingFishRecyclerView;
    public int CatchingFishRedux;
    public Rect CatchingFishReduxMoshi;
    public OnBackInvokedCallback CatchingFishRetrofitMVI;
    public final Object CatchingFishRoomDatabase;
    public boolean CatchingFishSensorManager;
    public CatchingFishAndroidXPicasso CatchingFishSpannableWidget;
    public Configuration CatchingFishStateFlow;
    public CatchingFishMVIGradleBundle CatchingFishStateLiveData;
    public boolean CatchingFishStripeAPI;
    public final Context CatchingFishUnitTesting;
    public CatchingFishIntentMVPDagger CatchingFishCardViewView = null;
    public final boolean CatchingFishMVPRobolectric = true;
    public final CatchingFishAsyncTaskToast CatchingFishCustomViewJUnit = new CatchingFishAsyncTaskToast(this, 0);

    public CatchingFishMockkWidgetKtor(Context context, Window window, CatchingFishLayoutView catchingFishLayoutView, Object obj) {
        AppCompatActivity appCompatActivity = null;
        this.CatchingFishJUnitRealm = -100;
        this.CatchingFishUnitTesting = context;
        this.CatchingFishRoomDatabase = catchingFishLayoutView;
        this.CatchingFishOkHttp = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AppCompatActivity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        appCompatActivity = (AppCompatActivity) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (appCompatActivity != null) {
                this.CatchingFishJUnitRealm = ((CatchingFishMockkWidgetKtor) appCompatActivity.CatchingFishOkHttp()).CatchingFishJUnitRealm;
            }
        }
        if (this.CatchingFishJUnitRealm == -100) {
            String name = this.CatchingFishOkHttp.getClass().getName();
            CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB = CatchingFishGradleLiveData;
            Integer num = (Integer) catchingFishGraphQLRealmFAB.get(name);
            if (num != null) {
                this.CatchingFishJUnitRealm = num.intValue();
                catchingFishGraphQLRealmFAB.remove(this.CatchingFishOkHttp.getClass().getName());
            }
        }
        if (window != null) {
            CatchingFishOkHttp(window);
        }
        CatchingFishPicassoMVPJUnit.CatchingFishReduxKtor();
    }

    public static Configuration CatchingFishNavigation(Context context, int i, CatchingFishIntentStateFlow catchingFishIntentStateFlow, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (catchingFishIntentStateFlow != null) {
            CatchingFishGlideSnackbar.CatchingFishReduxKtor(configuration2, catchingFishIntentStateFlow);
        }
        return configuration2;
    }

    public static CatchingFishIntentStateFlow CatchingFishUnitTesting(Context context) {
        CatchingFishIntentStateFlow catchingFishIntentStateFlow;
        CatchingFishIntentStateFlow catchingFishIntentStateFlow2;
        if (Build.VERSION.SDK_INT >= 33 || (catchingFishIntentStateFlow = CatchingFishBundleDagger.CatchingFishWorkManager) == null) {
            return null;
        }
        CatchingFishWidgetHiltKtor catchingFishWidgetHiltKtor = catchingFishIntentStateFlow.CatchingFishParcelableFAB;
        CatchingFishIntentStateFlow CatchingFishSnackbar = CatchingFishGlideSnackbar.CatchingFishSnackbar(context.getApplicationContext().getResources().getConfiguration());
        if (catchingFishWidgetHiltKtor.CatchingFishParcelableFAB.isEmpty()) {
            catchingFishIntentStateFlow2 = CatchingFishIntentStateFlow.CatchingFishSnackbar;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < CatchingFishSnackbar.CatchingFishParcelableFAB.CatchingFishParcelableFAB.size() + catchingFishWidgetHiltKtor.CatchingFishParcelableFAB.size()) {
                Locale locale = i < catchingFishWidgetHiltKtor.CatchingFishParcelableFAB.size() ? catchingFishWidgetHiltKtor.CatchingFishParcelableFAB.get(i) : CatchingFishSnackbar.CatchingFishParcelableFAB.CatchingFishParcelableFAB.get(i - catchingFishWidgetHiltKtor.CatchingFishParcelableFAB.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            catchingFishIntentStateFlow2 = new CatchingFishIntentStateFlow(new CatchingFishWidgetHiltKtor(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return catchingFishIntentStateFlow2.CatchingFishParcelableFAB.CatchingFishParcelableFAB.isEmpty() ? CatchingFishSnackbar : catchingFishIntentStateFlow2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00dc, code lost:
    
        if (r7.CatchingFishReduxKtor() != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0102, code lost:
    
        if (r7.CatchingFishEspressoTesting() != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFish(KeyEvent keyEvent) {
        View decorView;
        boolean z;
        boolean z2;
        AudioManager audioManager;
        ActionMenuView actionMenuView;
        CatchingFishToast catchingFishToast;
        Object obj = this.CatchingFishOkHttp;
        if ((!(obj instanceof CatchingFishFABGraphQL) && !(obj instanceof CatchingFishRoomStripeAPI)) || (decorView = this.CatchingFishAnimationMockk.getDecorView()) == null || !CatchingFishBiometricBundle.CatchingFishCloudMessaging(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                CatchingFishMVIGradleBundle catchingFishMVIGradleBundle = this.CatchingFishStateLiveData;
                Window.Callback callback = this.CatchingFishAnimationMockk.getCallback();
                catchingFishMVIGradleBundle.getClass();
                try {
                    catchingFishMVIGradleBundle.CatchingFishWorkManager = true;
                } finally {
                    catchingFishMVIGradleBundle.CatchingFishWorkManager = false;
                }
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode == 4) {
                    this.CatchingFishParcelable = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        CatchingFishDaggerHiltHilt CatchingFishParcelableFlux = CatchingFishParcelableFlux(0);
                        if (!CatchingFishParcelableFlux.CatchingFishOkHttp) {
                            CatchingFishFragmentFactory(CatchingFishParcelableFlux, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.CatchingFishParcelableFlux == null) {
                        CatchingFishDaggerHiltHilt CatchingFishParcelableFlux2 = CatchingFishParcelableFlux(0);
                        CatchingFishOkHttpManifest catchingFishOkHttpManifest = this.CatchingFishCoroutineFlow;
                        Context context = this.CatchingFishUnitTesting;
                        if (catchingFishOkHttpManifest != null) {
                            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) catchingFishOkHttpManifest;
                            actionBarOverlayLayout.CatchingFishCloudMessaging();
                            Toolbar toolbar = ((CatchingFishMVVMAsyncTask) actionBarOverlayLayout.CatchingFishViewModelFAB).CatchingFishParcelableFAB;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.CatchingFishReduxKtor) != null && actionMenuView.CatchingFishDaggerHiltFAB && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.CatchingFishCoroutineFlow;
                                actionBarOverlayLayout2.CatchingFishCloudMessaging();
                                ActionMenuView actionMenuView2 = ((CatchingFishMVVMAsyncTask) actionBarOverlayLayout2.CatchingFishViewModelFAB).CatchingFishParcelableFAB.CatchingFishReduxKtor;
                                if (actionMenuView2 == null || (catchingFishToast = actionMenuView2.CatchingFishSpannableWidget) == null || !catchingFishToast.CatchingFishViewModelScope()) {
                                    if (!this.CatchingFishDataStoreIntent && CatchingFishFragmentFactory(CatchingFishParcelableFlux2, keyEvent)) {
                                        ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.CatchingFishCoroutineFlow;
                                        actionBarOverlayLayout3.CatchingFishCloudMessaging();
                                        ActionMenuView actionMenuView3 = ((CatchingFishMVVMAsyncTask) actionBarOverlayLayout3.CatchingFishViewModelFAB).CatchingFishParcelableFAB.CatchingFishReduxKtor;
                                        if (actionMenuView3 != null) {
                                            CatchingFishToast catchingFishToast2 = actionMenuView3.CatchingFishSpannableWidget;
                                            if (catchingFishToast2 != null) {
                                            }
                                        }
                                    }
                                    z = false;
                                } else {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.CatchingFishCoroutineFlow;
                                    actionBarOverlayLayout4.CatchingFishCloudMessaging();
                                    ActionMenuView actionMenuView4 = ((CatchingFishMVVMAsyncTask) actionBarOverlayLayout4.CatchingFishViewModelFAB).CatchingFishParcelableFAB.CatchingFishReduxKtor;
                                    if (actionMenuView4 != null) {
                                        CatchingFishToast catchingFishToast3 = actionMenuView4.CatchingFishSpannableWidget;
                                        if (catchingFishToast3 != null) {
                                        }
                                    }
                                    z = false;
                                }
                                if (z && (audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio")) != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                            }
                        }
                        boolean z3 = CatchingFishParcelableFlux2.CatchingFishOkHttp;
                        if (z3 || CatchingFishParcelableFlux2.CatchingFishEspressoTesting) {
                            CatchingFishRoomDatabase(CatchingFishParcelableFlux2, true);
                            z = z3;
                            if (z) {
                                audioManager.playSoundEffect(0);
                                return true;
                            }
                        } else {
                            if (CatchingFishParcelableFlux2.CatchingFishCloudMessaging) {
                                if (CatchingFishParcelableFlux2.CatchingFishAnimationMockk) {
                                    CatchingFishParcelableFlux2.CatchingFishCloudMessaging = false;
                                    z2 = CatchingFishFragmentFactory(CatchingFishParcelableFlux2, keyEvent);
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    CatchingFishMVPRobolectric(CatchingFishParcelableFlux2, keyEvent);
                                    z = true;
                                    if (z) {
                                    }
                                }
                            }
                            z = false;
                            if (z) {
                            }
                        }
                    }
                }
                return false;
            }
            if (!CatchingFishCardViewView()) {
                return false;
            }
        }
        return true;
    }

    public final void CatchingFishAnimationMockk(int i, CatchingFishDaggerHiltHilt catchingFishDaggerHiltHilt, CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob) {
        if (catchingFishSharedFlowAdMob == null) {
            if (catchingFishDaggerHiltHilt == null && i >= 0) {
                CatchingFishDaggerHiltHilt[] catchingFishDaggerHiltHiltArr = this.CatchingFishMotionLayout;
                if (i < catchingFishDaggerHiltHiltArr.length) {
                    catchingFishDaggerHiltHilt = catchingFishDaggerHiltHiltArr[i];
                }
            }
            if (catchingFishDaggerHiltHilt != null) {
                catchingFishSharedFlowAdMob = catchingFishDaggerHiltHilt.CatchingFishViewModelFAB;
            }
        }
        if ((catchingFishDaggerHiltHilt == null || catchingFishDaggerHiltHilt.CatchingFishOkHttp) && !this.CatchingFishDataStoreIntent) {
            CatchingFishMVIGradleBundle catchingFishMVIGradleBundle = this.CatchingFishStateLiveData;
            Window.Callback callback = this.CatchingFishAnimationMockk.getCallback();
            catchingFishMVIGradleBundle.getClass();
            try {
                catchingFishMVIGradleBundle.CatchingFishViewModelScope = true;
                callback.onPanelClosed(i, catchingFishSharedFlowAdMob);
            } finally {
                catchingFishMVIGradleBundle.CatchingFishViewModelScope = false;
            }
        }
    }

    public final void CatchingFishCardViewRealm(int i) {
        this.CatchingFishRedux = (1 << i) | this.CatchingFishRedux;
        if (this.CatchingFishNavigationGson) {
            return;
        }
        View decorView = this.CatchingFishAnimationMockk.getDecorView();
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        decorView.postOnAnimation(this.CatchingFishCustomViewJUnit);
        this.CatchingFishNavigationGson = true;
    }

    public final boolean CatchingFishCardViewView() {
        CatchingFishIntentMVI catchingFishIntentMVI;
        CatchingFishKtorUnitTesting catchingFishKtorUnitTesting;
        boolean z = this.CatchingFishParcelable;
        this.CatchingFishParcelable = false;
        CatchingFishDaggerHiltHilt CatchingFishParcelableFlux = CatchingFishParcelableFlux(0);
        if (!CatchingFishParcelableFlux.CatchingFishOkHttp) {
            CatchingFishGradleSpannable catchingFishGradleSpannable = this.CatchingFishParcelableFlux;
            if (catchingFishGradleSpannable != null) {
                catchingFishGradleSpannable.CatchingFishParcelableFAB();
                return true;
            }
            CatchingFishGsonAppCompat();
            CatchingFishGraphQLFragment catchingFishGraphQLFragment = this.CatchingFishNavigation;
            if (catchingFishGraphQLFragment == null || (catchingFishIntentMVI = catchingFishGraphQLFragment.CatchingFishCardViewRealm) == null || (catchingFishKtorUnitTesting = ((CatchingFishMVVMAsyncTask) catchingFishIntentMVI).CatchingFishParcelableFAB.CatchingFishGradleManifest) == null || catchingFishKtorUnitTesting.CatchingFishDaggerWebsocket == null) {
                return false;
            }
            CatchingFishKtorUnitTesting catchingFishKtorUnitTesting2 = ((CatchingFishMVVMAsyncTask) catchingFishIntentMVI).CatchingFishParcelableFAB.CatchingFishGradleManifest;
            CatchingFishKtorAdMob catchingFishKtorAdMob = catchingFishKtorUnitTesting2 == null ? null : catchingFishKtorUnitTesting2.CatchingFishDaggerWebsocket;
            if (catchingFishKtorAdMob != null) {
                catchingFishKtorAdMob.collapseActionView();
            }
        } else if (!z) {
            CatchingFishRoomDatabase(CatchingFishParcelableFlux, true);
            return true;
        }
        return true;
    }

    @Override // kotlin.text.CatchingFishBundleDagger
    public final void CatchingFishCloudMessaging(CharSequence charSequence) {
        this.CatchingFishJetpackCompose = charSequence;
        CatchingFishOkHttpManifest catchingFishOkHttpManifest = this.CatchingFishCoroutineFlow;
        if (catchingFishOkHttpManifest != null) {
            catchingFishOkHttpManifest.setWindowTitle(charSequence);
            return;
        }
        CatchingFishGraphQLFragment catchingFishGraphQLFragment = this.CatchingFishNavigation;
        if (catchingFishGraphQLFragment == null) {
            TextView textView = this.CatchingFishMutableLiveData;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        CatchingFishMVVMAsyncTask catchingFishMVVMAsyncTask = (CatchingFishMVVMAsyncTask) catchingFishGraphQLFragment.CatchingFishCardViewRealm;
        if (catchingFishMVVMAsyncTask.CatchingFishViewModelScope) {
            return;
        }
        Toolbar toolbar = catchingFishMVVMAsyncTask.CatchingFishParcelableFAB;
        catchingFishMVVMAsyncTask.CatchingFishViewModelFAB = charSequence;
        if ((catchingFishMVVMAsyncTask.CatchingFishSnackbar & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (catchingFishMVVMAsyncTask.CatchingFishViewModelScope) {
                CatchingFishFABCameraX.CatchingFishUnitTesting(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.text.CatchingFishBundleDagger
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishCoroutine() {
        CatchingFishCardViewHandler catchingFishCardViewHandler;
        CatchingFishCardViewHandler catchingFishCardViewHandler2;
        if (this.CatchingFishOkHttp instanceof Activity) {
            synchronized (CatchingFishBundleDagger.CatchingFishCloudMessaging) {
                CatchingFishBundleDagger.CatchingFishReduxKtor(this);
            }
        }
        if (this.CatchingFishNavigationGson) {
            this.CatchingFishAnimationMockk.getDecorView().removeCallbacks(this.CatchingFishCustomViewJUnit);
        }
        this.CatchingFishDataStoreIntent = true;
        if (this.CatchingFishJUnitRealm != -100) {
            Object obj = this.CatchingFishOkHttp;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                CatchingFishGradleLiveData.put(this.CatchingFishOkHttp.getClass().getName(), Integer.valueOf(this.CatchingFishJUnitRealm));
                catchingFishCardViewHandler = this.CatchingFishMoshiDaggerHilt;
                if (catchingFishCardViewHandler != null) {
                    catchingFishCardViewHandler.CatchingFishParcelableFAB();
                }
                catchingFishCardViewHandler2 = this.CatchingFishAndroidX;
                if (catchingFishCardViewHandler2 == null) {
                    catchingFishCardViewHandler2.CatchingFishParcelableFAB();
                    return;
                }
                return;
            }
        }
        CatchingFishGradleLiveData.remove(this.CatchingFishOkHttp.getClass().getName());
        catchingFishCardViewHandler = this.CatchingFishMoshiDaggerHilt;
        if (catchingFishCardViewHandler != null) {
        }
        catchingFishCardViewHandler2 = this.CatchingFishAndroidX;
        if (catchingFishCardViewHandler2 == null) {
        }
    }

    public final void CatchingFishCoroutineFlow() {
        ViewGroup viewGroup;
        if (this.CatchingFishCustomView) {
            return;
        }
        Context context = this.CatchingFishUnitTesting;
        int[] iArr = CatchingFishWidgetGlide.CatchingFishFragmentHandler;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        int i = 0;
        int i2 = 1;
        if (obtainStyledAttributes.getBoolean(126, false)) {
            CatchingFishDaggerWebsocket(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            CatchingFishDaggerWebsocket(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            CatchingFishDaggerWebsocket(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            CatchingFishDaggerWebsocket(10);
        }
        this.CatchingFishHandler = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        CatchingFishDaggerHiltFAB();
        this.CatchingFishAnimationMockk.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.CatchingFishPayPalLiveData) {
            viewGroup = this.CatchingFishCameraXIntent ? (ViewGroup) from.inflate(com.catchingfish.fishcatcherpro.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.catchingfish.fishcatcherpro.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.CatchingFishHandler) {
            viewGroup = (ViewGroup) from.inflate(com.catchingfish.fishcatcherpro.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.CatchingFishDagger = false;
            this.CatchingFishEspressoMockk = false;
        } else if (this.CatchingFishEspressoMockk) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.catchingfish.fishcatcherpro.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new CatchingFishGraphQLManifest(context, typedValue.resourceId) : context).inflate(com.catchingfish.fishcatcherpro.R.layout.abc_screen_toolbar, (ViewGroup) null);
            CatchingFishOkHttpManifest catchingFishOkHttpManifest = (CatchingFishOkHttpManifest) viewGroup.findViewById(com.catchingfish.fishcatcherpro.R.id.decor_content_parent);
            this.CatchingFishCoroutineFlow = catchingFishOkHttpManifest;
            catchingFishOkHttpManifest.setWindowCallback(this.CatchingFishAnimationMockk.getCallback());
            if (this.CatchingFishDagger) {
                ((ActionBarOverlayLayout) this.CatchingFishCoroutineFlow).CatchingFishFragmentHandler(109);
            }
            if (this.CatchingFishPayPalService) {
                ((ActionBarOverlayLayout) this.CatchingFishCoroutineFlow).CatchingFishFragmentHandler(2);
            }
            if (this.CatchingFishSensorManager) {
                ((ActionBarOverlayLayout) this.CatchingFishCoroutineFlow).CatchingFishFragmentHandler(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.CatchingFishEspressoMockk + ", windowActionBarOverlay: " + this.CatchingFishDagger + ", android:windowIsFloating: " + this.CatchingFishHandler + ", windowActionModeOverlay: " + this.CatchingFishCameraXIntent + ", windowNoTitle: " + this.CatchingFishPayPalLiveData + " }");
        }
        CatchingFishAndroidXPicasso catchingFishAndroidXPicasso = new CatchingFishAndroidXPicasso(this, i);
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        CatchingFishGlideFlux.CatchingFishCoroutine(viewGroup, catchingFishAndroidXPicasso);
        if (this.CatchingFishCoroutineFlow == null) {
            this.CatchingFishMutableLiveData = (TextView) viewGroup.findViewById(com.catchingfish.fishcatcherpro.R.id.title);
        }
        boolean z = CatchingFishMVVMGraphQL.CatchingFishParcelableFAB;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.catchingfish.fishcatcherpro.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.CatchingFishAnimationMockk.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.CatchingFishAnimationMockk.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new CatchingFishAndroidXPicasso(this, i2));
        this.CatchingFishFragmentFactory = viewGroup;
        Object obj = this.CatchingFishOkHttp;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.CatchingFishJetpackCompose;
        if (!TextUtils.isEmpty(title)) {
            CatchingFishOkHttpManifest catchingFishOkHttpManifest2 = this.CatchingFishCoroutineFlow;
            if (catchingFishOkHttpManifest2 != null) {
                catchingFishOkHttpManifest2.setWindowTitle(title);
            } else {
                CatchingFishGraphQLFragment catchingFishGraphQLFragment = this.CatchingFishNavigation;
                if (catchingFishGraphQLFragment != null) {
                    CatchingFishMVVMAsyncTask catchingFishMVVMAsyncTask = (CatchingFishMVVMAsyncTask) catchingFishGraphQLFragment.CatchingFishCardViewRealm;
                    if (!catchingFishMVVMAsyncTask.CatchingFishViewModelScope) {
                        Toolbar toolbar = catchingFishMVVMAsyncTask.CatchingFishParcelableFAB;
                        catchingFishMVVMAsyncTask.CatchingFishViewModelFAB = title;
                        if ((catchingFishMVVMAsyncTask.CatchingFishSnackbar & 8) != 0) {
                            toolbar.setTitle(title);
                            if (catchingFishMVVMAsyncTask.CatchingFishViewModelScope) {
                                CatchingFishFABCameraX.CatchingFishUnitTesting(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.CatchingFishMutableLiveData;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.CatchingFishFragmentFactory.findViewById(R.id.content);
        View decorView = this.CatchingFishAnimationMockk.getDecorView();
        contentFrameLayout2.CatchingFishFragmentHandler.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(122)) {
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.CatchingFishCustomView = true;
        CatchingFishDaggerHiltHilt CatchingFishParcelableFlux = CatchingFishParcelableFlux(0);
        if (this.CatchingFishDataStoreIntent || CatchingFishParcelableFlux.CatchingFishViewModelFAB != null) {
            return;
        }
        CatchingFishCardViewRealm(108);
    }

    public final boolean CatchingFishCustomView(CatchingFishDaggerHiltHilt catchingFishDaggerHiltHilt, int i, KeyEvent keyEvent) {
        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((catchingFishDaggerHiltHilt.CatchingFishCloudMessaging || CatchingFishFragmentFactory(catchingFishDaggerHiltHilt, keyEvent)) && (catchingFishSharedFlowAdMob = catchingFishDaggerHiltHilt.CatchingFishViewModelFAB) != null) {
            return catchingFishSharedFlowAdMob.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final void CatchingFishDaggerHiltFAB() {
        if (this.CatchingFishAnimationMockk == null) {
            Object obj = this.CatchingFishOkHttp;
            if (obj instanceof Activity) {
                CatchingFishOkHttp(((Activity) obj).getWindow());
            }
        }
        if (this.CatchingFishAnimationMockk == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @Override // kotlin.text.CatchingFishBundleDagger
    public final boolean CatchingFishDaggerWebsocket(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.CatchingFishPayPalLiveData && i == 108) {
            return false;
        }
        if (this.CatchingFishEspressoMockk && i == 1) {
            this.CatchingFishEspressoMockk = false;
        }
        if (i == 1) {
            CatchingFishMutableLiveData();
            this.CatchingFishPayPalLiveData = true;
            return true;
        }
        if (i == 2) {
            CatchingFishMutableLiveData();
            this.CatchingFishPayPalService = true;
            return true;
        }
        if (i == 5) {
            CatchingFishMutableLiveData();
            this.CatchingFishSensorManager = true;
            return true;
        }
        if (i == 10) {
            CatchingFishMutableLiveData();
            this.CatchingFishCameraXIntent = true;
            return true;
        }
        if (i == 108) {
            CatchingFishMutableLiveData();
            this.CatchingFishEspressoMockk = true;
            return true;
        }
        if (i != 109) {
            return this.CatchingFishAnimationMockk.requestFeature(i);
        }
        CatchingFishMutableLiveData();
        this.CatchingFishDagger = true;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishEspressoTesting(boolean z, boolean z2) {
        int i;
        Configuration configuration;
        CatchingFishIntentStateFlow CatchingFishSnackbar;
        int i2;
        boolean z3;
        Object obj;
        Object obj2;
        Activity activity;
        if (this.CatchingFishDataStoreIntent) {
            return false;
        }
        int i3 = this.CatchingFishJUnitRealm;
        if (i3 == -100) {
            i3 = CatchingFishBundleDagger.CatchingFishDaggerWebsocket;
        }
        Context context = this.CatchingFishUnitTesting;
        int CatchingFishPayPal = CatchingFishPayPal(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        CatchingFishIntentStateFlow CatchingFishUnitTesting = i4 < 33 ? CatchingFishUnitTesting(context) : null;
        if (!z2 && CatchingFishUnitTesting != null) {
            CatchingFishUnitTesting = CatchingFishGlideSnackbar.CatchingFishSnackbar(context.getResources().getConfiguration());
        }
        Configuration CatchingFishNavigation = CatchingFishNavigation(context, CatchingFishPayPal, CatchingFishUnitTesting, null, false);
        boolean z4 = this.CatchingFishStripeAPI;
        boolean z5 = true;
        Object obj3 = this.CatchingFishOkHttp;
        if (!z4 && (obj3 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.CatchingFishStateFlow;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i5 = configuration.uiMode & 48;
                int i6 = CatchingFishNavigation.uiMode & 48;
                CatchingFishIntentStateFlow CatchingFishSnackbar2 = CatchingFishGlideSnackbar.CatchingFishSnackbar(configuration);
                CatchingFishSnackbar = CatchingFishUnitTesting != null ? null : CatchingFishGlideSnackbar.CatchingFishSnackbar(CatchingFishNavigation);
                i2 = i5 == i6 ? 512 : 0;
                if (CatchingFishSnackbar != null && !CatchingFishSnackbar2.equals(CatchingFishSnackbar)) {
                    i2 |= 8196;
                }
                if (((~i) & i2) != 0 && z && this.CatchingFishRecyclerView && ((CatchingFishView || this.CatchingFishAppCompat) && (obj3 instanceof Activity))) {
                    activity = (Activity) obj3;
                    if (!activity.isChild()) {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31 && (i2 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(CatchingFishNavigation.getLayoutDirection());
                        }
                        if (i7 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new CatchingFishMVPLayout(r1, activity));
                        }
                        z3 = true;
                        if (!z3 || i2 == 0) {
                            z5 = z3;
                        } else {
                            r1 = (i2 & i) == i2 ? 1 : 0;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i6;
                            if (CatchingFishSnackbar != null) {
                                CatchingFishGlideSnackbar.CatchingFishReduxKtor(configuration2, CatchingFishSnackbar);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i8 = Build.VERSION.SDK_INT;
                            if (i8 < 26 && i8 < 28) {
                                if (!CatchingFishViewMVIMVVM.CatchingFishViewModelFAB) {
                                    try {
                                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                                        CatchingFishViewMVIMVVM.CatchingFishViewModelScope = declaredField;
                                        declaredField.setAccessible(true);
                                    } catch (NoSuchFieldException unused) {
                                    }
                                    CatchingFishViewMVIMVVM.CatchingFishViewModelFAB = true;
                                }
                                Field field = CatchingFishViewMVIMVVM.CatchingFishViewModelScope;
                                if (field != null) {
                                    try {
                                        obj = field.get(resources);
                                    } catch (IllegalAccessException unused2) {
                                        obj = null;
                                    }
                                    if (obj != null) {
                                        if (!CatchingFishViewMVIMVVM.CatchingFishSnackbar) {
                                            try {
                                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                                CatchingFishViewMVIMVVM.CatchingFishParcelableFAB = declaredField2;
                                                declaredField2.setAccessible(true);
                                            } catch (NoSuchFieldException unused3) {
                                            }
                                            CatchingFishViewMVIMVVM.CatchingFishSnackbar = true;
                                        }
                                        Field field2 = CatchingFishViewMVIMVVM.CatchingFishParcelableFAB;
                                        if (field2 != null) {
                                            try {
                                                obj2 = field2.get(obj);
                                            } catch (IllegalAccessException unused4) {
                                            }
                                            if (obj2 != null) {
                                                if (!CatchingFishViewMVIMVVM.CatchingFishReduxKtor) {
                                                    try {
                                                        CatchingFishViewMVIMVVM.CatchingFishCoroutine = Class.forName("android.content.res.ThemedResourceCache");
                                                    } catch (ClassNotFoundException unused5) {
                                                    }
                                                    CatchingFishViewMVIMVVM.CatchingFishReduxKtor = true;
                                                }
                                                Class cls = CatchingFishViewMVIMVVM.CatchingFishCoroutine;
                                                if (cls != null) {
                                                    if (!CatchingFishViewMVIMVVM.CatchingFishWorkManager) {
                                                        try {
                                                            Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                                            CatchingFishViewMVIMVVM.CatchingFishDaggerWebsocket = declaredField3;
                                                            declaredField3.setAccessible(true);
                                                        } catch (NoSuchFieldException unused6) {
                                                        }
                                                        CatchingFishViewMVIMVVM.CatchingFishWorkManager = true;
                                                    }
                                                    Field field3 = CatchingFishViewMVIMVVM.CatchingFishDaggerWebsocket;
                                                    if (field3 != null) {
                                                        try {
                                                            longSparseArray = (LongSparseArray) field3.get(obj2);
                                                        } catch (IllegalAccessException unused7) {
                                                        }
                                                        if (longSparseArray != null) {
                                                            longSparseArray.clear();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        obj2 = null;
                                        if (obj2 != null) {
                                        }
                                    }
                                }
                            }
                            int i9 = this.CatchingFishAnimation;
                            if (i9 != 0) {
                                context.setTheme(i9);
                                context.getTheme().applyStyle(this.CatchingFishAnimation, true);
                            }
                            if (r1 != 0 && (obj3 instanceof Activity)) {
                                Activity activity2 = (Activity) obj3;
                                if (activity2 instanceof CatchingFishToastFlux) {
                                    if (((CatchingFishToastFlux) activity2).CatchingFishDaggerWebsocket().CatchingFishReduxKtor.compareTo(CatchingFishMockkFirebase.CatchingFishWorkManager) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.CatchingFishAppCompat && !this.CatchingFishDataStoreIntent) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (z5 && (obj3 instanceof AppCompatActivity)) {
                            if ((i2 & 512) != 0) {
                            }
                            if ((i2 & 4) != 0) {
                            }
                        }
                        if (CatchingFishSnackbar != null) {
                            CatchingFishGlideSnackbar.CatchingFishCoroutine(CatchingFishGlideSnackbar.CatchingFishSnackbar(context.getResources().getConfiguration()));
                        }
                        if (i3 == 0) {
                            CatchingFishSpannableWidget(context).CatchingFishDaggerWebsocket();
                        } else {
                            CatchingFishCardViewHandler catchingFishCardViewHandler = this.CatchingFishMoshiDaggerHilt;
                            if (catchingFishCardViewHandler != null) {
                                catchingFishCardViewHandler.CatchingFishParcelableFAB();
                            }
                        }
                        if (i3 == 3) {
                            if (this.CatchingFishAndroidX == null) {
                                this.CatchingFishAndroidX = new CatchingFishCardViewHandler(this, context);
                            }
                            this.CatchingFishAndroidX.CatchingFishDaggerWebsocket();
                        } else {
                            CatchingFishCardViewHandler catchingFishCardViewHandler2 = this.CatchingFishAndroidX;
                            if (catchingFishCardViewHandler2 != null) {
                                catchingFishCardViewHandler2.CatchingFishParcelableFAB();
                            }
                        }
                        return z5;
                    }
                }
                z3 = false;
                if (z3) {
                }
                z5 = z3;
                if (z5) {
                    if ((i2 & 512) != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                }
                if (CatchingFishSnackbar != null) {
                }
                if (i3 == 0) {
                }
                if (i3 == 3) {
                }
                return z5;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i4 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.CatchingFishMVVMAppCompat = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException unused8) {
                this.CatchingFishMVVMAppCompat = 0;
            }
        }
        this.CatchingFishStripeAPI = true;
        i = this.CatchingFishMVVMAppCompat;
        configuration = this.CatchingFishStateFlow;
        if (configuration == null) {
        }
        int i52 = configuration.uiMode & 48;
        int i62 = CatchingFishNavigation.uiMode & 48;
        CatchingFishIntentStateFlow CatchingFishSnackbar22 = CatchingFishGlideSnackbar.CatchingFishSnackbar(configuration);
        if (CatchingFishUnitTesting != null) {
        }
        if (i52 == i62) {
        }
        if (CatchingFishSnackbar != null) {
            i2 |= 8196;
        }
        if (((~i) & i2) != 0) {
            activity = (Activity) obj3;
            if (!activity.isChild()) {
            }
        }
        z3 = false;
        if (z3) {
        }
        z5 = z3;
        if (z5) {
        }
        if (CatchingFishSnackbar != null) {
        }
        if (i3 == 0) {
        }
        if (i3 == 3) {
        }
        return z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cd, code lost:
    
        if (r13.CatchingFishViewModelFAB == null) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishFragmentFactory(CatchingFishDaggerHiltHilt catchingFishDaggerHiltHilt, KeyEvent keyEvent) {
        CatchingFishOkHttpManifest catchingFishOkHttpManifest;
        CatchingFishOkHttpManifest catchingFishOkHttpManifest2;
        Resources.Theme theme;
        CatchingFishOkHttpManifest catchingFishOkHttpManifest3;
        CatchingFishOkHttpManifest catchingFishOkHttpManifest4;
        if (!this.CatchingFishDataStoreIntent) {
            boolean z = catchingFishDaggerHiltHilt.CatchingFishCloudMessaging;
            int i = catchingFishDaggerHiltHilt.CatchingFishParcelableFAB;
            if (z) {
                return true;
            }
            CatchingFishDaggerHiltHilt catchingFishDaggerHiltHilt2 = this.CatchingFishLayoutInflater;
            if (catchingFishDaggerHiltHilt2 != null && catchingFishDaggerHiltHilt2 != catchingFishDaggerHiltHilt) {
                CatchingFishRoomDatabase(catchingFishDaggerHiltHilt2, false);
            }
            Window.Callback callback = this.CatchingFishAnimationMockk.getCallback();
            if (callback != null) {
                catchingFishDaggerHiltHilt.CatchingFishViewModelScope = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (catchingFishOkHttpManifest4 = this.CatchingFishCoroutineFlow) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) catchingFishOkHttpManifest4;
                actionBarOverlayLayout.CatchingFishCloudMessaging();
                ((CatchingFishMVVMAsyncTask) actionBarOverlayLayout.CatchingFishViewModelFAB).CatchingFishEspressoTesting = true;
            }
            if (catchingFishDaggerHiltHilt.CatchingFishViewModelScope == null) {
                CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = catchingFishDaggerHiltHilt.CatchingFishViewModelFAB;
                if (catchingFishSharedFlowAdMob == null || catchingFishDaggerHiltHilt.CatchingFishAnimationMockk) {
                    if (catchingFishSharedFlowAdMob == null) {
                        Context context = this.CatchingFishUnitTesting;
                        if ((i == 0 || i == 108) && this.CatchingFishCoroutineFlow != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(com.catchingfish.fishcatcherpro.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(com.catchingfish.fishcatcherpro.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(com.catchingfish.fishcatcherpro.R.attr.actionBarWidgetTheme, typedValue, true);
                                theme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (theme == null) {
                                    theme = context.getResources().newTheme();
                                    theme.setTo(theme2);
                                }
                                theme.applyStyle(typedValue.resourceId, true);
                            }
                            if (theme != null) {
                                CatchingFishGraphQLManifest catchingFishGraphQLManifest = new CatchingFishGraphQLManifest(context, 0);
                                catchingFishGraphQLManifest.getTheme().setTo(theme);
                                context = catchingFishGraphQLManifest;
                            }
                        }
                        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob2 = new CatchingFishSharedFlowAdMob(context);
                        catchingFishSharedFlowAdMob2.CatchingFishDaggerWebsocket = this;
                        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob3 = catchingFishDaggerHiltHilt.CatchingFishViewModelFAB;
                        if (catchingFishSharedFlowAdMob2 != catchingFishSharedFlowAdMob3) {
                            if (catchingFishSharedFlowAdMob3 != null) {
                                catchingFishSharedFlowAdMob3.CatchingFishNavigation(catchingFishDaggerHiltHilt.CatchingFishLayout);
                            }
                            catchingFishDaggerHiltHilt.CatchingFishViewModelFAB = catchingFishSharedFlowAdMob2;
                            CatchingFishEspressoGraphQL catchingFishEspressoGraphQL = catchingFishDaggerHiltHilt.CatchingFishLayout;
                            if (catchingFishEspressoGraphQL != null) {
                                catchingFishSharedFlowAdMob2.CatchingFishSnackbar(catchingFishEspressoGraphQL, catchingFishSharedFlowAdMob2.CatchingFishParcelableFAB);
                            }
                        }
                    }
                    if (z2 && (catchingFishOkHttpManifest2 = this.CatchingFishCoroutineFlow) != null) {
                        if (this.CatchingFishDaggerHiltFAB == null) {
                            this.CatchingFishDaggerHiltFAB = new CatchingFishAndroidXPicasso(this, 2);
                        }
                        ((ActionBarOverlayLayout) catchingFishOkHttpManifest2).CatchingFishEspressoTesting(catchingFishDaggerHiltHilt.CatchingFishViewModelFAB, this.CatchingFishDaggerHiltFAB);
                    }
                    catchingFishDaggerHiltHilt.CatchingFishViewModelFAB.CatchingFishSpannableWidget();
                    if (callback.onCreatePanelMenu(i, catchingFishDaggerHiltHilt.CatchingFishViewModelFAB)) {
                        catchingFishDaggerHiltHilt.CatchingFishAnimationMockk = false;
                    } else {
                        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob4 = catchingFishDaggerHiltHilt.CatchingFishViewModelFAB;
                        if (catchingFishSharedFlowAdMob4 != null) {
                            if (catchingFishSharedFlowAdMob4 != null) {
                                catchingFishSharedFlowAdMob4.CatchingFishNavigation(catchingFishDaggerHiltHilt.CatchingFishLayout);
                            }
                            catchingFishDaggerHiltHilt.CatchingFishViewModelFAB = null;
                        }
                        if (z2 && (catchingFishOkHttpManifest = this.CatchingFishCoroutineFlow) != null) {
                            ((ActionBarOverlayLayout) catchingFishOkHttpManifest).CatchingFishEspressoTesting(null, this.CatchingFishDaggerHiltFAB);
                        }
                    }
                }
                catchingFishDaggerHiltHilt.CatchingFishViewModelFAB.CatchingFishSpannableWidget();
                Bundle bundle = catchingFishDaggerHiltHilt.CatchingFishStateLiveData;
                if (bundle != null) {
                    catchingFishDaggerHiltHilt.CatchingFishViewModelFAB.CatchingFish(bundle);
                    catchingFishDaggerHiltHilt.CatchingFishStateLiveData = null;
                }
                if (!callback.onPreparePanel(0, catchingFishDaggerHiltHilt.CatchingFishViewModelScope, catchingFishDaggerHiltHilt.CatchingFishViewModelFAB)) {
                    if (z2 && (catchingFishOkHttpManifest3 = this.CatchingFishCoroutineFlow) != null) {
                        ((ActionBarOverlayLayout) catchingFishOkHttpManifest3).CatchingFishEspressoTesting(null, this.CatchingFishDaggerHiltFAB);
                    }
                    catchingFishDaggerHiltHilt.CatchingFishViewModelFAB.CatchingFishDaggerHiltFAB();
                    return false;
                }
                catchingFishDaggerHiltHilt.CatchingFishViewModelFAB.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                catchingFishDaggerHiltHilt.CatchingFishViewModelFAB.CatchingFishDaggerHiltFAB();
            }
            catchingFishDaggerHiltHilt.CatchingFishCloudMessaging = true;
            catchingFishDaggerHiltHilt.CatchingFishEspressoTesting = false;
            this.CatchingFishLayoutInflater = catchingFishDaggerHiltHilt;
            return true;
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishBundleDagger
    public final void CatchingFishFragmentHandler(View view, ViewGroup.LayoutParams layoutParams) {
        CatchingFishCoroutineFlow();
        ViewGroup viewGroup = (ViewGroup) this.CatchingFishFragmentFactory.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.CatchingFishStateLiveData.CatchingFishParcelableFAB(this.CatchingFishAnimationMockk.getCallback());
    }

    public final void CatchingFishGsonAppCompat() {
        CatchingFishCoroutineFlow();
        if (this.CatchingFishEspressoMockk && this.CatchingFishNavigation == null) {
            Object obj = this.CatchingFishOkHttp;
            if (obj instanceof Activity) {
                this.CatchingFishNavigation = new CatchingFishGraphQLFragment((Activity) obj, this.CatchingFishDagger);
            } else if (obj instanceof Dialog) {
                this.CatchingFishNavigation = new CatchingFishGraphQLFragment((Dialog) obj);
            }
            CatchingFishGraphQLFragment catchingFishGraphQLFragment = this.CatchingFishNavigation;
            if (catchingFishGraphQLFragment != null) {
                catchingFishGraphQLFragment.CatchingFishStateFlow(this.CatchingFishDaggerMVVM);
            }
        }
    }

    public final void CatchingFishJetpackCompose(int i) {
        CatchingFishDaggerHiltHilt CatchingFishParcelableFlux = CatchingFishParcelableFlux(i);
        if (CatchingFishParcelableFlux.CatchingFishViewModelFAB != null) {
            Bundle bundle = new Bundle();
            CatchingFishParcelableFlux.CatchingFishViewModelFAB.CatchingFishJetpackCompose(bundle);
            if (bundle.size() > 0) {
                CatchingFishParcelableFlux.CatchingFishStateLiveData = bundle;
            }
            CatchingFishParcelableFlux.CatchingFishViewModelFAB.CatchingFishSpannableWidget();
            CatchingFishParcelableFlux.CatchingFishViewModelFAB.clear();
        }
        CatchingFishParcelableFlux.CatchingFishAnimationMockk = true;
        CatchingFishParcelableFlux.CatchingFishUnitTesting = true;
        if ((i == 108 || i == 0) && this.CatchingFishCoroutineFlow != null) {
            CatchingFishDaggerHiltHilt CatchingFishParcelableFlux2 = CatchingFishParcelableFlux(0);
            CatchingFishParcelableFlux2.CatchingFishCloudMessaging = false;
            CatchingFishFragmentFactory(CatchingFishParcelableFlux2, null);
        }
    }

    public final void CatchingFishJobScheduler() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.CatchingFishFirebase != null && (CatchingFishParcelableFlux(0).CatchingFishOkHttp || this.CatchingFishParcelableFlux != null)) {
                z = true;
            }
            if (z && this.CatchingFishRetrofitMVI == null) {
                this.CatchingFishRetrofitMVI = CatchingFishServiceContext.CatchingFishSnackbar(this.CatchingFishFirebase, this);
            } else {
                if (z || (onBackInvokedCallback = this.CatchingFishRetrofitMVI) == null) {
                    return;
                }
                CatchingFishServiceContext.CatchingFishCoroutine(this.CatchingFishFirebase, onBackInvokedCallback);
                this.CatchingFishRetrofitMVI = null;
            }
        }
    }

    @Override // kotlin.text.CatchingFishBundleDagger
    public final void CatchingFishLayout(View view) {
        CatchingFishCoroutineFlow();
        ViewGroup viewGroup = (ViewGroup) this.CatchingFishFragmentFactory.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.CatchingFishStateLiveData.CatchingFishParcelableFAB(this.CatchingFishAnimationMockk.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0176, code lost:
    
        if (r2.CatchingFishLayout.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0156, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishMVPRobolectric(CatchingFishDaggerHiltHilt catchingFishDaggerHiltHilt, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = catchingFishDaggerHiltHilt.CatchingFishOkHttp;
        int i2 = catchingFishDaggerHiltHilt.CatchingFishParcelableFAB;
        if (z || this.CatchingFishDataStoreIntent) {
            return;
        }
        Context context = this.CatchingFishUnitTesting;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.CatchingFishAnimationMockk.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, catchingFishDaggerHiltHilt.CatchingFishViewModelFAB)) {
            CatchingFishRoomDatabase(catchingFishDaggerHiltHilt, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !CatchingFishFragmentFactory(catchingFishDaggerHiltHilt, keyEvent)) {
            return;
        }
        CatchingFishHandlerRetrofit catchingFishHandlerRetrofit = catchingFishDaggerHiltHilt.CatchingFishDaggerWebsocket;
        if (catchingFishHandlerRetrofit == null || catchingFishDaggerHiltHilt.CatchingFishUnitTesting) {
            if (catchingFishHandlerRetrofit == null) {
                CatchingFishGsonAppCompat();
                CatchingFishGraphQLFragment catchingFishGraphQLFragment = this.CatchingFishNavigation;
                Context CatchingFishAppCompat = catchingFishGraphQLFragment != null ? catchingFishGraphQLFragment.CatchingFishAppCompat() : null;
                if (CatchingFishAppCompat != null) {
                    context = CatchingFishAppCompat;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.catchingfish.fishcatcherpro.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.catchingfish.fishcatcherpro.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.catchingfish.fishcatcherpro.R.style.Theme_AppCompat_CompactMenu, true);
                }
                CatchingFishGraphQLManifest catchingFishGraphQLManifest = new CatchingFishGraphQLManifest(context, 0);
                catchingFishGraphQLManifest.getTheme().setTo(newTheme);
                catchingFishDaggerHiltHilt.CatchingFishFragmentHandler = catchingFishGraphQLManifest;
                TypedArray obtainStyledAttributes = catchingFishGraphQLManifest.obtainStyledAttributes(CatchingFishWidgetGlide.CatchingFishFragmentHandler);
                catchingFishDaggerHiltHilt.CatchingFishSnackbar = obtainStyledAttributes.getResourceId(86, 0);
                catchingFishDaggerHiltHilt.CatchingFishReduxKtor = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                catchingFishDaggerHiltHilt.CatchingFishDaggerWebsocket = new CatchingFishHandlerRetrofit(this, catchingFishDaggerHiltHilt.CatchingFishFragmentHandler);
                catchingFishDaggerHiltHilt.CatchingFishCoroutine = 81;
            } else if (catchingFishDaggerHiltHilt.CatchingFishUnitTesting && catchingFishHandlerRetrofit.getChildCount() > 0) {
                catchingFishDaggerHiltHilt.CatchingFishDaggerWebsocket.removeAllViews();
            }
            View view = catchingFishDaggerHiltHilt.CatchingFishViewModelScope;
            if (view == null) {
                if (catchingFishDaggerHiltHilt.CatchingFishViewModelFAB != null) {
                    if (this.CatchingFishSpannableWidget == null) {
                        this.CatchingFishSpannableWidget = new CatchingFishAndroidXPicasso(this, 3);
                    }
                    CatchingFishAndroidXPicasso catchingFishAndroidXPicasso = this.CatchingFishSpannableWidget;
                    if (catchingFishDaggerHiltHilt.CatchingFishLayout == null) {
                        CatchingFishEspressoGraphQL catchingFishEspressoGraphQL = new CatchingFishEspressoGraphQL(catchingFishDaggerHiltHilt.CatchingFishFragmentHandler);
                        catchingFishDaggerHiltHilt.CatchingFishLayout = catchingFishEspressoGraphQL;
                        catchingFishEspressoGraphQL.CatchingFishViewModelFAB = catchingFishAndroidXPicasso;
                        CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob = catchingFishDaggerHiltHilt.CatchingFishViewModelFAB;
                        catchingFishSharedFlowAdMob.CatchingFishSnackbar(catchingFishEspressoGraphQL, catchingFishSharedFlowAdMob.CatchingFishParcelableFAB);
                    }
                    CatchingFishEspressoGraphQL catchingFishEspressoGraphQL2 = catchingFishDaggerHiltHilt.CatchingFishLayout;
                    CatchingFishHandlerRetrofit catchingFishHandlerRetrofit2 = catchingFishDaggerHiltHilt.CatchingFishDaggerWebsocket;
                    if (catchingFishEspressoGraphQL2.CatchingFishViewModelScope == null) {
                        catchingFishEspressoGraphQL2.CatchingFishViewModelScope = (ExpandedMenuView) catchingFishEspressoGraphQL2.CatchingFishDaggerWebsocket.inflate(com.catchingfish.fishcatcherpro.R.layout.abc_expanded_menu_layout, (ViewGroup) catchingFishHandlerRetrofit2, false);
                        if (catchingFishEspressoGraphQL2.CatchingFishLayout == null) {
                            catchingFishEspressoGraphQL2.CatchingFishLayout = new CatchingFishRoomIntent(catchingFishEspressoGraphQL2);
                        }
                        catchingFishEspressoGraphQL2.CatchingFishViewModelScope.setAdapter((ListAdapter) catchingFishEspressoGraphQL2.CatchingFishLayout);
                        catchingFishEspressoGraphQL2.CatchingFishViewModelScope.setOnItemClickListener(catchingFishEspressoGraphQL2);
                    }
                    ExpandedMenuView expandedMenuView = catchingFishEspressoGraphQL2.CatchingFishViewModelScope;
                    catchingFishDaggerHiltHilt.CatchingFishWorkManager = expandedMenuView;
                }
                catchingFishDaggerHiltHilt.CatchingFishUnitTesting = true;
                return;
            }
            catchingFishDaggerHiltHilt.CatchingFishWorkManager = view;
            if (catchingFishDaggerHiltHilt.CatchingFishWorkManager != null) {
                if (catchingFishDaggerHiltHilt.CatchingFishViewModelScope == null) {
                    CatchingFishEspressoGraphQL catchingFishEspressoGraphQL3 = catchingFishDaggerHiltHilt.CatchingFishLayout;
                    if (catchingFishEspressoGraphQL3.CatchingFishLayout == null) {
                        catchingFishEspressoGraphQL3.CatchingFishLayout = new CatchingFishRoomIntent(catchingFishEspressoGraphQL3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = catchingFishDaggerHiltHilt.CatchingFishWorkManager.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                catchingFishDaggerHiltHilt.CatchingFishDaggerWebsocket.setBackgroundResource(catchingFishDaggerHiltHilt.CatchingFishSnackbar);
                ViewParent parent = catchingFishDaggerHiltHilt.CatchingFishWorkManager.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(catchingFishDaggerHiltHilt.CatchingFishWorkManager);
                }
                catchingFishDaggerHiltHilt.CatchingFishDaggerWebsocket.addView(catchingFishDaggerHiltHilt.CatchingFishWorkManager, layoutParams2);
                if (!catchingFishDaggerHiltHilt.CatchingFishWorkManager.hasFocus()) {
                    catchingFishDaggerHiltHilt.CatchingFishWorkManager.requestFocus();
                }
            }
            catchingFishDaggerHiltHilt.CatchingFishUnitTesting = true;
            return;
        }
        View view2 = catchingFishDaggerHiltHilt.CatchingFishViewModelScope;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            catchingFishDaggerHiltHilt.CatchingFishEspressoTesting = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION, 8519680, -3);
            layoutParams3.gravity = catchingFishDaggerHiltHilt.CatchingFishCoroutine;
            layoutParams3.windowAnimations = catchingFishDaggerHiltHilt.CatchingFishReduxKtor;
            windowManager.addView(catchingFishDaggerHiltHilt.CatchingFishDaggerWebsocket, layoutParams3);
            catchingFishDaggerHiltHilt.CatchingFishOkHttp = true;
            if (i2 != 0) {
                CatchingFishJobScheduler();
                return;
            }
            return;
        }
        i = -2;
        catchingFishDaggerHiltHilt.CatchingFishEspressoTesting = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION, 8519680, -3);
        layoutParams32.gravity = catchingFishDaggerHiltHilt.CatchingFishCoroutine;
        layoutParams32.windowAnimations = catchingFishDaggerHiltHilt.CatchingFishReduxKtor;
        windowManager.addView(catchingFishDaggerHiltHilt.CatchingFishDaggerWebsocket, layoutParams32);
        catchingFishDaggerHiltHilt.CatchingFishOkHttp = true;
        if (i2 != 0) {
        }
    }

    public final void CatchingFishMutableLiveData() {
        if (this.CatchingFishCustomView) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void CatchingFishOkHttp(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.CatchingFishAnimationMockk != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof CatchingFishMVIGradleBundle) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        CatchingFishMVIGradleBundle catchingFishMVIGradleBundle = new CatchingFishMVIGradleBundle(this, callback);
        this.CatchingFishStateLiveData = catchingFishMVIGradleBundle;
        window.setCallback(catchingFishMVIGradleBundle);
        Context context = this.CatchingFishUnitTesting;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, CatchingFishRetrofit);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            CatchingFishPicassoMVPJUnit CatchingFishParcelableFAB = CatchingFishPicassoMVPJUnit.CatchingFishParcelableFAB();
            synchronized (CatchingFishParcelableFAB) {
                drawable = CatchingFishParcelableFAB.CatchingFishParcelableFAB.CatchingFishReduxKtor(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.CatchingFishAnimationMockk = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.CatchingFishFirebase) != null) {
            return;
        }
        Object obj = this.CatchingFishOkHttp;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.CatchingFishRetrofitMVI) != null) {
            CatchingFishServiceContext.CatchingFishCoroutine(onBackInvokedDispatcher, onBackInvokedCallback);
            this.CatchingFishRetrofitMVI = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.CatchingFishFirebase = CatchingFishServiceContext.CatchingFishParcelableFAB(activity);
                CatchingFishJobScheduler();
            }
        }
        this.CatchingFishFirebase = null;
        CatchingFishJobScheduler();
    }

    public final CatchingFishDaggerHiltHilt CatchingFishParcelableFlux(int i) {
        CatchingFishDaggerHiltHilt[] catchingFishDaggerHiltHiltArr = this.CatchingFishMotionLayout;
        if (catchingFishDaggerHiltHiltArr == null || catchingFishDaggerHiltHiltArr.length <= i) {
            CatchingFishDaggerHiltHilt[] catchingFishDaggerHiltHiltArr2 = new CatchingFishDaggerHiltHilt[i + 1];
            if (catchingFishDaggerHiltHiltArr != null) {
                System.arraycopy(catchingFishDaggerHiltHiltArr, 0, catchingFishDaggerHiltHiltArr2, 0, catchingFishDaggerHiltHiltArr.length);
            }
            this.CatchingFishMotionLayout = catchingFishDaggerHiltHiltArr2;
            catchingFishDaggerHiltHiltArr = catchingFishDaggerHiltHiltArr2;
        }
        CatchingFishDaggerHiltHilt catchingFishDaggerHiltHilt = catchingFishDaggerHiltHiltArr[i];
        if (catchingFishDaggerHiltHilt != null) {
            return catchingFishDaggerHiltHilt;
        }
        CatchingFishDaggerHiltHilt catchingFishDaggerHiltHilt2 = new CatchingFishDaggerHiltHilt();
        catchingFishDaggerHiltHilt2.CatchingFishParcelableFAB = i;
        catchingFishDaggerHiltHilt2.CatchingFishUnitTesting = false;
        catchingFishDaggerHiltHiltArr[i] = catchingFishDaggerHiltHilt2;
        return catchingFishDaggerHiltHilt2;
    }

    public final int CatchingFishPayPal(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.CatchingFishAndroidX == null) {
                            this.CatchingFishAndroidX = new CatchingFishCardViewHandler(this, context);
                        }
                        return this.CatchingFishAndroidX.CatchingFishCoroutine();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return CatchingFishSpannableWidget(context).CatchingFishCoroutine();
                }
            }
            return i;
        }
        return -1;
    }

    public final void CatchingFishRoomDatabase(CatchingFishDaggerHiltHilt catchingFishDaggerHiltHilt, boolean z) {
        CatchingFishHandlerRetrofit catchingFishHandlerRetrofit;
        CatchingFishOkHttpManifest catchingFishOkHttpManifest;
        CatchingFishToast catchingFishToast;
        if (z && catchingFishDaggerHiltHilt.CatchingFishParcelableFAB == 0 && (catchingFishOkHttpManifest = this.CatchingFishCoroutineFlow) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) catchingFishOkHttpManifest;
            actionBarOverlayLayout.CatchingFishCloudMessaging();
            ActionMenuView actionMenuView = ((CatchingFishMVVMAsyncTask) actionBarOverlayLayout.CatchingFishViewModelFAB).CatchingFishParcelableFAB.CatchingFishReduxKtor;
            if (actionMenuView != null && (catchingFishToast = actionMenuView.CatchingFishSpannableWidget) != null && catchingFishToast.CatchingFishViewModelScope()) {
                CatchingFishStateLiveData(catchingFishDaggerHiltHilt.CatchingFishViewModelFAB);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.CatchingFishUnitTesting.getSystemService("window");
        if (windowManager != null && catchingFishDaggerHiltHilt.CatchingFishOkHttp && (catchingFishHandlerRetrofit = catchingFishDaggerHiltHilt.CatchingFishDaggerWebsocket) != null) {
            windowManager.removeView(catchingFishHandlerRetrofit);
            if (z) {
                CatchingFishAnimationMockk(catchingFishDaggerHiltHilt.CatchingFishParcelableFAB, catchingFishDaggerHiltHilt, null);
            }
        }
        catchingFishDaggerHiltHilt.CatchingFishCloudMessaging = false;
        catchingFishDaggerHiltHilt.CatchingFishEspressoTesting = false;
        catchingFishDaggerHiltHilt.CatchingFishOkHttp = false;
        catchingFishDaggerHiltHilt.CatchingFishWorkManager = null;
        catchingFishDaggerHiltHilt.CatchingFishUnitTesting = true;
        if (this.CatchingFishLayoutInflater == catchingFishDaggerHiltHilt) {
            this.CatchingFishLayoutInflater = null;
        }
        if (catchingFishDaggerHiltHilt.CatchingFishParcelableFAB == 0) {
            CatchingFishJobScheduler();
        }
    }

    @Override // kotlin.text.CatchingFishBundleDagger
    public final void CatchingFishSnackbar() {
        String str;
        this.CatchingFishRecyclerView = true;
        CatchingFishEspressoTesting(false, true);
        CatchingFishDaggerHiltFAB();
        Object obj = this.CatchingFishOkHttp;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = CatchingFishOkHttpFAB.CatchingFishPayPal(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                CatchingFishGraphQLFragment catchingFishGraphQLFragment = this.CatchingFishNavigation;
                if (catchingFishGraphQLFragment == null) {
                    this.CatchingFishDaggerMVVM = true;
                } else {
                    catchingFishGraphQLFragment.CatchingFishStateFlow(true);
                }
            }
            synchronized (CatchingFishBundleDagger.CatchingFishCloudMessaging) {
                CatchingFishBundleDagger.CatchingFishReduxKtor(this);
                CatchingFishBundleDagger.CatchingFishFragmentHandler.add(new WeakReference(this));
            }
        }
        this.CatchingFishStateFlow = new Configuration(this.CatchingFishUnitTesting.getResources().getConfiguration());
        this.CatchingFishAppCompat = true;
    }

    public final androidx.appcompat.app.CatchingFishPagingLibrary CatchingFishSpannableWidget(Context context) {
        if (this.CatchingFishMoshiDaggerHilt == null) {
            if (CatchingFishAsyncTaskDagger.CatchingFishFragmentHandler == null) {
                Context applicationContext = context.getApplicationContext();
                CatchingFishAsyncTaskDagger.CatchingFishFragmentHandler = new CatchingFishAsyncTaskDagger(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.CatchingFishMoshiDaggerHilt = new CatchingFishCardViewHandler(this, CatchingFishAsyncTaskDagger.CatchingFishFragmentHandler);
        }
        return this.CatchingFishMoshiDaggerHilt;
    }

    public final void CatchingFishStateLiveData(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob) {
        CatchingFishToast catchingFishToast;
        if (this.CatchingFishGradleManifest) {
            return;
        }
        this.CatchingFishGradleManifest = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.CatchingFishCoroutineFlow;
        actionBarOverlayLayout.CatchingFishCloudMessaging();
        ActionMenuView actionMenuView = ((CatchingFishMVVMAsyncTask) actionBarOverlayLayout.CatchingFishViewModelFAB).CatchingFishParcelableFAB.CatchingFishReduxKtor;
        if (actionMenuView != null && (catchingFishToast = actionMenuView.CatchingFishSpannableWidget) != null) {
            catchingFishToast.CatchingFishReduxKtor();
            CatchingFishRecyclerView catchingFishRecyclerView = catchingFishToast.CatchingFishSpannableWidget;
            if (catchingFishRecyclerView != null && catchingFishRecyclerView.CatchingFishSnackbar()) {
                catchingFishRecyclerView.CatchingFishLayout.dismiss();
            }
        }
        Window.Callback callback = this.CatchingFishAnimationMockk.getCallback();
        if (callback != null && !this.CatchingFishDataStoreIntent) {
            callback.onPanelClosed(108, catchingFishSharedFlowAdMob);
        }
        this.CatchingFishGradleManifest = false;
    }

    @Override // kotlin.text.CatchingFishFABGradleLayout
    public final boolean CatchingFishViewModelFAB(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob, MenuItem menuItem) {
        CatchingFishDaggerHiltHilt catchingFishDaggerHiltHilt;
        Window.Callback callback = this.CatchingFishAnimationMockk.getCallback();
        if (callback != null && !this.CatchingFishDataStoreIntent) {
            CatchingFishSharedFlowAdMob CatchingFishCloudMessaging = catchingFishSharedFlowAdMob.CatchingFishCloudMessaging();
            CatchingFishDaggerHiltHilt[] catchingFishDaggerHiltHiltArr = this.CatchingFishMotionLayout;
            int length = catchingFishDaggerHiltHiltArr != null ? catchingFishDaggerHiltHiltArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    catchingFishDaggerHiltHilt = catchingFishDaggerHiltHiltArr[i];
                    if (catchingFishDaggerHiltHilt != null && catchingFishDaggerHiltHilt.CatchingFishViewModelFAB == CatchingFishCloudMessaging) {
                        break;
                    }
                    i++;
                } else {
                    catchingFishDaggerHiltHilt = null;
                    break;
                }
            }
            if (catchingFishDaggerHiltHilt != null) {
                return callback.onMenuItemSelected(catchingFishDaggerHiltHilt.CatchingFishParcelableFAB, menuItem);
            }
        }
        return false;
    }

    @Override // kotlin.text.CatchingFishBundleDagger
    public final void CatchingFishViewModelScope(int i) {
        CatchingFishCoroutineFlow();
        ViewGroup viewGroup = (ViewGroup) this.CatchingFishFragmentFactory.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.CatchingFishUnitTesting).inflate(i, viewGroup);
        this.CatchingFishStateLiveData.CatchingFishParcelableFAB(this.CatchingFishAnimationMockk.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.CatchingFishViewModelScope() != false) goto L20;
     */
    @Override // kotlin.text.CatchingFishFABGradleLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishWorkManager(CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob) {
        ActionMenuView actionMenuView;
        CatchingFishToast catchingFishToast;
        CatchingFishToast catchingFishToast2;
        CatchingFishToast catchingFishToast3;
        CatchingFishOkHttpManifest catchingFishOkHttpManifest = this.CatchingFishCoroutineFlow;
        if (catchingFishOkHttpManifest != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) catchingFishOkHttpManifest;
            actionBarOverlayLayout.CatchingFishCloudMessaging();
            Toolbar toolbar = ((CatchingFishMVVMAsyncTask) actionBarOverlayLayout.CatchingFishViewModelFAB).CatchingFishParcelableFAB;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.CatchingFishReduxKtor) != null && actionMenuView.CatchingFishDaggerHiltFAB) {
                if (ViewConfiguration.get(this.CatchingFishUnitTesting).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.CatchingFishCoroutineFlow;
                    actionBarOverlayLayout2.CatchingFishCloudMessaging();
                    ActionMenuView actionMenuView2 = ((CatchingFishMVVMAsyncTask) actionBarOverlayLayout2.CatchingFishViewModelFAB).CatchingFishParcelableFAB.CatchingFishReduxKtor;
                    if (actionMenuView2 != null) {
                        CatchingFishToast catchingFishToast4 = actionMenuView2.CatchingFishSpannableWidget;
                        if (catchingFishToast4 != null) {
                            if (catchingFishToast4.CatchingFishParcelableFlux == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.CatchingFishAnimationMockk.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.CatchingFishCoroutineFlow;
                actionBarOverlayLayout3.CatchingFishCloudMessaging();
                ActionMenuView actionMenuView3 = ((CatchingFishMVVMAsyncTask) actionBarOverlayLayout3.CatchingFishViewModelFAB).CatchingFishParcelableFAB.CatchingFishReduxKtor;
                if (actionMenuView3 != null && (catchingFishToast2 = actionMenuView3.CatchingFishSpannableWidget) != null && catchingFishToast2.CatchingFishViewModelScope()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.CatchingFishCoroutineFlow;
                    actionBarOverlayLayout4.CatchingFishCloudMessaging();
                    ActionMenuView actionMenuView4 = ((CatchingFishMVVMAsyncTask) actionBarOverlayLayout4.CatchingFishViewModelFAB).CatchingFishParcelableFAB.CatchingFishReduxKtor;
                    if (actionMenuView4 != null && (catchingFishToast3 = actionMenuView4.CatchingFishSpannableWidget) != null) {
                        catchingFishToast3.CatchingFishReduxKtor();
                    }
                    if (this.CatchingFishDataStoreIntent) {
                        return;
                    }
                    callback.onPanelClosed(108, CatchingFishParcelableFlux(0).CatchingFishViewModelFAB);
                    return;
                }
                if (callback == null || this.CatchingFishDataStoreIntent) {
                    return;
                }
                if (this.CatchingFishNavigationGson && (1 & this.CatchingFishRedux) != 0) {
                    View decorView = this.CatchingFishAnimationMockk.getDecorView();
                    CatchingFishAsyncTaskToast catchingFishAsyncTaskToast = this.CatchingFishCustomViewJUnit;
                    decorView.removeCallbacks(catchingFishAsyncTaskToast);
                    catchingFishAsyncTaskToast.run();
                }
                CatchingFishDaggerHiltHilt CatchingFishParcelableFlux = CatchingFishParcelableFlux(0);
                CatchingFishSharedFlowAdMob catchingFishSharedFlowAdMob2 = CatchingFishParcelableFlux.CatchingFishViewModelFAB;
                if (catchingFishSharedFlowAdMob2 == null || CatchingFishParcelableFlux.CatchingFishAnimationMockk || !callback.onPreparePanel(0, CatchingFishParcelableFlux.CatchingFishViewModelScope, catchingFishSharedFlowAdMob2)) {
                    return;
                }
                callback.onMenuOpened(108, CatchingFishParcelableFlux.CatchingFishViewModelFAB);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.CatchingFishCoroutineFlow;
                actionBarOverlayLayout5.CatchingFishCloudMessaging();
                ActionMenuView actionMenuView5 = ((CatchingFishMVVMAsyncTask) actionBarOverlayLayout5.CatchingFishViewModelFAB).CatchingFishParcelableFAB.CatchingFishReduxKtor;
                if (actionMenuView5 == null || (catchingFishToast = actionMenuView5.CatchingFishSpannableWidget) == null) {
                    return;
                }
                catchingFishToast.CatchingFishEspressoTesting();
                return;
            }
        }
        CatchingFishDaggerHiltHilt CatchingFishParcelableFlux2 = CatchingFishParcelableFlux(0);
        CatchingFishParcelableFlux2.CatchingFishUnitTesting = true;
        CatchingFishRoomDatabase(CatchingFishParcelableFlux2, false);
        CatchingFishMVPRobolectric(CatchingFishParcelableFlux2, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:64:0x01c0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.CatchingFishMockkWidgetKtor.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
