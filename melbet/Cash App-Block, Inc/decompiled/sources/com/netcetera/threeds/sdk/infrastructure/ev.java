package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes5.dex */
public class ev {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ThreeDS2Service {
        private static int $10 = 0;
        private static int $11 = 1;
        public static final ThreeDS2Service ThreeDS2Service;
        private static char ThreeDS2ServiceInitializationCallback = 0;
        private static final /* synthetic */ ThreeDS2Service[] ThreeDS2ServiceInstance;
        private static int cleanup = 1;
        private static char createTransaction;
        private static char get;
        private static int getSDKInfo;
        private static char getSDKVersion;
        public static final ThreeDS2Service initialize;
        private final String getWarnings;

        static {
            getWarnings();
            Object[] objArr = new Object[1];
            a("嫕鏳Ĳ쌠엖ᢥ仇\ud8bb", Color.rgb(0, 0, 0) + 16777223, objArr);
            ThreeDS2Service = new ThreeDS2Service(((String) objArr[0]).intern(), 0, "");
            Object[] objArr2 = new Object[1];
            a("\uddafₜ喈␢뿶텒퐶ⷚ", 7 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
            String intern = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            a("쿦\uf038", 2 - (ViewConfiguration.getScrollBarSize() >> 8), objArr3);
            initialize = new ThreeDS2Service(intern, 1, ((String) objArr3[0]).intern());
            ThreeDS2ServiceInstance = ThreeDS2ServiceInstance();
            int i = cleanup + 111;
            getSDKInfo = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        private ThreeDS2Service(String str, int i, String str2) {
            this.getWarnings = str2;
        }

        private static /* synthetic */ ThreeDS2Service[] ThreeDS2ServiceInstance() {
            int i = (getSDKInfo + 31) % 128;
            cleanup = i;
            ThreeDS2Service[] threeDS2ServiceArr = {ThreeDS2Service, initialize};
            int i2 = i + 77;
            getSDKInfo = i2 % 128;
            if (i2 % 2 == 0) {
                return threeDS2ServiceArr;
            }
            throw null;
        }

        private static void a(String str, int i, Object[] objArr) {
            char[] cArr;
            char[] cArr2;
            int i2 = $11 + 87;
            $10 = i2 % 128;
            int i3 = 2;
            if (i2 % 2 != 0) {
                throw null;
            }
            char[] charArray = str != null ? str.toCharArray() : str;
            ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
            char[] cArr3 = new char[charArray.length];
            int i4 = 0;
            configurationBuilder.ThreeDS2ServiceInstance = 0;
            char[] cArr4 = new char[2];
            $10 = ($11 + 73) % 128;
            while (true) {
                int i5 = configurationBuilder.ThreeDS2ServiceInstance;
                if (i5 >= charArray.length) {
                    objArr[0] = new String(cArr3, 0, i);
                    return;
                }
                $10 = ($11 + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                cArr4[i4] = charArray[i5];
                char c = 1;
                cArr4[1] = charArray[i5 + 1];
                int i6 = 58224;
                int i7 = i4;
                while (i7 < 16) {
                    char c2 = cArr4[c];
                    char c3 = cArr4[i4];
                    char c4 = c;
                    int i8 = (c3 + i6) ^ ((c3 << 4) + ((char) (ThreeDS2ServiceInitializationCallback ^ (-1730380012335540218L))));
                    int i9 = c3 >>> 5;
                    int i10 = i3;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(getSDKVersion);
                        objArr2[i10] = Integer.valueOf(i9);
                        objArr2[c4] = Integer.valueOf(i8);
                        objArr2[i4] = Integer.valueOf(c2);
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj = map.get(936379577);
                        Class cls = Integer.TYPE;
                        if (obj != null) {
                            cArr = charArray;
                            cArr2 = cArr4;
                        } else {
                            cArr = charArray;
                            cArr2 = cArr4;
                            obj = ((Class) removeParam.initialize((ViewConfiguration.getEdgeSlop() >> 16) + 67, (char) (((Process.getThreadPriority(i4) + 20) >> 6) + 62396), TextUtils.indexOf("", "", i4) + 5352)).getMethod("C", cls, cls, cls, cls);
                            map.put(936379577, obj);
                        }
                        char charValue = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                        cArr2[c4] = charValue;
                        char c5 = cArr2[i4];
                        int i11 = i4;
                        int i12 = (charValue + i6) ^ ((charValue << 4) + ((char) (get ^ (-1730380012335540218L))));
                        int i13 = charValue >>> 5;
                        Object[] objArr3 = new Object[4];
                        objArr3[3] = Integer.valueOf(createTransaction);
                        objArr3[i10] = Integer.valueOf(i13);
                        objArr3[c4] = Integer.valueOf(i12);
                        objArr3[i11] = Integer.valueOf(c5);
                        Object obj2 = map.get(936379577);
                        if (obj2 == null) {
                            obj2 = ((Class) removeParam.initialize(TextUtils.getOffsetAfter("", i11) + 67, (char) (62396 - TextUtils.getTrimmedLength("")), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 5351)).getMethod("C", cls, cls, cls, cls);
                            map.put(936379577, obj2);
                        }
                        cArr2[0] = ((Character) ((Method) obj2).invoke(null, objArr3)).charValue();
                        i6 -= 40503;
                        i7++;
                        c = c4;
                        i3 = i10;
                        charArray = cArr;
                        cArr4 = cArr2;
                        i4 = 0;
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
                char[] cArr6 = cArr4;
                char c6 = c;
                int i15 = configurationBuilder.ThreeDS2ServiceInstance;
                cArr3[i15] = cArr6[0];
                cArr3[i15 + 1] = cArr6[c6];
                Object[] objArr4 = new Object[i14];
                objArr4[c6] = configurationBuilder;
                objArr4[0] = configurationBuilder;
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(108358357);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(54 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 39910), 7060 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).getMethod("B", Object.class, Object.class);
                    map2.put(108358357, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
                i3 = i14;
                charArray = cArr5;
                cArr4 = cArr6;
                i4 = 0;
            }
        }

        public static void getWarnings() {
            get = (char) 45740;
            createTransaction = (char) 2356;
            ThreeDS2ServiceInitializationCallback = (char) 38062;
            getSDKVersion = (char) 10435;
        }

        public static ThreeDS2Service valueOf(String str) {
            int i = cleanup + 55;
            getSDKInfo = i % 128;
            if (i % 2 != 0) {
                Enum.valueOf(ThreeDS2Service.class, str);
                throw null;
            }
            ThreeDS2Service threeDS2Service = (ThreeDS2Service) Enum.valueOf(ThreeDS2Service.class, str);
            getSDKInfo = (cleanup + 77) % 128;
            return threeDS2Service;
        }

        public static ThreeDS2Service[] values() {
            int i = cleanup + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getSDKInfo = i % 128;
            if (i % 2 == 0) {
                return (ThreeDS2Service[]) ThreeDS2ServiceInstance.clone();
            }
            ThreeDS2ServiceInstance.clone();
            throw null;
        }

        public String initialize() {
            int i = cleanup + 125;
            getSDKInfo = i % 128;
            int i2 = i % 2;
            String str = this.getWarnings;
            if (i2 == 0) {
                return str;
            }
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ThreeDS2ServiceInstance {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static long ThreeDS2Service;
        private static int ThreeDS2ServiceInitializationCallback;
        public static final ThreeDS2ServiceInstance ThreeDS2ServiceInstance;
        private static int getSDKVersion;
        public static final ThreeDS2ServiceInstance getWarnings;
        private static final /* synthetic */ ThreeDS2ServiceInstance[] initialize;
        private final String get;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getSDKVersion = 0;
            ThreeDS2ServiceInitializationCallback = 1;
            ThreeDS2ServiceInstance();
            Object[] objArr = new Object[1];
            a("縏繌蚵ꋱἿ㢵\uee53㋣輵ꢙ坧幢싊哾㼊\ud88a칿劽꽢䣾", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
            String intern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a("斞斮助皝龺컜", 1 - (ViewConfiguration.getTapTimeout() >> 16), objArr2);
            getWarnings = new ThreeDS2ServiceInstance(intern, 0, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a("噍嘌쇕\ue585䎳㒚옔疍펧꒰௭瘦薧壚掜풢\ue63cᗄ\uf3e7䓔ᙉꗅ", KeyEvent.getDeadChar(0, 0) + 1, objArr3);
            String intern2 = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a("䶮䶞돝韪濂읒", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1, objArr4);
            ThreeDS2ServiceInstance = new ThreeDS2ServiceInstance(intern2, 1, ((String) objArr4[0]).intern());
            initialize = initialize();
            getSDKVersion = (ThreeDS2ServiceInitializationCallback + 75) % 128;
        }

        private ThreeDS2ServiceInstance(String str, int i, String str2) {
            this.get = str2;
        }

        public static void ThreeDS2ServiceInstance() {
            ThreeDS2Service = 6577545650214240545L;
        }

        private static void a(String str, int i, Object[] objArr) {
            $10 = ($11 + 87) % 128;
            char[] charArray = str != null ? str.toCharArray() : str;
            onCompleted oncompleted = new onCompleted();
            char[] initialize2 = onCompleted.initialize(ThreeDS2Service ^ (-2776494906517314268L), charArray, i);
            oncompleted.initialize = 4;
            while (true) {
                int i2 = oncompleted.initialize;
                if (i2 >= initialize2.length) {
                    objArr[0] = new String(initialize2, 4, initialize2.length - 4);
                    return;
                }
                $10 = ($11 + 53) % 128;
                int i3 = i2 - 4;
                oncompleted.ThreeDS2Service = i3;
                try {
                    Object[] objArr2 = {Long.valueOf(initialize2[i2] ^ initialize2[i2 % 4]), Long.valueOf(i3), Long.valueOf(ThreeDS2Service)};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-1242395160);
                    if (obj == null) {
                        Class cls = (Class) removeParam.initialize(TextUtils.indexOf("", "") + 48, (char) (27780 - View.resolveSizeAndState(0, 0, 0)), (ViewConfiguration.getTouchSlop() >> 8) + 2441);
                        Object[] objArr3 = new Object[1];
                        b((short) 0, 0, (short) 0, objArr3);
                        String str2 = (String) objArr3[0];
                        Class cls2 = Long.TYPE;
                        obj = cls.getMethod(str2, cls2, cls2, cls2);
                        map.put(-1242395160, obj);
                    }
                    initialize2[i2] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    Object[] objArr4 = {oncompleted, oncompleted};
                    Object obj2 = map.get(1526822639);
                    if (obj2 == null) {
                        obj2 = ((Class) removeParam.initialize(66 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.indexOf("", "") + 14235)).getMethod("s", Object.class, Object.class);
                        map.put(1526822639, obj2);
                    }
                    ((Method) obj2).invoke(null, objArr4);
                    $10 = ($11 + 53) % 128;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(short s, int i, short s2, Object[] objArr) {
            int i2;
            int i3;
            int i4 = 3 - (s2 * 2);
            byte[] bArr = $$a;
            int i5 = (i * 2) + 112;
            int i6 = (s * 2) + 1;
            byte[] bArr2 = new byte[i6];
            if (bArr == null) {
                byte[] bArr3 = bArr;
                i3 = 0;
                int i7 = i4;
                i5 += -i4;
                i4 = i7;
                bArr = bArr3;
                i2 = i3;
                int i8 = i4 + 1;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i3 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                byte b = bArr[i8];
                byte[] bArr4 = bArr;
                i7 = i8;
                i4 = b;
                bArr3 = bArr4;
                i5 += -i4;
                i4 = i7;
                bArr = bArr3;
                i2 = i3;
                int i82 = i4 + 1;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i3 == i6) {
                }
            } else {
                i2 = 0;
                int i822 = i4 + 1;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i3 == i6) {
                }
            }
        }

        public static void init$0() {
            $$a = new byte[]{98, 104, -90, -34};
            $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE;
        }

        private static /* synthetic */ ThreeDS2ServiceInstance[] initialize() {
            int i = (ThreeDS2ServiceInitializationCallback + 11) % 128;
            getSDKVersion = i;
            ThreeDS2ServiceInstance[] threeDS2ServiceInstanceArr = {getWarnings, ThreeDS2ServiceInstance};
            int i2 = i + 11;
            ThreeDS2ServiceInitializationCallback = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 11 / 0;
            }
            return threeDS2ServiceInstanceArr;
        }

        public static ThreeDS2ServiceInstance valueOf(String str) {
            int i = getSDKVersion + 81;
            ThreeDS2ServiceInitializationCallback = i % 128;
            if (i % 2 != 0) {
                return (ThreeDS2ServiceInstance) Enum.valueOf(ThreeDS2ServiceInstance.class, str);
            }
            Enum.valueOf(ThreeDS2ServiceInstance.class, str);
            throw null;
        }

        public static ThreeDS2ServiceInstance[] values() {
            int i = getSDKVersion + 11;
            ThreeDS2ServiceInitializationCallback = i % 128;
            if (i % 2 == 0) {
                initialize.clone();
                throw null;
            }
            ThreeDS2ServiceInstance[] threeDS2ServiceInstanceArr = (ThreeDS2ServiceInstance[]) initialize.clone();
            int i2 = getSDKVersion + 55;
            ThreeDS2ServiceInitializationCallback = i2 % 128;
            if (i2 % 2 != 0) {
                return threeDS2ServiceInstanceArr;
            }
            throw null;
        }

        public String ThreeDS2Service() {
            int i = (getSDKVersion + 73) % 128;
            ThreeDS2ServiceInitializationCallback = i;
            String str = this.get;
            getSDKVersion = (i + 33) % 128;
            return str;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class initialize {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static final /* synthetic */ initialize[] ThreeDS2Service;
        public static final initialize ThreeDS2ServiceInstance;
        private static int createTransaction;
        private static char[] get;
        private static int getSDKInfo;
        private static long initialize;
        private final String getWarnings;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            createTransaction = 0;
            getSDKInfo = 1;
            getWarnings();
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 15, KeyEvent.keyCodeFromString(""), (char) ExpandableListView.getPackedPositionType(0L), objArr);
            ThreeDS2ServiceInstance = new initialize(((String) objArr[0]).intern(), 0, String.valueOf(true));
            ThreeDS2Service = ThreeDS2ServiceInstance();
            getSDKInfo = (createTransaction + 75) % 128;
        }

        private initialize(String str, int i, String str2) {
            this.getWarnings = str2;
        }

        private static /* synthetic */ initialize[] ThreeDS2ServiceInstance() {
            int i = getSDKInfo;
            initialize[] initializeVarArr = {ThreeDS2ServiceInstance};
            createTransaction = (i + 57) % 128;
            return initializeVarArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x02c1  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x02c2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, int i2, char c, Object[] objArr) {
            Throwable cause;
            long[] jArr;
            long j;
            Object method;
            ThreeDS2ServiceInitializationCallback threeDS2ServiceInitializationCallback = new ThreeDS2ServiceInitializationCallback();
            long[] jArr2 = new long[i];
            threeDS2ServiceInitializationCallback.initialize = 0;
            $11 = ($10 + 91) % 128;
            while (true) {
                int i3 = threeDS2ServiceInitializationCallback.initialize;
                if (i3 >= i) {
                    break;
                }
                int i4 = $11 + 37;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                Class cls = Long.TYPE;
                Class cls2 = Integer.TYPE;
                if (i5 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(get[i2 % i3])};
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj = map.get(-54653524);
                        if (obj != null) {
                            jArr = jArr2;
                            method = obj;
                        } else {
                            jArr = jArr2;
                            Class cls3 = (Class) removeParam.initialize(48 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (MotionEvent.axisFromString("") + 1), View.combineMeasuredStates(0, 0) + 3221);
                            Object[] objArr3 = new Object[1];
                            b((byte) 0, (byte) 0, (short) 1, objArr3);
                            method = cls3.getMethod((String) objArr3[0], cls2);
                            map.put(-54653524, method);
                        }
                        Long l = (Long) ((Method) method).invoke(null, objArr2);
                        l.longValue();
                        Object[] objArr4 = {l, Long.valueOf(threeDS2ServiceInitializationCallback.initialize), Long.valueOf(initialize), Integer.valueOf(c)};
                        Object obj2 = map.get(1319531906);
                        if (obj2 == null) {
                            obj2 = ((Class) removeParam.initialize(View.resolveSize(0, 0) + 69, (char) (ImageFormat.getBitsPerPixel(0) + 50705), Color.alpha(0) + 7789)).getMethod("b", cls, cls, cls, cls2);
                            map.put(1319531906, obj2);
                        }
                        jArr[i3] = ((Long) ((Method) obj2).invoke(null, objArr4)).longValue();
                        Object[] objArr5 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                        Object obj3 = map.get(1724349229);
                        if (obj3 == null) {
                            Class cls4 = (Class) removeParam.initialize(((byte) KeyEvent.getModifierMetaStateMask()) + PnmConstants.PBM_TEXT_CODE, (char) (27780 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 2441 - Gravity.getAbsoluteGravity(0, 0));
                            Object[] objArr6 = new Object[1];
                            b((byte) 0, (byte) 0, (short) 0, objArr6);
                            obj3 = cls4.getMethod((String) objArr6[0], Object.class, Object.class);
                            map.put(1724349229, obj3);
                        }
                        ((Method) obj3).invoke(null, objArr5);
                    } catch (Throwable th) {
                        cause = th.getCause();
                        if (cause != null) {
                        }
                    }
                } else {
                    jArr = jArr2;
                    Object[] objArr7 = {Integer.valueOf(get[i2 + i3])};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map2.get(-54653524);
                    if (obj4 == null) {
                        Class cls5 = (Class) removeParam.initialize(47 - TextUtils.indexOf((CharSequence) "", '0'), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), 3221 - TextUtils.getOffsetBefore("", 0));
                        Object[] objArr8 = new Object[1];
                        b((byte) 0, (byte) 0, (short) 1, objArr8);
                        obj4 = cls5.getMethod((String) objArr8[0], cls2);
                        map2.put(-54653524, obj4);
                    }
                    Long l2 = (Long) ((Method) obj4).invoke(null, objArr7);
                    l2.longValue();
                    Object[] objArr9 = {l2, Long.valueOf(threeDS2ServiceInitializationCallback.initialize), Long.valueOf(initialize), Integer.valueOf(c)};
                    Object obj5 = map2.get(1319531906);
                    if (obj5 != null) {
                        j = 0;
                    } else {
                        j = 0;
                        obj5 = ((Class) removeParam.initialize(69 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 50703), 7789 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).getMethod("b", cls, cls, cls, cls2);
                        map2.put(1319531906, obj5);
                    }
                    jArr[i3] = ((Long) ((Method) obj5).invoke(null, objArr9)).longValue();
                    Object[] objArr10 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                    Object obj6 = map2.get(1724349229);
                    if (obj6 == null) {
                        Class cls6 = (Class) removeParam.initialize(48 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (27781 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1))), 2441 - (ViewConfiguration.getTapTimeout() >> 16));
                        Object[] objArr11 = new Object[1];
                        b((byte) 0, (byte) 0, (short) 0, objArr11);
                        obj6 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                        map2.put(1724349229, obj6);
                    }
                    ((Method) obj6).invoke(null, objArr10);
                }
                jArr2 = jArr;
                cause = th.getCause();
                if (cause != null) {
                    throw th;
                }
                throw cause;
            }
            long[] jArr3 = jArr2;
            char[] cArr = new char[i];
            threeDS2ServiceInitializationCallback.initialize = 0;
            while (true) {
                int i6 = threeDS2ServiceInitializationCallback.initialize;
                if (i6 >= i) {
                    objArr[0] = new String(cArr);
                    return;
                }
                cArr[i6] = (char) jArr3[i6];
                Object[] objArr12 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj7 = map3.get(1724349229);
                if (obj7 == null) {
                    Class cls7 = (Class) removeParam.initialize(Color.green(0) + 48, (char) (View.getDefaultSize(0, 0) + 27780), (ViewConfiguration.getPressedStateDuration() >> 16) + 2441);
                    Object[] objArr13 = new Object[1];
                    b((byte) 0, (byte) 0, (short) 0, objArr13);
                    obj7 = cls7.getMethod((String) objArr13[0], Object.class, Object.class);
                    map3.put(1724349229, obj7);
                }
                ((Method) obj7).invoke(null, objArr12);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x0031). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(byte b, byte b2, short s, Object[] objArr) {
            int i;
            int i2;
            int i3;
            int i4 = (b * 4) + 4;
            byte[] bArr = $$a;
            int i5 = b2 * 4;
            int i6 = (s * 3) + 97;
            byte[] bArr2 = new byte[1 - i5];
            int i7 = 0 - i5;
            if (bArr == null) {
                int i8 = i4;
                int i9 = i7;
                i3 = 0;
                int i10 = i8 + (-i9);
                i = i4 + 1;
                i2 = i10;
                bArr2[i3] = (byte) i2;
                if (i3 == i7) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i3++;
                i9 = bArr[i];
                int i11 = i;
                i8 = i2;
                i4 = i11;
                int i102 = i8 + (-i9);
                i = i4 + 1;
                i2 = i102;
                bArr2[i3] = (byte) i2;
                if (i3 == i7) {
                }
            } else {
                i = i4;
                i2 = i6;
                i3 = 0;
                bArr2[i3] = (byte) i2;
                if (i3 == i7) {
                }
            }
        }

        public static void getWarnings() {
            get = new char[]{35195, 22437, 13522, 5608, 61952, 54075, 45148, 37240, 32669, 23766, 15871, 6671, 64292, 55389, 47475, 34711};
            initialize = 9173452662798637028L;
        }

        public static void init$0() {
            $$a = new byte[]{116, PnmConstants.PNM_SEPARATOR, -47, 79};
            $$b = EnumC0170g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
        }

        public static initialize valueOf(String str) {
            createTransaction = (getSDKInfo + 77) % 128;
            initialize initializeVar = (initialize) Enum.valueOf(initialize.class, str);
            int i = getSDKInfo + 41;
            createTransaction = i % 128;
            if (i % 2 == 0) {
                return initializeVar;
            }
            throw null;
        }

        public static initialize[] values() {
            getSDKInfo = (createTransaction + 95) % 128;
            initialize[] initializeVarArr = (initialize[]) ThreeDS2Service.clone();
            int i = getSDKInfo + 81;
            createTransaction = i % 128;
            if (i % 2 == 0) {
                return initializeVarArr;
            }
            throw null;
        }

        public String initialize() {
            int i = createTransaction + 105;
            int i2 = i % 128;
            getSDKInfo = i2;
            int i3 = i % 2;
            String str = this.getWarnings;
            if (i3 == 0) {
                throw null;
            }
            createTransaction = (i2 + 29) % 128;
            return str;
        }
    }
}
