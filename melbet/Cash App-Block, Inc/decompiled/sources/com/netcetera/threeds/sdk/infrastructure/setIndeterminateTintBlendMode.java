package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes5.dex */
public final class setIndeterminateTintBlendMode {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final String ConfigParameters;
    public static final String ConfigurationBuilder;
    private static int SchemeConfiguration;
    public static final String ThreeDS2Service;
    public static final String ThreeDS2ServiceInitializationCallback;
    public static final String ThreeDS2ServiceInstance;
    public static final String addParam;
    public static final String amexConfiguration;
    public static final String apiKey;
    private static long build;
    private static char[] cbConfiguration;
    public static final String cleanup;
    public static final String configureScheme;
    public static final String createTransaction;
    private static char dinersSchemeConfiguration;
    private static int eftposConfiguration;
    public static final DateFormat get;
    public static final String getParamValue;
    public static final String getSDKInfo;
    public static final String getSDKVersion;
    public static final String getWarnings;
    public static final String initialize;
    private static int jcbConfiguration;
    public static final String mastercardSchemeConfiguration;
    public static final String onCompleted;
    public static final String onError;
    public static final String removeParam;
    public static final String restrictedParameters;
    private static char visaSchemeConfiguration;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class get {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        public static final get ThreeDS2Service;
        private static int ThreeDS2ServiceInitializationCallback;
        public static final get ThreeDS2ServiceInstance;
        private static int[] createTransaction;
        public static final get get;
        private static int getSDKInfo;
        private static final /* synthetic */ get[] getSDKVersion;
        public static final get getWarnings;
        private final String initialize;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            ThreeDS2ServiceInitializationCallback = 0;
            getSDKInfo = 1;
            ThreeDS2ServiceInstance();
            Object[] objArr = new Object[1];
            a(new int[]{147448405, 1518536022, 946267228, 96521668}, 6 - (Process.myTid() >> 22), objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(new int[]{147448405, 1518536022, 946267228, 96521668}, 7 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr2);
            ThreeDS2ServiceInstance = new get(intern, 0, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a(new int[]{927262439, 516600642, -516250437, -1393624276}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6, objArr3);
            String intern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a(new int[]{927262439, 516600642, -516250437, -1393624276}, 7 - (ViewConfiguration.getWindowTouchSlop() >> 8), objArr4);
            getWarnings = new get(intern2, 1, ((String) objArr4[0]).intern());
            Object[] objArr5 = new Object[1];
            a(new int[]{-1795215947, -1607625024, -15259328, 792834050, 1780409796, 335946796, -1692164660, -566451356}, Drawable.resolveOpacity(0, 0) + 14, objArr5);
            String intern3 = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            a(new int[]{-1795215947, -1607625024, -15259328, 792834050, 1780409796, 335946796, -1692164660, -566451356}, (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 14, objArr6);
            ThreeDS2Service = new get(intern3, 2, ((String) objArr6[0]).intern());
            Object[] objArr7 = new Object[1];
            a(new int[]{162322832, -747958582, 1600786343, -640333681, -826002536, -167260345, 594583088, 656089853}, (ViewConfiguration.getScrollBarSize() >> 8) + 13, objArr7);
            String intern4 = ((String) objArr7[0]).intern();
            Object[] objArr8 = new Object[1];
            a(new int[]{162322832, -747958582, 1600786343, -640333681, -826002536, -167260345, 594583088, 656089853}, TextUtils.getOffsetBefore("", 0) + 13, objArr8);
            get = new get(intern4, 3, ((String) objArr8[0]).intern());
            getSDKVersion = initialize();
            int i = ThreeDS2ServiceInitializationCallback + 71;
            getSDKInfo = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        private get(String str, int i, String str2) {
            this.initialize = str2;
        }

        public static void ThreeDS2ServiceInstance() {
            createTransaction = new int[]{1483314167, -468303986, -300459201, -2036776065, 726967391, -1193364948, 113281533, -226195934, 1271136401, 325900975, 698123812, -501921281, 1539433436, -1900971712, 935086227, 1132898757, 1343521273, -1488954069};
        }

        private static void a(int[] iArr, int i, Object[] objArr) {
            int i2;
            char c;
            int i3;
            Object method;
            int length;
            int[] iArr2;
            int[] iArr3;
            int i4;
            int[] iArr4;
            char[] cArr;
            int i5;
            Object method2;
            createTransaction createtransaction = new createTransaction();
            char[] cArr2 = new char[4];
            char[] cArr3 = new char[iArr.length * 2];
            int[] iArr5 = createTransaction;
            Class cls = Integer.TYPE;
            int i6 = 0;
            if (iArr5 != null) {
                $11 = ($10 + 17) % 128;
                int length2 = iArr5.length;
                c = 17;
                int[] iArr6 = new int[length2];
                i2 = 2;
                int i7 = 0;
                while (i7 < length2) {
                    $10 = ($11 + 25) % 128;
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr5[i7])};
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj = map.get(2095751688);
                        if (obj != null) {
                            cArr = cArr2;
                            i5 = i7;
                            method2 = obj;
                        } else {
                            Class cls2 = (Class) removeParam.initialize(64 - (ViewConfiguration.getScrollBarSize() >> 8), (char) View.MeasureSpec.makeMeasureSpec(i6, i6), 1197 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                            Object[] objArr3 = new Object[1];
                            cArr = cArr2;
                            i5 = i7;
                            b(-1, (byte) 0, 1, objArr3);
                            method2 = cls2.getMethod((String) objArr3[0], cls);
                            map.put(2095751688, method2);
                        }
                        iArr6[i5] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                        i7 = i5 + 1;
                        cArr2 = cArr;
                        i6 = 0;
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
                i2 = 2;
                c = 17;
            }
            char[] cArr4 = cArr2;
            int length3 = iArr5.length;
            int[] iArr7 = new int[length3];
            int[] iArr8 = createTransaction;
            if (iArr8 != null) {
                int i8 = $10 + 49;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    length = iArr8.length;
                    iArr2 = new int[length];
                } else {
                    length = iArr8.length;
                    iArr2 = new int[length];
                }
                int i9 = 0;
                while (i9 < length) {
                    Object[] objArr4 = {Integer.valueOf(iArr8[i9])};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(2095751688);
                    if (obj2 != null) {
                        iArr3 = iArr8;
                        i4 = length;
                        iArr4 = iArr2;
                    } else {
                        iArr3 = iArr8;
                        Class cls3 = (Class) removeParam.initialize(Gravity.getAbsoluteGravity(0, 0) + 64, (char) View.getDefaultSize(0, 0), (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 1196);
                        Object[] objArr5 = new Object[1];
                        i4 = length;
                        iArr4 = iArr2;
                        b(-1, (byte) 0, 1, objArr5);
                        obj2 = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(2095751688, obj2);
                    }
                    iArr4[i9] = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
                    i9++;
                    iArr8 = iArr3;
                    length = i4;
                    iArr2 = iArr4;
                }
                iArr8 = iArr2;
            }
            System.arraycopy(iArr8, 0, iArr7, 0, length3);
            createtransaction.initialize = 0;
            while (true) {
                int i10 = createtransaction.initialize;
                if (i10 >= iArr.length) {
                    objArr[0] = new String(cArr3, 0, i);
                    return;
                }
                $11 = ($10 + 105) % 128;
                int i11 = iArr[i10];
                char c2 = (char) (i11 >> 16);
                cArr4[0] = c2;
                char c3 = (char) i11;
                cArr4[1] = c3;
                int i12 = 16;
                char c4 = (char) (iArr[i10 + 1] >> 16);
                cArr4[i2] = c4;
                char c5 = (char) iArr[i10 + 1];
                cArr4[3] = c5;
                createtransaction.getWarnings = (c2 << 16) + c3;
                createtransaction.get = (c4 << 16) + c5;
                createTransaction.ThreeDS2ServiceInstance(iArr7);
                int i13 = 0;
                while (i13 < i12) {
                    int i14 = $11 + 87;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    int i16 = createtransaction.getWarnings;
                    if (i15 != 0) {
                        int i17 = iArr7[i13] ^ i16;
                        createtransaction.getWarnings = i17;
                        int ThreeDS2Service2 = createTransaction.ThreeDS2Service(i17);
                        Object[] objArr6 = new Object[4];
                        objArr6[3] = createtransaction;
                        objArr6[i2] = createtransaction;
                        objArr6[1] = Integer.valueOf(ThreeDS2Service2);
                        objArr6[0] = createtransaction;
                        Map map3 = removeParam.visaSchemeConfiguration;
                        Object obj3 = map3.get(-411264147);
                        if (obj3 == null) {
                            obj3 = ((Class) removeParam.initialize(49 - Color.green(0), (char) KeyEvent.keyCodeFromString(""), ((Process.getThreadPriority(0) + 20) >> 6) + 13121)).getMethod("y", Object.class, cls, Object.class, Object.class);
                            map3.put(-411264147, obj3);
                        }
                        int intValue = ((Integer) ((Method) obj3).invoke(null, objArr6)).intValue();
                        createtransaction.getWarnings = createtransaction.get;
                        createtransaction.get = intValue;
                        i13 += 99;
                    } else {
                        int i18 = iArr7[i13] ^ i16;
                        createtransaction.getWarnings = i18;
                        int ThreeDS2Service3 = createTransaction.ThreeDS2Service(i18);
                        Object[] objArr7 = new Object[4];
                        objArr7[3] = createtransaction;
                        objArr7[i2] = createtransaction;
                        objArr7[1] = Integer.valueOf(ThreeDS2Service3);
                        objArr7[0] = createtransaction;
                        Map map4 = removeParam.visaSchemeConfiguration;
                        Object obj4 = map4.get(-411264147);
                        if (obj4 != null) {
                            method = obj4;
                            i3 = i12;
                        } else {
                            i3 = i12;
                            method = ((Class) removeParam.initialize(48 - Process.getGidForName(""), (char) (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), Color.green(0) + 13121)).getMethod("y", Object.class, cls, Object.class, Object.class);
                            map4.put(-411264147, method);
                        }
                        int intValue2 = ((Integer) ((Method) method).invoke(null, objArr7)).intValue();
                        createtransaction.getWarnings = createtransaction.get;
                        createtransaction.get = intValue2;
                        i13++;
                        i12 = i3;
                    }
                }
                int i19 = i12;
                int i20 = createtransaction.getWarnings;
                int i21 = createtransaction.get;
                createtransaction.getWarnings = i21;
                createtransaction.get = i20;
                int i22 = i20 ^ iArr7[i19];
                createtransaction.get = i22;
                int i23 = i21 ^ iArr7[c];
                createtransaction.getWarnings = i23;
                cArr4[0] = (char) (i23 >>> 16);
                cArr4[1] = (char) i23;
                cArr4[i2] = (char) (i22 >>> 16);
                cArr4[3] = (char) i22;
                createTransaction.ThreeDS2ServiceInstance(iArr7);
                int i24 = createtransaction.initialize;
                cArr3[i24 * 2] = cArr4[0];
                cArr3[(i24 * 2) + 1] = cArr4[1];
                cArr3[(i24 * 2) + 2] = cArr4[i2];
                cArr3[(i24 * 2) + 3] = cArr4[3];
                Object[] objArr8 = new Object[i2];
                objArr8[1] = createtransaction;
                objArr8[0] = createtransaction;
                Map map5 = removeParam.visaSchemeConfiguration;
                Object obj5 = map5.get(-1870831722);
                if (obj5 == null) {
                    Class cls4 = (Class) removeParam.initialize(ExpandableListView.getPackedPositionType(0L) + 99, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1880);
                    Object[] objArr9 = new Object[1];
                    b(-1, (byte) 0, 0, objArr9);
                    obj5 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                    map5.put(-1870831722, obj5);
                }
                ((Method) obj5).invoke(null, objArr8);
                i2 = 2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(int i, byte b, int i2, Object[] objArr) {
            int i3;
            int i4;
            int i5 = (b * 2) + 1;
            int i6 = 118 - (i2 * 5);
            int i7 = i + 4;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i5];
            if (bArr == null) {
                int i8 = i7;
                int i9 = i5;
                i4 = 0;
                int i10 = i7 + i9;
                int i11 = i8;
                i6 = i10;
                i7 = i11;
                i3 = i4;
                int i12 = i7 + 1;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i6;
                if (i4 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i9 = bArr[i12];
                int i13 = i6;
                i8 = i12;
                i7 = i13;
                int i102 = i7 + i9;
                int i112 = i8;
                i6 = i102;
                i7 = i112;
                i3 = i4;
                int i122 = i7 + 1;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i6;
                if (i4 == i5) {
                }
            } else {
                i3 = 0;
                int i1222 = i7 + 1;
                i4 = i3 + 1;
                bArr2[i3] = (byte) i6;
                if (i4 == i5) {
                }
            }
        }

        public static void init$0() {
            $$a = new byte[]{16, 78, -23, -84};
            $$b = 5;
        }

        private static /* synthetic */ get[] initialize() {
            get[] getVarArr;
            int i = ThreeDS2ServiceInitializationCallback + 71;
            int i2 = i % 128;
            getSDKInfo = i2;
            if (i % 2 == 0) {
                getVarArr = new get[2];
                getVarArr[1] = ThreeDS2ServiceInstance;
                getVarArr[0] = getWarnings;
                getVarArr[4] = ThreeDS2Service;
                getVarArr[2] = get;
            } else {
                getVarArr = new get[]{ThreeDS2ServiceInstance, getWarnings, ThreeDS2Service, get};
            }
            int i3 = i2 + 79;
            ThreeDS2ServiceInitializationCallback = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 36 / 0;
            }
            return getVarArr;
        }

        public static get valueOf(String str) {
            getSDKInfo = (ThreeDS2ServiceInitializationCallback + 37) % 128;
            get getVar = (get) Enum.valueOf(get.class, str);
            int i = ThreeDS2ServiceInitializationCallback + 119;
            getSDKInfo = i % 128;
            if (i % 2 != 0) {
                return getVar;
            }
            throw null;
        }

        public static get[] values() {
            int i = ThreeDS2ServiceInitializationCallback + 115;
            getSDKInfo = i % 128;
            if (i % 2 == 0) {
                getSDKVersion.clone();
                throw null;
            }
            get[] getVarArr = (get[]) getSDKVersion.clone();
            getSDKInfo = (ThreeDS2ServiceInitializationCallback + 25) % 128;
            return getVarArr;
        }

        public String get() {
            int i = getSDKInfo + 43;
            ThreeDS2ServiceInitializationCallback = i % 128;
            int i2 = i % 2;
            String str = this.initialize;
            if (i2 != 0) {
                int i3 = 96 / 0;
            }
            return str;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        jcbConfiguration = 0;
        eftposConfiguration = 1;
        initialize();
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", ExpandableListView.getPackedPositionType(0L), (char) TextUtils.getOffsetAfter("", 0), "饬劰\uef05吠ᆍ㰥潥⢁椋ꐽ뺁껓\udaa6嫴虃\uf358\udb4e㷸茟◉瀇鱞", "\uf1b1\ue886뮙\u0be5", objArr);
        amexConfiguration = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("\u0000\u0000\u0000\u0000", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 547419076, (char) KeyEvent.getDeadChar(0, 0), "\ueabe\udd2c覍\u1aec㿦\uf3ea뮶ƅ뱱伦茭닮ﺖ㞤\ue9c6\ue042൚㽣䈃ڶ떫", "얼ꃳ攠㻴", objArr2);
        mastercardSchemeConfiguration = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a("\u0000\u0000\u0000\u0000", View.combineMeasuredStates(0, 0) + 1343330135, (char) (12605 - View.getDefaultSize(0, 0)), "ᭌ㹳ս", "址ᆗ㵐鐱", objArr3);
        ConfigurationBuilder = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a("\u0000\u0000\u0000\u0000", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 373668490, (char) (ViewConfiguration.getLongPressTimeout() >> 16), "\ueee6\ue86a\uee1a羳琶ﮢﱻҟᫌ", "睏멅勩猨", objArr4);
        apiKey = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        b((byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 5), TextUtils.getOffsetAfter("", 0) + 14, "\u0013\u0010\u0012\u0000\u0010\n\u0004\u0017\b\u0000\u0003\u0010\u0000\u0015", objArr5);
        restrictedParameters = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a("\u0000\u0000\u0000\u0000", (Process.myPid() >> 22) - 1122537084, (char) (TextUtils.lastIndexOf("", '0', 0) + 1), "鼓ꄪﻄ⻙⨺\ue670絧截啍宛粷", "蓔\u1771粽ॆ", objArr6);
        configureScheme = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        a("\u0000\u0000\u0000\u0000", TextUtils.getTrimmedLength(""), (char) (TextUtils.indexOf("", "", 0) + 48017), "㡋㠾橽㋖\ued5d嚲䄂푷듮ࢯ\udfff㸳猇欀⡿骡", "㲐ʋ鄎욻", objArr7);
        removeParam = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a("\u0000\u0000\u0000\u0000", ViewConfiguration.getKeyRepeatDelay() >> 16, (char) (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), "\u2fe0晡䕗㉏䬀呑웓\ueb90▵갵繅뉪", "멳㈱Ť\udf6f", objArr8);
        ConfigParameters = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        b((byte) (AndroidCharacter.getMirror('0') + ','), 11 - Color.alpha(0), "\u0000\u0014\u0010\u0004\u0018\u000b\u0018\u000f\u0016\n㙅", objArr9);
        onCompleted = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        a("\u0000\u0000\u0000\u0000", View.getDefaultSize(0, 0), (char) (60182 - View.combineMeasuredStates(0, 0)), "ꮇᬬ쪵픫곈䍛ạ受당ч\ue865谶᪺\u2fe8榵Ⲡ鸴괳", "㖆铔ᙳ\u1aeb", objArr10);
        getParamValue = ((String) objArr10[0]).intern();
        Object[] objArr11 = new Object[1];
        a("\u0000\u0000\u0000\u0000", View.MeasureSpec.getMode(0), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), "뺓蹈㲱坥듸\udb3f⼬픡\udb60蝒", "ៗ㝻美ᬖ", objArr11);
        addParam = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        a("\u0000\u0000\u0000\u0000", (-1244847475) - TextUtils.indexOf((CharSequence) "", '0'), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), "쨒\ue103薢슞埠Ў꺜㾊\udb22", "蹲촢\uf2b5춚", objArr12);
        onError = ((String) objArr12[0]).intern();
        Object[] objArr13 = new Object[1];
        b((byte) (KeyEvent.getDeadChar(0, 0) + 42), Color.blue(0) + 6, "\u0001\u0017\u0007\u0005\b\u000f", objArr13);
        getSDKVersion = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        a("\u0000\u0000\u0000\u0000", ExpandableListView.getPackedPositionChild(0L) + 1, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 57443), "뀳╳誠嚙", "ጐ\uda3f拱因", objArr14);
        ThreeDS2ServiceInitializationCallback = ((String) objArr14[0]).intern();
        Object[] objArr15 = new Object[1];
        b((byte) (49 - Color.blue(0)), TextUtils.lastIndexOf("", '0') + 6, "\u0018\u0016\u0002\u0014㘏", objArr15);
        getSDKInfo = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        a("\u0000\u0000\u0000\u0000", Color.alpha(0), (char) (58081 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), "蛧\u242d丰\ufae4\ua633犙\u0bd2⹇䱸枇ћ㴔क़鐷", "颤㠶\ue1cf꿢", objArr16);
        cleanup = ((String) objArr16[0]).intern();
        Object[] objArr17 = new Object[1];
        b((byte) (119 - (ViewConfiguration.getEdgeSlop() >> 16)), 10 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\u0018\u0000\u0017\u0013\u0016\u0015\u0018\u0004㙡", objArr17);
        createTransaction = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        a("\u0000\u0000\u0000\u0000", Color.alpha(0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), "塂踭유넿念\uf6a4汿ㄒ悌觷", "沀\ud8df̦蕬", objArr18);
        ThreeDS2Service = ((String) objArr18[0]).intern();
        Object[] objArr19 = new Object[1];
        b((byte) (Color.green(0) + 83), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 5, "\u000f\t\u0007\u0014㙑", objArr19);
        initialize = ((String) objArr19[0]).intern();
        Object[] objArr20 = new Object[1];
        b((byte) (ExpandableListView.getPackedPositionChild(0L) + 96), (ViewConfiguration.getWindowTouchSlop() >> 8) + 6, "\u000f\t\u0002\t\u0013\b", objArr20);
        getWarnings = ((String) objArr20[0]).intern();
        Object[] objArr21 = new Object[1];
        a("\u0000\u0000\u0000\u0000", 1393384869 - Process.getGidForName(""), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 44533), "侎䮳ᫀ蟄켓瀼ᵷඒ\uf6f0뮪⼎럮퓛\ue954䬞", "\ua62e൝\uf453墭", objArr21);
        ThreeDS2ServiceInstance = ((String) objArr21[0]).intern();
        Object[] objArr22 = new Object[1];
        a("\u0000\u0000\u0000\u0000", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (9979 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1))), "鼐푐ݟ\ua63c⢏댿琎㻏㥧櫷\ued4e椪눻쎶", "\ue33e⦕\ufaff✦", objArr22);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((String) objArr22[0]).intern(), Locale.getDefault());
        get = simpleDateFormat;
        Object[] objArr23 = new Object[1];
        a("\u0000\u0000\u0000\u0000", 1980994059 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (11445 - TextUtils.indexOf("", "", 0, 0)), "䐂斘ꆌ", "\u0a11᎒땶̬", objArr23);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(((String) objArr23[0]).intern()));
        int i = jcbConfiguration + 43;
        eftposConfiguration = i % 128;
        if (i % 2 == 0) {
            int i2 = 50 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(String str, int i, char c, String str2, String str3, Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        char[] cArr3;
        Object obj;
        Integer num;
        Object obj2;
        Integer num2;
        int i2;
        Object obj3;
        Object obj4;
        Integer num3 = 246986610;
        Integer num4 = -258783473;
        int i3 = 2;
        if (str3 != null) {
            int i4 = $10 + 111;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                str3.toCharArray();
                throw null;
            }
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr4 = cArr;
        if (str2 != 0) {
            cArr2 = str2.toCharArray();
            $11 = ($10 + 99) % 128;
        } else {
            cArr2 = str2;
        }
        char[] cArr5 = cArr2;
        if (str != null) {
            $11 = ($10 + 81) % 128;
            cArr3 = str.toCharArray();
        } else {
            cArr3 = str;
        }
        char[] cArr6 = cArr3;
        ConfigParameters configParameters = new ConfigParameters();
        int length = cArr4.length;
        char[] cArr7 = new char[length];
        int length2 = cArr6.length;
        char[] cArr8 = new char[length2];
        boolean z = false;
        System.arraycopy(cArr4, 0, cArr7, 0, length);
        System.arraycopy(cArr6, 0, cArr8, 0, length2);
        cArr7[0] = (char) (cArr7[0] ^ c);
        cArr8[2] = (char) (cArr8[2] + ((char) i));
        int length3 = cArr5.length;
        char[] cArr9 = new char[length3];
        configParameters.initialize = 0;
        while (configParameters.initialize < length3) {
            try {
                Object[] objArr2 = {configParameters};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj5 = map.get(num4);
                boolean z2 = z;
                int i5 = i3;
                if (obj5 != null) {
                    obj = obj5;
                } else {
                    Method method = ((Class) removeParam.initialize(58 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 6414 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("j", Object.class);
                    map.put(num4, method);
                    obj = method;
                }
                int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {configParameters};
                Object obj6 = map.get(num3);
                if (obj6 != null) {
                    num = num4;
                    obj2 = obj6;
                } else {
                    num = num4;
                    Method method2 = ((Class) removeParam.initialize((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 62, (char) (11346 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 8577 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("i", Object.class);
                    map.put(num3, method2);
                    obj2 = method2;
                }
                int intValue2 = ((Integer) ((Method) obj2).invoke(null, objArr3)).intValue();
                int i6 = cArr7[configParameters.initialize % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i5] = Integer.valueOf(cArr8[intValue]);
                objArr4[1] = Integer.valueOf(i6);
                objArr4[z2 ? 1 : 0] = configParameters;
                Object obj7 = map.get(828230935);
                Class cls = Integer.TYPE;
                if (obj7 != null) {
                    num2 = num3;
                    i2 = intValue2;
                    obj3 = obj7;
                } else {
                    num2 = num3;
                    i2 = intValue2;
                    Method method3 = ((Class) removeParam.initialize(74 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (Process.myPid() >> 22), 9820 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).getMethod("o", Object.class, cls, cls);
                    map.put(828230935, method3);
                    obj3 = method3;
                }
                ((Method) obj3).invoke(null, objArr4);
                int i7 = cArr7[i2] * 32718;
                char c2 = cArr8[intValue];
                Object[] objArr5 = new Object[i5];
                objArr5[1] = Integer.valueOf(c2);
                objArr5[z2 ? 1 : 0] = Integer.valueOf(i7);
                Object obj8 = map.get(196637707);
                if (obj8 != null) {
                    obj4 = obj8;
                } else {
                    Method method4 = ((Class) removeParam.initialize((Process.myTid() >> 22) + 48, (char) (63350 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), ExpandableListView.getPackedPositionGroup(0L) + 11536)).getMethod("n", cls, cls);
                    map.put(196637707, method4);
                    obj4 = method4;
                }
                cArr8[i2] = ((Character) ((Method) obj4).invoke(null, objArr5)).charValue();
                cArr7[i2] = configParameters.get;
                int i8 = configParameters.initialize;
                cArr9[i8] = (char) ((((int) (SchemeConfiguration ^ (-8880716800597159563L))) ^ ((r2 ^ cArr5[i8]) ^ (build ^ (-8880716800597159563L)))) ^ ((char) (visaSchemeConfiguration ^ (-8880716800597159563L))));
                configParameters.initialize = i8 + 1;
                num4 = num;
                num3 = num2;
                i3 = 2;
                z = z2 ? 1 : 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[z ? 1 : 0] = new String(cArr9);
    }

    private static void b(byte b, int i, String str, Object[] objArr) {
        int i2;
        char c;
        char c2;
        char c3;
        Object method;
        char[] cArr;
        char[] cArr2;
        Object method2;
        int i3 = $10 + 43;
        $11 = i3 % 128;
        char c4 = 2;
        if (i3 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        getParamValue getparamvalue = new getParamValue();
        char[] cArr3 = cbConfiguration;
        Class cls = Integer.TYPE;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    char c5 = c4;
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-78420608);
                    if (obj != null) {
                        cArr = charArray;
                        method2 = obj;
                        cArr2 = cArr3;
                    } else {
                        cArr = charArray;
                        cArr2 = cArr3;
                        Class cls2 = (Class) removeParam.initialize(94 - Color.argb(0, 0, 0, 0), (char) TextUtils.indexOf("", "", 0), Gravity.getAbsoluteGravity(0, 0) + 1559);
                        Object[] objArr3 = new Object[1];
                        c((byte) 0, (short) 0, (short) 1, objArr3);
                        method2 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(-78420608, method2);
                    }
                    cArr4[i4] = ((Character) ((Method) method2).invoke(null, objArr2)).charValue();
                    i4++;
                    c4 = c5;
                    charArray = cArr;
                    cArr3 = cArr2;
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
        char[] cArr5 = charArray;
        char c6 = c4;
        Object[] objArr4 = {Integer.valueOf(dinersSchemeConfiguration)};
        Map map2 = removeParam.visaSchemeConfiguration;
        Object obj2 = map2.get(-78420608);
        char c7 = '0';
        char c8 = '\b';
        if (obj2 == null) {
            Class cls3 = (Class) removeParam.initialize(142 - AndroidCharacter.getMirror('0'), (char) Color.alpha(0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1559);
            Object[] objArr5 = new Object[1];
            c((byte) 0, (short) 0, (short) 1, objArr5);
            obj2 = cls3.getMethod((String) objArr5[0], cls);
            map2.put(-78420608, obj2);
        }
        char charValue = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr6 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr6[i2] = (char) (cArr5[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            $11 = ($10 + 73) % 128;
            getparamvalue.getWarnings = 0;
            while (true) {
                int i5 = getparamvalue.getWarnings;
                if (i5 >= i2) {
                    break;
                }
                char c9 = cArr5[i5];
                getparamvalue.get = c9;
                char c10 = cArr5[i5 + 1];
                getparamvalue.initialize = c10;
                if (c9 == c10) {
                    cArr6[i5] = (char) (c9 - b);
                    cArr6[i5 + 1] = (char) (c10 - b);
                    c = c7;
                    c2 = c8;
                } else {
                    Object[] objArr6 = new Object[13];
                    objArr6[12] = getparamvalue;
                    objArr6[11] = Integer.valueOf(charValue);
                    objArr6[10] = getparamvalue;
                    objArr6[9] = getparamvalue;
                    objArr6[c8] = Integer.valueOf(charValue);
                    objArr6[7] = getparamvalue;
                    objArr6[6] = getparamvalue;
                    objArr6[5] = Integer.valueOf(charValue);
                    objArr6[4] = getparamvalue;
                    objArr6[3] = getparamvalue;
                    objArr6[c6] = Integer.valueOf(charValue);
                    objArr6[1] = getparamvalue;
                    objArr6[0] = getparamvalue;
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(-1395483366);
                    if (obj3 != null) {
                        c = c7;
                        c2 = c8;
                        method = obj3;
                        c3 = '\t';
                    } else {
                        c = c7;
                        c2 = c8;
                        c3 = '\t';
                        Class cls4 = (Class) removeParam.initialize((ViewConfiguration.getLongPressTimeout() >> 16) + 48, (char) ((Process.getThreadPriority(0) + 20) >> 6), View.MeasureSpec.makeMeasureSpec(0, 0) + 3221);
                        Object[] objArr7 = new Object[1];
                        c((byte) 0, (short) 0, (short) 0, objArr7);
                        String str2 = (String) objArr7[0];
                        Class cls5 = Integer.TYPE;
                        method = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                        map3.put(-1395483366, method);
                    }
                    int intValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                    int i6 = getparamvalue.cleanup;
                    if (intValue == i6) {
                        $11 = ($10 + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                        Object[] objArr8 = new Object[11];
                        objArr8[10] = getparamvalue;
                        objArr8[c3] = Integer.valueOf(charValue);
                        objArr8[c2] = getparamvalue;
                        objArr8[7] = Integer.valueOf(charValue);
                        objArr8[6] = Integer.valueOf(charValue);
                        objArr8[5] = getparamvalue;
                        objArr8[4] = getparamvalue;
                        objArr8[3] = Integer.valueOf(charValue);
                        objArr8[c6] = Integer.valueOf(charValue);
                        objArr8[1] = getparamvalue;
                        objArr8[0] = getparamvalue;
                        Object obj4 = map3.get(1507360409);
                        if (obj4 == null) {
                            Class cls6 = (Class) removeParam.initialize(47 - TextUtils.indexOf("", "", 0), (char) (25644 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 11488);
                            Class cls7 = Integer.TYPE;
                            obj4 = cls6.getMethod("x", Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                            map3.put(1507360409, obj4);
                        }
                        int intValue2 = ((Integer) ((Method) obj4).invoke(null, objArr8)).intValue();
                        int i7 = (getparamvalue.ThreeDS2ServiceInstance * charValue) + getparamvalue.cleanup;
                        int i8 = getparamvalue.getWarnings;
                        cArr6[i8] = cArr3[intValue2];
                        cArr6[i8 + 1] = cArr3[i7];
                    } else {
                        int i9 = getparamvalue.ThreeDS2Service;
                        int i10 = getparamvalue.ThreeDS2ServiceInstance;
                        int i11 = getparamvalue.ThreeDS2ServiceInitializationCallback;
                        if (i9 == i10) {
                            int m = Thread$State$EnumUnboxingLocalUtility.m(i11, charValue, 1, charValue);
                            getparamvalue.ThreeDS2ServiceInitializationCallback = m;
                            int m2 = Thread$State$EnumUnboxingLocalUtility.m(i6, charValue, 1, charValue);
                            getparamvalue.cleanup = m2;
                            int i12 = (i10 * charValue) + m2;
                            int i13 = getparamvalue.getWarnings;
                            cArr6[i13] = cArr3[(i9 * charValue) + m];
                            cArr6[i13 + 1] = cArr3[i12];
                        } else {
                            int i14 = (i9 * charValue) + i6;
                            int i15 = getparamvalue.getWarnings;
                            cArr6[i15] = cArr3[i14];
                            cArr6[i15 + 1] = cArr3[(i10 * charValue) + i11];
                        }
                        getparamvalue.getWarnings += 2;
                        $11 = ($10 + 23) % 128;
                        c7 = c;
                        c8 = c2;
                    }
                }
                getparamvalue.getWarnings += 2;
                $11 = ($10 + 23) % 128;
                c7 = c;
                c8 = c2;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr6[i16] = (char) (cArr6[i16] ^ 13722);
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, short s, short s2, Object[] objArr) {
        int i;
        int i2;
        int i3 = 4 - (b * 2);
        int i4 = 1 - (s * 3);
        byte[] bArr = $$a;
        int i5 = (s2 * 2) + 117;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            i5 += i6;
            i3++;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = bArr[i3];
            i5 += i6;
            i3++;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i5;
            if (i2 == i4) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{15, -74, 11, 22};
        $$b = EnumC0170g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE;
    }

    public static void initialize() {
        build = -8880716800597159563L;
        SchemeConfiguration = 898634101;
        visaSchemeConfiguration = (char) 19567;
        cbConfiguration = new char[]{37928, 37908, 37932, 37909, 37907, 37898, 37934, 37937, 37931, 37891, 37950, 37945, 37903, 37930, 37929, 37896, 37935, 37933, 37919, 37915, 37902, 37897, 37939, 37918, 37911};
        dinersSchemeConfiguration = (char) 41445;
    }
}
