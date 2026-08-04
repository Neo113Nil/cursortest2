package com.appsflyer.internal;

import android.graphics.ImageFormat;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import org.json.JSONObject;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes.dex */
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
    private final f.a component2;
    private final f.a component3;
    private final f.a component4;
    private final f.a getCurrencyIso4217Code;
    private final f.a getMediationNetwork;
    private final f.a getMonetizationNetwork;
    private final f.a getRevenue;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1iSDK$1, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass1 extends m.d implements Function0<AFd1jSDK> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final AFd1jSDK invoke() {
            AFd1nSDK aFd1nSDKValues = AFd1iSDK.getCurrencyIso4217Code(AFd1iSDK.this).values();
            Intrinsics.checkNotNullExpressionValue(aFd1nSDKValues, "");
            return new AFd1jSDK(aFd1nSDKValues);
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1iSDK$2, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass2 extends m.d implements Function0<AFd1rSDK> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final AFd1rSDK invoke() {
            AFd1rSDK revenue = ((AFd1kSDK) AFd1iSDK.getRevenue(new Object[]{AFd1iSDK.this}, 83028355, -83028355, (int) System.currentTimeMillis())).getRevenue();
            Intrinsics.checkNotNullExpressionValue(revenue, "");
            return revenue;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1iSDK$3, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass3 extends m.d implements Function0<AFf1aSDK> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final AFf1aSDK invoke() {
            AFf1aSDK aFf1aSDKComponent2 = ((AFd1kSDK) AFd1iSDK.getRevenue(new Object[]{AFd1iSDK.this}, 83028355, -83028355, (int) System.currentTimeMillis())).component2();
            Intrinsics.checkNotNullExpressionValue(aFf1aSDKComponent2, "");
            return aFf1aSDKComponent2;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1iSDK$4, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass4 extends m.d implements Function0<ExecutorService> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            ExecutorService monetizationNetwork = ((AFd1kSDK) AFd1iSDK.getRevenue(new Object[]{AFd1iSDK.this}, 83028355, -83028355, (int) System.currentTimeMillis())).getMonetizationNetwork();
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            return monetizationNetwork;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1iSDK$5, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass5 extends m.d implements Function0<AFd1qSDK> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final AFd1qSDK invoke() {
            AFd1qSDK mediationNetwork = ((AFd1kSDK) AFd1iSDK.getRevenue(new Object[]{AFd1iSDK.this}, 83028355, -83028355, (int) System.currentTimeMillis())).getMediationNetwork();
            Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
            return mediationNetwork;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1iSDK$8, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass8 extends m.d implements Function0<AFd1cSDK> {
        public AnonymousClass8() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
        public final AFd1cSDK invoke() {
            return new AFd1cSDK(AFd1iSDK.this.getRevenue());
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1iSDK$9, reason: invalid class name */
    @Metadata
    public static final class AnonymousClass9 extends m.d implements Function0<AFg1wSDK> {
        public AnonymousClass9() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final AFg1wSDK invoke() {
            AFg1wSDK aFg1wSDKAFKeystoreWrapper = ((AFd1kSDK) AFd1iSDK.getRevenue(new Object[]{AFd1iSDK.this}, 83028355, -83028355, (int) System.currentTimeMillis())).AFKeystoreWrapper();
            Intrinsics.checkNotNullExpressionValue(aFg1wSDKAFKeystoreWrapper, "");
            return aFg1wSDKAFKeystoreWrapper;
        }
    }

    public AFd1iSDK(AFd1kSDK aFd1kSDK) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        this.AFAdRevenueData = aFd1kSDK;
        this.getMonetizationNetwork = f.b.a(new AnonymousClass3());
        this.getCurrencyIso4217Code = f.b.a(new AnonymousClass5());
        this.getRevenue = f.b.a(new AnonymousClass2());
        this.getMediationNetwork = f.b.a(new AnonymousClass9());
        this.component4 = f.b.a(new AnonymousClass4());
        this.areAllFieldsValid = "6.15.2";
        this.component2 = f.b.a(new AnonymousClass1());
        this.component3 = f.b.a(new AnonymousClass8());
    }

    private final AFd1qSDK AFAdRevenueData() {
        int i2 = copy + 115;
        hashCode = i2 % 128;
        if ((i2 % 2 != 0 ? 'G' : '0') != '0') {
            throw null;
        }
        AFd1qSDK aFd1qSDK = (AFd1qSDK) ((f.g) this.getCurrencyIso4217Code).a();
        int i3 = hashCode + 1;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            return aFd1qSDK;
        }
        throw null;
    }

    private final ExecutorService areAllFieldsValid() {
        int i2 = hashCode + 97;
        copy = i2 % 128;
        int i3 = i2 % 2;
        ExecutorService executorService = (ExecutorService) ((f.g) this.component4).a();
        int i4 = hashCode + 57;
        copy = i4 % 128;
        if ((i4 % 2 == 0 ? '+' : 'G') != '+') {
            return executorService;
        }
        throw null;
    }

    private final AFg1wSDK component1() {
        int i2 = copy + 39;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        AFg1wSDK aFg1wSDK = (AFg1wSDK) ((f.g) this.getMediationNetwork).a();
        int i4 = copy + 47;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return aFg1wSDK;
    }

    private AFd1bSDK component2() {
        int i2 = hashCode + 7;
        copy = i2 % 128;
        if (!(i2 % 2 != 0)) {
            throw null;
        }
        AFd1bSDK aFd1bSDK = (AFd1bSDK) ((f.g) this.component3).a();
        int i3 = copy + 69;
        hashCode = i3 % 128;
        if ((i3 % 2 != 0 ? '@' : (char) 14) != '@') {
            return aFd1bSDK;
        }
        throw null;
    }

    private final AFh1dSDK component3() {
        AFi1vSDK aFi1vSDK = ((AFf1aSDK) getRevenue(new Object[]{this}, -1136684343, 1136684347, System.identityHashCode(this))).getCurrencyIso4217Code.getRevenue;
        if ((aFi1vSDK != null ? '\\' : '?') != '?') {
            int i2 = copy;
            int i3 = i2 + 23;
            hashCode = i3 % 128;
            char c2 = i3 % 2 != 0 ? '/' : 'R';
            AFh1cSDK aFh1cSDK = aFi1vSDK.getRevenue;
            if (c2 != 'R') {
                throw null;
            }
            if ((aFh1cSDK != null ? '-' : '5') != '5') {
                int i4 = i2 + 77;
                hashCode = i4 % 128;
                int i5 = i4 % 2;
                AFh1dSDK aFh1dSDK = aFh1cSDK.getMediationNetwork;
                int i6 = i2 + 75;
                hashCode = i6 % 128;
                int i7 = i6 % 2;
                return aFh1dSDK;
            }
        }
        return null;
    }

    private final AFd1rSDK component4() {
        return (AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this));
    }

    private final synchronized void copy() {
        AFh1dSDK aFh1dSDKComponent3 = component3();
        boolean mediationNetwork = false;
        if (aFh1dSDKComponent3 != null) {
            if (aFh1dSDKComponent3.getMonetizationNetwork == -1) {
                ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
            } else {
                if (((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).getMediationNetwork("af_send_exc_to_server_window", -1L) != -1) {
                    mediationNetwork = true;
                }
                if (!mediationNetwork) {
                    int i2 = copy + 17;
                    hashCode = i2 % 128;
                    if (i2 % 2 != 0) {
                        getRevenue(aFh1dSDKComponent3);
                        throw null;
                    }
                    getRevenue(aFh1dSDKComponent3);
                }
            }
            mediationNetwork = getMediationNetwork(aFh1dSDKComponent3);
        } else {
            int i3 = copy + 85;
            hashCode = i3 % 128;
            int i4 = i3 % 2;
        }
        AFd1eSDK.AFa1vSDK aFa1vSDK = this.component1;
        if ((aFa1vSDK != null ? 'B' : (char) 27) != 27) {
            aFa1vSDK.onConfigurationChanged(mediationNetwork);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0173  */
    /* JADX WARN: Code duplicated, block: B:105:0x0179 A[Catch: all -> 0x023c, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000c, B:9:0x0020, B:12:0x0048, B:14:0x0051, B:23:0x006d, B:25:0x0075, B:27:0x0080, B:29:0x0084, B:31:0x0096, B:33:0x009e, B:35:0x00ab, B:37:0x00b1, B:39:0x00b7, B:41:0x00c3, B:43:0x00c7, B:45:0x00d2, B:54:0x00e4, B:56:0x00ea, B:58:0x00f6, B:60:0x00fa, B:62:0x0109, B:64:0x010f, B:66:0x0112, B:72:0x011b, B:74:0x0121, B:76:0x012e, B:78:0x0134, B:83:0x0142, B:89:0x014f, B:91:0x015a, B:98:0x0168, B:104:0x0178, B:108:0x0181, B:129:0x0222, B:134:0x022b, B:136:0x0231, B:137:0x0235, B:110:0x0192, B:112:0x019d, B:113:0x01ad, B:126:0x0207, B:114:0x01b2, B:117:0x01cb, B:123:0x01d5, B:124:0x01e8, B:128:0x021f, B:125:0x01ed, B:105:0x0179, B:92:0x015f, B:95:0x0164, B:51:0x00dd, B:52:0x00de, B:70:0x0119, B:127:0x020b, B:93:0x0162, B:101:0x0175, B:68:0x0117, B:115:0x01c9, B:47:0x00d8), top: B:155:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0181 A[Catch: all -> 0x023c, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000c, B:9:0x0020, B:12:0x0048, B:14:0x0051, B:23:0x006d, B:25:0x0075, B:27:0x0080, B:29:0x0084, B:31:0x0096, B:33:0x009e, B:35:0x00ab, B:37:0x00b1, B:39:0x00b7, B:41:0x00c3, B:43:0x00c7, B:45:0x00d2, B:54:0x00e4, B:56:0x00ea, B:58:0x00f6, B:60:0x00fa, B:62:0x0109, B:64:0x010f, B:66:0x0112, B:72:0x011b, B:74:0x0121, B:76:0x012e, B:78:0x0134, B:83:0x0142, B:89:0x014f, B:91:0x015a, B:98:0x0168, B:104:0x0178, B:108:0x0181, B:129:0x0222, B:134:0x022b, B:136:0x0231, B:137:0x0235, B:110:0x0192, B:112:0x019d, B:113:0x01ad, B:126:0x0207, B:114:0x01b2, B:117:0x01cb, B:123:0x01d5, B:124:0x01e8, B:128:0x021f, B:125:0x01ed, B:105:0x0179, B:92:0x015f, B:95:0x0164, B:51:0x00dd, B:52:0x00de, B:70:0x0119, B:127:0x020b, B:93:0x0162, B:101:0x0175, B:68:0x0117, B:115:0x01c9, B:47:0x00d8), top: B:155:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0190 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0192 A[Catch: all -> 0x023c, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000c, B:9:0x0020, B:12:0x0048, B:14:0x0051, B:23:0x006d, B:25:0x0075, B:27:0x0080, B:29:0x0084, B:31:0x0096, B:33:0x009e, B:35:0x00ab, B:37:0x00b1, B:39:0x00b7, B:41:0x00c3, B:43:0x00c7, B:45:0x00d2, B:54:0x00e4, B:56:0x00ea, B:58:0x00f6, B:60:0x00fa, B:62:0x0109, B:64:0x010f, B:66:0x0112, B:72:0x011b, B:74:0x0121, B:76:0x012e, B:78:0x0134, B:83:0x0142, B:89:0x014f, B:91:0x015a, B:98:0x0168, B:104:0x0178, B:108:0x0181, B:129:0x0222, B:134:0x022b, B:136:0x0231, B:137:0x0235, B:110:0x0192, B:112:0x019d, B:113:0x01ad, B:126:0x0207, B:114:0x01b2, B:117:0x01cb, B:123:0x01d5, B:124:0x01e8, B:128:0x021f, B:125:0x01ed, B:105:0x0179, B:92:0x015f, B:95:0x0164, B:51:0x00dd, B:52:0x00de, B:70:0x0119, B:127:0x020b, B:93:0x0162, B:101:0x0175, B:68:0x0117, B:115:0x01c9, B:47:0x00d8), top: B:155:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x019d A[Catch: all -> 0x023c, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000c, B:9:0x0020, B:12:0x0048, B:14:0x0051, B:23:0x006d, B:25:0x0075, B:27:0x0080, B:29:0x0084, B:31:0x0096, B:33:0x009e, B:35:0x00ab, B:37:0x00b1, B:39:0x00b7, B:41:0x00c3, B:43:0x00c7, B:45:0x00d2, B:54:0x00e4, B:56:0x00ea, B:58:0x00f6, B:60:0x00fa, B:62:0x0109, B:64:0x010f, B:66:0x0112, B:72:0x011b, B:74:0x0121, B:76:0x012e, B:78:0x0134, B:83:0x0142, B:89:0x014f, B:91:0x015a, B:98:0x0168, B:104:0x0178, B:108:0x0181, B:129:0x0222, B:134:0x022b, B:136:0x0231, B:137:0x0235, B:110:0x0192, B:112:0x019d, B:113:0x01ad, B:126:0x0207, B:114:0x01b2, B:117:0x01cb, B:123:0x01d5, B:124:0x01e8, B:128:0x021f, B:125:0x01ed, B:105:0x0179, B:92:0x015f, B:95:0x0164, B:51:0x00dd, B:52:0x00de, B:70:0x0119, B:127:0x020b, B:93:0x0162, B:101:0x0175, B:68:0x0117, B:115:0x01c9, B:47:0x00d8), top: B:155:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x01b2 A[Catch: all -> 0x023c, TRY_LEAVE, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000c, B:9:0x0020, B:12:0x0048, B:14:0x0051, B:23:0x006d, B:25:0x0075, B:27:0x0080, B:29:0x0084, B:31:0x0096, B:33:0x009e, B:35:0x00ab, B:37:0x00b1, B:39:0x00b7, B:41:0x00c3, B:43:0x00c7, B:45:0x00d2, B:54:0x00e4, B:56:0x00ea, B:58:0x00f6, B:60:0x00fa, B:62:0x0109, B:64:0x010f, B:66:0x0112, B:72:0x011b, B:74:0x0121, B:76:0x012e, B:78:0x0134, B:83:0x0142, B:89:0x014f, B:91:0x015a, B:98:0x0168, B:104:0x0178, B:108:0x0181, B:129:0x0222, B:134:0x022b, B:136:0x0231, B:137:0x0235, B:110:0x0192, B:112:0x019d, B:113:0x01ad, B:126:0x0207, B:114:0x01b2, B:117:0x01cb, B:123:0x01d5, B:124:0x01e8, B:128:0x021f, B:125:0x01ed, B:105:0x0179, B:92:0x015f, B:95:0x0164, B:51:0x00dd, B:52:0x00de, B:70:0x0119, B:127:0x020b, B:93:0x0162, B:101:0x0175, B:68:0x0117, B:115:0x01c9, B:47:0x00d8), top: B:155:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:120:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:123:0x01d5 A[Catch: all -> 0x023c, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000c, B:9:0x0020, B:12:0x0048, B:14:0x0051, B:23:0x006d, B:25:0x0075, B:27:0x0080, B:29:0x0084, B:31:0x0096, B:33:0x009e, B:35:0x00ab, B:37:0x00b1, B:39:0x00b7, B:41:0x00c3, B:43:0x00c7, B:45:0x00d2, B:54:0x00e4, B:56:0x00ea, B:58:0x00f6, B:60:0x00fa, B:62:0x0109, B:64:0x010f, B:66:0x0112, B:72:0x011b, B:74:0x0121, B:76:0x012e, B:78:0x0134, B:83:0x0142, B:89:0x014f, B:91:0x015a, B:98:0x0168, B:104:0x0178, B:108:0x0181, B:129:0x0222, B:134:0x022b, B:136:0x0231, B:137:0x0235, B:110:0x0192, B:112:0x019d, B:113:0x01ad, B:126:0x0207, B:114:0x01b2, B:117:0x01cb, B:123:0x01d5, B:124:0x01e8, B:128:0x021f, B:125:0x01ed, B:105:0x0179, B:92:0x015f, B:95:0x0164, B:51:0x00dd, B:52:0x00de, B:70:0x0119, B:127:0x020b, B:93:0x0162, B:101:0x0175, B:68:0x0117, B:115:0x01c9, B:47:0x00d8), top: B:155:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x01ed A[Catch: all -> 0x023c, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000c, B:9:0x0020, B:12:0x0048, B:14:0x0051, B:23:0x006d, B:25:0x0075, B:27:0x0080, B:29:0x0084, B:31:0x0096, B:33:0x009e, B:35:0x00ab, B:37:0x00b1, B:39:0x00b7, B:41:0x00c3, B:43:0x00c7, B:45:0x00d2, B:54:0x00e4, B:56:0x00ea, B:58:0x00f6, B:60:0x00fa, B:62:0x0109, B:64:0x010f, B:66:0x0112, B:72:0x011b, B:74:0x0121, B:76:0x012e, B:78:0x0134, B:83:0x0142, B:89:0x014f, B:91:0x015a, B:98:0x0168, B:104:0x0178, B:108:0x0181, B:129:0x0222, B:134:0x022b, B:136:0x0231, B:137:0x0235, B:110:0x0192, B:112:0x019d, B:113:0x01ad, B:126:0x0207, B:114:0x01b2, B:117:0x01cb, B:123:0x01d5, B:124:0x01e8, B:128:0x021f, B:125:0x01ed, B:105:0x0179, B:92:0x015f, B:95:0x0164, B:51:0x00dd, B:52:0x00de, B:70:0x0119, B:127:0x020b, B:93:0x0162, B:101:0x0175, B:68:0x0117, B:115:0x01c9, B:47:0x00d8), top: B:155:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0226  */
    /* JADX WARN: Code duplicated, block: B:132:0x0228  */
    /* JADX WARN: Code duplicated, block: B:134:0x022b A[Catch: all -> 0x023c, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000c, B:9:0x0020, B:12:0x0048, B:14:0x0051, B:23:0x006d, B:25:0x0075, B:27:0x0080, B:29:0x0084, B:31:0x0096, B:33:0x009e, B:35:0x00ab, B:37:0x00b1, B:39:0x00b7, B:41:0x00c3, B:43:0x00c7, B:45:0x00d2, B:54:0x00e4, B:56:0x00ea, B:58:0x00f6, B:60:0x00fa, B:62:0x0109, B:64:0x010f, B:66:0x0112, B:72:0x011b, B:74:0x0121, B:76:0x012e, B:78:0x0134, B:83:0x0142, B:89:0x014f, B:91:0x015a, B:98:0x0168, B:104:0x0178, B:108:0x0181, B:129:0x0222, B:134:0x022b, B:136:0x0231, B:137:0x0235, B:110:0x0192, B:112:0x019d, B:113:0x01ad, B:126:0x0207, B:114:0x01b2, B:117:0x01cb, B:123:0x01d5, B:124:0x01e8, B:128:0x021f, B:125:0x01ed, B:105:0x0179, B:92:0x015f, B:95:0x0164, B:51:0x00dd, B:52:0x00de, B:70:0x0119, B:127:0x020b, B:93:0x0162, B:101:0x0175, B:68:0x0117, B:115:0x01c9, B:47:0x00d8), top: B:155:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0231 A[Catch: all -> 0x023c, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000c, B:9:0x0020, B:12:0x0048, B:14:0x0051, B:23:0x006d, B:25:0x0075, B:27:0x0080, B:29:0x0084, B:31:0x0096, B:33:0x009e, B:35:0x00ab, B:37:0x00b1, B:39:0x00b7, B:41:0x00c3, B:43:0x00c7, B:45:0x00d2, B:54:0x00e4, B:56:0x00ea, B:58:0x00f6, B:60:0x00fa, B:62:0x0109, B:64:0x010f, B:66:0x0112, B:72:0x011b, B:74:0x0121, B:76:0x012e, B:78:0x0134, B:83:0x0142, B:89:0x014f, B:91:0x015a, B:98:0x0168, B:104:0x0178, B:108:0x0181, B:129:0x0222, B:134:0x022b, B:136:0x0231, B:137:0x0235, B:110:0x0192, B:112:0x019d, B:113:0x01ad, B:126:0x0207, B:114:0x01b2, B:117:0x01cb, B:123:0x01d5, B:124:0x01e8, B:128:0x021f, B:125:0x01ed, B:105:0x0179, B:92:0x015f, B:95:0x0164, B:51:0x00dd, B:52:0x00de, B:70:0x0119, B:127:0x020b, B:93:0x0162, B:101:0x0175, B:68:0x0117, B:115:0x01c9, B:47:0x00d8), top: B:155:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x023a A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:17:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e4 A[Catch: all -> 0x023c, PHI: r9
      0x00e4: PHI (r9v22 java.lang.Integer) = (r9v21 java.lang.Integer), (r9v24 java.lang.Integer) binds: [B:53:0x00e2, B:48:0x00d9] A[DONT_GENERATE, DONT_INLINE], TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000c, B:9:0x0020, B:12:0x0048, B:14:0x0051, B:23:0x006d, B:25:0x0075, B:27:0x0080, B:29:0x0084, B:31:0x0096, B:33:0x009e, B:35:0x00ab, B:37:0x00b1, B:39:0x00b7, B:41:0x00c3, B:43:0x00c7, B:45:0x00d2, B:54:0x00e4, B:56:0x00ea, B:58:0x00f6, B:60:0x00fa, B:62:0x0109, B:64:0x010f, B:66:0x0112, B:72:0x011b, B:74:0x0121, B:76:0x012e, B:78:0x0134, B:83:0x0142, B:89:0x014f, B:91:0x015a, B:98:0x0168, B:104:0x0178, B:108:0x0181, B:129:0x0222, B:134:0x022b, B:136:0x0231, B:137:0x0235, B:110:0x0192, B:112:0x019d, B:113:0x01ad, B:126:0x0207, B:114:0x01b2, B:117:0x01cb, B:123:0x01d5, B:124:0x01e8, B:128:0x021f, B:125:0x01ed, B:105:0x0179, B:92:0x015f, B:95:0x0164, B:51:0x00dd, B:52:0x00de, B:70:0x0119, B:127:0x020b, B:93:0x0162, B:101:0x0175, B:68:0x0117, B:115:0x01c9, B:47:0x00d8), top: B:155:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x010e  */
    /* JADX WARN: Code duplicated, block: B:71:0x011a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0121 A[Catch: all -> 0x023c, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000c, B:9:0x0020, B:12:0x0048, B:14:0x0051, B:23:0x006d, B:25:0x0075, B:27:0x0080, B:29:0x0084, B:31:0x0096, B:33:0x009e, B:35:0x00ab, B:37:0x00b1, B:39:0x00b7, B:41:0x00c3, B:43:0x00c7, B:45:0x00d2, B:54:0x00e4, B:56:0x00ea, B:58:0x00f6, B:60:0x00fa, B:62:0x0109, B:64:0x010f, B:66:0x0112, B:72:0x011b, B:74:0x0121, B:76:0x012e, B:78:0x0134, B:83:0x0142, B:89:0x014f, B:91:0x015a, B:98:0x0168, B:104:0x0178, B:108:0x0181, B:129:0x0222, B:134:0x022b, B:136:0x0231, B:137:0x0235, B:110:0x0192, B:112:0x019d, B:113:0x01ad, B:126:0x0207, B:114:0x01b2, B:117:0x01cb, B:123:0x01d5, B:124:0x01e8, B:128:0x021f, B:125:0x01ed, B:105:0x0179, B:92:0x015f, B:95:0x0164, B:51:0x00dd, B:52:0x00de, B:70:0x0119, B:127:0x020b, B:93:0x0162, B:101:0x0175, B:68:0x0117, B:115:0x01c9, B:47:0x00d8), top: B:155:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x012e A[Catch: all -> 0x023c, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000c, B:9:0x0020, B:12:0x0048, B:14:0x0051, B:23:0x006d, B:25:0x0075, B:27:0x0080, B:29:0x0084, B:31:0x0096, B:33:0x009e, B:35:0x00ab, B:37:0x00b1, B:39:0x00b7, B:41:0x00c3, B:43:0x00c7, B:45:0x00d2, B:54:0x00e4, B:56:0x00ea, B:58:0x00f6, B:60:0x00fa, B:62:0x0109, B:64:0x010f, B:66:0x0112, B:72:0x011b, B:74:0x0121, B:76:0x012e, B:78:0x0134, B:83:0x0142, B:89:0x014f, B:91:0x015a, B:98:0x0168, B:104:0x0178, B:108:0x0181, B:129:0x0222, B:134:0x022b, B:136:0x0231, B:137:0x0235, B:110:0x0192, B:112:0x019d, B:113:0x01ad, B:126:0x0207, B:114:0x01b2, B:117:0x01cb, B:123:0x01d5, B:124:0x01e8, B:128:0x021f, B:125:0x01ed, B:105:0x0179, B:92:0x015f, B:95:0x0164, B:51:0x00dd, B:52:0x00de, B:70:0x0119, B:127:0x020b, B:93:0x0162, B:101:0x0175, B:68:0x0117, B:115:0x01c9, B:47:0x00d8), top: B:155:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0133  */
    /* JADX WARN: Code duplicated, block: B:80:0x013c  */
    /* JADX WARN: Code duplicated, block: B:81:0x013f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0142 A[Catch: all -> 0x023c, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000c, B:9:0x0020, B:12:0x0048, B:14:0x0051, B:23:0x006d, B:25:0x0075, B:27:0x0080, B:29:0x0084, B:31:0x0096, B:33:0x009e, B:35:0x00ab, B:37:0x00b1, B:39:0x00b7, B:41:0x00c3, B:43:0x00c7, B:45:0x00d2, B:54:0x00e4, B:56:0x00ea, B:58:0x00f6, B:60:0x00fa, B:62:0x0109, B:64:0x010f, B:66:0x0112, B:72:0x011b, B:74:0x0121, B:76:0x012e, B:78:0x0134, B:83:0x0142, B:89:0x014f, B:91:0x015a, B:98:0x0168, B:104:0x0178, B:108:0x0181, B:129:0x0222, B:134:0x022b, B:136:0x0231, B:137:0x0235, B:110:0x0192, B:112:0x019d, B:113:0x01ad, B:126:0x0207, B:114:0x01b2, B:117:0x01cb, B:123:0x01d5, B:124:0x01e8, B:128:0x021f, B:125:0x01ed, B:105:0x0179, B:92:0x015f, B:95:0x0164, B:51:0x00dd, B:52:0x00de, B:70:0x0119, B:127:0x020b, B:93:0x0162, B:101:0x0175, B:68:0x0117, B:115:0x01c9, B:47:0x00d8), top: B:155:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0148  */
    /* JADX WARN: Code duplicated, block: B:86:0x014a  */
    /* JADX WARN: Code duplicated, block: B:88:0x014e  */
    /* JADX WARN: Code duplicated, block: B:89:0x014f A[Catch: all -> 0x023c, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000c, B:9:0x0020, B:12:0x0048, B:14:0x0051, B:23:0x006d, B:25:0x0075, B:27:0x0080, B:29:0x0084, B:31:0x0096, B:33:0x009e, B:35:0x00ab, B:37:0x00b1, B:39:0x00b7, B:41:0x00c3, B:43:0x00c7, B:45:0x00d2, B:54:0x00e4, B:56:0x00ea, B:58:0x00f6, B:60:0x00fa, B:62:0x0109, B:64:0x010f, B:66:0x0112, B:72:0x011b, B:74:0x0121, B:76:0x012e, B:78:0x0134, B:83:0x0142, B:89:0x014f, B:91:0x015a, B:98:0x0168, B:104:0x0178, B:108:0x0181, B:129:0x0222, B:134:0x022b, B:136:0x0231, B:137:0x0235, B:110:0x0192, B:112:0x019d, B:113:0x01ad, B:126:0x0207, B:114:0x01b2, B:117:0x01cb, B:123:0x01d5, B:124:0x01e8, B:128:0x021f, B:125:0x01ed, B:105:0x0179, B:92:0x015f, B:95:0x0164, B:51:0x00dd, B:52:0x00de, B:70:0x0119, B:127:0x020b, B:93:0x0162, B:101:0x0175, B:68:0x0117, B:115:0x01c9, B:47:0x00d8), top: B:155:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x015a A[Catch: all -> 0x023c, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000c, B:9:0x0020, B:12:0x0048, B:14:0x0051, B:23:0x006d, B:25:0x0075, B:27:0x0080, B:29:0x0084, B:31:0x0096, B:33:0x009e, B:35:0x00ab, B:37:0x00b1, B:39:0x00b7, B:41:0x00c3, B:43:0x00c7, B:45:0x00d2, B:54:0x00e4, B:56:0x00ea, B:58:0x00f6, B:60:0x00fa, B:62:0x0109, B:64:0x010f, B:66:0x0112, B:72:0x011b, B:74:0x0121, B:76:0x012e, B:78:0x0134, B:83:0x0142, B:89:0x014f, B:91:0x015a, B:98:0x0168, B:104:0x0178, B:108:0x0181, B:129:0x0222, B:134:0x022b, B:136:0x0231, B:137:0x0235, B:110:0x0192, B:112:0x019d, B:113:0x01ad, B:126:0x0207, B:114:0x01b2, B:117:0x01cb, B:123:0x01d5, B:124:0x01e8, B:128:0x021f, B:125:0x01ed, B:105:0x0179, B:92:0x015f, B:95:0x0164, B:51:0x00dd, B:52:0x00de, B:70:0x0119, B:127:0x020b, B:93:0x0162, B:101:0x0175, B:68:0x0117, B:115:0x01c9, B:47:0x00d8), top: B:155:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x015f A[Catch: all -> 0x023c, TRY_LEAVE, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000c, B:9:0x0020, B:12:0x0048, B:14:0x0051, B:23:0x006d, B:25:0x0075, B:27:0x0080, B:29:0x0084, B:31:0x0096, B:33:0x009e, B:35:0x00ab, B:37:0x00b1, B:39:0x00b7, B:41:0x00c3, B:43:0x00c7, B:45:0x00d2, B:54:0x00e4, B:56:0x00ea, B:58:0x00f6, B:60:0x00fa, B:62:0x0109, B:64:0x010f, B:66:0x0112, B:72:0x011b, B:74:0x0121, B:76:0x012e, B:78:0x0134, B:83:0x0142, B:89:0x014f, B:91:0x015a, B:98:0x0168, B:104:0x0178, B:108:0x0181, B:129:0x0222, B:134:0x022b, B:136:0x0231, B:137:0x0235, B:110:0x0192, B:112:0x019d, B:113:0x01ad, B:126:0x0207, B:114:0x01b2, B:117:0x01cb, B:123:0x01d5, B:124:0x01e8, B:128:0x021f, B:125:0x01ed, B:105:0x0179, B:92:0x015f, B:95:0x0164, B:51:0x00dd, B:52:0x00de, B:70:0x0119, B:127:0x020b, B:93:0x0162, B:101:0x0175, B:68:0x0117, B:115:0x01c9, B:47:0x00d8), top: B:155:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0165  */
    /* JADX WARN: Code duplicated, block: B:98:0x0168 A[Catch: all -> 0x023c, TRY_LEAVE, TryCatch #5 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000c, B:9:0x0020, B:12:0x0048, B:14:0x0051, B:23:0x006d, B:25:0x0075, B:27:0x0080, B:29:0x0084, B:31:0x0096, B:33:0x009e, B:35:0x00ab, B:37:0x00b1, B:39:0x00b7, B:41:0x00c3, B:43:0x00c7, B:45:0x00d2, B:54:0x00e4, B:56:0x00ea, B:58:0x00f6, B:60:0x00fa, B:62:0x0109, B:64:0x010f, B:66:0x0112, B:72:0x011b, B:74:0x0121, B:76:0x012e, B:78:0x0134, B:83:0x0142, B:89:0x014f, B:91:0x015a, B:98:0x0168, B:104:0x0178, B:108:0x0181, B:129:0x0222, B:134:0x022b, B:136:0x0231, B:137:0x0235, B:110:0x0192, B:112:0x019d, B:113:0x01ad, B:126:0x0207, B:114:0x01b2, B:117:0x01cb, B:123:0x01d5, B:124:0x01e8, B:128:0x021f, B:125:0x01ed, B:105:0x0179, B:92:0x015f, B:95:0x0164, B:51:0x00dd, B:52:0x00de, B:70:0x0119, B:127:0x020b, B:93:0x0162, B:101:0x0175, B:68:0x0117, B:115:0x01c9, B:47:0x00d8), top: B:155:0x0001, inners: #0, #1, #2, #3, #4 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:140:0x023a, please report this as an issue */
    private final synchronized void copydefault() {
        boolean z;
        AFd1eSDK.AFa1vSDK aFa1vSDK;
        boolean z2;
        Integer numValueOf;
        AFh1dSDK aFh1dSDKComponent3;
        Pair<Integer, Integer> currencyIso4217Code;
        AFh1dSDK aFh1dSDKComponent4;
        char c2;
        Pair<Integer, Integer> revenue;
        char c3;
        AFd1hSDK revenue2;
        int iIntValue;
        Number number;
        int i2;
        int i3;
        String str;
        char c4;
        int i4;
        String str2;
        int i5;
        int iIntValue2;
        int iIntValue3;
        MatchGroup matchGroupB;
        int iIntValue4;
        String str3;
        String str4;
        Integer intOrNull;
        Integer intOrNull2;
        AFh1dSDK aFh1dSDKComponent5 = component3();
        if ((aFh1dSDKComponent5 != null ? aFh1dSDKComponent5.AFAdRevenueData : -1L) < TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
            AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.EXCEPTION_MANAGER, "TTL is already passed", false, 4, null);
            ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
            getRevenue().AFAdRevenueData();
            return;
        }
        AFh1dSDK aFh1dSDKComponent6 = component3();
        if (aFh1dSDKComponent6 != null) {
            int i6 = copy + 57;
            hashCode = i6 % 128;
            int i7 = i6 % 2;
            if (getCurrencyIso4217Code(aFh1dSDKComponent6)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if ((z ? '&' : 'Y') != 'Y') {
            AFh1dSDK aFh1dSDKComponent7 = component3();
            if (aFh1dSDKComponent7 != null) {
                int i8 = copy + 75;
                hashCode = i8 % 128;
                if (i8 % 2 != 0) {
                    throw null;
                }
                String str5 = aFh1dSDKComponent7.getCurrencyIso4217Code;
                if (str5 != null) {
                    Intrinsics.checkNotNullParameter(str5, "");
                    kotlin.text.f fVarA = new Regex("(\\d+).(\\d+).(\\d+).*").a(str5);
                    if (fVarA != null) {
                        MatchGroup matchGroupB2 = fVarA.f204b.b(1);
                        if (matchGroupB2 != null) {
                            int i9 = hashCode + 53;
                            copy = i9 % 128;
                            int i10 = i9 % 2;
                            String str6 = matchGroupB2.f187a;
                            if (str6 == null || (intOrNull2 = kotlin.text.o.toIntOrNull(str6)) == null) {
                                iIntValue2 = 0;
                            } else {
                                iIntValue2 = intOrNull2.intValue();
                            }
                        } else {
                            iIntValue2 = 0;
                        }
                        int i11 = iIntValue2 * 1000000;
                        MatchGroup matchGroupB3 = fVarA.f204b.b(2);
                        if (matchGroupB3 == null || (str4 = matchGroupB3.f187a) == null) {
                            iIntValue3 = 0;
                            int i12 = (iIntValue3 * 1000) + i11;
                            matchGroupB = fVarA.f204b.b(3);
                            if (matchGroupB != null || (str3 = matchGroupB.f187a) == null) {
                                iIntValue4 = 0;
                            } else {
                                int i13 = copy + 37;
                                hashCode = i13 % 128;
                                int i14 = i13 % 2;
                                Integer intOrNull3 = kotlin.text.o.toIntOrNull(str3);
                                if (intOrNull3 != null) {
                                    iIntValue4 = intOrNull3.intValue();
                                } else {
                                    iIntValue4 = 0;
                                }
                            }
                            i5 = i12 + iIntValue4;
                        } else {
                            int i15 = copy + 113;
                            hashCode = i15 % 128;
                            if (i15 % 2 != 0) {
                                intOrNull = kotlin.text.o.toIntOrNull(str4);
                                int i16 = 54 / 0;
                                if (intOrNull != null) {
                                    iIntValue3 = intOrNull.intValue();
                                } else {
                                    iIntValue3 = 0;
                                }
                            } else {
                                intOrNull = kotlin.text.o.toIntOrNull(str4);
                                if (intOrNull != null) {
                                    iIntValue3 = intOrNull.intValue();
                                } else {
                                    iIntValue3 = 0;
                                }
                            }
                            int i17 = (iIntValue3 * 1000) + i11;
                            matchGroupB = fVarA.f204b.b(3);
                            if (matchGroupB != null) {
                                iIntValue4 = 0;
                            } else {
                                iIntValue4 = 0;
                            }
                            i5 = i17 + iIntValue4;
                        }
                    } else {
                        i5 = -1;
                    }
                    numValueOf = Integer.valueOf(i5);
                } else {
                    numValueOf = null;
                }
                aFh1dSDKComponent3 = component3();
                if (aFh1dSDKComponent3 != null) {
                    int i18 = copy + 31;
                    hashCode = i18 % 128;
                    int i19 = i18 % 2;
                    str2 = aFh1dSDKComponent3.getCurrencyIso4217Code;
                    if (str2 != null) {
                        currencyIso4217Code = AFe1zSDK.getCurrencyIso4217Code(str2);
                    } else {
                        currencyIso4217Code = null;
                    }
                } else {
                    currencyIso4217Code = null;
                }
                aFh1dSDKComponent4 = component3();
                if (aFh1dSDKComponent4 != null) {
                    c2 = '(';
                } else {
                    c2 = 'T';
                }
                if (c2 == 'T') {
                    revenue = null;
                    if (numValueOf == null) {
                        i3 = hashCode + 5;
                        copy = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i20 = 13 / 0;
                        }
                    } else if (numValueOf.intValue() != -1) {
                        if (currencyIso4217Code != null) {
                            i2 = hashCode + 87;
                            copy = i2 % 128;
                            if (i2 % 2 != 0) {
                                getRevenue().getMonetizationNetwork(((Number) currencyIso4217Code.f155a).intValue(), ((Number) currencyIso4217Code.f156b).intValue());
                                throw null;
                            }
                            revenue2 = getRevenue();
                            iIntValue = ((Number) currencyIso4217Code.f155a).intValue();
                            number = (Number) currencyIso4217Code.f156b;
                        } else {
                            if (revenue != null) {
                                c3 = 23;
                            } else {
                                c3 = 7;
                            }
                            if (c3 != 23) {
                                ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                            } else {
                                int i21 = hashCode + 59;
                                copy = i21 % 128;
                                int i22 = i21 % 2;
                                revenue2 = getRevenue();
                                iIntValue = ((Number) revenue.f155a).intValue();
                                number = (Number) revenue.f156b;
                            }
                        }
                        revenue2.getMonetizationNetwork(iIntValue, number.intValue());
                    }
                    if (currencyIso4217Code == null) {
                        getRevenue().getCurrencyIso4217Code(this.areAllFieldsValid);
                    } else {
                        if (currencyIso4217Code != null) {
                            i2 = hashCode + 87;
                            copy = i2 % 128;
                            if (i2 % 2 != 0) {
                                getRevenue().getMonetizationNetwork(((Number) currencyIso4217Code.f155a).intValue(), ((Number) currencyIso4217Code.f156b).intValue());
                                throw null;
                            }
                            revenue2 = getRevenue();
                            iIntValue = ((Number) currencyIso4217Code.f155a).intValue();
                            number = (Number) currencyIso4217Code.f156b;
                        } else {
                            if (revenue != null) {
                                c3 = 23;
                            } else {
                                c3 = 7;
                            }
                            if (c3 != 23) {
                                ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                            } else {
                                int i23 = hashCode + 59;
                                copy = i23 % 128;
                                int i24 = i23 % 2;
                                revenue2 = getRevenue();
                                iIntValue = ((Number) revenue.f155a).intValue();
                                number = (Number) revenue.f156b;
                            }
                        }
                        revenue2.getMonetizationNetwork(iIntValue, number.intValue());
                    }
                } else {
                    str = aFh1dSDKComponent4.getCurrencyIso4217Code;
                    if (str != null) {
                        c4 = 20;
                    } else {
                        c4 = '_';
                    }
                    if (c4 == 20) {
                        revenue = null;
                        if (numValueOf == null) {
                            i3 = hashCode + 5;
                            copy = i3 % 128;
                            if (i3 % 2 == 0) {
                                int i25 = 13 / 0;
                            }
                        } else if (numValueOf.intValue() != -1) {
                            if (currencyIso4217Code != null) {
                                i2 = hashCode + 87;
                                copy = i2 % 128;
                                if (i2 % 2 != 0) {
                                    getRevenue().getMonetizationNetwork(((Number) currencyIso4217Code.f155a).intValue(), ((Number) currencyIso4217Code.f156b).intValue());
                                    throw null;
                                }
                                revenue2 = getRevenue();
                                iIntValue = ((Number) currencyIso4217Code.f155a).intValue();
                                number = (Number) currencyIso4217Code.f156b;
                            } else {
                                if (revenue != null) {
                                    c3 = 23;
                                } else {
                                    c3 = 7;
                                }
                                if (c3 != 23) {
                                    ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                                } else {
                                    int i26 = hashCode + 59;
                                    copy = i26 % 128;
                                    int i27 = i26 % 2;
                                    revenue2 = getRevenue();
                                    iIntValue = ((Number) revenue.f155a).intValue();
                                    number = (Number) revenue.f156b;
                                }
                            }
                            revenue2.getMonetizationNetwork(iIntValue, number.intValue());
                        }
                        if (currencyIso4217Code == null) {
                            getRevenue().getCurrencyIso4217Code(this.areAllFieldsValid);
                        } else {
                            if (currencyIso4217Code != null) {
                                i2 = hashCode + 87;
                                copy = i2 % 128;
                                if (i2 % 2 != 0) {
                                    getRevenue().getMonetizationNetwork(((Number) currencyIso4217Code.f155a).intValue(), ((Number) currencyIso4217Code.f156b).intValue());
                                    throw null;
                                }
                                revenue2 = getRevenue();
                                iIntValue = ((Number) currencyIso4217Code.f155a).intValue();
                                number = (Number) currencyIso4217Code.f156b;
                            } else {
                                if (revenue != null) {
                                    c3 = 23;
                                } else {
                                    c3 = 7;
                                }
                                if (c3 != 23) {
                                    ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                                } else {
                                    int i28 = hashCode + 59;
                                    copy = i28 % 128;
                                    int i29 = i28 % 2;
                                    revenue2 = getRevenue();
                                    iIntValue = ((Number) revenue.f155a).intValue();
                                    number = (Number) revenue.f156b;
                                }
                            }
                            revenue2.getMonetizationNetwork(iIntValue, number.intValue());
                        }
                    } else {
                        i4 = copy + 19;
                        hashCode = i4 % 128;
                        if (i4 % 2 == 0) {
                            AFe1zSDK.getRevenue(str);
                            throw null;
                        }
                        revenue = AFe1zSDK.getRevenue(str);
                        if (numValueOf == null) {
                            i3 = hashCode + 5;
                            copy = i3 % 128;
                            if (i3 % 2 == 0) {
                                int i210 = 13 / 0;
                            }
                        } else if (numValueOf.intValue() != -1) {
                            if (currencyIso4217Code != null) {
                                i2 = hashCode + 87;
                                copy = i2 % 128;
                                if (i2 % 2 != 0) {
                                    getRevenue().getMonetizationNetwork(((Number) currencyIso4217Code.f155a).intValue(), ((Number) currencyIso4217Code.f156b).intValue());
                                    throw null;
                                }
                                revenue2 = getRevenue();
                                iIntValue = ((Number) currencyIso4217Code.f155a).intValue();
                                number = (Number) currencyIso4217Code.f156b;
                            } else {
                                if (revenue != null) {
                                    c3 = 23;
                                } else {
                                    c3 = 7;
                                }
                                if (c3 != 23) {
                                    ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                                } else {
                                    int i211 = hashCode + 59;
                                    copy = i211 % 128;
                                    int i212 = i211 % 2;
                                    revenue2 = getRevenue();
                                    iIntValue = ((Number) revenue.f155a).intValue();
                                    number = (Number) revenue.f156b;
                                }
                            }
                            revenue2.getMonetizationNetwork(iIntValue, number.intValue());
                        }
                        if (currencyIso4217Code == null) {
                            getRevenue().getCurrencyIso4217Code(this.areAllFieldsValid);
                        } else {
                            if (currencyIso4217Code != null) {
                                i2 = hashCode + 87;
                                copy = i2 % 128;
                                if (i2 % 2 != 0) {
                                    getRevenue().getMonetizationNetwork(((Number) currencyIso4217Code.f155a).intValue(), ((Number) currencyIso4217Code.f156b).intValue());
                                    throw null;
                                }
                                revenue2 = getRevenue();
                                iIntValue = ((Number) currencyIso4217Code.f155a).intValue();
                                number = (Number) currencyIso4217Code.f156b;
                            } else {
                                if (revenue != null) {
                                    c3 = 23;
                                } else {
                                    c3 = 7;
                                }
                                if (c3 != 23) {
                                    ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                                } else {
                                    int i213 = hashCode + 59;
                                    copy = i213 % 128;
                                    int i214 = i213 % 2;
                                    revenue2 = getRevenue();
                                    iIntValue = ((Number) revenue.f155a).intValue();
                                    number = (Number) revenue.f156b;
                                }
                            }
                            revenue2.getMonetizationNetwork(iIntValue, number.intValue());
                        }
                    }
                }
                throw th;
            }
            numValueOf = null;
            aFh1dSDKComponent3 = component3();
            if (aFh1dSDKComponent3 != null) {
                int i110 = copy + 31;
                hashCode = i110 % 128;
                int i111 = i110 % 2;
                str2 = aFh1dSDKComponent3.getCurrencyIso4217Code;
                if (str2 != null) {
                    currencyIso4217Code = AFe1zSDK.getCurrencyIso4217Code(str2);
                } else {
                    currencyIso4217Code = null;
                }
            } else {
                currencyIso4217Code = null;
            }
            aFh1dSDKComponent4 = component3();
            if (aFh1dSDKComponent4 != null) {
                c2 = '(';
            } else {
                c2 = 'T';
            }
            if (c2 == 'T') {
                revenue = null;
                if (numValueOf == null) {
                    i3 = hashCode + 5;
                    copy = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i215 = 13 / 0;
                    }
                } else if (numValueOf.intValue() != -1) {
                    if (currencyIso4217Code != null) {
                        i2 = hashCode + 87;
                        copy = i2 % 128;
                        if (i2 % 2 != 0) {
                            getRevenue().getMonetizationNetwork(((Number) currencyIso4217Code.f155a).intValue(), ((Number) currencyIso4217Code.f156b).intValue());
                            throw null;
                        }
                        revenue2 = getRevenue();
                        iIntValue = ((Number) currencyIso4217Code.f155a).intValue();
                        number = (Number) currencyIso4217Code.f156b;
                    } else {
                        if (revenue != null) {
                            c3 = 23;
                        } else {
                            c3 = 7;
                        }
                        if (c3 != 23) {
                            ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                        } else {
                            int i216 = hashCode + 59;
                            copy = i216 % 128;
                            int i217 = i216 % 2;
                            revenue2 = getRevenue();
                            iIntValue = ((Number) revenue.f155a).intValue();
                            number = (Number) revenue.f156b;
                        }
                    }
                    revenue2.getMonetizationNetwork(iIntValue, number.intValue());
                }
                if (currencyIso4217Code == null) {
                    getRevenue().getCurrencyIso4217Code(this.areAllFieldsValid);
                } else {
                    if (currencyIso4217Code != null) {
                        i2 = hashCode + 87;
                        copy = i2 % 128;
                        if (i2 % 2 != 0) {
                            getRevenue().getMonetizationNetwork(((Number) currencyIso4217Code.f155a).intValue(), ((Number) currencyIso4217Code.f156b).intValue());
                            throw null;
                        }
                        revenue2 = getRevenue();
                        iIntValue = ((Number) currencyIso4217Code.f155a).intValue();
                        number = (Number) currencyIso4217Code.f156b;
                    } else {
                        if (revenue != null) {
                            c3 = 23;
                        } else {
                            c3 = 7;
                        }
                        if (c3 != 23) {
                            ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                        } else {
                            int i218 = hashCode + 59;
                            copy = i218 % 128;
                            int i219 = i218 % 2;
                            revenue2 = getRevenue();
                            iIntValue = ((Number) revenue.f155a).intValue();
                            number = (Number) revenue.f156b;
                        }
                    }
                    revenue2.getMonetizationNetwork(iIntValue, number.intValue());
                }
            } else {
                str = aFh1dSDKComponent4.getCurrencyIso4217Code;
                if (str != null) {
                    c4 = 20;
                } else {
                    c4 = '_';
                }
                if (c4 == 20) {
                    i4 = copy + 19;
                    hashCode = i4 % 128;
                    if (i4 % 2 == 0) {
                        AFe1zSDK.getRevenue(str);
                        throw null;
                    }
                    revenue = AFe1zSDK.getRevenue(str);
                    if (numValueOf == null) {
                        i3 = hashCode + 5;
                        copy = i3 % 128;
                        if (i3 % 2 == 0) {
                            int i2110 = 13 / 0;
                        }
                    } else if (numValueOf.intValue() != -1) {
                        if (currencyIso4217Code != null) {
                            i2 = hashCode + 87;
                            copy = i2 % 128;
                            if (i2 % 2 != 0) {
                                getRevenue().getMonetizationNetwork(((Number) currencyIso4217Code.f155a).intValue(), ((Number) currencyIso4217Code.f156b).intValue());
                                throw null;
                            }
                            revenue2 = getRevenue();
                            iIntValue = ((Number) currencyIso4217Code.f155a).intValue();
                            number = (Number) currencyIso4217Code.f156b;
                        } else {
                            if (revenue != null) {
                                c3 = 23;
                            } else {
                                c3 = 7;
                            }
                            if (c3 != 23) {
                                ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                            } else {
                                int i2111 = hashCode + 59;
                                copy = i2111 % 128;
                                int i2112 = i2111 % 2;
                                revenue2 = getRevenue();
                                iIntValue = ((Number) revenue.f155a).intValue();
                                number = (Number) revenue.f156b;
                            }
                        }
                        revenue2.getMonetizationNetwork(iIntValue, number.intValue());
                    }
                    if (currencyIso4217Code == null) {
                        getRevenue().getCurrencyIso4217Code(this.areAllFieldsValid);
                    } else {
                        if (currencyIso4217Code != null) {
                            i2 = hashCode + 87;
                            copy = i2 % 128;
                            if (i2 % 2 != 0) {
                                getRevenue().getMonetizationNetwork(((Number) currencyIso4217Code.f155a).intValue(), ((Number) currencyIso4217Code.f156b).intValue());
                                throw null;
                            }
                            revenue2 = getRevenue();
                            iIntValue = ((Number) currencyIso4217Code.f155a).intValue();
                            number = (Number) currencyIso4217Code.f156b;
                        } else {
                            if (revenue != null) {
                                c3 = 23;
                            } else {
                                c3 = 7;
                            }
                            if (c3 != 23) {
                                ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                            } else {
                                int i2113 = hashCode + 59;
                                copy = i2113 % 128;
                                int i2114 = i2113 % 2;
                                revenue2 = getRevenue();
                                iIntValue = ((Number) revenue.f155a).intValue();
                                number = (Number) revenue.f156b;
                            }
                        }
                        revenue2.getMonetizationNetwork(iIntValue, number.intValue());
                    }
                    throw th;
                }
                revenue = null;
                if (numValueOf == null) {
                    i3 = hashCode + 5;
                    copy = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i2115 = 13 / 0;
                    }
                } else if (numValueOf.intValue() != -1) {
                    if (currencyIso4217Code != null) {
                        i2 = hashCode + 87;
                        copy = i2 % 128;
                        if (i2 % 2 != 0) {
                            getRevenue().getMonetizationNetwork(((Number) currencyIso4217Code.f155a).intValue(), ((Number) currencyIso4217Code.f156b).intValue());
                            throw null;
                        }
                        revenue2 = getRevenue();
                        iIntValue = ((Number) currencyIso4217Code.f155a).intValue();
                        number = (Number) currencyIso4217Code.f156b;
                    } else {
                        if (revenue != null) {
                            c3 = 23;
                        } else {
                            c3 = 7;
                        }
                        if (c3 != 23) {
                            ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                        } else {
                            int i2116 = hashCode + 59;
                            copy = i2116 % 128;
                            int i2117 = i2116 % 2;
                            revenue2 = getRevenue();
                            iIntValue = ((Number) revenue.f155a).intValue();
                            number = (Number) revenue.f156b;
                        }
                    }
                    revenue2.getMonetizationNetwork(iIntValue, number.intValue());
                }
                if (currencyIso4217Code == null) {
                    getRevenue().getCurrencyIso4217Code(this.areAllFieldsValid);
                } else {
                    if (currencyIso4217Code != null) {
                        i2 = hashCode + 87;
                        copy = i2 % 128;
                        if (i2 % 2 != 0) {
                            getRevenue().getMonetizationNetwork(((Number) currencyIso4217Code.f155a).intValue(), ((Number) currencyIso4217Code.f156b).intValue());
                            throw null;
                        }
                        revenue2 = getRevenue();
                        iIntValue = ((Number) currencyIso4217Code.f155a).intValue();
                        number = (Number) currencyIso4217Code.f156b;
                    } else {
                        if (revenue != null) {
                            c3 = 23;
                        } else {
                            c3 = 7;
                        }
                        if (c3 != 23) {
                            ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
                        } else {
                            int i2118 = hashCode + 59;
                            copy = i2118 % 128;
                            int i2119 = i2118 % 2;
                            revenue2 = getRevenue();
                            iIntValue = ((Number) revenue.f155a).intValue();
                            number = (Number) revenue.f156b;
                        }
                    }
                    revenue2.getMonetizationNetwork(iIntValue, number.intValue());
                }
            }
            aFa1vSDK = this.component1;
            if (aFa1vSDK != null) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                AFh1dSDK aFh1dSDKComponent8 = component3();
                aFa1vSDK.onConfigurationChanged(aFh1dSDKComponent8 != null ? getMediationNetwork(aFh1dSDKComponent8) : false);
            }
        }
        ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).AFAdRevenueData("af_send_exc_to_server_window");
        getRevenue().AFAdRevenueData();
        aFa1vSDK = this.component1;
        if (aFa1vSDK != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            AFh1dSDK aFh1dSDKComponent9 = component3();
            aFa1vSDK.onConfigurationChanged(aFh1dSDKComponent9 != null ? getMediationNetwork(aFh1dSDKComponent9) : false);
        }
    }

    private final void equals() {
        AFh1dSDK aFh1dSDKComponent3;
        String str;
        int i2 = copy + 111;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            aFh1dSDKComponent3 = component3();
            int i3 = 77 / 0;
            if (aFh1dSDKComponent3 == null) {
                return;
            }
        } else {
            aFh1dSDKComponent3 = component3();
            if (!(aFh1dSDKComponent3 != null)) {
                return;
            }
        }
        int i4 = copy + 1;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            AFAdRevenueData(aFh1dSDKComponent3);
            throw null;
        }
        if (!(AFAdRevenueData(aFh1dSDKComponent3))) {
            AFh1uSDK.v$default(AFLogger.INSTANCE, AFh1vSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
            return;
        }
        int i5 = hashCode + 15;
        copy = i5 % 128;
        if ((i5 % 2 == 0 ? (char) 5 : 'A') != 'A') {
            AFg1wSDK aFg1wSDKComponent1 = component1();
            str = (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDKComponent1}, -1684451992, 1684451992, System.identityHashCode(aFg1wSDKComponent1));
            int i6 = 0 / 0;
            if (str == null) {
                return;
            }
        } else {
            AFg1wSDK aFg1wSDKComponent2 = component1();
            str = (String) AFg1wSDK.getCurrencyIso4217Code(new Object[]{aFg1wSDKComponent2}, -1684451992, 1684451992, System.identityHashCode(aFg1wSDKComponent2));
            if (str == null) {
                return;
            }
        }
        String string = new JSONObject((Map) getRevenue(new Object[]{getMonetizationNetwork(aFh1dSDKComponent3), getRevenue().getMonetizationNetwork()}, 563165298, -563165297, (int) System.currentTimeMillis())).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        Intrinsics.checkNotNullExpressionValue(str, "");
        getCurrencyIso4217Code(string, str);
    }

    public static final /* synthetic */ AFd1kSDK getCurrencyIso4217Code(AFd1iSDK aFd1iSDK) {
        return (AFd1kSDK) getRevenue(new Object[]{aFd1iSDK}, 83028355, -83028355, (int) System.currentTimeMillis());
    }

    private final AFf1aSDK getMediationNetwork() {
        return (AFf1aSDK) getRevenue(new Object[]{this}, -1136684343, 1136684347, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFd1iSDK aFd1iSDK = (AFd1iSDK) objArr[0];
        int i2 = hashCode + 107;
        copy = i2 % 128;
        char c2 = i2 % 2 == 0 ? (char) 4 : '9';
        AFf1aSDK aFf1aSDK = (AFf1aSDK) ((f.g) aFd1iSDK.getMonetizationNetwork).a();
        if (c2 == 4) {
            int i3 = 73 / 0;
        }
        int i4 = hashCode + 119;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return aFf1aSDK;
    }

    public final AFd1hSDK getRevenue() {
        int i2 = hashCode + 121;
        copy = i2 % 128;
        int i3 = i2 % 2;
        AFd1hSDK aFd1hSDK = (AFd1hSDK) ((f.g) this.component2).a();
        int i4 = hashCode + 37;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return aFd1hSDK;
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFd1iSDK aFd1iSDK = (AFd1iSDK) objArr[0];
        int i2 = hashCode + 81;
        copy = i2 % 128;
        int i3 = i2 % 2;
        aFd1iSDK.areAllFieldsValid().execute(new h(aFd1iSDK, 0));
        int i4 = copy + 5;
        hashCode = i4 % 128;
        if ((i4 % 2 == 0 ? 1 : 0) == 1) {
            return null;
        }
        throw null;
    }

    private static void a(char c2, String str, String str2, String str3, int i2, Object[] objArr) {
        char[] charArray;
        char[] charArray2;
        if (str3 != null) {
            int i3 = $11 + 45;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                charArray = str3.toCharArray();
                int i4 = 4 / 0;
            } else {
                charArray = str3.toCharArray();
            }
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        if ((str2 != null ? (char) 25 : 'H') != 'H') {
            charArray2 = str2.toCharArray();
            int i5 = $11 + 15;
            $10 = i5 % 128;
            int i6 = i5 % 2;
        } else {
            charArray2 = str2;
        }
        char[] cArr2 = charArray2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        AFk1sSDK aFk1sSDK = new AFk1sSDK();
        int length = charArray3.length;
        char[] cArr3 = new char[length];
        int length2 = cArr.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(charArray3, 0, cArr3, 0, length);
        System.arraycopy(cArr, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c2);
        cArr4[2] = (char) (cArr4[2] + ((char) i2));
        int length3 = cArr2.length;
        char[] cArr5 = new char[length3];
        aFk1sSDK.getMediationNetwork = 0;
        while (true) {
            int i7 = aFk1sSDK.getMediationNetwork;
            if (!(i7 < length3)) {
                objArr[0] = new String(cArr5);
                return;
            }
            int i8 = $10 + 119;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = (i7 + 3) % 4;
            int i11 = cArr3[i7 % 4] * 32718;
            char c3 = cArr4[(i7 + 2) % 4];
            char c4 = (char) ((i11 + c3) % 65535);
            aFk1sSDK.getMonetizationNetwork = c4;
            cArr4[i10] = (char) (((cArr3[i10] * 32718) + c3) / 65535);
            cArr3[i10] = c4;
            cArr5[i7] = (char) (((((long) (cArr2[i7] ^ c4)) ^ (copydefault ^ 4316357171685541830L)) ^ ((long) ((int) (((long) toString) ^ 4316357171685541830L)))) ^ ((long) ((char) (((long) equals) ^ 4316357171685541830L))));
            aFk1sSDK.getMediationNetwork = i7 + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFd1iSDK aFd1iSDK) {
        int i2 = copy + 1;
        hashCode = i2 % 128;
        boolean z = i2 % 2 == 0;
        Intrinsics.checkNotNullParameter(aFd1iSDK, "");
        aFd1iSDK.equals();
        if (!z) {
            throw null;
        }
        int i3 = hashCode + 121;
        copy = i3 % 128;
        int i4 = i3 % 2;
    }

    private final Map<String, String> getMonetizationNetwork(AFh1dSDK aFh1dSDK) {
        Object[] objArr = new Object[1];
        a((char) (35385 - TextUtils.indexOf("", "")), "蛾덙㧛\uef8a", "裘ꁾ뾯￤뎲", "\u0000\u0000\u0000\u0000", ImageFormat.getBitsPerPixel(0) - 609003129, objArr);
        Pair pair = new Pair(((String) objArr[0]).intern(), Build.BRAND);
        Pair pair2 = new Pair("model", Build.MODEL);
        Pair pair3 = new Pair("app_id", AFAdRevenueData().getMonetizationNetwork.AFAdRevenueData.getPackageName());
        Pair pair4 = new Pair("p_ex", new AFb1aSDK().getMediationNetwork());
        Pair pair5 = new Pair("api", String.valueOf(Build.VERSION.SDK_INT));
        Pair pair6 = new Pair("sdk", this.areAllFieldsValid);
        AFd1qSDK aFd1qSDKAFAdRevenueData = AFAdRevenueData();
        Map<String, String> mapD = d0.d(pair, pair2, pair3, pair4, pair5, pair6, new Pair("uid", AFb1iSDK.getCurrencyIso4217Code(aFd1qSDKAFAdRevenueData.getMonetizationNetwork, aFd1qSDKAFAdRevenueData.getRevenue)), new Pair("exc_config", aFh1dSDK.getRevenue()));
        int i2 = copy + 85;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        return mapD;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFd1iSDK aFd1iSDK = (AFd1iSDK) objArr[0];
        int i2 = copy + 73;
        hashCode = i2 % 128;
        boolean z = i2 % 2 != 0;
        AFd1kSDK aFd1kSDK = aFd1iSDK.AFAdRevenueData;
        if (z) {
            int i3 = 25 / 0;
        }
        return aFd1kSDK;
    }

    @Override // com.appsflyer.internal.AFd1eSDK
    public final void getCurrencyIso4217Code() {
        int i2 = copy + 15;
        hashCode = i2 % 128;
        int i3 = 2;
        int i4 = 1;
        if (!(i2 % 2 != 0)) {
            areAllFieldsValid().execute(new h(this, i4));
        } else {
            areAllFieldsValid().execute(new h(this, i3));
            int i5 = 44 / 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFd1iSDK aFd1iSDK) {
        int i2 = copy + 23;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(aFd1iSDK, "");
        aFd1iSDK.copydefault();
        int i4 = copy + 119;
        hashCode = i4 % 128;
        if (!(i4 % 2 != 0)) {
            return;
        }
        int i5 = 61 / 0;
    }

    private final boolean getMediationNetwork(AFh1dSDK aFh1dSDK) {
        int i2 = hashCode + 111;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).getMediationNetwork("af_send_exc_to_server_window", -1L);
            long j2 = aFh1dSDK.AFAdRevenueData;
            TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis);
            throw null;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long mediationNetwork = ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).getMediationNetwork("af_send_exc_to_server_window", -1L);
        if (aFh1dSDK.AFAdRevenueData >= TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis2) && mediationNetwork != -1) {
            int i3 = hashCode + 93;
            copy = i3 % 128;
            int i4 = i3 % 2;
            if (mediationNetwork >= jCurrentTimeMillis2) {
                return getCurrencyIso4217Code(aFh1dSDK);
            }
        }
        return false;
    }

    public static Object getRevenue(Object[] objArr, int i2, int i3, int i4) {
        Object objD;
        int i5;
        int i6 = (i3 * 591) + (i2 * (-589));
        int i7 = ~i3;
        int i8 = ~i4;
        int i9 = (~(i7 | i2)) | (~(i7 | i8)) | (~(i8 | i2));
        int i10 = ~i2;
        int i11 = (((~(i10 | i8)) | (~(i3 | i8))) * 590) + (i9 * (-1180)) + (((~(i4 | i10 | i3)) | i9) * 590) + i6;
        if (i11 == 1) {
            Map map = (Map) objArr[0];
            List list = (List) objArr[1];
            int i12 = hashCode + 89;
            copy = i12 % 128;
            int i13 = i12 % 2;
            objD = d0.d(new Pair("deviceInfo", map), new Pair("excs", AFe1xSDK.getMonetizationNetwork(list)));
            i5 = copy + 35;
            hashCode = i5 % 128;
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    return i11 != 4 ? getRevenue(objArr) : getMonetizationNetwork(objArr);
                }
                return AFAdRevenueData(objArr);
            }
            AFd1iSDK aFd1iSDK = (AFd1iSDK) objArr[0];
            int i14 = copy + 85;
            hashCode = i14 % 128;
            int i15 = i14 % 2;
            objD = (AFd1rSDK) ((f.g) aFd1iSDK.getRevenue).a();
            i5 = hashCode + 23;
            copy = i5 % 128;
        }
        int i16 = i5 % 2;
        return objD;
    }

    @Override // com.appsflyer.internal.AFd1eSDK
    public final void getCurrencyIso4217Code(AFd1eSDK.AFa1vSDK aFa1vSDK) {
        int i2 = hashCode + 105;
        copy = i2 % 128;
        char c2 = i2 % 2 == 0 ? '!' : 'Q';
        this.component1 = aFa1vSDK;
        ExecutorService executorServiceAreAllFieldsValid = areAllFieldsValid();
        if (c2 != '!') {
            executorServiceAreAllFieldsValid.execute(new h(this, 3));
        } else {
            executorServiceAreAllFieldsValid.execute(new h(this, 4));
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFd1iSDK aFd1iSDK, Throwable th, String str) {
        Intrinsics.checkNotNullParameter(aFd1iSDK, "");
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFh1dSDK aFh1dSDKComponent3 = aFd1iSDK.component3();
        boolean z = false;
        if ((aFh1dSDKComponent3 != null ? 'F' : '<') != '<') {
            int i2 = hashCode + 67;
            copy = i2 % 128;
            char c2 = i2 % 2 == 0 ? 'L' : (char) 24;
            boolean mediationNetwork = aFd1iSDK.getMediationNetwork(aFh1dSDKComponent3);
            if (c2 == 'L' ? !mediationNetwork : mediationNetwork) {
                int i3 = copy + 71;
                hashCode = i3 % 128;
                int i4 = i3 % 2;
                z = true;
            }
        }
        if (z) {
            aFd1iSDK.getRevenue().getCurrencyIso4217Code(th, str);
        }
    }

    private final void getCurrencyIso4217Code(String str, String str2) {
        int i2 = hashCode + 37;
        copy = i2 % 128;
        int i3 = i2 % 2;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        component2().getMediationNetwork(bytes, c0.b(new Pair("Authorization", AFb1jSDK.getMonetizationNetwork(str, str2))), 2000);
        int i4 = copy + 3;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
    }

    private final boolean AFAdRevenueData(AFh1dSDK aFh1dSDK) {
        int i2 = copy + 103;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long mediationNetwork = ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).getMediationNetwork("af_send_exc_to_server_window", -1L);
        if (aFh1dSDK.AFAdRevenueData < TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis)) {
            int i4 = copy + 85;
            hashCode = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!(mediationNetwork == -1)) {
            int i6 = copy + 21;
            hashCode = i6 % 128;
            if ((i6 % 2 != 0 ? (char) 17 : (char) 2) != 2) {
                throw null;
            }
            if ((mediationNetwork < jCurrentTimeMillis ? '^' : '#') != '^') {
                int mediationNetwork2 = ((AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this))).getMediationNetwork("af_send_exc_min", -1);
                if (mediationNetwork2 != -1) {
                    int i7 = hashCode + 63;
                    copy = i7 % 128;
                    int i8 = i7 % 2;
                    if (getRevenue().getMediationNetwork() >= mediationNetwork2) {
                        return getCurrencyIso4217Code(aFh1dSDK);
                    }
                }
                return false;
            }
        }
        return false;
    }

    private final boolean getCurrencyIso4217Code(AFh1dSDK aFh1dSDK) {
        new AFe1vSDK();
        String str = this.areAllFieldsValid;
        String str2 = aFh1dSDK.getCurrencyIso4217Code;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        boolean monetizationNetwork = AFe1vSDK.getMonetizationNetwork(str, str2);
        int i2 = copy + 65;
        hashCode = i2 % 128;
        if ((i2 % 2 != 0 ? '\f' : '/') == '/') {
            return monetizationNetwork;
        }
        throw null;
    }

    private static Map<String, Object> getRevenue(Map<String, ? extends Object> map, List<AFd1fSDK> list) {
        return (Map) getRevenue(new Object[]{map, list}, 563165298, -563165297, (int) System.currentTimeMillis());
    }

    private final void getRevenue(AFh1dSDK aFh1dSDK) {
        int i2 = hashCode + 115;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int i4 = aFh1dSDK.getMediationNetwork;
        long millis = TimeUnit.DAYS.toMillis(aFh1dSDK.getMonetizationNetwork) + System.currentTimeMillis();
        AFd1rSDK aFd1rSDK = (AFd1rSDK) getRevenue(new Object[]{this}, -1274433155, 1274433157, System.identityHashCode(this));
        aFd1rSDK.getMonetizationNetwork("af_send_exc_to_server_window", millis);
        aFd1rSDK.AFAdRevenueData("af_send_exc_min", i4);
        int i5 = hashCode + 65;
        copy = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.appsflyer.internal.AFd1eSDK
    public final void getRevenue(Throwable th, String str) {
        int i2 = hashCode + 97;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        areAllFieldsValid().execute(new g(this, th, str, 1));
        int i4 = copy + 95;
        hashCode = i4 % 128;
        if ((i4 % 2 != 0 ? (char) 24 : (char) 2) != 24) {
            return;
        }
        int i5 = 78 / 0;
    }

    @Override // com.appsflyer.internal.AFd1eSDK
    public final void getMonetizationNetwork() {
        getRevenue(new Object[]{this}, -1727873549, 1727873552, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFd1iSDK aFd1iSDK) {
        int i2 = hashCode + 87;
        copy = i2 % 128;
        char c2 = i2 % 2 == 0 ? '\f' : (char) 4;
        Intrinsics.checkNotNullParameter(aFd1iSDK, "");
        aFd1iSDK.copy();
        if (c2 == '\f') {
            throw null;
        }
    }
}
