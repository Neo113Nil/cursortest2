package androidx.wear.utils;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.wear.Sdk;
import com.google.wear.WearApiVersion;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class WearApiVersionHelper {
    private static final String RELEASE_PROP = "ro.cw_build.platform_qpr.version";
    private static final String TAG = "WearApiVersionHelper";
    private static final int UNKNOWN_INCREMENTAL_RELEASE = -1;
    public static final String WEAR_BAKLAVA_0 = "WEAR_BAKLAVA_0";
    public static final String WEAR_TIRAMISU_1 = "WEAR_TIRAMISU_1";
    public static final String WEAR_TIRAMISU_2 = "WEAR_TIRAMISU_2";
    public static final String WEAR_TIRAMISU_3 = "WEAR_TIRAMISU_3";
    public static final String WEAR_TIRAMISU_4 = "WEAR_TIRAMISU_4";
    public static final String WEAR_UDC_1 = "WEAR_UDC_1";
    public static final String WEAR_VIC_1 = "WEAR_VIC_1";
    private static AbstractApiVersion sCurrentApiVersion;
    static AbstractApiVersion sTestApiVersion;

    @Retention(RetentionPolicy.SOURCE)
    public @interface WearApiVersionCode {
    }

    static {
        if (Build.VERSION.SDK_INT < 33) {
            Log.w(TAG, "The Wear SDK is not supported prior to WEAR_TIRAMISU_1 (API level 33.1)");
        }
        sCurrentApiVersion = new AbstractApiVersion() { // from class: androidx.wear.utils.WearApiVersionHelper.1
            @Override // androidx.wear.utils.WearApiVersionHelper.AbstractApiVersion
            int getPlatformApiLevel() {
                return Build.VERSION.SDK_INT;
            }

            @Override // androidx.wear.utils.WearApiVersionHelper.AbstractApiVersion
            int getIncrementalApiLevel() {
                return WearApiVersionHelper.getIncrementalReleaseValue().intValue();
            }
        };
    }

    static abstract class AbstractApiVersion implements Comparable<AbstractApiVersion> {
        abstract int getIncrementalApiLevel();

        abstract int getPlatformApiLevel();

        AbstractApiVersion() {
        }

        @Override // java.lang.Comparable
        public int compareTo(AbstractApiVersion abstractApiVersion) {
            if (getPlatformApiLevel() > abstractApiVersion.getPlatformApiLevel()) {
                return 1;
            }
            if (getPlatformApiLevel() < abstractApiVersion.getPlatformApiLevel()) {
                return -1;
            }
            if (getIncrementalApiLevel() == abstractApiVersion.getIncrementalApiLevel()) {
                return 0;
            }
            return getIncrementalApiLevel() > abstractApiVersion.getIncrementalApiLevel() ? 1 : -1;
        }
    }

    private static class WearApiVersionCompat extends AbstractApiVersion {
        private static final String BAKLAVA = "BAKLAVA";
        private static final String TIRAMISU = "TIRAMISU";
        private static final String UDC = "UDC";
        private static final String VERSION_CODE_PATTERN_STRING = "WEAR_(\\w+)_(\\d+)";
        private static final String VIC = "VIC";
        private int mIncrementalApiLevel;
        private int mPlatformApiLevel;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
        
            if (r1.equals(androidx.wear.utils.WearApiVersionHelper.WearApiVersionCompat.UDC) == false) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private WearApiVersionCompat(String str) {
            this.mPlatformApiLevel = Integer.MAX_VALUE;
            this.mIncrementalApiLevel = Integer.MAX_VALUE;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Non-empty version required.");
            }
            Matcher matcher = Pattern.compile(VERSION_CODE_PATTERN_STRING).matcher(str);
            if (!matcher.matches()) {
                throw new IllegalArgumentException("Invalid/unrecognized version: " + str);
            }
            char c = 1;
            String group = matcher.group(1);
            group.hashCode();
            switch (group.hashCode()) {
                case -1154541982:
                    if (group.equals(TIRAMISU)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 83860:
                    break;
                case 84976:
                    if (group.equals(VIC)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 378189004:
                    if (group.equals(BAKLAVA)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    this.mPlatformApiLevel = 33;
                    break;
                case 1:
                    this.mPlatformApiLevel = 34;
                    break;
                case 2:
                    this.mPlatformApiLevel = 35;
                    break;
                case 3:
                    this.mPlatformApiLevel = 36;
                    break;
            }
            this.mIncrementalApiLevel = Integer.parseInt(matcher.group(2));
        }

        @Override // androidx.wear.utils.WearApiVersionHelper.AbstractApiVersion
        public int getPlatformApiLevel() {
            return this.mPlatformApiLevel;
        }

        @Override // androidx.wear.utils.WearApiVersionHelper.AbstractApiVersion
        public int getIncrementalApiLevel() {
            return this.mIncrementalApiLevel;
        }
    }

    private WearApiVersionHelper() {
    }

    public static boolean isApiVersionAtLeast(String str) {
        AbstractApiVersion abstractApiVersion = sTestApiVersion;
        if (abstractApiVersion != null) {
            return abstractApiVersion.compareTo((AbstractApiVersion) new WearApiVersionCompat(str)) >= 0;
        }
        if (Build.VERSION.SDK_INT < 36) {
            return sCurrentApiVersion.compareTo((AbstractApiVersion) new WearApiVersionCompat(str)) >= 0;
        }
        WearApiVersion lookup = Sdk.VERSION_CODES.lookup(str);
        return lookup != null && Sdk.isApiVersionAtLeast(lookup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Integer getIncrementalReleaseValue() {
        try {
            if (Build.VERSION.SDK_INT < 34) {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                String str = (String) cls.getMethod("get", String.class).invoke(cls, RELEASE_PROP);
                return Integer.valueOf(str == null ? -1 : Integer.parseInt(str));
            }
            return Integer.valueOf(Sdk.VERSION.RELEASE);
        } catch (Exception unused) {
            return -1;
        }
    }
}
