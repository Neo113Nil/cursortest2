package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class aj extends loadFromXML<LinearLayout> implements containsValue {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long ConfigParameters;
    private static final String ThreeDS2Service;
    private static int addParam;
    private static final String cleanup;
    private static final String get;
    private static int getParamValue;
    private static final String getWarnings;
    private final String ThreeDS2ServiceInitializationCallback;
    protected LinearLayout ThreeDS2ServiceInstance;
    private final ak createTransaction;
    private final ThreeDS2ServiceInstance getSDKInfo;
    private final jr getSDKVersion;
    private final String onCompleted;
    private TextView onError;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.aj$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] ThreeDS2Service;
        static final /* synthetic */ int[] ThreeDS2ServiceInstance;
        private static int get = 0;
        private static int getWarnings = 1;

        static {
            int[] iArr = new int[setStackTrace.values().length];
            ThreeDS2ServiceInstance = iArr;
            try {
                iArr[setStackTrace.ThreeDS2ServiceInstance.ordinal()] = 1;
                int i = get;
                getWarnings = (((i | 23) << 1) - (i ^ 23)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ThreeDS2ServiceInstance[setStackTrace.initialize.ordinal()] = 2;
                int i2 = get;
                int i3 = i2 & 21;
                getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m$1(i3, ~(-(-((i2 ^ 21) | i3))), 1, 128);
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ThreeDS2ServiceInstance.values().length];
            ThreeDS2Service = iArr2;
            try {
                iArr2[ThreeDS2ServiceInstance.ThreeDS2Service.ordinal()] = 1;
                int i4 = get;
                getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m$1((i4 | 107) << 1, ~(-(((~i4) & 107) | (i4 & (-108)))), 1, 128);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ThreeDS2Service[ThreeDS2ServiceInstance.getWarnings.ordinal()] = 2;
                get = (getWarnings + 47) % 128;
            } catch (NoSuchFieldError unused4) {
            }
            int i5 = getWarnings;
            int i6 = (i5 ^ 44) + ((i5 & 44) << 1);
            int i7 = (i6 ^ (-1)) + (i6 << 1);
            get = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 41 / 0;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ThreeDS2ServiceInstance {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        public static final ThreeDS2ServiceInstance ThreeDS2Service;
        private static char[] ThreeDS2ServiceInstance;
        private static int cleanup;
        private static int createTransaction;
        private static int get;
        private static boolean getSDKInfo;
        private static boolean getSDKVersion;
        public static final ThreeDS2ServiceInstance getWarnings;
        private static final /* synthetic */ ThreeDS2ServiceInstance[] initialize;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            createTransaction = 0;
            cleanup = 1;
            initialize();
            Object[] objArr = new Object[1];
            a(null, null, 126 - TextUtils.lastIndexOf("", '0'), "\u0086\u0085\u0082\u0084\u0083\u0082\u0081", objArr);
            ThreeDS2Service = new ThreeDS2ServiceInstance(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            a(null, null, 127 - (ViewConfiguration.getFadingEdgeLength() >> 16), "\u0082\u0088\u0087\u0084\u0083\u0082\u0081", objArr2);
            getWarnings = new ThreeDS2ServiceInstance(((String) objArr2[0]).intern(), 1);
            initialize = ThreeDS2ServiceInstance();
            int i = cleanup + 65;
            createTransaction = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        private ThreeDS2ServiceInstance(String str, int i) {
        }

        private static /* synthetic */ ThreeDS2ServiceInstance[] ThreeDS2ServiceInstance() {
            int i = (createTransaction + 5) % 128;
            cleanup = i;
            ThreeDS2ServiceInstance[] threeDS2ServiceInstanceArr = {ThreeDS2Service, getWarnings};
            createTransaction = (i + 113) % 128;
            return threeDS2ServiceInstanceArr;
        }

        private static void a(String str, int[] iArr, int i, String str2, Object[] objArr) {
            int i2;
            char[] cArr;
            long j;
            char[] cArr2;
            Class cls;
            int i3;
            Object method;
            String str3 = str2;
            byte[] bArr = str3;
            if (str3 != null) {
                bArr = str3.getBytes("ISO-8859-1");
            }
            byte[] bArr2 = bArr;
            char[] charArray = str != null ? str.toCharArray() : str;
            onError onerror = new onError();
            char[] cArr3 = ThreeDS2ServiceInstance;
            Class cls2 = Integer.TYPE;
            int i4 = 0;
            if (cArr3 != null) {
                int length = cArr3.length;
                char[] cArr4 = new char[length];
                int i5 = 0;
                while (i5 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj = map.get(-939298638);
                        if (obj != null) {
                            cArr2 = cArr3;
                            method = obj;
                            cls = cls2;
                            i3 = length;
                        } else {
                            cArr2 = cArr3;
                            Class cls3 = (Class) removeParam.initialize(72 - ((Process.getThreadPriority(i4) + 20) >> 6), (char) Color.argb(i4, i4, i4, i4), (-16775811) - Color.rgb(i4, i4, i4));
                            Object[] objArr3 = new Object[1];
                            cls = cls2;
                            i3 = length;
                            b((short) 0, (byte) 1, (short) -1, objArr3);
                            method = cls3.getMethod((String) objArr3[0], cls);
                            map.put(-939298638, method);
                        }
                        cArr4[i5] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        i5++;
                        cArr3 = cArr2;
                        cls2 = cls;
                        length = i3;
                        i4 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr3 = cArr4;
            }
            Class cls4 = cls2;
            Object[] objArr4 = {Integer.valueOf(get)};
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj2 = map2.get(-1598850155);
            if (obj2 == null) {
                Class cls5 = (Class) removeParam.initialize(73 - TextUtils.indexOf("", "", 0), (char) (7530 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 2489 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                Object[] objArr5 = new Object[1];
                b((short) 0, (byte) 0, (short) -1, objArr5);
                obj2 = cls5.getMethod((String) objArr5[0], cls4);
                map2.put(-1598850155, obj2);
            }
            int intValue = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
            long j2 = 0;
            if (getSDKInfo) {
                int length2 = bArr2.length;
                onerror.ThreeDS2ServiceInstance = length2;
                char[] cArr5 = new char[length2];
                onerror.getWarnings = 0;
                while (true) {
                    int i6 = onerror.getWarnings;
                    int i7 = onerror.ThreeDS2ServiceInstance;
                    if (i6 >= i7) {
                        objArr[0] = new String(cArr5);
                        return;
                    }
                    cArr5[i6] = (char) (cArr3[bArr2[(i7 - 1) - i6] + i] - intValue);
                    Object[] objArr6 = {onerror, onerror};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(73542081);
                    if (obj3 != null) {
                        j = j2;
                    } else {
                        j = j2;
                        obj3 = ((Class) removeParam.initialize(48 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (1 - (Process.getElapsedCpuTime() > j2 ? 1 : (Process.getElapsedCpuTime() == j2 ? 0 : -1))), KeyEvent.getDeadChar(0, 0) + 11441)).getMethod("k", Object.class, Object.class);
                        map3.put(73542081, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr6);
                    j2 = j;
                }
            } else if (getSDKVersion) {
                int i8 = $11 + 79;
                int i9 = i8 % 128;
                $10 = i9;
                if (i8 % 2 != 0) {
                    int length3 = charArray.length;
                    onerror.ThreeDS2ServiceInstance = length3;
                    cArr = new char[length3];
                    i2 = 0;
                } else {
                    i2 = 0;
                    int length4 = charArray.length;
                    onerror.ThreeDS2ServiceInstance = length4;
                    cArr = new char[length4];
                }
                onerror.getWarnings = i2;
                $11 = (i9 + 87) % 128;
                while (true) {
                    int i10 = onerror.getWarnings;
                    int i11 = onerror.ThreeDS2ServiceInstance;
                    if (i10 >= i11) {
                        String str4 = new String(cArr);
                        $11 = ($10 + 3) % 128;
                        objArr[0] = str4;
                        return;
                    }
                    cArr[i10] = (char) (cArr3[charArray[(i11 - 1) - i10] - i] - intValue);
                    Object[] objArr7 = {onerror, onerror};
                    Map map4 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map4.get(73542081);
                    if (obj4 == null) {
                        obj4 = ((Class) removeParam.initialize((KeyEvent.getMaxKeyCode() >> 16) + 48, (char) (Process.getGidForName("") + 1), ExpandableListView.getPackedPositionType(0L) + 11441)).getMethod("k", Object.class, Object.class);
                        map4.put(73542081, obj4);
                    }
                    ((Method) obj4).invoke(null, objArr7);
                }
            } else {
                int length5 = iArr.length;
                onerror.ThreeDS2ServiceInstance = length5;
                char[] cArr6 = new char[length5];
                onerror.getWarnings = 0;
                while (true) {
                    int i12 = onerror.getWarnings;
                    int i13 = onerror.ThreeDS2ServiceInstance;
                    if (i12 >= i13) {
                        objArr[0] = new String(cArr6);
                        return;
                    } else {
                        cArr6[i12] = (char) (cArr3[iArr[(i13 - 1) - i12] - i] - intValue);
                        onerror.getWarnings = i12 + 1;
                        $10 = ($11 + 119) % 128;
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(short s, byte b, short s2, Object[] objArr) {
            int i;
            byte[] bArr = $$a;
            int i2 = s * 4;
            int i3 = s2 + 4;
            int i4 = 109 - b;
            byte[] bArr2 = new byte[1 - i2];
            int i5 = 0 - i2;
            if (bArr == null) {
                i4 = i5;
                byte[] bArr3 = bArr;
                int i6 = 0;
                int i7 = i3;
                i4 += i3;
                i3 = i7;
                bArr = bArr3;
                i = i6;
                bArr2[i] = (byte) i4;
                int i8 = i3 + 1;
                if (i == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                byte b2 = bArr[i8];
                byte[] bArr4 = bArr;
                i7 = i8;
                i3 = b2;
                i6 = i + 1;
                bArr3 = bArr4;
                i4 += i3;
                i3 = i7;
                bArr = bArr3;
                i = i6;
                bArr2[i] = (byte) i4;
                int i82 = i3 + 1;
                if (i == i5) {
                }
            } else {
                i = 0;
                bArr2[i] = (byte) i4;
                int i822 = i3 + 1;
                if (i == i5) {
                }
            }
        }

        public static void init$0() {
            $$a = new byte[]{87, 103, 104, 7};
            $$b = 58;
        }

        public static void initialize() {
            ThreeDS2ServiceInstance = new char[]{15107, 15134, 15125, 15086, 15135, 15104, 15121, 15126};
            get = 993475405;
            getSDKVersion = true;
            getSDKInfo = true;
        }

        public static ThreeDS2ServiceInstance valueOf(String str) {
            int i = createTransaction + 85;
            cleanup = i % 128;
            if (i % 2 == 0) {
                Enum.valueOf(ThreeDS2ServiceInstance.class, str);
                throw null;
            }
            ThreeDS2ServiceInstance threeDS2ServiceInstance = (ThreeDS2ServiceInstance) Enum.valueOf(ThreeDS2ServiceInstance.class, str);
            createTransaction = (cleanup + 87) % 128;
            return threeDS2ServiceInstance;
        }

        public static ThreeDS2ServiceInstance[] values() {
            int i = createTransaction + 71;
            cleanup = i % 128;
            if (i % 2 != 0) {
                return (ThreeDS2ServiceInstance[]) initialize.clone();
            }
            int i2 = 40 / 0;
            return (ThreeDS2ServiceInstance[]) initialize.clone();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        addParam = 0;
        getParamValue = 1;
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        a("叽耇\uf428⠿᱖灵ꑽ预", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 54250, objArr);
        cleanup = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("叾巩俬秙毽ᗰ߸㇝⎡ⶹ", (-16773623) - Color.rgb(0, 0, 0), objArr2);
        get = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a("又ﳰෟ廆\uefb8㢐䦐驰⭀瑏蕰혳朄뀊샨ᇾꋘ\uf3a0Ჯ궱ﺘད塛\ue959㨱䬳鐨ⓩ痠蛾ퟀ悯", 44819 - (Process.myTid() >> 22), objArr3);
        getWarnings = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a("又擜㶇\uf642輈䟴ᢘ테\uea20ꋓ箸\u0c57씔鷎嚐潒‘\uf8cc놗䩵̈\udbf5\uec93ꕅ縑㛏쾠聍夐ᇡ⪁\ue349", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 14143, objArr4);
        ThreeDS2Service = ((String) objArr4[0]).intern();
        addParam = (getParamValue + 1) % 128;
    }

    public aj(Context context, jr jrVar, ThreeDS2ServiceInstance threeDS2ServiceInstance, ak akVar, String str, String str2) {
        super(context);
        this.getSDKVersion = jrVar;
        this.getSDKInfo = threeDS2ServiceInstance;
        this.createTransaction = akVar;
        this.ThreeDS2ServiceInitializationCallback = str;
        this.onCompleted = str2;
    }

    public static aj ThreeDS2ServiceInstance(Context context, jr jrVar, jq jqVar) {
        ak ThreeDS2ServiceInstance2 = ak.ThreeDS2ServiceInstance(context, jqVar);
        ThreeDS2ServiceInstance threeDS2ServiceInstance = ThreeDS2ServiceInstance.ThreeDS2Service;
        Object[] objArr = new Object[1];
        a("又擜㶇\uf642輈䟴ᢘ테\uea20ꋓ箸\u0c57씔鷎嚐潒‘\uf8cc놗䩵̈\udbf5\uec93ꕅ縑㛏쾠聍夐ᇡ⪁\ue349", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 14143, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("叮캰楆萞⚵䅁ﰝẹ륀퐯皪酃మ꺿쥃搗蚱⅄尒ﺬ᥎됑횜煋\uec1bິ\ua95d쐃暞腎㰔庾沈ᐗ뚩텷䰦\ueea8ॲꐜ욠慼", View.getDefaultSize(0, 0) + 40277, objArr2);
        aj ajVar = new aj(context, jrVar, threeDS2ServiceInstance, ThreeDS2ServiceInstance2, intern, ((String) objArr2[0]).intern());
        addParam = (getParamValue + 15) % 128;
        return ajVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b8, code lost:
    
        r0[r4] = (char) r5[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01be, code lost:
    
        r0 = new java.lang.Object[]{r3, r3};
        r2 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
        r3 = r2.get(-1840119381);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ce, code lost:
    
        if (r3 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0206, code lost:
    
        ((java.lang.reflect.Method) r3).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x020b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d1, code lost:
    
        r3 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 76, (char) (62096 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1))), android.graphics.Color.argb(0, 0, 0, 0) + 2102);
        r4 = new java.lang.Object[1];
        b(0, 0, 0, r4);
        r3 = r3.getMethod((java.lang.String) r4[0], java.lang.Object.class, java.lang.Object.class);
        r2.put(-1840119381, r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(String str, int i, Object[] objArr) {
        char[] cArr;
        Throwable cause;
        short s;
        if (str != null) {
            cArr = str.toCharArray();
            $11 = ($10 + 75) % 128;
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        addParam addparam = new addParam();
        addparam.initialize = i;
        int length = cArr2.length;
        long[] jArr = new long[length];
        short s2 = 0;
        addparam.ThreeDS2Service = 0;
        while (true) {
            int i2 = addparam.ThreeDS2Service;
            if (i2 >= cArr2.length) {
                break;
            }
            int i3 = $11 + 77;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            Class cls = Integer.TYPE;
            if (i4 != 0) {
                char c = cArr2[i2];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[2] = addparam;
                    objArr2[1] = addparam;
                    objArr2[s2] = Integer.valueOf(c);
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-983980093);
                    if (obj != null) {
                        s = s2;
                    } else {
                        s = s2;
                        Method method = ((Class) removeParam.initialize(66 - Color.argb((int) s2, (int) s2, (int) s2, (int) s2), (char) TextUtils.indexOf("", ""), 12511 - TextUtils.indexOf("", ""))).getMethod("e", cls, Object.class, Object.class);
                        map.put(-983980093, method);
                        obj = method;
                    }
                    jArr[i2] = ((Long) ((Method) obj).invoke(null, objArr2)).longValue() / (ConfigParameters | 6009743645011411028L);
                    Object[] objArr3 = new Object[2];
                    objArr3[1] = addparam;
                    objArr3[s] = addparam;
                    Object obj2 = map.get(-1840119381);
                    if (obj2 == null) {
                        short s3 = s;
                        Class cls2 = (Class) removeParam.initialize(View.resolveSizeAndState(s3, s3, s3) + 76, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 62098), Color.rgb((int) s3, (int) s3, (int) s3) + 16779318);
                        Object[] objArr4 = new Object[1];
                        b(s3, s3, s3, objArr4);
                        obj2 = cls2.getMethod((String) objArr4[s3], Object.class, Object.class);
                        map.put(-1840119381, obj2);
                    }
                    ((Method) obj2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                Object[] objArr5 = {Integer.valueOf(cArr2[i2]), addparam, addparam};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(-983980093);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(TextUtils.lastIndexOf("", '0', 0, 0) + 67, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 12511)).getMethod("e", cls, Object.class, Object.class);
                    map2.put(-983980093, obj3);
                }
                jArr[i2] = ((Long) ((Method) obj3).invoke(null, objArr5)).longValue() ^ (ConfigParameters ^ 6009743645011411028L);
                Object[] objArr6 = {addparam, addparam};
                Object obj4 = map2.get(-1840119381);
                if (obj4 == null) {
                    Class cls3 = (Class) removeParam.initialize(76 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 62097), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2101);
                    Object[] objArr7 = new Object[1];
                    b((short) 0, (short) 0, (short) 0, objArr7);
                    obj4 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(-1840119381, obj4);
                }
                ((Method) obj4).invoke(null, objArr6);
            }
            s2 = 0;
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr3 = new char[length];
        addparam.ThreeDS2Service = 0;
        while (true) {
            int i5 = addparam.ThreeDS2Service;
            if (i5 >= cArr2.length) {
                String str2 = new String(cArr3);
                int i6 = $10 + 25;
                $11 = i6 % 128;
                if (i6 % 2 != 0) {
                    objArr[0] = str2;
                    return;
                } else {
                    int i7 = 41 / 0;
                    objArr[0] = str2;
                    return;
                }
            }
            int i8 = $10 + 111;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                break;
            }
            cArr3[i5] = (char) jArr[i5];
            Object[] objArr8 = {addparam, addparam};
            Map map3 = removeParam.visaSchemeConfiguration;
            Object obj5 = map3.get(-1840119381);
            if (obj5 == null) {
                Class cls4 = (Class) removeParam.initialize(76 - ExpandableListView.getPackedPositionType(0L), (char) (62097 - View.getDefaultSize(0, 0)), 2101 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                Object[] objArr9 = new Object[1];
                b((short) 0, (short) 0, (short) 0, objArr9);
                obj5 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                map3.put(-1840119381, obj5);
            }
            ((Method) obj5).invoke(null, objArr8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(short s, short s2, short s3, Object[] objArr) {
        int i;
        int i2;
        int i3 = 1 - (s * 3);
        int i4 = (s3 * 2) + 99;
        byte[] bArr = $$a;
        int i5 = (s2 * 4) + 4;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            i4 = i3;
            i4 += i6;
            i5++;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = bArr[i5];
            i4 += i6;
            i5++;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{121, -78, -70, -38};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE;
    }

    public static aj initialize(Context context, jr jrVar, jq jqVar) {
        ak akVar = (ak) ak.initialize(new Object[]{context, jqVar}, 28329460, -28329460, (int) System.currentTimeMillis());
        ThreeDS2ServiceInstance threeDS2ServiceInstance = ThreeDS2ServiceInstance.getWarnings;
        Object[] objArr = new Object[1];
        a("又ﳰෟ廆\uefb8㢐䦐驰⭀瑏蕰혳朄뀊샨ᇾꋘ\uf3a0Ჯ궱ﺘད塛\ue959㨱䬳鐨ⓩ痠蛾ퟀ悯", 44819 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("叮楒⚂\ue3c4뤽登㎩죫虐䎽ᣞ혹鍆ꢥ旧⍕\uf891뗆猶ࡶ얦苫塨ᖙ틋\ue826ꕩ抹㿖\uf554느俜Բ쉮龴哧ቮ⾒\ue4c6ꈎ罰㒮", MotionEvent.axisFromString("") + 15032, objArr2);
        aj ajVar = new aj(context, jrVar, threeDS2ServiceInstance, akVar, intern, ((String) objArr2[0]).intern());
        addParam = (getParamValue + 109) % 128;
        return ajVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.notifyAll.getWarnings.equals(r9.get()) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x012f, code lost:
    
        r8.createTransaction.ThreeDS2Service().setImportantForAutofill(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        r0 = com.netcetera.threeds.sdk.infrastructure.aj.AnonymousClass3.ThreeDS2ServiceInstance[r9.initialize().ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00be, code lost:
    
        if (r0 == 1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c0, code lost:
    
        if (r0 == 2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
    
        r0 = r8.createTransaction.ThreeDS2Service();
        r2 = new java.lang.Object[1];
        a("叽耇\uf428⠿᱖灵ꑽ预", (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 54252, r2);
        r0.setAutofillHints(((java.lang.String) r2[0]).intern());
        r8.createTransaction.ThreeDS2Service().setImportantForAutofill(1);
        com.netcetera.threeds.sdk.infrastructure.aj.addParam = (com.netcetera.threeds.sdk.infrastructure.aj.getParamValue + 31) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ff, code lost:
    
        r0 = r8.createTransaction.ThreeDS2Service();
        r2 = new java.lang.Object[1];
        a("叾巩俬秙毽ᗰ߸㇝⎡ⶹ", 3593 - android.graphics.Color.green(0), r2);
        r0.setAutofillHints(((java.lang.String) r2[0]).intern());
        r8.createTransaction.ThreeDS2Service().setImportantForAutofill(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b0, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.notifyAll.getWarnings.equals(r9.get()) != false) goto L29;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.writeReplace
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ThreeDS2Service(setScroller setscroller) {
        setImeHintLocales apiKey;
        int i = addParam + 21;
        getParamValue = i % 128;
        if (i % 2 == 0) {
            initialize();
            int i2 = AnonymousClass3.ThreeDS2Service[this.getSDKInfo.ordinal()];
            throw null;
        }
        initialize();
        int i3 = AnonymousClass3.ThreeDS2Service[this.getSDKInfo.ordinal()];
        if (i3 == 1) {
            apiKey = setscroller.apiKey();
        } else {
            if (i3 != 2) {
                Object[] objArr = new Object[1];
                a("叄罰\u0add확\ue1ad贻墛殨㝷싓\uee47릨䔆႔⎧콤髄\ua63e熾", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11410, objArr);
                a$$ExternalSyntheticBUOutline0.m$1(((String) objArr[0]).intern());
                return;
            }
            apiKey = setscroller.restrictedParameters();
        }
        if (!apiKey.createTransaction()) {
            this.ThreeDS2ServiceInstance.setVisibility(8);
            return;
        }
        ThreeDS2Service(apiKey.getWarnings());
        if (fillInStackTrace.get.equals(apiKey.ThreeDS2ServiceInstance())) {
            this.createTransaction.ThreeDS2Service().setInputType(2);
        }
        if (!(!printStackTrace.get.equals(apiKey.ThreeDS2ServiceInitializationCallback()))) {
            this.createTransaction.ThreeDS2ServiceInstance();
        }
        if (getStackTrace.ThreeDS2ServiceInstance.equals(apiKey.cleanup())) {
            this.createTransaction.getWarnings();
        }
        int i4 = addParam + 1;
        getParamValue = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
        if (apiKey.ThreeDS2Service() != null) {
            this.createTransaction.ThreeDS2Service().setFilters(new InputFilter[]{new InputFilter.LengthFilter(apiKey.ThreeDS2Service().intValue())});
        }
    }

    public LinearLayout av_(Context context) {
        this.ThreeDS2ServiceInstance = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        this.ThreeDS2ServiceInstance.setLayoutParams(layoutParams);
        this.ThreeDS2ServiceInstance.setGravity(1);
        this.ThreeDS2ServiceInstance.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        TextView textView = new TextView(context);
        this.onError = textView;
        textView.setLayoutParams(layoutParams2);
        this.onError.setGravity(8388611);
        this.onError.setVisibility(8);
        TextView textView2 = this.onError;
        int i = es.ThreeDS2Service;
        textView2.setPadding(0, i, 0, i);
        getWarnings(this.onError, this.onCompleted);
        this.ThreeDS2ServiceInstance.addView(this.onError);
        this.ThreeDS2ServiceInstance.addView(this.createTransaction.ThreeDS2Service());
        et.bn_(this.onError, this.getSDKVersion, 1);
        LinearLayout linearLayout = this.ThreeDS2ServiceInstance;
        int i2 = getParamValue + 115;
        addParam = i2 % 128;
        if (i2 % 2 == 0) {
            return linearLayout;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r4.createTransaction.ThreeDS2Service().setEnabled(false);
        r4 = r4.createTransaction.ThreeDS2Service().getText().toString();
        r0 = com.netcetera.threeds.sdk.infrastructure.aj.addParam + 25;
        com.netcetera.threeds.sdk.infrastructure.aj.getParamValue = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if ((r0 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        if (r1.ThreeDS2Service() != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0049, code lost:
    
        r4 = com.netcetera.threeds.sdk.infrastructure.aj.getParamValue + 91;
        com.netcetera.threeds.sdk.infrastructure.aj.addParam = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0053, code lost:
    
        if ((r4 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0055, code lost:
    
        r4 = 71 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0058, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getWarnings() {
        int i = getParamValue + 11;
        addParam = i % 128;
        int i2 = i % 2;
        ak akVar = this.createTransaction;
        if (i2 != 0) {
            EditText ThreeDS2Service2 = akVar.ThreeDS2Service();
            int i3 = 46 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.loadFromXML
    public /* synthetic */ LinearLayout ThreeDS2ServiceInstance(Context context) {
        int i = addParam + 83;
        getParamValue = i % 128;
        if (i % 2 == 0) {
            av_(context);
            throw null;
        }
        LinearLayout av_ = av_(context);
        int i2 = addParam + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getParamValue = i2 % 128;
        if (i2 % 2 != 0) {
            return av_;
        }
        throw null;
    }

    public static void ThreeDS2ServiceInstance() {
        ConfigParameters = -5990084274306001959L;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void getWarnings(eq eqVar) {
        int i = getParamValue + 89;
        addParam = i % 128;
        int i2 = i % 2;
        ak akVar = this.createTransaction;
        if (i2 != 0) {
            eqVar.ThreeDS2Service(this.ThreeDS2ServiceInitializationCallback, String.valueOf(akVar.ThreeDS2Service().getText()));
            this.createTransaction.getWarnings(eqVar);
            int i3 = 71 / 0;
        } else {
            eqVar.ThreeDS2Service(this.ThreeDS2ServiceInitializationCallback, String.valueOf(akVar.ThreeDS2Service().getText()));
            this.createTransaction.getWarnings(eqVar);
        }
        int i4 = getParamValue + 13;
        addParam = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void getWarnings(er erVar) {
        initialize();
        this.createTransaction.getWarnings(erVar);
        String initialize = erVar.initialize(this.ThreeDS2ServiceInitializationCallback, null);
        if (oj.initialize(initialize)) {
            int i = getParamValue + 53;
            addParam = i % 128;
            int i2 = i % 2;
            ak akVar = this.createTransaction;
            if (i2 == 0) {
                akVar.ThreeDS2Service().setText(initialize);
                getParamValue = (addParam + 87) % 128;
            } else {
                akVar.ThreeDS2Service().setText(initialize);
                throw null;
            }
        }
        int i3 = getParamValue + 17;
        addParam = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 3 / 0;
        }
    }

    private void ThreeDS2Service(String str) {
        if (!oj.getWarnings((CharSequence) str)) {
            int i = getParamValue + 93;
            addParam = i % 128;
            int i2 = i % 2;
            this.onError.setText(str);
            this.onError.setVisibility(0);
            this.onError.setContentDescription(str);
        } else {
            this.onError.setVisibility(8);
        }
        addParam = (getParamValue + 3) % 128;
    }
}
