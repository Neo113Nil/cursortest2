package com.netcetera.threeds.sdk.api.configparameters.builder;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.api.configparameters.ConfigParameters;
import com.netcetera.threeds.sdk.infrastructure.addParam;
import com.netcetera.threeds.sdk.infrastructure.getSDKVersion;
import com.netcetera.threeds.sdk.infrastructure.ng;
import com.netcetera.threeds.sdk.infrastructure.no;
import com.netcetera.threeds.sdk.infrastructure.nu;
import com.netcetera.threeds.sdk.infrastructure.oj;
import com.netcetera.threeds.sdk.infrastructure.removeParam;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes5.dex */
public class ConfigurationBuilder {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static byte[] ThreeDS2ServiceInitializationCallback;
    private static short[] addParam;
    private static int cleanup;
    private static int createTransaction;
    private static int getParamValue;
    private static int getSDKInfo;
    private static long getSDKVersion;
    private static int onCompleted;
    private String ThreeDS2ServiceInstance;
    private String getWarnings;
    private final no initialize = (no) nu.initialize(new Object[]{ConfigurationBuilder.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private final ConfigParameters get = new ConfigParameters();
    private final List<SchemeConfiguration> ThreeDS2Service = new ArrayList();

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getParamValue = 0;
        onCompleted = 1;
        getSDKVersion = -5852292369888537808L;
        getSDKInfo = 1373007636;
        createTransaction = -1686431660;
        cleanup = 1695993223;
        ThreeDS2ServiceInitializationCallback = new byte[]{25, 21, -23, 23, -32, 20, -9, 9, -23, 9, -24, 17, -32, 29, 18, -30, 26, -30, -21, 9, 25, 29, -29, -25, -23, 9, -30, -17, -26, 25, 22, -21, 12, -30, 20, -28, -30, -27, 18, -11, 29, 9, -26, -20, 16, -27, 29, -24, -29, 18, -2, 12, -30, 20, -28, -30, -27, 18, -11, 29, 9, -26, -20, 16, -27, 29, -24, 12, -30, 20, -28, -30, -27, 18, -11, 29, 9, -13, 29, 24, -27, 11, -26, -20, 16, -27, 29, -24, -32, 20, 11, -15, -32, 16, -27, 29, -24, 24, 24, 24, 24, 24};
    }

    private ConfigurationBuilder ThreeDS2Service(String str, String str2) {
        getParamValue = (onCompleted + 59) % 128;
        ThreeDS2Service(new Object[]{this, str}, 2135823784, -2135823784, System.identityHashCode(this));
        ConfigParameters configParameters = this.get;
        Object[] objArr = new Object[1];
        a((short) KeyEvent.keyCodeFromString(""), 894601493 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 26356437, (-59) - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) ((-16777216) - Color.rgb(0, 0, 0)), objArr);
        configParameters.addParam(((String) objArr[0]).intern(), str, str2);
        getParamValue = (onCompleted + 95) % 128;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0093, code lost:
    
        if (r8 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0095, code lost:
    
        r16 = 2786809877878216728L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a9, code lost:
    
        r13 = r8.length;
        r14 = new byte[r13];
        com.netcetera.threeds.sdk.api.configparameters.builder.ConfigurationBuilder.$11 = (r15 + 101) % 128;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b3, code lost:
    
        if (r15 >= r13) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b7, code lost:
    
        r6 = new java.lang.Object[]{java.lang.Integer.valueOf(r8[r15])};
        r7 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
        r19 = r7.get(-1684720202);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c5, code lost:
    
        if (r19 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c7, code lost:
    
        r23 = r8;
        r21 = r11;
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0112, code lost:
    
        r14[r15] = ((java.lang.Byte) ((java.lang.reflect.Method) r8).invoke(null, r6)).byteValue();
        r15 = r15 + 1;
        r11 = r21;
        r8 = r23;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ce, code lost:
    
        r20 = r10;
        r23 = r8;
        r8 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(android.graphics.Color.alpha((int) r10) + 59, (char) android.view.View.MeasureSpec.getMode(r20), 3162 - android.widget.ExpandableListView.getPackedPositionType(0));
        r10 = new java.lang.Object[1];
        r21 = r11;
        c(r20, r20, (byte) 2, r10);
        r8 = r8.getMethod((java.lang.String) r10[r20], r12);
        r7.put(-1684720202, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x011f, code lost:
    
        r21 = r11;
        r8 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0282, code lost:
    
        if (r9 != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02a2, code lost:
    
        r0 = com.netcetera.threeds.sdk.api.configparameters.builder.ConfigurationBuilder.addParam;
        r4.ThreeDS2ServiceInstance = r4.ThreeDS2ServiceInstance - 1;
        r4.ThreeDS2Service = (char) (r4.getWarnings + (((short) (((short) (r0[r1] ^ r16)) + r24)) ^ r28));
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0287, code lost:
    
        r0 = com.netcetera.threeds.sdk.api.configparameters.builder.ConfigurationBuilder.ThreeDS2ServiceInitializationCallback;
        r4.ThreeDS2ServiceInstance = r4.ThreeDS2ServiceInstance - 1;
        r4.ThreeDS2Service = (char) (r4.getWarnings + (((byte) (((byte) (r0[r1] ^ r16)) + r24)) ^ r28));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0285, code lost:
    
        if (r9 != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x009b, code lost:
    
        r21 = r11;
        r16 = 2786809877878216728L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00a6, code lost:
    
        if (r8 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, int i, int i2, int i3, byte b, Object[] objArr) {
        int i4;
        long j;
        int length;
        byte[] bArr;
        int i5;
        byte[] bArr2;
        getSDKVersion getsdkversion = new getSDKVersion();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(createTransaction)};
            short s2 = 0;
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(981393365);
            Class cls = Integer.TYPE;
            if (obj == null) {
                Class cls2 = (Class) removeParam.initialize(62 - View.MeasureSpec.getMode(0), (char) (Process.myTid() >> 22), 653 - ((byte) KeyEvent.getModifierMetaStateMask()));
                Object[] objArr3 = new Object[1];
                c((short) 0, 0, (byte) 0, objArr3);
                obj = cls2.getMethod((String) objArr3[0], cls, cls);
                map.put(981393365, obj);
            }
            int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
            int i6 = intValue == -1 ? 1 : 0;
            if (i6 != 0) {
                int i7 = $11 + 13;
                int i8 = i7 % 128;
                $10 = i8;
                if (i7 % 2 != 0) {
                    bArr2 = ThreeDS2ServiceInitializationCallback;
                    int i9 = 36 / 0;
                } else {
                    bArr2 = ThreeDS2ServiceInitializationCallback;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = ThreeDS2ServiceInitializationCallback;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(getSDKInfo)};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(981393365);
                    if (obj2 == null) {
                        Class cls3 = (Class) removeParam.initialize(((Process.getThreadPriority(0) + 20) >> 6) + 62, (char) (ViewConfiguration.getScrollBarSize() >> 8), 653 - Process.getGidForName(""));
                        Object[] objArr5 = new Object[1];
                        c((short) 0, 0, (byte) 0, objArr5);
                        obj2 = cls3.getMethod((String) objArr5[0], cls, cls);
                        map2.put(981393365, obj2);
                    }
                    intValue = (byte) (((byte) (bArr3[((Integer) ((Method) obj2).invoke(null, objArr4)).intValue()] ^ j)) + ((int) (createTransaction ^ j)));
                } else {
                    intValue = (short) (((short) (addParam[i + ((int) (getSDKInfo ^ j))] ^ j)) + ((int) (createTransaction ^ j)));
                }
            } else {
                i4 = i6;
                j = 2786809877878216728L;
            }
            if (intValue > 0) {
                getsdkversion.ThreeDS2ServiceInstance = ((i + intValue) - 2) + ((int) (getSDKInfo ^ j)) + i4;
                Object[] objArr6 = {getsdkversion, Integer.valueOf(i2), Integer.valueOf(cleanup), sb};
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj3 = map3.get(-1855485602);
                if (obj3 == null) {
                    Class cls4 = (Class) removeParam.initialize(55 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (13764 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2802);
                    Object[] objArr7 = new Object[1];
                    c((short) 0, 0, (byte) 1, objArr7);
                    obj3 = cls4.getMethod((String) objArr7[0], Object.class, cls, cls, Object.class);
                    map3.put(-1855485602, obj3);
                }
                ((StringBuilder) ((Method) obj3).invoke(null, objArr6)).append(getsdkversion.ThreeDS2Service);
                getsdkversion.getWarnings = getsdkversion.ThreeDS2Service;
                byte[] bArr4 = ThreeDS2ServiceInitializationCallback;
                if (bArr4 != null) {
                    int i10 = $11 + 75;
                    $10 = i10 % 128;
                    if (i10 % 2 != 0) {
                        length = bArr4.length;
                        bArr = new byte[length];
                        i5 = 1;
                    } else {
                        length = bArr4.length;
                        bArr = new byte[length];
                        i5 = 0;
                    }
                    while (i5 < length) {
                        bArr[i5] = (byte) (bArr4[i5] ^ j);
                        i5++;
                    }
                    bArr4 = bArr;
                }
                boolean z = bArr4 != null;
                int i11 = 1;
                while (true) {
                    getsdkversion.initialize = i11;
                    if (getsdkversion.initialize >= intValue) {
                        break;
                    }
                    int i12 = $10 + 37;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        int i13 = 82 / 0;
                    }
                    sb.append(getsdkversion.ThreeDS2Service);
                    getsdkversion.getWarnings = getsdkversion.ThreeDS2Service;
                    i11 = getsdkversion.initialize + 1;
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

    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b7, code lost:
    
        r0[r4] = (char) r5[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01bd, code lost:
    
        r0 = new java.lang.Object[]{r3, r3};
        r2 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
        r3 = r2.get(-1840119381);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01cd, code lost:
    
        if (r3 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0208, code lost:
    
        ((java.lang.reflect.Method) r3).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x020e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d0, code lost:
    
        r3 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize((android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 76, (char) (android.graphics.Color.blue(0) + 62097), ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 2102);
        r4 = new java.lang.Object[1];
        c(0, 0, (byte) 5, r4);
        r3 = r3.getMethod((java.lang.String) r4[0], java.lang.Object.class, java.lang.Object.class);
        r2.put(-1840119381, r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(String str, int i, Object[] objArr) {
        Throwable cause;
        short s;
        Object method;
        char[] charArray = str != null ? str.toCharArray() : str;
        addParam addparam = new addParam();
        addparam.initialize = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        short s2 = 0;
        addparam.ThreeDS2Service = 0;
        while (true) {
            int i2 = addparam.ThreeDS2Service;
            if (i2 >= charArray.length) {
                break;
            }
            int i3 = $11 + 35;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            Class cls = Integer.TYPE;
            if (i4 != 0) {
                char c = charArray[i2];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[2] = addparam;
                    objArr2[1] = addparam;
                    objArr2[s2] = Integer.valueOf(c);
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-983980093);
                    if (obj != null) {
                        s = s2;
                        method = obj;
                    } else {
                        s = s2;
                        method = ((Class) removeParam.initialize(65 - TextUtils.lastIndexOf("", '0', s2), (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 12510)).getMethod("e", cls, Object.class, Object.class);
                        map.put(-983980093, method);
                    }
                    jArr[i2] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() % (getSDKVersion + 6009743645011411028L);
                    Object[] objArr3 = new Object[2];
                    objArr3[1] = addparam;
                    objArr3[s] = addparam;
                    Object obj2 = map.get(-1840119381);
                    if (obj2 == null) {
                        Class cls2 = (Class) removeParam.initialize(76 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (62097 - Color.blue((int) s)), 2102 - TextUtils.getTrimmedLength(""));
                        Object[] objArr4 = new Object[1];
                        short s3 = s;
                        c(s3, s3, (byte) 5, objArr4);
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
                Object[] objArr5 = {Integer.valueOf(charArray[i2]), addparam, addparam};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(-983980093);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(66 - KeyEvent.normalizeMetaState(0), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 12510)).getMethod("e", cls, Object.class, Object.class);
                    map2.put(-983980093, obj3);
                }
                jArr[i2] = ((Long) ((Method) obj3).invoke(null, objArr5)).longValue() ^ (getSDKVersion ^ 6009743645011411028L);
                Object[] objArr6 = {addparam, addparam};
                Object obj4 = map2.get(-1840119381);
                if (obj4 == null) {
                    Class cls3 = (Class) removeParam.initialize((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 76, (char) (62097 - View.MeasureSpec.getSize(0)), 2101 - MotionEvent.axisFromString(""));
                    Object[] objArr7 = new Object[1];
                    c((short) 0, 0, (byte) 5, objArr7);
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
        char[] cArr = new char[length];
        addparam.ThreeDS2Service = 0;
        while (true) {
            int i5 = addparam.ThreeDS2Service;
            if (i5 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            int i6 = $11 + 85;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                break;
            }
            cArr[i5] = (char) jArr[i5];
            Object[] objArr8 = {addparam, addparam};
            Map map3 = removeParam.visaSchemeConfiguration;
            Object obj5 = map3.get(-1840119381);
            if (obj5 == null) {
                Class cls4 = (Class) removeParam.initialize(75 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (62097 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), View.MeasureSpec.getMode(0) + 2102);
                Object[] objArr9 = new Object[1];
                c((short) 0, 0, (byte) 5, objArr9);
                obj5 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                map3.put(-1840119381, obj5);
            }
            ((Method) obj5).invoke(null, objArr8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, int i, byte b, Object[] objArr) {
        int i2;
        int i3;
        int i4;
        byte[] bArr = $$a;
        int i5 = 3 - (i * 3);
        int i6 = (s * 3) + 1;
        int i7 = 104 - b;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            i4 = 0;
            int i8 = i5;
            i5 += -i7;
            i2 = i8;
            bArr = bArr3;
            i3 = i4;
            int i9 = i2 + 1;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i9];
            byte[] bArr4 = bArr;
            i8 = i9;
            i7 = b2;
            bArr3 = bArr4;
            i5 += -i7;
            i2 = i8;
            bArr = bArr3;
            i3 = i4;
            int i92 = i2 + 1;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        } else {
            i2 = i5;
            i5 = i7;
            i3 = 0;
            int i922 = i2 + 1;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        }
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        ConfigurationBuilder configurationBuilder = (ConfigurationBuilder) objArr[0];
        String str = (String) objArr[1];
        Object[] objArr2 = new Object[1];
        a((short) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 894601548 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 26356436 - (KeyEvent.getMaxKeyCode() >> 16), (-66) - Color.alpha(0), (byte) (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr2);
        ng.ThreeDS2Service(str, ((String) objArr2[0]).intern());
        ConfigParameters configParameters = configurationBuilder.get;
        Object[] objArr3 = new Object[1];
        b("錗씸㽲醼쯵㰾陁좳⋽鬾쵷➢", View.MeasureSpec.makeMeasureSpec(0, 0) + 22079, objArr3);
        String paramValue = configParameters.getParamValue(null, ((String) objArr3[0]).intern());
        ArrayList arrayList = new ArrayList();
        if (paramValue != null) {
            onCompleted = (getParamValue + 101) % 128;
            arrayList.addAll(Arrays.asList(paramValue.split(",")));
        }
        if (!arrayList.contains(str)) {
            onCompleted = (getParamValue + 121) % 128;
            arrayList.add(str);
            ConfigParameters configParameters2 = configurationBuilder.get;
            Object[] objArr4 = new Object[1];
            b("錗씸㽲醼쯵㰾陁좳⋽鬾쵷➢", (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 22079, objArr4);
            configParameters2.removeParam(null, ((String) objArr4[0]).intern());
            ConfigParameters configParameters3 = configurationBuilder.get;
            Object[] objArr5 = new Object[1];
            b("錗씸㽲醼쯵㰾陁좳⋽鬾쵷➢", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22079, objArr5);
            configParameters3.addParam(null, ((String) objArr5[0]).intern(), oj.ThreeDS2Service(arrayList, ","));
        }
        int i = getParamValue + 85;
        onCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 5 / 0;
        }
        return null;
    }

    private void getWarnings(String str) {
        int i = onCompleted + 7;
        getParamValue = i % 128;
        if (i % 2 != 0) {
            int i2 = 44 / 0;
            if (!get((ConfigurationBuilder) str)) {
                return;
            }
        } else if (!get((ConfigurationBuilder) str)) {
            return;
        }
        ConfigParameters configParameters = this.get;
        Object[] objArr = new Object[1];
        a((short) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 894601459, View.MeasureSpec.makeMeasureSpec(0, 0) + 26356435, (-44) - TextUtils.lastIndexOf("", '0', 0), (byte) ((ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) - 1), objArr);
        configParameters.addParam(null, ((String) objArr[0]).intern(), str);
        onCompleted = (getParamValue + 103) % 128;
    }

    public static void init$0() {
        $$a = new byte[]{PnmConstants.PAM_RAW_CODE, -74, 61, -103};
        $$b = 36;
    }

    private void initialize(SchemeConfiguration schemeConfiguration) {
        int i = getParamValue + 113;
        onCompleted = i % 128;
        if (i % 2 == 0) {
            int i2 = 68 / 0;
            if (!get((ConfigurationBuilder) schemeConfiguration)) {
                return;
            }
        } else if (!get((ConfigurationBuilder) schemeConfiguration)) {
            return;
        }
        if (get((ConfigurationBuilder) schemeConfiguration.getSchemeId())) {
            initialize(schemeConfiguration.getSchemeName(), schemeConfiguration.getSchemeId());
        }
        if (get((ConfigurationBuilder) schemeConfiguration.getSchemeLogo())) {
            getParamValue = (onCompleted + 125) % 128;
            Object[] objArr = new Object[1];
            b("錗\udbe2ˆ䦮낝ｼ♥测퐣̎䯹", MotionEvent.axisFromString("") + 18662, objArr);
            ThreeDS2Service(((String) objArr[0]).intern(), schemeConfiguration.getSchemeName(), schemeConfiguration.getSchemeLogo());
        }
        if (get((ConfigurationBuilder) schemeConfiguration.getSchemeLogoDark())) {
            Object[] objArr2 = new Object[1];
            b("錗ꩊ\ue196㣦瘽趄쓵ȓ奣邶급\ue574㲜篬넠좌", 14668 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr2);
            ThreeDS2Service(((String) objArr2[0]).intern(), schemeConfiguration.getSchemeName(), schemeConfiguration.getSchemeLogoDark());
        }
        if (get((ConfigurationBuilder) schemeConfiguration.getSchemeEncryptionPublicKey())) {
            ThreeDS2Service(schemeConfiguration.getSchemeName(), schemeConfiguration.getSchemeEncryptionPublicKey());
        }
        if (get((ConfigurationBuilder) schemeConfiguration.getSchemeEncryptionPublicKeyId())) {
            int i3 = getParamValue + 15;
            onCompleted = i3 % 128;
            if (i3 % 2 == 0) {
                get(schemeConfiguration.getSchemeName(), schemeConfiguration.getSchemeEncryptionPublicKeyId());
                throw null;
            }
            get(schemeConfiguration.getSchemeName(), schemeConfiguration.getSchemeEncryptionPublicKeyId());
        }
        if (get((ConfigurationBuilder) schemeConfiguration.getSchemePublicRootKeys())) {
            int i4 = onCompleted + 77;
            getParamValue = i4 % 128;
            if (i4 % 2 == 0) {
                initialize(schemeConfiguration.getSchemeName(), schemeConfiguration.getSchemePublicRootKeys());
            } else {
                initialize(schemeConfiguration.getSchemeName(), schemeConfiguration.getSchemePublicRootKeys());
                int i5 = 95 / 0;
            }
        }
    }

    public ConfigurationBuilder apiKey(String str) {
        int i = onCompleted + 33;
        getParamValue = i % 128;
        if (i % 2 == 0) {
            this.getWarnings = str;
            return this;
        }
        this.getWarnings = str;
        int i2 = 60 / 0;
        return this;
    }

    public ConfigParameters build() {
        ThreeDS2Service(new Object[]{this, this.getWarnings}, -1296993749, 1296993750, System.identityHashCode(this));
        getWarnings(this.ThreeDS2ServiceInstance);
        Iterator<SchemeConfiguration> it = this.ThreeDS2Service.iterator();
        while (it.hasNext()) {
            onCompleted = (getParamValue + 13) % 128;
            initialize(it.next());
        }
        ConfigParameters configParameters = this.get;
        int i = getParamValue + 19;
        onCompleted = i % 128;
        if (i % 2 != 0) {
            return configParameters;
        }
        throw null;
    }

    public ConfigurationBuilder configureScheme(SchemeConfiguration schemeConfiguration) {
        onCompleted = (getParamValue + 63) % 128;
        this.ThreeDS2Service.add(schemeConfiguration);
        onCompleted = (getParamValue + 77) % 128;
        return this;
    }

    public ConfigurationBuilder restrictedParameters(List<String> list) {
        int i = getParamValue + 27;
        onCompleted = i % 128;
        if (i % 2 == 0) {
            this.ThreeDS2ServiceInstance = oj.ThreeDS2Service(list, ",");
            int i2 = 12 / 0;
        } else {
            this.ThreeDS2ServiceInstance = oj.ThreeDS2Service(list, ",");
        }
        int i3 = getParamValue + 85;
        onCompleted = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 78 / 0;
        }
        return this;
    }

    private ConfigurationBuilder ThreeDS2Service(String str, String str2, String str3) {
        getParamValue = (onCompleted + 1) % 128;
        ThreeDS2Service(new Object[]{this, str2}, 2135823784, -2135823784, System.identityHashCode(this));
        this.get.addParam(str, str2, str3);
        getParamValue = (onCompleted + 9) % 128;
        return this;
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i2 * (-657)) + (i * 659);
        int i5 = ~((~i) | i2);
        int i6 = ~((~i2) | i);
        int i7 = ~(i | i3);
        int i8 = ((i5 | i6 | i7) * (-658)) + i4;
        if (((i7 | i6) * 658) + (i6 * 658) + i8 != 1) {
            return get(objArr);
        }
        ConfigurationBuilder configurationBuilder = (ConfigurationBuilder) objArr[0];
        String str = (String) objArr[1];
        getParamValue = (onCompleted + 81) % 128;
        ConfigParameters configParameters = configurationBuilder.get;
        Object[] objArr2 = new Object[1];
        b("錅㝙\udb97翜ȻꚀ䫓", 42061 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
        configParameters.addParam(null, ((String) objArr2[0]).intern(), str);
        getParamValue = (onCompleted + 85) % 128;
        return null;
    }

    private ConfigurationBuilder get(String str, String str2) {
        onCompleted = (getParamValue + 73) % 128;
        ThreeDS2Service(new Object[]{this, str}, 2135823784, -2135823784, System.identityHashCode(this));
        ConfigParameters configParameters = this.get;
        Object[] objArr = new Object[1];
        a((short) Color.green(0), Color.green(0) + 894601508, 26356435 + (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) - 56, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), objArr);
        configParameters.addParam(((String) objArr[0]).intern(), str, str2);
        getParamValue = (onCompleted + 33) % 128;
        return this;
    }

    private <T> boolean get(T t) {
        int i = getParamValue;
        int i2 = i + 109;
        onCompleted = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (t != null) {
            return true;
        }
        onCompleted = (i + 7) % 128;
        return false;
    }

    private ConfigurationBuilder initialize(String str, String str2) {
        ConfigParameters configParameters;
        Object obj;
        int i = onCompleted + 103;
        getParamValue = i % 128;
        if (i % 2 != 0) {
            ThreeDS2Service(new Object[]{this, str}, 2135823784, -2135823784, System.identityHashCode(this));
            configParameters = this.get;
            Object[] objArr = new Object[1];
            b("錗\uee4a榖\ue4e6昽\ue184糵\ufe1b祿\uf48e瘏\uf14f䲋", 11910 - TextUtils.getTrimmedLength(""), objArr);
            obj = objArr[0];
        } else {
            ThreeDS2Service(new Object[]{this, str}, 2135823784, -2135823784, System.identityHashCode(this));
            configParameters = this.get;
            Object[] objArr2 = new Object[1];
            b("錗\uee4a榖\ue4e6昽\ue184糵\ufe1b祿\uf48e瘏\uf14f䲋", TextUtils.getTrimmedLength("") + 32077, objArr2);
            obj = objArr2[0];
        }
        configParameters.addParam(((String) obj).intern(), str, str2);
        getParamValue = (onCompleted + 15) % 128;
        return this;
    }

    private ConfigurationBuilder initialize(String str, List<String> list) {
        onCompleted = (getParamValue + 117) % 128;
        ThreeDS2Service(new Object[]{this, str}, 2135823784, -2135823784, System.identityHashCode(this));
        ConfigParameters configParameters = this.get;
        Object[] objArr = new Object[1];
        a((short) View.combineMeasuredStates(0, 0), 894601527 - ExpandableListView.getPackedPositionType(0L), TextUtils.lastIndexOf("", '0', 0) + 26356437, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 55, (byte) Drawable.resolveOpacity(0, 0), objArr);
        configParameters.addParam(((String) objArr[0]).intern(), str, oj.ThreeDS2Service(list, ","));
        int i = getParamValue + 67;
        onCompleted = i % 128;
        if (i % 2 != 0) {
            return this;
        }
        throw null;
    }
}
