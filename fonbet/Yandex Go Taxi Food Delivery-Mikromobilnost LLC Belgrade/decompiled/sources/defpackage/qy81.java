package defpackage;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* loaded from: classes11.dex */
public abstract class qy81 {
    public static final ycs0 a = new ycs0();
    public static Locale b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = nb51.a(context).a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(int i, Context context) {
        Resources resources = context.getResources();
        return i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(gxh0.common_google_play_services_enable_button) : resources.getString(gxh0.common_google_play_services_update_button) : resources.getString(gxh0.common_google_play_services_install_button);
    }

    public static String c(int i, Context context) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i == 1) {
            return resources.getString(gxh0.common_google_play_services_install_text, a2);
        }
        if (i == 2) {
            return s8o.G(context) ? resources.getString(gxh0.common_google_play_services_wear_update_text) : resources.getString(gxh0.common_google_play_services_update_text, a2);
        }
        if (i == 3) {
            return resources.getString(gxh0.common_google_play_services_enable_text, a2);
        }
        if (i == 5) {
            return g(context, "common_google_play_services_invalid_account_text", a2);
        }
        if (i == 7) {
            return g(context, "common_google_play_services_network_error_text", a2);
        }
        if (i == 9) {
            return resources.getString(gxh0.common_google_play_services_unsupported_text, a2);
        }
        if (i == 20) {
            return g(context, "common_google_play_services_restricted_profile_text", a2);
        }
        switch (i) {
            case 16:
                return g(context, "common_google_play_services_api_unavailable_text", a2);
            case 17:
                return g(context, "common_google_play_services_sign_in_failed_text", a2);
            case 18:
                return resources.getString(gxh0.common_google_play_services_updating_text, a2);
            default:
                return resources.getString(hxh0.common_google_play_services_unknown_issue, a2);
        }
    }

    public static String d(int i, Context context) {
        return (i == 6 || i == 19) ? g(context, "common_google_play_services_resolution_required_text", a(context)) : c(i, context);
    }

    public static String e(int i, Context context) {
        String h = i == 6 ? h(context, "common_google_play_services_resolution_required_title") : f(i, context);
        return h == null ? context.getResources().getString(gxh0.common_google_play_services_notification_ticker) : h;
    }

    public static String f(int i, Context context) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(gxh0.common_google_play_services_install_title);
            case 2:
                return resources.getString(gxh0.common_google_play_services_update_title);
            case 3:
                return resources.getString(gxh0.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
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
            case 19:
            default:
                nnm.q(i, "Unexpected error code ", "GoogleApiAvailability");
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String h = h(context, str);
        if (h == null) {
            h = resources.getString(hxh0.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, h, str2);
    }

    public static String h(Context context, String str) {
        Resources resources;
        ycs0 ycs0Var = a;
        synchronized (ycs0Var) {
            try {
                Locale b2 = y5e.q(context.getResources().getConfiguration()).b(0);
                if (!b2.equals(b)) {
                    ycs0Var.clear();
                    b = b2;
                }
                String str2 = (String) ycs0Var.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i = ewt.e;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources != null) {
                    int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier != 0) {
                        String string = resources.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            a.put(str, string);
                            return string;
                        }
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
