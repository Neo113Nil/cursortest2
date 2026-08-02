package com.datadog.android.rum;

import com.google.gson.JsonObject;
import com.knotapi.knot.utilities.BreadcrumbHelper;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class RumErrorSource$EnumUnboxingLocalUtility {
    public static /* synthetic */ String getAsString(int i) {
        switch (i) {
            case 1:
                return "user_app_launch";
            case 2:
                return "inactivity_timeout";
            case 3:
                return "max_duration";
            case 4:
                return "background_launch";
            case 5:
                return "prewarm";
            case 6:
                return "from_non_interactive_session";
            case 7:
                return "explicit_stop";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String getAsString$1(int i) {
        if (i == 1) {
            return "NOT_TRACKED";
        }
        if (i == 2) {
            return "TRACKED";
        }
        if (i == 3) {
            return "EXPIRED";
        }
        throw null;
    }

    public static /* synthetic */ String getAsString$2(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i == 2) {
            return "FOREGROUND";
        }
        if (i == 3) {
            return "BACKGROUND";
        }
        if (i == 4) {
            return "APPLICATION_LAUNCH";
        }
        throw null;
    }

    public static /* synthetic */ String getHeaderValue(int i) {
        if (i == 1) {
            return "_dd-custom-header-graph-ql-operation-name";
        }
        if (i == 2) {
            return "_dd-custom-header-graph-ql-variables";
        }
        if (i == 3) {
            return "_dd-custom-header-graph-ql-operation-type";
        }
        if (i == 4) {
            return "_dd-custom-header-graph-ql-payload";
        }
        throw null;
    }

    public static /* synthetic */ String getJsonValue(int i) {
        if (i == 1) {
            return "user";
        }
        if (i == 2) {
            return "synthetics";
        }
        if (i == 3) {
            return "ci_test";
        }
        throw null;
    }

    public static /* synthetic */ String getJsonValue$1(int i) {
        switch (i) {
            case 1:
                return "android";
            case 2:
                return "ios";
            case 3:
                return "browser";
            case 4:
                return "flutter";
            case 5:
                return "react-native";
            case 6:
                return "roku";
            case 7:
                return "unity";
            case 8:
                return "kotlin-multiplatform";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String getJsonValue$10(int i) {
        if (i == 1) {
            return "slow-2g";
        }
        if (i == 2) {
            return "2g";
        }
        if (i == 3) {
            return "3g";
        }
        if (i == 4) {
            return "4g";
        }
        throw null;
    }

    public static /* synthetic */ String getJsonValue$11(int i) {
        if (i == 1) {
            return "user";
        }
        if (i == 2) {
            return "synthetics";
        }
        if (i == 3) {
            return "ci_test";
        }
        throw null;
    }

    public static /* synthetic */ String getJsonValue$12(int i) {
        switch (i) {
            case 1:
                return "android";
            case 2:
                return "ios";
            case 3:
                return "browser";
            case 4:
                return "flutter";
            case 5:
                return "react-native";
            case 6:
                return "roku";
            case 7:
                return "unity";
            case 8:
                return "kotlin-multiplatform";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String getJsonValue$13(int i) {
        switch (i) {
            case 1:
                return "network";
            case 2:
                return "source";
            case 3:
                return "console";
            case 4:
                return "logger";
            case 5:
                return "agent";
            case 6:
                return BreadcrumbHelper.Category.WEBVIEW;
            case 7:
                return "custom";
            case 8:
                return "report";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String getJsonValue$14(int i) {
        if (i == 1) {
            return "handled";
        }
        if (i == 2) {
            return "unhandled";
        }
        throw null;
    }

    public static /* synthetic */ String getJsonValue$15(int i) {
        switch (i) {
            case 1:
                return "POST";
            case 2:
                return "GET";
            case 3:
                return "HEAD";
            case 4:
                return "PUT";
            case 5:
                return "DELETE";
            case 6:
                return "PATCH";
            case 7:
                return "TRACE";
            case 8:
                return "OPTIONS";
            case 9:
                return "CONNECT";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String getJsonValue$16(int i) {
        switch (i) {
            case 1:
                return "ad";
            case 2:
                return "advertising";
            case 3:
                return BreadcrumbHelper.Category.ANALYTICS;
            case 4:
                return "cdn";
            case 5:
                return "content";
            case 6:
                return "customer-success";
            case 7:
                return "first party";
            case 8:
                return "hosting";
            case 9:
                return "marketing";
            case 10:
                return "other";
            case 11:
                return "social";
            case 12:
                return "tag-manager";
            case 13:
                return "utility";
            case 14:
                return "video";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String getJsonValue$17(int i) {
        switch (i) {
            case 1:
                return "user_app_launch";
            case 2:
                return "inactivity_timeout";
            case 3:
                return "max_duration";
            case 4:
                return "background_launch";
            case 5:
                return "prewarm";
            case 6:
                return "from_non_interactive_session";
            case 7:
                return "explicit_stop";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String getJsonValue$2(int i) {
        switch (i) {
            case 1:
                return "mobile";
            case 2:
                return "desktop";
            case 3:
                return "tablet";
            case 4:
                return "tv";
            case 5:
                return "gaming_console";
            case 6:
                return "bot";
            case 7:
                return "other";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String getJsonValue$3(int i) {
        if (i == 1) {
            return "slow-2g";
        }
        if (i == 2) {
            return "2g";
        }
        if (i == 3) {
            return "3g";
        }
        if (i == 4) {
            return "4g";
        }
        throw null;
    }

    public static /* synthetic */ String getJsonValue$4(int i) {
        switch (i) {
            case 1:
                return "custom_attribute";
            case 2:
                return "mask_placeholder";
            case 3:
                return "standard_attribute";
            case 4:
                return "text_content";
            case 5:
                return "mask_disallowed";
            case 6:
                return "blank";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String getJsonValue$5(int i) {
        switch (i) {
            case 1:
                return "user_app_launch";
            case 2:
                return "inactivity_timeout";
            case 3:
                return "max_duration";
            case 4:
                return "background_launch";
            case 5:
                return "prewarm";
            case 6:
                return "from_non_interactive_session";
            case 7:
                return "explicit_stop";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String getJsonValue$6(int i) {
        if (i == 1) {
            return "connected";
        }
        if (i == 2) {
            return "not_connected";
        }
        if (i == 3) {
            return "maybe";
        }
        throw null;
    }

    public static /* synthetic */ String getJsonValue$7(int i) {
        switch (i) {
            case 1:
                return "ANR";
            case 2:
                return "App Hang";
            case 3:
                return "Exception";
            case 4:
                return "Watchdog Termination";
            case 5:
                return "Memory Warning";
            case 6:
                return "Network";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String getJsonValue$8(int i) {
        switch (i) {
            case 1:
                return "mobile";
            case 2:
                return "desktop";
            case 3:
                return "tablet";
            case 4:
                return "tv";
            case 5:
                return "gaming_console";
            case 6:
                return "bot";
            case 7:
                return "other";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String getJsonValue$9(int i) {
        if (i == 1) {
            return "enforce";
        }
        if (i == 2) {
            return "report";
        }
        throw null;
    }

    public static /* synthetic */ long getPeriodInMs(int i) {
        if (i == 1) {
            return 100L;
        }
        if (i == 2) {
            return 500L;
        }
        if (i == 3) {
            return 1000L;
        }
        if (i == 4) {
            return 0L;
        }
        throw null;
    }

    public static StringBuilder m(Long l, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(l);
        sb.append(str4);
        return sb;
    }

    public static /* synthetic */ String stringValueOf(int i) {
        switch (i) {
            case 1:
                return "NETWORK";
            case 2:
                return "SOURCE";
            case 3:
                return "CONSOLE";
            case 4:
                return "LOGGER";
            case 5:
                return "AGENT";
            case 6:
                return "WEBVIEW";
            case 7:
                return "CUSTOM";
            case 8:
                return "REPORT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String stringValueOf$10(int i) {
        switch (i) {
            case 1:
                return "ANDROID";
            case 2:
                return "IOS";
            case 3:
                return "BROWSER";
            case 4:
                return "FLUTTER";
            case 5:
                return "REACT_NATIVE";
            case 6:
                return "ROKU";
            case 7:
                return "UNITY";
            case 8:
                return "KOTLIN_MULTIPLATFORM";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String stringValueOf$21(int i) {
        switch (i) {
            case 1:
                return "ANDROID";
            case 2:
                return "IOS";
            case 3:
                return "BROWSER";
            case 4:
                return "FLUTTER";
            case 5:
                return "REACT_NATIVE";
            case 6:
                return "ROKU";
            case 7:
                return "UNITY";
            case 8:
                return "KOTLIN_MULTIPLATFORM";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String stringValueOf$22(int i) {
        switch (i) {
            case 1:
                return "NETWORK";
            case 2:
                return "SOURCE";
            case 3:
                return "CONSOLE";
            case 4:
                return "LOGGER";
            case 5:
                return "AGENT";
            case 6:
                return "WEBVIEW";
            case 7:
                return "CUSTOM";
            case 8:
                return "REPORT";
            default:
                return "null";
        }
    }

    public static void m(Long l, JsonObject jsonObject, String str) {
        jsonObject.addProperty(str, Long.valueOf(l.longValue()));
    }
}
