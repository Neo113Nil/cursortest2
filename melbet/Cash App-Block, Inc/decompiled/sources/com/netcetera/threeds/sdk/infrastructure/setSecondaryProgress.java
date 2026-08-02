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
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.infrastructure.setProgress;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class setSecondaryProgress implements setMin {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long ThreeDS2Service;
    private static int ThreeDS2ServiceInstance;
    private static int get;
    private static char[] getWarnings;
    private static long initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ThreeDS2ServiceInstance = 0;
        get = 1;
        ThreeDS2Service = 7207448847253100711L;
        getWarnings = new char[]{35161, 3041, 35866, 3722, 33784, 35161, 3041, 35866, 3719, 33781, 1030, 34490, 7125, 39961, 7851, 37847, 5135, 38589, 11202, 44136, 11932, 41920, 9312, 42676, 15325, 48233, 16009, 10284, 43666, 11622, 45042, 8862, 42336, 10202, 47785, 15736, 49088, 48005, 14641, 48846, 15471, 45350, 14024, 46182, 10499, 44745, 41695, 8298, 42932, 9518, 43110, 12174, 44335, 12352, 46998, 32939, 519, 34300, 1880, 35354, 3566, 36691, 4667, 38371, 5975, 39449, 7655, 40768, 8752, 42374, 10048, 43579, 11655, 44865, 12846, 46480};
        initialize = -7032753055073301615L;
    }

    private setProgress ThreeDS2Service(nq nqVar) {
        setProgress.get getVar = new setProgress.get();
        Object[] objArr = new Object[1];
        a("\ue51e\uf895\ue577蕸挋掁፠项᭭譴椊疔॒酼缆羢݉Ꝼ䔗", TextUtils.indexOf("", "") + 1, objArr);
        setProgress.get warnings = getVar.getWarnings(nqVar.getWarnings(((String) objArr[0]).intern(), ""));
        Object[] objArr2 = new Object[1];
        b(10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 41319), 26 - TextUtils.indexOf((CharSequence) "", '0'), objArr2);
        setProgress.get getVar2 = warnings.get(nqVar.getWarnings(((String) objArr2[0]).intern(), ""));
        Object[] objArr3 = new Object[1];
        b(View.getDefaultSize(0, 0) + 9, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 13001), 38 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr3);
        setProgress.get ThreeDS2Service2 = getVar2.ThreeDS2Service(nqVar.getWarnings(((String) objArr3[0]).intern(), ""));
        Object[] objArr4 = new Object[1];
        a("쏤莢쎉﹄鐭놌㖉潘쥶\uf04a鸯ꞵ⾙\uea4b蠵궾↯\udc6b", TextUtils.indexOf("", "") + 1, objArr4);
        setProgress.get initialize2 = ThreeDS2Service2.initialize(nqVar.getWarnings(((String) objArr4[0]).intern(), ""));
        Object[] objArr5 = new Object[1];
        a("暒쟱曶먁\ue6ad獹郚᷹ஹ", 1 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr5);
        setProgress.get ThreeDS2ServiceInitializationCallback = initialize2.ThreeDS2ServiceInitializationCallback(nqVar.getWarnings(((String) objArr5[0]).intern(), ""));
        Object[] objArr6 = new Object[1];
        b(TextUtils.getTrimmedLength("") + 9, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 11144), Color.alpha(0) + 46, objArr6);
        setProgress.get ThreeDS2ServiceInstance2 = ThreeDS2ServiceInitializationCallback.ThreeDS2ServiceInstance(nqVar.getWarnings(((String) objArr6[0]).intern(), ""));
        Object[] objArr7 = new Object[1];
        b(Drawable.resolveOpacity(0, 0) + 21, (char) (2546 - Color.green(0)), TextUtils.getOffsetBefore("", 0) + 55, objArr7);
        setProgress setprogress = ThreeDS2ServiceInstance2.getWarnings(getWarnings(nqVar.getSDKVersion(((String) objArr7[0]).intern()))).get();
        get = (ThreeDS2ServiceInstance + 85) % 128;
        return setprogress;
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] cArr;
        int i2;
        if (str != null) {
            cArr = str.toCharArray();
            $10 = ($11 + 43) % 128;
        } else {
            cArr = str;
        }
        onCompleted oncompleted = new onCompleted();
        char[] initialize2 = onCompleted.initialize(ThreeDS2Service ^ (-2776494906517314268L), cArr, i);
        int i3 = 4;
        oncompleted.initialize = 4;
        $10 = ($11 + 9) % 128;
        while (true) {
            int i4 = oncompleted.initialize;
            if (i4 >= initialize2.length) {
                objArr[0] = new String(initialize2, i3, initialize2.length - 4);
                return;
            }
            int i5 = i4 - 4;
            oncompleted.ThreeDS2Service = i5;
            try {
                Object[] objArr2 = {Long.valueOf(initialize2[i4] ^ initialize2[i4 % 4]), Long.valueOf(i5), Long.valueOf(ThreeDS2Service)};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1242395160);
                if (obj != null) {
                    i2 = i3;
                } else {
                    i2 = i3;
                    Class cls = (Class) removeParam.initialize(48 - TextUtils.getOffsetAfter("", 0), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 27780), 2442 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    Object[] objArr3 = new Object[1];
                    c((byte) -1, (short) 0, 5, objArr3);
                    String str2 = (String) objArr3[0];
                    Class cls2 = Long.TYPE;
                    obj = cls.getMethod(str2, cls2, cls2, cls2);
                    map.put(-1242395160, obj);
                }
                initialize2[i4] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {oncompleted, oncompleted};
                Object obj2 = map.get(1526822639);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(65 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 14234)).getMethod("s", Object.class, Object.class);
                    map.put(1526822639, obj2);
                }
                ((Method) obj2).invoke(null, objArr4);
                i3 = i2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0223  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, char c, int i2, Object[] objArr) {
        Throwable cause;
        long[] jArr;
        Object method;
        ThreeDS2ServiceInitializationCallback threeDS2ServiceInitializationCallback = new ThreeDS2ServiceInitializationCallback();
        long[] jArr2 = new long[i];
        short s = 0;
        threeDS2ServiceInitializationCallback.initialize = 0;
        while (true) {
            int i3 = threeDS2ServiceInitializationCallback.initialize;
            if (i3 >= i) {
                break;
            }
            $11 = ($10 + 77) % 128;
            try {
                Object[] objArr2 = {Integer.valueOf(getWarnings[i2 + i3])};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-54653524);
                Class cls = Integer.TYPE;
                if (obj != null) {
                    jArr = jArr2;
                    method = obj;
                } else {
                    Class cls2 = (Class) removeParam.initialize((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 47, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), View.resolveSize(s, s) + 3221);
                    Object[] objArr3 = new Object[1];
                    jArr = jArr2;
                    c((byte) -1, s, 1, objArr3);
                    method = cls2.getMethod((String) objArr3[s], cls);
                    map.put(-54653524, method);
                }
                Long l = (Long) ((Method) method).invoke(null, objArr2);
                l.longValue();
                long j = threeDS2ServiceInitializationCallback.initialize;
                long j2 = initialize;
                short s2 = s;
                Object[] objArr4 = new Object[4];
                objArr4[3] = Integer.valueOf(c);
                objArr4[2] = Long.valueOf(j2);
                objArr4[1] = Long.valueOf(j);
                objArr4[s2] = l;
                Object obj2 = map.get(1319531906);
                if (obj2 == null) {
                    Class cls3 = (Class) removeParam.initialize(68 - TextUtils.lastIndexOf("", '0'), (char) (50703 - ImageFormat.getBitsPerPixel(s2)), View.getDefaultSize(s2, s2) + 7789);
                    Class cls4 = Long.TYPE;
                    obj2 = cls3.getMethod("b", cls4, cls4, cls4, cls);
                    map.put(1319531906, obj2);
                }
                jArr[i3] = ((Long) ((Method) obj2).invoke(null, objArr4)).longValue();
                Object[] objArr5 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                Object obj3 = map.get(1724349229);
                if (obj3 == null) {
                    Class cls5 = (Class) removeParam.initialize(48 - Color.red(0), (char) (27780 - (ViewConfiguration.getScrollBarSize() >> 8)), (KeyEvent.getMaxKeyCode() >> 16) + 2441);
                    Object[] objArr6 = new Object[1];
                    c((byte) -1, (short) 0, 0, objArr6);
                    obj3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                    map.put(1724349229, obj3);
                }
                ((Method) obj3).invoke(null, objArr5);
                jArr2 = jArr;
                s = 0;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
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
            int i4 = threeDS2ServiceInitializationCallback.initialize;
            if (i4 >= i) {
                objArr[0] = new String(cArr);
                return;
            }
            int i5 = $11 + 7;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                cArr[i4] = (char) jArr3[i4];
                Object[] objArr7 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj4 = map2.get(1724349229);
                if (obj4 == null) {
                    Class cls6 = (Class) removeParam.initialize(AndroidCharacter.getMirror('0'), (char) (27779 - MotionEvent.axisFromString("")), (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 2440);
                    Object[] objArr8 = new Object[1];
                    c((byte) -1, (short) 0, 0, objArr8);
                    obj4 = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                    map2.put(1724349229, obj4);
                }
                ((Method) obj4).invoke(null, objArr7);
                int i6 = 90 / 0;
            } else {
                cArr[i4] = (char) jArr3[i4];
                Object[] objArr9 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj5 = map3.get(1724349229);
                if (obj5 == null) {
                    Class cls7 = (Class) removeParam.initialize(49 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 27780), Gravity.getAbsoluteGravity(0, 0) + 2441);
                    Object[] objArr10 = new Object[1];
                    c((byte) -1, (short) 0, 0, objArr10);
                    obj5 = cls7.getMethod((String) objArr10[0], Object.class, Object.class);
                    map3.put(1724349229, obj5);
                }
                ((Method) obj5).invoke(null, objArr9);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, short s, int i, Object[] objArr) {
        int i2;
        int i3;
        int i4 = 1 - (s * 4);
        byte[] bArr = $$a;
        int i5 = b + 4;
        int i6 = (i * 3) + 97;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i4;
            i3 = 0;
            i6 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i5++;
            i7 = bArr[i5];
            i6 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        }
    }

    private Map<String, String> getWarnings(nq nqVar) {
        try {
            Map<String, Object> initialize2 = nqVar.initialize();
            HashMap hashMap = new HashMap();
            Iterator<String> it = initialize2.keySet().iterator();
            while (it.hasNext()) {
                int i = ThreeDS2ServiceInstance + 17;
                get = i % 128;
                if (i % 2 == 0) {
                    initialize2.get(it.next());
                    throw null;
                }
                String next = it.next();
                Object obj = initialize2.get(next);
                if (obj instanceof String) {
                    ThreeDS2ServiceInstance = (get + 115) % 128;
                    hashMap.put(next, (String) obj);
                }
            }
            return hashMap;
        } catch (setScrollCaptureCallback unused) {
            return new HashMap();
        }
    }

    public static void init$0() {
        $$a = new byte[]{98, 4, -35, -97};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE;
    }

    private nq initialize(setProgress setprogress) {
        get = (ThreeDS2ServiceInstance + 1) % 128;
        nq ThreeDS2ServiceInstance2 = nq.ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        a("\ue51e\uf895\ue577蕸挋掁፠项᭭譴椊疔॒酼缆羢݉Ꝼ䔗", 1 - TextUtils.getOffsetAfter("", 0), objArr);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr[0]).intern(), setprogress.ThreeDS2ServiceInstance());
        Object[] objArr2 = new Object[1];
        b(10 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (41319 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), Color.blue(0) + 27, objArr2);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr2[0]).intern(), setprogress.getWarnings());
        Object[] objArr3 = new Object[1];
        b(View.MeasureSpec.getSize(0) + 9, (char) (Color.green(0) + 13001), 37 - View.resolveSizeAndState(0, 0, 0), objArr3);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr3[0]).intern(), setprogress.ThreeDS2Service());
        Object[] objArr4 = new Object[1];
        a("쏤莢쎉﹄鐭놌㖉潘쥶\uf04a鸯ꞵ⾙\uea4b蠵궾↯\udc6b", -MotionEvent.axisFromString(""), objArr4);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr4[0]).intern(), setprogress.get());
        Object[] objArr5 = new Object[1];
        a("暒쟱曶먁\ue6ad獹郚᷹ஹ", -TextUtils.lastIndexOf("", '0'), objArr5);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr5[0]).intern(), setprogress.getSDKInfo());
        Object[] objArr6 = new Object[1];
        b(TextUtils.lastIndexOf("", '0') + 10, (char) (11143 - Process.getGidForName("")), 46 - ExpandableListView.getPackedPositionType(0L), objArr6);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr6[0]).intern(), setprogress.initialize());
        if (!setprogress.cleanup().isEmpty()) {
            Object[] objArr7 = new Object[1];
            b(21 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (TextUtils.indexOf("", "", 0, 0) + 2546), TextUtils.lastIndexOf("", '0', 0) + 56, objArr7);
            ThreeDS2ServiceInstance2.initialize(((String) objArr7[0]).intern(), nq.ThreeDS2ServiceInstance(setprogress.cleanup()));
        }
        int i = get + 5;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 != 0) {
            int i2 = 92 / 0;
        }
        return ThreeDS2ServiceInstance2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setMin
    public List<setProgress> ThreeDS2ServiceInstance(String str) {
        int i = get + 29;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 != 0) {
            oj.get(str);
            throw null;
        }
        if (oj.get(str)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        ns warnings = ns.getWarnings(str);
        int i2 = 0;
        while (i2 < warnings.getWarnings()) {
            arrayList.add(ThreeDS2Service(warnings.get(i2)));
            i2++;
            get = (ThreeDS2ServiceInstance + 105) % 128;
        }
        return arrayList;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setMin
    public String get(List<setProgress> list) {
        int i = ThreeDS2ServiceInstance + 119;
        get = i % 128;
        int i2 = i % 2;
        String nsVar = ThreeDS2Service(list).toString();
        if (i2 == 0) {
            int i3 = 10 / 0;
        }
        return nsVar;
    }

    private ns ThreeDS2Service(List<setProgress> list) {
        ThreeDS2ServiceInstance = (get + 53) % 128;
        ns ThreeDS2Service2 = ns.ThreeDS2Service();
        Iterator<setProgress> it = list.iterator();
        while (it.hasNext()) {
            ThreeDS2Service2.ThreeDS2Service(initialize(it.next()));
            get = (ThreeDS2ServiceInstance + 3) % 128;
        }
        return ThreeDS2Service2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setMin
    public String ThreeDS2Service(setSmoothScrollingEnabled setsmoothscrollingenabled) {
        ThreeDS2ServiceInstance = (get + 93) % 128;
        nq ThreeDS2ServiceInstance2 = nq.ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        a("䈘퍁䉹꺲Ӟ痏둱ﾱ\u0d0dꂷ", -TextUtils.indexOf((CharSequence) "", '0'), objArr);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr[0]).intern(), setsmoothscrollingenabled.ThreeDS2ServiceInstance());
        Object[] objArr2 = new Object[1];
        b(Drawable.resolveOpacity(0, 0) + 5, (char) KeyEvent.keyCodeFromString(""), Gravity.getAbsoluteGravity(0, 0), objArr2);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr2[0]).intern(), setsmoothscrollingenabled.getWarnings());
        Object[] objArr3 = new Object[1];
        a("胍菌肢︼睌\ue66a皱谞麚\uf026", -TextUtils.lastIndexOf("", '0', 0, 0), objArr3);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr3[0]).intern(), setsmoothscrollingenabled.initialize());
        Object[] objArr4 = new Object[1];
        b(Color.rgb(0, 0, 0) + 16777238, (char) ((Process.getThreadPriority(0) + 20) >> 6), View.combineMeasuredStates(0, 0) + 5, objArr4);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr4[0]).intern(), setsmoothscrollingenabled.get());
        Object[] objArr5 = new Object[1];
        a("咼ᵣ哐悏䋠찃릁듹", (Process.myPid() >> 22) + 1, objArr5);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr5[0]).intern(), ThreeDS2Service(setsmoothscrollingenabled.ThreeDS2Service()));
        String nqVar = ThreeDS2ServiceInstance2.toString();
        int i = get + 95;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            return nqVar;
        }
        throw null;
    }
}
