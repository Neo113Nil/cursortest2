package kotlin.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.catchingfish.fishcatcherpro.R;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class CatchingFishContextRetrofit {
    public static final CatchingFishGraphQLRealmFAB CatchingFishParcelableFAB = new CatchingFishGraphQLRealmFAB(0);
    public static Locale CatchingFishSnackbar;

    public static String CatchingFishCoroutine(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = CatchingFishHiltSnackbarMVP.CatchingFishParcelableFAB(context).CatchingFishParcelableFAB;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String CatchingFishDaggerWebsocket(Context context, String str) {
        Resources resources;
        CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB = CatchingFishParcelableFAB;
        synchronized (catchingFishGraphQLRealmFAB) {
            try {
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                if (!locale.equals(CatchingFishSnackbar)) {
                    catchingFishGraphQLRealmFAB.clear();
                    CatchingFishSnackbar = locale;
                }
                String str2 = (String) catchingFishGraphQLRealmFAB.get(str);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = CatchingFishFluxParcelable.CatchingFishParcelableFAB;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources != null) {
                    int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        new StringBuilder(str.length() + 18);
                    } else {
                        String string = resources.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            catchingFishGraphQLRealmFAB.put(str, string);
                            return string;
                        }
                        new StringBuilder(str.length() + 20);
                    }
                }
                return null;
            } finally {
            }
        }
    }

    public static String CatchingFishParcelableFAB(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case CatchingFishMoshiSpannable.STRING_SET_FIELD_NUMBER /* 6 */:
            case 18:
                return null;
            case CatchingFishMoshiSpannable.STRING_FIELD_NUMBER /* 5 */:
                return CatchingFishDaggerWebsocket(context, "common_google_play_services_invalid_account_title");
            case CatchingFishMoshiSpannable.DOUBLE_FIELD_NUMBER /* 7 */:
                return CatchingFishDaggerWebsocket(context, "common_google_play_services_network_error_title");
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
            case 16:
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                new StringBuilder(String.valueOf(i).length() + 22);
                return null;
            case 17:
                return CatchingFishDaggerWebsocket(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return CatchingFishDaggerWebsocket(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String CatchingFishReduxKtor(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String CatchingFishDaggerWebsocket = CatchingFishDaggerWebsocket(context, str);
        if (CatchingFishDaggerWebsocket == null) {
            CatchingFishDaggerWebsocket = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, CatchingFishDaggerWebsocket, str2);
    }

    public static String CatchingFishSnackbar(Context context, int i) {
        Resources resources = context.getResources();
        String CatchingFishCoroutine = CatchingFishCoroutine(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, CatchingFishCoroutine);
        }
        if (i == 2) {
            return CatchingFishFirebaseDagger.CatchingFishEspressoMockk(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, CatchingFishCoroutine);
        }
        if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, CatchingFishCoroutine);
        }
        if (i == 5) {
            return CatchingFishReduxKtor(context, "common_google_play_services_invalid_account_text", CatchingFishCoroutine);
        }
        if (i == 7) {
            return CatchingFishReduxKtor(context, "common_google_play_services_network_error_text", CatchingFishCoroutine);
        }
        if (i == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, CatchingFishCoroutine);
        }
        if (i == 20) {
            return CatchingFishReduxKtor(context, "common_google_play_services_restricted_profile_text", CatchingFishCoroutine);
        }
        switch (i) {
            case 16:
                return CatchingFishReduxKtor(context, "common_google_play_services_api_unavailable_text", CatchingFishCoroutine);
            case 17:
                return CatchingFishReduxKtor(context, "common_google_play_services_sign_in_failed_text", CatchingFishCoroutine);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, CatchingFishCoroutine);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, CatchingFishCoroutine);
        }
    }
}
