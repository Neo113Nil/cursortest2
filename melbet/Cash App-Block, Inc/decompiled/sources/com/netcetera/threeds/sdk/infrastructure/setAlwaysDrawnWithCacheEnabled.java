package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.api.info.CertificateInfo;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes5.dex */
public class setAlwaysDrawnWithCacheEnabled implements CertificateInfo {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int ConfigParameters;
    private static int ThreeDS2Service;
    private static char ThreeDS2ServiceInitializationCallback;
    private static int ThreeDS2ServiceInstance;
    private static int cleanup;
    private static long createTransaction;
    private static byte[] get;
    private static short[] getSDKInfo;
    private static int getSDKVersion;
    private static int getWarnings;
    private final X509Certificate initialize;

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        cleanup = 0;
        ConfigParameters = 1;
        ThreeDS2ServiceInstance = -1416150855;
        getWarnings = -1686431654;
        ThreeDS2Service = -652900825;
        get = new byte[]{-48, 124, 44, -113, 44, 113, -127, 73, 77, 105, -59, -22, 11, -27, 57, 60, -92, -29, -30, -27, 22, -18, PnmConstants.PGM_RAW_CODE, 28, -9, 19, 15, -48, -29, -30, -27, 22, -18, PnmConstants.PGM_RAW_CODE, 28, -10, 59, -63, -26, 0, -30, -41, 98, 115, 107, 120, 98, -103, 77, 115, 107, 123, 109, 119, 102, 81, 100, 115, -44, -56, -4, -13, -39, -50, -58, -42, -8, -62, -15, -84, -1, -50, -57, 57, 10, 2, 31, 57, 48, -28, 10, 2, 18, 4, 14, 61, 46, -51, 9, 78, -42, 2, 5, 29, 2, 11, 56, 81, -58, 23, 22, 9, 58, 18, 57, -44, -10, -59, 18, -47, -5, -13, -61, -11, -1, -18, -39, -20, -5, -48, 40, 13, 7, 59, 45, 13, PnmConstants.PBM_TEXT_CODE, 56, 0, -55, 37, 71, 82, 94, 87, 81, 89, 86, 65, 118, PnmConstants.PGM_TEXT_CODE, 37, 71, 35, 65, 91, 77, 82, -8, 124, -98, 105, 117, 110, 104, 112, 109, -104, -115, 101, 100, 118, 72, -123, PnmConstants.PGM_RAW_CODE, 109, -104, 109, -80, 48, 96, 102, 114, 104, -99, 105, 125, -96, 88, 70, -112, 114};
        createTransaction = -8880716800597159563L;
        getSDKVersion = 253548813;
        ThreeDS2ServiceInitializationCallback = (char) 4469;
    }

    public setAlwaysDrawnWithCacheEnabled(X509Certificate x509Certificate) {
        this.initialize = x509Certificate;
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] ThreeDS2ServiceInstance(android.content.Context r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 1999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setAlwaysDrawnWithCacheEnabled.ThreeDS2ServiceInstance(android.content.Context, int, int):java.lang.Object[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x01c2, code lost:
    
        if (r24 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d6, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01d4, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01d2, code lost:
    
        if (r24 != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, byte b, short s, int i2, int i3, Object[] objArr) {
        boolean z;
        int i4;
        int i5;
        int i6;
        byte[] bArr;
        boolean z2;
        Object method;
        getSDKVersion getsdkversion = new getSDKVersion();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(getWarnings)};
            Map map = removeParam.visaSchemeConfiguration;
            Object obj = map.get(981393365);
            Class cls = Integer.TYPE;
            if (obj == null) {
                Class cls2 = (Class) removeParam.initialize((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 62, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 654 - View.MeasureSpec.getMode(0));
                Object[] objArr3 = new Object[1];
                d(0, 0, 2, objArr3);
                obj = cls2.getMethod((String) objArr3[0], cls, cls);
                map.put(981393365, obj);
            }
            int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
            boolean z3 = intValue == -1;
            if (z3) {
                byte[] bArr2 = get;
                if (bArr2 != null) {
                    $10 = ($11 + 67) % 128;
                    int length = bArr2.length;
                    byte[] bArr3 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        Object[] objArr4 = {Integer.valueOf(bArr2[i7])};
                        Map map2 = removeParam.visaSchemeConfiguration;
                        Object obj2 = map2.get(-1684720202);
                        if (obj2 != null) {
                            i6 = i7;
                            z2 = z3;
                            method = obj2;
                            bArr = bArr2;
                        } else {
                            i6 = i7;
                            bArr = bArr2;
                            z2 = z3;
                            Class cls3 = (Class) removeParam.initialize((ViewConfiguration.getPressedStateDuration() >> 16) + 59, (char) (ViewConfiguration.getPressedStateDuration() >> 16), 3162 - View.MeasureSpec.makeMeasureSpec(0, 0));
                            Object[] objArr5 = new Object[1];
                            d(0, 0, 0, objArr5);
                            method = cls3.getMethod((String) objArr5[0], cls);
                            map2.put(-1684720202, method);
                        }
                        bArr3[i6] = ((Byte) ((Method) method).invoke(null, objArr4)).byteValue();
                        i7 = i6 + 1;
                        bArr2 = bArr;
                        z3 = z2;
                    }
                    bArr2 = bArr3;
                }
                z = z3;
                if (bArr2 != null) {
                    byte[] bArr4 = get;
                    Object[] objArr6 = {Integer.valueOf(i2), Integer.valueOf(ThreeDS2ServiceInstance)};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(981393365);
                    if (obj3 == null) {
                        Class cls4 = (Class) removeParam.initialize(62 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), ExpandableListView.getPackedPositionChild(0L) + 655);
                        Object[] objArr7 = new Object[1];
                        d(0, 0, 2, objArr7);
                        obj3 = cls4.getMethod((String) objArr7[0], cls, cls);
                        map3.put(981393365, obj3);
                    }
                    intValue = (byte) (((byte) (bArr4[((Integer) ((Method) obj3).invoke(null, objArr6)).intValue()] ^ 2786809877878216728L)) + ((int) (getWarnings ^ 2786809877878216728L)));
                } else {
                    intValue = (short) (((short) (getSDKInfo[i2 + ((int) (ThreeDS2ServiceInstance ^ 2786809877878216728L))] ^ 2786809877878216728L)) + ((int) (getWarnings ^ 2786809877878216728L)));
                }
            } else {
                z = z3;
            }
            if (intValue > 0) {
                int i8 = $11 + 27;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    i4 = ((i2 + intValue) >>> 3) - ((int) (ThreeDS2ServiceInstance / 2786809877878216728L));
                } else {
                    i4 = ((i2 + intValue) - 2) + ((int) (ThreeDS2ServiceInstance ^ 2786809877878216728L));
                }
                getsdkversion.ThreeDS2ServiceInstance = i4 + i5;
                Object[] objArr8 = {getsdkversion, Integer.valueOf(i), Integer.valueOf(ThreeDS2Service), sb};
                Map map4 = removeParam.visaSchemeConfiguration;
                Object obj4 = map4.get(-1855485602);
                if (obj4 == null) {
                    Class cls5 = (Class) removeParam.initialize(TextUtils.lastIndexOf("", '0', 0, 0) + 55, (char) (13764 - (ViewConfiguration.getPressedStateDuration() >> 16)), 2802 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                    Object[] objArr9 = new Object[1];
                    d(0, 0, 1, objArr9);
                    obj4 = cls5.getMethod((String) objArr9[0], Object.class, cls, cls, Object.class);
                    map4.put(-1855485602, obj4);
                }
                ((StringBuilder) ((Method) obj4).invoke(null, objArr8)).append(getsdkversion.ThreeDS2Service);
                getsdkversion.getWarnings = getsdkversion.ThreeDS2Service;
                byte[] bArr5 = get;
                if (bArr5 != null) {
                    $11 = ($10 + 87) % 128;
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i9 = 0; i9 < length2; i9++) {
                        bArr6[i9] = (byte) (bArr5[i9] ^ 2786809877878216728L);
                    }
                    $11 = ($10 + 65) % 128;
                    bArr5 = bArr6;
                }
                boolean z4 = bArr5 != null;
                getsdkversion.initialize = 1;
                while (getsdkversion.initialize < intValue) {
                    int i10 = getsdkversion.ThreeDS2ServiceInstance;
                    if (z4) {
                        byte[] bArr7 = get;
                        getsdkversion.ThreeDS2ServiceInstance = i10 - 1;
                        getsdkversion.ThreeDS2Service = (char) (getsdkversion.getWarnings + (((byte) (((byte) (bArr7[i10] ^ 2786809877878216728L)) + s)) ^ b));
                    } else {
                        short[] sArr = getSDKInfo;
                        getsdkversion.ThreeDS2ServiceInstance = i10 - 1;
                        getsdkversion.ThreeDS2Service = (char) (getsdkversion.getWarnings + (((short) (((short) (sArr[i10] ^ 2786809877878216728L)) + s)) ^ b));
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

    /* JADX WARN: Multi-variable type inference failed */
    private static void b(char c, String str, String str2, String str3, int i, Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        int i2;
        Integer num;
        int i3;
        int i4;
        int i5;
        Integer num2 = 246986610;
        Integer num3 = -258783473;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        int i6 = 2;
        if (str2 != null) {
            int i7 = $10 + 13;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                str2.toCharArray();
                throw null;
            }
            cArr = str2.toCharArray();
        } else {
            cArr = str2;
        }
        char[] cArr3 = cArr;
        if (str != 0) {
            int i8 = $11 + 51;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            cArr2 = str.toCharArray();
        } else {
            cArr2 = str;
        }
        ConfigParameters configParameters = new ConfigParameters();
        int length = charArray.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        int i9 = 0;
        System.arraycopy(charArray, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        configParameters.initialize = 0;
        while (configParameters.initialize < length3) {
            try {
                Object[] objArr2 = {configParameters};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(num3);
                int i10 = i6;
                if (obj != null) {
                    i2 = i9;
                } else {
                    i2 = i9;
                    obj = ((Class) removeParam.initialize(Gravity.getAbsoluteGravity(i9, i9) + 58, (char) ((-1) - ImageFormat.getBitsPerPixel(i9)), 6414 - Color.alpha(i2))).getMethod("j", Object.class);
                    map.put(num3, obj);
                }
                int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {configParameters};
                Object obj2 = map.get(num2);
                if (obj2 != null) {
                    num = num3;
                } else {
                    num = num3;
                    obj2 = ((Class) removeParam.initialize(64 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (11345 - Color.blue(i2)), 8578 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).getMethod("i", Object.class);
                    map.put(num2, obj2);
                }
                int intValue2 = ((Integer) ((Method) obj2).invoke(null, objArr3)).intValue();
                int i11 = cArr4[configParameters.initialize % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i10] = Integer.valueOf(cArr5[intValue]);
                objArr4[1] = Integer.valueOf(i11);
                objArr4[i2] = configParameters;
                Object obj3 = map.get(828230935);
                Class cls = Integer.TYPE;
                Integer num4 = num2;
                if (obj3 != null) {
                    i3 = intValue2;
                    i4 = length3;
                    i5 = intValue;
                } else {
                    i3 = intValue2;
                    i4 = length3;
                    i5 = intValue;
                    obj3 = ((Class) removeParam.initialize(73 - ImageFormat.getBitsPerPixel(i2), (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 9819 - TextUtils.lastIndexOf("", '0', i2))).getMethod("o", Object.class, cls, cls);
                    map.put(828230935, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
                int i12 = cArr4[i3] * 32718;
                Object[] objArr5 = new Object[i10];
                objArr5[1] = Integer.valueOf(cArr5[i5]);
                objArr5[0] = Integer.valueOf(i12);
                Object obj4 = map.get(196637707);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize(Gravity.getAbsoluteGravity(0, 0) + 48, (char) (63350 - (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1))), (Process.myPid() >> 22) + 11536)).getMethod("n", cls, cls);
                    map.put(196637707, obj4);
                }
                cArr5[i3] = ((Character) ((Method) obj4).invoke(null, objArr5)).charValue();
                cArr4[i3] = configParameters.get;
                int i13 = configParameters.initialize;
                cArr6[i13] = (char) ((((int) (getSDKVersion ^ (-8880716800597159563L))) ^ ((r2 ^ r8[i13]) ^ (createTransaction ^ (-8880716800597159563L)))) ^ ((char) (ThreeDS2ServiceInitializationCallback ^ (-8880716800597159563L))));
                configParameters.initialize = i13 + 1;
                num2 = num4;
                length3 = i4;
                num3 = num;
                i6 = 2;
                i9 = 0;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, short s, int i, Object[] objArr) {
        int i2;
        int i3;
        int i4 = 3 - (i * 2);
        int i5 = 84 - (b * 2);
        byte[] bArr = $$a;
        int i6 = 23 - (s * 4);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i5;
            i5 = i6;
            i3 = 0;
            i5 = i5 + i7 + 2;
            i2 = i3;
            i3 = i2 + 1;
            i4++;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i7 = bArr[i4];
            i5 = i5 + i7 + 2;
            i2 = i3;
            i3 = i2 + 1;
            i4++;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            i4++;
            bArr2[i2] = (byte) i5;
            if (i3 == i6) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, int i2, int i3, Object[] objArr) {
        int i4;
        byte[] bArr = $$d;
        int i5 = i2 * 4;
        int i6 = i3 + 102;
        int i7 = (i * 4) + 4;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i8 = i7;
            i6 = i5;
            int i9 = 0;
            i7++;
            i6 += -i8;
            i4 = i9;
            bArr2[i4] = (byte) i6;
            i9 = i4 + 1;
            if (i4 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i8 = bArr[i7];
            i7++;
            i6 += -i8;
            i4 = i9;
            bArr2[i4] = (byte) i6;
            i9 = i4 + 1;
            if (i4 == i5) {
            }
        } else {
            i4 = 0;
            bArr2[i4] = (byte) i6;
            i9 = i4 + 1;
            if (i4 == i5) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{67, -6, 94, 34, 18, 8, -15, -2, -35, 13, -35, 31, 16, 11, 2, -15, -8, 0, -30, 35, 3, -1, -21, 11, -13, 0};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE;
    }

    public static void init$1() {
        $$d = new byte[]{PnmConstants.PPM_RAW_CODE, 9, 122, 120};
        $$e = EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE;
    }

    @Override // com.netcetera.threeds.sdk.api.info.CertificateInfo
    public String getCertPrefix() {
        int i = ConfigParameters + 65;
        cleanup = i % 128;
        int i2 = i % 2;
        X509Certificate x509Certificate = this.initialize;
        try {
            String warnings = i2 != 0 ? oj.getWarnings(op.initialize(x509Certificate.getEncoded()), 15) : oj.getWarnings(op.initialize(x509Certificate.getEncoded()), 50);
            cleanup = (ConfigParameters + 45) % 128;
            return warnings;
        } catch (CertificateEncodingException unused) {
            Object[] objArr = new Object[1];
            b((char) (63723 - TextUtils.indexOf((CharSequence) "", '0')), "ψ蒥傌", "\u0000\u0000\u0000\u0000", "⡺娡\uecea瓸", (-363192024) - Color.alpha(0), objArr);
            return ((String) objArr[0]).intern();
        }
    }

    @Override // com.netcetera.threeds.sdk.api.info.CertificateInfo
    public Date getExpiryDate() {
        int i = ConfigParameters + 93;
        cleanup = i % 128;
        int i2 = i % 2;
        X509Certificate x509Certificate = this.initialize;
        if (i2 == 0) {
            return x509Certificate.getNotAfter();
        }
        x509Certificate.getNotAfter();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.api.info.CertificateInfo
    public String getName() {
        cleanup = (ConfigParameters + 59) % 128;
        Object[] objArr = new Object[1];
        a((-1114545660) - (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) (Process.myTid() >> 22), (short) (Color.red(0) - 102), TextUtils.getOffsetAfter("", 0) - 820795553, (-68) - TextUtils.lastIndexOf("", '0', 0), objArr);
        Matcher matcher = Pattern.compile(((String) objArr[0]).intern()).matcher(this.initialize.getSubjectX500Principal().getName());
        if (!matcher.find()) {
            Object[] objArr2 = new Object[1];
            b((char) ((KeyEvent.getMaxKeyCode() >> 16) + 63724), "ψ蒥傌", "\u0000\u0000\u0000\u0000", "⡺娡\uecea瓸", (-363192024) - KeyEvent.normalizeMetaState(0), objArr2);
            return ((String) objArr2[0]).intern();
        }
        String group = matcher.group(1);
        int i = ConfigParameters + 65;
        cleanup = i % 128;
        if (i % 2 != 0) {
            int i2 = 18 / 0;
        }
        return group;
    }

    @Override // com.netcetera.threeds.sdk.api.info.CertificateInfo
    public CertificateInfo.CertificateType getType() {
        cleanup = (ConfigParameters + 81) % 128;
        CertificateInfo.CertificateType certificateType = CertificateInfo.CertificateType.CERTIFICATE;
        int i = cleanup + 13;
        ConfigParameters = i % 128;
        if (i % 2 != 0) {
            return certificateType;
        }
        throw null;
    }
}
