package b4;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f960a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f961b;

    /* renamed from: c, reason: collision with root package name */
    public Object f962c;

    /* renamed from: d, reason: collision with root package name */
    public Object f963d;

    public e() {
        this.f961b = new Object();
        this.f962c = new ArrayList();
        this.f963d = new ArrayList();
        this.f960a = true;
    }

    public p.g a() {
        Intent intent = (Intent) this.f961b;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f960a);
        Integer num = (Integer) ((m7.g) this.f962c).f4957h;
        Bundle bundle2 = new Bundle();
        if (num != null) {
            bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        intent.putExtras(bundle2);
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i10 = Build.VERSION.SDK_INT;
        String a6 = p.e.a();
        if (!TextUtils.isEmpty(a6)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", a6);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i10 >= 34) {
            if (((ActivityOptions) this.f963d) == null) {
                this.f963d = p.d.a();
            }
            p.f.a((ActivityOptions) this.f963d, false);
        }
        ActivityOptions activityOptions = (ActivityOptions) this.f963d;
        return new p.g(intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public int[] b() {
        synchronized (this) {
            try {
                if (!this.f960a) {
                    return null;
                }
                long[] jArr = (long[]) this.f961b;
                int length = jArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    int i12 = i11 + 1;
                    int i13 = 1;
                    boolean z10 = jArr[i10] > 0;
                    boolean[] zArr = (boolean[]) this.f962c;
                    if (z10 != zArr[i11]) {
                        int[] iArr = (int[]) this.f963d;
                        if (!z10) {
                            i13 = 2;
                        }
                        iArr[i11] = i13;
                    } else {
                        ((int[]) this.f963d)[i11] = 0;
                    }
                    zArr[i11] = z10;
                    i10++;
                    i11 = i12;
                }
                this.f960a = false;
                return (int[]) ((int[]) this.f963d).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized boolean c() {
        boolean z10;
        boolean z11;
        try {
            synchronized (this) {
                try {
                    if (!this.f960a) {
                        Boolean d10 = d();
                        this.f962c = d10;
                        if (d10 == null) {
                            ((l7.l) ((t7.b) this.f961b)).a(new d6.f(3));
                        }
                        this.f960a = true;
                    }
                } finally {
                }
            }
            return z11;
        } catch (Throwable th) {
            throw th;
        }
        Boolean bool = (Boolean) this.f962c;
        if (bool != null) {
            z11 = bool.booleanValue();
        } else {
            i7.g gVar = ((FirebaseMessaging) this.f963d).f1460a;
            gVar.a();
            b8.a aVar = (b8.a) gVar.f3237g.get();
            synchronized (aVar) {
                z10 = aVar.f1042a;
            }
            z11 = z10;
        }
        return z11;
    }

    public Boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        i7.g gVar = ((FirebaseMessaging) this.f963d).f1460a;
        gVar.a();
        Context context = gVar.f3231a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public e(FirebaseMessaging firebaseMessaging, t7.b bVar) {
        this.f963d = firebaseMessaging;
        this.f961b = bVar;
    }

    public e(int i10) {
        this.f961b = new long[i10];
        this.f962c = new boolean[i10];
        this.f963d = new int[i10];
    }

    public e(p.j jVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f961b = intent;
        this.f962c = new m7.g(7, false);
        this.f960a = true;
        if (jVar != null) {
            intent.setPackage(jVar.f5404c.getPackageName());
            p.b bVar = jVar.f5403b;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", bVar);
            intent.putExtras(bundle);
        }
    }
}
