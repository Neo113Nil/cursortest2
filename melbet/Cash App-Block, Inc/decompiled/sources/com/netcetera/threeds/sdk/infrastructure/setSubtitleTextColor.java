package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.netcetera.threeds.sdk.infrastructure.setTitle;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.bouncycastle.crypto.signers.PSSSigner;

/* loaded from: classes5.dex */
public abstract class setSubtitleTextColor {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int ThreeDS2Service;
    private static byte[] ThreeDS2ServiceInitializationCallback;
    private static char addParam;
    private static int cleanup;
    private static char[] createTransaction;
    private static short[] getSDKInfo;
    private static int getSDKVersion;
    private static int onCompleted;
    private static int onError;
    private final jh ThreeDS2ServiceInstance;
    private final setSubtitle<setPopupTheme, nq> get;
    private final setSubtitle<String, String> getWarnings;
    private final setCollapseIcon initialize;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        onError = 0;
        onCompleted = 1;
        ThreeDS2Service = 752081479;
        cleanup = -1686431643;
        getSDKVersion = -330529675;
        ThreeDS2ServiceInitializationCallback = new byte[]{19, 56, 73, 65, -17, 112, -19, 126, 76, -53, -88, -27, 29, -1, -32, -7, -25, -47, -111, 108, 63, 7, 101, PnmConstants.PBM_RAW_CODE, -104, 7, 101, 62, 7, 40, 58, 5, 117, 58, -119, 0, -114, 29, -64, 19, 11, -23, 56, -9, 9, 87, 46, 93, 44, 47, 95, 39, 88, 38, 9, 122, 43, 85, 40, 37, 84, PnmConstants.PNM_PREFIX_BYTE, 94, 99, 68, -72, 72, 103, 60, 123, 97, -104, 72, -104, 95, 86, -104, 92, 7, 3, 5, 41, 97, 61, 76, 25, 88, 78, 77, 61, 77, 4, 59, 77, 57, -109, -22, -24, PSSSigner.TRAILER_IMPLICIT, -32, -97, -4, -69, -107, -112, -32, -112, -25, -30, -112, 28, PnmConstants.PNM_SEPARATOR, 36, 38, 82, 10, 94, 47, 66, 2, PnmConstants.PBM_TEXT_CODE, 90, PnmConstants.PPM_RAW_CODE, 47, 84, 79, -14, -12, 88, -4, 75, 24, 88, 85, -16, 84, 75, -14, -42, -54, -56, -92, -74, -121, -42, -44, -124, -43, -114, -5, -88, -70, -41, -66, -78, -80, -116, 69, 102, -67, 108, -126, 107, -102, -78, -88, 103, -36, -100, 109, -88, 97, -75, 98, Byte.MIN_VALUE, -109, 91, 103, 89, -99, 46, -107, 46, 120, 124, 60, 42, -118, -115, 123, 115, 115, -105, 114, -96, 37, -105, 113, -108, -127, 99, 63, 70, 83, 101, PnmConstants.PAM_RAW_CODE, 98, 103, 23, 90, 60, 16, 71, 10, 64, 30, 17, 68, 31, 33, 63, 31, 30, 78, 30, 69, 76, 30, 122, -111, 41, -101, 75, 120, 34, -97, 45, 47, 37, 76, -3, 48, -32, 36, -5, -4, 82, 39, -21, -5, -4, 76, -4, 85, 78, -4, PnmConstants.PNM_PREFIX_BYTE, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24};
        createTransaction = new char[]{37934, 37951, 37913, 37950, 37932, 37907, 37938, 37937, 37896, 37916, 37908, 37898, 37906, 37935, 37947, 37903, 37902, 37911, 37897, 37943, 37918, 37936, 37929, 37909, 37940, 37901, 37917, 37919, 37890, 37891, 37912, 37939, 37941, 37942, 37910, 37915};
        addParam = (char) 41446;
    }

    public setSubtitleTextColor(setSubtitle<setPopupTheme, nq> setsubtitle, jh jhVar, setCollapseIcon setcollapseicon, setTitleTextAppearance settitletextappearance) {
        this.get = setsubtitle;
        this.ThreeDS2ServiceInstance = jhVar;
        this.initialize = setcollapseicon;
        this.getWarnings = settitletextappearance;
    }

    private void ThreeDS2ServiceInstance(nq nqVar, setTitle.ThreeDS2ServiceInstance threeDS2ServiceInstance) {
        onError = (onCompleted + 67) % 128;
        jh jhVar = this.ThreeDS2ServiceInstance;
        Object[] objArr = new Object[1];
        b((byte) (63 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 16 - (ViewConfiguration.getWindowTouchSlop() >> 8), "\u000f\u001d㘧㘧 \u001d\u0019\u0003\"\u0016\u001c\t\u0017\u0000\u0016\u000b", objArr);
        List<setMarqueeRepeatLimit> ThreeDS2Service2 = jhVar.ThreeDS2Service(nqVar.ThreeDS2ServiceInitializationCallback(((String) objArr[0]).intern()));
        threeDS2ServiceInstance.ThreeDS2ServiceInstance(ThreeDS2Service2);
        this.ThreeDS2ServiceInstance.get(threeDS2ServiceInstance, initialize(), ThreeDS2Service2);
        int i = onError + 39;
        onCompleted = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x023b, code lost:
    
        if (r8 != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x024e, code lost:
    
        r3 = r2;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x024b, code lost:
    
        r3 = r2;
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0249, code lost:
    
        if (r8 != 0) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, byte b, short s, int i2, int i3, Object[] objArr) {
        int i4;
        int i5;
        int i6;
        long j;
        int i7;
        int i8;
        int i9;
        char c;
        byte[] bArr;
        Object method;
        getSDKVersion getsdkversion = new getSDKVersion();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(cleanup)};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(981393365);
            Class cls = Integer.TYPE;
            if (obj != null) {
                i4 = 2;
                i5 = 0;
            } else {
                Class cls2 = (Class) removeParam.initialize(61 - TextUtils.lastIndexOf("", '0', 0), (char) ((-1) - TextUtils.lastIndexOf("", '0')), 654 - Color.green(0));
                byte b2 = (byte) ($$e & 2);
                byte b3 = (byte) (b2 - 2);
                i4 = 2;
                i5 = 0;
                Object[] objArr3 = new Object[1];
                c(b2, b3, b3, objArr3);
                obj = cls2.getMethod((String) objArr3[0], cls, cls);
                map.put(981393365, obj);
            }
            int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
            if (intValue == -1) {
                int i10 = $10 + 117;
                $11 = i10 % 128;
                if (i10 % 2 != 0) {
                    i6 = 1;
                    if (i6 == 0) {
                        byte[] bArr2 = ThreeDS2ServiceInitializationCallback;
                        if (bArr2 != null) {
                            int length = bArr2.length;
                            byte[] bArr3 = new byte[length];
                            int i11 = i5;
                            while (i11 < length) {
                                int i12 = $10 + 9;
                                $11 = i12 % 128;
                                if (i12 % 2 == 0) {
                                    Object[] objArr4 = {Integer.valueOf(bArr2[i11])};
                                    Map map2 = removeParam.visaSchemeConfiguration;
                                    Object obj2 = map2.get(-1684720202);
                                    if (obj2 != null) {
                                        bArr = bArr2;
                                        method = obj2;
                                    } else {
                                        int i13 = i5;
                                        bArr = bArr2;
                                        Class cls3 = (Class) removeParam.initialize(59 - KeyEvent.normalizeMetaState(i5), (char) Color.argb(i13, i13, i13, i13), (KeyEvent.getMaxKeyCode() >> 16) + 3162);
                                        Object[] objArr5 = new Object[1];
                                        c((byte) 0, 0, (byte) 0, objArr5);
                                        method = cls3.getMethod((String) objArr5[0], cls);
                                        map2.put(-1684720202, method);
                                    }
                                    bArr3[i11] = ((Byte) ((Method) method).invoke(null, objArr4)).byteValue();
                                    i11 /= 0;
                                } else {
                                    bArr = bArr2;
                                    Object[] objArr6 = {Integer.valueOf(bArr[i11])};
                                    Map map3 = removeParam.visaSchemeConfiguration;
                                    Object obj3 = map3.get(-1684720202);
                                    if (obj3 == null) {
                                        Class cls4 = (Class) removeParam.initialize((KeyEvent.getMaxKeyCode() >> 16) + 59, (char) (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (Process.myTid() >> 22) + 3162);
                                        Object[] objArr7 = new Object[1];
                                        c((byte) 0, 0, (byte) 0, objArr7);
                                        obj3 = cls4.getMethod((String) objArr7[0], cls);
                                        map3.put(-1684720202, obj3);
                                    }
                                    bArr3[i11] = ((Byte) ((Method) obj3).invoke(null, objArr6)).byteValue();
                                    i11++;
                                }
                                bArr2 = bArr;
                                i5 = 0;
                            }
                            bArr2 = bArr3;
                        }
                        j = 2786809877878216728L;
                        if (bArr2 != null) {
                            byte[] bArr4 = ThreeDS2ServiceInitializationCallback;
                            Object[] objArr8 = new Object[i4];
                            objArr8[1] = Integer.valueOf(ThreeDS2Service);
                            objArr8[0] = Integer.valueOf(i2);
                            Map map4 = removeParam.visaSchemeConfiguration;
                            Object obj4 = map4.get(981393365);
                            if (obj4 == null) {
                                Class cls5 = (Class) removeParam.initialize(62 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) Color.red(0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 654);
                                byte b4 = (byte) ($$e & 2);
                                byte b5 = (byte) (b4 - 2);
                                Object[] objArr9 = new Object[1];
                                c(b4, b5, b5, objArr9);
                                obj4 = cls5.getMethod((String) objArr9[0], cls, cls);
                                map4.put(981393365, obj4);
                            }
                            intValue = (byte) (((byte) (bArr4[((Integer) ((Method) obj4).invoke(null, objArr8)).intValue()] ^ 2786809877878216728L)) + ((int) (cleanup ^ 2786809877878216728L)));
                        } else {
                            intValue = (short) (((short) (getSDKInfo[i2 + ((int) (ThreeDS2Service ^ 2786809877878216728L))] ^ 2786809877878216728L)) + ((int) (cleanup ^ 2786809877878216728L)));
                        }
                    } else {
                        j = 2786809877878216728L;
                    }
                    if (intValue > 0) {
                        int i14 = $11 + 43;
                        $10 = i14 % 128;
                        if (i14 % 2 != 0) {
                            i7 = ((i2 / intValue) << 2) + ((int) (ThreeDS2Service ^ j));
                        } else {
                            i7 = ((i2 + intValue) - 2) + ((int) (ThreeDS2Service ^ j));
                        }
                        getsdkversion.ThreeDS2ServiceInstance = i8 + i9;
                        Object[] objArr10 = {getsdkversion, Integer.valueOf(i), Integer.valueOf(getSDKVersion), sb};
                        Map map5 = removeParam.visaSchemeConfiguration;
                        Object obj5 = map5.get(-1855485602);
                        if (obj5 == null) {
                            Class cls6 = (Class) removeParam.initialize(54 - KeyEvent.normalizeMetaState(0), (char) (13764 - Color.red(0)), (ViewConfiguration.getEdgeSlop() >> 16) + 2802);
                            byte b6 = (byte) ($$e & 1);
                            byte b7 = (byte) (b6 - 1);
                            Object[] objArr11 = new Object[1];
                            c(b6, b7, b7, objArr11);
                            obj5 = cls6.getMethod((String) objArr11[0], Object.class, cls, cls, Object.class);
                            map5.put(-1855485602, obj5);
                        }
                        ((StringBuilder) ((Method) obj5).invoke(null, objArr10)).append(getsdkversion.ThreeDS2Service);
                        getsdkversion.getWarnings = getsdkversion.ThreeDS2Service;
                        byte[] bArr5 = ThreeDS2ServiceInitializationCallback;
                        if (bArr5 != null) {
                            int length2 = bArr5.length;
                            byte[] bArr6 = new byte[length2];
                            int i15 = 0;
                            while (i15 < length2) {
                                int i16 = $10 + 93;
                                $11 = i16 % 128;
                                if (i16 % 2 == 0) {
                                    bArr6[i15] = (byte) (bArr5[i15] / j);
                                } else {
                                    bArr6[i15] = (byte) (bArr5[i15] ^ j);
                                    i15++;
                                }
                            }
                            bArr5 = bArr6;
                        }
                        boolean z = bArr5 != null;
                        getsdkversion.initialize = 1;
                        while (getsdkversion.initialize < intValue) {
                            if (z) {
                                int i17 = $10 + 73;
                                $11 = i17 % 128;
                                int i18 = i17 % 2;
                                int i19 = getsdkversion.ThreeDS2ServiceInstance;
                                if (i18 == 0) {
                                    byte[] bArr7 = ThreeDS2ServiceInitializationCallback;
                                    getsdkversion.ThreeDS2ServiceInstance = i19;
                                    c = (char) (getsdkversion.getWarnings >> (((byte) (((byte) (bArr7[i19] % j)) / s)) ^ b));
                                } else {
                                    byte[] bArr8 = ThreeDS2ServiceInitializationCallback;
                                    getsdkversion.ThreeDS2ServiceInstance = i19 - 1;
                                    c = (char) (getsdkversion.getWarnings + (((byte) (((byte) (bArr8[i19] ^ j)) + s)) ^ b));
                                }
                                getsdkversion.ThreeDS2Service = c;
                            } else {
                                short[] sArr = getSDKInfo;
                                getsdkversion.ThreeDS2ServiceInstance = getsdkversion.ThreeDS2ServiceInstance - 1;
                                getsdkversion.ThreeDS2Service = (char) (getsdkversion.getWarnings + (((short) (((short) (sArr[r1] ^ j)) + s)) ^ b));
                            }
                            sb.append(getsdkversion.ThreeDS2Service);
                            getsdkversion.getWarnings = getsdkversion.ThreeDS2Service;
                            getsdkversion.initialize++;
                            $10 = ($11 + 45) % 128;
                        }
                    }
                    objArr[0] = sb.toString();
                }
            }
            i6 = i5;
            if (i6 == 0) {
            }
            if (intValue > 0) {
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void b(byte b, int i, String str, Object[] objArr) {
        int i2;
        char c;
        char c2;
        char c3;
        Object method;
        char[] charArray = str != null ? str.toCharArray() : str;
        getParamValue getparamvalue = new getParamValue();
        char[] cArr = createTransaction;
        Class cls = Integer.TYPE;
        char c4 = '0';
        if (cArr != null) {
            $10 = ($11 + 63) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                $11 = ($10 + 43) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i3])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-78420608);
                    if (obj != null) {
                        method = obj;
                    } else {
                        Class cls2 = (Class) removeParam.initialize(94 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((-1) - TextUtils.lastIndexOf("", c4, 0)), KeyEvent.getDeadChar(0, 0) + 1559);
                        Object[] objArr3 = new Object[1];
                        c((byte) 17, 0, (byte) 0, objArr3);
                        method = cls2.getMethod((String) objArr3[0], cls);
                        map.put(-78420608, method);
                    }
                    cArr2[i3] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i3++;
                    c4 = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(addParam)};
        Map map2 = removeParam.visaSchemeConfiguration;
        Object obj2 = map2.get(-78420608);
        if (obj2 == null) {
            Class cls3 = (Class) removeParam.initialize(94 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) View.combineMeasuredStates(0, 0), Color.argb(0, 0, 0, 0) + 1559);
            Object[] objArr5 = new Object[1];
            c((byte) 17, 0, (byte) 0, objArr5);
            obj2 = cls3.getMethod((String) objArr5[0], cls);
            map2.put(-78420608, obj2);
        }
        char charValue = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            getparamvalue.getWarnings = 0;
            while (true) {
                int i4 = getparamvalue.getWarnings;
                if (i4 >= i2) {
                    break;
                }
                char c5 = charArray[i4];
                getparamvalue.get = c5;
                char c6 = charArray[i4 + 1];
                getparamvalue.initialize = c6;
                if (c5 == c6) {
                    cArr3[i4] = (char) (c5 - b);
                    cArr3[i4 + 1] = (char) (c6 - b);
                } else {
                    Object[] objArr6 = {getparamvalue, getparamvalue, Integer.valueOf(charValue), getparamvalue, getparamvalue, Integer.valueOf(charValue), getparamvalue, getparamvalue, Integer.valueOf(charValue), getparamvalue, getparamvalue, Integer.valueOf(charValue), getparamvalue};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(-1395483366);
                    if (obj3 != null) {
                        c = '\t';
                        c2 = 7;
                        c3 = '\b';
                    } else {
                        c = '\t';
                        c2 = 7;
                        c3 = '\b';
                        Class cls4 = (Class) removeParam.initialize(TextUtils.lastIndexOf("", '0', 0, 0) + 49, (char) ((-1) - MotionEvent.axisFromString("")), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3222);
                        Object[] objArr7 = new Object[1];
                        c((byte) ($$e & 31), 0, (byte) 0, objArr7);
                        String str2 = (String) objArr7[0];
                        Class cls5 = Integer.TYPE;
                        obj3 = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                        map3.put(-1395483366, obj3);
                    }
                    int intValue = ((Integer) ((Method) obj3).invoke(null, objArr6)).intValue();
                    int i5 = getparamvalue.cleanup;
                    if (intValue == i5) {
                        Object[] objArr8 = new Object[11];
                        objArr8[10] = getparamvalue;
                        objArr8[c] = Integer.valueOf(charValue);
                        objArr8[c3] = getparamvalue;
                        objArr8[c2] = Integer.valueOf(charValue);
                        objArr8[6] = Integer.valueOf(charValue);
                        objArr8[5] = getparamvalue;
                        objArr8[4] = getparamvalue;
                        objArr8[3] = Integer.valueOf(charValue);
                        objArr8[2] = Integer.valueOf(charValue);
                        objArr8[1] = getparamvalue;
                        objArr8[0] = getparamvalue;
                        Object obj4 = map3.get(1507360409);
                        if (obj4 == null) {
                            Class cls6 = (Class) removeParam.initialize((ViewConfiguration.getJumpTapTimeout() >> 16) + 47, (char) (25644 - Color.blue(0)), Color.blue(0) + 11489);
                            Class cls7 = Integer.TYPE;
                            obj4 = cls6.getMethod("x", Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                            map3.put(1507360409, obj4);
                        }
                        int intValue2 = ((Integer) ((Method) obj4).invoke(null, objArr8)).intValue();
                        int i6 = (getparamvalue.ThreeDS2ServiceInstance * charValue) + getparamvalue.cleanup;
                        int i7 = getparamvalue.getWarnings;
                        cArr3[i7] = cArr[intValue2];
                        cArr3[i7 + 1] = cArr[i6];
                    } else {
                        int i8 = getparamvalue.ThreeDS2Service;
                        int i9 = getparamvalue.ThreeDS2ServiceInstance;
                        int i10 = getparamvalue.ThreeDS2ServiceInitializationCallback;
                        if (i8 == i9) {
                            int m = Thread$State$EnumUnboxingLocalUtility.m(i10, charValue, 1, charValue);
                            getparamvalue.ThreeDS2ServiceInitializationCallback = m;
                            int m2 = Thread$State$EnumUnboxingLocalUtility.m(i5, charValue, 1, charValue);
                            getparamvalue.cleanup = m2;
                            int i11 = (i8 * charValue) + m;
                            int i12 = getparamvalue.getWarnings;
                            cArr3[i12] = cArr[i11];
                            cArr3[i12 + 1] = cArr[(i9 * charValue) + m2];
                        } else {
                            int i13 = (i9 * charValue) + i10;
                            int i14 = getparamvalue.getWarnings;
                            cArr3[i14] = cArr[(i8 * charValue) + i5];
                            cArr3[i14 + 1] = cArr[i13];
                        }
                        getparamvalue.getWarnings += 2;
                    }
                }
                getparamvalue.getWarnings += 2;
            }
        }
        int i15 = 0;
        while (i15 < i) {
            cArr3[i15] = (char) (cArr3[i15] ^ 13722);
            i15++;
            $10 = ($11 + 81) % 128;
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, int i, byte b2, Object[] objArr) {
        int i2;
        int i3 = b + 102;
        int i4 = i * 2;
        int i5 = 4 - (b2 * 4);
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i3;
            i3 = i6;
            int i8 = 0;
            i3 += i7;
            i5++;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i5];
            i3 += i7;
            i5++;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    public static void init$0() {
        $$d = new byte[]{19, 45, 11, 4};
        $$e = 111;
    }

    public setSubtitle<String, String> ThreeDS2Service() {
        int i = onError;
        int i2 = i + 69;
        onCompleted = i2 % 128;
        int i3 = i2 % 2;
        setSubtitle<String, String> setsubtitle = this.getWarnings;
        if (i3 == 0) {
            int i4 = 92 / 0;
        }
        onCompleted = (i + 79) % 128;
        return setsubtitle;
    }

    public final setTitleTextColor get(nq nqVar) {
        setTitle.ThreeDS2ServiceInstance threeDS2ServiceInstance = new setTitle.ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        a((-2000133132) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (byte) (39 - (ViewConfiguration.getPressedStateDuration() >> 16)), (short) ((-46) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) + 1213676962, (-116) - ImageFormat.getBitsPerPixel(0), objArr);
        threeDS2ServiceInstance.apiKey(nqVar.initialize(((String) objArr[0]).intern()));
        Object[] objArr2 = new Object[1];
        a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 2000133115, (byte) (17 - (ViewConfiguration.getTapTimeout() >> 16)), (short) ((Process.myTid() >> 22) + 23), (ViewConfiguration.getFadingEdgeLength() >> 16) + 1213676970, (-116) - ImageFormat.getBitsPerPixel(0), objArr2);
        threeDS2ServiceInstance.removeParam(nqVar.initialize(((String) objArr2[0]).intern()));
        Object[] objArr3 = new Object[1];
        a(View.MeasureSpec.getMode(0) - 2000133113, (byte) ((-54) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (short) ((-88) - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 1213676979 - Color.alpha(0), (ViewConfiguration.getEdgeSlop() >> 16) - 105, objArr3);
        threeDS2ServiceInstance.configureScheme(nqVar.initialize(((String) objArr3[0]).intern()));
        Object[] objArr4 = new Object[1];
        a((-2000133129) - ExpandableListView.getPackedPositionType(0L), (byte) ((-16777338) - Color.rgb(0, 0, 0)), (short) ((ViewConfiguration.getLongPressTimeout() >> 16) + 120), (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 1213676998, (-116) - (ViewConfiguration.getScrollBarSize() >> 8), objArr4);
        threeDS2ServiceInstance.restrictedParameters(nqVar.initialize(((String) objArr4[0]).intern()));
        Object[] objArr5 = new Object[1];
        a(((byte) KeyEvent.getModifierMetaStateMask()) - 2000133127, (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 112), (short) (Color.alpha(0) + 64), AndroidCharacter.getMirror('0') + 15774, (-109) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr5);
        threeDS2ServiceInstance.ConfigurationBuilder(nqVar.initialize(((String) objArr5[0]).intern()));
        Object[] objArr6 = new Object[1];
        b((byte) (58 - (Process.myTid() >> 22)), 11 - (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u001a\t\u000b\u0014\t\u0002\u001c\u000f\u0005\u000b㘰", objArr6);
        threeDS2ServiceInstance.visaSchemeConfiguration(nqVar.initialize(((String) objArr6[0]).intern()));
        Object[] objArr7 = new Object[1];
        a((-2000133130) - ExpandableListView.getPackedPositionType(0L), (byte) (102 - View.resolveSize(0, 0)), (short) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 31), 1213677021 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-106) - ((Process.getThreadPriority(0) + 20) >> 6), objArr7);
        threeDS2ServiceInstance.get(nqVar.initialize(((String) objArr7[0]).intern()));
        Object[] objArr8 = new Object[1];
        a((ViewConfiguration.getKeyRepeatTimeout() >> 16) - 2000133130, (byte) (ExpandableListView.getPackedPositionGroup(0L) + 98), (short) ((KeyEvent.getMaxKeyCode() >> 16) + 70), 1213677039 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.getOffsetAfter("", 0) - 107, objArr8);
        threeDS2ServiceInstance.initialize(nqVar.initialize(((String) objArr8[0]).intern()));
        Object[] objArr9 = new Object[1];
        a((-2000133130) - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) ((-72) - ExpandableListView.getPackedPositionType(0L)), (short) ((-71) - (ViewConfiguration.getTapTimeout() >> 16)), ExpandableListView.getPackedPositionGroup(0L) + 1213677056, TextUtils.indexOf((CharSequence) "", '0') - 107, objArr9);
        threeDS2ServiceInstance.getSDKInfo(nqVar.initialize(((String) objArr9[0]).intern()));
        Object[] objArr10 = new Object[1];
        a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 2000133129, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 122), (short) (72 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 1213677072 - KeyEvent.getDeadChar(0, 0), TextUtils.indexOf("", "", 0, 0) - 110, objArr10);
        threeDS2ServiceInstance.ThreeDS2ServiceInitializationCallback(nqVar.initialize(((String) objArr10[0]).intern()));
        Object[] objArr11 = new Object[1];
        a((-2000133128) - (ViewConfiguration.getTouchSlop() >> 8), (byte) (66 - KeyEvent.keyCodeFromString("")), (short) (TextUtils.getTrimmedLength("") + 103), 1213677085 - ImageFormat.getBitsPerPixel(0), (-110) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr11);
        threeDS2ServiceInstance.cleanup(nqVar.initialize(((String) objArr11[0]).intern()));
        Object[] objArr12 = new Object[1];
        a((-2000133118) - (ViewConfiguration.getPressedStateDuration() >> 16), (byte) (Process.getGidForName("") - 99), (short) ((-51) - View.MeasureSpec.getMode(0)), 1213677099 - ExpandableListView.getPackedPositionType(0L), (KeyEvent.getMaxKeyCode() >> 16) - 109, objArr12);
        threeDS2ServiceInstance.getParamValue(nqVar.initialize(((String) objArr12[0]).intern()));
        Object[] objArr13 = new Object[1];
        a((-2000133114) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 19), (short) (109 - ExpandableListView.getPackedPositionType(0L)), View.resolveSizeAndState(0, 0, 0) + 1213677114, TextUtils.indexOf("", "") - 103, objArr13);
        threeDS2ServiceInstance.addParam(nqVar.initialize(((String) objArr13[0]).intern()));
        Object[] objArr14 = new Object[1];
        b((byte) (View.MeasureSpec.getSize(0) + 95), (ViewConfiguration.getLongPressTimeout() >> 16) + 25, "\u0015\f#\f\u0004\u0011\u000f\u0010\u0011\r\u001c\t\u0011\u0004\u0005 \u0011\u0004\u0016\u000b\"\u001e!\u0018㙕", objArr14);
        threeDS2ServiceInstance.onCompleted(nqVar.initialize(((String) objArr14[0]).intern()));
        Object[] objArr15 = new Object[1];
        b((byte) (101 - (Process.myPid() >> 22)), 13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0018\r\u0019#\u000b\n\u0015#\u001e\u001f\u001c!", objArr15);
        threeDS2ServiceInstance.onError(nqVar.initialize(((String) objArr15[0]).intern()));
        Object[] objArr16 = new Object[1];
        b((byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 106), 11 - Color.red(0), "\u0018\r\u0019#\u000b\n\u0012\u0005\u001c\u001d㙗", objArr16);
        threeDS2ServiceInstance.ConfigParameters(nqVar.initialize(((String) objArr16[0]).intern()));
        Object[] objArr17 = new Object[1];
        a(TextUtils.indexOf("", "") - 2000133132, (byte) ((TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 82), (short) (30 - View.MeasureSpec.getSize(0)), 1213677135 - KeyEvent.normalizeMetaState(0), (-112) - ImageFormat.getBitsPerPixel(0), objArr17);
        threeDS2ServiceInstance.ThreeDS2Service(nqVar.ThreeDS2Service(((String) objArr17[0]).intern()));
        setSubtitle<String, String> setsubtitle = this.getWarnings;
        Object[] objArr18 = new Object[1];
        b((byte) (24 - TextUtils.indexOf("", "", 0)), 7 - (ViewConfiguration.getTouchSlop() >> 8), " \u0005\u0018\f\u0001\u0012㗮", objArr18);
        threeDS2ServiceInstance.ThreeDS2ServiceInstance(setsubtitle.ThreeDS2ServiceInstance(nqVar.initialize(((String) objArr18[0]).intern())));
        Object[] objArr19 = new Object[1];
        b((byte) (72 - (ViewConfiguration.getJumpTapTimeout() >> 16)), Color.red(0) + 14, "\u000f\u001d㘱㘱 \u001d\u001c\u0003\u001a\t\u0017\u0000\u0016\u000b", objArr19);
        threeDS2ServiceInstance.ThreeDS2ServiceInstance((put) nqVar.ThreeDS2Service(((String) objArr19[0]).intern(), put.class));
        Object[] objArr20 = new Object[1];
        b((byte) (82 - Color.argb(0, 0, 0, 0)), (KeyEvent.getMaxKeyCode() >> 16) + 11, "\u000f\u001d㘻㘻 \u001d\u0018\u0003#\u0011㙑", objArr20);
        threeDS2ServiceInstance.ThreeDS2Service((load) nqVar.ThreeDS2Service(((String) objArr20[0]).intern(), load.class));
        Object[] objArr21 = new Object[1];
        a((-2000133128) - ((Process.getThreadPriority(0) + 20) >> 6), (byte) (16 - View.resolveSizeAndState(0, 0, 0)), (short) (TextUtils.indexOf("", "", 0) - 124), 1213677149 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (-111) - View.getDefaultSize(0, 0), objArr21);
        threeDS2ServiceInstance.ThreeDS2Service((getSuppressed) nqVar.ThreeDS2Service(((String) objArr21[0]).intern(), getSuppressed.class));
        Object[] objArr22 = new Object[1];
        b((byte) (KeyEvent.normalizeMetaState(0) + 72), (KeyEvent.getMaxKeyCode() >> 16) + 16, "\u001a\t\u000b\u0014\u0007\u0014\u0018\u0015\u0017\u001e\u001b\u001c\u0005\u0018\t\u001d", objArr22);
        threeDS2ServiceInstance.getWarnings((load) nqVar.ThreeDS2Service(((String) objArr22[0]).intern(), load.class));
        Object[] objArr23 = new Object[1];
        a((-2000133128) - TextUtils.getOffsetAfter("", 0), (byte) (ExpandableListView.getPackedPositionType(0L) - 92), (short) (41 - TextUtils.lastIndexOf("", '0', 0)), 1213677161 - View.MeasureSpec.getSize(0), (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) - 117, objArr23);
        threeDS2ServiceInstance.get((clear) nqVar.ThreeDS2Service(((String) objArr23[0]).intern(), clear.class));
        Object[] objArr24 = new Object[1];
        b((byte) (72 - Color.argb(0, 0, 0, 0)), 25 - TextUtils.indexOf((CharSequence) "", '0', 0), "\u0000\u000e\u001e#!\u001c\b\u001c\u0019!\u000b\n\u0012\u0005\u001c\u001d\r\"\b\u0016\u0000\u0003\"\u0011\u0014\u000b", objArr24);
        threeDS2ServiceInstance.get((addSuppressed) nqVar.ThreeDS2Service(((String) objArr24[0]).intern(), addSuppressed.class));
        Object[] objArr25 = new Object[1];
        b((byte) (114 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 8 - ImageFormat.getBitsPerPixel(0), " \u0005\u0013\f\u0000\u0001#\u0011㙱", objArr25);
        threeDS2ServiceInstance.getWarnings((getLocalizedMessage) nqVar.ThreeDS2Service(((String) objArr25[0]).intern(), getLocalizedMessage.class));
        Object[] objArr26 = new Object[1];
        b((byte) (View.MeasureSpec.getSize(0) + 24), 11 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u000e\n\"\u000b\u0013\u0017\u0011\"\u0011\u0010㘁", objArr26);
        threeDS2ServiceInstance.ThreeDS2Service((keySet) nqVar.ThreeDS2Service(((String) objArr26[0]).intern(), keySet.class));
        Object[] objArr27 = new Object[1];
        a(Process.getGidForName("") - 2000133129, (byte) (43 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (short) (KeyEvent.getDeadChar(0, 0) - 51), 1213677169 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 103, objArr27);
        threeDS2ServiceInstance.ThreeDS2ServiceInstance((wait) nqVar.ThreeDS2Service(((String) objArr27[0]).intern(), wait.class));
        setSubtitle<setPopupTheme, nq> setsubtitle2 = this.get;
        Object[] objArr28 = new Object[1];
        b((byte) ((ViewConfiguration.getTapTimeout() >> 16) + 114), (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 7, "\u0006\u0017#\r \u001d㙱", objArr28);
        threeDS2ServiceInstance.initialize(setsubtitle2.ThreeDS2ServiceInstance(nqVar.getSDKVersion(((String) objArr28[0]).intern())));
        setSubtitle<setPopupTheme, nq> setsubtitle3 = this.get;
        Object[] objArr29 = new Object[1];
        a((-2000133124) - Gravity.getAbsoluteGravity(0, 0), (byte) (View.resolveSizeAndState(0, 0, 0) - 41), (short) (Process.getGidForName("") - 95), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1213677190, ImageFormat.getBitsPerPixel(0) - 113, objArr29);
        threeDS2ServiceInstance.ThreeDS2ServiceInstance(setsubtitle3.ThreeDS2ServiceInstance(nqVar.getSDKVersion(((String) objArr29[0]).intern())));
        setCollapseIcon setcollapseicon = this.initialize;
        Object[] objArr30 = new Object[1];
        a((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 2000133131, (byte) ((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 52), (short) ((-24) - TextUtils.getOffsetBefore("", 0)), 1213677200 - Color.green(0), ExpandableListView.getPackedPositionGroup(0L) - 106, objArr30);
        threeDS2ServiceInstance.initialize(setcollapseicon.get(nqVar.ThreeDS2ServiceInitializationCallback(((String) objArr30[0]).intern())));
        ThreeDS2ServiceInstance(nqVar, threeDS2ServiceInstance);
        initialize(nqVar, threeDS2ServiceInstance);
        setTitleTextColor initialize = threeDS2ServiceInstance.initialize();
        onError = (onCompleted + 59) % 128;
        return initialize;
    }

    public abstract put initialize();

    public abstract void initialize(nq nqVar, setTitle.ThreeDS2ServiceInstance threeDS2ServiceInstance);
}
