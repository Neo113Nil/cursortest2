package com.knotapi.knot.utilities;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import com.knotapi.knot.services.Reporter;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public class BreadcrumbHelper {

    public static class Category {
        public static final String ANALYTICS = "analytics";
        public static final String AUTHENTICATION = "authentication";
        public static final String AUTOMATION = "automation";
        public static final String CONFIGURATION = "configuration";
        public static final String ERROR = "error";
        public static final String EVENT = "event";
        public static final String FRAGMENT = "fragment";
        public static final String INITIALIZATION = "initialization";
        public static final String LIFECYCLE = "lifecycle";
        public static final String NAVIGATION = "navigation";
        public static final String PERFORMANCE = "performance";
        public static final String USER_ACTION = "user_action";
        public static final String WEBVIEW = "webview";
    }

    public static class Identifier {
        public static final String SESSION = "global";

        public static String forMerchant(int i) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "merchant_");
        }
    }

    public static String formatMerchant(String str, int i) {
        return (str == null || str.isEmpty()) ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Merchant (", ")") : Recorder$$ExternalSyntheticOutline1.m("Merchant: ", i, str, " (", ")");
    }

    public static void trackForMerchant(String str, int i, String str2, String str3) {
        String str4;
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    String formatMerchant = formatMerchant(str, i);
                    if (str2.startsWith("Merchant:")) {
                        Reporter.storeBreadcrumb(Identifier.forMerchant(i), str2, str3);
                    }
                    str4 = formatMerchant + " - " + str2;
                    str2 = str4;
                    Reporter.storeBreadcrumb(Identifier.forMerchant(i), str2, str3);
                }
            } catch (Throwable unused) {
                return;
            }
        }
        str4 = "Merchant (" + i + ") - " + str2;
        str2 = str4;
        Reporter.storeBreadcrumb(Identifier.forMerchant(i), str2, str3);
    }

    public static void trackSession(String str, String str2) {
        try {
            Reporter.storeBreadcrumb(Identifier.SESSION, str, str2);
        } catch (Throwable unused) {
        }
    }
}
