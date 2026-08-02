package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public final class getClass {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    public static final String CertificateInfo;
    public static final String CertificateInfoCertificateType;
    public static final String ConfigParameters;
    public static final String ConfigurationBuilder;
    public static final String InvalidInputException;
    public static final String SDKAlreadyInitializedException;
    private static char[] SDKInfo;
    public static final String SDKNotInitializedException;
    public static final String SDKRuntimeException;
    public static final String SchemeConfiguration;
    public static final String SchemeConfigurationBuilder;
    private static boolean SchemeInfo;
    public static final String ThreeDS2Service;
    public static final String ThreeDS2ServiceInitializationCallback;
    public static final String ThreeDS2ServiceInstance;
    public static final String addParam;
    public static final String amexConfiguration;
    public static final String apiKey;
    public static final String build;
    public static final String cbConfiguration;
    public static final String cleanup;
    public static final String configureScheme;
    public static final String createTransaction;
    public static final String dinersSchemeConfiguration;
    public static final String eftposConfiguration;
    public static final String encryptionPublicKey;
    public static final String encryptionPublicKeyFromAssetCertificate;
    public static final String get;
    private static long getCertPrefix;
    public static final String getErrorCode;
    public static final String getExpiryDate;
    private static int getIds;
    private static int getLicenseExpiryDate;
    public static final String getName;
    public static final String getParamValue;
    public static String getSDKInfo;
    public static final String getSDKVersion;
    private static boolean getSchemeConfigurations;
    public static final String getSchemeEncryptionPublicKey;
    public static final String getSchemeEncryptionPublicKeyId;
    public static final String getSchemeId;
    public static final String getSchemeLogo;
    public static final String getSchemeLogoDark;
    public static final String getSchemeName;
    public static final String getSchemePublicRootKeys;
    private static int getSupportedProtocolVersions;
    public static final String getType;
    public static final String getWarnings;
    public static final String ids;
    public static final String initialize;
    public static final String jcbConfiguration;
    public static final String logo;
    public static final String logoDark;
    public static final String mastercardSchemeConfiguration;
    public static final String newSchemeConfiguration;
    public static final String onCompleted;
    public static final String onError;
    public static final String removeParam;
    public static final String restrictedParameters;
    public static final String rootPublicKey;
    public static final String rootPublicKeyFromAssetCertificate;
    public static final String toString;
    public static final String unionSchemeConfiguration;
    public static final String valueOf;
    public static final String values;
    public static final String visaSchemeConfiguration;

    public static final class ThreeDS2ServiceInstance {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static char ConfigParameters;
        public static final String ThreeDS2Service;
        public static final String ThreeDS2ServiceInitializationCallback;
        public static final String ThreeDS2ServiceInstance;
        private static char addParam;
        private static int apiKey;
        public static final String cleanup;
        private static int configureScheme;
        public static String createTransaction;
        public static final String get;
        private static char getParamValue;
        public static final String getSDKInfo;
        public static final String getSDKVersion;
        public static final String getWarnings;
        public static final String initialize;
        private static char onCompleted;
        private static int[] onError;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            configureScheme = 0;
            apiKey = 1;
            ThreeDS2Service();
            Object[] objArr = new Object[1];
            a(new int[]{-247962403, 2096598997, -2102831858, 1076535165, 216320857, 1819599027, 1807315304, 326971580}, 16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
            getSDKVersion = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a(new int[]{-1416500543, -789734941, -852721282, 1755955554}, '7' - AndroidCharacter.getMirror('0'), objArr2);
            cleanup = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            b("通Ꝏ㋢먐\ue7cf䰝ᅁ緁⟀檝\ud81f횹\ude2a橎랮ㄦ\ue44e茐䪢ꯌ\r扣Ⱄ컾쓴\uf41c", AndroidCharacter.getMirror('0') - 23, objArr3);
            getSDKInfo = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b("\u20cb᷃䳪쇠⚶ꝣ쒊쎵뫃\uef28\ue549鈽", (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 10, objArr4);
            ThreeDS2ServiceInitializationCallback = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            b("\u20cb᷃뙘\uf4e9⟯≯饣ᴥ訇㻝", 9 - (ViewConfiguration.getTapTimeout() >> 16), objArr5);
            initialize = ((String) objArr5[0]).intern();
            Object[] objArr6 = new Object[1];
            b("\u20cb᷃뙘\uf4e9⟯≯饣ᴥ᭲㼶팳筞", 12 - Color.alpha(0), objArr6);
            getWarnings = ((String) objArr6[0]).intern();
            Object[] objArr7 = new Object[1];
            a(new int[]{-686537262, -454653867, 173504159, 1191519757, -1125700667, 184328281}, Process.getGidForName("") + 13, objArr7);
            ThreeDS2Service = ((String) objArr7[0]).intern();
            Object[] objArr8 = new Object[1];
            a(new int[]{-686537262, -454653867, 1191421750, 709067644, -1655290182, -2065434179}, 10 - TextUtils.lastIndexOf("", '0', 0), objArr8);
            get = ((String) objArr8[0]).intern();
            Object[] objArr9 = new Object[1];
            b("通Ꝏ㋢먐\ue7cf䰝ᅁ緁⟀檝\ud81f횹军녬", Color.argb(0, 0, 0, 0) + 13, objArr9);
            ThreeDS2ServiceInstance = ((String) objArr9[0]).intern();
            Object[] objArr10 = new Object[1];
            a(new int[]{493782233, -1218088255, 13250282, 1334854826}, TextUtils.indexOf("", "", 0, 0) + 7, objArr10);
            createTransaction = ((String) objArr10[0]).intern();
            int i = configureScheme + 35;
            apiKey = i % 128;
            if (i % 2 == 0) {
                int i2 = 73 / 0;
            }
        }

        public static void ThreeDS2Service() {
            onError = new int[]{913523560, 790870295, -839229514, -1006179651, -987655846, 646406371, -353166943, 870436390, 400806991, -2093393034, -825179955, -1758236319, 1501342768, 27801094, -202347689, -1340439218, 1608076231, -1248567656};
            onCompleted = (char) 52911;
            addParam = (char) 62996;
            ConfigParameters = (char) 45386;
            getParamValue = (char) 7073;
        }

        private static void a(int[] iArr, int i, Object[] objArr) {
            int i2;
            int i3;
            int i4;
            int length;
            int[] iArr2;
            int i5;
            int[] iArr3;
            int i6;
            int[] iArr4;
            int i7;
            Object method;
            int[] iArr5;
            char[] cArr;
            int i8;
            Object method2;
            createTransaction createtransaction = new createTransaction();
            char[] cArr2 = new char[4];
            char[] cArr3 = new char[iArr.length * 2];
            int[] iArr6 = onError;
            Class cls = Integer.TYPE;
            int i9 = 0;
            if (iArr6 != null) {
                i2 = 2;
                int length2 = iArr6.length;
                int[] iArr7 = new int[length2];
                int i10 = 0;
                i3 = 16;
                while (i10 < length2) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr6[i10])};
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj = map.get(2095751688);
                        if (obj != null) {
                            iArr5 = iArr7;
                            cArr = cArr2;
                            method2 = obj;
                            i8 = length2;
                        } else {
                            iArr5 = iArr7;
                            cArr = cArr2;
                            i8 = length2;
                            Class cls2 = (Class) removeParam.initialize(64 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 1197 - TextUtils.getOffsetAfter("", 0));
                            Object[] objArr3 = new Object[1];
                            c((byte) 0, (short) 0, (byte) 1, objArr3);
                            method2 = cls2.getMethod((String) objArr3[0], cls);
                            map.put(2095751688, method2);
                        }
                        iArr5[i10] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                        i10++;
                        length2 = i8;
                        iArr7 = iArr5;
                        cArr2 = cArr;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr6 = iArr7;
            } else {
                i2 = 2;
                i3 = 16;
            }
            char[] cArr4 = cArr2;
            int length3 = iArr6.length;
            int[] iArr8 = new int[length3];
            int[] iArr9 = onError;
            if (iArr9 != null) {
                int i11 = $10 + 95;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    length = iArr9.length;
                    iArr2 = new int[length];
                    i5 = 1;
                } else {
                    length = iArr9.length;
                    iArr2 = new int[length];
                    i5 = 0;
                }
                while (i5 < length) {
                    Object[] objArr4 = {Integer.valueOf(iArr9[i5])};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(2095751688);
                    if (obj2 != null) {
                        iArr3 = iArr9;
                        i6 = length;
                        iArr4 = iArr2;
                        method = obj2;
                        i7 = i5;
                    } else {
                        iArr3 = iArr9;
                        i6 = length;
                        iArr4 = iArr2;
                        Class cls3 = (Class) removeParam.initialize(64 - TextUtils.getCapsMode("", 0, 0), (char) (ViewConfiguration.getJumpTapTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 1197);
                        Object[] objArr5 = new Object[1];
                        i7 = i5;
                        c((byte) 0, (short) 0, (byte) 1, objArr5);
                        method = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(2095751688, method);
                    }
                    iArr4[i7] = ((Integer) ((Method) method).invoke(null, objArr4)).intValue();
                    i5 = i7 + 1;
                    $11 = ($10 + 25) % 128;
                    iArr9 = iArr3;
                    length = i6;
                    iArr2 = iArr4;
                    i9 = 0;
                }
                iArr9 = iArr2;
            }
            int i12 = i9;
            System.arraycopy(iArr9, i12, iArr8, i12, length3);
            createtransaction.initialize = i12;
            while (true) {
                int i13 = createtransaction.initialize;
                if (i13 >= iArr.length) {
                    objArr[0] = new String(cArr3, 0, i);
                    return;
                }
                int i14 = iArr[i13];
                char c = (char) (i14 >> 16);
                cArr4[i12] = c;
                char c2 = (char) i14;
                cArr4[1] = c2;
                char c3 = (char) (iArr[i13 + 1] >> 16);
                cArr4[i2] = c3;
                char c4 = (char) iArr[i13 + 1];
                cArr4[3] = c4;
                createtransaction.getWarnings = (c << 16) + c2;
                createtransaction.get = (c3 << 16) + c4;
                createTransaction.ThreeDS2ServiceInstance(iArr8);
                int i15 = 0;
                while (true) {
                    i4 = createtransaction.getWarnings;
                    if (i15 >= i3) {
                        break;
                    }
                    int i16 = i4 ^ iArr8[i15];
                    createtransaction.getWarnings = i16;
                    int ThreeDS2Service2 = createTransaction.ThreeDS2Service(i16);
                    Object[] objArr6 = new Object[4];
                    objArr6[3] = createtransaction;
                    objArr6[i2] = createtransaction;
                    objArr6[1] = Integer.valueOf(ThreeDS2Service2);
                    objArr6[0] = createtransaction;
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(-411264147);
                    if (obj3 == null) {
                        obj3 = ((Class) removeParam.initialize(TextUtils.getCapsMode("", 0, 0) + 49, (char) (1 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1))), 13121 - (ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("y", Object.class, cls, Object.class, Object.class);
                        map3.put(-411264147, obj3);
                    }
                    int intValue = ((Integer) ((Method) obj3).invoke(null, objArr6)).intValue();
                    createtransaction.getWarnings = createtransaction.get;
                    createtransaction.get = intValue;
                    i15++;
                    i3 = 16;
                }
                int i17 = createtransaction.get;
                createtransaction.getWarnings = i17;
                createtransaction.get = i4;
                i3 = 16;
                int i18 = i4 ^ iArr8[16];
                createtransaction.get = i18;
                int i19 = i17 ^ iArr8[17];
                createtransaction.getWarnings = i19;
                cArr4[0] = (char) (i19 >>> 16);
                cArr4[1] = (char) i19;
                cArr4[i2] = (char) (i18 >>> 16);
                cArr4[3] = (char) i18;
                createTransaction.ThreeDS2ServiceInstance(iArr8);
                int i20 = createtransaction.initialize;
                cArr3[i20 * 2] = cArr4[0];
                cArr3[(i20 * 2) + 1] = cArr4[1];
                cArr3[(i20 * 2) + 2] = cArr4[i2];
                cArr3[(i20 * 2) + 3] = cArr4[3];
                int i21 = i2;
                Object[] objArr7 = new Object[i21];
                objArr7[1] = createtransaction;
                objArr7[0] = createtransaction;
                Map map4 = removeParam.visaSchemeConfiguration;
                Object obj4 = map4.get(-1870831722);
                if (obj4 == null) {
                    Class cls4 = (Class) removeParam.initialize((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 98, (char) View.MeasureSpec.getSize(0), 1881 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                    Object[] objArr8 = new Object[1];
                    c((byte) 0, (short) 0, (byte) 0, objArr8);
                    obj4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                    map4.put(-1870831722, obj4);
                }
                ((Method) obj4).invoke(null, objArr7);
                i2 = i21;
                i12 = 0;
            }
        }

        private static void b(String str, int i, Object[] objArr) {
            char[] cArr;
            char[] cArr2;
            char[] cArr3;
            int i2 = ($10 + 5) % 128;
            $11 = i2;
            int i3 = 2;
            if (str != null) {
                int i4 = i2 + 77;
                $10 = i4 % 128;
                if (i4 % 2 != 0) {
                    str.toCharArray();
                    throw null;
                }
                cArr = str.toCharArray();
            } else {
                cArr = str;
            }
            char[] cArr4 = cArr;
            ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
            char[] cArr5 = new char[cArr4.length];
            int i5 = 0;
            configurationBuilder.ThreeDS2ServiceInstance = 0;
            char[] cArr6 = new char[2];
            while (true) {
                int i6 = configurationBuilder.ThreeDS2ServiceInstance;
                if (i6 >= cArr4.length) {
                    objArr[0] = new String(cArr5, 0, i);
                    return;
                }
                cArr6[i5] = cArr4[i6];
                char c = 1;
                cArr6[1] = cArr4[i6 + 1];
                int i7 = 58224;
                int i8 = i5;
                while (i8 < 16) {
                    char c2 = cArr6[c];
                    char c3 = cArr6[i5];
                    char c4 = c;
                    int i9 = i3;
                    ConfigurationBuilder configurationBuilder2 = configurationBuilder;
                    int i10 = (c3 + i7) ^ ((c3 << 4) + ((char) (ConfigParameters ^ (-1730380012335540218L))));
                    int i11 = c3 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(getParamValue);
                        objArr2[i9] = Integer.valueOf(i11);
                        objArr2[c4] = Integer.valueOf(i10);
                        objArr2[i5] = Integer.valueOf(c2);
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj = map.get(936379577);
                        Class cls = Integer.TYPE;
                        if (obj != null) {
                            cArr2 = cArr4;
                            cArr3 = cArr6;
                        } else {
                            cArr2 = cArr4;
                            cArr3 = cArr6;
                            obj = ((Class) removeParam.initialize(67 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (62396 - (TypedValue.complexToFloat(i5) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(i5) == RecyclerView.DECELERATION_RATE ? 0 : -1))), TextUtils.lastIndexOf("", '0', i5, i5) + 5353)).getMethod("C", cls, cls, cls, cls);
                            map.put(936379577, obj);
                        }
                        char charValue = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                        cArr3[c4] = charValue;
                        char c5 = cArr3[i5];
                        int i12 = i5;
                        int i13 = (charValue + i7) ^ ((charValue << 4) + ((char) (onCompleted ^ (-1730380012335540218L))));
                        int i14 = charValue >>> 5;
                        Object[] objArr3 = new Object[4];
                        objArr3[3] = Integer.valueOf(addParam);
                        objArr3[i9] = Integer.valueOf(i14);
                        objArr3[c4] = Integer.valueOf(i13);
                        objArr3[i12] = Integer.valueOf(c5);
                        Object obj2 = map.get(936379577);
                        if (obj2 == null) {
                            obj2 = ((Class) removeParam.initialize(67 - View.resolveSizeAndState(i12, i12, i12), (char) (TextUtils.indexOf((CharSequence) "", '0') + 62397), 5352 - View.resolveSize(i12, i12))).getMethod("C", cls, cls, cls, cls);
                            map.put(936379577, obj2);
                        }
                        cArr3[0] = ((Character) ((Method) obj2).invoke(null, objArr3)).charValue();
                        i7 -= 40503;
                        i8++;
                        c = c4;
                        i3 = i9;
                        configurationBuilder = configurationBuilder2;
                        cArr6 = cArr3;
                        cArr4 = cArr2;
                        i5 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr7 = cArr4;
                int i15 = i3;
                ConfigurationBuilder configurationBuilder3 = configurationBuilder;
                char[] cArr8 = cArr6;
                char c6 = c;
                int i16 = configurationBuilder3.ThreeDS2ServiceInstance;
                cArr5[i16] = cArr8[0];
                cArr5[i16 + 1] = cArr8[c6];
                Object[] objArr4 = new Object[i15];
                objArr4[c6] = configurationBuilder3;
                objArr4[0] = configurationBuilder3;
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(108358357);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(TextUtils.getOffsetAfter("", 0) + 54, (char) (39910 - TextUtils.getTrimmedLength("")), 7059 - KeyEvent.normalizeMetaState(0))).getMethod("B", Object.class, Object.class);
                    map2.put(108358357, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
                $10 = ($11 + 21) % 128;
                i3 = i15;
                configurationBuilder = configurationBuilder3;
                cArr6 = cArr8;
                cArr4 = cArr7;
                i5 = 0;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void c(byte b, short s, byte b2, Object[] objArr) {
            int i;
            int i2;
            int i3;
            int i4 = (b * 4) + 1;
            int i5 = 4 - (s * 4);
            int i6 = 118 - (b2 * 5);
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i4];
            if (bArr == null) {
                int i7 = i4;
                i = i5;
                i3 = 0;
                i5 += -i7;
                i++;
                i2 = i3;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i3 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i7 = bArr[i];
                i5 += -i7;
                i++;
                i2 = i3;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i3 == i4) {
                }
            } else {
                i = i5;
                i5 = i6;
                i2 = 0;
                i3 = i2 + 1;
                bArr2[i2] = (byte) i5;
                if (i3 == i4) {
                }
            }
        }

        public static void init$0() {
            $$a = new byte[]{116, 115, -26, -112};
            $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSupportedProtocolVersions = 0;
        getIds = 1;
        get();
        Object[] objArr = new Object[1];
        a("ፁ\ue9d6\ue662ﲪ車\uf7ad쳱쥝쟚\udc28\udaa6휷", 64151 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr);
        valueOf = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        b(null, null, Color.alpha(0) + 127, "\u0085\u0089\u008b\u008a\u0089\u0089\u0088\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr2);
        CertificateInfoCertificateType = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a("ፊຐ⣮䫖搡蘌ꁎ쎺ﶘΌ㧉嬩甍靵늵겏컿\ue8e0ਦ␛䙀憠", 7643 - TextUtils.getOffsetAfter("", 0), objArr3);
        getExpiryDate = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a("ፚ⛽砙뎾엞\u1f47劁携빒\uf1c3ଅ庱郃ꩆﶎ㜵䥌鳦", KeyEvent.keyCodeFromString("") + 13729, objArr4);
        values = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        b(null, null, TextUtils.indexOf((CharSequence) "", '0') + 128, "\u0093\u0092\u0085\u0091\u008b\u0090\u0086\u008f\u0087\u0086\u008d\u0089\u0086\u008d\u008e\u0085\u0081\u008d\u008c\u0085\u0089", objArr5);
        getType = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        a("ፚ楓\ue745絰ﭦ焩켝䔴쌢姠ퟖⷭ꯵↹뾙㖷뎪", TextUtils.getOffsetBefore("", 0) + 31247, objArr6);
        getErrorCode = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        b(null, null, TextUtils.indexOf("", "", 0, 0) + 127, "\u0089\u0086\u008f\u0086\u008b\u008d\u0093\u008d\u0095\u008b\u0094\u0085\u0084\u0087\u0087\u008b\u0093", objArr7);
        getName = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        a("ፍԳ㾥倝䪖挂闾蹺ꃣ\ud972\uf3d8\ue44dḞゾ⤪䎐琒", 5748 - ExpandableListView.getPackedPositionChild(0L), objArr8);
        toString = ((String) objArr8[0]).intern();
        Object[] objArr9 = new Object[1];
        a("ፇ맫䘞ፀ링䘖ፂ맷䘟ፃ맵䘒፦맠䘖ፎ맲", 43691 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr9);
        CertificateInfo = ((String) objArr9[0]).intern();
        Object[] objArr10 = new Object[1];
        a("ፚ卝鍪팚ጧ叭鏟폁᎓厬鉕퉢ሙ刅鈻틉ዟ劕銸텺ᅠ兕", 16411 - ExpandableListView.getPackedPositionType(0L), objArr10);
        SDKNotInitializedException = ((String) objArr10[0]).intern();
        Object[] objArr11 = new Object[1];
        b(null, null, TextUtils.getTrimmedLength("") + 127, "\u0093\u0092\u0085\u0091\u008b\u0090\u0086\u008f\u0097\u0082\u0096", objArr11);
        SDKAlreadyInitializedException = ((String) objArr11[0]).intern();
        Object[] objArr12 = new Object[1];
        b(null, null, (ViewConfiguration.getWindowTouchSlop() >> 8) + 127, "\u0084\u0085\u0099\u0083\u0098\u008b\u0090\u0086\u008f\u0097\u0082\u0096", objArr12);
        InvalidInputException = ((String) objArr12[0]).intern();
        Object[] objArr13 = new Object[1];
        a("ፙ칉\ua959葷杷䈉㴝ᠴﬢ훀뇖泬俞⪌ֈ\ue0ae쎛뺿顔筁噻", View.getDefaultSize(0, 0) + 56591, objArr13);
        rootPublicKeyFromAssetCertificate = ((String) objArr13[0]).intern();
        Object[] objArr14 = new Object[1];
        a("ፙﲅ쳁\udc13걇붍跕鴈浂纜仞帨⹃㾧\u0fe2Ἤ\uef4a\uf8b8죠\ud823", (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 61379, objArr14);
        SDKRuntimeException = ((String) objArr14[0]).intern();
        Object[] objArr15 = new Object[1];
        b(null, null, 128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0084\u0085\u0099\u0083\u0098\u0086\u008b\u008d\u0093\u0083\u0081\u008d\u0093\u0086\u0085\u0082\u0093\u009a\u0088\u0093\u008d\u009b\u0099\u009a\u0095", objArr15);
        rootPublicKey = ((String) objArr15[0]).intern();
        Object[] objArr16 = new Object[1];
        a("\u135c\uf0b0풫뢺鲬悭䒅⢝ಐ႒\uf492\ud88a벋胥擽䣴⳰ドᓩ\uf8ed\udcd7ꃕ", (ViewConfiguration.getJumpTapTimeout() >> 16) + 58363, objArr16);
        logo = ((String) objArr16[0]).intern();
        Object[] objArr17 = new Object[1];
        a("፞礨잍Ⱌ몛܀淵", (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 27253, objArr17);
        encryptionPublicKey = ((String) objArr17[0]).intern();
        Object[] objArr18 = new Object[1];
        b(null, null, View.combineMeasuredStates(0, 0) + 127, "\u0084\u0085\u0099\u0083\u0098\u0085\u009a\u0086\u008d\u0093\u0086\u008b\u008a\u0099\u008b\u008b", objArr18);
        logoDark = ((String) objArr18[0]).intern();
        Object[] objArr19 = new Object[1];
        a("ፁ䮒ꋪᤖ瀒꽁ޏ纟헗ఱ步쉌", (ViewConfiguration.getFadingEdgeLength() >> 16) + 22739, objArr19);
        encryptionPublicKeyFromAssetCertificate = ((String) objArr19[0]).intern();
        Object[] objArr20 = new Object[1];
        b(null, null, 127 - (ViewConfiguration.getKeyRepeatDelay() >> 16), "\u0084\u0085\u0099\u0083\u0098\u009c\u009c\u0088\u0099\u008b\u008b", objArr20);
        getSchemeEncryptionPublicKeyId = ((String) objArr20[0]).intern();
        Object[] objArr21 = new Object[1];
        a("ፁᘐ᧮Ნؚোಝ㙋㧪", 1361 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr21);
        getSchemeEncryptionPublicKey = ((String) objArr21[0]).intern();
        Object[] objArr22 = new Object[1];
        a("ፇꍢ猣Ϧ펷执㈝싺銷ⅾ\uf13d", 45119 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr22);
        SchemeConfigurationBuilder = ((String) objArr22[0]).intern();
        Object[] objArr23 = new Object[1];
        a("ፋ\udf37讜癬⋄\ueeaf\ud921藧灀㰨\ue8b0\udb60蟚玷", 52321 - ((Process.getThreadPriority(0) + 20) >> 6), objArr23);
        getSchemePublicRootKeys = ((String) objArr23[0]).intern();
        Object[] objArr24 = new Object[1];
        a("ፋ澃\ueaf4攰\ue014捣ﾙ窓\uf5e0瀼\uf330乨쪰䖚샤", Color.alpha(0) + 31957, objArr24);
        ids = ((String) objArr24[0]).intern();
        Object[] objArr25 = new Object[1];
        b(null, null, 127 - TextUtils.getCapsMode("", 0, 0), "\u008b\u0090\u0086\u008f\u0093\u0081\u0085\u0084\u0085\u009d\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr25);
        newSchemeConfiguration = ((String) objArr25[0]).intern();
        Object[] objArr26 = new Object[1];
        b(null, null, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, "\u009e\u008b\u0093\u0083\u0081\u008d\u0089\u0086\u008f\u0093\u0092\u0085\u0091\u008b\u0090\u0086\u008f\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr26);
        getSchemeLogoDark = ((String) objArr26[0]).intern();
        Object[] objArr27 = new Object[1];
        a("ፍ깳椥ⓝ\ue796ꅂ籾㼺\ufae3떺睒㈏촽裋䮭Ս쀊", TextUtils.lastIndexOf("", '0') + 48438, objArr27);
        getSchemeId = ((String) objArr27[0]).intern();
        Object[] objArr28 = new Object[1];
        a("ፍ㣋䑕釥뵶쪊ᘎ⎒伣钒ꃂ챇\u19dd╋狹鸏ꮛ\uf71f", 11149 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr28);
        getSchemeName = ((String) objArr28[0]).intern();
        Object[] objArr29 = new Object[1];
        a("ፍ⬣掅멭\uf2d6લ䄞馊큣\ue8ea₲缟럽칇ۍ庤锚귾\ue446", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14437, objArr29);
        getSchemeLogo = ((String) objArr29[0]).intern();
        Object[] objArr30 = new Object[1];
        b(null, null, 127 - View.MeasureSpec.getSize(0), "\u008b\u0096\u0091\u0092\u008b\u008e\u0097\u009e\u0093\u0086\u009f\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr30);
        jcbConfiguration = ((String) objArr30[0]).intern();
        Object[] objArr31 = new Object[1];
        b(null, null, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, "\u0092\u008b\u008e\u0097\u009e\u0093\u0086\u009f\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr31);
        eftposConfiguration = ((String) objArr31[0]).intern();
        Object[] objArr32 = new Object[1];
        b(null, null, 127 - Color.red(0), "\u008b\u0090\u0086\u008f\u0089\u0089\u0088\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr32);
        unionSchemeConfiguration = ((String) objArr32[0]).intern();
        Object[] objArr33 = new Object[1];
        a("ፏﭾ쌻ꯢ뎋鮅扥䨻勓", TextUtils.indexOf("", "", 0, 0) + 59443, objArr33);
        dinersSchemeConfiguration = ((String) objArr33[0]).intern();
        Object[] objArr34 = new Object[1];
        b(null, null, 127 - (Process.myPid() >> 22), "\u0082\u0095\u0085\u009e\u0090\u0085¢\u0098¡\u0091 \u0095\u0081\u0083", objArr34);
        cbConfiguration = ((String) objArr34[0]).intern();
        Object[] objArr35 = new Object[1];
        a("ፏ\udf50譧眱⌎\ueff2\udbcc", (ViewConfiguration.getKeyRepeatDelay() >> 16) + 52253, objArr35);
        visaSchemeConfiguration = ((String) objArr35[0]).intern();
        Object[] objArr36 = new Object[1];
        b(null, null, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u0095\u009a\u0093\u0083\u0093\u009d\u0095\u0086\u0083\u009e\u0093", objArr36);
        build = ((String) objArr36[0]).intern();
        Object[] objArr37 = new Object[1];
        b(null, null, 127 - (ViewConfiguration.getPressedStateDuration() >> 16), "\u0088\u008b\u0093\u009d\u009e\u0085\u0093\u0086\u009a\u008b\u008a£\u0089\u0095", objArr37);
        mastercardSchemeConfiguration = ((String) objArr37[0]).intern();
        Object[] objArr38 = new Object[1];
        a("ፏ㕪弓愘话궘\uf7aaᡋ≳䐃滩냷\uda95ﲆ", 9767 - View.combineMeasuredStates(0, 0), objArr38);
        SchemeConfiguration = ((String) objArr38[0]).intern();
        Object[] objArr39 = new Object[1];
        a("ፍ菓㉥ꋽ儖솢瀾\ue75a韣ِ뚓┤햢䓓ﭭ毡ᨗ誤㤺ꡨ壤콳", ExpandableListView.getPackedPositionGroup(0L) + 37013, objArr39);
        amexConfiguration = ((String) objArr39[0]).intern();
        Object[] objArr40 = new Object[1];
        a("ፃꋢ瀏ަ헫欄㪽죴鸞ⶫ\ue3d1넃䂱ᛒꑿ箧", 45481 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr40);
        restrictedParameters = ((String) objArr40[0]).intern();
        Object[] objArr41 = new Object[1];
        a("ፋ뺍䣾ᨲꐘ癶ƭ폪緕༖\ud963撰㚶샊鈰㱴", 44497 - TextUtils.getOffsetAfter("", 0), objArr41);
        apiKey = ((String) objArr41[0]).intern();
        Object[] objArr42 = new Object[1];
        b(null, null, 126 - ((byte) KeyEvent.getModifierMetaStateMask()), "\u0084\u008d\u0083\u0093\u0085¤\u009e\u008b\u009e\u009e\u0085", objArr42);
        ConfigurationBuilder = ((String) objArr42[0]).intern();
        Object[] objArr43 = new Object[1];
        a("ፋ\uf279턖뀮韈盓喕㭞ᩥ螺\ud835뿉黦綦䍇≫", 57637 - KeyEvent.normalizeMetaState(0), objArr43);
        removeParam = ((String) objArr43[0]).intern();
        Object[] objArr44 = new Object[1];
        a("ፋ钁᳦蓖న됼㱯ꑈⶶ햄巢씴䴜\uf563", 34781 - TextUtils.indexOf("", "", 0), objArr44);
        configureScheme = ((String) objArr44[0]).intern();
        Object[] objArr45 = new Object[1];
        a("ፋ\ueb3f\ue39a難\uf2d0쪂섓\ud9ff큓", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 63588, objArr45);
        onCompleted = ((String) objArr45[0]).intern();
        Object[] objArr46 = new Object[1];
        b(null, null, 127 - (ViewConfiguration.getPressedStateDuration() >> 16), "¤\u008f\u0095\u0086\u0083\u009e\u0091\u0095\u0089", objArr46);
        onError = ((String) objArr46[0]).intern();
        Object[] objArr47 = new Object[1];
        a("ፍ馷ڭ뎑㢆ꗾ勦\udfde䓃\uf119縫\ueb30逌ᵧ該㝈", 35570 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr47);
        ConfigParameters = ((String) objArr47[0]).intern();
        Object[] objArr48 = new Object[1];
        b(null, null, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u0097\u009e\u0093\u0086\u009f\u0083\u0093\u0083¤\u0098¡\u0091 \u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr48);
        getParamValue = ((String) objArr48[0]).intern();
        Object[] objArr49 = new Object[1];
        a("ፍ\ue321\uf381쉷틞ꅈ넪膘遳惵睉䜷垛♐㛢Փᔬ\ue580\uf444쓼\udb4d", 61543 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr49);
        addParam = ((String) objArr49[0]).intern();
        Object[] objArr50 = new Object[1];
        a("ፍᨱơ༧㚞㰘⮊儈壳䙅䷩筇招桠韂麣萬뎰", 2423 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr50);
        getSDKVersion = ((String) objArr50[0]).intern();
        Object[] objArr51 = new Object[1];
        b(null, null, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, "\u0085\u009a\u0086\u008d\u0093\u0086\u008b\u008a\u0099\u008b\u008b", objArr51);
        ThreeDS2ServiceInitializationCallback = ((String) objArr51[0]).intern();
        Object[] objArr52 = new Object[1];
        b(null, null, 127 - (ViewConfiguration.getTapTimeout() >> 16), "\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u008a\u0089\u0086\u0085\u0095\u0085\u009e", objArr52);
        createTransaction = ((String) objArr52[0]).intern();
        Object[] objArr53 = new Object[1];
        a("ፍ衑╡숇缞ᐸ뇊⻨쯳悢ᶩ몽噙\uf360栀", (Process.myTid() >> 22) + 39703, objArr53);
        cleanup = ((String) objArr53[0]).intern();
        Object[] objArr54 = new Object[1];
        a("ፃῂ\u0a4f㛆Ⅻⷤ塽䓅真掏渑", 3209 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr54);
        ThreeDS2Service = ((String) objArr54[0]).intern();
        Object[] objArr55 = new Object[1];
        a("ፃ嗖鹧삊ऻ牘듥ﴳ➣棙텿\u1bf8尝蚹", 18077 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr55);
        get = ((String) objArr55[0]).intern();
        Object[] objArr56 = new Object[1];
        a("፝卯錏팕Ꮘ叶鎞퉞\u124f刧", TextUtils.getOffsetAfter("", 0) + 16421, objArr56);
        getWarnings = ((String) objArr56[0]).intern();
        Object[] objArr57 = new Object[1];
        a("ፏ벰䲧\u1c8d겨精ಮ\udcb6沏㲏", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45054, objArr57);
        ThreeDS2ServiceInstance = ((String) objArr57[0]).intern();
        Object[] objArr58 = new Object[1];
        b(null, null, 127 - (Process.myTid() >> 22), "¤\u008f\u0095\u0086\u0083\u009e\u0091\u009e\u0085\u008c\u009e\u0085\u009d\u009d¤\u0085\u0085\u009e\u0082\u0093", objArr58);
        initialize = ((String) objArr58[0]).intern();
        Object[] objArr59 = new Object[1];
        a("ፇ栏\ue5d6抬﹑篊\uf09a䱳줿䚇쉍弮퓓偃괘⫦ꞽ⍰룔㖜녰", 31567 - KeyEvent.getDeadChar(0, 0), objArr59);
        getSDKInfo = ((String) objArr59[0]).intern();
        int i = getSupportedProtocolVersions + 109;
        getIds = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(String str, int i, Object[] objArr) {
        Throwable cause;
        int i2;
        byte b;
        int i3;
        char[] charArray = str != null ? str.toCharArray() : str;
        addParam addparam = new addParam();
        addparam.initialize = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        byte b2 = 0;
        addparam.ThreeDS2Service = 0;
        $10 = ($11 + 9) % 128;
        while (true) {
            int i4 = addparam.ThreeDS2Service;
            if (i4 >= charArray.length) {
                break;
            }
            char c = charArray[i4];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[2] = addparam;
                objArr2[1] = addparam;
                objArr2[b2] = Integer.valueOf(c);
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-983980093);
                if (obj != null) {
                    b = b2;
                    i3 = 1;
                    i2 = 62097;
                } else {
                    i2 = 62097;
                    b = b2;
                    i3 = 1;
                    Method method = ((Class) removeParam.initialize((-16777150) - Color.rgb((int) b2, (int) b2, (int) b2), (char) (ExpandableListView.getPackedPositionForGroup(b2) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(b2) == 0L ? 0 : -1)), 12511 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod("e", Integer.TYPE, Object.class, Object.class);
                    map.put(-983980093, method);
                    obj = method;
                }
                jArr[i4] = ((Long) ((Method) obj).invoke(null, objArr2)).longValue() ^ (getCertPrefix ^ 6009743645011411028L);
                Object[] objArr3 = new Object[2];
                objArr3[i3] = addparam;
                objArr3[b] = addparam;
                Object obj2 = map.get(-1840119381);
                if (obj2 == null) {
                    Class cls = (Class) removeParam.initialize(MotionEvent.axisFromString("") + 77, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + i2), 2102 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    Object[] objArr4 = new Object[i3];
                    byte b3 = b;
                    c(b3, b3, b3, objArr4);
                    obj2 = cls.getMethod((String) objArr4[b3], Object.class, Object.class);
                    map.put(-1840119381, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
                $10 = ($11 + 121) % 128;
                b2 = 0;
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
        char[] cArr = new char[length];
        addparam.ThreeDS2Service = 0;
        while (true) {
            int i5 = addparam.ThreeDS2Service;
            if (i5 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            $11 = ($10 + 107) % 128;
            cArr[i5] = (char) jArr[i5];
            Object[] objArr5 = {addparam, addparam};
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj3 = map2.get(-1840119381);
            if (obj3 == null) {
                Class cls2 = (Class) removeParam.initialize(TextUtils.indexOf("", "") + 76, (char) (Color.argb(0, 0, 0, 0) + 62097), 2102 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                Object[] objArr6 = new Object[1];
                c((byte) 0, 0, 0, objArr6);
                obj3 = cls2.getMethod((String) objArr6[0], Object.class, Object.class);
                map2.put(-1840119381, obj3);
            }
            ((Method) obj3).invoke(null, objArr5);
        }
    }

    private static void b(String str, int[] iArr, int i, String str2, Object[] objArr) {
        Class cls;
        char[] cArr;
        char[] cArr2;
        Class cls2;
        int i2;
        Object method;
        String str3 = str2;
        byte[] bArr = str3;
        if (str3 != null) {
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        char[] charArray = str != null ? str.toCharArray() : str;
        onError onerror = new onError();
        char[] cArr3 = SDKInfo;
        Class cls3 = Integer.TYPE;
        int i3 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                $10 = ($11 + 117) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-939298638);
                    if (obj != null) {
                        cArr2 = cArr3;
                        i2 = i4;
                        method = obj;
                        cls2 = cls3;
                    } else {
                        cArr2 = cArr3;
                        cls2 = cls3;
                        Class cls4 = (Class) removeParam.initialize(72 - (Process.myTid() >> 22), (char) (TextUtils.indexOf((CharSequence) "", '0', i3, i3) + 1), 1453 - AndroidCharacter.getMirror('0'));
                        Object[] objArr3 = new Object[1];
                        i2 = i4;
                        c((byte) 0, 0, 9, objArr3);
                        method = cls4.getMethod((String) objArr3[0], cls2);
                        map.put(-939298638, method);
                    }
                    cArr4[i2] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i4 = i2 + 1;
                    cls3 = cls2;
                    cArr3 = cArr2;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cls = cls3;
            $11 = ($10 + 57) % 128;
            cArr3 = cArr4;
        } else {
            cls = cls3;
        }
        Object[] objArr4 = {Integer.valueOf(getLicenseExpiryDate)};
        Map map2 = removeParam.visaSchemeConfiguration;
        Object obj2 = map2.get(-1598850155);
        if (obj2 == null) {
            Class cls5 = (Class) removeParam.initialize(73 - View.getDefaultSize(0, 0), (char) (7529 - ExpandableListView.getPackedPositionChild(0L)), View.resolveSizeAndState(0, 0, 0) + 2489);
            Object[] objArr5 = new Object[1];
            c((byte) 0, 0, 10, objArr5);
            obj2 = cls5.getMethod((String) objArr5[0], cls);
            map2.put(-1598850155, obj2);
        }
        int intValue = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
        if (SchemeInfo) {
            int length2 = bArr2.length;
            onerror.ThreeDS2ServiceInstance = length2;
            char[] cArr5 = new char[length2];
            onerror.getWarnings = 0;
            while (true) {
                int i5 = onerror.getWarnings;
                int i6 = onerror.ThreeDS2ServiceInstance;
                if (i5 >= i6) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                cArr5[i5] = (char) (cArr3[bArr2[(i6 - 1) - i5] + i] - intValue);
                Object[] objArr6 = {onerror, onerror};
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj3 = map3.get(73542081);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(TextUtils.lastIndexOf("", '0', 0) + 49, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 11441 - (ViewConfiguration.getTouchSlop() >> 8))).getMethod("k", Object.class, Object.class);
                    map3.put(73542081, obj3);
                }
                ((Method) obj3).invoke(null, objArr6);
            }
        } else {
            if (getSchemeConfigurations) {
                int i7 = $10 + 37;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    int length3 = charArray.length;
                    onerror.ThreeDS2ServiceInstance = length3;
                    cArr = new char[length3];
                    onerror.getWarnings = 1;
                } else {
                    int length4 = charArray.length;
                    onerror.ThreeDS2ServiceInstance = length4;
                    cArr = new char[length4];
                    onerror.getWarnings = 0;
                }
                while (true) {
                    int i8 = onerror.getWarnings;
                    int i9 = onerror.ThreeDS2ServiceInstance;
                    if (i8 >= i9) {
                        break;
                    }
                    cArr[i8] = (char) (cArr3[charArray[(i9 - 1) - i8] - i] - intValue);
                    Object[] objArr7 = {onerror, onerror};
                    Map map4 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map4.get(73542081);
                    if (obj4 == null) {
                        obj4 = ((Class) removeParam.initialize(View.MeasureSpec.getMode(0) + 48, (char) (KeyEvent.getMaxKeyCode() >> 16), 11441 - View.combineMeasuredStates(0, 0))).getMethod("k", Object.class, Object.class);
                        map4.put(73542081, obj4);
                    }
                    ((Method) obj4).invoke(null, objArr7);
                }
                String str4 = new String(cArr);
                int i10 = $10 + 73;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
                objArr[0] = str4;
                return;
            }
            int i11 = 0;
            int length5 = iArr.length;
            onerror.ThreeDS2ServiceInstance = length5;
            char[] cArr6 = new char[length5];
            while (true) {
                onerror.getWarnings = i11;
                int i12 = onerror.getWarnings;
                int i13 = onerror.ThreeDS2ServiceInstance;
                if (i12 >= i13) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i12] = (char) (cArr3[iArr[(i13 - 1) - i12] - i] - intValue);
                    i11 = i12 + 1;
                }
            }
        }
    }

    private static void c(byte b, int i, int i2, Object[] objArr) {
        int i3 = i2 + 99;
        byte[] bArr = $$a;
        int i4 = 3 - (i * 4);
        int i5 = b * 2;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            i3 = i6 + i3;
        }
        while (true) {
            i4++;
            i7++;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 += bArr[i4];
        }
    }

    public static void get() {
        getCertPrefix = 3454054452906890106L;
        SDKInfo = new char[]{15024, 14987, 15026, 14991, 15030, 14989, 15028, 15058, 15031, 15056, 14988, 14981, 14986, 15057, 15018, 15029, 15015, 15003, 14983, 15011, 14976, 14980, 15002, 15023, 15025, 14982, 14990, 14979, 15008, 14977, 15062, 15019, 15022, 15009, 14984, 15063};
        getLicenseExpiryDate = 993475347;
        getSchemeConfigurations = true;
        SchemeInfo = true;
    }

    public static void init$0() {
        $$a = new byte[]{5, -44, -115, -23};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE;
    }
}
