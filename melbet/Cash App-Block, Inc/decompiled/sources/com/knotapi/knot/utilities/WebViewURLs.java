package com.knotapi.knot.utilities;

import com.knotapi.knot.models.Environment;

/* loaded from: classes4.dex */
class WebViewURLs {

    /* renamed from: com.knotapi.knot.utilities.WebViewURLs$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$knotapi$knot$models$Environment;

        static {
            int[] iArr = new int[Environment.values().length];
            $SwitchMap$com$knotapi$knot$models$Environment = iArr;
            try {
                iArr[Environment.sandbox.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$knotapi$knot$models$Environment[Environment.development.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static String getSwitcherURL(Environment environment, String str) {
        return Helper.isValidURL(str) ? str : getURL(environment);
    }

    private static String getURL(Environment environment) {
        int i = AnonymousClass1.$SwitchMap$com$knotapi$knot$models$Environment[environment.ordinal()];
        return (i != 1 ? i != 2 ? "https://" : "https://development-" : "https://sandbox-").concat("knotapi.vercel.app");
    }
}
