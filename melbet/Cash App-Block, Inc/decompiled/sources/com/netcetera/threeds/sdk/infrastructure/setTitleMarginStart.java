package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class setTitleMarginStart extends setTitleMargin {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ThreeDS2ServiceInitializationCallback = 0;
    public static final String ThreeDS2ServiceInstance;
    private static int cleanup = 1;
    private static char createTransaction;
    private static int getSDKInfo;
    private static long getWarnings;
    private get ThreeDS2Service;
    private initialize get;
    private getWarnings initialize;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class get {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        public static final get ThreeDS2Service;
        public static final get ThreeDS2ServiceInstance;
        private static long cleanup;
        private static int createTransaction;
        private static final /* synthetic */ get[] get;
        private static int getSDKVersion;
        public static final get initialize;
        private final String getWarnings;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getSDKVersion = 0;
            createTransaction = 1;
            initialize();
            Object[] objArr = new Object[1];
            a("䘘䙎벦鋏贉\uf1c3絪", ViewConfiguration.getEdgeSlop() >> 16, objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a("繶繇曞\ue40b坮蜇㙵", ViewConfiguration.getTouchSlop() >> 8, objArr2);
            ThreeDS2ServiceInstance = new get(intern, 0, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a("㖵㗣\udb0c⸵\ueaa0䴹暔", TextUtils.getCapsMode("", 0, 0), objArr3);
            String intern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a("꾩꾛㤙┯ࢩ䘣똘", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr4);
            initialize = new get(intern2, 1, ((String) objArr4[0]).intern());
            Object[] objArr5 = new Object[1];
            a("勱劤콟䫐⭤ﺏ⦨铏ې뿻R\ue4ec\ude45", ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr5);
            ThreeDS2Service = new get(((String) objArr5[0]).intern(), 2, null);
            get = get();
            getSDKVersion = (createTransaction + 117) % 128;
        }

        private get(String str, int i, String str2) {
            this.getWarnings = str2;
        }

        private static void a(String str, int i, Object[] objArr) {
            char[] cArr;
            if (str != null) {
                $10 = ($11 + 43) % 128;
                cArr = str.toCharArray();
                $10 = ($11 + 49) % 128;
            } else {
                cArr = str;
            }
            onCompleted oncompleted = new onCompleted();
            char[] initialize2 = onCompleted.initialize(cleanup ^ (-2776494906517314268L), cArr, i);
            oncompleted.initialize = 4;
            while (true) {
                int i2 = oncompleted.initialize;
                if (i2 >= initialize2.length) {
                    objArr[0] = new String(initialize2, 4, initialize2.length - 4);
                    return;
                }
                int i3 = i2 - 4;
                oncompleted.ThreeDS2Service = i3;
                try {
                    Object[] objArr2 = {Long.valueOf(initialize2[i2] ^ initialize2[i2 % 4]), Long.valueOf(i3), Long.valueOf(cleanup)};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-1242395160);
                    if (obj == null) {
                        Class cls = (Class) removeParam.initialize(49 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (View.MeasureSpec.getSize(0) + 27780), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2440);
                        Object[] objArr3 = new Object[1];
                        b((short) 0, 0, (byte) 0, objArr3);
                        String str2 = (String) objArr3[0];
                        Class cls2 = Long.TYPE;
                        obj = cls.getMethod(str2, cls2, cls2, cls2);
                        map.put(-1242395160, obj);
                    }
                    initialize2[i2] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    Object[] objArr4 = {oncompleted, oncompleted};
                    Object obj2 = map.get(1526822639);
                    if (obj2 == null) {
                        obj2 = ((Class) removeParam.initialize((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 65, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), View.MeasureSpec.makeMeasureSpec(0, 0) + 14235)).getMethod("s", Object.class, Object.class);
                        map.put(1526822639, obj2);
                    }
                    ((Method) obj2).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }

        private static void b(short s, int i, byte b, Object[] objArr) {
            byte[] bArr = $$a;
            int i2 = (b * 2) + 4;
            int i3 = (s * 3) + 112;
            int i4 = i * 2;
            byte[] bArr2 = new byte[1 - i4];
            int i5 = 0 - i4;
            int i6 = -1;
            if (bArr == null) {
                i3 = (-i3) + i5;
                i2++;
                bArr = bArr;
                i6 = -1;
            }
            while (true) {
                int i7 = i6 + 1;
                bArr2[i7] = (byte) i3;
                if (i7 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i3 = (-bArr[i2]) + i3;
                i2++;
                bArr = bArr;
                i6 = i7;
            }
        }

        private static /* synthetic */ get[] get() {
            int i = createTransaction;
            get[] getVarArr = {ThreeDS2ServiceInstance, initialize, ThreeDS2Service};
            getSDKVersion = (i + 11) % 128;
            return getVarArr;
        }

        public static get getWarnings(String str) {
            get[] values = values();
            int length = values.length;
            createTransaction = (getSDKVersion + 101) % 128;
            int i = 0;
            while (i < length) {
                int i2 = getSDKVersion + 99;
                createTransaction = i2 % 128;
                if (i2 % 2 == 0) {
                    oj.get(values[i].ThreeDS2Service(), str);
                    throw null;
                }
                get getVar = values[i];
                if (oj.get(getVar.ThreeDS2Service(), str)) {
                    return getVar;
                }
                i++;
                createTransaction = (getSDKVersion + 81) % 128;
            }
            return ThreeDS2Service;
        }

        public static void init$0() {
            $$a = new byte[]{120, -124, 93, -2};
            $$b = EnumC0170g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE;
        }

        public static void initialize() {
            cleanup = -2401517274526149446L;
        }

        public static get valueOf(String str) {
            int i = getSDKVersion + 9;
            createTransaction = i % 128;
            if (i % 2 != 0) {
                return (get) Enum.valueOf(get.class, str);
            }
            Enum.valueOf(get.class, str);
            throw null;
        }

        public static get[] values() {
            int i = getSDKVersion + 3;
            createTransaction = i % 128;
            if (i % 2 == 0) {
                get.clone();
                throw null;
            }
            get[] getVarArr = (get[]) get.clone();
            createTransaction = (getSDKVersion + 119) % 128;
            return getVarArr;
        }

        public String ThreeDS2Service() {
            int i = getSDKVersion + 67;
            createTransaction = i % 128;
            int i2 = i % 2;
            String str = this.getWarnings;
            if (i2 != 0) {
                return str;
            }
            throw null;
        }
    }

    public static class initialize {
        private static int get = 1;
        private static int initialize;
        private final getCause getWarnings;

        public initialize(getCause getcause) {
            this.getWarnings = getcause;
        }

        public getCause ThreeDS2ServiceInstance() {
            int i = initialize;
            getCause getcause = this.getWarnings;
            int i2 = i & 27;
            get = SVG$Unit$EnumUnboxingLocalUtility.m$1(i2, ~((i ^ 27) | i2), 1, 128);
            return getcause;
        }
    }

    static {
        cleanup();
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", Color.argb(0, 0, 0, 0), (char) (View.MeasureSpec.getSize(0) + 8563), "쮲鿓\uf6a6鎒韔了\ude4d\uf873獸碐ŷ芄䒊᪰", "㭥\ufe1d猢蜡", objArr);
        ThreeDS2ServiceInstance = ((String) objArr[0]).intern();
        ThreeDS2ServiceInitializationCallback = (cleanup + 125) % 128;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public setTitleMarginStart() {
        super(r0, null, r3, ((String) r10[0]).intern());
        Boolean bool = Boolean.FALSE;
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", KeyEvent.getMaxKeyCode() >> 16, (char) (AndroidCharacter.getMirror('0') + 8515), "쮲鿓\uf6a6鎒韔了\ude4d\uf873獸碐ŷ芄䒊᪰", "㭥\ufe1d猢蜡", objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("\u0000\u0000\u0000\u0000", ViewConfiguration.getJumpTapTimeout() >> 16, (char) (ViewConfiguration.getTouchSlop() >> 8), "뤵ܨ㰧駏汽銞桿\uda55", "\ue899㞣唈\uf49e", objArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (r26 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0031, code lost:
    
        com.netcetera.threeds.sdk.infrastructure.setTitleMarginStart.$11 = (r4 + 73) % 128;
        r4 = r26.toCharArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x002f, code lost:
    
        if (r26 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003c, code lost:
    
        r4 = r26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(String str, int i, char c, String str2, String str3, Object[] objArr) {
        char[] charArray;
        char[] cArr;
        int i2;
        char[] cArr2;
        int i3;
        Integer num;
        Integer num2 = 246986610;
        int i4 = $10;
        int i5 = i4 + 13;
        $11 = i5 % 128;
        int i6 = 2;
        int i7 = 0;
        if (i5 % 2 == 0) {
            int i8 = 95 / 0;
        }
        char[] cArr3 = charArray;
        if (str2 != 0) {
            int i9 = $10 + 53;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                str2.toCharArray();
                throw null;
            }
            cArr = str2.toCharArray();
        } else {
            cArr = str2;
        }
        char[] cArr4 = cArr;
        char[] charArray2 = str != null ? str.toCharArray() : str;
        ConfigParameters configParameters = new ConfigParameters();
        int length = cArr3.length;
        char[] cArr5 = new char[length];
        int length2 = charArray2.length;
        char[] cArr6 = new char[length2];
        System.arraycopy(cArr3, 0, cArr5, 0, length);
        System.arraycopy(charArray2, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr4.length;
        char[] cArr7 = new char[length3];
        configParameters.initialize = 0;
        while (configParameters.initialize < length3) {
            $11 = ($10 + 55) % 128;
            try {
                Object[] objArr2 = {configParameters};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-258783473);
                int i10 = i6;
                if (obj != null) {
                    i2 = length3;
                    cArr2 = cArr4;
                } else {
                    i2 = length3;
                    cArr2 = cArr4;
                    obj = ((Class) removeParam.initialize(59 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 6414 - TextUtils.indexOf("", "", i7, i7))).getMethod("j", Object.class);
                    map.put(-258783473, obj);
                }
                int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {configParameters};
                Object obj2 = map.get(num2);
                if (obj2 != null) {
                    i3 = i7;
                } else {
                    i3 = i7;
                    obj2 = ((Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0', i7) + 64, (char) (11345 - KeyEvent.keyCodeFromString("")), 8577 - KeyEvent.keyCodeFromString(""))).getMethod("i", Object.class);
                    map.put(num2, obj2);
                }
                int intValue2 = ((Integer) ((Method) obj2).invoke(null, objArr3)).intValue();
                int i11 = cArr5[configParameters.initialize % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i10] = Integer.valueOf(cArr6[intValue]);
                objArr4[1] = Integer.valueOf(i11);
                objArr4[i3] = configParameters;
                Object obj3 = map.get(828230935);
                Class cls = Integer.TYPE;
                if (obj3 != null) {
                    num = num2;
                } else {
                    num = num2;
                    int i12 = i3;
                    obj3 = ((Class) removeParam.initialize(73 - TextUtils.indexOf((CharSequence) "", '0', i12, i12), (char) Color.alpha(i12), Color.rgb(i12, i12, i12) + 16787036)).getMethod("o", Object.class, cls, cls);
                    map.put(828230935, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
                int i13 = cArr5[intValue2] * 32718;
                Object[] objArr5 = new Object[i10];
                objArr5[1] = Integer.valueOf(cArr6[intValue]);
                objArr5[0] = Integer.valueOf(i13);
                Object obj4 = map.get(196637707);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize((ViewConfiguration.getDoubleTapTimeout() >> 16) + 48, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 63349), Color.alpha(0) + 11536)).getMethod("n", cls, cls);
                    map.put(196637707, obj4);
                }
                cArr6[intValue2] = ((Character) ((Method) obj4).invoke(null, objArr5)).charValue();
                cArr5[intValue2] = configParameters.get;
                int i14 = configParameters.initialize;
                cArr7[i14] = (char) ((((int) (getSDKInfo ^ (-8880716800597159563L))) ^ ((r2 ^ cArr2[i14]) ^ (getWarnings ^ (-8880716800597159563L)))) ^ ((char) (createTransaction ^ (-8880716800597159563L))));
                configParameters.initialize = i14 + 1;
                $10 = ($11 + 113) % 128;
                cArr4 = cArr2;
                length3 = i2;
                num2 = num;
                i6 = 2;
                i7 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr7);
    }

    public static void cleanup() {
        getWarnings = -8880716800597159563L;
        getSDKInfo = 898634101;
        createTransaction = (char) 11839;
    }

    public getWarnings ThreeDS2Service() {
        int i = cleanup + 53;
        ThreeDS2ServiceInitializationCallback = i % 128;
        int i2 = i % 2;
        getWarnings getwarnings = this.initialize;
        if (i2 != 0) {
            int i3 = 43 / 0;
        }
        return getwarnings;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTitleMargin, com.netcetera.threeds.sdk.infrastructure.setMarqueeRepeatLimit
    public String ThreeDS2ServiceInstance() {
        int i = ThreeDS2ServiceInitializationCallback + 31;
        cleanup = i % 128;
        if (i % 2 == 0) {
            super.ThreeDS2ServiceInstance();
            throw null;
        }
        String ThreeDS2ServiceInstance2 = super.ThreeDS2ServiceInstance();
        int i2 = ThreeDS2ServiceInitializationCallback + 79;
        cleanup = i2 % 128;
        if (i2 % 2 != 0) {
            return ThreeDS2ServiceInstance2;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTitleMargin, com.netcetera.threeds.sdk.infrastructure.setMarqueeRepeatLimit
    public Boolean get() {
        int i = cleanup + 87;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 == 0) {
            return super.get();
        }
        super.get();
        throw null;
    }

    public get getSDKInfo() {
        int i = (cleanup + 3) % 128;
        ThreeDS2ServiceInitializationCallback = i;
        get getVar = this.ThreeDS2Service;
        int i2 = i + 39;
        cleanup = i2 % 128;
        if (i2 % 2 != 0) {
            return getVar;
        }
        throw null;
    }

    public initialize getSDKVersion() {
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = i + 45;
        cleanup = i2 % 128;
        int i3 = i2 % 2;
        initialize initializeVar = this.get;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i + 85;
        cleanup = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
        return initializeVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTitleMargin, com.netcetera.threeds.sdk.infrastructure.setMarqueeRepeatLimit
    public String getWarnings() {
        ThreeDS2ServiceInitializationCallback = (cleanup + 45) % 128;
        String warnings = super.getWarnings();
        int i = ThreeDS2ServiceInitializationCallback + 13;
        cleanup = i % 128;
        if (i % 2 != 0) {
            return warnings;
        }
        throw null;
    }

    public void initialize(get getVar) {
        int i = cleanup;
        int i2 = i + 67;
        ThreeDS2ServiceInitializationCallback = i2 % 128;
        if (i2 % 2 != 0) {
            this.ThreeDS2Service = getVar;
            int i3 = 85 / 0;
        } else {
            this.ThreeDS2Service = getVar;
        }
        ThreeDS2ServiceInitializationCallback = (i + 111) % 128;
    }

    public static class getWarnings {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static int ThreeDS2ServiceInitializationCallback;
        private static char cleanup;
        private static char[] createTransaction;
        private static int getSDKInfo;
        private String ThreeDS2Service;
        private printStackTrace ThreeDS2ServiceInstance;
        private String get;
        private String getWarnings;
        private String initialize;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            ThreeDS2ServiceInitializationCallback = 0;
            getSDKInfo = 1;
            createTransaction = new char[]{41442, 37962, 37963, 41441};
            cleanup = (char) 41442;
        }

        private static void a(byte b, String str, int i, Object[] objArr) {
            long j;
            int i2;
            char c;
            char c2;
            char c3;
            char c4;
            Object method;
            int length;
            char[] cArr;
            int i3;
            char[] cArr2;
            Object method2;
            char[] charArray = str != null ? str.toCharArray() : str;
            getParamValue getparamvalue = new getParamValue();
            char[] cArr3 = createTransaction;
            Class cls = Integer.TYPE;
            char c5 = 2;
            int i4 = 0;
            if (cArr3 != null) {
                int i5 = $10 + 35;
                j = 0;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    length = cArr3.length;
                    cArr = new char[length];
                    i3 = 1;
                } else {
                    length = cArr3.length;
                    cArr = new char[length];
                    i3 = 0;
                }
                while (i3 < length) {
                    try {
                        char c6 = c5;
                        Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj = map.get(-78420608);
                        if (obj != null) {
                            cArr2 = charArray;
                            method2 = obj;
                        } else {
                            cArr2 = charArray;
                            Class cls2 = (Class) removeParam.initialize(94 - TextUtils.getTrimmedLength(""), (char) TextUtils.indexOf("", "", i4), 1560 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                            Object[] objArr3 = new Object[1];
                            b((short) 0, 0, 0, objArr3);
                            method2 = cls2.getMethod((String) objArr3[0], cls);
                            map.put(-78420608, method2);
                        }
                        cArr[i3] = ((Character) ((Method) method2).invoke(null, objArr2)).charValue();
                        i3++;
                        c5 = c6;
                        charArray = cArr2;
                        i4 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr;
            } else {
                j = 0;
            }
            char[] cArr4 = charArray;
            char c7 = c5;
            Object[] objArr4 = {Integer.valueOf(cleanup)};
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj2 = map2.get(-78420608);
            char c8 = '0';
            if (obj2 == null) {
                Class cls3 = (Class) removeParam.initialize(94 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 1559 - (ViewConfiguration.getTapTimeout() >> 16));
                Object[] objArr5 = new Object[1];
                b((short) 0, 0, 0, objArr5);
                obj2 = cls3.getMethod((String) objArr5[0], cls);
                map2.put(-78420608, obj2);
            }
            char charValue = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
            char[] cArr5 = new char[i];
            if (i % 2 != 0) {
                int i6 = $11 + 101;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    i2 = i + 10;
                    cArr5[i2] = (char) (cArr4[i2] / b);
                } else {
                    i2 = i - 1;
                    cArr5[i2] = (char) (cArr4[i2] - b);
                }
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i7 = $10 + 109;
                $11 = i7 % 128;
                getparamvalue.getWarnings = i7 % 2 != 0 ? 0 : 1;
                while (true) {
                    int i8 = getparamvalue.getWarnings;
                    if (i8 >= i2) {
                        break;
                    }
                    char c9 = cArr4[i8];
                    getparamvalue.get = c9;
                    char c10 = cArr4[i8 + 1];
                    getparamvalue.initialize = c10;
                    if (c9 == c10) {
                        int i9 = $10 + 33;
                        $11 = i9 % 128;
                        if (i9 % 2 == 0) {
                            cArr5[i8] = (char) (c9 >>> b);
                            cArr5[i8 << 1] = (char) (c10 - b);
                        } else {
                            cArr5[i8] = (char) (c9 - b);
                            cArr5[i8 + 1] = (char) (c10 - b);
                        }
                        c = c8;
                    } else {
                        Object[] objArr6 = new Object[13];
                        objArr6[12] = getparamvalue;
                        objArr6[11] = Integer.valueOf(charValue);
                        objArr6[10] = getparamvalue;
                        objArr6[9] = getparamvalue;
                        objArr6[8] = Integer.valueOf(charValue);
                        objArr6[7] = getparamvalue;
                        objArr6[6] = getparamvalue;
                        objArr6[5] = Integer.valueOf(charValue);
                        objArr6[4] = getparamvalue;
                        objArr6[3] = getparamvalue;
                        objArr6[c7] = Integer.valueOf(charValue);
                        objArr6[1] = getparamvalue;
                        objArr6[0] = getparamvalue;
                        Map map3 = removeParam.visaSchemeConfiguration;
                        Object obj3 = map3.get(-1395483366);
                        if (obj3 != null) {
                            c = c8;
                            c2 = '\t';
                            c3 = 7;
                            method = obj3;
                            c4 = '\b';
                        } else {
                            c = c8;
                            c2 = '\t';
                            c3 = 7;
                            c4 = '\b';
                            Class cls4 = (Class) removeParam.initialize(48 - (Process.myTid() >> 22), (char) (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), View.combineMeasuredStates(0, 0) + 3221);
                            Object[] objArr7 = new Object[1];
                            b((short) 1, 0, 0, objArr7);
                            String str2 = (String) objArr7[0];
                            Class cls5 = Integer.TYPE;
                            method = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                            map3.put(-1395483366, method);
                        }
                        int intValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                        int i10 = getparamvalue.cleanup;
                        if (intValue == i10) {
                            Object[] objArr8 = new Object[11];
                            objArr8[10] = getparamvalue;
                            objArr8[c2] = Integer.valueOf(charValue);
                            objArr8[c4] = getparamvalue;
                            objArr8[c3] = Integer.valueOf(charValue);
                            objArr8[6] = Integer.valueOf(charValue);
                            objArr8[5] = getparamvalue;
                            objArr8[4] = getparamvalue;
                            objArr8[3] = Integer.valueOf(charValue);
                            objArr8[c7] = Integer.valueOf(charValue);
                            objArr8[1] = getparamvalue;
                            objArr8[0] = getparamvalue;
                            Object obj4 = map3.get(1507360409);
                            if (obj4 == null) {
                                Class cls6 = (Class) removeParam.initialize(ExpandableListView.getPackedPositionType(j) + 47, (char) (KeyEvent.normalizeMetaState(0) + 25644), 11489 - TextUtils.indexOf("", ""));
                                Class cls7 = Integer.TYPE;
                                obj4 = cls6.getMethod("x", Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                                map3.put(1507360409, obj4);
                            }
                            int intValue2 = ((Integer) ((Method) obj4).invoke(null, objArr8)).intValue();
                            int i11 = (getparamvalue.ThreeDS2ServiceInstance * charValue) + getparamvalue.cleanup;
                            int i12 = getparamvalue.getWarnings;
                            cArr5[i12] = cArr3[intValue2];
                            cArr5[i12 + 1] = cArr3[i11];
                            $11 = ($10 + 69) % 128;
                        } else {
                            int i13 = getparamvalue.ThreeDS2Service;
                            int i14 = getparamvalue.ThreeDS2ServiceInstance;
                            int i15 = getparamvalue.ThreeDS2ServiceInitializationCallback;
                            if (i13 == i14) {
                                int m = Thread$State$EnumUnboxingLocalUtility.m(i15, charValue, 1, charValue);
                                getparamvalue.ThreeDS2ServiceInitializationCallback = m;
                                int m2 = Thread$State$EnumUnboxingLocalUtility.m(i10, charValue, 1, charValue);
                                getparamvalue.cleanup = m2;
                                int i16 = (i14 * charValue) + m2;
                                int i17 = getparamvalue.getWarnings;
                                cArr5[i17] = cArr3[(i13 * charValue) + m];
                                cArr5[i17 + 1] = cArr3[i16];
                            } else {
                                int i18 = (i13 * charValue) + i10;
                                int i19 = getparamvalue.getWarnings;
                                cArr5[i19] = cArr3[i18];
                                cArr5[i19 + 1] = cArr3[(i14 * charValue) + i15];
                            }
                            getparamvalue.getWarnings += 2;
                            c8 = c;
                        }
                    }
                    getparamvalue.getWarnings += 2;
                    c8 = c;
                }
            }
            for (int i20 = 0; i20 < i; i20++) {
                cArr5[i20] = (char) (cArr5[i20] ^ 13722);
            }
            objArr[0] = new String(cArr5);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(short s, int i, int i2, Object[] objArr) {
            int i3;
            int i4 = 119 - (s * 2);
            int i5 = 4 - (i * 2);
            int i6 = i2 * 2;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[1 - i6];
            int i7 = 0 - i6;
            if (bArr == null) {
                i4 = i5;
                int i8 = i7;
                int i9 = 0;
                i5++;
                i4 += -i8;
                i3 = i9;
                bArr2[i3] = (byte) i4;
                i9 = i3 + 1;
                if (i3 == i7) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i8 = bArr[i5];
                i5++;
                i4 += -i8;
                i3 = i9;
                bArr2[i3] = (byte) i4;
                i9 = i3 + 1;
                if (i3 == i7) {
                }
            } else {
                i3 = 0;
                bArr2[i3] = (byte) i4;
                i9 = i3 + 1;
                if (i3 == i7) {
                }
            }
        }

        public static void init$0() {
            $$a = new byte[]{125, 106, 120, 99};
            $$b = 188;
        }

        public void ThreeDS2Service(String str) {
            int i = ThreeDS2ServiceInitializationCallback + 95;
            getSDKInfo = i % 128;
            if (i % 2 != 0) {
                this.get = str;
            } else {
                this.get = str;
                throw null;
            }
        }

        public void ThreeDS2ServiceInstance(String str) {
            int i = ThreeDS2ServiceInitializationCallback + 21;
            getSDKInfo = i % 128;
            if (i % 2 != 0) {
                this.getWarnings = str;
            } else {
                this.getWarnings = str;
                throw null;
            }
        }

        public printStackTrace cleanup() {
            int i = ThreeDS2ServiceInitializationCallback;
            printStackTrace printstacktrace = this.ThreeDS2ServiceInstance;
            getSDKInfo = (i + 103) % 128;
            return printstacktrace;
        }

        public void get(String str) {
            int i = getSDKInfo + 71;
            ThreeDS2ServiceInitializationCallback = i % 128;
            if (i % 2 != 0) {
                oj.initialize(str);
                throw null;
            }
            if (oj.initialize(str)) {
                int i2 = ThreeDS2ServiceInitializationCallback + 89;
                getSDKInfo = i2 % 128;
                if (i2 % 2 != 0) {
                    this.ThreeDS2Service = str;
                } else {
                    this.ThreeDS2Service = str;
                    throw null;
                }
            }
        }

        public String getWarnings() {
            int i = getSDKInfo;
            String str = this.initialize;
            int i2 = i + 23;
            ThreeDS2ServiceInitializationCallback = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 73 / 0;
            }
            return str;
        }

        public String initialize() {
            getSDKInfo = (ThreeDS2ServiceInitializationCallback + 93) % 128;
            Object[] objArr = new Object[1];
            a((byte) (34 - View.combineMeasuredStates(0, 0)), "\u0000\u0003", (ViewConfiguration.getLongPressTimeout() >> 16) + 2, objArr);
            String intern = ((String) objArr[0]).intern();
            ThreeDS2ServiceInitializationCallback = (getSDKInfo + 3) % 128;
            return intern;
        }

        public String ThreeDS2Service() {
            int i = getSDKInfo + 57;
            ThreeDS2ServiceInitializationCallback = i % 128;
            int i2 = i % 2;
            String str = this.getWarnings;
            if (i2 == 0) {
                return str;
            }
            throw null;
        }

        public String ThreeDS2ServiceInstance() {
            int i = getSDKInfo;
            String str = this.ThreeDS2Service;
            ThreeDS2ServiceInitializationCallback = (i + 103) % 128;
            return str;
        }

        public void ThreeDS2ServiceInstance(printStackTrace printstacktrace) {
            int i = ThreeDS2ServiceInitializationCallback;
            this.ThreeDS2ServiceInstance = printstacktrace;
            getSDKInfo = (i + 41) % 128;
        }

        public String get() {
            int i = ThreeDS2ServiceInitializationCallback + 29;
            getSDKInfo = i % 128;
            int i2 = i % 2;
            String str = this.get;
            if (i2 == 0) {
                int i3 = 22 / 0;
            }
            return str;
        }

        public void initialize(String str) {
            int i = ThreeDS2ServiceInitializationCallback + 7;
            int i2 = i % 128;
            getSDKInfo = i2;
            if (i % 2 == 0) {
                this.initialize = str;
                int i3 = 26 / 0;
            } else {
                this.initialize = str;
            }
            int i4 = i2 + 29;
            ThreeDS2ServiceInitializationCallback = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    public void initialize(initialize initializeVar) {
        int i = ThreeDS2ServiceInitializationCallback;
        this.get = initializeVar;
        cleanup = (i + 13) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setTitleMargin, com.netcetera.threeds.sdk.infrastructure.setMarqueeRepeatLimit
    public String initialize() {
        cleanup = (ThreeDS2ServiceInitializationCallback + 97) % 128;
        String initialize2 = super.initialize();
        cleanup = (ThreeDS2ServiceInitializationCallback + 111) % 128;
        return initialize2;
    }

    public void ThreeDS2ServiceInstance(getWarnings getwarnings) {
        int i = ThreeDS2ServiceInitializationCallback + 11;
        int i2 = i % 128;
        cleanup = i2;
        if (i % 2 != 0) {
            this.initialize = getwarnings;
            ThreeDS2ServiceInitializationCallback = (i2 + 9) % 128;
        } else {
            this.initialize = getwarnings;
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public setTitleMarginStart(Boolean bool, String str, String str2) {
        super(bool, str, ((String) r7[0]).intern(), str2);
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", MotionEvent.axisFromString("") + 1, (char) (8564 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), "쮲鿓\uf6a6鎒韔了\ude4d\uf873獸碐ŷ芄䒊᪰", "㭥\ufe1d猢蜡", objArr);
    }
}
