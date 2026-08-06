package k;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import f1.C0163N;
import x0.e;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0975d {

    /* renamed from: c, reason: collision with root package name */
    public ActivityOptions f8061c;

    /* renamed from: a, reason: collision with root package name */
    public final Intent f8059a = new Intent("android.intent.action.VIEW");

    /* renamed from: b, reason: collision with root package name */
    public final C0163N f8060b = new C0163N();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8062d = true;

    public final e a() {
        Intent intent = this.f8059a;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f8062d);
        this.f8060b.getClass();
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i2 = Build.VERSION.SDK_INT;
        String a2 = AbstractC0973b.a();
        if (!TextUtils.isEmpty(a2)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", a2);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i2 >= 34) {
            if (this.f8061c == null) {
                this.f8061c = AbstractC0972a.a();
            }
            AbstractC0974c.a(this.f8061c, false);
        }
        ActivityOptions activityOptions = this.f8061c;
        return new e(28, intent, activityOptions != null ? activityOptions.toBundle() : null);
    }
}
