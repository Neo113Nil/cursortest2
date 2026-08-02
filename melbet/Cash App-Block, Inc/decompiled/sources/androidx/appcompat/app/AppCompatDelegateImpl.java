package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.R$styleable;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.StandaloneActionMode;
import androidx.appcompat.view.SupportActionModeWrapper;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.biometric.BiometricPrompt;
import androidx.camera.camera2.adapter.ZslControlImpl$$ExternalSyntheticLambda1;
import androidx.camera.video.Recorder;
import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;
import androidx.compose.ui.window.Api33Impl$$ExternalSyntheticLambda0;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NavUtils;
import androidx.core.content.PermissionChecker;
import androidx.core.content.res.CamUtils;
import androidx.core.os.LocaleListCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.widget.PopupWindowCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import coil3.memory.MemoryCacheService;
import coil3.size.DimensionKt;
import coil3.svg.internal.ParseSvg_androidKt;
import com.android.volley.toolbox.HurlStack;
import com.bugsnag.android.Client;
import com.google.mlkit.vision.text.Text;
import com.plaid.internal.EnumC0170g;
import com.squareup.wire.GrpcMethod;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class AppCompatDelegateImpl extends AppCompatDelegate implements MenuBuilder.Callback, LayoutInflater.Factory2 {
    public ActionBar mActionBar;
    public Recorder.AnonymousClass6 mActionMenuPresenterCallback;
    public ActionMode mActionMode;
    public PopupWindow mActionModePopup;
    public ActionBarContextView mActionModeView;
    public int mActivityHandlesConfigFlags;
    public boolean mActivityHandlesConfigFlagsChecked;
    public final AppCompatCallback mAppCompatCallback;
    public AppCompatViewInflater mAppCompatViewInflater;
    public AppCompatWindowCallback mAppCompatWindowCallback;
    public AutoTimeNightModeManager mAutoBatteryNightModeManager;
    public AutoTimeNightModeManager mAutoTimeNightModeManager;
    public OnBackInvokedCallback mBackCallback;
    public boolean mBaseContextAttached;
    public boolean mClosingActionMenu;
    public final Context mContext;
    public boolean mCreated;
    public DecorContentParent mDecorContentParent;
    public boolean mDestroyed;
    public OnBackInvokedDispatcher mDispatcher;
    public Configuration mEffectiveConfiguration;
    public boolean mEnableDefaultActionBarUp;
    public boolean mFeatureIndeterminateProgress;
    public boolean mFeatureProgress;
    public boolean mHasActionBar;
    public final Object mHost;
    public int mInvalidatePanelMenuFeatures;
    public boolean mInvalidatePanelMenuPosted;
    public boolean mIsFloating;
    public int mLocalNightMode;
    public boolean mLongPressBackDown;
    public SupportMenuInflater mMenuInflater;
    public boolean mOverlayActionBar;
    public boolean mOverlayActionMode;
    public BiometricPrompt mPanelMenuPresenterCallback;
    public PanelFeatureState[] mPanels;
    public PanelFeatureState mPreparedPanel;
    public AnonymousClass6 mShowActionModePopup;
    public View mStatusGuard;
    public ViewGroup mSubDecor;
    public boolean mSubDecorInstalled;
    public Rect mTempRect1;
    public Rect mTempRect2;
    public int mThemeResId;
    public CharSequence mTitle;
    public TextView mTitleView;
    public Window mWindow;
    public boolean mWindowNoTitle;
    public static final SimpleArrayMap sLocalNightModes = new SimpleArrayMap(0);
    public static final int[] sWindowBackgroundStyleable = {R.attr.windowBackground};
    public static final boolean sCanReturnDifferentContext = !"robolectric".equals(Build.FINGERPRINT);
    public ViewPropertyAnimatorCompat mFadeAnim = null;
    public final Client.AnonymousClass3 mInvalidatePanelMenuRunnable = new Client.AnonymousClass3(this, 1);

    /* loaded from: classes3.dex */
    public final class ActionModeCallbackWrapperV9 implements ActionMode.Callback {
        public final ActionMode.Callback mWrapped;

        public ActionModeCallbackWrapperV9(ActionMode.Callback callback) {
            this.mWrapped = callback;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.mWrapped.onActionItemClicked(actionMode, menuItem);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.mWrapped.onCreateActionMode(actionMode, menu);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            this.mWrapped.onDestroyActionMode(actionMode);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.mActionModePopup != null) {
                appCompatDelegateImpl.mWindow.getDecorView().removeCallbacks(appCompatDelegateImpl.mShowActionModePopup);
            }
            if (appCompatDelegateImpl.mActionModeView != null) {
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = appCompatDelegateImpl.mFadeAnim;
                if (viewPropertyAnimatorCompat != null) {
                    viewPropertyAnimatorCompat.cancel();
                }
                ViewPropertyAnimatorCompat animate = ViewCompat.animate(appCompatDelegateImpl.mActionModeView);
                animate.alpha(RecyclerView.DECELERATION_RATE);
                appCompatDelegateImpl.mFadeAnim = animate;
                animate.setListener(new AnonymousClass6.AnonymousClass1(this, 1));
            }
            AppCompatCallback appCompatCallback = appCompatDelegateImpl.mAppCompatCallback;
            if (appCompatCallback != null) {
                appCompatCallback.onSupportActionModeFinished(appCompatDelegateImpl.mActionMode);
            }
            appCompatDelegateImpl.mActionMode = null;
            ViewGroup viewGroup = appCompatDelegateImpl.mSubDecor;
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            viewGroup.requestApplyInsets();
            appCompatDelegateImpl.updateBackInvokedCallbackState();
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            ViewGroup viewGroup = AppCompatDelegateImpl.this.mSubDecor;
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            viewGroup.requestApplyInsets();
            return this.mWrapped.onPrepareActionMode(actionMode, menu);
        }
    }

    /* loaded from: classes3.dex */
    public abstract class Api21Impl {
        public static boolean isPowerSaveMode(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        public static String toLanguageTag(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    public abstract class Api24Impl {
        public static void generateConfigDelta_locale(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static LocaleListCompat getLocales(Configuration configuration) {
            return LocaleListCompat.forLanguageTags(configuration.getLocales().toLanguageTags());
        }

        public static void setDefaultLocales(LocaleListCompat localeListCompat) {
            LocaleList.setDefault(LocaleList.forLanguageTags(localeListCompat.toLanguageTags()));
        }

        public static void setLocales(Configuration configuration, LocaleListCompat localeListCompat) {
            configuration.setLocales(LocaleList.forLanguageTags(localeListCompat.toLanguageTags()));
        }
    }

    public abstract class Api33Impl {
        public static OnBackInvokedDispatcher getOnBackInvokedDispatcher(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback registerOnBackPressedCallback(Object obj, AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            Api33Impl$$ExternalSyntheticLambda0 api33Impl$$ExternalSyntheticLambda0 = new Api33Impl$$ExternalSyntheticLambda0(appCompatDelegateImpl, 1);
            ZslControlImpl$$ExternalSyntheticLambda1.m20m(obj).registerOnBackInvokedCallback(1000000, api33Impl$$ExternalSyntheticLambda0);
            return api33Impl$$ExternalSyntheticLambda0;
        }

        public static void unregisterOnBackInvokedCallback(Object obj, Object obj2) {
            ZslControlImpl$$ExternalSyntheticLambda1.m20m(obj).unregisterOnBackInvokedCallback(ZslControlImpl$$ExternalSyntheticLambda1.m(obj2));
        }
    }

    /* loaded from: classes3.dex */
    public final class ListMenuDecorView extends ContentFrameLayout {
        public ListMenuDecorView(ContextThemeWrapper contextThemeWrapper) {
            super(contextThemeWrapper);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                    appCompatDelegateImpl.closePanel(appCompatDelegateImpl.getPanelState(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(DimensionKt.getDrawable(getContext(), i));
        }
    }

    public final class PanelFeatureState {
        public int background;
        public View createdPanelView;
        public ListMenuDecorView decorView;
        public int featureId;
        public Bundle frozenActionViewState;
        public int gravity;
        public boolean isHandled;
        public boolean isOpen;
        public boolean isPrepared;
        public ListMenuPresenter listMenuPresenter;
        public ContextThemeWrapper listPresenterContext;
        public MenuBuilder menu;
        public boolean refreshDecorView;
        public boolean refreshMenuContent;
        public View shownPanelView;
        public int windowAnimations;
    }

    public AppCompatDelegateImpl(Context context, Window window, AppCompatCallback appCompatCallback, Object obj) {
        AppCompatActivity appCompatActivity = null;
        this.mLocalNightMode = -100;
        this.mContext = context;
        this.mAppCompatCallback = appCompatCallback;
        this.mHost = obj;
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
                this.mLocalNightMode = appCompatActivity.getDelegate().getLocalNightMode();
            }
        }
        if (this.mLocalNightMode == -100) {
            String name = this.mHost.getClass().getName();
            SimpleArrayMap simpleArrayMap = sLocalNightModes;
            Integer num = (Integer) simpleArrayMap.get(name);
            if (num != null) {
                this.mLocalNightMode = num.intValue();
                simpleArrayMap.remove(this.mHost.getClass().getName());
            }
        }
        if (window != null) {
            attachToWindow(window);
        }
        AppCompatDrawableManager.preload();
    }

    public static LocaleListCompat calculateApplicationLocales(Context context) {
        LocaleListCompat localeListCompat;
        if (Build.VERSION.SDK_INT >= 33 || (localeListCompat = AppCompatDelegate.sRequestedAppLocales) == null) {
            return null;
        }
        LocaleListCompat locales = Api24Impl.getLocales(context.getApplicationContext().getResources().getConfiguration());
        LocaleListCompat combineLocalesIfOverlayExists = LocaleOverlayHelper.combineLocalesIfOverlayExists(localeListCompat, locales);
        return combineLocalesIfOverlayExists.isEmpty() ? locales : combineLocalesIfOverlayExists;
    }

    public static Configuration createOverrideAppConfiguration(Context context, int i, LocaleListCompat localeListCompat, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = RecyclerView.DECELERATION_RATE;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (localeListCompat != null) {
            Api24Impl.setLocales(configuration2, localeListCompat);
        }
        return configuration2;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ensureSubDecor();
        ((ViewGroup) this.mSubDecor.findViewById(R.id.content)).addView(view, layoutParams);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean applyApplicationSpecificConfig(boolean z, boolean z2) {
        int i;
        Configuration configuration;
        LocaleListCompat locales;
        int i2;
        boolean z3;
        Activity activity;
        if (this.mDestroyed) {
            return false;
        }
        int i3 = this.mLocalNightMode;
        if (i3 == -100) {
            i3 = AppCompatDelegate.getDefaultNightMode();
        }
        int i4 = i3;
        Context context = this.mContext;
        int mapNightMode = mapNightMode(context, i4);
        LocaleListCompat calculateApplicationLocales = Build.VERSION.SDK_INT < 33 ? calculateApplicationLocales(context) : null;
        if (!z2 && calculateApplicationLocales != null) {
            calculateApplicationLocales = Api24Impl.getLocales(context.getResources().getConfiguration());
        }
        LocaleListCompat localeListCompat = calculateApplicationLocales;
        Configuration createOverrideAppConfiguration = createOverrideAppConfiguration(context, mapNightMode, localeListCompat, null, false);
        boolean z4 = this.mActivityHandlesConfigFlagsChecked;
        boolean z5 = true;
        Object obj = this.mHost;
        if (!z4 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.mEffectiveConfiguration;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i5 = configuration.uiMode & 48;
                int i6 = createOverrideAppConfiguration.uiMode & 48;
                LocaleListCompat locales2 = Api24Impl.getLocales(configuration);
                locales = localeListCompat != null ? null : Api24Impl.getLocales(createOverrideAppConfiguration);
                i2 = i5 == i6 ? 512 : 0;
                if (locales != null && !locales2.equals(locales)) {
                    i2 |= 8196;
                }
                if (((~i) & i2) != 0 && z && this.mBaseContextAttached && ((sCanReturnDifferentContext || this.mCreated) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        if (Build.VERSION.SDK_INT >= 31 && (i2 & PKIFailureInfo.certRevoked) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(createOverrideAppConfiguration.getLayoutDirection());
                        }
                        ActivityCompat.recreate(activity);
                        z3 = true;
                        if (!z3 || i2 == 0) {
                            z5 = z3;
                        } else {
                            boolean z6 = (i & i2) == i2;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i6;
                            if (locales != null) {
                                Api24Impl.setLocales(configuration2, locales);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i7 = this.mThemeResId;
                            if (i7 != 0) {
                                context.setTheme(i7);
                                context.getTheme().applyStyle(this.mThemeResId, true);
                            }
                            if (z6 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof LifecycleOwner) {
                                    if (((LifecycleOwner) activity2).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.mCreated && !this.mDestroyed) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (z5 && (obj instanceof AppCompatActivity)) {
                            if ((i2 & 512) != 0) {
                                ((AppCompatActivity) obj).onNightModeChanged(mapNightMode);
                            }
                            if ((i2 & 4) != 0) {
                                ((AppCompatActivity) obj).onLocalesChanged(localeListCompat);
                            }
                        }
                        if (locales != null) {
                            Api24Impl.setDefaultLocales(Api24Impl.getLocales(context.getResources().getConfiguration()));
                        }
                        AutoTimeNightModeManager autoTimeNightModeManager = this.mAutoTimeNightModeManager;
                        if (i4 == 0) {
                            if (autoTimeNightModeManager == null) {
                                this.mAutoTimeNightModeManager = new AutoTimeNightModeManager(Recorder.AnonymousClass3.getInstance(context));
                            }
                            this.mAutoTimeNightModeManager.setup();
                        } else if (autoTimeNightModeManager != null) {
                            autoTimeNightModeManager.cleanup();
                        }
                        AutoTimeNightModeManager autoTimeNightModeManager2 = this.mAutoBatteryNightModeManager;
                        if (i4 == 3) {
                            if (autoTimeNightModeManager2 == null) {
                                this.mAutoBatteryNightModeManager = new AutoTimeNightModeManager(context);
                            }
                            this.mAutoBatteryNightModeManager.setup();
                        } else if (autoTimeNightModeManager2 != null) {
                            autoTimeNightModeManager2.cleanup();
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
                if (locales != null) {
                }
                AutoTimeNightModeManager autoTimeNightModeManager3 = this.mAutoTimeNightModeManager;
                if (i4 == 0) {
                }
                AutoTimeNightModeManager autoTimeNightModeManager22 = this.mAutoBatteryNightModeManager;
                if (i4 == 3) {
                }
                return z5;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), 269221888);
                if (activityInfo != null) {
                    this.mActivityHandlesConfigFlags = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.mActivityHandlesConfigFlags = 0;
            }
        }
        this.mActivityHandlesConfigFlagsChecked = true;
        i = this.mActivityHandlesConfigFlags;
        configuration = this.mEffectiveConfiguration;
        if (configuration == null) {
        }
        int i52 = configuration.uiMode & 48;
        int i62 = createOverrideAppConfiguration.uiMode & 48;
        LocaleListCompat locales22 = Api24Impl.getLocales(configuration);
        if (localeListCompat != null) {
        }
        if (i52 == i62) {
        }
        if (locales != null) {
            i2 |= 8196;
        }
        if (((~i) & i2) != 0) {
            activity = (Activity) obj;
            if (!activity.isChild()) {
            }
        }
        z3 = false;
        if (z3) {
        }
        z5 = z3;
        if (z5) {
        }
        if (locales != null) {
        }
        AutoTimeNightModeManager autoTimeNightModeManager32 = this.mAutoTimeNightModeManager;
        if (i4 == 0) {
        }
        AutoTimeNightModeManager autoTimeNightModeManager222 = this.mAutoBatteryNightModeManager;
        if (i4 == 3) {
        }
        return z5;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final Context attachBaseContext2(Context context) {
        this.mBaseContextAttached = true;
        int i = this.mLocalNightMode;
        if (i == -100) {
            i = AppCompatDelegate.getDefaultNightMode();
        }
        int mapNightMode = mapNightMode(context, i);
        int i2 = 0;
        if (AppCompatDelegate.isAutoStorageOptedIn(context) && AppCompatDelegate.isAutoStorageOptedIn(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (AppCompatDelegate.sAppLocalesStorageSyncLock) {
                    try {
                        LocaleListCompat localeListCompat = AppCompatDelegate.sRequestedAppLocales;
                        if (localeListCompat == null) {
                            if (AppCompatDelegate.sStoredAppLocales == null) {
                                AppCompatDelegate.sStoredAppLocales = LocaleListCompat.forLanguageTags(NavUtils.readLocales(context));
                            }
                            if (!AppCompatDelegate.sStoredAppLocales.isEmpty()) {
                                AppCompatDelegate.sRequestedAppLocales = AppCompatDelegate.sStoredAppLocales;
                            }
                        } else if (!localeListCompat.equals(AppCompatDelegate.sStoredAppLocales)) {
                            LocaleListCompat localeListCompat2 = AppCompatDelegate.sRequestedAppLocales;
                            AppCompatDelegate.sStoredAppLocales = localeListCompat2;
                            NavUtils.persistLocales(context, localeListCompat2.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!AppCompatDelegate.sIsFrameworkSyncChecked) {
                AppCompatDelegate.sSerialExecutorForLocalesStorage.execute(new AppCompatDelegate$$ExternalSyntheticLambda0(context, i2));
            }
        }
        LocaleListCompat calculateApplicationLocales = calculateApplicationLocales(context);
        Configuration configuration = null;
        if (context instanceof android.view.ContextThemeWrapper) {
            try {
                ((android.view.ContextThemeWrapper) context).applyOverrideConfiguration(createOverrideAppConfiguration(context, mapNightMode, calculateApplicationLocales, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(createOverrideAppConfiguration(context, mapNightMode, calculateApplicationLocales, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!sCanReturnDifferentContext) {
            return super.attachBaseContext2(context);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = RecyclerView.DECELERATION_RATE;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = new Configuration();
            configuration.fontScale = RecyclerView.DECELERATION_RATE;
            if (configuration3.diff(configuration4) != 0) {
                float f = configuration3.fontScale;
                float f2 = configuration4.fontScale;
                if (f != f2) {
                    configuration.fontScale = f2;
                }
                int i3 = configuration3.mcc;
                int i4 = configuration4.mcc;
                if (i3 != i4) {
                    configuration.mcc = i4;
                }
                int i5 = configuration3.mnc;
                int i6 = configuration4.mnc;
                if (i5 != i6) {
                    configuration.mnc = i6;
                }
                Api24Impl.generateConfigDelta_locale(configuration3, configuration4, configuration);
                int i7 = configuration3.touchscreen;
                int i8 = configuration4.touchscreen;
                if (i7 != i8) {
                    configuration.touchscreen = i8;
                }
                int i9 = configuration3.keyboard;
                int i10 = configuration4.keyboard;
                if (i9 != i10) {
                    configuration.keyboard = i10;
                }
                int i11 = configuration3.keyboardHidden;
                int i12 = configuration4.keyboardHidden;
                if (i11 != i12) {
                    configuration.keyboardHidden = i12;
                }
                int i13 = configuration3.navigation;
                int i14 = configuration4.navigation;
                if (i13 != i14) {
                    configuration.navigation = i14;
                }
                int i15 = configuration3.navigationHidden;
                int i16 = configuration4.navigationHidden;
                if (i15 != i16) {
                    configuration.navigationHidden = i16;
                }
                int i17 = configuration3.orientation;
                int i18 = configuration4.orientation;
                if (i17 != i18) {
                    configuration.orientation = i18;
                }
                int i19 = configuration3.screenLayout & 15;
                int i20 = configuration4.screenLayout & 15;
                if (i19 != i20) {
                    configuration.screenLayout |= i20;
                }
                int i21 = configuration3.screenLayout & 192;
                int i22 = configuration4.screenLayout & 192;
                if (i21 != i22) {
                    configuration.screenLayout |= i22;
                }
                int i23 = configuration3.screenLayout & 48;
                int i24 = configuration4.screenLayout & 48;
                if (i23 != i24) {
                    configuration.screenLayout |= i24;
                }
                int i25 = configuration3.screenLayout & 768;
                int i26 = configuration4.screenLayout & 768;
                if (i25 != i26) {
                    configuration.screenLayout |= i26;
                }
                ParseSvg_androidKt.generateConfigDelta_colorMode(configuration3, configuration4, configuration);
                int i27 = configuration3.uiMode & 15;
                int i28 = configuration4.uiMode & 15;
                if (i27 != i28) {
                    configuration.uiMode |= i28;
                }
                int i29 = configuration3.uiMode & 48;
                int i30 = configuration4.uiMode & 48;
                if (i29 != i30) {
                    configuration.uiMode |= i30;
                }
                int i31 = configuration3.screenWidthDp;
                int i32 = configuration4.screenWidthDp;
                if (i31 != i32) {
                    configuration.screenWidthDp = i32;
                }
                int i33 = configuration3.screenHeightDp;
                int i34 = configuration4.screenHeightDp;
                if (i33 != i34) {
                    configuration.screenHeightDp = i34;
                }
                int i35 = configuration3.smallestScreenWidthDp;
                int i36 = configuration4.smallestScreenWidthDp;
                if (i35 != i36) {
                    configuration.smallestScreenWidthDp = i36;
                }
                int i37 = configuration3.densityDpi;
                int i38 = configuration4.densityDpi;
                if (i37 != i38) {
                    configuration.densityDpi = i38;
                }
            }
        }
        Configuration createOverrideAppConfiguration = createOverrideAppConfiguration(context, mapNightMode, calculateApplicationLocales, configuration, true);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, com.squareup.cash.R.style.Theme_AppCompat_Empty);
        contextThemeWrapper.applyOverrideConfiguration(createOverrideAppConfiguration);
        try {
            if (context.getTheme() != null) {
                CamUtils.rebase(contextThemeWrapper.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.attachBaseContext2(contextThemeWrapper);
    }

    public final void attachToWindow(Window window) {
        if (this.mWindow != null) {
            a$$ExternalSyntheticBUOutline0.m$1("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof AppCompatWindowCallback) {
            a$$ExternalSyntheticBUOutline0.m$1("AppCompat has already installed itself into the Window");
            return;
        }
        AppCompatWindowCallback appCompatWindowCallback = new AppCompatWindowCallback(callback);
        this.mAppCompatWindowCallback = appCompatWindowCallback;
        window.setCallback(appCompatWindowCallback);
        GrpcMethod obtainStyledAttributes = GrpcMethod.obtainStyledAttributes(this.mContext, null, sWindowBackgroundStyleable);
        Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(0);
        if (drawableIfKnown != null) {
            window.setBackgroundDrawable(drawableIfKnown);
        }
        obtainStyledAttributes.recycle();
        this.mWindow = window;
        if (Build.VERSION.SDK_INT < 33 || this.mDispatcher != null) {
            return;
        }
        setOnBackInvokedDispatcher(null);
    }

    public final void callOnPanelClosed(int i, PanelFeatureState panelFeatureState, MenuBuilder menuBuilder) {
        if (menuBuilder == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.mPanels;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menuBuilder = panelFeatureState.menu;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.isOpen) && !this.mDestroyed) {
            AppCompatWindowCallback appCompatWindowCallback = this.mAppCompatWindowCallback;
            Window.Callback callback = this.mWindow.getCallback();
            appCompatWindowCallback.getClass();
            try {
                appCompatWindowCallback.mOnPanelClosedBypassEnabled = true;
                callback.onPanelClosed(i, menuBuilder);
            } finally {
                appCompatWindowCallback.mOnPanelClosedBypassEnabled = false;
            }
        }
    }

    public final void checkCloseActionMenu(MenuBuilder menuBuilder) {
        if (this.mClosingActionMenu) {
            return;
        }
        this.mClosingActionMenu = true;
        ((ActionBarOverlayLayout) this.mDecorContentParent).dismissPopups();
        Window.Callback callback = this.mWindow.getCallback();
        if (callback != null && !this.mDestroyed) {
            callback.onPanelClosed(108, menuBuilder);
        }
        this.mClosingActionMenu = false;
    }

    public final void closePanel(PanelFeatureState panelFeatureState, boolean z) {
        ListMenuDecorView listMenuDecorView;
        DecorContentParent decorContentParent;
        if (z && panelFeatureState.featureId == 0 && (decorContentParent = this.mDecorContentParent) != null && ((ActionBarOverlayLayout) decorContentParent).isOverflowMenuShowing()) {
            checkCloseActionMenu(panelFeatureState.menu);
            return;
        }
        WindowManager windowManager = (WindowManager) this.mContext.getSystemService("window");
        if (windowManager != null && panelFeatureState.isOpen && (listMenuDecorView = panelFeatureState.decorView) != null) {
            windowManager.removeView(listMenuDecorView);
            if (z) {
                callOnPanelClosed(panelFeatureState.featureId, panelFeatureState, null);
            }
        }
        panelFeatureState.isPrepared = false;
        panelFeatureState.isHandled = false;
        panelFeatureState.isOpen = false;
        panelFeatureState.shownPanelView = null;
        panelFeatureState.refreshDecorView = true;
        if (this.mPreparedPanel == panelFeatureState) {
            this.mPreparedPanel = null;
        }
        if (panelFeatureState.featureId == 0) {
            updateBackInvokedCallbackState();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        Object obj = this.mHost;
        if (((obj instanceof KeyEventDispatcher.Component) || (obj instanceof AppCompatDialog)) && this.mWindow.getDecorView() != null) {
            KeyEventDispatcher.dispatchBeforeHierarchy();
        }
        if (keyEvent.getKeyCode() == 82) {
            AppCompatWindowCallback appCompatWindowCallback = this.mAppCompatWindowCallback;
            Window.Callback callback = this.mWindow.getCallback();
            appCompatWindowCallback.getClass();
            try {
                appCompatWindowCallback.mDispatchKeyEventBypassEnabled = true;
            } finally {
                appCompatWindowCallback.mDispatchKeyEventBypassEnabled = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.mLongPressBackDown = (keyEvent.getFlags() & 128) != 0;
                return false;
            }
            if (keyCode == 82) {
                if (keyEvent.getRepeatCount() == 0) {
                    PanelFeatureState panelState = getPanelState(0);
                    if (!panelState.isOpen) {
                        preparePanel(panelState, keyEvent);
                        return true;
                    }
                }
            }
        }
        if (keyCode == 4) {
            return onBackPressed();
        }
        if (keyCode == 82) {
            if (this.mActionMode == null) {
                PanelFeatureState panelState2 = getPanelState(0);
                DecorContentParent decorContentParent = this.mDecorContentParent;
                Context context = this.mContext;
                if (decorContentParent == null || !((ActionBarOverlayLayout) decorContentParent).canShowOverflowMenu() || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    boolean z3 = panelState2.isOpen;
                    if (z3 || panelState2.isHandled) {
                        closePanel(panelState2, true);
                        z = z3;
                    } else {
                        if (panelState2.isPrepared) {
                            if (panelState2.refreshMenuContent) {
                                panelState2.isPrepared = false;
                                z2 = preparePanel(panelState2, keyEvent);
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                openPanel(panelState2, keyEvent);
                                z = true;
                            }
                        }
                        z = false;
                    }
                    if (z) {
                        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                        if (audioManager != null) {
                            audioManager.playSoundEffect(0);
                            return true;
                        }
                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                        return true;
                    }
                } else {
                    if (((ActionBarOverlayLayout) this.mDecorContentParent).isOverflowMenuShowing()) {
                        z = ((ActionBarOverlayLayout) this.mDecorContentParent).hideOverflowMenu();
                    } else {
                        if (!this.mDestroyed && preparePanel(panelState2, keyEvent)) {
                            z = ((ActionBarOverlayLayout) this.mDecorContentParent).showOverflowMenu();
                        }
                        z = false;
                    }
                    if (z) {
                    }
                }
            }
        }
    }

    public final void doInvalidatePanelMenu(int i) {
        PanelFeatureState panelState = getPanelState(i);
        if (panelState.menu != null) {
            Bundle bundle = new Bundle();
            panelState.menu.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                panelState.frozenActionViewState = bundle;
            }
            panelState.menu.stopDispatchingItemsChanged();
            panelState.menu.clear();
        }
        panelState.refreshMenuContent = true;
        panelState.refreshDecorView = true;
        if ((i == 108 || i == 0) && this.mDecorContentParent != null) {
            PanelFeatureState panelState2 = getPanelState(0);
            panelState2.isPrepared = false;
            preparePanel(panelState2, null);
        }
    }

    public final void ensureSubDecor() {
        ViewGroup viewGroup;
        if (this.mSubDecorInstalled) {
            return;
        }
        Context context = this.mContext;
        int[] iArr = R$styleable.AppCompatTheme;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            a$$ExternalSyntheticBUOutline0.m$1("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (obtainStyledAttributes.getBoolean(EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, false)) {
            requestWindowFeature(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            requestWindowFeature(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            requestWindowFeature(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            requestWindowFeature(10);
        }
        this.mIsFloating = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        ensureWindow();
        this.mWindow.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        int i = 2;
        if (this.mWindowNoTitle) {
            viewGroup = this.mOverlayActionMode ? (ViewGroup) from.inflate(com.squareup.cash.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.squareup.cash.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.mIsFloating) {
            viewGroup = (ViewGroup) from.inflate(com.squareup.cash.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.mOverlayActionBar = false;
            this.mHasActionBar = false;
        } else if (this.mHasActionBar) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.squareup.cash.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new ContextThemeWrapper(context, typedValue.resourceId) : context).inflate(com.squareup.cash.R.layout.abc_screen_toolbar, (ViewGroup) null);
            DecorContentParent decorContentParent = (DecorContentParent) viewGroup.findViewById(com.squareup.cash.R.id.decor_content_parent);
            this.mDecorContentParent = decorContentParent;
            decorContentParent.setWindowCallback(this.mWindow.getCallback());
            if (this.mOverlayActionBar) {
                ((ActionBarOverlayLayout) this.mDecorContentParent).initFeature(109);
            }
            if (this.mFeatureProgress) {
                ((ActionBarOverlayLayout) this.mDecorContentParent).initFeature(2);
            }
            if (this.mFeatureIndeterminateProgress) {
                ((ActionBarOverlayLayout) this.mDecorContentParent).initFeature(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.mHasActionBar);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.mOverlayActionBar);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.mIsFloating);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.mOverlayActionMode);
            sb.append(", windowNoTitle: ");
            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.mWindowNoTitle, " }"));
            return;
        }
        Extras.Key key = new Extras.Key(this);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(viewGroup, key);
        if (this.mDecorContentParent == null) {
            this.mTitleView = (TextView) viewGroup.findViewById(com.squareup.cash.R.id.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.squareup.cash.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.mWindow.findViewById(R.id.content);
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
        this.mWindow.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new MemoryCacheService(this, i));
        this.mSubDecor = viewGroup;
        Object obj = this.mHost;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.mTitle;
        if (!TextUtils.isEmpty(title)) {
            DecorContentParent decorContentParent2 = this.mDecorContentParent;
            if (decorContentParent2 != null) {
                decorContentParent2.setWindowTitle(title);
            } else {
                ActionBar actionBar = this.mActionBar;
                if (actionBar != null) {
                    actionBar.setWindowTitle(title);
                } else {
                    TextView textView = this.mTitleView;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.mSubDecor.findViewById(R.id.content);
        View decorView = this.mWindow.getDecorView();
        contentFrameLayout2.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        if (contentFrameLayout2.mMinWidthMajor == null) {
            contentFrameLayout2.mMinWidthMajor = new TypedValue();
        }
        obtainStyledAttributes2.getValue(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, contentFrameLayout2.mMinWidthMajor);
        if (contentFrameLayout2.mMinWidthMinor == null) {
            contentFrameLayout2.mMinWidthMinor = new TypedValue();
        }
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.mMinWidthMinor);
        if (obtainStyledAttributes2.hasValue(EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE)) {
            if (contentFrameLayout2.mFixedWidthMajor == null) {
                contentFrameLayout2.mFixedWidthMajor = new TypedValue();
            }
            obtainStyledAttributes2.getValue(EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, contentFrameLayout2.mFixedWidthMajor);
        }
        if (obtainStyledAttributes2.hasValue(EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE)) {
            if (contentFrameLayout2.mFixedWidthMinor == null) {
                contentFrameLayout2.mFixedWidthMinor = new TypedValue();
            }
            obtainStyledAttributes2.getValue(EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, contentFrameLayout2.mFixedWidthMinor);
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            if (contentFrameLayout2.mFixedHeightMajor == null) {
                contentFrameLayout2.mFixedHeightMajor = new TypedValue();
            }
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.mFixedHeightMajor);
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            if (contentFrameLayout2.mFixedHeightMinor == null) {
                contentFrameLayout2.mFixedHeightMinor = new TypedValue();
            }
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.mFixedHeightMinor);
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.mSubDecorInstalled = true;
        PanelFeatureState panelState = getPanelState(0);
        if (this.mDestroyed || panelState.menu != null) {
            return;
        }
        invalidatePanelMenu(108);
    }

    public final void ensureWindow() {
        if (this.mWindow == null) {
            Object obj = this.mHost;
            if (obj instanceof Activity) {
                attachToWindow(((Activity) obj).getWindow());
            }
        }
        if (this.mWindow != null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("We have not been given a Window");
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final View findViewById(int i) {
        ensureSubDecor();
        return this.mWindow.findViewById(i);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final Context getContextForDelegate() {
        return this.mContext;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final ActionBarDrawerToggle$Delegate getDrawerToggleDelegate() {
        return new HurlStack(2);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final int getLocalNightMode() {
        return this.mLocalNightMode;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final MenuInflater getMenuInflater() {
        if (this.mMenuInflater == null) {
            initWindowDecorActionBar();
            ActionBar actionBar = this.mActionBar;
            this.mMenuInflater = new SupportMenuInflater(actionBar != null ? actionBar.getThemedContext() : this.mContext);
        }
        return this.mMenuInflater;
    }

    public final PanelFeatureState getPanelState(int i) {
        PanelFeatureState[] panelFeatureStateArr = this.mPanels;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.mPanels = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState();
        panelFeatureState2.featureId = i;
        panelFeatureState2.refreshDecorView = false;
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final ActionBar getSupportActionBar() {
        initWindowDecorActionBar();
        return this.mActionBar;
    }

    public final void initWindowDecorActionBar() {
        ensureSubDecor();
        if (this.mHasActionBar && this.mActionBar == null) {
            Object obj = this.mHost;
            if (obj instanceof Activity) {
                this.mActionBar = new WindowDecorActionBar((Activity) obj, this.mOverlayActionBar);
            } else if (obj instanceof Dialog) {
                this.mActionBar = new WindowDecorActionBar((Dialog) obj);
            }
            ActionBar actionBar = this.mActionBar;
            if (actionBar != null) {
                actionBar.setDefaultDisplayHomeAsUpEnabled(this.mEnableDefaultActionBarUp);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void installViewFactory() {
        LayoutInflater from = LayoutInflater.from(this.mContext);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof AppCompatDelegateImpl) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void invalidateOptionsMenu() {
        if (this.mActionBar != null) {
            initWindowDecorActionBar();
            if (this.mActionBar.invalidateOptionsMenu()) {
                return;
            }
            invalidatePanelMenu(0);
        }
    }

    public final void invalidatePanelMenu(int i) {
        this.mInvalidatePanelMenuFeatures = (1 << i) | this.mInvalidatePanelMenuFeatures;
        if (this.mInvalidatePanelMenuPosted) {
            return;
        }
        View decorView = this.mWindow.getDecorView();
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        decorView.postOnAnimation(this.mInvalidatePanelMenuRunnable);
        this.mInvalidatePanelMenuPosted = true;
    }

    public final int mapNightMode(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.mAutoBatteryNightModeManager == null) {
                            this.mAutoBatteryNightModeManager = new AutoTimeNightModeManager(context);
                        }
                        return this.mAutoBatteryNightModeManager.getApplyableNightMode();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    if (this.mAutoTimeNightModeManager == null) {
                        this.mAutoTimeNightModeManager = new AutoTimeNightModeManager(Recorder.AnonymousClass3.getInstance(context));
                    }
                    return this.mAutoTimeNightModeManager.getApplyableNightMode();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean onBackPressed() {
        boolean z = this.mLongPressBackDown;
        this.mLongPressBackDown = false;
        PanelFeatureState panelState = getPanelState(0);
        if (!panelState.isOpen) {
            ActionMode actionMode = this.mActionMode;
            if (actionMode != null) {
                actionMode.finish();
                return true;
            }
            initWindowDecorActionBar();
            ActionBar actionBar = this.mActionBar;
            if (actionBar == null || !actionBar.collapseActionView()) {
                return false;
            }
        } else if (!z) {
            closePanel(panelState, true);
            return true;
        }
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.mHasActionBar && this.mSubDecorInstalled) {
            initWindowDecorActionBar();
            ActionBar actionBar = this.mActionBar;
            if (actionBar != null) {
                actionBar.onConfigurationChanged();
            }
        }
        AppCompatDrawableManager appCompatDrawableManager = AppCompatDrawableManager.get();
        Context context = this.mContext;
        synchronized (appCompatDrawableManager) {
            ResourceManagerInternal resourceManagerInternal = appCompatDrawableManager.mResourceManager;
            synchronized (resourceManagerInternal) {
                LongSparseArray longSparseArray = (LongSparseArray) resourceManagerInternal.mDrawableCaches.get(context);
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
        this.mEffectiveConfiguration = new Configuration(this.mContext.getResources().getConfiguration());
        applyApplicationSpecificConfig(false, false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void onCreate(Bundle bundle) {
        String str;
        this.mBaseContextAttached = true;
        applyApplicationSpecificConfig(false, true);
        ensureWindow();
        Object obj = this.mHost;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = NavUtils.getParentActivityName(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                ActionBar actionBar = this.mActionBar;
                if (actionBar == null) {
                    this.mEnableDefaultActionBarUp = true;
                } else {
                    actionBar.setDefaultDisplayHomeAsUpEnabled(true);
                }
            }
            synchronized (AppCompatDelegate.sActivityDelegatesLock) {
                AppCompatDelegate.removeDelegateFromActives(this);
                AppCompatDelegate.sActivityDelegates.add(new WeakReference(this));
            }
        }
        this.mEffectiveConfiguration = new Configuration(this.mContext.getResources().getConfiguration());
        this.mCreated = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x010d, code lost:
    
        if (r9.equals("ImageButton") == false) goto L24;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View appCompatRatingBar;
        View view2 = null;
        if (this.mAppCompatViewInflater == null) {
            int[] iArr = R$styleable.AppCompatTheme;
            Context context2 = this.mContext;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string2 = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string2 == null) {
                this.mAppCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.mAppCompatViewInflater = (AppCompatViewInflater) context2.getClassLoader().loadClass(string2).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string2 + ". Falling back to default.", th);
                    this.mAppCompatViewInflater = new AppCompatViewInflater();
                }
            }
        }
        AppCompatViewInflater appCompatViewInflater = this.mAppCompatViewInflater;
        int i = VectorEnabledTintResources.$r8$clinit;
        appCompatViewInflater.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.View, 0, 0);
        char c = 4;
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context contextThemeWrapper = (resourceId == 0 || ((context instanceof ContextThemeWrapper) && ((ContextThemeWrapper) context).mThemeResource == resourceId)) ? context : new ContextThemeWrapper(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -937446323:
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                appCompatRatingBar = new AppCompatRatingBar(contextThemeWrapper, attributeSet);
                break;
            case 1:
                appCompatRatingBar = new AppCompatCheckedTextView(contextThemeWrapper, attributeSet);
                break;
            case 2:
                appCompatRatingBar = new AppCompatMultiAutoCompleteTextView(contextThemeWrapper, attributeSet);
                break;
            case 3:
                appCompatRatingBar = appCompatViewInflater.createTextView(contextThemeWrapper, attributeSet);
                break;
            case 4:
                appCompatRatingBar = new AppCompatImageButton(contextThemeWrapper, attributeSet);
                break;
            case 5:
                appCompatRatingBar = new AppCompatSeekBar(contextThemeWrapper, attributeSet);
                break;
            case 6:
                appCompatRatingBar = new AppCompatSpinner(contextThemeWrapper, attributeSet);
                break;
            case 7:
                appCompatRatingBar = appCompatViewInflater.createRadioButton(contextThemeWrapper, attributeSet);
                break;
            case '\b':
                appCompatRatingBar = new AppCompatToggleButton(contextThemeWrapper, attributeSet);
                break;
            case '\t':
                appCompatRatingBar = new AppCompatImageView(contextThemeWrapper, attributeSet);
                break;
            case '\n':
                appCompatRatingBar = appCompatViewInflater.createAutoCompleteTextView(contextThemeWrapper, attributeSet);
                break;
            case 11:
                appCompatRatingBar = appCompatViewInflater.createCheckBox(contextThemeWrapper, attributeSet);
                break;
            case '\f':
                appCompatRatingBar = new AppCompatEditText(contextThemeWrapper, attributeSet);
                break;
            case '\r':
                appCompatRatingBar = appCompatViewInflater.createButton(contextThemeWrapper, attributeSet);
                break;
            default:
                appCompatRatingBar = null;
                break;
        }
        if (appCompatRatingBar == null && context != contextThemeWrapper) {
            Object[] objArr = appCompatViewInflater.mConstructorArgs;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = contextThemeWrapper;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = AppCompatViewInflater.sClassPrefixList;
                        if (i2 < 3) {
                            View createViewByPrefix = appCompatViewInflater.createViewByPrefix(contextThemeWrapper, str, strArr[i2]);
                            if (createViewByPrefix != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = createViewByPrefix;
                            } else {
                                i2++;
                            }
                        }
                    }
                } else {
                    View createViewByPrefix2 = appCompatViewInflater.createViewByPrefix(contextThemeWrapper, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = createViewByPrefix2;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            appCompatRatingBar = view2;
        }
        if (appCompatRatingBar != null) {
            Context context3 = appCompatRatingBar.getContext();
            if ((context3 instanceof ContextWrapper) && appCompatRatingBar.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, AppCompatViewInflater.sOnClickAttrs);
                String string3 = obtainStyledAttributes3.getString(0);
                if (string3 != null) {
                    appCompatRatingBar.setOnClickListener(new AppCompatViewInflater.DeclaredOnClickListener(appCompatRatingBar, string3));
                }
                obtainStyledAttributes3.recycle();
            }
        }
        return appCompatRatingBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDestroy() {
        ActionBar actionBar;
        AutoTimeNightModeManager autoTimeNightModeManager;
        AutoTimeNightModeManager autoTimeNightModeManager2;
        if (this.mHost instanceof Activity) {
            synchronized (AppCompatDelegate.sActivityDelegatesLock) {
                AppCompatDelegate.removeDelegateFromActives(this);
            }
        }
        if (this.mInvalidatePanelMenuPosted) {
            this.mWindow.getDecorView().removeCallbacks(this.mInvalidatePanelMenuRunnable);
        }
        this.mDestroyed = true;
        if (this.mLocalNightMode != -100) {
            Object obj = this.mHost;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                sLocalNightModes.put(this.mHost.getClass().getName(), Integer.valueOf(this.mLocalNightMode));
                actionBar = this.mActionBar;
                if (actionBar != null) {
                    actionBar.onDestroy();
                }
                autoTimeNightModeManager = this.mAutoTimeNightModeManager;
                if (autoTimeNightModeManager != null) {
                    autoTimeNightModeManager.cleanup();
                }
                autoTimeNightModeManager2 = this.mAutoBatteryNightModeManager;
                if (autoTimeNightModeManager2 == null) {
                    autoTimeNightModeManager2.cleanup();
                    return;
                }
                return;
            }
        }
        sLocalNightModes.remove(this.mHost.getClass().getName());
        actionBar = this.mActionBar;
        if (actionBar != null) {
        }
        autoTimeNightModeManager = this.mAutoTimeNightModeManager;
        if (autoTimeNightModeManager != null) {
        }
        autoTimeNightModeManager2 = this.mAutoBatteryNightModeManager;
        if (autoTimeNightModeManager2 == null) {
        }
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public final boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        PanelFeatureState panelFeatureState;
        Window.Callback callback = this.mWindow.getCallback();
        if (callback != null && !this.mDestroyed) {
            MenuBuilder rootMenu = menuBuilder.getRootMenu();
            PanelFeatureState[] panelFeatureStateArr = this.mPanels;
            int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    panelFeatureState = panelFeatureStateArr[i];
                    if (panelFeatureState != null && panelFeatureState.menu == rootMenu) {
                        break;
                    }
                    i++;
                } else {
                    panelFeatureState = null;
                    break;
                }
            }
            if (panelFeatureState != null) {
                return callback.onMenuItemSelected(panelFeatureState.featureId, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public final void onMenuModeChange(MenuBuilder menuBuilder) {
        DecorContentParent decorContentParent = this.mDecorContentParent;
        if (decorContentParent == null || !((ActionBarOverlayLayout) decorContentParent).canShowOverflowMenu() || (ViewConfiguration.get(this.mContext).hasPermanentMenuKey() && !((ActionBarOverlayLayout) this.mDecorContentParent).isOverflowMenuShowPending())) {
            PanelFeatureState panelState = getPanelState(0);
            panelState.refreshDecorView = true;
            closePanel(panelState, false);
            openPanel(panelState, null);
            return;
        }
        Window.Callback callback = this.mWindow.getCallback();
        if (((ActionBarOverlayLayout) this.mDecorContentParent).isOverflowMenuShowing()) {
            ((ActionBarOverlayLayout) this.mDecorContentParent).hideOverflowMenu();
            if (this.mDestroyed) {
                return;
            }
            callback.onPanelClosed(108, getPanelState(0).menu);
            return;
        }
        if (callback == null || this.mDestroyed) {
            return;
        }
        if (this.mInvalidatePanelMenuPosted && (1 & this.mInvalidatePanelMenuFeatures) != 0) {
            View decorView = this.mWindow.getDecorView();
            Client.AnonymousClass3 anonymousClass3 = this.mInvalidatePanelMenuRunnable;
            decorView.removeCallbacks(anonymousClass3);
            anonymousClass3.run();
        }
        PanelFeatureState panelState2 = getPanelState(0);
        MenuBuilder menuBuilder2 = panelState2.menu;
        if (menuBuilder2 == null || panelState2.refreshMenuContent || !callback.onPreparePanel(0, panelState2.createdPanelView, menuBuilder2)) {
            return;
        }
        callback.onMenuOpened(108, panelState2.menu);
        ((ActionBarOverlayLayout) this.mDecorContentParent).showOverflowMenu();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void onPostCreate(Bundle bundle) {
        ensureSubDecor();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void onPostResume() {
        initWindowDecorActionBar();
        ActionBar actionBar = this.mActionBar;
        if (actionBar != null) {
            actionBar.setShowHideAnimationEnabled(true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void onSaveInstanceState(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void onStart() {
        applyApplicationSpecificConfig(true, false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void onStop() {
        initWindowDecorActionBar();
        ActionBar actionBar = this.mActionBar;
        if (actionBar != null) {
            actionBar.setShowHideAnimationEnabled(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0134, code lost:
    
        if (r2 != null) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void openPanel(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = panelFeatureState.isOpen;
        int i2 = panelFeatureState.featureId;
        if (z || this.mDestroyed) {
            return;
        }
        Context context = this.mContext;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.mWindow.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, panelFeatureState.menu)) {
            closePanel(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !preparePanel(panelFeatureState, keyEvent)) {
            return;
        }
        ListMenuDecorView listMenuDecorView = panelFeatureState.decorView;
        if (listMenuDecorView == null || panelFeatureState.refreshDecorView) {
            if (listMenuDecorView == null) {
                initWindowDecorActionBar();
                ActionBar actionBar = this.mActionBar;
                Context themedContext = actionBar != null ? actionBar.getThemedContext() : null;
                if (themedContext != null) {
                    context = themedContext;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.squareup.cash.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.squareup.cash.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.squareup.cash.R.style.Theme_AppCompat_CompactMenu, true);
                }
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
                contextThemeWrapper.getTheme().setTo(newTheme);
                panelFeatureState.listPresenterContext = contextThemeWrapper;
                TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(R$styleable.AppCompatTheme);
                panelFeatureState.background = obtainStyledAttributes.getResourceId(86, 0);
                panelFeatureState.windowAnimations = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                panelFeatureState.decorView = new ListMenuDecorView(panelFeatureState.listPresenterContext);
                panelFeatureState.gravity = 81;
            } else if (panelFeatureState.refreshDecorView && listMenuDecorView.getChildCount() > 0) {
                panelFeatureState.decorView.removeAllViews();
            }
            View view = panelFeatureState.createdPanelView;
            if (view == null) {
                if (panelFeatureState.menu != null) {
                    if (this.mPanelMenuPresenterCallback == null) {
                        this.mPanelMenuPresenterCallback = new BiometricPrompt(this, 2);
                    }
                    BiometricPrompt biometricPrompt = this.mPanelMenuPresenterCallback;
                    if (panelFeatureState.listMenuPresenter == null) {
                        ListMenuPresenter listMenuPresenter = new ListMenuPresenter(panelFeatureState.listPresenterContext);
                        panelFeatureState.listMenuPresenter = listMenuPresenter;
                        listMenuPresenter.setCallback(biometricPrompt);
                        panelFeatureState.menu.addMenuPresenter(panelFeatureState.listMenuPresenter);
                    }
                    View view2 = (View) panelFeatureState.listMenuPresenter.getMenuView(panelFeatureState.decorView);
                    panelFeatureState.shownPanelView = view2;
                }
                panelFeatureState.refreshDecorView = true;
                return;
            }
            panelFeatureState.shownPanelView = view;
            if (panelFeatureState.shownPanelView != null && (panelFeatureState.createdPanelView != null || panelFeatureState.listMenuPresenter.getAdapter().getCount() > 0)) {
                ViewGroup.LayoutParams layoutParams2 = panelFeatureState.shownPanelView.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                panelFeatureState.decorView.setBackgroundResource(panelFeatureState.background);
                ViewParent parent = panelFeatureState.shownPanelView.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(panelFeatureState.shownPanelView);
                }
                panelFeatureState.decorView.addView(panelFeatureState.shownPanelView, layoutParams2);
                if (!panelFeatureState.shownPanelView.hasFocus()) {
                    panelFeatureState.shownPanelView.requestFocus();
                }
            }
            panelFeatureState.refreshDecorView = true;
            return;
        }
        View view3 = panelFeatureState.createdPanelView;
        if (view3 != null && (layoutParams = view3.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            panelFeatureState.isHandled = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA, 8519680, -3);
            layoutParams3.gravity = panelFeatureState.gravity;
            layoutParams3.windowAnimations = panelFeatureState.windowAnimations;
            windowManager.addView(panelFeatureState.decorView, layoutParams3);
            panelFeatureState.isOpen = true;
            if (i2 != 0) {
                updateBackInvokedCallbackState();
                return;
            }
            return;
        }
        i = -2;
        panelFeatureState.isHandled = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA, 8519680, -3);
        layoutParams32.gravity = panelFeatureState.gravity;
        layoutParams32.windowAnimations = panelFeatureState.windowAnimations;
        windowManager.addView(panelFeatureState.decorView, layoutParams32);
        panelFeatureState.isOpen = true;
        if (i2 != 0) {
        }
    }

    public final boolean performPanelShortcut(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent) {
        MenuBuilder menuBuilder;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.isPrepared || preparePanel(panelFeatureState, keyEvent)) && (menuBuilder = panelFeatureState.menu) != null) {
            return menuBuilder.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cc, code lost:
    
        if (r13.menu == null) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean preparePanel(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        DecorContentParent decorContentParent;
        DecorContentParent decorContentParent2;
        Resources.Theme theme;
        DecorContentParent decorContentParent3;
        DecorContentParent decorContentParent4;
        if (!this.mDestroyed) {
            boolean z = panelFeatureState.isPrepared;
            int i = panelFeatureState.featureId;
            if (z) {
                return true;
            }
            PanelFeatureState panelFeatureState2 = this.mPreparedPanel;
            if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
                closePanel(panelFeatureState2, false);
            }
            Window.Callback callback = this.mWindow.getCallback();
            if (callback != null) {
                panelFeatureState.createdPanelView = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (decorContentParent4 = this.mDecorContentParent) != null) {
                decorContentParent4.setMenuPrepared();
            }
            if (panelFeatureState.createdPanelView == null && (!z2 || !(this.mActionBar instanceof ToolbarActionBar))) {
                MenuBuilder menuBuilder = panelFeatureState.menu;
                if (menuBuilder == null || panelFeatureState.refreshMenuContent) {
                    if (menuBuilder == null) {
                        Context context = this.mContext;
                        if ((i == 0 || i == 108) && this.mDecorContentParent != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(com.squareup.cash.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(com.squareup.cash.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(com.squareup.cash.R.attr.actionBarWidgetTheme, typedValue, true);
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
                                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
                                contextThemeWrapper.getTheme().setTo(theme);
                                context = contextThemeWrapper;
                            }
                        }
                        MenuBuilder menuBuilder2 = new MenuBuilder(context);
                        menuBuilder2.setCallback(this);
                        MenuBuilder menuBuilder3 = panelFeatureState.menu;
                        if (menuBuilder2 != menuBuilder3) {
                            if (menuBuilder3 != null) {
                                menuBuilder3.removeMenuPresenter(panelFeatureState.listMenuPresenter);
                            }
                            panelFeatureState.menu = menuBuilder2;
                            ListMenuPresenter listMenuPresenter = panelFeatureState.listMenuPresenter;
                            if (listMenuPresenter != null) {
                                menuBuilder2.addMenuPresenter(listMenuPresenter);
                            }
                        }
                    }
                    if (z2 && (decorContentParent2 = this.mDecorContentParent) != null) {
                        if (this.mActionMenuPresenterCallback == null) {
                            this.mActionMenuPresenterCallback = new Recorder.AnonymousClass6(this, 2);
                        }
                        decorContentParent2.setMenu(panelFeatureState.menu, this.mActionMenuPresenterCallback);
                    }
                    panelFeatureState.menu.stopDispatchingItemsChanged();
                    if (callback.onCreatePanelMenu(i, panelFeatureState.menu)) {
                        panelFeatureState.refreshMenuContent = false;
                    } else {
                        MenuBuilder menuBuilder4 = panelFeatureState.menu;
                        if (menuBuilder4 != null) {
                            if (menuBuilder4 != null) {
                                menuBuilder4.removeMenuPresenter(panelFeatureState.listMenuPresenter);
                            }
                            panelFeatureState.menu = null;
                        }
                        if (z2 && (decorContentParent = this.mDecorContentParent) != null) {
                            decorContentParent.setMenu(null, this.mActionMenuPresenterCallback);
                        }
                    }
                }
                panelFeatureState.menu.stopDispatchingItemsChanged();
                Bundle bundle = panelFeatureState.frozenActionViewState;
                if (bundle != null) {
                    panelFeatureState.menu.restoreActionViewStates(bundle);
                    panelFeatureState.frozenActionViewState = null;
                }
                if (!callback.onPreparePanel(0, panelFeatureState.createdPanelView, panelFeatureState.menu)) {
                    if (z2 && (decorContentParent3 = this.mDecorContentParent) != null) {
                        decorContentParent3.setMenu(null, this.mActionMenuPresenterCallback);
                    }
                    panelFeatureState.menu.startDispatchingItemsChanged();
                    return false;
                }
                panelFeatureState.menu.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                panelFeatureState.menu.startDispatchingItemsChanged();
            }
            panelFeatureState.isPrepared = true;
            panelFeatureState.isHandled = false;
            this.mPreparedPanel = panelFeatureState;
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final boolean requestWindowFeature(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.mWindowNoTitle && i == 108) {
            return false;
        }
        if (this.mHasActionBar && i == 1) {
            this.mHasActionBar = false;
        }
        if (i == 1) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mWindowNoTitle = true;
            return true;
        }
        if (i == 2) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mFeatureProgress = true;
            return true;
        }
        if (i == 5) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mFeatureIndeterminateProgress = true;
            return true;
        }
        if (i == 10) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mOverlayActionMode = true;
            return true;
        }
        if (i == 108) {
            throwFeatureRequestIfSubDecorInstalled();
            this.mHasActionBar = true;
            return true;
        }
        if (i != 109) {
            return this.mWindow.requestFeature(i);
        }
        throwFeatureRequestIfSubDecorInstalled();
        this.mOverlayActionBar = true;
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void setContentView(int i) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.mContext).inflate(i, viewGroup);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void setLocalNightMode(int i) {
        if (this.mLocalNightMode != i) {
            this.mLocalNightMode = i;
            if (this.mBaseContextAttached) {
                applyApplicationSpecificConfig(true, true);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void setOnBackInvokedDispatcher(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.setOnBackInvokedDispatcher(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.mDispatcher;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.mBackCallback) != null) {
            Api33Impl.unregisterOnBackInvokedCallback(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.mBackCallback = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.mHost;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.mDispatcher = Api33Impl.getOnBackInvokedDispatcher((Activity) obj);
                updateBackInvokedCallbackState();
            }
        }
        this.mDispatcher = onBackInvokedDispatcher;
        updateBackInvokedCallbackState();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void setSupportActionBar(Toolbar toolbar) {
        Object obj = this.mHost;
        if (obj instanceof Activity) {
            initWindowDecorActionBar();
            ActionBar actionBar = this.mActionBar;
            if (actionBar instanceof WindowDecorActionBar) {
                a$$ExternalSyntheticBUOutline0.m$1("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                return;
            }
            this.mMenuInflater = null;
            if (actionBar != null) {
                actionBar.onDestroy();
            }
            this.mActionBar = null;
            if (toolbar != null) {
                ToolbarActionBar toolbarActionBar = new ToolbarActionBar(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.mTitle, this.mAppCompatWindowCallback);
                this.mActionBar = toolbarActionBar;
                this.mAppCompatWindowCallback.mActionBarCallback = toolbarActionBar.mMenuCallback;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.mAppCompatWindowCallback.mActionBarCallback = null;
            }
            invalidateOptionsMenu();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void setTheme(int i) {
        this.mThemeResId = i;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        DecorContentParent decorContentParent = this.mDecorContentParent;
        if (decorContentParent != null) {
            decorContentParent.setWindowTitle(charSequence);
            return;
        }
        ActionBar actionBar = this.mActionBar;
        if (actionBar != null) {
            actionBar.setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.mTitleView;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    /* JADX WARN: Type inference failed for: r9v38, types: [androidx.appcompat.app.AppCompatDelegateImpl$6] */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ActionMode startSupportActionMode(ActionMode.Callback callback) {
        ActionMode actionMode;
        ViewGroup viewGroup;
        ActionMode actionMode2;
        if (callback == null) {
            a$$ExternalSyntheticBUOutline0.m$3("ActionMode callback can not be null.");
            return null;
        }
        ActionMode actionMode3 = this.mActionMode;
        if (actionMode3 != null) {
            actionMode3.finish();
        }
        ActionModeCallbackWrapperV9 actionModeCallbackWrapperV9 = new ActionModeCallbackWrapperV9(callback);
        initWindowDecorActionBar();
        ActionBar actionBar = this.mActionBar;
        AppCompatCallback appCompatCallback = this.mAppCompatCallback;
        if (actionBar != null) {
            ActionMode startActionMode = actionBar.startActionMode(actionModeCallbackWrapperV9);
            this.mActionMode = startActionMode;
            if (startActionMode != null && appCompatCallback != null) {
                appCompatCallback.onSupportActionModeStarted(startActionMode);
            }
        }
        if (this.mActionMode == null) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.mFadeAnim;
            if (viewPropertyAnimatorCompat != null) {
                viewPropertyAnimatorCompat.cancel();
            }
            ActionMode actionMode4 = this.mActionMode;
            if (actionMode4 != null) {
                actionMode4.finish();
            }
            if (appCompatCallback != null && !this.mDestroyed) {
                try {
                    actionMode = appCompatCallback.onWindowStartingSupportActionMode(actionModeCallbackWrapperV9);
                } catch (AbstractMethodError unused) {
                }
                if (actionMode == null) {
                    this.mActionMode = actionMode;
                } else {
                    if (this.mActionModeView == null) {
                        boolean z = this.mIsFloating;
                        Context context = this.mContext;
                        if (z) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.squareup.cash.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme newTheme = context.getResources().newTheme();
                                newTheme.setTo(theme);
                                newTheme.applyStyle(typedValue.resourceId, true);
                                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
                                contextThemeWrapper.getTheme().setTo(newTheme);
                                context = contextThemeWrapper;
                            }
                            this.mActionModeView = new ActionBarContextView(context);
                            PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, com.squareup.cash.R.attr.actionModePopupWindowStyle);
                            this.mActionModePopup = popupWindow;
                            PopupWindowCompat.setWindowLayoutType(popupWindow);
                            this.mActionModePopup.setContentView(this.mActionModeView);
                            this.mActionModePopup.setWidth(-1);
                            context.getTheme().resolveAttribute(com.squareup.cash.R.attr.actionBarSize, typedValue, true);
                            this.mActionModeView.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                            this.mActionModePopup.setHeight(-2);
                            this.mShowActionModePopup = new Runnable() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.6

                                /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$6$1, reason: invalid class name */
                                public final class AnonymousClass1 extends ViewPropertyAnimatorListenerAdapter {
                                    public final /* synthetic */ int $r8$classId;
                                    public final /* synthetic */ Object this$1;

                                    public /* synthetic */ AnonymousClass1(Object obj, int i) {
                                        this.$r8$classId = i;
                                        this.this$1 = obj;
                                    }

                                    @Override // androidx.core.view.ViewPropertyAnimatorListener
                                    public final void onAnimationEnd() {
                                        int i = this.$r8$classId;
                                        Object obj = this.this$1;
                                        switch (i) {
                                            case 0:
                                                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                                                appCompatDelegateImpl.mActionModeView.setAlpha(1.0f);
                                                appCompatDelegateImpl.mFadeAnim.setListener(null);
                                                appCompatDelegateImpl.mFadeAnim = null;
                                                break;
                                            default:
                                                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                                                appCompatDelegateImpl2.mActionModeView.setVisibility(8);
                                                PopupWindow popupWindow = appCompatDelegateImpl2.mActionModePopup;
                                                if (popupWindow != null) {
                                                    popupWindow.dismiss();
                                                } else if (appCompatDelegateImpl2.mActionModeView.getParent() instanceof View) {
                                                    View view = (View) appCompatDelegateImpl2.mActionModeView.getParent();
                                                    WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                                                    view.requestApplyInsets();
                                                }
                                                appCompatDelegateImpl2.mActionModeView.killMode();
                                                appCompatDelegateImpl2.mFadeAnim.setListener(null);
                                                appCompatDelegateImpl2.mFadeAnim = null;
                                                ViewGroup viewGroup = appCompatDelegateImpl2.mSubDecor;
                                                WeakHashMap weakHashMap2 = ViewCompat.sViewPropertyAnimatorMap;
                                                viewGroup.requestApplyInsets();
                                                break;
                                        }
                                    }

                                    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                                    public void onAnimationStart() {
                                        switch (this.$r8$classId) {
                                            case 0:
                                                AppCompatDelegateImpl.this.mActionModeView.setVisibility(0);
                                                break;
                                        }
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    ViewGroup viewGroup2;
                                    AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                                    int i = 0;
                                    appCompatDelegateImpl.mActionModePopup.showAtLocation(appCompatDelegateImpl.mActionModeView, 55, 0, 0);
                                    ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = appCompatDelegateImpl.mFadeAnim;
                                    if (viewPropertyAnimatorCompat2 != null) {
                                        viewPropertyAnimatorCompat2.cancel();
                                    }
                                    if (!appCompatDelegateImpl.mSubDecorInstalled || (viewGroup2 = appCompatDelegateImpl.mSubDecor) == null || !viewGroup2.isLaidOut()) {
                                        appCompatDelegateImpl.mActionModeView.setAlpha(1.0f);
                                        appCompatDelegateImpl.mActionModeView.setVisibility(0);
                                        return;
                                    }
                                    appCompatDelegateImpl.mActionModeView.setAlpha(RecyclerView.DECELERATION_RATE);
                                    ViewPropertyAnimatorCompat animate = ViewCompat.animate(appCompatDelegateImpl.mActionModeView);
                                    animate.alpha(1.0f);
                                    appCompatDelegateImpl.mFadeAnim = animate;
                                    animate.setListener(new AnonymousClass1(this, i));
                                }
                            };
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) this.mSubDecor.findViewById(com.squareup.cash.R.id.action_mode_bar_stub);
                            if (viewStubCompat != null) {
                                initWindowDecorActionBar();
                                ActionBar actionBar2 = this.mActionBar;
                                Context themedContext = actionBar2 != null ? actionBar2.getThemedContext() : null;
                                if (themedContext != null) {
                                    context = themedContext;
                                }
                                viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                                this.mActionModeView = (ActionBarContextView) viewStubCompat.inflate();
                            }
                        }
                    }
                    if (this.mActionModeView != null) {
                        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = this.mFadeAnim;
                        if (viewPropertyAnimatorCompat2 != null) {
                            viewPropertyAnimatorCompat2.cancel();
                        }
                        this.mActionModeView.killMode();
                        StandaloneActionMode standaloneActionMode = new StandaloneActionMode(this.mActionModeView.getContext(), this.mActionModeView, actionModeCallbackWrapperV9);
                        if (actionModeCallbackWrapperV9.onCreateActionMode(standaloneActionMode, standaloneActionMode.getMenu())) {
                            standaloneActionMode.invalidate();
                            this.mActionModeView.initForMode(standaloneActionMode);
                            this.mActionMode = standaloneActionMode;
                            boolean z2 = this.mSubDecorInstalled && (viewGroup = this.mSubDecor) != null && viewGroup.isLaidOut();
                            ActionBarContextView actionBarContextView = this.mActionModeView;
                            if (z2) {
                                actionBarContextView.setAlpha(RecyclerView.DECELERATION_RATE);
                                ViewPropertyAnimatorCompat animate = ViewCompat.animate(this.mActionModeView);
                                animate.alpha(1.0f);
                                this.mFadeAnim = animate;
                                animate.setListener(new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.app.AppCompatDelegateImpl.7
                                    @Override // androidx.core.view.ViewPropertyAnimatorListener
                                    public final void onAnimationEnd() {
                                        AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                                        appCompatDelegateImpl.mActionModeView.setAlpha(1.0f);
                                        appCompatDelegateImpl.mFadeAnim.setListener(null);
                                        appCompatDelegateImpl.mFadeAnim = null;
                                    }

                                    @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
                                    public final void onAnimationStart() {
                                        AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                                        appCompatDelegateImpl.mActionModeView.setVisibility(0);
                                        if (appCompatDelegateImpl.mActionModeView.getParent() instanceof View) {
                                            View view = (View) appCompatDelegateImpl.mActionModeView.getParent();
                                            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                                            view.requestApplyInsets();
                                        }
                                    }
                                });
                            } else {
                                actionBarContextView.setAlpha(1.0f);
                                this.mActionModeView.setVisibility(0);
                                if (this.mActionModeView.getParent() instanceof View) {
                                    View view = (View) this.mActionModeView.getParent();
                                    WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                                    view.requestApplyInsets();
                                }
                            }
                            if (this.mActionModePopup != null) {
                                this.mWindow.getDecorView().post(this.mShowActionModePopup);
                            }
                        } else {
                            this.mActionMode = null;
                        }
                    }
                }
                actionMode2 = this.mActionMode;
                if (actionMode2 != null && appCompatCallback != null) {
                    appCompatCallback.onSupportActionModeStarted(actionMode2);
                }
                updateBackInvokedCallbackState();
                this.mActionMode = this.mActionMode;
            }
            actionMode = null;
            if (actionMode == null) {
            }
            actionMode2 = this.mActionMode;
            if (actionMode2 != null) {
                appCompatCallback.onSupportActionModeStarted(actionMode2);
            }
            updateBackInvokedCallbackState();
            this.mActionMode = this.mActionMode;
        }
        updateBackInvokedCallbackState();
        return this.mActionMode;
    }

    public final void throwFeatureRequestIfSubDecorInstalled() {
        if (this.mSubDecorInstalled) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void updateBackInvokedCallbackState() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.mDispatcher != null && (getPanelState(0).isOpen || this.mActionMode != null)) {
                z = true;
            }
            if (z && this.mBackCallback == null) {
                this.mBackCallback = Api33Impl.registerOnBackPressedCallback(this.mDispatcher, this);
            } else {
                if (z || (onBackInvokedCallback = this.mBackCallback) == null) {
                    return;
                }
                Api33Impl.unregisterOnBackInvokedCallback(this.mDispatcher, onBackInvokedCallback);
                this.mBackCallback = null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class AutoTimeNightModeManager extends Text.TextBase {
        public final /* synthetic */ int $r8$classId = 1;
        public final Object mTwilightManager;

        public AutoTimeNightModeManager(Context context) {
            super(AppCompatDelegateImpl.this);
            this.mTwilightManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // com.google.mlkit.vision.text.Text.TextBase
        public final IntentFilter createIntentFilterForBroadcastReceiver() {
            switch (this.$r8$classId) {
                case 0:
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.TIME_SET");
                    intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
                    intentFilter.addAction("android.intent.action.TIME_TICK");
                    return intentFilter;
                default:
                    IntentFilter intentFilter2 = new IntentFilter();
                    intentFilter2.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                    return intentFilter2;
            }
        }

        public final int getApplyableNightMode() {
            Location location;
            boolean z;
            long j;
            Location location2;
            int i = this.$r8$classId;
            Object obj = this.mTwilightManager;
            switch (i) {
                case 0:
                    Recorder.AnonymousClass3 anonymousClass3 = (Recorder.AnonymousClass3) obj;
                    TwilightManager$TwilightState twilightManager$TwilightState = (TwilightManager$TwilightState) anonymousClass3.this$0;
                    LocationManager locationManager = (LocationManager) anonymousClass3.val$recordingToStart;
                    if (twilightManager$TwilightState.nextUpdate > System.currentTimeMillis()) {
                        z = twilightManager$TwilightState.isNight;
                    } else {
                        Context context = (Context) anonymousClass3.val$completer;
                        Location location3 = null;
                        if (PermissionChecker.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                            try {
                            } catch (Exception e) {
                                Log.d("TwilightManager", "Failed to get last known location", e);
                            }
                            if (locationManager.isProviderEnabled("network")) {
                                location2 = locationManager.getLastKnownLocation("network");
                                location = location2;
                            }
                            location2 = null;
                            location = location2;
                        } else {
                            location = null;
                        }
                        if (PermissionChecker.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                            try {
                                if (locationManager.isProviderEnabled("gps")) {
                                    location3 = locationManager.getLastKnownLocation("gps");
                                }
                            } catch (Exception e2) {
                                Log.d("TwilightManager", "Failed to get last known location", e2);
                            }
                        }
                        if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                            location = location3;
                        }
                        if (location != null) {
                            long currentTimeMillis = System.currentTimeMillis();
                            if (TwilightCalculator.sInstance == null) {
                                TwilightCalculator.sInstance = new TwilightCalculator();
                            }
                            TwilightCalculator twilightCalculator = TwilightCalculator.sInstance;
                            twilightCalculator.calculateTwilight(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                            twilightCalculator.calculateTwilight(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                            z = twilightCalculator.state == 1;
                            long j2 = twilightCalculator.sunrise;
                            long j3 = twilightCalculator.sunset;
                            twilightCalculator.calculateTwilight(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                            long j4 = twilightCalculator.sunrise;
                            if (j2 == -1 || j3 == -1) {
                                j = currentTimeMillis + 43200000;
                            } else {
                                if (currentTimeMillis > j3) {
                                    j2 = j4;
                                } else if (currentTimeMillis > j2) {
                                    j2 = j3;
                                }
                                j = j2 + 60000;
                            }
                            twilightManager$TwilightState.isNight = z;
                            twilightManager$TwilightState.nextUpdate = j;
                        } else {
                            Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                            int i2 = Calendar.getInstance().get(11);
                            if (i2 < 6 || i2 >= 22) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        break;
                    }
                    break;
                default:
                    if (Api21Impl.isPowerSaveMode((PowerManager) obj)) {
                        break;
                    }
                    break;
            }
            return 2;
        }

        @Override // com.google.mlkit.vision.text.Text.TextBase
        public final void onChange() {
            int i = this.$r8$classId;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            switch (i) {
                case 0:
                    appCompatDelegateImpl.applyApplicationSpecificConfig(true, true);
                    break;
                default:
                    appCompatDelegateImpl.applyApplicationSpecificConfig(true, true);
                    break;
            }
        }

        public AutoTimeNightModeManager(Recorder.AnonymousClass3 anonymousClass3) {
            super(AppCompatDelegateImpl.this);
            this.mTwilightManager = anonymousClass3;
        }
    }

    public final class AppCompatWindowCallback extends WindowCallbackWrapper {
        public Recorder.AnonymousClass6 mActionBarCallback;
        public boolean mDispatchKeyEventBypassEnabled;
        public boolean mOnContentChangedBypassEnabled;
        public boolean mOnPanelClosedBypassEnabled;

        public AppCompatWindowCallback(Window.Callback callback) {
            super(callback);
        }

        public final void bypassOnContentChanged(Window.Callback callback) {
            try {
                this.mOnContentChangedBypassEnabled = true;
                callback.onContentChanged();
            } finally {
                this.mOnContentChangedBypassEnabled = false;
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.mDispatchKeyEventBypassEnabled ? getWrapped().dispatchKeyEvent(keyEvent) : AppCompatDelegateImpl.this.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (!super.dispatchKeyShortcutEvent(keyEvent)) {
                int keyCode = keyEvent.getKeyCode();
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                appCompatDelegateImpl.initWindowDecorActionBar();
                ActionBar actionBar = appCompatDelegateImpl.mActionBar;
                if (actionBar == null || !actionBar.onKeyShortcut(keyCode, keyEvent)) {
                    PanelFeatureState panelFeatureState = appCompatDelegateImpl.mPreparedPanel;
                    if (panelFeatureState == null || !appCompatDelegateImpl.performPanelShortcut(panelFeatureState, keyEvent.getKeyCode(), keyEvent)) {
                        if (appCompatDelegateImpl.mPreparedPanel == null) {
                            PanelFeatureState panelState = appCompatDelegateImpl.getPanelState(0);
                            appCompatDelegateImpl.preparePanel(panelState, keyEvent);
                            boolean performPanelShortcut = appCompatDelegateImpl.performPanelShortcut(panelState, keyEvent.getKeyCode(), keyEvent);
                            panelState.isPrepared = false;
                            if (performPanelShortcut) {
                            }
                        }
                        return false;
                    }
                    PanelFeatureState panelFeatureState2 = appCompatDelegateImpl.mPreparedPanel;
                    if (panelFeatureState2 != null) {
                        panelFeatureState2.isHandled = true;
                        return true;
                    }
                }
            }
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final void onContentChanged() {
            if (this.mOnContentChangedBypassEnabled) {
                getWrapped().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof MenuBuilder)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final View onCreatePanelView(int i) {
            View onCreatePanelView;
            Recorder.AnonymousClass6 anonymousClass6 = this.mActionBarCallback;
            return (anonymousClass6 == null || (onCreatePanelView = anonymousClass6.onCreatePanelView(i)) == null) ? super.onCreatePanelView(i) : onCreatePanelView;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            if (i == 108) {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                appCompatDelegateImpl.initWindowDecorActionBar();
                ActionBar actionBar = appCompatDelegateImpl.mActionBar;
                if (actionBar != null) {
                    actionBar.dispatchMenuVisibilityChanged(true);
                }
            }
            return true;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final void onPanelClosed(int i, Menu menu) {
            if (this.mOnPanelClosedBypassEnabled) {
                getWrapped().onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (i == 108) {
                appCompatDelegateImpl.initWindowDecorActionBar();
                ActionBar actionBar = appCompatDelegateImpl.mActionBar;
                if (actionBar != null) {
                    actionBar.dispatchMenuVisibilityChanged(false);
                    return;
                }
                return;
            }
            if (i == 0) {
                PanelFeatureState panelState = appCompatDelegateImpl.getPanelState(i);
                if (panelState.isOpen) {
                    appCompatDelegateImpl.closePanel(panelState, false);
                }
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final boolean onPreparePanel(int i, View view, Menu menu) {
            MenuBuilder menuBuilder = menu instanceof MenuBuilder ? (MenuBuilder) menu : null;
            if (i == 0 && menuBuilder == null) {
                return false;
            }
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(true);
            }
            Recorder.AnonymousClass6 anonymousClass6 = this.mActionBarCallback;
            if (anonymousClass6 != null) {
                anonymousClass6.onPreparePanel(i);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (menuBuilder != null) {
                menuBuilder.setOverrideVisibleItems(false);
            }
            return onPreparePanel;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
            MenuBuilder menuBuilder = AppCompatDelegateImpl.this.getPanelState(0).menu;
            if (menuBuilder != null) {
                super.onProvideKeyboardShortcuts(list, menuBuilder, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            SupportActionModeWrapper.CallbackWrapper callbackWrapper = new SupportActionModeWrapper.CallbackWrapper(appCompatDelegateImpl.mContext, callback);
            androidx.appcompat.view.ActionMode startSupportActionMode = appCompatDelegateImpl.startSupportActionMode(callbackWrapper);
            if (startSupportActionMode != null) {
                return callbackWrapper.getActionModeWrapper(startSupportActionMode);
            }
            return null;
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public final android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void setContentView(View view) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
