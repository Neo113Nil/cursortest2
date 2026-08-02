package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
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
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.lang.reflect.Method;
import java.util.Map;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.bouncycastle.crypto.signers.PSSSigner;

/* loaded from: classes5.dex */
public class setMinEms {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long SchemeConfiguration;
    private static char amexConfiguration;
    private static int cbConfiguration;
    private static int dinersSchemeConfiguration;
    private static byte[] eftposConfiguration;
    private static int getSchemeLogoDark;
    private static short[] jcbConfiguration;
    private static int mastercardSchemeConfiguration;
    private static int unionSchemeConfiguration;
    private static int visaSchemeConfiguration;
    private final String ConfigParameters;
    private final getVersion ConfigurationBuilder;
    private final String ThreeDS2Service;
    private final put ThreeDS2ServiceInitializationCallback;
    private final getCause ThreeDS2ServiceInstance;
    private final int addParam;
    private final replaceAll apiKey;
    private final initCause build;
    private final String cleanup;
    private final String configureScheme;
    private final String createTransaction;
    private final String get;
    private final Boolean getParamValue;
    private final setMarqueeRepeatLimit getSDKInfo;
    private final Boolean getSDKVersion;
    private final String getWarnings;
    private final String initialize;
    private final getInfo onCompleted;
    private final entrySet onError;
    private final putIfAbsent removeParam;
    private final String restrictedParameters;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        dinersSchemeConfiguration = 0;
        getSchemeLogoDark = 1;
        SchemeConfiguration = -8880716800597159563L;
        mastercardSchemeConfiguration = 898634101;
        amexConfiguration = (char) 65028;
        visaSchemeConfiguration = 701230612;
        cbConfiguration = -1686431683;
        unionSchemeConfiguration = -574746352;
        eftposConfiguration = new byte[]{-23, 0, PnmConstants.PPM_TEXT_CODE, PnmConstants.PBM_TEXT_CODE, 28, 47, 39, 5, 84, 8, 39, 5, 46, 39, 88, 42, 37, 21, 42, 57, PnmConstants.PNM_SEPARATOR, 62, -11, -108, 70, 67, -88, 64, 95, -97, -65, PSSSigner.TRAILER_IMPLICIT, 76, PSSSigner.TRAILER_IMPLICIT, 69, 74, PSSSigner.TRAILER_IMPLICIT, 120, 2, -87, -23, -79, -45, 22, -83, 21, -16, -77, PSSSigner.TRAILER_IMPLICIT, 58, 12, -50, -83, -96, 16, -96, 23, 18, -96, 20, 74, -93, -20, 28, -8, 10, 85, -19, PnmConstants.PBM_TEXT_CODE, 8, 48, 91, 30, -25, 37, PnmConstants.PAM_RAW_CODE, -23, 8, 11, 59, 11, PnmConstants.PGM_TEXT_CODE, 61, 11, 63, 117, 14, -10, 1, 17, -6, 10, -5, -49, 23, 20, -43, 24, 18, -6, -30, -8, -62, 16, -125, 12, -12, 21, -27, 94, -18, 95, 83, 85, -17, -26, 94, -10, PnmConstants.PNM_PREFIX_BYTE, 86, 24, -109, -20, -11, 90, -84, -84, -119, -74, -75, 36, 34, -78, 35, -84, 121, -122, -88, 37, 28, -79, -11, 64, 46, 33, 17, 33, 8, 19, 33, -11, 79, 38, 17, 90, 30, 91, -6, 36, -21, 75, 19, 123, -29, 112, 124, 9, 120, 41, 106, 70, 23, 9, 121, 8, Byte.MAX_VALUE, 34, 90, 13, 126, 9, -51, 122, -10, 38, 101, 108, 100, -69, 84, -125, 123, 108, 107, -101, 107, 98, -103, 107, 103, -95, 118, -21, -76, 115, -6, 114, -119, -44, -51, 111, -99, -35, -7, 117, -59, 113, 118, -3, 115, -63, 119, 113, -63, 35, -60, -13, -32, 0, -12, 75, 89, -25, 43, -23, 74, 37, 21, -7, 74, -123, -2, -20, 15, -62, 25, -63, -84, -17, -24, -10, -8, 56, 28, -64, -64, 17, -64, -94, 56, -59, 29, 22, -12, -60, -113, 31, -10, -5, -92, -48, -105, -58, -93, -126, -57, -91, -36, -84, -36, -93, -86, -36, -96, 98, -33};
    }

    public setMinEms(String str, String str2, getCause getcause, String str3, String str4, String str5, setMarqueeRepeatLimit setmarqueerepeatlimit, put putVar, Boolean bool, String str6, entrySet entryset, Boolean bool2, getInfo getinfo, String str7, int i, String str8, replaceAll replaceall, String str9, putIfAbsent putifabsent, getVersion getversion, initCause initcause) {
        this.getWarnings = str;
        this.initialize = str2;
        this.ThreeDS2ServiceInstance = getcause;
        this.ThreeDS2Service = str3;
        this.get = str4;
        this.cleanup = str5;
        this.getSDKInfo = setmarqueerepeatlimit;
        this.ThreeDS2ServiceInitializationCallback = putVar;
        this.getSDKVersion = bool;
        this.createTransaction = str6;
        this.onError = entryset;
        this.getParamValue = bool2;
        this.onCompleted = getinfo;
        this.ConfigParameters = str7;
        this.addParam = i;
        this.apiKey = replaceall;
        this.configureScheme = str8;
        this.restrictedParameters = str9;
        this.removeParam = putifabsent;
        this.ConfigurationBuilder = getversion;
        this.build = initcause;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(String str, int i, char c, String str2, String str3, Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        int i2;
        Integer num;
        int i3;
        int i4;
        Integer num2;
        Integer num3 = 246986610;
        Integer num4 = -258783473;
        int i5 = $11;
        $10 = (i5 + 101) % 128;
        if (str3 != null) {
            $10 = (i5 + 49) % 128;
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        int i6 = 2;
        int i7 = 0;
        if (str2 != 0) {
            int i8 = $10 + 61;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                cArr2 = str2.toCharArray();
                int i9 = 43 / 0;
            } else {
                cArr2 = str2.toCharArray();
            }
        } else {
            cArr2 = str2;
        }
        char[] cArr4 = cArr2;
        char[] charArray = str != null ? str.toCharArray() : str;
        ConfigParameters configParameters = new ConfigParameters();
        int length = cArr3.length;
        char[] cArr5 = new char[length];
        int length2 = charArray.length;
        char[] cArr6 = new char[length2];
        System.arraycopy(cArr3, 0, cArr5, 0, length);
        System.arraycopy(charArray, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr4.length;
        char[] cArr7 = new char[length3];
        configParameters.initialize = 0;
        $10 = ($11 + 45) % 128;
        while (configParameters.initialize < length3) {
            try {
                Object[] objArr2 = {configParameters};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(num4);
                if (obj != null) {
                    i2 = i6;
                } else {
                    i2 = i6;
                    obj = ((Class) removeParam.initialize(((byte) KeyEvent.getModifierMetaStateMask()) + 59, (char) View.MeasureSpec.getMode(i7), (Process.myPid() >> 22) + 6414)).getMethod("j", Object.class);
                    map.put(num4, obj);
                }
                int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {configParameters};
                Object obj2 = map.get(num3);
                if (obj2 != null) {
                    num = num4;
                    i3 = length3;
                    i4 = intValue;
                } else {
                    num = num4;
                    i3 = length3;
                    i4 = intValue;
                    obj2 = ((Class) removeParam.initialize(Color.rgb(0, 0, 0) + 16777279, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 11346), 8577 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)))).getMethod("i", Object.class);
                    map.put(num3, obj2);
                }
                int intValue2 = ((Integer) ((Method) obj2).invoke(null, objArr3)).intValue();
                int i10 = cArr5[configParameters.initialize % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i2] = Integer.valueOf(cArr6[i4]);
                objArr4[1] = Integer.valueOf(i10);
                objArr4[0] = configParameters;
                Object obj3 = map.get(828230935);
                Class cls = Integer.TYPE;
                if (obj3 != null) {
                    num2 = num3;
                } else {
                    num2 = num3;
                    obj3 = ((Class) removeParam.initialize(74 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 9820 - TextUtils.indexOf("", "", 0))).getMethod("o", Object.class, cls, cls);
                    map.put(828230935, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
                int i11 = cArr5[intValue2] * 32718;
                Object[] objArr5 = new Object[i2];
                objArr5[1] = Integer.valueOf(cArr6[i4]);
                objArr5[0] = Integer.valueOf(i11);
                Object obj4 = map.get(196637707);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize((ViewConfiguration.getScrollBarSize() >> 8) + 48, (char) (63350 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 11536 - (Process.myTid() >> 22))).getMethod("n", cls, cls);
                    map.put(196637707, obj4);
                }
                cArr6[intValue2] = ((Character) ((Method) obj4).invoke(null, objArr5)).charValue();
                cArr5[intValue2] = configParameters.get;
                int i12 = configParameters.initialize;
                cArr7[i12] = (char) ((((int) (mastercardSchemeConfiguration ^ (-8880716800597159563L))) ^ ((r2 ^ cArr4[i12]) ^ (SchemeConfiguration ^ (-8880716800597159563L)))) ^ ((char) (amexConfiguration ^ (-8880716800597159563L))));
                configParameters.initialize = i12 + 1;
                length3 = i3;
                num4 = num;
                num3 = num2;
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

    private static void b(short s, int i, int i2, int i3, byte b, Object[] objArr) {
        long j;
        int i4;
        long j2;
        int i5;
        int i6;
        float f;
        byte[] bArr;
        int i7;
        byte[] bArr2;
        int i8;
        byte[] bArr3;
        Object method;
        getSDKVersion getsdkversion = new getSDKVersion();
        StringBuilder sb = new StringBuilder();
        try {
            int i9 = 1;
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(cbConfiguration)};
            int i10 = 0;
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(981393365);
            Class cls = Integer.TYPE;
            if (obj != null) {
                i4 = 2;
                j = 0;
            } else {
                j = 0;
                Class cls2 = (Class) removeParam.initialize(ExpandableListView.getPackedPositionType(0L) + 62, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), Gravity.getAbsoluteGravity(0, 0) + 654);
                byte b2 = (byte) ($$b & 7);
                byte b3 = (byte) (b2 - 2);
                i4 = 2;
                Object[] objArr3 = new Object[1];
                c(b2, b3, b3, objArr3);
                obj = cls2.getMethod((String) objArr3[0], cls, cls);
                map.put(981393365, obj);
            }
            int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
            boolean z = intValue == -1;
            if (z) {
                byte[] bArr4 = eftposConfiguration;
                char c = '0';
                j2 = 2786809877878216728L;
                if (bArr4 != null) {
                    $10 = ($11 + 17) % 128;
                    int length = bArr4.length;
                    f = RecyclerView.DECELERATION_RATE;
                    byte[] bArr5 = new byte[length];
                    int i11 = 0;
                    while (i11 < length) {
                        int i12 = i9;
                        int i13 = $11 + 21;
                        int i14 = i10;
                        $10 = i13 % 128;
                        if (i13 % 2 != 0) {
                            Object[] objArr4 = {Integer.valueOf(bArr4[i11])};
                            Map map2 = removeParam.visaSchemeConfiguration;
                            Object obj2 = map2.get(-1684720202);
                            if (obj2 != null) {
                                i8 = i11;
                                method = obj2;
                                bArr3 = bArr4;
                            } else {
                                i8 = i11;
                                bArr3 = bArr4;
                                Class cls3 = (Class) removeParam.initialize(Color.alpha(i14) + 59, (char) (TextUtils.indexOf("", c) + 1), (ExpandableListView.getPackedPositionForChild(i14, i14) > j ? 1 : (ExpandableListView.getPackedPositionForChild(i14, i14) == j ? 0 : -1)) + 3163);
                                Object[] objArr5 = new Object[i12];
                                c((byte) 0, (byte) 0, (byte) 0, objArr5);
                                method = cls3.getMethod((String) objArr5[0], cls);
                                map2.put(-1684720202, method);
                            }
                            bArr5[i8] = ((Byte) ((Method) method).invoke(null, objArr4)).byteValue();
                            bArr4 = bArr3;
                            i11 = i8;
                        } else {
                            int i15 = i11;
                            byte[] bArr6 = bArr4;
                            Object[] objArr6 = {Integer.valueOf(bArr6[i15])};
                            Map map3 = removeParam.visaSchemeConfiguration;
                            Object obj3 = map3.get(-1684720202);
                            if (obj3 == null) {
                                Class cls4 = (Class) removeParam.initialize((ViewConfiguration.getEdgeSlop() >> 16) + 59, (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 3162 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)));
                                Object[] objArr7 = new Object[1];
                                c((byte) 0, (byte) 0, (byte) 0, objArr7);
                                obj3 = cls4.getMethod((String) objArr7[0], cls);
                                map3.put(-1684720202, obj3);
                            }
                            bArr5[i15] = ((Byte) ((Method) obj3).invoke(null, objArr6)).byteValue();
                            i11 = i15 + 1;
                            bArr4 = bArr6;
                        }
                        i9 = 1;
                        i10 = 0;
                        c = '0';
                    }
                    bArr4 = bArr5;
                } else {
                    f = RecyclerView.DECELERATION_RATE;
                }
                if (bArr4 != null) {
                    int i16 = $11 + 105;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        byte[] bArr7 = eftposConfiguration;
                        Object[] objArr8 = new Object[i4];
                        objArr8[1] = Integer.valueOf(visaSchemeConfiguration);
                        objArr8[0] = Integer.valueOf(i);
                        Map map4 = removeParam.visaSchemeConfiguration;
                        Object obj4 = map4.get(981393365);
                        if (obj4 != null) {
                            bArr2 = bArr7;
                        } else {
                            float f2 = f;
                            Class cls5 = (Class) removeParam.initialize((PointF.length(f2, f2) > f2 ? 1 : (PointF.length(f2, f2) == f2 ? 0 : -1)) + 62, (char) (PointF.length(f2, f2) > f2 ? 1 : (PointF.length(f2, f2) == f2 ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 655);
                            byte b4 = (byte) ($$b & 7);
                            byte b5 = (byte) (b4 - 2);
                            bArr2 = bArr7;
                            Object[] objArr9 = new Object[1];
                            c(b4, b5, b5, objArr9);
                            obj4 = cls5.getMethod((String) objArr9[0], cls, cls);
                            map4.put(981393365, obj4);
                        }
                        i7 = ((byte) (bArr2[((Integer) ((Method) obj4).invoke(null, objArr8)).intValue()] - 2786809877878216728L)) >> ((int) (cbConfiguration | 2786809877878216728L));
                    } else {
                        byte[] bArr8 = eftposConfiguration;
                        Object[] objArr10 = {Integer.valueOf(i), Integer.valueOf(visaSchemeConfiguration)};
                        Map map5 = removeParam.visaSchemeConfiguration;
                        Object obj5 = map5.get(981393365);
                        if (obj5 != null) {
                            bArr = bArr8;
                        } else {
                            Class cls6 = (Class) removeParam.initialize(TextUtils.getOffsetAfter("", 0) + 62, (char) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 653);
                            byte b6 = (byte) ($$b & 7);
                            byte b7 = (byte) (b6 - 2);
                            bArr = bArr8;
                            Object[] objArr11 = new Object[1];
                            c(b6, b7, b7, objArr11);
                            obj5 = cls6.getMethod((String) objArr11[0], cls, cls);
                            map5.put(981393365, obj5);
                        }
                        i7 = ((byte) (bArr[((Integer) ((Method) obj5).invoke(null, objArr10)).intValue()] ^ 2786809877878216728L)) + ((int) (cbConfiguration ^ 2786809877878216728L));
                    }
                    intValue = (byte) i7;
                } else {
                    intValue = (short) (((short) (jcbConfiguration[i + ((int) (visaSchemeConfiguration ^ 2786809877878216728L))] ^ 2786809877878216728L)) + ((int) (cbConfiguration ^ 2786809877878216728L)));
                }
            } else {
                j2 = 2786809877878216728L;
            }
            if (intValue > 0) {
                int i17 = ((i + intValue) - 2) + ((int) (visaSchemeConfiguration ^ j2));
                if (z) {
                    i5 = 1;
                } else {
                    $11 = ($10 + 21) % 128;
                    i5 = 0;
                }
                getsdkversion.ThreeDS2ServiceInstance = i17 + i5;
                Object[] objArr12 = {getsdkversion, Integer.valueOf(i2), Integer.valueOf(unionSchemeConfiguration), sb};
                Map map6 = removeParam.visaSchemeConfiguration;
                Object obj6 = map6.get(-1855485602);
                if (obj6 == null) {
                    Class cls7 = (Class) removeParam.initialize(54 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (TextUtils.indexOf("", "", 0, 0) + 13764), (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 2801);
                    Object[] objArr13 = new Object[1];
                    c((byte) 1, (byte) 0, (byte) 0, objArr13);
                    obj6 = cls7.getMethod((String) objArr13[0], Object.class, cls, cls, Object.class);
                    map6.put(-1855485602, obj6);
                }
                ((StringBuilder) ((Method) obj6).invoke(null, objArr12)).append(getsdkversion.ThreeDS2Service);
                getsdkversion.getWarnings = getsdkversion.ThreeDS2Service;
                byte[] bArr9 = eftposConfiguration;
                if (bArr9 != null) {
                    int length2 = bArr9.length;
                    byte[] bArr10 = new byte[length2];
                    for (int i18 = 0; i18 < length2; i18++) {
                        bArr10[i18] = (byte) (bArr9[i18] ^ j2);
                    }
                    bArr9 = bArr10;
                }
                boolean z2 = bArr9 != null;
                getsdkversion.initialize = 1;
                while (getsdkversion.initialize < intValue) {
                    int i19 = ($11 + 37) % 128;
                    $10 = i19;
                    if (z2) {
                        int i20 = i19 + 39;
                        $11 = i20 % 128;
                        int i21 = i20 % 2;
                        int i22 = getsdkversion.ThreeDS2ServiceInstance;
                        if (i21 == 0) {
                            byte[] bArr11 = eftposConfiguration;
                            getsdkversion.ThreeDS2ServiceInstance = i22;
                            i6 = getsdkversion.getWarnings - (((byte) (((byte) (bArr11[i22] / j2)) + s)) ^ b);
                        } else {
                            byte[] bArr12 = eftposConfiguration;
                            getsdkversion.ThreeDS2ServiceInstance = i22 - 1;
                            i6 = getsdkversion.getWarnings + (((byte) (((byte) (bArr12[i22] ^ j2)) + s)) ^ b);
                        }
                        getsdkversion.ThreeDS2Service = (char) i6;
                    } else {
                        short[] sArr = jcbConfiguration;
                        getsdkversion.ThreeDS2ServiceInstance = getsdkversion.ThreeDS2ServiceInstance - 1;
                        getsdkversion.ThreeDS2Service = (char) (getsdkversion.getWarnings + (((short) (((short) (sArr[r2] ^ j2)) + s)) ^ b));
                    }
                    sb.append(getsdkversion.ThreeDS2Service);
                    getsdkversion.getWarnings = getsdkversion.ThreeDS2Service;
                    getsdkversion.initialize++;
                }
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, byte b2, byte b3, Object[] objArr) {
        int i;
        int i2 = 4 - (b2 * 4);
        int i3 = b + 102;
        int i4 = b3 * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i5 = i4;
            i = 0;
            i2++;
            i3 += i5;
            bArr2[i] = (byte) i3;
            if (i == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i++;
            i5 = bArr[i2];
            i2++;
            i3 += i5;
            bArr2[i] = (byte) i3;
            if (i == i4) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            if (i == i4) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{125, 106, 120, 99};
        $$b = EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE;
    }

    public Boolean ConfigParameters() {
        int i = getSchemeLogoDark + 1;
        dinersSchemeConfiguration = i % 128;
        int i2 = i % 2;
        Boolean bool = this.getSDKVersion;
        if (i2 == 0) {
            return bool;
        }
        throw null;
    }

    public Boolean ConfigurationBuilder() {
        int i = getSchemeLogoDark;
        Boolean bool = this.getParamValue;
        dinersSchemeConfiguration = (i + 99) % 128;
        return bool;
    }

    public getCause ThreeDS2Service() {
        int i = getSchemeLogoDark;
        getCause getcause = this.ThreeDS2ServiceInstance;
        dinersSchemeConfiguration = (i + 105) % 128;
        return getcause;
    }

    public getInfo ThreeDS2ServiceInitializationCallback() {
        int i = (getSchemeLogoDark + 41) % 128;
        dinersSchemeConfiguration = i;
        getInfo getinfo = this.onCompleted;
        int i2 = i + 3;
        getSchemeLogoDark = i2 % 128;
        if (i2 % 2 != 0) {
            return getinfo;
        }
        throw null;
    }

    public String ThreeDS2ServiceInstance() {
        int i = (dinersSchemeConfiguration + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        getSchemeLogoDark = i;
        String str = this.get;
        dinersSchemeConfiguration = (i + 13) % 128;
        return str;
    }

    public replaceAll addParam() {
        int i = dinersSchemeConfiguration;
        int i2 = i + 11;
        getSchemeLogoDark = i2 % 128;
        int i3 = i2 % 2;
        replaceAll replaceall = this.apiKey;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i + 35;
        getSchemeLogoDark = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return replaceall;
    }

    public String amexConfiguration() {
        int i = dinersSchemeConfiguration + 23;
        getSchemeLogoDark = i % 128;
        int i2 = i % 2;
        String str = this.restrictedParameters;
        if (i2 != 0) {
            return str;
        }
        throw null;
    }

    public String apiKey() {
        int i = dinersSchemeConfiguration;
        String str = this.ConfigParameters;
        getSchemeLogoDark = (i + 59) % 128;
        return str;
    }

    public initCause build() {
        int i = dinersSchemeConfiguration + 35;
        getSchemeLogoDark = i % 128;
        int i2 = i % 2;
        initCause initcause = this.build;
        if (i2 != 0) {
            return initcause;
        }
        throw null;
    }

    public String cleanup() {
        int i = getSchemeLogoDark + 91;
        dinersSchemeConfiguration = i % 128;
        int i2 = i % 2;
        String str = this.cleanup;
        if (i2 != 0) {
            int i3 = 12 / 0;
        }
        return str;
    }

    public int configureScheme() {
        int i = dinersSchemeConfiguration;
        int i2 = this.addParam;
        int i3 = i + 29;
        getSchemeLogoDark = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 11 / 0;
        }
        return i2;
    }

    public load createTransaction() {
        getSchemeLogoDark = (dinersSchemeConfiguration + 65) % 128;
        load loadVar = load.ThreeDS2Service;
        int i = getSchemeLogoDark + 113;
        dinersSchemeConfiguration = i % 128;
        if (i % 2 == 0) {
            return loadVar;
        }
        throw null;
    }

    public String get() {
        int i = (getSchemeLogoDark + 41) % 128;
        dinersSchemeConfiguration = i;
        String str = this.getWarnings;
        getSchemeLogoDark = (i + 107) % 128;
        return str;
    }

    public String getParamValue() {
        int i = (getSchemeLogoDark + 15) % 128;
        dinersSchemeConfiguration = i;
        String str = this.createTransaction;
        getSchemeLogoDark = (i + 87) % 128;
        return str;
    }

    public setMarqueeRepeatLimit getSDKInfo() {
        int i = dinersSchemeConfiguration + 59;
        getSchemeLogoDark = i % 128;
        int i2 = i % 2;
        setMarqueeRepeatLimit setmarqueerepeatlimit = this.getSDKInfo;
        if (i2 == 0) {
            int i3 = 75 / 0;
        }
        return setmarqueerepeatlimit;
    }

    public put getSDKVersion() {
        int i = dinersSchemeConfiguration + 101;
        getSchemeLogoDark = i % 128;
        int i2 = i % 2;
        put putVar = this.ThreeDS2ServiceInitializationCallback;
        if (i2 != 0) {
            return putVar;
        }
        throw null;
    }

    public String getWarnings() {
        int i = getSchemeLogoDark + 37;
        dinersSchemeConfiguration = i % 128;
        int i2 = i % 2;
        String str = this.ThreeDS2Service;
        if (i2 == 0) {
            return str;
        }
        throw null;
    }

    public String initialize() {
        int i = getSchemeLogoDark;
        String str = this.initialize;
        dinersSchemeConfiguration = (i + 9) % 128;
        return str;
    }

    public String mastercardSchemeConfiguration() {
        Object obj;
        int i = getSchemeLogoDark + 13;
        dinersSchemeConfiguration = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[1];
            a("\u0000\u0000\u0000\u0000", TextUtils.getTrimmedLength(""), (char) (61890 / TextUtils.indexOf("", "", 1, 0)), "\uf8e1掯", "ǃ堩슈ㇱ", objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a("\u0000\u0000\u0000\u0000", TextUtils.getTrimmedLength(""), (char) (61890 - TextUtils.indexOf("", "", 0, 0)), "\uf8e1掯", "ǃ堩슈ㇱ", objArr2);
            obj = objArr2[0];
        }
        String intern = ((String) obj).intern();
        dinersSchemeConfiguration = (getSchemeLogoDark + 13) % 128;
        return intern;
    }

    public putIfAbsent onCompleted() {
        int i = getSchemeLogoDark + 53;
        dinersSchemeConfiguration = i % 128;
        int i2 = i % 2;
        putIfAbsent putifabsent = this.removeParam;
        if (i2 != 0) {
            int i3 = 25 / 0;
        }
        return putifabsent;
    }

    public getVersion onError() {
        int i = getSchemeLogoDark + 7;
        int i2 = i % 128;
        dinersSchemeConfiguration = i2;
        int i3 = i % 2;
        getVersion getversion = this.ConfigurationBuilder;
        if (i3 != 0) {
            int i4 = 17 / 0;
        }
        getSchemeLogoDark = (i2 + 125) % 128;
        return getversion;
    }

    public entrySet removeParam() {
        int i = dinersSchemeConfiguration;
        int i2 = i + 13;
        getSchemeLogoDark = i2 % 128;
        int i3 = i2 % 2;
        entrySet entryset = this.onError;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i + 55;
        getSchemeLogoDark = i4 % 128;
        if (i4 % 2 != 0) {
            return entryset;
        }
        throw null;
    }

    public String restrictedParameters() {
        int i = dinersSchemeConfiguration + 75;
        getSchemeLogoDark = i % 128;
        int i2 = i % 2;
        String str = this.configureScheme;
        if (i2 != 0) {
            return str;
        }
        throw null;
    }

    public String toString() {
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", 1204036911 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (13854 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "\udc5d\ue107崓ö뭓싢췲\ue4ac箹؟㵬㻞Ζ磈ベ䖯\ue495", "⾌쐥ṇ\uf736", objArr);
        StringBuilder sb = new StringBuilder(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        b((short) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 48), 1297025524 - (ViewConfiguration.getScrollBarSize() >> 8), (-1187317908) - TextUtils.getOffsetBefore("", 0), TextUtils.getOffsetBefore("", 0) - 38, (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 2), objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(this.getWarnings);
        sb.append('\'');
        Object[] objArr3 = new Object[1];
        a("\u0000\u0000\u0000\u0000", KeyEvent.keyCodeFromString(""), (char) (62392 - (ViewConfiguration.getWindowTouchSlop() >> 8)), "脔ᠯば驰渱\ueaf1☆ᬟ\uf504\u0ee3뻫㜨ꏧ嗽", "잫酤룇⣳", objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(this.initialize);
        sb.append('\'');
        Object[] objArr4 = new Object[1];
        b((short) (Process.getGidForName("") - 1), 1297025546 + (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) - 1187317980, (-38) - View.MeasureSpec.makeMeasureSpec(0, 0), (byte) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 91), objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(this.ThreeDS2ServiceInstance);
        Object[] objArr5 = new Object[1];
        b((short) (KeyEvent.keyCodeFromString("") + 29), 1297025564 - Color.argb(0, 0, 0, 0), TextUtils.lastIndexOf("", '0', 0) - 1187317979, View.getDefaultSize(0, 0) - 38, (byte) (43 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(this.ThreeDS2Service);
        sb.append('\'');
        Object[] objArr6 = new Object[1];
        b((short) (98 - (ViewConfiguration.getEdgeSlop() >> 16)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1297025586, (-1204095196) - Color.rgb(0, 0, 0), (-37) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) (TextUtils.indexOf("", "", 0, 0) - 116), objArr6);
        sb.append(((String) objArr6[0]).intern());
        sb.append(this.get);
        sb.append('\'');
        Object[] objArr7 = new Object[1];
        a("\u0000\u0000\u0000\u0000", Process.myTid() >> 22, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 10030), "\uf5cc㙦妦▲砂噌匤쨋\ue0fe襔䇪Ⓤꎔ\ude92걔\uec20△牪\uef2d鷏ｪ㙛緹빳\udedc玕", "꾭\udbca⻑눧", objArr7);
        sb.append(((String) objArr7[0]).intern());
        sb.append(this.cleanup);
        sb.append('\'');
        Object[] objArr8 = new Object[1];
        b((short) (AndroidCharacter.getMirror('0') - 165), TextUtils.lastIndexOf("", '0', 0, 0) + 1297025612, (-1187317980) - (KeyEvent.getMaxKeyCode() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 38, (byte) (ExpandableListView.getPackedPositionType(0L) + 107), objArr8);
        sb.append(((String) objArr8[0]).intern());
        sb.append(this.getSDKInfo);
        Object[] objArr9 = new Object[1];
        b((short) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 35), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1297025629, (-1187317979) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), View.MeasureSpec.getMode(0) - 38, (byte) (37 - View.resolveSizeAndState(0, 0, 0)), objArr9);
        sb.append(((String) objArr9[0]).intern());
        sb.append(this.ThreeDS2ServiceInitializationCallback);
        Object[] objArr10 = new Object[1];
        b((short) (TextUtils.lastIndexOf("", '0') - 120), 1297025646 - MotionEvent.axisFromString(""), (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) - 1187317980, (-38) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) (MotionEvent.axisFromString("") - 59), objArr10);
        sb.append(((String) objArr10[0]).intern());
        sb.append(this.getSDKVersion);
        Object[] objArr11 = new Object[1];
        a("\u0000\u0000\u0000\u0000", (-1021863270) - (ViewConfiguration.getTapTimeout() >> 16), (char) (11270 - KeyEvent.normalizeMetaState(0)), "⡠幠捡\uea48꽗埿뽊㟮⧧磟١屄簢퉧䶀\u12c6滑뿦\uf60b", "骷រۃ茬", objArr11);
        sb.append(((String) objArr11[0]).intern());
        sb.append(this.createTransaction);
        sb.append('\'');
        Object[] objArr12 = new Object[1];
        b((short) ((ViewConfiguration.getScrollDefaultDelay() >> 16) - 36), 1297025666 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (-1187317979) - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (-39) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 21), objArr12);
        sb.append(((String) objArr12[0]).intern());
        sb.append(this.onError);
        Object[] objArr13 = new Object[1];
        b((short) (68 - ((byte) KeyEvent.getModifierMetaStateMask())), 1280248467 - Color.rgb(0, 0, 0), (-1187317980) - ((Process.getThreadPriority(0) + 20) >> 6), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 39, (byte) (83 - (ViewConfiguration.getTapTimeout() >> 16)), objArr13);
        sb.append(((String) objArr13[0]).intern());
        sb.append(this.getParamValue);
        Object[] objArr14 = new Object[1];
        b((short) ((-119) - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1))), Color.blue(0) + 1297025707, (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 1187317980, (ViewConfiguration.getWindowTouchSlop() >> 8) - 38, (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1), objArr14);
        sb.append(((String) objArr14[0]).intern());
        sb.append(this.onCompleted);
        Object[] objArr15 = new Object[1];
        a("\u0000\u0000\u0000\u0000", TextUtils.getTrimmedLength(""), (char) (TextUtils.indexOf((CharSequence) "", '0') + 63848), "ᢀ㰢ظ并㾊跿珉콠푊隣ғ멾콽\ue4b7", "䥧㶷朕蓹", objArr15);
        sb.append(((String) objArr15[0]).intern());
        sb.append(this.ConfigParameters);
        sb.append('\'');
        Object[] objArr16 = new Object[1];
        a("\u0000\u0000\u0000\u0000", (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 152213382, (char) (TextUtils.indexOf("", "") + 53018), "缺\ude44瑷牔\ue07c埫\udf4f뱤ｶ샸툼蓍贈\udbec킕챦闶", "螖ኗᨉ鋏", objArr16);
        sb.append(((String) objArr16[0]).intern());
        sb.append(this.addParam);
        Object[] objArr17 = new Object[1];
        b((short) (90 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 1297025725 - ImageFormat.getBitsPerPixel(0), (-1187317980) - (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.rgb(0, 0, 0) + 16777178, (byte) ((-62) - ExpandableListView.getPackedPositionGroup(0L)), objArr17);
        sb.append(((String) objArr17[0]).intern());
        sb.append(this.apiKey);
        Object[] objArr18 = new Object[1];
        a("\u0000\u0000\u0000\u0000", ViewConfiguration.getTouchSlop() >> 8, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 54524), "䗲ꦃ⊖傟⌯喝\uf5d9ӂꚥ塦Ԉ몸櫖༉❘箩먚橂徴Ხ\ue90f\ue7ed䬣썗ꦅꎰ", "윯脮ﰋ苔", objArr18);
        sb.append(((String) objArr18[0]).intern());
        sb.append(this.configureScheme);
        sb.append('\'');
        Object[] objArr19 = new Object[1];
        b((short) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 32), 1297025750 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) - 1187317980, (ViewConfiguration.getJumpTapTimeout() >> 16) - 38, (byte) (51 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr19);
        sb.append(((String) objArr19[0]).intern());
        sb.append(this.restrictedParameters);
        sb.append('\'');
        Object[] objArr20 = new Object[1];
        a("\u0000\u0000\u0000\u0000", (-155131862) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) View.resolveSize(0, 0), "\uf1db슋儽陘\uda40ꡆ\uf0b1ﵺ鯺ᙀ\uf5d3餿㦼\ue6f1䙻旎ꄡ쟞쪅\udc80き", "⪳샠◶\uf2fb", objArr20);
        sb.append(((String) objArr20[0]).intern());
        sb.append(this.removeParam);
        Object[] objArr21 = new Object[1];
        b((short) (17 - ExpandableListView.getPackedPositionGroup(0L)), (ViewConfiguration.getEdgeSlop() >> 16) + 1297025766, (-1187317980) - (ViewConfiguration.getLongPressTimeout() >> 16), (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) - 38, (byte) ((-20) - Drawable.resolveOpacity(0, 0)), objArr21);
        sb.append(((String) objArr21[0]).intern());
        sb.append(this.ConfigurationBuilder);
        Object[] objArr22 = new Object[1];
        b((short) (66 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 1297025791 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-1187317981) - Process.getGidForName(""), (ViewConfiguration.getScrollBarSize() >> 8) - 38, (byte) ((-2) - TextUtils.getOffsetBefore("", 0)), objArr22);
        sb.append(((String) objArr22[0]).intern());
        sb.append(this.build);
        sb.append('}');
        String sb2 = sb.toString();
        getSchemeLogoDark = (dinersSchemeConfiguration + 91) % 128;
        return sb2;
    }

    public static class initialize {
        private static int SchemeConfiguration = 1;
        private static int visaSchemeConfiguration;
        private Boolean ConfigParameters;
        private replaceAll ConfigurationBuilder;
        private String ThreeDS2Service;
        private final put ThreeDS2ServiceInitializationCallback;
        private final String ThreeDS2ServiceInstance;
        private final int addParam;
        private final iz amexConfiguration;
        private getVersion apiKey;
        private String cleanup;
        private String configureScheme;
        private String createTransaction;
        private final String get;
        private getInfo getParamValue;
        private entrySet getSDKInfo;
        private Boolean getSDKVersion;
        private getCause getWarnings;
        private String initialize;
        private final String onCompleted;
        private final String onError;
        private initCause removeParam;
        private putIfAbsent restrictedParameters;

        public initialize(String str, String str2, put putVar, String str3, int i, String str4, iz izVar) {
            this.ThreeDS2ServiceInstance = str;
            this.get = str2;
            this.ThreeDS2ServiceInitializationCallback = putVar;
            this.onCompleted = str3;
            this.addParam = i;
            this.onError = str4;
            this.amexConfiguration = izVar;
        }

        public setMinEms ThreeDS2Service() {
            setMinEms setminems = new setMinEms(this.ThreeDS2ServiceInstance, this.get, this.getWarnings, this.initialize, this.ThreeDS2Service, this.cleanup, this.amexConfiguration.ThreeDS2Service(this.ThreeDS2ServiceInitializationCallback), this.ThreeDS2ServiceInitializationCallback, this.getSDKVersion, this.createTransaction, this.getSDKInfo, this.ConfigParameters, this.getParamValue, this.onCompleted, this.addParam, this.onError, this.ConfigurationBuilder, this.configureScheme, this.restrictedParameters, this.apiKey, this.removeParam);
            int i = visaSchemeConfiguration;
            int i2 = (i | 105) << 1;
            int i3 = -(((~i) & 105) | (i & (-106)));
            int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
            SchemeConfiguration = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 65 / 0;
            }
            return setminems;
        }

        public initialize ThreeDS2ServiceInstance(replaceAll replaceall) {
            int i = SchemeConfiguration;
            int i2 = (i & (-104)) | ((~i) & 103);
            int i3 = -(-((i & 103) << 1));
            int i4 = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
            visaSchemeConfiguration = i4;
            this.ConfigurationBuilder = replaceall;
            int i5 = (i4 | 89) << 1;
            int i6 = -((i4 & (-90)) | ((~i4) & 89));
            int i7 = (i5 & i6) + (i5 | i6);
            SchemeConfiguration = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 93 / 0;
            }
            return this;
        }

        public initialize get(putIfAbsent putifabsent) {
            int i = SchemeConfiguration;
            int i2 = i ^ 97;
            int i3 = -(-((i & 97) << 1));
            int i4 = ((i2 & i3) + (i3 | i2)) % 128;
            visaSchemeConfiguration = i4;
            this.restrictedParameters = putifabsent;
            int i5 = i4 & 45;
            SchemeConfiguration = (i5 + ((i4 ^ 45) | i5)) % 128;
            return this;
        }

        public initialize getWarnings(Boolean bool) {
            int i = SchemeConfiguration;
            int i2 = (i & (-106)) | ((~i) & 105);
            int i3 = -(-((i & 105) << 1));
            int i4 = (i2 & i3) + (i2 | i3);
            visaSchemeConfiguration = i4 % 128;
            if (i4 % 2 != 0) {
                this.getSDKVersion = bool;
                throw null;
            }
            this.getSDKVersion = bool;
            int i5 = (((i ^ 119) | (i & 119)) << 1) - (((~i) & 119) | (i & (-120)));
            visaSchemeConfiguration = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public initialize initialize(getInfo getinfo) {
            int i = SchemeConfiguration;
            int i2 = ((i ^ 58) + ((i & 58) << 1)) - 1;
            visaSchemeConfiguration = i2 % 128;
            if (i2 % 2 == 0) {
                this.getParamValue = getinfo;
                return this;
            }
            this.getParamValue = getinfo;
            throw null;
        }

        public initialize initialize(String str) {
            int i = SchemeConfiguration;
            int i2 = ((i & 112) + (i | 112)) - 1;
            visaSchemeConfiguration = i2 % 128;
            if (i2 % 2 == 0) {
                this.createTransaction = str;
                return this;
            }
            this.createTransaction = str;
            throw null;
        }

        public initialize get(String str) {
            int i = visaSchemeConfiguration;
            this.ThreeDS2Service = str;
            int i2 = i | 33;
            int i3 = i2 << 1;
            int i4 = -(i2 & (~(i & 33)));
            SchemeConfiguration = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
            return this;
        }

        public initialize get(getCause getcause) {
            int i = SchemeConfiguration;
            int i2 = (((i | 36) << 1) - (i ^ 36)) - 1;
            visaSchemeConfiguration = i2 % 128;
            if (i2 % 2 == 0) {
                this.getWarnings = getcause;
                return this;
            }
            this.getWarnings = getcause;
            throw null;
        }

        public initialize get(getVersion getversion) {
            int i = visaSchemeConfiguration;
            int m$1 = SVG$Unit$EnumUnboxingLocalUtility.m$1(i & 1, ~(-(-(i | 1))), 1, 128);
            SchemeConfiguration = m$1;
            this.apiKey = getversion;
            visaSchemeConfiguration = (m$1 + 87) % 128;
            return this;
        }

        public initialize ThreeDS2ServiceInstance(Boolean bool) {
            int i = visaSchemeConfiguration;
            int i2 = i & 11;
            int i3 = ((((i ^ 11) | i2) << 1) - (~(-((i | 11) & (~i2))))) - 1;
            SchemeConfiguration = i3 % 128;
            if (i3 % 2 == 0) {
                this.ConfigParameters = bool;
                int i4 = 15 / 0;
                return this;
            }
            this.ConfigParameters = bool;
            return this;
        }

        public initialize getWarnings(setMarqueeRepeatLimit setmarqueerepeatlimit) {
            int i = visaSchemeConfiguration;
            int i2 = i & 61;
            int i3 = ((i ^ 61) | i2) << 1;
            int i4 = -((i | 61) & (~i2));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            SchemeConfiguration = i5 % 128;
            int i6 = i5 % 2;
            iz izVar = this.amexConfiguration;
            if (i6 == 0) {
                izVar.initialize(setmarqueerepeatlimit);
                int i7 = 40 / 0;
            } else {
                izVar.initialize(setmarqueerepeatlimit);
            }
            int i8 = visaSchemeConfiguration;
            SchemeConfiguration = ((i8 ^ 61) + ((i8 & 61) << 1)) % 128;
            return this;
        }

        public initialize ThreeDS2ServiceInstance(entrySet entryset) {
            int i = visaSchemeConfiguration;
            int i2 = ((i & 74) + (i | 74)) - 1;
            SchemeConfiguration = i2 % 128;
            if (i2 % 2 != 0) {
                this.getSDKInfo = entryset;
                return this;
            }
            this.getSDKInfo = entryset;
            throw null;
        }

        public initialize ThreeDS2ServiceInstance(String str) {
            int i = SchemeConfiguration;
            int i2 = i + 11;
            visaSchemeConfiguration = i2 % 128;
            if (i2 % 2 == 0) {
                this.configureScheme = str;
                int i3 = i & 75;
                int i4 = (i | 75) & (~i3);
                int i5 = i3 << 1;
                visaSchemeConfiguration = ((i4 ^ i5) + ((i5 & i4) << 1)) % 128;
                return this;
            }
            this.configureScheme = str;
            throw null;
        }

        public initialize getWarnings(String str) {
            int i = SchemeConfiguration;
            int i2 = (i ^ 66) + ((i & 66) << 1);
            int i3 = (i2 ^ (-1)) + (i2 << 1);
            int i4 = i3 % 128;
            visaSchemeConfiguration = i4;
            if (i3 % 2 == 0) {
                this.cleanup = str;
                SchemeConfiguration = (i4 + 11) % 128;
                return this;
            }
            this.cleanup = str;
            throw null;
        }

        public initialize ThreeDS2Service(initCause initcause) {
            int i = visaSchemeConfiguration;
            int i2 = i & 109;
            int i3 = ((i ^ 109) | i2) << 1;
            int i4 = -((i | 109) & (~i2));
            int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
            SchemeConfiguration = i5 % 128;
            if (i5 % 2 != 0) {
                this.removeParam = initcause;
                return this;
            }
            this.removeParam = initcause;
            throw null;
        }

        public initialize ThreeDS2Service(String str) {
            int i = SchemeConfiguration;
            int i2 = ((i & 23) + (i | 23)) % 128;
            visaSchemeConfiguration = i2;
            this.initialize = str;
            int i3 = i2 + 86;
            SchemeConfiguration = ((i3 ^ (-1)) + (i3 << 1)) % 128;
            return this;
        }
    }
}
