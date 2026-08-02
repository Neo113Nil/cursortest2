package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import androidx.core.os.LocaleListCompat;
import androidx.room.TransactionExecutor;
import com.google.android.gms.tasks.zzt;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class AppCompatDelegate {
    public static final TransactionExecutor sSerialExecutorForLocalesStorage = new TransactionExecutor(new zzt(1));
    public static final int sDefaultNightMode = -100;
    public static LocaleListCompat sRequestedAppLocales = null;
    public static LocaleListCompat sStoredAppLocales = null;
    public static Boolean sIsAutoStoreLocalesOptedIn = null;
    public static boolean sIsFrameworkSyncChecked = false;
    public static final ArraySet sActivityDelegates = new ArraySet(0);
    public static final Object sActivityDelegatesLock = new Object();
    public static final Object sAppLocalesStorageSyncLock = new Object();

    public abstract class Api24Impl {
        public static LocaleList localeListForLanguageTags(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    public abstract class Api33Impl {
        public static LocaleList localeManagerGetApplicationLocales(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void localeManagerSetApplicationLocales(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    public static AppCompatDelegate create(Dialog dialog, AppCompatCallback appCompatCallback) {
        return new AppCompatDelegateImpl(dialog.getContext(), dialog.getWindow(), appCompatCallback, dialog);
    }

    public static LocaleListCompat getApplicationLocales() {
        Object obj;
        Context contextForDelegate;
        if (Build.VERSION.SDK_INT >= 33) {
            ArraySet arraySet = sActivityDelegates;
            arraySet.getClass();
            ArrayMap.KeyIterator keyIterator = new ArrayMap.KeyIterator(arraySet);
            while (true) {
                if (!keyIterator.hasNext()) {
                    obj = null;
                    break;
                }
                AppCompatDelegate appCompatDelegate = (AppCompatDelegate) ((WeakReference) keyIterator.next()).get();
                if (appCompatDelegate != null && (contextForDelegate = appCompatDelegate.getContextForDelegate()) != null) {
                    obj = contextForDelegate.getSystemService("locale");
                    break;
                }
            }
            if (obj != null) {
                return LocaleListCompat.wrap(Api33Impl.localeManagerGetApplicationLocales(obj));
            }
        } else {
            LocaleListCompat localeListCompat = sRequestedAppLocales;
            if (localeListCompat != null) {
                return localeListCompat;
            }
        }
        return LocaleListCompat.getEmptyLocaleList();
    }

    public static int getDefaultNightMode() {
        return sDefaultNightMode;
    }

    public static boolean isAutoStorageOptedIn(Context context) {
        if (sIsAutoStoreLocalesOptedIn == null) {
            try {
                int i = AppLocalesMetadataHolderService.$r8$clinit;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), AppLocalesMetadataHolderService.Api24Impl.getDisabledComponentFlag() | 128).metaData;
                if (bundle != null) {
                    sIsAutoStoreLocalesOptedIn = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                sIsAutoStoreLocalesOptedIn = Boolean.FALSE;
            }
        }
        return sIsAutoStoreLocalesOptedIn.booleanValue();
    }

    public static void removeDelegateFromActives(AppCompatDelegateImpl appCompatDelegateImpl) {
        synchronized (sActivityDelegatesLock) {
            try {
                ArraySet arraySet = sActivityDelegates;
                arraySet.getClass();
                ArrayMap.KeyIterator keyIterator = new ArrayMap.KeyIterator(arraySet);
                while (keyIterator.hasNext()) {
                    AppCompatDelegate appCompatDelegate = (AppCompatDelegate) ((WeakReference) keyIterator.next()).get();
                    if (appCompatDelegate == appCompatDelegateImpl || appCompatDelegate == null) {
                        keyIterator.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void addContentView(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    public void attachBaseContext(Context context) {
    }

    public Context attachBaseContext2(Context context) {
        attachBaseContext(context);
        return context;
    }

    public abstract <T extends View> T findViewById(int i);

    public Context getContextForDelegate() {
        return null;
    }

    public abstract ActionBarDrawerToggle$Delegate getDrawerToggleDelegate();

    public int getLocalNightMode() {
        return -100;
    }

    public abstract MenuInflater getMenuInflater();

    public abstract ActionBar getSupportActionBar();

    public abstract void installViewFactory();

    public abstract void invalidateOptionsMenu();

    public abstract void onConfigurationChanged(Configuration configuration);

    public abstract void onCreate(Bundle bundle);

    public abstract void onDestroy();

    public abstract void onPostCreate(Bundle bundle);

    public abstract void onPostResume();

    public abstract void onSaveInstanceState(Bundle bundle);

    public abstract void onStart();

    public abstract void onStop();

    public abstract boolean requestWindowFeature(int i);

    public abstract void setContentView(int i);

    public abstract void setContentView(View view);

    public abstract void setContentView(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void setLocalNightMode(int i);

    public void setOnBackInvokedDispatcher(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void setSupportActionBar(Toolbar toolbar);

    public void setTheme(int i) {
    }

    public abstract void setTitle(CharSequence charSequence);

    public abstract ActionMode startSupportActionMode(ActionMode.Callback callback);

    public static AppCompatDelegate create(Activity activity, AppCompatCallback appCompatCallback) {
        return new AppCompatDelegateImpl(activity, null, appCompatCallback, activity);
    }
}
