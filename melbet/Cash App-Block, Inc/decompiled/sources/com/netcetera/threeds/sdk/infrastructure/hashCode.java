package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.setCacheColorHint;
import com.netcetera.threeds.sdk.infrastructure.setCollapsible;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class hashCode extends getView {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] ThreeDS2ServiceInitializationCallback;
    private static char ThreeDS2ServiceInstance;
    private static int cleanup;
    private static int get;
    private static int getSDKInfo;
    private static long getSDKVersion;
    private static long initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKInfo = 0;
        cleanup = 1;
        initialize = 8413197268149284537L;
        get = 898634101;
        ThreeDS2ServiceInstance = (char) 4469;
        ThreeDS2ServiceInitializationCallback = new char[]{35161, 14434, 60217, 39632, 19891, 65360, 44544, 20931, 149, 45643, 25923, 5183, 51195, 30350, 35080, 14388, 35161, 14434, 60217, 39622, 19893, 65393, 44567, 20935, 149, 57185, 28251, 25282, 54256, 178, 29030, 42537, 5337, 17817, 47689, 60172, 23011, 36596, 65471, 11389, 40232, 54234, 130, 29016, 42503, 5325, 17875, 47803, 60264, 5426, 36764, 16046, 60908, 39992, 19319, 63879, 43207, 22295, 1618, 46263, 25515, 4842, 49468, 28758, 16000, 60874, 39946, 19290, 21130, 58296, 12538, 16686, 38497, 9361, 30161, 35329, 56132, 27041, 48829, 53244, 7210, 44376, 58258, 12486, 16653, 35165, 14457, 60218, 39666, 19890, 65345, 44583, 20953, 150, 45654, 25934, 5162, 51190, 30392, 14410, 14334, 34525, 21910, 9289, 62230, 16888, 4232, 61301, 48702, 3313, 56264, 35157, 14436, 60217, 39648, 19901, 65346, 44555, 20963, 137, 45641, 25959, 35195, 14419, 60207, 39648, 25428, 53850, 273, 28885, 18312, 63153, 9719, 21519, 33644, 12692, 24773, 40705, 52801, 31891, 43960, 56024, 2346, 47200, 63132, 9692, 43077, 6490, 51718, 48080, 27803, 56959, 35195, 35185, 35196, 62442, 17100, 37254, 57410, 14108, 34284, 54434, 11105, 31265, 51445, 8137, 28297, 48504, 3094, 17125, 37285, 57433, 14129, 34279, 54482, 45833, 568, 53618, 41126, 30709, 50452, 35163, 14451, 60195, 39655, 19893, 65350, 44559, 20955, 153, 45645, 25979, 5122, 51194, 30393, 14415, 60172, 39625, 19845, 65365, 44657, 35148, 14451, 60223, 39670, 953, 45703, 25025, 4103, 51038, 35193, 14385, 60282, 39587, 19948, 65301, 44638, 20879, 192, 45579, 25903, 5243, 51108, 30441, 52915, 32655, 44241, 56605, 58319, 21241, 33214, 61551};
        getSDKVersion = 2543699948791019521L;
    }

    public hashCode(nh nhVar, setFontFeatureSettings setfontfeaturesettings) {
        super(nhVar, setfontfeaturesettings);
    }

    private List<setCollapsible> ThreeDS2Service() {
        ArrayList arrayList = new ArrayList();
        Object[] objArr = new Object[1];
        a("㿌ᓃ\uf548\uf000", Color.argb(0, 0, 0, 0) - 1592750325, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), "犣菋ᾦᬸ蘼쭢愈ื蚘糃\udd4f", "୶ႏ価\ue07a", objArr);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance = (setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis());
        Object[] objArr2 = new Object[1];
        a("㿌ᓃ\uf548\uf000", (-1933640577) - ((Process.getThreadPriority(0) + 20) >> 6), (char) (1 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1))), "疯犒㾭㉴ﬖ鯞쵹읥ɦ", "羂뻼掌癍", objArr2);
        arrayList.add(threeDS2ServiceInstance.get((clone) name.get(new Object[]{((String) objArr2[0]).intern()}, -159050596, 159050601, (int) System.currentTimeMillis())).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1360902539, -1360902519, 45)).getWarnings());
        int i = cleanup + 31;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
        return initialize(objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(String str, int i, char c, String str2, String str3, Object[] objArr) {
        char[] cArr;
        int i2;
        Integer num;
        int i3;
        Integer num2;
        Integer num3 = 246986610;
        Integer num4 = -258783473;
        int i4 = 2;
        if (str3 != null) {
            int i5 = $10 + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                cArr = str3.toCharArray();
                int i6 = 65 / 0;
            } else {
                cArr = str3.toCharArray();
            }
            $10 = ($11 + 19) % 128;
        } else {
            cArr = str3;
        }
        char[] cArr2 = cArr;
        char[] charArray = str2 != 0 ? str2.toCharArray() : str2;
        char[] charArray2 = str != null ? str.toCharArray() : str;
        ConfigParameters configParameters = new ConfigParameters();
        int length = cArr2.length;
        char[] cArr3 = new char[length];
        int length2 = charArray2.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(cArr2, 0, cArr3, 0, length);
        System.arraycopy(charArray2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = charArray.length;
        char[] cArr5 = new char[length3];
        configParameters.initialize = 0;
        while (configParameters.initialize < length3) {
            try {
                Object[] objArr2 = {configParameters};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(num4);
                if (obj != null) {
                    i2 = i4;
                } else {
                    i2 = i4;
                    obj = ((Class) removeParam.initialize((ViewConfiguration.getLongPressTimeout() >> 16) + 58, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 6414)).getMethod("j", Object.class);
                    map.put(num4, obj);
                }
                int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {configParameters};
                Object obj2 = map.get(num3);
                if (obj2 != null) {
                    num = num4;
                    i3 = intValue;
                } else {
                    num = num4;
                    i3 = intValue;
                    obj2 = ((Class) removeParam.initialize(62 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (11345 - Color.blue(0)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 8576)).getMethod("i", Object.class);
                    map.put(num3, obj2);
                }
                int intValue2 = ((Integer) ((Method) obj2).invoke(null, objArr3)).intValue();
                int i7 = cArr3[configParameters.initialize % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i2] = Integer.valueOf(cArr4[i3]);
                objArr4[1] = Integer.valueOf(i7);
                objArr4[0] = configParameters;
                Object obj3 = map.get(828230935);
                Class cls = Integer.TYPE;
                if (obj3 != null) {
                    num2 = num3;
                } else {
                    num2 = num3;
                    obj3 = ((Class) removeParam.initialize((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 74, (char) TextUtils.indexOf("", ""), (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 9820)).getMethod("o", Object.class, cls, cls);
                    map.put(828230935, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
                int i8 = cArr3[intValue2] * 32718;
                Object[] objArr5 = new Object[i2];
                objArr5[1] = Integer.valueOf(cArr4[i3]);
                objArr5[0] = Integer.valueOf(i8);
                Object obj4 = map.get(196637707);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize(48 - (KeyEvent.getMaxKeyCode() >> 16), (char) (63350 - (ViewConfiguration.getEdgeSlop() >> 16)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11536)).getMethod("n", cls, cls);
                    map.put(196637707, obj4);
                }
                cArr4[intValue2] = ((Character) ((Method) obj4).invoke(null, objArr5)).charValue();
                cArr3[intValue2] = configParameters.get;
                int i9 = configParameters.initialize;
                cArr5[i9] = (char) ((((int) (get ^ (-8880716800597159563L))) ^ ((r2 ^ charArray[i9]) ^ (initialize ^ (-8880716800597159563L)))) ^ ((char) (ThreeDS2ServiceInstance ^ (-8880716800597159563L))));
                configParameters.initialize = i9 + 1;
                length3 = length3;
                num4 = num;
                num3 = num2;
                i4 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr5);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, char c, int i2, Object[] objArr) {
        Throwable cause;
        long[] jArr;
        int i3;
        Object method;
        int i4 = i;
        ThreeDS2ServiceInitializationCallback threeDS2ServiceInitializationCallback = new ThreeDS2ServiceInitializationCallback();
        long[] jArr2 = new long[i4];
        threeDS2ServiceInitializationCallback.initialize = 0;
        while (true) {
            int i5 = threeDS2ServiceInitializationCallback.initialize;
            if (i5 >= i4) {
                break;
            }
            int i6 = $11 + 7;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            if (i7 != 0) {
                try {
                    Object[] objArr2 = {Integer.valueOf(ThreeDS2ServiceInitializationCallback[i2 + i5])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-54653524);
                    if (obj != null) {
                        jArr = jArr2;
                        method = obj;
                        i3 = i5;
                    } else {
                        jArr = jArr2;
                        Class cls3 = (Class) removeParam.initialize(48 - (KeyEvent.getMaxKeyCode() >> 16), (char) (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), 3221 - (KeyEvent.getMaxKeyCode() >> 16));
                        Object[] objArr3 = new Object[1];
                        i3 = i5;
                        c((short) 0, 0, 1, objArr3);
                        method = cls3.getMethod((String) objArr3[0], cls2);
                        map.put(-54653524, method);
                    }
                    Long l = (Long) ((Method) method).invoke(null, objArr2);
                    l.longValue();
                    Object[] objArr4 = {l, Long.valueOf(threeDS2ServiceInitializationCallback.initialize), Long.valueOf(getSDKVersion), Integer.valueOf(c)};
                    Object obj2 = map.get(1319531906);
                    if (obj2 == null) {
                        obj2 = ((Class) removeParam.initialize(69 - TextUtils.getOffsetAfter("", 0), (char) (50705 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1))), Color.blue(0) + 7789)).getMethod("b", cls, cls, cls, cls2);
                        map.put(1319531906, obj2);
                    }
                    jArr[i3] = ((Long) ((Method) obj2).invoke(null, objArr4)).longValue();
                    Object[] objArr5 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                    Object obj3 = map.get(1724349229);
                    if (obj3 == null) {
                        Class cls4 = (Class) removeParam.initialize(48 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (27780 - TextUtils.getCapsMode("", 0, 0)), Drawable.resolveOpacity(0, 0) + 2441);
                        Object[] objArr6 = new Object[1];
                        c((short) 0, 0, 0, objArr6);
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
                Object[] objArr7 = {Integer.valueOf(ThreeDS2ServiceInitializationCallback[i2 + i5])};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj4 = map2.get(-54653524);
                if (obj4 == null) {
                    Class cls5 = (Class) removeParam.initialize(TextUtils.getOffsetAfter("", 0) + 48, (char) (KeyEvent.getMaxKeyCode() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 3222);
                    Object[] objArr8 = new Object[1];
                    c((short) 0, 0, 1, objArr8);
                    obj4 = cls5.getMethod((String) objArr8[0], cls2);
                    map2.put(-54653524, obj4);
                }
                Long l2 = (Long) ((Method) obj4).invoke(null, objArr7);
                l2.longValue();
                Object[] objArr9 = {l2, Long.valueOf(threeDS2ServiceInitializationCallback.initialize), Long.valueOf(getSDKVersion), Integer.valueOf(c)};
                Object obj5 = map2.get(1319531906);
                if (obj5 == null) {
                    obj5 = ((Class) removeParam.initialize(69 - TextUtils.indexOf("", "", 0, 0), (char) (ExpandableListView.getPackedPositionChild(0L) + 50705), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7788)).getMethod("b", cls, cls, cls, cls2);
                    map2.put(1319531906, obj5);
                }
                jArr[i5] = ((Long) ((Method) obj5).invoke(null, objArr9)).longValue();
                Object[] objArr10 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                Object obj6 = map2.get(1724349229);
                if (obj6 == null) {
                    Class cls6 = (Class) removeParam.initialize(48 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (27780 - ExpandableListView.getPackedPositionGroup(0L)), 2440 - MotionEvent.axisFromString(""));
                    Object[] objArr11 = new Object[1];
                    c((short) 0, 0, 0, objArr11);
                    obj6 = cls6.getMethod((String) objArr11[0], Object.class, Object.class);
                    map2.put(1724349229, obj6);
                }
                ((Method) obj6).invoke(null, objArr10);
                i4 = i;
            }
            jArr2 = jArr;
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        long[] jArr3 = jArr2;
        char[] cArr = new char[i4];
        threeDS2ServiceInitializationCallback.initialize = 0;
        while (true) {
            int i8 = threeDS2ServiceInitializationCallback.initialize;
            if (i8 >= i4) {
                objArr[0] = new String(cArr);
                return;
            }
            $11 = ($10 + 3) % 128;
            cArr[i8] = (char) jArr3[i8];
            Object[] objArr12 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
            Map map3 = removeParam.visaSchemeConfiguration;
            Object obj7 = map3.get(1724349229);
            if (obj7 == null) {
                Class cls7 = (Class) removeParam.initialize(View.resolveSizeAndState(0, 0, 0) + 48, (char) (27780 - Color.alpha(0)), 2440 - TextUtils.lastIndexOf("", '0', 0, 0));
                Object[] objArr13 = new Object[1];
                c((short) 0, 0, 0, objArr13);
                obj7 = cls7.getMethod((String) objArr13[0], Object.class, Object.class);
                map3.put(1724349229, obj7);
            }
            ((Method) obj7).invoke(null, objArr12);
            $11 = ($10 + 75) % 128;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, int i, int i2, Object[] objArr) {
        int i3;
        int i4;
        int i5 = (s * 3) + 1;
        int i6 = 3 - (i * 4);
        int i7 = (i2 * 3) + 97;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = i7;
            i4 = 0;
            int i9 = i6;
            int i10 = i6 + (-i8);
            int i11 = i9;
            i7 = i10;
            i6 = i11;
            i3 = i4;
            int i12 = i6 + 1;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i8 = bArr[i12];
            int i13 = i7;
            i9 = i12;
            i6 = i13;
            int i102 = i6 + (-i8);
            int i112 = i9;
            i7 = i102;
            i6 = i112;
            i3 = i4;
            int i122 = i6 + 1;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i5) {
            }
        } else {
            i3 = 0;
            int i1222 = i6 + 1;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i7;
            if (i4 == i5) {
            }
        }
    }

    private List<setCollapsible> get() {
        ArrayList arrayList = new ArrayList();
        Object[] objArr = new Object[1];
        b(21 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) ExpandableListView.getPackedPositionType(0L), 181 - TextUtils.getCapsMode("", 0, 0), objArr);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], 1445068217, -1445068217, (int) System.currentTimeMillis()));
        compareTo compareto = (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis());
        Object[] objArr2 = new Object[1];
        b(TextUtils.getOffsetAfter("", 0) + 4, (char) View.resolveSizeAndState(0, 0, 0), View.resolveSizeAndState(0, 0, 0) + EnumC0170g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, objArr2);
        String intern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b((ViewConfiguration.getEdgeSlop() >> 16) + 5, (char) (35560 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + EnumC0170g.SDK_ASSET_ICON_CLIPBOARD_VALUE, objArr3);
        compareTo compareto2 = compareto.get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[]{intern, ((String) objArr3[0]).intern()}}, 1032208890, -1032208890, (int) System.currentTimeMillis()));
        Object[] objArr4 = new Object[1];
        b((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 14, (char) ((-1) - TextUtils.lastIndexOf("", '0')), ExpandableListView.getPackedPositionType(0L) + EnumC0170g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, objArr4);
        arrayList.add(threeDS2ServiceInstance.getWarnings(compareto2.get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[]{((String) objArr4[0]).intern()}}, -1709207342, 1709207347, (int) System.currentTimeMillis()))).getWarnings());
        Object[] objArr5 = new Object[1];
        b(4 - (KeyEvent.getMaxKeyCode() >> 16), (char) (18415 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 224 - ExpandableListView.getPackedPositionType(0L), objArr5);
        arrayList.add(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr5[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{8059}, 605561253, -605561234, 8059)).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -1083959071, 1083959079, (int) System.currentTimeMillis()))).getWarnings());
        Object[] objArr6 = new Object[1];
        a("㿌ᓃ\uf548\uf000", ViewConfiguration.getDoubleTapTimeout() >> 16, (char) (9596 - Color.argb(0, 0, 0, 0)), "ﭑﳧ", "瑟䳹籯䬥", objArr6);
        arrayList.add(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr6[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], 1445068217, -1445068217, (int) System.currentTimeMillis())).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{64}, 605561253, -605561234, 64)).getWarnings());
        Object[] objArr7 = new Object[1];
        b((PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 4, (char) (27289 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 228 - Color.red(0), objArr7);
        arrayList.add(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr7[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], 1445068217, -1445068217, (int) System.currentTimeMillis())).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{64}, 605561253, -605561234, 64)).getWarnings());
        Object[] objArr8 = new Object[1];
        b((ViewConfiguration.getLongPressTimeout() >> 16) + 4, (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 18415), Color.alpha(0) + 224, objArr8);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance2 = (setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr8[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis());
        Object[] objArr9 = new Object[1];
        a("㿌ᓃ\uf548\uf000", (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (9597 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "ﭑﳧ", "瑟䳹籯䬥", objArr9);
        String intern2 = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        b(15 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 211 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr10);
        arrayList.add(threeDS2ServiceInstance2.get(((clone) name.get(new Object[]{intern2, new String[]{((String) objArr10[0]).intern()}}, 424304478, -424304468, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -1083959071, 1083959079, (int) System.currentTimeMillis())).ThreeDS2Service((List) ThreeDS2ServiceInstance(new Object[]{this}, -813874725, 813874725, System.identityHashCode(this))).getWarnings());
        getSDKInfo = (cleanup + 43) % 128;
        return arrayList;
    }

    public static void init$0() {
        $$a = new byte[]{81, -51, 83, 43};
        $$b = EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
    }

    private List<setCollapsible> initialize() {
        equals equalsVar = new equals();
        Object[] objArr = new Object[1];
        b(6 - (Process.myTid() >> 22), (char) (TextUtils.indexOf("", "", 0, 0) + 14940), TextUtils.indexOf("", "", 0) + EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, objArr);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -637702868, 637702893, (int) System.currentTimeMillis())).getWarnings());
        Object[] objArr2 = new Object[1];
        a("㿌ᓃ\uf548\uf000", ViewConfiguration.getWindowTouchSlop() >> 8, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 47219), "阄ᬽ鷗䌵", "笄鉼猍\uefb8", objArr2);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr2[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -637702868, 637702893, (int) System.currentTimeMillis())).getWarnings());
        Object[] objArr3 = new Object[1];
        a("㿌ᓃ\uf548\uf000", TextUtils.indexOf("", "", 0, 0) + 743684328, (char) View.MeasureSpec.makeMeasureSpec(0, 0), "ቲ⹍鿇\uf454䂓놳꒷訡妫", "\ue8bb厸\uf22c葬", objArr3);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr3[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -637702868, 637702893, (int) System.currentTimeMillis())).getWarnings());
        List<setCollapsible> ThreeDS2ServiceInstance2 = equalsVar.ThreeDS2ServiceInstance();
        getSDKInfo = (cleanup + 97) % 128;
        return ThreeDS2ServiceInstance2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getView
    public List<setCollapsible> getWarnings() {
        Object[] objArr = new Object[1];
        a("㿌ᓃ\uf548\uf000", Color.red(0), (char) (TextUtils.getOffsetAfter("", 0) + 11559), "㸸ਗ਼", "囹ꆮ⟆\uf22d", objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b('2' - AndroidCharacter.getMirror('0'), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 22122), 25 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr2);
        String intern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a("㿌ᓃ\uf548\uf000", ViewConfiguration.getScrollBarSize() >> 8, (char) (24730 - TextUtils.indexOf("", "", 0)), "㊢ઊ", "끭ǃ驍ᥠ", objArr3);
        String intern3 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a("㿌ᓃ\uf548\uf000", TextUtils.lastIndexOf("", '0', 0, 0) + 1, (char) (Color.alpha(0) + 31692), "\ue068⡁", "쐆卾챖祻", objArr4);
        String intern4 = ((String) objArr4[0]).intern();
        equals equalsVar = new equals();
        Object[] objArr5 = new Object[1];
        a("㿌ᓃ\uf548\uf000", View.MeasureSpec.getMode(0), (char) Color.alpha(0), "ਉ헌㈈䇜\u20c5䮒뻑쳰\uf3adゼ顪\uf209괜첚筘웺嘴중﵊衘", "\uf6f0삼\ue5c4巴", objArr5);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr5[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1311835732, 1311835738, (int) System.currentTimeMillis())).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{36}, -710732177, 710732200, 36)).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{this.getWarnings.get()}, 1725422414, -1725422412, (int) System.currentTimeMillis()))).getWarnings());
        Object[] objArr6 = new Object[1];
        b(14 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), ViewConfiguration.getKeyRepeatTimeout() >> 16, objArr6);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr6[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1311835732, 1311835738, (int) System.currentTimeMillis())).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{3}, -710732177, 710732200, 3)).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], 2036384150, -2036384128, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{Integer.valueOf(this.getWarnings.getSDKInfo())}, 1099490190, -1099490187, (int) System.currentTimeMillis()))).getWarnings());
        Object[] objArr7 = new Object[1];
        a("㿌ᓃ\uf548\uf000", (Process.myTid() >> 22) - 1283942217, (char) Color.red(0), "៩\udad6队䲃릸砈謟", "뜐碘쪳渕", objArr7);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance = (setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr7[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis());
        clone cloneVar = (clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis());
        Object[] objArr8 = new Object[1];
        b(3 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) TextUtils.getOffsetAfter("", 0), 14 - (ViewConfiguration.getEdgeSlop() >> 16), objArr8);
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance.get(cloneVar.ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{((String) objArr8[0]).intern()}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{300000}, 605561253, -605561234, 300000)).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], 982291278, -982291277, (int) System.currentTimeMillis()))).getWarnings());
        Object[] objArr9 = new Object[1];
        a("㿌ᓃ\uf548\uf000", ViewConfiguration.getScrollBarSize() >> 8, (char) (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), "㽓䝲쒜콮겸캤鬵〣捥즜", "⚍䑃\ue40a埠", objArr9);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr9[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1311835732, 1311835738, (int) System.currentTimeMillis())).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{36}, -710732177, 710732200, 36)).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{this.getWarnings.initialize()}, 1725422414, -1725422412, (int) System.currentTimeMillis()))).getWarnings());
        Object[] objArr10 = new Object[1];
        b(9 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 16 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr10);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance2 = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr10[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis()));
        compareTo compareto = (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis());
        Object[] objArr11 = new Object[1];
        b(2 - (ViewConfiguration.getTouchSlop() >> 8), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14, objArr11);
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance2.getWarnings(compareto.get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[]{intern3, intern, intern2, intern4, ((String) objArr11[0]).intern()}}, 1032208890, -1032208890, (int) System.currentTimeMillis()))).getWarnings());
        Object[] objArr12 = new Object[1];
        b((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21, (char) (60313 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1))), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 28, objArr12);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance3 = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr12[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1311835732, 1311835738, (int) System.currentTimeMillis()));
        compareTo compareto2 = (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis());
        Object[] objArr13 = new Object[1];
        a("㿌ᓃ\uf548\uf000", 42944349 - TextUtils.getOffsetBefore("", 0), (char) (TextUtils.getCapsMode("", 0, 0) + 22448), "\uf606", "嶥轇뀂繗", objArr13);
        String intern5 = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        b(1 - TextUtils.getTrimmedLength(""), (char) (40003 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 50 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr14);
        SVG$Unit$EnumUnboxingLocalUtility.m(compareto2, (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[]{intern5, ((String) objArr14[0]).intern()}}, 1032208890, -1032208890, (int) System.currentTimeMillis()), threeDS2ServiceInstance3, equalsVar);
        Object[] objArr15 = new Object[1];
        a("㿌ᓃ\uf548\uf000", ExpandableListView.getPackedPositionGroup(0L) + 1663931990, (char) (5483 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), "\ud8e1寈〘抠\uf587홞ळ于佗桝⮳綡΄\ue89f\ud904ퟀ㚾㳎얝", "嚝ⶖ橣樕", objArr15);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr15[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1360902539, -1360902519, 45)).getWarnings());
        Object[] objArr16 = new Object[1];
        b(18 - Color.alpha(0), (char) ((Process.myPid() >> 22) + 1735), 50 - Color.red(0), objArr16);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr16[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1360902539, -1360902519, 45)).getWarnings());
        Object[] objArr17 = new Object[1];
        b((AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 17, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 56273), 68 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr17);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr17[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{350}, 1360902539, -1360902519, 350)).getWarnings());
        Object[] objArr18 = new Object[1];
        a("㿌ᓃ\uf548\uf000", ViewConfiguration.getPressedStateDuration() >> 16, (char) (13792 - TextUtils.indexOf((CharSequence) "", '0', 0)), "\ue7ff\udda7\ue578녛ͼꐍ璐霁Ⴇꮭ輖㏦釸팕훫Ị\uf709̞쎗ᦼ\ue716\u206eﻱ⢛傈㝾", "쓰얆\ue190✵", objArr18);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance4 = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr18[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern3, intern, intern2, intern4}}, 1859274854, -1859274847, (int) System.currentTimeMillis())));
        Object[] objArr19 = new Object[1];
        a("㿌ᓃ\uf548\uf000", 42944349 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (22448 - TextUtils.getCapsMode("", 0, 0)), "\uf606", "嶥轇뀂繗", objArr19);
        String intern6 = ((String) objArr19[0]).intern();
        Object[] objArr20 = new Object[1];
        b(1 - TextUtils.getOffsetBefore("", 0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 40003), TextUtils.indexOf((CharSequence) "", '0', 0) + 50, objArr20);
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance4.getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[]{intern6, ((String) objArr20[0]).intern()}}, 1032208890, -1032208890, (int) System.currentTimeMillis())).getWarnings());
        Object[] objArr21 = new Object[1];
        a("㿌ᓃ\uf548\uf000", 1711712130 - TextUtils.lastIndexOf("", '0', 0), (char) (29187 - KeyEvent.keyCodeFromString("")), "췔݈\uefef鿺㾥ஊ╇\ud8ab蒖猪僳机⇬\uead1㯌\ue2bc\udb97ഇ᱆", "荕ڧͦѲ", objArr21);
        SVG$Unit$EnumUnboxingLocalUtility.m(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], 948133992, -948133975, (int) System.currentTimeMillis())), (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1618462802, -1618462791, (int) System.currentTimeMillis()), ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr21[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern, intern2}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))), equalsVar);
        Object[] objArr22 = new Object[1];
        b((TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 15, (char) Drawable.resolveOpacity(0, 0), 85 - TextUtils.getCapsMode("", 0, 0), objArr22);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr22[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern3, intern, intern2, intern4}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1360902539, -1360902519, 45)).getWarnings());
        Object[] objArr23 = new Object[1];
        a("㿌ᓃ\uf548\uf000", View.resolveSizeAndState(0, 0, 0), (char) (56604 - ExpandableListView.getPackedPositionChild(0L)), "㞈嗍鏜琢쟿郴❷\uf040˧隍᪩趭軶刢", "\u05c9밭ᶼ髝", objArr23);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr23[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern3, intern, intern2, intern4}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{256}, 1360902539, -1360902519, 256)).getWarnings());
        Object[] objArr24 = new Object[1];
        b(12 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (MotionEvent.axisFromString("") + 48816), (KeyEvent.getMaxKeyCode() >> 16) + 100, objArr24);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr24[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern3, intern, intern2, intern4}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{2048}, 605561253, -605561234, 2048)).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -1083959071, 1083959079, (int) System.currentTimeMillis()))).ThreeDS2Service(initialize()).getWarnings());
        Object[] objArr25 = new Object[1];
        a("㿌ᓃ\uf548\uf000", Process.myPid() >> 22, (char) (24074 - TextUtils.getTrimmedLength("")), "᥀撺牍嶎흪㺤轃鯋䌪ŭȍ\u000f鑺浐烽垯", "\ude40췄ਐ䥞", objArr25);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr25[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -1311835732, 1311835738, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis()))).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{81920}, 605561253, -605561234, 81920)).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], 948133992, -948133975, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{0, 10}, -270093239, 270093252, 0))).ThreeDS2Service(get()).getWarnings());
        Object[] objArr26 = new Object[1];
        b((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10, (char) (MotionEvent.axisFromString("") + 1), TextUtils.getTrimmedLength("") + 111, objArr26);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance5 = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr26[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], 1445068217, -1445068217, (int) System.currentTimeMillis()));
        Object[] objArr27 = new Object[1];
        b((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), 122 - View.getDefaultSize(0, 0), objArr27);
        String intern7 = ((String) objArr27[0]).intern();
        Object[] objArr28 = new Object[1];
        b(4 - TextUtils.getTrimmedLength(""), (char) (59945 - KeyEvent.normalizeMetaState(0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, objArr28);
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance5.getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[]{intern7, ((String) objArr28[0]).intern()}}, -645482314, 645482321, (int) System.currentTimeMillis())).getWarnings());
        Object[] objArr29 = new Object[1];
        a("㿌ᓃ\uf548\uf000", Color.red(0), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 21587), "㩗꯲勬\ue578웭想䏂㬞숋툙澬಼뇫뵁", "쇶ζ刌顔", objArr29);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr29[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1311835732, 1311835738, (int) System.currentTimeMillis())).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{setCacheColorHint.getWarnings.ThreeDS2ServiceInstance}, -1224432618, 1224432628, (int) System.currentTimeMillis()))).getWarnings());
        Object[] objArr30 = new Object[1];
        b('@' - AndroidCharacter.getMirror('0'), (char) (52958 - TextUtils.lastIndexOf("", '0', 0, 0)), 129 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr30);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance6 = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr30[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern4}}, 1859274854, -1859274847, (int) System.currentTimeMillis())));
        Object[] objArr31 = new Object[1];
        a("㿌ᓃ\uf548\uf000", View.MeasureSpec.getMode(0), (char) (ViewConfiguration.getTapTimeout() >> 16), "燐潢䉝帮昡疛瘄큦", "ᕹሏ\uee27鶒", objArr31);
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance6.getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{((String) objArr31[0]).intern()}, 998418748, -998418727, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1360902539, -1360902519, 45))).getWarnings());
        Object[] objArr32 = new Object[1];
        a("㿌ᓃ\uf548\uf000", (-460493352) - Process.getGidForName(""), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), "\ued45䶑\uef76쓭⥋붅鸷", "\ud989赭嗤闵", objArr32);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr32[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern3, intern, intern2, intern4}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{2048}, 605561253, -605561234, 2048)).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -1083959071, 1083959079, (int) System.currentTimeMillis()))).ThreeDS2Service(initialize()).getWarnings());
        Object[] objArr33 = new Object[1];
        a("㿌ᓃ\uf548\uf000", ViewConfiguration.getPressedStateDuration() >> 16, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), "쎒\uec85骠傡昦\u2fef컎㳺긚㬢崥獳鴕蠗ᠰ蔥Ṃᙥ甊륂ﳦḰ", "琹掞嶃Ⲫ", objArr33);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr33[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern3}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1360902539, -1360902519, 45)).getWarnings());
        Object[] objArr34 = new Object[1];
        a("㿌ᓃ\uf548\uf000", View.resolveSize(0, 0), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), "䏃㎹큣埗犎\ude3c攉땣⧛⇯", "闕\uf522䔒\ue4fd", objArr34);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr34[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1311835732, 1311835738, (int) System.currentTimeMillis())).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{36}, -710732177, 710732200, 36)).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{this.getWarnings.createTransaction()}, 1725422414, -1725422412, (int) System.currentTimeMillis()))).getWarnings());
        Object[] objArr35 = new Object[1];
        a("㿌ᓃ\uf548\uf000", (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) - 618450472, (char) (Process.myPid() >> 22), "⨠親쒈峮\ua7da䕹颁뼏쪒삋晖퐴埂갠츘웯僱좲⢐䱘\u0acf҃㇀ͭ\uf7d5", "\ud990⌱髛ࠫ", objArr35);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance7 = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr35[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern3, intern, intern2}}, 1859274854, -1859274847, (int) System.currentTimeMillis())));
        Object[] objArr36 = new Object[1];
        b(Drawable.resolveOpacity(0, 0) + 6, (char) (8494 - View.MeasureSpec.getSize(0)), (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, objArr36);
        SVG$Unit$EnumUnboxingLocalUtility.m((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{((String) objArr36[0]).intern()}, 998418748, -998418727, (int) System.currentTimeMillis()), (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1360902539, -1360902519, 45), threeDS2ServiceInstance7, equalsVar);
        Object[] objArr37 = new Object[1];
        a("㿌ᓃ\uf548\uf000", Color.rgb(0, 0, 0) - 664381996, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), "౨蔐땞ᇷ⮮葙\ud802\udbbd\uf78bә篅", "풂晕姗ࡧ", objArr37);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance8 = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr37[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1729819282, 1729819291, (int) System.currentTimeMillis()));
        compareTo compareto3 = (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis());
        Object[] objArr38 = new Object[1];
        a("㿌ᓃ\uf548\uf000", TextUtils.getCapsMode("", 0, 0) + 42944349, (char) (TextUtils.indexOf((CharSequence) "", '0') + 22449), "\uf606", "嶥轇뀂繗", objArr38);
        String intern8 = ((String) objArr38[0]).intern();
        Object[] objArr39 = new Object[1];
        b(-TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 40003), 48 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr39);
        String intern9 = ((String) objArr39[0]).intern();
        Object[] objArr40 = new Object[1];
        a("㿌ᓃ\uf548\uf000", (ViewConfiguration.getPressedStateDuration() >> 16) - 160863410, (char) (35728 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1))), "ﺛ", "亦楫迶벋", objArr40);
        String intern10 = ((String) objArr40[0]).intern();
        Object[] objArr41 = new Object[1];
        a("㿌ᓃ\uf548\uf000", 23531451 - TextUtils.getCapsMode("", 0, 0), (char) (3706 - TextUtils.indexOf("", "", 0)), "䏄", "뭕朏稁㠎", objArr41);
        String intern11 = ((String) objArr41[0]).intern();
        Object[] objArr42 = new Object[1];
        b((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) View.MeasureSpec.getMode(0), 152 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr42);
        String intern12 = ((String) objArr42[0]).intern();
        Object[] objArr43 = new Object[1];
        a("㿌ᓃ\uf548\uf000", TextUtils.indexOf((CharSequence) "", '0') + 1515895093, (char) (44218 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), "鸌", "㑪媹륚¬", objArr43);
        String intern13 = ((String) objArr43[0]).intern();
        Object[] objArr44 = new Object[1];
        b(-ImageFormat.getBitsPerPixel(0), (char) View.MeasureSpec.getMode(0), 153 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr44);
        String intern14 = ((String) objArr44[0]).intern();
        Object[] objArr45 = new Object[1];
        b(1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) Gravity.getAbsoluteGravity(0, 0), 154 - (Process.myTid() >> 22), objArr45);
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance8.getWarnings(compareto3.get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[]{intern8, intern9, intern10, intern11, intern12, intern13, intern14, ((String) objArr45[0]).intern()}}, 1032208890, -1032208890, (int) System.currentTimeMillis()))).getWarnings());
        Object[] objArr46 = new Object[1];
        b(20 - View.MeasureSpec.getSize(0), (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 31397), (Process.myTid() >> 22) + EnumC0170g.SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS_VALUE, objArr46);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr46[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern3, intern, intern2, intern4}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{64}, 1360902539, -1360902519, 64)).getWarnings());
        Object[] objArr47 = new Object[1];
        a("㿌ᓃ\uf548\uf000", ViewConfiguration.getScrollDefaultDelay() >> 16, (char) TextUtils.getTrimmedLength(""), "蚣迍贍ݖﲀ\uf21b\ue499ꆀ\ue9d1숧\ue63b쯯", "淒ع뽯줭", objArr47);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr47[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern3, intern, intern2, intern4}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1360902539, -1360902519, 45)).getWarnings());
        Object[] objArr48 = new Object[1];
        a("㿌ᓃ\uf548\uf000", (ViewConfiguration.getJumpTapTimeout() >> 16) - 1725075093, (char) Color.argb(0, 0, 0, 0), "釙\ue356෧感밝ꎀ᳖\u200f썕\ud92b趆", "欨\u2d71禙䳇", objArr48);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr48[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern3, intern, intern2, intern4}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{256}, 1360902539, -1360902519, 256)).getWarnings());
        if (!this.ThreeDS2Service.ThreeDS2ServiceInstance()) {
            cleanup = (getSDKInfo + 101) % 128;
            Object[] objArr49 = new Object[1];
            a("㿌ᓃ\uf548\uf000", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1663931990, (char) (5482 - Color.red(0)), "\ud8e1寈〘抠\uf587홞ळ于佗桝⮳綡΄\ue89f\ud904ퟀ㚾㳎얝", "嚝ⶖ橣樕", objArr49);
            SVG$Unit$EnumUnboxingLocalUtility.m((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis()), (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 605561253, -605561234, 45), ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr49[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern3, intern, intern2, intern4}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))), equalsVar);
            Object[] objArr50 = new Object[1];
            b(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 19, (char) (1734 - ((byte) KeyEvent.getModifierMetaStateMask())), (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 50, objArr50);
            SVG$Unit$EnumUnboxingLocalUtility.m((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis()), (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 605561253, -605561234, 45), ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr50[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance(((clone) name.get(new Object[]{new String[]{intern3, intern, intern2}}, 1859274854, -1859274847, (int) System.currentTimeMillis())).initialize(((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern4}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))))), equalsVar);
            Object[] objArr51 = new Object[1];
            b(View.resolveSizeAndState(0, 0, 0) + 17, (char) (56273 - Drawable.resolveOpacity(0, 0)), ImageFormat.getBitsPerPixel(0) + 69, objArr51);
            SVG$Unit$EnumUnboxingLocalUtility.m((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis()), (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{350}, 605561253, -605561234, 350), ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr51[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern3, intern, intern2, intern4}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))), equalsVar);
            cleanup = (getSDKInfo + 85) % 128;
        }
        return equalsVar.ThreeDS2ServiceInstance();
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        hashCode hashcode = (hashCode) objArr[0];
        ArrayList arrayList = new ArrayList();
        Object[] objArr2 = new Object[1];
        a("㿌ᓃ\uf548\uf000", TextUtils.getOffsetBefore("", 0) - 810357251, (char) (59302 - (KeyEvent.getMaxKeyCode() >> 16)), "\ued9d懴瑃诟⤝藵\uf7c6翳溇瑕푔踮쭹", "ﶒ닭ꛏ\ueee7", objArr2);
        arrayList.add(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr2[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -1083959071, 1083959079, (int) System.currentTimeMillis())).ThreeDS2Service(hashcode.ThreeDS2Service()).getWarnings());
        int i = cleanup + 77;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    public static void getWarnings(long j, long j2) {
        int i = cleanup + 97;
        getSDKInfo = i % 128;
        int i2 = i % 2;
        Class cls = Boolean.TYPE;
        try {
            if (i2 == 0) {
                Object[] objArr = {((Class) removeParam.initialize(78 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (ImageFormat.getBitsPerPixel(0) + 10196), 7934 - TextUtils.lastIndexOf("", '0'))).getField("ThreeDS2Service").get(null), Boolean.TRUE};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1643948346);
                if (obj == null) {
                    obj = ((Class) removeParam.initialize(78 - ExpandableListView.getPackedPositionType(0L), (char) (59653 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 7711)).getMethod("get", (Class) removeParam.initialize('~' - AndroidCharacter.getMirror('0'), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 10195), 7936 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), cls);
                    map.put(-1643948346, obj);
                }
                ((Method) obj).invoke(null, objArr);
                return;
            }
            Object[] objArr2 = {((Class) removeParam.initialize(Process.getGidForName("") + 79, (char) (10196 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1))), 7935 - (ViewConfiguration.getWindowTouchSlop() >> 8))).getField("ThreeDS2Service").get(null), Boolean.TRUE};
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj2 = map2.get(-1643948346);
            if (obj2 == null) {
                obj2 = ((Class) removeParam.initialize((Process.myPid() >> 22) + 78, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 59653), 7711 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("get", (Class) removeParam.initialize(78 - TextUtils.indexOf("", "", 0), (char) (TextUtils.indexOf("", "") + 10195), 7935 - View.resolveSizeAndState(0, 0, 0)), cls);
                map2.put(-1643948346, obj2);
            }
            ((Method) obj2).invoke(null, objArr2);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
