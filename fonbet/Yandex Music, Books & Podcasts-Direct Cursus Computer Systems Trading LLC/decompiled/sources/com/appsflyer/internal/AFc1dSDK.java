package com.appsflyer.internal;

import android.os.Build;
import android.text.AndroidCharacter;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1bSDK;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.arf;
import defpackage.btf;
import defpackage.dfi;
import defpackage.gtm;
import defpackage.jch;
import defpackage.uah;
import defpackage.uif;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFc1dSDK implements AFc1bSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long copy = -5804734778320964624L;
    private static char copydefault = 46064;
    private static int equals = 347067139;
    private static int hashCode = 0;
    private static int toString = 1;

    @NotNull
    private final arf AFAdRevenueData;

    @NotNull
    private final String areAllFieldsValid;
    private AFc1bSDK.AFa1vSDK component1;

    @NotNull
    private final arf component2;

    @NotNull
    private final arf component3;

    @NotNull
    private final arf component4;

    @NotNull
    private final arf getCurrencyIso4217Code;

    @NotNull
    private final arf getMediationNetwork;

    @NotNull
    private AFc1fSDK getMonetizationNetwork;

    @NotNull
    private final arf getRevenue;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "getRevenue", "()Ljava/util/concurrent/ExecutorService;"}, k = 3, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: com.appsflyer.internal.AFc1dSDK$1, reason: invalid class name */
    public static final class AnonymousClass1 extends uif implements Function0<ExecutorService> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            ExecutorService AFAdRevenueData = AFc1dSDK.getCurrencyIso4217Code(AFc1dSDK.this).AFAdRevenueData();
            AFAdRevenueData.getClass();
            return AFAdRevenueData;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1wSDK;", "getCurrencyIso4217Code", "()Lcom/appsflyer/internal/AFd1wSDK;"}, k = 3, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: com.appsflyer.internal.AFc1dSDK$10, reason: invalid class name */
    public static final class AnonymousClass10 extends uif implements Function0<AFd1wSDK> {
        public AnonymousClass10() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final AFd1wSDK invoke() {
            return new AFd1wSDK(AFc1dSDK.this.AFAdRevenueData());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFd1zSDK;", "AFAdRevenueData", "()Lcom/appsflyer/internal/AFd1zSDK;"}, k = 3, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: com.appsflyer.internal.AFc1dSDK$2, reason: invalid class name */
    public static final class AnonymousClass2 extends uif implements Function0<AFd1zSDK> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
        public final AFd1zSDK invoke() {
            AFc1hSDK AFLogger = AFc1dSDK.getCurrencyIso4217Code(AFc1dSDK.this).AFLogger();
            AFLogger.getClass();
            return new AFd1zSDK(AFLogger);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFf1mSDK;", "getRevenue", "()Lcom/appsflyer/internal/AFf1mSDK;"}, k = 3, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: com.appsflyer.internal.AFc1dSDK$3, reason: invalid class name */
    public static final class AnonymousClass3 extends uif implements Function0<AFf1mSDK> {
        public AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final AFf1mSDK invoke() {
            AFf1mSDK component4 = AFc1dSDK.getCurrencyIso4217Code(AFc1dSDK.this).component4();
            component4.getClass();
            return component4;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFc1sSDK;", "getCurrencyIso4217Code", "()Lcom/appsflyer/internal/AFc1sSDK;"}, k = 3, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: com.appsflyer.internal.AFc1dSDK$4, reason: invalid class name */
    public static final class AnonymousClass4 extends uif implements Function0<AFc1sSDK> {
        public AnonymousClass4() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: getCurrencyIso4217Code, reason: merged with bridge method [inline-methods] */
        public final AFc1sSDK invoke() {
            AFc1sSDK component1 = AFc1dSDK.getCurrencyIso4217Code(AFc1dSDK.this).component1();
            component1.getClass();
            return component1;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFc1kSDK;", "getMediationNetwork", "()Lcom/appsflyer/internal/AFc1kSDK;"}, k = 3, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: com.appsflyer.internal.AFc1dSDK$5, reason: invalid class name */
    public static final class AnonymousClass5 extends uif implements Function0<AFc1kSDK> {
        public AnonymousClass5() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
        public final AFc1kSDK invoke() {
            AFc1kSDK revenue = AFc1dSDK.getCurrencyIso4217Code(AFc1dSDK.this).getRevenue();
            revenue.getClass();
            return revenue;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/appsflyer/internal/AFf1iSDK;", "getRevenue", "()Lcom/appsflyer/internal/AFf1iSDK;"}, k = 3, mv = {1, 8, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: com.appsflyer.internal.AFc1dSDK$8, reason: invalid class name */
    public static final class AnonymousClass8 extends uif implements Function0<AFf1iSDK> {
        public AnonymousClass8() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
        public final AFf1iSDK invoke() {
            AFf1iSDK AFKeystoreWrapper = AFc1dSDK.getCurrencyIso4217Code(AFc1dSDK.this).AFKeystoreWrapper();
            AFKeystoreWrapper.getClass();
            return AFKeystoreWrapper;
        }
    }

    public AFc1dSDK(@NotNull AFc1fSDK aFc1fSDK) {
        aFc1fSDK.getClass();
        this.getMonetizationNetwork = aFc1fSDK;
        this.AFAdRevenueData = btf.b(new AnonymousClass3());
        this.getMediationNetwork = btf.b(new AnonymousClass5());
        this.getRevenue = btf.b(new AnonymousClass4());
        this.getCurrencyIso4217Code = btf.b(new AnonymousClass8());
        this.component2 = btf.b(new AnonymousClass1());
        this.areAllFieldsValid = "6.16.2";
        this.component4 = btf.b(new AnonymousClass2());
        this.component3 = btf.b(new AnonymousClass10());
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        AFc1dSDK aFc1dSDK = (AFc1dSDK) objArr[0];
        int i = hashCode + 33;
        toString = i % 128;
        int i2 = i % 2;
        AFc1kSDK aFc1kSDK = (AFc1kSDK) aFc1dSDK.getMediationNetwork.getValue();
        if (i2 == 0) {
            throw null;
        }
        hashCode = (toString + 47) % 128;
        return aFc1kSDK;
    }

    private static void a(String str, String str2, String str3, int i, char c, Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        if (str3 != null) {
            cArr = str3.toCharArray();
            $10 = ($11 + 15) % 128;
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        if (str2 != null) {
            cArr2 = str2.toCharArray();
            $11 = ($10 + 31) % 128;
        } else {
            cArr2 = str2;
        }
        char[] cArr4 = cArr2;
        char[] cArr5 = str;
        if (str != null) {
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        AFk1oSDK aFk1oSDK = new AFk1oSDK();
        int length = cArr3.length;
        char[] cArr7 = new char[length];
        int length2 = cArr6.length;
        char[] cArr8 = new char[length2];
        System.arraycopy(cArr3, 0, cArr7, 0, length);
        System.arraycopy(cArr6, 0, cArr8, 0, length2);
        cArr7[0] = (char) (cArr7[0] ^ c);
        cArr8[2] = (char) (cArr8[2] + ((char) i));
        int length3 = cArr4.length;
        char[] cArr9 = new char[length3];
        aFk1oSDK.getCurrencyIso4217Code = 0;
        while (true) {
            int i2 = aFk1oSDK.getCurrencyIso4217Code;
            if (i2 >= length3) {
                objArr[0] = new String(cArr9);
                return;
            }
            int i3 = (i2 + 3) % 4;
            int i4 = cArr7[i2 % 4] * 32718;
            char c2 = cArr8[(i2 + 2) % 4];
            char c3 = (char) ((i4 + c2) % 65535);
            aFk1oSDK.getRevenue = c3;
            cArr8[i3] = (char) (((cArr7[i3] * 32718) + c2) / 65535);
            cArr7[i3] = c3;
            cArr9[i2] = (char) ((((cArr4[i2] ^ c3) ^ (copy ^ (-5804734778320964624L))) ^ ((int) (equals ^ (-5804734778320964624L)))) ^ ((char) (copydefault ^ (-5804734778320964624L))));
            aFk1oSDK.getCurrencyIso4217Code = i2 + 1;
        }
    }

    private final AFf1iSDK areAllFieldsValid() {
        int i = toString + 63;
        hashCode = i % 128;
        int i2 = i % 2;
        arf arfVar = this.getCurrencyIso4217Code;
        if (i2 != 0) {
            throw null;
        }
        AFf1iSDK aFf1iSDK = (AFf1iSDK) arfVar.getValue();
        int i3 = toString + 41;
        hashCode = i3 % 128;
        if (i3 % 2 == 0) {
            return aFf1iSDK;
        }
        throw null;
    }

    private final ExecutorService component1() {
        return (ExecutorService) getCurrencyIso4217Code(new Object[]{this}, 1379764002, -1379764000, System.identityHashCode(this));
    }

    @NotNull
    private AFd1vSDK component2() {
        int i = toString + 101;
        hashCode = i % 128;
        int i2 = i % 2;
        arf arfVar = this.component3;
        if (i2 == 0) {
            return (AFd1vSDK) arfVar.getValue();
        }
        AFd1vSDK aFd1vSDK = (AFd1vSDK) arfVar.getValue();
        int i3 = 50 / 0;
        return aFd1vSDK;
    }

    private final AFh1gSDK component3() {
        AFi1zSDK aFi1zSDK = getRevenue().getMonetizationNetwork.getMediationNetwork;
        if (aFi1zSDK == null) {
            return null;
        }
        int i = toString;
        hashCode = (i + 93) % 128;
        AFh1iSDK aFh1iSDK = aFi1zSDK.getRevenue;
        if (aFh1iSDK == null) {
            return null;
        }
        hashCode = (i + 43) % 128;
        return aFh1iSDK.getMediationNetwork;
    }

    private final AFc1sSDK component4() {
        hashCode = (toString + 27) % 128;
        AFc1sSDK aFc1sSDK = (AFc1sSDK) this.getRevenue.getValue();
        int i = toString + 81;
        hashCode = i % 128;
        if (i % 2 == 0) {
            return aFc1sSDK;
        }
        throw null;
    }

    private final synchronized void copy() {
        try {
            AFh1gSDK component3 = component3();
            boolean z = false;
            if (component3 != null) {
                hashCode = (toString + 103) % 128;
                if (component3.getCurrencyIso4217Code == -1) {
                    component4().getMediationNetwork("af_send_exc_to_server_window");
                } else if (component4().getMediationNetwork("af_send_exc_to_server_window", -1L) == -1) {
                    int i = toString + 51;
                    hashCode = i % 128;
                    if (i % 2 != 0) {
                        getMonetizationNetwork(component3);
                        int i2 = 6 / 0;
                    } else {
                        getMonetizationNetwork(component3);
                    }
                }
                z = AFAdRevenueData(component3);
            }
            AFc1bSDK.AFa1vSDK aFa1vSDK = this.component1;
            if (aFa1vSDK != null) {
                aFa1vSDK.onConfigurationChanged(z);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void copydefault() {
        toString = (hashCode + 65) % 128;
        AFh1gSDK component3 = component3();
        if (component3 != null) {
            if (!getCurrencyIso4217Code(component3)) {
                AFg1gSDK.v$default(AFLogger.INSTANCE, AFh1zSDK.EXCEPTION_MANAGER, "skipping", false, 4, null);
                return;
            }
            String revenue = areAllFieldsValid().getRevenue();
            if (revenue != null) {
                String jSONObject = new JSONObject(getMediationNetwork((Map) getCurrencyIso4217Code(new Object[]{this, component3}, -1662256862, 1662256866, System.identityHashCode(this)), AFAdRevenueData().getCurrencyIso4217Code())).toString();
                jSONObject.getClass();
                getRevenue(jSONObject, revenue);
            } else {
                int i = hashCode + 89;
                toString = i % 128;
                if (i % 2 == 0) {
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
    
        if (r6 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
    
        r6 = kotlin.text.StringsKt.toIntOrNull(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        if (r6 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
    
        r6 = r6.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cf, code lost:
    
        if (r0 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
    
        r0 = r0.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0128, code lost:
    
        if (r0.intValue() == (-1)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00d8, code lost:
    
        if (r0 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x009f, code lost:
    
        if (r6 != null) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8 A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #1 {all -> 0x0012, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x0017, B:8:0x0022, B:12:0x0040, B:14:0x0049, B:16:0x0050, B:18:0x0057, B:20:0x005b, B:22:0x0068, B:24:0x0070, B:26:0x0074, B:28:0x007a, B:29:0x0080, B:31:0x008c, B:38:0x00a1, B:40:0x00a7, B:41:0x00ad, B:43:0x00b9, B:45:0x00bd, B:47:0x00c8, B:51:0x00da, B:52:0x00e0, B:53:0x00e3, B:54:0x00f1, B:56:0x00f7, B:58:0x00fb, B:59:0x0109, B:61:0x010f, B:63:0x011b, B:67:0x012c, B:68:0x019f, B:70:0x01a3, B:72:0x01a9, B:73:0x01ad, B:76:0x01b2, B:83:0x013c, B:85:0x015e, B:86:0x017e, B:87:0x0124, B:91:0x00d4, B:95:0x00d3, B:100:0x00e8, B:101:0x018f, B:36:0x009b, B:49:0x00ce, B:80:0x01bf), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012c A[Catch: all -> 0x0012, TryCatch #1 {all -> 0x0012, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x0017, B:8:0x0022, B:12:0x0040, B:14:0x0049, B:16:0x0050, B:18:0x0057, B:20:0x005b, B:22:0x0068, B:24:0x0070, B:26:0x0074, B:28:0x007a, B:29:0x0080, B:31:0x008c, B:38:0x00a1, B:40:0x00a7, B:41:0x00ad, B:43:0x00b9, B:45:0x00bd, B:47:0x00c8, B:51:0x00da, B:52:0x00e0, B:53:0x00e3, B:54:0x00f1, B:56:0x00f7, B:58:0x00fb, B:59:0x0109, B:61:0x010f, B:63:0x011b, B:67:0x012c, B:68:0x019f, B:70:0x01a3, B:72:0x01a9, B:73:0x01ad, B:76:0x01b2, B:83:0x013c, B:85:0x015e, B:86:0x017e, B:87:0x0124, B:91:0x00d4, B:95:0x00d3, B:100:0x00e8, B:101:0x018f, B:36:0x009b, B:49:0x00ce, B:80:0x01bf), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x013c A[Catch: all -> 0x0012, TryCatch #1 {all -> 0x0012, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x0017, B:8:0x0022, B:12:0x0040, B:14:0x0049, B:16:0x0050, B:18:0x0057, B:20:0x005b, B:22:0x0068, B:24:0x0070, B:26:0x0074, B:28:0x007a, B:29:0x0080, B:31:0x008c, B:38:0x00a1, B:40:0x00a7, B:41:0x00ad, B:43:0x00b9, B:45:0x00bd, B:47:0x00c8, B:51:0x00da, B:52:0x00e0, B:53:0x00e3, B:54:0x00f1, B:56:0x00f7, B:58:0x00fb, B:59:0x0109, B:61:0x010f, B:63:0x011b, B:67:0x012c, B:68:0x019f, B:70:0x01a3, B:72:0x01a9, B:73:0x01ad, B:76:0x01b2, B:83:0x013c, B:85:0x015e, B:86:0x017e, B:87:0x0124, B:91:0x00d4, B:95:0x00d3, B:100:0x00e8, B:101:0x018f, B:36:0x009b, B:49:0x00ce, B:80:0x01bf), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0124 A[Catch: all -> 0x0012, TryCatch #1 {all -> 0x0012, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x0017, B:8:0x0022, B:12:0x0040, B:14:0x0049, B:16:0x0050, B:18:0x0057, B:20:0x005b, B:22:0x0068, B:24:0x0070, B:26:0x0074, B:28:0x007a, B:29:0x0080, B:31:0x008c, B:38:0x00a1, B:40:0x00a7, B:41:0x00ad, B:43:0x00b9, B:45:0x00bd, B:47:0x00c8, B:51:0x00da, B:52:0x00e0, B:53:0x00e3, B:54:0x00f1, B:56:0x00f7, B:58:0x00fb, B:59:0x0109, B:61:0x010f, B:63:0x011b, B:67:0x012c, B:68:0x019f, B:70:0x01a3, B:72:0x01a9, B:73:0x01ad, B:76:0x01b2, B:83:0x013c, B:85:0x015e, B:86:0x017e, B:87:0x0124, B:91:0x00d4, B:95:0x00d3, B:100:0x00e8, B:101:0x018f, B:36:0x009b, B:49:0x00ce, B:80:0x01bf), top: B:2:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d4 A[Catch: all -> 0x0012, TryCatch #1 {all -> 0x0012, blocks: (B:3:0x0001, B:5:0x0007, B:6:0x0017, B:8:0x0022, B:12:0x0040, B:14:0x0049, B:16:0x0050, B:18:0x0057, B:20:0x005b, B:22:0x0068, B:24:0x0070, B:26:0x0074, B:28:0x007a, B:29:0x0080, B:31:0x008c, B:38:0x00a1, B:40:0x00a7, B:41:0x00ad, B:43:0x00b9, B:45:0x00bd, B:47:0x00c8, B:51:0x00da, B:52:0x00e0, B:53:0x00e3, B:54:0x00f1, B:56:0x00f7, B:58:0x00fb, B:59:0x0109, B:61:0x010f, B:63:0x011b, B:67:0x012c, B:68:0x019f, B:70:0x01a3, B:72:0x01a9, B:73:0x01ad, B:76:0x01b2, B:83:0x013c, B:85:0x015e, B:86:0x017e, B:87:0x0124, B:91:0x00d4, B:95:0x00d3, B:100:0x00e8, B:101:0x018f, B:36:0x009b, B:49:0x00ce, B:80:0x01bf), top: B:2:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void equals() {
        long j;
        Integer num;
        Pair<Integer, Integer> pair;
        Pair<Integer, Integer> pair2;
        String str;
        String str2;
        int i;
        MatchGroup a;
        String str3;
        int i2;
        Integer intOrNull;
        String str4;
        Integer intOrNull2;
        try {
            AFh1gSDK component3 = component3();
            if (component3 != null) {
                toString = (hashCode + 39) % 128;
                j = component3.getMediationNetwork;
            } else {
                j = -1;
            }
            if (j < System.currentTimeMillis() / 1000) {
                AFg1gSDK.v$default(AFLogger.INSTANCE, AFh1zSDK.EXCEPTION_MANAGER, "TTL is already passed", false, 4, null);
                component4().getMediationNetwork("af_send_exc_to_server_window");
                AFAdRevenueData().getMonetizationNetwork();
                return;
            }
            AFh1gSDK component32 = component3();
            if (component32 == null || !getMediationNetwork(component32)) {
                component4().getMediationNetwork("af_send_exc_to_server_window");
                AFAdRevenueData().getMonetizationNetwork();
            } else {
                AFh1gSDK component33 = component3();
                if (component33 == null || (str2 = component33.getRevenue) == null) {
                    hashCode = (toString + 19) % 128;
                    num = null;
                } else {
                    jch d = new Regex("(\\d+).(\\d+).(\\d+).*").d(str2);
                    if (d != null) {
                        MatchGroup a2 = d.c.a(1);
                        int intValue = ((a2 == null || (str4 = a2.a) == null || (intOrNull2 = StringsKt.toIntOrNull(str4)) == null) ? 0 : intOrNull2.intValue()) * 1000000;
                        MatchGroup a3 = d.c.a(2);
                        if (a3 != null) {
                            int i3 = toString + 109;
                            hashCode = i3 % 128;
                            int i4 = i3 % 2;
                            String str5 = a3.a;
                            if (i4 != 0) {
                                int i5 = 65 / 0;
                            }
                            int i6 = (r6 * 1000) + intValue;
                            a = d.c.a(3);
                            if (a != null && (str3 = a.a) != null) {
                                i2 = hashCode + 61;
                                toString = i2 % 128;
                                if (i2 % 2 != 0) {
                                    intOrNull = StringsKt.toIntOrNull(str3);
                                    int i7 = 64 / 0;
                                } else {
                                    intOrNull = StringsKt.toIntOrNull(str3);
                                }
                                i = i6 + r0;
                            }
                            int i8 = 0;
                            i = i6 + i8;
                        }
                        int i9 = 0;
                        int i62 = (i9 * 1000) + intValue;
                        a = d.c.a(3);
                        if (a != null) {
                            i2 = hashCode + 61;
                            toString = i2 % 128;
                            if (i2 % 2 != 0) {
                            }
                            i = i62 + i8;
                        }
                        int i82 = 0;
                        i = i62 + i82;
                    } else {
                        i = -1;
                    }
                    num = Integer.valueOf(i);
                }
                AFh1gSDK component34 = component3();
                if (component34 == null || (str = component34.getRevenue) == null) {
                    pair = null;
                } else {
                    hashCode = (toString + 5) % 128;
                    pair = AFd1pSDK.getRevenue(str);
                }
                AFh1gSDK component35 = component3();
                if (component35 != null) {
                    toString = (hashCode + 35) % 128;
                    String str6 = component35.getRevenue;
                    if (str6 != null) {
                        pair2 = AFd1pSDK.getCurrencyIso4217Code(str6);
                        if (num != null) {
                        }
                        if (pair == null) {
                            AFAdRevenueData().getRevenue(this.areAllFieldsValid);
                        }
                        if (pair == null) {
                            AFAdRevenueData().getMediationNetwork(((Number) pair.a).intValue(), ((Number) pair.b).intValue());
                            hashCode = (toString + 119) % 128;
                        } else if (pair2 != null) {
                            toString = (hashCode + 81) % 128;
                            AFAdRevenueData().getMediationNetwork(((Number) pair2.a).intValue(), ((Number) pair2.b).intValue());
                        } else {
                            component4().getMediationNetwork("af_send_exc_to_server_window");
                            AFAdRevenueData().getMonetizationNetwork();
                        }
                    }
                }
                pair2 = null;
                if (num != null) {
                }
                if (pair == null) {
                }
                if (pair == null) {
                }
            }
            AFc1bSDK.AFa1vSDK aFa1vSDK = this.component1;
            if (aFa1vSDK != null) {
                AFh1gSDK component36 = component3();
                aFa1vSDK.onConfigurationChanged(component36 != null ? AFAdRevenueData(component36) : false);
            } else {
                int i10 = hashCode + 43;
                toString = i10 % 128;
                if (i10 % 2 != 0) {
                } else {
                    throw null;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static Object getCurrencyIso4217Code(Object[] objArr) {
        AFc1dSDK aFc1dSDK = (AFc1dSDK) objArr[0];
        AFh1gSDK aFh1gSDK = (AFh1gSDK) objArr[1];
        Object[] objArr2 = new Object[1];
        a("\u0000\u0000\u0000\u0000", "\ua4cc\ude37㘛툓䁡", "ꊀ喂ʙ輌", (ViewConfiguration.getWindowTouchSlop() >> 8) - 1722449246, (char) (AndroidCharacter.getMirror('0') + 3026), objArr2);
        Map e = uah.e(new Pair(((String) objArr2[0]).intern(), Build.BRAND), new Pair(CommonUrlParts.MODEL, Build.MODEL), new Pair(CommonUrlParts.APP_ID, ((AFc1kSDK) getCurrencyIso4217Code(new Object[]{aFc1dSDK}, 652478680, -652478680, System.identityHashCode(aFc1dSDK))).AFAdRevenueData.getMonetizationNetwork.getPackageName()), new Pair("p_ex", new AFa1ySDK().getMediationNetwork()), new Pair("api", String.valueOf(Build.VERSION.SDK_INT)), new Pair("sdk", aFc1dSDK.areAllFieldsValid), new Pair("uid", AFb1kSDK.getMonetizationNetwork(((AFc1kSDK) getCurrencyIso4217Code(new Object[]{aFc1dSDK}, 652478680, -652478680, System.identityHashCode(aFc1dSDK))).getRevenue)), new Pair("exc_config", aFh1gSDK.getMediationNetwork()));
        int i = hashCode + 53;
        toString = i % 128;
        if (i % 2 != 0) {
            return e;
        }
        throw null;
    }

    private static Map<String, Object> getMediationNetwork(Map<String, ? extends Object> map, List<AFc1cSDK> list) {
        Map<String, Object> e;
        int i = hashCode + 91;
        toString = i % 128;
        if (i % 2 == 0) {
            Pair[] pairArr = new Pair[5];
            pairArr[1] = new Pair("deviceInfo", map);
            pairArr[0] = new Pair("excs", AFd1xSDK.AFAdRevenueData(list));
            e = uah.e(pairArr);
        } else {
            e = uah.e(new Pair("deviceInfo", map), new Pair("excs", AFd1xSDK.AFAdRevenueData(list)));
        }
        toString = (hashCode + 35) % 128;
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFc1dSDK aFc1dSDK, Throwable th, String str) {
        aFc1dSDK.getClass();
        th.getClass();
        str.getClass();
        AFh1gSDK component3 = aFc1dSDK.component3();
        if (component3 != null) {
            int i = hashCode + 53;
            toString = i % 128;
            if (i % 2 != 0 ? !aFc1dSDK.AFAdRevenueData(component3) : !aFc1dSDK.AFAdRevenueData(component3)) {
                hashCode = (toString + 81) % 128;
            } else {
                aFc1dSDK.AFAdRevenueData().getCurrencyIso4217Code(th, str);
                hashCode = (toString + 55) % 128;
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final void getRevenue(@NotNull Throwable th, @NotNull String str) {
        int i = hashCode + 55;
        toString = i % 128;
        if (i % 2 != 0) {
            th.getClass();
            str.getClass();
            ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, 1379764002, -1379764000, System.identityHashCode(this))).execute(new gtm(13, this, th, str));
        } else {
            th.getClass();
            str.getClass();
            ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, 1379764002, -1379764000, System.identityHashCode(this))).execute(new gtm(13, this, th, str));
            int i2 = 49 / 0;
        }
    }

    @NotNull
    public final AFc1aSDK AFAdRevenueData() {
        int i = hashCode + 81;
        toString = i % 128;
        int i2 = i % 2;
        arf arfVar = this.component4;
        if (i2 != 0) {
            return (AFc1aSDK) arfVar.getValue();
        }
        throw null;
    }

    private final boolean AFAdRevenueData(AFh1gSDK aFh1gSDK) {
        return ((Boolean) getCurrencyIso4217Code(new Object[]{this, aFh1gSDK}, 943546209, -943546206, System.identityHashCode(this))).booleanValue();
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFc1dSDK aFc1dSDK = (AFc1dSDK) objArr[0];
        int i = hashCode + 17;
        toString = i % 128;
        int i2 = i % 2;
        ExecutorService executorService = (ExecutorService) aFc1dSDK.component2.getValue();
        if (i2 == 0) {
            int i3 = 13 / 0;
        }
        return executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFc1dSDK aFc1dSDK) {
        int i = toString + 9;
        hashCode = i % 128;
        if (i % 2 == 0) {
            aFc1dSDK.getClass();
            aFc1dSDK.equals();
            hashCode = (toString + 105) % 128;
        } else {
            aFc1dSDK.getClass();
            aFc1dSDK.equals();
            throw null;
        }
    }

    private final void getMonetizationNetwork(AFh1gSDK aFh1gSDK) {
        toString = (hashCode + 7) % 128;
        int i = aFh1gSDK.AFAdRevenueData;
        long millis = TimeUnit.DAYS.toMillis(aFh1gSDK.getCurrencyIso4217Code) + System.currentTimeMillis();
        AFc1sSDK component4 = component4();
        component4.AFAdRevenueData("af_send_exc_to_server_window", millis);
        component4.getMonetizationNetwork("af_send_exc_min", i);
        int i2 = hashCode + 45;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final void getMediationNetwork() {
        toString = (hashCode + 33) % 128;
        ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, 1379764002, -1379764000, System.identityHashCode(this))).execute(new g(this, 0));
        toString = (hashCode + 97) % 128;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final void getMediationNetwork(AFc1bSDK.AFa1vSDK aFa1vSDK) {
        toString = (hashCode + 79) % 128;
        this.component1 = aFa1vSDK;
        ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, 1379764002, -1379764000, System.identityHashCode(this))).execute(new g(this, 2));
        int i = toString + 41;
        hashCode = i % 128;
        if (i % 2 != 0) {
            int i2 = 27 / 0;
        }
    }

    private final AFc1kSDK getMonetizationNetwork() {
        return (AFc1kSDK) getCurrencyIso4217Code(new Object[]{this}, 652478680, -652478680, System.identityHashCode(this));
    }

    private final boolean getMediationNetwork(AFh1gSDK aFh1gSDK) {
        new AFd1rSDK();
        String str = this.areAllFieldsValid;
        String str2 = aFh1gSDK.getRevenue;
        str2.getClass();
        boolean AFAdRevenueData = AFd1rSDK.AFAdRevenueData(str, str2);
        hashCode = (toString + 13) % 128;
        return AFAdRevenueData;
    }

    private final AFf1mSDK getRevenue() {
        hashCode = (toString + 99) % 128;
        AFf1mSDK aFf1mSDK = (AFf1mSDK) this.AFAdRevenueData.getValue();
        int i = hashCode + 15;
        toString = i % 128;
        if (i % 2 != 0) {
            return aFf1mSDK;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFc1dSDK aFc1dSDK) {
        getCurrencyIso4217Code(new Object[]{aFc1dSDK}, 983518343, -983518342, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        AFc1dSDK aFc1dSDK = (AFc1dSDK) objArr[0];
        int i = hashCode + 123;
        toString = i % 128;
        if (i % 2 != 0) {
            aFc1dSDK.getClass();
            aFc1dSDK.copydefault();
            return null;
        }
        aFc1dSDK.getClass();
        aFc1dSDK.copydefault();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(AFc1dSDK aFc1dSDK) {
        int i = toString + 35;
        hashCode = i % 128;
        if (i % 2 != 0) {
            aFc1dSDK.getClass();
            aFc1dSDK.copy();
            int i2 = 9 / 0;
        } else {
            aFc1dSDK.getClass();
            aFc1dSDK.copy();
        }
        toString = (hashCode + 101) % 128;
    }

    private final void getRevenue(String str, String str2) {
        toString = (hashCode + 81) % 128;
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        component2().getMonetizationNetwork(bytes, dfi.n("Authorization", AFj1hSDK.AFAdRevenueData(str, str2)), 2000);
        hashCode = (toString + 29) % 128;
    }

    private final Map<String, String> getRevenue(AFh1gSDK aFh1gSDK) {
        return (Map) getCurrencyIso4217Code(new Object[]{this, aFh1gSDK}, -1662256862, 1662256866, System.identityHashCode(this));
    }

    public static final /* synthetic */ AFc1fSDK getCurrencyIso4217Code(AFc1dSDK aFc1dSDK) {
        int i = toString + 37;
        hashCode = i % 128;
        int i2 = i % 2;
        AFc1fSDK aFc1fSDK = aFc1dSDK.getMonetizationNetwork;
        if (i2 != 0) {
            int i3 = 46 / 0;
        }
        return aFc1fSDK;
    }

    @Override // com.appsflyer.internal.AFc1bSDK
    public final void getCurrencyIso4217Code() {
        int i = toString + 87;
        hashCode = i % 128;
        if (i % 2 != 0) {
            ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, 1379764002, -1379764000, System.identityHashCode(this))).execute(new g(this, 1));
            int i2 = 89 / 0;
        } else {
            ((ExecutorService) getCurrencyIso4217Code(new Object[]{this}, 1379764002, -1379764000, System.identityHashCode(this))).execute(new g(this, 1));
        }
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | i2);
        int i5 = ~i2;
        int i6 = ~(i5 | i);
        int i7 = (((~((~i3) | i5)) | i4 | i6) * 398) + ((i | i2) * (-1194)) + ((i4 | i6 | (~(i5 | i3))) * 398) + (i2 * 399) + (i * 399);
        if (i7 == 1) {
            return getRevenue(objArr);
        }
        if (i7 == 2) {
            return getMonetizationNetwork(objArr);
        }
        if (i7 != 3) {
            return i7 != 4 ? AFAdRevenueData(objArr) : getCurrencyIso4217Code(objArr);
        }
        AFc1dSDK aFc1dSDK = (AFc1dSDK) objArr[0];
        AFh1gSDK aFh1gSDK = (AFh1gSDK) objArr[1];
        hashCode = (toString + 91) % 128;
        long currentTimeMillis = System.currentTimeMillis();
        long mediationNetwork = aFc1dSDK.component4().getMediationNetwork("af_send_exc_to_server_window", -1L);
        if (aFh1gSDK.getMediationNetwork < currentTimeMillis / 1000) {
            return Boolean.FALSE;
        }
        if (mediationNetwork != -1) {
            toString = (hashCode + 55) % 128;
            if (mediationNetwork >= currentTimeMillis) {
                return Boolean.valueOf(aFc1dSDK.getMediationNetwork(aFh1gSDK));
            }
        }
        hashCode = (toString + 13) % 128;
        return Boolean.FALSE;
    }

    private final boolean getCurrencyIso4217Code(AFh1gSDK aFh1gSDK) {
        int AFAdRevenueData;
        int i = hashCode + 13;
        toString = i % 128;
        if (i % 2 != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long mediationNetwork = component4().getMediationNetwork("af_send_exc_to_server_window", -1L);
            if (aFh1gSDK.getMediationNetwork >= currentTimeMillis / 1000 && mediationNetwork != -1) {
                toString = (hashCode + 67) % 128;
                if (mediationNetwork >= currentTimeMillis && (AFAdRevenueData = component4().AFAdRevenueData("af_send_exc_min", -1)) != -1 && AFAdRevenueData().getMediationNetwork() >= AFAdRevenueData) {
                    return getMediationNetwork(aFh1gSDK);
                }
            }
            return false;
        }
        System.currentTimeMillis();
        component4().getMediationNetwork("af_send_exc_to_server_window", -1L);
        long j = aFh1gSDK.getMediationNetwork;
        throw null;
    }
}
