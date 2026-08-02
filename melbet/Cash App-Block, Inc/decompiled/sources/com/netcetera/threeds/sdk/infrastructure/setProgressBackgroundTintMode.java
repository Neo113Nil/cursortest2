package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
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
import com.netcetera.threeds.sdk.infrastructure.setIndeterminateTintBlendMode;
import com.netcetera.threeds.sdk.infrastructure.setProgressBackgroundTintList;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes5.dex */
public class setProgressBackgroundTintMode implements setProgressTintBlendMode {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2Service;
    private static int ThreeDS2ServiceInitializationCallback;
    private static char[] ThreeDS2ServiceInstance;
    private static int get;
    private static long getWarnings;
    private static char initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        get = 0;
        ThreeDS2ServiceInitializationCallback = 1;
        getWarnings = -3680520166463435242L;
        ThreeDS2Service = 898634101;
        initialize = (char) 4469;
        ThreeDS2ServiceInstance = new char[]{52944, 52873, 52875, 52873, 52885, 52876, 52922, 52867, 52886, 52944, 52873, 52875, 52873, 52885, 52876, 52922, 52922, 52865, 52867, 52877, 52884, 52875, 52878, 52933, 52897, 52906, 52869, 52876, 52884, 52905, 52894, 52893, 52883, 52888, 52839, 52874, 52883, 52890, 52888, 52889, 52883, 52904, 52892, 52892, 52875, 52880, 52887, 52894, 52894, 52875, 52891, 52756, 52759, 52745, 52758, 52767, 52744, 52747, 52756, 52949, 52876, 52876, 52866, 52866, 52924, 52869, 52876, 52869, 52878, 52876, 52868, 52864, 52886, 52870, 52926, 52867, 52879, 52854, 53189, 53247, 53233, 53240, 53237, 53237, 53246, 53246, 53188, 53188, 52954, 52838, 52847, 52833, 52833, 52887, 52872, 52888, 52893};
    }

    private Map<String, String> ThreeDS2ServiceInstance(nq nqVar) {
        try {
            Map<String, Object> initialize2 = nqVar.initialize();
            HashMap hashMap = new HashMap();
            for (String str : initialize2.keySet()) {
                get = (ThreeDS2ServiceInitializationCallback + 109) % 128;
                Object obj = initialize2.get(str);
                if (obj instanceof String) {
                    get = (ThreeDS2ServiceInitializationCallback + 13) % 128;
                    hashMap.put(str, (String) obj);
                }
            }
            return hashMap;
        } catch (setScrollCaptureCallback unused) {
            return new HashMap();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (r28 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0033, code lost:
    
        r5 = r28.toCharArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0031, code lost:
    
        if (r28 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0038, code lost:
    
        r5 = r28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(String str, int i, char c, String str2, String str3, Object[] objArr) {
        char[] charArray;
        char[] cArr;
        int i2;
        int i3;
        Integer num;
        int i4;
        int i5;
        Integer num2 = 246986610;
        Integer num3 = -258783473;
        int i6 = $10 + 67;
        $11 = i6 % 128;
        int i7 = 2;
        int i8 = 0;
        if (i6 % 2 == 0) {
            int i9 = 31 / 0;
        }
        char[] cArr2 = charArray;
        if (str2 != 0) {
            $10 = ($11 + 105) % 128;
            cArr = str2.toCharArray();
        } else {
            cArr = str2;
        }
        char[] cArr3 = cArr;
        char[] charArray2 = str != null ? str.toCharArray() : str;
        ConfigParameters configParameters = new ConfigParameters();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = charArray2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(charArray2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        configParameters.initialize = 0;
        $10 = ($11 + 97) % 128;
        while (configParameters.initialize < length3) {
            try {
                Object[] objArr2 = {configParameters};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(num3);
                int i10 = i7;
                if (obj != null) {
                    i3 = length3;
                    i2 = i8;
                } else {
                    i2 = i8;
                    i3 = length3;
                    obj = ((Class) removeParam.initialize(57 - ImageFormat.getBitsPerPixel(i8), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 6414 - KeyEvent.normalizeMetaState(i2))).getMethod("j", Object.class);
                    map.put(num3, obj);
                }
                int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {configParameters};
                Object obj2 = map.get(num2);
                if (obj2 != null) {
                    num = num3;
                } else {
                    num = num3;
                    int i11 = i2;
                    obj2 = ((Class) removeParam.initialize(63 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (11345 - View.MeasureSpec.getMode(i2)), Color.rgb(i11, i11, i11) + 16785793)).getMethod("i", Object.class);
                    map.put(num2, obj2);
                }
                int intValue2 = ((Integer) ((Method) obj2).invoke(null, objArr3)).intValue();
                int i12 = cArr4[configParameters.initialize % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i10] = Integer.valueOf(cArr5[intValue]);
                objArr4[1] = Integer.valueOf(i12);
                objArr4[0] = configParameters;
                Object obj3 = map.get(828230935);
                Class cls = Integer.TYPE;
                Integer num4 = num2;
                if (obj3 != null) {
                    i4 = intValue2;
                    i5 = intValue;
                } else {
                    i4 = intValue2;
                    i5 = intValue;
                    obj3 = ((Class) removeParam.initialize(TextUtils.lastIndexOf("", '0', 0) + 75, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 9821)).getMethod("o", Object.class, cls, cls);
                    map.put(828230935, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
                int i13 = cArr4[i4] * 32718;
                Object[] objArr5 = new Object[i10];
                objArr5[1] = Integer.valueOf(cArr5[i5]);
                objArr5[0] = Integer.valueOf(i13);
                Object obj4 = map.get(196637707);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize(48 - (ViewConfiguration.getTouchSlop() >> 8), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 63350), (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 11536)).getMethod("n", cls, cls);
                    map.put(196637707, obj4);
                }
                cArr5[i4] = ((Character) ((Method) obj4).invoke(null, objArr5)).charValue();
                cArr4[i4] = configParameters.get;
                int i14 = configParameters.initialize;
                cArr6[i14] = (char) ((((r3 ^ cArr3[i14]) ^ (getWarnings ^ (-8880716800597159563L))) ^ ((int) (ThreeDS2Service ^ (-8880716800597159563L)))) ^ ((char) (initialize ^ (-8880716800597159563L))));
                configParameters.initialize = i14 + 1;
                cArr3 = cArr3;
                length3 = i3;
                num3 = num;
                num2 = num4;
                i7 = 2;
                i8 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static void b(boolean z, String str, int[] iArr, Object[] objArr) {
        byte[] bArr;
        int i;
        char[] cArr;
        char[] cArr2;
        int i2;
        int i3;
        char[] cArr3;
        char[] cArr4;
        int i4;
        Object method;
        String str2 = str;
        byte[] bArr2 = str2;
        if (str2 != null) {
            bArr2 = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr3 = bArr2;
        cleanup cleanupVar = new cleanup();
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr5 = ThreeDS2ServiceInstance;
        int i9 = 2;
        Class cls = Integer.TYPE;
        if (cArr5 != null) {
            $11 = ($10 + 53) % 128;
            int length = cArr5.length;
            char[] cArr6 = new char[length];
            bArr = bArr3;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10;
                $10 = ($11 + 95) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr5[i11])};
                    int i12 = length;
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-1866317650);
                    if (obj != null) {
                        i3 = i7;
                        i4 = i8;
                        cArr4 = cArr6;
                        method = obj;
                        cArr3 = cArr5;
                    } else {
                        i3 = i7;
                        cArr3 = cArr5;
                        cArr4 = cArr6;
                        Class cls2 = (Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0', 0) + 49, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 2295 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                        Object[] objArr3 = new Object[1];
                        i4 = i8;
                        c((short) 0, (short) 0, -1, objArr3);
                        method = cls2.getMethod((String) objArr3[0], cls);
                        map.put(-1866317650, method);
                    }
                    cArr4[i11] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i10 = i11 + 1;
                    $10 = ($11 + 33) % 128;
                    length = i12;
                    cArr5 = cArr3;
                    i7 = i3;
                    i8 = i4;
                    cArr6 = cArr4;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr5 = cArr6;
        } else {
            bArr = bArr3;
        }
        int i13 = i7;
        int i14 = i8;
        char[] cArr7 = new char[i6];
        System.arraycopy(cArr5, i5, cArr7, 0, i6);
        if (bArr != null) {
            char[] cArr8 = new char[i6];
            cleanupVar.get = 0;
            char c = 0;
            while (true) {
                int i15 = cleanupVar.get;
                if (i15 >= i6) {
                    break;
                }
                if (bArr[i15] == 1) {
                    int i16 = $11 + 41;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        char c2 = cArr7[i15];
                        Object[] objArr4 = new Object[i9];
                        objArr4[1] = Integer.valueOf(c);
                        objArr4[0] = Integer.valueOf(c2);
                        Map map2 = removeParam.visaSchemeConfiguration;
                        Object obj2 = map2.get(715226994);
                        if (obj2 != null) {
                            cArr = cArr7;
                            cArr2 = cArr8;
                            i2 = i15;
                        } else {
                            Class cls3 = (Class) removeParam.initialize((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 85, (char) ((AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 25856), View.MeasureSpec.getSize(0) + 1726);
                            byte b = (byte) ($$b & 1);
                            byte b2 = (byte) (b - 1);
                            cArr = cArr7;
                            cArr2 = cArr8;
                            i2 = i15;
                            Object[] objArr5 = new Object[1];
                            c(b, b2, (byte) (b2 - 1), objArr5);
                            obj2 = cls3.getMethod((String) objArr5[0], cls, cls);
                            map2.put(715226994, obj2);
                        }
                        cArr2[i2] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                        int i17 = 47 / 0;
                    } else {
                        cArr = cArr7;
                        cArr2 = cArr8;
                        Object[] objArr6 = {Integer.valueOf(cArr[i15]), Integer.valueOf(c)};
                        Map map3 = removeParam.visaSchemeConfiguration;
                        Object obj3 = map3.get(715226994);
                        if (obj3 == null) {
                            Class cls4 = (Class) removeParam.initialize(85 - View.MeasureSpec.getSize(0), (char) (25856 - ImageFormat.getBitsPerPixel(0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1727);
                            byte b3 = (byte) ($$b & 1);
                            byte b4 = (byte) (b3 - 1);
                            Object[] objArr7 = new Object[1];
                            c(b3, b4, (byte) (b4 - 1), objArr7);
                            obj3 = cls4.getMethod((String) objArr7[0], cls, cls);
                            map3.put(715226994, obj3);
                        }
                        cArr2[i15] = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
                    }
                } else {
                    cArr = cArr7;
                    cArr2 = cArr8;
                    Object[] objArr8 = {Integer.valueOf(cArr[i15]), Integer.valueOf(c)};
                    Map map4 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map4.get(549300883);
                    if (obj4 == null) {
                        obj4 = ((Class) removeParam.initialize(TextUtils.lastIndexOf("", '0') + 67, (char) (32825 - (Process.myTid() >> 22)), ImageFormat.getBitsPerPixel(0) + 448)).getMethod("D", cls, cls);
                        map4.put(549300883, obj4);
                    }
                    cArr2[i15] = ((Character) ((Method) obj4).invoke(null, objArr8)).charValue();
                }
                c = cArr2[cleanupVar.get];
                Object[] objArr9 = {cleanupVar, cleanupVar};
                Map map5 = removeParam.visaSchemeConfiguration;
                Object obj5 = map5.get(102334785);
                if (obj5 == null) {
                    obj5 = ((Class) removeParam.initialize(TextUtils.getTrimmedLength("") + 74, (char) (Process.myTid() >> 22), View.resolveSize(0, 0) + 9820)).getMethod("I", Object.class, Object.class);
                    map5.put(102334785, obj5);
                }
                ((Method) obj5).invoke(null, objArr9);
                cArr7 = cArr;
                cArr8 = cArr2;
                i9 = 2;
            }
            cArr7 = cArr8;
        }
        if (i14 > 0) {
            char[] cArr9 = new char[i6];
            i = 0;
            System.arraycopy(cArr7, 0, cArr9, 0, i6);
            int i18 = i6 - i14;
            System.arraycopy(cArr9, 0, cArr7, i18, i14);
            System.arraycopy(cArr9, i14, cArr7, 0, i18);
            $11 = ($10 + 23) % 128;
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr10 = new char[i6];
            cleanupVar.get = i;
            while (true) {
                int i19 = cleanupVar.get;
                if (i19 >= i6) {
                    break;
                }
                $11 = ($10 + 75) % 128;
                cArr10[i19] = cArr7[(i6 - i19) - 1];
                cleanupVar.get = i19 + 1;
            }
            cArr7 = cArr10;
        }
        if (i13 > 0) {
            cleanupVar.get = 0;
            while (true) {
                int i20 = cleanupVar.get;
                if (i20 >= i6) {
                    break;
                }
                cArr7[i20] = (char) (cArr7[i20] - iArr[2]);
                cleanupVar.get = i20 + 1;
            }
        }
        objArr[0] = new String(cArr7);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, short s2, int i, Object[] objArr) {
        int i2;
        int i3;
        int i4;
        int i5 = i + 4;
        int i6 = s2 * 2;
        int i7 = 122 - (s * 57);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i6];
        int i8 = 0 - i6;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i9 = 0;
            int i10 = i5;
            int i11 = (-i7) + i10;
            int i12 = i5;
            i2 = i11;
            i3 = i12;
            bArr = bArr3;
            i4 = i9;
            int i13 = i3 + 1;
            bArr2[i4] = (byte) i2;
            if (i4 == i8) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i14 = i2;
            i5 = i13;
            i7 = bArr[i13];
            i9 = i4 + 1;
            bArr3 = bArr;
            i10 = i14;
            int i112 = (-i7) + i10;
            int i122 = i5;
            i2 = i112;
            i3 = i122;
            bArr = bArr3;
            i4 = i9;
            int i132 = i3 + 1;
            bArr2[i4] = (byte) i2;
            if (i4 == i8) {
            }
        } else {
            i2 = i7;
            i3 = i5;
            i4 = 0;
            int i1322 = i3 + 1;
            bArr2[i4] = (byte) i2;
            if (i4 == i8) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{PnmConstants.PAM_RAW_CODE, -74, 61, -103};
        $$b = 103;
    }

    private setProgressBackgroundTintList initialize(nq nqVar) {
        char c;
        char c2 = '0';
        Object[] objArr = new Object[1];
        a("ὣ鳙煷䠭", 1099995082 - View.getDefaultSize(0, 0), (char) (TextUtils.lastIndexOf("", '0') + 62468), "ឰꖕ\ue2fd蜰\uf206\uf467\uf19a㦫\ud9e6䳚\ue3cb骃䁩ᴞ䧡", "쨑邗́忴", objArr);
        String warnings = nqVar.getWarnings(((String) objArr[0]).intern(), "");
        Object[] objArr2 = new Object[1];
        a("ὣ鳙煷䠭", Color.alpha(0), (char) ((Process.myPid() >> 22) + 28653), "撊㘶Ŧ㋲ẹ䓞", "镲↉\ued39䩯", objArr2);
        setProgressBackgroundTintList.getWarnings getwarnings = new setProgressBackgroundTintList.getWarnings(warnings, nqVar.getWarnings(((String) objArr2[0]).intern(), ""));
        Object[] objArr3 = new Object[1];
        a("ὣ鳙煷䠭", TextUtils.getOffsetBefore("", 0) + 58859362, (char) (45165 - Color.blue(0)), "ﳤ늍쯈・묺", "戱舟洃궰", objArr3);
        getwarnings.ThreeDS2ServiceInitializationCallback(nqVar.getWarnings(((String) objArr3[0]).intern(), ""));
        Object[] objArr4 = new Object[1];
        b(true, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000", new int[]{0, 9, 0, 0}, objArr4);
        getwarnings.getSDKInfo(nqVar.getWarnings(((String) objArr4[0]).intern(), ""));
        float f = RecyclerView.DECELERATION_RATE;
        Object[] objArr5 = new Object[1];
        a("ὣ鳙煷䠭", (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), "\uec0c姮⒞⾚㞜\uecc3⚗峺\uec0f殒", "퐁斷붳\ue416", objArr5);
        getwarnings.ConfigParameters(nqVar.getWarnings(((String) objArr5[0]).intern(), ""));
        Object[] objArr6 = new Object[1];
        b(true, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000", new int[]{9, 14, 0, 0}, objArr6);
        getwarnings.addParam(nqVar.getWarnings(((String) objArr6[0]).intern(), ""));
        Object[] objArr7 = new Object[1];
        b(true, "\u0000\u0001\u0001\u0001\u0001", new int[]{23, 5, 0, 5}, objArr7);
        getwarnings.getParamValue(nqVar.getWarnings(((String) objArr7[0]).intern(), ""));
        Object[] objArr8 = new Object[1];
        b(true, null, new int[]{28, 22, 11, 17}, objArr8);
        getwarnings.onError(nqVar.getWarnings(((String) objArr8[0]).intern(), ""));
        Object[] objArr9 = new Object[1];
        b(false, "\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001", new int[]{50, 9, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 0}, objArr9);
        getwarnings.get(nqVar.getWarnings(((String) objArr9[0]).intern(), ""));
        Object[] objArr10 = new Object[1];
        b(true, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{59, 18, 0, 9}, objArr10);
        getwarnings.getWarnings(nqVar.getWarnings(((String) objArr10[0]).intern(), ""));
        Object[] objArr11 = new Object[1];
        b(false, "\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000", new int[]{77, 11, EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, 0}, objArr11);
        getwarnings.ThreeDS2Service(nqVar.getWarnings(((String) objArr11[0]).intern(), ""));
        int i = 0;
        while (true) {
            c = c2;
            Object[] objArr12 = new Object[1];
            a("ὣ鳙煷䠭", (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) - 1, (char) KeyEvent.normalizeMetaState(0), "섏춞㡘έ烄쥐쓔樢ᐈꡁ", "睗\ue03e匨嶳", objArr12);
            if (i >= nqVar.ThreeDS2ServiceInitializationCallback(((String) objArr12[0]).intern()).getWarnings()) {
                break;
            }
            int i2 = get + 43;
            float f2 = f;
            ThreeDS2ServiceInitializationCallback = i2 % 128;
            if (i2 % 2 == 0) {
                Object[] objArr13 = new Object[1];
                a("ὣ鳙煷䠭", (-1) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) MotionEvent.axisFromString(""), "섏춞㡘έ烄쥐쓔樢ᐈꡁ", "睗\ue03e匨嶳", objArr13);
                getwarnings.initialize(nqVar.ThreeDS2ServiceInitializationCallback(((String) objArr13[0]).intern()).getWarnings(i));
                i += 58;
            } else {
                Object[] objArr14 = new Object[1];
                a("ὣ鳙煷䠭", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, (char) (MotionEvent.axisFromString("") + 1), "섏춞㡘έ烄쥐쓔樢ᐈꡁ", "睗\ue03e匨嶳", objArr14);
                getwarnings.initialize(nqVar.ThreeDS2ServiceInitializationCallback(((String) objArr14[0]).intern()).getWarnings(i));
                i++;
            }
            f = f2;
            c2 = c;
        }
        float f3 = f;
        Object[] objArr15 = new Object[1];
        b(false, "\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000", new int[]{77, 11, EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, 0}, objArr15);
        if (oj.ThreeDS2Service(nqVar.getWarnings(((String) objArr15[0]).intern(), ""), setIndeterminateTintBlendMode.get.ThreeDS2Service.get(), setIndeterminateTintBlendMode.get.get.get())) {
            get = (ThreeDS2ServiceInitializationCallback + 49) % 128;
            Object[] objArr16 = new Object[1];
            a("ὣ鳙煷䠭", '0' - AndroidCharacter.getMirror(c), (char) TextUtils.getTrimmedLength(""), "挊\u1a8c焯挓뮗\uf3f5鶰砐\uee60ᓛ钨軭", "ᜏ\uf171瓴橳", objArr16);
            nq sDKVersion = nqVar.getSDKVersion(((String) objArr16[0]).intern());
            Object[] objArr17 = new Object[1];
            a("ὣ鳙煷䠭", ViewConfiguration.getWindowTouchSlop() >> 8, (char) (TextUtils.getOffsetBefore("", 0) + 62433), "씜န䏹ƕᘌ櫒菢\uf454\udf4f녆ꈅ致ₗ乽ɍࠚ", "̕闎\ue185ೳ", objArr17);
            getwarnings.ThreeDS2ServiceInstance(sDKVersion.getWarnings(((String) objArr17[0]).intern(), ""));
            Object[] objArr18 = new Object[1];
            a("ὣ鳙煷䠭", KeyEvent.normalizeMetaState(0) + 1546508819, (char) TextUtils.indexOf("", "", 0), "\ue78d䏀\udcec食횋ণ痶祽\uf646ꠣ⊤", "Ꮗⷚ硜田", objArr18);
            getwarnings.cleanup(sDKVersion.getWarnings(((String) objArr18[0]).intern(), ""));
            Object[] objArr19 = new Object[1];
            a("ὣ鳙煷䠭", ViewConfiguration.getScrollBarFadeDuration() >> 16, (char) (Gravity.getAbsoluteGravity(0, 0) + 16006), "浰懍＆௪꒮箧⯔뵃Ւ㫡传駌撡ፏ", "춊淅蛹焾", objArr19);
            getwarnings.getSDKVersion(sDKVersion.getWarnings(((String) objArr19[0]).intern(), ""));
            Object[] objArr20 = new Object[1];
            b(false, "\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{88, 9, 22, 9}, objArr20);
            getwarnings.createTransaction(sDKVersion.getWarnings(((String) objArr20[0]).intern(), ""));
        }
        Object[] objArr21 = new Object[1];
        a("ὣ鳙煷䠭", (-1524728865) - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (TypedValue.complexToFloat(0) > f3 ? 1 : (TypedValue.complexToFloat(0) == f3 ? 0 : -1)), "ꀱ\uf194췡覼윟裙䷁벙烖\uf629떤雏⎡∲칙葪爿릦ඕ혖贷", "\udf50ṻ\uf3a5꜄", objArr21);
        getwarnings.ThreeDS2ServiceInstance(ThreeDS2ServiceInstance(nqVar.getSDKVersion(((String) objArr21[0]).intern())));
        setProgressBackgroundTintList ThreeDS2ServiceInstance2 = getwarnings.ThreeDS2ServiceInstance();
        int i3 = ThreeDS2ServiceInitializationCallback + 15;
        get = i3 % 128;
        if (i3 % 2 == 0) {
            return ThreeDS2ServiceInstance2;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProgressTintBlendMode
    public String get(List<setProgressBackgroundTintList> list) {
        int i = ThreeDS2ServiceInitializationCallback + 121;
        get = i % 128;
        if (i % 2 != 0) {
            ns.ThreeDS2Service();
            list.iterator();
            throw null;
        }
        ns ThreeDS2Service2 = ns.ThreeDS2Service();
        Iterator<setProgressBackgroundTintList> it = list.iterator();
        while (it.hasNext()) {
            get = (ThreeDS2ServiceInitializationCallback + 97) % 128;
            ThreeDS2Service2.ThreeDS2Service(initialize(it.next()));
        }
        return ThreeDS2Service2.toString();
    }

    private nq initialize(setProgressBackgroundTintList setprogressbackgroundtintlist) {
        get = (ThreeDS2ServiceInitializationCallback + 87) % 128;
        nq ThreeDS2ServiceInstance2 = nq.ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        a("ὣ鳙煷䠭", 1099995083 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (View.resolveSize(0, 0) + 62467), "ឰꖕ\ue2fd蜰\uf206\uf467\uf19a㦫\ud9e6䳚\ue3cb骃䁩ᴞ䧡", "쨑邗́忴", objArr);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr[0]).intern(), setprogressbackgroundtintlist.cleanup());
        Object[] objArr2 = new Object[1];
        a("ὣ鳙煷䠭", (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) - 1, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 28653), "撊㘶Ŧ㋲ẹ䓞", "镲↉\ued39䩯", objArr2);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr2[0]).intern(), setprogressbackgroundtintlist.getSDKVersion());
        Object[] objArr3 = new Object[1];
        a("ὣ鳙煷䠭", TextUtils.getTrimmedLength("") + 58859362, (char) (TextUtils.lastIndexOf("", '0') + 45166), "ﳤ늍쯈・묺", "戱舟洃궰", objArr3);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr3[0]).intern(), setprogressbackgroundtintlist.initialize());
        Object[] objArr4 = new Object[1];
        a("ὣ鳙煷䠭", ViewConfiguration.getScrollBarFadeDuration() >> 16, (char) (50462 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1))), "\uebd2딵皨֙띜鋪", "\ue491\ue798ᴼ\ue4c5", objArr4);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr4[0]).intern(), setprogressbackgroundtintlist.get());
        Object[] objArr5 = new Object[1];
        b(true, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000", new int[]{0, 9, 0, 0}, objArr5);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr5[0]).intern(), setprogressbackgroundtintlist.getWarnings());
        Object[] objArr6 = new Object[1];
        a("ὣ鳙煷䠭", ViewConfiguration.getDoubleTapTimeout() >> 16, (char) Color.blue(0), "\uec0c姮⒞⾚㞜\uecc3⚗峺\uec0f殒", "퐁斷붳\ue416", objArr6);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr6[0]).intern(), setprogressbackgroundtintlist.ThreeDS2Service());
        Object[] objArr7 = new Object[1];
        b(true, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000", new int[]{9, 14, 0, 0}, objArr7);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr7[0]).intern(), setprogressbackgroundtintlist.ThreeDS2ServiceInstance());
        Object[] objArr8 = new Object[1];
        b(true, "\u0000\u0001\u0001\u0001\u0001", new int[]{23, 5, 0, 5}, objArr8);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr8[0]).intern(), setprogressbackgroundtintlist.createTransaction());
        Object[] objArr9 = new Object[1];
        b(true, null, new int[]{28, 22, 11, 17}, objArr9);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr9[0]).intern(), setprogressbackgroundtintlist.getSDKInfo());
        Object[] objArr10 = new Object[1];
        b(false, "\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001", new int[]{50, 9, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 0}, objArr10);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr10[0]).intern(), setprogressbackgroundtintlist.ThreeDS2ServiceInitializationCallback());
        Object[] objArr11 = new Object[1];
        a("ὣ鳙煷䠭", Drawable.resolveOpacity(0, 0), (char) View.resolveSize(0, 0), "섏춞㡘έ烄쥐쓔樢ᐈꡁ", "睗\ue03e匨嶳", objArr11);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr11[0]).intern(), ns.initialize(setprogressbackgroundtintlist.addParam()));
        Object[] objArr12 = new Object[1];
        b(true, "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{59, 18, 0, 9}, objArr12);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr12[0]).intern(), setprogressbackgroundtintlist.ConfigParameters());
        Object[] objArr13 = new Object[1];
        b(false, "\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000", new int[]{77, 11, EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, 0}, objArr13);
        ThreeDS2ServiceInstance2.ThreeDS2Service(((String) objArr13[0]).intern(), setprogressbackgroundtintlist.onCompleted());
        if (oj.ThreeDS2Service(setprogressbackgroundtintlist.onCompleted(), setIndeterminateTintBlendMode.get.ThreeDS2Service.get(), setIndeterminateTintBlendMode.get.get.get())) {
            get = (ThreeDS2ServiceInitializationCallback + 121) % 128;
            nq ThreeDS2ServiceInstance3 = nq.ThreeDS2ServiceInstance();
            Object[] objArr14 = new Object[1];
            a("ὣ鳙煷䠭", ExpandableListView.getPackedPositionGroup(0L), (char) (62433 - (Process.myTid() >> 22)), "씜န䏹ƕᘌ櫒菢\uf454\udf4f녆ꈅ致ₗ乽ɍࠚ", "̕闎\ue185ೳ", objArr14);
            ThreeDS2ServiceInstance3.ThreeDS2Service(((String) objArr14[0]).intern(), setprogressbackgroundtintlist.getParamValue());
            Object[] objArr15 = new Object[1];
            a("ὣ鳙煷䠭", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1546508819, (char) (TextUtils.lastIndexOf("", '0', 0) + 1), "\ue78d䏀\udcec食횋ণ痶祽\uf646ꠣ⊤", "Ꮗⷚ硜田", objArr15);
            ThreeDS2ServiceInstance3.ThreeDS2Service(((String) objArr15[0]).intern(), setprogressbackgroundtintlist.onError());
            Object[] objArr16 = new Object[1];
            a("ὣ鳙煷䠭", View.resolveSize(0, 0), (char) (16006 - ((Process.getThreadPriority(0) + 20) >> 6)), "浰懍＆௪꒮箧⯔뵃Ւ㫡传駌撡ፏ", "춊淅蛹焾", objArr16);
            ThreeDS2ServiceInstance3.ThreeDS2Service(((String) objArr16[0]).intern(), setprogressbackgroundtintlist.ConfigurationBuilder());
            Object[] objArr17 = new Object[1];
            b(false, "\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001", new int[]{88, 9, 22, 9}, objArr17);
            ThreeDS2ServiceInstance3.ThreeDS2Service(((String) objArr17[0]).intern(), setprogressbackgroundtintlist.restrictedParameters());
            Object[] objArr18 = new Object[1];
            a("ὣ鳙煷䠭", View.resolveSizeAndState(0, 0, 0), (char) View.resolveSizeAndState(0, 0, 0), "挊\u1a8c焯挓뮗\uf3f5鶰砐\uee60ᓛ钨軭", "ᜏ\uf171瓴橳", objArr18);
            ThreeDS2ServiceInstance2.initialize(((String) objArr18[0]).intern(), ThreeDS2ServiceInstance3);
        }
        if (!setprogressbackgroundtintlist.apiKey().isEmpty()) {
            Object[] objArr19 = new Object[1];
            a("ὣ鳙煷䠭", (-1524728865) - Drawable.resolveOpacity(0, 0), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), "ꀱ\uf194췡覼윟裙䷁벙烖\uf629떤雏⎡∲칙葪爿릦ඕ혖贷", "\udf50ṻ\uf3a5꜄", objArr19);
            ThreeDS2ServiceInstance2.initialize(((String) objArr19[0]).intern(), nq.ThreeDS2ServiceInstance(setprogressbackgroundtintlist.apiKey()));
        }
        return ThreeDS2ServiceInstance2;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setProgressTintBlendMode
    public List<setProgressBackgroundTintList> initialize(String str) {
        if (oj.get(str)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        ns warnings = ns.getWarnings(str);
        int i = 0;
        while (i < warnings.getWarnings()) {
            ThreeDS2ServiceInitializationCallback = (get + 7) % 128;
            arrayList.add(initialize(warnings.get(i)));
            i++;
            get = (ThreeDS2ServiceInitializationCallback + 17) % 128;
        }
        return arrayList;
    }
}
