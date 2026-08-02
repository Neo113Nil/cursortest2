package defpackage;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.browser.customtabs.k;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class slf {
    public final Intent a;
    public final olf b;
    public ArrayList c;
    public ActivityOptions d;
    public Bundle e;
    public int f;
    public boolean g;

    public slf(k kVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.a = intent;
        this.b = new olf();
        this.f = 0;
        this.g = true;
        if (kVar != null) {
            intent.setPackage(kVar.d.getPackageName());
            IBinder asBinder = kVar.c.asBinder();
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", asBinder);
            intent.putExtras(bundle);
        }
    }

    public final tlf a() {
        Intent intent = this.a;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        ArrayList<? extends Parcelable> arrayList = this.c;
        if (arrayList != null) {
            intent.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.g);
        olf olfVar = this.b;
        Integer num = olfVar.a;
        Integer num2 = olfVar.b;
        Integer num3 = olfVar.c;
        Integer num4 = olfVar.d;
        Bundle bundle2 = new Bundle();
        if (num != null) {
            bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        if (num2 != null) {
            bundle2.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        if (num3 != null) {
            bundle2.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        if (num4 != null) {
            bundle2.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        intent.putExtras(bundle2);
        Bundle bundle3 = this.e;
        if (bundle3 != null) {
            intent.putExtras(bundle3);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f);
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
        if (!TextUtils.isEmpty(languageTag)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            if (this.d == null) {
                this.d = ActivityOptions.makeBasic();
            }
            sg.j(this.d);
        }
        if (i >= 36) {
            if (this.d == null) {
                this.d = ActivityOptions.makeBasic();
            }
            sh.f(this.d, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        ActivityOptions activityOptions = this.d;
        return new tlf(intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public final void b(int i) {
        if (i < 0 || i > 2) {
            ny61.g("Invalid value for the shareState argument");
            return;
        }
        this.f = i;
        Intent intent = this.a;
        if (i == 1) {
            intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
        } else if (i == 2) {
            intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
        } else {
            intent.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
        }
    }

    public slf() {
        this.a = new Intent("android.intent.action.VIEW");
        this.b = new olf();
        this.f = 0;
        this.g = true;
    }
}
