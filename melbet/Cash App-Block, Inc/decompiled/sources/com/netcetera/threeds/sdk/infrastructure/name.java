package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public final class name {
    private static int getWarnings = 1;
    private static int initialize;

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        nq nqVar = (nq) objArr[0];
        String str = (String) objArr[1];
        String[] strArr = (String[]) objArr[2];
        Boolean bool = (Boolean) objArr[3];
        int i = getWarnings;
        int i2 = i & 27;
        int i3 = -(-((i ^ 27) | i2));
        initialize = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        Boolean bool2 = (Boolean) get(new Object[]{nqVar, str, strArr, bool}, 391195000, -391194992, (int) System.currentTimeMillis());
        bool2.booleanValue();
        int i4 = getWarnings;
        int i5 = (i4 & 107) + (i4 | 107);
        initialize = i5 % 128;
        if (i5 % 2 == 0) {
            return bool2;
        }
        throw null;
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        final String[] strArr = (String[]) objArr[0];
        clone cloneVar = new clone() { // from class: com.netcetera.threeds.sdk.infrastructure.name.5
            private static final byte[] $$a = null;
            private static final int $$b = 0;
            private static int $10;
            private static int $11;
            private static int ThreeDS2Service;
            private static int getWarnings;
            private static char[] initialize;

            static {
                init$0();
                $10 = 0;
                $11 = 1;
                getWarnings = 0;
                ThreeDS2Service = 1;
                initialize = new char[]{53203, 53224, 53187, 53239, 53193, 53241, 53243, 53191, 53196};
            }

            /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:
            
                if (r0 != null) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:84:0x0035, code lost:
            
                r0 = r0.getBytes("ISO-8859-1");
             */
            /* JADX WARN: Code restructure failed: missing block: B:85:0x0033, code lost:
            
                if (r0 != null) goto L8;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void a(boolean z, int[] iArr, String str, Object[] objArr2) {
                int i;
                char[] cArr;
                char c;
                Class<Object> cls;
                int i2;
                int i3;
                int i4;
                char[] cArr2;
                Class<Object> cls2;
                int i5;
                Object method;
                String str2 = str;
                Class<Object> cls3 = Object.class;
                int i6 = $10 + 15;
                $11 = i6 % 128;
                byte[] bArr = str2;
                if (i6 % 2 == 0) {
                    int i7 = 16 / 0;
                    bArr = str2;
                }
                byte[] bArr2 = bArr;
                cleanup cleanupVar = new cleanup();
                int i8 = iArr[0];
                int i9 = iArr[1];
                int i10 = iArr[2];
                int i11 = iArr[3];
                char[] cArr3 = initialize;
                Class cls4 = Integer.TYPE;
                char c2 = '0';
                if (cArr3 != null) {
                    int length = cArr3.length;
                    char[] cArr4 = new char[length];
                    int i12 = 0;
                    while (i12 < length) {
                        try {
                            byte[] bArr3 = bArr2;
                            Object[] objArr3 = {Integer.valueOf(cArr3[i12])};
                            char[] cArr5 = cArr4;
                            Map map = removeParam.visaSchemeConfiguration;
                            Object obj = map.get(-1866317650);
                            if (obj != null) {
                                cls2 = cls3;
                                i2 = length;
                                i3 = i12;
                                i4 = i10;
                                i5 = i11;
                                method = obj;
                                cArr2 = cArr3;
                            } else {
                                i2 = length;
                                i3 = i12;
                                i4 = i10;
                                Class cls5 = (Class) removeParam.initialize((Process.myPid() >> 22) + 48, (char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getScrollFriction() > RecyclerView.DECELERATION_RATE ? 1 : (ViewConfiguration.getScrollFriction() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 2294);
                                byte b = (byte) ($$b & 7);
                                byte b2 = (byte) (b - 1);
                                cArr2 = cArr3;
                                cls2 = cls3;
                                i5 = i11;
                                Object[] objArr4 = new Object[1];
                                b(b, b2, b2, objArr4);
                                method = cls5.getMethod((String) objArr4[0], cls4);
                                map.put(-1866317650, method);
                            }
                            cArr5[i3] = ((Character) ((Method) method).invoke(null, objArr3)).charValue();
                            i12 = i3 + 1;
                            cArr4 = cArr5;
                            bArr2 = bArr3;
                            cArr3 = cArr2;
                            length = i2;
                            i10 = i4;
                            i11 = i5;
                            cls3 = cls2;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr3 = cArr4;
                }
                byte[] bArr4 = bArr2;
                Class<Object> cls6 = cls3;
                int i13 = i10;
                int i14 = i11;
                char[] cArr6 = new char[i9];
                System.arraycopy(cArr3, i8, cArr6, 0, i9);
                if (bArr4 != null) {
                    char[] cArr7 = new char[i9];
                    cleanupVar.get = 0;
                    char c3 = 0;
                    while (true) {
                        int i15 = cleanupVar.get;
                        if (i15 >= i9) {
                            break;
                        }
                        if (bArr4[i15] == 1) {
                            Object[] objArr5 = {Integer.valueOf(cArr6[i15]), Integer.valueOf(c3)};
                            Map map2 = removeParam.visaSchemeConfiguration;
                            Object obj2 = map2.get(715226994);
                            if (obj2 == null) {
                                Class cls7 = (Class) removeParam.initialize((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 84, (char) (25857 - (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1))), 1726 - TextUtils.getOffsetAfter("", 0));
                                Object[] objArr6 = new Object[1];
                                b((short) 0, 0, 0, objArr6);
                                obj2 = cls7.getMethod((String) objArr6[0], cls4, cls4);
                                map2.put(715226994, obj2);
                            }
                            cArr7[i15] = ((Character) ((Method) obj2).invoke(null, objArr5)).charValue();
                            cArr = cArr6;
                        } else {
                            Object[] objArr7 = {Integer.valueOf(cArr6[i15]), Integer.valueOf(c3)};
                            Map map3 = removeParam.visaSchemeConfiguration;
                            Object obj3 = map3.get(549300883);
                            if (obj3 != null) {
                                cArr = cArr6;
                            } else {
                                cArr = cArr6;
                                obj3 = ((Class) removeParam.initialize(66 - View.resolveSize(0, 0), (char) (32825 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 446 - TextUtils.indexOf("", c2, 0, 0))).getMethod("D", cls4, cls4);
                                map3.put(549300883, obj3);
                            }
                            cArr7[i15] = ((Character) ((Method) obj3).invoke(null, objArr7)).charValue();
                            $11 = ($10 + 79) % 128;
                        }
                        c3 = cArr7[cleanupVar.get];
                        Object[] objArr8 = {cleanupVar, cleanupVar};
                        Map map4 = removeParam.visaSchemeConfiguration;
                        Object obj4 = map4.get(102334785);
                        if (obj4 != null) {
                            cls = cls6;
                            c = '0';
                        } else {
                            c = '0';
                            cls = cls6;
                            obj4 = ((Class) removeParam.initialize(73 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((-16777216) - Color.rgb(0, 0, 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 9820)).getMethod("I", cls, cls);
                            map4.put(102334785, obj4);
                        }
                        ((Method) obj4).invoke(null, objArr8);
                        cls6 = cls;
                        c2 = c;
                        cArr6 = cArr;
                    }
                    cArr6 = cArr7;
                }
                if (i14 > 0) {
                    int i16 = $10 + 115;
                    $11 = i16 % 128;
                    if (i16 % 2 == 0) {
                        char[] cArr8 = new char[i9];
                        i = 0;
                        System.arraycopy(cArr6, 0, cArr8, 0, i9);
                        System.arraycopy(cArr8, 1, cArr6, i9 >>> i14, i14);
                        System.arraycopy(cArr8, i14, cArr6, 0, i9 + i14);
                    } else {
                        i = 0;
                        char[] cArr9 = new char[i9];
                        System.arraycopy(cArr6, 0, cArr9, 0, i9);
                        int i17 = i9 - i14;
                        System.arraycopy(cArr9, 0, cArr6, i17, i14);
                        System.arraycopy(cArr9, i14, cArr6, 0, i17);
                    }
                } else {
                    i = 0;
                }
                if (z) {
                    $10 = ($11 + 17) % 128;
                    char[] cArr10 = new char[i9];
                    cleanupVar.get = i;
                    while (true) {
                        int i18 = cleanupVar.get;
                        if (i18 >= i9) {
                            break;
                        }
                        cArr10[i18] = cArr6[(i9 - i18) - 1];
                        cleanupVar.get = i18 + 1;
                    }
                    $11 = ($10 + 81) % 128;
                    cArr6 = cArr10;
                }
                if (i13 > 0) {
                    int i19 = $10 + 11;
                    $11 = i19 % 128;
                    if (i19 % 2 == 0) {
                        cleanupVar.get = 1;
                    } else {
                        cleanupVar.get = 0;
                    }
                    while (true) {
                        int i20 = cleanupVar.get;
                        if (i20 >= i9) {
                            break;
                        }
                        cArr6[i20] = (char) (cArr6[i20] - iArr[2]);
                        cleanupVar.get = i20 + 1;
                    }
                }
                objArr2[0] = new String(cArr6);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002d). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void b(short s, int i, int i2, Object[] objArr2) {
                int i3;
                int i4 = 3 - (i * 2);
                int i5 = (s * 57) + 65;
                int i6 = i2 * 4;
                byte[] bArr = $$a;
                byte[] bArr2 = new byte[i6 + 1];
                int i7 = -1;
                if (bArr == null) {
                    i3 = i4;
                    int i8 = i6;
                    i4 += i8;
                    i7++;
                    bArr2[i7] = (byte) i4;
                    if (i7 == i6) {
                        objArr2[0] = new String(bArr2, 0);
                        return;
                    }
                    i3++;
                    i8 = bArr[i3];
                    i4 += i8;
                    i7++;
                    bArr2[i7] = (byte) i4;
                    if (i7 == i6) {
                    }
                } else {
                    i4 = i5;
                    i3 = i4;
                    i7++;
                    bArr2[i7] = (byte) i4;
                    if (i7 == i6) {
                    }
                }
            }

            public static void init$0() {
                $$a = new byte[]{105, 18, 104, -16};
                $$b = EnumC0170g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE;
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.clone
            public boolean ThreeDS2ServiceInstance(nq nqVar, String str, boolean z) {
                ThreeDS2Service = (getWarnings + 87) % 128;
                Object[] objArr2 = new Object[1];
                a(true, new int[]{0, 9, EnumC0170g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, 7}, null, objArr2);
                boolean booleanValue = ((Boolean) name.get(new Object[]{nqVar, ((String) objArr2[0]).intern(), strArr, Boolean.valueOf(z)}, -1951311824, 1951311827, (int) System.currentTimeMillis())).booleanValue();
                ThreeDS2Service = (getWarnings + 23) % 128;
                return booleanValue;
            }
        };
        int currentTimeMillis = (int) System.currentTimeMillis();
        int i = ~currentTimeMillis;
        int i2 = ~currentTimeMillis;
        int i3 = (i2 | currentTimeMillis) & i;
        int i4 = -(-(((i3 & 1614807041) | (i3 ^ 1614807041)) * (-192)));
        int i5 = (-551226103) & i4;
        int i6 = -(-(i4 | (-551226103)));
        int i7 = ~((i & 1616167489) | (1616167489 ^ i));
        int i8 = (((i7 & 109772938) | (109772938 ^ i7)) * (-384)) + (i5 ^ i6) + ((i6 & i5) << 1);
        int i9 = ~((-109772939) | currentTimeMillis);
        int i10 = 1616167489 & i2;
        int i11 = (1616167489 | i2) & (~i10);
        int i12 = (i11 & i10) | (i11 ^ i10);
        int i13 = i12 & 1724579979;
        int i14 = (i12 | 1724579979) & (~i13);
        int i15 = ~((i14 & i13) | (i14 ^ i13));
        int i16 = (currentTimeMillis & (-1360449)) | (i2 & (-1360449)) | (1360448 & currentTimeMillis);
        int i17 = -(~(-(-((((i16 | (~i16)) & (~i16)) | (i15 & i9) | (i9 ^ i15)) * 192))));
        int i18 = (((i8 | i17) << 1) - (i17 ^ i8)) - 1;
        int currentTimeMillis2 = (int) System.currentTimeMillis();
        int i19 = ~currentTimeMillis2;
        int i20 = ~currentTimeMillis2;
        int i21 = (i20 | currentTimeMillis2) & i19;
        int i22 = ~((i21 & 713500623) | ((~i21) & 713500623) | ((-713500624) & i21));
        int i23 = (-647917793) & i22;
        int i24 = (i22 | (-647917793)) & (~i23);
        int i25 = -(-(((i24 & i23) | (i24 ^ i23)) * EnumC0170g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE));
        int i26 = (-2139959952) & i25;
        int i27 = ((((-2139959952) ^ i25) | i26) << 1) - ((i25 | (-2139959952)) & (~i26));
        int i28 = ~((i20 & 647917792) | (currentTimeMillis2 & (-647917793)) | (647917792 & currentTimeMillis2));
        int i29 = 134285071 & i28;
        int i30 = (i28 | 134285071) & (~i29);
        int i31 = (i30 & i29) | (i30 ^ i29);
        int i32 = (i19 & 713500623) | (713500623 ^ i19);
        int i33 = i32 & (-647917793);
        int i34 = (i32 | (-647917793)) & (~i33);
        int i35 = (i34 & i33) | (i34 ^ i33);
        int i36 = (i35 | (~i35)) & (~i35);
        int i37 = ((i36 & i31) | (i31 ^ i36)) * (-113);
        int i38 = i27 & i37;
        int i39 = (i37 ^ i27) | i38;
        int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
        int i41 = (~((currentTimeMillis2 & 713500623) | (713500623 ^ currentTimeMillis2))) * 113;
        int i42 = ((i40 ^ i41) | (i40 & i41)) << 1;
        int i43 = -((i41 & (~i40)) | ((~i41) & i40));
        if (i18 <= ((i42 | i43) << 1) - (i43 ^ i42)) {
            int i44 = 1 / 0;
        }
        return cloneVar;
    }

    public static /* synthetic */ Object get(Object[] objArr, int i, int i2, int i3) {
        int i4 = ((i | i2) * (-366)) + (i2 * 367) + (i * 367);
        int i5 = ~i2;
        switch ((((~(i | i5 | i3)) | (~(i2 | (~i)))) * 366) + (((~(i5 | i3)) | i) * (-366)) + i4) {
            case 1:
                final String str = (String) objArr[0];
                clone cloneVar = new clone() { // from class: com.netcetera.threeds.sdk.infrastructure.name.6
                    private static int ThreeDS2Service = 0;
                    private static int ThreeDS2ServiceInstance = 1;

                    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
                    
                        if (r1 == false) goto L8;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
                    
                        if (r1 == false) goto L8;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:5:0x003e, code lost:
                    
                        r1 = com.netcetera.threeds.sdk.infrastructure.name.AnonymousClass6.ThreeDS2Service;
                        r2 = (r1 | 7) << 1;
                        r1 = -(((~r1) & 7) | (r1 & (-8)));
                        com.netcetera.threeds.sdk.infrastructure.name.AnonymousClass6.ThreeDS2ServiceInstance = (((r2 | r1) << 1) - (r1 ^ r2)) % 128;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
                    
                        r1 = com.netcetera.threeds.sdk.infrastructure.name.AnonymousClass6.ThreeDS2ServiceInstance;
                        r2 = ((r1 & 1) + (r1 | 1)) % 128;
                        com.netcetera.threeds.sdk.infrastructure.name.AnonymousClass6.ThreeDS2Service = r2;
                        r1 = (r2 & (-46)) | ((~r2) & 45);
                        r2 = (r2 & 45) << 1;
                        com.netcetera.threeds.sdk.infrastructure.name.AnonymousClass6.ThreeDS2ServiceInstance = ((r1 ^ r2) + ((r1 & r2) << 1)) % 128;
                        r3 = true;
                     */
                    @Override // com.netcetera.threeds.sdk.infrastructure.clone
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public boolean ThreeDS2ServiceInstance(nq nqVar, String str2, boolean z) {
                        int i6 = ThreeDS2ServiceInstance;
                        int i7 = (i6 ^ 121) + ((i6 & 121) << 1);
                        ThreeDS2Service = i7 % 128;
                        int i8 = i7 % 2;
                        boolean z2 = false;
                        boolean cleanup = nqVar.cleanup(str);
                        if (i8 != 0) {
                            int i9 = 19 / 0;
                        }
                        int i10 = ThreeDS2ServiceInstance;
                        int i11 = i10 ^ 83;
                        int i12 = (i10 & 83) << 1;
                        ThreeDS2Service = ((i11 ^ i12) + ((i12 & i11) << 1)) % 128;
                        return z2;
                    }
                };
                int i6 = getWarnings;
                initialize = (((i6 | 43) << 1) - (i6 ^ 43)) % 128;
                return cloneVar;
            case 2:
                clone ThreeDS2ServiceInstance = ((clone) get(new Object[0], -1311835732, 1311835738, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance(new clone() { // from class: com.netcetera.threeds.sdk.infrastructure.name.4
                    private static final byte[] $$a = null;
                    private static final int $$b = 0;
                    private static int $10;
                    private static int $11;
                    private static int ThreeDS2ServiceInstance;
                    private static int[] get;
                    private static int getWarnings;

                    static {
                        init$0();
                        $10 = 0;
                        $11 = 1;
                        getWarnings = 0;
                        ThreeDS2ServiceInstance = 1;
                        get = new int[]{595814638, 699349472, 762719733, -1284645453, -1373032687, 1663247752, 1933755027, 1877696578, -1850692456, 135121148, -1580222091, -457964713, 288527730, -1544893218, 490093940, 114916156, 1274350460, 396978938};
                    }

                    private static void a(int[] iArr, int i7, Object[] objArr2) {
                        int i8;
                        char c;
                        Object method;
                        int[] iArr2;
                        int i9;
                        int[] iArr3;
                        int i10;
                        char[] cArr;
                        Object method2;
                        createTransaction createtransaction = new createTransaction();
                        char[] cArr2 = new char[4];
                        char[] cArr3 = new char[iArr.length * 2];
                        int[] iArr4 = get;
                        Class cls = Integer.TYPE;
                        int i11 = 0;
                        if (iArr4 != null) {
                            int length = iArr4.length;
                            i8 = 2;
                            int[] iArr5 = new int[length];
                            int i12 = 0;
                            while (i12 < length) {
                                try {
                                    Object[] objArr3 = {Integer.valueOf(iArr4[i12])};
                                    Map map = removeParam.visaSchemeConfiguration;
                                    Object obj = map.get(2095751688);
                                    if (obj != null) {
                                        i10 = i12;
                                        method2 = obj;
                                        cArr = cArr2;
                                    } else {
                                        i10 = i12;
                                        Class cls2 = (Class) removeParam.initialize(ImageFormat.getBitsPerPixel(i11) + 65, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 1197 - (ViewConfiguration.getEdgeSlop() >> 16));
                                        Object[] objArr4 = new Object[1];
                                        cArr = cArr2;
                                        b((short) 1, (byte) 0, 0, objArr4);
                                        method2 = cls2.getMethod((String) objArr4[0], cls);
                                        map.put(2095751688, method2);
                                    }
                                    iArr5[i10] = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
                                    i12 = i10 + 1;
                                    cArr2 = cArr;
                                    i11 = 0;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                            iArr4 = iArr5;
                        } else {
                            i8 = 2;
                        }
                        char[] cArr4 = cArr2;
                        int i13 = 16;
                        int length2 = iArr4.length;
                        int[] iArr6 = new int[length2];
                        int[] iArr7 = get;
                        if (iArr7 != null) {
                            int length3 = iArr7.length;
                            int[] iArr8 = new int[length3];
                            $10 = ($11 + 95) % 128;
                            int i14 = 0;
                            while (i14 < length3) {
                                Object[] objArr5 = {Integer.valueOf(iArr7[i14])};
                                Map map2 = removeParam.visaSchemeConfiguration;
                                Object obj2 = map2.get(2095751688);
                                if (obj2 != null) {
                                    iArr2 = iArr7;
                                    i9 = length3;
                                    iArr3 = iArr8;
                                } else {
                                    iArr2 = iArr7;
                                    i9 = length3;
                                    Class cls3 = (Class) removeParam.initialize((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 63, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1197);
                                    Object[] objArr6 = new Object[1];
                                    iArr3 = iArr8;
                                    b((short) 1, (byte) 0, 0, objArr6);
                                    obj2 = cls3.getMethod((String) objArr6[0], cls);
                                    map2.put(2095751688, obj2);
                                }
                                iArr3[i14] = ((Integer) ((Method) obj2).invoke(null, objArr5)).intValue();
                                i14++;
                                iArr8 = iArr3;
                                iArr7 = iArr2;
                                length3 = i9;
                            }
                            iArr7 = iArr8;
                        }
                        System.arraycopy(iArr7, 0, iArr6, 0, length2);
                        createtransaction.initialize = 0;
                        while (true) {
                            int i15 = createtransaction.initialize;
                            if (i15 >= iArr.length) {
                                objArr2[0] = new String(cArr3, 0, i7);
                                return;
                            }
                            $10 = ($11 + 7) % 128;
                            int i16 = iArr[i15];
                            char c2 = (char) (i16 >> 16);
                            cArr4[0] = c2;
                            char c3 = (char) i16;
                            cArr4[1] = c3;
                            char c4 = (char) (iArr[i15 + 1] >> 16);
                            cArr4[i8] = c4;
                            char c5 = (char) iArr[i15 + 1];
                            char c6 = 3;
                            cArr4[3] = c5;
                            createtransaction.getWarnings = (c2 << 16) + c3;
                            createtransaction.get = (c4 << 16) + c5;
                            createTransaction.ThreeDS2ServiceInstance(iArr6);
                            int i17 = 0;
                            while (i17 < i13) {
                                $11 = ($10 + 69) % 128;
                                int i18 = createtransaction.getWarnings ^ iArr6[i17];
                                createtransaction.getWarnings = i18;
                                int ThreeDS2Service = createTransaction.ThreeDS2Service(i18);
                                Object[] objArr7 = new Object[4];
                                objArr7[c6] = createtransaction;
                                objArr7[i8] = createtransaction;
                                objArr7[1] = Integer.valueOf(ThreeDS2Service);
                                objArr7[0] = createtransaction;
                                Map map3 = removeParam.visaSchemeConfiguration;
                                Object obj3 = map3.get(-411264147);
                                if (obj3 != null) {
                                    method = obj3;
                                    c = c6;
                                } else {
                                    c = c6;
                                    method = ((Class) removeParam.initialize(49 - (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFraction(0, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 13120 - TextUtils.indexOf((CharSequence) "", '0', 0))).getMethod("y", Object.class, cls, Object.class, Object.class);
                                    map3.put(-411264147, method);
                                }
                                int intValue = ((Integer) ((Method) method).invoke(null, objArr7)).intValue();
                                createtransaction.getWarnings = createtransaction.get;
                                createtransaction.get = intValue;
                                i17++;
                                c6 = c;
                                i13 = 16;
                            }
                            char c7 = c6;
                            int i19 = createtransaction.getWarnings;
                            int i20 = createtransaction.get;
                            createtransaction.getWarnings = i20;
                            createtransaction.get = i19;
                            int i21 = i19 ^ iArr6[16];
                            createtransaction.get = i21;
                            int i22 = i20 ^ iArr6[17];
                            createtransaction.getWarnings = i22;
                            cArr4[0] = (char) (i22 >>> 16);
                            cArr4[1] = (char) i22;
                            cArr4[i8] = (char) (i21 >>> 16);
                            cArr4[c7] = (char) i21;
                            createTransaction.ThreeDS2ServiceInstance(iArr6);
                            int i23 = createtransaction.initialize;
                            cArr3[i23 * 2] = cArr4[0];
                            cArr3[(i23 * 2) + 1] = cArr4[1];
                            cArr3[(i23 * 2) + 2] = cArr4[i8];
                            cArr3[(i23 * 2) + 3] = cArr4[c7];
                            int i24 = i8;
                            Object[] objArr8 = new Object[i24];
                            objArr8[1] = createtransaction;
                            objArr8[0] = createtransaction;
                            Map map4 = removeParam.visaSchemeConfiguration;
                            Object obj4 = map4.get(-1870831722);
                            if (obj4 != null) {
                                i13 = 16;
                            } else {
                                i13 = 16;
                                Class cls4 = (Class) removeParam.initialize(100 - (AudioTrack.getMaxVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMaxVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)), (char) (ViewConfiguration.getPressedStateDuration() >> 16), 1880 - TextUtils.indexOf("", "", 0));
                                Object[] objArr9 = new Object[1];
                                b((short) 0, (byte) 0, 0, objArr9);
                                obj4 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                                map4.put(-1870831722, obj4);
                            }
                            ((Method) obj4).invoke(null, objArr8);
                            i8 = i24;
                        }
                    }

                    private static void b(short s, byte b, int i7, Object[] objArr2) {
                        byte[] bArr = $$a;
                        int i8 = i7 * 4;
                        int i9 = 118 - (s * 5);
                        int i10 = 3 - (b * 2);
                        byte[] bArr2 = new byte[1 - i8];
                        int i11 = 0 - i8;
                        int i12 = -1;
                        if (bArr == null) {
                            i9 = (-i9) + i11;
                            i10 = i10;
                            bArr = bArr;
                            i12 = -1;
                        }
                        while (true) {
                            int i13 = i12 + 1;
                            int i14 = i10 + 1;
                            bArr2[i13] = (byte) i9;
                            if (i13 == i11) {
                                objArr2[0] = new String(bArr2, 0);
                                return;
                            }
                            i9 = (-bArr[i14]) + i9;
                            i10 = i14;
                            bArr = bArr;
                            i12 = i13;
                        }
                    }

                    public static void init$0() {
                        $$a = new byte[]{78, -119, -4, 27};
                        $$b = EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE;
                    }

                    @Override // com.netcetera.threeds.sdk.infrastructure.clone
                    public boolean ThreeDS2ServiceInstance(nq nqVar, String str2, boolean z) {
                        Object obj;
                        int i7 = ThreeDS2ServiceInstance + 3;
                        getWarnings = i7 % 128;
                        if (i7 % 2 != 0) {
                            Object[] objArr2 = new Object[1];
                            a(new int[]{-883978601, 819511892, -1453974035, 86589422, -1579364002, 1910713966, 1076602056, -1788419247, 1023774983, -663464377, -618969831, 60545253}, 58 % TextUtils.indexOf((CharSequence) "", '=', 1, 0), objArr2);
                            String intern = ((String) objArr2[0]).intern();
                            String[] strArr = new String[0];
                            strArr[0] = wait.initialize.getWarnings();
                            obj = name.get(new Object[]{nqVar, intern, strArr, Boolean.valueOf(z)}, -1951311824, 1951311827, (int) System.currentTimeMillis());
                        } else {
                            Object[] objArr3 = new Object[1];
                            a(new int[]{-883978601, 819511892, -1453974035, 86589422, -1579364002, 1910713966, 1076602056, -1788419247, 1023774983, -663464377, -618969831, 60545253}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23, objArr3);
                            obj = name.get(new Object[]{nqVar, ((String) objArr3[0]).intern(), new String[]{wait.initialize.getWarnings()}, Boolean.valueOf(z)}, -1951311824, 1951311827, (int) System.currentTimeMillis());
                        }
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        ThreeDS2ServiceInstance = (getWarnings + 19) % 128;
                        return booleanValue;
                    }
                });
                int i7 = getWarnings;
                initialize = SVG$Unit$EnumUnboxingLocalUtility.m(i7 & 86, i7 | 86, -1, 128);
                return ThreeDS2ServiceInstance;
            case 3:
                return ThreeDS2Service(objArr);
            case 4:
                return get(objArr);
            case 5:
                return getWarnings(objArr);
            case 6:
                clone cloneVar2 = new clone() { // from class: com.netcetera.threeds.sdk.infrastructure.name.3
                    private static final byte[] $$a = null;
                    private static final int $$b = 0;
                    private static int $10;
                    private static int $11;
                    private static char[] ThreeDS2ServiceInstance;
                    private static int get;
                    private static long getWarnings;
                    private static int initialize;

                    static {
                        init$0();
                        $10 = 0;
                        $11 = 1;
                        initialize = 0;
                        get = 1;
                        ThreeDS2ServiceInstance = new char[]{29217, 47582, 58833, 4570, 24049, 35320, 46563, 57817, 11661, 22931, 34191};
                        getWarnings = -7456469446286425393L;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:45:0x0161, code lost:
                    
                        r1[r2] = (char) r5[r2];
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:46:0x0167, code lost:
                    
                        r0 = new java.lang.Object[]{r4, r4};
                        r1 = com.netcetera.threeds.sdk.infrastructure.removeParam.visaSchemeConfiguration;
                        r2 = r1.get(1724349229);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:47:0x0176, code lost:
                    
                        if (r2 == null) goto L34;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:49:0x01ab, code lost:
                    
                        ((java.lang.reflect.Method) r2).invoke(null, r0);
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:50:0x01b1, code lost:
                    
                        throw null;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:52:0x0179, code lost:
                    
                        r2 = (java.lang.Class) com.netcetera.threeds.sdk.infrastructure.removeParam.initialize(android.graphics.Color.argb(0, 0, 0, 0) + 48, (char) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 27780), 2441 - android.graphics.Color.green(0));
                        r4 = new java.lang.Object[1];
                        b(0, 0, 0, r4);
                        r2 = r2.getMethod((java.lang.String) r4[0], java.lang.Object.class, java.lang.Object.class);
                        r1.put(1724349229, r2);
                     */
                    /* JADX WARN: Removed duplicated region for block: B:27:0x0213  */
                    /* JADX WARN: Removed duplicated region for block: B:29:0x0214  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static void a(int i8, int i9, char c, Object[] objArr2) {
                        Throwable cause;
                        ThreeDS2ServiceInitializationCallback threeDS2ServiceInitializationCallback = new ThreeDS2ServiceInitializationCallback();
                        long[] jArr = new long[i8];
                        short s = 0;
                        threeDS2ServiceInitializationCallback.initialize = 0;
                        $10 = ($11 + 125) % 128;
                        while (true) {
                            int i10 = threeDS2ServiceInitializationCallback.initialize;
                            if (i10 >= i8) {
                                break;
                            }
                            try {
                                Object[] objArr3 = {Integer.valueOf(ThreeDS2ServiceInstance[i9 + i10])};
                                Map map = removeParam.visaSchemeConfiguration;
                                Object obj = map.get(-54653524);
                                Class cls = Integer.TYPE;
                                if (obj == null) {
                                    Class cls2 = (Class) removeParam.initialize((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 47, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 3221 - TextUtils.getCapsMode("", s, s));
                                    Object[] objArr4 = new Object[1];
                                    b(s, (short) 1, s, objArr4);
                                    obj = cls2.getMethod((String) objArr4[s], cls);
                                    map.put(-54653524, obj);
                                }
                                Long l = (Long) ((Method) obj).invoke(null, objArr3);
                                l.longValue();
                                long j = threeDS2ServiceInitializationCallback.initialize;
                                long j2 = getWarnings;
                                short s2 = s;
                                Object[] objArr5 = new Object[4];
                                objArr5[3] = Integer.valueOf(c);
                                objArr5[2] = Long.valueOf(j2);
                                objArr5[1] = Long.valueOf(j);
                                objArr5[s2] = l;
                                Object obj2 = map.get(1319531906);
                                if (obj2 == null) {
                                    Class cls3 = (Class) removeParam.initialize((AudioTrack.getMinVolume() > RecyclerView.DECELERATION_RATE ? 1 : (AudioTrack.getMinVolume() == RecyclerView.DECELERATION_RATE ? 0 : -1)) + 69, (char) (TextUtils.lastIndexOf("", '0') + 50705), 7789 - Color.alpha((int) s2));
                                    Class cls4 = Long.TYPE;
                                    obj2 = cls3.getMethod("b", cls4, cls4, cls4, cls);
                                    map.put(1319531906, obj2);
                                }
                                jArr[i10] = ((Long) ((Method) obj2).invoke(null, objArr5)).longValue();
                                Object[] objArr6 = new Object[2];
                                objArr6[1] = threeDS2ServiceInitializationCallback;
                                objArr6[s2] = threeDS2ServiceInitializationCallback;
                                Object obj3 = map.get(1724349229);
                                if (obj3 == null) {
                                    Class cls5 = (Class) removeParam.initialize(48 - TextUtils.getOffsetBefore("", s2), (char) (27780 - KeyEvent.keyCodeFromString("")), Gravity.getAbsoluteGravity(s2, s2) + 2441);
                                    Object[] objArr7 = new Object[1];
                                    b(s2, s2, s2, objArr7);
                                    obj3 = cls5.getMethod((String) objArr7[s2], Object.class, Object.class);
                                    map.put(1724349229, obj3);
                                }
                                ((Method) obj3).invoke(null, objArr6);
                                s = 0;
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
                        char[] cArr = new char[i8];
                        threeDS2ServiceInitializationCallback.initialize = 0;
                        $10 = ($11 + 37) % 128;
                        while (true) {
                            int i11 = threeDS2ServiceInitializationCallback.initialize;
                            if (i11 >= i8) {
                                objArr2[0] = new String(cArr);
                                return;
                            }
                            int i12 = $10 + 85;
                            $11 = i12 % 128;
                            if (i12 % 2 == 0) {
                                break;
                            }
                            cArr[i11] = (char) jArr[i11];
                            Object[] objArr8 = {threeDS2ServiceInitializationCallback, threeDS2ServiceInitializationCallback};
                            Map map2 = removeParam.visaSchemeConfiguration;
                            Object obj4 = map2.get(1724349229);
                            if (obj4 == null) {
                                Class cls6 = (Class) removeParam.initialize(ExpandableListView.getPackedPositionGroup(0L) + 48, (char) (27780 - (ViewConfiguration.getPressedStateDuration() >> 16)), 2442 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                Object[] objArr9 = new Object[1];
                                b(0, (short) 0, (short) 0, objArr9);
                                obj4 = cls6.getMethod((String) objArr9[0], Object.class, Object.class);
                                map2.put(1724349229, obj4);
                            }
                            ((Method) obj4).invoke(null, objArr8);
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:4:0x002e). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static void b(int i8, short s, short s2, Object[] objArr2) {
                        int i9;
                        int i10;
                        int i11 = (s2 * 4) + 4;
                        int i12 = (s * 3) + 97;
                        byte[] bArr = $$a;
                        int i13 = i8 * 2;
                        byte[] bArr2 = new byte[1 - i13];
                        int i14 = 0 - i13;
                        if (bArr == null) {
                            int i15 = i14;
                            i9 = i11;
                            int i16 = 0;
                            i11 += i15;
                            i9++;
                            i10 = i16;
                            bArr2[i10] = (byte) i11;
                            i16 = i10 + 1;
                            if (i10 == i14) {
                                objArr2[0] = new String(bArr2, 0);
                                return;
                            }
                            i15 = bArr[i9];
                            i11 += i15;
                            i9++;
                            i10 = i16;
                            bArr2[i10] = (byte) i11;
                            i16 = i10 + 1;
                            if (i10 == i14) {
                            }
                        } else {
                            i11 = i12;
                            i9 = i11;
                            i10 = 0;
                            bArr2[i10] = (byte) i11;
                            i16 = i10 + 1;
                            if (i10 == i14) {
                            }
                        }
                    }

                    public static void init$0() {
                        $$a = new byte[]{114, 64, -72, -72};
                        $$b = EnumC0170g.SDK_ASSET_ICON_CLIPBOARD_VALUE;
                    }

                    @Override // com.netcetera.threeds.sdk.infrastructure.clone
                    public boolean ThreeDS2ServiceInstance(nq nqVar, String str2, boolean z) {
                        initialize = (get + 13) % 128;
                        Object[] objArr2 = new Object[1];
                        a(11 - TextUtils.indexOf("", "", 0, 0), Color.red(0), (char) (64372 - Color.green(0)), objArr2);
                        boolean booleanValue = ((Boolean) name.get(new Object[]{nqVar, ((String) objArr2[0]).intern(), new String[]{load.getWarnings.getWarnings()}, Boolean.valueOf(z)}, -1951311824, 1951311827, (int) System.currentTimeMillis())).booleanValue();
                        get = (initialize + 5) % 128;
                        return booleanValue;
                    }
                };
                int i8 = initialize;
                int i9 = i8 & 125;
                getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m$1(i9, ~((i8 ^ 125) | i9), 1, 128);
                return cloneVar2;
            case 7:
                return ThreeDS2ServiceInstance(objArr);
            case 8:
                return initialize(objArr);
            case 9:
                clone ThreeDS2ServiceInstance2 = ((clone) get(new Object[0], -1311835732, 1311835738, (int) System.currentTimeMillis())).ThreeDS2ServiceInstance(new clone() { // from class: com.netcetera.threeds.sdk.infrastructure.name.2
                    private static final byte[] $$a = null;
                    private static final int $$b = 0;
                    private static int $10;
                    private static int $11;
                    private static char[] ThreeDS2Service;
                    private static boolean ThreeDS2ServiceInstance;
                    private static boolean get;
                    private static int getSDKInfo;
                    private static int getWarnings;
                    private static int initialize;

                    static {
                        init$0();
                        $10 = 0;
                        $11 = 1;
                        getWarnings = 0;
                        getSDKInfo = 1;
                        ThreeDS2Service = new char[]{15149, 15136, 15151, 15140, 15139, 15162, 15137, 15181, 15161, 15163, 15160, 15164, 15143, 15175, 15148};
                        initialize = 993475464;
                        ThreeDS2ServiceInstance = true;
                        get = true;
                    }

                    private static void a(String str2, int[] iArr, int i10, String str3, Object[] objArr2) {
                        int i11;
                        int i12;
                        char[] cArr;
                        int i13;
                        char[] cArr2;
                        Class cls;
                        int i14;
                        char[] cArr3;
                        Object method;
                        String str4 = str3;
                        int i15 = $11 + 47;
                        $10 = i15 % 128;
                        byte[] bArr = str4;
                        if (i15 % 2 != 0) {
                            throw null;
                        }
                        if (str4 != null) {
                            bArr = str4.getBytes("ISO-8859-1");
                        }
                        byte[] bArr2 = bArr;
                        char[] charArray = str2 != null ? str2.toCharArray() : str2;
                        onError onerror = new onError();
                        char[] cArr4 = ThreeDS2Service;
                        Class cls2 = Integer.TYPE;
                        if (cArr4 != null) {
                            int length = cArr4.length;
                            char[] cArr5 = new char[length];
                            i11 = 2;
                            int i16 = 0;
                            while (i16 < length) {
                                try {
                                    Object[] objArr3 = {Integer.valueOf(cArr4[i16])};
                                    Map map = removeParam.visaSchemeConfiguration;
                                    Object obj = map.get(-939298638);
                                    if (obj != null) {
                                        i13 = i16;
                                        cls = cls2;
                                        i14 = length;
                                        cArr3 = cArr5;
                                        method = obj;
                                        cArr2 = cArr4;
                                    } else {
                                        i13 = i16;
                                        cArr2 = cArr4;
                                        cls = cls2;
                                        Class cls3 = (Class) removeParam.initialize(72 - (Process.myPid() >> 22), (char) (Process.getGidForName("") + 1), View.resolveSize(0, 0) + 1405);
                                        byte b = (byte) ($$b - 2);
                                        byte b2 = b;
                                        i14 = length;
                                        cArr3 = cArr5;
                                        Object[] objArr4 = new Object[1];
                                        b(b, b2, b2, objArr4);
                                        method = cls3.getMethod((String) objArr4[0], cls);
                                        map.put(-939298638, method);
                                    }
                                    cArr3[i13] = ((Character) ((Method) method).invoke(null, objArr3)).charValue();
                                    i16 = i13 + 1;
                                    cArr4 = cArr2;
                                    cls2 = cls;
                                    length = i14;
                                    cArr5 = cArr3;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            }
                            cArr4 = cArr5;
                        } else {
                            i11 = 2;
                        }
                        Class cls4 = cls2;
                        Object[] objArr5 = {Integer.valueOf(initialize)};
                        Map map2 = removeParam.visaSchemeConfiguration;
                        Object obj2 = map2.get(-1598850155);
                        if (obj2 == null) {
                            Class cls5 = (Class) removeParam.initialize(TextUtils.indexOf("", "") + 73, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 7530), View.combineMeasuredStates(0, 0) + 2489);
                            byte b3 = (byte) ($$b - 1);
                            byte b4 = (byte) (b3 - 1);
                            Object[] objArr6 = new Object[1];
                            b(b3, b4, b4, objArr6);
                            obj2 = cls5.getMethod((String) objArr6[0], cls4);
                            map2.put(-1598850155, obj2);
                        }
                        int intValue = ((Integer) ((Method) obj2).invoke(null, objArr5)).intValue();
                        if (get) {
                            int i17 = $10 + 59;
                            $11 = i17 % 128;
                            if (i17 % 2 == 0) {
                                int length2 = bArr2.length;
                                onerror.ThreeDS2ServiceInstance = length2;
                                cArr = new char[length2];
                                i12 = 0;
                            } else {
                                i12 = 0;
                                int length3 = bArr2.length;
                                onerror.ThreeDS2ServiceInstance = length3;
                                cArr = new char[length3];
                            }
                            onerror.getWarnings = i12;
                            while (true) {
                                int i18 = onerror.getWarnings;
                                int i19 = onerror.ThreeDS2ServiceInstance;
                                if (i18 >= i19) {
                                    objArr2[0] = new String(cArr);
                                    return;
                                }
                                cArr[i18] = (char) (cArr4[bArr2[(i19 - 1) - i18] + i10] - intValue);
                                Object[] objArr7 = new Object[i11];
                                objArr7[1] = onerror;
                                objArr7[0] = onerror;
                                Map map3 = removeParam.visaSchemeConfiguration;
                                Object obj3 = map3.get(73542081);
                                if (obj3 == null) {
                                    obj3 = ((Class) removeParam.initialize(TextUtils.indexOf((CharSequence) "", '0') + 49, (char) TextUtils.indexOf("", "", 0), 11441 - ((Process.getThreadPriority(0) + 20) >> 6))).getMethod("k", Object.class, Object.class);
                                    map3.put(73542081, obj3);
                                }
                                ((Method) obj3).invoke(null, objArr7);
                                i11 = 2;
                            }
                        } else {
                            int i20 = 0;
                            if (ThreeDS2ServiceInstance) {
                                int length4 = charArray.length;
                                onerror.ThreeDS2ServiceInstance = length4;
                                char[] cArr6 = new char[length4];
                                onerror.getWarnings = 0;
                                while (true) {
                                    int i21 = onerror.getWarnings;
                                    int i22 = onerror.ThreeDS2ServiceInstance;
                                    if (i21 >= i22) {
                                        objArr2[0] = new String(cArr6);
                                        return;
                                    }
                                    int i23 = $11 + 35;
                                    $10 = i23 % 128;
                                    if (i23 % 2 != 0) {
                                        cArr6[i21] = (char) (cArr4[charArray[(i22 - 1) % i21] * i10] * intValue);
                                        Object[] objArr8 = {onerror, onerror};
                                        Map map4 = removeParam.visaSchemeConfiguration;
                                        Object obj4 = map4.get(73542081);
                                        if (obj4 == null) {
                                            obj4 = ((Class) removeParam.initialize((ViewConfiguration.getTapTimeout() >> 16) + 48, (char) KeyEvent.normalizeMetaState(0), 11441 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod("k", Object.class, Object.class);
                                            map4.put(73542081, obj4);
                                        }
                                        ((Method) obj4).invoke(null, objArr8);
                                    } else {
                                        cArr6[i21] = (char) (cArr4[charArray[(i22 - 1) - i21] - i10] - intValue);
                                        Object[] objArr9 = {onerror, onerror};
                                        Map map5 = removeParam.visaSchemeConfiguration;
                                        Object obj5 = map5.get(73542081);
                                        if (obj5 == null) {
                                            obj5 = ((Class) removeParam.initialize(47 - TextUtils.lastIndexOf("", '0', 0), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 11441)).getMethod("k", Object.class, Object.class);
                                            map5.put(73542081, obj5);
                                        }
                                        ((Method) obj5).invoke(null, objArr9);
                                    }
                                    $10 = ($11 + 19) % 128;
                                }
                            } else {
                                int length5 = iArr.length;
                                onerror.ThreeDS2ServiceInstance = length5;
                                char[] cArr7 = new char[length5];
                                while (true) {
                                    onerror.getWarnings = i20;
                                    int i24 = onerror.getWarnings;
                                    int i25 = onerror.ThreeDS2ServiceInstance;
                                    if (i24 >= i25) {
                                        objArr2[0] = new String(cArr7);
                                        return;
                                    } else {
                                        cArr7[i24] = (char) (cArr4[iArr[(i25 - 1) - i24] - i10] - intValue);
                                        i20 = i24 + 1;
                                    }
                                }
                            }
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:4:0x0030). Please report as a decompilation issue!!! */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    private static void b(int i10, int i11, byte b, Object[] objArr2) {
                        int i12;
                        int i13;
                        int i14 = 1 - (i11 * 2);
                        byte[] bArr = $$a;
                        int i15 = i10 + 108;
                        int i16 = 3 - (b * 4);
                        byte[] bArr2 = new byte[i14];
                        if (bArr == null) {
                            byte[] bArr3 = bArr;
                            int i17 = 0;
                            int i18 = i16;
                            int i19 = i14;
                            i15 = (-i15) + i19;
                            i16 = i18;
                            bArr = bArr3;
                            i12 = i17;
                            int i20 = i16 + 1;
                            bArr2[i12] = (byte) i15;
                            i13 = i12 + 1;
                            if (i13 == i14) {
                                objArr2[0] = new String(bArr2, 0);
                                return;
                            }
                            byte b2 = bArr[i20];
                            i19 = i15;
                            i15 = b2;
                            i17 = i13;
                            bArr3 = bArr;
                            i18 = i20;
                            i15 = (-i15) + i19;
                            i16 = i18;
                            bArr = bArr3;
                            i12 = i17;
                            int i202 = i16 + 1;
                            bArr2[i12] = (byte) i15;
                            i13 = i12 + 1;
                            if (i13 == i14) {
                            }
                        } else {
                            i12 = 0;
                            int i2022 = i16 + 1;
                            bArr2[i12] = (byte) i15;
                            i13 = i12 + 1;
                            if (i13 == i14) {
                            }
                        }
                    }

                    public static void init$0() {
                        $$a = new byte[]{14, 109, -75, 30};
                        $$b = 2;
                    }

                    @Override // com.netcetera.threeds.sdk.infrastructure.clone
                    public boolean ThreeDS2ServiceInstance(nq nqVar, String str2, boolean z) {
                        getWarnings = (getSDKInfo + 23) % 128;
                        Object[] objArr2 = new Object[1];
                        a(null, null, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), "\u008f\u0086\u008e\u0086\u0089\u008d\u008c\u0085\u0084\u008b\u008a\u0089\u0088\u0085\u0087\u0086\u0085\u0084\u0084\u0083\u0082\u0081", objArr2);
                        boolean booleanValue = ((Boolean) name.get(new Object[]{nqVar, ((String) objArr2[0]).intern(), new String[]{wait.ThreeDS2Service.getWarnings()}, Boolean.valueOf(z)}, -1951311824, 1951311827, (int) System.currentTimeMillis())).booleanValue();
                        getSDKInfo = (getWarnings + 105) % 128;
                        return booleanValue;
                    }
                });
                int i10 = initialize;
                int i11 = i10 & 71;
                int i12 = ((i10 ^ 71) | i11) << 1;
                int i13 = -((i10 | 71) & (~i11));
                getWarnings = ((i12 & i13) + (i13 | i12)) % 128;
                return ThreeDS2ServiceInstance2;
            case 10:
                return getSDKInfo(objArr);
            default:
                clone cloneVar3 = new clone() { // from class: com.netcetera.threeds.sdk.infrastructure.name.1
                    private static int get = 0;
                    private static int initialize = 1;

                    @Override // com.netcetera.threeds.sdk.infrastructure.clone
                    public boolean ThreeDS2ServiceInstance(nq nqVar, String str2, boolean z) {
                        int i14 = initialize;
                        int i15 = (i14 & (-104)) | ((~i14) & 103);
                        int i16 = -(-((i14 & 103) << 1));
                        int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
                        get = i17 % 128;
                        boolean z2 = i17 % 2 == 0;
                        int i18 = i14 & 107;
                        int i19 = (i14 | 107) & (~i18);
                        int i20 = i18 << 1;
                        int i21 = (i19 ^ i20) + ((i19 & i20) << 1);
                        get = i21 % 128;
                        if (i21 % 2 == 0) {
                            return z2;
                        }
                        throw null;
                    }
                };
                int i14 = getWarnings;
                int i15 = i14 ^ 47;
                int i16 = (i14 & 47) << 1;
                initialize = (((i15 | i16) << 1) - (i16 ^ i15)) % 128;
                return cloneVar3;
        }
    }

    private static /* synthetic */ Object getSDKInfo(Object[] objArr) {
        final String str = (String) objArr[0];
        final String[] strArr = (String[]) objArr[1];
        clone cloneVar = new clone() { // from class: com.netcetera.threeds.sdk.infrastructure.name.8
            private static int ThreeDS2Service = 0;
            private static int get = 1;

            @Override // com.netcetera.threeds.sdk.infrastructure.clone
            public boolean ThreeDS2ServiceInstance(nq nqVar, String str2, boolean z) {
                int i = get + 19;
                ThreeDS2Service = i % 128;
                int i2 = i % 2;
                String str3 = str;
                String[] strArr2 = strArr;
                if (i2 == 0) {
                    return ((Boolean) name.get(new Object[]{nqVar, str3, strArr2, Boolean.valueOf(z)}, -1951311824, 1951311827, (int) System.currentTimeMillis())).booleanValue();
                }
                ((Boolean) name.get(new Object[]{nqVar, str3, strArr2, Boolean.valueOf(z)}, -1951311824, 1951311827, (int) System.currentTimeMillis())).booleanValue();
                throw null;
            }
        };
        int i = getWarnings;
        int i2 = i & 17;
        int i3 = -(-((i ^ 17) | i2));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        initialize = i4 % 128;
        if (i4 % 2 == 0) {
            return cloneVar;
        }
        throw null;
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        final String str = (String) objArr[0];
        clone cloneVar = new clone() { // from class: com.netcetera.threeds.sdk.infrastructure.name.10
            private static int getWarnings = 0;
            private static int initialize = 1;

            @Override // com.netcetera.threeds.sdk.infrastructure.clone
            public boolean ThreeDS2ServiceInstance(nq nqVar, String str2, boolean z) {
                int i = getWarnings;
                int i2 = ((i | 111) << 1) - (i ^ 111);
                initialize = i2 % 128;
                int i3 = i2 % 2;
                String str3 = str;
                if (i3 == 0) {
                    nqVar.cleanup(str3);
                    throw null;
                }
                boolean cleanup = nqVar.cleanup(str3);
                initialize = (getWarnings + 59) % 128;
                return cleanup;
            }
        };
        int i = getWarnings;
        int i2 = (i ^ 8) + ((i & 8) << 1);
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        initialize = i3 % 128;
        if (i3 % 2 == 0) {
            return cloneVar;
        }
        throw null;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        nq nqVar = (nq) objArr[0];
        String str = (String) objArr[1];
        String[] strArr = (String[]) objArr[2];
        Boolean bool = (Boolean) objArr[3];
        int i = initialize;
        int i2 = i & 77;
        getWarnings = SVG$Unit$EnumUnboxingLocalUtility.m$1((i | 77) & (~i2), ~(-(-(i2 << 1))), 1, 128);
        String initialize2 = nqVar.initialize(str);
        if (initialize2 == null) {
            int i3 = initialize;
            int i4 = i3 & 15;
            int i5 = ((i3 ^ 15) | i4) << 1;
            int i6 = -((i3 | 15) & (~i4));
            getWarnings = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
            return Boolean.FALSE;
        }
        int i7 = getWarnings;
        initialize = (((i7 | 85) << 1) - (i7 ^ 85)) % 128;
        boolean z = ne.get(strArr, initialize2, bool.booleanValue());
        int i8 = initialize;
        int i9 = (((i8 & (-84)) | ((~i8) & 83)) - (~(-(-((i8 & 83) << 1))))) - 1;
        getWarnings = i9 % 128;
        if (i9 % 2 != 0) {
            return Boolean.valueOf(z);
        }
        throw null;
    }

    public static clone getWarnings() {
        return (clone) get(new Object[0], 1445068217, -1445068217, (int) System.currentTimeMillis());
    }

    public static clone ThreeDS2Service(String... strArr) {
        return (clone) get(new Object[]{strArr}, 1859274854, -1859274847, (int) System.currentTimeMillis());
    }

    public static clone ThreeDS2Service() {
        return (clone) get(new Object[0], -1729819282, 1729819291, (int) System.currentTimeMillis());
    }

    public static clone initialize(String str, String... strArr) {
        return (clone) get(new Object[]{str, strArr}, 424304478, -424304468, (int) System.currentTimeMillis());
    }

    public static clone initialize() {
        return (clone) get(new Object[0], -400697650, 400697652, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        clone cloneVar = new clone() { // from class: com.netcetera.threeds.sdk.infrastructure.name.9
            private static int ThreeDS2ServiceInstance = 1;
            private static int initialize;

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0082, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
            
                r5 = ((r2 ^ 71) | (r2 & 71)) << 1;
                r2 = -(((~r2) & 71) | (r2 & (-72)));
                r0 = ((r5 | r2) << 1) - (r2 ^ r5);
                com.netcetera.threeds.sdk.infrastructure.name.AnonymousClass9.initialize = r0 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
            
                if ((r0 % 2) == 0) goto L11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
            
                r2 = com.netcetera.threeds.sdk.infrastructure.oj.ThreeDS2Service(r3.initialize(r4));
                r3 = 35 / 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
            
                r3 = com.netcetera.threeds.sdk.infrastructure.name.AnonymousClass9.initialize;
                r4 = ((r3 & (-114)) | ((~r3) & 113)) + ((r3 & 113) << 1);
                com.netcetera.threeds.sdk.infrastructure.name.AnonymousClass9.ThreeDS2ServiceInstance = r4 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
            
                if ((r4 % 2) != 0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
            
                r3 = 50 / 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
            
                return r2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
            
                r2 = com.netcetera.threeds.sdk.infrastructure.oj.ThreeDS2Service(r3.initialize(r4));
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x001e, code lost:
            
                if (r5 != false) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
            
                if (r5 != false) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x006c, code lost:
            
                r2 = r3.cleanup(r4);
                r3 = com.netcetera.threeds.sdk.infrastructure.name.AnonymousClass9.initialize;
                r4 = r3 & 51;
                r4 = r4 + ((r3 ^ 51) | r4);
                com.netcetera.threeds.sdk.infrastructure.name.AnonymousClass9.ThreeDS2ServiceInstance = r4 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x007e, code lost:
            
                if ((r4 % 2) == 0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0080, code lost:
            
                return r2;
             */
            @Override // com.netcetera.threeds.sdk.infrastructure.clone
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public boolean ThreeDS2ServiceInstance(nq nqVar, String str, boolean z) {
                int i = initialize;
                int i2 = i & 61;
                int i3 = -(-((i ^ 61) | i2));
                int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
                int i5 = i4 % 128;
                ThreeDS2ServiceInstance = i5;
                if (i4 % 2 == 0) {
                    int i6 = 43 / 0;
                }
            }
        };
        int i = getWarnings;
        int i2 = ((i ^ 57) | (i & 57)) << 1;
        int i3 = -(((~i) & 57) | (i & (-58)));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        initialize = i4 % 128;
        if (i4 % 2 == 0) {
            return cloneVar;
        }
        throw null;
    }

    public static clone get(String str) {
        return (clone) get(new Object[]{str}, -1073704373, 1073704374, (int) System.currentTimeMillis());
    }

    public static clone get() {
        return (clone) get(new Object[0], -1440524354, 1440524358, (int) System.currentTimeMillis());
    }

    public static clone ThreeDS2ServiceInstance(String str) {
        return (clone) get(new Object[]{str}, -159050596, 159050601, (int) System.currentTimeMillis());
    }

    public static clone ThreeDS2ServiceInstance() {
        return (clone) get(new Object[0], -1311835732, 1311835738, (int) System.currentTimeMillis());
    }
}
