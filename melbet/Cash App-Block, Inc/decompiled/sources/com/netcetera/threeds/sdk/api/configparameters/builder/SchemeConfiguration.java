package com.netcetera.threeds.sdk.api.configparameters.builder;

import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.recyclerview.widget.RecyclerView;
import com.netcetera.threeds.sdk.api.exceptions.InvalidInputException;
import com.netcetera.threeds.sdk.api.utils.DsRidValues;
import com.netcetera.threeds.sdk.infrastructure.ConfigParameters;
import com.netcetera.threeds.sdk.infrastructure.addParam;
import com.netcetera.threeds.sdk.infrastructure.na;
import com.netcetera.threeds.sdk.infrastructure.og;
import com.netcetera.threeds.sdk.infrastructure.oj;
import com.netcetera.threeds.sdk.infrastructure.op;
import com.netcetera.threeds.sdk.infrastructure.removeParam;
import com.plaid.internal.EnumC0170g;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.apache.commons.imaging.formats.pnm.PnmConstants;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.SubjectKeyIdentifier;

/* loaded from: classes5.dex */
public final class SchemeConfiguration {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int addParam = 0;
    private static int cleanup = 898634101;
    private static int getParamValue = 1;
    private static long getSDKInfo = -8880716800597159563L;
    private static char getSDKVersion = 23183;
    private final String ThreeDS2Service;
    private final List<String> ThreeDS2ServiceInitializationCallback;
    private final String ThreeDS2ServiceInstance;
    private final String createTransaction;
    private final String get;
    private final String getWarnings;
    private final String initialize;

    public SchemeConfiguration(String str, String str2, String str3, String str4, String str5, String str6, List<String> list) {
        this.get = str;
        this.initialize = str2;
        this.ThreeDS2ServiceInstance = str3;
        this.getWarnings = str4;
        this.ThreeDS2Service = str5;
        this.createTransaction = str6;
        this.ThreeDS2ServiceInitializationCallback = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(String str, int i, char c, String str2, String str3, Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        int i2;
        int i3;
        Object method;
        Integer num;
        int i4;
        Object obj;
        Integer num2;
        int i5;
        Object obj2;
        Object obj3;
        Integer num3 = 246986610;
        Integer num4 = -258783473;
        boolean z = true;
        int i6 = $10 + 1;
        $11 = i6 % 128;
        int i7 = 2;
        if (i6 % 2 == 0) {
            throw null;
        }
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        if (str2 != 0) {
            cArr = str2.toCharArray();
            $11 = ($10 + 17) % 128;
        } else {
            cArr = str2;
        }
        char[] cArr3 = cArr;
        if (str != null) {
            int i8 = $11 + 45;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            cArr2 = str.toCharArray();
        } else {
            cArr2 = str;
        }
        char[] cArr4 = cArr2;
        ConfigParameters configParameters = new ConfigParameters();
        int length = charArray.length;
        char[] cArr5 = new char[length];
        int length2 = cArr4.length;
        char[] cArr6 = new char[length2];
        int i9 = 0;
        System.arraycopy(charArray, 0, cArr5, 0, length);
        System.arraycopy(cArr4, 0, cArr6, 0, length2);
        cArr5[0] = (char) (cArr5[0] ^ c);
        cArr6[2] = (char) (cArr6[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr7 = new char[length3];
        configParameters.initialize = 0;
        while (configParameters.initialize < length3) {
            try {
                Object[] objArr2 = {configParameters};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj4 = map.get(num4);
                boolean z2 = z;
                int i10 = i7;
                if (obj4 != null) {
                    i3 = length3;
                    method = obj4;
                    i2 = i9;
                } else {
                    i2 = i9;
                    i3 = length3;
                    method = ((Class) removeParam.initialize(58 - TextUtils.indexOf("", ""), (char) (ViewConfiguration.getTapTimeout() >> 16), 6414 - View.MeasureSpec.getSize(i2))).getMethod("j", Object.class);
                    map.put(num4, method);
                }
                int intValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {configParameters};
                Object obj5 = map.get(num3);
                if (obj5 != null) {
                    num = num4;
                    i4 = intValue;
                    obj = obj5;
                } else {
                    int i11 = i2;
                    num = num4;
                    i4 = intValue;
                    Method method2 = ((Class) removeParam.initialize(63 - View.combineMeasuredStates(i11, i11), (char) (11345 - TextUtils.getCapsMode("", i11, i11)), View.resolveSize(i11, i11) + 8577)).getMethod("i", Object.class);
                    map.put(num3, method2);
                    obj = method2;
                }
                int intValue2 = ((Integer) ((Method) obj).invoke(null, objArr3)).intValue();
                int i12 = cArr5[configParameters.initialize % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i10] = Integer.valueOf(cArr6[i4]);
                objArr4[z2 ? 1 : 0] = Integer.valueOf(i12);
                objArr4[0] = configParameters;
                Object obj6 = map.get(828230935);
                Class cls = Integer.TYPE;
                if (obj6 != null) {
                    num2 = num3;
                    i5 = intValue2;
                    obj2 = obj6;
                } else {
                    num2 = num3;
                    i5 = intValue2;
                    Method method3 = ((Class) removeParam.initialize(75 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.getOffsetBefore("", 0) + 9820)).getMethod("o", Object.class, cls, cls);
                    map.put(828230935, method3);
                    obj2 = method3;
                }
                ((Method) obj2).invoke(null, objArr4);
                int i13 = cArr5[i5] * 32718;
                Object[] objArr5 = new Object[i10];
                objArr5[z2 ? 1 : 0] = Integer.valueOf(cArr6[i4]);
                objArr5[0] = Integer.valueOf(i13);
                Object obj7 = map.get(196637707);
                if (obj7 != null) {
                    obj3 = obj7;
                } else {
                    Method method4 = ((Class) removeParam.initialize(KeyEvent.normalizeMetaState(0) + 48, (char) ((Process.myTid() >> 22) + 63350), 11536 - TextUtils.getOffsetAfter("", 0))).getMethod("n", cls, cls);
                    map.put(196637707, method4);
                    obj3 = method4;
                }
                cArr6[i5] = ((Character) ((Method) obj3).invoke(null, objArr5)).charValue();
                cArr5[i5] = configParameters.get;
                int i14 = configParameters.initialize;
                cArr7[i14] = (char) ((((r2 ^ cArr3[i14]) ^ (getSDKInfo ^ (-8880716800597159563L))) ^ ((int) (cleanup ^ (-8880716800597159563L)))) ^ ((char) (getSDKVersion ^ (-8880716800597159563L))));
                configParameters.initialize = i14 + 1;
                length3 = i3;
                z = z2 ? 1 : 0;
                num4 = num;
                num3 = num2;
                i7 = 2;
                i9 = 0;
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

    public static Builder amexConfiguration() {
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (Color.blue(0) + 45101), "\u0cfa렿ᝮ䕓", "\uf6db뢉ⵢ䒰", objArr);
        Builder builder = new Builder(((String) objArr[0]).intern(), DsRidValues.AMEX, false);
        int i = addParam + 101;
        getParamValue = i % 128;
        if (i % 2 != 0) {
            return builder;
        }
        throw null;
    }

    public static Builder cbConfiguration() {
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", MotionEvent.axisFromString("") + 1999318831, (char) (2692 - Color.blue(0)), "\uddbe㡓뺾읩镁ꭜタ⧈ݩ滋Ꚅ釢눻蝝Ḕ", "⸱⬯葷鬊", objArr);
        Builder builder = new Builder(((String) objArr[0]).intern(), DsRidValues.CB, false);
        addParam = (getParamValue + 41) % 128;
        return builder;
    }

    public static Builder dinersSchemeConfiguration() {
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", ViewConfiguration.getTouchSlop() >> 8, (char) (5351 - TextUtils.lastIndexOf("", '0', 0)), "\uf76f랊蠈ᜓ绉쀍", "贃쫢\ue8e9渔", objArr);
        Builder builder = new Builder(((String) objArr[0]).intern(), DsRidValues.DINERS, false);
        getParamValue = (addParam + 79) % 128;
        return builder;
    }

    public static Builder eftposConfiguration() {
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", View.resolveSize(0, 0), (char) (38699 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), "벑\ue3cd⪭\udb63䋝碉", "菴고⨵⮗", objArr);
        Builder builder = new Builder(((String) objArr[0]).intern(), DsRidValues.EFTPOS, false);
        int i = addParam + 57;
        getParamValue = i % 128;
        if (i % 2 == 0) {
            int i2 = 8 / 0;
        }
        return builder;
    }

    public static Builder jcbConfiguration() {
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", (-1396982902) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (41826 - (ViewConfiguration.getTouchSlop() >> 8)), "潃ᓭ䬕", "誷뮻抬墣", objArr);
        Builder builder = new Builder(((String) objArr[0]).intern(), DsRidValues.JCB, false);
        addParam = (getParamValue + 119) % 128;
        return builder;
    }

    public static Builder mastercardSchemeConfiguration() {
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", (-1) - ExpandableListView.getPackedPositionChild(0L), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), "玦䶌ﲩ\uf765谾\uf8b2냭ਿ﷿輕", "⁻㓶\uea86螚", objArr);
        Builder builder = new Builder(((String) objArr[0]).intern(), DsRidValues.MASTERCARD, false);
        int i = getParamValue + 17;
        addParam = i % 128;
        if (i % 2 == 0) {
            return builder;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder newSchemeConfiguration(String str) {
        Builder builder = new Builder(str, null, true);
        getParamValue = (addParam + 35) % 128;
        return builder;
    }

    public static Builder unionSchemeConfiguration() {
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", 1713830253 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (TextUtils.indexOf("", "", 0) + 58567), "퓩⼏︹ઈ␔", "沏⛹읦\udbe4", objArr);
        Builder builder = new Builder(((String) objArr[0]).intern(), DsRidValues.UNION, false);
        int i = addParam + 73;
        getParamValue = i % 128;
        if (i % 2 != 0) {
            return builder;
        }
        throw null;
    }

    public static Builder visaSchemeConfiguration() {
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", 1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (33647 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "ᶩ嵅调눠", "ꓒ䐄炻箃", objArr);
        Builder builder = new Builder(((String) objArr[0]).intern(), DsRidValues.VISA, false);
        addParam = (getParamValue + 45) % 128;
        return builder;
    }

    public String getSchemeEncryptionPublicKey() {
        int i = getParamValue + 91;
        addParam = i % 128;
        int i2 = i % 2;
        String str = this.ThreeDS2Service;
        if (i2 != 0) {
            int i3 = 98 / 0;
        }
        return str;
    }

    public String getSchemeEncryptionPublicKeyId() {
        int i = (addParam + 19) % 128;
        getParamValue = i;
        String str = this.createTransaction;
        int i2 = i + 7;
        addParam = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public String getSchemeId() {
        int i = (addParam + 125) % 128;
        getParamValue = i;
        String str = this.initialize;
        addParam = (i + 75) % 128;
        return str;
    }

    public String getSchemeLogo() {
        int i = addParam;
        int i2 = i + 85;
        getParamValue = i2 % 128;
        int i3 = i2 % 2;
        String str = this.ThreeDS2ServiceInstance;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i + 117;
        getParamValue = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public String getSchemeLogoDark() {
        int i = (getParamValue + 113) % 128;
        addParam = i;
        String str = this.getWarnings;
        getParamValue = (i + 41) % 128;
        return str;
    }

    public String getSchemeName() {
        int i = (getParamValue + 57) % 128;
        addParam = i;
        String str = this.get;
        int i2 = i + 5;
        getParamValue = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public List<String> getSchemePublicRootKeys() {
        int i = (getParamValue + 91) % 128;
        addParam = i;
        List<String> list = this.ThreeDS2ServiceInitializationCallback;
        int i2 = i + 83;
        getParamValue = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 75 / 0;
        }
        return list;
    }

    public static final class Builder {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static int ConfigParameters;
        private static long getSDKInfo;
        private static int onError;
        private String ThreeDS2Service;
        private List<String> ThreeDS2ServiceInitializationCallback;
        private String ThreeDS2ServiceInstance;
        private final boolean cleanup;
        private final String createTransaction;
        private String get;
        private final String getSDKVersion;
        private List<String> getWarnings;
        private String initialize;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            ConfigParameters = 0;
            onError = 1;
            getSDKInfo = 7988836014124884576L;
        }

        private Builder(String str, String str2, boolean z) {
            this.getSDKVersion = str;
            this.createTransaction = str2;
            this.cleanup = z;
        }

        private String ThreeDS2Service(List<String> list) {
            ConfigParameters = (onError + 29) % 128;
            List<String> list2 = get(list);
            if (list2 != null && !list2.isEmpty()) {
                return oj.ThreeDS2Service(list2, ",");
            }
            String str = this.createTransaction;
            onError = (ConfigParameters + 35) % 128;
            return str;
        }

        private String ThreeDS2ServiceInstance(String str) {
            try {
                List list = (List) getWarnings(new Object[]{this, new ByteArrayInputStream(op.getWarnings(str))}, -49956947, 49956947, System.identityHashCode(this));
                if (!list.isEmpty()) {
                    ConfigParameters = (onError + 47) % 128;
                    byte[] keyIdentifier = getWarnings((X509Certificate) list.get(0)).getKeyIdentifier();
                    return (String) na.getWarnings(new Object[]{Arrays.copyOfRange(keyIdentifier, 2, keyIdentifier.length)}, -484336132, 484336132, (int) System.currentTimeMillis());
                }
                int i = onError + 7;
                ConfigParameters = i % 128;
                if (i % 2 == 0) {
                    return "";
                }
                throw null;
            } catch (NullPointerException | CertificateException unused) {
                return "";
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x01b2  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x01b3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(String str, int i, Object[] objArr) {
            char[] cArr;
            Throwable cause;
            short s;
            int i2 = $10;
            $11 = (i2 + 57) % 128;
            if (str != null) {
                $11 = (i2 + 37) % 128;
                cArr = str.toCharArray();
            } else {
                cArr = str;
            }
            char[] cArr2 = cArr;
            addParam addparam = new addParam();
            addparam.initialize = i;
            int length = cArr2.length;
            long[] jArr = new long[length];
            short s2 = 0;
            addparam.ThreeDS2Service = 0;
            while (true) {
                int i3 = addparam.ThreeDS2Service;
                if (i3 >= cArr2.length) {
                    break;
                }
                char c = cArr2[i3];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[2] = addparam;
                    objArr2[1] = addparam;
                    objArr2[s2] = Integer.valueOf(c);
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-983980093);
                    if (obj != null) {
                        s = s2;
                    } else {
                        s = s2;
                        Method method = ((Class) removeParam.initialize(66 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.getTrimmedLength("") + 12511)).getMethod("e", Integer.TYPE, Object.class, Object.class);
                        map.put(-983980093, method);
                        obj = method;
                    }
                    jArr[i3] = ((Long) ((Method) obj).invoke(null, objArr2)).longValue() ^ (getSDKInfo ^ 6009743645011411028L);
                    Object[] objArr3 = new Object[2];
                    objArr3[1] = addparam;
                    objArr3[s] = addparam;
                    Object obj2 = map.get(-1840119381);
                    if (obj2 == null) {
                        Class cls = (Class) removeParam.initialize(ImageFormat.getBitsPerPixel(s) + 77, (char) (62097 - (ViewConfiguration.getTouchSlop() >> 8)), 2102 - Color.alpha((int) s));
                        Object[] objArr4 = new Object[1];
                        short s3 = s;
                        b(s3, (short) -1, s3, objArr4);
                        obj2 = cls.getMethod((String) objArr4[s3], Object.class, Object.class);
                        map.put(-1840119381, obj2);
                    }
                    ((Method) obj2).invoke(null, objArr3);
                    s2 = 0;
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
            char[] cArr3 = new char[length];
            addparam.ThreeDS2Service = 0;
            while (true) {
                int i4 = addparam.ThreeDS2Service;
                if (i4 >= cArr2.length) {
                    objArr[0] = new String(cArr3);
                    return;
                }
                int i5 = $11 + 63;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    cArr3[i4] = (char) jArr[i4];
                    Object[] objArr5 = {addparam, addparam};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map2.get(-1840119381);
                    if (obj3 == null) {
                        Class cls2 = (Class) removeParam.initialize(((byte) KeyEvent.getModifierMetaStateMask()) + 77, (char) (KeyEvent.keyCodeFromString("") + 62097), ((byte) KeyEvent.getModifierMetaStateMask()) + PnmConstants.PAM_RAW_CODE);
                        Object[] objArr6 = new Object[1];
                        b(0, (short) -1, (short) 0, objArr6);
                        obj3 = cls2.getMethod((String) objArr6[0], Object.class, Object.class);
                        map2.put(-1840119381, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr5);
                    int i6 = 17 / 0;
                } else {
                    cArr3[i4] = (char) jArr[i4];
                    Object[] objArr7 = {addparam, addparam};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map3.get(-1840119381);
                    if (obj4 == null) {
                        Class cls3 = (Class) removeParam.initialize(TextUtils.lastIndexOf("", '0', 0, 0) + 77, (char) (62097 - Color.red(0)), 2102 - (Process.myPid() >> 22));
                        Object[] objArr8 = new Object[1];
                        b(0, (short) -1, (short) 0, objArr8);
                        obj4 = cls3.getMethod((String) objArr8[0], Object.class, Object.class);
                        map3.put(-1840119381, obj4);
                    }
                    ((Method) obj4).invoke(null, objArr7);
                }
            }
        }

        private static void b(int i, short s, short s2, Object[] objArr) {
            int i2 = s2 * 4;
            byte[] bArr = $$a;
            int i3 = (i * 4) + 99;
            int i4 = s + 4;
            byte[] bArr2 = new byte[i2 + 1];
            int i5 = -1;
            if (bArr == null) {
                i3 += i4;
                i4 = i4;
                bArr = bArr;
                i5 = -1;
            }
            while (true) {
                int i6 = i5 + 1;
                int i7 = i4 + 1;
                bArr2[i6] = (byte) i3;
                if (i6 == i2) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                byte[] bArr3 = bArr;
                i3 = bArr[i7] + i3;
                i4 = i7;
                bArr = bArr3;
                i5 = i6;
            }
        }

        private String b_(AssetManager assetManager, String str) {
            onError = (ConfigParameters + 7) % 128;
            List<? extends Certificate> d_ = d_(assetManager, str);
            try {
                String initialize = op.initialize(d_.get(0).getEncoded());
                onError = (ConfigParameters + 71) % 128;
                return initialize;
            } catch (CertificateEncodingException unused) {
                return op.initialize(d_.get(0).getPublicKey().getEncoded());
            }
        }

        private String c_(AssetManager assetManager, String str) {
            ConfigParameters = (onError + 41) % 128;
            List<? extends Certificate> d_ = d_(assetManager, str);
            try {
                String initialize = op.initialize(d_.get(d_.size() - 1).getEncoded());
                ConfigParameters = (onError + 55) % 128;
                return initialize;
            } catch (CertificateEncodingException unused) {
                return op.initialize(d_.get(d_.size() - 1).getPublicKey().getEncoded());
            }
        }

        private List<? extends Certificate> d_(AssetManager assetManager, String str) {
            onError = (ConfigParameters + 69) % 128;
            try {
                List<? extends Certificate> list = (List) getWarnings(new Object[]{this, assetManager.open(str)}, -49956947, 49956947, System.identityHashCode(this));
                int i = onError + 7;
                ConfigParameters = i % 128;
                if (i % 2 == 0) {
                    return list;
                }
                throw null;
            } catch (IOException | CertificateException e) {
                throw new InvalidInputException(Recorder$$ExternalSyntheticOutline2.m("Failed to get public key configuration from certificate", str), e);
            }
        }

        private List<String> get(List<String> list) {
            onError = (ConfigParameters + 77) % 128;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (!oj.get(str)) {
                    arrayList.add(str);
                }
                onError = (ConfigParameters + 7) % 128;
            }
            return arrayList;
        }

        private SubjectKeyIdentifier getWarnings(X509Certificate x509Certificate) {
            int i = onError + 89;
            ConfigParameters = i % 128;
            if (i % 2 == 0) {
                return SubjectKeyIdentifier.getInstance(ASN1OctetString.getInstance(x509Certificate.getExtensionValue(Extension.subjectKeyIdentifier.getId())));
            }
            SubjectKeyIdentifier subjectKeyIdentifier = SubjectKeyIdentifier.getInstance(ASN1OctetString.getInstance(x509Certificate.getExtensionValue(Extension.subjectKeyIdentifier.getId())));
            int i2 = 80 / 0;
            return subjectKeyIdentifier;
        }

        public static void init$0() {
            $$a = new byte[]{5, -44, -115, -23};
            $$b = 97;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
        
            if (r10.cleanup != false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
        
            if (r10.cleanup != false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
        
            r1 = r10.getSDKVersion;
            r5 = new java.lang.Object[1];
            a("\ue247畲찖✾뻍ᇨ梤쁖孱눜", 38693 - android.graphics.Color.green(0), r5);
            com.netcetera.threeds.sdk.infrastructure.ng.get(r1, ((java.lang.String) r5[0]).intern());
            r3 = new java.lang.Object[1];
            a("\ue247᭠ဲ৴څ㱂㔷㋑⯿", android.text.TextUtils.getOffsetAfter("", 0) + 63799, r3);
            com.netcetera.threeds.sdk.infrastructure.ng.get(r0, ((java.lang.String) r3[0]).intern());
            com.netcetera.threeds.sdk.infrastructure.ng.get(r10.initialize, "schemeLogo");
            com.netcetera.threeds.sdk.infrastructure.ng.get(r10.ThreeDS2ServiceInstance, "schemeEncryptionPublicKey");
            com.netcetera.threeds.sdk.infrastructure.ng.get(r10.ThreeDS2ServiceInitializationCallback, "schemePublicRootKey");
            com.netcetera.threeds.sdk.api.configparameters.builder.SchemeConfiguration.Builder.ConfigParameters = (com.netcetera.threeds.sdk.api.configparameters.builder.SchemeConfiguration.Builder.onError + 121) % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public SchemeConfiguration build() {
            String ThreeDS2Service;
            int i = ConfigParameters + 51;
            onError = i % 128;
            int i2 = i % 2;
            List<String> list = this.getWarnings;
            if (i2 == 0) {
                ThreeDS2Service = ThreeDS2Service(list);
                int i3 = 80 / 0;
            } else {
                ThreeDS2Service = ThreeDS2Service(list);
            }
            return new SchemeConfiguration(this.getSDKVersion, ThreeDS2Service, this.initialize, this.ThreeDS2Service, this.ThreeDS2ServiceInstance, this.get, this.ThreeDS2ServiceInitializationCallback);
        }

        public Builder encryptionPublicKey(String str) {
            int i = ConfigParameters + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            onError = i % 128;
            if (i % 2 == 0) {
                this.ThreeDS2ServiceInstance = str;
                this.get = ThreeDS2ServiceInstance(str);
                int i2 = 38 / 0;
            } else {
                this.ThreeDS2ServiceInstance = str;
                this.get = ThreeDS2ServiceInstance(str);
            }
            int i3 = onError + 77;
            ConfigParameters = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 56 / 0;
            }
            return this;
        }

        public Builder encryptionPublicKeyFromAssetCertificate(AssetManager assetManager, String str) {
            ConfigParameters = (onError + 55) % 128;
            String b_ = b_(assetManager, str);
            this.ThreeDS2ServiceInstance = b_;
            this.get = ThreeDS2ServiceInstance(b_);
            int i = onError + 99;
            ConfigParameters = i % 128;
            if (i % 2 != 0) {
                int i2 = 0 / 0;
            }
            return this;
        }

        public Builder ids(List<String> list) {
            int i = onError + 19;
            int i2 = i % 128;
            ConfigParameters = i2;
            if (i % 2 != 0) {
                this.getWarnings = list;
                throw null;
            }
            this.getWarnings = list;
            int i3 = i2 + 37;
            onError = i3 % 128;
            if (i3 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public Builder logo(String str) {
            int i = onError;
            this.initialize = str;
            int i2 = i + 103;
            ConfigParameters = i2 % 128;
            if (i2 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public Builder logoDark(String str) {
            int i = onError;
            this.ThreeDS2Service = str;
            int i2 = i + 47;
            ConfigParameters = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 9 / 0;
            }
            return this;
        }

        public Builder rootPublicKey(String... strArr) {
            ConfigParameters = (onError + 79) % 128;
            this.ThreeDS2ServiceInitializationCallback = Arrays.asList(strArr);
            onError = (ConfigParameters + 77) % 128;
            return this;
        }

        public Builder rootPublicKeyFromAssetCertificate(AssetManager assetManager, String... strArr) {
            int length = strArr.length;
            onError = (ConfigParameters + 49) % 128;
            int i = 0;
            while (i < length) {
                String str = strArr[i];
                List<String> list = (List) og.ThreeDS2Service(this.ThreeDS2ServiceInitializationCallback, new ArrayList());
                this.ThreeDS2ServiceInitializationCallback = list;
                list.add(c_(assetManager, str));
                i++;
                ConfigParameters = (onError + 23) % 128;
            }
            return this;
        }

        public Builder encryptionPublicKeyFromAssetCertificate(AssetManager assetManager, String str, String str2) {
            ConfigParameters = (onError + 85) % 128;
            this.ThreeDS2ServiceInstance = b_(assetManager, str);
            this.get = str2;
            int i = ConfigParameters + 17;
            onError = i % 128;
            if (i % 2 == 0) {
                int i2 = 91 / 0;
            }
            return this;
        }

        public Builder encryptionPublicKey(String str, String str2) {
            int i = onError;
            this.ThreeDS2ServiceInstance = str;
            this.get = str2;
            int i2 = i + 71;
            ConfigParameters = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 9 / 0;
            }
            return this;
        }

        public static /* synthetic */ Object getWarnings(Object[] objArr, int i, int i2, int i3) {
            return ThreeDS2ServiceInstance(objArr);
        }

        private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
            ArrayList arrayList = new ArrayList(CertificateFactory.getInstance("X.509").generateCertificates((InputStream) objArr[1]));
            int i = onError + 107;
            ConfigParameters = i % 128;
            if (i % 2 == 0) {
                return arrayList;
            }
            throw null;
        }
    }
}
