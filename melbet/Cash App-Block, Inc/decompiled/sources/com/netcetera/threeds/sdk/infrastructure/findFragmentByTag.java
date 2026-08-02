package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
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
public class findFragmentByTag extends getView {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2ServiceInitializationCallback;
    private static long ThreeDS2ServiceInstance;
    private static char[] get;
    private static int initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        initialize = 0;
        ThreeDS2ServiceInitializationCallback = 1;
        get = new char[]{52932, 52920, 52886, 52887, 52873, 52879, 52912, 52905, 52913, 52920, 52873, 52880, 52887, 52873, 52865, 52865, 52875, 52877, 52884, 52870, 52988, 52959, 52845, 53233, 53240, 53238, 53221, 53219, 53223, 53220, 53224, 53246, 53191, 53240, 53191, 53190, 52917, 52834, 53218, 53220, 53219, 53230, 53229, 53220, 53222, 53221, 52754, 52765, 53230, 53230, 52765, 52753, 53218, 53230, 53231, 53216, 52868, 52822, 52809, 52827, 52830, 52830, 52818, 52826, 52771, 52772, 52826, 52831, 52816, 52830, 52824, 52828, 52827, 52826, 52830, 52813, 52809, 52826, 52826, 52819, 52808, 52774, 52945, 52879, 52868, 52870, 52913, 52922, 52877, 52877, 52924, 52913, 52878, 52864, 52879, 52883, 52873, 52949, 52873, 52883, 52879, 52864, 52878, 52913, 52924, 52877, 52877, 52870, 52923, 52873, 52881, 52945, 52864, 52867, 52865, 52864, 52873, 52884, 52883, 52874, 52876, 52922, 52871, 52827, 52824, 52769, 52826, 52816, 52830, 52815, 52822, 52782, 52824, 52827, 52772, 52774, 52824, 52774, 52944, 52877, 52877, 52887, 52872, 52864, 52877, 52873, 52875, 52873, 52922, 52913, 52870, 52868, 52879, 52872, 52876, 52875, 52875, 52878, 52878, 52913, 52958, 52883, 52876, 52864, 52876, 52873, 52925, 52924, 52883, 52873, 52865, 52878, 52886, 52873, 52865, 52869, 52877, 52873, 52875, 52873, 52922, 52913, 52870, 52868, 52879, 52941, 52935, 52934, 52873, 52794, 52738, 52738, 52746, 52742, 52795, 52947, 52864, 52879, 52879, 52852, 53187, 53186, 53241, 53233, 53245, 53245, 53242, 53224, 53234, 53197, 53189, 53241, 53245, 53233, 53245, 53189, 53189, 53190, 53241, 52957, 52875, 52874, 52884, 52951, 52868, 52866, 52875, 52872, 52951, 52877, 52877, 52869, 52896, 52844, 52894, 52748, 52748, 52746};
        ThreeDS2ServiceInstance = -1520677034624763833L;
    }

    public findFragmentByTag(nh nhVar, setFontFeatureSettings setfontfeaturesettings) {
        super(nhVar, setfontfeaturesettings);
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] cArr;
        long j;
        int i2 = $11;
        $10 = (i2 + 19) % 128;
        if (str != null) {
            $10 = (i2 + 13) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        onCompleted oncompleted = new onCompleted();
        char[] initialize2 = onCompleted.initialize(ThreeDS2ServiceInstance ^ (-2776494906517314268L), cArr, i);
        oncompleted.initialize = 4;
        while (true) {
            int i3 = oncompleted.initialize;
            if (i3 >= initialize2.length) {
                objArr[0] = new String(initialize2, 4, initialize2.length - 4);
                return;
            }
            $10 = ($11 + 13) % 128;
            int i4 = i3 - 4;
            oncompleted.ThreeDS2Service = i4;
            try {
                Object[] objArr2 = {Long.valueOf(initialize2[i3] ^ initialize2[i3 % 4]), Long.valueOf(i4), Long.valueOf(ThreeDS2ServiceInstance)};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1242395160);
                if (obj != null) {
                    j = 0;
                } else {
                    j = 0;
                    Class cls = (Class) removeParam.initialize((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 47, (char) (27780 - View.resolveSizeAndState(0, 0, 0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2441);
                    Object[] objArr3 = new Object[1];
                    c((byte) 0, 0, 47, objArr3);
                    String str2 = (String) objArr3[0];
                    Class cls2 = Long.TYPE;
                    obj = cls.getMethod(str2, cls2, cls2, cls2);
                    map.put(-1242395160, obj);
                }
                initialize2[i3] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {oncompleted, oncompleted};
                Object obj2 = map.get(1526822639);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize((Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 65, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 14234)).getMethod("s", Object.class, Object.class);
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

    private static void b(boolean z, int[] iArr, String str, Object[] objArr) {
        byte[] bArr;
        int i;
        char[] cArr;
        int length;
        char[] cArr2;
        int i2;
        char[] cArr3;
        int i3;
        char[] cArr4;
        String str2;
        Object method;
        String str3 = str;
        byte[] bArr2 = str3;
        if (str3 != null) {
            $11 = ($10 + 101) % 128;
            bArr2 = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr3 = bArr2;
        cleanup cleanupVar = new cleanup();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr5 = get;
        Class cls = Integer.TYPE;
        int i8 = 2;
        String str4 = "";
        if (cArr5 != null) {
            int i9 = $10 + 11;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                length = cArr5.length;
                cArr2 = new char[length];
                bArr = bArr3;
                i2 = 1;
            } else {
                length = cArr5.length;
                cArr2 = new char[length];
                bArr = bArr3;
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    int i10 = i2;
                    Object[] objArr2 = {Integer.valueOf(cArr5[i2])};
                    int i11 = length;
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-1866317650);
                    if (obj != null) {
                        cArr3 = cArr2;
                        str2 = str4;
                        cArr4 = cArr5;
                        method = obj;
                        i3 = i6;
                    } else {
                        cArr3 = cArr2;
                        i3 = i6;
                        cArr4 = cArr5;
                        Class cls2 = (Class) removeParam.initialize(48 - Gravity.getAbsoluteGravity(0, 0), (char) TextUtils.getOffsetBefore(str4, 0), 2294 - MotionEvent.axisFromString(str4));
                        Object[] objArr3 = new Object[1];
                        str2 = str4;
                        c((byte) 0, 0, 57, objArr3);
                        method = cls2.getMethod((String) objArr3[0], cls);
                        map.put(-1866317650, method);
                    }
                    cArr3[i10] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i2 = i10 + 1;
                    length = i11;
                    i6 = i3;
                    cArr2 = cArr3;
                    cArr5 = cArr4;
                    str4 = str2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr5 = cArr2;
        } else {
            bArr = bArr3;
        }
        String str5 = str4;
        int i12 = i6;
        char[] cArr6 = new char[i5];
        System.arraycopy(cArr5, i4, cArr6, 0, i5);
        if (bArr != null) {
            $11 = ($10 + 33) % 128;
            char[] cArr7 = new char[i5];
            cleanupVar.get = 0;
            char c = 0;
            while (true) {
                int i13 = cleanupVar.get;
                if (i13 >= i5) {
                    break;
                }
                if (bArr[i13] == 1) {
                    char c2 = cArr6[i13];
                    Object[] objArr4 = new Object[i8];
                    objArr4[1] = Integer.valueOf(c);
                    objArr4[0] = Integer.valueOf(c2);
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(715226994);
                    if (obj2 == null) {
                        Class cls3 = (Class) removeParam.initialize((-16777131) - Color.rgb(0, 0, 0), (char) (25857 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1726);
                        Object[] objArr5 = new Object[1];
                        c((byte) 0, 0, 0, objArr5);
                        obj2 = cls3.getMethod((String) objArr5[0], cls, cls);
                        map2.put(715226994, obj2);
                    }
                    cArr7[i13] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                    cArr = cArr6;
                } else {
                    Object[] objArr6 = {Integer.valueOf(cArr6[i13]), Integer.valueOf(c)};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(549300883);
                    if (obj3 != null) {
                        cArr = cArr6;
                    } else {
                        cArr = cArr6;
                        obj3 = ((Class) removeParam.initialize((ViewConfiguration.getPressedStateDuration() >> 16) + 66, (char) (32825 - Color.blue(0)), 447 - Color.argb(0, 0, 0, 0))).getMethod("D", cls, cls);
                        map3.put(549300883, obj3);
                    }
                    cArr7[i13] = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
                }
                c = cArr7[cleanupVar.get];
                Object[] objArr7 = {cleanupVar, cleanupVar};
                Map map4 = removeParam.visaSchemeConfiguration;
                Object obj4 = map4.get(102334785);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize(74 - TextUtils.getTrimmedLength(str5), (char) ((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) - 1), 9820 - Drawable.resolveOpacity(0, 0))).getMethod("I", Object.class, Object.class);
                    map4.put(102334785, obj4);
                }
                ((Method) obj4).invoke(null, objArr7);
                cArr6 = cArr;
                i8 = 2;
            }
            cArr6 = cArr7;
        }
        if (i7 > 0) {
            int i14 = $10 + 19;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                char[] cArr8 = new char[i5];
                System.arraycopy(cArr6, 1, cArr8, 1, i5);
                i = 0;
                System.arraycopy(cArr8, 0, cArr6, i5 / i7, i7);
                System.arraycopy(cArr8, i7, cArr6, 1, i5 << i7);
            } else {
                i = 0;
                char[] cArr9 = new char[i5];
                System.arraycopy(cArr6, 0, cArr9, 0, i5);
                int i15 = i5 - i7;
                System.arraycopy(cArr9, 0, cArr6, i15, i7);
                System.arraycopy(cArr9, i7, cArr6, 0, i15);
            }
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr10 = new char[i5];
            cleanupVar.get = i;
            while (true) {
                int i16 = cleanupVar.get;
                if (i16 >= i5) {
                    break;
                }
                cArr10[i16] = cArr6[(i5 - i16) - 1];
                cleanupVar.get = i16 + 1;
            }
            $10 = ($11 + 15) % 128;
            cArr6 = cArr10;
        }
        if (i12 > 0) {
            cleanupVar.get = 0;
            $10 = ($11 + 59) % 128;
            while (true) {
                int i17 = cleanupVar.get;
                if (i17 >= i5) {
                    break;
                }
                cArr6[i17] = (char) (cArr6[i17] - iArr[2]);
                cleanupVar.get = i17 + 1;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, int i, int i2, Object[] objArr) {
        int i3;
        int i4 = i2 + 65;
        int i5 = 3 - (i * 3);
        byte[] bArr = $$a;
        int i6 = b * 4;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        if (bArr == null) {
            int i8 = i5;
            byte[] bArr3 = bArr;
            int i9 = 0;
            int i10 = i7;
            int i11 = i5 + i10;
            int i12 = i8;
            i4 = i11;
            i5 = i12;
            bArr = bArr3;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i13 = i5 + 1;
            int i14 = i4;
            i8 = i13;
            i5 = bArr[i13];
            i9 = i3 + 1;
            bArr3 = bArr;
            i10 = i14;
            int i112 = i5 + i10;
            int i122 = i8;
            i4 = i112;
            i5 = i122;
            bArr = bArr3;
            i3 = i9;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        }
    }

    private List<setCollapsible> get() {
        equals equalsVar = new equals();
        Object[] objArr = new Object[1];
        b(true, new int[]{EnumC0170g.SDK_ASSET_ICON_CANCEL_VALUE, 20, EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 0}, "\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001", objArr);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], 1445068217, -1445068217, (int) System.currentTimeMillis()));
        compareTo compareto = (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis());
        Object[] objArr2 = new Object[1];
        b(true, new int[]{EnumC0170g.SDK_ASSET_ICON_REJECTED_REC_VALUE, 4, 0, 1}, "\u0000\u0001\u0000\u0001", objArr2);
        String intern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b(true, new int[]{EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 5, 0, 2}, "\u0001\u0001\u0001\u0000\u0001", objArr3);
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance.getWarnings(compareto.get(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[]{intern, ((String) objArr3[0]).intern()}}, 1032208890, -1032208890, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[0]}, -1709207342, 1709207347, (int) System.currentTimeMillis())))).getWarnings());
        Object[] objArr4 = new Object[1];
        b(false, new int[]{EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, 4, 0, 3}, "\u0001\u0001\u0001\u0001", objArr4);
        SVG$Unit$EnumUnboxingLocalUtility.m((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{8059}, 605561253, -605561234, 8059), (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -1083959071, 1083959079, (int) System.currentTimeMillis()), ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr4[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())), equalsVar);
        Object[] objArr5 = new Object[1];
        b(false, new int[]{EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, 2, 37, 0}, "\u0000\u0001", objArr5);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr5[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], 1445068217, -1445068217, (int) System.currentTimeMillis())).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{64}, 605561253, -605561234, 64)).getWarnings());
        Object[] objArr6 = new Object[1];
        b(false, new int[]{EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, 4, EnumC0170g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, 0}, "\u0000\u0001\u0000\u0000", objArr6);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr6[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], 1445068217, -1445068217, (int) System.currentTimeMillis())).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{64}, 605561253, -605561234, 64)).getWarnings());
        List<setCollapsible> ThreeDS2ServiceInstance2 = equalsVar.ThreeDS2ServiceInstance();
        int i = ThreeDS2ServiceInitializationCallback + 9;
        initialize = i % 128;
        if (i % 2 != 0) {
            int i2 = 95 / 0;
        }
        return ThreeDS2ServiceInstance2;
    }

    public static void init$0() {
        $$a = new byte[]{24, 21, 78, -72};
        $$b = 99;
    }

    private List<setCollapsible> initialize() {
        equals equalsVar = new equals();
        Object[] objArr = new Object[1];
        b(true, new int[]{EnumC0170g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, 6, 120, 2}, null, objArr);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -637702868, 637702893, (int) System.currentTimeMillis())).getWarnings());
        Object[] objArr2 = new Object[1];
        b(true, new int[]{EnumC0170g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, 4, 0, 0}, "\u0000\u0001\u0000\u0001", objArr2);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr2[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -637702868, 637702893, (int) System.currentTimeMillis())).getWarnings());
        Object[] objArr3 = new Object[1];
        a("䶛留䷾\ue4d6䡢狐횜軇㡶歪싫\u1b4eꛫ", 1 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr3);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr3[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -637702868, 637702893, (int) System.currentTimeMillis())).getWarnings());
        List<setCollapsible> ThreeDS2ServiceInstance2 = equalsVar.ThreeDS2ServiceInstance();
        int i = initialize + 27;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 != 0) {
            return ThreeDS2ServiceInstance2;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.getView
    public List<setCollapsible> getWarnings() {
        Object[] objArr = new Object[1];
        a("〃鄬〳豽ᑘೈ", 1 - TextUtils.indexOf("", "", 0, 0), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("坋휶坻쩦\uf036㾰", 1 - (ViewConfiguration.getTapTimeout() >> 16), objArr2);
        String intern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a("꯬똇ꯜꭐ\uf21f羘", Color.argb(0, 0, 0, 0) + 1, objArr3);
        String intern3 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a("\ueda4収\ued94亜\uecb2ꏖ", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr4);
        String intern4 = ((String) objArr4[0]).intern();
        equals equalsVar = new equals();
        Object[] objArr5 = new Object[1];
        b(false, new int[]{0, 20, 3, 1}, "\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000", objArr5);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr5[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1311835732, 1311835738, (int) System.currentTimeMillis())).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis())).get(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{36}, -710732177, 710732200, 36)).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{this.getWarnings.get()}, 1725422414, -1725422412, (int) System.currentTimeMillis())))).getWarnings());
        Object[] objArr6 = new Object[1];
        a("愇މ慦᪉옑ﲤ瑩Ⰳᓤ锓䲘릨詺ྀ\ud93b㝜ǌ秝", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr6);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr6[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1311835732, 1311835738, (int) System.currentTimeMillis())).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis())).get(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{3}, -710732177, 710732200, 3)).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], 2036384150, -2036384128, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{Integer.valueOf(this.getWarnings.getSDKInfo())}, 1099490190, -1099490187, (int) System.currentTimeMillis())))).getWarnings());
        Object[] objArr7 = new Object[1];
        a("\u20ca\ud8e3₫엣㻩ќ䦤ᇅ唒䩁둂", 1 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr7);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance = (setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr7[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis());
        clone cloneVar = (clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis());
        Object[] objArr8 = new Object[1];
        b(false, new int[]{20, 2, 6, 0}, "\u0000\u0001", objArr8);
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance.get(cloneVar.ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{((String) objArr8[0]).intern()}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis())).get(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{300000}, 605561253, -605561234, 300000)).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], 982291278, -982291277, (int) System.currentTimeMillis())))).getWarnings());
        Object[] objArr9 = new Object[1];
        b(false, new int[]{22, 14, EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 0}, "\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001", objArr9);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance2 = (setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr9[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis());
        clone ThreeDS2ServiceInstance2 = ((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis()));
        Object[] objArr10 = new Object[1];
        b(false, new int[]{20, 2, 6, 0}, "\u0000\u0001", objArr10);
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance2.get(ThreeDS2ServiceInstance2.ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{((String) objArr10[0]).intern()}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{300000}, 605561253, -605561234, 300000)).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], 982291278, -982291277, (int) System.currentTimeMillis()))).getWarnings());
        Object[] objArr11 = new Object[1];
        a("鼪矊齋櫊鮕ꄠ庣۞\uead4\ue544ᄜ鍥瑻翵", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr11);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr11[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1311835732, 1311835738, (int) System.currentTimeMillis())).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis())).get(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{36}, -710732177, 710732200, 36)).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{this.getWarnings.initialize()}, 1725422414, -1725422412, (int) System.currentTimeMillis())))).getWarnings());
        Object[] objArr12 = new Object[1];
        a("屔䮃尵嚃䝖緣㟇澻⦱\ud938췈拓뜩", (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 1, objArr12);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance3 = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr12[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis()));
        compareTo compareto = (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis());
        Object[] objArr13 = new Object[1];
        b(false, new int[]{20, 2, 6, 0}, "\u0000\u0001", objArr13);
        SVG$Unit$EnumUnboxingLocalUtility.m(compareto, (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[]{intern4, intern, intern2, intern3, ((String) objArr13[0]).intern()}}, 1032208890, -1032208890, (int) System.currentTimeMillis()), threeDS2ServiceInstance3, equalsVar);
        Object[] objArr14 = new Object[1];
        a("쉅㪧숦➬鍾꧙킛裞랥\ua82d᧥ᵉ⤸㊝豣鎾ꊨ䓎㋕根", -TextUtils.indexOf((CharSequence) "", '0'), objArr14);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr14[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern3}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{256}, 1360902539, -1360902519, 256)).getWarnings());
        Object[] objArr15 = new Object[1];
        a("냈髜낫蟗ẇ␠㠾恻씨ࡖ鐜\uf5ec宵鋤Ƒ笒퀜\ue4b7뼯肇暑椠㒸ᘮ\ufb1a\uf3a7", 1 - ExpandableListView.getPackedPositionGroup(0L), objArr15);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance4 = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr15[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1311835732, 1311835738, (int) System.currentTimeMillis()));
        compareTo compareto2 = (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis());
        Object[] objArr16 = new Object[1];
        b(true, new int[]{36, 1, 76, 0}, "\u0001", objArr16);
        String intern5 = ((String) objArr16[0]).intern();
        Object[] objArr17 = new Object[1];
        a("鋦\uf715銨\u1718誯", 1 - Color.alpha(0), objArr17);
        SVG$Unit$EnumUnboxingLocalUtility.m(compareto2, (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[]{intern5, ((String) objArr17[0]).intern()}}, 1032208890, -1032208890, (int) System.currentTimeMillis()), threeDS2ServiceInstance4, equalsVar);
        Object[] objArr18 = new Object[1];
        b(true, new int[]{37, 19, EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, 4}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001", objArr18);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr18[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1360902539, -1360902519, 45)).getWarnings());
        Object[] objArr19 = new Object[1];
        a("\udf7e嚞\udf1d䮕ੵヒ닄\uea81ꪞ쐔胮编㐃庬ᕢ\uf1e3뾵⣕ꯙ੫फꕡ", 1 - (ViewConfiguration.getEdgeSlop() >> 16), objArr19);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr19[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1360902539, -1360902519, 45)).getWarnings());
        Object[] objArr20 = new Object[1];
        a("䀝䶾䁾債\uda08\ue0af൏唊㗽\udf34傓삝ꭠ䖌씟乨⃖㏭箠뗺陙", TextUtils.indexOf("", "", 0, 0) + 1, objArr20);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr20[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{350}, 1360902539, -1360902519, 350)).getWarnings());
        Object[] objArr21 = new Object[1];
        b(false, new int[]{56, 26, 83, 10}, "\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001", objArr21);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance5 = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr21[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern4, intern, intern2, intern3}}, 1859274854, -1859274847, (int) System.currentTimeMillis())));
        Object[] objArr22 = new Object[1];
        b(true, new int[]{36, 1, 76, 0}, "\u0001", objArr22);
        String intern6 = ((String) objArr22[0]).intern();
        Object[] objArr23 = new Object[1];
        a("鋦\uf715銨\u1718誯", Color.rgb(0, 0, 0) + 16777217, objArr23);
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance5.getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[]{intern6, ((String) objArr23[0]).intern()}}, 1032208890, -1032208890, (int) System.currentTimeMillis())).getWarnings());
        Object[] objArr24 = new Object[1];
        a("ﶆě\ufde5ᰐ\u1289⠮䝼Ἱ衦鎑頒誮\u16fbळඕё鵇罿댰\ufff8⯘\uf2ee㢷", 1 - (ViewConfiguration.getTouchSlop() >> 8), objArr24);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr24[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern, intern2}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis())).get(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], 948133992, -948133975, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1618462802, -1618462791, (int) System.currentTimeMillis())))).getWarnings());
        Object[] objArr25 = new Object[1];
        b(true, new int[]{82, 15, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001", objArr25);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr25[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern4, intern, intern2, intern3}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1360902539, -1360902519, 45)).getWarnings());
        Object[] objArr26 = new Object[1];
        b(false, new int[]{97, 14, 0, 14}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000", objArr26);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr26[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern4, intern, intern2, intern3}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{256}, 1360902539, -1360902519, 256)).getWarnings());
        Object[] objArr27 = new Object[1];
        b(false, new int[]{111, 11, 0, 4}, "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001", objArr27);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr27[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern4, intern, intern2, intern3}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{2048}, 605561253, -605561234, 2048)).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -1083959071, 1083959079, (int) System.currentTimeMillis()))).ThreeDS2Service(initialize()).getWarnings());
        Object[] objArr28 = new Object[1];
        b(false, new int[]{EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 16, 83, 0}, "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001", objArr28);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr28[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -1311835732, 1311835738, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis()))).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{81920}, 605561253, -605561234, 81920)).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], 948133992, -948133975, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{0, 10}, -270093239, 270093252, 0))).ThreeDS2Service(get()).getWarnings());
        Object[] objArr29 = new Object[1];
        a("\ue26c囮\ue201䯨祈샻斾㷤鞁쑦烌ꡟऍ廥\ue540", ExpandableListView.getPackedPositionGroup(0L) + 1, objArr29);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance6 = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr29[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], 1445068217, -1445068217, (int) System.currentTimeMillis()));
        Object[] objArr30 = new Object[1];
        a("鶮愪鷭簛牡䣂濇㞝", Color.rgb(0, 0, 0) + 16777217, objArr30);
        String intern7 = ((String) objArr30[0]).intern();
        Object[] objArr31 = new Object[1];
        a("鯕締鮐惱ꈚ颮뉃\uea05", (ViewConfiguration.getLongPressTimeout() >> 16) + 1, objArr31);
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance6.getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[]{intern7, ((String) objArr31[0]).intern()}}, -645482314, 645482321, (int) System.currentTimeMillis())).getWarnings());
        Object[] objArr32 = new Object[1];
        a("寒喦宿䢠㫉|ᅒ䤈⸿윮끋\udcb1낯嶯◑剺㬙⯏", -MotionEvent.axisFromString(""), objArr32);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr32[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1311835732, 1311835738, (int) System.currentTimeMillis())).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{setCacheColorHint.getWarnings.getWarnings}, -1224432618, 1224432628, (int) System.currentTimeMillis()))).getWarnings());
        Object[] objArr33 = new Object[1];
        a("⑥墥␊䖩㑹ໝ箺⏐円쨤뻻뙦켓傫⭦㢷䒠⛀闒쌛", Color.alpha(0) + 1, objArr33);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance7 = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr33[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern3}}, 1859274854, -1859274847, (int) System.currentTimeMillis())));
        Object[] objArr34 = new Object[1];
        a("籫ꄇ簨밋꼓閻\ue097룊\u098e㎆▜ⵇ", 1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr34);
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance7.getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{((String) objArr34[0]).intern()}, 998418748, -998418727, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1360902539, -1360902519, 45))).getWarnings());
        Object[] objArr35 = new Object[1];
        a("ᾁ⻁\u1ff1㏑멷胸맵\ue1b1橬뱉ハ", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, objArr35);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr35[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern4, intern, intern2, intern3}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{2048}, 605561253, -605561234, 2048)).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -1083959071, 1083959079, (int) System.currentTimeMillis()))).ThreeDS2Service(initialize()).getWarnings());
        Object[] objArr36 = new Object[1];
        b(false, new int[]{EnumC0170g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, 22, 0, 15}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001", objArr36);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr36[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern4}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1360902539, -1360902519, 45)).getWarnings());
        Object[] objArr37 = new Object[1];
        a("ᐡ\ue265ᑒ｢廫摆债ࡇ懟烫푺鷼ｰ\uea5a", (KeyEvent.getMaxKeyCode() >> 16) + 1, objArr37);
        SVG$Unit$EnumUnboxingLocalUtility.m(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{36}, -710732177, 710732200, 36)), (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{this.getWarnings.createTransaction()}, 1725422414, -1725422412, (int) System.currentTimeMillis()), ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr37[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1311835732, 1311835738, (int) System.currentTimeMillis())), equalsVar);
        Object[] objArr38 = new Object[1];
        b(false, new int[]{EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, 25, 0, 0}, "\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001", objArr38);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance8 = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr38[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern4, intern, intern2}}, 1859274854, -1859274847, (int) System.currentTimeMillis())));
        Object[] objArr39 = new Object[1];
        a("秥뽰禶ꉦ䜂綦럲\uefb6ఀⷫ", 1 - View.resolveSizeAndState(0, 0, 0), objArr39);
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance8.getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{((String) objArr39[0]).intern()}, 998418748, -998418727, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1360902539, -1360902519, 45))).getWarnings());
        Object[] objArr40 = new Object[1];
        a("瓥᱐璑Łᮓℴ粑ⓖĚ軬鄒녅龉ᑞҙ", -ImageFormat.getBitsPerPixel(0), objArr40);
        setCollapsible.ThreeDS2ServiceInstance threeDS2ServiceInstance9 = ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr40[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get((clone) name.get(new Object[0], -1729819282, 1729819291, (int) System.currentTimeMillis()));
        compareTo compareto3 = (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis());
        Object[] objArr41 = new Object[1];
        b(true, new int[]{36, 1, 76, 0}, "\u0001", objArr41);
        String intern8 = ((String) objArr41[0]).intern();
        Object[] objArr42 = new Object[1];
        a("鋦\uf715銨\u1718誯", (ViewConfiguration.getFadingEdgeLength() >> 16) + 1, objArr42);
        String intern9 = ((String) objArr42[0]).intern();
        Object[] objArr43 = new Object[1];
        b(false, new int[]{185, 1, 0, 0}, "\u0001", objArr43);
        String intern10 = ((String) objArr43[0]).intern();
        Object[] objArr44 = new Object[1];
        b(true, new int[]{EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, 1, 0, 1}, "\u0001", objArr44);
        String intern11 = ((String) objArr44[0]).intern();
        Object[] objArr45 = new Object[1];
        b(true, new int[]{EnumC0170g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, 1, 0, 1}, "\u0001", objArr45);
        String intern12 = ((String) objArr45[0]).intern();
        Object[] objArr46 = new Object[1];
        b(true, new int[]{188, 1, 28, 1}, null, objArr46);
        equalsVar.ThreeDS2Service(threeDS2ServiceInstance9.getWarnings(compareto3.get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{new String[]{intern8, intern9, intern10, intern11, intern12, ((String) objArr46[0]).intern()}}, 1032208890, -1032208890, (int) System.currentTimeMillis()))).getWarnings());
        Object[] objArr47 = new Object[1];
        a("금쾒깿튙⊭᠒⤅煥\udbea崛\ua82f\ue4fc䕱잋㶩樨", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, objArr47);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr47[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern4, intern, intern2, intern3}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 1360902539, -1360902519, 45)).getWarnings());
        Object[] objArr48 = new Object[1];
        a("쥀\udd3b줷쀰⏷᥈䴤ᕄ벢侲ꥵ胅∽픸㳢", (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 1, objArr48);
        equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr48[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern4, intern, intern2, intern3}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{256}, 1360902539, -1360902519, 256)).getWarnings());
        if (!this.ThreeDS2Service.ThreeDS2ServiceInstance()) {
            ThreeDS2ServiceInitializationCallback = (initialize + 13) % 128;
            Object[] objArr49 = new Object[1];
            b(true, new int[]{37, 19, EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, 4}, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001", objArr49);
            equalsVar.ThreeDS2Service(((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr49[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern4, intern, intern2, intern3}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))).getWarnings(((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis())).get((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 605561253, -605561234, 45))).getWarnings());
            Object[] objArr50 = new Object[1];
            a("\udf7e嚞\udf1d䮕ੵヒ닄\uea81ꪞ쐔胮编㐃庬ᕢ\uf1e3뾵⣕ꯙ੫फꕡ", -ImageFormat.getBitsPerPixel(0), objArr50);
            SVG$Unit$EnumUnboxingLocalUtility.m((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis()), (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{45}, 605561253, -605561234, 45), ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr50[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance(((clone) name.get(new Object[]{new String[]{intern4, intern, intern2}}, 1859274854, -1859274847, (int) System.currentTimeMillis())).initialize(((clone) name.get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern3}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))))), equalsVar);
            Object[] objArr51 = new Object[1];
            a("䀝䶾䁾債\uda08\ue0af൏唊㗽\udf34傓삝ꭠ䖌씟乨⃖㏭箠뗺陙", 1 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr51);
            SVG$Unit$EnumUnboxingLocalUtility.m((compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[0], -736045743, 736045759, (int) System.currentTimeMillis()), (compareTo) getDeclaringClass.ThreeDS2ServiceInstance(new Object[]{350}, 605561253, -605561234, 350), ((setCollapsible.ThreeDS2ServiceInstance) setCollapsible.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(new Object[]{((String) objArr51[0]).intern()}, -430024577, 430024577, (int) System.currentTimeMillis())).get(((clone) name.get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance((clone) name.get(new Object[]{new String[]{intern4, intern, intern2, intern3}}, 1859274854, -1859274847, (int) System.currentTimeMillis()))), equalsVar);
        }
        List<setCollapsible> ThreeDS2ServiceInstance3 = equalsVar.ThreeDS2ServiceInstance();
        int i = initialize + 115;
        ThreeDS2ServiceInitializationCallback = i % 128;
        if (i % 2 != 0) {
            return ThreeDS2ServiceInstance3;
        }
        throw null;
    }
}
