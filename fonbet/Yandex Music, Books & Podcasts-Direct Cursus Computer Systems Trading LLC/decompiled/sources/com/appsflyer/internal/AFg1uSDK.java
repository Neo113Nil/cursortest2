package com.appsflyer.internal;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.AdRevenueScheme;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFf1aSDK;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.arf;
import defpackage.btf;
import defpackage.f1d;
import defpackage.u75;
import defpackage.uah;
import defpackage.uif;
import defpackage.z7o;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.rtm.internal.Constants;
import j$.util.DesugarTimeZone;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFg1uSDK implements AFg1tSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static byte[] AFInAppEventParameterName = {100, -122, -120, 73, -112, 96, 108, -127, Byte.MIN_VALUE, 77, -108, -108, -100, -106, 99, -104, 122, -123, -107, -107};
    private static int AFKeystoreWrapper = 828425900;
    private static int AFLogger = -463888315;
    private static short[] d = null;
    private static int i = 1;
    private static int registerClient = 586908576;
    private static int w;

    @NotNull
    private final Context AFAdRevenueData;

    @NotNull
    private final arf AFInAppEventType;

    @NotNull
    private final AFc1sSDK areAllFieldsValid;

    @NotNull
    private final AFh1uSDK component1;

    @NotNull
    private final AFi1ySDK component2;

    @NotNull
    private final AFc1kSDK component3;

    @NotNull
    private final AFg1vSDK component4;

    @NotNull
    private final AFc1oSDK copy;

    @NotNull
    private final AFc1hSDK copydefault;

    @NotNull
    private final AFf1iSDK equals;

    @NotNull
    private final String getCurrencyIso4217Code;

    @NotNull
    private final AFj1rSDK getMediationNetwork;

    @NotNull
    private final AFf1aSDK getMonetizationNetwork;

    @NotNull
    private final AFi1sSDK getRevenue;

    @NotNull
    private final AFg1ySDK hashCode;

    @NotNull
    private final arf toString;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/text/SimpleDateFormat;", "getCurrencyIso4217Code", "()Ljava/text/SimpleDateFormat;"}, k = 3, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: com.appsflyer.internal.AFg1uSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends uif implements Function0<SimpleDateFormat> {
        public static final AnonymousClass1 getRevenue = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/AppsFlyerProperties;", "getRevenue", "()Lcom/appsflyer/AppsFlyerProperties;"}, k = 3, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: com.appsflyer.internal.AFg1uSDK$3, reason: invalid class name */
    public static final class AnonymousClass3 extends uif implements Function0<AppsFlyerProperties> {
        public static final AnonymousClass3 getMonetizationNetwork = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final AppsFlyerProperties invoke() {
            return AppsFlyerProperties.getInstance();
        }
    }

    public AFg1uSDK(@NotNull String str, @NotNull Context context, @NotNull AFi1sSDK aFi1sSDK, @NotNull AFf1aSDK aFf1aSDK, @NotNull AFj1rSDK aFj1rSDK, @NotNull AFg1vSDK aFg1vSDK, @NotNull AFh1uSDK aFh1uSDK, @NotNull AFc1sSDK aFc1sSDK, @NotNull AFc1kSDK aFc1kSDK, @NotNull AFi1ySDK aFi1ySDK, @NotNull AFf1iSDK aFf1iSDK, @NotNull AFc1hSDK aFc1hSDK, @NotNull AFg1ySDK aFg1ySDK, @NotNull AFc1oSDK aFc1oSDK) {
        str.getClass();
        context.getClass();
        aFi1sSDK.getClass();
        aFf1aSDK.getClass();
        aFj1rSDK.getClass();
        aFg1vSDK.getClass();
        aFh1uSDK.getClass();
        aFc1sSDK.getClass();
        aFc1kSDK.getClass();
        aFi1ySDK.getClass();
        aFf1iSDK.getClass();
        aFc1hSDK.getClass();
        aFg1ySDK.getClass();
        aFc1oSDK.getClass();
        this.getCurrencyIso4217Code = str;
        this.AFAdRevenueData = context;
        this.getRevenue = aFi1sSDK;
        this.getMonetizationNetwork = aFf1aSDK;
        this.getMediationNetwork = aFj1rSDK;
        this.component4 = aFg1vSDK;
        this.component1 = aFh1uSDK;
        this.areAllFieldsValid = aFc1sSDK;
        this.component3 = aFc1kSDK;
        this.component2 = aFi1ySDK;
        this.equals = aFf1iSDK;
        this.copydefault = aFc1hSDK;
        this.hashCode = aFg1ySDK;
        this.copy = aFc1oSDK;
        this.toString = btf.b(AnonymousClass3.getMonetizationNetwork);
        this.AFInAppEventType = btf.b(AnonymousClass1.getRevenue);
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i2 = i + 13;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            map.getClass();
            aFg1uSDK.equals.getRevenue();
            throw null;
        }
        map.getClass();
        String revenue = aFg1uSDK.equals.getRevenue();
        if (revenue != null) {
            int i3 = i + 25;
            w = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (revenue.length() != 0) {
                map.put("appsflyerKey", revenue);
                return null;
            }
        }
        w = (i + 85) % 128;
        return null;
    }

    private static void AFInAppEventParameterName(@NotNull Map<String, Object> map) {
        getRevenue(new Object[]{map}, 1729638864, -1729638864, (int) System.currentTimeMillis());
    }

    private final boolean AFInAppEventType() {
        if (!getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            i = (w + 19) % 128;
            if (!getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
                int i2 = w + 93;
                i = i2 % 128;
                int i3 = i2 % 2;
                AFa1zSDK.getMonetizationNetwork();
                if (i3 == 0) {
                    AFa1zSDK.getMonetizationNetwork(this.AFAdRevenueData);
                    throw null;
                }
                if (AFa1zSDK.getMonetizationNetwork(this.AFAdRevenueData)) {
                    return false;
                }
            }
        }
        int i4 = w + 117;
        i = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void AFKeystoreWrapper(@NotNull Map<String, Object> map) {
        boolean z;
        String areAllFieldsValid;
        String copydefault;
        String str;
        map.getClass();
        String component1 = this.component3.component1();
        String monetizationNetwork = getMonetizationNetwork(this.areAllFieldsValid, component1);
        boolean z2 = true;
        if (monetizationNetwork != null) {
            int i2 = i + 99;
            w = i2 % 128;
            if (i2 % 2 != 0) {
                monetizationNetwork.equals(component1);
                throw null;
            }
            if (!monetizationNetwork.equals(component1)) {
                z = true;
                if (monetizationNetwork == null) {
                    int i3 = (i + 111) % 128;
                    w = i3;
                    if (component1 != null) {
                        i = (i3 + 73) % 128;
                        if (!z || z2) {
                            map.put("af_latestchannel", component1);
                        }
                        areAllFieldsValid = areAllFieldsValid();
                        if (areAllFieldsValid != null) {
                            int i4 = i + 79;
                            w = i4 % 128;
                            if (i4 % 2 != 0) {
                                Locale locale = Locale.getDefault();
                                locale.getClass();
                                Object lowerCase = areAllFieldsValid.toLowerCase(locale);
                                lowerCase.getClass();
                                map.put("af_installstore", lowerCase);
                                throw null;
                            }
                            Locale locale2 = Locale.getDefault();
                            locale2.getClass();
                            Object lowerCase2 = areAllFieldsValid.toLowerCase(locale2);
                            lowerCase2.getClass();
                            map.put("af_installstore", lowerCase2);
                        }
                        copydefault = copydefault();
                        if (copydefault != null) {
                            int i5 = w + 83;
                            i = i5 % 128;
                            if (i5 % 2 == 0) {
                                Locale locale3 = Locale.getDefault();
                                locale3.getClass();
                                Object lowerCase3 = copydefault.toLowerCase(locale3);
                                lowerCase3.getClass();
                                map.put("af_preinstall_name", lowerCase3);
                                int i6 = 8 / 0;
                            } else {
                                Locale locale4 = Locale.getDefault();
                                locale4.getClass();
                                Object lowerCase4 = copydefault.toLowerCase(locale4);
                                lowerCase4.getClass();
                                map.put("af_preinstall_name", lowerCase4);
                            }
                        }
                        str = (String) getRevenue(new Object[]{this}, -1813533339, 1813533344, System.identityHashCode(this));
                        if (str != null) {
                            Locale locale5 = Locale.getDefault();
                            locale5.getClass();
                            Object lowerCase5 = str.toLowerCase(locale5);
                            lowerCase5.getClass();
                            map.put("af_currentstore", lowerCase5);
                            return;
                        }
                        return;
                    }
                }
                z2 = false;
                if (!z) {
                }
                map.put("af_latestchannel", component1);
                areAllFieldsValid = areAllFieldsValid();
                if (areAllFieldsValid != null) {
                }
                copydefault = copydefault();
                if (copydefault != null) {
                }
                str = (String) getRevenue(new Object[]{this}, -1813533339, 1813533344, System.identityHashCode(this));
                if (str != null) {
                }
            }
        }
        z = false;
        if (monetizationNetwork == null) {
        }
        z2 = false;
        if (!z) {
        }
        map.put("af_latestchannel", component1);
        areAllFieldsValid = areAllFieldsValid();
        if (areAllFieldsValid != null) {
        }
        copydefault = copydefault();
        if (copydefault != null) {
        }
        str = (String) getRevenue(new Object[]{this}, -1813533339, 1813533344, System.identityHashCode(this));
        if (str != null) {
        }
    }

    private final String AFLogger() {
        String AFAdRevenueData = this.areAllFieldsValid.AFAdRevenueData("androidIdCached", (String) null);
        try {
            String string = Settings.Secure.getString(this.AFAdRevenueData.getContentResolver(), "android_id");
            if (string != null) {
                w = (i + 33) % 128;
                return string;
            }
        } catch (Exception e) {
            AFLogger.afErrorLog(e.getMessage(), e);
        }
        if (AFAdRevenueData == null) {
            return null;
        }
        int i2 = w + 43;
        i = i2 % 128;
        if (i2 % 2 != 0) {
            AFLogger.afDebugLog("use cached AndroidId: ".concat(AFAdRevenueData));
            return AFAdRevenueData;
        }
        AFLogger.afDebugLog("use cached AndroidId: ".concat(AFAdRevenueData));
        throw null;
    }

    private static void a(int i2, int i3, int i4, byte b, short s, Object[] objArr) {
        int i5;
        boolean z;
        char c;
        int length;
        byte[] bArr;
        AFk1pSDK aFk1pSDK = new AFk1pSDK();
        StringBuilder sb = new StringBuilder();
        int i6 = i4 + ((int) (registerClient ^ (-1123129136953719915L)));
        boolean z2 = i6 == -1;
        if (z2) {
            byte[] bArr2 = AFInAppEventParameterName;
            if (bArr2 != null) {
                int i7 = $10 + 59;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    length = bArr2.length;
                    bArr = new byte[length];
                } else {
                    length = bArr2.length;
                    bArr = new byte[length];
                }
                for (int i8 = 0; i8 < length; i8++) {
                    bArr[i8] = (byte) (bArr2[i8] ^ (-1123129136953719915L));
                }
                bArr2 = bArr;
            }
            i6 = bArr2 != null ? (byte) (((byte) (AFInAppEventParameterName[((int) (AFLogger ^ (-1123129136953719915L))) + i3] ^ (-1123129136953719915L))) + ((int) (registerClient ^ (-1123129136953719915L)))) : (short) (((short) (d[((int) (AFLogger ^ (-1123129136953719915L))) + i3] ^ (-1123129136953719915L))) + ((int) (registerClient ^ (-1123129136953719915L))));
        }
        if (i6 > 0) {
            int i9 = ((i3 + i6) - 2) + ((int) (AFLogger ^ (-1123129136953719915L)));
            if (z2) {
                $11 = ($10 + 105) % 128;
                i5 = 1;
            } else {
                i5 = 0;
            }
            aFk1pSDK.getCurrencyIso4217Code = i9 + i5;
            char c2 = (char) (i2 + ((int) (AFKeystoreWrapper ^ (-1123129136953719915L))));
            aFk1pSDK.AFAdRevenueData = c2;
            sb.append(c2);
            aFk1pSDK.getMonetizationNetwork = aFk1pSDK.AFAdRevenueData;
            byte[] bArr3 = AFInAppEventParameterName;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                $10 = ($11 + 79) % 128;
                for (int i10 = 0; i10 < length2; i10++) {
                    bArr4[i10] = (byte) (bArr3[i10] ^ (-1123129136953719915L));
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                $11 = ($10 + 35) % 128;
                z = true;
            } else {
                z = false;
            }
            aFk1pSDK.getMediationNetwork = 1;
            while (aFk1pSDK.getMediationNetwork < i6) {
                if (z) {
                    int i11 = $10 + 123;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = aFk1pSDK.getCurrencyIso4217Code;
                    if (i12 == 0) {
                        byte[] bArr5 = AFInAppEventParameterName;
                        aFk1pSDK.getCurrencyIso4217Code = 0;
                        c = (char) (aFk1pSDK.getMonetizationNetwork >>> (((byte) (((byte) (bArr5[i13] - (-1123129136953719915L))) >>> s)) ^ b));
                    } else {
                        byte[] bArr6 = AFInAppEventParameterName;
                        aFk1pSDK.getCurrencyIso4217Code = i13 - 1;
                        c = (char) (aFk1pSDK.getMonetizationNetwork + (((byte) (((byte) (bArr6[i13] ^ (-1123129136953719915L))) + s)) ^ b));
                    }
                    aFk1pSDK.AFAdRevenueData = c;
                } else {
                    short[] sArr = d;
                    aFk1pSDK.getCurrencyIso4217Code = aFk1pSDK.getCurrencyIso4217Code - 1;
                    aFk1pSDK.AFAdRevenueData = (char) (aFk1pSDK.getMonetizationNetwork + (((short) (((short) (sArr[r2] ^ (-1123129136953719915L))) + s)) ^ b));
                }
                sb.append(aFk1pSDK.AFAdRevenueData);
                aFk1pSDK.getMonetizationNetwork = aFk1pSDK.AFAdRevenueData;
                aFk1pSDK.getMediationNetwork++;
            }
        }
        objArr[0] = sb.toString();
    }

    private void afDebugLog(@NotNull Map<String, Object> map) {
        int i2 = i + 59;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            map.getClass();
            this.areAllFieldsValid.getCurrencyIso4217Code("is_stop_tracking_used");
            throw null;
        }
        map.getClass();
        if (this.areAllFieldsValid.getCurrencyIso4217Code("is_stop_tracking_used")) {
            map.put("istu", String.valueOf(this.areAllFieldsValid.AFAdRevenueData("is_stop_tracking_used", false)));
            i = (w + 35) % 128;
        }
        w = (i + 49) % 128;
    }

    private void afErrorLog(@NotNull Map<String, Object> map) {
        map.getClass();
        AFb1cSDK aFb1cSDK = this.copy.areAllFieldsValid;
        if (aFb1cSDK != null) {
            map.put(CommonUrlParts.APP_SET_ID, uah.e(new Pair("scope", Integer.valueOf(aFb1cSDK.getCurrencyIso4217Code)), new Pair(ConnectableDevice.KEY_ID, aFb1cSDK.AFAdRevenueData)));
            int i2 = i + 73;
            w = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        int i3 = w + 27;
        i = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 49 / 0;
        }
    }

    private void afInfoLog(@NotNull Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, 1072860105, -1072860098, System.identityHashCode(this));
    }

    private String areAllFieldsValid() {
        String str = null;
        if (this.areAllFieldsValid.getCurrencyIso4217Code("INSTALL_STORE")) {
            i = (w + 43) % 128;
            return this.areAllFieldsValid.AFAdRevenueData("INSTALL_STORE", (String) null);
        }
        if (equals()) {
            i = (w + 91) % 128;
            str = (String) getRevenue(new Object[]{this}, -1813533339, 1813533344, System.identityHashCode(this));
        }
        this.areAllFieldsValid.getRevenue("INSTALL_STORE", str);
        return str;
    }

    private static /* synthetic */ Object component1(Object[] objArr) {
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = (String) objArr[2];
        i = (w + 89) % 128;
        map.getClass();
        str.getClass();
        try {
            String AFAdRevenueData = aFg1uSDK.areAllFieldsValid.AFAdRevenueData("prev_event_name", (String) null);
            if (AFAdRevenueData != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", aFg1uSDK.areAllFieldsValid.getMediationNetwork("prev_event_timestamp", -1L));
                jSONObject.put("prev_event_name", AFAdRevenueData);
                map.put("prev_event", jSONObject);
            }
            aFg1uSDK.areAllFieldsValid.getRevenue("prev_event_name", str);
            aFg1uSDK.areAllFieldsValid.AFAdRevenueData("prev_event_timestamp", System.currentTimeMillis());
            int i2 = w + 119;
            i = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        } catch (Exception e) {
            AFLogger.afErrorLog("Error while processing previous event.", e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
    
        return java.lang.Long.valueOf(r5.firstInstallTime);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r5 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r5 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object component2(Object[] objArr) {
        PackageInfo s_;
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        i = (w + 59) % 128;
        Context context = aFg1uSDK.copydefault.getMonetizationNetwork;
        if (context == null) {
            return null;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            int i2 = i + 17;
            w = i2 % 128;
            if (i2 % 2 != 0) {
                String packageName = context.getPackageName();
                packageName.getClass();
                s_ = s_(packageManager, packageName);
                int i3 = 81 / 0;
            } else {
                String packageName2 = context.getPackageName();
                packageName2.getClass();
                s_ = s_(packageManager, packageName2);
            }
        }
        int i4 = i + 65;
        w = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object component3(Object[] objArr) {
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i2 = i + 73;
        w = i2 % 128;
        if (i2 % 2 == 0) {
            map.getClass();
            AFf1iSDK aFf1iSDK = aFg1uSDK.equals;
            AFf1iSDK.getRevenue(map, aFg1uSDK.component3);
            return null;
        }
        map.getClass();
        AFf1iSDK aFf1iSDK2 = aFg1uSDK.equals;
        AFf1iSDK.getRevenue(map, aFg1uSDK.component3);
        throw null;
    }

    private void component4(@NotNull Map<String, ? extends Object> map) {
        map.getClass();
        AFh1uSDK aFh1uSDK = this.component1;
        HashMap hashMap = new HashMap(aFh1uSDK.getMonetizationNetwork);
        aFh1uSDK.getMonetizationNetwork.clear();
        this.component1.getRevenue.getMediationNetwork("gcd");
        if (hashMap.isEmpty()) {
            w = (i + 67) % 128;
            return;
        }
        i = (w + 85) % 128;
        Map<String, Object> AFAdRevenueData = AFa1zSDK.AFAdRevenueData(map);
        AFAdRevenueData.getClass();
        AFAdRevenueData.put("gcd", hashMap);
    }

    private final void copy(Map<String, Object> map) {
        i = (w + 87) % 128;
        UiModeManager uiModeManager = (UiModeManager) this.AFAdRevenueData.getSystemService(UiModeManager.class);
        if (uiModeManager != null) {
            w = (i + 37) % 128;
            if (uiModeManager.getCurrentModeType() == 4) {
                w = (i + 7) % 128;
                map.put("tv", Boolean.TRUE);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        if (r4 > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r4 > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004c, code lost:
    
        com.appsflyer.internal.AFg1uSDK.i = (com.appsflyer.internal.AFg1uSDK.w + 59) % 128;
        r6 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:
    
        com.appsflyer.internal.AFg1uSDK.i = (com.appsflyer.internal.AFg1uSDK.w + 29) % 128;
        r6 = (r6 - r4) / 1000;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void copydefault(@NotNull Map<String, Object> map) {
        long mediationNetwork;
        long currentTimeMillis;
        long j;
        int i2 = i + 117;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            map.getClass();
            mediationNetwork = this.areAllFieldsValid.getMediationNetwork("AppsFlyerTimePassedSincePrevLaunch", 1L);
            currentTimeMillis = System.currentTimeMillis();
            this.areAllFieldsValid.AFAdRevenueData("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        } else {
            map.getClass();
            mediationNetwork = this.areAllFieldsValid.getMediationNetwork("AppsFlyerTimePassedSincePrevLaunch", 0L);
            currentTimeMillis = System.currentTimeMillis();
            this.areAllFieldsValid.AFAdRevenueData("AppsFlyerTimePassedSincePrevLaunch", currentTimeMillis);
        }
        map.put("timepassedsincelastlaunch", String.valueOf(j));
    }

    private void d(@NotNull Map<String, Object> map) {
        i = (w + 91) % 128;
        map.getClass();
        map.put("af_preinstalled", String.valueOf(AFc1kSDK.getRevenue(this.AFAdRevenueData)));
        w = (i + 79) % 128;
    }

    private void e(@NotNull Map<String, Object> map) {
        i = (w + 21) % 128;
        map.getClass();
        AFb1lSDK k_ = AFb1iSDK.k_(this.AFAdRevenueData.getContentResolver());
        if (k_ == null) {
            w = (i + 37) % 128;
            return;
        }
        int i2 = i + 77;
        w = i2 % 128;
        if (i2 % 2 == 0) {
            map.put("amazon_aid", k_.getMonetizationNetwork);
            map.put("amazon_aid_limit", String.valueOf(k_.getCurrencyIso4217Code));
        } else {
            map.put("amazon_aid", k_.getMonetizationNetwork);
            map.put("amazon_aid_limit", String.valueOf(k_.getCurrencyIso4217Code));
            int i3 = 47 / 0;
        }
    }

    private void equals(@NotNull Map<String, Object> map) {
        int i2 = w + 91;
        i = i2 % 128;
        if (i2 % 2 != 0) {
            map.getClass();
            map.put("is_pc", Boolean.valueOf(this.AFAdRevenueData.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        } else {
            map.getClass();
            map.put("is_pc", Boolean.valueOf(this.AFAdRevenueData.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
            throw null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:30|31|(2:33|24)|25|26|24) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r3 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String getCurrencyIso4217Code(File file, String str) {
        InputStreamReader inputStreamReader;
        Properties properties;
        int i2 = i + 121;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        try {
            if (file == null) {
                return null;
            }
            try {
                properties = new Properties();
                inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            } catch (FileNotFoundException unused) {
                inputStreamReader = null;
            } catch (Throwable th) {
                th = th;
                inputStreamReader = null;
            }
            try {
                properties.load(inputStreamReader);
                AFLogger.afInfoLog("Found PreInstall property!");
                String property = properties.getProperty(str);
                try {
                    inputStreamReader.close();
                    return property;
                } catch (Throwable th2) {
                    AFLogger.afErrorLog(th2.getMessage(), th2);
                    return property;
                }
            } catch (FileNotFoundException unused2) {
                AFLogger.afDebugLog("PreInstall file wasn't found: " + file.getAbsolutePath());
            } catch (Throwable th3) {
                th = th3;
                AFLogger.afErrorLog(th.getMessage(), th);
                if (inputStreamReader == null) {
                    w = (i + 93) % 128;
                    return null;
                }
                return null;
            }
        } finally {
            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th4) {
                    AFLogger.afErrorLog(th4.getMessage(), th4);
                }
            }
        }
    }

    private final void getMonetizationNetwork(Map<String, Object> map) {
        try {
            PackageInfo packageInfo = this.AFAdRevenueData.getPackageManager().getPackageInfo(this.AFAdRevenueData.getPackageName(), 0);
            int AFAdRevenueData = this.areAllFieldsValid.AFAdRevenueData("versionCode", 0);
            int i2 = packageInfo.versionCode;
            if (i2 > AFAdRevenueData) {
                int i3 = i + 3;
                w = i3 % 128;
                int i4 = i3 % 2;
                AFc1sSDK aFc1sSDK = this.areAllFieldsValid;
                if (i4 != 0) {
                    aFc1sSDK.getMonetizationNetwork("versionCode", i2);
                    throw null;
                }
                aFc1sSDK.getMonetizationNetwork("versionCode", i2);
                i = (w + 31) % 128;
            }
            map.put("app_version_code", String.valueOf(packageInfo.versionCode));
            Context context = this.component3.AFAdRevenueData.getMonetizationNetwork;
            map.put(CommonUrlParts.APP_VERSION, AFj1nSDK.getCurrencyIso4217Code(context, context.getPackageName()));
            map.put("targetSDKver", Integer.valueOf(this.component3.AFAdRevenueData.getMonetizationNetwork.getApplicationInfo().targetSdkVersion));
            long j = packageInfo.firstInstallTime;
            long j2 = packageInfo.lastUpdateTime;
            map.put("date1", ((SimpleDateFormat) getRevenue(new Object[]{this}, -65907378, 65907386, System.identityHashCode(this))).format(new Date(j)));
            map.put("date2", ((SimpleDateFormat) getRevenue(new Object[]{this}, -65907378, 65907386, System.identityHashCode(this))).format(new Date(j2)));
            Object[] objArr = new Object[1];
            a((-328942803) - View.MeasureSpec.getSize(0), View.getDefaultSize(0, 0) + 962452528, (ViewConfiguration.getWindowTouchSlop() >> 8) - 38, (byte) (TextUtils.lastIndexOf("", '0', 0) + 1), (short) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
            String intern = ((String) objArr[0]).intern();
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) getRevenue(new Object[]{this}, -65907378, 65907386, System.identityHashCode(this));
            simpleDateFormat.getClass();
            map.put(intern, getMonetizationNetwork(simpleDateFormat));
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting app version data ", th, true);
        }
    }

    public static Object getRevenue(Object[] objArr, int i2, int i3, int i4) {
        int i5 = ~((~i2) | (~i3));
        int i6 = ~i4;
        switch (((i2 | i3 | i4) * 220) + (((~(i6 | i3)) | i2) * (-440)) + ((i5 | (~(i6 | i2 | i3))) * 220) + (i3 * (-219)) + (i2 * 221)) {
            case 1:
                return getRevenue(objArr);
            case 2:
                AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
                AFh1tSDK aFh1tSDK = (AFh1tSDK) objArr[1];
                aFh1tSDK.getClass();
                if (aFg1uSDK.component3.component3()) {
                    AFh1xSDK aFh1xSDK = aFg1uSDK.component3.getMediationNetwork.component2;
                    if (aFh1xSDK == null) {
                        return null;
                    }
                    String str = aFh1xSDK.getRevenue;
                    if (str != null && str.length() != 0) {
                        w = (i + 73) % 128;
                        aFh1tSDK.getMonetizationNetwork("gaidError", aFh1xSDK.getRevenue);
                    }
                    String str2 = aFh1xSDK.getMonetizationNetwork;
                    if (str2 != null) {
                        i = (w + 45) % 128;
                        if (aFh1xSDK.getMediationNetwork != null) {
                            aFh1tSDK.getMonetizationNetwork("advertiserId", str2);
                            aFh1tSDK.getMonetizationNetwork("advertiserIdEnabled", String.valueOf(aFh1xSDK.getMediationNetwork));
                            aFh1tSDK.getMonetizationNetwork("isGaidWithGps", String.valueOf(aFh1xSDK.AFAdRevenueData));
                            i = (w + 99) % 128;
                        }
                    }
                } else {
                    Map<String, Object> AFAdRevenueData = AFa1zSDK.AFAdRevenueData(aFh1tSDK.getMonetizationNetwork);
                    AFAdRevenueData.getClass();
                    AFAdRevenueData.put("ad_ids_disabled", Boolean.TRUE);
                    w = (i + 53) % 128;
                }
                AFh1xSDK aFh1xSDK2 = aFg1uSDK.component3.getMediationNetwork.component2;
                aFh1tSDK.getMonetizationNetwork("GAID_retry", String.valueOf(aFh1xSDK2 != null ? Intrinsics.d(aFh1xSDK2.component4, Boolean.TRUE) : false));
                if (u75.h(AFe1uSDK.CONVERSION, AFe1uSDK.LAUNCH).contains(aFh1tSDK.getMediationNetwork())) {
                    int i7 = i;
                    w = (i7 + 19) % 128;
                    AFd1gSDK aFd1gSDK = aFg1uSDK.copy.component1;
                    if (aFd1gSDK != null) {
                        w = (i7 + 87) % 128;
                        Map<String, Object> AFAdRevenueData2 = AFa1zSDK.AFAdRevenueData(aFh1tSDK.getMonetizationNetwork);
                        AFAdRevenueData2.getClass();
                        AFAdRevenueData2.put("fetchAdIdLatency", Long.valueOf(aFd1gSDK.getMonetizationNetwork));
                    }
                }
                return null;
            case 3:
                return getMonetizationNetwork(objArr);
            case 4:
                AFg1uSDK aFg1uSDK2 = (AFg1uSDK) objArr[0];
                Map map = (Map) objArr[1];
                boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                i = (w + 113) % 128;
                map.getClass();
                map.put("platformextension", aFg1uSDK2.getCurrencyIso4217Code);
                if (booleanValue) {
                    i = (w + 95) % 128;
                    map.put("platform_extension_v2", aFg1uSDK2.getRevenue.getRevenue());
                    i = (w + 125) % 128;
                }
                return null;
            case 5:
                return getMediationNetwork(objArr);
            case 6:
                AFg1uSDK aFg1uSDK3 = (AFg1uSDK) objArr[0];
                AFh1tSDK aFh1tSDK2 = (AFh1tSDK) objArr[1];
                i = (w + 25) % 128;
                aFh1tSDK2.getClass();
                Map<String, Object> map2 = aFh1tSDK2.getMonetizationNetwork;
                map2.getClass();
                aFg1uSDK3.getCurrencyIso4217Code(map2, aFh1tSDK2.AFAdRevenueData());
                getRevenue(new Object[]{map2}, -260988684, 260988687, (int) System.currentTimeMillis());
                unregisterClient(map2);
                aFg1uSDK3.getRevenue(map2);
                aFg1uSDK3.getMediationNetwork(map2, aFg1uSDK3.copy.getCurrencyIso4217Code);
                aFg1uSDK3.e(map2);
                map2.put("cell", uah.e(new Pair("mcc", Integer.valueOf(aFg1uSDK3.AFAdRevenueData.getResources().getConfiguration().mcc)), new Pair("mnc", Integer.valueOf(aFg1uSDK3.AFAdRevenueData.getResources().getConfiguration().mnc))));
                map2.put("sig", aFg1uSDK3.component4());
                map2.put("last_boot_time", Long.valueOf(component3()));
                map2.put("disk", component2());
                w = (i + 77) % 128;
                return null;
            case 7:
                return AFAdRevenueData(objArr);
            case 8:
                return component4(objArr);
            case 9:
                return areAllFieldsValid(objArr);
            case 10:
                return component2(objArr);
            case 11:
                return component3(objArr);
            case 12:
                return component1(objArr);
            default:
                return getCurrencyIso4217Code(objArr);
        }
    }

    private final void hashCode(Map<String, Object> map) {
        int i2 = w + 1;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 62 / 0;
            if (getMonetizationNetwork().isOtherSdkStringDisabled()) {
                return;
            }
        } else if (getMonetizationNetwork().isOtherSdkStringDisabled()) {
            return;
        }
        int i4 = w + 81;
        i = i4 % 128;
        int i5 = i4 % 2;
        AFf1aSDK aFf1aSDK = this.getMonetizationNetwork;
        if (i5 != 0) {
            map.put("batteryLevel", String.valueOf(aFf1aSDK.getMonetizationNetwork(this.AFAdRevenueData).getMediationNetwork));
        } else {
            map.put("batteryLevel", String.valueOf(aFf1aSDK.getMonetizationNetwork(this.AFAdRevenueData).getMediationNetwork));
            int i6 = 14 / 0;
        }
    }

    private void i(@NotNull Map<String, Object> map) {
        w = (i + 27) % 128;
        map.getClass();
        boolean AFAdRevenueData = AFg1zSDK.AFAdRevenueData(this.AFAdRevenueData);
        AFLogger.afDebugLog("didConfigureTokenRefreshService=" + AFAdRevenueData);
        if (!AFAdRevenueData) {
            map.put("tokenRefreshConfigured", Boolean.FALSE);
            i = (w + 25) % 128;
        }
        map.put("registeredUninstall", Boolean.valueOf(AFg1zSDK.getRevenue(this.areAllFieldsValid)));
    }

    private final String registerClient() {
        File AFAdRevenueData = AFAdRevenueData(getMediationNetwork("ro.appsflyer.preinstall.path"));
        if (getMonetizationNetwork(AFAdRevenueData)) {
            i = (w + 41) % 128;
            AFAdRevenueData = AFAdRevenueData(getCurrencyIso4217Code("AF_PRE_INSTALL_PATH"));
        }
        if (getMonetizationNetwork(AFAdRevenueData)) {
            int i2 = w + 87;
            i = i2 % 128;
            if (i2 % 2 == 0) {
                AFAdRevenueData("/data/local/tmp/pre_install.appsflyer");
                throw null;
            }
            AFAdRevenueData = AFAdRevenueData("/data/local/tmp/pre_install.appsflyer");
        }
        if (getMonetizationNetwork(AFAdRevenueData)) {
            int i3 = i + 45;
            w = i3 % 128;
            if (i3 % 2 != 0) {
                AFAdRevenueData = AFAdRevenueData("/etc/pre_install.appsflyer");
                int i4 = 57 / 0;
            } else {
                AFAdRevenueData = AFAdRevenueData("/etc/pre_install.appsflyer");
            }
            w = (i + 109) % 128;
        }
        if (getMonetizationNetwork(AFAdRevenueData)) {
            return null;
        }
        String packageName = this.AFAdRevenueData.getPackageName();
        packageName.getClass();
        return getCurrencyIso4217Code(AFAdRevenueData, packageName);
    }

    private static PackageInfo s_(PackageManager packageManager, String str) {
        w = (i + 109) % 128;
        if (Build.VERSION.SDK_INT < 33) {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            packageInfo.getClass();
            return packageInfo;
        }
        w = (i + 45) % 128;
        PackageInfo packageInfo2 = packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
        packageInfo2.getClass();
        return packageInfo2;
    }

    private final void toString(Map<String, Object> map) {
        int i2 = i + 51;
        w = i2 % 128;
        int i3 = i2 % 2;
        Context context = this.AFAdRevenueData;
        if (i3 != 0) {
            AFg1rSDK.getCurrencyIso4217Code(context);
            throw null;
        }
        if (AFg1rSDK.getCurrencyIso4217Code(context)) {
            w = (i + 73) % 128;
            map.put("inst_app", Boolean.TRUE);
        }
    }

    private static void unregisterClient(@NotNull Map<String, Object> map) {
        i = (w + 13) % 128;
        map.getClass();
        try {
            map.put("lang", Locale.getDefault().getDisplayLanguage());
        } catch (Exception e) {
            AFLogger.afErrorLog("Exception while collecting display language name. ", e);
        }
        try {
            map.put("lang_code", Locale.getDefault().getLanguage());
        } catch (Exception e2) {
            AFLogger.afErrorLog("Exception while collecting display language code. ", e2);
        }
        try {
            map.put(AdRevenueScheme.COUNTRY, Locale.getDefault().getCountry());
            i = (w + 123) % 128;
        } catch (Exception e3) {
            AFLogger.afErrorLog("Exception while collecting country name. ", e3);
        }
    }

    private void v(@NotNull Map<String, Object> map) {
        String str;
        AFc1kSDK aFc1kSDK;
        i = (w + 19) % 128;
        map.getClass();
        if (getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_FACEBOOK_ATTR_ID, true)) {
            int i2 = w + 37;
            i = i2 % 128;
            int i3 = i2 % 2;
            Context context = this.AFAdRevenueData;
            try {
                if (i3 == 0) {
                    context.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                    aFc1kSDK = this.component3;
                } else {
                    context.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                    aFc1kSDK = this.component3;
                }
                str = aFc1kSDK.getMediationNetwork(this.AFAdRevenueData);
            } catch (Throwable unused) {
                str = null;
            }
            if (str != null) {
                int i4 = i + 55;
                w = i4 % 128;
                if (i4 % 2 == 0) {
                    map.put("fb", str);
                } else {
                    map.put("fb", str);
                    int i5 = 64 / 0;
                }
            }
        }
    }

    private void w(@NotNull Map<String, Object> map) {
        w = (i + 79) % 128;
        map.getClass();
        try {
            String monetizationNetwork = AFb1kSDK.getMonetizationNetwork(this.areAllFieldsValid);
            if (monetizationNetwork != null) {
                map.put("uid", monetizationNetwork);
                return;
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("ERROR: could not get uid ");
            sb.append(th.getMessage());
            AFLogger.afErrorLog(sb.toString(), th);
        }
        w = (i + 3) % 128;
    }

    @Override // com.appsflyer.internal.AFg1tSDK
    public final void getMediationNetwork(@NotNull Map<String, Object> map) {
        map.getClass();
        String string = getMonetizationNetwork().getString(AppsFlyerProperties.APP_ID);
        if (string != null) {
            map.put(AppsFlyerProperties.APP_ID, string);
        } else {
            w = (i + 51) % 128;
        }
        String string2 = getMonetizationNetwork().getString(AppsFlyerProperties.CURRENCY_CODE);
        if (string2 != null) {
            if (string2.length() != 3) {
                StringBuilder sb = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                sb.append(string2);
                sb.append("' is not a legal value.");
                AFLogger.afWarnLog(sb.toString());
            }
            map.put("currency", string2);
        }
        String string3 = getMonetizationNetwork().getString(AppsFlyerProperties.IS_UPDATE);
        if (string3 != null) {
            i = (w + 73) % 128;
            map.put("isUpdate", string3);
        } else {
            i = (w + 21) % 128;
        }
        String string4 = getMonetizationNetwork().getString(AppsFlyerProperties.ADDITIONAL_CUSTOM_DATA);
        if (string4 != null) {
            map.put("customData", string4);
        }
        String string5 = getMonetizationNetwork().getString(AppsFlyerProperties.APP_USER_ID);
        if (string5 != null) {
            map.put("appUserId", string5);
        }
        String string6 = getMonetizationNetwork().getString(AppsFlyerProperties.USER_EMAILS);
        if (string6 != null) {
            map.put("user_emails", string6);
        }
        AFb1qSDK aFb1qSDK = this.copy.getMonetizationNetwork;
        if (aFb1qSDK != null) {
            int i2 = i + 21;
            w = i2 % 128;
            int i3 = i2 % 2;
            String[] strArr = aFb1qSDK.getRevenue;
            if (i3 != 0) {
                throw null;
            }
            if (strArr != null) {
                map.put("sharing_filter", strArr);
            }
        }
    }

    private static long component3() {
        int i2 = w + 39;
        i = i2 % 128;
        if (i2 % 2 != 0) {
            return System.currentTimeMillis() - SystemClock.elapsedRealtime();
        }
        return SystemClock.elapsedRealtime() + System.currentTimeMillis();
    }

    private static void component3(@NotNull Map<String, Object> map) {
        getRevenue(new Object[]{map}, -260988684, 260988687, (int) System.currentTimeMillis());
    }

    private boolean copy() {
        int i2 = i + 57;
        w = i2 % 128;
        int i3 = i2 % 2;
        AFc1sSDK aFc1sSDK = this.areAllFieldsValid;
        if (i3 != 0) {
            Boolean.parseBoolean(aFc1sSDK.AFAdRevenueData("sentSuccessfully", (String) null));
            throw null;
        }
        boolean parseBoolean = Boolean.parseBoolean(aFc1sSDK.AFAdRevenueData("sentSuccessfully", (String) null));
        int i4 = i + 113;
        w = i4 % 128;
        if (i4 % 2 == 0) {
            return parseBoolean;
        }
        throw null;
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        w = (i + 27) % 128;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) aFg1uSDK.AFInAppEventType.getValue();
        int i2 = i + 105;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 79 / 0;
        }
        return simpleDateFormat;
    }

    private String component4() throws CertificateException, NoSuchAlgorithmException, PackageManager.NameNotFoundException {
        int i2 = w + 103;
        i = i2 % 128;
        int i3 = i2 % 2;
        Context context = this.AFAdRevenueData;
        if (i3 != 0) {
            return AFj1nSDK.L_(context.getApplicationContext().getPackageManager(), this.AFAdRevenueData.getApplicationContext().getPackageName());
        }
        AFj1nSDK.L_(context.getApplicationContext().getPackageManager(), this.AFAdRevenueData.getApplicationContext().getPackageName());
        throw null;
    }

    private static /* synthetic */ Object areAllFieldsValid(Object[] objArr) {
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        Map map = (Map) objArr[1];
        map.getClass();
        String string = aFg1uSDK.getMonetizationNetwork().getString(AppsFlyerProperties.EXTENSION);
        if (string != null) {
            int i2 = w + 17;
            i = i2 % 128;
            if (i2 % 2 != 0) {
                if (string.length() != 0) {
                    map.put(AppsFlyerProperties.EXTENSION, string);
                }
            } else {
                throw null;
            }
        }
        int i3 = i + 19;
        w = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private boolean equals() {
        int i2 = i + 61;
        w = i2 % 128;
        int i3 = i2 % 2;
        AFc1kSDK aFc1kSDK = this.component3;
        if (i3 == 0 ? aFc1kSDK.getRevenue.AFAdRevenueData("appsFlyerCount", 0) <= 1 : aFc1kSDK.getRevenue.AFAdRevenueData("appsFlyerCount", 1) <= 1) {
            return true;
        }
        int i4 = i + 23;
        w = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
        return false;
    }

    private void areAllFieldsValid(@NotNull Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, 252198665, -252198654, System.identityHashCode(this));
    }

    private void AFLogger(@NotNull Map<String, Object> map) {
        int i2 = i + 17;
        w = i2 % 128;
        if (i2 % 2 == 0) {
            map.getClass();
            map.putAll(this.hashCode.getRevenue());
            int i3 = w + 121;
            i = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        map.getClass();
        map.putAll(this.hashCode.getRevenue());
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1tSDK
    public final long AFAdRevenueData() {
        int i2 = w + 83;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            System.currentTimeMillis();
            throw null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        w = (i + 55) % 128;
        return currentTimeMillis;
    }

    @Override // com.appsflyer.internal.AFg1tSDK
    public final void AFAdRevenueData(@NotNull Map<String, Object> map, int i2, int i3) {
        boolean z;
        i = (w + 17) % 128;
        map.getClass();
        map.put("counter", String.valueOf(i2));
        map.put("iaecounter", String.valueOf(i3));
        if (copy()) {
            i = (w + 93) % 128;
            z = false;
        } else {
            z = true;
        }
        map.put("isFirstCall", String.valueOf(z));
    }

    private void AFInAppEventType(@NotNull Map<String, Object> map) {
        getRevenue(new Object[]{this, map}, -952054668, 952054677, System.identityHashCode(this));
    }

    private final void AFAdRevenueData(Map<String, Object> map) {
        try {
            long j = this.AFAdRevenueData.getPackageManager().getPackageInfo(this.AFAdRevenueData.getPackageName(), 0).firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(j)));
            int i2 = w + 21;
            i = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("Exception while collecting install date. ", e);
        }
    }

    private void component2(@NotNull Map<String, Object> map) {
        map.getClass();
        String string = getMonetizationNetwork().getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = getMonetizationNetwork().getString(AppsFlyerProperties.ONELINK_VERSION);
        if (string != null) {
            w = (i + 87) % 128;
            map.put("onelink_id", string);
            i = (w + 39) % 128;
        }
        if (string2 != null) {
            int i2 = i + 121;
            w = i2 % 128;
            if (i2 % 2 != 0) {
                map.put("onelink_ver", string2);
                int i3 = 61 / 0;
            } else {
                map.put("onelink_ver", string2);
            }
        }
    }

    private static File AFAdRevenueData(String str) {
        if (str != null) {
            try {
                if (StringsKt.t0(str).toString().length() > 0) {
                    int i2 = i + 21;
                    w = i2 % 128;
                    if (i2 % 2 == 0) {
                        return new File(StringsKt.t0(str).toString());
                    }
                } else {
                    i = (w + 27) % 128;
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getMessage(), th);
            }
        }
        w = (i + 123) % 128;
        return null;
    }

    private String copydefault() {
        int i2;
        String string = getMonetizationNetwork().getString("preInstallName");
        if (string != null) {
            i2 = w + 23;
        } else {
            if (this.areAllFieldsValid.getCurrencyIso4217Code("preInstallName")) {
                string = this.areAllFieldsValid.AFAdRevenueData("preInstallName", (String) null);
            } else {
                if (equals()) {
                    w = (i + 99) % 128;
                    string = registerClient();
                    if (string == null) {
                        w = (i + 29) % 128;
                        string = getCurrencyIso4217Code("AF_PRE_INSTALL_NAME");
                    }
                }
                if (string != null) {
                    this.areAllFieldsValid.getRevenue("preInstallName", string);
                }
            }
            if (string != null) {
                getMonetizationNetwork().set("preInstallName", string);
            }
            i2 = w + 103;
        }
        i = i2 % 128;
        return string;
    }

    @NotNull
    private static String component2() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        double pow = Math.pow(2.0d, 20.0d);
        String str = ((long) (availableBlocksLong / pow)) + "/" + ((long) (blockCountLong / pow));
        i = (w + 87) % 128;
        return str;
    }

    private void AFAdRevenueData(@NotNull Map<String, Object> map, @NotNull String str) {
        getRevenue(new Object[]{this, map, str}, 22668144, -22668132, System.identityHashCode(this));
    }

    private final void component1(Map<String, Object> map) {
        int i2 = w + 79;
        i = i2 % 128;
        int i3 = i2 % 2;
        AFf1aSDK aFf1aSDK = this.getMonetizationNetwork;
        if (i3 == 0) {
            map.put("btl", String.valueOf(aFf1aSDK.getMonetizationNetwork(this.AFAdRevenueData).getMediationNetwork));
            throw null;
        }
        AFf1aSDK.AFa1ySDK monetizationNetwork = aFf1aSDK.getMonetizationNetwork(this.AFAdRevenueData);
        float f = monetizationNetwork.getMediationNetwork;
        String str = monetizationNetwork.getRevenue;
        map.put("btl", String.valueOf(f));
        if (str != null) {
            i = (w + 59) % 128;
            map.put("btch", str);
        }
    }

    @Override // com.appsflyer.internal.AFg1tSDK
    public final void AFAdRevenueData(@NotNull AFh1tSDK aFh1tSDK) {
        getRevenue(new Object[]{this, aFh1tSDK}, 919507137, -919507136, System.identityHashCode(this));
    }

    private String component1() {
        return (String) getRevenue(new Object[]{this}, -1813533339, 1813533344, System.identityHashCode(this));
    }

    private void registerClient(@NotNull Map<String, Object> map) {
        w = (i + 11) % 128;
        map.getClass();
        long j = this.component1.copydefault;
        if (j != 0) {
            w = (i + 65) % 128;
            map.put("prev_session_dur", Long.valueOf(j));
        }
    }

    private void getCurrencyIso4217Code(@NotNull Map<String, Object> map, boolean z) {
        map.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("cpu_abi", getMediationNetwork("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", getMediationNetwork("ro.product.cpu.abi2"));
        hashMap.put("arch", getMediationNetwork("os.arch"));
        hashMap.put("build_display_id", getMediationNetwork("ro.build.display.id"));
        if (z) {
            w = (i + 61) % 128;
            component1(hashMap);
            if (this.component3.getRevenue.AFAdRevenueData("appsFlyerCount", 0) <= 2) {
                int i2 = i + 119;
                w = i2 % 128;
                int i3 = i2 % 2;
                AFj1rSDK aFj1rSDK = this.getMediationNetwork;
                if (i3 != 0) {
                    hashMap.putAll(aFj1rSDK.getRevenue());
                    throw null;
                }
                hashMap.putAll(aFj1rSDK.getRevenue());
            }
        }
        hashMap.put("dim", this.component4.getCurrencyIso4217Code(this.AFAdRevenueData));
        map.put("deviceData", hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        com.appsflyer.AFLogger.afDebugLog("Skip 'af' payload as deeplink was found by path");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        r2 = defpackage.z7o.b;
        r2 = new org.json.JSONObject(r0);
        r2.put("isPush", com.connectsdk.service.airplay.PListParser.TAG_TRUE);
        r11.put("af_deeplink", r2.toString());
        r11 = kotlin.Unit.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r0 = defpackage.z7o.b;
        r11 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0021, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r11.get("af_deeplink") == null) goto L22;
     */
    @Override // com.appsflyer.internal.AFg1tSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getCurrencyIso4217Code(@NotNull Map<String, Object> map) {
        String str;
        Object t7oVar;
        int i2 = i + 37;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            map.getClass();
            str = this.copy.getRevenue;
            int i3 = 33 / 0;
        } else {
            map.getClass();
            str = this.copy.getRevenue;
        }
        this.copy.getRevenue = null;
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            w = (i + 39) % 128;
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFh1zSDK.GENERAL, "Exception while trying to create JSONObject from pushPayload", a, false, false, false, false, 120, null);
        } else {
            w = (i + 119) % 128;
        }
        this.copy.getRevenue = null;
    }

    private static void getCurrencyIso4217Code(@NotNull Map<String, Object> map, String str) {
        w = (i + 55) % 128;
        map.getClass();
        if (str != null) {
            int i2 = w + 57;
            i = i2 % 128;
            if (i2 % 2 != 0) {
                map.put("phone", str);
            } else {
                map.put("phone", str);
                throw null;
            }
        }
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        Map map = (Map) objArr[0];
        map.getClass();
        String monetizationNetwork = AFa1uSDK.getMonetizationNetwork();
        String AFAdRevenueData = AFa1uSDK.AFAdRevenueData();
        if (monetizationNetwork != null && AFAdRevenueData != null) {
            int i2 = i + 49;
            w = i2 % 128;
            if (i2 % 2 == 0) {
                if (Integer.parseInt(AFAdRevenueData) > 0) {
                    map.put("reinstallCounter", AFAdRevenueData);
                    map.put("originalAppsflyerId", monetizationNetwork);
                    w = (i + 11) % 128;
                }
            } else {
                Integer.parseInt(AFAdRevenueData);
                throw null;
            }
        }
        return null;
    }

    private final String getCurrencyIso4217Code(String str) {
        int i2 = i + 63;
        w = i2 % 128;
        int i3 = i2 % 2;
        AFc1kSDK aFc1kSDK = this.component3;
        if (i3 == 0) {
            return aFc1kSDK.getCurrencyIso4217Code(str);
        }
        aFc1kSDK.getCurrencyIso4217Code(str);
        throw null;
    }

    private void getMediationNetwork(@NotNull Map<String, Object> map, String str) {
        map.getClass();
        if (getMonetizationNetwork().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            map.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, PListParser.TAG_TRUE);
            return;
        }
        AFf1iSDK aFf1iSDK = this.equals;
        String str2 = (String) AFf1iSDK.AFAdRevenueData(new Object[]{aFf1iSDK, this.areAllFieldsValid}, 527487030, -527487030, System.identityHashCode(aFf1iSDK));
        if (str2 != null) {
            int i2 = w + 11;
            i = i2 % 128;
            if (i2 % 2 != 0) {
                if (str2.length() != 0) {
                    map.put("imei", str2);
                }
            } else {
                throw null;
            }
        }
        String revenue = getRevenue(str);
        if (revenue != null) {
            int i3 = w + 41;
            i = i3 % 128;
            int i4 = i3 % 2;
            AFc1sSDK aFc1sSDK = this.areAllFieldsValid;
            if (i4 != 0) {
                aFc1sSDK.getRevenue("androidIdCached", revenue);
                map.put("android_id", revenue);
            } else {
                aFc1sSDK.getRevenue("androidIdCached", revenue);
                map.put("android_id", revenue);
                throw null;
            }
        } else {
            AFLogger.afInfoLog("Android ID was not collected.");
        }
        AFb1lSDK monetizationNetwork = AFb1iSDK.getMonetizationNetwork(this.AFAdRevenueData);
        if (monetizationNetwork != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Boolean bool = monetizationNetwork.AFAdRevenueData;
            bool.getClass();
            linkedHashMap.put("isManual", bool);
            String str3 = monetizationNetwork.getMonetizationNetwork;
            str3.getClass();
            linkedHashMap.put("val", str3);
            Boolean bool2 = monetizationNetwork.getCurrencyIso4217Code;
            if (bool2 != null) {
                int i5 = i + 45;
                w = i5 % 128;
                if (i5 % 2 != 0) {
                    linkedHashMap.put("isLat", bool2);
                    int i6 = 30 / 0;
                } else {
                    linkedHashMap.put("isLat", bool2);
                }
            }
            map.put(CommonUrlParts.HUAWEI_OAID, linkedHashMap);
        }
    }

    private void getCurrencyIso4217Code(@NotNull AFh1tSDK aFh1tSDK, String str, String str2, AFb1vSDK aFb1vSDK) {
        aFh1tSDK.getClass();
        Map<String, Object> map = aFh1tSDK.getMonetizationNetwork;
        if (aFh1tSDK.getMediationNetwork() == AFe1uSDK.CONVERSION) {
            int i2 = i + 71;
            w = i2 % 128;
            if (i2 % 2 == 0) {
                map.getClass();
                hashCode(map);
                copy(map);
                toString(map);
                AFa1uSDK.getMonetizationNetwork(this.copydefault, this.areAllFieldsValid);
            } else {
                map.getClass();
                hashCode(map);
                copy(map);
                toString(map);
                AFa1uSDK.getMonetizationNetwork(this.copydefault, this.areAllFieldsValid);
                throw null;
            }
        }
        map.getClass();
        copydefault(map);
        component2(map);
        component4((Map<String, ? extends Object>) map);
        getCurrencyIso4217Code(map, str2);
        getRevenue(map, str);
        registerClient(map);
        if (aFb1vSDK != null) {
            w = (i + 67) % 128;
            aFb1vSDK.getRevenue(map);
        }
    }

    private static void getCurrencyIso4217Code(@NotNull Map<String, Object> map, @NotNull AFh1tSDK aFh1tSDK) {
        map.getClass();
        aFh1tSDK.getClass();
        String str = aFh1tSDK.component3;
        if (str != null) {
            map.put("eventName", str);
            Map map2 = aFh1tSDK.getRevenue;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }

    @Override // com.appsflyer.internal.AFg1tSDK
    public final Long getCurrencyIso4217Code() {
        return (Long) getRevenue(new Object[]{this}, 544119822, -544119812, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1tSDK
    public final void getCurrencyIso4217Code(@NotNull AFh1tSDK aFh1tSDK) {
        getRevenue(new Object[]{this, aFh1tSDK}, 2099834135, -2099834129, System.identityHashCode(this));
    }

    private static List<AFe1uSDK> getMediationNetwork() {
        i = (w + 19) % 128;
        List<AFe1uSDK> h = u75.h(AFe1uSDK.CONVERSION, AFe1uSDK.LAUNCH, AFe1uSDK.INAPP, AFe1uSDK.MANUAL_PURCHASE_VALIDATION, AFe1uSDK.ARS_VALIDATE, AFe1uSDK.PURCHASE_VALIDATE);
        i = (w + 71) % 128;
        return h;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFg1uSDK aFg1uSDK = (AFg1uSDK) objArr[0];
        String string = aFg1uSDK.getMonetizationNetwork().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            return string;
        }
        int i2 = w + 21;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            aFg1uSDK.getCurrencyIso4217Code("AF_STORE");
            throw null;
        }
        String currencyIso4217Code = aFg1uSDK.getCurrencyIso4217Code("AF_STORE");
        w = (i + 25) % 128;
        return currencyIso4217Code;
    }

    private static String getMediationNetwork(String str) {
        w = (i + 97) % 128;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            invoke.getClass();
            String str2 = (String) invoke;
            int i2 = i + 35;
            w = i2 % 128;
            if (i2 % 2 == 0) {
                return str2;
            }
            throw null;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFg1tSDK
    public final void getMediationNetwork(@NotNull AFh1tSDK aFh1tSDK) {
        getRevenue(new Object[]{this, aFh1tSDK}, 773674548, -773674546, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1tSDK
    public final void getMonetizationNetwork(@NotNull AFh1tSDK aFh1tSDK) {
        aFh1tSDK.getClass();
        Map<String, Object> map = aFh1tSDK.getMonetizationNetwork;
        if (aFh1tSDK.AFAdRevenueData()) {
            int i2 = w + 13;
            i = i2 % 128;
            int i3 = i2 % 2;
            String str = aFh1tSDK.areAllFieldsValid;
            if (i3 != 0) {
                AFc1oSDK aFc1oSDK = this.copy;
                getCurrencyIso4217Code(aFh1tSDK, str, aFc1oSDK.getMediationNetwork, aFc1oSDK.AFAdRevenueData);
            } else {
                AFc1oSDK aFc1oSDK2 = this.copy;
                getCurrencyIso4217Code(aFh1tSDK, str, aFc1oSDK2.getMediationNetwork, aFc1oSDK2.AFAdRevenueData);
                throw null;
            }
        } else if (!(aFh1tSDK instanceof AFh1jSDK)) {
            map.getClass();
            String str2 = aFh1tSDK.component3;
            str2.getClass();
            getRevenue(new Object[]{this, map, str2}, 22668144, -22668132, System.identityHashCode(this));
            i = (w + 43) % 128;
        }
        if (u75.h(AFe1uSDK.CONVERSION, AFe1uSDK.LAUNCH, AFe1uSDK.INAPP).contains(aFh1tSDK.getMediationNetwork())) {
            map.getClass();
            equals(map);
        }
        if (aFh1tSDK.getMonetizationNetwork()) {
            w = (i + 61) % 128;
            map.getClass();
            getRevenue(new Object[]{this, map}, 252198665, -252198654, System.identityHashCode(this));
        }
        map.getClass();
        getRevenue(new Object[]{this, map}, 1072860105, -1072860098, System.identityHashCode(this));
        getRevenue(new Object[]{map}, 1729638864, -1729638864, (int) System.currentTimeMillis());
        AFLogger(map);
        getRevenue(new Object[]{this, map}, -952054668, 952054677, System.identityHashCode(this));
        w(map);
        getRevenue(new Object[]{this, map, Boolean.valueOf(aFh1tSDK.AFAdRevenueData())}, 491464520, -491464516, System.identityHashCode(this));
        i(map);
        afDebugLog(map);
        getCurrencyIso4217Code(map, aFh1tSDK);
        map.put("af_events_api", "1");
    }

    private final AppsFlyerProperties getMonetizationNetwork() {
        i = (w + 19) % 128;
        AppsFlyerProperties appsFlyerProperties = (AppsFlyerProperties) this.toString.getValue();
        int i2 = i + 19;
        w = i2 % 128;
        if (i2 % 2 == 0) {
            return appsFlyerProperties;
        }
        throw null;
    }

    @NotNull
    private String getMonetizationNetwork(@NotNull SimpleDateFormat simpleDateFormat) {
        String str;
        simpleDateFormat.getClass();
        String AFAdRevenueData = this.areAllFieldsValid.AFAdRevenueData("appsFlyerFirstInstall", (String) null);
        if (AFAdRevenueData == null) {
            i = (w + 79) % 128;
            if (equals()) {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                str = simpleDateFormat.format(new Date());
            } else {
                str = "";
            }
            AFAdRevenueData = str;
            this.areAllFieldsValid.getRevenue("appsFlyerFirstInstall", AFAdRevenueData);
            w = (i + 89) % 128;
        }
        AFg1gSDK.i$default(AFLogger.INSTANCE, AFh1zSDK.GENERAL, f1d.g("AppsFlyer: first launch date: ", AFAdRevenueData), false, 4, null);
        AFAdRevenueData.getClass();
        return AFAdRevenueData;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        Map map = (Map) objArr[0];
        i = (w + 17) % 128;
        map.getClass();
        Object[] objArr2 = new Object[1];
        a((-328942807) - View.MeasureSpec.makeMeasureSpec(0, 0), Color.argb(0, 0, 0, 0) + 962452542, TextUtils.lastIndexOf("", '0', 0) - 47, (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) (ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
        map.put(((String) objArr2[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put(CommonUrlParts.MODEL, Build.MODEL);
        map.put(SSDPDeviceDescriptionParser.TAG_DEVICE_TYPE, Build.TYPE);
        int i2 = i + 27;
        w = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 73 / 0;
        }
        return null;
    }

    private static String getMonetizationNetwork(AFc1sSDK aFc1sSDK, String str) {
        String AFAdRevenueData = aFc1sSDK.AFAdRevenueData("CACHED_CHANNEL", (String) null);
        if (AFAdRevenueData != null) {
            int i2 = i + 115;
            int i3 = i2 % 128;
            w = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            i = (i3 + 85) % 128;
            return AFAdRevenueData;
        }
        aFc1sSDK.getRevenue("CACHED_CHANNEL", str);
        w = (i + 65) % 128;
        return str;
    }

    private static boolean getMonetizationNetwork(File file) {
        int i2 = i;
        int i3 = i2 + 35;
        w = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (file == null) {
            return true;
        }
        int i4 = i2 + 15;
        w = i4 % 128;
        int i5 = i4 % 2;
        boolean exists = file.exists();
        if (i5 != 0) {
            int i6 = 72 / 0;
            if (!exists) {
                return true;
            }
        } else if (!exists) {
            return true;
        }
        return false;
    }

    private void getMonetizationNetwork(@NotNull Map<String, Object> map, boolean z) {
        getRevenue(new Object[]{this, map, Boolean.valueOf(z)}, 491464520, -491464516, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1tSDK
    public final void getRevenue(@NotNull Map<String, Object> map) {
        AFi1wSDK aFi1wSDK;
        map.getClass();
        AFi1xSDK aFi1xSDK = this.component2.getRevenue;
        if (aFi1xSDK != null) {
            w = (i + 33) % 128;
            aFi1wSDK = aFi1xSDK.getMediationNetwork();
        } else {
            aFi1wSDK = null;
        }
        if (aFi1wSDK != null) {
            map.put("network", aFi1wSDK.AFAdRevenueData);
            map.put("ivc", Boolean.valueOf(aFi1wSDK.getMediationNetwork()));
            if (getMonetizationNetwork().getBoolean(AppsFlyerProperties.DISABLE_NETWORK_DATA, false)) {
                return;
            }
            w = (i + 25) % 128;
            String str = aFi1wSDK.getCurrencyIso4217Code;
            if (str != null) {
                map.put("operator", str);
                i = (w + 117) % 128;
            }
            String str2 = aFi1wSDK.getMonetizationNetwork;
            if (str2 != null) {
                map.put("carrier", str2);
                return;
            }
            return;
        }
        int i2 = w + 107;
        i = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private void getRevenue(@NotNull Map<String, Object> map, String str) {
        map.getClass();
        if (str != null && str.length() != 0) {
            i = (w + 85) % 128;
            map.put(Constants.KEY_REFERRER, str);
        }
        String AFAdRevenueData = this.areAllFieldsValid.AFAdRevenueData("extraReferrers", (String) null);
        if (AFAdRevenueData != null) {
            map.put("extraReferrers", AFAdRevenueData);
        }
        String referrer = getMonetizationNetwork().getReferrer(this.areAllFieldsValid);
        if (referrer == null || referrer.length() == 0) {
            return;
        }
        w = (i + 111) % 128;
        if (map.get(Constants.KEY_REFERRER) == null) {
            map.put(Constants.KEY_REFERRER, referrer);
            w = (i + 1) % 128;
        }
    }

    @Override // com.appsflyer.internal.AFg1tSDK
    public final void getRevenue(@NotNull AFh1tSDK aFh1tSDK) {
        aFh1tSDK.getClass();
        Map<String, Object> map = aFh1tSDK.getMonetizationNetwork;
        map.getClass();
        AFAdRevenueData(map);
        Map<String, Object> map2 = aFh1tSDK.getMonetizationNetwork;
        map2.getClass();
        getMonetizationNetwork(map2);
        Map<String, Object> map3 = aFh1tSDK.getMonetizationNetwork;
        map3.getClass();
        AFKeystoreWrapper(map3);
        Map<String, Object> map4 = aFh1tSDK.getMonetizationNetwork;
        map4.getClass();
        d(map4);
        Map<String, Object> map5 = aFh1tSDK.getMonetizationNetwork;
        map5.getClass();
        v(map5);
        if (getMediationNetwork().contains(aFh1tSDK.getMediationNetwork())) {
            int i2 = i + 55;
            w = i2 % 128;
            int i3 = i2 % 2;
            Map<String, Object> map6 = aFh1tSDK.getMonetizationNetwork;
            if (i3 != 0) {
                map6.getClass();
                afErrorLog(map6);
                int i4 = 66 / 0;
            } else {
                map6.getClass();
                afErrorLog(map6);
            }
        }
        i = (w + 15) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r5.length() == 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String getRevenue(String str) {
        int i2;
        int i3 = i + 103;
        w = i3 % 128;
        if (i3 % 2 == 0 ? getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, false) : getMonetizationNetwork().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID, true)) {
            if (str != null) {
                w = (i + 107) % 128;
            }
            if (!AFInAppEventType()) {
                return null;
            }
            str = AFLogger();
            i2 = i + 71;
            w = i2 % 128;
            return str;
        }
        if (str == null) {
            return null;
        }
        i2 = i + 99;
        w = i2 % 128;
        return str;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        int i2;
        AFh1tSDK aFh1tSDK = (AFh1tSDK) objArr[1];
        aFh1tSDK.getClass();
        Map<String, Object> map = aFh1tSDK.getMonetizationNetwork;
        map.getClass();
        map.put("open_referrer", aFh1tSDK.getMediationNetwork);
        String str = aFh1tSDK.component4;
        if (str == null || StringsKt.U(str)) {
            i2 = w + 87;
        } else {
            int i3 = i + 31;
            w = i3 % 128;
            int i4 = i3 % 2;
            String str2 = aFh1tSDK.component4;
            if (i4 == 0) {
                map.put("af_web_referrer", str2);
                i2 = w + 17;
            } else {
                map.put("af_web_referrer", str2);
                throw null;
            }
        }
        i = i2 % 128;
        return null;
    }

    private final SimpleDateFormat getRevenue() {
        return (SimpleDateFormat) getRevenue(new Object[]{this}, -65907378, 65907386, System.identityHashCode(this));
    }
}
