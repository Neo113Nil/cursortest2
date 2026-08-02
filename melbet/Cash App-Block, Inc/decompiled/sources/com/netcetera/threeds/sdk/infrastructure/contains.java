package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.netcetera.threeds.sdk.api.ui.logic.UiCustomization;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public class contains extends loadFromXML<Button> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long cleanup;
    private static int createTransaction;
    private static int getSDKInfo;
    private static int getSDKVersion;
    private final String ThreeDS2Service;
    private computeIfAbsent ThreeDS2ServiceInitializationCallback;
    private final ThreeDS2ServiceInstance ThreeDS2ServiceInstance;
    private final jo get;
    private final getServices getWarnings;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.contains$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        private static int ThreeDS2Service = 1;
        static final /* synthetic */ int[] get;
        private static int initialize;

        static {
            int[] iArr = new int[ThreeDS2ServiceInstance.values().length];
            get = iArr;
            try {
                iArr[ThreeDS2ServiceInstance.get.ordinal()] = 1;
                int i = initialize;
                ThreeDS2Service = Thread$State$EnumUnboxingLocalUtility.m(i ^ 64, (i & 64) << 1, 1, 128);
            } catch (NoSuchFieldError unused) {
            }
            try {
                get[ThreeDS2ServiceInstance.ThreeDS2ServiceInstance.ordinal()] = 2;
                int i2 = ThreeDS2Service;
                int i3 = i2 & 63;
                initialize = SVG$Unit$EnumUnboxingLocalUtility.m$1(((i2 ^ 63) | i3) << 1, ~(-((i2 | 63) & (~i3))), 1, 128);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                get[ThreeDS2ServiceInstance.initialize.ordinal()] = 3;
                ThreeDS2Service = (initialize + 73) % 128;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                get[ThreeDS2ServiceInstance.ThreeDS2Service.ordinal()] = 4;
                int i4 = initialize;
                int i5 = i4 & 55;
                int i6 = (i4 ^ 55) | i5;
                ThreeDS2Service = ((i5 & i6) + (i6 | i5)) % 128;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                get[ThreeDS2ServiceInstance.getWarnings.ordinal()] = 5;
                int i7 = initialize;
                int i8 = (i7 | 121) << 1;
                int i9 = -(i7 ^ 121);
                ThreeDS2Service = ((i8 & i9) + (i9 | i8)) % 128;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                get[ThreeDS2ServiceInstance.getSDKVersion.ordinal()] = 6;
                int i10 = initialize;
                ThreeDS2Service = ((i10 ^ 35) + ((i10 & 35) << 1)) % 128;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                get[ThreeDS2ServiceInstance.getSDKInfo.ordinal()] = 7;
                int i11 = ThreeDS2Service;
                initialize = SVG$Unit$EnumUnboxingLocalUtility.m$1(i11 ^ 71, ~((i11 & 71) << 1), 1, 128);
            } catch (NoSuchFieldError unused7) {
            }
            initialize = (ThreeDS2Service + 7) % 128;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ThreeDS2ServiceInstance {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static int ConfigParameters;
        public static final ThreeDS2ServiceInstance ThreeDS2Service;
        private static final /* synthetic */ ThreeDS2ServiceInstance[] ThreeDS2ServiceInitializationCallback;
        public static final ThreeDS2ServiceInstance ThreeDS2ServiceInstance;
        private static int addParam;
        private static int cleanup;
        private static int createTransaction;
        public static final ThreeDS2ServiceInstance get;
        private static byte[] getParamValue;
        public static final ThreeDS2ServiceInstance getSDKInfo;
        public static final ThreeDS2ServiceInstance getSDKVersion;
        public static final ThreeDS2ServiceInstance getWarnings;
        public static final ThreeDS2ServiceInstance initialize;
        private static short[] onCompleted;
        private static int onError;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            ConfigParameters = 0;
            onError = 1;
            ThreeDS2ServiceInstance();
            Object[] objArr = new Object[1];
            a(TextUtils.lastIndexOf("", '0', 0, 0) - 66684967, (byte) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (short) View.MeasureSpec.getSize(0), (-2003918218) - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.getCapsMode("", 0, 0) - 115, objArr);
            ThreeDS2ServiceInstance = new ThreeDS2ServiceInstance(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            a((-66684972) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (byte) ((AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) - 1), (short) (Process.myPid() >> 22), (-2003918213) - KeyEvent.keyCodeFromString(""), TextUtils.lastIndexOf("", '0', 0, 0) - 117, objArr2);
            get = new ThreeDS2ServiceInstance(((String) objArr2[0]).intern(), 1);
            Object[] objArr3 = new Object[1];
            a(Color.argb(0, 0, 0, 0) - 66684967, (byte) KeyEvent.keyCodeFromString(""), (short) Color.blue(0), (AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) - 2003918211, ((byte) KeyEvent.getModifierMetaStateMask()) - 114, objArr3);
            initialize = new ThreeDS2ServiceInstance(((String) objArr3[0]).intern(), 2);
            Object[] objArr4 = new Object[1];
            a((-66684973) - TextUtils.indexOf((CharSequence) "", '0', 0), (byte) ExpandableListView.getPackedPositionType(0L), (short) TextUtils.indexOf("", "", 0), (ViewConfiguration.getScrollBarSize() >> 8) - 2003918206, (-117) - TextUtils.indexOf("", "", 0), objArr4);
            ThreeDS2Service = new ThreeDS2ServiceInstance(((String) objArr4[0]).intern(), 3);
            Object[] objArr5 = new Object[1];
            a((-83462193) - Color.rgb(0, 0, 0), (byte) (ImageFormat.getBitsPerPixel(0) + 1), (short) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (-2003918203) - (ViewConfiguration.getTapTimeout() >> 16), (-117) - View.MeasureSpec.getMode(0), objArr5);
            getWarnings = new ThreeDS2ServiceInstance(((String) objArr5[0]).intern(), 4);
            Object[] objArr6 = new Object[1];
            a((-66684971) - KeyEvent.keyCodeFromString(""), (byte) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (short) (ViewConfiguration.getDoubleTapTimeout() >> 16), View.resolveSizeAndState(0, 0, 0) - 2003918200, (-109) - (Process.myTid() >> 22), objArr6);
            getSDKVersion = new ThreeDS2ServiceInstance(((String) objArr6[0]).intern(), 5);
            Object[] objArr7 = new Object[1];
            a(TextUtils.getOffsetBefore("", 0) - 66684985, (byte) (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (short) (ViewConfiguration.getFadingEdgeLength() >> 16), ExpandableListView.getPackedPositionChild(0L) - 2003918188, (-103) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr7);
            getSDKInfo = new ThreeDS2ServiceInstance(((String) objArr7[0]).intern(), 6);
            ThreeDS2ServiceInitializationCallback = get();
            int i = ConfigParameters + 79;
            onError = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        private ThreeDS2ServiceInstance(String str, int i) {
        }

        public static void ThreeDS2ServiceInstance() {
            createTransaction = -334871150;
            cleanup = -1686431647;
            addParam = -1736273822;
            getParamValue = new byte[]{-18, 17, -22, 22, -21, -21, 24, 19, -28, 19, -11, 26, -28, 11, -17, 17, -32, 29, 24, 23, -6, 5, -21, 24, -24, 9, 17, -19, 25, 26, -30, -30, 31, 29, -4, 11, 19, -21, -25, 30, -19, 19, 29, 24, 27, 24, 24, 24, 24, 24, 24, 24};
        }

        private static void a(int i, byte b, short s, int i2, int i3, Object[] objArr) {
            long j;
            int i4;
            int i5;
            byte[] bArr;
            byte[] bArr2;
            Object method;
            getSDKVersion getsdkversion = new getSDKVersion();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(cleanup)};
                int i6 = 0;
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(981393365);
                Class cls = Integer.TYPE;
                short s2 = -1;
                if (obj != null) {
                    j = 0;
                } else {
                    j = 0;
                    Class cls2 = (Class) removeParam.initialize(ExpandableListView.getPackedPositionGroup(0L) + 62, (char) Color.argb(0, 0, 0, 0), 655 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    Object[] objArr3 = new Object[1];
                    b((short) -1, (byte) 2, (short) 0, objArr3);
                    obj = cls2.getMethod((String) objArr3[0], cls, cls);
                    map.put(981393365, obj);
                }
                int intValue = ((Integer) ((Method) obj).invoke(null, objArr2)).intValue();
                boolean z = intValue == -1;
                if (z) {
                    $10 = ($11 + 15) % 128;
                    byte[] bArr3 = getParamValue;
                    if (bArr3 != null) {
                        int length = bArr3.length;
                        byte[] bArr4 = new byte[length];
                        int i7 = 0;
                        while (i7 < length) {
                            short s3 = s2;
                            Object[] objArr4 = {Integer.valueOf(bArr3[i7])};
                            Map map2 = removeParam.visaSchemeConfiguration;
                            Object obj2 = map2.get(-1684720202);
                            if (obj2 != null) {
                                i5 = i7;
                                bArr2 = bArr3;
                                method = obj2;
                                bArr = bArr4;
                            } else {
                                i5 = i7;
                                bArr = bArr4;
                                Class cls3 = (Class) removeParam.initialize(Color.green(i6) + 59, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', i6, i6)), 3162 - (ViewConfiguration.getPressedStateDuration() >> 16));
                                Object[] objArr5 = new Object[1];
                                bArr2 = bArr3;
                                b(s3, (byte) 0, (short) 0, objArr5);
                                method = cls3.getMethod((String) objArr5[0], cls);
                                map2.put(-1684720202, method);
                            }
                            bArr[i5] = ((Byte) ((Method) method).invoke(null, objArr4)).byteValue();
                            i7 = i5 + 1;
                            bArr4 = bArr;
                            bArr3 = bArr2;
                            i6 = 0;
                            s2 = -1;
                        }
                        bArr3 = bArr4;
                    }
                    if (bArr3 != null) {
                        $11 = ($10 + 35) % 128;
                        byte[] bArr5 = getParamValue;
                        Object[] objArr6 = {Integer.valueOf(i2), Integer.valueOf(createTransaction)};
                        Map map3 = removeParam.visaSchemeConfiguration;
                        Object obj3 = map3.get(981393365);
                        if (obj3 == null) {
                            Class cls4 = (Class) removeParam.initialize(Color.alpha(0) + 62, (char) (ViewConfiguration.getTapTimeout() >> 16), 655 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)));
                            Object[] objArr7 = new Object[1];
                            b((short) -1, (byte) 2, (short) 0, objArr7);
                            obj3 = cls4.getMethod((String) objArr7[0], cls, cls);
                            map3.put(981393365, obj3);
                        }
                        intValue = (byte) (((byte) (bArr5[((Integer) ((Method) obj3).invoke(null, objArr6)).intValue()] ^ 2786809877878216728L)) + ((int) (cleanup ^ 2786809877878216728L)));
                        $10 = ($11 + 39) % 128;
                    } else {
                        intValue = (short) (((short) (onCompleted[i2 + ((int) (createTransaction ^ 2786809877878216728L))] ^ 2786809877878216728L)) + ((int) (cleanup ^ 2786809877878216728L)));
                    }
                }
                if (intValue > 0) {
                    int i8 = $10;
                    $11 = (i8 + 1) % 128;
                    int i9 = ((i2 + intValue) - 2) + ((int) (createTransaction ^ 2786809877878216728L));
                    if (z) {
                        $11 = (i8 + 119) % 128;
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    getsdkversion.ThreeDS2ServiceInstance = i9 + i4;
                    Object[] objArr8 = {getsdkversion, Integer.valueOf(i), Integer.valueOf(addParam), sb};
                    Map map4 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map4.get(-1855485602);
                    if (obj4 == null) {
                        Class cls5 = (Class) removeParam.initialize((AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 53, (char) (Color.blue(0) + 13764), 2802 - TextUtils.indexOf("", ""));
                        Object[] objArr9 = new Object[1];
                        b((short) -1, (byte) 1, (short) 0, objArr9);
                        obj4 = cls5.getMethod((String) objArr9[0], Object.class, cls, cls, Object.class);
                        map4.put(-1855485602, obj4);
                    }
                    ((StringBuilder) ((Method) obj4).invoke(null, objArr8)).append(getsdkversion.ThreeDS2Service);
                    getsdkversion.getWarnings = getsdkversion.ThreeDS2Service;
                    byte[] bArr6 = getParamValue;
                    if (bArr6 != null) {
                        int length2 = bArr6.length;
                        byte[] bArr7 = new byte[length2];
                        for (int i10 = 0; i10 < length2; i10++) {
                            bArr7[i10] = (byte) (bArr6[i10] ^ 2786809877878216728L);
                        }
                        bArr6 = bArr7;
                    }
                    boolean z2 = bArr6 != null;
                    getsdkversion.initialize = 1;
                    while (getsdkversion.initialize < intValue) {
                        if (z2) {
                            $10 = ($11 + 61) % 128;
                            byte[] bArr8 = getParamValue;
                            getsdkversion.ThreeDS2ServiceInstance = getsdkversion.ThreeDS2ServiceInstance - 1;
                            getsdkversion.ThreeDS2Service = (char) (getsdkversion.getWarnings + (((byte) (((byte) (bArr8[r1] ^ 2786809877878216728L)) + s)) ^ b));
                        } else {
                            short[] sArr = onCompleted;
                            getsdkversion.ThreeDS2ServiceInstance = getsdkversion.ThreeDS2ServiceInstance - 1;
                            getsdkversion.ThreeDS2Service = (char) (getsdkversion.getWarnings + (((short) (((short) (sArr[r1] ^ 2786809877878216728L)) + s)) ^ b));
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

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(short s, byte b, short s2, Object[] objArr) {
            int i;
            int i2;
            byte[] bArr = $$a;
            int i3 = (s2 * 4) + 1;
            int i4 = s + 4;
            int i5 = b + 102;
            byte[] bArr2 = new byte[i3];
            if (bArr == null) {
                int i6 = i4;
                byte[] bArr3 = bArr;
                int i7 = 0;
                int i8 = i3;
                int i9 = (-i4) + i8;
                int i10 = i6;
                i5 = i9;
                i4 = i10;
                bArr = bArr3;
                i = i7;
                int i11 = i4 + 1;
                bArr2[i] = (byte) i5;
                i2 = i + 1;
                if (i2 == i3) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i12 = i5;
                i6 = i11;
                i4 = bArr[i11];
                i7 = i2;
                bArr3 = bArr;
                i8 = i12;
                int i92 = (-i4) + i8;
                int i102 = i6;
                i5 = i92;
                i4 = i102;
                bArr = bArr3;
                i = i7;
                int i112 = i4 + 1;
                bArr2[i] = (byte) i5;
                i2 = i + 1;
                if (i2 == i3) {
                }
            } else {
                i = 0;
                int i1122 = i4 + 1;
                bArr2[i] = (byte) i5;
                i2 = i + 1;
                if (i2 == i3) {
                }
            }
        }

        private static /* synthetic */ ThreeDS2ServiceInstance[] get() {
            int i = ConfigParameters + 51;
            onError = i % 128;
            if (i % 2 != 0) {
                return new ThreeDS2ServiceInstance[]{ThreeDS2ServiceInstance, get, initialize, ThreeDS2Service, getWarnings, getSDKVersion, getSDKInfo};
            }
            ThreeDS2ServiceInstance[] threeDS2ServiceInstanceArr = new ThreeDS2ServiceInstance[106];
            threeDS2ServiceInstanceArr[0] = ThreeDS2ServiceInstance;
            threeDS2ServiceInstanceArr[0] = get;
            threeDS2ServiceInstanceArr[5] = initialize;
            threeDS2ServiceInstanceArr[5] = ThreeDS2Service;
            threeDS2ServiceInstanceArr[2] = getWarnings;
            threeDS2ServiceInstanceArr[3] = getSDKVersion;
            threeDS2ServiceInstanceArr[33] = getSDKInfo;
            return threeDS2ServiceInstanceArr;
        }

        public static void init$0() {
            $$a = new byte[]{125, 122, 65, -124};
            $$b = 239;
        }

        public static ThreeDS2ServiceInstance valueOf(String str) {
            int i = ConfigParameters + 41;
            onError = i % 128;
            if (i % 2 != 0) {
                return (ThreeDS2ServiceInstance) Enum.valueOf(ThreeDS2ServiceInstance.class, str);
            }
            Enum.valueOf(ThreeDS2ServiceInstance.class, str);
            throw null;
        }

        public static ThreeDS2ServiceInstance[] values() {
            ConfigParameters = (onError + 105) % 128;
            ThreeDS2ServiceInstance[] threeDS2ServiceInstanceArr = (ThreeDS2ServiceInstance[]) ThreeDS2ServiceInitializationCallback.clone();
            int i = onError + 95;
            ConfigParameters = i % 128;
            if (i % 2 == 0) {
                return threeDS2ServiceInstanceArr;
            }
            throw null;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKVersion = 0;
        createTransaction = 1;
        getSDKInfo = 1141902508;
        cleanup = -5660113893312318340L;
    }

    public contains(Context context, getServices getservices, jo joVar, ThreeDS2ServiceInstance threeDS2ServiceInstance, String str) {
        super(context);
        this.getWarnings = getservices;
        this.get = joVar;
        this.ThreeDS2ServiceInstance = threeDS2ServiceInstance;
        this.ThreeDS2Service = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(boolean z, int i, int i2, String str, int i3, Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        Throwable cause;
        Object method;
        int i4 = $11 + 15;
        $10 = i4 % 128;
        int i5 = 2;
        if (i4 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            cArr = str.toCharArray();
            $10 = ($11 + 105) % 128;
        } else {
            cArr = str;
        }
        char[] cArr3 = cArr;
        getSDKInfo getsdkinfo = new getSDKInfo();
        char[] cArr4 = new char[i2];
        getsdkinfo.getWarnings = 0;
        while (true) {
            int i6 = getsdkinfo.getWarnings;
            if (i6 >= i2) {
                break;
            }
            $11 = ($10 + 7) % 128;
            char c = cArr3[i6];
            getsdkinfo.ThreeDS2ServiceInstance = c;
            char c2 = (char) (i3 + c);
            cArr4[i6] = c2;
            try {
                Object[] objArr2 = new Object[i5];
                objArr2[1] = Integer.valueOf(getSDKInfo);
                objArr2[0] = Integer.valueOf(c2);
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1313942774);
                if (obj != null) {
                    method = obj;
                } else {
                    Class cls = (Class) removeParam.initialize(Drawable.resolveOpacity(0, 0) + 67, (char) (45768 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 4879);
                    Class cls2 = Integer.TYPE;
                    method = cls.getMethod("t", cls2, cls2);
                    map.put(-1313942774, method);
                }
                cArr4[i6] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {getsdkinfo, getsdkinfo};
                Object obj2 = map.get(1981656970);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(59 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) Color.red(0), 12373 - (Process.myPid() >> 22))).getMethod("r", Object.class, Object.class);
                    map.put(1981656970, obj2);
                }
                ((Method) obj2).invoke(null, objArr3);
                i5 = 2;
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
        if (i > 0) {
            getsdkinfo.get = i;
            char[] cArr5 = new char[i2];
            System.arraycopy(cArr4, 0, cArr5, 0, i2);
            int i7 = getsdkinfo.get;
            System.arraycopy(cArr5, 0, cArr4, i2 - i7, i7);
            int i8 = getsdkinfo.get;
            System.arraycopy(cArr5, i8, cArr4, 0, i2 - i8);
        }
        if (z) {
            int i9 = $10 + 27;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr2 = new char[i2];
                getsdkinfo.getWarnings = 1;
            } else {
                cArr2 = new char[i2];
                getsdkinfo.getWarnings = 0;
            }
            while (true) {
                int i10 = getsdkinfo.getWarnings;
                if (i10 >= i2) {
                    break;
                }
                int i11 = $10 + 71;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    cArr2[i10] = cArr4[(i2 % i10) / 0];
                    Object[] objArr4 = {getsdkinfo, getsdkinfo};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj3 = map2.get(1981656970);
                    if (obj3 == null) {
                        obj3 = ((Class) removeParam.initialize(59 - View.resolveSize(0, 0), (char) Color.green(0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 12372)).getMethod("r", Object.class, Object.class);
                        map2.put(1981656970, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr4);
                } else {
                    cArr2[i10] = cArr4[(i2 - i10) - 1];
                    Object[] objArr5 = {getsdkinfo, getsdkinfo};
                    Map map3 = removeParam.visaSchemeConfiguration;
                    Object obj4 = map3.get(1981656970);
                    if (obj4 == null) {
                        obj4 = ((Class) removeParam.initialize(59 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) TextUtils.getCapsMode("", 0, 0), 12373 - View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod("r", Object.class, Object.class);
                        map3.put(1981656970, obj4);
                    }
                    ((Method) obj4).invoke(null, objArr5);
                }
            }
            cArr4 = cArr2;
        }
        String str2 = new String(cArr4);
        $11 = ($10 + 11) % 128;
        objArr[0] = str2;
    }

    private void aa_(Button button) {
        int i = createTransaction + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getSDKVersion = i % 128;
        int i2 = i % 2;
        jo joVar = this.get;
        if (i2 == 0) {
            et.bm_(button, joVar);
            et.bo_(button, this.get);
        } else {
            et.bm_(button, joVar);
            et.bo_(button, this.get);
            int i3 = 95 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(String str, int i, Object[] objArr) {
        Throwable cause;
        long[] jArr;
        Object method;
        char[] charArray = str != null ? str.toCharArray() : str;
        addParam addparam = new addParam();
        addparam.initialize = i;
        int length = charArray.length;
        long[] jArr2 = new long[length];
        addparam.ThreeDS2Service = 0;
        while (true) {
            int i2 = addparam.ThreeDS2Service;
            if (i2 >= charArray.length) {
                break;
            }
            int i3 = $10 + 33;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            Class cls = Integer.TYPE;
            if (i4 == 0) {
                try {
                    Object[] objArr2 = {Integer.valueOf(charArray[i2]), addparam, addparam};
                    Map map = removeParam.visaSchemeConfiguration;
                    Object obj = map.get(-983980093);
                    if (obj != null) {
                        jArr = jArr2;
                        method = obj;
                    } else {
                        jArr = jArr2;
                        method = ((Class) removeParam.initialize(66 - (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 12511 - TextUtils.indexOf("", "", 0))).getMethod("e", cls, Object.class, Object.class);
                        map.put(-983980093, method);
                    }
                    jArr[i2] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (cleanup | 6009743645011411028L);
                    Object[] objArr3 = {addparam, addparam};
                    Object obj2 = map.get(-1840119381);
                    if (obj2 == null) {
                        Class cls2 = (Class) removeParam.initialize(Color.rgb(0, 0, 0) + 16777292, (char) (62098 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 2102 - Drawable.resolveOpacity(0, 0));
                        byte b = (byte) ($$b - 3);
                        byte b2 = (byte) (b - 1);
                        Object[] objArr4 = new Object[1];
                        c(b, b2, (byte) (b2 + 1), objArr4);
                        obj2 = cls2.getMethod((String) objArr4[0], Object.class, Object.class);
                        map.put(-1840119381, obj2);
                    }
                    ((Method) obj2).invoke(null, objArr3);
                } catch (Throwable th) {
                    cause = th.getCause();
                    if (cause != null) {
                    }
                }
            } else {
                jArr = jArr2;
                Object[] objArr5 = {Integer.valueOf(charArray[i2]), addparam, addparam};
                Map map2 = removeParam.visaSchemeConfiguration;
                Object obj3 = map2.get(-983980093);
                if (obj3 == null) {
                    obj3 = ((Class) removeParam.initialize(67 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 12512 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)))).getMethod("e", cls, Object.class, Object.class);
                    map2.put(-983980093, obj3);
                }
                jArr[i2] = ((Long) ((Method) obj3).invoke(null, objArr5)).longValue() ^ (cleanup ^ 6009743645011411028L);
                Object[] objArr6 = {addparam, addparam};
                Object obj4 = map2.get(-1840119381);
                if (obj4 == null) {
                    Class cls3 = (Class) removeParam.initialize((KeyEvent.getMaxKeyCode() >> 16) + 76, (char) (View.resolveSize(0, 0) + 62097), (ViewConfiguration.getTapTimeout() >> 16) + 2102);
                    byte b3 = (byte) ($$b - 3);
                    byte b4 = (byte) (b3 - 1);
                    Object[] objArr7 = new Object[1];
                    c(b3, b4, (byte) (b4 + 1), objArr7);
                    obj4 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(-1840119381, obj4);
                }
                ((Method) obj4).invoke(null, objArr6);
            }
            jArr2 = jArr;
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        long[] jArr3 = jArr2;
        char[] cArr = new char[length];
        addparam.ThreeDS2Service = 0;
        while (true) {
            int i5 = addparam.ThreeDS2Service;
            if (i5 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            int i6 = $10 + 53;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr[i5] = (char) jArr3[i5];
                Object[] objArr8 = {addparam, addparam};
                Map map3 = removeParam.visaSchemeConfiguration;
                Object obj5 = map3.get(-1840119381);
                if (obj5 == null) {
                    Class cls4 = (Class) removeParam.initialize(76 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (62096 - ExpandableListView.getPackedPositionChild(0L)), 2102 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                    byte b5 = (byte) ($$b - 3);
                    byte b6 = (byte) (b5 - 1);
                    Object[] objArr9 = new Object[1];
                    c(b5, b6, (byte) (b6 + 1), objArr9);
                    obj5 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                    map3.put(-1840119381, obj5);
                }
                ((Method) obj5).invoke(null, objArr8);
                int i7 = 91 / 0;
            } else {
                cArr[i5] = (char) jArr3[i5];
                Object[] objArr10 = {addparam, addparam};
                Map map4 = removeParam.visaSchemeConfiguration;
                Object obj6 = map4.get(-1840119381);
                if (obj6 == null) {
                    Class cls5 = (Class) removeParam.initialize(ExpandableListView.getPackedPositionType(0L) + 76, (char) ((PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 62097), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2102);
                    byte b7 = (byte) ($$b - 3);
                    byte b8 = (byte) (b7 - 1);
                    Object[] objArr11 = new Object[1];
                    c(b7, b8, (byte) (b8 + 1), objArr11);
                    obj6 = cls5.getMethod((String) objArr11[0], Object.class, Object.class);
                    map4.put(-1840119381, obj6);
                }
                ((Method) obj6).invoke(null, objArr10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(short s, byte b, byte b2, Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4 = b + 4;
        int i5 = 1 - (s * 4);
        byte[] bArr = $$a;
        ?? r9 = (b2 * 4) + 99;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            byte b3 = r9;
            i3 = 0;
            int i6 = i4;
            int i7 = i4 + (-b3);
            int i8 = i6;
            i2 = i7;
            i4 = i8;
            i = i3;
            int i9 = i4 + 1;
            i3 = i + 1;
            bArr2[i] = (byte) i2;
            if (i3 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            b3 = bArr[i9];
            int i10 = i2;
            i6 = i9;
            i4 = i10;
            int i72 = i4 + (-b3);
            int i82 = i6;
            i2 = i72;
            i4 = i82;
            i = i3;
            int i92 = i4 + 1;
            i3 = i + 1;
            bArr2[i] = (byte) i2;
            if (i3 == i5) {
            }
        } else {
            i = 0;
            i2 = r9;
            int i922 = i4 + 1;
            i3 = i + 1;
            bArr2[i] = (byte) i2;
            if (i3 == i5) {
            }
        }
    }

    public static contains get(Context context, getServices getservices, ju juVar) {
        jo joVar = juVar.get(UiCustomization.ButtonType.SUBMIT);
        ThreeDS2ServiceInstance threeDS2ServiceInstance = ThreeDS2ServiceInstance.initialize;
        Object[] objArr = new Object[1];
        a(true, 23 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 40, "\uffff\u000b\f\ufff8\ufff6\u000b\u0000\u0004\ufff9\f\n\ufff6\u0000\f\ufff6￼\ufffe\u0005￼\u0003\u0003\ufff8\uffff\ufffa\u0003￼\ufff9\ufff8\u0003\ufff6\u0005\u0006\u0000\u000b\ufff8\ufffa\u0000\u000b\u0005￼", 279 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr);
        contains containsVar = new contains(context, getservices, joVar, threeDS2ServiceInstance, ((String) objArr[0]).intern());
        int i = createTransaction + 27;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            int i2 = 9 / 0;
        }
        return containsVar;
    }

    public static /* synthetic */ Object getWarnings(Object[] objArr, int i, int i2, int i3) {
        int i4 = ((i | i3) * (-50)) + (i2 * (-49)) + (i * 51);
        int i5 = ~i;
        int i6 = ~i2;
        int i7 = ~(i5 | i6 | i3);
        int i8 = ~i3;
        int i9 = i6 | i8;
        if ((((~(i | i8)) | (~(i6 | i)) | (~i9)) * 50) + ((i7 | (~(i9 | i))) * 50) + i4 == 1) {
            Context context = (Context) objArr[0];
            jo joVar = ((ju) objArr[1]).get(UiCustomization.ButtonType.OPEN_OOB_APP);
            ThreeDS2ServiceInstance threeDS2ServiceInstance = ThreeDS2ServiceInstance.getSDKVersion;
            Object[] objArr2 = new Object[1];
            b("둋㨑꣫ặ贀珘\ue1a0偸웅뒮㭷ꤺΆ蹚簩\ue2f5內율뗪\u245bꨣᣡ躿納\ue3d5冭", TextUtils.indexOf("", "", 0, 0) + 36433, objArr2);
            contains containsVar = new contains(context, null, joVar, threeDS2ServiceInstance, ((String) objArr2[0]).intern());
            getSDKVersion = (createTransaction + 17) % 128;
            return containsVar;
        }
        Context context2 = (Context) objArr[0];
        getServices getservices = (getServices) objArr[1];
        jo joVar2 = ((ju) objArr[2]).get(UiCustomization.ButtonType.NEXT);
        ThreeDS2ServiceInstance threeDS2ServiceInstance2 = ThreeDS2ServiceInstance.ThreeDS2Service;
        Object[] objArr3 = new Object[1];
        a(true, 24 - (Process.myPid() >> 22), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 39, "\uffff\u000b\f\ufff8\ufff6\u000b\u0000\u0004\ufff9\f\n\ufff6\u0000\f\ufff6￼\ufffe\u0005￼\u0003\u0003\ufff8\uffff\ufffa\u0003￼\ufff9\ufff8\u0003\ufff6\u0005\u0006\u0000\u000b\ufff8\ufffa\u0000\u000b\u0005￼", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + EnumC0170g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, objArr3);
        contains containsVar2 = new contains(context2, getservices, joVar2, threeDS2ServiceInstance2, ((String) objArr3[0]).intern());
        createTransaction = (getSDKVersion + 113) % 128;
        return containsVar2;
    }

    public static void init$0() {
        $$a = new byte[]{4, 5, 20, -37};
        $$b = 3;
    }

    public static contains initialize(Context context, ju juVar) {
        jo joVar = juVar.get(UiCustomization.ButtonType.CONTINUE);
        ThreeDS2ServiceInstance threeDS2ServiceInstance = ThreeDS2ServiceInstance.getWarnings;
        Object[] objArr = new Object[1];
        b("둋䠙䳻䅏䔠姰幐删嚅歖漧排恛擄碘絹燗疞ਉໜʲܑᯧᾹᰅჼᕽ⤧ⷵ≟☣㪃", ((byte) KeyEvent.getModifierMetaStateMask()) + 64602, objArr);
        contains containsVar = new contains(context, null, joVar, threeDS2ServiceInstance, ((String) objArr[0]).intern());
        getSDKVersion = (createTransaction + 79) % 128;
        return containsVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.writeReplace
    public void ThreeDS2Service(setScroller setscroller) {
        String unionSchemeConfiguration;
        initialize();
        switch (AnonymousClass1.get[this.ThreeDS2ServiceInstance.ordinal()]) {
            case 1:
                unionSchemeConfiguration = setscroller.unionSchemeConfiguration();
                break;
            case 2:
                unionSchemeConfiguration = setscroller.eftposConfiguration();
                break;
            case 3:
            case 4:
                unionSchemeConfiguration = setscroller.dinersSchemeConfiguration();
                break;
            case 5:
                unionSchemeConfiguration = setscroller.getSchemeLogo();
                createTransaction = (getSDKVersion + 89) % 128;
                break;
            case 6:
                unionSchemeConfiguration = setscroller.cbConfiguration();
                getSDKVersion = (createTransaction + 33) % 128;
                break;
            case 7:
                unionSchemeConfiguration = setscroller.SchemeConfigurationBuilder();
                break;
            default:
                Object[] objArr = new Object[1];
                a(true, 1 - TextUtils.lastIndexOf("", '0', 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 18, "\u000b￦\u0002\r\u0016\u0011ﾽ\u000b\f\u0011\u0011\u0012\uffffﾽ\u0001\u0006\t\ufffe\u0013", View.MeasureSpec.makeMeasureSpec(0, 0) + EnumC0170g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, objArr);
                a$$ExternalSyntheticBUOutline0.m$1(((String) objArr[0]).intern());
                return;
        }
        if (!oj.getWarnings((CharSequence) unionSchemeConfiguration)) {
            ThreeDS2Service().setVisibility(0);
            ThreeDS2Service().setText(unionSchemeConfiguration);
            getWarnings(ThreeDS2Service(), this.ThreeDS2Service);
            return;
        }
        int i = getSDKVersion + 119;
        createTransaction = i % 128;
        if (i % 2 == 0) {
            ThreeDS2Service().setVisibility(50);
            ((ViewGroup) ThreeDS2Service().getParent()).setVisibility(88);
        } else {
            ThreeDS2Service().setVisibility(8);
            ((ViewGroup) ThreeDS2Service().getParent()).setVisibility(8);
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.loadFromXML
    public /* synthetic */ Button ThreeDS2ServiceInstance(Context context) {
        int i = createTransaction + 19;
        getSDKVersion = i % 128;
        if (i % 2 != 0) {
            Z_(context);
            throw null;
        }
        Button Z_ = Z_(context);
        createTransaction = (getSDKVersion + 61) % 128;
        return Z_;
    }

    public Button Z_(Context context) {
        Button button = new Button(context);
        button.setVisibility(8);
        button.setTransformationMethod(null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i = es.initialize;
        layoutParams.setMargins(0, i, 0, i);
        button.setLayoutParams(layoutParams);
        button.setMinHeight(es.getSDKInfo);
        button.setOnClickListener(new save(this));
        aa_(button);
        int i2 = getSDKVersion + 77;
        createTransaction = i2 % 128;
        if (i2 % 2 != 0) {
            return button;
        }
        throw null;
    }

    public static contains ThreeDS2ServiceInstance(Context context, ju juVar) {
        return (contains) getWarnings(new Object[]{context, juVar}, -1745958251, 1745958252, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ void initialize(contains containsVar, View view) {
        int i = getSDKVersion + 119;
        createTransaction = i % 128;
        int i2 = i % 2;
        containsVar.ThreeDS2Service(view);
        if (i2 == 0) {
            int i3 = 19 / 0;
        }
        createTransaction = (getSDKVersion + 63) % 128;
    }

    public static contains get(Context context, ju juVar) {
        jo joVar = juVar.get(UiCustomization.ButtonType.ADD_CH);
        ThreeDS2ServiceInstance threeDS2ServiceInstance = ThreeDS2ServiceInstance.getSDKInfo;
        Object[] objArr = new Object[1];
        a(false, Gravity.getAbsoluteGravity(0, 0) + 19, (-16777184) - Color.rgb(0, 0, 0), "�\u0002\ufffb\u0006\u0006\uffff\b\u0001\uffff\ufff9\ufffb\ufffe\ufffe\ufff9\u0006\ufffb￼\uffff\u0006�\u0002\ufffb\u0006\u0006\uffff\b\u0001\uffff\ufff9\u000f\u0003\ufff9", 276 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
        contains containsVar = new contains(context, null, joVar, threeDS2ServiceInstance, ((String) objArr[0]).intern());
        int i = getSDKVersion + 15;
        createTransaction = i % 128;
        if (i % 2 != 0) {
            return containsVar;
        }
        throw null;
    }

    public static contains getWarnings(Context context, ju juVar) {
        jo joVar = juVar.get(UiCustomization.ButtonType.CONTINUE);
        ThreeDS2ServiceInstance threeDS2ServiceInstance = ThreeDS2ServiceInstance.get;
        Object[] objArr = new Object[1];
        a(false, View.MeasureSpec.makeMeasureSpec(0, 0) + 31, (ViewConfiguration.getPressedStateDuration() >> 16) + 31, "\ufffb\u0000\ufff9\u0004\u0004�\u0006\uffff�\ufff7\r\u0001\ufff7\u0007\u0007\ufffa\ufff7\ufffb\u0007\u0006\f\u0001\u0006\r�\ufff7\u0004\ufff9\ufffa�\u0004", TextUtils.indexOf((CharSequence) "", '0') + EnumC0170g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, objArr);
        contains containsVar = new contains(context, null, joVar, threeDS2ServiceInstance, ((String) objArr[0]).intern());
        int i = getSDKVersion + 3;
        createTransaction = i % 128;
        if (i % 2 == 0) {
            int i2 = 67 / 0;
        }
        return containsVar;
    }

    public void getWarnings(computeIfAbsent computeifabsent) {
        int i = createTransaction + 65;
        int i2 = i % 128;
        getSDKVersion = i2;
        if (i % 2 == 0) {
            this.ThreeDS2ServiceInitializationCallback = computeifabsent;
            int i3 = i2 + 111;
            createTransaction = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.ThreeDS2ServiceInitializationCallback = computeifabsent;
        throw null;
    }

    public static contains ThreeDS2Service(Context context, ju juVar) {
        jo joVar = juVar.get(UiCustomization.ButtonType.RESEND);
        ThreeDS2ServiceInstance threeDS2ServiceInstance = ThreeDS2ServiceInstance.ThreeDS2ServiceInstance;
        Object[] objArr = new Object[1];
        a(false, 27 - (ViewConfiguration.getLongPressTimeout() >> 16), ExpandableListView.getPackedPositionType(0L) + 37, "\r\u0001\ufff7\n�\u000b�\u0006￼\ufff7\u0001\u0006\ufffe\u0007\n\u0005\ufff9\f\u0001\u0007\u0006\ufff7\u0004\ufff9\ufffa�\u0004\ufffb\u0000\ufff9\u0004\u0004�\u0006\uffff�\ufff7", (ViewConfiguration.getLongPressTimeout() >> 16) + EnumC0170g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, objArr);
        contains containsVar = new contains(context, null, joVar, threeDS2ServiceInstance, ((String) objArr[0]).intern());
        createTransaction = (getSDKVersion + 103) % 128;
        return containsVar;
    }

    private void ThreeDS2Service(View view) {
        Context context = view.getContext();
        Object[] objArr = new Object[1];
        a(false, Color.blue(0) + 12, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12, "�\u0002\u0004\t\b\ufff3\u0001\ufff9\b￼\u0003\ufff8", MotionEvent.axisFromString("") + EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_VALUE, objArr);
        ((InputMethodManager) context.getSystemService(((String) objArr[0]).intern())).hideSoftInputFromWindow(view.getRootView().getWindowToken(), 0);
        if (this.ThreeDS2ServiceInitializationCallback == null) {
            getSDKVersion = (createTransaction + 27) % 128;
        }
        switch (AnonymousClass1.get[this.ThreeDS2ServiceInstance.ordinal()]) {
            case 1:
            case 6:
            case 7:
                this.ThreeDS2ServiceInitializationCallback.get(null);
                break;
            case 2:
                computeIfAbsent computeifabsent = this.ThreeDS2ServiceInitializationCallback;
                Object[] objArr2 = new Object[1];
                b("둱", TextUtils.getOffsetAfter("", 0) + 60041, objArr2);
                computeifabsent.get(new bg(((String) objArr2[0]).intern()));
                break;
            case 3:
            case 4:
                this.ThreeDS2ServiceInitializationCallback.get(this.getWarnings.ThreeDS2ServiceInstance());
                createTransaction = (getSDKVersion + 55) % 128;
                break;
            case 5:
                computeIfAbsent computeifabsent2 = this.ThreeDS2ServiceInitializationCallback;
                Object[] objArr3 = new Object[1];
                b("둜Ǳ\udf0b镌", View.MeasureSpec.makeMeasureSpec(0, 0) + 46507, objArr3);
                computeifabsent2.get(new bg(((String) objArr3[0]).intern()));
                break;
        }
    }

    public static contains ThreeDS2Service(Context context, getServices getservices, ju juVar) {
        return (contains) getWarnings(new Object[]{context, getservices, juVar}, -1565204224, 1565204224, (int) System.currentTimeMillis());
    }
}
