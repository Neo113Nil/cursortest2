package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public interface setCacheColorHint {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class getWarnings {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static final /* synthetic */ getWarnings[] ThreeDS2Service;
        public static final getWarnings ThreeDS2ServiceInstance;
        private static int cleanup;
        private static int createTransaction;
        public static final getWarnings get;
        private static int[] getSDKVersion;
        public static final getWarnings getWarnings;
        private final String initialize;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            cleanup = 0;
            createTransaction = 1;
            initialize();
            Object[] objArr = new Object[1];
            a(new int[]{984177931, -1757054312}, 4 - Color.blue(0), objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(new int[]{-329852753, -123210999, 2043622761, -851206633}, 5 - (ViewConfiguration.getEdgeSlop() >> 16), objArr2);
            getWarnings = new getWarnings(intern, 0, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a(new int[]{1098765016, -569033509}, 4 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr3);
            String intern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a(new int[]{751597561, 160704547, 2043622761, -851206633}, 5 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr4);
            ThreeDS2ServiceInstance = new getWarnings(intern2, 1, ((String) objArr4[0]).intern());
            Object[] objArr5 = new Object[1];
            a(new int[]{562186167, 918192351}, 4 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr5);
            String intern3 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            a(new int[]{-1851642110, -329392180, 158135902, -1606181299}, 6 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr6);
            get = new getWarnings(intern3, 2, ((String) objArr6[0]).intern());
            ThreeDS2Service = ThreeDS2Service();
            int i = createTransaction + 7;
            cleanup = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        private getWarnings(String str, int i, String str2) {
            this.initialize = str2;
        }

        private static /* synthetic */ getWarnings[] ThreeDS2Service() {
            int i = (createTransaction + 109) % 128;
            cleanup = i;
            getWarnings[] getwarningsArr = {getWarnings, ThreeDS2ServiceInstance, get};
            int i2 = i + 39;
            createTransaction = i2 % 128;
            if (i2 % 2 != 0) {
                return getwarningsArr;
            }
            throw null;
        }

        private static void a(int[] iArr, int i, Object[] objArr) {
            int i2;
            int[] iArr2;
            int i3;
            int[] iArr3;
            int i4;
            Object method;
            int i5;
            char[] cArr;
            int[] iArr4;
            Object method2;
            createTransaction createtransaction = new createTransaction();
            char[] cArr2 = new char[4];
            char[] cArr3 = new char[iArr.length * 2];
            int[] iArr5 = getSDKVersion;
            Class cls = Integer.TYPE;
            int i6 = 2;
            if (iArr5 != null) {
                $11 = ($10 + 21) % 128;
                int length = iArr5.length;
                i2 = 16;
                int[] iArr6 = new int[length];
                int i7 = 0;
                while (i7 < length) {
                    $11 = ($10 + 19) % 128;
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr5[i7])};
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj = map.get(2095751688);
                        if (obj != null) {
                            i5 = length;
                            iArr4 = iArr5;
                            method2 = obj;
                            cArr = cArr2;
                        } else {
                            i5 = length;
                            cArr = cArr2;
                            Class cls2 = (Class) removeParam.initialize(64 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((-1) - Process.getGidForName("")), 1198 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                            Object[] objArr3 = new Object[1];
                            iArr4 = iArr5;
                            b(-1, (short) 0, 0, objArr3);
                            method2 = cls2.getMethod((String) objArr3[0], cls);
                            map.put(2095751688, method2);
                        }
                        iArr6[i7] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                        i7++;
                        cArr2 = cArr;
                        length = i5;
                        iArr5 = iArr4;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr5 = iArr6;
            } else {
                i2 = 16;
            }
            char[] cArr4 = cArr2;
            int length2 = iArr5.length;
            int[] iArr7 = new int[length2];
            int[] iArr8 = getSDKVersion;
            if (iArr8 != null) {
                $11 = ($10 + 51) % 128;
                int length3 = iArr8.length;
                int[] iArr9 = new int[length3];
                int i8 = 0;
                while (i8 < length3) {
                    Object[] objArr4 = {Integer.valueOf(iArr8[i8])};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(2095751688);
                    if (obj2 != null) {
                        iArr2 = iArr8;
                        i3 = length3;
                        iArr3 = iArr9;
                        method = obj2;
                        i4 = i8;
                    } else {
                        iArr2 = iArr8;
                        i3 = length3;
                        iArr3 = iArr9;
                        Class cls3 = (Class) removeParam.initialize(65 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), 1197 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                        Object[] objArr5 = new Object[1];
                        i4 = i8;
                        b(-1, (short) 0, 0, objArr5);
                        method = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(2095751688, method);
                    }
                    iArr3[i4] = ((Integer) ((Method) method).invoke(null, objArr4)).intValue();
                    i8 = i4 + 1;
                    iArr8 = iArr2;
                    length3 = i3;
                    iArr9 = iArr3;
                }
                iArr8 = iArr9;
            }
            char c = 0;
            System.arraycopy(iArr8, 0, iArr7, 0, length2);
            createtransaction.initialize = 0;
            while (true) {
                int i9 = createtransaction.initialize;
                if (i9 >= iArr.length) {
                    objArr[0] = new String(cArr3, 0, i);
                    return;
                }
                int i10 = iArr[i9];
                char c2 = (char) (i10 >> 16);
                cArr4[c] = c2;
                char c3 = (char) i10;
                cArr4[1] = c3;
                char c4 = (char) (iArr[i9 + 1] >> 16);
                cArr4[i6] = c4;
                char c5 = (char) iArr[i9 + 1];
                cArr4[3] = c5;
                createtransaction.getWarnings = (c2 << 16) + c3;
                createtransaction.get = (c4 << 16) + c5;
                createTransaction.ThreeDS2ServiceInstance(iArr7);
                int i11 = 0;
                while (i11 < i2) {
                    $10 = ($11 + 125) % 128;
                    int i12 = createtransaction.getWarnings ^ iArr7[i11];
                    createtransaction.getWarnings = i12;
                    int ThreeDS2Service2 = createTransaction.ThreeDS2Service(i12);
                    Object[] objArr6 = new Object[4];
                    objArr6[3] = createtransaction;
                    objArr6[i6] = createtransaction;
                    objArr6[1] = Integer.valueOf(ThreeDS2Service2);
                    objArr6[0] = createtransaction;
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(-411264147);
                    if (obj3 == null) {
                        obj3 = ((Class) removeParam.initialize(View.MeasureSpec.makeMeasureSpec(0, 0) + 49, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), Color.alpha(0) + 13121)).getMethod("y", Object.class, cls, Object.class, Object.class);
                        map3.put(-411264147, obj3);
                    }
                    int intValue = ((Integer) ((Method) obj3).invoke(null, objArr6)).intValue();
                    createtransaction.getWarnings = createtransaction.get;
                    createtransaction.get = intValue;
                    i11++;
                    i2 = 16;
                }
                int i13 = createtransaction.getWarnings;
                int i14 = createtransaction.get;
                createtransaction.getWarnings = i14;
                createtransaction.get = i13;
                i2 = 16;
                int i15 = i13 ^ iArr7[16];
                createtransaction.get = i15;
                int i16 = i14 ^ iArr7[17];
                createtransaction.getWarnings = i16;
                cArr4[0] = (char) (i16 >>> 16);
                cArr4[1] = (char) i16;
                cArr4[i6] = (char) (i15 >>> 16);
                cArr4[3] = (char) i15;
                createTransaction.ThreeDS2ServiceInstance(iArr7);
                int i17 = createtransaction.initialize;
                cArr3[i17 * 2] = cArr4[0];
                cArr3[(i17 * 2) + 1] = cArr4[1];
                cArr3[(i17 * 2) + 2] = cArr4[i6];
                cArr3[(i17 * 2) + 3] = cArr4[3];
                Object[] objArr7 = new Object[i6];
                objArr7[1] = createtransaction;
                objArr7[0] = createtransaction;
                Map map4 = removeParam.visaSchemeConfiguration;
                Object obj4 = map4.get(-1870831722);
                if (obj4 == null) {
                    Class cls4 = (Class) removeParam.initialize(98 - TextUtils.lastIndexOf("", '0', 0), (char) TextUtils.indexOf("", ""), 1880 - (ViewConfiguration.getScrollBarSize() >> 8));
                    Object[] objArr8 = new Object[1];
                    b(-1, (short) 0, 1, objArr8);
                    obj4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                    map4.put(-1870831722, obj4);
                }
                ((Method) obj4).invoke(null, objArr7);
                c = 0;
                i6 = 2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(int i, short s, int i2, Object[] objArr) {
            int i3;
            int i4;
            int i5 = i + 4;
            int i6 = (i2 * 5) + 113;
            byte[] bArr = $$a;
            int i7 = s * 4;
            byte[] bArr2 = new byte[i7 + 1];
            if (bArr == null) {
                i3 = i5;
                int i8 = i7;
                i4 = 0;
                i5 += -i8;
                bArr2[i4] = (byte) i5;
                i3++;
                if (i4 == i7) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i4++;
                i8 = bArr[i3];
                i5 += -i8;
                bArr2[i4] = (byte) i5;
                i3++;
                if (i4 == i7) {
                }
            } else {
                i3 = i5;
                i5 = i6;
                i4 = 0;
                bArr2[i4] = (byte) i5;
                i3++;
                if (i4 == i7) {
                }
            }
        }

        public static List<String> get() {
            ArrayList arrayList = new ArrayList();
            getWarnings[] values = values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                int i2 = cleanup + 31;
                createTransaction = i2 % 128;
                if (i2 % 2 == 0) {
                    arrayList.add(values[i].getWarnings());
                    i += 51;
                } else {
                    arrayList.add(values[i].getWarnings());
                    i++;
                }
            }
            return arrayList;
        }

        public static void init$0() {
            $$a = new byte[]{121, -78, -70, -38};
            $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE;
        }

        public static void initialize() {
            getSDKVersion = new int[]{-1770550260, -1721377561, 1457052106, 1048291606, -1180434756, -1090573912, -186160108, -1246334402, -1852072933, 805688777, -2093368412, -1820015574, 1857236275, 157142773, -1055362431, 47362931, -85342741, 2096927756};
        }

        public static getWarnings valueOf(String str) {
            cleanup = (createTransaction + 47) % 128;
            getWarnings getwarnings = (getWarnings) Enum.valueOf(getWarnings.class, str);
            int i = cleanup + 69;
            createTransaction = i % 128;
            if (i % 2 != 0) {
                return getwarnings;
            }
            throw null;
        }

        public static getWarnings[] values() {
            int i = createTransaction + 9;
            cleanup = i % 128;
            if (i % 2 == 0) {
                return (getWarnings[]) ThreeDS2Service.clone();
            }
            ThreeDS2Service.clone();
            throw null;
        }

        public String getWarnings() {
            int i = cleanup + 109;
            createTransaction = i % 128;
            int i2 = i % 2;
            String str = this.initialize;
            if (i2 != 0) {
                return str;
            }
            throw null;
        }
    }

    getWarnings ThreeDS2Service(String str);

    get ThreeDS2ServiceInstance();

    getWarnings getWarnings();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class get {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final get ThreeDS2Service;
        private static int ThreeDS2ServiceInitializationCallback = 0;
        private static char cleanup = 0;
        private static char createTransaction = 0;
        public static final get get;
        private static char getSDKInfo = 0;
        private static int getSDKVersion = 1;
        private static char getWarnings;
        private static final /* synthetic */ get[] initialize;
        private final String ThreeDS2ServiceInstance;

        static {
            ThreeDS2Service();
            Object[] objArr = new Object[1];
            a("먳㯜闢뷱穜얌", 5 - TextUtils.indexOf("", "", 0), objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a("ﭛ뛒穜얌", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2, objArr2);
            ThreeDS2Service = new get(intern, 0, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a("먳㯜闢뷱⬮\uab08", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 5, objArr3);
            String intern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a("ﭛ뛒⬮\uab08", 3 - Gravity.getAbsoluteGravity(0, 0), objArr4);
            get = new get(intern2, 1, ((String) objArr4[0]).intern());
            initialize = initialize();
            int i = ThreeDS2ServiceInitializationCallback + 59;
            getSDKVersion = i % 128;
            if (i % 2 == 0) {
                int i2 = 9 / 0;
            }
        }

        private get(String str, int i, String str2) {
            this.ThreeDS2ServiceInstance = str2;
        }

        public static void ThreeDS2Service() {
            getWarnings = (char) 24354;
            cleanup = (char) 9614;
            createTransaction = (char) 15420;
            getSDKInfo = (char) 18367;
        }

        private static void a(String str, int i, Object[] objArr) {
            char[] charArray = str != null ? str.toCharArray() : str;
            ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
            char[] cArr = new char[charArray.length];
            int i2 = 0;
            configurationBuilder.ThreeDS2ServiceInstance = 0;
            int i3 = 2;
            char[] cArr2 = new char[2];
            while (true) {
                int i4 = configurationBuilder.ThreeDS2ServiceInstance;
                if (i4 >= charArray.length) {
                    String str2 = new String(cArr, 0, i);
                    $11 = ($10 + 113) % 128;
                    objArr[0] = str2;
                    return;
                }
                cArr2[i2] = charArray[i4];
                char c = 1;
                cArr2[1] = charArray[i4 + 1];
                int i5 = 58224;
                int i6 = i2;
                while (i6 < 16) {
                    $11 = ($10 + 109) % 128;
                    char c2 = cArr2[c];
                    char c3 = cArr2[i2];
                    char c4 = c;
                    int i7 = i3;
                    char[] cArr3 = cArr2;
                    int i8 = (c3 + i5) ^ ((c3 << 4) + ((char) (createTransaction ^ (-1730380012335540218L))));
                    int i9 = c3 >>> 5;
                    int i10 = i2;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(getSDKInfo);
                        objArr2[i7] = Integer.valueOf(i9);
                        objArr2[c4] = Integer.valueOf(i8);
                        objArr2[i10] = Integer.valueOf(c2);
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj = map.get(936379577);
                        Class cls = Integer.TYPE;
                        if (obj == null) {
                            obj = ((Class) removeParam.initialize((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 67, (char) (TextUtils.lastIndexOf("", '0') + 62397), 5352 - ExpandableListView.getPackedPositionGroup(0L))).getMethod("C", cls, cls, cls, cls);
                            map.put(936379577, obj);
                        }
                        char charValue = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                        cArr3[c4] = charValue;
                        char c5 = cArr3[i10];
                        char[] cArr4 = charArray;
                        int i11 = i5;
                        int i12 = (charValue + i5) ^ ((charValue << 4) + ((char) (getWarnings ^ (-1730380012335540218L))));
                        int i13 = charValue >>> 5;
                        Object[] objArr3 = new Object[4];
                        objArr3[3] = Integer.valueOf(cleanup);
                        objArr3[i7] = Integer.valueOf(i13);
                        objArr3[c4] = Integer.valueOf(i12);
                        objArr3[i10] = Integer.valueOf(c5);
                        Object obj2 = map.get(936379577);
                        if (obj2 == null) {
                            obj2 = ((Class) removeParam.initialize(TextUtils.lastIndexOf("", '0', i10, i10) + 68, (char) (62397 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 5352 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)))).getMethod("C", cls, cls, cls, cls);
                            map.put(936379577, obj2);
                        }
                        cArr3[0] = ((Character) ((Method) obj2).invoke(null, objArr3)).charValue();
                        i5 = i11 - 40503;
                        i6++;
                        c = c4;
                        i3 = i7;
                        cArr2 = cArr3;
                        charArray = cArr4;
                        i2 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr5 = charArray;
                int i14 = i3;
                char[] cArr6 = cArr2;
                char c6 = c;
                int i15 = configurationBuilder.ThreeDS2ServiceInstance;
                cArr[i15] = cArr6[0];
                cArr[i15 + 1] = cArr6[c6];
                Object[] objArr4 = new Object[i14];
                objArr4[c6] = configurationBuilder;
                objArr4[0] = configurationBuilder;
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(108358357);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(55 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 39910), 7058 - TextUtils.lastIndexOf("", '0', 0, 0))).getMethod("B", Object.class, Object.class);
                    map2.put(108358357, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
                i3 = i14;
                cArr2 = cArr6;
                charArray = cArr5;
                i2 = 0;
            }
        }

        public static get get(String str) {
            if (oj.get(str)) {
                return null;
            }
            get getVar = ThreeDS2Service;
            if (oj.initialize((CharSequence) getVar.get(), (CharSequence) str)) {
                ThreeDS2ServiceInitializationCallback = (getSDKVersion + 21) % 128;
                return getVar;
            }
            get getVar2 = get;
            if (!oj.initialize((CharSequence) getVar2.get(), (CharSequence) str)) {
                ThreeDS2ServiceInitializationCallback = (getSDKVersion + 91) % 128;
                return null;
            }
            int i = getSDKVersion + 65;
            ThreeDS2ServiceInitializationCallback = i % 128;
            if (i % 2 == 0) {
                return getVar2;
            }
            throw null;
        }

        private static /* synthetic */ get[] initialize() {
            int i = (ThreeDS2ServiceInitializationCallback + 7) % 128;
            getSDKVersion = i;
            get[] getVarArr = {ThreeDS2Service, get};
            int i2 = i + 9;
            ThreeDS2ServiceInitializationCallback = i2 % 128;
            if (i2 % 2 == 0) {
                return getVarArr;
            }
            throw null;
        }

        public static get valueOf(String str) {
            ThreeDS2ServiceInitializationCallback = (getSDKVersion + 125) % 128;
            get getVar = (get) Enum.valueOf(get.class, str);
            int i = ThreeDS2ServiceInitializationCallback + 63;
            getSDKVersion = i % 128;
            if (i % 2 != 0) {
                return getVar;
            }
            throw null;
        }

        public static get[] values() {
            int i = ThreeDS2ServiceInitializationCallback + 81;
            getSDKVersion = i % 128;
            if (i % 2 == 0) {
                initialize.clone();
                throw null;
            }
            get[] getVarArr = (get[]) initialize.clone();
            int i2 = ThreeDS2ServiceInitializationCallback + 3;
            getSDKVersion = i2 % 128;
            if (i2 % 2 != 0) {
                return getVarArr;
            }
            throw null;
        }

        public String get() {
            int i = getSDKVersion + 81;
            ThreeDS2ServiceInitializationCallback = i % 128;
            int i2 = i % 2;
            String str = this.ThreeDS2ServiceInstance;
            if (i2 == 0) {
                return str;
            }
            throw null;
        }
    }
}
