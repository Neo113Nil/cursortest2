package com.datadog.android.rum.model;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.knotapi.knot.utilities.BreadcrumbHelper;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class ErrorEvent$Status$EnumUnboxingLocalUtility {
    public static int[] _values() {
        return CameraSelector$$ExternalSyntheticOutline0.values(8);
    }

    public static /* synthetic */ String getJsonValue(int i) {
        switch (i) {
            case 1:
                return "android";
            case 2:
                return "browser";
            case 3:
                return "ios";
            case 4:
                return "react-native";
            case 5:
                return "flutter";
            case 6:
                return "roku";
            case 7:
                return "ndk";
            case 8:
                return "ios+il2cpp";
            case 9:
                return "ndk+il2cpp";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String getJsonValue$1(int i) {
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

    public static /* synthetic */ String getJsonValue$10(int i) {
        if (i == 1) {
            return "starting";
        }
        if (i == 2) {
            return "running";
        }
        if (i == 3) {
            return "stopped";
        }
        if (i == 4) {
            return BreadcrumbHelper.Category.ERROR;
        }
        throw null;
    }

    public static /* synthetic */ String getJsonValue$11(int i) {
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

    public static /* synthetic */ String getJsonValue$12(int i) {
        if (i == 1) {
            return "cache";
        }
        if (i == 2) {
            return "navigational-prefetch";
        }
        if (i == 3) {
            return "other";
        }
        throw null;
    }

    public static /* synthetic */ String getJsonValue$13(int i) {
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

    public static /* synthetic */ String getJsonValue$14(int i) {
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
        if (i == 1) {
            return "query";
        }
        if (i == 2) {
            return "mutation";
        }
        if (i == 3) {
            return "subscription";
        }
        throw null;
    }

    public static /* synthetic */ String getJsonValue$17(int i) {
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

    public static /* synthetic */ String getJsonValue$18(int i) {
        if (i == 1) {
            return "blocking";
        }
        if (i == 2) {
            return "non-blocking";
        }
        throw null;
    }

    public static /* synthetic */ String getJsonValue$19(int i) {
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

    public static /* synthetic */ String getJsonValue$2(int i) {
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

    public static /* synthetic */ String getJsonValue$20(int i) {
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

    public static /* synthetic */ String getJsonValue$21(int i) {
        switch (i) {
            case 1:
                return "document";
            case 2:
                return "xhr";
            case 3:
                return "beacon";
            case 4:
                return "fetch";
            case 5:
                return "css";
            case 6:
                return "js";
            case 7:
                return "image";
            case 8:
                return "font";
            case 9:
                return "media";
            case 10:
                return "other";
            case 11:
                return "native";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String getJsonValue$22(int i) {
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

    public static /* synthetic */ String getJsonValue$23(int i) {
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

    public static /* synthetic */ String getJsonValue$24(int i) {
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

    public static /* synthetic */ String getJsonValue$25(int i) {
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

    public static /* synthetic */ String getJsonValue$26(int i) {
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

    public static /* synthetic */ String getJsonValue$27(int i) {
        if (i == 1) {
            return "not-supported-by-browser";
        }
        if (i == 2) {
            return "failed-to-lazy-load";
        }
        if (i == 3) {
            return "missing-document-policy-header";
        }
        if (i == 4) {
            return "unexpected-exception";
        }
        throw null;
    }

    public static /* synthetic */ String getJsonValue$28(int i) {
        switch (i) {
            case 1:
                return "initial_load";
            case 2:
                return "route_change";
            case 3:
                return "activity_display";
            case 4:
                return "activity_redisplay";
            case 5:
                return "fragment_display";
            case 6:
                return "fragment_redisplay";
            case 7:
                return "view_controller_display";
            case 8:
                return "view_controller_redisplay";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String getJsonValue$29(int i) {
        if (i == 1) {
            return "starting";
        }
        if (i == 2) {
            return "running";
        }
        if (i == 3) {
            return "stopped";
        }
        if (i == 4) {
            return BreadcrumbHelper.Category.ERROR;
        }
        throw null;
    }

    public static /* synthetic */ String getJsonValue$3(int i) {
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

    public static /* synthetic */ String getJsonValue$4(int i) {
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

    public static /* synthetic */ String getJsonValue$5(int i) {
        if (i == 1) {
            return "long-task";
        }
        if (i == 2) {
            return "long-animation-frame";
        }
        throw null;
    }

    public static /* synthetic */ String getJsonValue$6(int i) {
        if (i == 1) {
            return "not-supported-by-browser";
        }
        if (i == 2) {
            return "failed-to-lazy-load";
        }
        if (i == 3) {
            return "missing-document-policy-header";
        }
        if (i == 4) {
            return "unexpected-exception";
        }
        throw null;
    }

    public static /* synthetic */ String getJsonValue$7(int i) {
        switch (i) {
            case 1:
                return "user-callback";
            case 2:
                return "event-listener";
            case 3:
                return "resolve-promise";
            case 4:
                return "reject-promise";
            case 5:
                return "classic-script";
            case 6:
                return "module-script";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String getJsonValue$8(int i) {
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

    public static /* synthetic */ String getJsonValue$9(int i) {
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

    public static /* synthetic */ String stringValueOf$20(int i) {
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

    public static /* synthetic */ String stringValueOf$9(int i) {
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
}
