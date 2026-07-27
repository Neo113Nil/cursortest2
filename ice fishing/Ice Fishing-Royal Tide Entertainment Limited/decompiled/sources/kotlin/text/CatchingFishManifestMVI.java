package kotlin.text;

import android.R;
import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import com.catchingfish.fishcatcherpro.presentation.launch.MainActivity;

/* loaded from: classes.dex */
public final class CatchingFishManifestMVI {
    public boolean CatchingFishCoroutine;
    public boolean CatchingFishDaggerWebsocket;
    public final MainActivity CatchingFishParcelableFAB;
    public String CatchingFishReduxKtor;
    public final CatchingFishBundleMoshiMVVM CatchingFishSnackbar;
    public CatchingFishFABCardView CatchingFishViewModelScope;
    public CatchingFishAsyncTaskDagger CatchingFishWorkManager;

    public CatchingFishManifestMVI(MainActivity mainActivity, CatchingFishBundleMoshiMVVM catchingFishBundleMoshiMVVM) {
        this.CatchingFishParcelableFAB = mainActivity;
        this.CatchingFishSnackbar = catchingFishBundleMoshiMVVM;
    }

    public final CatchingFishBundleGlide CatchingFishParcelableFAB() {
        CatchingFishAsyncTaskDagger catchingFishAsyncTaskDagger = this.CatchingFishWorkManager;
        Intent intent = new Intent("android.intent.action.VIEW");
        if (catchingFishAsyncTaskDagger != null) {
            intent.setPackage(((ComponentName) catchingFishAsyncTaskDagger.CatchingFishViewModelScope).getPackageName());
            CatchingFishFragmentGlide catchingFishFragmentGlide = (CatchingFishFragmentGlide) catchingFishAsyncTaskDagger.CatchingFishWorkManager;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", catchingFishFragmentGlide);
            intent.putExtras(bundle);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", -1);
        bundle2.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", -1);
        intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 0);
        intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
        intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
        MainActivity mainActivity = this.CatchingFishParcelableFAB;
        ActivityOptions makeCustomAnimation = ActivityOptions.makeCustomAnimation(mainActivity, R.anim.slide_in_left, R.anim.slide_out_right);
        intent.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ActivityOptions.makeCustomAnimation(mainActivity, R.anim.slide_in_left, R.anim.slide_out_right).toBundle());
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle3 = new Bundle();
            bundle3.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle3);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(new Bundle());
        intent.putExtras(bundle2);
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 2);
        int i = Build.VERSION.SDK_INT;
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
        if (!TextUtils.isEmpty(languageTag)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i >= 34) {
            if (makeCustomAnimation == null) {
                makeCustomAnimation = ActivityOptions.makeBasic();
            }
            CatchingFishDataStore.CatchingFishEspressoTesting(makeCustomAnimation);
        }
        if (i >= 36) {
            if (makeCustomAnimation == null) {
                makeCustomAnimation = ActivityOptions.makeBasic();
            }
            CatchingFishGoogleMaps.CatchingFishDaggerWebsocket(makeCustomAnimation, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        return new CatchingFishBundleGlide(16, intent, makeCustomAnimation != null ? makeCustomAnimation.toBundle() : null);
    }

    public final void CatchingFishSnackbar(String str) {
        Object CatchingFishViewModelFAB;
        MainActivity mainActivity = this.CatchingFishParcelableFAB;
        CatchingFishFirebaseDagger.CatchingFishNavigation(str, "address");
        if (this.CatchingFishCoroutine) {
            return;
        }
        this.CatchingFishCoroutine = true;
        this.CatchingFishReduxKtor = str;
        try {
            CatchingFishBundleGlide CatchingFishParcelableFAB = CatchingFishParcelableFAB();
            try {
                mainActivity.getPackageManager().getPackageInfo("com.android.chrome", 0);
                ((Intent) CatchingFishParcelableFAB.CatchingFishDaggerWebsocket).setPackage("com.android.chrome");
            } catch (PackageManager.NameNotFoundException unused) {
            }
            Uri parse = Uri.parse(str);
            Intent intent = (Intent) CatchingFishParcelableFAB.CatchingFishDaggerWebsocket;
            intent.setData(parse);
            mainActivity.startActivity(intent, (Bundle) CatchingFishParcelableFAB.CatchingFishWorkManager);
            CatchingFishViewModelFAB = CatchingFishRealmContext.CatchingFishParcelableFAB;
        } catch (Throwable th) {
            CatchingFishViewModelFAB = CatchingFishDaggerBiometric.CatchingFishViewModelFAB(th);
        }
        if (CatchingFishMVILayoutBundle.CatchingFishParcelableFAB(CatchingFishViewModelFAB) != null) {
            try {
                this.CatchingFishSnackbar.CatchingFishParcelableFAB.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (Throwable th2) {
                CatchingFishDaggerBiometric.CatchingFishViewModelFAB(th2);
            }
            this.CatchingFishCoroutine = false;
            this.CatchingFishReduxKtor = null;
            this.CatchingFishDaggerWebsocket = false;
        }
    }
}
