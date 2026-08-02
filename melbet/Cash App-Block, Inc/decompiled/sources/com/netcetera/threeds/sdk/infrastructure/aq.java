package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.lang.reflect.Method;
import java.util.Map;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes5.dex */
public class aq extends loadFromXML<LinearLayout> implements containsValue {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char ConfigParameters;
    private static final String ThreeDS2Service;
    private static final String ThreeDS2ServiceInstance;
    private static char[] addParam;
    private static int apiKey;
    private static int configureScheme;
    private static final String get;
    private static final String getWarnings;
    private static long onError;
    private final jr ThreeDS2ServiceInitializationCallback;
    private final isEmpty cleanup;
    private TextView createTransaction;
    private TextView getParamValue;
    private TextView getSDKInfo;
    private final getWarnings getSDKVersion;
    private boolean onCompleted;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.aq$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        private static int ThreeDS2ServiceInstance = 0;
        static final /* synthetic */ int[] getWarnings;
        private static int initialize = 1;

        static {
            int[] iArr = new int[getWarnings.values().length];
            getWarnings = iArr;
            try {
                iArr[getWarnings.ThreeDS2ServiceInstance.ordinal()] = 1;
                int i = ThreeDS2ServiceInstance;
                initialize = SVG$Unit$EnumUnboxingLocalUtility.m$1((i | 44) << 1, i ^ 44, 1, 128);
            } catch (NoSuchFieldError unused) {
            }
            try {
                getWarnings[getWarnings.getWarnings.ordinal()] = 2;
                int i2 = initialize;
                ThreeDS2ServiceInstance = ((-2) - ((((i2 | 38) << 1) - (i2 ^ 38)) ^ (-1))) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            int i3 = initialize;
            int i4 = i3 | 31;
            int i5 = i4 << 1;
            int i6 = -((~(i3 & 31)) & i4);
            int i7 = (i5 & i6) + (i6 | i5);
            ThreeDS2ServiceInstance = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class getWarnings {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static final /* synthetic */ getWarnings[] ThreeDS2Service;
        public static final getWarnings ThreeDS2ServiceInstance;
        private static char get;
        private static int getSDKInfo;
        private static int getSDKVersion;
        public static final getWarnings getWarnings;
        private static char[] initialize;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getSDKVersion = 0;
            getSDKInfo = 1;
            getWarnings();
            Object[] objArr = new Object[1];
            a((byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 99), "\r\u0000\f\u0004\u0004\u0007㙙", (ViewConfiguration.getWindowTouchSlop() >> 8) + 7, objArr);
            ThreeDS2ServiceInstance = new getWarnings(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            a((byte) (TextUtils.indexOf("", "") + 34), "\n\r\u000f\u0003\u0006\u000b\u0003\u0004\n\u0006", (ViewConfiguration.getEdgeSlop() >> 16) + 10, objArr2);
            getWarnings = new getWarnings(((String) objArr2[0]).intern(), 1);
            ThreeDS2Service = ThreeDS2ServiceInstance();
            getSDKInfo = (getSDKVersion + 103) % 128;
        }

        private getWarnings(String str, int i) {
        }

        private static /* synthetic */ getWarnings[] ThreeDS2ServiceInstance() {
            int i = (getSDKVersion + 97) % 128;
            getSDKInfo = i;
            getWarnings[] getwarningsArr = {ThreeDS2ServiceInstance, getWarnings};
            int i2 = i + 57;
            getSDKVersion = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 48 / 0;
            }
            return getwarningsArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x0131, code lost:
        
            if (r9 == r10) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0156, code lost:
        
            r8 = new java.lang.Object[13];
            r8[12] = r5;
            r8[11] = java.lang.Integer.valueOf(r3);
            r8[10] = r5;
            r8[9] = r5;
            r8[8] = java.lang.Integer.valueOf(r3);
            r8[7] = r5;
            r8[6] = r5;
            r8[5] = java.lang.Integer.valueOf(r3);
            r8[4] = r5;
            r8[3] = r5;
            r8[r42] = java.lang.Integer.valueOf(r3);
            r8[1] = r5;
            r8[r11] = r5;
            r9 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
            r22 = r9.get(-1395483366);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x019e, code lost:
        
            if (r22 == null) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x01a0, code lost:
        
            r26 = r11;
            r23 = '\t';
            r24 = 7;
            r25 = '\b';
            r10 = r22;
            r22 = 6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x020c, code lost:
        
            r8 = ((java.lang.Integer) ((java.lang.reflect.Method) r10).invoke(null, r8)).intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0219, code lost:
        
            r10 = r5.cleanup;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x021b, code lost:
        
            if (r8 != r10) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x021d, code lost:
        
            com.netcetera.threeds.sdk.infrastructure.aq.getWarnings.$11 = (com.netcetera.threeds.sdk.infrastructure.aq.getWarnings.$10 + 45) % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0227, code lost:
        
            r8 = new java.lang.Object[11];
            r8[10] = r5;
            r8[r23] = java.lang.Integer.valueOf(r3);
            r8[r25] = r5;
            r8[r24] = java.lang.Integer.valueOf(r3);
            r8[r22] = java.lang.Integer.valueOf(r3);
            r8[5] = r5;
            r8[4] = r5;
            r8[3] = java.lang.Integer.valueOf(r3);
            r8[r42] = java.lang.Integer.valueOf(r3);
            r8[1] = r5;
            r8[r26] = r5;
            r10 = r9.get(1507360409);
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0259, code lost:
        
            if (r10 == null) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x029c, code lost:
        
            r8 = ((java.lang.Integer) ((java.lang.reflect.Method) r10).invoke(null, r8)).intValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x02a9, code lost:
        
            r9 = (r5.ThreeDS2ServiceInstance * r3) + r5.cleanup;
            r10 = r5.getWarnings;
            r4[r10] = r6[r8];
            r4[r10 + 1] = r6[r9];
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x025c, code lost:
        
            r10 = r26;
            r10 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(47 - android.view.View.combineMeasuredStates(r10, r10), (char) (25643 - android.graphics.ImageFormat.getBitsPerPixel(r10)), 11489 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8));
            r29 = java.lang.Integer.TYPE;
            r10 = r10.getMethod("x", java.lang.Object.class, java.lang.Object.class, r29, r29, java.lang.Object.class, java.lang.Object.class, r29, r29, java.lang.Object.class, r29, java.lang.Object.class);
            r9.put(1507360409, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x02bf, code lost:
        
            r8 = r5.ThreeDS2Service;
            r9 = r5.ThreeDS2ServiceInstance;
            r12 = r5.ThreeDS2ServiceInitializationCallback;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x02c6, code lost:
        
            if (r8 != r9) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x02c8, code lost:
        
            r12 = com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility.m(r12, r3, 1, r3);
            r5.ThreeDS2ServiceInitializationCallback = r12;
            r10 = com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility.m(r10, r3, 1, r3);
            r5.cleanup = r10;
            r9 = (r9 * r3) + r10;
            r10 = r5.getWarnings;
            r4[r10] = r6[(r8 * r3) + r12];
            r4[r10 + 1] = r6[r9];
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x02e5, code lost:
        
            r8 = (r8 * r3) + r10;
            r10 = r5.getWarnings;
            r4[r10] = r6[r8];
            r4[r10 + 1] = r6[(r9 * r3) + r12];
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x01ad, code lost:
        
            r23 = '\t';
            r24 = 7;
            r25 = '\b';
            r22 = 6;
            r12 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(android.graphics.Color.argb(r11, r11, r11, r11) + 48, (char) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), android.text.TextUtils.lastIndexOf("", '0') + 3222);
            r13 = (byte) (com.netcetera.threeds.sdk.infrastructure.aq.getWarnings.$$b & 3);
            r14 = (byte) (r13 - 1);
            r26 = r11;
            r10 = new java.lang.Object[1];
            b(r13, r14, r14, r10);
            r10 = (java.lang.String) r10[r26];
            r30 = java.lang.Integer.TYPE;
            r10 = r12.getMethod(r10, java.lang.Object.class, java.lang.Object.class, r30, java.lang.Object.class, java.lang.Object.class, r30, java.lang.Object.class, java.lang.Object.class, r30, java.lang.Object.class, java.lang.Object.class, r30, java.lang.Object.class);
            r9.put(-1395483366, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0140, code lost:
        
            r4[r8] = (char) (r5.get - r41);
            r4[r8 + 1] = (char) (r5.initialize - r41);
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x013e, code lost:
        
            if (r9 == r10) goto L44;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(byte b, String str, int i, Object[] objArr) {
            int i2;
            int length;
            char[] cArr;
            char[] cArr2;
            Object method;
            char[] charArray = str != null ? str.toCharArray() : str;
            getParamValue getparamvalue = new getParamValue();
            char[] cArr3 = initialize;
            Class cls = Integer.TYPE;
            char c = 2;
            int i3 = 0;
            if (cArr3 != null) {
                int i4 = $10 + 43;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    length = cArr3.length;
                    cArr = new char[length];
                } else {
                    length = cArr3.length;
                    cArr = new char[length];
                }
                int i5 = 0;
                while (i5 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                        char c2 = c;
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj = map.get(-78420608);
                        if (obj != null) {
                            cArr2 = charArray;
                            method = obj;
                        } else {
                            cArr2 = charArray;
                            Class cls2 = (Class) removeParam.initialize(94 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (PointF.length(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), 1559 - View.combineMeasuredStates(0, 0));
                            Object[] objArr3 = new Object[1];
                            b((byte) 0, (short) 0, 0, objArr3);
                            method = cls2.getMethod((String) objArr3[0], cls);
                            map.put(-78420608, method);
                        }
                        cArr[i5] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        i5++;
                        c = c2;
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
            char c3 = c;
            Object[] objArr4 = {Integer.valueOf(get)};
            Map map2 = removeParam.visaSchemeConfiguration;
            Object obj2 = map2.get(-78420608);
            if (obj2 == null) {
                Class cls3 = (Class) removeParam.initialize(93 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) Color.blue(0), (Process.myTid() >> 22) + 1559);
                Object[] objArr5 = new Object[1];
                b((byte) 0, (short) 0, 0, objArr5);
                obj2 = cls3.getMethod((String) objArr5[0], cls);
                map2.put(-78420608, obj2);
            }
            char charValue = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
            char[] cArr5 = new char[i];
            if (i % 2 != 0) {
                $11 = ($10 + 27) % 128;
                i2 = i - 1;
                cArr5[i2] = (char) (cArr4[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                getparamvalue.getWarnings = 0;
                while (true) {
                    int i6 = getparamvalue.getWarnings;
                    if (i6 >= i2) {
                        break;
                    }
                    int i7 = $10 + 119;
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        char c4 = cArr4[i6];
                        getparamvalue.get = c4;
                        char c5 = cArr4[i6];
                        getparamvalue.initialize = c5;
                    } else {
                        char c6 = cArr4[i6];
                        getparamvalue.get = c6;
                        char c7 = cArr4[i6 + 1];
                        getparamvalue.initialize = c7;
                    }
                    getparamvalue.getWarnings += 2;
                    i3 = 0;
                }
            }
            for (int i8 = 0; i8 < i; i8++) {
                $11 = ($10 + 51) % 128;
                cArr5[i8] = (char) (cArr5[i8] ^ 13722);
            }
            objArr[0] = new String(cArr5);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(byte b, short s, int i, Object[] objArr) {
            int i2;
            int i3 = (s * 2) + 4;
            byte[] bArr = $$a;
            int i4 = i * 4;
            int i5 = 119 - (b * 2);
            byte[] bArr2 = new byte[i4 + 1];
            if (bArr == null) {
                byte[] bArr3 = bArr;
                int i6 = 0;
                int i7 = i3;
                i5 += -i3;
                i3 = i7 + 1;
                bArr = bArr3;
                i2 = i6;
                bArr2[i2] = (byte) i5;
                i6 = i2 + 1;
                if (i2 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                byte b2 = bArr[i3];
                byte[] bArr4 = bArr;
                i7 = i3;
                i3 = b2;
                bArr3 = bArr4;
                i5 += -i3;
                i3 = i7 + 1;
                bArr = bArr3;
                i2 = i6;
                bArr2[i2] = (byte) i5;
                i6 = i2 + 1;
                if (i2 == i4) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i5;
                i6 = i2 + 1;
                if (i2 == i4) {
                }
            }
        }

        public static void getWarnings() {
            initialize = new char[]{37939, 37906, 37909, 37941, 37942, 37943, 37916, 37908, 37891, 37919, 37918, 37898, 37901, 37940, 37890, 37915};
            get = (char) 41444;
        }

        public static void init$0() {
            $$a = new byte[]{116, PnmConstants.PNM_SEPARATOR, -47, 79};
            $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE;
        }

        public static getWarnings valueOf(String str) {
            int i = getSDKVersion + 3;
            getSDKInfo = i % 128;
            if (i % 2 == 0) {
                Enum.valueOf(getWarnings.class, str);
                throw null;
            }
            getWarnings getwarnings = (getWarnings) Enum.valueOf(getWarnings.class, str);
            getSDKInfo = (getSDKVersion + 3) % 128;
            return getwarnings;
        }

        public static getWarnings[] values() {
            int i = getSDKVersion + 25;
            getSDKInfo = i % 128;
            if (i % 2 != 0) {
                return (getWarnings[]) ThreeDS2Service.clone();
            }
            int i2 = 10 / 0;
            return (getWarnings[]) ThreeDS2Service.clone();
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        configureScheme = 0;
        apiKey = 1;
        getWarnings();
        Object[] objArr = new Object[1];
        b((byte) ((ViewConfiguration.getTapTimeout() >> 16) + 119), KeyEvent.getDeadChar(0, 0) + 1, "\u17ff", objArr);
        ThreeDS2ServiceInstance = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("ꚰꚛ뜖パ飔", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
        ThreeDS2Service = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        b((byte) (3 - Process.getGidForName("")), TextUtils.getCapsMode("", 0, 0) + 25, "\r\u0018\u0004\u001c\u001f\u0000\u0006\u0000\u001b\u0000\r\u0018\u0004\u001c\u001f\u0000\"\u001d\u001c\"\u0013\f\u001c\u0018㗧", objArr3);
        getWarnings = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        a("ᆍᇚ姩\ue423忈뼠譧⤘㹣\uec62亱ꉀ⓽ꓹ⬳ӧ\ude65फ़떢潬篩\uefe4ḹ\uf1daᕼ呬", (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, objArr4);
        get = ((String) objArr4[0]).intern();
        configureScheme = (apiKey + 43) % 128;
    }

    public aq(Context context, getWarnings getwarnings, jr jrVar, isEmpty isempty) {
        super(context);
        this.ThreeDS2ServiceInitializationCallback = jrVar;
        this.getSDKVersion = getwarnings;
        this.cleanup = isempty;
        this.onCompleted = false;
    }

    private /* synthetic */ void ThreeDS2ServiceInstance(View view) {
        boolean z;
        int i = (apiKey + 11) % 128;
        configureScheme = i;
        if (this.onCompleted) {
            z = false;
        } else {
            apiKey = (i + 91) % 128;
            z = true;
        }
        this.onCompleted = z;
        initialize(new Object[]{this}, 1319879096, -1319879096, System.identityHashCode(this));
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] cArr;
        char c;
        if (str != null) {
            $11 = ($10 + 39) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        onCompleted oncompleted = new onCompleted();
        char[] initialize = onCompleted.initialize(onError ^ (-2776494906517314268L), cArr, i);
        oncompleted.initialize = 4;
        $10 = ($11 + 125) % 128;
        while (true) {
            int i2 = oncompleted.initialize;
            if (i2 >= initialize.length) {
                objArr[0] = new String(initialize, 4, initialize.length - 4);
                return;
            }
            $11 = ($10 + 103) % 128;
            int i3 = i2 - 4;
            oncompleted.ThreeDS2Service = i3;
            try {
                Object[] objArr2 = {Long.valueOf(initialize[i2] ^ initialize[i2 % 4]), Long.valueOf(i3), Long.valueOf(onError)};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1242395160);
                if (obj != null) {
                    c = 1;
                } else {
                    Class cls = (Class) removeParam.initialize((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 47, (char) ((ViewConfiguration.getTapTimeout() >> 16) + 27780), TextUtils.indexOf("", "") + 2441);
                    Object[] objArr3 = new Object[1];
                    c = 1;
                    c((byte) 0, (short) -1, 7, objArr3);
                    String str2 = (String) objArr3[0];
                    Class cls2 = Long.TYPE;
                    obj = cls.getMethod(str2, cls2, cls2, cls2);
                    map.put(-1242395160, obj);
                }
                initialize[i2] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr4 = new Object[2];
                objArr4[c] = oncompleted;
                objArr4[0] = oncompleted;
                Object obj2 = map.get(1526822639);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 66, (char) (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), 14234 - TextUtils.indexOf((CharSequence) "", '0'))).getMethod("s", Object.class, Object.class);
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
        char[] cArr;
        char c;
        int i2;
        long j;
        char c2;
        char c3;
        char c4;
        char c5;
        Object method;
        int i3 = 2;
        if (str != null) {
            int i4 = $10 + 9;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        getParamValue getparamvalue = new getParamValue();
        char[] cArr3 = addParam;
        Class cls = Integer.TYPE;
        char c6 = '0';
        int i5 = 1;
        int i6 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            c = '\t';
            int i7 = 0;
            while (i7 < length) {
                int i8 = i3;
                int i9 = $11 + 73;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i7])};
                        Map map = removeParam.visaSchemeConfiguration;
                        Object obj = map.get(-78420608);
                        if (obj != null) {
                            c5 = c6;
                            method = obj;
                        } else {
                            c5 = c6;
                            Class cls2 = (Class) removeParam.initialize(93 - TextUtils.lastIndexOf("", c6, i6), (char) View.combineMeasuredStates(i6, i6), AndroidCharacter.getMirror(c5) + 1511);
                            Object[] objArr3 = new Object[i5];
                            c((byte) 0, (short) -1, 0, objArr3);
                            method = cls2.getMethod((String) objArr3[0], cls);
                            map.put(-78420608, method);
                        }
                        cArr4[i7] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        c6 = c5;
                        i3 = i8;
                        i7 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    char c7 = c6;
                    Object[] objArr4 = {Integer.valueOf(cArr3[i7])};
                    Map map2 = removeParam.visaSchemeConfiguration;
                    Object obj2 = map2.get(-78420608);
                    if (obj2 == null) {
                        Class cls3 = (Class) removeParam.initialize(Process.getGidForName("") + 95, (char) View.MeasureSpec.makeMeasureSpec(0, 0), 1559 - TextUtils.indexOf("", "", 0, 0));
                        Object[] objArr5 = new Object[1];
                        c((byte) 0, (short) -1, 0, objArr5);
                        obj2 = cls3.getMethod((String) objArr5[0], cls);
                        map2.put(-78420608, obj2);
                    }
                    cArr4[i7] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                    i7++;
                    c6 = c7;
                    i3 = i8;
                }
                i5 = 1;
                i6 = 0;
            }
            cArr3 = cArr4;
        } else {
            c = '\t';
        }
        int i10 = i3;
        char c8 = c6;
        Object[] objArr6 = {Integer.valueOf(ConfigParameters)};
        Map map3 = removeParam.visaSchemeConfiguration;
        Object obj3 = map3.get(-78420608);
        long j2 = 0;
        float f = RecyclerView.DECELERATION_RATE;
        if (obj3 == null) {
            Class cls4 = (Class) removeParam.initialize(95 - (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), KeyEvent.keyCodeFromString("") + 1559);
            Object[] objArr7 = new Object[1];
            c((byte) 0, (short) -1, 0, objArr7);
            obj3 = cls4.getMethod((String) objArr7[0], cls);
            map3.put(-78420608, obj3);
        }
        char charValue = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr5[i2] = (char) (cArr2[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            getparamvalue.getWarnings = 0;
            while (true) {
                int i11 = getparamvalue.getWarnings;
                if (i11 >= i2) {
                    break;
                }
                char c9 = cArr2[i11];
                getparamvalue.get = c9;
                char c10 = cArr2[i11 + 1];
                getparamvalue.initialize = c10;
                if (c9 == c10) {
                    cArr5[i11] = (char) (c9 - b);
                    cArr5[i11 + 1] = (char) (c10 - b);
                    c4 = c8;
                    j = j2;
                } else {
                    Object[] objArr8 = new Object[13];
                    objArr8[12] = getparamvalue;
                    objArr8[11] = Integer.valueOf(charValue);
                    objArr8[10] = getparamvalue;
                    objArr8[c] = getparamvalue;
                    objArr8[8] = Integer.valueOf(charValue);
                    objArr8[7] = getparamvalue;
                    objArr8[6] = getparamvalue;
                    objArr8[5] = Integer.valueOf(charValue);
                    objArr8[4] = getparamvalue;
                    objArr8[3] = getparamvalue;
                    objArr8[i10] = Integer.valueOf(charValue);
                    objArr8[1] = getparamvalue;
                    objArr8[0] = getparamvalue;
                    Map map4 = removeParam.visaSchemeConfiguration;
                    j = j2;
                    Object obj4 = map4.get(-1395483366);
                    if (obj4 != null) {
                        c3 = 7;
                        c2 = '\b';
                    } else {
                        Class cls5 = (Class) removeParam.initialize(49 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), (char) (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)), 3221 - View.MeasureSpec.getMode(0));
                        Object[] objArr9 = new Object[1];
                        c2 = '\b';
                        c3 = 7;
                        c((byte) 0, (short) -1, i10, objArr9);
                        String str2 = (String) objArr9[0];
                        Class cls6 = Integer.TYPE;
                        obj4 = cls5.getMethod(str2, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class, Object.class, cls6, Object.class);
                        map4.put(-1395483366, obj4);
                    }
                    int intValue = ((Integer) ((Method) obj4).invoke(null, objArr8)).intValue();
                    int i12 = getparamvalue.cleanup;
                    if (intValue == i12) {
                        $11 = ($10 + 11) % 128;
                        Object[] objArr10 = new Object[11];
                        objArr10[10] = getparamvalue;
                        objArr10[c] = Integer.valueOf(charValue);
                        objArr10[c2] = getparamvalue;
                        objArr10[c3] = Integer.valueOf(charValue);
                        objArr10[6] = Integer.valueOf(charValue);
                        objArr10[5] = getparamvalue;
                        objArr10[4] = getparamvalue;
                        objArr10[3] = Integer.valueOf(charValue);
                        objArr10[2] = Integer.valueOf(charValue);
                        objArr10[1] = getparamvalue;
                        objArr10[0] = getparamvalue;
                        Object obj5 = map4.get(1507360409);
                        if (obj5 != null) {
                            c4 = c8;
                        } else {
                            c4 = c8;
                            Class cls7 = (Class) removeParam.initialize(ExpandableListView.getPackedPositionGroup(j) + 47, (char) (25643 - TextUtils.indexOf("", c4, 0, 0)), (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 11489);
                            Class cls8 = Integer.TYPE;
                            obj5 = cls7.getMethod("x", Object.class, Object.class, cls8, cls8, Object.class, Object.class, cls8, cls8, Object.class, cls8, Object.class);
                            map4.put(1507360409, obj5);
                        }
                        int intValue2 = ((Integer) ((Method) obj5).invoke(null, objArr10)).intValue();
                        int i13 = (getparamvalue.ThreeDS2ServiceInstance * charValue) + getparamvalue.cleanup;
                        int i14 = getparamvalue.getWarnings;
                        cArr5[i14] = cArr3[intValue2];
                        cArr5[i14 + 1] = cArr3[i13];
                    } else {
                        c4 = c8;
                        int i15 = getparamvalue.ThreeDS2Service;
                        int i16 = getparamvalue.ThreeDS2ServiceInstance;
                        int i17 = getparamvalue.ThreeDS2ServiceInitializationCallback;
                        if (i15 == i16) {
                            int m = Thread$State$EnumUnboxingLocalUtility.m(i17, charValue, 1, charValue);
                            getparamvalue.ThreeDS2ServiceInitializationCallback = m;
                            int m2 = Thread$State$EnumUnboxingLocalUtility.m(i12, charValue, 1, charValue);
                            getparamvalue.cleanup = m2;
                            int i18 = (i16 * charValue) + m2;
                            int i19 = getparamvalue.getWarnings;
                            cArr5[i19] = cArr3[(i15 * charValue) + m];
                            cArr5[i19 + 1] = cArr3[i18];
                            $11 = ($10 + 81) % 128;
                        } else {
                            int i20 = (i15 * charValue) + i12;
                            int i21 = getparamvalue.getWarnings;
                            cArr5[i21] = cArr3[i20];
                            cArr5[i21 + 1] = cArr3[(i16 * charValue) + i17];
                            $10 = ($11 + 111) % 128;
                            i10 = 2;
                            getparamvalue.getWarnings += 2;
                            c8 = c4;
                            j2 = j;
                            f = RecyclerView.DECELERATION_RATE;
                        }
                    }
                }
                i10 = 2;
                getparamvalue.getWarnings += 2;
                c8 = c4;
                j2 = j;
                f = RecyclerView.DECELERATION_RATE;
            }
        }
        for (int i22 = 0; i22 < i; i22++) {
            cArr5[i22] = (char) (cArr5[i22] ^ 13722);
        }
        objArr[0] = new String(cArr5);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, short s, int i, Object[] objArr) {
        int i2;
        int i3 = 119 - i;
        int i4 = b * 2;
        int i5 = s + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i4];
        int i6 = 0 - i4;
        if (bArr == null) {
            int i7 = i3;
            i2 = 0;
            i3 = i6;
            i3 += i7;
            i5++;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2++;
            i7 = bArr[i5];
            i3 += i7;
            i5++;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i5++;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    public static /* synthetic */ void get(aq aqVar, View view) {
        int i = apiKey + 89;
        configureScheme = i % 128;
        int i2 = i % 2;
        aqVar.ThreeDS2ServiceInstance(view);
        if (i2 != 0) {
            throw null;
        }
    }

    public static void init$0() {
        $$a = new byte[]{119, -84, 99, -31};
        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE;
    }

    public static /* synthetic */ Object initialize(Object[] objArr, int i, int i2, int i3) {
        aq aqVar = (aq) objArr[0];
        int i4 = (apiKey + 41) % 128;
        configureScheme = i4;
        if (!aqVar.onCompleted) {
            aqVar.getSDKInfo.setVisibility(8);
            TextView textView = aqVar.getParamValue;
            Object[] objArr2 = new Object[1];
            a("ꚰꚛ뜖パ飔", -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr2);
            textView.setText(((String) objArr2[0]).intern());
            return null;
        }
        apiKey = (i4 + 79) % 128;
        aqVar.getSDKInfo.setVisibility(0);
        TextView textView2 = aqVar.getParamValue;
        Object[] objArr3 = new Object[1];
        b((byte) (Color.red(0) + 119), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u17ff", objArr3);
        textView2.setText(((String) objArr3[0]).intern());
        apiKey = (configureScheme + 45) % 128;
        return null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.writeReplace
    public void ThreeDS2Service(setScroller setscroller) {
        int i = configureScheme + 21;
        apiKey = i % 128;
        if (i % 2 == 0) {
            initialize();
            int i2 = AnonymousClass3.getWarnings[this.getSDKVersion.ordinal()];
            throw null;
        }
        initialize();
        int i3 = AnonymousClass3.getWarnings[this.getSDKVersion.ordinal()];
        if (i3 == 1) {
            getWarnings(setscroller.getSchemeLogoDark(), setscroller.newSchemeConfiguration());
        } else if (i3 == 2) {
            getWarnings(setscroller.build(), setscroller.SchemeConfiguration());
        }
        int i4 = apiKey + 79;
        configureScheme = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
    }

    public LinearLayout ax_(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setLayoutParams(layoutParams);
        linearLayout2.setOrientation(0);
        linearLayout2.setMinimumHeight(es.getSDKInfo);
        linearLayout2.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        TextView textView = new TextView(context);
        this.createTransaction = textView;
        textView.setLayoutParams(layoutParams2);
        TextView textView2 = this.createTransaction;
        int i = es.getSDKVersion;
        int i2 = es.ThreeDS2Service;
        textView2.setPadding(i, i2, i, i2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        TextView textView3 = new TextView(context);
        this.getParamValue = textView3;
        Object[] objArr = new Object[1];
        a("ꚰꚛ뜖パ飔", (Process.myTid() >> 22) + 1, objArr);
        textView3.setText(((String) objArr[0]).intern());
        TextView textView4 = this.getParamValue;
        Object[] objArr2 = new Object[1];
        b((byte) (38 - View.resolveSize(0, 0)), -ImageFormat.getBitsPerPixel(0), "㕠", objArr2);
        textView4.setContentDescription(((String) objArr2[0]).intern());
        this.getParamValue.setTypeface(null, 1);
        this.getParamValue.setLayoutParams(layoutParams3);
        this.getParamValue.setPadding(i, i2, i, i2);
        linearLayout2.addView(this.createTransaction);
        linearLayout2.addView(this.getParamValue);
        TextView textView5 = new TextView(context);
        this.getSDKInfo = textView5;
        textView5.setTextSize(0, this.createTransaction.getTextSize() * 0.9f);
        this.getSDKInfo.setPadding(i, 0, i, i2);
        linearLayout2.setOnClickListener(new am(this));
        linearLayout.addView(linearLayout2);
        linearLayout.addView(this.getSDKInfo);
        int i3 = AnonymousClass3.getWarnings[this.getSDKVersion.ordinal()];
        if (i3 == 1) {
            View view = this.createTransaction;
            Object[] objArr3 = new Object[1];
            b((byte) (32 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 27 - (Process.myTid() >> 22), "\u000e\u001c\u0017\n\u0011#!\u0006\u001a\u000b\u0013\u0016\u000b\u000e\u001c\u0002\t\u0014\u0000\u001e\u0002\t\n\u0017\u000b\u0018㘖", objArr3);
            getWarnings(view, ((String) objArr3[0]).intern());
            Object[] objArr4 = new Object[1];
            b((byte) (94 - TextUtils.getOffsetBefore("", 0)), 25 - TextUtils.indexOf((CharSequence) "", '0', 0), "\u000e\u001c\u0017\n\u0011#!\u0006\u001a\u000b\u0013\u0016\u000b\u000e\u001c\u0002\t\u0014\u0000\u001e\u0002\t#\n\u0013\f", objArr4);
            getWarnings(linearLayout2, ((String) objArr4[0]).intern());
            View view2 = this.getSDKInfo;
            Object[] objArr5 = new Object[1];
            a("\uddbf\udddc詙櫛귽沐䝗ꟸ\uedd0Ṳ쁐偲\ue8d2睦ꗇ\uf6f0ቬ\udaca㭞鵤런㱈郄ϧ\ud944蟺癚Ꙡ䋟\ue95d", 1 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr5);
            getWarnings(view2, ((String) objArr5[0]).intern());
            apiKey = (configureScheme + 43) % 128;
        } else if (i3 == 2) {
            View view3 = this.createTransaction;
            Object[] objArr6 = new Object[1];
            a("堗塴淗㯸ﲫ謞싿\uf6dbਫ਼伤酳Ĥ浺部\uf4e4Ꞧ韄㵖橭찻㉦\udbc1쇭劈峪恅❫\uf73c읐໋髠ᶽ懮ꭏ", (Process.myPid() >> 22) + 1, objArr6);
            getWarnings(view3, ((String) objArr6[0]).intern());
            Object[] objArr7 = new Object[1];
            b((byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 37), TextUtils.indexOf("", "", 0) + 29, "\u000e\u001c\u0017\n\u0011#!\u0006\u001a\u000b\u0013\u0016\u000b\u001a\u001c\u001f\u0012\"\u0002\u0007\u0012!\u001b\u0000\n \u0006\u0017㘏", objArr7);
            getWarnings(linearLayout2, ((String) objArr7[0]).intern());
            View view4 = this.getSDKInfo;
            Object[] objArr8 = new Object[1];
            b((byte) (Color.red(0) + 28), 28 - MotionEvent.axisFromString(""), "\u000e\u001c\u0017\n\u0011#!\u0006\u001a\u000b\u0013\u0016\u000b\u001a\u001c\u001f\u0012\"\u0002\u0007\u0012!\u001b\u0000\n\u001a\u0018\u001a㘊", objArr8);
            getWarnings(view4, ((String) objArr8[0]).intern());
            configureScheme = (apiKey + 23) % 128;
        }
        et.bm_(this.createTransaction, this.ThreeDS2ServiceInitializationCallback);
        et.bm_(this.getParamValue, this.ThreeDS2ServiceInitializationCallback);
        et.bm_(this.getSDKInfo, this.ThreeDS2ServiceInitializationCallback);
        initialize(new Object[]{this}, 1319879096, -1319879096, System.identityHashCode(this));
        return linearLayout;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void getWarnings(er erVar) {
        int i = apiKey + 75;
        configureScheme = i % 128;
        if (i % 2 != 0) {
            initialize();
            int i2 = AnonymousClass3.getWarnings[this.getSDKVersion.ordinal()];
            throw null;
        }
        initialize();
        int i3 = AnonymousClass3.getWarnings[this.getSDKVersion.ordinal()];
        if (i3 == 1) {
            Object[] objArr = new Object[1];
            a("ᆍᇚ姩\ue423忈뼠譧⤘㹣\uec62亱ꉀ⓽ꓹ⬳ӧ\ude65फ़떢潬篩\uefe4ḹ\uf1daᕼ呬", 1 - ExpandableListView.getPackedPositionGroup(0L), objArr);
            this.onCompleted = erVar.getWarnings(((String) objArr[0]).intern(), false).booleanValue();
            apiKey = (configureScheme + 31) % 128;
        } else if (i3 == 2) {
            Object[] objArr2 = new Object[1];
            b((byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 5), View.resolveSize(0, 0) + 25, "\r\u0018\u0004\u001c\u001f\u0000\u0006\u0000\u001b\u0000\r\u0018\u0004\u001c\u001f\u0000\"\u001d\u001c\"\u0013\f\u001c\u0018㗧", objArr2);
            this.onCompleted = erVar.getWarnings(((String) objArr2[0]).intern(), false).booleanValue();
        }
        initialize(new Object[]{this}, 1319879096, -1319879096, System.identityHashCode(this));
    }

    public static aq get(Context context, jr jrVar, isEmpty isempty) {
        aq aqVar = new aq(context, getWarnings.getWarnings, jrVar, isempty);
        apiKey = (configureScheme + 3) % 128;
        return aqVar;
    }

    public static aq ThreeDS2ServiceInstance(Context context, jr jrVar, isEmpty isempty) {
        aq aqVar = new aq(context, getWarnings.ThreeDS2ServiceInstance, jrVar, isempty);
        int i = configureScheme + 125;
        apiKey = i % 128;
        if (i % 2 != 0) {
            return aqVar;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.loadFromXML
    public /* synthetic */ LinearLayout ThreeDS2ServiceInstance(Context context) {
        int i = apiKey + 19;
        configureScheme = i % 128;
        int i2 = i % 2;
        LinearLayout ax_ = ax_(context);
        if (i2 != 0) {
            int i3 = 28 / 0;
        }
        return ax_;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.containsValue
    public void getWarnings(eq eqVar) {
        configureScheme = (apiKey + 79) % 128;
        int i = AnonymousClass3.getWarnings[this.getSDKVersion.ordinal()];
        if (i == 1) {
            Object[] objArr = new Object[1];
            a("ᆍᇚ姩\ue423忈뼠譧⤘㹣\uec62亱ꉀ⓽ꓹ⬳ӧ\ude65फ़떢潬篩\uefe4ḹ\uf1daᕼ呬", (Process.myTid() >> 22) + 1, objArr);
            eqVar.get(((String) objArr[0]).intern(), this.onCompleted);
        } else {
            if (i != 2) {
                return;
            }
            Object[] objArr2 = new Object[1];
            b((byte) (4 - Color.blue(0)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 24, "\r\u0018\u0004\u001c\u001f\u0000\u0006\u0000\u001b\u0000\r\u0018\u0004\u001c\u001f\u0000\"\u001d\u001c\"\u0013\f\u001c\u0018㗧", objArr2);
            eqVar.get(((String) objArr2[0]).intern(), this.onCompleted);
            configureScheme = (apiKey + 119) % 128;
        }
    }

    private void getWarnings(String str, String str2) {
        configureScheme = (apiKey + 115) % 128;
        if (oj.get(str, str2)) {
            configureScheme = (apiKey + 119) % 128;
            ThreeDS2Service().setVisibility(8);
            int i = apiKey + 117;
            configureScheme = i % 128;
            if (i % 2 != 0) {
                int i2 = 16 / 0;
                return;
            }
            return;
        }
        ThreeDS2Service().setVisibility(0);
        this.createTransaction.setText(str);
        this.cleanup.aU_(this.getSDKInfo, str2);
    }

    public static void getWarnings() {
        onError = -3011479896652102779L;
        addParam = new char[]{37939, 37918, 38106, 37909, 37891, 37948, 37912, 37941, 37925, 37917, 37942, 37910, 37951, 37897, 37945, 37944, 37913, 37901, 37903, 37943, 37940, 37907, 37915, 37946, 37916, 37890, 37906, 37937, 37902, 37919, 37908, 37949, 46696, 37947, 37898, 37929};
        ConfigParameters = (char) 41446;
    }
}
