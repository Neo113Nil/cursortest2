package com.appsflyer.internal;

import android.graphics.PointF;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1xSDK;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatcherMatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes.dex */
public final class AFd1wSDK implements AFd1xSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFKeystoreWrapper = 1;
    private static char copy = 10357;
    private static int copydefault = 0;
    private static char equals = 787;
    private static char hashCode = 7956;
    private static char toString = 48673;
    private AFd1zSDK AFAdRevenueData;
    private final Lazy areAllFieldsValid;
    private AFd1xSDK.AFa1vSDK component1;
    private final Lazy component2;
    private final Lazy component3;
    private final String component4;
    private final Lazy getCurrencyIso4217Code;
    private final Lazy getMediationNetwork;
    private final Lazy getMonetizationNetwork;
    private final Lazy getRevenue;

    public AFd1wSDK(AFd1zSDK aFd1zSDK) {
        aFd1zSDK.getClass();
        this.AFAdRevenueData = aFd1zSDK;
        this.getRevenue = LazyKt.lazy(new Function0<AFf1kSDK>() { // from class: com.appsflyer.internal.AFd1wSDK.4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final AFf1kSDK invoke() {
                AFf1kSDK component1 = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).component1();
                component1.getClass();
                return component1;
            }
        });
        this.getMediationNetwork = LazyKt.lazy(new Function0<AFc1oSDK>() { // from class: com.appsflyer.internal.AFd1wSDK.3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AFc1oSDK invoke() {
                AFc1oSDK AFAdRevenueData = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).AFAdRevenueData();
                AFAdRevenueData.getClass();
                return AFAdRevenueData;
            }
        });
        this.getMonetizationNetwork = LazyKt.lazy(new Function0<AFc1qSDK>() { // from class: com.appsflyer.internal.AFd1wSDK.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AFc1qSDK invoke() {
                AFc1qSDK component4 = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).component4();
                component4.getClass();
                return component4;
            }
        });
        this.getCurrencyIso4217Code = LazyKt.lazy(new Function0<AFf1eSDK>() { // from class: com.appsflyer.internal.AFd1wSDK.6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final AFf1eSDK invoke() {
                AFf1eSDK AFInAppEventType = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).AFInAppEventType();
                AFInAppEventType.getClass();
                return AFInAppEventType;
            }
        });
        this.component2 = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.appsflyer.internal.AFd1wSDK.5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final ExecutorService invoke() {
                ExecutorService monetizationNetwork = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).getMonetizationNetwork();
                monetizationNetwork.getClass();
                return monetizationNetwork;
            }
        });
        this.component4 = "6.17.5";
        this.component3 = LazyKt.lazy(new Function0<AFd1ySDK>() { // from class: com.appsflyer.internal.AFd1wSDK.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final AFd1ySDK invoke() {
                AFc1hSDK AFInAppEventParameterName = AFd1wSDK.getCurrencyIso4217Code(AFd1wSDK.this).AFInAppEventParameterName();
                AFInAppEventParameterName.getClass();
                return new AFd1ySDK(AFInAppEventParameterName);
            }
        });
        this.areAllFieldsValid = LazyKt.lazy(new Function0<AFd1vSDK>() { // from class: com.appsflyer.internal.AFd1wSDK.7
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final AFd1vSDK invoke() {
                return new AFd1vSDK(AFd1wSDK.this.getRevenue());
            }
        });
    }

    private final boolean AFAdRevenueData(AFh1aSDK aFh1aSDK) {
        AFKeystoreWrapper = (copydefault + 29) % 128;
        long currentTimeMillis = System.currentTimeMillis();
        long monetizationNetwork = ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L);
        if (aFh1aSDK.getMonetizationNetwork >= currentTimeMillis / 1000 && monetizationNetwork != -1) {
            AFKeystoreWrapper = (copydefault + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            if (monetizationNetwork >= currentTimeMillis) {
                return getMonetizationNetwork(aFh1aSDK);
            }
        }
        return false;
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $11 = ($10 + 51) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        AFk1qSDK aFk1qSDK = new AFk1qSDK();
        char[] cArr3 = new char[cArr2.length];
        aFk1qSDK.getRevenue = 0;
        char[] cArr4 = new char[2];
        while (true) {
            int i2 = aFk1qSDK.getRevenue;
            if (i2 >= cArr2.length) {
                break;
            }
            cArr4[0] = cArr2[i2];
            cArr4[1] = cArr2[i2 + 1];
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                char c = cArr4[1];
                char c2 = cArr4[0];
                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (toString ^ (-1199070254561146252L))))) ^ ((c2 >>> 5) + ((char) (copy ^ (-1199070254561146252L))))));
                cArr4[1] = c3;
                cArr4[0] = (char) (c2 - (((c3 >>> 5) + ((char) (hashCode ^ (-1199070254561146252L)))) ^ ((c3 + i3) ^ ((c3 << 4) + ((char) (equals ^ (-1199070254561146252L)))))));
                i3 -= 40503;
            }
            int i5 = aFk1qSDK.getRevenue;
            cArr3[i5] = cArr4[0];
            cArr3[i5 + 1] = cArr4[1];
            aFk1qSDK.getRevenue = i5 + 2;
        }
        String str2 = new String(cArr3, 0, i);
        int i6 = $10 + 97;
        $11 = i6 % 128;
        if (i6 % 2 != 0) {
            objArr[0] = str2;
        } else {
            int i7 = 2 / 0;
            objArr[0] = str2;
        }
    }

    private final ExecutorService areAllFieldsValid() {
        copydefault = (AFKeystoreWrapper + 53) % 128;
        ExecutorService executorService = (ExecutorService) this.component2.getValue();
        AFKeystoreWrapper = (copydefault + 119) % 128;
        return executorService;
    }

    private final AFf1eSDK component1() {
        AFKeystoreWrapper = (copydefault + 109) % 128;
        AFf1eSDK aFf1eSDK = (AFf1eSDK) this.getCurrencyIso4217Code.getValue();
        copydefault = (AFKeystoreWrapper + 117) % 128;
        return aFf1eSDK;
    }

    private final AFc1qSDK component2() {
        return (AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this));
    }

    private AFd1uSDK component3() {
        copydefault = (AFKeystoreWrapper + 75) % 128;
        AFd1uSDK aFd1uSDK = (AFd1uSDK) this.areAllFieldsValid.getValue();
        int i = copydefault + 77;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            int i2 = 15 / 0;
        }
        return aFd1uSDK;
    }

    private final AFh1aSDK component4() {
        return (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if (getMediationNetwork(r0) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        com.appsflyer.internal.AFd1wSDK.copydefault = (com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper + 121) % 128;
        r1 = component1().getMediationNetwork();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        r0 = new org.json.JSONObject(getMonetizationNetwork(getRevenue(r0), getRevenue().getRevenue())).toString();
        r0.getClass();
        getMediationNetwork(new java.lang.Object[]{r9, r0, r1}, -1856843688, 1856843689, java.lang.System.identityHashCode(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        com.appsflyer.internal.AFh1ySDK.v$default(com.appsflyer.AFLogger.INSTANCE, com.appsflyer.internal.AFg1cSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x008b, code lost:
    
        r9 = com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper + 3;
        com.appsflyer.internal.AFd1wSDK.copydefault = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0095, code lost:
    
        if ((r9 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0097, code lost:
    
        r9 = 18 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x009b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void copy() {
        AFh1aSDK aFh1aSDK;
        int i = copydefault + 15;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
            int i2 = 33 / 0;
        } else {
            aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0129, code lost:
    
        if (r6 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012e, code lost:
    
        r6 = com.appsflyer.internal.AFd1rSDK.getMonetizationNetwork(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0165, code lost:
    
        if (r0.intValue() == (-1)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x012c, code lost:
    
        if (r6 != null) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0153 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x001f, B:6:0x0027, B:8:0x0038, B:12:0x0060, B:14:0x0071, B:16:0x0078, B:19:0x008b, B:21:0x008f, B:23:0x009c, B:25:0x00a4, B:27:0x00a8, B:29:0x00b6, B:30:0x00bc, B:32:0x00c8, B:34:0x00cc, B:36:0x00d2, B:38:0x00dd, B:40:0x00e7, B:42:0x00f0, B:44:0x00f4, B:46:0x00fa, B:47:0x0100, B:48:0x0103, B:49:0x0109, B:51:0x0119, B:57:0x012e, B:58:0x0134, B:60:0x0144, B:62:0x0148, B:64:0x0153, B:65:0x0158, B:70:0x0169, B:71:0x01e8, B:73:0x01ec, B:75:0x01fc, B:76:0x0200, B:82:0x0181, B:84:0x019b, B:85:0x01b3, B:86:0x0161, B:97:0x015d, B:98:0x01ce, B:55:0x0128, B:66:0x015b, B:91:0x00e2), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0158 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x001f, B:6:0x0027, B:8:0x0038, B:12:0x0060, B:14:0x0071, B:16:0x0078, B:19:0x008b, B:21:0x008f, B:23:0x009c, B:25:0x00a4, B:27:0x00a8, B:29:0x00b6, B:30:0x00bc, B:32:0x00c8, B:34:0x00cc, B:36:0x00d2, B:38:0x00dd, B:40:0x00e7, B:42:0x00f0, B:44:0x00f4, B:46:0x00fa, B:47:0x0100, B:48:0x0103, B:49:0x0109, B:51:0x0119, B:57:0x012e, B:58:0x0134, B:60:0x0144, B:62:0x0148, B:64:0x0153, B:65:0x0158, B:70:0x0169, B:71:0x01e8, B:73:0x01ec, B:75:0x01fc, B:76:0x0200, B:82:0x0181, B:84:0x019b, B:85:0x01b3, B:86:0x0161, B:97:0x015d, B:98:0x01ce, B:55:0x0128, B:66:0x015b, B:91:0x00e2), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0169 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x001f, B:6:0x0027, B:8:0x0038, B:12:0x0060, B:14:0x0071, B:16:0x0078, B:19:0x008b, B:21:0x008f, B:23:0x009c, B:25:0x00a4, B:27:0x00a8, B:29:0x00b6, B:30:0x00bc, B:32:0x00c8, B:34:0x00cc, B:36:0x00d2, B:38:0x00dd, B:40:0x00e7, B:42:0x00f0, B:44:0x00f4, B:46:0x00fa, B:47:0x0100, B:48:0x0103, B:49:0x0109, B:51:0x0119, B:57:0x012e, B:58:0x0134, B:60:0x0144, B:62:0x0148, B:64:0x0153, B:65:0x0158, B:70:0x0169, B:71:0x01e8, B:73:0x01ec, B:75:0x01fc, B:76:0x0200, B:82:0x0181, B:84:0x019b, B:85:0x01b3, B:86:0x0161, B:97:0x015d, B:98:0x01ce, B:55:0x0128, B:66:0x015b, B:91:0x00e2), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0181 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x001f, B:6:0x0027, B:8:0x0038, B:12:0x0060, B:14:0x0071, B:16:0x0078, B:19:0x008b, B:21:0x008f, B:23:0x009c, B:25:0x00a4, B:27:0x00a8, B:29:0x00b6, B:30:0x00bc, B:32:0x00c8, B:34:0x00cc, B:36:0x00d2, B:38:0x00dd, B:40:0x00e7, B:42:0x00f0, B:44:0x00f4, B:46:0x00fa, B:47:0x0100, B:48:0x0103, B:49:0x0109, B:51:0x0119, B:57:0x012e, B:58:0x0134, B:60:0x0144, B:62:0x0148, B:64:0x0153, B:65:0x0158, B:70:0x0169, B:71:0x01e8, B:73:0x01ec, B:75:0x01fc, B:76:0x0200, B:82:0x0181, B:84:0x019b, B:85:0x01b3, B:86:0x0161, B:97:0x015d, B:98:0x01ce, B:55:0x0128, B:66:0x015b, B:91:0x00e2), top: B:2:0x0001, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0161 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0001, B:5:0x001f, B:6:0x0027, B:8:0x0038, B:12:0x0060, B:14:0x0071, B:16:0x0078, B:19:0x008b, B:21:0x008f, B:23:0x009c, B:25:0x00a4, B:27:0x00a8, B:29:0x00b6, B:30:0x00bc, B:32:0x00c8, B:34:0x00cc, B:36:0x00d2, B:38:0x00dd, B:40:0x00e7, B:42:0x00f0, B:44:0x00f4, B:46:0x00fa, B:47:0x0100, B:48:0x0103, B:49:0x0109, B:51:0x0119, B:57:0x012e, B:58:0x0134, B:60:0x0144, B:62:0x0148, B:64:0x0153, B:65:0x0158, B:70:0x0169, B:71:0x01e8, B:73:0x01ec, B:75:0x01fc, B:76:0x0200, B:82:0x0181, B:84:0x019b, B:85:0x01b3, B:86:0x0161, B:97:0x015d, B:98:0x01ce, B:55:0x0128, B:66:0x015b, B:91:0x00e2), top: B:2:0x0001, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void copydefault() {
        Integer num;
        Pair<Integer, Integer> pair;
        AFh1aSDK aFh1aSDK;
        String str;
        int i;
        String str2;
        int i2;
        int i3;
        MatchGroup matchGroup;
        int i4;
        String str3;
        Integer intOrNull;
        String str4;
        Integer intOrNull2;
        String str5;
        try {
            copydefault = (AFKeystoreWrapper + 13) % 128;
            AFh1aSDK aFh1aSDK2 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
            if ((aFh1aSDK2 != null ? aFh1aSDK2.getMonetizationNetwork : -1L) < System.currentTimeMillis() / 1000) {
                AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "TTL is already passed", false, 4, null);
                ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                getRevenue().getCurrencyIso4217Code();
                return;
            }
            AFh1aSDK aFh1aSDK3 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
            if (aFh1aSDK3 == null || !getMonetizationNetwork(aFh1aSDK3)) {
                ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                getRevenue().getCurrencyIso4217Code();
            } else {
                AFh1aSDK aFh1aSDK4 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
                Pair<Integer, Integer> pair2 = null;
                if (aFh1aSDK4 == null || (str2 = aFh1aSDK4.getRevenue) == null) {
                    num = null;
                } else {
                    MatcherMatchResult matchEntire = new Regex("(\\d+).(\\d+).(\\d+).*").matchEntire(str2);
                    if (matchEntire != null) {
                        MatchGroup matchGroup2 = matchEntire.groups.get(1);
                        if (matchGroup2 != null && (str5 = matchGroup2.value) != null) {
                            copydefault = (AFKeystoreWrapper + 109) % 128;
                            Integer intOrNull3 = StringsKt.toIntOrNull(str5);
                            if (intOrNull3 != null) {
                                i3 = intOrNull3.intValue();
                                int i5 = i3 * 1000000;
                                matchGroup = matchEntire.groups.get(2);
                                if (matchGroup != null || (str4 = matchGroup.value) == null || (intOrNull2 = StringsKt.toIntOrNull(str4)) == null) {
                                    i4 = 0;
                                } else {
                                    int i6 = copydefault + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                                    AFKeystoreWrapper = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        throw null;
                                    }
                                    i4 = intOrNull2.intValue();
                                }
                                int i7 = (i4 * IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO) + i5;
                                MatchGroup matchGroup3 = matchEntire.groups.get(3);
                                i2 = i7 + ((matchGroup3 != null || (str3 = matchGroup3.value) == null || (intOrNull = StringsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull.intValue());
                            }
                        }
                        i3 = 0;
                        int i52 = i3 * 1000000;
                        matchGroup = matchEntire.groups.get(2);
                        if (matchGroup != null) {
                        }
                        i4 = 0;
                        int i72 = (i4 * IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO) + i52;
                        MatchGroup matchGroup32 = matchEntire.groups.get(3);
                        i2 = i72 + ((matchGroup32 != null || (str3 = matchGroup32.value) == null || (intOrNull = StringsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull.intValue());
                    } else {
                        i2 = -1;
                    }
                    num = Integer.valueOf(i2);
                }
                AFh1aSDK aFh1aSDK5 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
                if (aFh1aSDK5 != null) {
                    int i8 = copydefault + 15;
                    AFKeystoreWrapper = i8 % 128;
                    int i9 = i8 % 2;
                    String str6 = aFh1aSDK5.getRevenue;
                    if (i9 == 0) {
                        int i10 = 29 / 0;
                    }
                    aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
                    if (aFh1aSDK != null && (str = aFh1aSDK.getRevenue) != null) {
                        i = AFKeystoreWrapper + 99;
                        copydefault = i % 128;
                        if (i % 2 == 0) {
                            AFd1rSDK.AFAdRevenueData(str);
                            throw null;
                        }
                        pair2 = AFd1rSDK.AFAdRevenueData(str);
                    }
                    if (num != null) {
                    }
                    if (pair == null) {
                        AFKeystoreWrapper = (copydefault + 59) % 128;
                        getRevenue().getMonetizationNetwork(this.component4);
                    }
                    if (pair == null) {
                        getRevenue().getCurrencyIso4217Code(((Number) pair.first).intValue(), ((Number) pair.second).intValue());
                    } else if (pair2 != null) {
                        getRevenue().getCurrencyIso4217Code(((Number) pair2.first).intValue(), ((Number) pair2.second).intValue());
                    } else {
                        ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                        getRevenue().getCurrencyIso4217Code();
                    }
                }
                pair = null;
                aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
                if (aFh1aSDK != null) {
                    i = AFKeystoreWrapper + 99;
                    copydefault = i % 128;
                    if (i % 2 == 0) {
                    }
                }
                if (num != null) {
                }
                if (pair == null) {
                }
                if (pair == null) {
                }
            }
            AFd1xSDK.AFa1vSDK aFa1vSDK = this.component1;
            if (aFa1vSDK != null) {
                AFh1aSDK aFh1aSDK6 = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
                aFa1vSDK.onConfigurationChanged(aFh1aSDK6 != null ? AFAdRevenueData(aFh1aSDK6) : false);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void equals() {
        boolean z;
        try {
            copydefault = (AFKeystoreWrapper + 119) % 128;
            AFh1aSDK aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{this}, -2108652204, 2108652208, System.identityHashCode(this));
            if (aFh1aSDK != null) {
                if (aFh1aSDK.getMediationNetwork == -1) {
                    ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                } else if (((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L) == -1) {
                    AFKeystoreWrapper = (copydefault + 21) % 128;
                    getCurrencyIso4217Code(aFh1aSDK);
                }
                z = AFAdRevenueData(aFh1aSDK);
            } else {
                z = false;
            }
            AFd1xSDK.AFa1vSDK aFa1vSDK = this.component1;
            if (aFa1vSDK != null) {
                aFa1vSDK.onConfigurationChanged(z);
                int i = AFKeystoreWrapper + 111;
                copydefault = i % 128;
                if (i % 2 == 0) {
                } else {
                    throw null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFd1wSDK aFd1wSDK, Throwable th, String str) {
        aFd1wSDK.getClass();
        th.getClass();
        str.getClass();
        AFh1aSDK aFh1aSDK = (AFh1aSDK) getMediationNetwork(new Object[]{aFd1wSDK}, -2108652204, 2108652208, System.identityHashCode(aFd1wSDK));
        if (aFh1aSDK != null) {
            int i = copydefault + 99;
            AFKeystoreWrapper = i % 128;
            if (i % 2 != 0 ? !aFd1wSDK.AFAdRevenueData(aFh1aSDK) : aFd1wSDK.AFAdRevenueData(aFh1aSDK)) {
                AFKeystoreWrapper = (copydefault + 49) % 128;
            } else {
                AFKeystoreWrapper = (copydefault + 91) % 128;
                aFd1wSDK.getRevenue().AFAdRevenueData(th, str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007a, code lost:
    
        if (r1 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007c, code lost:
    
        r2 = com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper + 31;
        com.appsflyer.internal.AFd1wSDK.copydefault = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0086, code lost:
    
        if ((r2 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0088, code lost:
    
        r3 = 95 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0093, code lost:
    
        if (getRevenue().getMediationNetwork() >= r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a5, code lost:
    
        return getMonetizationNetwork(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009e, code lost:
    
        if (getRevenue().getMediationNetwork() >= r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a6, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:
    
        r0 = com.appsflyer.internal.AFd1wSDK.copydefault + 63;
        com.appsflyer.internal.AFd1wSDK.AFKeystoreWrapper = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b1, code lost:
    
        if ((r0 % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (r17.getMonetizationNetwork < (r10 / 1000)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003a, code lost:
    
        if (r17.getMonetizationNetwork < (r10 / 1000)) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005e, code lost:
    
        if (r12 == (-1)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0062, code lost:
    
        if (r12 >= r10) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0065, code lost:
    
        r1 = ((com.appsflyer.internal.AFc1qSDK) getMediationNetwork(new java.lang.Object[]{r16}, 1891172040, -1891172038, java.lang.System.identityHashCode(r16))).getRevenue("af_send_exc_min", -1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean getMediationNetwork(AFh1aSDK aFh1aSDK) {
        long currentTimeMillis;
        long monetizationNetwork;
        int i = copydefault + 19;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            currentTimeMillis = System.currentTimeMillis();
            monetizationNetwork = ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L);
            int i2 = 9 / 0;
        } else {
            currentTimeMillis = System.currentTimeMillis();
            monetizationNetwork = ((AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this))).getMonetizationNetwork("af_send_exc_to_server_window", -1L);
        }
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        int i = AFKeystoreWrapper + 77;
        copydefault = i % 128;
        int i2 = 1;
        if (i % 2 == 0) {
            aFd1wSDK.areAllFieldsValid().execute(new AFd1wSDK$$ExternalSyntheticLambda1(aFd1wSDK, i2));
            return null;
        }
        aFd1wSDK.areAllFieldsValid().execute(new AFd1wSDK$$ExternalSyntheticLambda1(aFd1wSDK, i2));
        int i3 = 69 / 0;
        return null;
    }

    private final Map<String, String> getRevenue(AFh1aSDK aFh1aSDK) {
        Object[] objArr = new Object[1];
        a("炜桪ꪴ鐅⠖ᰫ", (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 5, objArr);
        Map<String, String> mapOf = MapsKt__MapsKt.mapOf(new Pair(((String) objArr[0]).intern(), Build.BRAND), new Pair("model", Build.MODEL), new Pair("app_id", getMediationNetwork().getCurrencyIso4217Code.getMonetizationNetwork.getPackageName()), new Pair("p_ex", new AFa1uSDK().AFAdRevenueData()), new Pair("api", String.valueOf(Build.VERSION.SDK_INT)), new Pair("sdk", this.component4), new Pair("uid", AFb1kSDK.getCurrencyIso4217Code(getMediationNetwork().getMediationNetwork)), new Pair("exc_config", aFh1aSDK.AFAdRevenueData()));
        int i = AFKeystoreWrapper + 111;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return mapOf;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMonetizationNetwork(AFd1xSDK.AFa1vSDK aFa1vSDK) {
        int i = AFKeystoreWrapper + 31;
        copydefault = i % 128;
        if (i % 2 == 0) {
            this.component1 = aFa1vSDK;
            areAllFieldsValid().execute(new AFd1wSDK$$ExternalSyntheticLambda1(this, 0));
        } else {
            this.component1 = aFa1vSDK;
            areAllFieldsValid().execute(new AFd1wSDK$$ExternalSyntheticLambda1(this, 0));
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFd1wSDK aFd1wSDK) {
        int i = copydefault + 13;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            aFd1wSDK.getClass();
            aFd1wSDK.copydefault();
        } else {
            aFd1wSDK.getClass();
            aFd1wSDK.copydefault();
            throw null;
        }
    }

    private static Map<String, Object> getMonetizationNetwork(Map<String, ? extends Object> map, List<AFc1aSDK> list) {
        AFKeystoreWrapper = (copydefault + 121) % 128;
        Map<String, Object> mapOf = MapsKt__MapsKt.mapOf(new Pair("deviceInfo", map), new Pair("excs", AFd1qSDK.getMediationNetwork(list)));
        copydefault = (AFKeystoreWrapper + 15) % 128;
        return mapOf;
    }

    private final boolean getMonetizationNetwork(AFh1aSDK aFh1aSDK) {
        new AFd1pSDK();
        String str = this.component4;
        String str2 = aFh1aSDK.getRevenue;
        str2.getClass();
        boolean currencyIso4217Code = AFd1pSDK.getCurrencyIso4217Code(str, str2);
        int i = copydefault + 97;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            int i2 = 79 / 0;
        }
        return currencyIso4217Code;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMonetizationNetwork() {
        getMediationNetwork(new Object[]{this}, 452613973, -452613973, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMonetizationNetwork(Throwable th, String str) {
        getMediationNetwork(new Object[]{this, th, str}, -1045855402, 1045855405, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void AFAdRevenueData() {
        int i = AFKeystoreWrapper + 97;
        copydefault = i % 128;
        if (i % 2 != 0) {
            areAllFieldsValid().execute(new AFd1lSDK$$ExternalSyntheticLambda0(this, 25));
            int i2 = 82 / 0;
        } else {
            areAllFieldsValid().execute(new AFd1lSDK$$ExternalSyntheticLambda0(this, 25));
        }
        copydefault = (AFKeystoreWrapper + 119) % 128;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFi1zSDK aFi1zSDK;
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        AFKeystoreWrapper = (copydefault + 77) % 128;
        AFi1vSDK aFi1vSDK = aFd1wSDK.getCurrencyIso4217Code().AFAdRevenueData.getCurrencyIso4217Code;
        if (aFi1vSDK == null || (aFi1zSDK = aFi1vSDK.getMonetizationNetwork) == null) {
            return null;
        }
        int i = AFKeystoreWrapper + 109;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return aFi1zSDK.getCurrencyIso4217Code;
        }
        AFh1aSDK aFh1aSDK = aFi1zSDK.getCurrencyIso4217Code;
        throw null;
    }

    public static final /* synthetic */ AFd1zSDK getCurrencyIso4217Code(AFd1wSDK aFd1wSDK) {
        int i = copydefault + 101;
        AFKeystoreWrapper = i % 128;
        int i2 = i % 2;
        AFd1zSDK aFd1zSDK = aFd1wSDK.AFAdRevenueData;
        if (i2 != 0) {
            return aFd1zSDK;
        }
        throw null;
    }

    private final AFf1kSDK getCurrencyIso4217Code() {
        copydefault = (AFKeystoreWrapper + 1) % 128;
        AFf1kSDK aFf1kSDK = (AFf1kSDK) this.getRevenue.getValue();
        int i = AFKeystoreWrapper + 1;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return aFf1kSDK;
        }
        throw null;
    }

    private final void getCurrencyIso4217Code(AFh1aSDK aFh1aSDK) {
        copydefault = (AFKeystoreWrapper + 97) % 128;
        int i = aFh1aSDK.getCurrencyIso4217Code;
        long millis = TimeUnit.DAYS.toMillis(aFh1aSDK.getMediationNetwork) + System.currentTimeMillis();
        AFc1qSDK aFc1qSDK = (AFc1qSDK) getMediationNetwork(new Object[]{this}, 1891172040, -1891172038, System.identityHashCode(this));
        aFc1qSDK.AFAdRevenueData("af_send_exc_to_server_window", millis);
        aFc1qSDK.getMediationNetwork("af_send_exc_min", i);
        int i2 = AFKeystoreWrapper + 17;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        copydefault = (AFKeystoreWrapper + 61) % 128;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        aFd1wSDK.component3().getMonetizationNetwork(bytes, Thread$State$EnumUnboxingLocalUtility.m("Authorization", AFj1dSDK.getMonetizationNetwork(str, str2)), 2000);
        int i = AFKeystoreWrapper + 69;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 36 / 0;
        }
        return null;
    }

    public final AFc1cSDK getRevenue() {
        copydefault = (AFKeystoreWrapper + 93) % 128;
        AFc1cSDK aFc1cSDK = (AFc1cSDK) this.component3.getValue();
        int i = copydefault + 121;
        AFKeystoreWrapper = i % 128;
        if (i % 2 == 0) {
            int i2 = 3 / 0;
        }
        return aFc1cSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFd1wSDK aFd1wSDK) {
        int i = AFKeystoreWrapper + 61;
        copydefault = i % 128;
        if (i % 2 == 0) {
            aFd1wSDK.getClass();
            aFd1wSDK.equals();
            copydefault = (AFKeystoreWrapper + 99) % 128;
        } else {
            aFd1wSDK.getClass();
            aFd1wSDK.equals();
            throw null;
        }
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        int i = copydefault + 25;
        AFKeystoreWrapper = i % 128;
        int i2 = i % 2;
        AFc1qSDK aFc1qSDK = (AFc1qSDK) aFd1wSDK.getMonetizationNetwork.getValue();
        if (i2 == 0) {
            int i3 = 60 / 0;
        }
        AFKeystoreWrapper = (copydefault + 51) % 128;
        return aFc1qSDK;
    }

    private final AFc1oSDK getMediationNetwork() {
        copydefault = (AFKeystoreWrapper + 9) % 128;
        AFc1oSDK aFc1oSDK = (AFc1oSDK) this.getMediationNetwork.getValue();
        copydefault = (AFKeystoreWrapper + 21) % 128;
        return aFc1oSDK;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFd1wSDK aFd1wSDK = (AFd1wSDK) objArr[0];
        Throwable th = (Throwable) objArr[1];
        String str = (String) objArr[2];
        AFKeystoreWrapper = (copydefault + 49) % 128;
        th.getClass();
        str.getClass();
        aFd1wSDK.areAllFieldsValid().execute(new AFd1wSDK$$ExternalSyntheticLambda2(0, aFd1wSDK, th, str));
        int i = copydefault + 41;
        AFKeystoreWrapper = i % 128;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1wSDK aFd1wSDK) {
        AFKeystoreWrapper = (copydefault + 83) % 128;
        aFd1wSDK.getClass();
        aFd1wSDK.copy();
        AFKeystoreWrapper = (copydefault + 45) % 128;
    }

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i2 * (-219)) + (i * EnumC0170g.SDK_ASSET_ICON_SUBMIT_VALUE);
        int i5 = ~((~i) | (~i2));
        int i6 = ~i3;
        int i7 = ((i | i2 | i3) * EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + (((~(i6 | i2)) | i) * (-440)) + ((i5 | (~(i6 | i | i2))) * EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE) + i4;
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? getMonetizationNetwork(objArr) : AFAdRevenueData(objArr) : getMediationNetwork(objArr) : getRevenue(objArr) : getCurrencyIso4217Code(objArr);
    }

    private final void getMediationNetwork(String str, String str2) {
        getMediationNetwork(new Object[]{this, str, str2}, -1856843688, 1856843689, System.identityHashCode(this));
    }
}
