package com.datadog.android.rum.model;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class ViewEvent$State$EnumUnboxingLocalUtility {
    public static /* synthetic */ String getJsonValue(int i) {
        if (i == 1) {
            return "allow";
        }
        if (i == 2) {
            return "mask";
        }
        if (i == 3) {
            return "mask-user-input";
        }
        throw null;
    }

    public static /* synthetic */ String getJsonValue$1(int i) {
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

    public static /* synthetic */ String getJsonValue$15(int i) {
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

    public static /* synthetic */ String getJsonValue$17(int i) {
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

    public static /* synthetic */ String getJsonValue$18(int i) {
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
                return "unity";
            case 7:
                return "kotlin-multiplatform";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String getJsonValue$2(int i) {
        if (i == 1) {
            return "active";
        }
        if (i == 2) {
            return "passive";
        }
        if (i == 3) {
            return "hidden";
        }
        if (i == 4) {
            return "frozen";
        }
        if (i == 5) {
            return "terminated";
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
                return "unity";
            case 7:
                return "kotlin-multiplatform";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String getJsonValue$21(int i) {
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
                return "unity";
            case 7:
                return "kotlin-multiplatform";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String getJsonValue$22(int i) {
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
                return "unity";
            case 7:
                return "kotlin-multiplatform";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String getJsonValue$3(int i) {
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

    public static /* synthetic */ String getJsonValue$4(int i) {
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

    public static void m(Long l, String str, String str2, String str3, StringBuilder sb) {
        sb.append(l);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static /* synthetic */ String stringValueOf$4(int i) {
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

    public static int m(Long l, int i, int i2) {
        return (l.hashCode() + i) * i2;
    }

    public static int m(Boolean bool, int i, int i2) {
        return (bool.hashCode() + i) * i2;
    }
}
