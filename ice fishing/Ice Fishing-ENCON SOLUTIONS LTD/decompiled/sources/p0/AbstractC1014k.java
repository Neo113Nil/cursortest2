package p0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.watchfacestudio.spraktum.R;
import io.appmetrica.analytics.impl.C0376e9;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import u.AbstractC1047a;
import u0.C1051b;

/* renamed from: p0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1014k {

    /* renamed from: a, reason: collision with root package name */
    public static final l.k f8385a = new l.k();

    /* renamed from: b, reason: collision with root package name */
    public static Locale f8386b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = C1051b.a(context).f642a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i2) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i2 == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, a2);
        }
        if (i2 == 2) {
            return R1.l.s(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, a2);
        }
        if (i2 == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, a2);
        }
        if (i2 == 5) {
            return d(context, "common_google_play_services_invalid_account_text", a2);
        }
        if (i2 == 7) {
            return d(context, "common_google_play_services_network_error_text", a2);
        }
        if (i2 == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, a2);
        }
        if (i2 == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", a2);
        }
        switch (i2) {
            case 16:
                return d(context, "common_google_play_services_api_unavailable_text", a2);
            case 17:
                return d(context, "common_google_play_services_sign_in_failed_text", a2);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, a2);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, a2);
        }
    }

    public static String c(Context context, int i2) {
        Resources resources = context.getResources();
        switch (i2) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case C0376e9.f5882C /* 19 */:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i2);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case C0376e9.f5883D /* 20 */:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e2 = e(context, str);
        if (e2 == null) {
            e2 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e2, str2);
    }

    public static String e(Context context, String str) {
        Resources resources;
        l.k kVar = f8385a;
        synchronized (kVar) {
            try {
                Locale locale = AbstractC1047a.a(context.getResources().getConfiguration()).get(0);
                if (!locale.equals(f8386b)) {
                    kVar.clear();
                    f8386b = locale;
                }
                String str2 = (String) kVar.getOrDefault(str, null);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = m0.i.f8176a;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources == null) {
                    return null;
                }
                int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    return null;
                }
                String string = resources.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    return null;
                }
                f8385a.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
