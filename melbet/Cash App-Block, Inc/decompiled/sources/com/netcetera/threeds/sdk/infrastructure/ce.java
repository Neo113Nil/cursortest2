package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class ce {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int ConfigParameters = 898634101;
    private static int apiKey = 0;
    private static int configureScheme = 1;
    private static long onCompleted = 938834393066864857L;
    private static char onError = 4469;
    private final setMaxLines ThreeDS2Service;
    private final fw ThreeDS2ServiceInitializationCallback;
    private final fo ThreeDS2ServiceInstance;
    private final fp addParam;
    private final ft cleanup;
    private final fq createTransaction;
    private final ju get;
    private final fv getParamValue;
    private final fy getSDKInfo;
    private final fz getSDKVersion;
    private final fr getWarnings;
    private final fs initialize;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.ce$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        private static int ThreeDS2Service = 1;
        static final /* synthetic */ int[] get;
        private static int initialize;

        static {
            int[] iArr = new int[getLocalizedMessage.values().length];
            get = iArr;
            try {
                iArr[getLocalizedMessage.initialize.ordinal()] = 1;
                int i = ThreeDS2Service;
                initialize = ((i ^ 77) + ((i & 77) << 1)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                get[getLocalizedMessage.ThreeDS2Service.ordinal()] = 2;
                int i2 = ThreeDS2Service;
                int i3 = (i2 | 45) << 1;
                int i4 = -(((~i2) & 45) | (i2 & (-46)));
                initialize = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                get[getLocalizedMessage.ThreeDS2ServiceInstance.ordinal()] = 3;
                int i5 = initialize;
                ThreeDS2Service = ((-2) - ((((i5 | 34) << 1) - (i5 ^ 34)) ^ (-1))) % 128;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                get[getLocalizedMessage.get.ordinal()] = 4;
                ThreeDS2Service = (initialize + 55) % 128;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                get[getLocalizedMessage.getWarnings.ordinal()] = 5;
                int i6 = ThreeDS2Service;
                int i7 = i6 & 57;
                int i8 = (i6 | 57) & (~i7);
                int i9 = i7 << 1;
                initialize = ((i8 ^ i9) + ((i8 & i9) << 1)) % 128;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                get[getLocalizedMessage.createTransaction.ordinal()] = 6;
                int i10 = initialize;
                int i11 = (i10 | 11) << 1;
                int i12 = -(i10 ^ 11);
                ThreeDS2Service = ((i11 & i12) + (i12 | i11)) % 128;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                get[getLocalizedMessage.ThreeDS2ServiceInitializationCallback.ordinal()] = 7;
                int i13 = initialize;
                int i14 = (i13 & (-26)) | ((~i13) & 25);
                int i15 = -(-((i13 & 25) << 1));
                ThreeDS2Service = (((i14 | i15) << 1) - (i15 ^ i14)) % 128;
            } catch (NoSuchFieldError unused7) {
            }
            int i16 = ThreeDS2Service + 103;
            initialize = i16 % 128;
            if (i16 % 2 != 0) {
                int i17 = 43 / 0;
            }
        }
    }

    public ce(ju juVar, setMaxLines setmaxlines, fs fsVar, fr frVar, fo foVar, fq fqVar, ft ftVar, fy fyVar, fz fzVar, fw fwVar, fp fpVar, fv fvVar) {
        this.get = juVar;
        this.ThreeDS2Service = setmaxlines;
        this.initialize = fsVar;
        this.getWarnings = frVar;
        this.ThreeDS2ServiceInstance = foVar;
        this.createTransaction = fqVar;
        this.cleanup = ftVar;
        this.getSDKInfo = fyVar;
        this.getSDKVersion = fzVar;
        this.ThreeDS2ServiceInitializationCallback = fwVar;
        this.addParam = fpVar;
        this.getParamValue = fvVar;
    }

    public static ce ThreeDS2ServiceInstance(ju juVar, setMaxLines setmaxlines, fx fxVar) {
        ce ceVar = new ce(juVar, setmaxlines, fxVar, fxVar, fxVar, fxVar, fxVar, fxVar, fxVar, fxVar, fxVar, fxVar);
        int i = configureScheme + 103;
        apiKey = i % 128;
        if (i % 2 == 0) {
            return ceVar;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(String str, int i, char c, String str2, String str3, Object[] objArr) {
        char[] cArr;
        int i2;
        Integer num;
        int i3;
        int i4;
        Integer num2 = 246986610;
        Integer num3 = -258783473;
        $10 = ($11 + 87) % 128;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        char[] charArray2 = str2 != 0 ? str2.toCharArray() : str2;
        int i5 = 2;
        if (str != null) {
            int i6 = $10 + 29;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        ConfigParameters configParameters = new ConfigParameters();
        int length = charArray.length;
        char[] cArr3 = new char[length];
        int length2 = cArr2.length;
        char[] cArr4 = new char[length2];
        int i7 = 0;
        System.arraycopy(charArray, 0, cArr3, 0, length);
        System.arraycopy(cArr2, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = charArray2.length;
        char[] cArr5 = new char[length3];
        configParameters.initialize = 0;
        while (configParameters.initialize < length3) {
            $11 = ($10 + 87) % 128;
            try {
                Object[] objArr2 = {configParameters};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(num3);
                int i8 = i5;
                if (obj != null) {
                    i2 = i7;
                } else {
                    i2 = i7;
                    obj = ((Class) removeParam.initialize(57 - (ExpandableListView.getPackedPositionForChild(i7, i7) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i7, i7) == 0L ? 0 : -1)), (char) (ViewConfiguration.getEdgeSlop() >> 16), (ExpandableListView.getPackedPositionForChild(i7, i7) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i7, i7) == 0L ? 0 : -1)) + 6415)).getMethod("j", Object.class);
                    map.put(num3, obj);
                }
                int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {configParameters};
                Object obj2 = map.get(num2);
                if (obj2 != null) {
                    num = num3;
                } else {
                    num = num3;
                    obj2 = ((Class) removeParam.initialize(ImageFormat.getBitsPerPixel(i2) + 64, (char) (11346 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 8577 - (ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("i", Object.class);
                    map.put(num2, obj2);
                }
                int intValue2 = ((Integer) ((Method) obj2).invoke(null, objArr3)).intValue();
                int i9 = cArr3[configParameters.initialize % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[i8] = Integer.valueOf(cArr4[intValue]);
                objArr4[1] = Integer.valueOf(i9);
                objArr4[i2] = configParameters;
                Object obj3 = map.get(828230935);
                Class cls = Integer.TYPE;
                Integer num4 = num2;
                if (obj3 != null) {
                    i3 = intValue2;
                    i4 = length3;
                } else {
                    int i10 = i2;
                    i3 = intValue2;
                    i4 = length3;
                    obj3 = ((Class) removeParam.initialize(TextUtils.indexOf("", "", i10) + 74, (char) TextUtils.getCapsMode("", i10, i10), 9820 - KeyEvent.normalizeMetaState(i10))).getMethod("o", Object.class, cls, cls);
                    map.put(828230935, obj3);
                }
                ((Method) obj3).invoke(null, objArr4);
                int i11 = cArr3[i3] * 32718;
                char c2 = cArr4[intValue];
                i5 = i8;
                Object[] objArr5 = new Object[i5];
                objArr5[1] = Integer.valueOf(c2);
                objArr5[0] = Integer.valueOf(i11);
                Object obj4 = map.get(196637707);
                if (obj4 == null) {
                    obj4 = ((Class) removeParam.initialize(((Process.getThreadPriority(0) + 20) >> 6) + 48, (char) (TextUtils.indexOf((CharSequence) "", '0') + 63351), 11536 - (KeyEvent.getMaxKeyCode() >> 16))).getMethod("n", cls, cls);
                    map.put(196637707, obj4);
                }
                cArr4[i3] = ((Character) ((Method) obj4).invoke(null, objArr5)).charValue();
                cArr3[i3] = configParameters.get;
                int i12 = configParameters.initialize;
                cArr5[i12] = (char) ((((int) (ConfigParameters ^ (-8880716800597159563L))) ^ ((r3 ^ charArray2[i12]) ^ (onCompleted ^ (-8880716800597159563L)))) ^ ((char) (onError ^ (-8880716800597159563L))));
                configParameters.initialize = i12 + 1;
                num2 = num4;
                num3 = num;
                length3 = i4;
                i7 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr5);
    }

    public remove ThreeDS2Service(setScroller setscroller, Context context) {
        int i = apiKey + 23;
        configureScheme = i % 128;
        if (i % 2 == 0) {
            int i2 = AnonymousClass1.get[setscroller.ConfigParameters().ordinal()];
            throw null;
        }
        switch (AnonymousClass1.get[setscroller.ConfigParameters().ordinal()]) {
            case 1:
                return this.getSDKInfo.get(context, this.get, this.initialize, this.createTransaction, this.ThreeDS2ServiceInitializationCallback, this.getParamValue);
            case 2:
                return this.getSDKVersion.ThreeDS2ServiceInstance(context, this.get, this.initialize, this.createTransaction, this.ThreeDS2ServiceInitializationCallback, this.getParamValue);
            case 3:
                return this.cleanup.initialize(context, this.get, this.initialize, this.createTransaction, this.ThreeDS2ServiceInitializationCallback, this.getParamValue);
            case 4:
                remove initialize = this.getWarnings.initialize(context, this.get, this.ThreeDS2Service, this.createTransaction, this.ThreeDS2ServiceInitializationCallback, (setShadowLayer) setLinksClickable.get(new Object[]{setscroller.mastercardSchemeConfiguration()}, 721461077, -721461077, (int) System.currentTimeMillis()), this.getParamValue);
                configureScheme = (apiKey + 125) % 128;
                return initialize;
            case 5:
                return new cm(context, this.ThreeDS2ServiceInstance);
            case 6:
                cn cnVar = new cn(context, this.addParam, (setShadowLayer) setLinksClickable.get(new Object[]{setscroller.mastercardSchemeConfiguration()}, 721461077, -721461077, (int) System.currentTimeMillis()));
                int i3 = configureScheme + 1;
                apiKey = i3 % 128;
                if (i3 % 2 == 0) {
                    return cnVar;
                }
                throw null;
            case 7:
                cs csVar = new cs(context, this.get, this.createTransaction, this.ThreeDS2ServiceInitializationCallback, this.getParamValue);
                int i4 = apiKey + 5;
                configureScheme = i4 % 128;
                if (i4 % 2 != 0) {
                    return csVar;
                }
                throw null;
            default:
                Object[] objArr = new Object[1];
                a("醬〻㏷视", View.resolveSizeAndState(0, 0, 0), (char) Color.green(0), "͒斜肺忶효納Კ⑸ໄ쉅횿陵ꔈ遱뷸\ue185ↈ鼝嫎濶", "巃坡လ뎪", objArr);
                OptionalProvider$$ExternalSyntheticLambda0.m$1(((String) objArr[0]).intern());
                return null;
        }
    }
}
