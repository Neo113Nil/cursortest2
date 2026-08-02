package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
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
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class ordinal extends getView {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char ThreeDS2ServiceInstance;
    private static int cleanup;
    private static char createTransaction;
    private static char get;
    private static char getSDKInfo;
    private static int getSDKVersion;
    private static long initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        cleanup = 0;
        getSDKVersion = 1;
        initialize = 1837970334090182029L;
        get = (char) 46027;
        ThreeDS2ServiceInstance = (char) 62952;
        getSDKInfo = (char) 15398;
        createTransaction = (char) 43009;
    }

    public ordinal(nh nhVar, setFontFeatureSettings setfontfeaturesettings) {
        super(nhVar, setfontfeaturesettings);
    }

    private List<setCollapsible> ThreeDS2Service() {
        equals equalsVar = new equals();
        Object[] objArr = new Object[1];
        a("괔\ue96f䚜贵\ue5f7┩嬙䭌䚜贵❨ﻼ㊘\uf711\ue5f7┩\u0ad4낯⭙蜩", 21 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], 1445068217, -1445068217, (int) System.currentTimeMillis()));
        compareTo compareto = (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis());
        Object[] objArr2 = new Object[1];
        a("\ue638艴꽡⩽", MotionEvent.axisFromString("") + 5, objArr2);
        String intern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b("붿퉍扟\uf275ɨ", Color.red(0) + 28661, objArr3);
        SVG$Unit$EnumUnboxingLocalUtility.m(compareto.get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[]{intern, ((String) objArr3[0]).intern()}}, 1032208890, -1032208890, (int) System.currentTimeMillis())), (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[0]}, -1709207342, 1709207347, (int) System.currentTimeMillis()), threeDS2ServiceInstance, equalsVar);
        Object[] objArr4 = new Object[1];
        a("血䃯魓吨", 3 - TextUtils.lastIndexOf("", '0', 0, 0), objArr4);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr4[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{8059}, 605561253, -605561234, 8059)).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -1083959071, 1083959079, (int) System.currentTimeMillis()))).getWarnings());
        Object[] objArr5 = new Object[1];
        a("腊솬", Color.alpha(0) + 2, objArr5);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr5[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], 1445068217, -1445068217, (int) System.currentTimeMillis())).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{64}, 605561253, -605561234, 64)).getWarnings());
        Object[] objArr6 = new Object[1];
        a("顨鲆\uf06e꾶", (ViewConfiguration.getJumpTapTimeout() >> 16) + 4, objArr6);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr6[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], 1445068217, -1445068217, (int) System.currentTimeMillis())).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{64}, 605561253, -605561234, 64)).getWarnings());
        List<setCollapsible> ThreeDS2ServiceInstance2 = equalsVar.ThreeDS2ServiceInstance();
        int i = cleanup + 67;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            return ThreeDS2ServiceInstance2;
        }
        throw null;
    }

    private List<setCollapsible> ThreeDS2ServiceInstance() {
        equals equalsVar = new equals();
        Object[] objArr = new Object[1];
        a("灃\uf27f咯軮鈍䅓濑\uf756", 8 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr);
        SVG$Unit$EnumUnboxingLocalUtility.m((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis()), (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -637702868, 637702893, (int) System.currentTimeMillis()), ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], 1445068217, -1445068217, (int) System.currentTimeMillis())), equalsVar);
        Object[] objArr2 = new Object[1];
        b("붽寫焍ཋ", (-16718253) - Color.rgb(0, 0, 0), objArr2);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr2[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -637702868, 637702893, (int) System.currentTimeMillis())).getWarnings());
        Object[] objArr3 = new Object[1];
        a("쀟떢သ᱔ꬲ궨\udb76瑱\uf06e꾶", 10 - (ViewConfiguration.getTapTimeout() >> 16), objArr3);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr3[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -637702868, 637702893, (int) System.currentTimeMillis())).getWarnings());
        List<setCollapsible> ThreeDS2ServiceInstance2 = equalsVar.ThreeDS2ServiceInstance();
        int i = cleanup + 93;
        getSDKVersion = i % 128;
        if (i % 2 == 0) {
            int i2 = 76 / 0;
        }
        return ThreeDS2ServiceInstance2;
    }

    private static void a(String str, int i, Object[] objArr) {
        int i2;
        $10 = ($11 + 69) % 128;
        char[] charArray = str != null ? str.toCharArray() : str;
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
        char[] cArr = new char[charArray.length];
        int i3 = 0;
        configurationBuilder.ThreeDS2ServiceInstance = 0;
        int i4 = 2;
        char[] cArr2 = new char[2];
        while (true) {
            int i5 = configurationBuilder.ThreeDS2ServiceInstance;
            if (i5 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i);
                return;
            }
            int i6 = ($10 + 11) % 128;
            $11 = i6;
            cArr2[i3] = charArray[i5];
            char c = 1;
            cArr2[1] = charArray[i5 + 1];
            $10 = (i6 + 51) % 128;
            int i7 = 58224;
            int i8 = i3;
            while (i8 < 16) {
                char c2 = cArr2[c];
                char c3 = cArr2[i3];
                char c4 = c;
                int i9 = i4;
                char[] cArr3 = cArr2;
                int i10 = (c3 + i7) ^ ((c3 << 4) + ((char) (getSDKInfo ^ (-1730380012335540218L))));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(createTransaction);
                    objArr2[i9] = Integer.valueOf(i11);
                    objArr2[c4] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c2);
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(936379577);
                    Class cls = Integer.TYPE;
                    if (obj != null) {
                        i2 = i3;
                    } else {
                        i2 = i3;
                        obj = ((Class) removeParam.initialize((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 67, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 62396), (-16771864) - Color.rgb(i3, i3, i3))).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, obj);
                    }
                    char charValue = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    cArr3[c4] = charValue;
                    char c5 = cArr3[i2];
                    int i12 = i7;
                    int i13 = (charValue + i7) ^ ((charValue << 4) + ((char) (get ^ (-1730380012335540218L))));
                    int i14 = charValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(ThreeDS2ServiceInstance);
                    objArr3[i9] = Integer.valueOf(i14);
                    objArr3[c4] = Integer.valueOf(i13);
                    objArr3[i2] = Integer.valueOf(c5);
                    Object obj2 = map.get(936379577);
                    if (obj2 == null) {
                        int i15 = i2;
                        obj2 = ((Class) removeParam.initialize(67 - Color.argb(i15, i15, i15, i15), (char) (62396 - Color.alpha(i15)), ((Process.getThreadPriority(i15) + 20) >> 6) + 5352)).getMethod("C", cls, cls, cls, cls);
                        map.put(936379577, obj2);
                    }
                    cArr3[0] = ((Character) ((Method) obj2).invoke(null, objArr3)).charValue();
                    i7 = i12 - 40503;
                    i8++;
                    $11 = ($10 + 115) % 128;
                    c = c4;
                    i4 = i9;
                    cArr2 = cArr3;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i16 = i4;
            char[] cArr4 = cArr2;
            char c6 = c;
            int i17 = configurationBuilder.ThreeDS2ServiceInstance;
            cArr[i17] = cArr4[0];
            cArr[i17 + 1] = cArr4[c6];
            Object[] objArr4 = new Object[i16];
            objArr4[c6] = configurationBuilder;
            objArr4[0] = configurationBuilder;
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj3 = map2.get(108358357);
            if (obj3 == null) {
                obj3 = ((Class) removeParam.initialize(View.combineMeasuredStates(0, 0) + 54, (char) (39910 - View.resolveSizeAndState(0, 0, 0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7058)).getMethod("B", Object.class, Object.class);
                map2.put(108358357, obj3);
            }
            ((Method) obj3).invoke(null, objArr4);
            i4 = i16;
            cArr2 = cArr4;
            i3 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(String str, int i, Object[] objArr) {
        char[] cArr;
        Throwable cause;
        Object method;
        int i2 = $11;
        $10 = (i2 + 107) % 128;
        if (str != null) {
            $10 = (i2 + 79) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        addParam addparam = new addParam();
        addparam.initialize = i;
        int length = cArr2.length;
        long[] jArr = new long[length];
        int i3 = 0;
        addparam.ThreeDS2Service = 0;
        while (true) {
            int i4 = addparam.ThreeDS2Service;
            if (i4 >= cArr2.length) {
                break;
            }
            int i5 = $10 + 23;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            Class cls = Integer.TYPE;
            int i7 = i3;
            if (i6 == 0) {
                char c = cArr2[i4];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[2] = addparam;
                    objArr2[1] = addparam;
                    objArr2[i7] = Integer.valueOf(c);
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-983980093);
                    if (obj != null) {
                        method = obj;
                    } else {
                        method = ((Class) removeParam.initialize(65 - ExpandableListView.getPackedPositionChild(0L), (char) (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), 12511 - Color.blue(i7))).getMethod("e", cls, Object.class, Object.class);
                        map.put(-983980093, method);
                    }
                    jArr[i4] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() | (initialize ^ 6009743645011411028L);
                    Object[] objArr3 = new Object[2];
                    objArr3[1] = addparam;
                    objArr3[i7] = addparam;
                    Object obj2 = map.get(-1840119381);
                    if (obj2 == null) {
                        Class cls2 = (Class) removeParam.initialize(75 - Process.getGidForName(""), (char) ((ExpandableListView.getPackedPositionForChild(i7, i7) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i7, i7) == 0L ? 0 : -1)) + 62098), 2102 - ExpandableListView.getPackedPositionType(0L));
                        Object[] objArr4 = new Object[1];
                        c((short) 0, 0, 0, objArr4);
                        obj2 = cls2.getMethod((String) objArr4[0], Object.class, Object.class);
                        map.put(-1840119381, obj2);
                    }
                    ((Method) obj2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                Object[] objArr5 = {Integer.valueOf(cArr2[i4]), addparam, addparam};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(-983980093);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 65, (char) Color.argb(0, 0, 0, 0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12510)).getMethod("e", cls, Object.class, Object.class);
                    map2.put(-983980093, obj3);
                }
                jArr[i4] = ((Long) ((Method) obj3).invoke(null, objArr5)).longValue() ^ (initialize ^ 6009743645011411028L);
                Object[] objArr6 = {addparam, addparam};
                Object obj4 = map2.get(-1840119381);
                if (obj4 == null) {
                    Class cls3 = (Class) removeParam.initialize(75 - MotionEvent.axisFromString(""), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 62098), View.resolveSize(0, 0) + 2102);
                    Object[] objArr7 = new Object[1];
                    c((short) 0, 0, 0, objArr7);
                    obj4 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(-1840119381, obj4);
                }
                ((Method) obj4).invoke(null, objArr6);
            }
            i3 = 0;
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr3 = new char[length];
        addparam.ThreeDS2Service = 0;
        while (true) {
            int i8 = addparam.ThreeDS2Service;
            if (i8 >= cArr2.length) {
                objArr[0] = new String(cArr3);
                return;
            }
            cArr3[i8] = (char) jArr[i8];
            Object[] objArr8 = {addparam, addparam};
            Map map3 = removeParam.visaSchemeConfiguration;
            Object obj5 = map3.get(-1840119381);
            if (obj5 == null) {
                Class cls4 = (Class) removeParam.initialize(76 - View.getDefaultSize(0, 0), (char) ((-16715119) - Color.rgb(0, 0, 0)), 2102 - Color.red(0));
                Object[] objArr9 = new Object[1];
                c((short) 0, 0, 0, objArr9);
                obj5 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                map3.put(-1840119381, obj5);
            }
            ((Method) obj5).invoke(null, objArr8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, int i, int i2, Object[] objArr) {
        int i3;
        int i4;
        byte[] bArr = $$a;
        int i5 = 99 - (i2 * 2);
        int i6 = (i * 3) + 1;
        int i7 = 3 - (s * 2);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i6;
            i4 = 0;
            i5 += -i8;
            i3 = i4;
            i7++;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i8 = bArr[i7];
            i5 += -i8;
            i3 = i4;
            i7++;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            i7++;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{98, 104, -90, -34};
        $$b = EnumC0170g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE;
    }

    private List<setCollapsible> initialize() {
        Object[] objArr = new Object[1];
        a("蔉犬", 1 - TextUtils.getCapsMode("", 0, 0), objArr);
        String intern = ((String) objArr[0]).intern();
        equals equalsVar = new equals();
        Object[] objArr2 = new Object[1];
        a("ꬲ궨嬙䭌ὅ檯旺镌໕旐\u0ad4낯䳂导\uf471慟秇䜳\ue60c鮹ᅆ\ud913쌿揤ᒚ\uf701蚒쌫〃왩", 31 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr2);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr2[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis()));
        Object[] objArr3 = new Object[1];
        b("뷩㎃", (Process.myTid() >> 22) + 36457, objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        b("뷠쒓", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 31090, objArr4);
        compareTo compareto = (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{intern2, ((String) objArr4[0]).intern()}, 120740260, -120740242, (int) System.currentTimeMillis());
        Object[] objArr5 = new Object[1];
        a("鉤誎", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2, objArr5);
        String intern3 = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a("\u1941ꂮ", 2 - Color.blue(0), objArr6);
        SVG$Unit$EnumUnboxingLocalUtility.m(compareto, (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[]{intern3, ((String) objArr6[0]).intern()}}, 1032208890, -1032208890, (int) System.currentTimeMillis()), threeDS2ServiceInstance, equalsVar);
        Object[] objArr7 = new Object[1];
        b("붺⪔鏲磚\ue121丅㝩龽Ҕ\uedd0嫊쌺ꠄᅽ鈴暆쿻듕ᴂ訓獉\udbbf䂑⧣雍缨", View.MeasureSpec.makeMeasureSpec(0, 0) + 38693, objArr7);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr7[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[]{intern}}, 1032208890, -1032208890, (int) System.currentTimeMillis())).getWarnings());
        Object[] objArr8 = new Object[1];
        a("ꬲ궨嬙䭌ὅ檯旺镌໕旐\u0ad4낯䳂导\uf471慟秇䜳㻓꾛ㆥ⌶庈ঢ়껣瓵蚒쌫〃왩", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 30, objArr8);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance2 = (setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr8[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis());
        Object[] objArr9 = new Object[1];
        b("붺⪔鏲磚\ue121丅㝩龽Ҕ\uedd0嫊쌺ꠄᅽ鈴暆쿻듕ᴂ訓獉\udbbf䂑⧣雍缨", 38693 - View.MeasureSpec.getSize(0), objArr9);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance3 = threeDS2ServiceInstance2.get((clone) name.get(new Object[]{((String) objArr9[0]).intern(), new String[]{intern}}, 424304478, -424304468, (int) System.currentTimeMillis()));
        compareTo compareto2 = (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis());
        Object[] objArr10 = new Object[1];
        b("뷩㎃", 36457 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr10);
        String intern4 = ((String) objArr10[0]).intern();
        Object[] objArr11 = new Object[1];
        b("뷠쒓", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 31090, objArr11);
        compareTo compareto3 = compareto2.get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{intern4, ((String) objArr11[0]).intern()}, 120740260, -120740242, (int) System.currentTimeMillis()));
        Object[] objArr12 = new Object[1];
        a("鉤誎", 2 - (ViewConfiguration.getTouchSlop() >> 8), objArr12);
        String intern5 = ((String) objArr12[0]).intern();
        Object[] objArr13 = new Object[1];
        a("\u1941ꂮ", (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 1, objArr13);
        SVG$Unit$EnumUnboxingLocalUtility.m(compareto3, (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[]{intern5, ((String) objArr13[0]).intern()}}, 1032208890, -1032208890, (int) System.currentTimeMillis()), threeDS2ServiceInstance3, equalsVar);
        Object[] objArr14 = new Object[1];
        b("붺㘠ꪚἆ鏱ѩ\uf8d1浉\ue134善츒䊖㝴ꯁ᱙郒һ更涧\ue67f嫣콛䏛㞶ꠌᲑ鄛", TextUtils.getOffsetAfter("", 0) + 35729, objArr14);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance4 = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr14[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis()));
        Object[] objArr15 = new Object[1];
        a("鉤誎", 2 - (ViewConfiguration.getTouchSlop() >> 8), objArr15);
        String intern6 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        b("뷭ᜩ", 43717 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr16);
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance4.getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{intern6, ((String) objArr16[0]).intern()}, 1455066804, -1455066795, (int) System.currentTimeMillis())).getWarnings());
        Object[] objArr17 = new Object[1];
        b("붺⦎闆Ĉ\ued49墇쓍뀇᱄讪矎\ue318佌㪯ꛅሜ﹛斏퇻봕⥗钗ß", Gravity.getAbsoluteGravity(0, 0) + 37951, objArr17);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr17[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], 1445068217, -1445068217, (int) System.currentTimeMillis())).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1360902539, -1360902519, 45))).getWarnings());
        Object[] objArr18 = new Object[1];
        a("ꬲ궨嬙䭌ὅ檯旺镌໕旐\u0ad4낯䳂导\uf471慟秇䜳㨪뷞䒆䴃頤ت郓\ued3d", 25 - Color.alpha(0), objArr18);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance5 = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr18[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis()));
        Object[] objArr19 = new Object[1];
        b("붗", 30392 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr19);
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance5.getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[]{intern, ((String) objArr19[0]).intern()}}, 1032208890, -1032208890, (int) System.currentTimeMillis())).getWarnings());
        Object[] objArr20 = new Object[1];
        b("붺멚뉮ꩴꈙ騫鈵諓苤\ufade\uf296\ueab4\ue2bc\udb73퍭쭨쌛㬻㌋⯇⏢\u1bf9ᎇ\u0ba1", Color.green(0) + 2027, objArr20);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance6 = (setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr20[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis());
        Object[] objArr21 = new Object[1];
        a("ꬲ궨嬙䭌ὅ檯旺镌໕旐\u0ad4낯䳂导\uf471慟秇䜳㨪뷞䒆䴃頤ت郓\ued3d", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 25, objArr21);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance7 = threeDS2ServiceInstance6.get((clone) name.get(new Object[]{((String) objArr21[0]).intern(), new String[]{intern}}, 424304478, -424304468, (int) System.currentTimeMillis()));
        compareTo compareto4 = (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis());
        Object[] objArr22 = new Object[1];
        b("붗", 30391 - Drawable.resolveOpacity(0, 0), objArr22);
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance7.getWarnings(compareto4.get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[]{intern, ((String) objArr22[0]).intern()}}, 1032208890, -1032208890, (int) System.currentTimeMillis()))).getWarnings());
        List<setCollapsible> ThreeDS2ServiceInstance2 = equalsVar.ThreeDS2ServiceInstance();
        cleanup = (getSDKVersion + 29) % 128;
        return ThreeDS2ServiceInstance2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getView
    public List<setCollapsible> getWarnings() {
        Object[] objArr = new Object[1];
        a("鉤誎", View.MeasureSpec.makeMeasureSpec(0, 0) + 2, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("\u1941ꂮ", (ViewConfiguration.getScrollBarSize() >> 8) + 2, objArr2);
        String intern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b("뷩㎃", (-16740759) - Color.rgb(0, 0, 0), objArr3);
        String intern3 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a("ﶚே", 3 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr4);
        String intern4 = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        a("\uf518풻", Color.rgb(0, 0, 0) + 16777218, objArr5);
        String intern5 = ((String) objArr5[0]).intern();
        equals equalsVar = new equals();
        Object[] objArr6 = new Object[1];
        b("붭艌쉑ɋ䉈艬쉤ɡ䉔艎쉍ɣ䉷艔쉽ɫ䉧艧쉚ɚ", (ViewConfiguration.getLongPressTimeout() >> 16) + 16381, objArr6);
        SVG$Unit$EnumUnboxingLocalUtility.m(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{36}, -710732177, 710732200, 36)), (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{this.getWarnings.get()}, 1725422414, -1725422412, (int) System.currentTimeMillis()), ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr6[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1311835732, 1311835738, (int) System.currentTimeMillis())), equalsVar);
        Object[] objArr7 = new Object[1];
        b("붸淓ᵸ첡ﰒ꾡忁ི㻴\uee1a馂䤮祚⣟", (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 53353, objArr7);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr7[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1311835732, 1311835738, (int) System.currentTimeMillis()));
        compareTo compareto = (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis());
        compareTo compareto2 = (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{3}, -710732177, 710732200, 3);
        Object[] objArr8 = new Object[1];
        a("頵緘鹏⹊", 4 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr8);
        String intern6 = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        b("뷫㸧멺", (ViewConfiguration.getEdgeSlop() >> 16) + 33739, objArr9);
        SVG$Unit$EnumUnboxingLocalUtility.m(compareto.get(compareto2.get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{intern6, ((String) objArr9[0]).intern()}, 1455066804, -1455066795, (int) System.currentTimeMillis()))), (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{Integer.valueOf(this.getWarnings.getSDKInfo())}, 1099490190, -1099490187, (int) System.currentTimeMillis()), threeDS2ServiceInstance, equalsVar);
        Object[] objArr10 = new Object[1];
        b("붸霃\ue8d8㶺ᝩ栉뷃", 10937 - ExpandableListView.getPackedPositionType(0L), objArr10);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance2 = (setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr10[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis());
        clone cloneVar = (clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis());
        Object[] objArr11 = new Object[1];
        b("뷩阡", 11212 - MotionEvent.axisFromString(""), objArr11);
        String intern7 = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        a("鄤鸺", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2, objArr12);
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance2.get(cloneVar.ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern7, ((String) objArr12[0]).intern()}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{300000}, 605561253, -605561234, 300000)).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], 982291278, -982291277, (int) System.currentTimeMillis()))).getWarnings());
        Object[] objArr13 = new Object[1];
        a("\uddb6쪑镲艴漐阯碇紤\ue572풑", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 9, objArr13);
        SVG$Unit$EnumUnboxingLocalUtility.m(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{36}, -710732177, 710732200, 36)), (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{this.getWarnings.initialize()}, 1725422414, -1725422412, (int) System.currentTimeMillis()), ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr13[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1311835732, 1311835738, (int) System.currentTimeMillis())), equalsVar);
        Object[] objArr14 = new Object[1];
        a("\uddb6쪑\udfda氎欅猋롤㥒碯曷", 8 - TextUtils.lastIndexOf("", '0', 0, 0), objArr14);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance3 = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr14[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis()));
        compareTo compareto3 = (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis());
        Object[] objArr15 = new Object[1];
        a("若῍", View.resolveSizeAndState(0, 0, 0) + 2, objArr15);
        String intern8 = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        b("뷠쒓", 31090 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr16);
        compareTo compareto4 = compareto3.get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{intern8, ((String) objArr16[0]).intern()}, 120740260, -120740242, (int) System.currentTimeMillis()));
        Object[] objArr17 = new Object[1];
        b("뷩阡", TextUtils.getOffsetBefore("", 0) + 11213, objArr17);
        String intern9 = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        a("鄤鸺", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3, objArr18);
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance3.getWarnings(compareto4.get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[]{intern, intern2, intern3, intern4, intern9, ((String) objArr18[0]).intern(), intern5}}, 1032208890, -1032208890, (int) System.currentTimeMillis()))).getWarnings());
        Object[] objArr19 = new Object[1];
        a("ꬲ궨嬙䭌ὅ檯旺镌햱䫇剪\uf268\uf6eb밒钏\uf3c3桇㝙", (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 17, objArr19);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr19[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern, intern2, intern3, intern4, intern5}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1360902539, -1360902519, 45)).getWarnings());
        Object[] objArr20 = new Object[1];
        a("ꬲ궨嬙䭌ὅ檯旺镌嗦㻇Ṻ권෴몙塲\ue45e旡됣풩벞㊘\uf711", (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 22, objArr20);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance4 = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr20[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1311835732, 1311835738, (int) System.currentTimeMillis()));
        compareTo compareto5 = (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis());
        Object[] objArr21 = new Object[1];
        a("蔉犬", -TextUtils.indexOf((CharSequence) "", '0', 0), objArr21);
        String intern10 = ((String) objArr21[0]).intern();
        Object[] objArr22 = new Object[1];
        b("붗", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 30391, objArr22);
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance4.getWarnings(compareto5.get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[]{intern10, ((String) objArr22[0]).intern()}}, 1032208890, -1032208890, (int) System.currentTimeMillis()))).getWarnings());
        Object[] objArr23 = new Object[1];
        b("붺䘾䪦优厉呷壭嵗懄斛渡犈真篣籉×Ց", 64398 - Process.getGidForName(""), objArr23);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr23[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -1083959071, 1083959079, (int) System.currentTimeMillis()))).ThreeDS2Service(initialize()).getWarnings());
        Object[] objArr24 = new Object[1];
        b("붺멪눎ꨤꋙ髻銕譃荤אָ\uf339\uebc4\ue3ef\udbbf큡졣쀑㠆ト⣷", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2011, objArr24);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr24[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -1083959071, 1083959079, (int) System.currentTimeMillis())).ThreeDS2Service(initialize()).getWarnings());
        Object[] objArr25 = new Object[1];
        b("붺忪礎᪤㓙홻\uf395跃꽤䢣樹і⇲쌎\udd46ﻭ頍떷埍", TextUtils.indexOf((CharSequence) "", '0') + 57948, objArr25);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr25[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern, intern2, intern3, intern4, intern5}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1360902539, -1360902519, 45))).getWarnings());
        Object[] objArr26 = new Object[1];
        b("붺\uf066☖吰諩㢏溽鵟팄ğ럑\ue582ᮢ乾ﱺ㈢惌雲", 19928 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr26);
        SVG$Unit$EnumUnboxingLocalUtility.m((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis()), (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1360902539, -1360902519, 45), ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr26[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance(((clone) name.get(new Object[]{new String[]{intern2, intern3}}, 1859274854, -1859274847, (int) System.currentTimeMillis())).initialize(((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern4, intern5}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))))), equalsVar);
        Object[] objArr27 = new Object[1];
        b("붺瓈⽊\ue1de顑勡ա㿱\uf674꣑挍ᖌ찚蚨뤢玶⨽", 51577 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr27);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr27[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern, intern2, intern3, intern4, intern5}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{350}, 1360902539, -1360902519, 350))).getWarnings());
        Object[] objArr28 = new Object[1];
        b("붺㨐닺⭖ꌱᮙ遱ࣙ肴礹\uf1fd湔\ue63a庠흲俎잽밡㓥굎┤鶏ᩮ鋚મ茒", 34721 - (Process.myTid() >> 22), objArr28);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance5 = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr28[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern, intern2, intern3, intern4, intern5}}, 1859274854, -1859274847, (int) System.currentTimeMillis())));
        Object[] objArr29 = new Object[1];
        a("蔉犬", 1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr29);
        String intern11 = ((String) objArr29[0]).intern();
        Object[] objArr30 = new Object[1];
        b("붗", 30391 - View.getDefaultSize(0, 0), objArr30);
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance5.getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[]{intern11, ((String) objArr30[0]).intern()}}, 1032208890, -1032208890, (int) System.currentTimeMillis())).getWarnings());
        Object[] objArr31 = new Object[1];
        b("붺梺ឮ슔\ue999钋䏵滳ᗤ샩\uefd2髌䄸氵ᬷ옵\ued07頄䝰", 54539 - View.resolveSize(0, 0), objArr31);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr31[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern2, intern3}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis())).get(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], 948133992, -948133975, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{1, 8}, -270093239, 270093252, 1))).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{4, 45}, -735320945, 735320951, (int) System.currentTimeMillis()))).getWarnings());
        Object[] objArr32 = new Object[1];
        a("灃\uf27f퐻䭫獼镜ㄿ뭩㊘\uf711頤ت㯚뫭㝰떑৺ಉ햅磑濑\uf756", (Process.myTid() >> 22) + 21, objArr32);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr32[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern, intern2, intern3, intern4, intern5}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{64}, 1360902539, -1360902519, 64)).getWarnings());
        Object[] objArr33 = new Object[1];
        a("햅磑ጩ⥼㊘\uf711줡뚦匦\uda8f\uf6eb밒钏\uf3c3桇㝙", 14 - Process.getGidForName(""), objArr33);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr33[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern, intern2, intern3, intern4, intern5}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1360902539, -1360902519, 45)).getWarnings());
        Object[] objArr34 = new Object[1];
        b("붼捐KⅫ왳\ue708萶ꔠ䨷每ࣧ⧧컭\uef90", 57074 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr34);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr34[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern, intern2, intern3, intern4, intern5}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{256}, 1360902539, -1360902519, 256)).getWarnings());
        Object[] objArr35 = new Object[1];
        a("頤ت匦\uda8f곋ⵋ\uf471慟頤ت꽡⩽\uf6eb밒钏\uf3c3桇㝙", Color.red(0) + 17, objArr35);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance6 = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr35[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern5}}, 1859274854, -1859274847, (int) System.currentTimeMillis())));
        Object[] objArr36 = new Object[1];
        b("붚徯禅᯦㗔\ud7ca\uf13a錓", 57881 - (ViewConfiguration.getEdgeSlop() >> 16), objArr36);
        SVG$Unit$EnumUnboxingLocalUtility.m((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{((String) objArr36[0]).intern()}, 998418748, -998418727, (int) System.currentTimeMillis()), (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1360902539, -1360902519, 45), threeDS2ServiceInstance6, equalsVar);
        Object[] objArr37 = new Object[1];
        b("붰仫嬨摯炸緮ถ᭳➰ヷ㴶", ExpandableListView.getPackedPositionType(0L) + 62273, objArr37);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr37[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern, intern2, intern3, intern4, intern5}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{6144}, 605561253, -605561234, 6144)).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -1083959071, 1083959079, (int) System.currentTimeMillis()))).ThreeDS2Service(ThreeDS2ServiceInstance()).getWarnings());
        Object[] objArr38 = new Object[1];
        b("붴⊟菬惃섴ꘑݮ\ue469䒹▖諢欶젎ꥷ\u0e5c\ueeba", 40738 - TextUtils.lastIndexOf("", '0', 0, 0), objArr38);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr38[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -1311835732, 1311835738, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis()))).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], 948133992, -948133975, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{0, 15}, -270093239, 270093252, 0))).ThreeDS2Service(ThreeDS2Service()).getWarnings());
        Object[] objArr39 = new Object[1];
        b("붴揝Ũ⚉쐼\uea5b诺ꤪ亨泀ቶ", 56930 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr39);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance7 = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr39[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], 1445068217, -1445068217, (int) System.currentTimeMillis()));
        Object[] objArr40 = new Object[1];
        a("⒤ϰ蔴挈", 4 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr40);
        String intern12 = ((String) objArr40[0]).intern();
        Object[] objArr41 = new Object[1];
        a("膪렷\udb76瑱", 3 - TextUtils.indexOf((CharSequence) "", '0'), objArr41);
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance7.getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[]{intern12, ((String) objArr41[0]).intern()}}, -645482314, 645482321, (int) System.currentTimeMillis())).getWarnings());
        Object[] objArr42 = new Object[1];
        a("\uf06e꾶䬀풔\ufaea\uee00૩虖ᴁ趨ᦕ䚲虽ﯱ", 14 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr42);
        SVG$Unit$EnumUnboxingLocalUtility.m((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis()), (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{setCacheColorHint.getWarnings.get}, -1224432618, 1224432628, (int) System.currentTimeMillis()), ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr42[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1311835732, 1311835738, (int) System.currentTimeMillis())), equalsVar);
        Object[] objArr43 = new Object[1];
        a("\ue9d1ꖚ뛏뫦\ude77╸\uf6eb밒钏\uf3c3桇㝙", TextUtils.lastIndexOf("", '0', 0, 0) + 12, objArr43);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr43[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern4}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1360902539, -1360902519, 45)).getWarnings());
        Object[] objArr44 = new Object[1];
        b("붶\ueabdᎭ뢹\ue185ພ럎\udcc6\u05cd", Color.blue(0) + 22283, objArr44);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance8 = (setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr44[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis());
        clone cloneVar2 = (clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis());
        clone cloneVar3 = (clone) name.get(new Object[]{new String[]{intern4}}, 1859274854, -1859274847, (int) System.currentTimeMillis());
        Object[] objArr45 = new Object[1];
        a("\ue9d1ꖚ뛏뫦\ude77╸\uf6eb밒钏\uf3c3桇㝙", 11 - (Process.myTid() >> 22), objArr45);
        clone ThreeDS2ServiceInstance2 = cloneVar3.ThreeDS2ServiceInstance((clone) name.get(new Object[]{((String) objArr45[0]).intern()}, -159050596, 159050601, (int) System.currentTimeMillis()));
        clone cloneVar4 = (clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis());
        Object[] objArr46 = new Object[1];
        a("鄤鸺", 2 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr46);
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance8.get(cloneVar2.ThreeDS2ServiceInstance(ThreeDS2ServiceInstance2.initialize(cloneVar4.ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{((String) objArr46[0]).intern()}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))))).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{2048}, 605561253, -605561234, 2048)).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -1045623270, 1045623284, (int) System.currentTimeMillis()))).getWarnings());
        Object[] objArr47 = new Object[1];
        a("\ue9d1ꖚꞠ墳虽ﯱ﨧\uee95쿠ﲥ첖咹☵\u0a7a箙蚭", View.MeasureSpec.getSize(0) + 16, objArr47);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance9 = (setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr47[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis());
        clone ThreeDS2ServiceInstance3 = ((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern4}}, 1859274854, -1859274847, (int) System.currentTimeMillis()));
        Object[] objArr48 = new Object[1];
        a("\ue9d1ꖚ뛏뫦\ude77╸\uf6eb밒钏\uf3c3桇㝙", Gravity.getAbsoluteGravity(0, 0) + 11, objArr48);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance10 = threeDS2ServiceInstance9.get(ThreeDS2ServiceInstance3.ThreeDS2ServiceInstance((clone) name.get(new Object[]{((String) objArr48[0]).intern()}, -1073704373, 1073704374, (int) System.currentTimeMillis())));
        Object[] objArr49 = new Object[1];
        b("붚徯禅᯦㗔\ud7ca\uf13a錓", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 57881, objArr49);
        SVG$Unit$EnumUnboxingLocalUtility.m((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{((String) objArr49[0]).intern()}, 998418748, -998418727, (int) System.currentTimeMillis()), (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1360902539, -1360902519, 45), threeDS2ServiceInstance10, equalsVar);
        Object[] objArr50 = new Object[1];
        b("붩䑃乂倏娜尳曊", TextUtils.getOffsetBefore("", 0) + 63977, objArr50);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr50[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern, intern2, intern3, intern4, intern5}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{6144}, 605561253, -605561234, 6144)).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -1083959071, 1083959079, (int) System.currentTimeMillis()))).ThreeDS2Service(ThreeDS2ServiceInstance()).getWarnings());
        Object[] objArr51 = new Object[1];
        a("蚵\ue2fa１໎㊘\uf711줡뚦匦\uda8f㥬ᤋ\u0ad4낯旡됣嫴朁☵\u0a7a箙蚭", View.resolveSizeAndState(0, 0, 0) + 22, objArr51);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr51[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1360902539, -1360902519, 45)).getWarnings());
        Object[] objArr52 = new Object[1];
        b("붪\uf8c0㝈淺ꡟ\ue6c9ᵙ寁陸쳸", 17789 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr52);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr52[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1311835732, 1311835738, (int) System.currentTimeMillis())).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{36}, -710732177, 710732200, 36)).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{this.getWarnings.createTransaction()}, 1725422414, -1725422412, (int) System.currentTimeMillis()))).getWarnings());
        Object[] objArr53 = new Object[1];
        a("\ue39e洷촄共䚜贵㻓꾛ｓ믋漐윪﨧\uee95汉氚﨧\uee95虽ﯱ\uf6eb밒钏\uf3c3桇㝙", Color.green(0) + 25, objArr53);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance11 = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr53[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern, intern2, intern3}}, 1859274854, -1859274847, (int) System.currentTimeMillis())));
        Object[] objArr54 = new Object[1];
        b("붊쑓久큉婌\udc56", KeyEvent.normalizeMetaState(0) + 31231, objArr54);
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance11.getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{((String) objArr54[0]).intern()}, 998418748, -998418727, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1360902539, -1360902519, 45))).getWarnings());
        Object[] objArr55 = new Object[1];
        a("ㆥ⌶涵\ufaf9ὅ檯泦䡘ᦕ䚲﨧\uee95虽ﯱ줡뚦\ue576ⱼ", 17 - (Process.myTid() >> 22), objArr55);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance12 = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr55[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern, intern2, intern3, intern4, intern5}}, 1859274854, -1859274847, (int) System.currentTimeMillis())));
        Object[] objArr56 = new Object[1];
        b("뷠쒓", 31091 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr56);
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance12.getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{intern2, ((String) objArr56[0]).intern()}, 120740260, -120740242, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[]{intern}}, 1032208890, -1032208890, (int) System.currentTimeMillis()))).getWarnings());
        Object[] objArr57 = new Object[1];
        b("붭㒢꾪⚬馎Ⴇ讛ʇ\uf5e5泽\ue7f0", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 35081, objArr57);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance13 = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr57[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1729819282, 1729819291, (int) System.currentTimeMillis()));
        compareTo compareto6 = (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis());
        Object[] objArr58 = new Object[1];
        a("蔉犬", (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 1, objArr58);
        String intern13 = ((String) objArr58[0]).intern();
        Object[] objArr59 = new Object[1];
        b("붗", 30391 - (Process.myTid() >> 22), objArr59);
        String intern14 = ((String) objArr59[0]).intern();
        Object[] objArr60 = new Object[1];
        a("巯툢", Color.blue(0) + 1, objArr60);
        String intern15 = ((String) objArr60[0]).intern();
        Object[] objArr61 = new Object[1];
        b("붘", 40030 - TextUtils.indexOf((CharSequence) "", '0'), objArr61);
        String intern16 = ((String) objArr61[0]).intern();
        Object[] objArr62 = new Object[1];
        a("\u0b65ᢺ", -TextUtils.indexOf((CharSequence) "", '0', 0), objArr62);
        String intern17 = ((String) objArr62[0]).intern();
        Object[] objArr63 = new Object[1];
        b("붋", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2741, objArr63);
        String intern18 = ((String) objArr63[0]).intern();
        Object[] objArr64 = new Object[1];
        a("驱䲳", 1 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr64);
        String intern19 = ((String) objArr64[0]).intern();
        Object[] objArr65 = new Object[1];
        b("붝", ImageFormat.getBitsPerPixel(0) + 30978, objArr65);
        String intern20 = ((String) objArr65[0]).intern();
        Object[] objArr66 = new Object[1];
        b("붊", 57390 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr66);
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance13.getWarnings(compareto6.get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[]{intern13, intern14, intern15, intern16, intern17, intern18, intern19, intern20, ((String) objArr66[0]).intern()}}, 1032208890, -1032208890, (int) System.currentTimeMillis()))).getWarnings());
        Object[] objArr67 = new Object[1];
        b("붭唎泦хἹ㚬칮\ue129\uf885遝ꯅ䊨娊淬Һᰊ㟽", (ViewConfiguration.getTapTimeout() >> 16) + 59557, objArr67);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr67[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern, intern2, intern3, intern4, intern5}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{64}, 1360902539, -1360902519, 64)).getWarnings());
        Object[] objArr68 = new Object[1];
        b("붮阌\ueada㺧ፃ朎믘达\ue050㐞ࣞ岪", 11197 - KeyEvent.keyCodeFromString(""), objArr68);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr68[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern, intern2, intern3, intern4, intern5}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1360902539, -1360902519, 45)).getWarnings());
        Object[] objArr69 = new Object[1];
        b("붮좊埖\ue221楛\uf798˔褐ᑤꊲ⧣", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 30011, objArr69);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr69[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern, intern2, intern3, intern4, intern5}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{256}, 1360902539, -1360902519, 256)).getWarnings());
        List<setCollapsible> ThreeDS2ServiceInstance4 = equalsVar.ThreeDS2ServiceInstance();
        int i = cleanup + 49;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            return ThreeDS2ServiceInstance4;
        }
        throw null;
    }
}
