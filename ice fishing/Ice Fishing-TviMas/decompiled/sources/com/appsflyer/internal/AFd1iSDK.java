package com.appsflyer.internal;

import android.graphics.ImageFormat;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1eSDK;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.ServerProtocol;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.time.DurationKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class AFd1iSDK implements AFd1eSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copy = 1;
    private static long copydefault = 4316357171685541830L;
    private static char equals = 11893;
    private static int hashCode = 0;
    private static int toString = -2046375994;
    private AFd1kSDK AFAdRevenueData;
    private final String areAllFieldsValid;
    private AFd1eSDK.AFa1vSDK component1;
    private final Lazy component2;
    private final Lazy component3;
    private final Lazy component4;
    private final Lazy getCurrencyIso4217Code;
    private final Lazy getMediationNetwork;
    private final Lazy getMonetizationNetwork;
    private final Lazy getRevenue;

    public static /* synthetic */ Object getRevenue(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i * (-589)) + (i2 * 591);
        int i5 = ~i2;
        int i6 = ~i3;
        int i7 = (~(i5 | i)) | (~(i5 | i6)) | (~(i6 | i));
        int i8 = ~i;
        int i9 = i4 + (((~(i3 | i8 | i2)) | i7) * 590) + (i7 * (-1180)) + (((~(i8 | i6)) | (~(i2 | i6))) * 590);
        if (i9 == 1) {
            Map map = (Map) objArr[0];
            List list = (List) objArr[1];
            int i10 = 2 % 2;
            int i11 = hashCode + 89;
            copy = i11 % 128;
            int i12 = i11 % 2;
            Map mapOf = MapsKt.mapOf(TuplesKt.to("deviceInfo", map), TuplesKt.to("excs", AFe1xSDK.getMonetizationNetwork(list)));
            int i13 = copy + 35;
            hashCode = i13 % 128;
            int i14 = i13 % 2;
            return mapOf;
        }
        if (i9 != 2) {
            return i9 != 3 ? i9 != 4 ? getRevenue(objArr) : getMonetizationNetwork(objArr) : AFAdRevenueData(objArr);
        }
        AFd1iSDK aFd1iSDK = (AFd1iSDK) objArr[0];
        int i15 = 2 % 2;
        int i16 = copy + 85;
        hashCode = i16 % 128;
        int i17 = i16 % 2;
        AFd1rSDK aFd1rSDK = (AFd1rSDK) aFd1iSDK.getRevenue.getValue();
        int i18 = hashCode + 23;
        copy = i18 % 128;
        int i19 = i18 % 2;
        return aFd1rSDK;
    }

    public AFd1iSDK(AFd1kSDK aFd1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.AFAdRevenueData = aFd1kSDK;
        this.getMonetizationNetwork = LazyKt.lazy(new Function0<AFf1aSDK>() { // from class: com.appsflyer.internal.AFd1iSDK.3
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final AFf1aSDK invoke() {
                AFf1aSDK component2 = ((AFd1kSDK) AFd1iSDK.getRevenue(new Object[]{AFd1iSDK.this}, 83028355, -83028355, (int) System.currentTimeMillis())).component2();
                Intrinsics.checkNotNullExpressionValue(component2, "");
                return component2;
            }

            {
                super(0);
            }
        });
        this.getCurrencyIso4217Code = LazyKt.lazy(new Function0<AFd1qSDK>() { // from class: com.appsflyer.internal.AFd1iSDK.5
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AFd1qSDK invoke() {
                AFd1qSDK mediationNetwork = ((AFd1kSDK) AFd1iSDK.getRevenue(new Object[]{AFd1iSDK.this}, 83028355, -83028355, (int) System.currentTimeMillis())).getMediationNetwork();
                Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
                return mediationNetwork;
            }

            {
                super(0);
            }
        });
        this.getRevenue = LazyKt.lazy(new Function0<AFd1rSDK>() { // from class: com.appsflyer.internal.AFd1iSDK.2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final AFd1rSDK invoke() {
                AFd1rSDK revenue = ((AFd1kSDK) AFd1iSDK.getRevenue(new Object[]{AFd1iSDK.this}, 83028355, -83028355, (int) System.currentTimeMillis())).getRevenue();
                Intrinsics.checkNotNullExpressionValue(revenue, "");
                return revenue;
            }

            {
                super(0);
            }
        });
        this.getMediationNetwork = LazyKt.lazy(new Function0<AFg1wSDK>() { // from class: com.appsflyer.internal.AFd1iSDK.9
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final AFg1wSDK invoke() {
                AFg1wSDK AFKeystoreWrapper = ((AFd1kSDK) AFd1iSDK.getRevenue(new Object[]{AFd1iSDK.this}, 83028355, -83028355, (int) System.currentTimeMillis())).AFKeystoreWrapper();
                Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
                return AFKeystoreWrapper;
            }

            {
                super(0);
            }
        });
        this.component4 = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.appsflyer.internal.AFd1iSDK.4
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
            public final ExecutorService invoke() {
                ExecutorService monetizationNetwork = ((AFd1kSDK) AFd1iSDK.getRevenue(new Object[]{AFd1iSDK.this}, 83028355, -83028355, (int) System.currentTimeMillis())).getMonetizationNetwork();
                Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
                return monetizationNetwork;
            }

            {
                super(0);
            }
        });
        this.areAllFieldsValid = "6.15.2";
        this.component2 = LazyKt.lazy(new Function0<AFd1jSDK>() { // from class: com.appsflyer.internal.AFd1iSDK.1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final AFd1jSDK invoke() {
                AFd1nSDK values = AFd1iSDK.getCurrencyIso4217Code(AFd1iSDK.this).values();
                Intrinsics.checkNotNullExpressionValue(values, "");
                return new AFd1jSDK(values);
            }

            {
                super(0);
            }
        });
        this.component3 = LazyKt.lazy(new Function0<AFd1cSDK>() { // from class: com.appsflyer.internal.AFd1iSDK.8
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
            public final AFd1cSDK invoke() {
                return new AFd1cSDK(AFd1iSDK.this.getRevenue());
            }

            {
                super(0);
            }
        });
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFd1iSDK aFd1iSDK = (AFd1iSDK) objArr[0];
        int i = 2 % 2;
        int i2 = copy + 73;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        AFd1kSDK aFd1kSDK = aFd1iSDK.AFAdRevenueData;
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
        return aFd1kSDK;
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFd1iSDK aFd1iSDK = (AFd1iSDK) objArr[0];
        int i = 2 % 2;
        int i2 = hashCode + 107;
        copy = i2 % 128;
        int i3 = i2 % 2;
        AFf1aSDK aFf1aSDK = (AFf1aSDK) aFd1iSDK.getMonetizationNetwork.getValue();
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
        int i5 = hashCode + 119;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return aFf1aSDK;
    }

    private final AFd1qSDK AFAdRevenueData() {
        int i = 2 % 2;
        int i2 = copy + 115;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        AFd1qSDK aFd1qSDK = (AFd1qSDK) this.getCurrencyIso4217Code.getValue();
        int i3 = hashCode + 1;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            return aFd1qSDK;
        }
        throw null;
    }

    private final AFg1wSDK component1() {
        int i = 2 % 2;
        int i2 = copy + 39;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        AFg1wSDK aFg1wSDK = (AFg1wSDK) this.getMediationNetwork.getValue();
        int i4 = copy + 47;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return aFg1wSDK;
    }

    private final ExecutorService areAllFieldsValid() {
        int i = 2 % 2;
        int i2 = hashCode + 97;
        copy = i2 % 128;
        int i3 = i2 % 2;
        ExecutorService executorService = (ExecutorService) this.component4.getValue();
        int i4 = hashCode + 57;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return executorService;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final AFh1dSDK component3() {
        int i = 2 % 2;
        AFi1vSDK aFi1vSDK = ((AFf1aSDK) getRevenue(new Object[]{this}, -1136684343, 1136684347, System.identityHashCode(this))).getCurrencyIso4217Code.getRevenue;
        if (aFi1vSDK != null) {
            int i2 = copy + 23;
            hashCode = i2 % 128;
            if (i2 % 2 != 0) {
                AFh1cSDK aFh1cSDK = aFi1vSDK.getRevenue;
                throw null;
            }
            AFh1cSDK aFh1cSDK2 = aFi1vSDK.getRevenue;
            if (aFh1cSDK2 != null) {
                int i3 = copy + 77;
                hashCode = i3 % 128;
                int i4 = i3 % 2;
                AFh1dSDK aFh1dSDK = aFh1cSDK2.getMediationNetwork;
                int i5 = copy + 75;
                hashCode = i5 % 128;
                int i6 = i5 % 2;
                return aFh1dSDK;
            }
        }
        return null;
    }

    public final AFd1hSDK getRevenue() {
        int i = 2 % 2;
        int i2 = hashCode + 121;
        copy = i2 % 128;
        int i3 = i2 % 2;
        AFd1hSDK aFd1hSDK = (AFd1hSDK) this.component2.getValue();
        int i4 = hashCode + 37;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return aFd1hSDK;
    }

    private AFd1bSDK component2() {
        int i = 2 % 2;
        int i2 = hashCode + 7;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        AFd1bSDK aFd1bSDK = (AFd1bSDK) this.component3.getValue();
        int i3 = copy + 69;
        hashCode = i3 % 128;
        if (i3 % 2 == 0) {
            return aFd1bSDK;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFd1iSDK aFd1iSDK, Throwable th, String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(aFd1iSDK, "");
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFh1dSDK component3 = aFd1iSDK.component3();
        if (component3 != null) {
            int i2 = hashCode + 67;
            copy = i2 % 128;
            if (i2 % 2 == 0) {
                if (aFd1iSDK.getMediationNetwork(component3)) {
                    return;
                }
            } else if (!aFd1iSDK.getMediationNetwork(component3)) {
                return;
            }
            int i3 = copy + 71;
            hashCode = i3 % 128;
            int i4 = i3 % 2;
            aFd1iSDK.getRevenue().getCurrencyIso4217Code(th, str);
        }
    }

    @Override // com.appsflyer.internal.AFd1eSDK
    public final void getRevenue(final Throwable th, final String str) {
        int i = 2 % 2;
        int i2 = hashCode + 97;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1iSDK$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AFd1iSDK.AFAdRevenueData(AFd1iSDK.this, th, str);
            }
        });
        int i4 = copy + 95;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFd1iSDK aFd1iSDK) {
        int i = 2 % 2;
        int i2 = copy + 23;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aFd1iSDK, "");
        aFd1iSDK.copydefault();
        int i4 = copy + 119;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFd1eSDK
    public final void getCurrencyIso4217Code(AFd1eSDK.AFa1vSDK aFa1vSDK) {
        int i = 2 % 2;
        int i2 = hashCode + 105;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            this.component1 = aFa1vSDK;
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1iSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1iSDK.AFAdRevenueData(AFd1iSDK.this);
                }
            });
        } else {
            this.component1 = aFa1vSDK;
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1iSDK$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1iSDK.AFAdRevenueData(AFd1iSDK.this);
                }
            });
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1iSDK aFd1iSDK) {
        int i = 2 % 2;
        int i2 = copy + 1;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFd1iSDK, "");
            aFd1iSDK.equals();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(aFd1iSDK, "");
        aFd1iSDK.equals();
        int i3 = hashCode + 121;
        copy = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        final AFd1iSDK aFd1iSDK = (AFd1iSDK) objArr[0];
        int i = 2 % 2;
        int i2 = hashCode + 81;
        copy = i2 % 128;
        int i3 = i2 % 2;
        aFd1iSDK.areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1iSDK$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AFd1iSDK.getMediationNetwork(AFd1iSDK.this);
            }
        });
        int i4 = copy + 5;
        hashCode = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFd1iSDK aFd1iSDK) {
        int i = 2 % 2;
        int i2 = hashCode + 87;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFd1iSDK, "");
            aFd1iSDK.copy();
        } else {
            Intrinsics.checkNotNullParameter(aFd1iSDK, "");
            aFd1iSDK.copy();
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1eSDK
    public final void getCurrencyIso4217Code() {
        int i = 2 % 2;
        int i2 = copy + 15;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1iSDK$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1iSDK.getMonetizationNetwork(AFd1iSDK.this);
                }
            });
            int i3 = 44 / 0;
        } else {
            areAllFieldsValid().execute(new Runnable() { // from class: com.appsflyer.internal.AFd1iSDK$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    AFd1iSDK.getMonetizationNetwork(AFd1iSDK.this);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(char c, String str, String str2, String str3, int i, Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        int i2 = 2 % 2;
        if (str3 != null) {
            int i3 = $11 + 45;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                cArr = str3.toCharArray();
                int i4 = 4 / 0;
            } else {
                cArr = str3.toCharArray();
            }
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        if (str2 != 0) {
            cArr2 = str2.toCharArray();
            int i5 = $11 + 15;
            $10 = i5 % 128;
            int i6 = i5 % 2;
        } else {
            cArr2 = str2;
        }
        char[] cArr4 = cArr2;
        char[] charArray = str != null ? str.toCharArray() : str;
        AFk1sSDK aFk1sSDK = new AFk1sSDK();
        int length = charArray.length;
        char[] cArr5 = new char[length];
        int length2 = cArr3.length;
        char[] cArr6 = new char[length2];
        System.arraycopy(charArray, 0, cArr5, 0, length);
        System.arraycopy(cArr3, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr4.length;
        char[] cArr7 = new char[length3];
        aFk1sSDK.getMediationNetwork = 0;
        while (aFk1sSDK.getMediationNetwork < length3) {
            int i7 = $10 + 119;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = (aFk1sSDK.getMediationNetwork + 2) % 4;
            int i10 = (aFk1sSDK.getMediationNetwork + 3) % 4;
            aFk1sSDK.getMonetizationNetwork = (char) (((cArr5[aFk1sSDK.getMediationNetwork % 4] * 32718) + cArr6[i9]) % 65535);
            cArr6[i10] = (char) (((cArr5[i10] * 32718) + cArr6[i9]) / 65535);
            cArr5[i10] = aFk1sSDK.getMonetizationNetwork;
            cArr7[aFk1sSDK.getMediationNetwork] = (char) ((((cArr5[i10] ^ cArr4[aFk1sSDK.getMediationNetwork]) ^ (copydefault ^ 4316357171685541830L)) ^ ((int) (toString ^ 4316357171685541830L))) ^ ((char) (equals ^ 4316357171685541830L)));
            aFk1sSDK.getMediationNetwork++;
        }
        objArr[0] = new String(cArr7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x017f, code lost:
    
        if (r1.intValue() != (-1)) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x00e6, code lost:
    
        if (r9 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00dd, code lost:
    
        if (r9 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e8, code lost:
    
        r9 = r9.intValue();
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x017b A[Catch: all -> 0x024e, TryCatch #5 {, blocks: (B:4:0x0002, B:6:0x000a, B:7:0x000f, B:9:0x0023, B:13:0x004e, B:15:0x0055, B:17:0x0065, B:19:0x006d, B:21:0x0078, B:23:0x007c, B:25:0x0090, B:27:0x009a, B:29:0x00a9, B:31:0x00af, B:32:0x00b7, B:34:0x00c5, B:36:0x00cb, B:38:0x00d6, B:43:0x00e8, B:44:0x00ee, B:46:0x00fc, B:48:0x0102, B:50:0x0111, B:51:0x0119, B:52:0x011c, B:53:0x012c, B:55:0x0132, B:57:0x013f, B:58:0x0145, B:60:0x014b, B:62:0x014f, B:64:0x015a, B:66:0x016a, B:73:0x017a, B:75:0x0183, B:76:0x0239, B:78:0x023d, B:80:0x0243, B:81:0x0247, B:87:0x0194, B:89:0x019f, B:90:0x01bc, B:96:0x01dc, B:98:0x01df, B:99:0x0204, B:100:0x017b, B:102:0x015f, B:107:0x0164, B:108:0x0165, B:110:0x0116, B:113:0x00e1, B:114:0x00e2, B:117:0x00b4, B:119:0x0123, B:125:0x012a, B:127:0x021f, B:41:0x00dc, B:104:0x0162, B:121:0x0125, B:122:0x0128, B:70:0x0177, B:92:0x01d7, B:93:0x01da), top: B:3:0x0002, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00e2 A[Catch: all -> 0x024e, TryCatch #5 {, blocks: (B:4:0x0002, B:6:0x000a, B:7:0x000f, B:9:0x0023, B:13:0x004e, B:15:0x0055, B:17:0x0065, B:19:0x006d, B:21:0x0078, B:23:0x007c, B:25:0x0090, B:27:0x009a, B:29:0x00a9, B:31:0x00af, B:32:0x00b7, B:34:0x00c5, B:36:0x00cb, B:38:0x00d6, B:43:0x00e8, B:44:0x00ee, B:46:0x00fc, B:48:0x0102, B:50:0x0111, B:51:0x0119, B:52:0x011c, B:53:0x012c, B:55:0x0132, B:57:0x013f, B:58:0x0145, B:60:0x014b, B:62:0x014f, B:64:0x015a, B:66:0x016a, B:73:0x017a, B:75:0x0183, B:76:0x0239, B:78:0x023d, B:80:0x0243, B:81:0x0247, B:87:0x0194, B:89:0x019f, B:90:0x01bc, B:96:0x01dc, B:98:0x01df, B:99:0x0204, B:100:0x017b, B:102:0x015f, B:107:0x0164, B:108:0x0165, B:110:0x0116, B:113:0x00e1, B:114:0x00e2, B:117:0x00b4, B:119:0x0123, B:125:0x012a, B:127:0x021f, B:41:0x00dc, B:104:0x0162, B:121:0x0125, B:122:0x0128, B:70:0x0177, B:92:0x01d7, B:93:0x01da), top: B:3:0x0002, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6 A[Catch: all -> 0x024e, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0002, B:6:0x000a, B:7:0x000f, B:9:0x0023, B:13:0x004e, B:15:0x0055, B:17:0x0065, B:19:0x006d, B:21:0x0078, B:23:0x007c, B:25:0x0090, B:27:0x009a, B:29:0x00a9, B:31:0x00af, B:32:0x00b7, B:34:0x00c5, B:36:0x00cb, B:38:0x00d6, B:43:0x00e8, B:44:0x00ee, B:46:0x00fc, B:48:0x0102, B:50:0x0111, B:51:0x0119, B:52:0x011c, B:53:0x012c, B:55:0x0132, B:57:0x013f, B:58:0x0145, B:60:0x014b, B:62:0x014f, B:64:0x015a, B:66:0x016a, B:73:0x017a, B:75:0x0183, B:76:0x0239, B:78:0x023d, B:80:0x0243, B:81:0x0247, B:87:0x0194, B:89:0x019f, B:90:0x01bc, B:96:0x01dc, B:98:0x01df, B:99:0x0204, B:100:0x017b, B:102:0x015f, B:107:0x0164, B:108:0x0165, B:110:0x0116, B:113:0x00e1, B:114:0x00e2, B:117:0x00b4, B:119:0x0123, B:125:0x012a, B:127:0x021f, B:41:0x00dc, B:104:0x0162, B:121:0x0125, B:122:0x0128, B:70:0x0177, B:92:0x01d7, B:93:0x01da), top: B:3:0x0002, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc A[Catch: all -> 0x024e, TryCatch #5 {, blocks: (B:4:0x0002, B:6:0x000a, B:7:0x000f, B:9:0x0023, B:13:0x004e, B:15:0x0055, B:17:0x0065, B:19:0x006d, B:21:0x0078, B:23:0x007c, B:25:0x0090, B:27:0x009a, B:29:0x00a9, B:31:0x00af, B:32:0x00b7, B:34:0x00c5, B:36:0x00cb, B:38:0x00d6, B:43:0x00e8, B:44:0x00ee, B:46:0x00fc, B:48:0x0102, B:50:0x0111, B:51:0x0119, B:52:0x011c, B:53:0x012c, B:55:0x0132, B:57:0x013f, B:58:0x0145, B:60:0x014b, B:62:0x014f, B:64:0x015a, B:66:0x016a, B:73:0x017a, B:75:0x0183, B:76:0x0239, B:78:0x023d, B:80:0x0243, B:81:0x0247, B:87:0x0194, B:89:0x019f, B:90:0x01bc, B:96:0x01dc, B:98:0x01df, B:99:0x0204, B:100:0x017b, B:102:0x015f, B:107:0x0164, B:108:0x0165, B:110:0x0116, B:113:0x00e1, B:114:0x00e2, B:117:0x00b4, B:119:0x0123, B:125:0x012a, B:127:0x021f, B:41:0x00dc, B:104:0x0162, B:121:0x0125, B:122:0x0128, B:70:0x0177, B:92:0x01d7, B:93:0x01da), top: B:3:0x0002, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0111 A[Catch: all -> 0x024e, TryCatch #5 {, blocks: (B:4:0x0002, B:6:0x000a, B:7:0x000f, B:9:0x0023, B:13:0x004e, B:15:0x0055, B:17:0x0065, B:19:0x006d, B:21:0x0078, B:23:0x007c, B:25:0x0090, B:27:0x009a, B:29:0x00a9, B:31:0x00af, B:32:0x00b7, B:34:0x00c5, B:36:0x00cb, B:38:0x00d6, B:43:0x00e8, B:44:0x00ee, B:46:0x00fc, B:48:0x0102, B:50:0x0111, B:51:0x0119, B:52:0x011c, B:53:0x012c, B:55:0x0132, B:57:0x013f, B:58:0x0145, B:60:0x014b, B:62:0x014f, B:64:0x015a, B:66:0x016a, B:73:0x017a, B:75:0x0183, B:76:0x0239, B:78:0x023d, B:80:0x0243, B:81:0x0247, B:87:0x0194, B:89:0x019f, B:90:0x01bc, B:96:0x01dc, B:98:0x01df, B:99:0x0204, B:100:0x017b, B:102:0x015f, B:107:0x0164, B:108:0x0165, B:110:0x0116, B:113:0x00e1, B:114:0x00e2, B:117:0x00b4, B:119:0x0123, B:125:0x012a, B:127:0x021f, B:41:0x00dc, B:104:0x0162, B:121:0x0125, B:122:0x0128, B:70:0x0177, B:92:0x01d7, B:93:0x01da), top: B:3:0x0002, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0132 A[Catch: all -> 0x024e, TryCatch #5 {, blocks: (B:4:0x0002, B:6:0x000a, B:7:0x000f, B:9:0x0023, B:13:0x004e, B:15:0x0055, B:17:0x0065, B:19:0x006d, B:21:0x0078, B:23:0x007c, B:25:0x0090, B:27:0x009a, B:29:0x00a9, B:31:0x00af, B:32:0x00b7, B:34:0x00c5, B:36:0x00cb, B:38:0x00d6, B:43:0x00e8, B:44:0x00ee, B:46:0x00fc, B:48:0x0102, B:50:0x0111, B:51:0x0119, B:52:0x011c, B:53:0x012c, B:55:0x0132, B:57:0x013f, B:58:0x0145, B:60:0x014b, B:62:0x014f, B:64:0x015a, B:66:0x016a, B:73:0x017a, B:75:0x0183, B:76:0x0239, B:78:0x023d, B:80:0x0243, B:81:0x0247, B:87:0x0194, B:89:0x019f, B:90:0x01bc, B:96:0x01dc, B:98:0x01df, B:99:0x0204, B:100:0x017b, B:102:0x015f, B:107:0x0164, B:108:0x0165, B:110:0x0116, B:113:0x00e1, B:114:0x00e2, B:117:0x00b4, B:119:0x0123, B:125:0x012a, B:127:0x021f, B:41:0x00dc, B:104:0x0162, B:121:0x0125, B:122:0x0128, B:70:0x0177, B:92:0x01d7, B:93:0x01da), top: B:3:0x0002, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014b A[Catch: all -> 0x024e, TryCatch #5 {, blocks: (B:4:0x0002, B:6:0x000a, B:7:0x000f, B:9:0x0023, B:13:0x004e, B:15:0x0055, B:17:0x0065, B:19:0x006d, B:21:0x0078, B:23:0x007c, B:25:0x0090, B:27:0x009a, B:29:0x00a9, B:31:0x00af, B:32:0x00b7, B:34:0x00c5, B:36:0x00cb, B:38:0x00d6, B:43:0x00e8, B:44:0x00ee, B:46:0x00fc, B:48:0x0102, B:50:0x0111, B:51:0x0119, B:52:0x011c, B:53:0x012c, B:55:0x0132, B:57:0x013f, B:58:0x0145, B:60:0x014b, B:62:0x014f, B:64:0x015a, B:66:0x016a, B:73:0x017a, B:75:0x0183, B:76:0x0239, B:78:0x023d, B:80:0x0243, B:81:0x0247, B:87:0x0194, B:89:0x019f, B:90:0x01bc, B:96:0x01dc, B:98:0x01df, B:99:0x0204, B:100:0x017b, B:102:0x015f, B:107:0x0164, B:108:0x0165, B:110:0x0116, B:113:0x00e1, B:114:0x00e2, B:117:0x00b4, B:119:0x0123, B:125:0x012a, B:127:0x021f, B:41:0x00dc, B:104:0x0162, B:121:0x0125, B:122:0x0128, B:70:0x0177, B:92:0x01d7, B:93:0x01da), top: B:3:0x0002, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016a A[Catch: all -> 0x024e, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0002, B:6:0x000a, B:7:0x000f, B:9:0x0023, B:13:0x004e, B:15:0x0055, B:17:0x0065, B:19:0x006d, B:21:0x0078, B:23:0x007c, B:25:0x0090, B:27:0x009a, B:29:0x00a9, B:31:0x00af, B:32:0x00b7, B:34:0x00c5, B:36:0x00cb, B:38:0x00d6, B:43:0x00e8, B:44:0x00ee, B:46:0x00fc, B:48:0x0102, B:50:0x0111, B:51:0x0119, B:52:0x011c, B:53:0x012c, B:55:0x0132, B:57:0x013f, B:58:0x0145, B:60:0x014b, B:62:0x014f, B:64:0x015a, B:66:0x016a, B:73:0x017a, B:75:0x0183, B:76:0x0239, B:78:0x023d, B:80:0x0243, B:81:0x0247, B:87:0x0194, B:89:0x019f, B:90:0x01bc, B:96:0x01dc, B:98:0x01df, B:99:0x0204, B:100:0x017b, B:102:0x015f, B:107:0x0164, B:108:0x0165, B:110:0x0116, B:113:0x00e1, B:114:0x00e2, B:117:0x00b4, B:119:0x0123, B:125:0x012a, B:127:0x021f, B:41:0x00dc, B:104:0x0162, B:121:0x0125, B:122:0x0128, B:70:0x0177, B:92:0x01d7, B:93:0x01da), top: B:3:0x0002, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0183 A[Catch: all -> 0x024e, TryCatch #5 {, blocks: (B:4:0x0002, B:6:0x000a, B:7:0x000f, B:9:0x0023, B:13:0x004e, B:15:0x0055, B:17:0x0065, B:19:0x006d, B:21:0x0078, B:23:0x007c, B:25:0x0090, B:27:0x009a, B:29:0x00a9, B:31:0x00af, B:32:0x00b7, B:34:0x00c5, B:36:0x00cb, B:38:0x00d6, B:43:0x00e8, B:44:0x00ee, B:46:0x00fc, B:48:0x0102, B:50:0x0111, B:51:0x0119, B:52:0x011c, B:53:0x012c, B:55:0x0132, B:57:0x013f, B:58:0x0145, B:60:0x014b, B:62:0x014f, B:64:0x015a, B:66:0x016a, B:73:0x017a, B:75:0x0183, B:76:0x0239, B:78:0x023d, B:80:0x0243, B:81:0x0247, B:87:0x0194, B:89:0x019f, B:90:0x01bc, B:96:0x01dc, B:98:0x01df, B:99:0x0204, B:100:0x017b, B:102:0x015f, B:107:0x0164, B:108:0x0165, B:110:0x0116, B:113:0x00e1, B:114:0x00e2, B:117:0x00b4, B:119:0x0123, B:125:0x012a, B:127:0x021f, B:41:0x00dc, B:104:0x0162, B:121:0x0125, B:122:0x0128, B:70:0x0177, B:92:0x01d7, B:93:0x01da), top: B:3:0x0002, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x023d A[Catch: all -> 0x024e, TryCatch #5 {, blocks: (B:4:0x0002, B:6:0x000a, B:7:0x000f, B:9:0x0023, B:13:0x004e, B:15:0x0055, B:17:0x0065, B:19:0x006d, B:21:0x0078, B:23:0x007c, B:25:0x0090, B:27:0x009a, B:29:0x00a9, B:31:0x00af, B:32:0x00b7, B:34:0x00c5, B:36:0x00cb, B:38:0x00d6, B:43:0x00e8, B:44:0x00ee, B:46:0x00fc, B:48:0x0102, B:50:0x0111, B:51:0x0119, B:52:0x011c, B:53:0x012c, B:55:0x0132, B:57:0x013f, B:58:0x0145, B:60:0x014b, B:62:0x014f, B:64:0x015a, B:66:0x016a, B:73:0x017a, B:75:0x0183, B:76:0x0239, B:78:0x023d, B:80:0x0243, B:81:0x0247, B:87:0x0194, B:89:0x019f, B:90:0x01bc, B:96:0x01dc, B:98:0x01df, B:99:0x0204, B:100:0x017b, B:102:0x015f, B:107:0x0164, B:108:0x0165, B:110:0x0116, B:113:0x00e1, B:114:0x00e2, B:117:0x00b4, B:119:0x0123, B:125:0x012a, B:127:0x021f, B:41:0x00dc, B:104:0x0162, B:121:0x0125, B:122:0x0128, B:70:0x0177, B:92:0x01d7, B:93:0x01da), top: B:3:0x0002, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024c A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0194 A[Catch: all -> 0x024e, TryCatch #5 {, blocks: (B:4:0x0002, B:6:0x000a, B:7:0x000f, B:9:0x0023, B:13:0x004e, B:15:0x0055, B:17:0x0065, B:19:0x006d, B:21:0x0078, B:23:0x007c, B:25:0x0090, B:27:0x009a, B:29:0x00a9, B:31:0x00af, B:32:0x00b7, B:34:0x00c5, B:36:0x00cb, B:38:0x00d6, B:43:0x00e8, B:44:0x00ee, B:46:0x00fc, B:48:0x0102, B:50:0x0111, B:51:0x0119, B:52:0x011c, B:53:0x012c, B:55:0x0132, B:57:0x013f, B:58:0x0145, B:60:0x014b, B:62:0x014f, B:64:0x015a, B:66:0x016a, B:73:0x017a, B:75:0x0183, B:76:0x0239, B:78:0x023d, B:80:0x0243, B:81:0x0247, B:87:0x0194, B:89:0x019f, B:90:0x01bc, B:96:0x01dc, B:98:0x01df, B:99:0x0204, B:100:0x017b, B:102:0x015f, B:107:0x0164, B:108:0x0165, B:110:0x0116, B:113:0x00e1, B:114:0x00e2, B:117:0x00b4, B:119:0x0123, B:125:0x012a, B:127:0x021f, B:41:0x00dc, B:104:0x0162, B:121:0x0125, B:122:0x0128, B:70:0x0177, B:92:0x01d7, B:93:0x01da), top: B:3:0x0002, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void copydefault() {
        AFd1eSDK.AFa1vSDK aFa1vSDK;
        Integer num;
        AFh1dSDK component3;
        Pair<Integer, Integer> pair;
        AFh1dSDK component32;
        Pair<Integer, Integer> pair2;
        String str;
        int i;
        int i2;
        MatchGroup matchGroup;
        MatchGroup matchGroup2;
        int i3;
        String value;
        Integer intOrNull;
        String value2;
        int i4;
        Integer intOrNull2;
        Integer intOrNull3;
        int i5 = 2 % 2;
        AFh1dSDK component33 = component3();
        if ((component33 != null ? component33.AFAdRevenueData : -1L) < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
            AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.EXCEPTION_MANAGER, "TTL is already passed", false, 4, null);
            ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
            getRevenue().AFAdRevenueData();
            return;
        }
        AFh1dSDK component34 = component3();
        if (component34 != null) {
            int i6 = copy + 57;
            hashCode = i6 % 128;
            int i7 = i6 % 2;
            if (getCurrencyIso4217Code(component34)) {
                AFh1dSDK component35 = component3();
                Object obj = null;
                if (component35 != null) {
                    int i8 = copy + 75;
                    hashCode = i8 % 128;
                    if (i8 % 2 != 0) {
                        String str2 = component35.getCurrencyIso4217Code;
                        obj.hashCode();
                        throw null;
                    }
                    String str3 = component35.getCurrencyIso4217Code;
                    if (str3 != null) {
                        Intrinsics.checkNotNullParameter(str3, "");
                        MatchResult matchEntire = new Regex("(\\d+).(\\d+).(\\d+).*").matchEntire(str3);
                        if (matchEntire != null) {
                            MatchGroup matchGroup3 = matchEntire.getGroups().get(1);
                            if (matchGroup3 != null) {
                                int i9 = hashCode + 53;
                                copy = i9 % 128;
                                int i10 = i9 % 2;
                                String value3 = matchGroup3.getValue();
                                if (value3 != null && (intOrNull3 = StringsKt.toIntOrNull(value3)) != null) {
                                    i2 = intOrNull3.intValue();
                                    int i11 = i2 * DurationKt.NANOS_IN_MILLIS;
                                    matchGroup = matchEntire.getGroups().get(2);
                                    if (matchGroup != null && (value2 = matchGroup.getValue()) != null) {
                                        i4 = copy + 113;
                                        hashCode = i4 % 128;
                                        if (i4 % 2 == 0) {
                                            intOrNull2 = StringsKt.toIntOrNull(value2);
                                            int i12 = 54 / 0;
                                        } else {
                                            intOrNull2 = StringsKt.toIntOrNull(value2);
                                        }
                                        int i13 = i11 + (r9 * 1000);
                                        matchGroup2 = matchEntire.getGroups().get(3);
                                        if (matchGroup2 != null && (value = matchGroup2.getValue()) != null) {
                                            int i14 = copy + 37;
                                            hashCode = i14 % 128;
                                            int i15 = i14 % 2;
                                            intOrNull = StringsKt.toIntOrNull(value);
                                            if (intOrNull != null) {
                                                i3 = intOrNull.intValue();
                                                i = i13 + i3;
                                            }
                                        }
                                        int i16 = 2 % 2;
                                        i3 = 0;
                                        i = i13 + i3;
                                    }
                                    int i17 = 0;
                                    int i132 = i11 + (i17 * 1000);
                                    matchGroup2 = matchEntire.getGroups().get(3);
                                    if (matchGroup2 != null) {
                                        int i142 = copy + 37;
                                        hashCode = i142 % 128;
                                        int i152 = i142 % 2;
                                        intOrNull = StringsKt.toIntOrNull(value);
                                        if (intOrNull != null) {
                                        }
                                    }
                                    int i162 = 2 % 2;
                                    i3 = 0;
                                    i = i132 + i3;
                                }
                            }
                            int i18 = 2 % 2;
                            i2 = 0;
                            int i112 = i2 * DurationKt.NANOS_IN_MILLIS;
                            matchGroup = matchEntire.getGroups().get(2);
                            if (matchGroup != null) {
                                i4 = copy + 113;
                                hashCode = i4 % 128;
                                if (i4 % 2 == 0) {
                                }
                                int i1322 = i112 + (i17 * 1000);
                                matchGroup2 = matchEntire.getGroups().get(3);
                                if (matchGroup2 != null) {
                                }
                                int i1622 = 2 % 2;
                                i3 = 0;
                                i = i1322 + i3;
                            }
                            int i172 = 0;
                            int i13222 = i112 + (i172 * 1000);
                            matchGroup2 = matchEntire.getGroups().get(3);
                            if (matchGroup2 != null) {
                            }
                            int i16222 = 2 % 2;
                            i3 = 0;
                            i = i13222 + i3;
                        } else {
                            i = -1;
                        }
                        num = Integer.valueOf(i);
                        int i19 = 2 % 2;
                        component3 = component3();
                        if (component3 != null) {
                            int i20 = copy + 31;
                            hashCode = i20 % 128;
                            int i21 = i20 % 2;
                            String str4 = component3.getCurrencyIso4217Code;
                            if (str4 != null) {
                                pair = AFe1zSDK.getCurrencyIso4217Code(str4);
                                component32 = component3();
                                if (component32 != null || (str = component32.getCurrencyIso4217Code) == null) {
                                    int i22 = 2 % 2;
                                    pair2 = null;
                                } else {
                                    int i23 = copy + 19;
                                    hashCode = i23 % 128;
                                    if (i23 % 2 != 0) {
                                        AFe1zSDK.getRevenue(str);
                                        throw null;
                                    }
                                    pair2 = AFe1zSDK.getRevenue(str);
                                }
                                if (num == null) {
                                    int i24 = hashCode + 5;
                                    copy = i24 % 128;
                                    if (i24 % 2 == 0) {
                                        int i25 = 13 / 0;
                                    }
                                }
                                if (pair == null) {
                                    getRevenue().getCurrencyIso4217Code(this.areAllFieldsValid);
                                    aFa1vSDK = this.component1;
                                    if (aFa1vSDK != null) {
                                        AFh1dSDK component36 = component3();
                                        aFa1vSDK.onConfigurationChanged(component36 != null ? getMediationNetwork(component36) : false);
                                        return;
                                    }
                                    return;
                                }
                                if (pair != null) {
                                    int i26 = hashCode + 87;
                                    copy = i26 % 128;
                                    if (i26 % 2 == 0) {
                                        getRevenue().getMonetizationNetwork(pair.getFirst().intValue(), pair.getSecond().intValue());
                                        obj.hashCode();
                                        throw null;
                                    }
                                    getRevenue().getMonetizationNetwork(pair.getFirst().intValue(), pair.getSecond().intValue());
                                } else if (pair2 != null) {
                                    int i27 = hashCode + 59;
                                    copy = i27 % 128;
                                    int i28 = i27 % 2;
                                    getRevenue().getMonetizationNetwork(pair2.getFirst().intValue(), pair2.getSecond().intValue());
                                } else {
                                    ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                                    getRevenue().AFAdRevenueData();
                                }
                                aFa1vSDK = this.component1;
                                if (aFa1vSDK != null) {
                                }
                            }
                        }
                        pair = null;
                        component32 = component3();
                        if (component32 != null) {
                        }
                        int i222 = 2 % 2;
                        pair2 = null;
                        if (num == null) {
                        }
                        if (pair == null) {
                        }
                        if (pair != null) {
                        }
                        aFa1vSDK = this.component1;
                        if (aFa1vSDK != null) {
                        }
                    }
                }
                num = null;
                component3 = component3();
                if (component3 != null) {
                }
                pair = null;
                component32 = component3();
                if (component32 != null) {
                }
                int i2222 = 2 % 2;
                pair2 = null;
                if (num == null) {
                }
                if (pair == null) {
                }
                if (pair != null) {
                }
                aFa1vSDK = this.component1;
                if (aFa1vSDK != null) {
                }
            }
        }
        ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
        getRevenue().AFAdRevenueData();
        aFa1vSDK = this.component1;
        if (aFa1vSDK != null) {
        }
    }

    private final void equals() {
        AFh1dSDK component3;
        String str;
        int i = 2 % 2;
        int i2 = copy + 111;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            component3 = component3();
            int i3 = 77 / 0;
            if (component3 == null) {
                return;
            }
        } else {
            component3 = component3();
            if (component3 == null) {
                return;
            }
        }
        int i4 = copy + 1;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            if (!AFAdRevenueData(component3)) {
                AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
                return;
            }
            int i5 = hashCode + 15;
            copy = i5 % 128;
            if (i5 % 2 == 0) {
                AFg1wSDK component1 = component1();
                str = (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{component1}, -1684451992, 1684451992, System.identityHashCode(component1));
                int i6 = 0 / 0;
                if (str == null) {
                    return;
                }
            } else {
                AFg1wSDK component12 = component1();
                str = (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{component12}, -1684451992, 1684451992, System.identityHashCode(component12));
                if (str == null) {
                    return;
                }
            }
            String jSONObject = new JSONObject((Map) getRevenue(new Object[]{getMonetizationNetwork(component3), getRevenue().getMonetizationNetwork()}, 563165298, -563165297, (int) System.currentTimeMillis())).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "");
            Intrinsics.checkNotNullExpressionValue(str, "");
            getCurrencyIso4217Code(jSONObject, str);
            return;
        }
        AFAdRevenueData(component3);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final synchronized void copy() {
        boolean z;
        int i = 2 % 2;
        AFh1dSDK component3 = component3();
        if (component3 != null) {
            if (component3.getMonetizationNetwork == -1) {
                ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
            } else if (((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).getMediationNetwork("af_send_exc_to_server_window", -1L) == -1) {
                int i2 = copy + 17;
                hashCode = i2 % 128;
                if (i2 % 2 != 0) {
                    getRevenue(component3);
                    throw null;
                }
                getRevenue(component3);
                int i3 = 2 % 2;
            }
            z = getMediationNetwork(component3);
        } else {
            int i4 = copy + 85;
            hashCode = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
            z = false;
        }
        AFd1eSDK.AFa1vSDK aFa1vSDK = this.component1;
        if (aFa1vSDK != null) {
            aFa1vSDK.onConfigurationChanged(z);
        }
    }

    private final void getRevenue(AFh1dSDK aFh1dSDK) {
        int i = 2 % 2;
        int i2 = hashCode + 115;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int i4 = aFh1dSDK.getMediationNetwork;
        long currentTimeMillis = System.currentTimeMillis() + TimeUnit.DAYS.toMillis(aFh1dSDK.getMonetizationNetwork);
        AFd1rSDK aFd1rSDK = (AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this));
        aFd1rSDK.getMonetizationNetwork("af_send_exc_to_server_window", currentTimeMillis);
        aFd1rSDK.AFAdRevenueData("af_send_exc_min", i4);
        int i5 = hashCode + 65;
        copy = i5 % 128;
        int i6 = i5 % 2;
    }

    private final Map<String, String> getMonetizationNetwork(AFh1dSDK aFh1dSDK) {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a((char) (35385 - TextUtils.indexOf("", "")), "蛾덙㧛\uef8a", "裘ꁾ뾯￤뎲", "\u0000\u0000\u0000\u0000", ImageFormat.getBitsPerPixel(0) - 609003129, objArr);
        AFd1qSDK AFAdRevenueData = AFAdRevenueData();
        Map<String, String> mapOf = MapsKt.mapOf(TuplesKt.to(((String) objArr[0]).intern(), Build.BRAND), TuplesKt.to(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL), TuplesKt.to("app_id", AFAdRevenueData().getMonetizationNetwork.AFAdRevenueData.getPackageName()), TuplesKt.to("p_ex", new AFb1aSDK().getMediationNetwork()), TuplesKt.to("api", String.valueOf(Build.VERSION.SDK_INT)), TuplesKt.to(ServerProtocol.DIALOG_PARAM_SDK_VERSION, this.areAllFieldsValid), TuplesKt.to("uid", AFb1iSDK.getCurrencyIso4217Code(AFAdRevenueData.getMonetizationNetwork, AFAdRevenueData.getRevenue)), TuplesKt.to("exc_config", aFh1dSDK.getRevenue()));
        int i2 = copy + 85;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        return mapOf;
    }

    private final void getCurrencyIso4217Code(String str, String str2) {
        int i = 2 % 2;
        int i2 = hashCode + 37;
        copy = i2 % 128;
        int i3 = i2 % 2;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        component2().getMediationNetwork(bytes, MapsKt.mapOf(TuplesKt.to("Authorization", AFb1jSDK.getMonetizationNetwork(str, str2))), 2000);
        int i4 = copy + 3;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
    }

    private final boolean AFAdRevenueData(AFh1dSDK aFh1dSDK) {
        int mediationNetwork;
        int i = 2 % 2;
        int i2 = copy + 103;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        long currentTimeMillis = System.currentTimeMillis();
        long mediationNetwork2 = ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).getMediationNetwork("af_send_exc_to_server_window", -1L);
        if (aFh1dSDK.AFAdRevenueData < TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis)) {
            int i4 = copy + 85;
            hashCode = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (mediationNetwork2 != -1) {
            int i6 = copy + 21;
            hashCode = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
            if (mediationNetwork2 >= currentTimeMillis && (mediationNetwork = ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).getMediationNetwork("af_send_exc_min", -1)) != -1) {
                int i7 = hashCode + 63;
                copy = i7 % 128;
                int i8 = i7 % 2;
                if (getRevenue().getMediationNetwork() >= mediationNetwork) {
                    return getCurrencyIso4217Code(aFh1dSDK);
                }
            }
            return false;
        }
        return false;
    }

    private final boolean getMediationNetwork(AFh1dSDK aFh1dSDK) {
        int i = 2 % 2;
        int i2 = hashCode + 111;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long mediationNetwork = ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).getMediationNetwork("af_send_exc_to_server_window", -1L);
            if (aFh1dSDK.AFAdRevenueData >= TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis) && mediationNetwork != -1) {
                int i3 = hashCode + 93;
                copy = i3 % 128;
                int i4 = i3 % 2;
                if (mediationNetwork >= currentTimeMillis) {
                    return getCurrencyIso4217Code(aFh1dSDK);
                }
            }
            return false;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).getMediationNetwork("af_send_exc_to_server_window", -1L);
        long j = aFh1dSDK.AFAdRevenueData;
        TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean getCurrencyIso4217Code(AFh1dSDK aFh1dSDK) {
        int i = 2 % 2;
        new AFe1vSDK();
        String str = this.areAllFieldsValid;
        String str2 = aFh1dSDK.getCurrencyIso4217Code;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        boolean monetizationNetwork = AFe1vSDK.getMonetizationNetwork(str, str2);
        int i2 = copy + 65;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            return monetizationNetwork;
        }
        throw null;
    }

    public static final /* synthetic */ AFd1kSDK getCurrencyIso4217Code(AFd1iSDK aFd1iSDK) {
        return (AFd1kSDK) getRevenue(new Object[]{aFd1iSDK}, 83028355, -83028355, (int) System.currentTimeMillis());
    }

    private static Map<String, Object> getRevenue(Map<String, ? extends Object> map, List<AFd1fSDK> list) {
        return (Map) getRevenue(new Object[]{map, list}, 563165298, -563165297, (int) System.currentTimeMillis());
    }

    @Override // com.appsflyer.internal.AFd1eSDK
    public final void getMonetizationNetwork() {
        getRevenue(new Object[]{this}, -1727873549, 1727873552, System.identityHashCode(this));
    }

    private final AFd1rSDK component4() {
        return (AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this));
    }

    private final AFf1aSDK getMediationNetwork() {
        return (AFf1aSDK) getRevenue(new Object[]{this}, -1136684343, 1136684347, System.identityHashCode(this));
    }
}
