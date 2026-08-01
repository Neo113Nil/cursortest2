package com.google.android.datatransport;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.icewinter.flow.winter.icecatch.R;
import java.util.Locale;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowFrameworkConcurrency {
    public static Locale WinterFlowHookDataSource;
    public static final WinterFlowParserRequest WinterFlowRouterStructure = new WinterFlowParserRequest(0);

    public static String WinterFlowArrayNetwork(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String WinterFlowVariableVersionControl = WinterFlowVariableVersionControl(context, str);
        if (WinterFlowVariableVersionControl == null) {
            WinterFlowVariableVersionControl = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, WinterFlowVariableVersionControl, str2);
    }

    public static String WinterFlowCacheManagerAgent(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = WinterFlowFrontendIDE.WinterFlowRouterStructure(context).WinterFlowRouterStructure;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String WinterFlowHookDataSource(Context context, int i) {
        Resources resources = context.getResources();
        String WinterFlowCacheManagerAgent = WinterFlowCacheManagerAgent(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, WinterFlowCacheManagerAgent);
        }
        if (i == 2) {
            return WinterFlowInvokerComponent.WinterFlowTestingNode(context) ? resources.getString(R.string.common_google_play_services_wear_update_text) : resources.getString(R.string.common_google_play_services_update_text, WinterFlowCacheManagerAgent);
        }
        if (i == 3) {
            return resources.getString(R.string.common_google_play_services_enable_text, WinterFlowCacheManagerAgent);
        }
        if (i == 5) {
            return WinterFlowArrayNetwork(context, "common_google_play_services_invalid_account_text", WinterFlowCacheManagerAgent);
        }
        if (i == 7) {
            return WinterFlowArrayNetwork(context, "common_google_play_services_network_error_text", WinterFlowCacheManagerAgent);
        }
        if (i == 9) {
            return resources.getString(R.string.common_google_play_services_unsupported_text, WinterFlowCacheManagerAgent);
        }
        if (i == 20) {
            return WinterFlowArrayNetwork(context, "common_google_play_services_restricted_profile_text", WinterFlowCacheManagerAgent);
        }
        switch (i) {
            case 16:
                return WinterFlowArrayNetwork(context, "common_google_play_services_api_unavailable_text", WinterFlowCacheManagerAgent);
            case 17:
                return WinterFlowArrayNetwork(context, "common_google_play_services_sign_in_failed_text", WinterFlowCacheManagerAgent);
            case 18:
                return resources.getString(R.string.common_google_play_services_updating_text, WinterFlowCacheManagerAgent);
            default:
                return resources.getString(R.string.common_google_play_services_unknown_issue, WinterFlowCacheManagerAgent);
        }
    }

    public static String WinterFlowRouterStructure(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
            case 18:
                return null;
            case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                return WinterFlowVariableVersionControl(context, "common_google_play_services_invalid_account_title");
            case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                return WinterFlowVariableVersionControl(context, "common_google_play_services_network_error_title");
            case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
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
                return WinterFlowVariableVersionControl(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                return WinterFlowVariableVersionControl(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String WinterFlowVariableVersionControl(Context context, String str) {
        Resources resources;
        WinterFlowParserRequest winterFlowParserRequest = WinterFlowRouterStructure;
        synchronized (winterFlowParserRequest) {
            try {
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                if (!locale.equals(WinterFlowHookDataSource)) {
                    winterFlowParserRequest.clear();
                    WinterFlowHookDataSource = locale;
                }
                String str2 = (String) winterFlowParserRequest.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i = WinterFlowEncryptionHandler.WinterFlowCacheManagerAgent;
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
                            winterFlowParserRequest.put(str, string);
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
}
