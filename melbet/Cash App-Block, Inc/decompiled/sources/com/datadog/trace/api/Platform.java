package com.datadog.trace.api;

import androidx.paging.PagingConfig;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.stripe.android.challenge.confirmation.analytics.IntentConfirmationChallengeAnalyticsEvent;
import com.stripe.android.hcaptcha.analytics.CaptchaAnalyticsEvent;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class Platform {
    public static final PagingConfig JAVA_VERSION;
    public static final JvmRuntime RUNTIME;

    static {
        int i;
        int i2;
        int intValue;
        String property = System.getProperty("java.version");
        int indexOf = property.indexOf(45);
        int i3 = 0;
        if (indexOf >= 0) {
            property = property.substring(0, indexOf);
        }
        try {
            ArrayList splitDigits = splitDigits(property);
            i = ((Integer) splitDigits.get(0)).intValue();
            try {
                if (i == 1) {
                    i = ((Integer) splitDigits.get(1)).intValue();
                    i2 = ((Integer) splitDigits.get(2)).intValue();
                    try {
                        intValue = ((Integer) splitDigits.get(3)).intValue();
                    } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                    }
                } else {
                    int intValue2 = ((Integer) splitDigits.get(1)).intValue();
                    try {
                        intValue = ((Integer) splitDigits.get(2)).intValue();
                        i2 = intValue2;
                    } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                        i2 = intValue2;
                    }
                }
                i3 = intValue;
            } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                i2 = i3;
            }
        } catch (IndexOutOfBoundsException | NumberFormatException unused4) {
            i = 0;
            i2 = 0;
        }
        JAVA_VERSION = new PagingConfig(i, i2, i3);
        RUNTIME = new JvmRuntime();
    }

    public static boolean isJavaVersion(int i) {
        return JAVA_VERSION.pageSize == i;
    }

    public static boolean isJavaVersionAtLeast(int i, int i2) {
        PagingConfig pagingConfig = JAVA_VERSION;
        int i3 = pagingConfig.pageSize;
        int i4 = pagingConfig.prefetchDistance;
        int i5 = pagingConfig.initialLoadSize;
        if (i3 > i) {
            return true;
        }
        if (i3 != i || i4 <= 0) {
            return i3 == i && i4 == 0 && i5 >= i2;
        }
        return true;
    }

    public static ArrayList splitDigits(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt >= '0' && charAt <= '9') {
                i = (charAt - '0') + (i * 10);
            } else {
                if (charAt != '.' && charAt != '_' && charAt != '+') {
                    throw new NumberFormatException();
                }
                arrayList.add(Integer.valueOf(i));
                i = 0;
            }
        }
        arrayList.add(Integer.valueOf(i));
        return arrayList;
    }

    public final class JvmRuntime implements IntentConfirmationChallengeAnalyticsEvent, CaptchaAnalyticsEvent {
        public final /* synthetic */ int $r8$classId;
        public String vendorVersion;

        public JvmRuntime() {
            this.$r8$classId = 0;
            String property = System.getProperty("java.version");
            String property2 = System.getProperty("java.runtime.version");
            System.getProperty("java.runtime.name");
            System.getProperty("java.vm.vendor");
            String property3 = System.getProperty("java.vendor.version");
            property = property == null ? "" : property;
            this.vendorVersion = property3 == null ? "" : property3;
            property2 = (property.isEmpty() || property2 == null) ? property : property2;
            if (property.length() + 1 >= property2.length()) {
                return;
            }
            property2.substring(property.length() + 1);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            switch (this.$r8$classId) {
                case 3:
                    return "elements.intent_confirmation_challenge.start";
                default:
                    return "elements.captcha.passive.init";
            }
        }

        @Override // com.stripe.android.challenge.confirmation.analytics.IntentConfirmationChallengeAnalyticsEvent
        public Map getParams() {
            return Thread$State$EnumUnboxingLocalUtility.m("captcha_vendor_name", this.vendorVersion);
        }

        @Override // com.stripe.android.hcaptcha.analytics.CaptchaAnalyticsEvent
        public String getSiteKey() {
            return this.vendorVersion;
        }

        public JvmRuntime(String str) {
            this.$r8$classId = 4;
            str.getClass();
            this.vendorVersion = str;
        }

        public /* synthetic */ JvmRuntime(String str, int i, byte b) {
            this.$r8$classId = i;
            this.vendorVersion = str;
        }

        public JvmRuntime(String str, int i) {
            this.$r8$classId = 2;
            this.vendorVersion = str;
        }
    }
}
