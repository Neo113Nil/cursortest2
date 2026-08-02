package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes5.dex */
public class setLogo implements setCursorVisible {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long ConfigParameters;
    private static int ConfigurationBuilder;
    private static char addParam;
    private static int getParamValue;
    private static char[] onError;
    private final load ThreeDS2Service;
    private final String ThreeDS2ServiceInitializationCallback;
    private final put ThreeDS2ServiceInstance;
    private final getSuppressed cleanup;
    private final String createTransaction;
    private final String get;
    private final String getSDKInfo;
    private final clear getSDKVersion;
    private final String getWarnings;
    private final String initialize;
    private final load onCompleted;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getParamValue = 0;
        ConfigurationBuilder = 1;
        ConfigParameters = -1598788509653554101L;
        onError = new char[]{37929, 37937, 37974, 37915, 37940, 37978, 37919, 37941, 37918, 37933, 37930, 37907, 37913, 37932, 37897, 37891, 37939, 37936, 37906, 37981, 37896, 37905, 37945, 37902, 37917, 37934, 37959, 37908, 37900, 37935, 37898, 37938, 37911, 37909, 37950, 37931};
        addParam = (char) 41446;
    }

    public setLogo(load loadVar, String str, String str2, put putVar, String str3, String str4, clear clearVar, getSuppressed getsuppressed, String str5, String str6, load loadVar2) {
        this.ThreeDS2Service = loadVar;
        this.getWarnings = str;
        this.get = str2;
        this.ThreeDS2ServiceInstance = putVar;
        this.initialize = str3;
        this.createTransaction = str4;
        this.getSDKVersion = clearVar;
        this.cleanup = getsuppressed;
        this.ThreeDS2ServiceInitializationCallback = str5;
        this.getSDKInfo = str6;
        this.onCompleted = loadVar2;
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] cArr;
        if (str != null) {
            cArr = str.toCharArray();
            $11 = ($10 + 103) % 128;
        } else {
            cArr = str;
        }
        onCompleted oncompleted = new onCompleted();
        char[] initialize = onCompleted.initialize(ConfigParameters ^ (-2776494906517314268L), cArr, i);
        oncompleted.initialize = 4;
        while (true) {
            int i2 = oncompleted.initialize;
            if (i2 >= initialize.length) {
                objArr[0] = new String(initialize, 4, initialize.length - 4);
                return;
            }
            $11 = ($10 + 37) % 128;
            int i3 = i2 - 4;
            oncompleted.ThreeDS2Service = i3;
            try {
                Object[] objArr2 = {Long.valueOf(initialize[i2] ^ initialize[i2 % 4]), Long.valueOf(i3), Long.valueOf(ConfigParameters)};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1242395160);
                if (obj == null) {
                    Class cls = (Class) removeParam.initialize(TextUtils.indexOf("", "", 0, 0) + 48, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 27780), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2440);
                    Object[] objArr3 = new Object[1];
                    c(0, (byte) 0, (byte) 7, objArr3);
                    String str2 = (String) objArr3[0];
                    Class cls2 = Long.TYPE;
                    obj = cls.getMethod(str2, cls2, cls2, cls2);
                    map.put(-1242395160, obj);
                }
                initialize[i2] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {oncompleted, oncompleted};
                Object obj2 = map.get(1526822639);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(66 - TextUtils.indexOf("", "", 0), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 14235)).getMethod("s", Object.class, Object.class);
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

    private static void b(byte b, int i, String str, Object[] objArr) {
        int i2;
        char c;
        char c2;
        char c3;
        char c4;
        Object method;
        int length;
        char[] cArr;
        char[] cArr2;
        char[] charArray = str != null ? str.toCharArray() : str;
        getParamValue getparamvalue = new getParamValue();
        char[] cArr3 = onError;
        Class cls = Integer.TYPE;
        byte b2 = 2;
        if (cArr3 != null) {
            int i3 = $10 + 25;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                length = cArr3.length;
                cArr = new char[length];
            } else {
                length = cArr3.length;
                cArr = new char[length];
            }
            int i4 = 0;
            while (i4 < length) {
                byte b3 = b2;
                $10 = ($11 + 43) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-78420608);
                    if (obj != null) {
                        cArr2 = charArray;
                    } else {
                        cArr2 = charArray;
                        Class cls2 = (Class) removeParam.initialize(94 - TextUtils.getTrimmedLength(""), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 1559 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        Object[] objArr3 = new Object[1];
                        c(0, (byte) 0, (byte) 0, objArr3);
                        Method method2 = cls2.getMethod((String) objArr3[0], cls);
                        map.put(-78420608, method2);
                        obj = method2;
                    }
                    cArr[i4] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    i4++;
                    b2 = b3;
                    charArray = cArr2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr;
        }
        char[] cArr4 = charArray;
        byte b4 = b2;
        Object[] objArr4 = {Integer.valueOf(addParam)};
        Map map2 = removeParam.visaSchemeConfiguration;
        Object obj2 = map2.get(-78420608);
        if (obj2 == null) {
            Class cls3 = (Class) removeParam.initialize(93 - TextUtils.lastIndexOf("", '0'), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 1558 - TextUtils.lastIndexOf("", '0', 0));
            Object[] objArr5 = new Object[1];
            c(0, (byte) 0, (byte) 0, objArr5);
            obj2 = cls3.getMethod((String) objArr5[0], cls);
            map2.put(-78420608, obj2);
        }
        char charValue = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr5[i2] = (char) (cArr4[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            $11 = ($10 + 75) % 128;
            getparamvalue.getWarnings = 0;
            while (true) {
                int i5 = getparamvalue.getWarnings;
                if (i5 >= i2) {
                    break;
                }
                char c5 = cArr4[i5];
                getparamvalue.get = c5;
                char c6 = cArr4[i5 + 1];
                getparamvalue.initialize = c6;
                if (c5 == c6) {
                    cArr5[i5] = (char) (c5 - b);
                    cArr5[i5 + 1] = (char) (c6 - b);
                } else {
                    Object[] objArr6 = new Object[13];
                    objArr6[12] = getparamvalue;
                    objArr6[11] = Integer.valueOf(charValue);
                    objArr6[10] = getparamvalue;
                    objArr6[9] = getparamvalue;
                    objArr6[8] = Integer.valueOf(charValue);
                    objArr6[7] = getparamvalue;
                    objArr6[6] = getparamvalue;
                    objArr6[5] = Integer.valueOf(charValue);
                    objArr6[4] = getparamvalue;
                    objArr6[3] = getparamvalue;
                    objArr6[b4] = Integer.valueOf(charValue);
                    objArr6[1] = getparamvalue;
                    objArr6[0] = getparamvalue;
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map3.get(-1395483366);
                    if (obj3 != null) {
                        c = '\t';
                        c3 = '\b';
                        c4 = 6;
                        method = obj3;
                        c2 = 7;
                    } else {
                        c = '\t';
                        c2 = 7;
                        c3 = '\b';
                        Class cls4 = (Class) removeParam.initialize(MotionEvent.axisFromString("") + 49, (char) View.MeasureSpec.getMode(0), (ViewConfiguration.getEdgeSlop() >> 16) + 3221);
                        Object[] objArr7 = new Object[1];
                        c4 = 6;
                        c(0, (byte) 0, b4, objArr7);
                        String str2 = (String) objArr7[0];
                        Class cls5 = Integer.TYPE;
                        method = cls4.getMethod(str2, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class, Object.class, cls5, Object.class);
                        map3.put(-1395483366, method);
                    }
                    int intValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                    int i6 = getparamvalue.cleanup;
                    if (intValue == i6) {
                        Object[] objArr8 = new Object[11];
                        objArr8[10] = getparamvalue;
                        objArr8[c] = Integer.valueOf(charValue);
                        objArr8[c3] = getparamvalue;
                        objArr8[c2] = Integer.valueOf(charValue);
                        objArr8[c4] = Integer.valueOf(charValue);
                        objArr8[5] = getparamvalue;
                        objArr8[4] = getparamvalue;
                        objArr8[3] = Integer.valueOf(charValue);
                        objArr8[2] = Integer.valueOf(charValue);
                        objArr8[1] = getparamvalue;
                        objArr8[0] = getparamvalue;
                        Object obj4 = map3.get(1507360409);
                        if (obj4 == null) {
                            Class cls6 = (Class) removeParam.initialize(47 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 25644), (Process.myPid() >> 22) + 11489);
                            Class cls7 = Integer.TYPE;
                            obj4 = cls6.getMethod("x", Object.class, Object.class, cls7, cls7, Object.class, Object.class, cls7, cls7, Object.class, cls7, Object.class);
                            map3.put(1507360409, obj4);
                        }
                        int intValue2 = ((Integer) ((Method) obj4).invoke(null, objArr8)).intValue();
                        int i7 = (getparamvalue.ThreeDS2ServiceInstance * charValue) + getparamvalue.cleanup;
                        int i8 = getparamvalue.getWarnings;
                        cArr5[i8] = cArr3[intValue2];
                        cArr5[i8 + 1] = cArr3[i7];
                    } else {
                        int i9 = getparamvalue.ThreeDS2Service;
                        int i10 = getparamvalue.ThreeDS2ServiceInstance;
                        int i11 = getparamvalue.ThreeDS2ServiceInitializationCallback;
                        if (i9 == i10) {
                            int m = Thread$State$EnumUnboxingLocalUtility.m(i11, charValue, 1, charValue);
                            getparamvalue.ThreeDS2ServiceInitializationCallback = m;
                            int m2 = Thread$State$EnumUnboxingLocalUtility.m(i6, charValue, 1, charValue);
                            getparamvalue.cleanup = m2;
                            int i12 = (i10 * charValue) + m2;
                            int i13 = getparamvalue.getWarnings;
                            cArr5[i13] = cArr3[(i9 * charValue) + m];
                            cArr5[i13 + 1] = cArr3[i12];
                        } else {
                            int i14 = (i9 * charValue) + i6;
                            int i15 = getparamvalue.getWarnings;
                            cArr5[i15] = cArr3[i14];
                            cArr5[i15 + 1] = cArr3[(i10 * charValue) + i11];
                        }
                        getparamvalue.getWarnings += 2;
                        b4 = 2;
                    }
                }
                getparamvalue.getWarnings += 2;
                b4 = 2;
            }
        }
        int i16 = 0;
        while (i16 < i) {
            int i17 = $11 + 11;
            $10 = i17 % 128;
            if (i17 % 2 != 0) {
                cArr5[i16] = (char) (cArr5[i16] ^ 3333);
                i16 += 115;
            } else {
                cArr5[i16] = (char) (cArr5[i16] ^ 13722);
                i16++;
            }
        }
        objArr[0] = new String(cArr5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(int i, byte b, byte b2, Object[] objArr) {
        int i2;
        int i3;
        byte[] bArr = $$a;
        int i4 = 119 - b2;
        int i5 = i * 4;
        ?? r6 = 4 - (b * 2);
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            byte b3 = r6;
            i2 = 0;
            int i6 = r6;
            i4 += b3;
            i3 = i6 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2++;
            b3 = bArr[i3];
            i6 = i3;
            i4 += b3;
            i3 = i6 + 1;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            i3 = r6;
            bArr2[i2] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{71, 42, -109, PnmConstants.PNM_PREFIX_BYTE};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPrivateImeOptions
    public String ThreeDS2Service() {
        int i = getParamValue + 19;
        ConfigurationBuilder = i % 128;
        int i2 = i % 2;
        String str = this.get;
        if (i2 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPrivateImeOptions
    public load ThreeDS2ServiceInstance() {
        int i = getParamValue + 91;
        ConfigurationBuilder = i % 128;
        int i2 = i % 2;
        load loadVar = this.ThreeDS2Service;
        if (i2 == 0) {
            int i3 = 42 / 0;
        }
        return loadVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCursorVisible
    public getSuppressed encryptionPublicKey() {
        int i = getParamValue;
        getSuppressed getsuppressed = this.cleanup;
        int i2 = i + 93;
        ConfigurationBuilder = i2 % 128;
        if (i2 % 2 != 0) {
            return getsuppressed;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCursorVisible
    public load encryptionPublicKeyFromAssetCertificate() {
        int i = ConfigurationBuilder;
        load loadVar = this.onCompleted;
        int i2 = i + 75;
        getParamValue = i2 % 128;
        if (i2 % 2 == 0) {
            return loadVar;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPrivateImeOptions
    public String get() {
        int i = getParamValue + 117;
        ConfigurationBuilder = i % 128;
        int i2 = i % 2;
        String str = this.getWarnings;
        if (i2 == 0) {
            int i3 = 35 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCursorVisible
    public String getSchemePublicRootKeys() {
        int i = getParamValue + 87;
        ConfigurationBuilder = i % 128;
        int i2 = i % 2;
        String str = this.createTransaction;
        if (i2 == 0) {
            int i3 = 17 / 0;
        }
        return str;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPrivateImeOptions
    public String getWarnings() {
        int i = ConfigurationBuilder + 65;
        getParamValue = i % 128;
        int i2 = i % 2;
        String str = this.initialize;
        if (i2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCursorVisible
    public clear ids() {
        int i = getParamValue + 29;
        ConfigurationBuilder = i % 128;
        int i2 = i % 2;
        clear clearVar = this.getSDKVersion;
        if (i2 != 0) {
            return clearVar;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setPrivateImeOptions
    public put initialize() {
        int i = getParamValue;
        int i2 = i + 17;
        ConfigurationBuilder = i2 % 128;
        int i3 = i2 % 2;
        put putVar = this.ThreeDS2ServiceInstance;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i + 69;
        ConfigurationBuilder = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
        return putVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCursorVisible
    public String logoDark() {
        int i = (getParamValue + 47) % 128;
        ConfigurationBuilder = i;
        String str = this.getSDKInfo;
        int i2 = i + 1;
        getParamValue = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCursorVisible
    public String rootPublicKey() {
        int i = getParamValue;
        String str = this.ThreeDS2ServiceInitializationCallback;
        int i2 = i + 117;
        ConfigurationBuilder = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
        }
        return str;
    }

    public String toString() {
        Object[] objArr = new Object[1];
        a("餵ㅠ럀ꚏ饥㡽ꕱ몶볦Ḩ輵\ue4ea툈旵\ue9e4섥\ue873䮎㎷⭽ྶ酞ṩᗗ◕\uf714砭縟笾\udacc", (Process.myPid() >> 22) + 1, objArr);
        StringBuilder sb = new StringBuilder(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        b((byte) (View.getDefaultSize(0, 0) + 46), 13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u001e\b㘗㘗\u0000\u001b\u0007\u0018\f!\b\u0018", objArr2);
        sb.append(((String) objArr2[0]).intern());
        sb.append(this.ThreeDS2Service);
        Object[] objArr3 = new Object[1];
        b((byte) (Color.alpha(0) + 9), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 24, "\u0003\u0000\u0012\u0013\u0012\b\n\u001e㗒㗒\b\u0012\u0018\n\u0013\u001a\u0015\u0002\u001a\u000f\u0016\u0004\u0019\u0014", objArr3);
        sb.append(((String) objArr3[0]).intern());
        sb.append(this.getWarnings);
        sb.append('\'');
        Object[] objArr4 = new Object[1];
        b((byte) (80 - Process.getGidForName("")), 14 - (ViewConfiguration.getLongPressTimeout() >> 16), "\u0003\u0000\u0014\u000e\u0013\u001b\u0015\u0002\u001a\u000f\u0016\u0004\u0019\u0014", objArr4);
        sb.append(((String) objArr4[0]).intern());
        sb.append(this.get);
        sb.append('\'');
        Object[] objArr5 = new Object[1];
        b((byte) (33 - TextUtils.lastIndexOf("", '0', 0, 0)), 17 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), "\u0003\u0000\u001e\b㘋㘋\u0000\u001b\u0007\f\b\u0012\u0011\b\u0003!㗉", objArr5);
        sb.append(((String) objArr5[0]).intern());
        sb.append(this.ThreeDS2ServiceInstance);
        Object[] objArr6 = new Object[1];
        a("辌ᄪ樒䘉辠ᡥ碭娧ꩃ㹕勺ѡ쒚䖾㐍ↈﺅ殮", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, objArr6);
        sb.append(((String) objArr6[0]).intern());
        sb.append(this.initialize);
        sb.append('\'');
        Object[] objArr7 = new Object[1];
        b((byte) (15 - (ViewConfiguration.getTapTimeout() >> 16)), 12 - TextUtils.lastIndexOf("", '0'), "\u0003\u0000\u000e\u0014\u001a\u0013\t!\u000f\u0011 \u001c㗌", objArr7);
        sb.append(((String) objArr7[0]).intern());
        sb.append(this.createTransaction);
        sb.append('\'');
        Object[] objArr8 = new Object[1];
        b((byte) (123 - (ViewConfiguration.getScrollBarSize() >> 8)), 12 - View.resolveSize(0, 0), "\u0003\u0000\b\u0012\u0015 \u0015\u0017 \t\b\u0018", objArr8);
        sb.append(((String) objArr8[0]).intern());
        sb.append(this.getSDKVersion);
        Object[] objArr9 = new Object[1];
        a("쀊\uddb9賁茗쀦퓶鹺鼨\ue5c4\uf2fd됩셝謝褳틧\ue4bd념ꝿࢽ\u0ee2囇", 1 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr9);
        sb.append(((String) objArr9[0]).intern());
        sb.append(this.cleanup);
        Object[] objArr10 = new Object[1];
        b((byte) (TextUtils.indexOf("", "") + 65), 20 - (Process.myTid() >> 22), "\u0003\u0000\b\u0012\u0015 \u0016 \b\f\u000e\u0012\u0006#\u001d\u0011\u0003!\u0019\u0014", objArr10);
        sb.append(((String) objArr10[0]).intern());
        sb.append(this.ThreeDS2ServiceInitializationCallback);
        sb.append('\'');
        Object[] objArr11 = new Object[1];
        a("ᔫ並䑸\ueb56ᔇ䝩囃\uf769ュ慢粐ꤛ帶᪵ᩏ賺摳㒸쁍", (ViewConfiguration.getLongPressTimeout() >> 16) + 1, objArr11);
        sb.append(((String) objArr11[0]).intern());
        sb.append(this.getSDKInfo);
        sb.append('\'');
        Object[] objArr12 = new Object[1];
        a("⇰䝓ꏘ씫⇜东녣\ud914о栗鬰蝯櫭Ꮗ﷽ꊏ傣㶕➞䣓띰\ue769ਫ", (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr12);
        sb.append(((String) objArr12[0]).intern());
        sb.append(this.onCompleted);
        sb.append('}');
        String sb2 = sb.toString();
        getParamValue = (ConfigurationBuilder + 41) % 128;
        return sb2;
    }
}
